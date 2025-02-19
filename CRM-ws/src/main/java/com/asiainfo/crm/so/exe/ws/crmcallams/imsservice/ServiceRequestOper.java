/**
 * ServiceRequestOper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class ServiceRequestOper  implements java.io.Serializable {
    private java.lang.Short service_oper_type;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequest[] serviceRequestList;

    public ServiceRequestOper() {
    }

    public ServiceRequestOper(
           java.lang.Short service_oper_type,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequest[] serviceRequestList) {
           this.service_oper_type = service_oper_type;
           this.serviceRequestList = serviceRequestList;
    }


    /**
     * Gets the service_oper_type value for this ServiceRequestOper.
     * 
     * @return service_oper_type
     */
    public java.lang.Short getService_oper_type() {
        return service_oper_type;
    }


    /**
     * Sets the service_oper_type value for this ServiceRequestOper.
     * 
     * @param service_oper_type
     */
    public void setService_oper_type(java.lang.Short service_oper_type) {
        this.service_oper_type = service_oper_type;
    }


    /**
     * Gets the serviceRequestList value for this ServiceRequestOper.
     * 
     * @return serviceRequestList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequest[] getServiceRequestList() {
        return serviceRequestList;
    }


    /**
     * Sets the serviceRequestList value for this ServiceRequestOper.
     * 
     * @param serviceRequestList
     */
    public void setServiceRequestList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequest[] serviceRequestList) {
        this.serviceRequestList = serviceRequestList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRequestOper)) return false;
        ServiceRequestOper other = (ServiceRequestOper) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service_oper_type==null && other.getService_oper_type()==null) || 
             (this.service_oper_type!=null &&
              this.service_oper_type.equals(other.getService_oper_type()))) &&
            ((this.serviceRequestList==null && other.getServiceRequestList()==null) || 
             (this.serviceRequestList!=null &&
              java.util.Arrays.equals(this.serviceRequestList, other.getServiceRequestList())));
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
        if (getService_oper_type() != null) {
            _hashCode += getService_oper_type().hashCode();
        }
        if (getServiceRequestList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceRequestList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceRequestList(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceRequestOper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequestOper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRequestList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceRequestList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "serviceRequest_Item"));
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
