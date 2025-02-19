/**
 * CrmOrderFinishedRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CrmOrderFinishedRequestBody  implements Serializable {
    private String orderId;

    private String telephoneNumber;

    private String product;

    private String prefix;

    private String portingCase;

    private String SPC;

    private String municipality;

    private String routingInfo;

    private String newNumberType;

    private String chargingInfo;

    private String numberPorted;

    public CrmOrderFinishedRequestBody() {
    }
    /**
     * Gets the orderId value for this CrmOrderFinishedRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this CrmOrderFinishedRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the telephoneNumber value for this CrmOrderFinishedRequestBody.
     * 
     * @return telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this CrmOrderFinishedRequestBody.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    /**
     * Gets the product value for this CrmOrderFinishedRequestBody.
     * 
     * @return product
     */
    public String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this CrmOrderFinishedRequestBody.
     * 
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }


    public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
     * Gets the portingCase value for this CrmOrderFinishedRequestBody.
     * 
     * @return portingCase
     */
    public String getPortingCase() {
        return portingCase;
    }


    /**
     * Sets the portingCase value for this CrmOrderFinishedRequestBody.
     * 
     * @param portingCase
     */
    public void setPortingCase(String portingCase) {
        this.portingCase = portingCase;
    }


    /**
     * Gets the SPC value for this CrmOrderFinishedRequestBody.
     * 
     * @return SPC
     */
    public String getSPC() {
        return SPC;
    }


    /**
     * Sets the SPC value for this CrmOrderFinishedRequestBody.
     * 
     * @param SPC
     */
    public void setSPC(String SPC) {
        this.SPC = SPC;
    }


    /**
     * Gets the municipality value for this CrmOrderFinishedRequestBody.
     * 
     * @return municipality
     */
    public String getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this CrmOrderFinishedRequestBody.
     * 
     * @param municipality
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }


    /**
     * Gets the routingInfo value for this CrmOrderFinishedRequestBody.
     * 
     * @return routingInfo
     */
    public String getRoutingInfo() {
        return routingInfo;
    }


    /**
     * Sets the routingInfo value for this CrmOrderFinishedRequestBody.
     * 
     * @param routingInfo
     */
    public void setRoutingInfo(String routingInfo) {
        this.routingInfo = routingInfo;
    }


    /**
     * Gets the newNumberType value for this CrmOrderFinishedRequestBody.
     * 
     * @return newNumberType
     */
    public String getNewNumberType() {
        return newNumberType;
    }


    /**
     * Sets the newNumberType value for this CrmOrderFinishedRequestBody.
     * 
     * @param newNumberType
     */
    public void setNewNumberType(String newNumberType) {
        this.newNumberType = newNumberType;
    }


    /**
     * Gets the chargingInfo value for this CrmOrderFinishedRequestBody.
     * 
     * @return chargingInfo
     */
    public String getChargingInfo() {
        return chargingInfo;
    }


    /**
     * Sets the chargingInfo value for this CrmOrderFinishedRequestBody.
     * 
     * @param chargingInfo
     */
    public void setChargingInfo(String chargingInfo) {
        this.chargingInfo = chargingInfo;
    }


    /**
     * Gets the numberPorted value for this CrmOrderFinishedRequestBody.
     * 
     * @return numberPorted
     */
    public String getNumberPorted() {
        return numberPorted;
    }


    /**
     * Sets the numberPorted value for this CrmOrderFinishedRequestBody.
     * 
     * @param numberPorted
     */
    public void setNumberPorted(String numberPorted) {
        this.numberPorted = numberPorted;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CrmOrderFinishedRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "crmOrderFinishedRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new QName("", "TelephoneNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("", "Product"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new QName("", "Prefix"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("portingCase");
        elemField.setXmlName(new QName("", "PortingCase"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("SPC");
        elemField.setXmlName(new QName("", "SPC"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("municipality");
        elemField.setXmlName(new QName("", "Municipality"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("routingInfo");
        elemField.setXmlName(new QName("", "RoutingInfo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newNumberType");
        elemField.setXmlName(new QName("", "NewNumberType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargingInfo");
        elemField.setXmlName(new QName("", "ChargingInfo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberPorted");
        elemField.setXmlName(new QName("", "NumberPorted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static Serializer getSerializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
