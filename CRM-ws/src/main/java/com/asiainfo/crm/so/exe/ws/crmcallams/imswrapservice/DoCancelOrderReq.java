/**
 * DoCancelOrderReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoCancelOrderReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo orderInfo;

    public DoCancelOrderReq() {
    }

    public DoCancelOrderReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo orderInfo) {
           this.orderInfo = orderInfo;
    }


    /**
     * Gets the orderInfo value for this DoCancelOrderReq.
     * 
     * @return orderInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo getOrderInfo() {
        return orderInfo;
    }


    /**
     * Sets the orderInfo value for this DoCancelOrderReq.
     * 
     * @param orderInfo
     */
    public void setOrderInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelOrderReq)) return false;
        DoCancelOrderReq other = (DoCancelOrderReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderInfo==null && other.getOrderInfo()==null) || 
             (this.orderInfo!=null &&
              this.orderInfo.equals(other.getOrderInfo())));
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
        if (getOrderInfo() != null) {
            _hashCode += getOrderInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCancelOrderReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOrderReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderInfo"));
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
