/**
 * CvrNumberData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class CvrNumberData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String nummer;  // attribute

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public CvrNumberData() {
    }

    public CvrNumberData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String nummer,
           java.lang.String beskedId,
           java.lang.String beskedType) {
        super(
            error);
        this.nummer = nummer;
        this.beskedId = beskedId;
        this.beskedType = beskedType;
    }


    /**
     * Gets the nummer value for this CvrNumberData.
     * 
     * @return nummer
     */
    public java.lang.String getNummer() {
        return nummer;
    }


    /**
     * Sets the nummer value for this CvrNumberData.
     * 
     * @param nummer
     */
    public void setNummer(java.lang.String nummer) {
        this.nummer = nummer;
    }


    /**
     * Gets the beskedId value for this CvrNumberData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this CvrNumberData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this CvrNumberData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this CvrNumberData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CvrNumberData)) return false;
        CvrNumberData other = (CvrNumberData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nummer==null && other.getNummer()==null) || 
             (this.nummer!=null &&
              this.nummer.equals(other.getNummer()))) &&
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
        if (getNummer() != null) {
            _hashCode += getNummer().hashCode();
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
        new org.apache.axis.description.TypeDesc(CvrNumberData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "CvrNumberData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nummer");
        attrField.setXmlName(new javax.xml.namespace.QName("", "nummer"));
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
