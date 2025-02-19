/**
 * DoQueryPointInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryPointInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryPointOut[] qryPointOutList;

    public DoQueryPointInfoResponse() {
    }

    public DoQueryPointInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryPointOut[] qryPointOutList) {
        super(
            responseHead);
        this.qryPointOutList = qryPointOutList;
    }


    /**
     * Gets the qryPointOutList value for this DoQueryPointInfoResponse.
     * 
     * @return qryPointOutList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryPointOut[] getQryPointOutList() {
        return qryPointOutList;
    }


    /**
     * Sets the qryPointOutList value for this DoQueryPointInfoResponse.
     * 
     * @param qryPointOutList
     */
    public void setQryPointOutList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryPointOut[] qryPointOutList) {
        this.qryPointOutList = qryPointOutList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryPointOut getQryPointOutList(int i) {
        return this.qryPointOutList[i];
    }

    public void setQryPointOutList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryPointOut _value) {
        this.qryPointOutList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryPointInfoResponse)) return false;
        DoQueryPointInfoResponse other = (DoQueryPointInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.qryPointOutList==null && other.getQryPointOutList()==null) || 
             (this.qryPointOutList!=null &&
              java.util.Arrays.equals(this.qryPointOutList, other.getQryPointOutList())));
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
        if (getQryPointOutList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQryPointOutList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQryPointOutList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryPointInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPointInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qryPointOutList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qryPointOutList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryPointOut"));
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
