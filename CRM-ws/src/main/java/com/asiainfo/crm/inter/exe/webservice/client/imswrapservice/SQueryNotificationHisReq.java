/**
 * SQueryNotificationHisReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SQueryNotificationHisReq  implements java.io.Serializable {
    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.String start_date;

    private java.lang.String end_date;

    private java.lang.String related_phone_id;

    private java.lang.String email;

    private java.lang.String notification_type;

    private java.lang.Long notification_id;

    public SQueryNotificationHisReq() {
    }

    public SQueryNotificationHisReq(
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.String start_date,
           java.lang.String end_date,
           java.lang.String related_phone_id,
           java.lang.String email,
           java.lang.String notification_type,
           java.lang.Long notification_id) {
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.start_date = start_date;
           this.end_date = end_date;
           this.related_phone_id = related_phone_id;
           this.email = email;
           this.notification_type = notification_type;
           this.notification_id = notification_id;
    }


    /**
     * Gets the outer_acct_id value for this SQueryNotificationHisReq.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SQueryNotificationHisReq.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SQueryNotificationHisReq.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SQueryNotificationHisReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the user_id value for this SQueryNotificationHisReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SQueryNotificationHisReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SQueryNotificationHisReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SQueryNotificationHisReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the start_date value for this SQueryNotificationHisReq.
     * 
     * @return start_date
     */
    public java.lang.String getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this SQueryNotificationHisReq.
     * 
     * @param start_date
     */
    public void setStart_date(java.lang.String start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this SQueryNotificationHisReq.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this SQueryNotificationHisReq.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the related_phone_id value for this SQueryNotificationHisReq.
     * 
     * @return related_phone_id
     */
    public java.lang.String getRelated_phone_id() {
        return related_phone_id;
    }


    /**
     * Sets the related_phone_id value for this SQueryNotificationHisReq.
     * 
     * @param related_phone_id
     */
    public void setRelated_phone_id(java.lang.String related_phone_id) {
        this.related_phone_id = related_phone_id;
    }


    /**
     * Gets the email value for this SQueryNotificationHisReq.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SQueryNotificationHisReq.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the notification_type value for this SQueryNotificationHisReq.
     * 
     * @return notification_type
     */
    public java.lang.String getNotification_type() {
        return notification_type;
    }


    /**
     * Sets the notification_type value for this SQueryNotificationHisReq.
     * 
     * @param notification_type
     */
    public void setNotification_type(java.lang.String notification_type) {
        this.notification_type = notification_type;
    }


    /**
     * Gets the notification_id value for this SQueryNotificationHisReq.
     * 
     * @return notification_id
     */
    public java.lang.Long getNotification_id() {
        return notification_id;
    }


    /**
     * Sets the notification_id value for this SQueryNotificationHisReq.
     * 
     * @param notification_id
     */
    public void setNotification_id(java.lang.Long notification_id) {
        this.notification_id = notification_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryNotificationHisReq)) return false;
        SQueryNotificationHisReq other = (SQueryNotificationHisReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.related_phone_id==null && other.getRelated_phone_id()==null) || 
             (this.related_phone_id!=null &&
              this.related_phone_id.equals(other.getRelated_phone_id()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.notification_type==null && other.getNotification_type()==null) || 
             (this.notification_type!=null &&
              this.notification_type.equals(other.getNotification_type()))) &&
            ((this.notification_id==null && other.getNotification_id()==null) || 
             (this.notification_id!=null &&
              this.notification_id.equals(other.getNotification_id())));
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
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getRelated_phone_id() != null) {
            _hashCode += getRelated_phone_id().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getNotification_type() != null) {
            _hashCode += getNotification_type().hashCode();
        }
        if (getNotification_id() != null) {
            _hashCode += getNotification_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryNotificationHisReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotificationHisReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "related_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification_id"));
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
