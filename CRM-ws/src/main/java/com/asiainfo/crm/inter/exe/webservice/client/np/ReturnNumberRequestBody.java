/**
 * ReturnNumberRequestBody.java
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

public class ReturnNumberRequestBody  implements Serializable {
    private String orderId;

    private String terminateDate;

    private String userId;

    private String mainNumber;

    private NumberSeries[] numberSeries;

    public ReturnNumberRequestBody() {
    }

    /**
     * Gets the orderId value for this ReturnNumberRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ReturnNumberRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the terminateDate value for this ReturnNumberRequestBody.
     * 
     * @return terminateDate
     */
    public String getTerminateDate() {
        return terminateDate;
    }


    /**
     * Sets the terminateDate value for this ReturnNumberRequestBody.
     * 
     * @param terminateDate
     */
    public void setTerminateDate(String terminateDate) {
        this.terminateDate = terminateDate;
    }


    /**
     * Gets the userId value for this ReturnNumberRequestBody.
     * 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ReturnNumberRequestBody.
     * 
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * Gets the mainNumber value for this ReturnNumberRequestBody.
     * 
     * @return mainNumber
     */
    public String getMainNumber() {
        return mainNumber;
    }


    /**
     * Sets the mainNumber value for this ReturnNumberRequestBody.
     * 
     * @param mainNumber
     */
    public void setMainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
    }


    /**
     * Gets the numberSeries value for this ReturnNumberRequestBody.
     * 
     * @return numberSeries
     */
    public NumberSeries[] getNumberSeries() {
        return numberSeries;
    }


    /**
     * Sets the numberSeries value for this ReturnNumberRequestBody.
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


    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(ReturnNumberRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "returnNumberRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminateDate");
        elemField.setXmlName(new QName("", "TerminateDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new QName("", "UserId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
       
        elemField = new ElementDesc();
        elemField.setFieldName("mainNumber");
        elemField.setXmlName(new QName("", "MainNumber"));
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
