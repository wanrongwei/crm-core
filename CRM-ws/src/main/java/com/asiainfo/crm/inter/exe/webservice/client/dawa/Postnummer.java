/**
 * Postnummer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Postnummer  implements java.io.Serializable {
    private java.lang.String href;

    private java.lang.String nr;

    private java.lang.String navn;

    public Postnummer() {
    }

    public Postnummer(
           java.lang.String href,
           java.lang.String nr,
           java.lang.String navn) {
           this.href = href;
           this.nr = nr;
           this.navn = navn;
    }


    /**
     * Gets the href value for this Postnummer.
     * 
     * @return href
     */
    public java.lang.String getHref() {
        return href;
    }


    /**
     * Sets the href value for this Postnummer.
     * 
     * @param href
     */
    public void setHref(java.lang.String href) {
        this.href = href;
    }


    /**
     * Gets the nr value for this Postnummer.
     * 
     * @return nr
     */
    public java.lang.String getNr() {
        return nr;
    }


    /**
     * Sets the nr value for this Postnummer.
     * 
     * @param nr
     */
    public void setNr(java.lang.String nr) {
        this.nr = nr;
    }


    /**
     * Gets the navn value for this Postnummer.
     * 
     * @return navn
     */
    public java.lang.String getNavn() {
        return navn;
    }


    /**
     * Sets the navn value for this Postnummer.
     * 
     * @param navn
     */
    public void setNavn(java.lang.String navn) {
        this.navn = navn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Postnummer)) return false;
        Postnummer other = (Postnummer) obj;
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
            ((this.nr==null && other.getNr()==null) || 
             (this.nr!=null &&
              this.nr.equals(other.getNr()))) &&
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
        if (getNr() != null) {
            _hashCode += getNr().hashCode();
        }
        if (getNavn() != null) {
            _hashCode += getNavn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Postnummer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "postnummer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("href");
        elemField.setXmlName(new javax.xml.namespace.QName("", "href"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nr"));
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
