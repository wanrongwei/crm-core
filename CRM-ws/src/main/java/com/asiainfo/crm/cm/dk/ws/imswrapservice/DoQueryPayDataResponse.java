/**
 * DoQueryPayDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoQueryPayDataResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOutResponse sPrintOutResponse;

    public DoQueryPayDataResponse() {
    }

    public DoQueryPayDataResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOutResponse sPrintOutResponse) {
        super(
            responseHead);
        this.sPrintOutResponse = sPrintOutResponse;
    }


    /**
     * Gets the sPrintOutResponse value for this DoQueryPayDataResponse.
     * 
     * @return sPrintOutResponse
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOutResponse getSPrintOutResponse() {
        return sPrintOutResponse;
    }


    /**
     * Sets the sPrintOutResponse value for this DoQueryPayDataResponse.
     * 
     * @param sPrintOutResponse
     */
    public void setSPrintOutResponse(com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOutResponse sPrintOutResponse) {
        this.sPrintOutResponse = sPrintOutResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryPayDataResponse)) return false;
        DoQueryPayDataResponse other = (DoQueryPayDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sPrintOutResponse==null && other.getSPrintOutResponse()==null) || 
             (this.sPrintOutResponse!=null &&
              this.sPrintOutResponse.equals(other.getSPrintOutResponse())));
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
        if (getSPrintOutResponse() != null) {
            _hashCode += getSPrintOutResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryPayDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPrintOutResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sPrintOutResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintOutResponse"));
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
