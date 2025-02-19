/**
 * DoCancelOneTimeFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoCancelOneTimeFeeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String remark;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[] oneTimeFeeList;

    public DoCancelOneTimeFeeResponse() {
    }

    public DoCancelOneTimeFeeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.String remark,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[] oneTimeFeeList) {
        super(
            responseHead);
        this.remark = remark;
        this.oneTimeFeeList = oneTimeFeeList;
    }


    /**
     * Gets the remark value for this DoCancelOneTimeFeeResponse.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this DoCancelOneTimeFeeResponse.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the oneTimeFeeList value for this DoCancelOneTimeFeeResponse.
     * 
     * @return oneTimeFeeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[] getOneTimeFeeList() {
        return oneTimeFeeList;
    }


    /**
     * Sets the oneTimeFeeList value for this DoCancelOneTimeFeeResponse.
     * 
     * @param oneTimeFeeList
     */
    public void setOneTimeFeeList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[] oneTimeFeeList) {
        this.oneTimeFeeList = oneTimeFeeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelOneTimeFeeResponse)) return false;
        DoCancelOneTimeFeeResponse other = (DoCancelOneTimeFeeResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.oneTimeFeeList==null && other.getOneTimeFeeList()==null) || 
             (this.oneTimeFeeList!=null &&
              java.util.Arrays.equals(this.oneTimeFeeList, other.getOneTimeFeeList())));
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
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getOneTimeFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOneTimeFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOneTimeFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(DoCancelOneTimeFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOneTimeFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "oneTimeFeeListItem"));
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
