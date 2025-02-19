/**
 * DoAdjustBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoAdjustBalanceResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalanceAdjustResponse sBalanceAdjustResponse;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceListAdjustResponse;

    public DoAdjustBalanceResponse() {
    }

    public DoAdjustBalanceResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalanceAdjustResponse sBalanceAdjustResponse,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceListAdjustResponse) {
        super(
            responseHead);
        this.sBalanceAdjustResponse = sBalanceAdjustResponse;
        this.freeResourceListAdjustResponse = freeResourceListAdjustResponse;
    }


    /**
     * Gets the sBalanceAdjustResponse value for this DoAdjustBalanceResponse.
     * 
     * @return sBalanceAdjustResponse
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalanceAdjustResponse getSBalanceAdjustResponse() {
        return sBalanceAdjustResponse;
    }


    /**
     * Sets the sBalanceAdjustResponse value for this DoAdjustBalanceResponse.
     * 
     * @param sBalanceAdjustResponse
     */
    public void setSBalanceAdjustResponse(com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalanceAdjustResponse sBalanceAdjustResponse) {
        this.sBalanceAdjustResponse = sBalanceAdjustResponse;
    }


    /**
     * Gets the freeResourceListAdjustResponse value for this DoAdjustBalanceResponse.
     * 
     * @return freeResourceListAdjustResponse
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] getFreeResourceListAdjustResponse() {
        return freeResourceListAdjustResponse;
    }


    /**
     * Sets the freeResourceListAdjustResponse value for this DoAdjustBalanceResponse.
     * 
     * @param freeResourceListAdjustResponse
     */
    public void setFreeResourceListAdjustResponse(com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceListAdjustResponse) {
        this.freeResourceListAdjustResponse = freeResourceListAdjustResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAdjustBalanceResponse)) return false;
        DoAdjustBalanceResponse other = (DoAdjustBalanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sBalanceAdjustResponse==null && other.getSBalanceAdjustResponse()==null) || 
             (this.sBalanceAdjustResponse!=null &&
              this.sBalanceAdjustResponse.equals(other.getSBalanceAdjustResponse()))) &&
            ((this.freeResourceListAdjustResponse==null && other.getFreeResourceListAdjustResponse()==null) || 
             (this.freeResourceListAdjustResponse!=null &&
              java.util.Arrays.equals(this.freeResourceListAdjustResponse, other.getFreeResourceListAdjustResponse())));
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
        if (getSBalanceAdjustResponse() != null) {
            _hashCode += getSBalanceAdjustResponse().hashCode();
        }
        if (getFreeResourceListAdjustResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceListAdjustResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceListAdjustResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAdjustBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBalanceAdjustResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBalanceAdjustResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalanceAdjustResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceListAdjustResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceListAdjustResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceListItem"));
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
