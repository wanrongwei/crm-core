/**
 * VaergeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class VaergeData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData  implements java.io.Serializable {
    private java.lang.String vaergeStartDato;

    public VaergeData() {
    }

    public VaergeData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String kreditorNr,
           java.lang.String debitorNr,
           java.lang.String stamkortNr,
           java.lang.String experianID,
           com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData navnedata,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData adresse,
           java.lang.String telefonNr,
           java.lang.String faxNr,
           java.lang.String vaergeStartDato) {
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
        this.vaergeStartDato = vaergeStartDato;
    }


    /**
     * Gets the vaergeStartDato value for this VaergeData.
     * 
     * @return vaergeStartDato
     */
    public java.lang.String getVaergeStartDato() {
        return vaergeStartDato;
    }


    /**
     * Sets the vaergeStartDato value for this VaergeData.
     * 
     * @param vaergeStartDato
     */
    public void setVaergeStartDato(java.lang.String vaergeStartDato) {
        this.vaergeStartDato = vaergeStartDato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VaergeData)) return false;
        VaergeData other = (VaergeData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vaergeStartDato==null && other.getVaergeStartDato()==null) || 
             (this.vaergeStartDato!=null &&
              this.vaergeStartDato.equals(other.getVaergeStartDato())));
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
        if (getVaergeStartDato() != null) {
            _hashCode += getVaergeStartDato().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VaergeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "VaergeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaergeStartDato");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "VaergeStartDato"));
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
