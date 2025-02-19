/**
 * ImsPocketOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class ImsPocketOut  implements java.io.Serializable {
    private java.lang.Long assetId;

    private java.lang.Integer pocketItem;

    private java.util.Calendar validDate;

    private java.lang.Integer sts;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long resourceId;

    private java.util.Calendar expireDate;

    private java.util.Calendar createDate;

    private java.lang.Long amount;

    private java.lang.Integer billingType;

    private java.lang.Long used;

    private java.lang.Integer measureId;

    private java.lang.Long freezeValue;

    private java.lang.Integer freezeTime;

    private java.lang.Short extendFlag;

    private java.lang.Short negativeFlag;

    private java.lang.Long overdraftMainAmount;

    private java.lang.Long usedNegAmount;

    private java.lang.Long remainBalance;

    public ImsPocketOut() {
    }

    public ImsPocketOut(
           java.lang.Long assetId,
           java.lang.Integer pocketItem,
           java.util.Calendar validDate,
           java.lang.Integer sts,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long resourceId,
           java.util.Calendar expireDate,
           java.util.Calendar createDate,
           java.lang.Long amount,
           java.lang.Integer billingType,
           java.lang.Long used,
           java.lang.Integer measureId,
           java.lang.Long freezeValue,
           java.lang.Integer freezeTime,
           java.lang.Short extendFlag,
           java.lang.Short negativeFlag,
           java.lang.Long overdraftMainAmount,
           java.lang.Long usedNegAmount,
           java.lang.Long remainBalance) {
           this.assetId = assetId;
           this.pocketItem = pocketItem;
           this.validDate = validDate;
           this.sts = sts;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.resourceId = resourceId;
           this.expireDate = expireDate;
           this.createDate = createDate;
           this.amount = amount;
           this.billingType = billingType;
           this.used = used;
           this.measureId = measureId;
           this.freezeValue = freezeValue;
           this.freezeTime = freezeTime;
           this.extendFlag = extendFlag;
           this.negativeFlag = negativeFlag;
           this.overdraftMainAmount = overdraftMainAmount;
           this.usedNegAmount = usedNegAmount;
           this.remainBalance = remainBalance;
    }


    /**
     * Gets the assetId value for this ImsPocketOut.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this ImsPocketOut.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the pocketItem value for this ImsPocketOut.
     * 
     * @return pocketItem
     */
    public java.lang.Integer getPocketItem() {
        return pocketItem;
    }


    /**
     * Sets the pocketItem value for this ImsPocketOut.
     * 
     * @param pocketItem
     */
    public void setPocketItem(java.lang.Integer pocketItem) {
        this.pocketItem = pocketItem;
    }


    /**
     * Gets the validDate value for this ImsPocketOut.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this ImsPocketOut.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the sts value for this ImsPocketOut.
     * 
     * @return sts
     */
    public java.lang.Integer getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this ImsPocketOut.
     * 
     * @param sts
     */
    public void setSts(java.lang.Integer sts) {
        this.sts = sts;
    }


    /**
     * Gets the acctId value for this ImsPocketOut.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this ImsPocketOut.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this ImsPocketOut.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this ImsPocketOut.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the resourceId value for this ImsPocketOut.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ImsPocketOut.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the expireDate value for this ImsPocketOut.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ImsPocketOut.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the createDate value for this ImsPocketOut.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ImsPocketOut.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the amount value for this ImsPocketOut.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ImsPocketOut.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the billingType value for this ImsPocketOut.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this ImsPocketOut.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the used value for this ImsPocketOut.
     * 
     * @return used
     */
    public java.lang.Long getUsed() {
        return used;
    }


    /**
     * Sets the used value for this ImsPocketOut.
     * 
     * @param used
     */
    public void setUsed(java.lang.Long used) {
        this.used = used;
    }


    /**
     * Gets the measureId value for this ImsPocketOut.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this ImsPocketOut.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the freezeValue value for this ImsPocketOut.
     * 
     * @return freezeValue
     */
    public java.lang.Long getFreezeValue() {
        return freezeValue;
    }


    /**
     * Sets the freezeValue value for this ImsPocketOut.
     * 
     * @param freezeValue
     */
    public void setFreezeValue(java.lang.Long freezeValue) {
        this.freezeValue = freezeValue;
    }


    /**
     * Gets the freezeTime value for this ImsPocketOut.
     * 
     * @return freezeTime
     */
    public java.lang.Integer getFreezeTime() {
        return freezeTime;
    }


    /**
     * Sets the freezeTime value for this ImsPocketOut.
     * 
     * @param freezeTime
     */
    public void setFreezeTime(java.lang.Integer freezeTime) {
        this.freezeTime = freezeTime;
    }


    /**
     * Gets the extendFlag value for this ImsPocketOut.
     * 
     * @return extendFlag
     */
    public java.lang.Short getExtendFlag() {
        return extendFlag;
    }


    /**
     * Sets the extendFlag value for this ImsPocketOut.
     * 
     * @param extendFlag
     */
    public void setExtendFlag(java.lang.Short extendFlag) {
        this.extendFlag = extendFlag;
    }


    /**
     * Gets the negativeFlag value for this ImsPocketOut.
     * 
     * @return negativeFlag
     */
    public java.lang.Short getNegativeFlag() {
        return negativeFlag;
    }


    /**
     * Sets the negativeFlag value for this ImsPocketOut.
     * 
     * @param negativeFlag
     */
    public void setNegativeFlag(java.lang.Short negativeFlag) {
        this.negativeFlag = negativeFlag;
    }


    /**
     * Gets the overdraftMainAmount value for this ImsPocketOut.
     * 
     * @return overdraftMainAmount
     */
    public java.lang.Long getOverdraftMainAmount() {
        return overdraftMainAmount;
    }


    /**
     * Sets the overdraftMainAmount value for this ImsPocketOut.
     * 
     * @param overdraftMainAmount
     */
    public void setOverdraftMainAmount(java.lang.Long overdraftMainAmount) {
        this.overdraftMainAmount = overdraftMainAmount;
    }


    /**
     * Gets the usedNegAmount value for this ImsPocketOut.
     * 
     * @return usedNegAmount
     */
    public java.lang.Long getUsedNegAmount() {
        return usedNegAmount;
    }


    /**
     * Sets the usedNegAmount value for this ImsPocketOut.
     * 
     * @param usedNegAmount
     */
    public void setUsedNegAmount(java.lang.Long usedNegAmount) {
        this.usedNegAmount = usedNegAmount;
    }


    /**
     * Gets the remainBalance value for this ImsPocketOut.
     * 
     * @return remainBalance
     */
    public java.lang.Long getRemainBalance() {
        return remainBalance;
    }


    /**
     * Sets the remainBalance value for this ImsPocketOut.
     * 
     * @param remainBalance
     */
    public void setRemainBalance(java.lang.Long remainBalance) {
        this.remainBalance = remainBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImsPocketOut)) return false;
        ImsPocketOut other = (ImsPocketOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.pocketItem==null && other.getPocketItem()==null) || 
             (this.pocketItem!=null &&
              this.pocketItem.equals(other.getPocketItem()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.used==null && other.getUsed()==null) || 
             (this.used!=null &&
              this.used.equals(other.getUsed()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.freezeValue==null && other.getFreezeValue()==null) || 
             (this.freezeValue!=null &&
              this.freezeValue.equals(other.getFreezeValue()))) &&
            ((this.freezeTime==null && other.getFreezeTime()==null) || 
             (this.freezeTime!=null &&
              this.freezeTime.equals(other.getFreezeTime()))) &&
            ((this.extendFlag==null && other.getExtendFlag()==null) || 
             (this.extendFlag!=null &&
              this.extendFlag.equals(other.getExtendFlag()))) &&
            ((this.negativeFlag==null && other.getNegativeFlag()==null) || 
             (this.negativeFlag!=null &&
              this.negativeFlag.equals(other.getNegativeFlag()))) &&
            ((this.overdraftMainAmount==null && other.getOverdraftMainAmount()==null) || 
             (this.overdraftMainAmount!=null &&
              this.overdraftMainAmount.equals(other.getOverdraftMainAmount()))) &&
            ((this.usedNegAmount==null && other.getUsedNegAmount()==null) || 
             (this.usedNegAmount!=null &&
              this.usedNegAmount.equals(other.getUsedNegAmount()))) &&
            ((this.remainBalance==null && other.getRemainBalance()==null) || 
             (this.remainBalance!=null &&
              this.remainBalance.equals(other.getRemainBalance())));
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
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getPocketItem() != null) {
            _hashCode += getPocketItem().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getUsed() != null) {
            _hashCode += getUsed().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getFreezeValue() != null) {
            _hashCode += getFreezeValue().hashCode();
        }
        if (getFreezeTime() != null) {
            _hashCode += getFreezeTime().hashCode();
        }
        if (getExtendFlag() != null) {
            _hashCode += getExtendFlag().hashCode();
        }
        if (getNegativeFlag() != null) {
            _hashCode += getNegativeFlag().hashCode();
        }
        if (getOverdraftMainAmount() != null) {
            _hashCode += getOverdraftMainAmount().hashCode();
        }
        if (getUsedNegAmount() != null) {
            _hashCode += getUsedNegAmount().hashCode();
        }
        if (getRemainBalance() != null) {
            _hashCode += getRemainBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImsPocketOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsPocketOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pocketItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pocketItem"));
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
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("", "used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("freezeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freezeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freezeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freezeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extendFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("overdraftMainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overdraftMainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedNegAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedNegAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainBalance"));
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
