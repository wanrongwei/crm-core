/**
 * SRegretOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SRegretOffer  implements java.io.Serializable {
    private java.lang.Long upcOfferId;

    private java.lang.String imei;

    public SRegretOffer() {
    }

    public SRegretOffer(
           java.lang.Long upcOfferId,
           java.lang.String imei) {
           this.upcOfferId = upcOfferId;
           this.imei = imei;
    }


    /**
     * Gets the upcOfferId value for this SRegretOffer.
     * 
     * @return upcOfferId
     */
    public java.lang.Long getUpcOfferId() {
        return upcOfferId;
    }


    /**
     * Sets the upcOfferId value for this SRegretOffer.
     * 
     * @param upcOfferId
     */
    public void setUpcOfferId(java.lang.Long upcOfferId) {
        this.upcOfferId = upcOfferId;
    }


    /**
     * Gets the imei value for this SRegretOffer.
     * 
     * @return imei
     */
    public java.lang.String getImei() {
        return imei;
    }


    /**
     * Sets the imei value for this SRegretOffer.
     * 
     * @param imei
     */
    public void setImei(java.lang.String imei) {
        this.imei = imei;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRegretOffer)) return false;
        SRegretOffer other = (SRegretOffer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upcOfferId==null && other.getUpcOfferId()==null) || 
             (this.upcOfferId!=null &&
              this.upcOfferId.equals(other.getUpcOfferId()))) &&
            ((this.imei==null && other.getImei()==null) || 
             (this.imei!=null &&
              this.imei.equals(other.getImei())));
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
        if (getUpcOfferId() != null) {
            _hashCode += getUpcOfferId().hashCode();
        }
        if (getImei() != null) {
            _hashCode += getImei().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRegretOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretOffer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upcOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imei");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imei"));
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
