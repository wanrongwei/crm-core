/**
 * ObservationItemData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class ObservationItemData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationDataField[] anmærkningsData;

    private java.lang.String kode;  // attribute

    private java.lang.String beskrivelse;  // attribute

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public ObservationItemData() {
    }

    public ObservationItemData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String kode,
           java.lang.String beskrivelse,
           java.lang.String beskedId,
           java.lang.String beskedType,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationDataField[] anmærkningsData) {
        super(
            error);
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.beskedId = beskedId;
        this.beskedType = beskedType;
        this.anmærkningsData = anmærkningsData;
    }


    /**
     * Gets the anmærkningsData value for this ObservationItemData.
     * 
     * @return anmærkningsData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationDataField[] getAnmærkningsData() {
        return anmærkningsData;
    }


    /**
     * Sets the anmærkningsData value for this ObservationItemData.
     * 
     * @param anmærkningsData
     */
    public void setAnmærkningsData(com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationDataField[] anmærkningsData) {
        this.anmærkningsData = anmærkningsData;
    }


    /**
     * Gets the kode value for this ObservationItemData.
     * 
     * @return kode
     */
    public java.lang.String getKode() {
        return kode;
    }


    /**
     * Sets the kode value for this ObservationItemData.
     * 
     * @param kode
     */
    public void setKode(java.lang.String kode) {
        this.kode = kode;
    }


    /**
     * Gets the beskrivelse value for this ObservationItemData.
     * 
     * @return beskrivelse
     */
    public java.lang.String getBeskrivelse() {
        return beskrivelse;
    }


    /**
     * Sets the beskrivelse value for this ObservationItemData.
     * 
     * @param beskrivelse
     */
    public void setBeskrivelse(java.lang.String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }


    /**
     * Gets the beskedId value for this ObservationItemData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this ObservationItemData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this ObservationItemData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this ObservationItemData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObservationItemData)) return false;
        ObservationItemData other = (ObservationItemData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.anmærkningsData==null && other.getAnmærkningsData()==null) || 
             (this.anmærkningsData!=null &&
              java.util.Arrays.equals(this.anmærkningsData, other.getAnmærkningsData()))) &&
            ((this.kode==null && other.getKode()==null) || 
             (this.kode!=null &&
              this.kode.equals(other.getKode()))) &&
            ((this.beskrivelse==null && other.getBeskrivelse()==null) || 
             (this.beskrivelse!=null &&
              this.beskrivelse.equals(other.getBeskrivelse()))) &&
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
        if (getAnmærkningsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnmærkningsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnmærkningsData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKode() != null) {
            _hashCode += getKode().hashCode();
        }
        if (getBeskrivelse() != null) {
            _hashCode += getBeskrivelse().hashCode();
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
        new org.apache.axis.description.TypeDesc(ObservationItemData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationItemData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("kode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "kode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskrivelse");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Beskrivelse"));
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
        elemField.setFieldName("anmærkningsData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AnmærkningsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationDataField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "dataLinie"));
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
