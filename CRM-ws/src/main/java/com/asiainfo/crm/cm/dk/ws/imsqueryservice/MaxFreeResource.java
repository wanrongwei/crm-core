/**
 * MaxFreeResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class MaxFreeResource  implements java.io.Serializable {
    private java.lang.String phoneId;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] freeResourceList;

    public MaxFreeResource() {
    }

    public MaxFreeResource(
           java.lang.String phoneId,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] freeResourceList) {
           this.phoneId = phoneId;
           this.freeResourceList = freeResourceList;
    }


    /**
     * Gets the phoneId value for this MaxFreeResource.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this MaxFreeResource.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the freeResourceList value for this MaxFreeResource.
     * 
     * @return freeResourceList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] getFreeResourceList() {
        return freeResourceList;
    }


    /**
     * Sets the freeResourceList value for this MaxFreeResource.
     * 
     * @param freeResourceList
     */
    public void setFreeResourceList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] freeResourceList) {
        this.freeResourceList = freeResourceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaxFreeResource)) return false;
        MaxFreeResource other = (MaxFreeResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.freeResourceList==null && other.getFreeResourceList()==null) || 
             (this.freeResourceList!=null &&
              java.util.Arrays.equals(this.freeResourceList, other.getFreeResourceList())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getFreeResourceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceList(), i);
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
        new org.apache.axis.description.TypeDesc(MaxFreeResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceListItem"));
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
