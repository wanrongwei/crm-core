/**
 * NumberChangeRequestRequestBody.java
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

public class NumberChangeRequestRequestBody  implements Serializable {
    private String orderId;

    private String countryCode;

    private String telephoneNumber;

    private String currentServiceOperator;

    private String currentNetworkOperator;

    private String recipientServiceOperator;

    private String portingCase;

    private String SPC;

    private String municipality;

    private String routingInfo;

    private String chargingInfo;

    private String newNumberType;

    private String numberPorted;

    private NumberSeries[] numberSeries;

    private String[] comment;

    public NumberChangeRequestRequestBody() {
    }

    /**
     * Gets the orderId value for this NumberChangeRequestRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this NumberChangeRequestRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the countryCode value for this NumberChangeRequestRequestBody.
     * 
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this NumberChangeRequestRequestBody.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the telephoneNumber value for this NumberChangeRequestRequestBody.
     * 
     * @return telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this NumberChangeRequestRequestBody.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    /**
     * Gets the currentServiceOperator value for this NumberChangeRequestRequestBody.
     * 
     * @return currentServiceOperator
     */
    public String getCurrentServiceOperator() {
        return currentServiceOperator;
    }


    /**
     * Sets the currentServiceOperator value for this NumberChangeRequestRequestBody.
     * 
     * @param currentServiceOperator
     */
    public void setCurrentServiceOperator(String currentServiceOperator) {
        this.currentServiceOperator = currentServiceOperator;
    }


    /**
     * Gets the currentNetworkOperator value for this NumberChangeRequestRequestBody.
     * 
     * @return currentNetworkOperator
     */
    public String getCurrentNetworkOperator() {
        return currentNetworkOperator;
    }


    /**
     * Sets the currentNetworkOperator value for this NumberChangeRequestRequestBody.
     * 
     * @param currentNetworkOperator
     */
    public void setCurrentNetworkOperator(String currentNetworkOperator) {
        this.currentNetworkOperator = currentNetworkOperator;
    }


    /**
     * Gets the recipientServiceOperator value for this NumberChangeRequestRequestBody.
     * 
     * @return recipientServiceOperator
     */
    public String getRecipientServiceOperator() {
        return recipientServiceOperator;
    }


    /**
     * Sets the recipientServiceOperator value for this NumberChangeRequestRequestBody.
     * 
     * @param recipientServiceOperator
     */
    public void setRecipientServiceOperator(String recipientServiceOperator) {
        this.recipientServiceOperator = recipientServiceOperator;
    }


    /**
     * Gets the portingCase value for this NumberChangeRequestRequestBody.
     * 
     * @return portingCase
     */
    public String getPortingCase() {
        return portingCase;
    }


    /**
     * Sets the portingCase value for this NumberChangeRequestRequestBody.
     * 
     * @param portingCase
     */
    public void setPortingCase(String portingCase) {
        this.portingCase = portingCase;
    }


    /**
     * Gets the SPC value for this NumberChangeRequestRequestBody.
     * 
     * @return SPC
     */
    public String getSPC() {
        return SPC;
    }


    /**
     * Sets the SPC value for this NumberChangeRequestRequestBody.
     * 
     * @param SPC
     */
    public void setSPC(String SPC) {
        this.SPC = SPC;
    }


    /**
     * Gets the municipality value for this NumberChangeRequestRequestBody.
     * 
     * @return municipality
     */
    public String getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this NumberChangeRequestRequestBody.
     * 
     * @param municipality
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }


    /**
     * Gets the routingInfo value for this NumberChangeRequestRequestBody.
     * 
     * @return routingInfo
     */
    public String getRoutingInfo() {
        return routingInfo;
    }


    /**
     * Sets the routingInfo value for this NumberChangeRequestRequestBody.
     * 
     * @param routingInfo
     */
    public void setRoutingInfo(String routingInfo) {
        this.routingInfo = routingInfo;
    }


    /**
     * Gets the chargingInfo value for this NumberChangeRequestRequestBody.
     * 
     * @return chargingInfo
     */
    public String getChargingInfo() {
        return chargingInfo;
    }


    /**
     * Sets the chargingInfo value for this NumberChangeRequestRequestBody.
     * 
     * @param chargingInfo
     */
    public void setChargingInfo(String chargingInfo) {
        this.chargingInfo = chargingInfo;
    }


    /**
     * Gets the newNumberType value for this NumberChangeRequestRequestBody.
     * 
     * @return newNumberType
     */
    public String getNewNumberType() {
        return newNumberType;
    }


    /**
     * Sets the newNumberType value for this NumberChangeRequestRequestBody.
     * 
     * @param newNumberType
     */
    public void setNewNumberType(String newNumberType) {
        this.newNumberType = newNumberType;
    }


    /**
     * Gets the numberPorted value for this NumberChangeRequestRequestBody.
     * 
     * @return numberPorted
     */
    public String getNumberPorted() {
        return numberPorted;
    }


    /**
     * Sets the numberPorted value for this NumberChangeRequestRequestBody.
     * 
     * @param numberPorted
     */
    public void setNumberPorted(String numberPorted) {
        this.numberPorted = numberPorted;
    }


    /**
     * Gets the numberSeries value for this NumberChangeRequestRequestBody.
     * 
     * @return numberSeries
     */
    public NumberSeries[] getNumberSeries() {
        return numberSeries;
    }


    /**
     * Sets the numberSeries value for this NumberChangeRequestRequestBody.
     * 
     * @param numberSeries
     */
    public void setNumberSeries(NumberSeries[] numberSeries) {
        this.numberSeries = numberSeries;
    }

    public NumberSeries getNumberSeries(int i) {
        return this.numberSeries[i];
    }

    public void setNumberSeries(int i, NumberSeries value) {
        this.numberSeries[i] = value;
    }


    /**
     * Gets the comment value for this NumberChangeRequestRequestBody.
     * 
     * @return comment
     */
    public String[] getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this NumberChangeRequestRequestBody.
     * 
     * @param comment
     */
    public void setComment(String[] comment) {
        this.comment = comment;
    }

    public String getComment(int i) {
        return this.comment[i];
    }

    public void setComment(int i, String value) {
        this.comment[i] = value;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(NumberChangeRequestRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "numberChangeRequestRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new QName("", "CountryCode"));
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
        elemField.setFieldName("currentServiceOperator");
        elemField.setXmlName(new QName("", "CurrentServiceOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentNetworkOperator");
        elemField.setXmlName(new QName("", "CurrentNetworkOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipientServiceOperator");
        elemField.setXmlName(new QName("", "RecipientServiceOperator"));
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
        elemField.setFieldName("chargingInfo");
        elemField.setXmlName(new QName("", "ChargingInfo"));
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
        elemField.setFieldName("numberPorted");
        elemField.setXmlName(new QName("", "NumberPorted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberSeries");
        elemField.setXmlName(new QName("", "NumberSeries"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "NumberSeries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new QName("", "Comment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
