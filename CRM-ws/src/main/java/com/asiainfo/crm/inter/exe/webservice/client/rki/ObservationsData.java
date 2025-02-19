/**
 * ObservationsData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class ObservationsData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationItemData[] aktuelleAnmærkninger;

    public ObservationsData() {
    }

    public ObservationsData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationItemData[] aktuelleAnmærkninger) {
        super(
            error);
        this.aktuelleAnmærkninger = aktuelleAnmærkninger;
    }


    /**
     * Gets the aktuelleAnmærkninger value for this ObservationsData.
     * 
     * @return aktuelleAnmærkninger
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationItemData[] getAktuelleAnmærkninger() {
        return aktuelleAnmærkninger;
    }


    /**
     * Sets the aktuelleAnmærkninger value for this ObservationsData.
     * 
     * @param aktuelleAnmærkninger
     */
    public void setAktuelleAnmærkninger(com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationItemData[] aktuelleAnmærkninger) {
        this.aktuelleAnmærkninger = aktuelleAnmærkninger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObservationsData)) return false;
        ObservationsData other = (ObservationsData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aktuelleAnmærkninger==null && other.getAktuelleAnmærkninger()==null) || 
             (this.aktuelleAnmærkninger!=null &&
              java.util.Arrays.equals(this.aktuelleAnmærkninger, other.getAktuelleAnmærkninger())));
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
        if (getAktuelleAnmærkninger() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAktuelleAnmærkninger());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAktuelleAnmærkninger(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObservationsData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationsData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aktuelleAnmærkninger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AktuelleAnmærkninger"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationItemData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "Anmærkning"));
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
