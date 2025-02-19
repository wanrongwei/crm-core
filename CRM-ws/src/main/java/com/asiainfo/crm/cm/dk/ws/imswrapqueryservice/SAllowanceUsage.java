/**
 * SAllowanceUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SAllowanceUsage  implements java.io.Serializable {
    private java.lang.Long allwnceOfferId;

    private java.lang.Long allwnceProdId;

    private java.lang.Integer assetItem;

    private java.lang.Long maxEachTime;

    private java.lang.Integer measureId;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Long amount;

    private java.lang.Long usedValue;

    private java.lang.Long remainValue;

    private java.lang.Long validValue;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    private java.lang.Integer needConfirm;

    private java.lang.String relatePhone;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage[] offerLimits;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource[] freeResList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec[] allowanceRecList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn[] assetChgs;

    public SAllowanceUsage() {
    }

    public SAllowanceUsage(
           java.lang.Long allwnceOfferId,
           java.lang.Long allwnceProdId,
           java.lang.Integer assetItem,
           java.lang.Long maxEachTime,
           java.lang.Integer measureId,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Long amount,
           java.lang.Long usedValue,
           java.lang.Long remainValue,
           java.lang.Long validValue,
           java.util.Calendar validDate,
           java.util.Calendar expireDate,
           java.lang.Integer needConfirm,
           java.lang.String relatePhone,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage[] offerLimits,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource[] freeResList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec[] allowanceRecList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn[] assetChgs) {
           this.allwnceOfferId = allwnceOfferId;
           this.allwnceProdId = allwnceProdId;
           this.assetItem = assetItem;
           this.maxEachTime = maxEachTime;
           this.measureId = measureId;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.amount = amount;
           this.usedValue = usedValue;
           this.remainValue = remainValue;
           this.validValue = validValue;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.needConfirm = needConfirm;
           this.relatePhone = relatePhone;
           this.offerLimits = offerLimits;
           this.freeResList = freeResList;
           this.allowanceRecList = allowanceRecList;
           this.assetChgs = assetChgs;
    }


    /**
     * Gets the allwnceOfferId value for this SAllowanceUsage.
     * 
     * @return allwnceOfferId
     */
    public java.lang.Long getAllwnceOfferId() {
        return allwnceOfferId;
    }


    /**
     * Sets the allwnceOfferId value for this SAllowanceUsage.
     * 
     * @param allwnceOfferId
     */
    public void setAllwnceOfferId(java.lang.Long allwnceOfferId) {
        this.allwnceOfferId = allwnceOfferId;
    }


    /**
     * Gets the allwnceProdId value for this SAllowanceUsage.
     * 
     * @return allwnceProdId
     */
    public java.lang.Long getAllwnceProdId() {
        return allwnceProdId;
    }


    /**
     * Sets the allwnceProdId value for this SAllowanceUsage.
     * 
     * @param allwnceProdId
     */
    public void setAllwnceProdId(java.lang.Long allwnceProdId) {
        this.allwnceProdId = allwnceProdId;
    }


    /**
     * Gets the assetItem value for this SAllowanceUsage.
     * 
     * @return assetItem
     */
    public java.lang.Integer getAssetItem() {
        return assetItem;
    }


    /**
     * Sets the assetItem value for this SAllowanceUsage.
     * 
     * @param assetItem
     */
    public void setAssetItem(java.lang.Integer assetItem) {
        this.assetItem = assetItem;
    }


    /**
     * Gets the maxEachTime value for this SAllowanceUsage.
     * 
     * @return maxEachTime
     */
    public java.lang.Long getMaxEachTime() {
        return maxEachTime;
    }


    /**
     * Sets the maxEachTime value for this SAllowanceUsage.
     * 
     * @param maxEachTime
     */
    public void setMaxEachTime(java.lang.Long maxEachTime) {
        this.maxEachTime = maxEachTime;
    }


    /**
     * Gets the measureId value for this SAllowanceUsage.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SAllowanceUsage.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the acctId value for this SAllowanceUsage.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SAllowanceUsage.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SAllowanceUsage.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SAllowanceUsage.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the amount value for this SAllowanceUsage.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SAllowanceUsage.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the usedValue value for this SAllowanceUsage.
     * 
     * @return usedValue
     */
    public java.lang.Long getUsedValue() {
        return usedValue;
    }


    /**
     * Sets the usedValue value for this SAllowanceUsage.
     * 
     * @param usedValue
     */
    public void setUsedValue(java.lang.Long usedValue) {
        this.usedValue = usedValue;
    }


    /**
     * Gets the remainValue value for this SAllowanceUsage.
     * 
     * @return remainValue
     */
    public java.lang.Long getRemainValue() {
        return remainValue;
    }


    /**
     * Sets the remainValue value for this SAllowanceUsage.
     * 
     * @param remainValue
     */
    public void setRemainValue(java.lang.Long remainValue) {
        this.remainValue = remainValue;
    }


    /**
     * Gets the validValue value for this SAllowanceUsage.
     * 
     * @return validValue
     */
    public java.lang.Long getValidValue() {
        return validValue;
    }


    /**
     * Sets the validValue value for this SAllowanceUsage.
     * 
     * @param validValue
     */
    public void setValidValue(java.lang.Long validValue) {
        this.validValue = validValue;
    }


    /**
     * Gets the validDate value for this SAllowanceUsage.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SAllowanceUsage.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SAllowanceUsage.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SAllowanceUsage.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the needConfirm value for this SAllowanceUsage.
     * 
     * @return needConfirm
     */
    public java.lang.Integer getNeedConfirm() {
        return needConfirm;
    }


    /**
     * Sets the needConfirm value for this SAllowanceUsage.
     * 
     * @param needConfirm
     */
    public void setNeedConfirm(java.lang.Integer needConfirm) {
        this.needConfirm = needConfirm;
    }


    /**
     * Gets the relatePhone value for this SAllowanceUsage.
     * 
     * @return relatePhone
     */
    public java.lang.String getRelatePhone() {
        return relatePhone;
    }


    /**
     * Sets the relatePhone value for this SAllowanceUsage.
     * 
     * @param relatePhone
     */
    public void setRelatePhone(java.lang.String relatePhone) {
        this.relatePhone = relatePhone;
    }


    /**
     * Gets the offerLimits value for this SAllowanceUsage.
     * 
     * @return offerLimits
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage[] getOfferLimits() {
        return offerLimits;
    }


    /**
     * Sets the offerLimits value for this SAllowanceUsage.
     * 
     * @param offerLimits
     */
    public void setOfferLimits(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage[] offerLimits) {
        this.offerLimits = offerLimits;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage getOfferLimits(int i) {
        return this.offerLimits[i];
    }

    public void setOfferLimits(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage _value) {
        this.offerLimits[i] = _value;
    }


    /**
     * Gets the freeResList value for this SAllowanceUsage.
     * 
     * @return freeResList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource[] getFreeResList() {
        return freeResList;
    }


    /**
     * Sets the freeResList value for this SAllowanceUsage.
     * 
     * @param freeResList
     */
    public void setFreeResList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource[] freeResList) {
        this.freeResList = freeResList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource getFreeResList(int i) {
        return this.freeResList[i];
    }

    public void setFreeResList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource _value) {
        this.freeResList[i] = _value;
    }


    /**
     * Gets the allowanceRecList value for this SAllowanceUsage.
     * 
     * @return allowanceRecList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec[] getAllowanceRecList() {
        return allowanceRecList;
    }


    /**
     * Sets the allowanceRecList value for this SAllowanceUsage.
     * 
     * @param allowanceRecList
     */
    public void setAllowanceRecList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec[] allowanceRecList) {
        this.allowanceRecList = allowanceRecList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec getAllowanceRecList(int i) {
        return this.allowanceRecList[i];
    }

    public void setAllowanceRecList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec _value) {
        this.allowanceRecList[i] = _value;
    }


    /**
     * Gets the assetChgs value for this SAllowanceUsage.
     * 
     * @return assetChgs
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn[] getAssetChgs() {
        return assetChgs;
    }


    /**
     * Sets the assetChgs value for this SAllowanceUsage.
     * 
     * @param assetChgs
     */
    public void setAssetChgs(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn[] assetChgs) {
        this.assetChgs = assetChgs;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn getAssetChgs(int i) {
        return this.assetChgs[i];
    }

    public void setAssetChgs(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn _value) {
        this.assetChgs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAllowanceUsage)) return false;
        SAllowanceUsage other = (SAllowanceUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allwnceOfferId==null && other.getAllwnceOfferId()==null) || 
             (this.allwnceOfferId!=null &&
              this.allwnceOfferId.equals(other.getAllwnceOfferId()))) &&
            ((this.allwnceProdId==null && other.getAllwnceProdId()==null) || 
             (this.allwnceProdId!=null &&
              this.allwnceProdId.equals(other.getAllwnceProdId()))) &&
            ((this.assetItem==null && other.getAssetItem()==null) || 
             (this.assetItem!=null &&
              this.assetItem.equals(other.getAssetItem()))) &&
            ((this.maxEachTime==null && other.getMaxEachTime()==null) || 
             (this.maxEachTime!=null &&
              this.maxEachTime.equals(other.getMaxEachTime()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.usedValue==null && other.getUsedValue()==null) || 
             (this.usedValue!=null &&
              this.usedValue.equals(other.getUsedValue()))) &&
            ((this.remainValue==null && other.getRemainValue()==null) || 
             (this.remainValue!=null &&
              this.remainValue.equals(other.getRemainValue()))) &&
            ((this.validValue==null && other.getValidValue()==null) || 
             (this.validValue!=null &&
              this.validValue.equals(other.getValidValue()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.needConfirm==null && other.getNeedConfirm()==null) || 
             (this.needConfirm!=null &&
              this.needConfirm.equals(other.getNeedConfirm()))) &&
            ((this.relatePhone==null && other.getRelatePhone()==null) || 
             (this.relatePhone!=null &&
              this.relatePhone.equals(other.getRelatePhone()))) &&
            ((this.offerLimits==null && other.getOfferLimits()==null) || 
             (this.offerLimits!=null &&
              java.util.Arrays.equals(this.offerLimits, other.getOfferLimits()))) &&
            ((this.freeResList==null && other.getFreeResList()==null) || 
             (this.freeResList!=null &&
              java.util.Arrays.equals(this.freeResList, other.getFreeResList()))) &&
            ((this.allowanceRecList==null && other.getAllowanceRecList()==null) || 
             (this.allowanceRecList!=null &&
              java.util.Arrays.equals(this.allowanceRecList, other.getAllowanceRecList()))) &&
            ((this.assetChgs==null && other.getAssetChgs()==null) || 
             (this.assetChgs!=null &&
              java.util.Arrays.equals(this.assetChgs, other.getAssetChgs())));
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
        if (getAllwnceOfferId() != null) {
            _hashCode += getAllwnceOfferId().hashCode();
        }
        if (getAllwnceProdId() != null) {
            _hashCode += getAllwnceProdId().hashCode();
        }
        if (getAssetItem() != null) {
            _hashCode += getAssetItem().hashCode();
        }
        if (getMaxEachTime() != null) {
            _hashCode += getMaxEachTime().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getUsedValue() != null) {
            _hashCode += getUsedValue().hashCode();
        }
        if (getRemainValue() != null) {
            _hashCode += getRemainValue().hashCode();
        }
        if (getValidValue() != null) {
            _hashCode += getValidValue().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getNeedConfirm() != null) {
            _hashCode += getNeedConfirm().hashCode();
        }
        if (getRelatePhone() != null) {
            _hashCode += getRelatePhone().hashCode();
        }
        if (getOfferLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeResList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowanceRecList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowanceRecList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowanceRecList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssetChgs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetChgs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetChgs(), i);
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
        new org.apache.axis.description.TypeDesc(SAllowanceUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allwnceOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allwnceOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allwnceProdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allwnceProdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxEachTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxEachTime"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("needConfirm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needConfirm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceOfferUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFreeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceRecList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceRecList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetChgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetChgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "assetChgIn"));
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
