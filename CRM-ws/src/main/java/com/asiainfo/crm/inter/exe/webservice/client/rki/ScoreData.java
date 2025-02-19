/**
 * ScoreData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class ScoreData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String type;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData subjekt;

    private java.lang.String vaerdi;

    private java.lang.String scoreKalibreret;

    private java.lang.String scoreRaa;

    private java.lang.String minimumVaerdi;

    private java.lang.String maksimumVaerdi;

    private java.lang.String gruppe;

    private java.lang.String gruppeNavn;

    private java.lang.String beskrivelse;

    private java.lang.String anbefaling;

    private java.lang.String scorekort_version;  // attribute

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public ScoreData() {
    }

    public ScoreData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String scorekort_version,
           java.lang.String beskedId,
           java.lang.String beskedType,
           java.lang.String type,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData subjekt,
           java.lang.String vaerdi,
           java.lang.String scoreKalibreret,
           java.lang.String scoreRaa,
           java.lang.String minimumVaerdi,
           java.lang.String maksimumVaerdi,
           java.lang.String gruppe,
           java.lang.String gruppeNavn,
           java.lang.String beskrivelse,
           java.lang.String anbefaling) {
        super(
            error);
        this.scorekort_version = scorekort_version;
        this.beskedId = beskedId;
        this.beskedType = beskedType;
        this.type = type;
        this.subjekt = subjekt;
        this.vaerdi = vaerdi;
        this.scoreKalibreret = scoreKalibreret;
        this.scoreRaa = scoreRaa;
        this.minimumVaerdi = minimumVaerdi;
        this.maksimumVaerdi = maksimumVaerdi;
        this.gruppe = gruppe;
        this.gruppeNavn = gruppeNavn;
        this.beskrivelse = beskrivelse;
        this.anbefaling = anbefaling;
    }


    /**
     * Gets the type value for this ScoreData.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ScoreData.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the subjekt value for this ScoreData.
     * 
     * @return subjekt
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData getSubjekt() {
        return subjekt;
    }


    /**
     * Sets the subjekt value for this ScoreData.
     * 
     * @param subjekt
     */
    public void setSubjekt(com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData subjekt) {
        this.subjekt = subjekt;
    }


    /**
     * Gets the vaerdi value for this ScoreData.
     * 
     * @return vaerdi
     */
    public java.lang.String getVaerdi() {
        return vaerdi;
    }


    /**
     * Sets the vaerdi value for this ScoreData.
     * 
     * @param vaerdi
     */
    public void setVaerdi(java.lang.String vaerdi) {
        this.vaerdi = vaerdi;
    }


    /**
     * Gets the scoreKalibreret value for this ScoreData.
     * 
     * @return scoreKalibreret
     */
    public java.lang.String getScoreKalibreret() {
        return scoreKalibreret;
    }


    /**
     * Sets the scoreKalibreret value for this ScoreData.
     * 
     * @param scoreKalibreret
     */
    public void setScoreKalibreret(java.lang.String scoreKalibreret) {
        this.scoreKalibreret = scoreKalibreret;
    }


    /**
     * Gets the scoreRaa value for this ScoreData.
     * 
     * @return scoreRaa
     */
    public java.lang.String getScoreRaa() {
        return scoreRaa;
    }


    /**
     * Sets the scoreRaa value for this ScoreData.
     * 
     * @param scoreRaa
     */
    public void setScoreRaa(java.lang.String scoreRaa) {
        this.scoreRaa = scoreRaa;
    }


    /**
     * Gets the minimumVaerdi value for this ScoreData.
     * 
     * @return minimumVaerdi
     */
    public java.lang.String getMinimumVaerdi() {
        return minimumVaerdi;
    }


    /**
     * Sets the minimumVaerdi value for this ScoreData.
     * 
     * @param minimumVaerdi
     */
    public void setMinimumVaerdi(java.lang.String minimumVaerdi) {
        this.minimumVaerdi = minimumVaerdi;
    }


    /**
     * Gets the maksimumVaerdi value for this ScoreData.
     * 
     * @return maksimumVaerdi
     */
    public java.lang.String getMaksimumVaerdi() {
        return maksimumVaerdi;
    }


    /**
     * Sets the maksimumVaerdi value for this ScoreData.
     * 
     * @param maksimumVaerdi
     */
    public void setMaksimumVaerdi(java.lang.String maksimumVaerdi) {
        this.maksimumVaerdi = maksimumVaerdi;
    }


    /**
     * Gets the gruppe value for this ScoreData.
     * 
     * @return gruppe
     */
    public java.lang.String getGruppe() {
        return gruppe;
    }


    /**
     * Sets the gruppe value for this ScoreData.
     * 
     * @param gruppe
     */
    public void setGruppe(java.lang.String gruppe) {
        this.gruppe = gruppe;
    }


    /**
     * Gets the gruppeNavn value for this ScoreData.
     * 
     * @return gruppeNavn
     */
    public java.lang.String getGruppeNavn() {
        return gruppeNavn;
    }


    /**
     * Sets the gruppeNavn value for this ScoreData.
     * 
     * @param gruppeNavn
     */
    public void setGruppeNavn(java.lang.String gruppeNavn) {
        this.gruppeNavn = gruppeNavn;
    }


    /**
     * Gets the beskrivelse value for this ScoreData.
     * 
     * @return beskrivelse
     */
    public java.lang.String getBeskrivelse() {
        return beskrivelse;
    }


    /**
     * Sets the beskrivelse value for this ScoreData.
     * 
     * @param beskrivelse
     */
    public void setBeskrivelse(java.lang.String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }


    /**
     * Gets the anbefaling value for this ScoreData.
     * 
     * @return anbefaling
     */
    public java.lang.String getAnbefaling() {
        return anbefaling;
    }


    /**
     * Sets the anbefaling value for this ScoreData.
     * 
     * @param anbefaling
     */
    public void setAnbefaling(java.lang.String anbefaling) {
        this.anbefaling = anbefaling;
    }


    /**
     * Gets the scorekort_version value for this ScoreData.
     * 
     * @return scorekort_version
     */
    public java.lang.String getScorekort_version() {
        return scorekort_version;
    }


    /**
     * Sets the scorekort_version value for this ScoreData.
     * 
     * @param scorekort_version
     */
    public void setScorekort_version(java.lang.String scorekort_version) {
        this.scorekort_version = scorekort_version;
    }


    /**
     * Gets the beskedId value for this ScoreData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this ScoreData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this ScoreData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this ScoreData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScoreData)) return false;
        ScoreData other = (ScoreData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.subjekt==null && other.getSubjekt()==null) || 
             (this.subjekt!=null &&
              this.subjekt.equals(other.getSubjekt()))) &&
            ((this.vaerdi==null && other.getVaerdi()==null) || 
             (this.vaerdi!=null &&
              this.vaerdi.equals(other.getVaerdi()))) &&
            ((this.scoreKalibreret==null && other.getScoreKalibreret()==null) || 
             (this.scoreKalibreret!=null &&
              this.scoreKalibreret.equals(other.getScoreKalibreret()))) &&
            ((this.scoreRaa==null && other.getScoreRaa()==null) || 
             (this.scoreRaa!=null &&
              this.scoreRaa.equals(other.getScoreRaa()))) &&
            ((this.minimumVaerdi==null && other.getMinimumVaerdi()==null) || 
             (this.minimumVaerdi!=null &&
              this.minimumVaerdi.equals(other.getMinimumVaerdi()))) &&
            ((this.maksimumVaerdi==null && other.getMaksimumVaerdi()==null) || 
             (this.maksimumVaerdi!=null &&
              this.maksimumVaerdi.equals(other.getMaksimumVaerdi()))) &&
            ((this.gruppe==null && other.getGruppe()==null) || 
             (this.gruppe!=null &&
              this.gruppe.equals(other.getGruppe()))) &&
            ((this.gruppeNavn==null && other.getGruppeNavn()==null) || 
             (this.gruppeNavn!=null &&
              this.gruppeNavn.equals(other.getGruppeNavn()))) &&
            ((this.beskrivelse==null && other.getBeskrivelse()==null) || 
             (this.beskrivelse!=null &&
              this.beskrivelse.equals(other.getBeskrivelse()))) &&
            ((this.anbefaling==null && other.getAnbefaling()==null) || 
             (this.anbefaling!=null &&
              this.anbefaling.equals(other.getAnbefaling()))) &&
            ((this.scorekort_version==null && other.getScorekort_version()==null) || 
             (this.scorekort_version!=null &&
              this.scorekort_version.equals(other.getScorekort_version()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSubjekt() != null) {
            _hashCode += getSubjekt().hashCode();
        }
        if (getVaerdi() != null) {
            _hashCode += getVaerdi().hashCode();
        }
        if (getScoreKalibreret() != null) {
            _hashCode += getScoreKalibreret().hashCode();
        }
        if (getScoreRaa() != null) {
            _hashCode += getScoreRaa().hashCode();
        }
        if (getMinimumVaerdi() != null) {
            _hashCode += getMinimumVaerdi().hashCode();
        }
        if (getMaksimumVaerdi() != null) {
            _hashCode += getMaksimumVaerdi().hashCode();
        }
        if (getGruppe() != null) {
            _hashCode += getGruppe().hashCode();
        }
        if (getGruppeNavn() != null) {
            _hashCode += getGruppeNavn().hashCode();
        }
        if (getBeskrivelse() != null) {
            _hashCode += getBeskrivelse().hashCode();
        }
        if (getAnbefaling() != null) {
            _hashCode += getAnbefaling().hashCode();
        }
        if (getScorekort_version() != null) {
            _hashCode += getScorekort_version().hashCode();
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
        new org.apache.axis.description.TypeDesc(ScoreData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ScoreData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("scorekort_version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "scorekort_version"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjekt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Subjekt"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaerdi");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Vaerdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreKalibreret");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "ScoreKalibreret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scoreRaa");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "ScoreRaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumVaerdi");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "MinimumVaerdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maksimumVaerdi");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "MaksimumVaerdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Gruppe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gruppeNavn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "GruppeNavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beskrivelse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Beskrivelse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anbefaling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Anbefaling"));
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
