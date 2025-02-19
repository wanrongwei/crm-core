/**
 * CheckBankAccountResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

public class CheckBankAccountResponseBody  implements java.io.Serializable {
    private boolean result;

    private java.lang.String bankNumber;

    private java.lang.String bankAcctNumber;

    private java.lang.Integer status;

    public CheckBankAccountResponseBody() {
    }

    public CheckBankAccountResponseBody(
           boolean result,
           java.lang.String bankNumber,
           java.lang.String bankAcctNumber,
           java.lang.Integer status) {
           this.result = result;
           this.bankNumber = bankNumber;
           this.bankAcctNumber = bankAcctNumber;
           this.status = status;
    }


    /**
     * Gets the result value for this CheckBankAccountResponseBody.
     * 
     * @return result
     */
    public boolean isResult() {
        return result;
    }


    /**
     * Sets the result value for this CheckBankAccountResponseBody.
     * 
     * @param result
     */
    public void setResult(boolean result) {
        this.result = result;
    }


    /**
     * Gets the bankNumber value for this CheckBankAccountResponseBody.
     * 
     * @return bankNumber
     */
    public java.lang.String getBankNumber() {
        return bankNumber;
    }


    /**
     * Sets the bankNumber value for this CheckBankAccountResponseBody.
     * 
     * @param bankNumber
     */
    public void setBankNumber(java.lang.String bankNumber) {
        this.bankNumber = bankNumber;
    }


    /**
     * Gets the bankAcctNumber value for this CheckBankAccountResponseBody.
     * 
     * @return bankAcctNumber
     */
    public java.lang.String getBankAcctNumber() {
        return bankAcctNumber;
    }


    /**
     * Sets the bankAcctNumber value for this CheckBankAccountResponseBody.
     * 
     * @param bankAcctNumber
     */
    public void setBankAcctNumber(java.lang.String bankAcctNumber) {
        this.bankAcctNumber = bankAcctNumber;
    }


    /**
     * Gets the status value for this CheckBankAccountResponseBody.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CheckBankAccountResponseBody.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckBankAccountResponseBody)) return false;
        CheckBankAccountResponseBody other = (CheckBankAccountResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.isResult() &&
            ((this.bankNumber==null && other.getBankNumber()==null) || 
             (this.bankNumber!=null &&
              this.bankNumber.equals(other.getBankNumber()))) &&
            ((this.bankAcctNumber==null && other.getBankAcctNumber()==null) || 
             (this.bankAcctNumber!=null &&
              this.bankAcctNumber.equals(other.getBankAcctNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += (isResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBankNumber() != null) {
            _hashCode += getBankNumber().hashCode();
        }
        if (getBankAcctNumber() != null) {
            _hashCode += getBankAcctNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckBankAccountResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAcctNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAcctNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
