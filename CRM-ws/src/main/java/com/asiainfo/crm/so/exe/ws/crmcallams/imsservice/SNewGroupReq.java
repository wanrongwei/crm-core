/**
 * SNewGroupReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SNewGroupReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup groupInfo;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrder[] product_order_list;

    public SNewGroupReq() {
    }

    public SNewGroupReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup groupInfo,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrder[] product_order_list) {
           this.groupInfo = groupInfo;
           this.product_order_list = product_order_list;
    }


    /**
     * Gets the groupInfo value for this SNewGroupReq.
     * 
     * @return groupInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup getGroupInfo() {
        return groupInfo;
    }


    /**
     * Sets the groupInfo value for this SNewGroupReq.
     * 
     * @param groupInfo
     */
    public void setGroupInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup groupInfo) {
        this.groupInfo = groupInfo;
    }


    /**
     * Gets the product_order_list value for this SNewGroupReq.
     * 
     * @return product_order_list
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrder[] getProduct_order_list() {
        return product_order_list;
    }


    /**
     * Sets the product_order_list value for this SNewGroupReq.
     * 
     * @param product_order_list
     */
    public void setProduct_order_list(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrder[] product_order_list) {
        this.product_order_list = product_order_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SNewGroupReq)) return false;
        SNewGroupReq other = (SNewGroupReq) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupInfo==null && other.getGroupInfo()==null) || 
             (this.groupInfo!=null &&
              this.groupInfo.equals(other.getGroupInfo()))) &&
            ((this.product_order_list==null && other.getProduct_order_list()==null) || 
             (this.product_order_list!=null &&
              java.util.Arrays.equals(this.product_order_list, other.getProduct_order_list())));
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
        if (getGroupInfo() != null) {
            _hashCode += getGroupInfo().hashCode();
        }
        if (getProduct_order_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct_order_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct_order_list(), i);
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
        new org.apache.axis.description.TypeDesc(SNewGroupReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNewGroupReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_order_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_order_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
