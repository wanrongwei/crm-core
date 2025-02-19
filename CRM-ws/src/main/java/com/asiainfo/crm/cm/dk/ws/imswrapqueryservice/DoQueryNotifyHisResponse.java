/**
 * DoQueryNotifyHisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryNotifyHisResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NotificationHistory[] notify_his_list;

    public DoQueryNotifyHisResponse() {
    }

    public DoQueryNotifyHisResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NotificationHistory[] notify_his_list) {
        super(
            responseHead);
        this.notify_his_list = notify_his_list;
    }


    /**
     * Gets the notify_his_list value for this DoQueryNotifyHisResponse.
     * 
     * @return notify_his_list
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NotificationHistory[] getNotify_his_list() {
        return notify_his_list;
    }


    /**
     * Sets the notify_his_list value for this DoQueryNotifyHisResponse.
     * 
     * @param notify_his_list
     */
    public void setNotify_his_list(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NotificationHistory[] notify_his_list) {
        this.notify_his_list = notify_his_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryNotifyHisResponse)) return false;
        DoQueryNotifyHisResponse other = (DoQueryNotifyHisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notify_his_list==null && other.getNotify_his_list()==null) || 
             (this.notify_his_list!=null &&
              java.util.Arrays.equals(this.notify_his_list, other.getNotify_his_list())));
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
        if (getNotify_his_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotify_his_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotify_his_list(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryNotifyHisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyHisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_his_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_his_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notificationHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "notificationHistory"));
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
