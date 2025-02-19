/**
 * PhoneNotify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class PhoneNotify  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.Notify[] notifyList_item;

    private java.lang.String phone_id;

    public PhoneNotify() {
    }

    public PhoneNotify(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.Notify[] notifyList_item,
           java.lang.String phone_id) {
           this.notifyList_item = notifyList_item;
           this.phone_id = phone_id;
    }


    /**
     * Gets the notifyList_item value for this PhoneNotify.
     * 
     * @return notifyList_item
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.Notify[] getNotifyList_item() {
        return notifyList_item;
    }


    /**
     * Sets the notifyList_item value for this PhoneNotify.
     * 
     * @param notifyList_item
     */
    public void setNotifyList_item(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.Notify[] notifyList_item) {
        this.notifyList_item = notifyList_item;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.Notify getNotifyList_item(int i) {
        return this.notifyList_item[i];
    }

    public void setNotifyList_item(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.Notify _value) {
        this.notifyList_item[i] = _value;
    }


    /**
     * Gets the phone_id value for this PhoneNotify.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this PhoneNotify.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof PhoneNotify)) return false;
        PhoneNotify other = (PhoneNotify) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notifyList_item==null && other.getNotifyList_item()==null) || 
             (this.notifyList_item!=null &&
              java.util.Arrays.equals(this.notifyList_item, other.getNotifyList_item()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id())));
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
        if (getNotifyList_item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyList_item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyList_item(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneNotify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneNotify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyList_item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyList_item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
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
