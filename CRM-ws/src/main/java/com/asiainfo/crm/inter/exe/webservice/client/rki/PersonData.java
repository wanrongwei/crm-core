/**
 * PersonData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class PersonData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData  implements java.io.Serializable {
    private java.lang.String foedselsdato;

    private java.lang.String cprStatus;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData emvFirma;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.VaergeData vaerge;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.Kreditadvarsel kreditadvarsel;

    public PersonData() {
    }

    public PersonData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String kreditorNr,
           java.lang.String debitorNr,
           java.lang.String stamkortNr,
           java.lang.String experianID,
           com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData navnedata,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse,
           java.lang.String telefonNr,
           java.lang.String faxNr,
           java.lang.String foedselsdato,
           java.lang.String cprStatus,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData emvFirma,
           com.asiainfo.crm.inter.exe.webservice.client.rki.VaergeData vaerge,
           com.asiainfo.crm.inter.exe.webservice.client.rki.Kreditadvarsel kreditadvarsel) {
        super(
            error,
            kreditorNr,
            debitorNr,
            stamkortNr,
            experianID,
            navnedata,
            adresse,
            telefonNr,
            faxNr);
        this.foedselsdato = foedselsdato;
        this.cprStatus = cprStatus;
        this.emvFirma = emvFirma;
        this.vaerge = vaerge;
        this.kreditadvarsel = kreditadvarsel;
    }


    /**
     * Gets the foedselsdato value for this PersonData.
     * 
     * @return foedselsdato
     */
    public java.lang.String getFoedselsdato() {
        return foedselsdato;
    }


    /**
     * Sets the foedselsdato value for this PersonData.
     * 
     * @param foedselsdato
     */
    public void setFoedselsdato(java.lang.String foedselsdato) {
        this.foedselsdato = foedselsdato;
    }


    /**
     * Gets the cprStatus value for this PersonData.
     * 
     * @return cprStatus
     */
    public java.lang.String getCprStatus() {
        return cprStatus;
    }


    /**
     * Sets the cprStatus value for this PersonData.
     * 
     * @param cprStatus
     */
    public void setCprStatus(java.lang.String cprStatus) {
        this.cprStatus = cprStatus;
    }


    /**
     * Gets the emvFirma value for this PersonData.
     * 
     * @return emvFirma
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData getEmvFirma() {
        return emvFirma;
    }


    /**
     * Sets the emvFirma value for this PersonData.
     * 
     * @param emvFirma
     */
    public void setEmvFirma(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData emvFirma) {
        this.emvFirma = emvFirma;
    }


    /**
     * Gets the vaerge value for this PersonData.
     * 
     * @return vaerge
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.VaergeData getVaerge() {
        return vaerge;
    }


    /**
     * Sets the vaerge value for this PersonData.
     * 
     * @param vaerge
     */
    public void setVaerge(com.asiainfo.crm.inter.exe.webservice.client.rki.VaergeData vaerge) {
        this.vaerge = vaerge;
    }


    /**
     * Gets the kreditadvarsel value for this PersonData.
     * 
     * @return kreditadvarsel
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.Kreditadvarsel getKreditadvarsel() {
        return kreditadvarsel;
    }


    /**
     * Sets the kreditadvarsel value for this PersonData.
     * 
     * @param kreditadvarsel
     */
    public void setKreditadvarsel(com.asiainfo.crm.inter.exe.webservice.client.rki.Kreditadvarsel kreditadvarsel) {
        this.kreditadvarsel = kreditadvarsel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonData)) return false;
        PersonData other = (PersonData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.foedselsdato==null && other.getFoedselsdato()==null) || 
             (this.foedselsdato!=null &&
              this.foedselsdato.equals(other.getFoedselsdato()))) &&
            ((this.cprStatus==null && other.getCprStatus()==null) || 
             (this.cprStatus!=null &&
              this.cprStatus.equals(other.getCprStatus()))) &&
            ((this.emvFirma==null && other.getEmvFirma()==null) || 
             (this.emvFirma!=null &&
              this.emvFirma.equals(other.getEmvFirma()))) &&
            ((this.vaerge==null && other.getVaerge()==null) || 
             (this.vaerge!=null &&
              this.vaerge.equals(other.getVaerge()))) &&
            ((this.kreditadvarsel==null && other.getKreditadvarsel()==null) || 
             (this.kreditadvarsel!=null &&
              this.kreditadvarsel.equals(other.getKreditadvarsel())));
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
        if (getFoedselsdato() != null) {
            _hashCode += getFoedselsdato().hashCode();
        }
        if (getCprStatus() != null) {
            _hashCode += getCprStatus().hashCode();
        }
        if (getEmvFirma() != null) {
            _hashCode += getEmvFirma().hashCode();
        }
        if (getVaerge() != null) {
            _hashCode += getVaerge().hashCode();
        }
        if (getKreditadvarsel() != null) {
            _hashCode += getKreditadvarsel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foedselsdato");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Foedselsdato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cprStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "CprStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "EmvFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaerge");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Vaerge"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "VaergeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kreditadvarsel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Kreditadvarsel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "Kreditadvarsel"));
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
