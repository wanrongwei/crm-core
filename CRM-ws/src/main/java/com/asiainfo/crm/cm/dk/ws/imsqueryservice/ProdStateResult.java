/**
 * ProdStateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class ProdStateResult  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Long prodcut_id;

    private int offering_id;

    private java.lang.Short offering_type;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.Short prod_state;

    public ProdStateResult() {
    }

    public ProdStateResult(
           java.lang.String phone_id,
           java.lang.Long prodcut_id,
           int offering_id,
           java.lang.Short offering_type,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.Short prod_state) {
           this.phone_id = phone_id;
           this.prodcut_id = prodcut_id;
           this.offering_id = offering_id;
           this.offering_type = offering_type;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.prod_state = prod_state;
    }


    /**
     * Gets the phone_id value for this ProdStateResult.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ProdStateResult.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the prodcut_id value for this ProdStateResult.
     * 
     * @return prodcut_id
     */
    public java.lang.Long getProdcut_id() {
        return prodcut_id;
    }


    /**
     * Sets the prodcut_id value for this ProdStateResult.
     * 
     * @param prodcut_id
     */
    public void setProdcut_id(java.lang.Long prodcut_id) {
        this.prodcut_id = prodcut_id;
    }


    /**
     * Gets the offering_id value for this ProdStateResult.
     * 
     * @return offering_id
     */
    public int getOffering_id() {
        return offering_id;
    }


    /**
     * Sets the offering_id value for this ProdStateResult.
     * 
     * @param offering_id
     */
    public void setOffering_id(int offering_id) {
        this.offering_id = offering_id;
    }


    /**
     * Gets the offering_type value for this ProdStateResult.
     * 
     * @return offering_type
     */
    public java.lang.Short getOffering_type() {
        return offering_type;
    }


    /**
     * Sets the offering_type value for this ProdStateResult.
     * 
     * @param offering_type
     */
    public void setOffering_type(java.lang.Short offering_type) {
        this.offering_type = offering_type;
    }


    /**
     * Gets the valid_date value for this ProdStateResult.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this ProdStateResult.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this ProdStateResult.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this ProdStateResult.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the prod_state value for this ProdStateResult.
     * 
     * @return prod_state
     */
    public java.lang.Short getProd_state() {
        return prod_state;
    }


    /**
     * Sets the prod_state value for this ProdStateResult.
     * 
     * @param prod_state
     */
    public void setProd_state(java.lang.Short prod_state) {
        this.prod_state = prod_state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdStateResult)) return false;
        ProdStateResult other = (ProdStateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.prodcut_id==null && other.getProdcut_id()==null) || 
             (this.prodcut_id!=null &&
              this.prodcut_id.equals(other.getProdcut_id()))) &&
            this.offering_id == other.getOffering_id() &&
            ((this.offering_type==null && other.getOffering_type()==null) || 
             (this.offering_type!=null &&
              this.offering_type.equals(other.getOffering_type()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.prod_state==null && other.getProd_state()==null) || 
             (this.prod_state!=null &&
              this.prod_state.equals(other.getProd_state())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getProdcut_id() != null) {
            _hashCode += getProdcut_id().hashCode();
        }
        _hashCode += getOffering_id();
        if (getOffering_type() != null) {
            _hashCode += getOffering_type().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getProd_state() != null) {
            _hashCode += getProd_state().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdStateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodcut_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodcut_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offering_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offering_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offering_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offering_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prod_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prod_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
