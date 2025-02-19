/**
 * CheckBankAccountRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CheckBankAccountRequestBody  implements java.io.Serializable {
    private java.lang.String bankNumber;

    private java.lang.String bankAcctNumber;

    public CheckBankAccountRequestBody() {
    }

    public CheckBankAccountRequestBody(
           java.lang.String bankNumber,
           java.lang.String bankAcctNumber) {
           this.bankNumber = bankNumber;
           this.bankAcctNumber = bankAcctNumber;
    }


    /**
     * Gets the bankNumber value for this CheckBankAccountRequestBody.
     * 
     * @return bankNumber
     */
    public java.lang.String getBankNumber() {
        return bankNumber;
    }


    /**
     * Sets the bankNumber value for this CheckBankAccountRequestBody.
     * 
     * @param bankNumber
     */
    public void setBankNumber(java.lang.String bankNumber) {
        this.bankNumber = bankNumber;
    }


    /**
     * Gets the bankAcctNumber value for this CheckBankAccountRequestBody.
     * 
     * @return bankAcctNumber
     */
    public java.lang.String getBankAcctNumber() {
        return bankAcctNumber;
    }


    /**
     * Sets the bankAcctNumber value for this CheckBankAccountRequestBody.
     * 
     * @param bankAcctNumber
     */
    public void setBankAcctNumber(java.lang.String bankAcctNumber) {
        this.bankAcctNumber = bankAcctNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckBankAccountRequestBody)) return false;
        CheckBankAccountRequestBody other = (CheckBankAccountRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankNumber==null && other.getBankNumber()==null) || 
             (this.bankNumber!=null &&
              this.bankNumber.equals(other.getBankNumber()))) &&
            ((this.bankAcctNumber==null && other.getBankAcctNumber()==null) || 
             (this.bankAcctNumber!=null &&
              this.bankAcctNumber.equals(other.getBankAcctNumber())));
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
        if (getBankNumber() != null) {
            _hashCode += getBankNumber().hashCode();
        }
        if (getBankAcctNumber() != null) {
            _hashCode += getBankAcctNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckBankAccountRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("bankNumber");
        elemField.setXmlName(new QName("", "bankNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankAcctNumber");
        elemField.setXmlName(new QName("", "bankAcctNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
