/**
 * AdvarselsListe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class AdvarselsListe  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData[] advarselsListe;

    public AdvarselsListe() {
    }

    public AdvarselsListe(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData[] advarselsListe) {
        super(
            error);
        this.advarselsListe = advarselsListe;
    }


    /**
     * Gets the advarselsListe value for this AdvarselsListe.
     * 
     * @return advarselsListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData[] getAdvarselsListe() {
        return advarselsListe;
    }


    /**
     * Sets the advarselsListe value for this AdvarselsListe.
     * 
     * @param advarselsListe
     */
    public void setAdvarselsListe(com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData[] advarselsListe) {
        this.advarselsListe = advarselsListe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvarselsListe)) return false;
        AdvarselsListe other = (AdvarselsListe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advarselsListe==null && other.getAdvarselsListe()==null) || 
             (this.advarselsListe!=null &&
              java.util.Arrays.equals(this.advarselsListe, other.getAdvarselsListe())));
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
        if (getAdvarselsListe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdvarselsListe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdvarselsListe(), i);
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
        new org.apache.axis.description.TypeDesc(AdvarselsListe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsListe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advarselsListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsAnmaerkningData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "Advarsel"));
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
