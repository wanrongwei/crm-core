/**
 * HentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class HentData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData cvrNummer;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData juridiskVirksomhedsform;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData selskabsKapital;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData risikogruppe;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData ejerforhold;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData anmærkninger;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData person;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringAdvarselData personAdvarsel;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData firma;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringAdvarselData firmaAdvarsel;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData;

    private java.lang.String hentOk;  // attribute

    private java.lang.String oprettetDato;  // attribute

    private java.lang.String referenceNummer;  // attribute

    private java.lang.String transactionId;  // attribute

    public HentData() {
    }

    public HentData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String hentOk,
           java.lang.String oprettetDato,
           java.lang.String referenceNummer,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData cvrNummer,
           com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData juridiskVirksomhedsform,
           com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData selskabsKapital,
           com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData risikogruppe,
           com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData ejerforhold,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData anmærkninger,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData person,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringAdvarselData personAdvarsel,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData firma,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringAdvarselData firmaAdvarsel,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData) {
        super(
            error);
        this.hentOk = hentOk;
        this.oprettetDato = oprettetDato;
        this.referenceNummer = referenceNummer;
        this.transactionId = transactionId;
        this.cvrNummer = cvrNummer;
        this.juridiskVirksomhedsform = juridiskVirksomhedsform;
        this.selskabsKapital = selskabsKapital;
        this.risikogruppe = risikogruppe;
        this.ejerforhold = ejerforhold;
        this.anmærkninger = anmærkninger;
        this.person = person;
        this.personAdvarsel = personAdvarsel;
        this.firma = firma;
        this.firmaAdvarsel = firmaAdvarsel;
        this.scoreData = scoreData;
    }


    /**
     * Gets the cvrNummer value for this HentData.
     * 
     * @return cvrNummer
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData getCvrNummer() {
        return cvrNummer;
    }


    /**
     * Sets the cvrNummer value for this HentData.
     * 
     * @param cvrNummer
     */
    public void setCvrNummer(com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData cvrNummer) {
        this.cvrNummer = cvrNummer;
    }


    /**
     * Gets the juridiskVirksomhedsform value for this HentData.
     * 
     * @return juridiskVirksomhedsform
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData getJuridiskVirksomhedsform() {
        return juridiskVirksomhedsform;
    }


    /**
     * Sets the juridiskVirksomhedsform value for this HentData.
     * 
     * @param juridiskVirksomhedsform
     */
    public void setJuridiskVirksomhedsform(com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData juridiskVirksomhedsform) {
        this.juridiskVirksomhedsform = juridiskVirksomhedsform;
    }


    /**
     * Gets the selskabsKapital value for this HentData.
     * 
     * @return selskabsKapital
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData getSelskabsKapital() {
        return selskabsKapital;
    }


    /**
     * Sets the selskabsKapital value for this HentData.
     * 
     * @param selskabsKapital
     */
    public void setSelskabsKapital(com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData selskabsKapital) {
        this.selskabsKapital = selskabsKapital;
    }


    /**
     * Gets the risikogruppe value for this HentData.
     * 
     * @return risikogruppe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData getRisikogruppe() {
        return risikogruppe;
    }


    /**
     * Sets the risikogruppe value for this HentData.
     * 
     * @param risikogruppe
     */
    public void setRisikogruppe(com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData risikogruppe) {
        this.risikogruppe = risikogruppe;
    }


    /**
     * Gets the ejerforhold value for this HentData.
     * 
     * @return ejerforhold
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData getEjerforhold() {
        return ejerforhold;
    }


    /**
     * Sets the ejerforhold value for this HentData.
     * 
     * @param ejerforhold
     */
    public void setEjerforhold(com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData ejerforhold) {
        this.ejerforhold = ejerforhold;
    }


    /**
     * Gets the anmærkninger value for this HentData.
     * 
     * @return anmærkninger
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData getAnmærkninger() {
        return anmærkninger;
    }


    /**
     * Sets the anmærkninger value for this HentData.
     * 
     * @param anmærkninger
     */
    public void setAnmærkninger(com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData anmærkninger) {
        this.anmærkninger = anmærkninger;
    }


    /**
     * Gets the person value for this HentData.
     * 
     * @return person
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData getPerson() {
        return person;
    }


    /**
     * Sets the person value for this HentData.
     * 
     * @param person
     */
    public void setPerson(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData person) {
        this.person = person;
    }


    /**
     * Gets the personAdvarsel value for this HentData.
     * 
     * @return personAdvarsel
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringAdvarselData getPersonAdvarsel() {
        return personAdvarsel;
    }


    /**
     * Sets the personAdvarsel value for this HentData.
     * 
     * @param personAdvarsel
     */
    public void setPersonAdvarsel(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringAdvarselData personAdvarsel) {
        this.personAdvarsel = personAdvarsel;
    }


    /**
     * Gets the firma value for this HentData.
     * 
     * @return firma
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData getFirma() {
        return firma;
    }


    /**
     * Sets the firma value for this HentData.
     * 
     * @param firma
     */
    public void setFirma(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData firma) {
        this.firma = firma;
    }


    /**
     * Gets the firmaAdvarsel value for this HentData.
     * 
     * @return firmaAdvarsel
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringAdvarselData getFirmaAdvarsel() {
        return firmaAdvarsel;
    }


    /**
     * Sets the firmaAdvarsel value for this HentData.
     * 
     * @param firmaAdvarsel
     */
    public void setFirmaAdvarsel(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringAdvarselData firmaAdvarsel) {
        this.firmaAdvarsel = firmaAdvarsel;
    }


    /**
     * Gets the scoreData value for this HentData.
     * 
     * @return scoreData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData getScoreData() {
        return scoreData;
    }


    /**
     * Sets the scoreData value for this HentData.
     * 
     * @param scoreData
     */
    public void setScoreData(com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData scoreData) {
        this.scoreData = scoreData;
    }


    /**
     * Gets the hentOk value for this HentData.
     * 
     * @return hentOk
     */
    public java.lang.String getHentOk() {
        return hentOk;
    }


    /**
     * Sets the hentOk value for this HentData.
     * 
     * @param hentOk
     */
    public void setHentOk(java.lang.String hentOk) {
        this.hentOk = hentOk;
    }


    /**
     * Gets the oprettetDato value for this HentData.
     * 
     * @return oprettetDato
     */
    public java.lang.String getOprettetDato() {
        return oprettetDato;
    }


    /**
     * Sets the oprettetDato value for this HentData.
     * 
     * @param oprettetDato
     */
    public void setOprettetDato(java.lang.String oprettetDato) {
        this.oprettetDato = oprettetDato;
    }


    /**
     * Gets the referenceNummer value for this HentData.
     * 
     * @return referenceNummer
     */
    public java.lang.String getReferenceNummer() {
        return referenceNummer;
    }


    /**
     * Sets the referenceNummer value for this HentData.
     * 
     * @param referenceNummer
     */
    public void setReferenceNummer(java.lang.String referenceNummer) {
        this.referenceNummer = referenceNummer;
    }


    /**
     * Gets the transactionId value for this HentData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this HentData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HentData)) return false;
        HentData other = (HentData) obj;
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
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.personAdvarsel==null && other.getPersonAdvarsel()==null) || 
             (this.personAdvarsel!=null &&
              this.personAdvarsel.equals(other.getPersonAdvarsel()))) &&
            ((this.firma==null && other.getFirma()==null) || 
             (this.firma!=null &&
              this.firma.equals(other.getFirma()))) &&
            ((this.firmaAdvarsel==null && other.getFirmaAdvarsel()==null) || 
             (this.firmaAdvarsel!=null &&
              this.firmaAdvarsel.equals(other.getFirmaAdvarsel()))) &&
            ((this.scoreData==null && other.getScoreData()==null) || 
             (this.scoreData!=null &&
              this.scoreData.equals(other.getScoreData()))) &&
            ((this.hentOk==null && other.getHentOk()==null) || 
             (this.hentOk!=null &&
              this.hentOk.equals(other.getHentOk()))) &&
            ((this.oprettetDato==null && other.getOprettetDato()==null) || 
             (this.oprettetDato!=null &&
              this.oprettetDato.equals(other.getOprettetDato()))) &&
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getPersonAdvarsel() != null) {
            _hashCode += getPersonAdvarsel().hashCode();
        }
        if (getFirma() != null) {
            _hashCode += getFirma().hashCode();
        }
        if (getFirmaAdvarsel() != null) {
            _hashCode += getFirmaAdvarsel().hashCode();
        }
        if (getScoreData() != null) {
            _hashCode += getScoreData().hashCode();
        }
        if (getHentOk() != null) {
            _hashCode += getHentOk().hashCode();
        }
        if (getOprettetDato() != null) {
            _hashCode += getOprettetDato().hashCode();
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
        new org.apache.axis.description.TypeDesc(HentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "HentData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hentOk");
        attrField.setXmlName(new javax.xml.namespace.QName("", "hentOk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("oprettetDato");
        attrField.setXmlName(new javax.xml.namespace.QName("", "oprettetDato"));
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
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Person"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonRegistreringData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personAdvarsel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonAdvarsel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonRegistreringAdvarselData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firma");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Firma"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmaAdvarsel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaAdvarsel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringAdvarselData"));
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
