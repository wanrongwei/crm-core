/**
 * Vejstykke.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Vejstykke  implements java.io.Serializable {
    private java.lang.String href;

    private java.lang.String navn;

    private java.lang.String adresseringsnavn;

    private java.lang.String kode;

    public Vejstykke() {
    }

    public Vejstykke(
           java.lang.String href,
           java.lang.String navn,
           java.lang.String adresseringsnavn,
           java.lang.String kode) {
           this.href = href;
           this.navn = navn;
           this.adresseringsnavn = adresseringsnavn;
           this.kode = kode;
    }


    /**
     * Gets the href value for this Vejstykke.
     * 
     * @return href
     */
    public java.lang.String getHref() {
        return href;
    }


    /**
     * Sets the href value for this Vejstykke.
     * 
     * @param href
     */
    public void setHref(java.lang.String href) {
        this.href = href;
    }


    /**
     * Gets the navn value for this Vejstykke.
     * 
     * @return navn
     */
    public java.lang.String getNavn() {
        return navn;
    }


    /**
     * Sets the navn value for this Vejstykke.
     * 
     * @param navn
     */
    public void setNavn(java.lang.String navn) {
        this.navn = navn;
    }


    /**
     * Gets the adresseringsnavn value for this Vejstykke.
     * 
     * @return adresseringsnavn
     */
    public java.lang.String getAdresseringsnavn() {
        return adresseringsnavn;
    }


    /**
     * Sets the adresseringsnavn value for this Vejstykke.
     * 
     * @param adresseringsnavn
     */
    public void setAdresseringsnavn(java.lang.String adresseringsnavn) {
        this.adresseringsnavn = adresseringsnavn;
    }


    /**
     * Gets the kode value for this Vejstykke.
     * 
     * @return kode
     */
    public java.lang.String getKode() {
        return kode;
    }


    /**
     * Sets the kode value for this Vejstykke.
     * 
     * @param kode
     */
    public void setKode(java.lang.String kode) {
        this.kode = kode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vejstykke)) return false;
        Vejstykke other = (Vejstykke) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.href==null && other.getHref()==null) || 
             (this.href!=null &&
              this.href.equals(other.getHref()))) &&
            ((this.navn==null && other.getNavn()==null) || 
             (this.navn!=null &&
              this.navn.equals(other.getNavn()))) &&
            ((this.adresseringsnavn==null && other.getAdresseringsnavn()==null) || 
             (this.adresseringsnavn!=null &&
              this.adresseringsnavn.equals(other.getAdresseringsnavn()))) &&
            ((this.kode==null && other.getKode()==null) || 
             (this.kode!=null &&
              this.kode.equals(other.getKode())));
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
        if (getHref() != null) {
            _hashCode += getHref().hashCode();
        }
        if (getNavn() != null) {
            _hashCode += getNavn().hashCode();
        }
        if (getAdresseringsnavn() != null) {
            _hashCode += getAdresseringsnavn().hashCode();
        }
        if (getKode() != null) {
            _hashCode += getKode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vejstykke.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "vejstykke"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("href");
        elemField.setXmlName(new javax.xml.namespace.QName("", "href"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "navn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresseringsnavn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresseringsnavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kode"));
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
