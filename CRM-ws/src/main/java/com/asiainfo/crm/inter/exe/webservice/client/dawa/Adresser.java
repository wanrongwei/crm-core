/**
 * Adresser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Adresser  implements java.io.Serializable {
    private java.lang.String tekst;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangsadresse2 adgangsadresse;

    public Adresser() {
    }

    public Adresser(
           java.lang.String tekst,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangsadresse2 adgangsadresse) {
           this.tekst = tekst;
           this.adgangsadresse = adgangsadresse;
    }


    /**
     * Gets the tekst value for this Adresser.
     * 
     * @return tekst
     */
    public java.lang.String getTekst() {
        return tekst;
    }


    /**
     * Sets the tekst value for this Adresser.
     * 
     * @param tekst
     */
    public void setTekst(java.lang.String tekst) {
        this.tekst = tekst;
    }


    /**
     * Gets the adgangsadresse value for this Adresser.
     * 
     * @return adgangsadresse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangsadresse2 getAdgangsadresse() {
        return adgangsadresse;
    }


    /**
     * Sets the adgangsadresse value for this Adresser.
     * 
     * @param adgangsadresse
     */
    public void setAdgangsadresse(com.asiainfo.crm.inter.exe.webservice.client.dawa.Adgangsadresse2 adgangsadresse) {
        this.adgangsadresse = adgangsadresse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adresser)) return false;
        Adresser other = (Adresser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tekst==null && other.getTekst()==null) || 
             (this.tekst!=null &&
              this.tekst.equals(other.getTekst()))) &&
            ((this.adgangsadresse==null && other.getAdgangsadresse()==null) || 
             (this.adgangsadresse!=null &&
              this.adgangsadresse.equals(other.getAdgangsadresse())));
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
        if (getTekst() != null) {
            _hashCode += getTekst().hashCode();
        }
        if (getAdgangsadresse() != null) {
            _hashCode += getAdgangsadresse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Adresser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "adresser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tekst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tekst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adgangsadresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adgangsadresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "adgangsadresse2"));
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
