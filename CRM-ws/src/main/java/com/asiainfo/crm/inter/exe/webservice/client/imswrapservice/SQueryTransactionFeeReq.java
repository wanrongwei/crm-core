/**
 * SQueryTransactionFeeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SQueryTransactionFeeReq  implements java.io.Serializable {
    private java.lang.String phone_id;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.BusiSpecId[] busiSpecIdList;

    public SQueryTransactionFeeReq() {
    }

    public SQueryTransactionFeeReq(
           java.lang.String phone_id,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.BusiSpecId[] busiSpecIdList) {
           this.phone_id = phone_id;
           this.busiSpecIdList = busiSpecIdList;
    }


    /**
     * Gets the phone_id value for this SQueryTransactionFeeReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SQueryTransactionFeeReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the busiSpecIdList value for this SQueryTransactionFeeReq.
     * 
     * @return busiSpecIdList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.BusiSpecId[] getBusiSpecIdList() {
        return busiSpecIdList;
    }


    /**
     * Sets the busiSpecIdList value for this SQueryTransactionFeeReq.
     * 
     * @param busiSpecIdList
     */
    public void setBusiSpecIdList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.BusiSpecId[] busiSpecIdList) {
        this.busiSpecIdList = busiSpecIdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryTransactionFeeReq)) return false;
        SQueryTransactionFeeReq other = (SQueryTransactionFeeReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.busiSpecIdList==null && other.getBusiSpecIdList()==null) || 
             (this.busiSpecIdList!=null &&
              java.util.Arrays.equals(this.busiSpecIdList, other.getBusiSpecIdList())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getBusiSpecIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusiSpecIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusiSpecIdList(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryTransactionFeeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTransactionFeeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSpecIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "busiSpecId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "busiSpecIdItem"));
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
