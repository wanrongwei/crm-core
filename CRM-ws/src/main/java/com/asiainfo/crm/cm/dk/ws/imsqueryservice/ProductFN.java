/**
 * ProductFN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class ProductFN  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder productOrder;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.Fn[] fNList;

    private java.lang.String phone_id;

    public ProductFN() {
    }

    public ProductFN(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder productOrder,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.Fn[] fNList,
           java.lang.String phone_id) {
           this.productOrder = productOrder;
           this.fNList = fNList;
           this.phone_id = phone_id;
    }


    /**
     * Gets the productOrder value for this ProductFN.
     * 
     * @return productOrder
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder getProductOrder() {
        return productOrder;
    }


    /**
     * Sets the productOrder value for this ProductFN.
     * 
     * @param productOrder
     */
    public void setProductOrder(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder productOrder) {
        this.productOrder = productOrder;
    }


    /**
     * Gets the fNList value for this ProductFN.
     * 
     * @return fNList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.Fn[] getFNList() {
        return fNList;
    }


    /**
     * Sets the fNList value for this ProductFN.
     * 
     * @param fNList
     */
    public void setFNList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.Fn[] fNList) {
        this.fNList = fNList;
    }


    /**
     * Gets the phone_id value for this ProductFN.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ProductFN.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductFN)) return false;
        ProductFN other = (ProductFN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productOrder==null && other.getProductOrder()==null) || 
             (this.productOrder!=null &&
              this.productOrder.equals(other.getProductOrder()))) &&
            ((this.fNList==null && other.getFNList()==null) || 
             (this.fNList!=null &&
              java.util.Arrays.equals(this.fNList, other.getFNList()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id())));
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
        if (getProductOrder() != null) {
            _hashCode += getProductOrder().hashCode();
        }
        if (getFNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFNList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductFN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FNList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fNList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
