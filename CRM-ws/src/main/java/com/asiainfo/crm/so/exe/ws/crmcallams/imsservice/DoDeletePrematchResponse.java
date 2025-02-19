/**
 * DoDeletePrematchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class DoDeletePrematchResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String[] delete_phone_ids;

    public DoDeletePrematchResponse() {
    }

    public DoDeletePrematchResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ResponseHead responseHead,
           java.lang.String[] delete_phone_ids) {
        super(
            responseHead);
        this.delete_phone_ids = delete_phone_ids;
    }


    /**
     * Gets the delete_phone_ids value for this DoDeletePrematchResponse.
     * 
     * @return delete_phone_ids
     */
    public java.lang.String[] getDelete_phone_ids() {
        return delete_phone_ids;
    }


    /**
     * Sets the delete_phone_ids value for this DoDeletePrematchResponse.
     * 
     * @param delete_phone_ids
     */
    public void setDelete_phone_ids(java.lang.String[] delete_phone_ids) {
        this.delete_phone_ids = delete_phone_ids;
    }

    public java.lang.String getDelete_phone_ids(int i) {
        return this.delete_phone_ids[i];
    }

    public void setDelete_phone_ids(int i, java.lang.String _value) {
        this.delete_phone_ids[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoDeletePrematchResponse)) return false;
        DoDeletePrematchResponse other = (DoDeletePrematchResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.delete_phone_ids==null && other.getDelete_phone_ids()==null) || 
             (this.delete_phone_ids!=null &&
              java.util.Arrays.equals(this.delete_phone_ids, other.getDelete_phone_ids())));
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
        if (getDelete_phone_ids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelete_phone_ids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelete_phone_ids(), i);
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
        new org.apache.axis.description.TypeDesc(DoDeletePrematchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeletePrematchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete_phone_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delete_phone_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
