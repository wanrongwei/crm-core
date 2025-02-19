/**
 * OlietanksAnmaerkningData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class OlietanksAnmaerkningData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.AnmaerkningData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse;

    private java.lang.String aarsagsKode;

    private java.lang.String bemaerkning;

    public OlietanksAnmaerkningData() {
    }

    public OlietanksAnmaerkningData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String beskedId,
           java.lang.String beskedType,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData debitor,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData kreditor,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData administrator,
           java.lang.String videregivelsesDato,
           java.lang.String indberettetDato,
           java.lang.String slettetDato,
           java.lang.String fordringsBeloeb,
           java.lang.String kreditorsRefNr,
           java.lang.String administratorsRefNr,
           java.lang.String fundament,
           java.lang.String beloeb,
           java.lang.String registreringBemaerkning,
           java.lang.String registreringStatus,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse,
           java.lang.String aarsagsKode,
           java.lang.String bemaerkning) {
        super(
            error,
            beskedId,
            beskedType,
            debitor,
            kreditor,
            administrator,
            videregivelsesDato,
            indberettetDato,
            slettetDato,
            fordringsBeloeb,
            kreditorsRefNr,
            administratorsRefNr,
            fundament,
            beloeb,
            registreringBemaerkning,
            registreringStatus);
        this.adresse = adresse;
        this.aarsagsKode = aarsagsKode;
        this.bemaerkning = bemaerkning;
    }


    /**
     * Gets the adresse value for this OlietanksAnmaerkningData.
     * 
     * @return adresse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData getAdresse() {
        return adresse;
    }


    /**
     * Sets the adresse value for this OlietanksAnmaerkningData.
     * 
     * @param adresse
     */
    public void setAdresse(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse) {
        this.adresse = adresse;
    }


    /**
     * Gets the aarsagsKode value for this OlietanksAnmaerkningData.
     * 
     * @return aarsagsKode
     */
    public java.lang.String getAarsagsKode() {
        return aarsagsKode;
    }


    /**
     * Sets the aarsagsKode value for this OlietanksAnmaerkningData.
     * 
     * @param aarsagsKode
     */
    public void setAarsagsKode(java.lang.String aarsagsKode) {
        this.aarsagsKode = aarsagsKode;
    }


    /**
     * Gets the bemaerkning value for this OlietanksAnmaerkningData.
     * 
     * @return bemaerkning
     */
    public java.lang.String getBemaerkning() {
        return bemaerkning;
    }


    /**
     * Sets the bemaerkning value for this OlietanksAnmaerkningData.
     * 
     * @param bemaerkning
     */
    public void setBemaerkning(java.lang.String bemaerkning) {
        this.bemaerkning = bemaerkning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OlietanksAnmaerkningData)) return false;
        OlietanksAnmaerkningData other = (OlietanksAnmaerkningData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adresse==null && other.getAdresse()==null) || 
             (this.adresse!=null &&
              this.adresse.equals(other.getAdresse()))) &&
            ((this.aarsagsKode==null && other.getAarsagsKode()==null) || 
             (this.aarsagsKode!=null &&
              this.aarsagsKode.equals(other.getAarsagsKode()))) &&
            ((this.bemaerkning==null && other.getBemaerkning()==null) || 
             (this.bemaerkning!=null &&
              this.bemaerkning.equals(other.getBemaerkning())));
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
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
        }
        if (getAarsagsKode() != null) {
            _hashCode += getAarsagsKode().hashCode();
        }
        if (getBemaerkning() != null) {
            _hashCode += getBemaerkning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OlietanksAnmaerkningData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "OlietanksAnmaerkningData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Adresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aarsagsKode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AarsagsKode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bemaerkning");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Bemaerkning"));
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
