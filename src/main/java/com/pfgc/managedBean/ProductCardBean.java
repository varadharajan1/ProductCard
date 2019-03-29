package com.pfgc.managedBean;

import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.WebServiceRef;


import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.pfgc.wsclient.productcardinfo.ObjectFactory;
import com.pfgc.wsclient.productcardinfo.ProductCardInfo;
import com.pfgc.wsclient.productcardinfo.ProductCardInfo_Service;
import com.pfgc.wsclient.productcardinfo.ProductCardRequest;
import com.pfgc.wsclient.productcardinfo.ProductCardResponse;
import com.thoughtworks.xstream.XStream;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXhtmlExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.query.JRXPathQueryExecuterFactory;
import net.sf.jasperreports.engine.util.AbstractSampleApp;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRXmlUtils;



public class ProductCardBean {
	@WebServiceRef(wsdlLocation = "http://njdcwebmqp1:7800/GetProductCardInfo?wsdl")
	private ProductCardInfo_Service productCardInfoService;
	private int pfgItem ;
	private ProductCardRequest productCardRequest ;
	private ProductCardResponse productCardResponse;
	private static final long serialVersionUID = 1L;
	
	
	public String getItemInfo(){
		try{
			productCardInfoService = new ProductCardInfo_Service();
			ProductCardInfo productCardInfo=productCardInfoService.getProductCardInfoSOAP();
			productCardRequest = new ProductCardRequest();
			productCardRequest.setPfgItem(pfgItem);
			productCardResponse = productCardInfo.getProductCardInfo(productCardRequest);
				
			return "success";
		}
		catch (Exception e){
			Logger.getLogger("com.pfgc.managedBean.ProductCardBean").log(Level.SEVERE,"Remote call failed",e);
			return "error";
		}
			
	}
	
	public void generatePdf(){
		 String PDF_FILE_NAME = "converted.pdf";
	     FacesContext facesContext = FacesContext.getCurrentInstance();
	     ExternalContext externalContext =facesContext.getExternalContext();
	     HttpServletRequest request = (HttpServletRequest)externalContext.getRequest();
	     HttpSession session = (HttpSession) externalContext.getSession(true);
	     String url = request.getRequestURL().append(";jsessionid=").append(session.getId()).append("?pdf=true").toString();
	     try
	     {
	         ITextRenderer renderer = new ITextRenderer();
	         renderer.setDocument(new URL(url).toString());
	         renderer.layout();
	         HttpServletResponse response = (HttpServletResponse)externalContext.getResponse();
	         response.reset();
	         response.setContentType("application/pdf");
	         response.setHeader("Content-Disposition", "inline");
	         ServletOutputStream browserStream = response.getOutputStream();
	         renderer.createPDF(browserStream);
	         renderer.finishPDF();
	         facesContext.responseComplete();
	     }
	     catch (Exception ex)
	     {
	         ex.printStackTrace();
	                  }
	     facesContext.responseComplete();
	 }
	
	public void generateJasperPdf(){
		 FacesContext facesContext = FacesContext.getCurrentInstance();
	     ExternalContext externalContext =facesContext.getExternalContext();
	     String basePath = externalContext.getRealPath("/");
	     System.out.println("basePath - "+basePath);
	     try{
	    	productCardInfoService = new ProductCardInfo_Service();
			ProductCardInfo productCardInfo=productCardInfoService.getProductCardInfoSOAP();
			productCardRequest = new ProductCardRequest();
			productCardRequest.setPfgItem(pfgItem);
			productCardResponse = productCardInfo.getProductCardInfo(productCardRequest);
					
	    	HttpServletResponse response = (HttpServletResponse)externalContext.getResponse();
	        response.reset();
	        response.setContentType("application/pdf");
	        response.setHeader("Content-Disposition", "inline");
	        ServletOutputStream browserStream = response.getOutputStream();
	      
	        XStream xstream = new XStream(); 
	 		String productCardResponseXmlString = xstream.toXML(productCardResponse);
	 		System.out.println(productCardResponseXmlString);
	        Source src = new StreamSource(new ByteArrayInputStream(productCardResponseXmlString.getBytes("UTF-8")));
	        DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = factory.newDocumentBuilder();
	        Document document = builder.parse(new ByteArrayInputStream(productCardResponseXmlString.getBytes("UTF-8")));
	        Map params = new HashMap();
	        params.put(JRXPathQueryExecuterFactory.PARAMETER_XML_DATA_DOCUMENT, document);
	 		params.put(JRXPathQueryExecuterFactory.XML_DATE_PATTERN, "yyyy-MM-dd");
	 		params.put(JRXPathQueryExecuterFactory.XML_NUMBER_PATTERN, "#,##0.##");
	 		params.put(JRXPathQueryExecuterFactory.XML_LOCALE, Locale.ENGLISH);
	 		params.put(JRParameter.REPORT_LOCALE, Locale.US);
	        String jasperReportFile ="ProductCard.jasper"; 
	        String jasperReportXlm="ProductCard.jrxml";
	        JasperPrint print = JasperFillManager.fillReport(basePath+jasperReportFile, params);
	        JasperExportManager.exportReportToPdfStream(print, browserStream);
	        facesContext.responseComplete();
	     }
	     catch (Exception ex)
	     {
	         ex.printStackTrace();
	                  }
	     facesContext.responseComplete();
	 }

	
	
	public int getPfgItem() {
		return pfgItem;
	}

	public void setPfgItem(int pfgItem) {
		this.pfgItem = pfgItem;
	}

	public ProductCardRequest getProductCardRequest() {
		return productCardRequest;
	}

	public void setProductCardRequest(ProductCardRequest productCardRequest) {
		this.productCardRequest = productCardRequest;
	}

	public ProductCardResponse getProductCardResponse() {
		return productCardResponse;
	}

	public void setProductCardResponse(ProductCardResponse productCardResponse) {
		this.productCardResponse = productCardResponse;
	}
	
	
}
