/**
 * InnerBaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class InnerBaseResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CbsErrorMsg errorMsg;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPage sPage;

    public InnerBaseResponse() {
    }

    public InnerBaseResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CbsErrorMsg errorMsg,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPage sPage) {
        this.errorMsg = errorMsg;
        this.sPage = sPage;
    }


    /**
     * Gets the errorMsg value for this InnerBaseResponse.
     * 
     * @return errorMsg
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CbsErrorMsg getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this InnerBaseResponse.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CbsErrorMsg errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the sPage value for this InnerBaseResponse.
     * 
     * @return sPage
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPage getSPage() {
        return sPage;
    }


    /**
     * Sets the sPage value for this InnerBaseResponse.
     * 
     * @param sPage
     */
    public void setSPage(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPage sPage) {
        this.sPage = sPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof InnerBaseResponse)) return false;
        InnerBaseResponse other = (InnerBaseResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.sPage==null && other.getSPage()==null) || 
             (this.sPage!=null &&
              this.sPage.equals(other.getSPage())));
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
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getSPage() != null) {
            _hashCode += getSPage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InnerBaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "innerBaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage"));
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
