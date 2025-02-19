/**
 * ResponseHeader.java
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

public class ResponseHeader  implements Serializable {
    private String transactionID;

    private String rspTransactionID;

    private String rspTime;

    private String rspCode;

    private String rspDesc;

    private String rspType;

    public ResponseHeader() {
    }

    /**
     * Gets the transactionID value for this ResponseHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this ResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the rspTransactionID value for this ResponseHeader.
     * 
     * @return rspTransactionID
     */
    public String getRspTransactionID() {
        return rspTransactionID;
    }


    /**
     * Sets the rspTransactionID value for this ResponseHeader.
     * 
     * @param rspTransactionID
     */
    public void setRspTransactionID(String rspTransactionID) {
        this.rspTransactionID = rspTransactionID;
    }


    /**
     * Gets the rspTime value for this ResponseHeader.
     * 
     * @return rspTime
     */
    public String getRspTime() {
        return rspTime;
    }


    /**
     * Sets the rspTime value for this ResponseHeader.
     * 
     * @param rspTime
     */
    public void setRspTime(String rspTime) {
        this.rspTime = rspTime;
    }


    /**
     * Gets the rspCode value for this ResponseHeader.
     * 
     * @return rspCode
     */
    public String getRspCode() {
        return rspCode;
    }


    /**
     * Sets the rspCode value for this ResponseHeader.
     * 
     * @param rspCode
     */
    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }


    /**
     * Gets the rspDesc value for this ResponseHeader.
     * 
     * @return rspDesc
     */
    public String getRspDesc() {
        return rspDesc;
    }


    /**
     * Sets the rspDesc value for this ResponseHeader.
     * 
     * @param rspDesc
     */
    public void setRspDesc(String rspDesc) {
        this.rspDesc = rspDesc;
    }


    /**
     * Gets the rspType value for this ResponseHeader.
     * 
     * @return rspType
     */
    public String getRspType() {
        return rspType;
    }


    /**
     * Sets the rspType value for this ResponseHeader.
     * 
     * @param rspType
     */
    public void setRspType(String rspType) {
        this.rspType = rspType;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(ResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new QName("", "TransactionID"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rspTransactionID");
        elemField.setXmlName(new QName("", "RspTransactionID"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rspTime");
        elemField.setXmlName(new QName("", "RspTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rspCode");
        elemField.setXmlName(new QName("", "RspCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rspDesc");
        elemField.setXmlName(new QName("", "RspDesc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rspType");
        elemField.setXmlName(new QName("", "RspType"));
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
