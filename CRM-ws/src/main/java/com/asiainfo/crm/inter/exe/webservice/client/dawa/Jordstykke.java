/**
 * Jordstykke.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Jordstykke  implements java.io.Serializable {
    private java.lang.String href;

    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav ejerlav;

    private java.lang.String matrikelnr;

    private java.lang.String esrejendomsnr;

    public Jordstykke() {
    }

    public Jordstykke(
           java.lang.String href,
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav ejerlav,
           java.lang.String matrikelnr,
           java.lang.String esrejendomsnr) {
           this.href = href;
           this.ejerlav = ejerlav;
           this.matrikelnr = matrikelnr;
           this.esrejendomsnr = esrejendomsnr;
    }


    /**
     * Gets the href value for this Jordstykke.
     * 
     * @return href
     */
    public java.lang.String getHref() {
        return href;
    }


    /**
     * Sets the href value for this Jordstykke.
     * 
     * @param href
     */
    public void setHref(java.lang.String href) {
        this.href = href;
    }


    /**
     * Gets the ejerlav value for this Jordstykke.
     * 
     * @return ejerlav
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav getEjerlav() {
        return ejerlav;
    }


    /**
     * Sets the ejerlav value for this Jordstykke.
     * 
     * @param ejerlav
     */
    public void setEjerlav(com.asiainfo.crm.inter.exe.webservice.client.dawa.Ejerlav ejerlav) {
        this.ejerlav = ejerlav;
    }


    /**
     * Gets the matrikelnr value for this Jordstykke.
     * 
     * @return matrikelnr
     */
    public java.lang.String getMatrikelnr() {
        return matrikelnr;
    }


    /**
     * Sets the matrikelnr value for this Jordstykke.
     * 
     * @param matrikelnr
     */
    public void setMatrikelnr(java.lang.String matrikelnr) {
        this.matrikelnr = matrikelnr;
    }


    /**
     * Gets the esrejendomsnr value for this Jordstykke.
     * 
     * @return esrejendomsnr
     */
    public java.lang.String getEsrejendomsnr() {
        return esrejendomsnr;
    }


    /**
     * Sets the esrejendomsnr value for this Jordstykke.
     * 
     * @param esrejendomsnr
     */
    public void setEsrejendomsnr(java.lang.String esrejendomsnr) {
        this.esrejendomsnr = esrejendomsnr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jordstykke)) return false;
        Jordstykke other = (Jordstykke) obj;
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
            ((this.ejerlav==null && other.getEjerlav()==null) || 
             (this.ejerlav!=null &&
              this.ejerlav.equals(other.getEjerlav()))) &&
            ((this.matrikelnr==null && other.getMatrikelnr()==null) || 
             (this.matrikelnr!=null &&
              this.matrikelnr.equals(other.getMatrikelnr()))) &&
            ((this.esrejendomsnr==null && other.getEsrejendomsnr()==null) || 
             (this.esrejendomsnr!=null &&
              this.esrejendomsnr.equals(other.getEsrejendomsnr())));
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
        if (getEjerlav() != null) {
            _hashCode += getEjerlav().hashCode();
        }
        if (getMatrikelnr() != null) {
            _hashCode += getMatrikelnr().hashCode();
        }
        if (getEsrejendomsnr() != null) {
            _hashCode += getEsrejendomsnr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jordstykke.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "jordstykke"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("href");
        elemField.setXmlName(new javax.xml.namespace.QName("", "href"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ejerlav");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ejerlav"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ejerlav"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrikelnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrikelnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esrejendomsnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esrejendomsnr"));
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
