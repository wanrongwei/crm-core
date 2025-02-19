/**
 * SPayChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SPayChannel  implements java.io.Serializable {
    private java.lang.Short paymentType;

    private java.lang.String bankId;

    private java.lang.String bankAcctNbr;

    private java.lang.String cardNo;

    private java.lang.String cardIssuingBank;

    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    public SPayChannel() {
    }

    public SPayChannel(
           java.lang.Short paymentType,
           java.lang.String bankId,
           java.lang.String bankAcctNbr,
           java.lang.String cardNo,
           java.lang.String cardIssuingBank,
           java.lang.String outerCustId,
           java.lang.Long custId,
           java.lang.String outerAcctId,
           java.lang.Long acctId) {
           this.paymentType = paymentType;
           this.bankId = bankId;
           this.bankAcctNbr = bankAcctNbr;
           this.cardNo = cardNo;
           this.cardIssuingBank = cardIssuingBank;
           this.outerCustId = outerCustId;
           this.custId = custId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
    }


    /**
     * Gets the paymentType value for this SPayChannel.
     * 
     * @return paymentType
     */
    public java.lang.Short getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this SPayChannel.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Short paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the bankId value for this SPayChannel.
     * 
     * @return bankId
     */
    public java.lang.String getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this SPayChannel.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.String bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the bankAcctNbr value for this SPayChannel.
     * 
     * @return bankAcctNbr
     */
    public java.lang.String getBankAcctNbr() {
        return bankAcctNbr;
    }


    /**
     * Sets the bankAcctNbr value for this SPayChannel.
     * 
     * @param bankAcctNbr
     */
    public void setBankAcctNbr(java.lang.String bankAcctNbr) {
        this.bankAcctNbr = bankAcctNbr;
    }


    /**
     * Gets the cardNo value for this SPayChannel.
     * 
     * @return cardNo
     */
    public java.lang.String getCardNo() {
        return cardNo;
    }


    /**
     * Sets the cardNo value for this SPayChannel.
     * 
     * @param cardNo
     */
    public void setCardNo(java.lang.String cardNo) {
        this.cardNo = cardNo;
    }


    /**
     * Gets the cardIssuingBank value for this SPayChannel.
     * 
     * @return cardIssuingBank
     */
    public java.lang.String getCardIssuingBank() {
        return cardIssuingBank;
    }


    /**
     * Sets the cardIssuingBank value for this SPayChannel.
     * 
     * @param cardIssuingBank
     */
    public void setCardIssuingBank(java.lang.String cardIssuingBank) {
        this.cardIssuingBank = cardIssuingBank;
    }


    /**
     * Gets the outerCustId value for this SPayChannel.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this SPayChannel.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this SPayChannel.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this SPayChannel.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the outerAcctId value for this SPayChannel.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SPayChannel.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SPayChannel.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SPayChannel.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPayChannel)) return false;
        SPayChannel other = (SPayChannel) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            ((this.bankAcctNbr==null && other.getBankAcctNbr()==null) || 
             (this.bankAcctNbr!=null &&
              this.bankAcctNbr.equals(other.getBankAcctNbr()))) &&
            ((this.cardNo==null && other.getCardNo()==null) || 
             (this.cardNo!=null &&
              this.cardNo.equals(other.getCardNo()))) &&
            ((this.cardIssuingBank==null && other.getCardIssuingBank()==null) || 
             (this.cardIssuingBank!=null &&
              this.cardIssuingBank.equals(other.getCardIssuingBank()))) &&
            ((this.outerCustId==null && other.getOuterCustId()==null) || 
             (this.outerCustId!=null &&
              this.outerCustId.equals(other.getOuterCustId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        if (getBankAcctNbr() != null) {
            _hashCode += getBankAcctNbr().hashCode();
        }
        if (getCardNo() != null) {
            _hashCode += getCardNo().hashCode();
        }
        if (getCardIssuingBank() != null) {
            _hashCode += getCardIssuingBank().hashCode();
        }
        if (getOuterCustId() != null) {
            _hashCode += getOuterCustId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPayChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAcctNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAcctNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardIssuingBank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardIssuingBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
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
