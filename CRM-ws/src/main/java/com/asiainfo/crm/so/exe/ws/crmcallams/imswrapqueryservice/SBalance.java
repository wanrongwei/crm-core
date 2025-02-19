/**
 * SBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SBalance  implements java.io.Serializable {
    private java.lang.Long bookId;

    private java.lang.Long bookItem;

    private java.lang.Double amount;

    private java.lang.Integer days;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.String negativeValidDate;

    private java.lang.String negativeExpireDate;

    private java.lang.Double maxBalance;

    private java.lang.Long maxValidity;

    private java.lang.Double negativeBalance;

    private java.lang.Double remainNegative_balance;

    private java.lang.Short bookItemType;

    private java.lang.Integer measureId;

    private java.lang.Long usedMainAmount;

    private java.lang.Long usedNegativeAmount;

    private java.lang.Long totalNegativeAmount;

    private java.lang.Long totalNegativeRemaining;

    private java.lang.Long assetId;

    private java.lang.Integer isCommonPocket;

    public SBalance() {
    }

    public SBalance(
           java.lang.Long bookId,
           java.lang.Long bookItem,
           java.lang.Double amount,
           java.lang.Integer days,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.String negativeValidDate,
           java.lang.String negativeExpireDate,
           java.lang.Double maxBalance,
           java.lang.Long maxValidity,
           java.lang.Double negativeBalance,
           java.lang.Double remainNegative_balance,
           java.lang.Short bookItemType,
           java.lang.Integer measureId,
           java.lang.Long usedMainAmount,
           java.lang.Long usedNegativeAmount,
           java.lang.Long totalNegativeAmount,
           java.lang.Long totalNegativeRemaining,
           java.lang.Long assetId,
           java.lang.Integer isCommonPocket) {
           this.bookId = bookId;
           this.bookItem = bookItem;
           this.amount = amount;
           this.days = days;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.negativeValidDate = negativeValidDate;
           this.negativeExpireDate = negativeExpireDate;
           this.maxBalance = maxBalance;
           this.maxValidity = maxValidity;
           this.negativeBalance = negativeBalance;
           this.remainNegative_balance = remainNegative_balance;
           this.bookItemType = bookItemType;
           this.measureId = measureId;
           this.usedMainAmount = usedMainAmount;
           this.usedNegativeAmount = usedNegativeAmount;
           this.totalNegativeAmount = totalNegativeAmount;
           this.totalNegativeRemaining = totalNegativeRemaining;
           this.assetId = assetId;
           this.isCommonPocket = isCommonPocket;
    }


    /**
     * Gets the bookId value for this SBalance.
     * 
     * @return bookId
     */
    public java.lang.Long getBookId() {
        return bookId;
    }


    /**
     * Sets the bookId value for this SBalance.
     * 
     * @param bookId
     */
    public void setBookId(java.lang.Long bookId) {
        this.bookId = bookId;
    }


    /**
     * Gets the bookItem value for this SBalance.
     * 
     * @return bookItem
     */
    public java.lang.Long getBookItem() {
        return bookItem;
    }


    /**
     * Sets the bookItem value for this SBalance.
     * 
     * @param bookItem
     */
    public void setBookItem(java.lang.Long bookItem) {
        this.bookItem = bookItem;
    }


    /**
     * Gets the amount value for this SBalance.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SBalance.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the days value for this SBalance.
     * 
     * @return days
     */
    public java.lang.Integer getDays() {
        return days;
    }


    /**
     * Sets the days value for this SBalance.
     * 
     * @param days
     */
    public void setDays(java.lang.Integer days) {
        this.days = days;
    }


    /**
     * Gets the outerAcctId value for this SBalance.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SBalance.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SBalance.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SBalance.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this SBalance.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SBalance.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SBalance.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SBalance.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the validDate value for this SBalance.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SBalance.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SBalance.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SBalance.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the negativeValidDate value for this SBalance.
     * 
     * @return negativeValidDate
     */
    public java.lang.String getNegativeValidDate() {
        return negativeValidDate;
    }


    /**
     * Sets the negativeValidDate value for this SBalance.
     * 
     * @param negativeValidDate
     */
    public void setNegativeValidDate(java.lang.String negativeValidDate) {
        this.negativeValidDate = negativeValidDate;
    }


    /**
     * Gets the negativeExpireDate value for this SBalance.
     * 
     * @return negativeExpireDate
     */
    public java.lang.String getNegativeExpireDate() {
        return negativeExpireDate;
    }


    /**
     * Sets the negativeExpireDate value for this SBalance.
     * 
     * @param negativeExpireDate
     */
    public void setNegativeExpireDate(java.lang.String negativeExpireDate) {
        this.negativeExpireDate = negativeExpireDate;
    }


    /**
     * Gets the maxBalance value for this SBalance.
     * 
     * @return maxBalance
     */
    public java.lang.Double getMaxBalance() {
        return maxBalance;
    }


    /**
     * Sets the maxBalance value for this SBalance.
     * 
     * @param maxBalance
     */
    public void setMaxBalance(java.lang.Double maxBalance) {
        this.maxBalance = maxBalance;
    }


    /**
     * Gets the maxValidity value for this SBalance.
     * 
     * @return maxValidity
     */
    public java.lang.Long getMaxValidity() {
        return maxValidity;
    }


    /**
     * Sets the maxValidity value for this SBalance.
     * 
     * @param maxValidity
     */
    public void setMaxValidity(java.lang.Long maxValidity) {
        this.maxValidity = maxValidity;
    }


    /**
     * Gets the negativeBalance value for this SBalance.
     * 
     * @return negativeBalance
     */
    public java.lang.Double getNegativeBalance() {
        return negativeBalance;
    }


    /**
     * Sets the negativeBalance value for this SBalance.
     * 
     * @param negativeBalance
     */
    public void setNegativeBalance(java.lang.Double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }


    /**
     * Gets the remainNegative_balance value for this SBalance.
     * 
     * @return remainNegative_balance
     */
    public java.lang.Double getRemainNegative_balance() {
        return remainNegative_balance;
    }


    /**
     * Sets the remainNegative_balance value for this SBalance.
     * 
     * @param remainNegative_balance
     */
    public void setRemainNegative_balance(java.lang.Double remainNegative_balance) {
        this.remainNegative_balance = remainNegative_balance;
    }


    /**
     * Gets the bookItemType value for this SBalance.
     * 
     * @return bookItemType
     */
    public java.lang.Short getBookItemType() {
        return bookItemType;
    }


    /**
     * Sets the bookItemType value for this SBalance.
     * 
     * @param bookItemType
     */
    public void setBookItemType(java.lang.Short bookItemType) {
        this.bookItemType = bookItemType;
    }


    /**
     * Gets the measureId value for this SBalance.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SBalance.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the usedMainAmount value for this SBalance.
     * 
     * @return usedMainAmount
     */
    public java.lang.Long getUsedMainAmount() {
        return usedMainAmount;
    }


    /**
     * Sets the usedMainAmount value for this SBalance.
     * 
     * @param usedMainAmount
     */
    public void setUsedMainAmount(java.lang.Long usedMainAmount) {
        this.usedMainAmount = usedMainAmount;
    }


    /**
     * Gets the usedNegativeAmount value for this SBalance.
     * 
     * @return usedNegativeAmount
     */
    public java.lang.Long getUsedNegativeAmount() {
        return usedNegativeAmount;
    }


    /**
     * Sets the usedNegativeAmount value for this SBalance.
     * 
     * @param usedNegativeAmount
     */
    public void setUsedNegativeAmount(java.lang.Long usedNegativeAmount) {
        this.usedNegativeAmount = usedNegativeAmount;
    }


    /**
     * Gets the totalNegativeAmount value for this SBalance.
     * 
     * @return totalNegativeAmount
     */
    public java.lang.Long getTotalNegativeAmount() {
        return totalNegativeAmount;
    }


    /**
     * Sets the totalNegativeAmount value for this SBalance.
     * 
     * @param totalNegativeAmount
     */
    public void setTotalNegativeAmount(java.lang.Long totalNegativeAmount) {
        this.totalNegativeAmount = totalNegativeAmount;
    }


    /**
     * Gets the totalNegativeRemaining value for this SBalance.
     * 
     * @return totalNegativeRemaining
     */
    public java.lang.Long getTotalNegativeRemaining() {
        return totalNegativeRemaining;
    }


    /**
     * Sets the totalNegativeRemaining value for this SBalance.
     * 
     * @param totalNegativeRemaining
     */
    public void setTotalNegativeRemaining(java.lang.Long totalNegativeRemaining) {
        this.totalNegativeRemaining = totalNegativeRemaining;
    }


    /**
     * Gets the assetId value for this SBalance.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this SBalance.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the isCommonPocket value for this SBalance.
     * 
     * @return isCommonPocket
     */
    public java.lang.Integer getIsCommonPocket() {
        return isCommonPocket;
    }


    /**
     * Sets the isCommonPocket value for this SBalance.
     * 
     * @param isCommonPocket
     */
    public void setIsCommonPocket(java.lang.Integer isCommonPocket) {
        this.isCommonPocket = isCommonPocket;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SBalance)) return false;
        SBalance other = (SBalance) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookId==null && other.getBookId()==null) || 
             (this.bookId!=null &&
              this.bookId.equals(other.getBookId()))) &&
            ((this.bookItem==null && other.getBookItem()==null) || 
             (this.bookItem!=null &&
              this.bookItem.equals(other.getBookItem()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
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
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.negativeValidDate==null && other.getNegativeValidDate()==null) || 
             (this.negativeValidDate!=null &&
              this.negativeValidDate.equals(other.getNegativeValidDate()))) &&
            ((this.negativeExpireDate==null && other.getNegativeExpireDate()==null) || 
             (this.negativeExpireDate!=null &&
              this.negativeExpireDate.equals(other.getNegativeExpireDate()))) &&
            ((this.maxBalance==null && other.getMaxBalance()==null) || 
             (this.maxBalance!=null &&
              this.maxBalance.equals(other.getMaxBalance()))) &&
            ((this.maxValidity==null && other.getMaxValidity()==null) || 
             (this.maxValidity!=null &&
              this.maxValidity.equals(other.getMaxValidity()))) &&
            ((this.negativeBalance==null && other.getNegativeBalance()==null) || 
             (this.negativeBalance!=null &&
              this.negativeBalance.equals(other.getNegativeBalance()))) &&
            ((this.remainNegative_balance==null && other.getRemainNegative_balance()==null) || 
             (this.remainNegative_balance!=null &&
              this.remainNegative_balance.equals(other.getRemainNegative_balance()))) &&
            ((this.bookItemType==null && other.getBookItemType()==null) || 
             (this.bookItemType!=null &&
              this.bookItemType.equals(other.getBookItemType()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.usedMainAmount==null && other.getUsedMainAmount()==null) || 
             (this.usedMainAmount!=null &&
              this.usedMainAmount.equals(other.getUsedMainAmount()))) &&
            ((this.usedNegativeAmount==null && other.getUsedNegativeAmount()==null) || 
             (this.usedNegativeAmount!=null &&
              this.usedNegativeAmount.equals(other.getUsedNegativeAmount()))) &&
            ((this.totalNegativeAmount==null && other.getTotalNegativeAmount()==null) || 
             (this.totalNegativeAmount!=null &&
              this.totalNegativeAmount.equals(other.getTotalNegativeAmount()))) &&
            ((this.totalNegativeRemaining==null && other.getTotalNegativeRemaining()==null) || 
             (this.totalNegativeRemaining!=null &&
              this.totalNegativeRemaining.equals(other.getTotalNegativeRemaining()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.isCommonPocket==null && other.getIsCommonPocket()==null) || 
             (this.isCommonPocket!=null &&
              this.isCommonPocket.equals(other.getIsCommonPocket())));
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
        if (getBookId() != null) {
            _hashCode += getBookId().hashCode();
        }
        if (getBookItem() != null) {
            _hashCode += getBookItem().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
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
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getNegativeValidDate() != null) {
            _hashCode += getNegativeValidDate().hashCode();
        }
        if (getNegativeExpireDate() != null) {
            _hashCode += getNegativeExpireDate().hashCode();
        }
        if (getMaxBalance() != null) {
            _hashCode += getMaxBalance().hashCode();
        }
        if (getMaxValidity() != null) {
            _hashCode += getMaxValidity().hashCode();
        }
        if (getNegativeBalance() != null) {
            _hashCode += getNegativeBalance().hashCode();
        }
        if (getRemainNegative_balance() != null) {
            _hashCode += getRemainNegative_balance().hashCode();
        }
        if (getBookItemType() != null) {
            _hashCode += getBookItemType().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getUsedMainAmount() != null) {
            _hashCode += getUsedMainAmount().hashCode();
        }
        if (getUsedNegativeAmount() != null) {
            _hashCode += getUsedNegativeAmount().hashCode();
        }
        if (getTotalNegativeAmount() != null) {
            _hashCode += getTotalNegativeAmount().hashCode();
        }
        if (getTotalNegativeRemaining() != null) {
            _hashCode += getTotalNegativeRemaining().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getIsCommonPocket() != null) {
            _hashCode += getIsCommonPocket().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "days"));
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
        elemField.setFieldName("negativeValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainNegative_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainNegative_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("usedMainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedMainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedNegativeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedNegativeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNegativeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalNegativeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNegativeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalNegativeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("isCommonPocket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCommonPocket"));
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
