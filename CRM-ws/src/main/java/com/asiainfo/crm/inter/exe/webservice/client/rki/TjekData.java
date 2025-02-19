/**
 * TjekData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class TjekData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData firmaData;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData personData;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData registrering;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData advarsel;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData;

    private java.lang.String referenceNummer;  // attribute

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public TjekData() {
    }

    public TjekData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String referenceNummer,
           java.lang.String beskedId,
           java.lang.String beskedType,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData firmaData,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData personData,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse,
           com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData registrering,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData advarsel,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData) {
        super(
            error);
        this.referenceNummer = referenceNummer;
        this.beskedId = beskedId;
        this.beskedType = beskedType;
        this.firmaData = firmaData;
        this.personData = personData;
        this.adresse = adresse;
        this.registrering = registrering;
        this.advarsel = advarsel;
        this.scoreData = scoreData;
    }


    /**
     * Gets the firmaData value for this TjekData.
     * 
     * @return firmaData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData getFirmaData() {
        return firmaData;
    }


    /**
     * Sets the firmaData value for this TjekData.
     * 
     * @param firmaData
     */
    public void setFirmaData(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData firmaData) {
        this.firmaData = firmaData;
    }


    /**
     * Gets the personData value for this TjekData.
     * 
     * @return personData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData getPersonData() {
        return personData;
    }


    /**
     * Sets the personData value for this TjekData.
     * 
     * @param personData
     */
    public void setPersonData(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData personData) {
        this.personData = personData;
    }


    /**
     * Gets the adresse value for this TjekData.
     * 
     * @return adresse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData getAdresse() {
        return adresse;
    }


    /**
     * Sets the adresse value for this TjekData.
     * 
     * @param adresse
     */
    public void setAdresse(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse) {
        this.adresse = adresse;
    }


    /**
     * Gets the registrering value for this TjekData.
     * 
     * @return registrering
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData getRegistrering() {
        return registrering;
    }


    /**
     * Sets the registrering value for this TjekData.
     * 
     * @param registrering
     */
    public void setRegistrering(com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData registrering) {
        this.registrering = registrering;
    }


    /**
     * Gets the advarsel value for this TjekData.
     * 
     * @return advarsel
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData getAdvarsel() {
        return advarsel;
    }


    /**
     * Sets the advarsel value for this TjekData.
     * 
     * @param advarsel
     */
    public void setAdvarsel(com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData advarsel) {
        this.advarsel = advarsel;
    }


    /**
     * Gets the scoreData value for this TjekData.
     * 
     * @return scoreData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData getScoreData() {
        return scoreData;
    }


    /**
     * Sets the scoreData value for this TjekData.
     * 
     * @param scoreData
     */
    public void setScoreData(com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData) {
        this.scoreData = scoreData;
    }


    /**
     * Gets the referenceNummer value for this TjekData.
     * 
     * @return referenceNummer
     */
    public java.lang.String getReferenceNummer() {
        return referenceNummer;
    }


    /**
     * Sets the referenceNummer value for this TjekData.
     * 
     * @param referenceNummer
     */
    public void setReferenceNummer(java.lang.String referenceNummer) {
        this.referenceNummer = referenceNummer;
    }


    /**
     * Gets the beskedId value for this TjekData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this TjekData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this TjekData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this TjekData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TjekData)) return false;
        TjekData other = (TjekData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firmaData==null && other.getFirmaData()==null) || 
             (this.firmaData!=null &&
              this.firmaData.equals(other.getFirmaData()))) &&
            ((this.personData==null && other.getPersonData()==null) || 
             (this.personData!=null &&
              this.personData.equals(other.getPersonData()))) &&
            ((this.adresse==null && other.getAdresse()==null) || 
             (this.adresse!=null &&
              this.adresse.equals(other.getAdresse()))) &&
            ((this.registrering==null && other.getRegistrering()==null) || 
             (this.registrering!=null &&
              this.registrering.equals(other.getRegistrering()))) &&
            ((this.advarsel==null && other.getAdvarsel()==null) || 
             (this.advarsel!=null &&
              this.advarsel.equals(other.getAdvarsel()))) &&
            ((this.scoreData==null && other.getScoreData()==null) || 
             (this.scoreData!=null &&
              this.scoreData.equals(other.getScoreData()))) &&
            ((this.referenceNummer==null && other.getReferenceNummer()==null) || 
             (this.referenceNummer!=null &&
              this.referenceNummer.equals(other.getReferenceNummer()))) &&
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
        if (getFirmaData() != null) {
            _hashCode += getFirmaData().hashCode();
        }
        if (getPersonData() != null) {
            _hashCode += getPersonData().hashCode();
        }
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
        }
        if (getRegistrering() != null) {
            _hashCode += getRegistrering().hashCode();
        }
        if (getAdvarsel() != null) {
            _hashCode += getAdvarsel().hashCode();
        }
        if (getScoreData() != null) {
            _hashCode += getScoreData().hashCode();
        }
        if (getReferenceNummer() != null) {
            _hashCode += getReferenceNummer().hashCode();
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
        new org.apache.axis.description.TypeDesc(TjekData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "TjekData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("referenceNummer");
        attrField.setXmlName(new javax.xml.namespace.QName("", "referenceNummer"));
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
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Adresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Registrering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "BetalingsAnmaerkningData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advarsel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Advarsel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsAnmaerkningData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "ScoreData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ScoreData"));
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
