/**
 * SFristActiveReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SFristActiveReq  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.String activation_time;

    private java.lang.String device_type;

    private java.lang.Short sms_lang;

    private java.lang.Short ivr_lang;

    private java.lang.Short ussd_lang;

    private java.lang.Short email_lang;

    private java.lang.String location;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SBalance balance;

    public SFristActiveReq() {
    }

    public SFristActiveReq(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.String activation_time,
           java.lang.String device_type,
           java.lang.Short sms_lang,
           java.lang.Short ivr_lang,
           java.lang.Short ussd_lang,
           java.lang.Short email_lang,
           java.lang.String location,
           com.asiainfo.crm.cm.dk.ws.imsservice.SBalance balance) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.activation_time = activation_time;
           this.device_type = device_type;
           this.sms_lang = sms_lang;
           this.ivr_lang = ivr_lang;
           this.ussd_lang = ussd_lang;
           this.email_lang = email_lang;
           this.location = location;
           this.balance = balance;
    }


    /**
     * Gets the user_id value for this SFristActiveReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SFristActiveReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SFristActiveReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SFristActiveReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the activation_time value for this SFristActiveReq.
     * 
     * @return activation_time
     */
    public java.lang.String getActivation_time() {
        return activation_time;
    }


    /**
     * Sets the activation_time value for this SFristActiveReq.
     * 
     * @param activation_time
     */
    public void setActivation_time(java.lang.String activation_time) {
        this.activation_time = activation_time;
    }


    /**
     * Gets the device_type value for this SFristActiveReq.
     * 
     * @return device_type
     */
    public java.lang.String getDevice_type() {
        return device_type;
    }


    /**
     * Sets the device_type value for this SFristActiveReq.
     * 
     * @param device_type
     */
    public void setDevice_type(java.lang.String device_type) {
        this.device_type = device_type;
    }


    /**
     * Gets the sms_lang value for this SFristActiveReq.
     * 
     * @return sms_lang
     */
    public java.lang.Short getSms_lang() {
        return sms_lang;
    }


    /**
     * Sets the sms_lang value for this SFristActiveReq.
     * 
     * @param sms_lang
     */
    public void setSms_lang(java.lang.Short sms_lang) {
        this.sms_lang = sms_lang;
    }


    /**
     * Gets the ivr_lang value for this SFristActiveReq.
     * 
     * @return ivr_lang
     */
    public java.lang.Short getIvr_lang() {
        return ivr_lang;
    }


    /**
     * Sets the ivr_lang value for this SFristActiveReq.
     * 
     * @param ivr_lang
     */
    public void setIvr_lang(java.lang.Short ivr_lang) {
        this.ivr_lang = ivr_lang;
    }


    /**
     * Gets the ussd_lang value for this SFristActiveReq.
     * 
     * @return ussd_lang
     */
    public java.lang.Short getUssd_lang() {
        return ussd_lang;
    }


    /**
     * Sets the ussd_lang value for this SFristActiveReq.
     * 
     * @param ussd_lang
     */
    public void setUssd_lang(java.lang.Short ussd_lang) {
        this.ussd_lang = ussd_lang;
    }


    /**
     * Gets the email_lang value for this SFristActiveReq.
     * 
     * @return email_lang
     */
    public java.lang.Short getEmail_lang() {
        return email_lang;
    }


    /**
     * Sets the email_lang value for this SFristActiveReq.
     * 
     * @param email_lang
     */
    public void setEmail_lang(java.lang.Short email_lang) {
        this.email_lang = email_lang;
    }


    /**
     * Gets the location value for this SFristActiveReq.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this SFristActiveReq.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the balance value for this SFristActiveReq.
     * 
     * @return balance
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SBalance getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this SFristActiveReq.
     * 
     * @param balance
     */
    public void setBalance(com.asiainfo.crm.cm.dk.ws.imsservice.SBalance balance) {
        this.balance = balance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SFristActiveReq)) return false;
        SFristActiveReq other = (SFristActiveReq) obj;
        if (obj == null) return false;
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
            ((this.activation_time==null && other.getActivation_time()==null) || 
             (this.activation_time!=null &&
              this.activation_time.equals(other.getActivation_time()))) &&
            ((this.device_type==null && other.getDevice_type()==null) || 
             (this.device_type!=null &&
              this.device_type.equals(other.getDevice_type()))) &&
            ((this.sms_lang==null && other.getSms_lang()==null) || 
             (this.sms_lang!=null &&
              this.sms_lang.equals(other.getSms_lang()))) &&
            ((this.ivr_lang==null && other.getIvr_lang()==null) || 
             (this.ivr_lang!=null &&
              this.ivr_lang.equals(other.getIvr_lang()))) &&
            ((this.ussd_lang==null && other.getUssd_lang()==null) || 
             (this.ussd_lang!=null &&
              this.ussd_lang.equals(other.getUssd_lang()))) &&
            ((this.email_lang==null && other.getEmail_lang()==null) || 
             (this.email_lang!=null &&
              this.email_lang.equals(other.getEmail_lang()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance())));
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
        if (getActivation_time() != null) {
            _hashCode += getActivation_time().hashCode();
        }
        if (getDevice_type() != null) {
            _hashCode += getDevice_type().hashCode();
        }
        if (getSms_lang() != null) {
            _hashCode += getSms_lang().hashCode();
        }
        if (getIvr_lang() != null) {
            _hashCode += getIvr_lang().hashCode();
        }
        if (getUssd_lang() != null) {
            _hashCode += getUssd_lang().hashCode();
        }
        if (getEmail_lang() != null) {
            _hashCode += getEmail_lang().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SFristActiveReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFristActiveReq"));
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
        elemField.setFieldName("activation_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activation_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "device_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sms_lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sms_lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivr_lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivr_lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussd_lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ussd_lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email_lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
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
