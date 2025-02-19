/**
 * DoQueryNtCdrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryNtCdrResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReplyInfo[] sReplyDisInfoList;

    public DoQueryNtCdrResponse() {
    }

    public DoQueryNtCdrResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReplyInfo[] sReplyDisInfoList) {
        super(
            responseHead);
        this.sReplyDisInfoList = sReplyDisInfoList;
    }


    /**
     * Gets the sReplyDisInfoList value for this DoQueryNtCdrResponse.
     * 
     * @return sReplyDisInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReplyInfo[] getSReplyDisInfoList() {
        return sReplyDisInfoList;
    }


    /**
     * Sets the sReplyDisInfoList value for this DoQueryNtCdrResponse.
     * 
     * @param sReplyDisInfoList
     */
    public void setSReplyDisInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReplyInfo[] sReplyDisInfoList) {
        this.sReplyDisInfoList = sReplyDisInfoList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReplyInfo getSReplyDisInfoList(int i) {
        return this.sReplyDisInfoList[i];
    }

    public void setSReplyDisInfoList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReplyInfo _value) {
        this.sReplyDisInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryNtCdrResponse)) return false;
        DoQueryNtCdrResponse other = (DoQueryNtCdrResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sReplyDisInfoList==null && other.getSReplyDisInfoList()==null) || 
             (this.sReplyDisInfoList!=null &&
              java.util.Arrays.equals(this.sReplyDisInfoList, other.getSReplyDisInfoList())));
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
        if (getSReplyDisInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSReplyDisInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSReplyDisInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryNtCdrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNtCdrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SReplyDisInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sReplyDisInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sReplyInfo"));
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
