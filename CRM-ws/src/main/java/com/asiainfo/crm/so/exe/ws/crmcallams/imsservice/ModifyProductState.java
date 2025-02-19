/**
 * ModifyProductState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class ModifyProductState  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Long product_id;

    private java.lang.Long offer_id;

    private java.lang.Short new_state;

    private java.lang.String action_date;

    private java.lang.Long user_id;

    public ModifyProductState() {
    }

    public ModifyProductState(
           java.lang.String phone_id,
           java.lang.Long product_id,
           java.lang.Long offer_id,
           java.lang.Short new_state,
           java.lang.String action_date,
           java.lang.Long user_id) {
           this.phone_id = phone_id;
           this.product_id = product_id;
           this.offer_id = offer_id;
           this.new_state = new_state;
           this.action_date = action_date;
           this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this ModifyProductState.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ModifyProductState.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the product_id value for this ModifyProductState.
     * 
     * @return product_id
     */
    public java.lang.Long getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this ModifyProductState.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.Long product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the offer_id value for this ModifyProductState.
     * 
     * @return offer_id
     */
    public java.lang.Long getOffer_id() {
        return offer_id;
    }


    /**
     * Sets the offer_id value for this ModifyProductState.
     * 
     * @param offer_id
     */
    public void setOffer_id(java.lang.Long offer_id) {
        this.offer_id = offer_id;
    }


    /**
     * Gets the new_state value for this ModifyProductState.
     * 
     * @return new_state
     */
    public java.lang.Short getNew_state() {
        return new_state;
    }


    /**
     * Sets the new_state value for this ModifyProductState.
     * 
     * @param new_state
     */
    public void setNew_state(java.lang.Short new_state) {
        this.new_state = new_state;
    }


    /**
     * Gets the action_date value for this ModifyProductState.
     * 
     * @return action_date
     */
    public java.lang.String getAction_date() {
        return action_date;
    }


    /**
     * Sets the action_date value for this ModifyProductState.
     * 
     * @param action_date
     */
    public void setAction_date(java.lang.String action_date) {
        this.action_date = action_date;
    }


    /**
     * Gets the user_id value for this ModifyProductState.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this ModifyProductState.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof ModifyProductState)) return false;
        ModifyProductState other = (ModifyProductState) obj;
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
            ((this.product_id==null && other.getProduct_id()==null) || 
             (this.product_id!=null &&
              this.product_id.equals(other.getProduct_id()))) &&
            ((this.offer_id==null && other.getOffer_id()==null) || 
             (this.offer_id!=null &&
              this.offer_id.equals(other.getOffer_id()))) &&
            ((this.new_state==null && other.getNew_state()==null) || 
             (this.new_state!=null &&
              this.new_state.equals(other.getNew_state()))) &&
            ((this.action_date==null && other.getAction_date()==null) || 
             (this.action_date!=null &&
              this.action_date.equals(other.getAction_date()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id())));
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
        if (getProduct_id() != null) {
            _hashCode += getProduct_id().hashCode();
        }
        if (getOffer_id() != null) {
            _hashCode += getOffer_id().hashCode();
        }
        if (getNew_state() != null) {
            _hashCode += getNew_state().hashCode();
        }
        if (getAction_date() != null) {
            _hashCode += getAction_date().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyProductState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "modifyProductState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
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
        elemField.setFieldName("offer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
