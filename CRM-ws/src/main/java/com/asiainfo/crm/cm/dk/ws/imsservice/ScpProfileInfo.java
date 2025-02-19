/**
 * ScpProfileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class ScpProfileInfo  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Short fph_flag;

    private java.lang.Short ussd_callback_flag;

    private java.lang.Short icf_flag;

    private java.lang.String icf_number;

    private java.lang.Short flh_flag;

    private java.lang.Short continue_flag;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth sUserAuth;

    private java.lang.Short brand_id;

    public ScpProfileInfo() {
    }

    public ScpProfileInfo(
           java.lang.String phone_id,
           java.lang.Short fph_flag,
           java.lang.Short ussd_callback_flag,
           java.lang.Short icf_flag,
           java.lang.String icf_number,
           java.lang.Short flh_flag,
           java.lang.Short continue_flag,
           com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth sUserAuth,
           java.lang.Short brand_id) {
           this.phone_id = phone_id;
           this.fph_flag = fph_flag;
           this.ussd_callback_flag = ussd_callback_flag;
           this.icf_flag = icf_flag;
           this.icf_number = icf_number;
           this.flh_flag = flh_flag;
           this.continue_flag = continue_flag;
           this.sUserAuth = sUserAuth;
           this.brand_id = brand_id;
    }


    /**
     * Gets the phone_id value for this ScpProfileInfo.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ScpProfileInfo.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the fph_flag value for this ScpProfileInfo.
     * 
     * @return fph_flag
     */
    public java.lang.Short getFph_flag() {
        return fph_flag;
    }


    /**
     * Sets the fph_flag value for this ScpProfileInfo.
     * 
     * @param fph_flag
     */
    public void setFph_flag(java.lang.Short fph_flag) {
        this.fph_flag = fph_flag;
    }


    /**
     * Gets the ussd_callback_flag value for this ScpProfileInfo.
     * 
     * @return ussd_callback_flag
     */
    public java.lang.Short getUssd_callback_flag() {
        return ussd_callback_flag;
    }


    /**
     * Sets the ussd_callback_flag value for this ScpProfileInfo.
     * 
     * @param ussd_callback_flag
     */
    public void setUssd_callback_flag(java.lang.Short ussd_callback_flag) {
        this.ussd_callback_flag = ussd_callback_flag;
    }


    /**
     * Gets the icf_flag value for this ScpProfileInfo.
     * 
     * @return icf_flag
     */
    public java.lang.Short getIcf_flag() {
        return icf_flag;
    }


    /**
     * Sets the icf_flag value for this ScpProfileInfo.
     * 
     * @param icf_flag
     */
    public void setIcf_flag(java.lang.Short icf_flag) {
        this.icf_flag = icf_flag;
    }


    /**
     * Gets the icf_number value for this ScpProfileInfo.
     * 
     * @return icf_number
     */
    public java.lang.String getIcf_number() {
        return icf_number;
    }


    /**
     * Sets the icf_number value for this ScpProfileInfo.
     * 
     * @param icf_number
     */
    public void setIcf_number(java.lang.String icf_number) {
        this.icf_number = icf_number;
    }


    /**
     * Gets the flh_flag value for this ScpProfileInfo.
     * 
     * @return flh_flag
     */
    public java.lang.Short getFlh_flag() {
        return flh_flag;
    }


    /**
     * Sets the flh_flag value for this ScpProfileInfo.
     * 
     * @param flh_flag
     */
    public void setFlh_flag(java.lang.Short flh_flag) {
        this.flh_flag = flh_flag;
    }


    /**
     * Gets the continue_flag value for this ScpProfileInfo.
     * 
     * @return continue_flag
     */
    public java.lang.Short getContinue_flag() {
        return continue_flag;
    }


    /**
     * Sets the continue_flag value for this ScpProfileInfo.
     * 
     * @param continue_flag
     */
    public void setContinue_flag(java.lang.Short continue_flag) {
        this.continue_flag = continue_flag;
    }


    /**
     * Gets the sUserAuth value for this ScpProfileInfo.
     * 
     * @return sUserAuth
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth getSUserAuth() {
        return sUserAuth;
    }


    /**
     * Sets the sUserAuth value for this ScpProfileInfo.
     * 
     * @param sUserAuth
     */
    public void setSUserAuth(com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth sUserAuth) {
        this.sUserAuth = sUserAuth;
    }


    /**
     * Gets the brand_id value for this ScpProfileInfo.
     * 
     * @return brand_id
     */
    public java.lang.Short getBrand_id() {
        return brand_id;
    }


    /**
     * Sets the brand_id value for this ScpProfileInfo.
     * 
     * @param brand_id
     */
    public void setBrand_id(java.lang.Short brand_id) {
        this.brand_id = brand_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScpProfileInfo)) return false;
        ScpProfileInfo other = (ScpProfileInfo) obj;
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
            ((this.fph_flag==null && other.getFph_flag()==null) || 
             (this.fph_flag!=null &&
              this.fph_flag.equals(other.getFph_flag()))) &&
            ((this.ussd_callback_flag==null && other.getUssd_callback_flag()==null) || 
             (this.ussd_callback_flag!=null &&
              this.ussd_callback_flag.equals(other.getUssd_callback_flag()))) &&
            ((this.icf_flag==null && other.getIcf_flag()==null) || 
             (this.icf_flag!=null &&
              this.icf_flag.equals(other.getIcf_flag()))) &&
            ((this.icf_number==null && other.getIcf_number()==null) || 
             (this.icf_number!=null &&
              this.icf_number.equals(other.getIcf_number()))) &&
            ((this.flh_flag==null && other.getFlh_flag()==null) || 
             (this.flh_flag!=null &&
              this.flh_flag.equals(other.getFlh_flag()))) &&
            ((this.continue_flag==null && other.getContinue_flag()==null) || 
             (this.continue_flag!=null &&
              this.continue_flag.equals(other.getContinue_flag()))) &&
            ((this.sUserAuth==null && other.getSUserAuth()==null) || 
             (this.sUserAuth!=null &&
              this.sUserAuth.equals(other.getSUserAuth()))) &&
            ((this.brand_id==null && other.getBrand_id()==null) || 
             (this.brand_id!=null &&
              this.brand_id.equals(other.getBrand_id())));
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
        if (getFph_flag() != null) {
            _hashCode += getFph_flag().hashCode();
        }
        if (getUssd_callback_flag() != null) {
            _hashCode += getUssd_callback_flag().hashCode();
        }
        if (getIcf_flag() != null) {
            _hashCode += getIcf_flag().hashCode();
        }
        if (getIcf_number() != null) {
            _hashCode += getIcf_number().hashCode();
        }
        if (getFlh_flag() != null) {
            _hashCode += getFlh_flag().hashCode();
        }
        if (getContinue_flag() != null) {
            _hashCode += getContinue_flag().hashCode();
        }
        if (getSUserAuth() != null) {
            _hashCode += getSUserAuth().hashCode();
        }
        if (getBrand_id() != null) {
            _hashCode += getBrand_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScpProfileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fph_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fph_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussd_callback_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ussd_callback_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icf_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icf_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icf_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icf_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flh_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flh_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continue_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "continue_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUserAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sUserAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brand_id"));
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
