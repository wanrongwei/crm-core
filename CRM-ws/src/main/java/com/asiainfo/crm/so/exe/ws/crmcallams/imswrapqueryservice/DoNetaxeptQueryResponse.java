/**
 * DoNetaxeptQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoNetaxeptQueryResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.NetaxeptPaymentInfo paymentInfo;

    public DoNetaxeptQueryResponse() {
    }

    public DoNetaxeptQueryResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.NetaxeptPaymentInfo paymentInfo) {
        super(
            responseHead);
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the paymentInfo value for this DoNetaxeptQueryResponse.
     * 
     * @return paymentInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.NetaxeptPaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this DoNetaxeptQueryResponse.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.NetaxeptPaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNetaxeptQueryResponse)) return false;
        DoNetaxeptQueryResponse other = (DoNetaxeptQueryResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo())));
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
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoNetaxeptQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptPaymentInfo"));
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
