/**
 * QueryMainPhoneByAcctIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class QueryMainPhoneByAcctIdResponse  extends com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Long billCycle_days;

    public QueryMainPhoneByAcctIdResponse() {
    }

    public QueryMainPhoneByAcctIdResponse(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.ResponseHead responseHead,
           java.lang.String phone_id,
           java.lang.Long billCycle_days) {
        super(
            responseHead);
        this.phone_id = phone_id;
        this.billCycle_days = billCycle_days;
    }


    /**
     * Gets the phone_id value for this QueryMainPhoneByAcctIdResponse.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this QueryMainPhoneByAcctIdResponse.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the billCycle_days value for this QueryMainPhoneByAcctIdResponse.
     * 
     * @return billCycle_days
     */
    public java.lang.Long getBillCycle_days() {
        return billCycle_days;
    }


    /**
     * Sets the billCycle_days value for this QueryMainPhoneByAcctIdResponse.
     * 
     * @param billCycle_days
     */
    public void setBillCycle_days(java.lang.Long billCycle_days) {
        this.billCycle_days = billCycle_days;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryMainPhoneByAcctIdResponse)) return false;
        QueryMainPhoneByAcctIdResponse other = (QueryMainPhoneByAcctIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.billCycle_days==null && other.getBillCycle_days()==null) || 
             (this.billCycle_days!=null &&
              this.billCycle_days.equals(other.getBillCycle_days())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getBillCycle_days() != null) {
            _hashCode += getBillCycle_days().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryMainPhoneByAcctIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryMainPhoneByAcctIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle_days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billCycle_days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
