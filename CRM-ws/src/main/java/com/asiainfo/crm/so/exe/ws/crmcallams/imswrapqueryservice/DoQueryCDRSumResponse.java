/**
 * DoQueryCDRSumResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryCDRSumResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailSumRecord[] callDetailSumRecordList;

    public DoQueryCDRSumResponse() {
    }

    public DoQueryCDRSumResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailSumRecord[] callDetailSumRecordList) {
        super(
            responseHead);
        this.callDetailSumRecordList = callDetailSumRecordList;
    }


    /**
     * Gets the callDetailSumRecordList value for this DoQueryCDRSumResponse.
     * 
     * @return callDetailSumRecordList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailSumRecord[] getCallDetailSumRecordList() {
        return callDetailSumRecordList;
    }


    /**
     * Sets the callDetailSumRecordList value for this DoQueryCDRSumResponse.
     * 
     * @param callDetailSumRecordList
     */
    public void setCallDetailSumRecordList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailSumRecord[] callDetailSumRecordList) {
        this.callDetailSumRecordList = callDetailSumRecordList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailSumRecord getCallDetailSumRecordList(int i) {
        return this.callDetailSumRecordList[i];
    }

    public void setCallDetailSumRecordList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailSumRecord _value) {
        this.callDetailSumRecordList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryCDRSumResponse)) return false;
        DoQueryCDRSumResponse other = (DoQueryCDRSumResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.callDetailSumRecordList==null && other.getCallDetailSumRecordList()==null) || 
             (this.callDetailSumRecordList!=null &&
              java.util.Arrays.equals(this.callDetailSumRecordList, other.getCallDetailSumRecordList())));
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
        if (getCallDetailSumRecordList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetailSumRecordList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetailSumRecordList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryCDRSumResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRSumResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailSumRecordList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDetailSumRecordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailSumRecord"));
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
