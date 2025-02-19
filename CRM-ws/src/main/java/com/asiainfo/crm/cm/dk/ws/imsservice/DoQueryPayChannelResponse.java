/**
 * DoQueryPayChannelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoQueryPayChannelResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer paymentType;

    private java.lang.Long expireTime;

    private com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo bankInfo;

    private java.util.Calendar expireDate;

    private java.lang.Short sts;

    private java.util.Calendar effectiveDate;

    public DoQueryPayChannelResponse() {
    }

    public DoQueryPayChannelResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           java.lang.Integer paymentType,
           java.lang.Long expireTime,
           com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo bankInfo,
           java.util.Calendar expireDate,
           java.lang.Short sts,
           java.util.Calendar effectiveDate) {
        super(
            responseHead);
        this.paymentType = paymentType;
        this.expireTime = expireTime;
        this.bankInfo = bankInfo;
        this.expireDate = expireDate;
        this.sts = sts;
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the paymentType value for this DoQueryPayChannelResponse.
     * 
     * @return paymentType
     */
    public java.lang.Integer getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this DoQueryPayChannelResponse.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Integer paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the expireTime value for this DoQueryPayChannelResponse.
     * 
     * @return expireTime
     */
    public java.lang.Long getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this DoQueryPayChannelResponse.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.Long expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the bankInfo value for this DoQueryPayChannelResponse.
     * 
     * @return bankInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo getBankInfo() {
        return bankInfo;
    }


    /**
     * Sets the bankInfo value for this DoQueryPayChannelResponse.
     * 
     * @param bankInfo
     */
    public void setBankInfo(com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo bankInfo) {
        this.bankInfo = bankInfo;
    }


    /**
     * Gets the expireDate value for this DoQueryPayChannelResponse.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this DoQueryPayChannelResponse.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the sts value for this DoQueryPayChannelResponse.
     * 
     * @return sts
     */
    public java.lang.Short getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this DoQueryPayChannelResponse.
     * 
     * @param sts
     */
    public void setSts(java.lang.Short sts) {
        this.sts = sts;
    }


    /**
     * Gets the effectiveDate value for this DoQueryPayChannelResponse.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this DoQueryPayChannelResponse.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryPayChannelResponse)) return false;
        DoQueryPayChannelResponse other = (DoQueryPayChannelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.bankInfo==null && other.getBankInfo()==null) || 
             (this.bankInfo!=null &&
              this.bankInfo.equals(other.getBankInfo()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getBankInfo() != null) {
            _hashCode += getBankInfo().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryPayChannelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
