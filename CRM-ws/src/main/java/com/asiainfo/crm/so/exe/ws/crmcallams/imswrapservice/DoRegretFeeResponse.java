/**
 * DoRegretFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoRegretFeeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRecOrderInfo[] queryOut;

    public DoRegretFeeResponse() {
    }

    public DoRegretFeeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRecOrderInfo[] queryOut) {
        super(
            responseHead);
        this.queryOut = queryOut;
    }


    /**
     * Gets the queryOut value for this DoRegretFeeResponse.
     * 
     * @return queryOut
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRecOrderInfo[] getQueryOut() {
        return queryOut;
    }


    /**
     * Sets the queryOut value for this DoRegretFeeResponse.
     * 
     * @param queryOut
     */
    public void setQueryOut(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRecOrderInfo[] queryOut) {
        this.queryOut = queryOut;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRecOrderInfo getQueryOut(int i) {
        return this.queryOut[i];
    }

    public void setQueryOut(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRecOrderInfo _value) {
        this.queryOut[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRegretFeeResponse)) return false;
        DoRegretFeeResponse other = (DoRegretFeeResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.queryOut==null && other.getQueryOut()==null) || 
             (this.queryOut!=null &&
              java.util.Arrays.equals(this.queryOut, other.getQueryOut())));
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
        if (getQueryOut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryOut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryOut(), i);
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
        new org.apache.axis.description.TypeDesc(DoRegretFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRegretFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRecOrderInfo"));
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
