/**
 * DoQueryAutoTopUpResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryAutoTopUpResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpQryResult[] autoTopUpResultList;

    public DoQueryAutoTopUpResponse() {
    }

    public DoQueryAutoTopUpResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpQryResult[] autoTopUpResultList) {
        super(
            responseHead);
        this.autoTopUpResultList = autoTopUpResultList;
    }


    /**
     * Gets the autoTopUpResultList value for this DoQueryAutoTopUpResponse.
     * 
     * @return autoTopUpResultList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpQryResult[] getAutoTopUpResultList() {
        return autoTopUpResultList;
    }


    /**
     * Sets the autoTopUpResultList value for this DoQueryAutoTopUpResponse.
     * 
     * @param autoTopUpResultList
     */
    public void setAutoTopUpResultList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpQryResult[] autoTopUpResultList) {
        this.autoTopUpResultList = autoTopUpResultList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAutoTopUpResponse)) return false;
        DoQueryAutoTopUpResponse other = (DoQueryAutoTopUpResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoTopUpResultList==null && other.getAutoTopUpResultList()==null) || 
             (this.autoTopUpResultList!=null &&
              java.util.Arrays.equals(this.autoTopUpResultList, other.getAutoTopUpResultList())));
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
        if (getAutoTopUpResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoTopUpResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoTopUpResultList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryAutoTopUpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAutoTopUpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTopUpResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTopUpResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpQryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "autoTopUpQryResultList_Item"));
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
