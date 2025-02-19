/**
 * DoQueryPayChannelHisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class DoQueryPayChannelHisResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.PayChannelHisInfo[] payChannelHisInfoList;

    public DoQueryPayChannelHisResponse() {
    }

    public DoQueryPayChannelHisResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.PayChannelHisInfo[] payChannelHisInfoList) {
        super(
            responseHead);
        this.payChannelHisInfoList = payChannelHisInfoList;
    }


    /**
     * Gets the payChannelHisInfoList value for this DoQueryPayChannelHisResponse.
     * 
     * @return payChannelHisInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.PayChannelHisInfo[] getPayChannelHisInfoList() {
        return payChannelHisInfoList;
    }


    /**
     * Sets the payChannelHisInfoList value for this DoQueryPayChannelHisResponse.
     * 
     * @param payChannelHisInfoList
     */
    public void setPayChannelHisInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.PayChannelHisInfo[] payChannelHisInfoList) {
        this.payChannelHisInfoList = payChannelHisInfoList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.PayChannelHisInfo getPayChannelHisInfoList(int i) {
        return this.payChannelHisInfoList[i];
    }

    public void setPayChannelHisInfoList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.PayChannelHisInfo _value) {
        this.payChannelHisInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DoQueryPayChannelHisResponse)) return false;
        DoQueryPayChannelHisResponse other = (DoQueryPayChannelHisResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.payChannelHisInfoList==null && other.getPayChannelHisInfoList()==null) || 
             (this.payChannelHisInfoList!=null &&
              java.util.Arrays.equals(this.payChannelHisInfoList, other.getPayChannelHisInfoList())));
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
        if (getPayChannelHisInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayChannelHisInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayChannelHisInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryPayChannelHisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelHisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payChannelHisInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payChannelHisInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "payChannelHisInfo"));
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
