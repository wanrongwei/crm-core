/**
 * SProductOrderOper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SProductOrderOper  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] prod_list;

    public SProductOrderOper() {
    }

    public SProductOrderOper(
           java.lang.Short oper_type,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] prod_list) {
           this.oper_type = oper_type;
           this.prod_list = prod_list;
    }


    /**
     * Gets the oper_type value for this SProductOrderOper.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this SProductOrderOper.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the prod_list value for this SProductOrderOper.
     * 
     * @return prod_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] getProd_list() {
        return prod_list;
    }


    /**
     * Sets the prod_list value for this SProductOrderOper.
     * 
     * @param prod_list
     */
    public void setProd_list(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] prod_list) {
        this.prod_list = prod_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SProductOrderOper)) return false;
        SProductOrderOper other = (SProductOrderOper) obj;
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
            ((this.prod_list==null && other.getProd_list()==null) || 
             (this.prod_list!=null &&
              java.util.Arrays.equals(this.prod_list, other.getProd_list())));
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
        if (getProd_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProd_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProd_list(), i);
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
        new org.apache.axis.description.TypeDesc(SProductOrderOper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prod_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prod_list"));
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
