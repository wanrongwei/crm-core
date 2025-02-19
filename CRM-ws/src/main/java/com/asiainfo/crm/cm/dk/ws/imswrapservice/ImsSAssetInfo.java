/**
 * ImsSAssetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class ImsSAssetInfo  implements java.io.Serializable {
    private java.lang.Long payAcctId;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Integer assetType;

    private java.lang.Long assetId;

    private java.lang.Integer assetItemId;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    private java.lang.Long amount;

    private java.lang.Integer status;

    private java.lang.Integer measureId;

    private java.lang.Long productId;

    private java.lang.Integer isCommonPocket;

    private java.lang.Short negativeFlag;

    private java.lang.Integer billingType;

    private java.lang.Long orgAmount;

    private java.lang.Boolean isOneTimeFreeRes;

    private java.util.Calendar orgValidDate;

    private java.util.Calendar orgExpireDate;

    private java.lang.Long objectId;

    private java.lang.Short objectType;

    private java.lang.Integer mainBalanceFlag;

    private java.lang.Long remainAmount;

    private java.lang.Integer groupId;

    private java.lang.String groupName;

    public ImsSAssetInfo() {
    }

    public ImsSAssetInfo(
           java.lang.Long payAcctId,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Integer assetType,
           java.lang.Long assetId,
           java.lang.Integer assetItemId,
           java.util.Calendar validDate,
           java.util.Calendar expireDate,
           java.lang.Long amount,
           java.lang.Integer status,
           java.lang.Integer measureId,
           java.lang.Long productId,
           java.lang.Integer isCommonPocket,
           java.lang.Short negativeFlag,
           java.lang.Integer billingType,
           java.lang.Long orgAmount,
           java.lang.Boolean isOneTimeFreeRes,
           java.util.Calendar orgValidDate,
           java.util.Calendar orgExpireDate,
           java.lang.Long objectId,
           java.lang.Short objectType,
           java.lang.Integer mainBalanceFlag,
           java.lang.Long remainAmount,
           java.lang.Integer groupId,
           java.lang.String groupName) {
           this.payAcctId = payAcctId;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.assetType = assetType;
           this.assetId = assetId;
           this.assetItemId = assetItemId;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.amount = amount;
           this.status = status;
           this.measureId = measureId;
           this.productId = productId;
           this.isCommonPocket = isCommonPocket;
           this.negativeFlag = negativeFlag;
           this.billingType = billingType;
           this.orgAmount = orgAmount;
           this.isOneTimeFreeRes = isOneTimeFreeRes;
           this.orgValidDate = orgValidDate;
           this.orgExpireDate = orgExpireDate;
           this.objectId = objectId;
           this.objectType = objectType;
           this.mainBalanceFlag = mainBalanceFlag;
           this.remainAmount = remainAmount;
           this.groupId = groupId;
           this.groupName = groupName;
    }


    /**
     * Gets the payAcctId value for this ImsSAssetInfo.
     * 
     * @return payAcctId
     */
    public java.lang.Long getPayAcctId() {
        return payAcctId;
    }


    /**
     * Sets the payAcctId value for this ImsSAssetInfo.
     * 
     * @param payAcctId
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }


    /**
     * Gets the acctId value for this ImsSAssetInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this ImsSAssetInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this ImsSAssetInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ImsSAssetInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the assetType value for this ImsSAssetInfo.
     * 
     * @return assetType
     */
    public java.lang.Integer getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this ImsSAssetInfo.
     * 
     * @param assetType
     */
    public void setAssetType(java.lang.Integer assetType) {
        this.assetType = assetType;
    }


    /**
     * Gets the assetId value for this ImsSAssetInfo.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this ImsSAssetInfo.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the assetItemId value for this ImsSAssetInfo.
     * 
     * @return assetItemId
     */
    public java.lang.Integer getAssetItemId() {
        return assetItemId;
    }


    /**
     * Sets the assetItemId value for this ImsSAssetInfo.
     * 
     * @param assetItemId
     */
    public void setAssetItemId(java.lang.Integer assetItemId) {
        this.assetItemId = assetItemId;
    }


    /**
     * Gets the validDate value for this ImsSAssetInfo.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this ImsSAssetInfo.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this ImsSAssetInfo.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ImsSAssetInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the amount value for this ImsSAssetInfo.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ImsSAssetInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the status value for this ImsSAssetInfo.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ImsSAssetInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the measureId value for this ImsSAssetInfo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this ImsSAssetInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the productId value for this ImsSAssetInfo.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ImsSAssetInfo.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the isCommonPocket value for this ImsSAssetInfo.
     * 
     * @return isCommonPocket
     */
    public java.lang.Integer getIsCommonPocket() {
        return isCommonPocket;
    }


    /**
     * Sets the isCommonPocket value for this ImsSAssetInfo.
     * 
     * @param isCommonPocket
     */
    public void setIsCommonPocket(java.lang.Integer isCommonPocket) {
        this.isCommonPocket = isCommonPocket;
    }


    /**
     * Gets the negativeFlag value for this ImsSAssetInfo.
     * 
     * @return negativeFlag
     */
    public java.lang.Short getNegativeFlag() {
        return negativeFlag;
    }


    /**
     * Sets the negativeFlag value for this ImsSAssetInfo.
     * 
     * @param negativeFlag
     */
    public void setNegativeFlag(java.lang.Short negativeFlag) {
        this.negativeFlag = negativeFlag;
    }


    /**
     * Gets the billingType value for this ImsSAssetInfo.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this ImsSAssetInfo.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the orgAmount value for this ImsSAssetInfo.
     * 
     * @return orgAmount
     */
    public java.lang.Long getOrgAmount() {
        return orgAmount;
    }


    /**
     * Sets the orgAmount value for this ImsSAssetInfo.
     * 
     * @param orgAmount
     */
    public void setOrgAmount(java.lang.Long orgAmount) {
        this.orgAmount = orgAmount;
    }


    /**
     * Gets the isOneTimeFreeRes value for this ImsSAssetInfo.
     * 
     * @return isOneTimeFreeRes
     */
    public java.lang.Boolean getIsOneTimeFreeRes() {
        return isOneTimeFreeRes;
    }


    /**
     * Sets the isOneTimeFreeRes value for this ImsSAssetInfo.
     * 
     * @param isOneTimeFreeRes
     */
    public void setIsOneTimeFreeRes(java.lang.Boolean isOneTimeFreeRes) {
        this.isOneTimeFreeRes = isOneTimeFreeRes;
    }


    /**
     * Gets the orgValidDate value for this ImsSAssetInfo.
     * 
     * @return orgValidDate
     */
    public java.util.Calendar getOrgValidDate() {
        return orgValidDate;
    }


    /**
     * Sets the orgValidDate value for this ImsSAssetInfo.
     * 
     * @param orgValidDate
     */
    public void setOrgValidDate(java.util.Calendar orgValidDate) {
        this.orgValidDate = orgValidDate;
    }


    /**
     * Gets the orgExpireDate value for this ImsSAssetInfo.
     * 
     * @return orgExpireDate
     */
    public java.util.Calendar getOrgExpireDate() {
        return orgExpireDate;
    }


    /**
     * Sets the orgExpireDate value for this ImsSAssetInfo.
     * 
     * @param orgExpireDate
     */
    public void setOrgExpireDate(java.util.Calendar orgExpireDate) {
        this.orgExpireDate = orgExpireDate;
    }


    /**
     * Gets the objectId value for this ImsSAssetInfo.
     * 
     * @return objectId
     */
    public java.lang.Long getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this ImsSAssetInfo.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.Long objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectType value for this ImsSAssetInfo.
     * 
     * @return objectType
     */
    public java.lang.Short getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this ImsSAssetInfo.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.Short objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the mainBalanceFlag value for this ImsSAssetInfo.
     * 
     * @return mainBalanceFlag
     */
    public java.lang.Integer getMainBalanceFlag() {
        return mainBalanceFlag;
    }


    /**
     * Sets the mainBalanceFlag value for this ImsSAssetInfo.
     * 
     * @param mainBalanceFlag
     */
    public void setMainBalanceFlag(java.lang.Integer mainBalanceFlag) {
        this.mainBalanceFlag = mainBalanceFlag;
    }


    /**
     * Gets the remainAmount value for this ImsSAssetInfo.
     * 
     * @return remainAmount
     */
    public java.lang.Long getRemainAmount() {
        return remainAmount;
    }


    /**
     * Sets the remainAmount value for this ImsSAssetInfo.
     * 
     * @param remainAmount
     */
    public void setRemainAmount(java.lang.Long remainAmount) {
        this.remainAmount = remainAmount;
    }


    /**
     * Gets the groupId value for this ImsSAssetInfo.
     * 
     * @return groupId
     */
    public java.lang.Integer getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this ImsSAssetInfo.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the groupName value for this ImsSAssetInfo.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ImsSAssetInfo.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImsSAssetInfo)) return false;
        ImsSAssetInfo other = (ImsSAssetInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payAcctId==null && other.getPayAcctId()==null) || 
             (this.payAcctId!=null &&
              this.payAcctId.equals(other.getPayAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.assetItemId==null && other.getAssetItemId()==null) || 
             (this.assetItemId!=null &&
              this.assetItemId.equals(other.getAssetItemId()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.isCommonPocket==null && other.getIsCommonPocket()==null) || 
             (this.isCommonPocket!=null &&
              this.isCommonPocket.equals(other.getIsCommonPocket()))) &&
            ((this.negativeFlag==null && other.getNegativeFlag()==null) || 
             (this.negativeFlag!=null &&
              this.negativeFlag.equals(other.getNegativeFlag()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.orgAmount==null && other.getOrgAmount()==null) || 
             (this.orgAmount!=null &&
              this.orgAmount.equals(other.getOrgAmount()))) &&
            ((this.isOneTimeFreeRes==null && other.getIsOneTimeFreeRes()==null) || 
             (this.isOneTimeFreeRes!=null &&
              this.isOneTimeFreeRes.equals(other.getIsOneTimeFreeRes()))) &&
            ((this.orgValidDate==null && other.getOrgValidDate()==null) || 
             (this.orgValidDate!=null &&
              this.orgValidDate.equals(other.getOrgValidDate()))) &&
            ((this.orgExpireDate==null && other.getOrgExpireDate()==null) || 
             (this.orgExpireDate!=null &&
              this.orgExpireDate.equals(other.getOrgExpireDate()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.mainBalanceFlag==null && other.getMainBalanceFlag()==null) || 
             (this.mainBalanceFlag!=null &&
              this.mainBalanceFlag.equals(other.getMainBalanceFlag()))) &&
            ((this.remainAmount==null && other.getRemainAmount()==null) || 
             (this.remainAmount!=null &&
              this.remainAmount.equals(other.getRemainAmount()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName())));
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
        if (getPayAcctId() != null) {
            _hashCode += getPayAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getAssetItemId() != null) {
            _hashCode += getAssetItemId().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getIsCommonPocket() != null) {
            _hashCode += getIsCommonPocket().hashCode();
        }
        if (getNegativeFlag() != null) {
            _hashCode += getNegativeFlag().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getOrgAmount() != null) {
            _hashCode += getOrgAmount().hashCode();
        }
        if (getIsOneTimeFreeRes() != null) {
            _hashCode += getIsOneTimeFreeRes().hashCode();
        }
        if (getOrgValidDate() != null) {
            _hashCode += getOrgValidDate().hashCode();
        }
        if (getOrgExpireDate() != null) {
            _hashCode += getOrgExpireDate().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getMainBalanceFlag() != null) {
            _hashCode += getMainBalanceFlag().hashCode();
        }
        if (getRemainAmount() != null) {
            _hashCode += getRemainAmount().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImsSAssetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsSAssetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetType"));
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
        elemField.setFieldName("assetItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItemId"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCommonPocket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCommonPocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOneTimeFreeRes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isOneTimeFreeRes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainBalanceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainBalanceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
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
