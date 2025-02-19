/**
 * DoQueryMaxFreeResourceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class DoQueryMaxFreeResourceResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.MaxFreeResource[] maxFreeResourceList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.FreeResource[] freeResourceList;

    public DoQueryMaxFreeResourceResponse() {
    }

    public DoQueryMaxFreeResourceResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.MaxFreeResource[] maxFreeResourceList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.FreeResource[] freeResourceList) {
        super(
            responseHead);
        this.maxFreeResourceList = maxFreeResourceList;
        this.freeResourceList = freeResourceList;
    }


    /**
     * Gets the maxFreeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @return maxFreeResourceList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.MaxFreeResource[] getMaxFreeResourceList() {
        return maxFreeResourceList;
    }


    /**
     * Sets the maxFreeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @param maxFreeResourceList
     */
    public void setMaxFreeResourceList(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.MaxFreeResource[] maxFreeResourceList) {
        this.maxFreeResourceList = maxFreeResourceList;
    }


    /**
     * Gets the freeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @return freeResourceList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.FreeResource[] getFreeResourceList() {
        return freeResourceList;
    }


    /**
     * Sets the freeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @param freeResourceList
     */
    public void setFreeResourceList(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.FreeResource[] freeResourceList) {
        this.freeResourceList = freeResourceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DoQueryMaxFreeResourceResponse)) return false;
        DoQueryMaxFreeResourceResponse other = (DoQueryMaxFreeResourceResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxFreeResourceList==null && other.getMaxFreeResourceList()==null) || 
             (this.maxFreeResourceList!=null &&
              java.util.Arrays.equals(this.maxFreeResourceList, other.getMaxFreeResourceList()))) &&
            ((this.freeResourceList==null && other.getFreeResourceList()==null) || 
             (this.freeResourceList!=null &&
              java.util.Arrays.equals(this.freeResourceList, other.getFreeResourceList())));
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
        if (getMaxFreeResourceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaxFreeResourceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaxFreeResourceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeResourceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryMaxFreeResourceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMaxFreeResourceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFreeResourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFreeResourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "maxFreeResourceList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceList"));
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
