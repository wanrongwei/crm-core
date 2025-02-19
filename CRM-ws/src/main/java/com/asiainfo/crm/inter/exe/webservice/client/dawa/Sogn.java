/**
 * Sogn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Sogn  implements java.io.Serializable {
    private java.lang.String href;

    private java.lang.String kode;

    private java.lang.String navn;

    public Sogn() {
    }

    public Sogn(
           java.lang.String href,
           java.lang.String kode,
           java.lang.String navn) {
           this.href = href;
           this.kode = kode;
           this.navn = navn;
    }


    /**
     * Gets the href value for this Sogn.
     * 
     * @return href
     */
    public java.lang.String getHref() {
        return href;
    }


    /**
     * Sets the href value for this Sogn.
     * 
     * @param href
     */
    public void setHref(java.lang.String href) {
        this.href = href;
    }


    /**
     * Gets the kode value for this Sogn.
     * 
     * @return kode
     */
    public java.lang.String getKode() {
        return kode;
    }


    /**
     * Sets the kode value for this Sogn.
     * 
     * @param kode
     */
    public void setKode(java.lang.String kode) {
        this.kode = kode;
    }


    /**
     * Gets the navn value for this Sogn.
     * 
     * @return navn
     */
    public java.lang.String getNavn() {
        return navn;
    }


    /**
     * Sets the navn value for this Sogn.
     * 
     * @param navn
     */
    public void setNavn(java.lang.String navn) {
        this.navn = navn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sogn)) return false;
        Sogn other = (Sogn) obj;
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
            ((this.kode==null && other.getKode()==null) || 
             (this.kode!=null &&
              this.kode.equals(other.getKode()))) &&
            ((this.navn==null && other.getNavn()==null) || 
             (this.navn!=null &&
              this.navn.equals(other.getNavn())));
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
        if (getKode() != null) {
            _hashCode += getKode().hashCode();
        }
        if (getNavn() != null) {
            _hashCode += getNavn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sogn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "sogn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("href");
        elemField.setXmlName(new javax.xml.namespace.QName("", "href"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "navn"));
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
