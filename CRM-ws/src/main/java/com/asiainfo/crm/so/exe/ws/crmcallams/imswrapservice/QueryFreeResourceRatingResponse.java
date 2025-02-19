/**
 * QueryFreeResourceRatingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class QueryFreeResourceRatingResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource[] sfreeResourceListOut;

    public QueryFreeResourceRatingResponse() {
    }

    public QueryFreeResourceRatingResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource[] sfreeResourceListOut) {
        super(
            responseHead);
        this.sfreeResourceListOut = sfreeResourceListOut;
    }


    /**
     * Gets the sfreeResourceListOut value for this QueryFreeResourceRatingResponse.
     * 
     * @return sfreeResourceListOut
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource[] getSfreeResourceListOut() {
        return sfreeResourceListOut;
    }


    /**
     * Sets the sfreeResourceListOut value for this QueryFreeResourceRatingResponse.
     * 
     * @param sfreeResourceListOut
     */
    public void setSfreeResourceListOut(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource[] sfreeResourceListOut) {
        this.sfreeResourceListOut = sfreeResourceListOut;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource getSfreeResourceListOut(int i) {
        return this.sfreeResourceListOut[i];
    }

    public void setSfreeResourceListOut(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource _value) {
        this.sfreeResourceListOut[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFreeResourceRatingResponse)) return false;
        QueryFreeResourceRatingResponse other = (QueryFreeResourceRatingResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sfreeResourceListOut==null && other.getSfreeResourceListOut()==null) || 
             (this.sfreeResourceListOut!=null &&
              java.util.Arrays.equals(this.sfreeResourceListOut, other.getSfreeResourceListOut())));
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
        if (getSfreeResourceListOut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSfreeResourceListOut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSfreeResourceListOut(), i);
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
        new org.apache.axis.description.TypeDesc(QueryFreeResourceRatingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryFreeResourceRatingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfreeResourceListOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sfreeResourceListOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFreeResource"));
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
