/**
 * DeactivationNotificationCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class DeactivationNotificationCode  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    // Simple Types must have a String constructor
    public DeactivationNotificationCode(java.lang.String _value) {
        this._value = _value;
    }
    public DeactivationNotificationCode(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardDeactivationNotification _value) {
        setStandardDeactivationNotificationValue(_value);
    }

    public DeactivationNotificationCode(java.math.BigInteger _value) {
        setLocalDeactivationNotificationValue(_value);
    }


    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the standardDeactivationNotificationValue value for this DeactivationNotificationCode.
     * 
     * @return standardDeactivationNotificationValue
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.StandardDeactivationNotification getStandardDeactivationNotificationValue() {
        return com.asiainfo.crm.inter.exe.webservice.client.arp.StandardDeactivationNotification.fromString(_value);
    }


    /**
     * Sets the _value value for this DeactivationNotificationCode.
     * 
     * @param _value
     */
    public void setStandardDeactivationNotificationValue(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardDeactivationNotification _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the localDeactivationNotificationValue value for this DeactivationNotificationCode.
     * 
     * @return localDeactivationNotificationValue
     */
    public java.math.BigInteger getLocalDeactivationNotificationValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this DeactivationNotificationCode.
     * 
     * @param _value
     */
    public void setLocalDeactivationNotificationValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the bilateralDeactivationNotificationValue value for this DeactivationNotificationCode.
     * 
     * @return bilateralDeactivationNotificationValue
     */
    public java.math.BigInteger getBilateralDeactivationNotificationValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this DeactivationNotificationCode.
     * 
     * @param _value
     */
    public void setBilateralDeactivationNotificationValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeactivationNotificationCode)) return false;
        DeactivationNotificationCode other = (DeactivationNotificationCode) obj;
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
        new org.apache.axis.description.TypeDesc(DeactivationNotificationCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "DeactivationNotificationCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardDeactivationNotificationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StandardDeactivationNotificationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardDeactivationNotification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localDeactivationNotificationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalDeactivationNotificationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilateralDeactivationNotificationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BilateralDeactivationNotificationValue"));
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
