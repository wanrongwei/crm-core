/**
 * SQueryThrottledReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryThrottledReq  implements java.io.Serializable {
    private java.lang.Integer serviceId;

    private java.lang.String phoneId;

    private java.lang.Integer apnniId;

    private java.lang.Integer mnsType;

    private java.lang.Integer notifyType;

    private java.util.Calendar startTime;

    private java.lang.Integer userNature;

    private java.lang.String oriUserNumber;

    public SQueryThrottledReq() {
    }

    public SQueryThrottledReq(
           java.lang.Integer serviceId,
           java.lang.String phoneId,
           java.lang.Integer apnniId,
           java.lang.Integer mnsType,
           java.lang.Integer notifyType,
           java.util.Calendar startTime,
           java.lang.Integer userNature,
           java.lang.String oriUserNumber) {
           this.serviceId = serviceId;
           this.phoneId = phoneId;
           this.apnniId = apnniId;
           this.mnsType = mnsType;
           this.notifyType = notifyType;
           this.startTime = startTime;
           this.userNature = userNature;
           this.oriUserNumber = oriUserNumber;
    }


    /**
     * Gets the serviceId value for this SQueryThrottledReq.
     * 
     * @return serviceId
     */
    public java.lang.Integer getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SQueryThrottledReq.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Integer serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the phoneId value for this SQueryThrottledReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQueryThrottledReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the apnniId value for this SQueryThrottledReq.
     * 
     * @return apnniId
     */
    public java.lang.Integer getApnniId() {
        return apnniId;
    }


    /**
     * Sets the apnniId value for this SQueryThrottledReq.
     * 
     * @param apnniId
     */
    public void setApnniId(java.lang.Integer apnniId) {
        this.apnniId = apnniId;
    }


    /**
     * Gets the mnsType value for this SQueryThrottledReq.
     * 
     * @return mnsType
     */
    public java.lang.Integer getMnsType() {
        return mnsType;
    }


    /**
     * Sets the mnsType value for this SQueryThrottledReq.
     * 
     * @param mnsType
     */
    public void setMnsType(java.lang.Integer mnsType) {
        this.mnsType = mnsType;
    }


    /**
     * Gets the notifyType value for this SQueryThrottledReq.
     * 
     * @return notifyType
     */
    public java.lang.Integer getNotifyType() {
        return notifyType;
    }


    /**
     * Sets the notifyType value for this SQueryThrottledReq.
     * 
     * @param notifyType
     */
    public void setNotifyType(java.lang.Integer notifyType) {
        this.notifyType = notifyType;
    }


    /**
     * Gets the startTime value for this SQueryThrottledReq.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SQueryThrottledReq.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the userNature value for this SQueryThrottledReq.
     * 
     * @return userNature
     */
    public java.lang.Integer getUserNature() {
        return userNature;
    }


    /**
     * Sets the userNature value for this SQueryThrottledReq.
     * 
     * @param userNature
     */
    public void setUserNature(java.lang.Integer userNature) {
        this.userNature = userNature;
    }


    /**
     * Gets the oriUserNumber value for this SQueryThrottledReq.
     * 
     * @return oriUserNumber
     */
    public java.lang.String getOriUserNumber() {
        return oriUserNumber;
    }


    /**
     * Sets the oriUserNumber value for this SQueryThrottledReq.
     * 
     * @param oriUserNumber
     */
    public void setOriUserNumber(java.lang.String oriUserNumber) {
        this.oriUserNumber = oriUserNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryThrottledReq)) return false;
        SQueryThrottledReq other = (SQueryThrottledReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.apnniId==null && other.getApnniId()==null) || 
             (this.apnniId!=null &&
              this.apnniId.equals(other.getApnniId()))) &&
            ((this.mnsType==null && other.getMnsType()==null) || 
             (this.mnsType!=null &&
              this.mnsType.equals(other.getMnsType()))) &&
            ((this.notifyType==null && other.getNotifyType()==null) || 
             (this.notifyType!=null &&
              this.notifyType.equals(other.getNotifyType()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.userNature==null && other.getUserNature()==null) || 
             (this.userNature!=null &&
              this.userNature.equals(other.getUserNature()))) &&
            ((this.oriUserNumber==null && other.getOriUserNumber()==null) || 
             (this.oriUserNumber!=null &&
              this.oriUserNumber.equals(other.getOriUserNumber())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getApnniId() != null) {
            _hashCode += getApnniId().hashCode();
        }
        if (getMnsType() != null) {
            _hashCode += getMnsType().hashCode();
        }
        if (getNotifyType() != null) {
            _hashCode += getNotifyType().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getUserNature() != null) {
            _hashCode += getUserNature().hashCode();
        }
        if (getOriUserNumber() != null) {
            _hashCode += getOriUserNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryThrottledReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryThrottledReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apnniId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apnniId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mnsType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mnsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oriUserNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oriUserNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
