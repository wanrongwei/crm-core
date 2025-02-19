/**
 * DoQueryNotifyFlagResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryNotifyFlagResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify[] notifyList;

    public DoQueryNotifyFlagResponse() {
    }

    public DoQueryNotifyFlagResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify[] notifyList) {
        super(
            responseHead);
        this.notifyList = notifyList;
    }


    /**
     * Gets the notifyList value for this DoQueryNotifyFlagResponse.
     * 
     * @return notifyList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify[] getNotifyList() {
        return notifyList;
    }


    /**
     * Sets the notifyList value for this DoQueryNotifyFlagResponse.
     * 
     * @param notifyList
     */
    public void setNotifyList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify[] notifyList) {
        this.notifyList = notifyList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify getNotifyList(int i) {
        return this.notifyList[i];
    }

    public void setNotifyList(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify _value) {
        this.notifyList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryNotifyFlagResponse)) return false;
        DoQueryNotifyFlagResponse other = (DoQueryNotifyFlagResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notifyList==null && other.getNotifyList()==null) || 
             (this.notifyList!=null &&
              java.util.Arrays.equals(this.notifyList, other.getNotifyList())));
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
        if (getNotifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryNotifyFlagResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyFlagResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify"));
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
