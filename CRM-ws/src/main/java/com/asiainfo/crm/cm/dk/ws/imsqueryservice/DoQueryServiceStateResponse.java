/**
 * DoQueryServiceStateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryServiceStateResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.ServiceStateResult[] service_state_list;

    public DoQueryServiceStateResponse() {
    }

    public DoQueryServiceStateResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ServiceStateResult[] service_state_list) {
        super(
            responseHead);
        this.service_state_list = service_state_list;
    }


    /**
     * Gets the service_state_list value for this DoQueryServiceStateResponse.
     * 
     * @return service_state_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.ServiceStateResult[] getService_state_list() {
        return service_state_list;
    }


    /**
     * Sets the service_state_list value for this DoQueryServiceStateResponse.
     * 
     * @param service_state_list
     */
    public void setService_state_list(com.asiainfo.crm.cm.dk.ws.imsqueryservice.ServiceStateResult[] service_state_list) {
        this.service_state_list = service_state_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryServiceStateResponse)) return false;
        DoQueryServiceStateResponse other = (DoQueryServiceStateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.service_state_list==null && other.getService_state_list()==null) || 
             (this.service_state_list!=null &&
              java.util.Arrays.equals(this.service_state_list, other.getService_state_list())));
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
        if (getService_state_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService_state_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService_state_list(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryServiceStateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryServiceStateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_state_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_state_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "serviceState"));
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
