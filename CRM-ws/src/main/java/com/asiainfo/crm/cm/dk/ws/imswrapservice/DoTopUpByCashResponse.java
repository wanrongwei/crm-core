/**
 * DoTopUpByCashResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoTopUpByCashResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.STopUpResponse topUpResp;

    public DoTopUpByCashResponse() {
    }

    public DoTopUpByCashResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.STopUpResponse topUpResp) {
        super(
            responseHead);
        this.topUpResp = topUpResp;
    }


    /**
     * Gets the topUpResp value for this DoTopUpByCashResponse.
     * 
     * @return topUpResp
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.STopUpResponse getTopUpResp() {
        return topUpResp;
    }


    /**
     * Sets the topUpResp value for this DoTopUpByCashResponse.
     * 
     * @param topUpResp
     */
    public void setTopUpResp(com.asiainfo.crm.cm.dk.ws.imswrapservice.STopUpResponse topUpResp) {
        this.topUpResp = topUpResp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoTopUpByCashResponse)) return false;
        DoTopUpByCashResponse other = (DoTopUpByCashResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.topUpResp==null && other.getTopUpResp()==null) || 
             (this.topUpResp!=null &&
              this.topUpResp.equals(other.getTopUpResp())));
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
        if (getTopUpResp() != null) {
            _hashCode += getTopUpResp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoTopUpByCashResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doTopUpByCashResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpResp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topUpResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTopUpResponse"));
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
