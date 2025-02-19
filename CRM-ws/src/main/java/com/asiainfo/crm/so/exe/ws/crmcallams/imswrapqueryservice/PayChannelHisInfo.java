/**
 * PayChannelHisInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class PayChannelHisInfo  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InnerBaseResponse  implements java.io.Serializable {
    private java.lang.Integer paymentType;

    private java.util.Calendar expireTime;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo[] bankInfo;

    public PayChannelHisInfo() {
    }

    public PayChannelHisInfo(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CbsErrorMsg errorMsg,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPage sPage,
           java.lang.Integer paymentType,
           java.util.Calendar expireTime,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo[] bankInfo) {
        super(
            errorMsg,
            sPage);
        this.paymentType = paymentType;
        this.expireTime = expireTime;
        this.bankInfo = bankInfo;
    }


    /**
     * Gets the paymentType value for this PayChannelHisInfo.
     * 
     * @return paymentType
     */
    public java.lang.Integer getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this PayChannelHisInfo.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Integer paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the expireTime value for this PayChannelHisInfo.
     * 
     * @return expireTime
     */
    public java.util.Calendar getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this PayChannelHisInfo.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.util.Calendar expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the bankInfo value for this PayChannelHisInfo.
     * 
     * @return bankInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo[] getBankInfo() {
        return bankInfo;
    }


    /**
     * Sets the bankInfo value for this PayChannelHisInfo.
     * 
     * @param bankInfo
     */
    public void setBankInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo[] bankInfo) {
        this.bankInfo = bankInfo;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo getBankInfo(int i) {
        return this.bankInfo[i];
    }

    public void setBankInfo(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo _value) {
        this.bankInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayChannelHisInfo)) return false;
        PayChannelHisInfo other = (PayChannelHisInfo) obj;
        
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
              java.util.Arrays.equals(this.bankInfo, other.getBankInfo())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayChannelHisInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "payChannelHisInfo"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
