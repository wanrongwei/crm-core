/**
 * HusNrData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class HusNrData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String fraNr;  // attribute

    private java.lang.String tilNr;  // attribute

    private java.lang.String fraBogstav;  // attribute

    private java.lang.String tilBogstav;  // attribute

    public HusNrData() {
    }

    public HusNrData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String fraNr,
           java.lang.String tilNr,
           java.lang.String fraBogstav,
           java.lang.String tilBogstav) {
        super(
            error);
        this.fraNr = fraNr;
        this.tilNr = tilNr;
        this.fraBogstav = fraBogstav;
        this.tilBogstav = tilBogstav;
    }


    /**
     * Gets the fraNr value for this HusNrData.
     * 
     * @return fraNr
     */
    public java.lang.String getFraNr() {
        return fraNr;
    }


    /**
     * Sets the fraNr value for this HusNrData.
     * 
     * @param fraNr
     */
    public void setFraNr(java.lang.String fraNr) {
        this.fraNr = fraNr;
    }


    /**
     * Gets the tilNr value for this HusNrData.
     * 
     * @return tilNr
     */
    public java.lang.String getTilNr() {
        return tilNr;
    }


    /**
     * Sets the tilNr value for this HusNrData.
     * 
     * @param tilNr
     */
    public void setTilNr(java.lang.String tilNr) {
        this.tilNr = tilNr;
    }


    /**
     * Gets the fraBogstav value for this HusNrData.
     * 
     * @return fraBogstav
     */
    public java.lang.String getFraBogstav() {
        return fraBogstav;
    }


    /**
     * Sets the fraBogstav value for this HusNrData.
     * 
     * @param fraBogstav
     */
    public void setFraBogstav(java.lang.String fraBogstav) {
        this.fraBogstav = fraBogstav;
    }


    /**
     * Gets the tilBogstav value for this HusNrData.
     * 
     * @return tilBogstav
     */
    public java.lang.String getTilBogstav() {
        return tilBogstav;
    }


    /**
     * Sets the tilBogstav value for this HusNrData.
     * 
     * @param tilBogstav
     */
    public void setTilBogstav(java.lang.String tilBogstav) {
        this.tilBogstav = tilBogstav;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HusNrData)) return false;
        HusNrData other = (HusNrData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fraNr==null && other.getFraNr()==null) || 
             (this.fraNr!=null &&
              this.fraNr.equals(other.getFraNr()))) &&
            ((this.tilNr==null && other.getTilNr()==null) || 
             (this.tilNr!=null &&
              this.tilNr.equals(other.getTilNr()))) &&
            ((this.fraBogstav==null && other.getFraBogstav()==null) || 
             (this.fraBogstav!=null &&
              this.fraBogstav.equals(other.getFraBogstav()))) &&
            ((this.tilBogstav==null && other.getTilBogstav()==null) || 
             (this.tilBogstav!=null &&
              this.tilBogstav.equals(other.getTilBogstav())));
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
        if (getFraNr() != null) {
            _hashCode += getFraNr().hashCode();
        }
        if (getTilNr() != null) {
            _hashCode += getTilNr().hashCode();
        }
        if (getFraBogstav() != null) {
            _hashCode += getFraBogstav().hashCode();
        }
        if (getTilBogstav() != null) {
            _hashCode += getTilBogstav().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HusNrData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "HusNrData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fraNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fraNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tilNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tilNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fraBogstav");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fraBogstav"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tilBogstav");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tilBogstav"));
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
