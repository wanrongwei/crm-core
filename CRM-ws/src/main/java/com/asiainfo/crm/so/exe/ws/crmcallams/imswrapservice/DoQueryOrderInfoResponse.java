/**
 * DoQueryOrderInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryOrderInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderOut[] qryOrderOut;

    public DoQueryOrderInfoResponse() {
    }

    public DoQueryOrderInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderOut[] qryOrderOut) {
        super(
            responseHead);
        this.qryOrderOut = qryOrderOut;
    }


    /**
     * Gets the qryOrderOut value for this DoQueryOrderInfoResponse.
     * 
     * @return qryOrderOut
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderOut[] getQryOrderOut() {
        return qryOrderOut;
    }


    /**
     * Sets the qryOrderOut value for this DoQueryOrderInfoResponse.
     * 
     * @param qryOrderOut
     */
    public void setQryOrderOut(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderOut[] qryOrderOut) {
        this.qryOrderOut = qryOrderOut;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderOut getQryOrderOut(int i) {
        return this.qryOrderOut[i];
    }

    public void setQryOrderOut(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderOut _value) {
        this.qryOrderOut[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryOrderInfoResponse)) return false;
        DoQueryOrderInfoResponse other = (DoQueryOrderInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.qryOrderOut==null && other.getQryOrderOut()==null) || 
             (this.qryOrderOut!=null &&
              java.util.Arrays.equals(this.qryOrderOut, other.getQryOrderOut())));
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
        if (getQryOrderOut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQryOrderOut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQryOrderOut(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryOrderInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryOrderInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qryOrderOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qryOrderOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryOrderOut"));
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
