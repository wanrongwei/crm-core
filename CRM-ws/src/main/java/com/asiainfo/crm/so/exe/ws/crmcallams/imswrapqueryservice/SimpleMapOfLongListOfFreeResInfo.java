/**
 * SimpleMapOfLongListOfFreeResInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SimpleMapOfLongListOfFreeResInfo  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AbstractMapOfKV  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.EntryOfLongListOfFreeResInfo[] simpleEntry;

    public SimpleMapOfLongListOfFreeResInfo() {
    }

    public SimpleMapOfLongListOfFreeResInfo(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.EntryOfLongListOfFreeResInfo[] simpleEntry) {
        this.simpleEntry = simpleEntry;
    }


    /**
     * Gets the simpleEntry value for this SimpleMapOfLongListOfFreeResInfo.
     * 
     * @return simpleEntry
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.EntryOfLongListOfFreeResInfo[] getSimpleEntry() {
        return simpleEntry;
    }


    /**
     * Sets the simpleEntry value for this SimpleMapOfLongListOfFreeResInfo.
     * 
     * @param simpleEntry
     */
    public void setSimpleEntry(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.EntryOfLongListOfFreeResInfo[] simpleEntry) {
        this.simpleEntry = simpleEntry;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.EntryOfLongListOfFreeResInfo getSimpleEntry(int i) {
        return this.simpleEntry[i];
    }

    public void setSimpleEntry(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.EntryOfLongListOfFreeResInfo _value) {
        this.simpleEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleMapOfLongListOfFreeResInfo)) return false;
        SimpleMapOfLongListOfFreeResInfo other = (SimpleMapOfLongListOfFreeResInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.simpleEntry==null && other.getSimpleEntry()==null) || 
             (this.simpleEntry!=null &&
              java.util.Arrays.equals(this.simpleEntry, other.getSimpleEntry())));
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
        if (getSimpleEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleEntry(), i);
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
        new org.apache.axis.description.TypeDesc(SimpleMapOfLongListOfFreeResInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "simpleMapOfLongListOfFreeResInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "simpleEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "entryOfLongListOfFreeResInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
