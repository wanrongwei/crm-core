/**
 * QueryAllowanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryAllowanceResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAllowanceUsage[] allowanceUsageResp;

    public QueryAllowanceResponse() {
    }

    public QueryAllowanceResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAllowanceUsage[] allowanceUsageResp) {
        super(
            responseHead);
        this.allowanceUsageResp = allowanceUsageResp;
    }


    /**
     * Gets the allowanceUsageResp value for this QueryAllowanceResponse.
     * 
     * @return allowanceUsageResp
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAllowanceUsage[] getAllowanceUsageResp() {
        return allowanceUsageResp;
    }


    /**
     * Sets the allowanceUsageResp value for this QueryAllowanceResponse.
     * 
     * @param allowanceUsageResp
     */
    public void setAllowanceUsageResp(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAllowanceUsage[] allowanceUsageResp) {
        this.allowanceUsageResp = allowanceUsageResp;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAllowanceUsage getAllowanceUsageResp(int i) {
        return this.allowanceUsageResp[i];
    }

    public void setAllowanceUsageResp(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAllowanceUsage _value) {
        this.allowanceUsageResp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAllowanceResponse)) return false;
        QueryAllowanceResponse other = (QueryAllowanceResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowanceUsageResp==null && other.getAllowanceUsageResp()==null) || 
             (this.allowanceUsageResp!=null &&
              java.util.Arrays.equals(this.allowanceUsageResp, other.getAllowanceUsageResp())));
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
        if (getAllowanceUsageResp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowanceUsageResp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowanceUsageResp(), i);
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
        new org.apache.axis.description.TypeDesc(QueryAllowanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAllowanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceUsageResp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceUsageResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceUsage"));
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
