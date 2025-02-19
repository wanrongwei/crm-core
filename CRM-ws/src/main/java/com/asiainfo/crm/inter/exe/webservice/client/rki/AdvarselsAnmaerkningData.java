/**
 * AdvarselsAnmaerkningData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class AdvarselsAnmaerkningData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.AnmaerkningData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.SletteAarsagData sletteAarsag;

    public AdvarselsAnmaerkningData() {
    }

    public AdvarselsAnmaerkningData(
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
           java.lang.String registreringStatus,
           com.asiainfo.crm.inter.exe.webservice.client.rki.SletteAarsagData sletteAarsag) {
        super(
            error,
            beskedId,
            beskedType,
            debitor,
            kreditor,
            administrator,
            videregivelsesDato,
            indberettetDato,
            slettetDato,
            fordringsBeloeb,
            kreditorsRefNr,
            administratorsRefNr,
            fundament,
            beloeb,
            registreringBemaerkning,
            registreringStatus);
        this.sletteAarsag = sletteAarsag;
    }


    /**
     * Gets the sletteAarsag value for this AdvarselsAnmaerkningData.
     * 
     * @return sletteAarsag
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.SletteAarsagData getSletteAarsag() {
        return sletteAarsag;
    }


    /**
     * Sets the sletteAarsag value for this AdvarselsAnmaerkningData.
     * 
     * @param sletteAarsag
     */
    public void setSletteAarsag(com.asiainfo.crm.inter.exe.webservice.client.rki.SletteAarsagData sletteAarsag) {
        this.sletteAarsag = sletteAarsag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvarselsAnmaerkningData)) return false;
        AdvarselsAnmaerkningData other = (AdvarselsAnmaerkningData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sletteAarsag==null && other.getSletteAarsag()==null) || 
             (this.sletteAarsag!=null &&
              this.sletteAarsag.equals(other.getSletteAarsag())));
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
        if (getSletteAarsag() != null) {
            _hashCode += getSletteAarsag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvarselsAnmaerkningData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsAnmaerkningData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sletteAarsag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "SletteAarsag"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "SletteAarsagData"));
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
