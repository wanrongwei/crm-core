/**
 * SletteAarsagData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class SletteAarsagData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String tekst;

    private java.lang.String sletteAarsagsKode;

    public SletteAarsagData() {
    }

    public SletteAarsagData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String tekst,
           java.lang.String sletteAarsagsKode) {
        super(
            error);
        this.tekst = tekst;
        this.sletteAarsagsKode = sletteAarsagsKode;
    }


    /**
     * Gets the tekst value for this SletteAarsagData.
     * 
     * @return tekst
     */
    public java.lang.String getTekst() {
        return tekst;
    }


    /**
     * Sets the tekst value for this SletteAarsagData.
     * 
     * @param tekst
     */
    public void setTekst(java.lang.String tekst) {
        this.tekst = tekst;
    }


    /**
     * Gets the sletteAarsagsKode value for this SletteAarsagData.
     * 
     * @return sletteAarsagsKode
     */
    public java.lang.String getSletteAarsagsKode() {
        return sletteAarsagsKode;
    }


    /**
     * Sets the sletteAarsagsKode value for this SletteAarsagData.
     * 
     * @param sletteAarsagsKode
     */
    public void setSletteAarsagsKode(java.lang.String sletteAarsagsKode) {
        this.sletteAarsagsKode = sletteAarsagsKode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SletteAarsagData)) return false;
        SletteAarsagData other = (SletteAarsagData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tekst==null && other.getTekst()==null) || 
             (this.tekst!=null &&
              this.tekst.equals(other.getTekst()))) &&
            ((this.sletteAarsagsKode==null && other.getSletteAarsagsKode()==null) || 
             (this.sletteAarsagsKode!=null &&
              this.sletteAarsagsKode.equals(other.getSletteAarsagsKode())));
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
        if (getTekst() != null) {
            _hashCode += getTekst().hashCode();
        }
        if (getSletteAarsagsKode() != null) {
            _hashCode += getSletteAarsagsKode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SletteAarsagData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "SletteAarsagData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tekst");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Tekst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sletteAarsagsKode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "SletteAarsagsKode"));
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
