/**
 * SPaymentReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SPaymentReq  implements java.io.Serializable {
    private java.lang.String paymentDate;

    private java.lang.String createDate;

    private java.lang.Short paymentChannel;

    private java.lang.Short paymentType;

    private java.lang.Short orderType;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentInfo paymentInfo;

    private java.lang.String bankCode;

    private java.lang.String adjustReason;

    public SPaymentReq() {
    }

    public SPaymentReq(
           java.lang.String paymentDate,
           java.lang.String createDate,
           java.lang.Short paymentChannel,
           java.lang.Short paymentType,
           java.lang.Short orderType,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentInfo paymentInfo,
           java.lang.String bankCode,
           java.lang.String adjustReason) {
           this.paymentDate = paymentDate;
           this.createDate = createDate;
           this.paymentChannel = paymentChannel;
           this.paymentType = paymentType;
           this.orderType = orderType;
           this.paymentInfo = paymentInfo;
           this.bankCode = bankCode;
           this.adjustReason = adjustReason;
    }


    /**
     * Gets the paymentDate value for this SPaymentReq.
     * 
     * @return paymentDate
     */
    public java.lang.String getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this SPaymentReq.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.lang.String paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the createDate value for this SPaymentReq.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SPaymentReq.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the paymentChannel value for this SPaymentReq.
     * 
     * @return paymentChannel
     */
    public java.lang.Short getPaymentChannel() {
        return paymentChannel;
    }


    /**
     * Sets the paymentChannel value for this SPaymentReq.
     * 
     * @param paymentChannel
     */
    public void setPaymentChannel(java.lang.Short paymentChannel) {
        this.paymentChannel = paymentChannel;
    }


    /**
     * Gets the paymentType value for this SPaymentReq.
     * 
     * @return paymentType
     */
    public java.lang.Short getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this SPaymentReq.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Short paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the orderType value for this SPaymentReq.
     * 
     * @return orderType
     */
    public java.lang.Short getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this SPaymentReq.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.Short orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the paymentInfo value for this SPaymentReq.
     * 
     * @return paymentInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this SPaymentReq.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the bankCode value for this SPaymentReq.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this SPaymentReq.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the adjustReason value for this SPaymentReq.
     * 
     * @return adjustReason
     */
    public java.lang.String getAdjustReason() {
        return adjustReason;
    }


    /**
     * Sets the adjustReason value for this SPaymentReq.
     * 
     * @param adjustReason
     */
    public void setAdjustReason(java.lang.String adjustReason) {
        this.adjustReason = adjustReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPaymentReq)) return false;
        SPaymentReq other = (SPaymentReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.paymentChannel==null && other.getPaymentChannel()==null) || 
             (this.paymentChannel!=null &&
              this.paymentChannel.equals(other.getPaymentChannel()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.adjustReason==null && other.getAdjustReason()==null) || 
             (this.adjustReason!=null &&
              this.adjustReason.equals(other.getAdjustReason())));
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
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getPaymentChannel() != null) {
            _hashCode += getPaymentChannel().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getAdjustReason() != null) {
            _hashCode += getAdjustReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPaymentReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaymentReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustReason"));
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
