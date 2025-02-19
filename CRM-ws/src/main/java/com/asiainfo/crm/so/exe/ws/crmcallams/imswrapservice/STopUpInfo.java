/**
 * STopUpInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class STopUpInfo  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Long amount;

    private java.lang.Short recharge_method;

    private java.lang.Integer rechargePartnerId;

    private java.lang.Integer rechargeServiceId;

    private java.lang.String serialNo;

    private java.lang.String batchNo;

    private java.lang.String remark;

    private java.lang.Integer ownerType;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance sBalance;

    private java.lang.String etopupSessionId;

    private java.lang.Short cardType;

    private java.lang.Long relateResourceId;

    private java.lang.String relatePhoneId;

    private java.lang.Integer rechargeItemId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset[] sRewardAssetList;

    public STopUpInfo() {
    }

    public STopUpInfo(
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Long amount,
           java.lang.Short recharge_method,
           java.lang.Integer rechargePartnerId,
           java.lang.Integer rechargeServiceId,
           java.lang.String serialNo,
           java.lang.String batchNo,
           java.lang.String remark,
           java.lang.Integer ownerType,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance sBalance,
           java.lang.String etopupSessionId,
           java.lang.Short cardType,
           java.lang.Long relateResourceId,
           java.lang.String relatePhoneId,
           java.lang.Integer rechargeItemId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset[] sRewardAssetList) {
           this.userId = userId;
           this.phoneId = phoneId;
           this.amount = amount;
           this.recharge_method = recharge_method;
           this.rechargePartnerId = rechargePartnerId;
           this.rechargeServiceId = rechargeServiceId;
           this.serialNo = serialNo;
           this.batchNo = batchNo;
           this.remark = remark;
           this.ownerType = ownerType;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.sBalance = sBalance;
           this.etopupSessionId = etopupSessionId;
           this.cardType = cardType;
           this.relateResourceId = relateResourceId;
           this.relatePhoneId = relatePhoneId;
           this.rechargeItemId = rechargeItemId;
           this.sRewardAssetList = sRewardAssetList;
    }


    /**
     * Gets the userId value for this STopUpInfo.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this STopUpInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this STopUpInfo.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this STopUpInfo.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the amount value for this STopUpInfo.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this STopUpInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the recharge_method value for this STopUpInfo.
     * 
     * @return recharge_method
     */
    public java.lang.Short getRecharge_method() {
        return recharge_method;
    }


    /**
     * Sets the recharge_method value for this STopUpInfo.
     * 
     * @param recharge_method
     */
    public void setRecharge_method(java.lang.Short recharge_method) {
        this.recharge_method = recharge_method;
    }


    /**
     * Gets the rechargePartnerId value for this STopUpInfo.
     * 
     * @return rechargePartnerId
     */
    public java.lang.Integer getRechargePartnerId() {
        return rechargePartnerId;
    }


    /**
     * Sets the rechargePartnerId value for this STopUpInfo.
     * 
     * @param rechargePartnerId
     */
    public void setRechargePartnerId(java.lang.Integer rechargePartnerId) {
        this.rechargePartnerId = rechargePartnerId;
    }


    /**
     * Gets the rechargeServiceId value for this STopUpInfo.
     * 
     * @return rechargeServiceId
     */
    public java.lang.Integer getRechargeServiceId() {
        return rechargeServiceId;
    }


    /**
     * Sets the rechargeServiceId value for this STopUpInfo.
     * 
     * @param rechargeServiceId
     */
    public void setRechargeServiceId(java.lang.Integer rechargeServiceId) {
        this.rechargeServiceId = rechargeServiceId;
    }


    /**
     * Gets the serialNo value for this STopUpInfo.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this STopUpInfo.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the batchNo value for this STopUpInfo.
     * 
     * @return batchNo
     */
    public java.lang.String getBatchNo() {
        return batchNo;
    }


    /**
     * Sets the batchNo value for this STopUpInfo.
     * 
     * @param batchNo
     */
    public void setBatchNo(java.lang.String batchNo) {
        this.batchNo = batchNo;
    }


    /**
     * Gets the remark value for this STopUpInfo.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this STopUpInfo.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the ownerType value for this STopUpInfo.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this STopUpInfo.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the outerAcctId value for this STopUpInfo.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this STopUpInfo.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this STopUpInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this STopUpInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the sBalance value for this STopUpInfo.
     * 
     * @return sBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance getSBalance() {
        return sBalance;
    }


    /**
     * Sets the sBalance value for this STopUpInfo.
     * 
     * @param sBalance
     */
    public void setSBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance sBalance) {
        this.sBalance = sBalance;
    }


    /**
     * Gets the etopupSessionId value for this STopUpInfo.
     * 
     * @return etopupSessionId
     */
    public java.lang.String getEtopupSessionId() {
        return etopupSessionId;
    }


    /**
     * Sets the etopupSessionId value for this STopUpInfo.
     * 
     * @param etopupSessionId
     */
    public void setEtopupSessionId(java.lang.String etopupSessionId) {
        this.etopupSessionId = etopupSessionId;
    }


    /**
     * Gets the cardType value for this STopUpInfo.
     * 
     * @return cardType
     */
    public java.lang.Short getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this STopUpInfo.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.Short cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the relateResourceId value for this STopUpInfo.
     * 
     * @return relateResourceId
     */
    public java.lang.Long getRelateResourceId() {
        return relateResourceId;
    }


    /**
     * Sets the relateResourceId value for this STopUpInfo.
     * 
     * @param relateResourceId
     */
    public void setRelateResourceId(java.lang.Long relateResourceId) {
        this.relateResourceId = relateResourceId;
    }


    /**
     * Gets the relatePhoneId value for this STopUpInfo.
     * 
     * @return relatePhoneId
     */
    public java.lang.String getRelatePhoneId() {
        return relatePhoneId;
    }


    /**
     * Sets the relatePhoneId value for this STopUpInfo.
     * 
     * @param relatePhoneId
     */
    public void setRelatePhoneId(java.lang.String relatePhoneId) {
        this.relatePhoneId = relatePhoneId;
    }


    /**
     * Gets the rechargeItemId value for this STopUpInfo.
     * 
     * @return rechargeItemId
     */
    public java.lang.Integer getRechargeItemId() {
        return rechargeItemId;
    }


    /**
     * Sets the rechargeItemId value for this STopUpInfo.
     * 
     * @param rechargeItemId
     */
    public void setRechargeItemId(java.lang.Integer rechargeItemId) {
        this.rechargeItemId = rechargeItemId;
    }


    /**
     * Gets the sRewardAssetList value for this STopUpInfo.
     * 
     * @return sRewardAssetList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset[] getSRewardAssetList() {
        return sRewardAssetList;
    }


    /**
     * Sets the sRewardAssetList value for this STopUpInfo.
     * 
     * @param sRewardAssetList
     */
    public void setSRewardAssetList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset[] sRewardAssetList) {
        this.sRewardAssetList = sRewardAssetList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset getSRewardAssetList(int i) {
        return this.sRewardAssetList[i];
    }

    public void setSRewardAssetList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset _value) {
        this.sRewardAssetList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STopUpInfo)) return false;
        STopUpInfo other = (STopUpInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.recharge_method==null && other.getRecharge_method()==null) || 
             (this.recharge_method!=null &&
              this.recharge_method.equals(other.getRecharge_method()))) &&
            ((this.rechargePartnerId==null && other.getRechargePartnerId()==null) || 
             (this.rechargePartnerId!=null &&
              this.rechargePartnerId.equals(other.getRechargePartnerId()))) &&
            ((this.rechargeServiceId==null && other.getRechargeServiceId()==null) || 
             (this.rechargeServiceId!=null &&
              this.rechargeServiceId.equals(other.getRechargeServiceId()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.batchNo==null && other.getBatchNo()==null) || 
             (this.batchNo!=null &&
              this.batchNo.equals(other.getBatchNo()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.sBalance==null && other.getSBalance()==null) || 
             (this.sBalance!=null &&
              this.sBalance.equals(other.getSBalance()))) &&
            ((this.etopupSessionId==null && other.getEtopupSessionId()==null) || 
             (this.etopupSessionId!=null &&
              this.etopupSessionId.equals(other.getEtopupSessionId()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.relateResourceId==null && other.getRelateResourceId()==null) || 
             (this.relateResourceId!=null &&
              this.relateResourceId.equals(other.getRelateResourceId()))) &&
            ((this.relatePhoneId==null && other.getRelatePhoneId()==null) || 
             (this.relatePhoneId!=null &&
              this.relatePhoneId.equals(other.getRelatePhoneId()))) &&
            ((this.rechargeItemId==null && other.getRechargeItemId()==null) || 
             (this.rechargeItemId!=null &&
              this.rechargeItemId.equals(other.getRechargeItemId()))) &&
            ((this.sRewardAssetList==null && other.getSRewardAssetList()==null) || 
             (this.sRewardAssetList!=null &&
              java.util.Arrays.equals(this.sRewardAssetList, other.getSRewardAssetList())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRecharge_method() != null) {
            _hashCode += getRecharge_method().hashCode();
        }
        if (getRechargePartnerId() != null) {
            _hashCode += getRechargePartnerId().hashCode();
        }
        if (getRechargeServiceId() != null) {
            _hashCode += getRechargeServiceId().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getBatchNo() != null) {
            _hashCode += getBatchNo().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getSBalance() != null) {
            _hashCode += getSBalance().hashCode();
        }
        if (getEtopupSessionId() != null) {
            _hashCode += getEtopupSessionId().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getRelateResourceId() != null) {
            _hashCode += getRelateResourceId().hashCode();
        }
        if (getRelatePhoneId() != null) {
            _hashCode += getRelatePhoneId().hashCode();
        }
        if (getRechargeItemId() != null) {
            _hashCode += getRechargeItemId().hashCode();
        }
        if (getSRewardAssetList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSRewardAssetList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSRewardAssetList(), i);
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
        new org.apache.axis.description.TypeDesc(STopUpInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTopUpInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recharge_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recharge_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargePartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargePartnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("SBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etopupSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etopupSessionId"));
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
        elemField.setFieldName("relateResourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relateResourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatePhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatePhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRewardAssetList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sRewardAssetList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRewardAsset"));
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
