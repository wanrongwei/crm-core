/**
 * DebitorData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class DebitorData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData debitor;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresseListe;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe firmaListe;

    public DebitorData() {
    }

    public DebitorData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData debitor,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresseListe,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe firmaListe) {
        super(
            error);
        this.debitor = debitor;
        this.adresseListe = adresseListe;
        this.firmaListe = firmaListe;
    }


    /**
     * Gets the debitor value for this DebitorData.
     * 
     * @return debitor
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData getDebitor() {
        return debitor;
    }


    /**
     * Sets the debitor value for this DebitorData.
     * 
     * @param debitor
     */
    public void setDebitor(com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData debitor) {
        this.debitor = debitor;
    }


    /**
     * Gets the adresseListe value for this DebitorData.
     * 
     * @return adresseListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe getAdresseListe() {
        return adresseListe;
    }


    /**
     * Sets the adresseListe value for this DebitorData.
     * 
     * @param adresseListe
     */
    public void setAdresseListe(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresseListe) {
        this.adresseListe = adresseListe;
    }


    /**
     * Gets the firmaListe value for this DebitorData.
     * 
     * @return firmaListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe getFirmaListe() {
        return firmaListe;
    }


    /**
     * Sets the firmaListe value for this DebitorData.
     * 
     * @param firmaListe
     */
    public void setFirmaListe(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe firmaListe) {
        this.firmaListe = firmaListe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitorData)) return false;
        DebitorData other = (DebitorData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.debitor==null && other.getDebitor()==null) || 
             (this.debitor!=null &&
              this.debitor.equals(other.getDebitor()))) &&
            ((this.adresseListe==null && other.getAdresseListe()==null) || 
             (this.adresseListe!=null &&
              this.adresseListe.equals(other.getAdresseListe()))) &&
            ((this.firmaListe==null && other.getFirmaListe()==null) || 
             (this.firmaListe!=null &&
              this.firmaListe.equals(other.getFirmaListe())));
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
        if (getDebitor() != null) {
            _hashCode += getDebitor().hashCode();
        }
        if (getAdresseListe() != null) {
            _hashCode += getAdresseListe().hashCode();
        }
        if (getFirmaListe() != null) {
            _hashCode += getFirmaListe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitorData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "DebitorData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Debitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresseListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseListe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaListe"));
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
