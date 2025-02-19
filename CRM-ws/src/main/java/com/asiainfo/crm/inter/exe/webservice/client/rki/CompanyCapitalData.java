/**
 * CompanyCapitalData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class CompanyCapitalData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String dato;  // attribute

    private java.lang.String beløb;  // attribute

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public CompanyCapitalData() {
    }

    public CompanyCapitalData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String dato,
           java.lang.String beløb,
           java.lang.String beskedId,
           java.lang.String beskedType) {
        super(
            error);
        this.dato = dato;
        this.beløb = beløb;
        this.beskedId = beskedId;
        this.beskedType = beskedType;
    }


    /**
     * Gets the dato value for this CompanyCapitalData.
     * 
     * @return dato
     */
    public java.lang.String getDato() {
        return dato;
    }


    /**
     * Sets the dato value for this CompanyCapitalData.
     * 
     * @param dato
     */
    public void setDato(java.lang.String dato) {
        this.dato = dato;
    }


    /**
     * Gets the beløb value for this CompanyCapitalData.
     * 
     * @return beløb
     */
    public java.lang.String getBeløb() {
        return beløb;
    }


    /**
     * Sets the beløb value for this CompanyCapitalData.
     * 
     * @param beløb
     */
    public void setBeløb(java.lang.String beløb) {
        this.beløb = beløb;
    }


    /**
     * Gets the beskedId value for this CompanyCapitalData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this CompanyCapitalData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this CompanyCapitalData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this CompanyCapitalData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyCapitalData)) return false;
        CompanyCapitalData other = (CompanyCapitalData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dato==null && other.getDato()==null) || 
             (this.dato!=null &&
              this.dato.equals(other.getDato()))) &&
            ((this.beløb==null && other.getBeløb()==null) || 
             (this.beløb!=null &&
              this.beløb.equals(other.getBeløb()))) &&
            ((this.beskedId==null && other.getBeskedId()==null) || 
             (this.beskedId!=null &&
              this.beskedId.equals(other.getBeskedId()))) &&
            ((this.beskedType==null && other.getBeskedType()==null) || 
             (this.beskedType!=null &&
              this.beskedType.equals(other.getBeskedType())));
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
        if (getDato() != null) {
            _hashCode += getDato().hashCode();
        }
        if (getBeløb() != null) {
            _hashCode += getBeløb().hashCode();
        }
        if (getBeskedId() != null) {
            _hashCode += getBeskedId().hashCode();
        }
        if (getBeskedType() != null) {
            _hashCode += getBeskedType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyCapitalData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "CompanyCapitalData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dato");
        attrField.setXmlName(new javax.xml.namespace.QName("", "dato"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beløb");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beløb"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskedId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskedId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskedType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskedType"));
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
