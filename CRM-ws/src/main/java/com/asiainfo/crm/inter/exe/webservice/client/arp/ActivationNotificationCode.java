/**
 * ActivationNotificationCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class ActivationNotificationCode  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    // Simple Types must have a String constructor
    public ActivationNotificationCode(java.lang.String _value) {
        this._value = _value;
    }
    public ActivationNotificationCode(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardActivationNotificationCode _value) {
        setStandardActivationNotificationCodeValue(_value);
    }

    public ActivationNotificationCode(java.math.BigInteger _value) {
        setLocalActivationNotificationCodeValue(_value);
    }


    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the standardActivationNotificationCodeValue value for this ActivationNotificationCode.
     * 
     * @return standardActivationNotificationCodeValue
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.StandardActivationNotificationCode getStandardActivationNotificationCodeValue() {
        return com.asiainfo.crm.inter.exe.webservice.client.arp.StandardActivationNotificationCode.fromString(_value);
    }


    /**
     * Sets the _value value for this ActivationNotificationCode.
     * 
     * @param _value
     */
    public void setStandardActivationNotificationCodeValue(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardActivationNotificationCode _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the localActivationNotificationCodeValue value for this ActivationNotificationCode.
     * 
     * @return localActivationNotificationCodeValue
     */
    public java.math.BigInteger getLocalActivationNotificationCodeValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this ActivationNotificationCode.
     * 
     * @param _value
     */
    public void setLocalActivationNotificationCodeValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the bilateralActivationNotificationCodeValue value for this ActivationNotificationCode.
     * 
     * @return bilateralActivationNotificationCodeValue
     */
    public java.math.BigInteger getBilateralActivationNotificationCodeValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this ActivationNotificationCode.
     * 
     * @param _value
     */
    public void setBilateralActivationNotificationCodeValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivationNotificationCode)) return false;
        ActivationNotificationCode other = (ActivationNotificationCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&  this.toString().equals(obj.toString());
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
        if (this._value != null) {
            _hashCode += this._value.hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivationNotificationCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ActivationNotificationCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardActivationNotificationCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StandardActivationNotificationCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardActivationNotificationCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localActivationNotificationCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalActivationNotificationCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilateralActivationNotificationCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BilateralActivationNotificationCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
