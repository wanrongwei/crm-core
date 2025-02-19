/**
 * AfmeldData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class AfmeldData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String afmeldOk;  // attribute

    private java.lang.String referenceNummer;  // attribute

    private java.lang.String transactionId;  // attribute

    public AfmeldData() {
    }

    public AfmeldData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String afmeldOk,
           java.lang.String referenceNummer,
           java.lang.String transactionId) {
        super(
            error);
        this.afmeldOk = afmeldOk;
        this.referenceNummer = referenceNummer;
        this.transactionId = transactionId;
    }


    /**
     * Gets the afmeldOk value for this AfmeldData.
     * 
     * @return afmeldOk
     */
    public java.lang.String getAfmeldOk() {
        return afmeldOk;
    }


    /**
     * Sets the afmeldOk value for this AfmeldData.
     * 
     * @param afmeldOk
     */
    public void setAfmeldOk(java.lang.String afmeldOk) {
        this.afmeldOk = afmeldOk;
    }


    /**
     * Gets the referenceNummer value for this AfmeldData.
     * 
     * @return referenceNummer
     */
    public java.lang.String getReferenceNummer() {
        return referenceNummer;
    }


    /**
     * Sets the referenceNummer value for this AfmeldData.
     * 
     * @param referenceNummer
     */
    public void setReferenceNummer(java.lang.String referenceNummer) {
        this.referenceNummer = referenceNummer;
    }


    /**
     * Gets the transactionId value for this AfmeldData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AfmeldData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AfmeldData)) return false;
        AfmeldData other = (AfmeldData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.afmeldOk==null && other.getAfmeldOk()==null) || 
             (this.afmeldOk!=null &&
              this.afmeldOk.equals(other.getAfmeldOk()))) &&
            ((this.referenceNummer==null && other.getReferenceNummer()==null) || 
             (this.referenceNummer!=null &&
              this.referenceNummer.equals(other.getReferenceNummer()))) &&
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
        if (getAfmeldOk() != null) {
            _hashCode += getAfmeldOk().hashCode();
        }
        if (getReferenceNummer() != null) {
            _hashCode += getReferenceNummer().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AfmeldData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AfmeldData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("afmeldOk");
        attrField.setXmlName(new javax.xml.namespace.QName("", "afmeldOk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("referenceNummer");
        attrField.setXmlName(new javax.xml.namespace.QName("", "referenceNummer"));
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
