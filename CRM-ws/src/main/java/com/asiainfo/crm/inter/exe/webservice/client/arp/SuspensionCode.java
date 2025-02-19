/**
 * SuspensionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class SuspensionCode  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    // Simple Types must have a String constructor
    public SuspensionCode(java.lang.String _value) {
        this._value = _value;
    }
    public SuspensionCode(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardSuspensionCode _value) {
        setStandardSuspensionCodeValue(_value);
    }

    public SuspensionCode(java.math.BigInteger _value) {
        setLocalSuspensionCodeValue(_value);
    }


    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the standardSuspensionCodeValue value for this SuspensionCode.
     * 
     * @return standardSuspensionCodeValue
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.StandardSuspensionCode getStandardSuspensionCodeValue() {
        return com.asiainfo.crm.inter.exe.webservice.client.arp.StandardSuspensionCode.fromString(_value);
    }


    /**
     * Sets the _value value for this SuspensionCode.
     * 
     * @param _value
     */
    public void setStandardSuspensionCodeValue(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardSuspensionCode _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the localSuspensionCodeValue value for this SuspensionCode.
     * 
     * @return localSuspensionCodeValue
     */
    public java.math.BigInteger getLocalSuspensionCodeValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this SuspensionCode.
     * 
     * @param _value
     */
    public void setLocalSuspensionCodeValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the bilateralSuspensionCodeValue value for this SuspensionCode.
     * 
     * @return bilateralSuspensionCodeValue
     */
    public java.math.BigInteger getBilateralSuspensionCodeValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this SuspensionCode.
     * 
     * @param _value
     */
    public void setBilateralSuspensionCodeValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuspensionCode)) return false;
        SuspensionCode other = (SuspensionCode) obj;
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
        new org.apache.axis.description.TypeDesc(SuspensionCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "SuspensionCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardSuspensionCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StandardSuspensionCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardSuspensionCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localSuspensionCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalSuspensionCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilateralSuspensionCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BilateralSuspensionCodeValue"));
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
