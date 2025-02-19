/**
 * Historik.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Historik  implements java.io.Serializable {
    private java.lang.String oprettet;

    private java.lang.String ændret;

    public Historik() {
    }

    public Historik(
           java.lang.String oprettet,
           java.lang.String ændret) {
           this.oprettet = oprettet;
           this.ændret = ændret;
    }


    /**
     * Gets the oprettet value for this Historik.
     * 
     * @return oprettet
     */
    public java.lang.String getOprettet() {
        return oprettet;
    }


    /**
     * Sets the oprettet value for this Historik.
     * 
     * @param oprettet
     */
    public void setOprettet(java.lang.String oprettet) {
        this.oprettet = oprettet;
    }


    /**
     * Gets the ændret value for this Historik.
     * 
     * @return ændret
     */
    public java.lang.String getÆndret() {
        return ændret;
    }


    /**
     * Sets the ændret value for this Historik.
     * 
     * @param ændret
     */
    public void setÆndret(java.lang.String ændret) {
        this.ændret = ændret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Historik)) return false;
        Historik other = (Historik) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oprettet==null && other.getOprettet()==null) || 
             (this.oprettet!=null &&
              this.oprettet.equals(other.getOprettet()))) &&
            ((this.ændret==null && other.getÆndret()==null) || 
             (this.ændret!=null &&
              this.ændret.equals(other.getÆndret())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOprettet() != null) {
            _hashCode += getOprettet().hashCode();
        }
        if (getÆndret() != null) {
            _hashCode += getÆndret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Historik.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "historik"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oprettet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oprettet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ændret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ændret"));
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
