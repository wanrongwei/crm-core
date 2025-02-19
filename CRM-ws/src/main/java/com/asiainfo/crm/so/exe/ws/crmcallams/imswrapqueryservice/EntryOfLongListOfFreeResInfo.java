/**
 * EntryOfLongListOfFreeResInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class EntryOfLongListOfFreeResInfo  implements java.io.Serializable {
    private java.lang.Long key;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResInfo[] value;

    public EntryOfLongListOfFreeResInfo() {
    }

    public EntryOfLongListOfFreeResInfo(
           java.lang.Long key,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResInfo[] value) {
           this.key = key;
           this.value = value;
    }


    /**
     * Gets the key value for this EntryOfLongListOfFreeResInfo.
     * 
     * @return key
     */
    public java.lang.Long getKey() {
        return key;
    }


    /**
     * Sets the key value for this EntryOfLongListOfFreeResInfo.
     * 
     * @param key
     */
    public void setKey(java.lang.Long key) {
        this.key = key;
    }


    /**
     * Gets the value value for this EntryOfLongListOfFreeResInfo.
     * 
     * @return value
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResInfo[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this EntryOfLongListOfFreeResInfo.
     * 
     * @param value
     */
    public void setValue(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResInfo[] value) {
        this.value = value;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResInfo getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResInfo _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntryOfLongListOfFreeResInfo)) return false;
        EntryOfLongListOfFreeResInfo other = (EntryOfLongListOfFreeResInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(EntryOfLongListOfFreeResInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "entryOfLongListOfFreeResInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
