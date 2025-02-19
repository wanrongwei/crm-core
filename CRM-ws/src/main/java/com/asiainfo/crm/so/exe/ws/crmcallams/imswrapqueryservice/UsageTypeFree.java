/**
 * UsageTypeFree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class UsageTypeFree  implements java.io.Serializable {
    private java.lang.Integer usageTypeFreeValue;

    public UsageTypeFree() {
    }

    public UsageTypeFree(
           java.lang.Integer usageTypeFreeValue) {
           this.usageTypeFreeValue = usageTypeFreeValue;
    }


    /**
     * Gets the usageTypeFreeValue value for this UsageTypeFree.
     * 
     * @return usageTypeFreeValue
     */
    public java.lang.Integer getUsageTypeFreeValue() {
        return usageTypeFreeValue;
    }


    /**
     * Sets the usageTypeFreeValue value for this UsageTypeFree.
     * 
     * @param usageTypeFreeValue
     */
    public void setUsageTypeFreeValue(java.lang.Integer usageTypeFreeValue) {
        this.usageTypeFreeValue = usageTypeFreeValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageTypeFree)) return false;
        UsageTypeFree other = (UsageTypeFree) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageTypeFreeValue==null && other.getUsageTypeFreeValue()==null) || 
             (this.usageTypeFreeValue!=null &&
              this.usageTypeFreeValue.equals(other.getUsageTypeFreeValue())));
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
        if (getUsageTypeFreeValue() != null) {
            _hashCode += getUsageTypeFreeValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageTypeFree.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "usageTypeFree"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageTypeFreeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageTypeFreeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
