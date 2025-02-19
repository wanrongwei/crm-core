/**
 * FirmaNavnData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class FirmaNavnData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData  implements java.io.Serializable {
    private java.lang.String firma;

    private java.lang.String afdeling;

    public FirmaNavnData() {
    }

    public FirmaNavnData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String beskyttetFra,
           java.lang.String beskyttet,
           java.lang.String navn,
           java.lang.String firma,
           java.lang.String afdeling) {
        super(
            error,
            beskyttetFra,
            beskyttet,
            navn);
        this.firma = firma;
        this.afdeling = afdeling;
    }


    /**
     * Gets the firma value for this FirmaNavnData.
     * 
     * @return firma
     */
    public java.lang.String getFirma() {
        return firma;
    }


    /**
     * Sets the firma value for this FirmaNavnData.
     * 
     * @param firma
     */
    public void setFirma(java.lang.String firma) {
        this.firma = firma;
    }


    /**
     * Gets the afdeling value for this FirmaNavnData.
     * 
     * @return afdeling
     */
    public java.lang.String getAfdeling() {
        return afdeling;
    }


    /**
     * Sets the afdeling value for this FirmaNavnData.
     * 
     * @param afdeling
     */
    public void setAfdeling(java.lang.String afdeling) {
        this.afdeling = afdeling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirmaNavnData)) return false;
        FirmaNavnData other = (FirmaNavnData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firma==null && other.getFirma()==null) || 
             (this.firma!=null &&
              this.firma.equals(other.getFirma()))) &&
            ((this.afdeling==null && other.getAfdeling()==null) || 
             (this.afdeling!=null &&
              this.afdeling.equals(other.getAfdeling())));
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
        if (getFirma() != null) {
            _hashCode += getFirma().hashCode();
        }
        if (getAfdeling() != null) {
            _hashCode += getAfdeling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirmaNavnData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaNavnData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firma");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Firma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afdeling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Afdeling"));
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
