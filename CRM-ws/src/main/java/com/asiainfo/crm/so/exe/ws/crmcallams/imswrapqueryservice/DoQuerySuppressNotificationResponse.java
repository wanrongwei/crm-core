/**
 * DoQuerySuppressNotificationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQuerySuppressNotificationResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify[] acctNotifyList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify[] phoneNotifyList;

    public DoQuerySuppressNotificationResponse() {
    }

    public DoQuerySuppressNotificationResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify[] acctNotifyList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify[] phoneNotifyList) {
        super(
            responseHead);
        this.acctNotifyList = acctNotifyList;
        this.phoneNotifyList = phoneNotifyList;
    }


    /**
     * Gets the acctNotifyList value for this DoQuerySuppressNotificationResponse.
     * 
     * @return acctNotifyList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify[] getAcctNotifyList() {
        return acctNotifyList;
    }


    /**
     * Sets the acctNotifyList value for this DoQuerySuppressNotificationResponse.
     * 
     * @param acctNotifyList
     */
    public void setAcctNotifyList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify[] acctNotifyList) {
        this.acctNotifyList = acctNotifyList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify getAcctNotifyList(int i) {
        return this.acctNotifyList[i];
    }

    public void setAcctNotifyList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify _value) {
        this.acctNotifyList[i] = _value;
    }


    /**
     * Gets the phoneNotifyList value for this DoQuerySuppressNotificationResponse.
     * 
     * @return phoneNotifyList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify[] getPhoneNotifyList() {
        return phoneNotifyList;
    }


    /**
     * Sets the phoneNotifyList value for this DoQuerySuppressNotificationResponse.
     * 
     * @param phoneNotifyList
     */
    public void setPhoneNotifyList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify[] phoneNotifyList) {
        this.phoneNotifyList = phoneNotifyList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify getPhoneNotifyList(int i) {
        return this.phoneNotifyList[i];
    }

    public void setPhoneNotifyList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify _value) {
        this.phoneNotifyList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQuerySuppressNotificationResponse)) return false;
        DoQuerySuppressNotificationResponse other = (DoQuerySuppressNotificationResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctNotifyList==null && other.getAcctNotifyList()==null) || 
             (this.acctNotifyList!=null &&
              java.util.Arrays.equals(this.acctNotifyList, other.getAcctNotifyList()))) &&
            ((this.phoneNotifyList==null && other.getPhoneNotifyList()==null) || 
             (this.phoneNotifyList!=null &&
              java.util.Arrays.equals(this.phoneNotifyList, other.getPhoneNotifyList())));
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
        if (getAcctNotifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctNotifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctNotifyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhoneNotifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneNotifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneNotifyList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQuerySuppressNotificationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySuppressNotificationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctNotifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctNotifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctNotify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNotifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNotifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneNotify"));
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
