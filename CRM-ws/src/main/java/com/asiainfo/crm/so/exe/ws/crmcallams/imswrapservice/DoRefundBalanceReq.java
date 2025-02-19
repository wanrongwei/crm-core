/**
 * DoRefundBalanceReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoRefundBalanceReq  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalanceInfo refundBalInfoIn;

    public DoRefundBalanceReq() {
    }

    public DoRefundBalanceReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalanceInfo refundBalInfoIn) {
        super(
            responseHead);
        this.refundBalInfoIn = refundBalInfoIn;
    }


    /**
     * Gets the refundBalInfoIn value for this DoRefundBalanceReq.
     * 
     * @return refundBalInfoIn
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalanceInfo getRefundBalInfoIn() {
        return refundBalInfoIn;
    }


    /**
     * Sets the refundBalInfoIn value for this DoRefundBalanceReq.
     * 
     * @param refundBalInfoIn
     */
    public void setRefundBalInfoIn(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalanceInfo refundBalInfoIn) {
        this.refundBalInfoIn = refundBalInfoIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRefundBalanceReq)) return false;
        DoRefundBalanceReq other = (DoRefundBalanceReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.refundBalInfoIn==null && other.getRefundBalInfoIn()==null) || 
             (this.refundBalInfoIn!=null &&
              this.refundBalInfoIn.equals(other.getRefundBalInfoIn())));
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
        if (getRefundBalInfoIn() != null) {
            _hashCode += getRefundBalInfoIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRefundBalanceReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRefundBalanceReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundBalInfoIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundBalInfoIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundBalanceInfo"));
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
