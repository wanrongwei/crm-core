/**
 * SQueryGroupReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryGroupReq  implements java.io.Serializable {
    private java.lang.String outer_group_id;

    private java.lang.Long group_id;

    private java.lang.Short query_type;

    private java.lang.String contact_phone;

    private java.lang.String main_phone;

    private java.lang.Short status;

    public SQueryGroupReq() {
    }

    public SQueryGroupReq(
           java.lang.String outer_group_id,
           java.lang.Long group_id,
           java.lang.Short query_type,
           java.lang.String contact_phone,
           java.lang.String main_phone,
           java.lang.Short status) {
           this.outer_group_id = outer_group_id;
           this.group_id = group_id;
           this.query_type = query_type;
           this.contact_phone = contact_phone;
           this.main_phone = main_phone;
           this.status = status;
    }


    /**
     * Gets the outer_group_id value for this SQueryGroupReq.
     * 
     * @return outer_group_id
     */
    public java.lang.String getOuter_group_id() {
        return outer_group_id;
    }


    /**
     * Sets the outer_group_id value for this SQueryGroupReq.
     * 
     * @param outer_group_id
     */
    public void setOuter_group_id(java.lang.String outer_group_id) {
        this.outer_group_id = outer_group_id;
    }


    /**
     * Gets the group_id value for this SQueryGroupReq.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this SQueryGroupReq.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the query_type value for this SQueryGroupReq.
     * 
     * @return query_type
     */
    public java.lang.Short getQuery_type() {
        return query_type;
    }


    /**
     * Sets the query_type value for this SQueryGroupReq.
     * 
     * @param query_type
     */
    public void setQuery_type(java.lang.Short query_type) {
        this.query_type = query_type;
    }


    /**
     * Gets the contact_phone value for this SQueryGroupReq.
     * 
     * @return contact_phone
     */
    public java.lang.String getContact_phone() {
        return contact_phone;
    }


    /**
     * Sets the contact_phone value for this SQueryGroupReq.
     * 
     * @param contact_phone
     */
    public void setContact_phone(java.lang.String contact_phone) {
        this.contact_phone = contact_phone;
    }


    /**
     * Gets the main_phone value for this SQueryGroupReq.
     * 
     * @return main_phone
     */
    public java.lang.String getMain_phone() {
        return main_phone;
    }


    /**
     * Sets the main_phone value for this SQueryGroupReq.
     * 
     * @param main_phone
     */
    public void setMain_phone(java.lang.String main_phone) {
        this.main_phone = main_phone;
    }


    /**
     * Gets the status value for this SQueryGroupReq.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SQueryGroupReq.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryGroupReq)) return false;
        SQueryGroupReq other = (SQueryGroupReq) obj;
        
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
            ((this.query_type==null && other.getQuery_type()==null) || 
             (this.query_type!=null &&
              this.query_type.equals(other.getQuery_type()))) &&
            ((this.contact_phone==null && other.getContact_phone()==null) || 
             (this.contact_phone!=null &&
              this.contact_phone.equals(other.getContact_phone()))) &&
            ((this.main_phone==null && other.getMain_phone()==null) || 
             (this.main_phone!=null &&
              this.main_phone.equals(other.getMain_phone()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getQuery_type() != null) {
            _hashCode += getQuery_type().hashCode();
        }
        if (getContact_phone() != null) {
            _hashCode += getContact_phone().hashCode();
        }
        if (getMain_phone() != null) {
            _hashCode += getMain_phone().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryGroupReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupReq"));
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
        elemField.setFieldName("query_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "main_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
