/**
 * CaPayChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class CaPayChannel  extends com.asiainfo.crm.cm.dk.ws.imsservice.DataObject  implements java.io.Serializable {
    private java.lang.Long paymentPlanId;

    private java.lang.Integer paymentMethod;

    private java.lang.Long assetId;

    private java.lang.Integer priority;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    private java.lang.Long soNbr;

    private java.lang.Integer periodType;

    private java.lang.Integer periodUnit;

    private java.lang.Integer offsetDay;

    private java.lang.Long amount;

    private java.util.Calendar createDate;

    private java.util.Calendar soDate;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.String bindPhoneId;

    private java.lang.Long dayFixMoney;

    private java.lang.Long timeFixMoney;

    private java.lang.Integer bindType;

    private java.lang.String authId;

    private java.lang.Integer platForm;

    private java.lang.String ext1;

    private java.lang.String ext2;

    private java.lang.Short sts;

    private java.lang.Long tenantId;

    private java.lang.Integer frequency;

    private java.lang.String reasonCode;

    private java.lang.Integer numberType;

    private java.util.Calendar effectiveDate;

    public CaPayChannel() {
    }

    public CaPayChannel(
           java.lang.Long paymentPlanId,
           java.lang.Integer paymentMethod,
           java.lang.Long assetId,
           java.lang.Integer priority,
           java.util.Calendar validDate,
           java.util.Calendar expireDate,
           java.lang.Long soNbr,
           java.lang.Integer periodType,
           java.lang.Integer periodUnit,
           java.lang.Integer offsetDay,
           java.lang.Long amount,
           java.util.Calendar createDate,
           java.util.Calendar soDate,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.String bindPhoneId,
           java.lang.Long dayFixMoney,
           java.lang.Long timeFixMoney,
           java.lang.Integer bindType,
           java.lang.String authId,
           java.lang.Integer platForm,
           java.lang.String ext1,
           java.lang.String ext2,
           java.lang.Short sts,
           java.lang.Long tenantId,
           java.lang.Integer frequency,
           java.lang.String reasonCode,
           java.lang.Integer numberType,
           java.util.Calendar effectiveDate) {
        this.paymentPlanId = paymentPlanId;
        this.paymentMethod = paymentMethod;
        this.assetId = assetId;
        this.priority = priority;
        this.validDate = validDate;
        this.expireDate = expireDate;
        this.soNbr = soNbr;
        this.periodType = periodType;
        this.periodUnit = periodUnit;
        this.offsetDay = offsetDay;
        this.amount = amount;
        this.createDate = createDate;
        this.soDate = soDate;
        this.acctId = acctId;
        this.resourceId = resourceId;
        this.bindPhoneId = bindPhoneId;
        this.dayFixMoney = dayFixMoney;
        this.timeFixMoney = timeFixMoney;
        this.bindType = bindType;
        this.authId = authId;
        this.platForm = platForm;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.sts = sts;
        this.tenantId = tenantId;
        this.frequency = frequency;
        this.reasonCode = reasonCode;
        this.numberType = numberType;
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the paymentPlanId value for this CaPayChannel.
     * 
     * @return paymentPlanId
     */
    public java.lang.Long getPaymentPlanId() {
        return paymentPlanId;
    }


    /**
     * Sets the paymentPlanId value for this CaPayChannel.
     * 
     * @param paymentPlanId
     */
    public void setPaymentPlanId(java.lang.Long paymentPlanId) {
        this.paymentPlanId = paymentPlanId;
    }


    /**
     * Gets the paymentMethod value for this CaPayChannel.
     * 
     * @return paymentMethod
     */
    public java.lang.Integer getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CaPayChannel.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the assetId value for this CaPayChannel.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this CaPayChannel.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the priority value for this CaPayChannel.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CaPayChannel.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the validDate value for this CaPayChannel.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this CaPayChannel.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this CaPayChannel.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CaPayChannel.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the soNbr value for this CaPayChannel.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this CaPayChannel.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the periodType value for this CaPayChannel.
     * 
     * @return periodType
     */
    public java.lang.Integer getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this CaPayChannel.
     * 
     * @param periodType
     */
    public void setPeriodType(java.lang.Integer periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the periodUnit value for this CaPayChannel.
     * 
     * @return periodUnit
     */
    public java.lang.Integer getPeriodUnit() {
        return periodUnit;
    }


    /**
     * Sets the periodUnit value for this CaPayChannel.
     * 
     * @param periodUnit
     */
    public void setPeriodUnit(java.lang.Integer periodUnit) {
        this.periodUnit = periodUnit;
    }


    /**
     * Gets the offsetDay value for this CaPayChannel.
     * 
     * @return offsetDay
     */
    public java.lang.Integer getOffsetDay() {
        return offsetDay;
    }


    /**
     * Sets the offsetDay value for this CaPayChannel.
     * 
     * @param offsetDay
     */
    public void setOffsetDay(java.lang.Integer offsetDay) {
        this.offsetDay = offsetDay;
    }


    /**
     * Gets the amount value for this CaPayChannel.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CaPayChannel.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the createDate value for this CaPayChannel.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CaPayChannel.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the soDate value for this CaPayChannel.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this CaPayChannel.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the acctId value for this CaPayChannel.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this CaPayChannel.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this CaPayChannel.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this CaPayChannel.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the bindPhoneId value for this CaPayChannel.
     * 
     * @return bindPhoneId
     */
    public java.lang.String getBindPhoneId() {
        return bindPhoneId;
    }


    /**
     * Sets the bindPhoneId value for this CaPayChannel.
     * 
     * @param bindPhoneId
     */
    public void setBindPhoneId(java.lang.String bindPhoneId) {
        this.bindPhoneId = bindPhoneId;
    }


    /**
     * Gets the dayFixMoney value for this CaPayChannel.
     * 
     * @return dayFixMoney
     */
    public java.lang.Long getDayFixMoney() {
        return dayFixMoney;
    }


    /**
     * Sets the dayFixMoney value for this CaPayChannel.
     * 
     * @param dayFixMoney
     */
    public void setDayFixMoney(java.lang.Long dayFixMoney) {
        this.dayFixMoney = dayFixMoney;
    }


    /**
     * Gets the timeFixMoney value for this CaPayChannel.
     * 
     * @return timeFixMoney
     */
    public java.lang.Long getTimeFixMoney() {
        return timeFixMoney;
    }


    /**
     * Sets the timeFixMoney value for this CaPayChannel.
     * 
     * @param timeFixMoney
     */
    public void setTimeFixMoney(java.lang.Long timeFixMoney) {
        this.timeFixMoney = timeFixMoney;
    }


    /**
     * Gets the bindType value for this CaPayChannel.
     * 
     * @return bindType
     */
    public java.lang.Integer getBindType() {
        return bindType;
    }


    /**
     * Sets the bindType value for this CaPayChannel.
     * 
     * @param bindType
     */
    public void setBindType(java.lang.Integer bindType) {
        this.bindType = bindType;
    }


    /**
     * Gets the authId value for this CaPayChannel.
     * 
     * @return authId
     */
    public java.lang.String getAuthId() {
        return authId;
    }


    /**
     * Sets the authId value for this CaPayChannel.
     * 
     * @param authId
     */
    public void setAuthId(java.lang.String authId) {
        this.authId = authId;
    }


    /**
     * Gets the platForm value for this CaPayChannel.
     * 
     * @return platForm
     */
    public java.lang.Integer getPlatForm() {
        return platForm;
    }


    /**
     * Sets the platForm value for this CaPayChannel.
     * 
     * @param platForm
     */
    public void setPlatForm(java.lang.Integer platForm) {
        this.platForm = platForm;
    }


    /**
     * Gets the ext1 value for this CaPayChannel.
     * 
     * @return ext1
     */
    public java.lang.String getExt1() {
        return ext1;
    }


    /**
     * Sets the ext1 value for this CaPayChannel.
     * 
     * @param ext1
     */
    public void setExt1(java.lang.String ext1) {
        this.ext1 = ext1;
    }


    /**
     * Gets the ext2 value for this CaPayChannel.
     * 
     * @return ext2
     */
    public java.lang.String getExt2() {
        return ext2;
    }


    /**
     * Sets the ext2 value for this CaPayChannel.
     * 
     * @param ext2
     */
    public void setExt2(java.lang.String ext2) {
        this.ext2 = ext2;
    }


    /**
     * Gets the sts value for this CaPayChannel.
     * 
     * @return sts
     */
    public java.lang.Short getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this CaPayChannel.
     * 
     * @param sts
     */
    public void setSts(java.lang.Short sts) {
        this.sts = sts;
    }


    /**
     * Gets the tenantId value for this CaPayChannel.
     * 
     * @return tenantId
     */
    public java.lang.Long getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this CaPayChannel.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.Long tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the frequency value for this CaPayChannel.
     * 
     * @return frequency
     */
    public java.lang.Integer getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this CaPayChannel.
     * 
     * @param frequency
     */
    public void setFrequency(java.lang.Integer frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the reasonCode value for this CaPayChannel.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this CaPayChannel.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the numberType value for this CaPayChannel.
     * 
     * @return numberType
     */
    public java.lang.Integer getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this CaPayChannel.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.Integer numberType) {
        this.numberType = numberType;
    }


    /**
     * Gets the effectiveDate value for this CaPayChannel.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this CaPayChannel.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaPayChannel)) return false;
        CaPayChannel other = (CaPayChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentPlanId==null && other.getPaymentPlanId()==null) || 
             (this.paymentPlanId!=null &&
              this.paymentPlanId.equals(other.getPaymentPlanId()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            ((this.periodUnit==null && other.getPeriodUnit()==null) || 
             (this.periodUnit!=null &&
              this.periodUnit.equals(other.getPeriodUnit()))) &&
            ((this.offsetDay==null && other.getOffsetDay()==null) || 
             (this.offsetDay!=null &&
              this.offsetDay.equals(other.getOffsetDay()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.bindPhoneId==null && other.getBindPhoneId()==null) || 
             (this.bindPhoneId!=null &&
              this.bindPhoneId.equals(other.getBindPhoneId()))) &&
            ((this.dayFixMoney==null && other.getDayFixMoney()==null) || 
             (this.dayFixMoney!=null &&
              this.dayFixMoney.equals(other.getDayFixMoney()))) &&
            ((this.timeFixMoney==null && other.getTimeFixMoney()==null) || 
             (this.timeFixMoney!=null &&
              this.timeFixMoney.equals(other.getTimeFixMoney()))) &&
            ((this.bindType==null && other.getBindType()==null) || 
             (this.bindType!=null &&
              this.bindType.equals(other.getBindType()))) &&
            ((this.authId==null && other.getAuthId()==null) || 
             (this.authId!=null &&
              this.authId.equals(other.getAuthId()))) &&
            ((this.platForm==null && other.getPlatForm()==null) || 
             (this.platForm!=null &&
              this.platForm.equals(other.getPlatForm()))) &&
            ((this.ext1==null && other.getExt1()==null) || 
             (this.ext1!=null &&
              this.ext1.equals(other.getExt1()))) &&
            ((this.ext2==null && other.getExt2()==null) || 
             (this.ext2!=null &&
              this.ext2.equals(other.getExt2()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType()))) &&
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
        if (getPaymentPlanId() != null) {
            _hashCode += getPaymentPlanId().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        if (getPeriodUnit() != null) {
            _hashCode += getPeriodUnit().hashCode();
        }
        if (getOffsetDay() != null) {
            _hashCode += getOffsetDay().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getBindPhoneId() != null) {
            _hashCode += getBindPhoneId().hashCode();
        }
        if (getDayFixMoney() != null) {
            _hashCode += getDayFixMoney().hashCode();
        }
        if (getTimeFixMoney() != null) {
            _hashCode += getTimeFixMoney().hashCode();
        }
        if (getBindType() != null) {
            _hashCode += getBindType().hashCode();
        }
        if (getAuthId() != null) {
            _hashCode += getAuthId().hashCode();
        }
        if (getPlatForm() != null) {
            _hashCode += getPlatForm().hashCode();
        }
        if (getExt1() != null) {
            _hashCode += getExt1().hashCode();
        }
        if (getExt2() != null) {
            _hashCode += getExt2().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaPayChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caPayChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offsetDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offsetDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayFixMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayFixMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFixMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeFixMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platForm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "platForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ext1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ext1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ext2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ext2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
