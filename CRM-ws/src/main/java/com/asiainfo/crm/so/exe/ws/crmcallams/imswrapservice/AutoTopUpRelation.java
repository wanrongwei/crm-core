/**
 * AutoTopUpRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AutoTopUpRelation  implements java.io.Serializable {
    private java.lang.String autoId;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Long lowBalanceThreshold;

    private java.lang.Long topupAmount;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.Short payChannel;

    private java.lang.String bankAcctId;

    private java.lang.String bankAcctName;

    private java.lang.String creditCardNo;

    private java.lang.Integer bankCode;

    private java.lang.String additionalInfo;

    private java.lang.String cardSerialNo;

    private java.lang.String cardBatchNo;

    private java.lang.Short cardType;

    private java.lang.Short autoType;

    private java.lang.Short topupDate;

    private java.lang.Short notificationFlag;

    public AutoTopUpRelation() {
    }

    public AutoTopUpRelation(
           java.lang.String autoId,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Long lowBalanceThreshold,
           java.lang.Long topupAmount,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.Short payChannel,
           java.lang.String bankAcctId,
           java.lang.String bankAcctName,
           java.lang.String creditCardNo,
           java.lang.Integer bankCode,
           java.lang.String additionalInfo,
           java.lang.String cardSerialNo,
           java.lang.String cardBatchNo,
           java.lang.Short cardType,
           java.lang.Short autoType,
           java.lang.Short topupDate,
           java.lang.Short notificationFlag) {
           this.autoId = autoId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.lowBalanceThreshold = lowBalanceThreshold;
           this.topupAmount = topupAmount;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.payChannel = payChannel;
           this.bankAcctId = bankAcctId;
           this.bankAcctName = bankAcctName;
           this.creditCardNo = creditCardNo;
           this.bankCode = bankCode;
           this.additionalInfo = additionalInfo;
           this.cardSerialNo = cardSerialNo;
           this.cardBatchNo = cardBatchNo;
           this.cardType = cardType;
           this.autoType = autoType;
           this.topupDate = topupDate;
           this.notificationFlag = notificationFlag;
    }


    /**
     * Gets the autoId value for this AutoTopUpRelation.
     * 
     * @return autoId
     */
    public java.lang.String getAutoId() {
        return autoId;
    }


    /**
     * Sets the autoId value for this AutoTopUpRelation.
     * 
     * @param autoId
     */
    public void setAutoId(java.lang.String autoId) {
        this.autoId = autoId;
    }


    /**
     * Gets the outerAcctId value for this AutoTopUpRelation.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this AutoTopUpRelation.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this AutoTopUpRelation.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AutoTopUpRelation.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this AutoTopUpRelation.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AutoTopUpRelation.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this AutoTopUpRelation.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this AutoTopUpRelation.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the lowBalanceThreshold value for this AutoTopUpRelation.
     * 
     * @return lowBalanceThreshold
     */
    public java.lang.Long getLowBalanceThreshold() {
        return lowBalanceThreshold;
    }


    /**
     * Sets the lowBalanceThreshold value for this AutoTopUpRelation.
     * 
     * @param lowBalanceThreshold
     */
    public void setLowBalanceThreshold(java.lang.Long lowBalanceThreshold) {
        this.lowBalanceThreshold = lowBalanceThreshold;
    }


    /**
     * Gets the topupAmount value for this AutoTopUpRelation.
     * 
     * @return topupAmount
     */
    public java.lang.Long getTopupAmount() {
        return topupAmount;
    }


    /**
     * Sets the topupAmount value for this AutoTopUpRelation.
     * 
     * @param topupAmount
     */
    public void setTopupAmount(java.lang.Long topupAmount) {
        this.topupAmount = topupAmount;
    }


    /**
     * Gets the validDate value for this AutoTopUpRelation.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this AutoTopUpRelation.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this AutoTopUpRelation.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this AutoTopUpRelation.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the payChannel value for this AutoTopUpRelation.
     * 
     * @return payChannel
     */
    public java.lang.Short getPayChannel() {
        return payChannel;
    }


    /**
     * Sets the payChannel value for this AutoTopUpRelation.
     * 
     * @param payChannel
     */
    public void setPayChannel(java.lang.Short payChannel) {
        this.payChannel = payChannel;
    }


    /**
     * Gets the bankAcctId value for this AutoTopUpRelation.
     * 
     * @return bankAcctId
     */
    public java.lang.String getBankAcctId() {
        return bankAcctId;
    }


    /**
     * Sets the bankAcctId value for this AutoTopUpRelation.
     * 
     * @param bankAcctId
     */
    public void setBankAcctId(java.lang.String bankAcctId) {
        this.bankAcctId = bankAcctId;
    }


    /**
     * Gets the bankAcctName value for this AutoTopUpRelation.
     * 
     * @return bankAcctName
     */
    public java.lang.String getBankAcctName() {
        return bankAcctName;
    }


    /**
     * Sets the bankAcctName value for this AutoTopUpRelation.
     * 
     * @param bankAcctName
     */
    public void setBankAcctName(java.lang.String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }


    /**
     * Gets the creditCardNo value for this AutoTopUpRelation.
     * 
     * @return creditCardNo
     */
    public java.lang.String getCreditCardNo() {
        return creditCardNo;
    }


    /**
     * Sets the creditCardNo value for this AutoTopUpRelation.
     * 
     * @param creditCardNo
     */
    public void setCreditCardNo(java.lang.String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }


    /**
     * Gets the bankCode value for this AutoTopUpRelation.
     * 
     * @return bankCode
     */
    public java.lang.Integer getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this AutoTopUpRelation.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.Integer bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the additionalInfo value for this AutoTopUpRelation.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this AutoTopUpRelation.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the cardSerialNo value for this AutoTopUpRelation.
     * 
     * @return cardSerialNo
     */
    public java.lang.String getCardSerialNo() {
        return cardSerialNo;
    }


    /**
     * Sets the cardSerialNo value for this AutoTopUpRelation.
     * 
     * @param cardSerialNo
     */
    public void setCardSerialNo(java.lang.String cardSerialNo) {
        this.cardSerialNo = cardSerialNo;
    }


    /**
     * Gets the cardBatchNo value for this AutoTopUpRelation.
     * 
     * @return cardBatchNo
     */
    public java.lang.String getCardBatchNo() {
        return cardBatchNo;
    }


    /**
     * Sets the cardBatchNo value for this AutoTopUpRelation.
     * 
     * @param cardBatchNo
     */
    public void setCardBatchNo(java.lang.String cardBatchNo) {
        this.cardBatchNo = cardBatchNo;
    }


    /**
     * Gets the cardType value for this AutoTopUpRelation.
     * 
     * @return cardType
     */
    public java.lang.Short getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this AutoTopUpRelation.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.Short cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the autoType value for this AutoTopUpRelation.
     * 
     * @return autoType
     */
    public java.lang.Short getAutoType() {
        return autoType;
    }


    /**
     * Sets the autoType value for this AutoTopUpRelation.
     * 
     * @param autoType
     */
    public void setAutoType(java.lang.Short autoType) {
        this.autoType = autoType;
    }


    /**
     * Gets the topupDate value for this AutoTopUpRelation.
     * 
     * @return topupDate
     */
    public java.lang.Short getTopupDate() {
        return topupDate;
    }


    /**
     * Sets the topupDate value for this AutoTopUpRelation.
     * 
     * @param topupDate
     */
    public void setTopupDate(java.lang.Short topupDate) {
        this.topupDate = topupDate;
    }


    /**
     * Gets the notificationFlag value for this AutoTopUpRelation.
     * 
     * @return notificationFlag
     */
    public java.lang.Short getNotificationFlag() {
        return notificationFlag;
    }


    /**
     * Sets the notificationFlag value for this AutoTopUpRelation.
     * 
     * @param notificationFlag
     */
    public void setNotificationFlag(java.lang.Short notificationFlag) {
        this.notificationFlag = notificationFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTopUpRelation)) return false;
        AutoTopUpRelation other = (AutoTopUpRelation) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoId==null && other.getAutoId()==null) || 
             (this.autoId!=null &&
              this.autoId.equals(other.getAutoId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.lowBalanceThreshold==null && other.getLowBalanceThreshold()==null) || 
             (this.lowBalanceThreshold!=null &&
              this.lowBalanceThreshold.equals(other.getLowBalanceThreshold()))) &&
            ((this.topupAmount==null && other.getTopupAmount()==null) || 
             (this.topupAmount!=null &&
              this.topupAmount.equals(other.getTopupAmount()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.payChannel==null && other.getPayChannel()==null) || 
             (this.payChannel!=null &&
              this.payChannel.equals(other.getPayChannel()))) &&
            ((this.bankAcctId==null && other.getBankAcctId()==null) || 
             (this.bankAcctId!=null &&
              this.bankAcctId.equals(other.getBankAcctId()))) &&
            ((this.bankAcctName==null && other.getBankAcctName()==null) || 
             (this.bankAcctName!=null &&
              this.bankAcctName.equals(other.getBankAcctName()))) &&
            ((this.creditCardNo==null && other.getCreditCardNo()==null) || 
             (this.creditCardNo!=null &&
              this.creditCardNo.equals(other.getCreditCardNo()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.cardSerialNo==null && other.getCardSerialNo()==null) || 
             (this.cardSerialNo!=null &&
              this.cardSerialNo.equals(other.getCardSerialNo()))) &&
            ((this.cardBatchNo==null && other.getCardBatchNo()==null) || 
             (this.cardBatchNo!=null &&
              this.cardBatchNo.equals(other.getCardBatchNo()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.autoType==null && other.getAutoType()==null) || 
             (this.autoType!=null &&
              this.autoType.equals(other.getAutoType()))) &&
            ((this.topupDate==null && other.getTopupDate()==null) || 
             (this.topupDate!=null &&
              this.topupDate.equals(other.getTopupDate()))) &&
            ((this.notificationFlag==null && other.getNotificationFlag()==null) || 
             (this.notificationFlag!=null &&
              this.notificationFlag.equals(other.getNotificationFlag())));
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
        if (getAutoId() != null) {
            _hashCode += getAutoId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getLowBalanceThreshold() != null) {
            _hashCode += getLowBalanceThreshold().hashCode();
        }
        if (getTopupAmount() != null) {
            _hashCode += getTopupAmount().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getPayChannel() != null) {
            _hashCode += getPayChannel().hashCode();
        }
        if (getBankAcctId() != null) {
            _hashCode += getBankAcctId().hashCode();
        }
        if (getBankAcctName() != null) {
            _hashCode += getBankAcctName().hashCode();
        }
        if (getCreditCardNo() != null) {
            _hashCode += getCreditCardNo().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getCardSerialNo() != null) {
            _hashCode += getCardSerialNo().hashCode();
        }
        if (getCardBatchNo() != null) {
            _hashCode += getCardBatchNo().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getAutoType() != null) {
            _hashCode += getAutoType().hashCode();
        }
        if (getTopupDate() != null) {
            _hashCode += getTopupDate().hashCode();
        }
        if (getNotificationFlag() != null) {
            _hashCode += getNotificationFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoTopUpRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("lowBalanceThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lowBalanceThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topupAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAcctName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAcctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBatchNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardBatchNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationFlag"));
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
