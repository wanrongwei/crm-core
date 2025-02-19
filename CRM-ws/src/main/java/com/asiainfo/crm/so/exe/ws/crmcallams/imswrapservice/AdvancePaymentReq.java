/**
 * AdvancePaymentReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AdvancePaymentReq  implements java.io.Serializable {
    private java.lang.String orgSoNbr;

    private java.lang.Short actionType;

    private java.lang.String paymentDate;

    private java.lang.String createDate;

    private java.lang.Short paymentChannel;

    private java.lang.Short paymentType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentInfo paymentInfo;

    private java.lang.String bankCode;

    private java.lang.Integer realCurrency;

    public AdvancePaymentReq() {
    }

    public AdvancePaymentReq(
           java.lang.String orgSoNbr,
           java.lang.Short actionType,
           java.lang.String paymentDate,
           java.lang.String createDate,
           java.lang.Short paymentChannel,
           java.lang.Short paymentType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentInfo paymentInfo,
           java.lang.String bankCode,
           java.lang.Integer realCurrency) {
           this.orgSoNbr = orgSoNbr;
           this.actionType = actionType;
           this.paymentDate = paymentDate;
           this.createDate = createDate;
           this.paymentChannel = paymentChannel;
           this.paymentType = paymentType;
           this.paymentInfo = paymentInfo;
           this.bankCode = bankCode;
           this.realCurrency = realCurrency;
    }


    /**
     * Gets the orgSoNbr value for this AdvancePaymentReq.
     * 
     * @return orgSoNbr
     */
    public java.lang.String getOrgSoNbr() {
        return orgSoNbr;
    }


    /**
     * Sets the orgSoNbr value for this AdvancePaymentReq.
     * 
     * @param orgSoNbr
     */
    public void setOrgSoNbr(java.lang.String orgSoNbr) {
        this.orgSoNbr = orgSoNbr;
    }


    /**
     * Gets the actionType value for this AdvancePaymentReq.
     * 
     * @return actionType
     */
    public java.lang.Short getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this AdvancePaymentReq.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.Short actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the paymentDate value for this AdvancePaymentReq.
     * 
     * @return paymentDate
     */
    public java.lang.String getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this AdvancePaymentReq.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.lang.String paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the createDate value for this AdvancePaymentReq.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this AdvancePaymentReq.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the paymentChannel value for this AdvancePaymentReq.
     * 
     * @return paymentChannel
     */
    public java.lang.Short getPaymentChannel() {
        return paymentChannel;
    }


    /**
     * Sets the paymentChannel value for this AdvancePaymentReq.
     * 
     * @param paymentChannel
     */
    public void setPaymentChannel(java.lang.Short paymentChannel) {
        this.paymentChannel = paymentChannel;
    }


    /**
     * Gets the paymentType value for this AdvancePaymentReq.
     * 
     * @return paymentType
     */
    public java.lang.Short getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this AdvancePaymentReq.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Short paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the paymentInfo value for this AdvancePaymentReq.
     * 
     * @return paymentInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this AdvancePaymentReq.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the bankCode value for this AdvancePaymentReq.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this AdvancePaymentReq.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the realCurrency value for this AdvancePaymentReq.
     * 
     * @return realCurrency
     */
    public java.lang.Integer getRealCurrency() {
        return realCurrency;
    }


    /**
     * Sets the realCurrency value for this AdvancePaymentReq.
     * 
     * @param realCurrency
     */
    public void setRealCurrency(java.lang.Integer realCurrency) {
        this.realCurrency = realCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvancePaymentReq)) return false;
        AdvancePaymentReq other = (AdvancePaymentReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgSoNbr==null && other.getOrgSoNbr()==null) || 
             (this.orgSoNbr!=null &&
              this.orgSoNbr.equals(other.getOrgSoNbr()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
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
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.realCurrency==null && other.getRealCurrency()==null) || 
             (this.realCurrency!=null &&
              this.realCurrency.equals(other.getRealCurrency())));
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
        if (getOrgSoNbr() != null) {
            _hashCode += getOrgSoNbr().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
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
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getRealCurrency() != null) {
            _hashCode += getRealCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancePaymentReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "advancePaymentReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgSoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("realCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
