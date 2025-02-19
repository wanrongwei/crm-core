/**
 * RechargeLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class RechargeLog  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.String outerAcctId;

    private long acctId;

    private short flag;

    private java.lang.Long opId;

    private java.lang.String rechargeTime;

    private long amount;

    private java.lang.String remark;

    private java.lang.String cardSerialNo;

    private java.lang.Short rechargeMethod;

    private java.lang.String rechargePartnerId;

    private java.lang.Integer rechargeServiceId;

    private java.lang.String paymentMode;

    private java.lang.String cardBatchNo;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance oldBalance;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance[] newBalanceList;

    private java.lang.Short soMode;

    private java.lang.String sourceSystem;

    private java.lang.String transactionId;

    private java.lang.Integer validityPeriod;

    private java.lang.Integer extraValidity;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResourceGroup[] freeResrouceGroupList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductOrder[] productOrdResultList;

    private java.lang.String etopupSessionId;

    private java.util.Calendar operationDate;

    private java.lang.String failReason;

    private java.lang.Long measureId;

    private java.lang.Short status;

    private java.lang.Long balance;

    private java.lang.Long preBalance;

    public RechargeLog() {
    }

    public RechargeLog(
           java.lang.String phoneId,
           java.lang.String outerAcctId,
           long acctId,
           short flag,
           java.lang.Long opId,
           java.lang.String rechargeTime,
           long amount,
           java.lang.String remark,
           java.lang.String cardSerialNo,
           java.lang.Short rechargeMethod,
           java.lang.String rechargePartnerId,
           java.lang.Integer rechargeServiceId,
           java.lang.String paymentMode,
           java.lang.String cardBatchNo,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance oldBalance,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance[] newBalanceList,
           java.lang.Short soMode,
           java.lang.String sourceSystem,
           java.lang.String transactionId,
           java.lang.Integer validityPeriod,
           java.lang.Integer extraValidity,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResourceGroup[] freeResrouceGroupList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductOrder[] productOrdResultList,
           java.lang.String etopupSessionId,
           java.util.Calendar operationDate,
           java.lang.String failReason,
           java.lang.Long measureId,
           java.lang.Short status,
           java.lang.Long balance,
           java.lang.Long preBalance) {
           this.phoneId = phoneId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.flag = flag;
           this.opId = opId;
           this.rechargeTime = rechargeTime;
           this.amount = amount;
           this.remark = remark;
           this.cardSerialNo = cardSerialNo;
           this.rechargeMethod = rechargeMethod;
           this.rechargePartnerId = rechargePartnerId;
           this.rechargeServiceId = rechargeServiceId;
           this.paymentMode = paymentMode;
           this.cardBatchNo = cardBatchNo;
           this.oldBalance = oldBalance;
           this.newBalanceList = newBalanceList;
           this.soMode = soMode;
           this.sourceSystem = sourceSystem;
           this.transactionId = transactionId;
           this.validityPeriod = validityPeriod;
           this.extraValidity = extraValidity;
           this.freeResrouceGroupList = freeResrouceGroupList;
           this.productOrdResultList = productOrdResultList;
           this.etopupSessionId = etopupSessionId;
           this.operationDate = operationDate;
           this.failReason = failReason;
           this.measureId = measureId;
           this.status = status;
           this.balance = balance;
           this.preBalance = preBalance;
    }


    /**
     * Gets the phoneId value for this RechargeLog.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this RechargeLog.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the outerAcctId value for this RechargeLog.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this RechargeLog.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this RechargeLog.
     * 
     * @return acctId
     */
    public long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this RechargeLog.
     * 
     * @param acctId
     */
    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the flag value for this RechargeLog.
     * 
     * @return flag
     */
    public short getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this RechargeLog.
     * 
     * @param flag
     */
    public void setFlag(short flag) {
        this.flag = flag;
    }


    /**
     * Gets the opId value for this RechargeLog.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this RechargeLog.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the rechargeTime value for this RechargeLog.
     * 
     * @return rechargeTime
     */
    public java.lang.String getRechargeTime() {
        return rechargeTime;
    }


    /**
     * Sets the rechargeTime value for this RechargeLog.
     * 
     * @param rechargeTime
     */
    public void setRechargeTime(java.lang.String rechargeTime) {
        this.rechargeTime = rechargeTime;
    }


    /**
     * Gets the amount value for this RechargeLog.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RechargeLog.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the remark value for this RechargeLog.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this RechargeLog.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the cardSerialNo value for this RechargeLog.
     * 
     * @return cardSerialNo
     */
    public java.lang.String getCardSerialNo() {
        return cardSerialNo;
    }


    /**
     * Sets the cardSerialNo value for this RechargeLog.
     * 
     * @param cardSerialNo
     */
    public void setCardSerialNo(java.lang.String cardSerialNo) {
        this.cardSerialNo = cardSerialNo;
    }


    /**
     * Gets the rechargeMethod value for this RechargeLog.
     * 
     * @return rechargeMethod
     */
    public java.lang.Short getRechargeMethod() {
        return rechargeMethod;
    }


    /**
     * Sets the rechargeMethod value for this RechargeLog.
     * 
     * @param rechargeMethod
     */
    public void setRechargeMethod(java.lang.Short rechargeMethod) {
        this.rechargeMethod = rechargeMethod;
    }


    /**
     * Gets the rechargePartnerId value for this RechargeLog.
     * 
     * @return rechargePartnerId
     */
    public java.lang.String getRechargePartnerId() {
        return rechargePartnerId;
    }


    /**
     * Sets the rechargePartnerId value for this RechargeLog.
     * 
     * @param rechargePartnerId
     */
    public void setRechargePartnerId(java.lang.String rechargePartnerId) {
        this.rechargePartnerId = rechargePartnerId;
    }


    /**
     * Gets the rechargeServiceId value for this RechargeLog.
     * 
     * @return rechargeServiceId
     */
    public java.lang.Integer getRechargeServiceId() {
        return rechargeServiceId;
    }


    /**
     * Sets the rechargeServiceId value for this RechargeLog.
     * 
     * @param rechargeServiceId
     */
    public void setRechargeServiceId(java.lang.Integer rechargeServiceId) {
        this.rechargeServiceId = rechargeServiceId;
    }


    /**
     * Gets the paymentMode value for this RechargeLog.
     * 
     * @return paymentMode
     */
    public java.lang.String getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this RechargeLog.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the cardBatchNo value for this RechargeLog.
     * 
     * @return cardBatchNo
     */
    public java.lang.String getCardBatchNo() {
        return cardBatchNo;
    }


    /**
     * Sets the cardBatchNo value for this RechargeLog.
     * 
     * @param cardBatchNo
     */
    public void setCardBatchNo(java.lang.String cardBatchNo) {
        this.cardBatchNo = cardBatchNo;
    }


    /**
     * Gets the oldBalance value for this RechargeLog.
     * 
     * @return oldBalance
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance getOldBalance() {
        return oldBalance;
    }


    /**
     * Sets the oldBalance value for this RechargeLog.
     * 
     * @param oldBalance
     */
    public void setOldBalance(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance oldBalance) {
        this.oldBalance = oldBalance;
    }


    /**
     * Gets the newBalanceList value for this RechargeLog.
     * 
     * @return newBalanceList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance[] getNewBalanceList() {
        return newBalanceList;
    }


    /**
     * Sets the newBalanceList value for this RechargeLog.
     * 
     * @param newBalanceList
     */
    public void setNewBalanceList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBalance[] newBalanceList) {
        this.newBalanceList = newBalanceList;
    }


    /**
     * Gets the soMode value for this RechargeLog.
     * 
     * @return soMode
     */
    public java.lang.Short getSoMode() {
        return soMode;
    }


    /**
     * Sets the soMode value for this RechargeLog.
     * 
     * @param soMode
     */
    public void setSoMode(java.lang.Short soMode) {
        this.soMode = soMode;
    }


    /**
     * Gets the sourceSystem value for this RechargeLog.
     * 
     * @return sourceSystem
     */
    public java.lang.String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this RechargeLog.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(java.lang.String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the transactionId value for this RechargeLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RechargeLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the validityPeriod value for this RechargeLog.
     * 
     * @return validityPeriod
     */
    public java.lang.Integer getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this RechargeLog.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the extraValidity value for this RechargeLog.
     * 
     * @return extraValidity
     */
    public java.lang.Integer getExtraValidity() {
        return extraValidity;
    }


    /**
     * Sets the extraValidity value for this RechargeLog.
     * 
     * @param extraValidity
     */
    public void setExtraValidity(java.lang.Integer extraValidity) {
        this.extraValidity = extraValidity;
    }


    /**
     * Gets the freeResrouceGroupList value for this RechargeLog.
     * 
     * @return freeResrouceGroupList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResourceGroup[] getFreeResrouceGroupList() {
        return freeResrouceGroupList;
    }


    /**
     * Sets the freeResrouceGroupList value for this RechargeLog.
     * 
     * @param freeResrouceGroupList
     */
    public void setFreeResrouceGroupList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResourceGroup[] freeResrouceGroupList) {
        this.freeResrouceGroupList = freeResrouceGroupList;
    }


    /**
     * Gets the productOrdResultList value for this RechargeLog.
     * 
     * @return productOrdResultList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductOrder[] getProductOrdResultList() {
        return productOrdResultList;
    }


    /**
     * Sets the productOrdResultList value for this RechargeLog.
     * 
     * @param productOrdResultList
     */
    public void setProductOrdResultList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductOrder[] productOrdResultList) {
        this.productOrdResultList = productOrdResultList;
    }


    /**
     * Gets the etopupSessionId value for this RechargeLog.
     * 
     * @return etopupSessionId
     */
    public java.lang.String getEtopupSessionId() {
        return etopupSessionId;
    }


    /**
     * Sets the etopupSessionId value for this RechargeLog.
     * 
     * @param etopupSessionId
     */
    public void setEtopupSessionId(java.lang.String etopupSessionId) {
        this.etopupSessionId = etopupSessionId;
    }


    /**
     * Gets the operationDate value for this RechargeLog.
     * 
     * @return operationDate
     */
    public java.util.Calendar getOperationDate() {
        return operationDate;
    }


    /**
     * Sets the operationDate value for this RechargeLog.
     * 
     * @param operationDate
     */
    public void setOperationDate(java.util.Calendar operationDate) {
        this.operationDate = operationDate;
    }


    /**
     * Gets the failReason value for this RechargeLog.
     * 
     * @return failReason
     */
    public java.lang.String getFailReason() {
        return failReason;
    }


    /**
     * Sets the failReason value for this RechargeLog.
     * 
     * @param failReason
     */
    public void setFailReason(java.lang.String failReason) {
        this.failReason = failReason;
    }


    /**
     * Gets the measureId value for this RechargeLog.
     * 
     * @return measureId
     */
    public java.lang.Long getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this RechargeLog.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Long measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the status value for this RechargeLog.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RechargeLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the balance value for this RechargeLog.
     * 
     * @return balance
     */
    public java.lang.Long getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this RechargeLog.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }


    /**
     * Gets the preBalance value for this RechargeLog.
     * 
     * @return preBalance
     */
    public java.lang.Long getPreBalance() {
        return preBalance;
    }


    /**
     * Sets the preBalance value for this RechargeLog.
     * 
     * @param preBalance
     */
    public void setPreBalance(java.lang.Long preBalance) {
        this.preBalance = preBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeLog)) return false;
        RechargeLog other = (RechargeLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            this.acctId == other.getAcctId() &&
            this.flag == other.getFlag() &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.rechargeTime==null && other.getRechargeTime()==null) || 
             (this.rechargeTime!=null &&
              this.rechargeTime.equals(other.getRechargeTime()))) &&
            this.amount == other.getAmount() &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.cardSerialNo==null && other.getCardSerialNo()==null) || 
             (this.cardSerialNo!=null &&
              this.cardSerialNo.equals(other.getCardSerialNo()))) &&
            ((this.rechargeMethod==null && other.getRechargeMethod()==null) || 
             (this.rechargeMethod!=null &&
              this.rechargeMethod.equals(other.getRechargeMethod()))) &&
            ((this.rechargePartnerId==null && other.getRechargePartnerId()==null) || 
             (this.rechargePartnerId!=null &&
              this.rechargePartnerId.equals(other.getRechargePartnerId()))) &&
            ((this.rechargeServiceId==null && other.getRechargeServiceId()==null) || 
             (this.rechargeServiceId!=null &&
              this.rechargeServiceId.equals(other.getRechargeServiceId()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.cardBatchNo==null && other.getCardBatchNo()==null) || 
             (this.cardBatchNo!=null &&
              this.cardBatchNo.equals(other.getCardBatchNo()))) &&
            ((this.oldBalance==null && other.getOldBalance()==null) || 
             (this.oldBalance!=null &&
              this.oldBalance.equals(other.getOldBalance()))) &&
            ((this.newBalanceList==null && other.getNewBalanceList()==null) || 
             (this.newBalanceList!=null &&
              java.util.Arrays.equals(this.newBalanceList, other.getNewBalanceList()))) &&
            ((this.soMode==null && other.getSoMode()==null) || 
             (this.soMode!=null &&
              this.soMode.equals(other.getSoMode()))) &&
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.extraValidity==null && other.getExtraValidity()==null) || 
             (this.extraValidity!=null &&
              this.extraValidity.equals(other.getExtraValidity()))) &&
            ((this.freeResrouceGroupList==null && other.getFreeResrouceGroupList()==null) || 
             (this.freeResrouceGroupList!=null &&
              java.util.Arrays.equals(this.freeResrouceGroupList, other.getFreeResrouceGroupList()))) &&
            ((this.productOrdResultList==null && other.getProductOrdResultList()==null) || 
             (this.productOrdResultList!=null &&
              java.util.Arrays.equals(this.productOrdResultList, other.getProductOrdResultList()))) &&
            ((this.etopupSessionId==null && other.getEtopupSessionId()==null) || 
             (this.etopupSessionId!=null &&
              this.etopupSessionId.equals(other.getEtopupSessionId()))) &&
            ((this.operationDate==null && other.getOperationDate()==null) || 
             (this.operationDate!=null &&
              this.operationDate.equals(other.getOperationDate()))) &&
            ((this.failReason==null && other.getFailReason()==null) || 
             (this.failReason!=null &&
              this.failReason.equals(other.getFailReason()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.preBalance==null && other.getPreBalance()==null) || 
             (this.preBalance!=null &&
              this.preBalance.equals(other.getPreBalance())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        _hashCode += new Long(getAcctId()).hashCode();
        _hashCode += getFlag();
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getRechargeTime() != null) {
            _hashCode += getRechargeTime().hashCode();
        }
        _hashCode += new Long(getAmount()).hashCode();
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getCardSerialNo() != null) {
            _hashCode += getCardSerialNo().hashCode();
        }
        if (getRechargeMethod() != null) {
            _hashCode += getRechargeMethod().hashCode();
        }
        if (getRechargePartnerId() != null) {
            _hashCode += getRechargePartnerId().hashCode();
        }
        if (getRechargeServiceId() != null) {
            _hashCode += getRechargeServiceId().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getCardBatchNo() != null) {
            _hashCode += getCardBatchNo().hashCode();
        }
        if (getOldBalance() != null) {
            _hashCode += getOldBalance().hashCode();
        }
        if (getNewBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewBalanceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoMode() != null) {
            _hashCode += getSoMode().hashCode();
        }
        if (getSourceSystem() != null) {
            _hashCode += getSourceSystem().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getExtraValidity() != null) {
            _hashCode += getExtraValidity().hashCode();
        }
        if (getFreeResrouceGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResrouceGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResrouceGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductOrdResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductOrdResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductOrdResultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEtopupSessionId() != null) {
            _hashCode += getEtopupSessionId().hashCode();
        }
        if (getOperationDate() != null) {
            _hashCode += getOperationDate().hashCode();
        }
        if (getFailReason() != null) {
            _hashCode += getFailReason().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getPreBalance() != null) {
            _hashCode += getPreBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "rechargeLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("cardSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargePartnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargePartnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMode"));
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
        elemField.setFieldName("oldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newBalanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sBalanceListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResrouceGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResrouceGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceGroupItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrdResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOrdResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etopupSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etopupSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preBalance"));
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
