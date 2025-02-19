/**
 * SQueryMaxFreeResourceReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryMaxFreeResourceReq  implements java.io.Serializable {
    private java.lang.String acct_id;

    private java.lang.Long product_id;

    private java.lang.Long product_sequence_id;

    private java.lang.String product_name;

    public SQueryMaxFreeResourceReq() {
    }

    public SQueryMaxFreeResourceReq(
           java.lang.String acct_id,
           java.lang.Long product_id,
           java.lang.Long product_sequence_id,
           java.lang.String product_name) {
           this.acct_id = acct_id;
           this.product_id = product_id;
           this.product_sequence_id = product_sequence_id;
           this.product_name = product_name;
    }


    /**
     * Gets the acct_id value for this SQueryMaxFreeResourceReq.
     * 
     * @return acct_id
     */
    public java.lang.String getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SQueryMaxFreeResourceReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.String acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the product_id value for this SQueryMaxFreeResourceReq.
     * 
     * @return product_id
     */
    public java.lang.Long getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this SQueryMaxFreeResourceReq.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.Long product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the product_sequence_id value for this SQueryMaxFreeResourceReq.
     * 
     * @return product_sequence_id
     */
    public java.lang.Long getProduct_sequence_id() {
        return product_sequence_id;
    }


    /**
     * Sets the product_sequence_id value for this SQueryMaxFreeResourceReq.
     * 
     * @param product_sequence_id
     */
    public void setProduct_sequence_id(java.lang.Long product_sequence_id) {
        this.product_sequence_id = product_sequence_id;
    }


    /**
     * Gets the product_name value for this SQueryMaxFreeResourceReq.
     * 
     * @return product_name
     */
    public java.lang.String getProduct_name() {
        return product_name;
    }


    /**
     * Sets the product_name value for this SQueryMaxFreeResourceReq.
     * 
     * @param product_name
     */
    public void setProduct_name(java.lang.String product_name) {
        this.product_name = product_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryMaxFreeResourceReq)) return false;
        SQueryMaxFreeResourceReq other = (SQueryMaxFreeResourceReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.product_id==null && other.getProduct_id()==null) || 
             (this.product_id!=null &&
              this.product_id.equals(other.getProduct_id()))) &&
            ((this.product_sequence_id==null && other.getProduct_sequence_id()==null) || 
             (this.product_sequence_id!=null &&
              this.product_sequence_id.equals(other.getProduct_sequence_id()))) &&
            ((this.product_name==null && other.getProduct_name()==null) || 
             (this.product_name!=null &&
              this.product_name.equals(other.getProduct_name())));
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
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getProduct_id() != null) {
            _hashCode += getProduct_id().hashCode();
        }
        if (getProduct_sequence_id() != null) {
            _hashCode += getProduct_sequence_id().hashCode();
        }
        if (getProduct_name() != null) {
            _hashCode += getProduct_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryMaxFreeResourceReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMaxFreeResourceReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("product_sequence_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_sequence_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_name"));
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
