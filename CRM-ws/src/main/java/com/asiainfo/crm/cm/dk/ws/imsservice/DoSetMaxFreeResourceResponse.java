/**
 * DoSetMaxFreeResourceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoSetMaxFreeResourceResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsservice.MaxFreeResourceResponse maxFreeResourceResponseList;

    public DoSetMaxFreeResourceResponse() {
    }

    public DoSetMaxFreeResourceResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsservice.MaxFreeResourceResponse maxFreeResourceResponseList) {
        super(
            responseHead);
        this.maxFreeResourceResponseList = maxFreeResourceResponseList;
    }


    /**
     * Gets the maxFreeResourceResponseList value for this DoSetMaxFreeResourceResponse.
     * 
     * @return maxFreeResourceResponseList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.MaxFreeResourceResponse getMaxFreeResourceResponseList() {
        return maxFreeResourceResponseList;
    }


    /**
     * Sets the maxFreeResourceResponseList value for this DoSetMaxFreeResourceResponse.
     * 
     * @param maxFreeResourceResponseList
     */
    public void setMaxFreeResourceResponseList(com.asiainfo.crm.cm.dk.ws.imsservice.MaxFreeResourceResponse maxFreeResourceResponseList) {
        this.maxFreeResourceResponseList = maxFreeResourceResponseList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSetMaxFreeResourceResponse)) return false;
        DoSetMaxFreeResourceResponse other = (DoSetMaxFreeResourceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxFreeResourceResponseList==null && other.getMaxFreeResourceResponseList()==null) || 
             (this.maxFreeResourceResponseList!=null &&
              this.maxFreeResourceResponseList.equals(other.getMaxFreeResourceResponseList())));
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
        if (getMaxFreeResourceResponseList() != null) {
            _hashCode += getMaxFreeResourceResponseList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSetMaxFreeResourceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetMaxFreeResourceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFreeResourceResponseList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFreeResourceResponseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceResponse"));
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
