/**
 * SyncIncrementalSubscriberInfoResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cpa;

public class SyncIncrementalSubscriberInfoResponseBody  implements java.io.Serializable {
    private java.lang.String rspCode;

    public SyncIncrementalSubscriberInfoResponseBody() {
    }

    public SyncIncrementalSubscriberInfoResponseBody(
           String rspCode) {
           this.rspCode = rspCode;
    }

    /**
     * Gets the rspCode value for this SyncIncrementalSubscriberInfoResponseBody.
     * 
     * @return rspCode
     */
    public java.lang.String getRspCode() {
        return rspCode;
    }


    /**
     * Sets the rspCode value for this SyncIncrementalSubscriberInfoResponseBody.
     * 
     * @param rspCode
     */
    public void setRspCode(java.lang.String rspCode) {
        this.rspCode = rspCode;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncIncrementalSubscriberInfoResponseBody)) return false;
        SyncIncrementalSubscriberInfoResponseBody other = (SyncIncrementalSubscriberInfoResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rspCode==null && other.getRspCode()==null) || 
             (this.rspCode!=null &&
              this.rspCode.equals(other.getRspCode())));
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
        if (getRspCode() != null) {
            _hashCode += getRspCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncIncrementalSubscriberInfoResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rspCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
