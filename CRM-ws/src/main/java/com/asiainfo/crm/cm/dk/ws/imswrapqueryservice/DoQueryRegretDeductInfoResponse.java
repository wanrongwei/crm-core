/**
 * DoQueryRegretDeductInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryRegretDeductInfoResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRecOrderInfo[] queryOut;

    public DoQueryRegretDeductInfoResponse() {
    }

    public DoQueryRegretDeductInfoResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRecOrderInfo[] queryOut) {
        super(
            responseHead);
        this.queryOut = queryOut;
    }


    /**
     * Gets the queryOut value for this DoQueryRegretDeductInfoResponse.
     * 
     * @return queryOut
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRecOrderInfo[] getQueryOut() {
        return queryOut;
    }


    /**
     * Sets the queryOut value for this DoQueryRegretDeductInfoResponse.
     * 
     * @param queryOut
     */
    public void setQueryOut(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRecOrderInfo[] queryOut) {
        this.queryOut = queryOut;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRecOrderInfo getQueryOut(int i) {
        return this.queryOut[i];
    }

    public void setQueryOut(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRecOrderInfo _value) {
        this.queryOut[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryRegretDeductInfoResponse)) return false;
        DoQueryRegretDeductInfoResponse other = (DoQueryRegretDeductInfoResponse) obj;
        if (obj == null) return false;
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
        new org.apache.axis.description.TypeDesc(DoQueryRegretDeductInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryRegretDeductInfoResponse"));
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
