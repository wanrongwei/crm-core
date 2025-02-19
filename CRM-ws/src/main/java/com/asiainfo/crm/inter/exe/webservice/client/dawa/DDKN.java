/**
 * DDKN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class DDKN  implements java.io.Serializable {
    private java.lang.String m100;

    private java.lang.String km1;

    private java.lang.String km10;

    public DDKN() {
    }

    public DDKN(
           java.lang.String m100,
           java.lang.String km1,
           java.lang.String km10) {
           this.m100 = m100;
           this.km1 = km1;
           this.km10 = km10;
    }


    /**
     * Gets the m100 value for this DDKN.
     * 
     * @return m100
     */
    public java.lang.String getM100() {
        return m100;
    }


    /**
     * Sets the m100 value for this DDKN.
     * 
     * @param m100
     */
    public void setM100(java.lang.String m100) {
        this.m100 = m100;
    }


    /**
     * Gets the km1 value for this DDKN.
     * 
     * @return km1
     */
    public java.lang.String getKm1() {
        return km1;
    }


    /**
     * Sets the km1 value for this DDKN.
     * 
     * @param km1
     */
    public void setKm1(java.lang.String km1) {
        this.km1 = km1;
    }


    /**
     * Gets the km10 value for this DDKN.
     * 
     * @return km10
     */
    public java.lang.String getKm10() {
        return km10;
    }


    /**
     * Sets the km10 value for this DDKN.
     * 
     * @param km10
     */
    public void setKm10(java.lang.String km10) {
        this.km10 = km10;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DDKN)) return false;
        DDKN other = (DDKN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m100==null && other.getM100()==null) || 
             (this.m100!=null &&
              this.m100.equals(other.getM100()))) &&
            ((this.km1==null && other.getKm1()==null) || 
             (this.km1!=null &&
              this.km1.equals(other.getKm1()))) &&
            ((this.km10==null && other.getKm10()==null) || 
             (this.km10!=null &&
              this.km10.equals(other.getKm10())));
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
        if (getM100() != null) {
            _hashCode += getM100().hashCode();
        }
        if (getKm1() != null) {
            _hashCode += getKm1().hashCode();
        }
        if (getKm10() != null) {
            _hashCode += getKm10().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DDKN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DDKN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m100");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m100"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("km1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "km1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("km10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "km10"));
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
