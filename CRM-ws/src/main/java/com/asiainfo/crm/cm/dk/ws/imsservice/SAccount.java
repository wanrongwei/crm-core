/**
 * SAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SAccount  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Short provCode;

    private java.lang.Short regionCode;

    private java.lang.String outerParentAcctId;

    private java.lang.Long parentAcctId;

    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private java.lang.String acctName;

    private java.lang.Integer company;

    private java.lang.Short acctType;

    private java.lang.Short acctClass;

    private java.lang.Short acctSegment;

    private java.lang.Short status;

    private java.lang.String createDate;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.Short creditClass;

    private java.lang.Double credit;

    private java.lang.Double budget;

    private java.lang.Integer measureId;

    private java.lang.Short forceCycle;

    private java.lang.Integer balanceType;

    private java.lang.Integer countyCode;

    private java.lang.Integer signCreditControl;

    private java.lang.Integer urgeStopFlag;

    private java.lang.Short dueDay;

    private java.lang.Short billDispatching;

    private java.lang.Short billLanguageId;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SBillCycle billCycle;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SPayChannel[] payChannelList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.DoQueryPayChannelResponse payChannels;

    private com.asiainfo.crm.cm.dk.ws.imsservice.ExtendParam[] listExtParam;

    private java.lang.Integer billSts;

    private java.lang.Integer taxFlag;

    private java.lang.Integer accountFlag;

    private com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo[] panHashList;

    private java.lang.Integer caFlag;

    private java.lang.Integer writeoffFlag;

    private java.lang.Integer disableLimit;

    private java.lang.Integer guaranteeFlag;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInv[] custInvList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq[] changeInvList;

    private java.lang.Integer displaySts;

    private java.lang.Integer secondaryStatus;

    private java.lang.Integer billingType;

    public SAccount() {
    }

    public SAccount(
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Short provCode,
           java.lang.Short regionCode,
           java.lang.String outerParentAcctId,
           java.lang.Long parentAcctId,
           java.lang.String outerCustId,
           java.lang.Long custId,
           java.lang.String acctName,
           java.lang.Integer company,
           java.lang.Short acctType,
           java.lang.Short acctClass,
           java.lang.Short acctSegment,
           java.lang.Short status,
           java.lang.String createDate,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.Short creditClass,
           java.lang.Double credit,
           java.lang.Double budget,
           java.lang.Integer measureId,
           java.lang.Short forceCycle,
           java.lang.Integer balanceType,
           java.lang.Integer countyCode,
           java.lang.Integer signCreditControl,
           java.lang.Integer urgeStopFlag,
           java.lang.Short dueDay,
           java.lang.Short billDispatching,
           java.lang.Short billLanguageId,
           com.asiainfo.crm.cm.dk.ws.imsservice.SBillCycle billCycle,
           com.asiainfo.crm.cm.dk.ws.imsservice.SPayChannel[] payChannelList,
           com.asiainfo.crm.cm.dk.ws.imsservice.DoQueryPayChannelResponse payChannels,
           com.asiainfo.crm.cm.dk.ws.imsservice.ExtendParam[] listExtParam,
           java.lang.Integer billSts,
           java.lang.Integer taxFlag,
           java.lang.Integer accountFlag,
           com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo[] panHashList,
           java.lang.Integer caFlag,
           java.lang.Integer writeoffFlag,
           java.lang.Integer disableLimit,
           java.lang.Integer guaranteeFlag,
           com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInv[] custInvList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq[] changeInvList,
           java.lang.Integer displaySts,
           java.lang.Integer secondaryStatus,
           java.lang.Integer billingType) {
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.provCode = provCode;
           this.regionCode = regionCode;
           this.outerParentAcctId = outerParentAcctId;
           this.parentAcctId = parentAcctId;
           this.outerCustId = outerCustId;
           this.custId = custId;
           this.acctName = acctName;
           this.company = company;
           this.acctType = acctType;
           this.acctClass = acctClass;
           this.acctSegment = acctSegment;
           this.status = status;
           this.createDate = createDate;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.creditClass = creditClass;
           this.credit = credit;
           this.budget = budget;
           this.measureId = measureId;
           this.forceCycle = forceCycle;
           this.balanceType = balanceType;
           this.countyCode = countyCode;
           this.signCreditControl = signCreditControl;
           this.urgeStopFlag = urgeStopFlag;
           this.dueDay = dueDay;
           this.billDispatching = billDispatching;
           this.billLanguageId = billLanguageId;
           this.billCycle = billCycle;
           this.payChannelList = payChannelList;
           this.payChannels = payChannels;
           this.listExtParam = listExtParam;
           this.billSts = billSts;
           this.taxFlag = taxFlag;
           this.accountFlag = accountFlag;
           this.panHashList = panHashList;
           this.caFlag = caFlag;
           this.writeoffFlag = writeoffFlag;
           this.disableLimit = disableLimit;
           this.guaranteeFlag = guaranteeFlag;
           this.custInvList = custInvList;
           this.changeInvList = changeInvList;
           this.displaySts = displaySts;
           this.secondaryStatus = secondaryStatus;
           this.billingType = billingType;
    }


    /**
     * Gets the outerAcctId value for this SAccount.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SAccount.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SAccount.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SAccount.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the provCode value for this SAccount.
     * 
     * @return provCode
     */
    public java.lang.Short getProvCode() {
        return provCode;
    }


    /**
     * Sets the provCode value for this SAccount.
     * 
     * @param provCode
     */
    public void setProvCode(java.lang.Short provCode) {
        this.provCode = provCode;
    }


    /**
     * Gets the regionCode value for this SAccount.
     * 
     * @return regionCode
     */
    public java.lang.Short getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this SAccount.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.Short regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the outerParentAcctId value for this SAccount.
     * 
     * @return outerParentAcctId
     */
    public java.lang.String getOuterParentAcctId() {
        return outerParentAcctId;
    }


    /**
     * Sets the outerParentAcctId value for this SAccount.
     * 
     * @param outerParentAcctId
     */
    public void setOuterParentAcctId(java.lang.String outerParentAcctId) {
        this.outerParentAcctId = outerParentAcctId;
    }


    /**
     * Gets the parentAcctId value for this SAccount.
     * 
     * @return parentAcctId
     */
    public java.lang.Long getParentAcctId() {
        return parentAcctId;
    }


    /**
     * Sets the parentAcctId value for this SAccount.
     * 
     * @param parentAcctId
     */
    public void setParentAcctId(java.lang.Long parentAcctId) {
        this.parentAcctId = parentAcctId;
    }


    /**
     * Gets the outerCustId value for this SAccount.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this SAccount.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this SAccount.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this SAccount.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the acctName value for this SAccount.
     * 
     * @return acctName
     */
    public java.lang.String getAcctName() {
        return acctName;
    }


    /**
     * Sets the acctName value for this SAccount.
     * 
     * @param acctName
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }


    /**
     * Gets the company value for this SAccount.
     * 
     * @return company
     */
    public java.lang.Integer getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SAccount.
     * 
     * @param company
     */
    public void setCompany(java.lang.Integer company) {
        this.company = company;
    }


    /**
     * Gets the acctType value for this SAccount.
     * 
     * @return acctType
     */
    public java.lang.Short getAcctType() {
        return acctType;
    }


    /**
     * Sets the acctType value for this SAccount.
     * 
     * @param acctType
     */
    public void setAcctType(java.lang.Short acctType) {
        this.acctType = acctType;
    }


    /**
     * Gets the acctClass value for this SAccount.
     * 
     * @return acctClass
     */
    public java.lang.Short getAcctClass() {
        return acctClass;
    }


    /**
     * Sets the acctClass value for this SAccount.
     * 
     * @param acctClass
     */
    public void setAcctClass(java.lang.Short acctClass) {
        this.acctClass = acctClass;
    }


    /**
     * Gets the acctSegment value for this SAccount.
     * 
     * @return acctSegment
     */
    public java.lang.Short getAcctSegment() {
        return acctSegment;
    }


    /**
     * Sets the acctSegment value for this SAccount.
     * 
     * @param acctSegment
     */
    public void setAcctSegment(java.lang.Short acctSegment) {
        this.acctSegment = acctSegment;
    }


    /**
     * Gets the status value for this SAccount.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SAccount.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the createDate value for this SAccount.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SAccount.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the validDate value for this SAccount.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SAccount.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SAccount.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SAccount.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the creditClass value for this SAccount.
     * 
     * @return creditClass
     */
    public java.lang.Short getCreditClass() {
        return creditClass;
    }


    /**
     * Sets the creditClass value for this SAccount.
     * 
     * @param creditClass
     */
    public void setCreditClass(java.lang.Short creditClass) {
        this.creditClass = creditClass;
    }


    /**
     * Gets the credit value for this SAccount.
     * 
     * @return credit
     */
    public java.lang.Double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this SAccount.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Double credit) {
        this.credit = credit;
    }


    /**
     * Gets the budget value for this SAccount.
     * 
     * @return budget
     */
    public java.lang.Double getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this SAccount.
     * 
     * @param budget
     */
    public void setBudget(java.lang.Double budget) {
        this.budget = budget;
    }


    /**
     * Gets the measureId value for this SAccount.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SAccount.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the forceCycle value for this SAccount.
     * 
     * @return forceCycle
     */
    public java.lang.Short getForceCycle() {
        return forceCycle;
    }


    /**
     * Sets the forceCycle value for this SAccount.
     * 
     * @param forceCycle
     */
    public void setForceCycle(java.lang.Short forceCycle) {
        this.forceCycle = forceCycle;
    }


    /**
     * Gets the balanceType value for this SAccount.
     * 
     * @return balanceType
     */
    public java.lang.Integer getBalanceType() {
        return balanceType;
    }


    /**
     * Sets the balanceType value for this SAccount.
     * 
     * @param balanceType
     */
    public void setBalanceType(java.lang.Integer balanceType) {
        this.balanceType = balanceType;
    }


    /**
     * Gets the countyCode value for this SAccount.
     * 
     * @return countyCode
     */
    public java.lang.Integer getCountyCode() {
        return countyCode;
    }


    /**
     * Sets the countyCode value for this SAccount.
     * 
     * @param countyCode
     */
    public void setCountyCode(java.lang.Integer countyCode) {
        this.countyCode = countyCode;
    }


    /**
     * Gets the signCreditControl value for this SAccount.
     * 
     * @return signCreditControl
     */
    public java.lang.Integer getSignCreditControl() {
        return signCreditControl;
    }


    /**
     * Sets the signCreditControl value for this SAccount.
     * 
     * @param signCreditControl
     */
    public void setSignCreditControl(java.lang.Integer signCreditControl) {
        this.signCreditControl = signCreditControl;
    }


    /**
     * Gets the urgeStopFlag value for this SAccount.
     * 
     * @return urgeStopFlag
     */
    public java.lang.Integer getUrgeStopFlag() {
        return urgeStopFlag;
    }


    /**
     * Sets the urgeStopFlag value for this SAccount.
     * 
     * @param urgeStopFlag
     */
    public void setUrgeStopFlag(java.lang.Integer urgeStopFlag) {
        this.urgeStopFlag = urgeStopFlag;
    }


    /**
     * Gets the dueDay value for this SAccount.
     * 
     * @return dueDay
     */
    public java.lang.Short getDueDay() {
        return dueDay;
    }


    /**
     * Sets the dueDay value for this SAccount.
     * 
     * @param dueDay
     */
    public void setDueDay(java.lang.Short dueDay) {
        this.dueDay = dueDay;
    }


    /**
     * Gets the billDispatching value for this SAccount.
     * 
     * @return billDispatching
     */
    public java.lang.Short getBillDispatching() {
        return billDispatching;
    }


    /**
     * Sets the billDispatching value for this SAccount.
     * 
     * @param billDispatching
     */
    public void setBillDispatching(java.lang.Short billDispatching) {
        this.billDispatching = billDispatching;
    }


    /**
     * Gets the billLanguageId value for this SAccount.
     * 
     * @return billLanguageId
     */
    public java.lang.Short getBillLanguageId() {
        return billLanguageId;
    }


    /**
     * Sets the billLanguageId value for this SAccount.
     * 
     * @param billLanguageId
     */
    public void setBillLanguageId(java.lang.Short billLanguageId) {
        this.billLanguageId = billLanguageId;
    }


    /**
     * Gets the billCycle value for this SAccount.
     * 
     * @return billCycle
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SBillCycle getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this SAccount.
     * 
     * @param billCycle
     */
    public void setBillCycle(com.asiainfo.crm.cm.dk.ws.imsservice.SBillCycle billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the payChannelList value for this SAccount.
     * 
     * @return payChannelList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SPayChannel[] getPayChannelList() {
        return payChannelList;
    }


    /**
     * Sets the payChannelList value for this SAccount.
     * 
     * @param payChannelList
     */
    public void setPayChannelList(com.asiainfo.crm.cm.dk.ws.imsservice.SPayChannel[] payChannelList) {
        this.payChannelList = payChannelList;
    }


    /**
     * Gets the payChannels value for this SAccount.
     * 
     * @return payChannels
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.DoQueryPayChannelResponse getPayChannels() {
        return payChannels;
    }


    /**
     * Sets the payChannels value for this SAccount.
     * 
     * @param payChannels
     */
    public void setPayChannels(com.asiainfo.crm.cm.dk.ws.imsservice.DoQueryPayChannelResponse payChannels) {
        this.payChannels = payChannels;
    }


    /**
     * Gets the listExtParam value for this SAccount.
     * 
     * @return listExtParam
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.ExtendParam[] getListExtParam() {
        return listExtParam;
    }


    /**
     * Sets the listExtParam value for this SAccount.
     * 
     * @param listExtParam
     */
    public void setListExtParam(com.asiainfo.crm.cm.dk.ws.imsservice.ExtendParam[] listExtParam) {
        this.listExtParam = listExtParam;
    }


    /**
     * Gets the billSts value for this SAccount.
     * 
     * @return billSts
     */
    public java.lang.Integer getBillSts() {
        return billSts;
    }


    /**
     * Sets the billSts value for this SAccount.
     * 
     * @param billSts
     */
    public void setBillSts(java.lang.Integer billSts) {
        this.billSts = billSts;
    }


    /**
     * Gets the taxFlag value for this SAccount.
     * 
     * @return taxFlag
     */
    public java.lang.Integer getTaxFlag() {
        return taxFlag;
    }


    /**
     * Sets the taxFlag value for this SAccount.
     * 
     * @param taxFlag
     */
    public void setTaxFlag(java.lang.Integer taxFlag) {
        this.taxFlag = taxFlag;
    }


    /**
     * Gets the accountFlag value for this SAccount.
     * 
     * @return accountFlag
     */
    public java.lang.Integer getAccountFlag() {
        return accountFlag;
    }


    /**
     * Sets the accountFlag value for this SAccount.
     * 
     * @param accountFlag
     */
    public void setAccountFlag(java.lang.Integer accountFlag) {
        this.accountFlag = accountFlag;
    }


    /**
     * Gets the panHashList value for this SAccount.
     * 
     * @return panHashList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo[] getPanHashList() {
        return panHashList;
    }


    /**
     * Sets the panHashList value for this SAccount.
     * 
     * @param panHashList
     */
    public void setPanHashList(com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo[] panHashList) {
        this.panHashList = panHashList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo getPanHashList(int i) {
        return this.panHashList[i];
    }

    public void setPanHashList(int i, com.asiainfo.crm.cm.dk.ws.imsservice.BankDebitInfo _value) {
        this.panHashList[i] = _value;
    }


    /**
     * Gets the caFlag value for this SAccount.
     * 
     * @return caFlag
     */
    public java.lang.Integer getCaFlag() {
        return caFlag;
    }


    /**
     * Sets the caFlag value for this SAccount.
     * 
     * @param caFlag
     */
    public void setCaFlag(java.lang.Integer caFlag) {
        this.caFlag = caFlag;
    }


    /**
     * Gets the writeoffFlag value for this SAccount.
     * 
     * @return writeoffFlag
     */
    public java.lang.Integer getWriteoffFlag() {
        return writeoffFlag;
    }


    /**
     * Sets the writeoffFlag value for this SAccount.
     * 
     * @param writeoffFlag
     */
    public void setWriteoffFlag(java.lang.Integer writeoffFlag) {
        this.writeoffFlag = writeoffFlag;
    }


    /**
     * Gets the disableLimit value for this SAccount.
     * 
     * @return disableLimit
     */
    public java.lang.Integer getDisableLimit() {
        return disableLimit;
    }


    /**
     * Sets the disableLimit value for this SAccount.
     * 
     * @param disableLimit
     */
    public void setDisableLimit(java.lang.Integer disableLimit) {
        this.disableLimit = disableLimit;
    }


    /**
     * Gets the guaranteeFlag value for this SAccount.
     * 
     * @return guaranteeFlag
     */
    public java.lang.Integer getGuaranteeFlag() {
        return guaranteeFlag;
    }


    /**
     * Sets the guaranteeFlag value for this SAccount.
     * 
     * @param guaranteeFlag
     */
    public void setGuaranteeFlag(java.lang.Integer guaranteeFlag) {
        this.guaranteeFlag = guaranteeFlag;
    }


    /**
     * Gets the custInvList value for this SAccount.
     * 
     * @return custInvList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInv[] getCustInvList() {
        return custInvList;
    }


    /**
     * Sets the custInvList value for this SAccount.
     * 
     * @param custInvList
     */
    public void setCustInvList(com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInv[] custInvList) {
        this.custInvList = custInvList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInv getCustInvList(int i) {
        return this.custInvList[i];
    }

    public void setCustInvList(int i, com.asiainfo.crm.cm.dk.ws.imsservice.SCustomInv _value) {
        this.custInvList[i] = _value;
    }


    /**
     * Gets the changeInvList value for this SAccount.
     * 
     * @return changeInvList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq[] getChangeInvList() {
        return changeInvList;
    }


    /**
     * Sets the changeInvList value for this SAccount.
     * 
     * @param changeInvList
     */
    public void setChangeInvList(com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq[] changeInvList) {
        this.changeInvList = changeInvList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq getChangeInvList(int i) {
        return this.changeInvList[i];
    }

    public void setChangeInvList(int i, com.asiainfo.crm.cm.dk.ws.imsservice.SChangeCustomInvReq _value) {
        this.changeInvList[i] = _value;
    }


    /**
     * Gets the displaySts value for this SAccount.
     * 
     * @return displaySts
     */
    public java.lang.Integer getDisplaySts() {
        return displaySts;
    }


    /**
     * Sets the displaySts value for this SAccount.
     * 
     * @param displaySts
     */
    public void setDisplaySts(java.lang.Integer displaySts) {
        this.displaySts = displaySts;
    }


    /**
     * Gets the secondaryStatus value for this SAccount.
     * 
     * @return secondaryStatus
     */
    public java.lang.Integer getSecondaryStatus() {
        return secondaryStatus;
    }


    /**
     * Sets the secondaryStatus value for this SAccount.
     * 
     * @param secondaryStatus
     */
    public void setSecondaryStatus(java.lang.Integer secondaryStatus) {
        this.secondaryStatus = secondaryStatus;
    }


    /**
     * Gets the billingType value for this SAccount.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this SAccount.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAccount)) return false;
        SAccount other = (SAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.provCode==null && other.getProvCode()==null) || 
             (this.provCode!=null &&
              this.provCode.equals(other.getProvCode()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.outerParentAcctId==null && other.getOuterParentAcctId()==null) || 
             (this.outerParentAcctId!=null &&
              this.outerParentAcctId.equals(other.getOuterParentAcctId()))) &&
            ((this.parentAcctId==null && other.getParentAcctId()==null) || 
             (this.parentAcctId!=null &&
              this.parentAcctId.equals(other.getParentAcctId()))) &&
            ((this.outerCustId==null && other.getOuterCustId()==null) || 
             (this.outerCustId!=null &&
              this.outerCustId.equals(other.getOuterCustId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.acctName==null && other.getAcctName()==null) || 
             (this.acctName!=null &&
              this.acctName.equals(other.getAcctName()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.acctType==null && other.getAcctType()==null) || 
             (this.acctType!=null &&
              this.acctType.equals(other.getAcctType()))) &&
            ((this.acctClass==null && other.getAcctClass()==null) || 
             (this.acctClass!=null &&
              this.acctClass.equals(other.getAcctClass()))) &&
            ((this.acctSegment==null && other.getAcctSegment()==null) || 
             (this.acctSegment!=null &&
              this.acctSegment.equals(other.getAcctSegment()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.creditClass==null && other.getCreditClass()==null) || 
             (this.creditClass!=null &&
              this.creditClass.equals(other.getCreditClass()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.forceCycle==null && other.getForceCycle()==null) || 
             (this.forceCycle!=null &&
              this.forceCycle.equals(other.getForceCycle()))) &&
            ((this.balanceType==null && other.getBalanceType()==null) || 
             (this.balanceType!=null &&
              this.balanceType.equals(other.getBalanceType()))) &&
            ((this.countyCode==null && other.getCountyCode()==null) || 
             (this.countyCode!=null &&
              this.countyCode.equals(other.getCountyCode()))) &&
            ((this.signCreditControl==null && other.getSignCreditControl()==null) || 
             (this.signCreditControl!=null &&
              this.signCreditControl.equals(other.getSignCreditControl()))) &&
            ((this.urgeStopFlag==null && other.getUrgeStopFlag()==null) || 
             (this.urgeStopFlag!=null &&
              this.urgeStopFlag.equals(other.getUrgeStopFlag()))) &&
            ((this.dueDay==null && other.getDueDay()==null) || 
             (this.dueDay!=null &&
              this.dueDay.equals(other.getDueDay()))) &&
            ((this.billDispatching==null && other.getBillDispatching()==null) || 
             (this.billDispatching!=null &&
              this.billDispatching.equals(other.getBillDispatching()))) &&
            ((this.billLanguageId==null && other.getBillLanguageId()==null) || 
             (this.billLanguageId!=null &&
              this.billLanguageId.equals(other.getBillLanguageId()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.payChannelList==null && other.getPayChannelList()==null) || 
             (this.payChannelList!=null &&
              java.util.Arrays.equals(this.payChannelList, other.getPayChannelList()))) &&
            ((this.payChannels==null && other.getPayChannels()==null) || 
             (this.payChannels!=null &&
              this.payChannels.equals(other.getPayChannels()))) &&
            ((this.listExtParam==null && other.getListExtParam()==null) || 
             (this.listExtParam!=null &&
              java.util.Arrays.equals(this.listExtParam, other.getListExtParam()))) &&
            ((this.billSts==null && other.getBillSts()==null) || 
             (this.billSts!=null &&
              this.billSts.equals(other.getBillSts()))) &&
            ((this.taxFlag==null && other.getTaxFlag()==null) || 
             (this.taxFlag!=null &&
              this.taxFlag.equals(other.getTaxFlag()))) &&
            ((this.accountFlag==null && other.getAccountFlag()==null) || 
             (this.accountFlag!=null &&
              this.accountFlag.equals(other.getAccountFlag()))) &&
            ((this.panHashList==null && other.getPanHashList()==null) || 
             (this.panHashList!=null &&
              java.util.Arrays.equals(this.panHashList, other.getPanHashList()))) &&
            ((this.caFlag==null && other.getCaFlag()==null) || 
             (this.caFlag!=null &&
              this.caFlag.equals(other.getCaFlag()))) &&
            ((this.writeoffFlag==null && other.getWriteoffFlag()==null) || 
             (this.writeoffFlag!=null &&
              this.writeoffFlag.equals(other.getWriteoffFlag()))) &&
            ((this.disableLimit==null && other.getDisableLimit()==null) || 
             (this.disableLimit!=null &&
              this.disableLimit.equals(other.getDisableLimit()))) &&
            ((this.guaranteeFlag==null && other.getGuaranteeFlag()==null) || 
             (this.guaranteeFlag!=null &&
              this.guaranteeFlag.equals(other.getGuaranteeFlag()))) &&
            ((this.custInvList==null && other.getCustInvList()==null) || 
             (this.custInvList!=null &&
              java.util.Arrays.equals(this.custInvList, other.getCustInvList()))) &&
            ((this.changeInvList==null && other.getChangeInvList()==null) || 
             (this.changeInvList!=null &&
              java.util.Arrays.equals(this.changeInvList, other.getChangeInvList()))) &&
            ((this.displaySts==null && other.getDisplaySts()==null) || 
             (this.displaySts!=null &&
              this.displaySts.equals(other.getDisplaySts()))) &&
            ((this.secondaryStatus==null && other.getSecondaryStatus()==null) || 
             (this.secondaryStatus!=null &&
              this.secondaryStatus.equals(other.getSecondaryStatus()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType())));
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
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getProvCode() != null) {
            _hashCode += getProvCode().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getOuterParentAcctId() != null) {
            _hashCode += getOuterParentAcctId().hashCode();
        }
        if (getParentAcctId() != null) {
            _hashCode += getParentAcctId().hashCode();
        }
        if (getOuterCustId() != null) {
            _hashCode += getOuterCustId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getAcctName() != null) {
            _hashCode += getAcctName().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getAcctType() != null) {
            _hashCode += getAcctType().hashCode();
        }
        if (getAcctClass() != null) {
            _hashCode += getAcctClass().hashCode();
        }
        if (getAcctSegment() != null) {
            _hashCode += getAcctSegment().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getCreditClass() != null) {
            _hashCode += getCreditClass().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getForceCycle() != null) {
            _hashCode += getForceCycle().hashCode();
        }
        if (getBalanceType() != null) {
            _hashCode += getBalanceType().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
        }
        if (getSignCreditControl() != null) {
            _hashCode += getSignCreditControl().hashCode();
        }
        if (getUrgeStopFlag() != null) {
            _hashCode += getUrgeStopFlag().hashCode();
        }
        if (getDueDay() != null) {
            _hashCode += getDueDay().hashCode();
        }
        if (getBillDispatching() != null) {
            _hashCode += getBillDispatching().hashCode();
        }
        if (getBillLanguageId() != null) {
            _hashCode += getBillLanguageId().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getPayChannelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayChannelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayChannelList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayChannels() != null) {
            _hashCode += getPayChannels().hashCode();
        }
        if (getListExtParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListExtParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListExtParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillSts() != null) {
            _hashCode += getBillSts().hashCode();
        }
        if (getTaxFlag() != null) {
            _hashCode += getTaxFlag().hashCode();
        }
        if (getAccountFlag() != null) {
            _hashCode += getAccountFlag().hashCode();
        }
        if (getPanHashList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPanHashList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPanHashList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaFlag() != null) {
            _hashCode += getCaFlag().hashCode();
        }
        if (getWriteoffFlag() != null) {
            _hashCode += getWriteoffFlag().hashCode();
        }
        if (getDisableLimit() != null) {
            _hashCode += getDisableLimit().hashCode();
        }
        if (getGuaranteeFlag() != null) {
            _hashCode += getGuaranteeFlag().hashCode();
        }
        if (getCustInvList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustInvList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustInvList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangeInvList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeInvList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeInvList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisplaySts() != null) {
            _hashCode += getDisplaySts().hashCode();
        }
        if (getSecondaryStatus() != null) {
            _hashCode += getSecondaryStatus().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("provCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerParentAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerParentAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("acctName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
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
        elemField.setFieldName("creditClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("forceCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forceCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signCreditControl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signCreditControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urgeStopFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urgeStopFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDispatching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billDispatching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billLanguageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billLanguageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payChannelList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payChannelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sPayChannelListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payChannels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payChannels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listExtParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listExtParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "extendParamListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panHashList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "panHashList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeoffFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writeoffFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custInvList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custInvList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomInv"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInvList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeInvList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeCustomInvReq"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displaySts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
