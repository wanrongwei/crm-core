/**
 * FnOper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class FnOper  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private java.lang.Long product_id;

    private com.asiainfo.crm.cm.dk.ws.imsservice.Fn[] fN_list;

    public FnOper() {
    }

    public FnOper(
           java.lang.Short oper_type,
           java.lang.Long product_id,
           com.asiainfo.crm.cm.dk.ws.imsservice.Fn[] fN_list) {
           this.oper_type = oper_type;
           this.product_id = product_id;
           this.fN_list = fN_list;
    }


    /**
     * Gets the oper_type value for this FnOper.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this FnOper.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the product_id value for this FnOper.
     * 
     * @return product_id
     */
    public java.lang.Long getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this FnOper.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.Long product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the fN_list value for this FnOper.
     * 
     * @return fN_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.Fn[] getFN_list() {
        return fN_list;
    }


    /**
     * Sets the fN_list value for this FnOper.
     * 
     * @param fN_list
     */
    public void setFN_list(com.asiainfo.crm.cm.dk.ws.imsservice.Fn[] fN_list) {
        this.fN_list = fN_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FnOper)) return false;
        FnOper other = (FnOper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oper_type==null && other.getOper_type()==null) || 
             (this.oper_type!=null &&
              this.oper_type.equals(other.getOper_type()))) &&
            ((this.product_id==null && other.getProduct_id()==null) || 
             (this.product_id!=null &&
              this.product_id.equals(other.getProduct_id()))) &&
            ((this.fN_list==null && other.getFN_list()==null) || 
             (this.fN_list!=null &&
              java.util.Arrays.equals(this.fN_list, other.getFN_list())));
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
        if (getOper_type() != null) {
            _hashCode += getOper_type().hashCode();
        }
        if (getProduct_id() != null) {
            _hashCode += getProduct_id().hashCode();
        }
        if (getFN_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFN_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFN_list(), i);
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
        new org.apache.axis.description.TypeDesc(FnOper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnOper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FN_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fN_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fNList_Item"));
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
