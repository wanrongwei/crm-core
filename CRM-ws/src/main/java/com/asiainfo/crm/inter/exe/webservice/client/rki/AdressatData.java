/**
 * AdressatData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class AdressatData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData navnedata;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse;

    private java.lang.String telefonNr;

    private java.lang.String faxNr;

    private java.lang.String kreditorNr;  // attribute

    private java.lang.String debitorNr;  // attribute

    private java.lang.String stamkortNr;  // attribute

    private java.lang.String experianID;  // attribute

    public AdressatData() {
    }

    public AdressatData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String kreditorNr,
           java.lang.String debitorNr,
           java.lang.String stamkortNr,
           java.lang.String experianID,
           com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData navnedata,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse,
           java.lang.String telefonNr,
           java.lang.String faxNr) {
        super(
            error);
        this.kreditorNr = kreditorNr;
        this.debitorNr = debitorNr;
        this.stamkortNr = stamkortNr;
        this.experianID = experianID;
        this.navnedata = navnedata;
        this.adresse = adresse;
        this.telefonNr = telefonNr;
        this.faxNr = faxNr;
    }


    /**
     * Gets the navnedata value for this AdressatData.
     * 
     * @return navnedata
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData getNavnedata() {
        return navnedata;
    }


    /**
     * Sets the navnedata value for this AdressatData.
     * 
     * @param navnedata
     */
    public void setNavnedata(com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData navnedata) {
        this.navnedata = navnedata;
    }


    /**
     * Gets the adresse value for this AdressatData.
     * 
     * @return adresse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData getAdresse() {
        return adresse;
    }


    /**
     * Sets the adresse value for this AdressatData.
     * 
     * @param adresse
     */
    public void setAdresse(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse) {
        this.adresse = adresse;
    }


    /**
     * Gets the telefonNr value for this AdressatData.
     * 
     * @return telefonNr
     */
    public java.lang.String getTelefonNr() {
        return telefonNr;
    }


    /**
     * Sets the telefonNr value for this AdressatData.
     * 
     * @param telefonNr
     */
    public void setTelefonNr(java.lang.String telefonNr) {
        this.telefonNr = telefonNr;
    }


    /**
     * Gets the faxNr value for this AdressatData.
     * 
     * @return faxNr
     */
    public java.lang.String getFaxNr() {
        return faxNr;
    }


    /**
     * Sets the faxNr value for this AdressatData.
     * 
     * @param faxNr
     */
    public void setFaxNr(java.lang.String faxNr) {
        this.faxNr = faxNr;
    }


    /**
     * Gets the kreditorNr value for this AdressatData.
     * 
     * @return kreditorNr
     */
    public java.lang.String getKreditorNr() {
        return kreditorNr;
    }


    /**
     * Sets the kreditorNr value for this AdressatData.
     * 
     * @param kreditorNr
     */
    public void setKreditorNr(java.lang.String kreditorNr) {
        this.kreditorNr = kreditorNr;
    }


    /**
     * Gets the debitorNr value for this AdressatData.
     * 
     * @return debitorNr
     */
    public java.lang.String getDebitorNr() {
        return debitorNr;
    }


    /**
     * Sets the debitorNr value for this AdressatData.
     * 
     * @param debitorNr
     */
    public void setDebitorNr(java.lang.String debitorNr) {
        this.debitorNr = debitorNr;
    }


    /**
     * Gets the stamkortNr value for this AdressatData.
     * 
     * @return stamkortNr
     */
    public java.lang.String getStamkortNr() {
        return stamkortNr;
    }


    /**
     * Sets the stamkortNr value for this AdressatData.
     * 
     * @param stamkortNr
     */
    public void setStamkortNr(java.lang.String stamkortNr) {
        this.stamkortNr = stamkortNr;
    }


    /**
     * Gets the experianID value for this AdressatData.
     * 
     * @return experianID
     */
    public java.lang.String getExperianID() {
        return experianID;
    }


    /**
     * Sets the experianID value for this AdressatData.
     * 
     * @param experianID
     */
    public void setExperianID(java.lang.String experianID) {
        this.experianID = experianID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdressatData)) return false;
        AdressatData other = (AdressatData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.navnedata==null && other.getNavnedata()==null) || 
             (this.navnedata!=null &&
              this.navnedata.equals(other.getNavnedata()))) &&
            ((this.adresse==null && other.getAdresse()==null) || 
             (this.adresse!=null &&
              this.adresse.equals(other.getAdresse()))) &&
            ((this.telefonNr==null && other.getTelefonNr()==null) || 
             (this.telefonNr!=null &&
              this.telefonNr.equals(other.getTelefonNr()))) &&
            ((this.faxNr==null && other.getFaxNr()==null) || 
             (this.faxNr!=null &&
              this.faxNr.equals(other.getFaxNr()))) &&
            ((this.kreditorNr==null && other.getKreditorNr()==null) || 
             (this.kreditorNr!=null &&
              this.kreditorNr.equals(other.getKreditorNr()))) &&
            ((this.debitorNr==null && other.getDebitorNr()==null) || 
             (this.debitorNr!=null &&
              this.debitorNr.equals(other.getDebitorNr()))) &&
            ((this.stamkortNr==null && other.getStamkortNr()==null) || 
             (this.stamkortNr!=null &&
              this.stamkortNr.equals(other.getStamkortNr()))) &&
            ((this.experianID==null && other.getExperianID()==null) || 
             (this.experianID!=null &&
              this.experianID.equals(other.getExperianID())));
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
        if (getNavnedata() != null) {
            _hashCode += getNavnedata().hashCode();
        }
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
        }
        if (getTelefonNr() != null) {
            _hashCode += getTelefonNr().hashCode();
        }
        if (getFaxNr() != null) {
            _hashCode += getFaxNr().hashCode();
        }
        if (getKreditorNr() != null) {
            _hashCode += getKreditorNr().hashCode();
        }
        if (getDebitorNr() != null) {
            _hashCode += getDebitorNr().hashCode();
        }
        if (getStamkortNr() != null) {
            _hashCode += getStamkortNr().hashCode();
        }
        if (getExperianID() != null) {
            _hashCode += getExperianID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdressatData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("kreditorNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "kreditorNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("debitorNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "debitorNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stamkortNr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "stamkortNr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("experianID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExperianID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navnedata");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Navnedata"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "NavnData"));
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
        elemField.setFieldName("telefonNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "TelefonNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "FaxNr"));
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
