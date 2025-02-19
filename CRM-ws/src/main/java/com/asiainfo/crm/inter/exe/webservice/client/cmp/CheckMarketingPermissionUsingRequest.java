/**
 * CheckMarketingPermissionUsingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cmp;

public class CheckMarketingPermissionUsingRequest  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingRequestBody requestBody;

    public CheckMarketingPermissionUsingRequest() {
    }

    public CheckMarketingPermissionUsingRequest(
           com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingRequestBody requestBody) {
           this.requestBody = requestBody;
    }


    /**
     * Gets the requestBody value for this CheckMarketingPermissionUsingRequest.
     * 
     * @return requestBody
     */
    public com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingRequestBody getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this CheckMarketingPermissionUsingRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingRequestBody requestBody) {
        this.requestBody = requestBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckMarketingPermissionUsingRequest)) return false;
        CheckMarketingPermissionUsingRequest other = (CheckMarketingPermissionUsingRequest) obj;
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
        new org.apache.axis.description.TypeDesc(CheckMarketingPermissionUsingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "CheckMarketingPermissionUsingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "CheckMarketingPermissionUsingRequestBody"));
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
