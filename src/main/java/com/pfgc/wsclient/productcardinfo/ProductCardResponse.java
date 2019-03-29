
package com.pfgc.wsclient.productcardinfo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="pfgItem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgDescription1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgDescription2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgBrandKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgBrandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgPack" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pfgSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgInternalUpc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgMfgItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgSubCat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgCat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgLength" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pfgWidth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pfgHeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pfgSupplier1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgInvType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgGTIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgCOP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgRandomWtFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgCatchWtFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgShelflife" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazmat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgTempzone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgNetWt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pfgGrossWt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pfgIsActive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgAltRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgInvTypeCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgSubCatNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgCatNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgBrandCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgCtrlBrandNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgBrandRanking" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgSupplierNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pfgVendorTiHi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgMktExtendedDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgUNNAIdentNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemShippingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemSubClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemPackingGrp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemEmergencyPh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemGeneralInf1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemGeneralInf2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemGeneralInf3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazItemPrintOnInv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgHazMaterialOrChem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfgLinkedToVendorItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGTIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndProductShortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndProductStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndBrandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndBrandOwerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndUnitQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndUnitSizeNetCont" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndUnitSizeUOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGeneralDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndProductProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPrductTypUnitDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndMasterPack" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndChildGTIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGPCDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndNetWeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGrossWeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndHeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndLength" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndWidth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCube" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndAvgServingPerCase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPalletGTINHigh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPalletGTINTie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPalletHigh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPalletTie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTotalPalletQuantit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndQtyOfChildrenCIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndQtyOfNxtLvlItmCIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndShelfLife" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndShelfLifeUOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndStorageTempFromF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndStorageTempTOF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCountryOrgOfProd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCatchRandomWeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndOrdrableVariableWt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndKosher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndKosherType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndNonSoldReturnable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIsItAConsumerUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIsItADispatchUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIsItAInvoiceUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIsAnOrderableUnt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIsItABaseUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIsPackageReturnable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndMarkingLotNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTargetMarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndStorageInstruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTransFatStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndFarmRaised" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndFairTrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndFreeRange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndOrganic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndWild" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSeasonalItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGeneticallyModified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndHalal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndMarkedAsRecyclable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndVegan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndBioDegradeable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndClonedFoods" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndProbiotic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndrBSTFree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndHumanelyRaised" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndLactoseFree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndMscCertified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndNatural" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndShadeGrown" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSustainable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndUSDAGrade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCalculationSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCalculationSizeUOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSuggestdServingSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCalciumPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCalciumMg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCalories" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCaloriesFromFat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCarbohydrates" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCarbohydratesPercentRDI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCholesterolMg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCholesterolRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndGlutenFree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIronPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIronMg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndProtein" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSaturatedFat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSaturatedFatPercenRDI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSodiumPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSodiumMg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTotalDietaryFiber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTotalDietFiberRDI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTotalFat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTotalFatPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTotalSugar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTransfattyAcids" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndVitaminAIUPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndVitaminCPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndVitaminCMg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndVitaminDPercentRDIUSA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndEggs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndMilk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPeanuts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSoy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndWheat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndTreeNuts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndCrustacean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndSesame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndFish" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndChildNutrition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndLinkedPFGItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPublishStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndBenefits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndMoreInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPackageAndStorage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndPreparationAndCookingSuggestion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndIngredients" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vndServingSuggestion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pfgItem",
    "pfgDescription1",
    "pfgDescription2",
    "pfgBrandKey",
    "pfgBrandName",
    "pfgPack",
    "pfgSize",
    "pfgInternalUpc",
    "pfgMfgItemNumber",
    "pfgSubCat",
    "pfgCat",
    "pfgLength",
    "pfgWidth",
    "pfgHeight",
    "pfgSupplier1",
    "pfgInvType",
    "pfgGTIN",
    "pfgCOP",
    "pfgRandomWtFlag",
    "pfgCatchWtFlag",
    "pfgShelflife",
    "pfgHazmat",
    "pfgTempzone",
    "pfgNetWt",
    "pfgGrossWt",
    "pfgIsActive",
    "pfgAltRefNumber",
    "pfgInvTypeCode",
    "pfgSubCatNumber",
    "pfgCatNumber",
    "pfgBrandCode",
    "pfgCtrlBrandNumber",
    "pfgBrandRanking",
    "pfgSupplierNumber",
    "pfgVendorTiHi",
    "pfgMktExtendedDescription",
    "pfgUNNAIdentNum",
    "pfgHazItemShippingName",
    "pfgHazItemClass",
    "pfgHazItemSubClass",
    "pfgHazItemPackingGrp",
    "pfgHazItemEmergencyPh",
    "pfgHazItemGeneralInf1",
    "pfgHazItemGeneralInf2",
    "pfgHazItemGeneralInf3",
    "pfgHazItemPrintOnInv",
    "pfgHazMaterialOrChem",
    "pfgLinkedToVendorItem",
    "vndGTIN",
    "vndProductCode",
    "vndProductShortName",
    "vndProductStatus",
    "vndManufacturerName",
    "vndBrandName",
    "vndBrandOwerName",
    "vndUnitQuantity",
    "vndUnitSizeNetCont",
    "vndUnitSizeUOM",
    "vndGeneralDescription",
    "vndProductProfile",
    "vndPrductTypUnitDesc",
    "vndMasterPack",
    "vndChildGTIN",
    "vndGPCCode",
    "vndGPCDescription",
    "vndNetWeight",
    "vndGrossWeight",
    "vndHeight",
    "vndLength",
    "vndWidth",
    "vndCube",
    "vndAvgServingPerCase",
    "vndPalletGTINHigh",
    "vndPalletGTINTie",
    "vndPalletHigh",
    "vndPalletTie",
    "vndTotalPalletQuantit",
    "vndQtyOfChildrenCIN",
    "vndQtyOfNxtLvlItmCIR",
    "vndShelfLife",
    "vndShelfLifeUOM",
    "vndStorageTempFromF",
    "vndStorageTempTOF",
    "vndCountryOrgOfProd",
    "vndCatchRandomWeight",
    "vndOrdrableVariableWt",
    "vndKosher",
    "vndKosherType",
    "vndNonSoldReturnable",
    "vndIsItAConsumerUnit",
    "vndIsItADispatchUnit",
    "vndIsItAInvoiceUnit",
    "vndIsAnOrderableUnt",
    "vndIsItABaseUnit",
    "vndIsPackageReturnable",
    "vndMarkingLotNumber",
    "vndTargetMarket",
    "vndStorageInstruction",
    "vndTransFatStatus",
    "vndFarmRaised",
    "vndFairTrade",
    "vndFreeRange",
    "vndOrganic",
    "vndWild",
    "vndSeasonalItem",
    "vndGeneticallyModified",
    "vndHalal",
    "vndMarkedAsRecyclable",
    "vndVegan",
    "vndBioDegradeable",
    "vndClonedFoods",
    "vndProbiotic",
    "vndrBSTFree",
    "vndHumanelyRaised",
    "vndLactoseFree",
    "vndMscCertified",
    "vndNatural",
    "vndShadeGrown",
    "vndSustainable",
    "vndUSDAGrade",
    "vndCalculationSize",
    "vndCalculationSizeUOM",
    "vndSuggestdServingSize",
    "vndCalciumPercentRDIUSA",
    "vndCalciumMg",
    "vndCalories",
    "vndCaloriesFromFat",
    "vndCarbohydrates",
    "vndCarbohydratesPercentRDI",
    "vndCholesterolMg",
    "vndCholesterolRDIUSA",
    "vndGlutenFree",
    "vndIronPercentRDIUSA",
    "vndIronMg",
    "vndProtein",
    "vndSaturatedFat",
    "vndSaturatedFatPercenRDI",
    "vndSodiumPercentRDIUSA",
    "vndSodiumMg",
    "vndTotalDietaryFiber",
    "vndTotalDietFiberRDI",
    "vndTotalFat",
    "vndTotalFatPercentRDIUSA",
    "vndTotalSugar",
    "vndTransfattyAcids",
    "vndVitaminAIUPercentRDIUSA",
    "vndVitaminCPercentRDIUSA",
    "vndVitaminCMg",
    "vndVitaminDPercentRDIUSA",
    "vndEggs",
    "vndMilk",
    "vndPeanuts",
    "vndSoy",
    "vndWheat",
    "vndTreeNuts",
    "vndCrustacean",
    "vndSesame",
    "vndFish",
    "vndChildNutrition",
    "vndLinkedPFGItemNumber",
    "vndPublishStatus",
    "vndBenefits",
    "vndMoreInfo",
    "vndPackageAndStorage",
    "vndPreparationAndCookingSuggestion",
    "vndIngredients",
    "vndServingSuggestion"
})
@XmlRootElement(name = "ProductCardResponse")
public class ProductCardResponse
    implements Serializable
{

    protected long pfgItem;
    @XmlElement(required = true)
    protected String pfgDescription1;
    @XmlElement(required = true)
    protected String pfgDescription2;
    @XmlElement(required = true)
    protected String pfgBrandKey;
    @XmlElement(required = true)
    protected String pfgBrandName;
    protected double pfgPack;
    @XmlElement(required = true)
    protected String pfgSize;
    @XmlElement(required = true)
    protected String pfgInternalUpc;
    @XmlElement(required = true)
    protected String pfgMfgItemNumber;
    @XmlElement(required = true)
    protected String pfgSubCat;
    @XmlElement(required = true)
    protected String pfgCat;
    protected double pfgLength;
    protected double pfgWidth;
    protected double pfgHeight;
    @XmlElement(required = true)
    protected String pfgSupplier1;
    @XmlElement(required = true)
    protected String pfgInvType;
    @XmlElement(required = true)
    protected String pfgGTIN;
    @XmlElement(required = true)
    protected String pfgCOP;
    @XmlElement(required = true)
    protected String pfgRandomWtFlag;
    @XmlElement(required = true)
    protected String pfgCatchWtFlag;
    @XmlElement(required = true)
    protected String pfgShelflife;
    @XmlElement(required = true)
    protected String pfgHazmat;
    @XmlElement(required = true)
    protected String pfgTempzone;
    protected double pfgNetWt;
    protected double pfgGrossWt;
    @XmlElement(required = true)
    protected String pfgIsActive;
    @XmlElement(required = true)
    protected String pfgAltRefNumber;
    protected long pfgInvTypeCode;
    protected long pfgSubCatNumber;
    protected long pfgCatNumber;
    protected long pfgBrandCode;
    protected long pfgCtrlBrandNumber;
    protected long pfgBrandRanking;
    protected long pfgSupplierNumber;
    @XmlElement(required = true)
    protected String pfgVendorTiHi;
    @XmlElement(required = true)
    protected String pfgMktExtendedDescription;
    @XmlElement(required = true)
    protected String pfgUNNAIdentNum;
    @XmlElement(required = true)
    protected String pfgHazItemShippingName;
    @XmlElement(required = true)
    protected String pfgHazItemClass;
    @XmlElement(required = true)
    protected String pfgHazItemSubClass;
    @XmlElement(required = true)
    protected String pfgHazItemPackingGrp;
    @XmlElement(required = true)
    protected String pfgHazItemEmergencyPh;
    @XmlElement(required = true)
    protected String pfgHazItemGeneralInf1;
    @XmlElement(required = true)
    protected String pfgHazItemGeneralInf2;
    @XmlElement(required = true)
    protected String pfgHazItemGeneralInf3;
    @XmlElement(required = true)
    protected String pfgHazItemPrintOnInv;
    @XmlElement(required = true)
    protected String pfgHazMaterialOrChem;
    @XmlElement(required = true)
    protected String pfgLinkedToVendorItem;
    @XmlElement(required = true)
    protected String vndGTIN;
    @XmlElement(required = true)
    protected String vndProductCode;
    @XmlElement(required = true)
    protected String vndProductShortName;
    @XmlElement(required = true)
    protected String vndProductStatus;
    @XmlElement(required = true)
    protected String vndManufacturerName;
    @XmlElement(required = true)
    protected String vndBrandName;
    @XmlElement(required = true)
    protected String vndBrandOwerName;
    @XmlElement(required = true)
    protected String vndUnitQuantity;
    @XmlElement(required = true)
    protected String vndUnitSizeNetCont;
    @XmlElement(required = true)
    protected String vndUnitSizeUOM;
    @XmlElement(required = true)
    protected String vndGeneralDescription;
    @XmlElement(required = true)
    protected String vndProductProfile;
    @XmlElement(required = true)
    protected String vndPrductTypUnitDesc;
    @XmlElement(required = true)
    protected String vndMasterPack;
    @XmlElement(required = true)
    protected String vndChildGTIN;
    @XmlElement(required = true)
    protected String vndGPCCode;
    @XmlElement(required = true)
    protected String vndGPCDescription;
    @XmlElement(required = true)
    protected String vndNetWeight;
    @XmlElement(required = true)
    protected String vndGrossWeight;
    @XmlElement(required = true)
    protected String vndHeight;
    @XmlElement(required = true)
    protected String vndLength;
    @XmlElement(required = true)
    protected String vndWidth;
    @XmlElement(required = true)
    protected String vndCube;
    @XmlElement(required = true)
    protected String vndAvgServingPerCase;
    @XmlElement(required = true)
    protected String vndPalletGTINHigh;
    @XmlElement(required = true)
    protected String vndPalletGTINTie;
    @XmlElement(required = true)
    protected String vndPalletHigh;
    @XmlElement(required = true)
    protected String vndPalletTie;
    @XmlElement(required = true)
    protected String vndTotalPalletQuantit;
    @XmlElement(required = true)
    protected String vndQtyOfChildrenCIN;
    @XmlElement(required = true)
    protected String vndQtyOfNxtLvlItmCIR;
    @XmlElement(required = true)
    protected String vndShelfLife;
    @XmlElement(required = true)
    protected String vndShelfLifeUOM;
    @XmlElement(required = true)
    protected String vndStorageTempFromF;
    @XmlElement(required = true)
    protected String vndStorageTempTOF;
    @XmlElement(required = true)
    protected String vndCountryOrgOfProd;
    @XmlElement(required = true)
    protected String vndCatchRandomWeight;
    @XmlElement(required = true)
    protected String vndOrdrableVariableWt;
    @XmlElement(required = true)
    protected String vndKosher;
    @XmlElement(required = true)
    protected String vndKosherType;
    @XmlElement(required = true)
    protected String vndNonSoldReturnable;
    @XmlElement(required = true)
    protected String vndIsItAConsumerUnit;
    @XmlElement(required = true)
    protected String vndIsItADispatchUnit;
    @XmlElement(required = true)
    protected String vndIsItAInvoiceUnit;
    @XmlElement(required = true)
    protected String vndIsAnOrderableUnt;
    @XmlElement(required = true)
    protected String vndIsItABaseUnit;
    @XmlElement(required = true)
    protected String vndIsPackageReturnable;
    @XmlElement(required = true)
    protected String vndMarkingLotNumber;
    @XmlElement(required = true)
    protected String vndTargetMarket;
    @XmlElement(required = true)
    protected String vndStorageInstruction;
    @XmlElement(required = true)
    protected String vndTransFatStatus;
    @XmlElement(required = true)
    protected String vndFarmRaised;
    @XmlElement(required = true)
    protected String vndFairTrade;
    @XmlElement(required = true)
    protected String vndFreeRange;
    @XmlElement(required = true)
    protected String vndOrganic;
    @XmlElement(required = true)
    protected String vndWild;
    @XmlElement(required = true)
    protected String vndSeasonalItem;
    @XmlElement(required = true)
    protected String vndGeneticallyModified;
    @XmlElement(required = true)
    protected String vndHalal;
    @XmlElement(required = true)
    protected String vndMarkedAsRecyclable;
    @XmlElement(required = true)
    protected String vndVegan;
    @XmlElement(required = true)
    protected String vndBioDegradeable;
    @XmlElement(required = true)
    protected String vndClonedFoods;
    @XmlElement(required = true)
    protected String vndProbiotic;
    @XmlElement(required = true)
    protected String vndrBSTFree;
    @XmlElement(required = true)
    protected String vndHumanelyRaised;
    @XmlElement(required = true)
    protected String vndLactoseFree;
    @XmlElement(required = true)
    protected String vndMscCertified;
    @XmlElement(required = true)
    protected String vndNatural;
    @XmlElement(required = true)
    protected String vndShadeGrown;
    @XmlElement(required = true)
    protected String vndSustainable;
    @XmlElement(required = true)
    protected String vndUSDAGrade;
    @XmlElement(required = true)
    protected String vndCalculationSize;
    @XmlElement(required = true)
    protected String vndCalculationSizeUOM;
    @XmlElement(required = true)
    protected String vndSuggestdServingSize;
    @XmlElement(required = true)
    protected String vndCalciumPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndCalciumMg;
    @XmlElement(required = true)
    protected String vndCalories;
    @XmlElement(required = true)
    protected String vndCaloriesFromFat;
    @XmlElement(required = true)
    protected String vndCarbohydrates;
    @XmlElement(required = true)
    protected String vndCarbohydratesPercentRDI;
    @XmlElement(required = true)
    protected String vndCholesterolMg;
    @XmlElement(required = true)
    protected String vndCholesterolRDIUSA;
    @XmlElement(required = true)
    protected String vndGlutenFree;
    @XmlElement(required = true)
    protected String vndIronPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndIronMg;
    @XmlElement(required = true)
    protected String vndProtein;
    @XmlElement(required = true)
    protected String vndSaturatedFat;
    @XmlElement(required = true)
    protected String vndSaturatedFatPercenRDI;
    @XmlElement(required = true)
    protected String vndSodiumPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndSodiumMg;
    @XmlElement(required = true)
    protected String vndTotalDietaryFiber;
    @XmlElement(required = true)
    protected String vndTotalDietFiberRDI;
    @XmlElement(required = true)
    protected String vndTotalFat;
    @XmlElement(required = true)
    protected String vndTotalFatPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndTotalSugar;
    @XmlElement(required = true)
    protected String vndTransfattyAcids;
    @XmlElement(required = true)
    protected String vndVitaminAIUPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndVitaminCPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndVitaminCMg;
    @XmlElement(required = true)
    protected String vndVitaminDPercentRDIUSA;
    @XmlElement(required = true)
    protected String vndEggs;
    @XmlElement(required = true)
    protected String vndMilk;
    @XmlElement(required = true)
    protected String vndPeanuts;
    @XmlElement(required = true)
    protected String vndSoy;
    @XmlElement(required = true)
    protected String vndWheat;
    @XmlElement(required = true)
    protected String vndTreeNuts;
    @XmlElement(required = true)
    protected String vndCrustacean;
    @XmlElement(required = true)
    protected String vndSesame;
    @XmlElement(required = true)
    protected String vndFish;
    @XmlElement(required = true)
    protected String vndChildNutrition;
    @XmlElement(required = true)
    protected String vndLinkedPFGItemNumber;
    @XmlElement(required = true)
    protected String vndPublishStatus;
    @XmlElement(required = true)
    protected String vndBenefits;
    @XmlElement(required = true)
    protected String vndMoreInfo;
    @XmlElement(required = true)
    protected String vndPackageAndStorage;
    @XmlElement(required = true)
    protected String vndPreparationAndCookingSuggestion;
    @XmlElement(required = true)
    protected String vndIngredients;
    @XmlElement(required = true)
    protected String vndServingSuggestion;

    /**
     * Gets the value of the pfgItem property.
     * 
     */
    public long getPfgItem() {
        return pfgItem;
    }

    /**
     * Sets the value of the pfgItem property.
     * 
     */
    public void setPfgItem(long value) {
        this.pfgItem = value;
    }

    /**
     * Gets the value of the pfgDescription1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgDescription1() {
        return pfgDescription1;
    }

    /**
     * Sets the value of the pfgDescription1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgDescription1(String value) {
        this.pfgDescription1 = value;
    }

    /**
     * Gets the value of the pfgDescription2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgDescription2() {
        return pfgDescription2;
    }

    /**
     * Sets the value of the pfgDescription2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgDescription2(String value) {
        this.pfgDescription2 = value;
    }

    /**
     * Gets the value of the pfgBrandKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgBrandKey() {
        return pfgBrandKey;
    }

    /**
     * Sets the value of the pfgBrandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgBrandKey(String value) {
        this.pfgBrandKey = value;
    }

    /**
     * Gets the value of the pfgBrandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgBrandName() {
        return pfgBrandName;
    }

    /**
     * Sets the value of the pfgBrandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgBrandName(String value) {
        this.pfgBrandName = value;
    }

    /**
     * Gets the value of the pfgPack property.
     * 
     */
    public double getPfgPack() {
        return pfgPack;
    }

    /**
     * Sets the value of the pfgPack property.
     * 
     */
    public void setPfgPack(double value) {
        this.pfgPack = value;
    }

    /**
     * Gets the value of the pfgSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgSize() {
        return pfgSize;
    }

    /**
     * Sets the value of the pfgSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgSize(String value) {
        this.pfgSize = value;
    }

    /**
     * Gets the value of the pfgInternalUpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgInternalUpc() {
        return pfgInternalUpc;
    }

    /**
     * Sets the value of the pfgInternalUpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgInternalUpc(String value) {
        this.pfgInternalUpc = value;
    }

    /**
     * Gets the value of the pfgMfgItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgMfgItemNumber() {
        return pfgMfgItemNumber;
    }

    /**
     * Sets the value of the pfgMfgItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgMfgItemNumber(String value) {
        this.pfgMfgItemNumber = value;
    }

    /**
     * Gets the value of the pfgSubCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgSubCat() {
        return pfgSubCat;
    }

    /**
     * Sets the value of the pfgSubCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgSubCat(String value) {
        this.pfgSubCat = value;
    }

    /**
     * Gets the value of the pfgCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgCat() {
        return pfgCat;
    }

    /**
     * Sets the value of the pfgCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgCat(String value) {
        this.pfgCat = value;
    }

    /**
     * Gets the value of the pfgLength property.
     * 
     */
    public double getPfgLength() {
        return pfgLength;
    }

    /**
     * Sets the value of the pfgLength property.
     * 
     */
    public void setPfgLength(double value) {
        this.pfgLength = value;
    }

    /**
     * Gets the value of the pfgWidth property.
     * 
     */
    public double getPfgWidth() {
        return pfgWidth;
    }

    /**
     * Sets the value of the pfgWidth property.
     * 
     */
    public void setPfgWidth(double value) {
        this.pfgWidth = value;
    }

    /**
     * Gets the value of the pfgHeight property.
     * 
     */
    public double getPfgHeight() {
        return pfgHeight;
    }

    /**
     * Sets the value of the pfgHeight property.
     * 
     */
    public void setPfgHeight(double value) {
        this.pfgHeight = value;
    }

    /**
     * Gets the value of the pfgSupplier1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgSupplier1() {
        return pfgSupplier1;
    }

    /**
     * Sets the value of the pfgSupplier1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgSupplier1(String value) {
        this.pfgSupplier1 = value;
    }

    /**
     * Gets the value of the pfgInvType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgInvType() {
        return pfgInvType;
    }

    /**
     * Sets the value of the pfgInvType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgInvType(String value) {
        this.pfgInvType = value;
    }

    /**
     * Gets the value of the pfgGTIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgGTIN() {
        return pfgGTIN;
    }

    /**
     * Sets the value of the pfgGTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgGTIN(String value) {
        this.pfgGTIN = value;
    }

    /**
     * Gets the value of the pfgCOP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgCOP() {
        return pfgCOP;
    }

    /**
     * Sets the value of the pfgCOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgCOP(String value) {
        this.pfgCOP = value;
    }

    /**
     * Gets the value of the pfgRandomWtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgRandomWtFlag() {
        return pfgRandomWtFlag;
    }

    /**
     * Sets the value of the pfgRandomWtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgRandomWtFlag(String value) {
        this.pfgRandomWtFlag = value;
    }

    /**
     * Gets the value of the pfgCatchWtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgCatchWtFlag() {
        return pfgCatchWtFlag;
    }

    /**
     * Sets the value of the pfgCatchWtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgCatchWtFlag(String value) {
        this.pfgCatchWtFlag = value;
    }

    /**
     * Gets the value of the pfgShelflife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgShelflife() {
        return pfgShelflife;
    }

    /**
     * Sets the value of the pfgShelflife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgShelflife(String value) {
        this.pfgShelflife = value;
    }

    /**
     * Gets the value of the pfgHazmat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazmat() {
        return pfgHazmat;
    }

    /**
     * Sets the value of the pfgHazmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazmat(String value) {
        this.pfgHazmat = value;
    }

    /**
     * Gets the value of the pfgTempzone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgTempzone() {
        return pfgTempzone;
    }

    /**
     * Sets the value of the pfgTempzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgTempzone(String value) {
        this.pfgTempzone = value;
    }

    /**
     * Gets the value of the pfgNetWt property.
     * 
     */
    public double getPfgNetWt() {
        return pfgNetWt;
    }

    /**
     * Sets the value of the pfgNetWt property.
     * 
     */
    public void setPfgNetWt(double value) {
        this.pfgNetWt = value;
    }

    /**
     * Gets the value of the pfgGrossWt property.
     * 
     */
    public double getPfgGrossWt() {
        return pfgGrossWt;
    }

    /**
     * Sets the value of the pfgGrossWt property.
     * 
     */
    public void setPfgGrossWt(double value) {
        this.pfgGrossWt = value;
    }

    /**
     * Gets the value of the pfgIsActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgIsActive() {
        return pfgIsActive;
    }

    /**
     * Sets the value of the pfgIsActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgIsActive(String value) {
        this.pfgIsActive = value;
    }

    /**
     * Gets the value of the pfgAltRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgAltRefNumber() {
        return pfgAltRefNumber;
    }

    /**
     * Sets the value of the pfgAltRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgAltRefNumber(String value) {
        this.pfgAltRefNumber = value;
    }

    /**
     * Gets the value of the pfgInvTypeCode property.
     * 
     */
    public long getPfgInvTypeCode() {
        return pfgInvTypeCode;
    }

    /**
     * Sets the value of the pfgInvTypeCode property.
     * 
     */
    public void setPfgInvTypeCode(long value) {
        this.pfgInvTypeCode = value;
    }

    /**
     * Gets the value of the pfgSubCatNumber property.
     * 
     */
    public long getPfgSubCatNumber() {
        return pfgSubCatNumber;
    }

    /**
     * Sets the value of the pfgSubCatNumber property.
     * 
     */
    public void setPfgSubCatNumber(long value) {
        this.pfgSubCatNumber = value;
    }

    /**
     * Gets the value of the pfgCatNumber property.
     * 
     */
    public long getPfgCatNumber() {
        return pfgCatNumber;
    }

    /**
     * Sets the value of the pfgCatNumber property.
     * 
     */
    public void setPfgCatNumber(long value) {
        this.pfgCatNumber = value;
    }

    /**
     * Gets the value of the pfgBrandCode property.
     * 
     */
    public long getPfgBrandCode() {
        return pfgBrandCode;
    }

    /**
     * Sets the value of the pfgBrandCode property.
     * 
     */
    public void setPfgBrandCode(long value) {
        this.pfgBrandCode = value;
    }

    /**
     * Gets the value of the pfgCtrlBrandNumber property.
     * 
     */
    public long getPfgCtrlBrandNumber() {
        return pfgCtrlBrandNumber;
    }

    /**
     * Sets the value of the pfgCtrlBrandNumber property.
     * 
     */
    public void setPfgCtrlBrandNumber(long value) {
        this.pfgCtrlBrandNumber = value;
    }

    /**
     * Gets the value of the pfgBrandRanking property.
     * 
     */
    public long getPfgBrandRanking() {
        return pfgBrandRanking;
    }

    /**
     * Sets the value of the pfgBrandRanking property.
     * 
     */
    public void setPfgBrandRanking(long value) {
        this.pfgBrandRanking = value;
    }

    /**
     * Gets the value of the pfgSupplierNumber property.
     * 
     */
    public long getPfgSupplierNumber() {
        return pfgSupplierNumber;
    }

    /**
     * Sets the value of the pfgSupplierNumber property.
     * 
     */
    public void setPfgSupplierNumber(long value) {
        this.pfgSupplierNumber = value;
    }

    /**
     * Gets the value of the pfgVendorTiHi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgVendorTiHi() {
        return pfgVendorTiHi;
    }

    /**
     * Sets the value of the pfgVendorTiHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgVendorTiHi(String value) {
        this.pfgVendorTiHi = value;
    }

    /**
     * Gets the value of the pfgMktExtendedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgMktExtendedDescription() {
        return pfgMktExtendedDescription;
    }

    /**
     * Sets the value of the pfgMktExtendedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgMktExtendedDescription(String value) {
        this.pfgMktExtendedDescription = value;
    }

    /**
     * Gets the value of the pfgUNNAIdentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgUNNAIdentNum() {
        return pfgUNNAIdentNum;
    }

    /**
     * Sets the value of the pfgUNNAIdentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgUNNAIdentNum(String value) {
        this.pfgUNNAIdentNum = value;
    }

    /**
     * Gets the value of the pfgHazItemShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemShippingName() {
        return pfgHazItemShippingName;
    }

    /**
     * Sets the value of the pfgHazItemShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemShippingName(String value) {
        this.pfgHazItemShippingName = value;
    }

    /**
     * Gets the value of the pfgHazItemClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemClass() {
        return pfgHazItemClass;
    }

    /**
     * Sets the value of the pfgHazItemClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemClass(String value) {
        this.pfgHazItemClass = value;
    }

    /**
     * Gets the value of the pfgHazItemSubClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemSubClass() {
        return pfgHazItemSubClass;
    }

    /**
     * Sets the value of the pfgHazItemSubClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemSubClass(String value) {
        this.pfgHazItemSubClass = value;
    }

    /**
     * Gets the value of the pfgHazItemPackingGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemPackingGrp() {
        return pfgHazItemPackingGrp;
    }

    /**
     * Sets the value of the pfgHazItemPackingGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemPackingGrp(String value) {
        this.pfgHazItemPackingGrp = value;
    }

    /**
     * Gets the value of the pfgHazItemEmergencyPh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemEmergencyPh() {
        return pfgHazItemEmergencyPh;
    }

    /**
     * Sets the value of the pfgHazItemEmergencyPh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemEmergencyPh(String value) {
        this.pfgHazItemEmergencyPh = value;
    }

    /**
     * Gets the value of the pfgHazItemGeneralInf1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemGeneralInf1() {
        return pfgHazItemGeneralInf1;
    }

    /**
     * Sets the value of the pfgHazItemGeneralInf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemGeneralInf1(String value) {
        this.pfgHazItemGeneralInf1 = value;
    }

    /**
     * Gets the value of the pfgHazItemGeneralInf2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemGeneralInf2() {
        return pfgHazItemGeneralInf2;
    }

    /**
     * Sets the value of the pfgHazItemGeneralInf2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemGeneralInf2(String value) {
        this.pfgHazItemGeneralInf2 = value;
    }

    /**
     * Gets the value of the pfgHazItemGeneralInf3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemGeneralInf3() {
        return pfgHazItemGeneralInf3;
    }

    /**
     * Sets the value of the pfgHazItemGeneralInf3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemGeneralInf3(String value) {
        this.pfgHazItemGeneralInf3 = value;
    }

    /**
     * Gets the value of the pfgHazItemPrintOnInv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazItemPrintOnInv() {
        return pfgHazItemPrintOnInv;
    }

    /**
     * Sets the value of the pfgHazItemPrintOnInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazItemPrintOnInv(String value) {
        this.pfgHazItemPrintOnInv = value;
    }

    /**
     * Gets the value of the pfgHazMaterialOrChem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgHazMaterialOrChem() {
        return pfgHazMaterialOrChem;
    }

    /**
     * Sets the value of the pfgHazMaterialOrChem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgHazMaterialOrChem(String value) {
        this.pfgHazMaterialOrChem = value;
    }

    /**
     * Gets the value of the pfgLinkedToVendorItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfgLinkedToVendorItem() {
        return pfgLinkedToVendorItem;
    }

    /**
     * Sets the value of the pfgLinkedToVendorItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfgLinkedToVendorItem(String value) {
        this.pfgLinkedToVendorItem = value;
    }

    /**
     * Gets the value of the vndGTIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGTIN() {
        return vndGTIN;
    }

    /**
     * Sets the value of the vndGTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGTIN(String value) {
        this.vndGTIN = value;
    }

    /**
     * Gets the value of the vndProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndProductCode() {
        return vndProductCode;
    }

    /**
     * Sets the value of the vndProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndProductCode(String value) {
        this.vndProductCode = value;
    }

    /**
     * Gets the value of the vndProductShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndProductShortName() {
        return vndProductShortName;
    }

    /**
     * Sets the value of the vndProductShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndProductShortName(String value) {
        this.vndProductShortName = value;
    }

    /**
     * Gets the value of the vndProductStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndProductStatus() {
        return vndProductStatus;
    }

    /**
     * Sets the value of the vndProductStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndProductStatus(String value) {
        this.vndProductStatus = value;
    }

    /**
     * Gets the value of the vndManufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndManufacturerName() {
        return vndManufacturerName;
    }

    /**
     * Sets the value of the vndManufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndManufacturerName(String value) {
        this.vndManufacturerName = value;
    }

    /**
     * Gets the value of the vndBrandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndBrandName() {
        return vndBrandName;
    }

    /**
     * Sets the value of the vndBrandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndBrandName(String value) {
        this.vndBrandName = value;
    }

    /**
     * Gets the value of the vndBrandOwerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndBrandOwerName() {
        return vndBrandOwerName;
    }

    /**
     * Sets the value of the vndBrandOwerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndBrandOwerName(String value) {
        this.vndBrandOwerName = value;
    }

    /**
     * Gets the value of the vndUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndUnitQuantity() {
        return vndUnitQuantity;
    }

    /**
     * Sets the value of the vndUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndUnitQuantity(String value) {
        this.vndUnitQuantity = value;
    }

    /**
     * Gets the value of the vndUnitSizeNetCont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndUnitSizeNetCont() {
        return vndUnitSizeNetCont;
    }

    /**
     * Sets the value of the vndUnitSizeNetCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndUnitSizeNetCont(String value) {
        this.vndUnitSizeNetCont = value;
    }

    /**
     * Gets the value of the vndUnitSizeUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndUnitSizeUOM() {
        return vndUnitSizeUOM;
    }

    /**
     * Sets the value of the vndUnitSizeUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndUnitSizeUOM(String value) {
        this.vndUnitSizeUOM = value;
    }

    /**
     * Gets the value of the vndGeneralDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGeneralDescription() {
        return vndGeneralDescription;
    }

    /**
     * Sets the value of the vndGeneralDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGeneralDescription(String value) {
        this.vndGeneralDescription = value;
    }

    /**
     * Gets the value of the vndProductProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndProductProfile() {
        return vndProductProfile;
    }

    /**
     * Sets the value of the vndProductProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndProductProfile(String value) {
        this.vndProductProfile = value;
    }

    /**
     * Gets the value of the vndPrductTypUnitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPrductTypUnitDesc() {
        return vndPrductTypUnitDesc;
    }

    /**
     * Sets the value of the vndPrductTypUnitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPrductTypUnitDesc(String value) {
        this.vndPrductTypUnitDesc = value;
    }

    /**
     * Gets the value of the vndMasterPack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndMasterPack() {
        return vndMasterPack;
    }

    /**
     * Sets the value of the vndMasterPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndMasterPack(String value) {
        this.vndMasterPack = value;
    }

    /**
     * Gets the value of the vndChildGTIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndChildGTIN() {
        return vndChildGTIN;
    }

    /**
     * Sets the value of the vndChildGTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndChildGTIN(String value) {
        this.vndChildGTIN = value;
    }

    /**
     * Gets the value of the vndGPCCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGPCCode() {
        return vndGPCCode;
    }

    /**
     * Sets the value of the vndGPCCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGPCCode(String value) {
        this.vndGPCCode = value;
    }

    /**
     * Gets the value of the vndGPCDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGPCDescription() {
        return vndGPCDescription;
    }

    /**
     * Sets the value of the vndGPCDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGPCDescription(String value) {
        this.vndGPCDescription = value;
    }

    /**
     * Gets the value of the vndNetWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndNetWeight() {
        return vndNetWeight;
    }

    /**
     * Sets the value of the vndNetWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndNetWeight(String value) {
        this.vndNetWeight = value;
    }

    /**
     * Gets the value of the vndGrossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGrossWeight() {
        return vndGrossWeight;
    }

    /**
     * Sets the value of the vndGrossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGrossWeight(String value) {
        this.vndGrossWeight = value;
    }

    /**
     * Gets the value of the vndHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndHeight() {
        return vndHeight;
    }

    /**
     * Sets the value of the vndHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndHeight(String value) {
        this.vndHeight = value;
    }

    /**
     * Gets the value of the vndLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndLength() {
        return vndLength;
    }

    /**
     * Sets the value of the vndLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndLength(String value) {
        this.vndLength = value;
    }

    /**
     * Gets the value of the vndWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndWidth() {
        return vndWidth;
    }

    /**
     * Sets the value of the vndWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndWidth(String value) {
        this.vndWidth = value;
    }

    /**
     * Gets the value of the vndCube property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCube() {
        return vndCube;
    }

    /**
     * Sets the value of the vndCube property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCube(String value) {
        this.vndCube = value;
    }

    /**
     * Gets the value of the vndAvgServingPerCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndAvgServingPerCase() {
        return vndAvgServingPerCase;
    }

    /**
     * Sets the value of the vndAvgServingPerCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndAvgServingPerCase(String value) {
        this.vndAvgServingPerCase = value;
    }

    /**
     * Gets the value of the vndPalletGTINHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPalletGTINHigh() {
        return vndPalletGTINHigh;
    }

    /**
     * Sets the value of the vndPalletGTINHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPalletGTINHigh(String value) {
        this.vndPalletGTINHigh = value;
    }

    /**
     * Gets the value of the vndPalletGTINTie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPalletGTINTie() {
        return vndPalletGTINTie;
    }

    /**
     * Sets the value of the vndPalletGTINTie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPalletGTINTie(String value) {
        this.vndPalletGTINTie = value;
    }

    /**
     * Gets the value of the vndPalletHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPalletHigh() {
        return vndPalletHigh;
    }

    /**
     * Sets the value of the vndPalletHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPalletHigh(String value) {
        this.vndPalletHigh = value;
    }

    /**
     * Gets the value of the vndPalletTie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPalletTie() {
        return vndPalletTie;
    }

    /**
     * Sets the value of the vndPalletTie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPalletTie(String value) {
        this.vndPalletTie = value;
    }

    /**
     * Gets the value of the vndTotalPalletQuantit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTotalPalletQuantit() {
        return vndTotalPalletQuantit;
    }

    /**
     * Sets the value of the vndTotalPalletQuantit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTotalPalletQuantit(String value) {
        this.vndTotalPalletQuantit = value;
    }

    /**
     * Gets the value of the vndQtyOfChildrenCIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndQtyOfChildrenCIN() {
        return vndQtyOfChildrenCIN;
    }

    /**
     * Sets the value of the vndQtyOfChildrenCIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndQtyOfChildrenCIN(String value) {
        this.vndQtyOfChildrenCIN = value;
    }

    /**
     * Gets the value of the vndQtyOfNxtLvlItmCIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndQtyOfNxtLvlItmCIR() {
        return vndQtyOfNxtLvlItmCIR;
    }

    /**
     * Sets the value of the vndQtyOfNxtLvlItmCIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndQtyOfNxtLvlItmCIR(String value) {
        this.vndQtyOfNxtLvlItmCIR = value;
    }

    /**
     * Gets the value of the vndShelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndShelfLife() {
        return vndShelfLife;
    }

    /**
     * Sets the value of the vndShelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndShelfLife(String value) {
        this.vndShelfLife = value;
    }

    /**
     * Gets the value of the vndShelfLifeUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndShelfLifeUOM() {
        return vndShelfLifeUOM;
    }

    /**
     * Sets the value of the vndShelfLifeUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndShelfLifeUOM(String value) {
        this.vndShelfLifeUOM = value;
    }

    /**
     * Gets the value of the vndStorageTempFromF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndStorageTempFromF() {
        return vndStorageTempFromF;
    }

    /**
     * Sets the value of the vndStorageTempFromF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndStorageTempFromF(String value) {
        this.vndStorageTempFromF = value;
    }

    /**
     * Gets the value of the vndStorageTempTOF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndStorageTempTOF() {
        return vndStorageTempTOF;
    }

    /**
     * Sets the value of the vndStorageTempTOF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndStorageTempTOF(String value) {
        this.vndStorageTempTOF = value;
    }

    /**
     * Gets the value of the vndCountryOrgOfProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCountryOrgOfProd() {
        return vndCountryOrgOfProd;
    }

    /**
     * Sets the value of the vndCountryOrgOfProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCountryOrgOfProd(String value) {
        this.vndCountryOrgOfProd = value;
    }

    /**
     * Gets the value of the vndCatchRandomWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCatchRandomWeight() {
        return vndCatchRandomWeight;
    }

    /**
     * Sets the value of the vndCatchRandomWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCatchRandomWeight(String value) {
        this.vndCatchRandomWeight = value;
    }

    /**
     * Gets the value of the vndOrdrableVariableWt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndOrdrableVariableWt() {
        return vndOrdrableVariableWt;
    }

    /**
     * Sets the value of the vndOrdrableVariableWt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndOrdrableVariableWt(String value) {
        this.vndOrdrableVariableWt = value;
    }

    /**
     * Gets the value of the vndKosher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndKosher() {
        return vndKosher;
    }

    /**
     * Sets the value of the vndKosher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndKosher(String value) {
        this.vndKosher = value;
    }

    /**
     * Gets the value of the vndKosherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndKosherType() {
        return vndKosherType;
    }

    /**
     * Sets the value of the vndKosherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndKosherType(String value) {
        this.vndKosherType = value;
    }

    /**
     * Gets the value of the vndNonSoldReturnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndNonSoldReturnable() {
        return vndNonSoldReturnable;
    }

    /**
     * Sets the value of the vndNonSoldReturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndNonSoldReturnable(String value) {
        this.vndNonSoldReturnable = value;
    }

    /**
     * Gets the value of the vndIsItAConsumerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIsItAConsumerUnit() {
        return vndIsItAConsumerUnit;
    }

    /**
     * Sets the value of the vndIsItAConsumerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIsItAConsumerUnit(String value) {
        this.vndIsItAConsumerUnit = value;
    }

    /**
     * Gets the value of the vndIsItADispatchUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIsItADispatchUnit() {
        return vndIsItADispatchUnit;
    }

    /**
     * Sets the value of the vndIsItADispatchUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIsItADispatchUnit(String value) {
        this.vndIsItADispatchUnit = value;
    }

    /**
     * Gets the value of the vndIsItAInvoiceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIsItAInvoiceUnit() {
        return vndIsItAInvoiceUnit;
    }

    /**
     * Sets the value of the vndIsItAInvoiceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIsItAInvoiceUnit(String value) {
        this.vndIsItAInvoiceUnit = value;
    }

    /**
     * Gets the value of the vndIsAnOrderableUnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIsAnOrderableUnt() {
        return vndIsAnOrderableUnt;
    }

    /**
     * Sets the value of the vndIsAnOrderableUnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIsAnOrderableUnt(String value) {
        this.vndIsAnOrderableUnt = value;
    }

    /**
     * Gets the value of the vndIsItABaseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIsItABaseUnit() {
        return vndIsItABaseUnit;
    }

    /**
     * Sets the value of the vndIsItABaseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIsItABaseUnit(String value) {
        this.vndIsItABaseUnit = value;
    }

    /**
     * Gets the value of the vndIsPackageReturnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIsPackageReturnable() {
        return vndIsPackageReturnable;
    }

    /**
     * Sets the value of the vndIsPackageReturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIsPackageReturnable(String value) {
        this.vndIsPackageReturnable = value;
    }

    /**
     * Gets the value of the vndMarkingLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndMarkingLotNumber() {
        return vndMarkingLotNumber;
    }

    /**
     * Sets the value of the vndMarkingLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndMarkingLotNumber(String value) {
        this.vndMarkingLotNumber = value;
    }

    /**
     * Gets the value of the vndTargetMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTargetMarket() {
        return vndTargetMarket;
    }

    /**
     * Sets the value of the vndTargetMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTargetMarket(String value) {
        this.vndTargetMarket = value;
    }

    /**
     * Gets the value of the vndStorageInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndStorageInstruction() {
        return vndStorageInstruction;
    }

    /**
     * Sets the value of the vndStorageInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndStorageInstruction(String value) {
        this.vndStorageInstruction = value;
    }

    /**
     * Gets the value of the vndTransFatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTransFatStatus() {
        return vndTransFatStatus;
    }

    /**
     * Sets the value of the vndTransFatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTransFatStatus(String value) {
        this.vndTransFatStatus = value;
    }

    /**
     * Gets the value of the vndFarmRaised property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndFarmRaised() {
        return vndFarmRaised;
    }

    /**
     * Sets the value of the vndFarmRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndFarmRaised(String value) {
        this.vndFarmRaised = value;
    }

    /**
     * Gets the value of the vndFairTrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndFairTrade() {
        return vndFairTrade;
    }

    /**
     * Sets the value of the vndFairTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndFairTrade(String value) {
        this.vndFairTrade = value;
    }

    /**
     * Gets the value of the vndFreeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndFreeRange() {
        return vndFreeRange;
    }

    /**
     * Sets the value of the vndFreeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndFreeRange(String value) {
        this.vndFreeRange = value;
    }

    /**
     * Gets the value of the vndOrganic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndOrganic() {
        return vndOrganic;
    }

    /**
     * Sets the value of the vndOrganic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndOrganic(String value) {
        this.vndOrganic = value;
    }

    /**
     * Gets the value of the vndWild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndWild() {
        return vndWild;
    }

    /**
     * Sets the value of the vndWild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndWild(String value) {
        this.vndWild = value;
    }

    /**
     * Gets the value of the vndSeasonalItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSeasonalItem() {
        return vndSeasonalItem;
    }

    /**
     * Sets the value of the vndSeasonalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSeasonalItem(String value) {
        this.vndSeasonalItem = value;
    }

    /**
     * Gets the value of the vndGeneticallyModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGeneticallyModified() {
        return vndGeneticallyModified;
    }

    /**
     * Sets the value of the vndGeneticallyModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGeneticallyModified(String value) {
        this.vndGeneticallyModified = value;
    }

    /**
     * Gets the value of the vndHalal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndHalal() {
        return vndHalal;
    }

    /**
     * Sets the value of the vndHalal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndHalal(String value) {
        this.vndHalal = value;
    }

    /**
     * Gets the value of the vndMarkedAsRecyclable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndMarkedAsRecyclable() {
        return vndMarkedAsRecyclable;
    }

    /**
     * Sets the value of the vndMarkedAsRecyclable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndMarkedAsRecyclable(String value) {
        this.vndMarkedAsRecyclable = value;
    }

    /**
     * Gets the value of the vndVegan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndVegan() {
        return vndVegan;
    }

    /**
     * Sets the value of the vndVegan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndVegan(String value) {
        this.vndVegan = value;
    }

    /**
     * Gets the value of the vndBioDegradeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndBioDegradeable() {
        return vndBioDegradeable;
    }

    /**
     * Sets the value of the vndBioDegradeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndBioDegradeable(String value) {
        this.vndBioDegradeable = value;
    }

    /**
     * Gets the value of the vndClonedFoods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndClonedFoods() {
        return vndClonedFoods;
    }

    /**
     * Sets the value of the vndClonedFoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndClonedFoods(String value) {
        this.vndClonedFoods = value;
    }

    /**
     * Gets the value of the vndProbiotic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndProbiotic() {
        return vndProbiotic;
    }

    /**
     * Sets the value of the vndProbiotic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndProbiotic(String value) {
        this.vndProbiotic = value;
    }

    /**
     * Gets the value of the vndrBSTFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndrBSTFree() {
        return vndrBSTFree;
    }

    /**
     * Sets the value of the vndrBSTFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndrBSTFree(String value) {
        this.vndrBSTFree = value;
    }

    /**
     * Gets the value of the vndHumanelyRaised property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndHumanelyRaised() {
        return vndHumanelyRaised;
    }

    /**
     * Sets the value of the vndHumanelyRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndHumanelyRaised(String value) {
        this.vndHumanelyRaised = value;
    }

    /**
     * Gets the value of the vndLactoseFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndLactoseFree() {
        return vndLactoseFree;
    }

    /**
     * Sets the value of the vndLactoseFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndLactoseFree(String value) {
        this.vndLactoseFree = value;
    }

    /**
     * Gets the value of the vndMscCertified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndMscCertified() {
        return vndMscCertified;
    }

    /**
     * Sets the value of the vndMscCertified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndMscCertified(String value) {
        this.vndMscCertified = value;
    }

    /**
     * Gets the value of the vndNatural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndNatural() {
        return vndNatural;
    }

    /**
     * Sets the value of the vndNatural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndNatural(String value) {
        this.vndNatural = value;
    }

    /**
     * Gets the value of the vndShadeGrown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndShadeGrown() {
        return vndShadeGrown;
    }

    /**
     * Sets the value of the vndShadeGrown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndShadeGrown(String value) {
        this.vndShadeGrown = value;
    }

    /**
     * Gets the value of the vndSustainable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSustainable() {
        return vndSustainable;
    }

    /**
     * Sets the value of the vndSustainable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSustainable(String value) {
        this.vndSustainable = value;
    }

    /**
     * Gets the value of the vndUSDAGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndUSDAGrade() {
        return vndUSDAGrade;
    }

    /**
     * Sets the value of the vndUSDAGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndUSDAGrade(String value) {
        this.vndUSDAGrade = value;
    }

    /**
     * Gets the value of the vndCalculationSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCalculationSize() {
        return vndCalculationSize;
    }

    /**
     * Sets the value of the vndCalculationSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCalculationSize(String value) {
        this.vndCalculationSize = value;
    }

    /**
     * Gets the value of the vndCalculationSizeUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCalculationSizeUOM() {
        return vndCalculationSizeUOM;
    }

    /**
     * Sets the value of the vndCalculationSizeUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCalculationSizeUOM(String value) {
        this.vndCalculationSizeUOM = value;
    }

    /**
     * Gets the value of the vndSuggestdServingSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSuggestdServingSize() {
        return vndSuggestdServingSize;
    }

    /**
     * Sets the value of the vndSuggestdServingSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSuggestdServingSize(String value) {
        this.vndSuggestdServingSize = value;
    }

    /**
     * Gets the value of the vndCalciumPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCalciumPercentRDIUSA() {
        return vndCalciumPercentRDIUSA;
    }

    /**
     * Sets the value of the vndCalciumPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCalciumPercentRDIUSA(String value) {
        this.vndCalciumPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndCalciumMg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCalciumMg() {
        return vndCalciumMg;
    }

    /**
     * Sets the value of the vndCalciumMg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCalciumMg(String value) {
        this.vndCalciumMg = value;
    }

    /**
     * Gets the value of the vndCalories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCalories() {
        return vndCalories;
    }

    /**
     * Sets the value of the vndCalories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCalories(String value) {
        this.vndCalories = value;
    }

    /**
     * Gets the value of the vndCaloriesFromFat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCaloriesFromFat() {
        return vndCaloriesFromFat;
    }

    /**
     * Sets the value of the vndCaloriesFromFat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCaloriesFromFat(String value) {
        this.vndCaloriesFromFat = value;
    }

    /**
     * Gets the value of the vndCarbohydrates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCarbohydrates() {
        return vndCarbohydrates;
    }

    /**
     * Sets the value of the vndCarbohydrates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCarbohydrates(String value) {
        this.vndCarbohydrates = value;
    }

    /**
     * Gets the value of the vndCarbohydratesPercentRDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCarbohydratesPercentRDI() {
        return vndCarbohydratesPercentRDI;
    }

    /**
     * Sets the value of the vndCarbohydratesPercentRDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCarbohydratesPercentRDI(String value) {
        this.vndCarbohydratesPercentRDI = value;
    }

    /**
     * Gets the value of the vndCholesterolMg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCholesterolMg() {
        return vndCholesterolMg;
    }

    /**
     * Sets the value of the vndCholesterolMg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCholesterolMg(String value) {
        this.vndCholesterolMg = value;
    }

    /**
     * Gets the value of the vndCholesterolRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCholesterolRDIUSA() {
        return vndCholesterolRDIUSA;
    }

    /**
     * Sets the value of the vndCholesterolRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCholesterolRDIUSA(String value) {
        this.vndCholesterolRDIUSA = value;
    }

    /**
     * Gets the value of the vndGlutenFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndGlutenFree() {
        return vndGlutenFree;
    }

    /**
     * Sets the value of the vndGlutenFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndGlutenFree(String value) {
        this.vndGlutenFree = value;
    }

    /**
     * Gets the value of the vndIronPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIronPercentRDIUSA() {
        return vndIronPercentRDIUSA;
    }

    /**
     * Sets the value of the vndIronPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIronPercentRDIUSA(String value) {
        this.vndIronPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndIronMg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIronMg() {
        return vndIronMg;
    }

    /**
     * Sets the value of the vndIronMg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIronMg(String value) {
        this.vndIronMg = value;
    }

    /**
     * Gets the value of the vndProtein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndProtein() {
        return vndProtein;
    }

    /**
     * Sets the value of the vndProtein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndProtein(String value) {
        this.vndProtein = value;
    }

    /**
     * Gets the value of the vndSaturatedFat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSaturatedFat() {
        return vndSaturatedFat;
    }

    /**
     * Sets the value of the vndSaturatedFat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSaturatedFat(String value) {
        this.vndSaturatedFat = value;
    }

    /**
     * Gets the value of the vndSaturatedFatPercenRDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSaturatedFatPercenRDI() {
        return vndSaturatedFatPercenRDI;
    }

    /**
     * Sets the value of the vndSaturatedFatPercenRDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSaturatedFatPercenRDI(String value) {
        this.vndSaturatedFatPercenRDI = value;
    }

    /**
     * Gets the value of the vndSodiumPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSodiumPercentRDIUSA() {
        return vndSodiumPercentRDIUSA;
    }

    /**
     * Sets the value of the vndSodiumPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSodiumPercentRDIUSA(String value) {
        this.vndSodiumPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndSodiumMg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSodiumMg() {
        return vndSodiumMg;
    }

    /**
     * Sets the value of the vndSodiumMg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSodiumMg(String value) {
        this.vndSodiumMg = value;
    }

    /**
     * Gets the value of the vndTotalDietaryFiber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTotalDietaryFiber() {
        return vndTotalDietaryFiber;
    }

    /**
     * Sets the value of the vndTotalDietaryFiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTotalDietaryFiber(String value) {
        this.vndTotalDietaryFiber = value;
    }

    /**
     * Gets the value of the vndTotalDietFiberRDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTotalDietFiberRDI() {
        return vndTotalDietFiberRDI;
    }

    /**
     * Sets the value of the vndTotalDietFiberRDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTotalDietFiberRDI(String value) {
        this.vndTotalDietFiberRDI = value;
    }

    /**
     * Gets the value of the vndTotalFat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTotalFat() {
        return vndTotalFat;
    }

    /**
     * Sets the value of the vndTotalFat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTotalFat(String value) {
        this.vndTotalFat = value;
    }

    /**
     * Gets the value of the vndTotalFatPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTotalFatPercentRDIUSA() {
        return vndTotalFatPercentRDIUSA;
    }

    /**
     * Sets the value of the vndTotalFatPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTotalFatPercentRDIUSA(String value) {
        this.vndTotalFatPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndTotalSugar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTotalSugar() {
        return vndTotalSugar;
    }

    /**
     * Sets the value of the vndTotalSugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTotalSugar(String value) {
        this.vndTotalSugar = value;
    }

    /**
     * Gets the value of the vndTransfattyAcids property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTransfattyAcids() {
        return vndTransfattyAcids;
    }

    /**
     * Sets the value of the vndTransfattyAcids property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTransfattyAcids(String value) {
        this.vndTransfattyAcids = value;
    }

    /**
     * Gets the value of the vndVitaminAIUPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndVitaminAIUPercentRDIUSA() {
        return vndVitaminAIUPercentRDIUSA;
    }

    /**
     * Sets the value of the vndVitaminAIUPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndVitaminAIUPercentRDIUSA(String value) {
        this.vndVitaminAIUPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndVitaminCPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndVitaminCPercentRDIUSA() {
        return vndVitaminCPercentRDIUSA;
    }

    /**
     * Sets the value of the vndVitaminCPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndVitaminCPercentRDIUSA(String value) {
        this.vndVitaminCPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndVitaminCMg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndVitaminCMg() {
        return vndVitaminCMg;
    }

    /**
     * Sets the value of the vndVitaminCMg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndVitaminCMg(String value) {
        this.vndVitaminCMg = value;
    }

    /**
     * Gets the value of the vndVitaminDPercentRDIUSA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndVitaminDPercentRDIUSA() {
        return vndVitaminDPercentRDIUSA;
    }

    /**
     * Sets the value of the vndVitaminDPercentRDIUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndVitaminDPercentRDIUSA(String value) {
        this.vndVitaminDPercentRDIUSA = value;
    }

    /**
     * Gets the value of the vndEggs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndEggs() {
        return vndEggs;
    }

    /**
     * Sets the value of the vndEggs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndEggs(String value) {
        this.vndEggs = value;
    }

    /**
     * Gets the value of the vndMilk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndMilk() {
        return vndMilk;
    }

    /**
     * Sets the value of the vndMilk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndMilk(String value) {
        this.vndMilk = value;
    }

    /**
     * Gets the value of the vndPeanuts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPeanuts() {
        return vndPeanuts;
    }

    /**
     * Sets the value of the vndPeanuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPeanuts(String value) {
        this.vndPeanuts = value;
    }

    /**
     * Gets the value of the vndSoy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSoy() {
        return vndSoy;
    }

    /**
     * Sets the value of the vndSoy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSoy(String value) {
        this.vndSoy = value;
    }

    /**
     * Gets the value of the vndWheat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndWheat() {
        return vndWheat;
    }

    /**
     * Sets the value of the vndWheat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndWheat(String value) {
        this.vndWheat = value;
    }

    /**
     * Gets the value of the vndTreeNuts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndTreeNuts() {
        return vndTreeNuts;
    }

    /**
     * Sets the value of the vndTreeNuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndTreeNuts(String value) {
        this.vndTreeNuts = value;
    }

    /**
     * Gets the value of the vndCrustacean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndCrustacean() {
        return vndCrustacean;
    }

    /**
     * Sets the value of the vndCrustacean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndCrustacean(String value) {
        this.vndCrustacean = value;
    }

    /**
     * Gets the value of the vndSesame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndSesame() {
        return vndSesame;
    }

    /**
     * Sets the value of the vndSesame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndSesame(String value) {
        this.vndSesame = value;
    }

    /**
     * Gets the value of the vndFish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndFish() {
        return vndFish;
    }

    /**
     * Sets the value of the vndFish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndFish(String value) {
        this.vndFish = value;
    }

    /**
     * Gets the value of the vndChildNutrition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndChildNutrition() {
        return vndChildNutrition;
    }

    /**
     * Sets the value of the vndChildNutrition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndChildNutrition(String value) {
        this.vndChildNutrition = value;
    }

    /**
     * Gets the value of the vndLinkedPFGItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndLinkedPFGItemNumber() {
        return vndLinkedPFGItemNumber;
    }

    /**
     * Sets the value of the vndLinkedPFGItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndLinkedPFGItemNumber(String value) {
        this.vndLinkedPFGItemNumber = value;
    }

    /**
     * Gets the value of the vndPublishStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPublishStatus() {
        return vndPublishStatus;
    }

    /**
     * Sets the value of the vndPublishStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPublishStatus(String value) {
        this.vndPublishStatus = value;
    }

    /**
     * Gets the value of the vndBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndBenefits() {
        return vndBenefits;
    }

    /**
     * Sets the value of the vndBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndBenefits(String value) {
        this.vndBenefits = value;
    }

    /**
     * Gets the value of the vndMoreInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndMoreInfo() {
        return vndMoreInfo;
    }

    /**
     * Sets the value of the vndMoreInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndMoreInfo(String value) {
        this.vndMoreInfo = value;
    }

    /**
     * Gets the value of the vndPackageAndStorage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPackageAndStorage() {
        return vndPackageAndStorage;
    }

    /**
     * Sets the value of the vndPackageAndStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPackageAndStorage(String value) {
        this.vndPackageAndStorage = value;
    }

    /**
     * Gets the value of the vndPreparationAndCookingSuggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndPreparationAndCookingSuggestion() {
        return vndPreparationAndCookingSuggestion;
    }

    /**
     * Sets the value of the vndPreparationAndCookingSuggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndPreparationAndCookingSuggestion(String value) {
        this.vndPreparationAndCookingSuggestion = value;
    }

    /**
     * Gets the value of the vndIngredients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndIngredients() {
        return vndIngredients;
    }

    /**
     * Sets the value of the vndIngredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndIngredients(String value) {
        this.vndIngredients = value;
    }

    /**
     * Gets the value of the vndServingSuggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndServingSuggestion() {
        return vndServingSuggestion;
    }

    /**
     * Sets the value of the vndServingSuggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndServingSuggestion(String value) {
        this.vndServingSuggestion = value;
    }

}
