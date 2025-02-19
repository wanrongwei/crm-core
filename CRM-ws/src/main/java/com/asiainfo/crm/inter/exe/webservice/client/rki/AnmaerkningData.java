/**
 * AnmaerkningData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public abstract class AnmaerkningData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData debitor;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData kreditor;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData administrator;

    private java.lang.String videregivelsesDato;

    private java.lang.String indberettetDato;

    private java.lang.String slettetDato;

    private java.lang.String fordringsBeloeb;

    private java.lang.String kreditorsRefNr;

    private java.lang.String administratorsRefNr;

    private java.lang.String fundament;

    private java.lang.String beloeb;

    private java.lang.String registreringBemaerkning;

    private java.lang.String registreringStatus;

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public AnmaerkningData() {
    }

    public AnmaerkningData(
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
           java.lang.String registreringStatus) {
        super(
            error);
        this.beskedId = beskedId;
        this.beskedType = beskedType;
        this.debitor = debitor;
        this.kreditor = kreditor;
        this.administrator = administrator;
        this.videregivelsesDato = videregivelsesDato;
        this.indberettetDato = indberettetDato;
        this.slettetDato = slettetDato;
        this.fordringsBeloeb = fordringsBeloeb;
        this.kreditorsRefNr = kreditorsRefNr;
        this.administratorsRefNr = administratorsRefNr;
        this.fundament = fundament;
        this.beloeb = beloeb;
        this.registreringBemaerkning = registreringBemaerkning;
        this.registreringStatus = registreringStatus;
    }


    /**
     * Gets the debitor value for this AnmaerkningData.
     * 
     * @return debitor
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData getDebitor() {
        return debitor;
    }


    /**
     * Sets the debitor value for this AnmaerkningData.
     * 
     * @param debitor
     */
    public void setDebitor(com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData debitor) {
        this.debitor = debitor;
    }


    /**
     * Gets the kreditor value for this AnmaerkningData.
     * 
     * @return kreditor
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData getKreditor() {
        return kreditor;
    }


    /**
     * Sets the kreditor value for this AnmaerkningData.
     * 
     * @param kreditor
     */
    public void setKreditor(com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData kreditor) {
        this.kreditor = kreditor;
    }


    /**
     * Gets the administrator value for this AnmaerkningData.
     * 
     * @return administrator
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData getAdministrator() {
        return administrator;
    }


    /**
     * Sets the administrator value for this AnmaerkningData.
     * 
     * @param administrator
     */
    public void setAdministrator(com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData administrator) {
        this.administrator = administrator;
    }


    /**
     * Gets the videregivelsesDato value for this AnmaerkningData.
     * 
     * @return videregivelsesDato
     */
    public java.lang.String getVideregivelsesDato() {
        return videregivelsesDato;
    }


    /**
     * Sets the videregivelsesDato value for this AnmaerkningData.
     * 
     * @param videregivelsesDato
     */
    public void setVideregivelsesDato(java.lang.String videregivelsesDato) {
        this.videregivelsesDato = videregivelsesDato;
    }


    /**
     * Gets the indberettetDato value for this AnmaerkningData.
     * 
     * @return indberettetDato
     */
    public java.lang.String getIndberettetDato() {
        return indberettetDato;
    }


    /**
     * Sets the indberettetDato value for this AnmaerkningData.
     * 
     * @param indberettetDato
     */
    public void setIndberettetDato(java.lang.String indberettetDato) {
        this.indberettetDato = indberettetDato;
    }


    /**
     * Gets the slettetDato value for this AnmaerkningData.
     * 
     * @return slettetDato
     */
    public java.lang.String getSlettetDato() {
        return slettetDato;
    }


    /**
     * Sets the slettetDato value for this AnmaerkningData.
     * 
     * @param slettetDato
     */
    public void setSlettetDato(java.lang.String slettetDato) {
        this.slettetDato = slettetDato;
    }


    /**
     * Gets the fordringsBeloeb value for this AnmaerkningData.
     * 
     * @return fordringsBeloeb
     */
    public java.lang.String getFordringsBeloeb() {
        return fordringsBeloeb;
    }


    /**
     * Sets the fordringsBeloeb value for this AnmaerkningData.
     * 
     * @param fordringsBeloeb
     */
    public void setFordringsBeloeb(java.lang.String fordringsBeloeb) {
        this.fordringsBeloeb = fordringsBeloeb;
    }


    /**
     * Gets the kreditorsRefNr value for this AnmaerkningData.
     * 
     * @return kreditorsRefNr
     */
    public java.lang.String getKreditorsRefNr() {
        return kreditorsRefNr;
    }


    /**
     * Sets the kreditorsRefNr value for this AnmaerkningData.
     * 
     * @param kreditorsRefNr
     */
    public void setKreditorsRefNr(java.lang.String kreditorsRefNr) {
        this.kreditorsRefNr = kreditorsRefNr;
    }


    /**
     * Gets the administratorsRefNr value for this AnmaerkningData.
     * 
     * @return administratorsRefNr
     */
    public java.lang.String getAdministratorsRefNr() {
        return administratorsRefNr;
    }


    /**
     * Sets the administratorsRefNr value for this AnmaerkningData.
     * 
     * @param administratorsRefNr
     */
    public void setAdministratorsRefNr(java.lang.String administratorsRefNr) {
        this.administratorsRefNr = administratorsRefNr;
    }


    /**
     * Gets the fundament value for this AnmaerkningData.
     * 
     * @return fundament
     */
    public java.lang.String getFundament() {
        return fundament;
    }


    /**
     * Sets the fundament value for this AnmaerkningData.
     * 
     * @param fundament
     */
    public void setFundament(java.lang.String fundament) {
        this.fundament = fundament;
    }


    /**
     * Gets the beloeb value for this AnmaerkningData.
     * 
     * @return beloeb
     */
    public java.lang.String getBeloeb() {
        return beloeb;
    }


    /**
     * Sets the beloeb value for this AnmaerkningData.
     * 
     * @param beloeb
     */
    public void setBeloeb(java.lang.String beloeb) {
        this.beloeb = beloeb;
    }


    /**
     * Gets the registreringBemaerkning value for this AnmaerkningData.
     * 
     * @return registreringBemaerkning
     */
    public java.lang.String getRegistreringBemaerkning() {
        return registreringBemaerkning;
    }


    /**
     * Sets the registreringBemaerkning value for this AnmaerkningData.
     * 
     * @param registreringBemaerkning
     */
    public void setRegistreringBemaerkning(java.lang.String registreringBemaerkning) {
        this.registreringBemaerkning = registreringBemaerkning;
    }


    /**
     * Gets the registreringStatus value for this AnmaerkningData.
     * 
     * @return registreringStatus
     */
    public java.lang.String getRegistreringStatus() {
        return registreringStatus;
    }


    /**
     * Sets the registreringStatus value for this AnmaerkningData.
     * 
     * @param registreringStatus
     */
    public void setRegistreringStatus(java.lang.String registreringStatus) {
        this.registreringStatus = registreringStatus;
    }


    /**
     * Gets the beskedId value for this AnmaerkningData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this AnmaerkningData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this AnmaerkningData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this AnmaerkningData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnmaerkningData)) return false;
        AnmaerkningData other = (AnmaerkningData) obj;
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
            ((this.kreditor==null && other.getKreditor()==null) || 
             (this.kreditor!=null &&
              this.kreditor.equals(other.getKreditor()))) &&
            ((this.administrator==null && other.getAdministrator()==null) || 
             (this.administrator!=null &&
              this.administrator.equals(other.getAdministrator()))) &&
            ((this.videregivelsesDato==null && other.getVideregivelsesDato()==null) || 
             (this.videregivelsesDato!=null &&
              this.videregivelsesDato.equals(other.getVideregivelsesDato()))) &&
            ((this.indberettetDato==null && other.getIndberettetDato()==null) || 
             (this.indberettetDato!=null &&
              this.indberettetDato.equals(other.getIndberettetDato()))) &&
            ((this.slettetDato==null && other.getSlettetDato()==null) || 
             (this.slettetDato!=null &&
              this.slettetDato.equals(other.getSlettetDato()))) &&
            ((this.fordringsBeloeb==null && other.getFordringsBeloeb()==null) || 
             (this.fordringsBeloeb!=null &&
              this.fordringsBeloeb.equals(other.getFordringsBeloeb()))) &&
            ((this.kreditorsRefNr==null && other.getKreditorsRefNr()==null) || 
             (this.kreditorsRefNr!=null &&
              this.kreditorsRefNr.equals(other.getKreditorsRefNr()))) &&
            ((this.administratorsRefNr==null && other.getAdministratorsRefNr()==null) || 
             (this.administratorsRefNr!=null &&
              this.administratorsRefNr.equals(other.getAdministratorsRefNr()))) &&
            ((this.fundament==null && other.getFundament()==null) || 
             (this.fundament!=null &&
              this.fundament.equals(other.getFundament()))) &&
            ((this.beloeb==null && other.getBeloeb()==null) || 
             (this.beloeb!=null &&
              this.beloeb.equals(other.getBeloeb()))) &&
            ((this.registreringBemaerkning==null && other.getRegistreringBemaerkning()==null) || 
             (this.registreringBemaerkning!=null &&
              this.registreringBemaerkning.equals(other.getRegistreringBemaerkning()))) &&
            ((this.registreringStatus==null && other.getRegistreringStatus()==null) || 
             (this.registreringStatus!=null &&
              this.registreringStatus.equals(other.getRegistreringStatus()))) &&
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
        if (getDebitor() != null) {
            _hashCode += getDebitor().hashCode();
        }
        if (getKreditor() != null) {
            _hashCode += getKreditor().hashCode();
        }
        if (getAdministrator() != null) {
            _hashCode += getAdministrator().hashCode();
        }
        if (getVideregivelsesDato() != null) {
            _hashCode += getVideregivelsesDato().hashCode();
        }
        if (getIndberettetDato() != null) {
            _hashCode += getIndberettetDato().hashCode();
        }
        if (getSlettetDato() != null) {
            _hashCode += getSlettetDato().hashCode();
        }
        if (getFordringsBeloeb() != null) {
            _hashCode += getFordringsBeloeb().hashCode();
        }
        if (getKreditorsRefNr() != null) {
            _hashCode += getKreditorsRefNr().hashCode();
        }
        if (getAdministratorsRefNr() != null) {
            _hashCode += getAdministratorsRefNr().hashCode();
        }
        if (getFundament() != null) {
            _hashCode += getFundament().hashCode();
        }
        if (getBeloeb() != null) {
            _hashCode += getBeloeb().hashCode();
        }
        if (getRegistreringBemaerkning() != null) {
            _hashCode += getRegistreringBemaerkning().hashCode();
        }
        if (getRegistreringStatus() != null) {
            _hashCode += getRegistreringStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(AnmaerkningData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AnmaerkningData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
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
        elemField.setFieldName("debitor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Debitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kreditor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Kreditor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Administrator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videregivelsesDato");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "VideregivelsesDato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indberettetDato");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "IndberettetDato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slettetDato");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "SlettetDato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fordringsBeloeb");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "FordringsBeloeb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kreditorsRefNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "KreditorsRefNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administratorsRefNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdministratorsRefNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundament");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Fundament"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beloeb");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Beloeb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreringBemaerkning");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "RegistreringBemaerkning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreringStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "RegistreringStatus"));
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
