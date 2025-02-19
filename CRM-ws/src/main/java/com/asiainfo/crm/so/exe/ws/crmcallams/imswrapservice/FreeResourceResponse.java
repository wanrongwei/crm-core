/**
 * FreeResourceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class FreeResourceResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BaseResponse  implements java.io.Serializable {
    private java.lang.Integer result;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CommParaOut commonOut;

    public FreeResourceResponse() {
    }

    public FreeResourceResponse(
           java.lang.Integer result,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CommParaOut commonOut) {
        this.result = result;
        this.commonOut = commonOut;
    }


    /**
     * Gets the result value for this FreeResourceResponse.
     * 
     * @return result
     */
    public java.lang.Integer getResult() {
        return result;
    }


    /**
     * Sets the result value for this FreeResourceResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.Integer result) {
        this.result = result;
    }


    /**
     * Gets the commonOut value for this FreeResourceResponse.
     * 
     * @return commonOut
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CommParaOut getCommonOut() {
        return commonOut;
    }


    /**
     * Sets the commonOut value for this FreeResourceResponse.
     * 
     * @param commonOut
     */
    public void setCommonOut(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CommParaOut commonOut) {
        this.commonOut = commonOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeResourceResponse)) return false;
        FreeResourceResponse other = (FreeResourceResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.commonOut==null && other.getCommonOut()==null) || 
             (this.commonOut!=null &&
              this.commonOut.equals(other.getCommonOut())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getCommonOut() != null) {
            _hashCode += getCommonOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeResourceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commonOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "commParaOut"));
        elemField.setMinOccurs(0);
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
