/**
 * FirmaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class FirmaData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData  implements java.io.Serializable {
    private java.lang.String KOBstatus;

    private java.lang.String cvrNr;

    private java.lang.String kobNr;

    private java.lang.String seNr;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData emvPerson;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.BrancheGruppeNACE hovedBranche;

    public FirmaData() {
    }

    public FirmaData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String kreditorNr,
           java.lang.String debitorNr,
           java.lang.String stamkortNr,
           java.lang.String experianID,
           com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData navnedata,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse,
           java.lang.String telefonNr,
           java.lang.String faxNr,
           java.lang.String KOBstatus,
           java.lang.String cvrNr,
           java.lang.String kobNr,
           java.lang.String seNr,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData emvPerson,
           com.asiainfo.crm.inter.exe.webservice.client.rki.BrancheGruppeNACE hovedBranche) {
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
        this.KOBstatus = KOBstatus;
        this.cvrNr = cvrNr;
        this.kobNr = kobNr;
        this.seNr = seNr;
        this.emvPerson = emvPerson;
        this.hovedBranche = hovedBranche;
    }


    /**
     * Gets the KOBstatus value for this FirmaData.
     * 
     * @return KOBstatus
     */
    public java.lang.String getKOBstatus() {
        return KOBstatus;
    }


    /**
     * Sets the KOBstatus value for this FirmaData.
     * 
     * @param KOBstatus
     */
    public void setKOBstatus(java.lang.String KOBstatus) {
        this.KOBstatus = KOBstatus;
    }


    /**
     * Gets the cvrNr value for this FirmaData.
     * 
     * @return cvrNr
     */
    public java.lang.String getCvrNr() {
        return cvrNr;
    }


    /**
     * Sets the cvrNr value for this FirmaData.
     * 
     * @param cvrNr
     */
    public void setCvrNr(java.lang.String cvrNr) {
        this.cvrNr = cvrNr;
    }


    /**
     * Gets the kobNr value for this FirmaData.
     * 
     * @return kobNr
     */
    public java.lang.String getKobNr() {
        return kobNr;
    }


    /**
     * Sets the kobNr value for this FirmaData.
     * 
     * @param kobNr
     */
    public void setKobNr(java.lang.String kobNr) {
        this.kobNr = kobNr;
    }


    /**
     * Gets the seNr value for this FirmaData.
     * 
     * @return seNr
     */
    public java.lang.String getSeNr() {
        return seNr;
    }


    /**
     * Sets the seNr value for this FirmaData.
     * 
     * @param seNr
     */
    public void setSeNr(java.lang.String seNr) {
        this.seNr = seNr;
    }


    /**
     * Gets the emvPerson value for this FirmaData.
     * 
     * @return emvPerson
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData getEmvPerson() {
        return emvPerson;
    }


    /**
     * Sets the emvPerson value for this FirmaData.
     * 
     * @param emvPerson
     */
    public void setEmvPerson(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData emvPerson) {
        this.emvPerson = emvPerson;
    }


    /**
     * Gets the hovedBranche value for this FirmaData.
     * 
     * @return hovedBranche
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.BrancheGruppeNACE getHovedBranche() {
        return hovedBranche;
    }


    /**
     * Sets the hovedBranche value for this FirmaData.
     * 
     * @param hovedBranche
     */
    public void setHovedBranche(com.asiainfo.crm.inter.exe.webservice.client.rki.BrancheGruppeNACE hovedBranche) {
        this.hovedBranche = hovedBranche;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirmaData)) return false;
        FirmaData other = (FirmaData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.KOBstatus==null && other.getKOBstatus()==null) || 
             (this.KOBstatus!=null &&
              this.KOBstatus.equals(other.getKOBstatus()))) &&
            ((this.cvrNr==null && other.getCvrNr()==null) || 
             (this.cvrNr!=null &&
              this.cvrNr.equals(other.getCvrNr()))) &&
            ((this.kobNr==null && other.getKobNr()==null) || 
             (this.kobNr!=null &&
              this.kobNr.equals(other.getKobNr()))) &&
            ((this.seNr==null && other.getSeNr()==null) || 
             (this.seNr!=null &&
              this.seNr.equals(other.getSeNr()))) &&
            ((this.emvPerson==null && other.getEmvPerson()==null) || 
             (this.emvPerson!=null &&
              this.emvPerson.equals(other.getEmvPerson()))) &&
            ((this.hovedBranche==null && other.getHovedBranche()==null) || 
             (this.hovedBranche!=null &&
              this.hovedBranche.equals(other.getHovedBranche())));
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
        if (getKOBstatus() != null) {
            _hashCode += getKOBstatus().hashCode();
        }
        if (getCvrNr() != null) {
            _hashCode += getCvrNr().hashCode();
        }
        if (getKobNr() != null) {
            _hashCode += getKobNr().hashCode();
        }
        if (getSeNr() != null) {
            _hashCode += getSeNr().hashCode();
        }
        if (getEmvPerson() != null) {
            _hashCode += getEmvPerson().hashCode();
        }
        if (getHovedBranche() != null) {
            _hashCode += getHovedBranche().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirmaData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KOBstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "KOBstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvrNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "CvrNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kobNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "KobNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "SeNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "EmvPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hovedBranche");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "HovedBranche"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "BrancheGruppeNACE"));
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
