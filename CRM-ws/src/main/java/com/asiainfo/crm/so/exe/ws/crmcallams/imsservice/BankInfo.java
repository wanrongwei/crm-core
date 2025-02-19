/**
 * BankInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class BankInfo  implements java.io.Serializable {
    private java.lang.Integer bank_code;

    private java.lang.String bank_abbreviate;

    private java.lang.String bank_desc_thai;

    private java.lang.String bank_desc_eng;

    public BankInfo() {
    }

    public BankInfo(
           java.lang.Integer bank_code,
           java.lang.String bank_abbreviate,
           java.lang.String bank_desc_thai,
           java.lang.String bank_desc_eng) {
           this.bank_code = bank_code;
           this.bank_abbreviate = bank_abbreviate;
           this.bank_desc_thai = bank_desc_thai;
           this.bank_desc_eng = bank_desc_eng;
    }


    /**
     * Gets the bank_code value for this BankInfo.
     * 
     * @return bank_code
     */
    public java.lang.Integer getBank_code() {
        return bank_code;
    }


    /**
     * Sets the bank_code value for this BankInfo.
     * 
     * @param bank_code
     */
    public void setBank_code(java.lang.Integer bank_code) {
        this.bank_code = bank_code;
    }


    /**
     * Gets the bank_abbreviate value for this BankInfo.
     * 
     * @return bank_abbreviate
     */
    public java.lang.String getBank_abbreviate() {
        return bank_abbreviate;
    }


    /**
     * Sets the bank_abbreviate value for this BankInfo.
     * 
     * @param bank_abbreviate
     */
    public void setBank_abbreviate(java.lang.String bank_abbreviate) {
        this.bank_abbreviate = bank_abbreviate;
    }


    /**
     * Gets the bank_desc_thai value for this BankInfo.
     * 
     * @return bank_desc_thai
     */
    public java.lang.String getBank_desc_thai() {
        return bank_desc_thai;
    }


    /**
     * Sets the bank_desc_thai value for this BankInfo.
     * 
     * @param bank_desc_thai
     */
    public void setBank_desc_thai(java.lang.String bank_desc_thai) {
        this.bank_desc_thai = bank_desc_thai;
    }


    /**
     * Gets the bank_desc_eng value for this BankInfo.
     * 
     * @return bank_desc_eng
     */
    public java.lang.String getBank_desc_eng() {
        return bank_desc_eng;
    }


    /**
     * Sets the bank_desc_eng value for this BankInfo.
     * 
     * @param bank_desc_eng
     */
    public void setBank_desc_eng(java.lang.String bank_desc_eng) {
        this.bank_desc_eng = bank_desc_eng;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof BankInfo)) return false;
        BankInfo other = (BankInfo) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bank_code==null && other.getBank_code()==null) || 
             (this.bank_code!=null &&
              this.bank_code.equals(other.getBank_code()))) &&
            ((this.bank_abbreviate==null && other.getBank_abbreviate()==null) || 
             (this.bank_abbreviate!=null &&
              this.bank_abbreviate.equals(other.getBank_abbreviate()))) &&
            ((this.bank_desc_thai==null && other.getBank_desc_thai()==null) || 
             (this.bank_desc_thai!=null &&
              this.bank_desc_thai.equals(other.getBank_desc_thai()))) &&
            ((this.bank_desc_eng==null && other.getBank_desc_eng()==null) || 
             (this.bank_desc_eng!=null &&
              this.bank_desc_eng.equals(other.getBank_desc_eng())));
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
        if (getBank_code() != null) {
            _hashCode += getBank_code().hashCode();
        }
        if (getBank_abbreviate() != null) {
            _hashCode += getBank_abbreviate().hashCode();
        }
        if (getBank_desc_thai() != null) {
            _hashCode += getBank_desc_thai().hashCode();
        }
        if (getBank_desc_eng() != null) {
            _hashCode += getBank_desc_eng().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_abbreviate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_abbreviate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_desc_thai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_desc_thai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank_desc_eng");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bank_desc_eng"));
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
