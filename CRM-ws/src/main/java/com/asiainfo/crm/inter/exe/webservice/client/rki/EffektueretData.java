/**
 * EffektueretData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class EffektueretData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String effektueretOk;  // attribute

    private java.lang.String beskedId;  // attribute

    private java.lang.String transactionId;  // attribute

    public EffektueretData() {
    }

    public EffektueretData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String effektueretOk,
           java.lang.String beskedId,
           java.lang.String transactionId) {
        super(
            error);
        this.effektueretOk = effektueretOk;
        this.beskedId = beskedId;
        this.transactionId = transactionId;
    }


    /**
     * Gets the effektueretOk value for this EffektueretData.
     * 
     * @return effektueretOk
     */
    public java.lang.String getEffektueretOk() {
        return effektueretOk;
    }


    /**
     * Sets the effektueretOk value for this EffektueretData.
     * 
     * @param effektueretOk
     */
    public void setEffektueretOk(java.lang.String effektueretOk) {
        this.effektueretOk = effektueretOk;
    }


    /**
     * Gets the beskedId value for this EffektueretData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this EffektueretData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the transactionId value for this EffektueretData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this EffektueretData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EffektueretData)) return false;
        EffektueretData other = (EffektueretData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.effektueretOk==null && other.getEffektueretOk()==null) || 
             (this.effektueretOk!=null &&
              this.effektueretOk.equals(other.getEffektueretOk()))) &&
            ((this.beskedId==null && other.getBeskedId()==null) || 
             (this.beskedId!=null &&
              this.beskedId.equals(other.getBeskedId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEffektueretOk() != null) {
            _hashCode += getEffektueretOk().hashCode();
        }
        if (getBeskedId() != null) {
            _hashCode += getBeskedId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EffektueretData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "EffektueretData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("effektueretOk");
        attrField.setXmlName(new javax.xml.namespace.QName("", "effektueretOk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskedId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskedId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
