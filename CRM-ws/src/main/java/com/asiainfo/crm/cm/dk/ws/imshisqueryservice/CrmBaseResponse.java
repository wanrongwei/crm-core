/**
 * CrmBaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class CrmBaseResponse  extends com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imshisqueryservice.ResponseHead responseHead;

    public CrmBaseResponse() {
    }

    public CrmBaseResponse(
           com.asiainfo.crm.cm.dk.ws.imshisqueryservice.ResponseHead responseHead) {
        this.responseHead = responseHead;
    }


    /**
     * Gets the responseHead value for this CrmBaseResponse.
     * 
     * @return responseHead
     */
    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.ResponseHead getResponseHead() {
        return responseHead;
    }


    /**
     * Sets the responseHead value for this CrmBaseResponse.
     * 
     * @param responseHead
     */
    public void setResponseHead(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrmBaseResponse)) return false;
        CrmBaseResponse other = (CrmBaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.responseHead==null && other.getResponseHead()==null) || 
             (this.responseHead!=null &&
              this.responseHead.equals(other.getResponseHead())));
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
        if (getResponseHead() != null) {
            _hashCode += getResponseHead().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrmBaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHead");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead"));
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
