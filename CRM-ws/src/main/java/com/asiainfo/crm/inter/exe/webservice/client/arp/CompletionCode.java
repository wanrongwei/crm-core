/**
 * CompletionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class CompletionCode  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    // Simple Types must have a String constructor
    public CompletionCode(java.lang.String _value) {
        this._value = _value;
    }
    public CompletionCode(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardCompletionCode _value) {
        setStandardCompletionCodeValue(_value);
    }

    public CompletionCode(java.math.BigInteger _value) {
        setLocalCompletionCodeValue(_value);
    }


    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the standardCompletionCodeValue value for this CompletionCode.
     * 
     * @return standardCompletionCodeValue
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.StandardCompletionCode getStandardCompletionCodeValue() {
        return com.asiainfo.crm.inter.exe.webservice.client.arp.StandardCompletionCode.fromString(_value);
    }


    /**
     * Sets the _value value for this CompletionCode.
     * 
     * @param _value
     */
    public void setStandardCompletionCodeValue(com.asiainfo.crm.inter.exe.webservice.client.arp.StandardCompletionCode _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the localCompletionCodeValue value for this CompletionCode.
     * 
     * @return localCompletionCodeValue
     */
    public java.math.BigInteger getLocalCompletionCodeValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this CompletionCode.
     * 
     * @param _value
     */
    public void setLocalCompletionCodeValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the bilateralCompletionCodeValue value for this CompletionCode.
     * 
     * @return bilateralCompletionCodeValue
     */
    public java.math.BigInteger getBilateralCompletionCodeValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this CompletionCode.
     * 
     * @param _value
     */
    public void setBilateralCompletionCodeValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompletionCode)) return false;
        CompletionCode other = (CompletionCode) obj;
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
        new org.apache.axis.description.TypeDesc(CompletionCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "CompletionCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardCompletionCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StandardCompletionCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardCompletionCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localCompletionCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalCompletionCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilateralCompletionCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BilateralCompletionCodeValue"));
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
