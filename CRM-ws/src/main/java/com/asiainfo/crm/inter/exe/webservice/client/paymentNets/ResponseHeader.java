/**
 * ResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ResponseHeader  implements java.io.Serializable {
    private String transactionID;

    private String rspTransactionID;

    private String rspTime;

    private String rspCode;

    private String rspDesc;

    private String rspType;

    public ResponseHeader() {
    }

    public ResponseHeader(
           String transactionID,
           String rspTransactionID,
           String rspTime,
           String rspCode,
           String rspDesc,
           String rspType) {
           this.transactionID = transactionID;
           this.rspTransactionID = rspTransactionID;
           this.rspTime = rspTime;
           this.rspCode = rspCode;
           this.rspDesc = rspDesc;
           this.rspType = rspType;
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

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResponseHeader)) return false;
        ResponseHeader other = (ResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.rspTransactionID==null && other.getRspTransactionID()==null) || 
             (this.rspTransactionID!=null &&
              this.rspTransactionID.equals(other.getRspTransactionID()))) &&
            ((this.rspTime==null && other.getRspTime()==null) || 
             (this.rspTime!=null &&
              this.rspTime.equals(other.getRspTime()))) &&
            ((this.rspCode==null && other.getRspCode()==null) || 
             (this.rspCode!=null &&
              this.rspCode.equals(other.getRspCode()))) &&
            ((this.rspDesc==null && other.getRspDesc()==null) || 
             (this.rspDesc!=null &&
              this.rspDesc.equals(other.getRspDesc()))) &&
            ((this.rspType==null && other.getRspType()==null) || 
             (this.rspType!=null &&
              this.rspType.equals(other.getRspType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getRspTransactionID() != null) {
            _hashCode += getRspTransactionID().hashCode();
        }
        if (getRspTime() != null) {
            _hashCode += getRspTime().hashCode();
        }
        if (getRspCode() != null) {
            _hashCode += getRspCode().hashCode();
        }
        if (getRspDesc() != null) {
            _hashCode += getRspDesc().hashCode();
        }
        if (getRspType() != null) {
            _hashCode += getRspType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static Serializer getSerializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
