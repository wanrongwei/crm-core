/**
 * PortInRequestHURequestBody.java
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

public class PortInRequestHURequestBody  implements Serializable {
    private String orderId;

    private String currentServiceOperator;

    private String currentNetworkOperator;

    private String recipientServiceOperator;

    private String recipientNetworkOperator;

    private String requestedExecutionDate;

    private String equip;

    private String seriesStart;

    private String seriesEnd;

    public PortInRequestHURequestBody() {
    }

   
    /**
     * Gets the orderId value for this PortInRequestHURequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PortInRequestHURequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the currentServiceOperator value for this PortInRequestHURequestBody.
     * 
     * @return currentServiceOperator
     */
    public String getCurrentServiceOperator() {
        return currentServiceOperator;
    }


    /**
     * Sets the currentServiceOperator value for this PortInRequestHURequestBody.
     * 
     * @param currentServiceOperator
     */
    public void setCurrentServiceOperator(String currentServiceOperator) {
        this.currentServiceOperator = currentServiceOperator;
    }


    /**
     * Gets the currentNetworkOperator value for this PortInRequestHURequestBody.
     * 
     * @return currentNetworkOperator
     */
    public String getCurrentNetworkOperator() {
        return currentNetworkOperator;
    }


    /**
     * Sets the currentNetworkOperator value for this PortInRequestHURequestBody.
     * 
     * @param currentNetworkOperator
     */
    public void setCurrentNetworkOperator(String currentNetworkOperator) {
        this.currentNetworkOperator = currentNetworkOperator;
    }


    /**
     * Gets the recipientServiceOperator value for this PortInRequestHURequestBody.
     * 
     * @return recipientServiceOperator
     */
    public String getRecipientServiceOperator() {
        return recipientServiceOperator;
    }


    /**
     * Sets the recipientServiceOperator value for this PortInRequestHURequestBody.
     * 
     * @param recipientServiceOperator
     */
    public void setRecipientServiceOperator(String recipientServiceOperator) {
        this.recipientServiceOperator = recipientServiceOperator;
    }


    /**
     * Gets the recipientNetworkOperator value for this PortInRequestHURequestBody.
     * 
     * @return recipientNetworkOperator
     */
    public String getRecipientNetworkOperator() {
        return recipientNetworkOperator;
    }


    /**
     * Sets the recipientNetworkOperator value for this PortInRequestHURequestBody.
     * 
     * @param recipientNetworkOperator
     */
    public void setRecipientNetworkOperator(String recipientNetworkOperator) {
        this.recipientNetworkOperator = recipientNetworkOperator;
    }


    /**
     * Gets the requestedExecutionDate value for this PortInRequestHURequestBody.
     * 
     * @return requestedExecutionDate
     */
    public String getRequestedExecutionDate() {
        return requestedExecutionDate;
    }


    /**
     * Sets the requestedExecutionDate value for this PortInRequestHURequestBody.
     * 
     * @param requestedExecutionDate
     */
    public void setRequestedExecutionDate(String requestedExecutionDate) {
        this.requestedExecutionDate = requestedExecutionDate;
    }


    /**
     * Gets the equip value for this PortInRequestHURequestBody.
     * 
     * @return equip
     */
    public String getEquip() {
        return equip;
    }


    /**
     * Sets the equip value for this PortInRequestHURequestBody.
     * 
     * @param equip
     */
    public void setEquip(String equip) {
        this.equip = equip;
    }


    /**
     * Gets the seriesStart value for this PortInRequestHURequestBody.
     * 
     * @return seriesStart
     */
    public String getSeriesStart() {
        return seriesStart;
    }


    /**
     * Sets the seriesStart value for this PortInRequestHURequestBody.
     * 
     * @param seriesStart
     */
    public void setSeriesStart(String seriesStart) {
        this.seriesStart = seriesStart;
    }


    /**
     * Gets the seriesEnd value for this PortInRequestHURequestBody.
     * 
     * @return seriesEnd
     */
    public String getSeriesEnd() {
        return seriesEnd;
    }


    /**
     * Sets the seriesEnd value for this PortInRequestHURequestBody.
     * 
     * @param seriesEnd
     */
    public void setSeriesEnd(String seriesEnd) {
        this.seriesEnd = seriesEnd;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(PortInRequestHURequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "portInRequestHURequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
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
        elemField.setFieldName("recipientNetworkOperator");
        elemField.setXmlName(new QName("", "RecipientNetworkOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedExecutionDate");
        elemField.setXmlName(new QName("", "RequestedExecutionDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("equip");
        elemField.setXmlName(new QName("", "equip"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seriesStart");
        elemField.setXmlName(new QName("", "SeriesStart"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seriesEnd");
        elemField.setXmlName(new QName("", "SeriesEnd"));
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
