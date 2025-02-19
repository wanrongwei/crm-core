/**
 * CheckTransactionStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class CheckTransactionStatusRequest  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionStatusRequestBody requestBody;

    public CheckTransactionStatusRequest() {
    }

    public CheckTransactionStatusRequest(
           com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionStatusRequestBody requestBody) {
           this.requestBody = requestBody;
    }


    /**
     * Gets the requestBody value for this CheckTransactionStatusRequest.
     * 
     * @return requestBody
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionStatusRequestBody getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this CheckTransactionStatusRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionStatusRequestBody requestBody) {
        this.requestBody = requestBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckTransactionStatusRequest)) return false;
        CheckTransactionStatusRequest other = (CheckTransactionStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestBody==null && other.getRequestBody()==null) || 
             (this.requestBody!=null &&
              this.requestBody.equals(other.getRequestBody())));
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
        if (getRequestBody() != null) {
            _hashCode += getRequestBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckTransactionStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "checkTransactionStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "checkTransactionStatusRequestBody"));
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
