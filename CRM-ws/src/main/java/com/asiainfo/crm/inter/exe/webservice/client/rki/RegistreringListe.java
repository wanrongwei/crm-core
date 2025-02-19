/**
 * RegistreringListe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class RegistreringListe  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData[] registreringsListe;

    public RegistreringListe() {
    }

    public RegistreringListe(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData[] registreringsListe) {
        super(
            error);
        this.registreringsListe = registreringsListe;
    }


    /**
     * Gets the registreringsListe value for this RegistreringListe.
     * 
     * @return registreringsListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData[] getRegistreringsListe() {
        return registreringsListe;
    }


    /**
     * Sets the registreringsListe value for this RegistreringListe.
     * 
     * @param registreringsListe
     */
    public void setRegistreringsListe(com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData[] registreringsListe) {
        this.registreringsListe = registreringsListe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistreringListe)) return false;
        RegistreringListe other = (RegistreringListe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.registreringsListe==null && other.getRegistreringsListe()==null) || 
             (this.registreringsListe!=null &&
              java.util.Arrays.equals(this.registreringsListe, other.getRegistreringsListe())));
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
        if (getRegistreringsListe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistreringsListe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistreringsListe(), i);
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
        new org.apache.axis.description.TypeDesc(RegistreringListe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "RegistreringListe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreringsListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "RegistreringsListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "BetalingsAnmaerkningData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "Registrering"));
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
