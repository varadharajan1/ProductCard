
package com.pfgc.wsclient.productcardinfo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pfgItem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pfgItem"
})
@XmlRootElement(name = "ProductCardRequest")
public class ProductCardRequest
    implements Serializable
{

    protected int pfgItem;

    /**
     * Gets the value of the pfgItem property.
     * 
     */
    public int getPfgItem() {
        return pfgItem;
    }

    /**
     * Sets the value of the pfgItem property.
     * 
     */
    public void setPfgItem(int value) {
        this.pfgItem = value;
    }

}
