/**
 * ChangeUserLanguageReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class ChangeUserLanguageReq  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Long user_id;

    private java.lang.Short ussd_language;

    private java.lang.Short ivr_language;

    private java.lang.Short sms_language;

    public ChangeUserLanguageReq() {
    }

    public ChangeUserLanguageReq(
           java.lang.String phone_id,
           java.lang.Long user_id,
           java.lang.Short ussd_language,
           java.lang.Short ivr_language,
           java.lang.Short sms_language) {
           this.phone_id = phone_id;
           this.user_id = user_id;
           this.ussd_language = ussd_language;
           this.ivr_language = ivr_language;
           this.sms_language = sms_language;
    }


    /**
     * Gets the phone_id value for this ChangeUserLanguageReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ChangeUserLanguageReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the user_id value for this ChangeUserLanguageReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this ChangeUserLanguageReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the ussd_language value for this ChangeUserLanguageReq.
     * 
     * @return ussd_language
     */
    public java.lang.Short getUssd_language() {
        return ussd_language;
    }


    /**
     * Sets the ussd_language value for this ChangeUserLanguageReq.
     * 
     * @param ussd_language
     */
    public void setUssd_language(java.lang.Short ussd_language) {
        this.ussd_language = ussd_language;
    }


    /**
     * Gets the ivr_language value for this ChangeUserLanguageReq.
     * 
     * @return ivr_language
     */
    public java.lang.Short getIvr_language() {
        return ivr_language;
    }


    /**
     * Sets the ivr_language value for this ChangeUserLanguageReq.
     * 
     * @param ivr_language
     */
    public void setIvr_language(java.lang.Short ivr_language) {
        this.ivr_language = ivr_language;
    }


    /**
     * Gets the sms_language value for this ChangeUserLanguageReq.
     * 
     * @return sms_language
     */
    public java.lang.Short getSms_language() {
        return sms_language;
    }


    /**
     * Sets the sms_language value for this ChangeUserLanguageReq.
     * 
     * @param sms_language
     */
    public void setSms_language(java.lang.Short sms_language) {
        this.sms_language = sms_language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof ChangeUserLanguageReq)) return false;
        ChangeUserLanguageReq other = (ChangeUserLanguageReq) obj;
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
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.ussd_language==null && other.getUssd_language()==null) || 
             (this.ussd_language!=null &&
              this.ussd_language.equals(other.getUssd_language()))) &&
            ((this.ivr_language==null && other.getIvr_language()==null) || 
             (this.ivr_language!=null &&
              this.ivr_language.equals(other.getIvr_language()))) &&
            ((this.sms_language==null && other.getSms_language()==null) || 
             (this.sms_language!=null &&
              this.sms_language.equals(other.getSms_language())));
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getUssd_language() != null) {
            _hashCode += getUssd_language().hashCode();
        }
        if (getIvr_language() != null) {
            _hashCode += getIvr_language().hashCode();
        }
        if (getSms_language() != null) {
            _hashCode += getSms_language().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeUserLanguageReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "changeUserLanguageReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussd_language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ussd_language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivr_language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivr_language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sms_language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sms_language"));
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
