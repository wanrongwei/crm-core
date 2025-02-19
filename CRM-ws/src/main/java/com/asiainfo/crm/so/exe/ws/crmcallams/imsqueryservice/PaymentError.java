/**
 * PaymentError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class PaymentError  implements java.io.Serializable {
    private java.util.Calendar dateTime;

    private java.lang.String operation;

    private java.lang.String responseCode;

    private java.lang.String responseSource;

    private java.lang.String responseText;

    public PaymentError() {
    }

    public PaymentError(
           java.util.Calendar dateTime,
           java.lang.String operation,
           java.lang.String responseCode,
           java.lang.String responseSource,
           java.lang.String responseText) {
           this.dateTime = dateTime;
           this.operation = operation;
           this.responseCode = responseCode;
           this.responseSource = responseSource;
           this.responseText = responseText;
    }


    /**
     * Gets the dateTime value for this PaymentError.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this PaymentError.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the operation value for this PaymentError.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this PaymentError.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the responseCode value for this PaymentError.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this PaymentError.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseSource value for this PaymentError.
     * 
     * @return responseSource
     */
    public java.lang.String getResponseSource() {
        return responseSource;
    }


    /**
     * Sets the responseSource value for this PaymentError.
     * 
     * @param responseSource
     */
    public void setResponseSource(java.lang.String responseSource) {
        this.responseSource = responseSource;
    }


    /**
     * Gets the responseText value for this PaymentError.
     * 
     * @return responseText
     */
    public java.lang.String getResponseText() {
        return responseText;
    }


    /**
     * Sets the responseText value for this PaymentError.
     * 
     * @param responseText
     */
    public void setResponseText(java.lang.String responseText) {
        this.responseText = responseText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof PaymentError)) return false;
        PaymentError other = (PaymentError) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseSource==null && other.getResponseSource()==null) || 
             (this.responseSource!=null &&
              this.responseSource.equals(other.getResponseSource()))) &&
            ((this.responseText==null && other.getResponseText()==null) || 
             (this.responseText!=null &&
              this.responseText.equals(other.getResponseText())));
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
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseSource() != null) {
            _hashCode += getResponseSource().hashCode();
        }
        if (getResponseText() != null) {
            _hashCode += getResponseText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseText"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
