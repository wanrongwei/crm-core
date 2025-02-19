/**
 * ChgGroupProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class ChgGroupProduct  implements java.io.Serializable {
    private java.lang.String outer_group_id;

    private java.lang.Long group_id;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] prod_order_list;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SpecialNumberOper[] specialNumberOperList;

    public ChgGroupProduct() {
    }

    public ChgGroupProduct(
           java.lang.String outer_group_id,
           java.lang.Long group_id,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] prod_order_list,
           com.asiainfo.crm.cm.dk.ws.imsservice.SpecialNumberOper[] specialNumberOperList) {
           this.outer_group_id = outer_group_id;
           this.group_id = group_id;
           this.prod_order_list = prod_order_list;
           this.specialNumberOperList = specialNumberOperList;
    }


    /**
     * Gets the outer_group_id value for this ChgGroupProduct.
     * 
     * @return outer_group_id
     */
    public java.lang.String getOuter_group_id() {
        return outer_group_id;
    }


    /**
     * Sets the outer_group_id value for this ChgGroupProduct.
     * 
     * @param outer_group_id
     */
    public void setOuter_group_id(java.lang.String outer_group_id) {
        this.outer_group_id = outer_group_id;
    }


    /**
     * Gets the group_id value for this ChgGroupProduct.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this ChgGroupProduct.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the prod_order_list value for this ChgGroupProduct.
     * 
     * @return prod_order_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] getProd_order_list() {
        return prod_order_list;
    }


    /**
     * Sets the prod_order_list value for this ChgGroupProduct.
     * 
     * @param prod_order_list
     */
    public void setProd_order_list(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] prod_order_list) {
        this.prod_order_list = prod_order_list;
    }


    /**
     * Gets the specialNumberOperList value for this ChgGroupProduct.
     * 
     * @return specialNumberOperList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SpecialNumberOper[] getSpecialNumberOperList() {
        return specialNumberOperList;
    }


    /**
     * Sets the specialNumberOperList value for this ChgGroupProduct.
     * 
     * @param specialNumberOperList
     */
    public void setSpecialNumberOperList(com.asiainfo.crm.cm.dk.ws.imsservice.SpecialNumberOper[] specialNumberOperList) {
        this.specialNumberOperList = specialNumberOperList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChgGroupProduct)) return false;
        ChgGroupProduct other = (ChgGroupProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_group_id==null && other.getOuter_group_id()==null) || 
             (this.outer_group_id!=null &&
              this.outer_group_id.equals(other.getOuter_group_id()))) &&
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id()))) &&
            ((this.prod_order_list==null && other.getProd_order_list()==null) || 
             (this.prod_order_list!=null &&
              java.util.Arrays.equals(this.prod_order_list, other.getProd_order_list()))) &&
            ((this.specialNumberOperList==null && other.getSpecialNumberOperList()==null) || 
             (this.specialNumberOperList!=null &&
              java.util.Arrays.equals(this.specialNumberOperList, other.getSpecialNumberOperList())));
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
        if (getOuter_group_id() != null) {
            _hashCode += getOuter_group_id().hashCode();
        }
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getProd_order_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProd_order_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProd_order_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecialNumberOperList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialNumberOperList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialNumberOperList(), i);
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
        new org.apache.axis.description.TypeDesc(ChgGroupProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "chgGroupProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prod_order_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prod_order_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderOperList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialNumberOperList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialNumberOperList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberOper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "specialNumberOperList"));
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
