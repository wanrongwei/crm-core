/**
 * SQueryGroupMemberReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryGroupMemberReq  implements java.io.Serializable {
    private java.lang.String outer_group_id;

    private java.lang.Long group_id;

    private java.lang.String phone_id;

    private java.lang.String short_phone_id;

    private java.lang.Short group_info_flag;

    private java.lang.Long user_id;

    public SQueryGroupMemberReq() {
    }

    public SQueryGroupMemberReq(
           java.lang.String outer_group_id,
           java.lang.Long group_id,
           java.lang.String phone_id,
           java.lang.String short_phone_id,
           java.lang.Short group_info_flag,
           java.lang.Long user_id) {
           this.outer_group_id = outer_group_id;
           this.group_id = group_id;
           this.phone_id = phone_id;
           this.short_phone_id = short_phone_id;
           this.group_info_flag = group_info_flag;
           this.user_id = user_id;
    }


    /**
     * Gets the outer_group_id value for this SQueryGroupMemberReq.
     * 
     * @return outer_group_id
     */
    public java.lang.String getOuter_group_id() {
        return outer_group_id;
    }


    /**
     * Sets the outer_group_id value for this SQueryGroupMemberReq.
     * 
     * @param outer_group_id
     */
    public void setOuter_group_id(java.lang.String outer_group_id) {
        this.outer_group_id = outer_group_id;
    }


    /**
     * Gets the group_id value for this SQueryGroupMemberReq.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this SQueryGroupMemberReq.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the phone_id value for this SQueryGroupMemberReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SQueryGroupMemberReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the short_phone_id value for this SQueryGroupMemberReq.
     * 
     * @return short_phone_id
     */
    public java.lang.String getShort_phone_id() {
        return short_phone_id;
    }


    /**
     * Sets the short_phone_id value for this SQueryGroupMemberReq.
     * 
     * @param short_phone_id
     */
    public void setShort_phone_id(java.lang.String short_phone_id) {
        this.short_phone_id = short_phone_id;
    }


    /**
     * Gets the group_info_flag value for this SQueryGroupMemberReq.
     * 
     * @return group_info_flag
     */
    public java.lang.Short getGroup_info_flag() {
        return group_info_flag;
    }


    /**
     * Sets the group_info_flag value for this SQueryGroupMemberReq.
     * 
     * @param group_info_flag
     */
    public void setGroup_info_flag(java.lang.Short group_info_flag) {
        this.group_info_flag = group_info_flag;
    }


    /**
     * Gets the user_id value for this SQueryGroupMemberReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SQueryGroupMemberReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryGroupMemberReq)) return false;
        SQueryGroupMemberReq other = (SQueryGroupMemberReq) obj;
        
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
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.short_phone_id==null && other.getShort_phone_id()==null) || 
             (this.short_phone_id!=null &&
              this.short_phone_id.equals(other.getShort_phone_id()))) &&
            ((this.group_info_flag==null && other.getGroup_info_flag()==null) || 
             (this.group_info_flag!=null &&
              this.group_info_flag.equals(other.getGroup_info_flag()))) &&
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
        if (getOuter_group_id() != null) {
            _hashCode += getOuter_group_id().hashCode();
        }
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getShort_phone_id() != null) {
            _hashCode += getShort_phone_id().hashCode();
        }
        if (getGroup_info_flag() != null) {
            _hashCode += getGroup_info_flag().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryGroupMemberReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupMemberReq"));
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
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "short_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_info_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_info_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
