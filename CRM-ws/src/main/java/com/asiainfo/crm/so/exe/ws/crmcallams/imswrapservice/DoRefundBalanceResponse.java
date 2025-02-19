/**
 * DoRefundBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoRefundBalanceResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalance assetChangeResult;

    public DoRefundBalanceResponse() {
    }

    public DoRefundBalanceResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalance assetChangeResult) {
        super(
            responseHead);
        this.assetChangeResult = assetChangeResult;
    }


    /**
     * Gets the assetChangeResult value for this DoRefundBalanceResponse.
     * 
     * @return assetChangeResult
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalance getAssetChangeResult() {
        return assetChangeResult;
    }


    /**
     * Sets the assetChangeResult value for this DoRefundBalanceResponse.
     * 
     * @param assetChangeResult
     */
    public void setAssetChangeResult(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalance assetChangeResult) {
        this.assetChangeResult = assetChangeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRefundBalanceResponse)) return false;
        DoRefundBalanceResponse other = (DoRefundBalanceResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetChangeResult==null && other.getAssetChangeResult()==null) || 
             (this.assetChangeResult!=null &&
              this.assetChangeResult.equals(other.getAssetChangeResult())));
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
        if (getAssetChangeResult() != null) {
            _hashCode += getAssetChangeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRefundBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRefundBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetChangeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetChangeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundBalance"));
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
