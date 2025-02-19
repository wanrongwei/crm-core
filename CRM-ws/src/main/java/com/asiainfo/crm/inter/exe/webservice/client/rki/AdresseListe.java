/**
 * AdresseListe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class AdresseListe  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData[] adresseListe;

    private java.lang.String statusKode;

    private java.lang.String codeMoniker;

    public AdresseListe() {
    }

    public AdresseListe(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData[] adresseListe,
           java.lang.String statusKode,
           java.lang.String codeMoniker) {
        super(
            error);
        this.adresseListe = adresseListe;
        this.statusKode = statusKode;
        this.codeMoniker = codeMoniker;
    }


    /**
     * Gets the adresseListe value for this AdresseListe.
     * 
     * @return adresseListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData[] getAdresseListe() {
        return adresseListe;
    }


    /**
     * Sets the adresseListe value for this AdresseListe.
     * 
     * @param adresseListe
     */
    public void setAdresseListe(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData[] adresseListe) {
        this.adresseListe = adresseListe;
    }


    /**
     * Gets the statusKode value for this AdresseListe.
     * 
     * @return statusKode
     */
    public java.lang.String getStatusKode() {
        return statusKode;
    }


    /**
     * Sets the statusKode value for this AdresseListe.
     * 
     * @param statusKode
     */
    public void setStatusKode(java.lang.String statusKode) {
        this.statusKode = statusKode;
    }


    /**
     * Gets the codeMoniker value for this AdresseListe.
     * 
     * @return codeMoniker
     */
    public java.lang.String getCodeMoniker() {
        return codeMoniker;
    }


    /**
     * Sets the codeMoniker value for this AdresseListe.
     * 
     * @param codeMoniker
     */
    public void setCodeMoniker(java.lang.String codeMoniker) {
        this.codeMoniker = codeMoniker;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdresseListe)) return false;
        AdresseListe other = (AdresseListe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adresseListe==null && other.getAdresseListe()==null) || 
             (this.adresseListe!=null &&
              java.util.Arrays.equals(this.adresseListe, other.getAdresseListe()))) &&
            ((this.statusKode==null && other.getStatusKode()==null) || 
             (this.statusKode!=null &&
              this.statusKode.equals(other.getStatusKode()))) &&
            ((this.codeMoniker==null && other.getCodeMoniker()==null) || 
             (this.codeMoniker!=null &&
              this.codeMoniker.equals(other.getCodeMoniker())));
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
        if (getAdresseListe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdresseListe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdresseListe(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusKode() != null) {
            _hashCode += getStatusKode().hashCode();
        }
        if (getCodeMoniker() != null) {
            _hashCode += getCodeMoniker().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdresseListe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseListe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresseListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "Adresse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusKode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "StatusKode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMoniker");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "CodeMoniker"));
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
