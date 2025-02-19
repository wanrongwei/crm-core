/**
 * DoQueryScpProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryScpProfileResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Short fph_flag;

    private java.lang.Short ussd_callback_flag;

    private java.lang.Short icfFlag;

    private java.lang.String icfNumber;

    private java.lang.String icfNumberStatus;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUserAuth sUserAuth;

    private java.lang.Short flh_flag;

    private java.lang.Short posContinue_flag;

    private java.lang.Short brand_id;

    public DoQueryScpProfileResponse() {
    }

    public DoQueryScpProfileResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           java.lang.String phone_id,
           java.lang.Short fph_flag,
           java.lang.Short ussd_callback_flag,
           java.lang.Short icfFlag,
           java.lang.String icfNumber,
           java.lang.String icfNumberStatus,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUserAuth sUserAuth,
           java.lang.Short flh_flag,
           java.lang.Short posContinue_flag,
           java.lang.Short brand_id) {
        super(
            responseHead);
        this.phone_id = phone_id;
        this.fph_flag = fph_flag;
        this.ussd_callback_flag = ussd_callback_flag;
        this.icfFlag = icfFlag;
        this.icfNumber = icfNumber;
        this.icfNumberStatus = icfNumberStatus;
        this.sUserAuth = sUserAuth;
        this.flh_flag = flh_flag;
        this.posContinue_flag = posContinue_flag;
        this.brand_id = brand_id;
    }


    /**
     * Gets the phone_id value for this DoQueryScpProfileResponse.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this DoQueryScpProfileResponse.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the fph_flag value for this DoQueryScpProfileResponse.
     * 
     * @return fph_flag
     */
    public java.lang.Short getFph_flag() {
        return fph_flag;
    }


    /**
     * Sets the fph_flag value for this DoQueryScpProfileResponse.
     * 
     * @param fph_flag
     */
    public void setFph_flag(java.lang.Short fph_flag) {
        this.fph_flag = fph_flag;
    }


    /**
     * Gets the ussd_callback_flag value for this DoQueryScpProfileResponse.
     * 
     * @return ussd_callback_flag
     */
    public java.lang.Short getUssd_callback_flag() {
        return ussd_callback_flag;
    }


    /**
     * Sets the ussd_callback_flag value for this DoQueryScpProfileResponse.
     * 
     * @param ussd_callback_flag
     */
    public void setUssd_callback_flag(java.lang.Short ussd_callback_flag) {
        this.ussd_callback_flag = ussd_callback_flag;
    }


    /**
     * Gets the icfFlag value for this DoQueryScpProfileResponse.
     * 
     * @return icfFlag
     */
    public java.lang.Short getIcfFlag() {
        return icfFlag;
    }


    /**
     * Sets the icfFlag value for this DoQueryScpProfileResponse.
     * 
     * @param icfFlag
     */
    public void setIcfFlag(java.lang.Short icfFlag) {
        this.icfFlag = icfFlag;
    }


    /**
     * Gets the icfNumber value for this DoQueryScpProfileResponse.
     * 
     * @return icfNumber
     */
    public java.lang.String getIcfNumber() {
        return icfNumber;
    }


    /**
     * Sets the icfNumber value for this DoQueryScpProfileResponse.
     * 
     * @param icfNumber
     */
    public void setIcfNumber(java.lang.String icfNumber) {
        this.icfNumber = icfNumber;
    }


    /**
     * Gets the icfNumberStatus value for this DoQueryScpProfileResponse.
     * 
     * @return icfNumberStatus
     */
    public java.lang.String getIcfNumberStatus() {
        return icfNumberStatus;
    }


    /**
     * Sets the icfNumberStatus value for this DoQueryScpProfileResponse.
     * 
     * @param icfNumberStatus
     */
    public void setIcfNumberStatus(java.lang.String icfNumberStatus) {
        this.icfNumberStatus = icfNumberStatus;
    }


    /**
     * Gets the sUserAuth value for this DoQueryScpProfileResponse.
     * 
     * @return sUserAuth
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUserAuth getSUserAuth() {
        return sUserAuth;
    }


    /**
     * Sets the sUserAuth value for this DoQueryScpProfileResponse.
     * 
     * @param sUserAuth
     */
    public void setSUserAuth(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUserAuth sUserAuth) {
        this.sUserAuth = sUserAuth;
    }


    /**
     * Gets the flh_flag value for this DoQueryScpProfileResponse.
     * 
     * @return flh_flag
     */
    public java.lang.Short getFlh_flag() {
        return flh_flag;
    }


    /**
     * Sets the flh_flag value for this DoQueryScpProfileResponse.
     * 
     * @param flh_flag
     */
    public void setFlh_flag(java.lang.Short flh_flag) {
        this.flh_flag = flh_flag;
    }


    /**
     * Gets the posContinue_flag value for this DoQueryScpProfileResponse.
     * 
     * @return posContinue_flag
     */
    public java.lang.Short getPosContinue_flag() {
        return posContinue_flag;
    }


    /**
     * Sets the posContinue_flag value for this DoQueryScpProfileResponse.
     * 
     * @param posContinue_flag
     */
    public void setPosContinue_flag(java.lang.Short posContinue_flag) {
        this.posContinue_flag = posContinue_flag;
    }


    /**
     * Gets the brand_id value for this DoQueryScpProfileResponse.
     * 
     * @return brand_id
     */
    public java.lang.Short getBrand_id() {
        return brand_id;
    }


    /**
     * Sets the brand_id value for this DoQueryScpProfileResponse.
     * 
     * @param brand_id
     */
    public void setBrand_id(java.lang.Short brand_id) {
        this.brand_id = brand_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryScpProfileResponse)) return false;
        DoQueryScpProfileResponse other = (DoQueryScpProfileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.fph_flag==null && other.getFph_flag()==null) || 
             (this.fph_flag!=null &&
              this.fph_flag.equals(other.getFph_flag()))) &&
            ((this.ussd_callback_flag==null && other.getUssd_callback_flag()==null) || 
             (this.ussd_callback_flag!=null &&
              this.ussd_callback_flag.equals(other.getUssd_callback_flag()))) &&
            ((this.icfFlag==null && other.getIcfFlag()==null) || 
             (this.icfFlag!=null &&
              this.icfFlag.equals(other.getIcfFlag()))) &&
            ((this.icfNumber==null && other.getIcfNumber()==null) || 
             (this.icfNumber!=null &&
              this.icfNumber.equals(other.getIcfNumber()))) &&
            ((this.icfNumberStatus==null && other.getIcfNumberStatus()==null) || 
             (this.icfNumberStatus!=null &&
              this.icfNumberStatus.equals(other.getIcfNumberStatus()))) &&
            ((this.sUserAuth==null && other.getSUserAuth()==null) || 
             (this.sUserAuth!=null &&
              this.sUserAuth.equals(other.getSUserAuth()))) &&
            ((this.flh_flag==null && other.getFlh_flag()==null) || 
             (this.flh_flag!=null &&
              this.flh_flag.equals(other.getFlh_flag()))) &&
            ((this.posContinue_flag==null && other.getPosContinue_flag()==null) || 
             (this.posContinue_flag!=null &&
              this.posContinue_flag.equals(other.getPosContinue_flag()))) &&
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
        int _hashCode = super.hashCode();
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getFph_flag() != null) {
            _hashCode += getFph_flag().hashCode();
        }
        if (getUssd_callback_flag() != null) {
            _hashCode += getUssd_callback_flag().hashCode();
        }
        if (getIcfFlag() != null) {
            _hashCode += getIcfFlag().hashCode();
        }
        if (getIcfNumber() != null) {
            _hashCode += getIcfNumber().hashCode();
        }
        if (getIcfNumberStatus() != null) {
            _hashCode += getIcfNumberStatus().hashCode();
        }
        if (getSUserAuth() != null) {
            _hashCode += getSUserAuth().hashCode();
        }
        if (getFlh_flag() != null) {
            _hashCode += getFlh_flag().hashCode();
        }
        if (getPosContinue_flag() != null) {
            _hashCode += getPosContinue_flag().hashCode();
        }
        if (getBrand_id() != null) {
            _hashCode += getBrand_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryScpProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryScpProfileResponse"));
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
        elemField.setFieldName("icfFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icfFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icfNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icfNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icfNumberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icfNumberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("flh_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flh_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posContinue_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posContinue_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
