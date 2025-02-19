/**
 * DoAcceptInstalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoAcceptInstalResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] instalInfoList;

    public DoAcceptInstalResponse() {
    }

    public DoAcceptInstalResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] instalInfoList) {
        super(
            responseHead);
        this.instalInfoList = instalInfoList;
    }


    /**
     * Gets the instalInfoList value for this DoAcceptInstalResponse.
     * 
     * @return instalInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] getInstalInfoList() {
        return instalInfoList;
    }


    /**
     * Sets the instalInfoList value for this DoAcceptInstalResponse.
     * 
     * @param instalInfoList
     */
    public void setInstalInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] instalInfoList) {
        this.instalInfoList = instalInfoList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo getInstalInfoList(int i) {
        return this.instalInfoList[i];
    }

    public void setInstalInfoList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo _value) {
        this.instalInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAcceptInstalResponse)) return false;
        DoAcceptInstalResponse other = (DoAcceptInstalResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.instalInfoList==null && other.getInstalInfoList()==null) || 
             (this.instalInfoList!=null &&
              java.util.Arrays.equals(this.instalInfoList, other.getInstalInfoList())));
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
        if (getInstalInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstalInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstalInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(DoAcceptInstalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAcceptInstalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfo"));
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
