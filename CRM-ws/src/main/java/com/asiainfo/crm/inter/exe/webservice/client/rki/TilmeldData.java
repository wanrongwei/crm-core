/**
 * TilmeldData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class TilmeldData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData cvrNummer;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData juridiskVirksomhedsform;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData selskabsKapital;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData risikogruppe;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData ejerforhold;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData anmærkninger;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData firmaRegistreringData;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData personRegistreringData;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresseListe;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe firmaListe;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonListe personListe;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData;

    private java.lang.String tilmeldOk;  // attribute

    private java.lang.String referenceNummer;  // attribute

    private java.lang.String transactionId;  // attribute

    public TilmeldData() {
    }

    public TilmeldData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String tilmeldOk,
           java.lang.String referenceNummer,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData cvrNummer,
           com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData juridiskVirksomhedsform,
           com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData selskabsKapital,
           com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData risikogruppe,
           com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData ejerforhold,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData anmærkninger,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData firmaRegistreringData,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData personRegistreringData,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresseListe,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe firmaListe,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonListe personListe,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData) {
        super(
            error);
        this.tilmeldOk = tilmeldOk;
        this.referenceNummer = referenceNummer;
        this.transactionId = transactionId;
        this.cvrNummer = cvrNummer;
        this.juridiskVirksomhedsform = juridiskVirksomhedsform;
        this.selskabsKapital = selskabsKapital;
        this.risikogruppe = risikogruppe;
        this.ejerforhold = ejerforhold;
        this.anmærkninger = anmærkninger;
        this.firmaRegistreringData = firmaRegistreringData;
        this.personRegistreringData = personRegistreringData;
        this.adresseListe = adresseListe;
        this.firmaListe = firmaListe;
        this.personListe = personListe;
        this.scoreData = scoreData;
    }


    /**
     * Gets the cvrNummer value for this TilmeldData.
     * 
     * @return cvrNummer
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData getCvrNummer() {
        return cvrNummer;
    }


    /**
     * Sets the cvrNummer value for this TilmeldData.
     * 
     * @param cvrNummer
     */
    public void setCvrNummer(com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData cvrNummer) {
        this.cvrNummer = cvrNummer;
    }


    /**
     * Gets the juridiskVirksomhedsform value for this TilmeldData.
     * 
     * @return juridiskVirksomhedsform
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData getJuridiskVirksomhedsform() {
        return juridiskVirksomhedsform;
    }


    /**
     * Sets the juridiskVirksomhedsform value for this TilmeldData.
     * 
     * @param juridiskVirksomhedsform
     */
    public void setJuridiskVirksomhedsform(com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData juridiskVirksomhedsform) {
        this.juridiskVirksomhedsform = juridiskVirksomhedsform;
    }


    /**
     * Gets the selskabsKapital value for this TilmeldData.
     * 
     * @return selskabsKapital
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData getSelskabsKapital() {
        return selskabsKapital;
    }


    /**
     * Sets the selskabsKapital value for this TilmeldData.
     * 
     * @param selskabsKapital
     */
    public void setSelskabsKapital(com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData selskabsKapital) {
        this.selskabsKapital = selskabsKapital;
    }


    /**
     * Gets the risikogruppe value for this TilmeldData.
     * 
     * @return risikogruppe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData getRisikogruppe() {
        return risikogruppe;
    }


    /**
     * Sets the risikogruppe value for this TilmeldData.
     * 
     * @param risikogruppe
     */
    public void setRisikogruppe(com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData risikogruppe) {
        this.risikogruppe = risikogruppe;
    }


    /**
     * Gets the ejerforhold value for this TilmeldData.
     * 
     * @return ejerforhold
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData getEjerforhold() {
        return ejerforhold;
    }


    /**
     * Sets the ejerforhold value for this TilmeldData.
     * 
     * @param ejerforhold
     */
    public void setEjerforhold(com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData ejerforhold) {
        this.ejerforhold = ejerforhold;
    }


    /**
     * Gets the anmærkninger value for this TilmeldData.
     * 
     * @return anmærkninger
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData getAnmærkninger() {
        return anmærkninger;
    }


    /**
     * Sets the anmærkninger value for this TilmeldData.
     * 
     * @param anmærkninger
     */
    public void setAnmærkninger(com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData anmærkninger) {
        this.anmærkninger = anmærkninger;
    }


    /**
     * Gets the firmaRegistreringData value for this TilmeldData.
     * 
     * @return firmaRegistreringData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData getFirmaRegistreringData() {
        return firmaRegistreringData;
    }


    /**
     * Sets the firmaRegistreringData value for this TilmeldData.
     * 
     * @param firmaRegistreringData
     */
    public void setFirmaRegistreringData(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData firmaRegistreringData) {
        this.firmaRegistreringData = firmaRegistreringData;
    }


    /**
     * Gets the personRegistreringData value for this TilmeldData.
     * 
     * @return personRegistreringData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData getPersonRegistreringData() {
        return personRegistreringData;
    }


    /**
     * Sets the personRegistreringData value for this TilmeldData.
     * 
     * @param personRegistreringData
     */
    public void setPersonRegistreringData(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData personRegistreringData) {
        this.personRegistreringData = personRegistreringData;
    }


    /**
     * Gets the adresseListe value for this TilmeldData.
     * 
     * @return adresseListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe getAdresseListe() {
        return adresseListe;
    }


    /**
     * Sets the adresseListe value for this TilmeldData.
     * 
     * @param adresseListe
     */
    public void setAdresseListe(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresseListe) {
        this.adresseListe = adresseListe;
    }


    /**
     * Gets the firmaListe value for this TilmeldData.
     * 
     * @return firmaListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe getFirmaListe() {
        return firmaListe;
    }


    /**
     * Sets the firmaListe value for this TilmeldData.
     * 
     * @param firmaListe
     */
    public void setFirmaListe(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe firmaListe) {
        this.firmaListe = firmaListe;
    }


    /**
     * Gets the personListe value for this TilmeldData.
     * 
     * @return personListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonListe getPersonListe() {
        return personListe;
    }


    /**
     * Sets the personListe value for this TilmeldData.
     * 
     * @param personListe
     */
    public void setPersonListe(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonListe personListe) {
        this.personListe = personListe;
    }


    /**
     * Gets the scoreData value for this TilmeldData.
     * 
     * @return scoreData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData getScoreData() {
        return scoreData;
    }


    /**
     * Sets the scoreData value for this TilmeldData.
     * 
     * @param scoreData
     */
    public void setScoreData(com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData) {
        this.scoreData = scoreData;
    }


    /**
     * Gets the tilmeldOk value for this TilmeldData.
     * 
     * @return tilmeldOk
     */
    public java.lang.String getTilmeldOk() {
        return tilmeldOk;
    }


    /**
     * Sets the tilmeldOk value for this TilmeldData.
     * 
     * @param tilmeldOk
     */
    public void setTilmeldOk(java.lang.String tilmeldOk) {
        this.tilmeldOk = tilmeldOk;
    }


    /**
     * Gets the referenceNummer value for this TilmeldData.
     * 
     * @return referenceNummer
     */
    public java.lang.String getReferenceNummer() {
        return referenceNummer;
    }


    /**
     * Sets the referenceNummer value for this TilmeldData.
     * 
     * @param referenceNummer
     */
    public void setReferenceNummer(java.lang.String referenceNummer) {
        this.referenceNummer = referenceNummer;
    }


    /**
     * Gets the transactionId value for this TilmeldData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TilmeldData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TilmeldData)) return false;
        TilmeldData other = (TilmeldData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cvrNummer==null && other.getCvrNummer()==null) || 
             (this.cvrNummer!=null &&
              this.cvrNummer.equals(other.getCvrNummer()))) &&
            ((this.juridiskVirksomhedsform==null && other.getJuridiskVirksomhedsform()==null) || 
             (this.juridiskVirksomhedsform!=null &&
              this.juridiskVirksomhedsform.equals(other.getJuridiskVirksomhedsform()))) &&
            ((this.selskabsKapital==null && other.getSelskabsKapital()==null) || 
             (this.selskabsKapital!=null &&
              this.selskabsKapital.equals(other.getSelskabsKapital()))) &&
            ((this.risikogruppe==null && other.getRisikogruppe()==null) || 
             (this.risikogruppe!=null &&
              this.risikogruppe.equals(other.getRisikogruppe()))) &&
            ((this.ejerforhold==null && other.getEjerforhold()==null) || 
             (this.ejerforhold!=null &&
              this.ejerforhold.equals(other.getEjerforhold()))) &&
            ((this.anmærkninger==null && other.getAnmærkninger()==null) || 
             (this.anmærkninger!=null &&
              this.anmærkninger.equals(other.getAnmærkninger()))) &&
            ((this.firmaRegistreringData==null && other.getFirmaRegistreringData()==null) || 
             (this.firmaRegistreringData!=null &&
              this.firmaRegistreringData.equals(other.getFirmaRegistreringData()))) &&
            ((this.personRegistreringData==null && other.getPersonRegistreringData()==null) || 
             (this.personRegistreringData!=null &&
              this.personRegistreringData.equals(other.getPersonRegistreringData()))) &&
            ((this.adresseListe==null && other.getAdresseListe()==null) || 
             (this.adresseListe!=null &&
              this.adresseListe.equals(other.getAdresseListe()))) &&
            ((this.firmaListe==null && other.getFirmaListe()==null) || 
             (this.firmaListe!=null &&
              this.firmaListe.equals(other.getFirmaListe()))) &&
            ((this.personListe==null && other.getPersonListe()==null) || 
             (this.personListe!=null &&
              this.personListe.equals(other.getPersonListe()))) &&
            ((this.scoreData==null && other.getScoreData()==null) || 
             (this.scoreData!=null &&
              this.scoreData.equals(other.getScoreData()))) &&
            ((this.tilmeldOk==null && other.getTilmeldOk()==null) || 
             (this.tilmeldOk!=null &&
              this.tilmeldOk.equals(other.getTilmeldOk()))) &&
            ((this.referenceNummer==null && other.getReferenceNummer()==null) || 
             (this.referenceNummer!=null &&
              this.referenceNummer.equals(other.getReferenceNummer()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getCvrNummer() != null) {
            _hashCode += getCvrNummer().hashCode();
        }
        if (getJuridiskVirksomhedsform() != null) {
            _hashCode += getJuridiskVirksomhedsform().hashCode();
        }
        if (getSelskabsKapital() != null) {
            _hashCode += getSelskabsKapital().hashCode();
        }
        if (getRisikogruppe() != null) {
            _hashCode += getRisikogruppe().hashCode();
        }
        if (getEjerforhold() != null) {
            _hashCode += getEjerforhold().hashCode();
        }
        if (getAnmærkninger() != null) {
            _hashCode += getAnmærkninger().hashCode();
        }
        if (getFirmaRegistreringData() != null) {
            _hashCode += getFirmaRegistreringData().hashCode();
        }
        if (getPersonRegistreringData() != null) {
            _hashCode += getPersonRegistreringData().hashCode();
        }
        if (getAdresseListe() != null) {
            _hashCode += getAdresseListe().hashCode();
        }
        if (getFirmaListe() != null) {
            _hashCode += getFirmaListe().hashCode();
        }
        if (getPersonListe() != null) {
            _hashCode += getPersonListe().hashCode();
        }
        if (getScoreData() != null) {
            _hashCode += getScoreData().hashCode();
        }
        if (getTilmeldOk() != null) {
            _hashCode += getTilmeldOk().hashCode();
        }
        if (getReferenceNummer() != null) {
            _hashCode += getReferenceNummer().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TilmeldData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tilmeldOk");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tilmeldOk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("referenceNummer");
        attrField.setXmlName(new javax.xml.namespace.QName("", "referenceNummer"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvrNummer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "CvrNummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "CvrNumberData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juridiskVirksomhedsform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "JuridiskVirksomhedsform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "BusinessTypeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selskabsKapital");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "SelskabsKapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "CompanyCapitalData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risikogruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Risikogruppe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "RiskGroupData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ejerforhold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Ejerforhold"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anmærkninger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Anmærkninger"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationsData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaRegistreringData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personRegistreringData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonRegistreringData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonRegistreringData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonListe"));
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
