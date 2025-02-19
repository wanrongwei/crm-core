/**
 * DoQueryMaxFreeResourceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryMaxFreeResourceResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.MaxFreeResource[] maxFreeResourceList;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] freeResourceList;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResourceLimit[] freeResourceLimitList;

    public DoQueryMaxFreeResourceResponse() {
    }

    public DoQueryMaxFreeResourceResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.MaxFreeResource[] maxFreeResourceList,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] freeResourceList,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResourceLimit[] freeResourceLimitList) {
        super(
            responseHead);
        this.maxFreeResourceList = maxFreeResourceList;
        this.freeResourceList = freeResourceList;
        this.freeResourceLimitList = freeResourceLimitList;
    }


    /**
     * Gets the maxFreeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @return maxFreeResourceList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.MaxFreeResource[] getMaxFreeResourceList() {
        return maxFreeResourceList;
    }


    /**
     * Sets the maxFreeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @param maxFreeResourceList
     */
    public void setMaxFreeResourceList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.MaxFreeResource[] maxFreeResourceList) {
        this.maxFreeResourceList = maxFreeResourceList;
    }


    /**
     * Gets the freeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @return freeResourceList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] getFreeResourceList() {
        return freeResourceList;
    }


    /**
     * Sets the freeResourceList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @param freeResourceList
     */
    public void setFreeResourceList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[] freeResourceList) {
        this.freeResourceList = freeResourceList;
    }


    /**
     * Gets the freeResourceLimitList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @return freeResourceLimitList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResourceLimit[] getFreeResourceLimitList() {
        return freeResourceLimitList;
    }


    /**
     * Sets the freeResourceLimitList value for this DoQueryMaxFreeResourceResponse.
     * 
     * @param freeResourceLimitList
     */
    public void setFreeResourceLimitList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResourceLimit[] freeResourceLimitList) {
        this.freeResourceLimitList = freeResourceLimitList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResourceLimit getFreeResourceLimitList(int i) {
        return this.freeResourceLimitList[i];
    }

    public void setFreeResourceLimitList(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResourceLimit _value) {
        this.freeResourceLimitList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryMaxFreeResourceResponse)) return false;
        DoQueryMaxFreeResourceResponse other = (DoQueryMaxFreeResourceResponse) obj;
        if (obj == null) return false;
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
              java.util.Arrays.equals(this.freeResourceList, other.getFreeResourceList()))) &&
            ((this.freeResourceLimitList==null && other.getFreeResourceLimitList()==null) || 
             (this.freeResourceLimitList!=null &&
              java.util.Arrays.equals(this.freeResourceLimitList, other.getFreeResourceLimitList())));
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
        if (getFreeResourceLimitList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceLimitList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceLimitList(), i);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceLimitList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceLimitList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
