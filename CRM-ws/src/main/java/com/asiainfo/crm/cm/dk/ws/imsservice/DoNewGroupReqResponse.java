/**
 * DoNewGroupReqResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoNewGroupReqResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String outer_group_id;

    private java.lang.Long group_id;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] prod_result_list;

    public DoNewGroupReqResponse() {
    }

    public DoNewGroupReqResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           java.lang.String outer_group_id,
           java.lang.Long group_id,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] prod_result_list) {
        super(
            responseHead);
        this.outer_group_id = outer_group_id;
        this.group_id = group_id;
        this.prod_result_list = prod_result_list;
    }


    /**
     * Gets the outer_group_id value for this DoNewGroupReqResponse.
     * 
     * @return outer_group_id
     */
    public java.lang.String getOuter_group_id() {
        return outer_group_id;
    }


    /**
     * Sets the outer_group_id value for this DoNewGroupReqResponse.
     * 
     * @param outer_group_id
     */
    public void setOuter_group_id(java.lang.String outer_group_id) {
        this.outer_group_id = outer_group_id;
    }


    /**
     * Gets the group_id value for this DoNewGroupReqResponse.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this DoNewGroupReqResponse.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the prod_result_list value for this DoNewGroupReqResponse.
     * 
     * @return prod_result_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] getProd_result_list() {
        return prod_result_list;
    }


    /**
     * Sets the prod_result_list value for this DoNewGroupReqResponse.
     * 
     * @param prod_result_list
     */
    public void setProd_result_list(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] prod_result_list) {
        this.prod_result_list = prod_result_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNewGroupReqResponse)) return false;
        DoNewGroupReqResponse other = (DoNewGroupReqResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.outer_group_id==null && other.getOuter_group_id()==null) || 
             (this.outer_group_id!=null &&
              this.outer_group_id.equals(other.getOuter_group_id()))) &&
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id()))) &&
            ((this.prod_result_list==null && other.getProd_result_list()==null) || 
             (this.prod_result_list!=null &&
              java.util.Arrays.equals(this.prod_result_list, other.getProd_result_list())));
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
        if (getOuter_group_id() != null) {
            _hashCode += getOuter_group_id().hashCode();
        }
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getProd_result_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProd_result_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProd_result_list(), i);
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
        new org.apache.axis.description.TypeDesc(DoNewGroupReqResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNewGroupReqResponse"));
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
        elemField.setFieldName("prod_result_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prod_result_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderResultListItem"));
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
