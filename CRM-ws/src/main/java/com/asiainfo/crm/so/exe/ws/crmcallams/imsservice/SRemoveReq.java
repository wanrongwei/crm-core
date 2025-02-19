/**
 * SRemoveReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SRemoveReq  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.Short last_term_flag;

    private java.lang.Short drop_promotion_flag;

    private java.lang.Short reset_flag;

    public SRemoveReq() {
    }

    public SRemoveReq(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.Short last_term_flag,
           java.lang.Short drop_promotion_flag,
           java.lang.Short reset_flag) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.last_term_flag = last_term_flag;
           this.drop_promotion_flag = drop_promotion_flag;
           this.reset_flag = reset_flag;
    }


    /**
     * Gets the user_id value for this SRemoveReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SRemoveReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SRemoveReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SRemoveReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the last_term_flag value for this SRemoveReq.
     * 
     * @return last_term_flag
     */
    public java.lang.Short getLast_term_flag() {
        return last_term_flag;
    }


    /**
     * Sets the last_term_flag value for this SRemoveReq.
     * 
     * @param last_term_flag
     */
    public void setLast_term_flag(java.lang.Short last_term_flag) {
        this.last_term_flag = last_term_flag;
    }


    /**
     * Gets the drop_promotion_flag value for this SRemoveReq.
     * 
     * @return drop_promotion_flag
     */
    public java.lang.Short getDrop_promotion_flag() {
        return drop_promotion_flag;
    }


    /**
     * Sets the drop_promotion_flag value for this SRemoveReq.
     * 
     * @param drop_promotion_flag
     */
    public void setDrop_promotion_flag(java.lang.Short drop_promotion_flag) {
        this.drop_promotion_flag = drop_promotion_flag;
    }


    /**
     * Gets the reset_flag value for this SRemoveReq.
     * 
     * @return reset_flag
     */
    public java.lang.Short getReset_flag() {
        return reset_flag;
    }


    /**
     * Sets the reset_flag value for this SRemoveReq.
     * 
     * @param reset_flag
     */
    public void setReset_flag(java.lang.Short reset_flag) {
        this.reset_flag = reset_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRemoveReq)) return false;
        SRemoveReq other = (SRemoveReq) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.last_term_flag==null && other.getLast_term_flag()==null) || 
             (this.last_term_flag!=null &&
              this.last_term_flag.equals(other.getLast_term_flag()))) &&
            ((this.drop_promotion_flag==null && other.getDrop_promotion_flag()==null) || 
             (this.drop_promotion_flag!=null &&
              this.drop_promotion_flag.equals(other.getDrop_promotion_flag()))) &&
            ((this.reset_flag==null && other.getReset_flag()==null) || 
             (this.reset_flag!=null &&
              this.reset_flag.equals(other.getReset_flag())));
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getLast_term_flag() != null) {
            _hashCode += getLast_term_flag().hashCode();
        }
        if (getDrop_promotion_flag() != null) {
            _hashCode += getDrop_promotion_flag().hashCode();
        }
        if (getReset_flag() != null) {
            _hashCode += getReset_flag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRemoveReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRemoveReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_term_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_term_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drop_promotion_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drop_promotion_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reset_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reset_flag"));
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
