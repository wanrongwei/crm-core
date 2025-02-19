/**
 * NotifyDeleteRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cbb;

public class NotifyDeleteRequestBody  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String returnCode;

    private java.lang.String message;

    private java.lang.String receiptServiceOperator;

    public NotifyDeleteRequestBody() {
    }

    public NotifyDeleteRequestBody(
           java.lang.String MSISDN,
           java.lang.String returnCode,
           java.lang.String message,
           java.lang.String receiptServiceOperator) {
           this.MSISDN = MSISDN;
           this.returnCode = returnCode;
           this.message = message;
           this.receiptServiceOperator = receiptServiceOperator;
    }


    /**
     * Gets the MSISDN value for this NotifyDeleteRequestBody.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this NotifyDeleteRequestBody.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the returnCode value for this NotifyDeleteRequestBody.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this NotifyDeleteRequestBody.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the message value for this NotifyDeleteRequestBody.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this NotifyDeleteRequestBody.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the receiptServiceOperator value for this NotifyDeleteRequestBody.
     * 
     * @return receiptServiceOperator
     */
    public java.lang.String getReceiptServiceOperator() {
        return receiptServiceOperator;
    }


    /**
     * Sets the receiptServiceOperator value for this NotifyDeleteRequestBody.
     * 
     * @param receiptServiceOperator
     */
    public void setReceiptServiceOperator(java.lang.String receiptServiceOperator) {
        this.receiptServiceOperator = receiptServiceOperator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyDeleteRequestBody)) return false;
        NotifyDeleteRequestBody other = (NotifyDeleteRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.receiptServiceOperator==null && other.getReceiptServiceOperator()==null) || 
             (this.receiptServiceOperator!=null &&
              this.receiptServiceOperator.equals(other.getReceiptServiceOperator())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getReceiptServiceOperator() != null) {
            _hashCode += getReceiptServiceOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyDeleteRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.pl.telenor.dk/veris/types", "notifyDeleteRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptServiceOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptServiceOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
