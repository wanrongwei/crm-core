/**
 * StatistikData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class StatistikData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String antalTilmeldte;

    private java.lang.String antalMedAnmaerkninger;

    private java.lang.String antalAnmaerkningerIalt;

    private java.lang.String statistikOk;  // attribute

    private java.lang.String transactionId;  // attribute

    public StatistikData() {
    }

    public StatistikData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String statistikOk,
           java.lang.String transactionId,
           java.lang.String antalTilmeldte,
           java.lang.String antalMedAnmaerkninger,
           java.lang.String antalAnmaerkningerIalt) {
        super(
            error);
        this.statistikOk = statistikOk;
        this.transactionId = transactionId;
        this.antalTilmeldte = antalTilmeldte;
        this.antalMedAnmaerkninger = antalMedAnmaerkninger;
        this.antalAnmaerkningerIalt = antalAnmaerkningerIalt;
    }


    /**
     * Gets the antalTilmeldte value for this StatistikData.
     * 
     * @return antalTilmeldte
     */
    public java.lang.String getAntalTilmeldte() {
        return antalTilmeldte;
    }


    /**
     * Sets the antalTilmeldte value for this StatistikData.
     * 
     * @param antalTilmeldte
     */
    public void setAntalTilmeldte(java.lang.String antalTilmeldte) {
        this.antalTilmeldte = antalTilmeldte;
    }


    /**
     * Gets the antalMedAnmaerkninger value for this StatistikData.
     * 
     * @return antalMedAnmaerkninger
     */
    public java.lang.String getAntalMedAnmaerkninger() {
        return antalMedAnmaerkninger;
    }


    /**
     * Sets the antalMedAnmaerkninger value for this StatistikData.
     * 
     * @param antalMedAnmaerkninger
     */
    public void setAntalMedAnmaerkninger(java.lang.String antalMedAnmaerkninger) {
        this.antalMedAnmaerkninger = antalMedAnmaerkninger;
    }


    /**
     * Gets the antalAnmaerkningerIalt value for this StatistikData.
     * 
     * @return antalAnmaerkningerIalt
     */
    public java.lang.String getAntalAnmaerkningerIalt() {
        return antalAnmaerkningerIalt;
    }


    /**
     * Sets the antalAnmaerkningerIalt value for this StatistikData.
     * 
     * @param antalAnmaerkningerIalt
     */
    public void setAntalAnmaerkningerIalt(java.lang.String antalAnmaerkningerIalt) {
        this.antalAnmaerkningerIalt = antalAnmaerkningerIalt;
    }


    /**
     * Gets the statistikOk value for this StatistikData.
     * 
     * @return statistikOk
     */
    public java.lang.String getStatistikOk() {
        return statistikOk;
    }


    /**
     * Sets the statistikOk value for this StatistikData.
     * 
     * @param statistikOk
     */
    public void setStatistikOk(java.lang.String statistikOk) {
        this.statistikOk = statistikOk;
    }


    /**
     * Gets the transactionId value for this StatistikData.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this StatistikData.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatistikData)) return false;
        StatistikData other = (StatistikData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.antalTilmeldte==null && other.getAntalTilmeldte()==null) || 
             (this.antalTilmeldte!=null &&
              this.antalTilmeldte.equals(other.getAntalTilmeldte()))) &&
            ((this.antalMedAnmaerkninger==null && other.getAntalMedAnmaerkninger()==null) || 
             (this.antalMedAnmaerkninger!=null &&
              this.antalMedAnmaerkninger.equals(other.getAntalMedAnmaerkninger()))) &&
            ((this.antalAnmaerkningerIalt==null && other.getAntalAnmaerkningerIalt()==null) || 
             (this.antalAnmaerkningerIalt!=null &&
              this.antalAnmaerkningerIalt.equals(other.getAntalAnmaerkningerIalt()))) &&
            ((this.statistikOk==null && other.getStatistikOk()==null) || 
             (this.statistikOk!=null &&
              this.statistikOk.equals(other.getStatistikOk()))) &&
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
        if (getAntalTilmeldte() != null) {
            _hashCode += getAntalTilmeldte().hashCode();
        }
        if (getAntalMedAnmaerkninger() != null) {
            _hashCode += getAntalMedAnmaerkninger().hashCode();
        }
        if (getAntalAnmaerkningerIalt() != null) {
            _hashCode += getAntalAnmaerkningerIalt().hashCode();
        }
        if (getStatistikOk() != null) {
            _hashCode += getStatistikOk().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatistikData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "StatistikData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("statistikOk");
        attrField.setXmlName(new javax.xml.namespace.QName("", "statistikOk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antalTilmeldte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AntalTilmeldte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antalMedAnmaerkninger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AntalMedAnmaerkninger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antalAnmaerkningerIalt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AntalAnmaerkningerIalt"));
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
