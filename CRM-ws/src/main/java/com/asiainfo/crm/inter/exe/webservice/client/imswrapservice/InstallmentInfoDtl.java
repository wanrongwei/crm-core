/**
 * InstallmentInfoDtl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class InstallmentInfoDtl  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long outerAcctId;

    private java.lang.String soNbr;

    private java.util.Calendar instalDate;

    private java.lang.Short instalType;

    private java.lang.String billingNo;

    private java.lang.Long downPayment;

    private java.lang.Long instalAmount;

    private java.lang.Integer cycleCount;

    private java.lang.Long cycleAmount;

    private java.lang.Long remainAmount;

    private java.lang.Integer remainCount;

    private java.lang.Short roundingType;

    private java.lang.Long billedInterest;

    private java.lang.Short interestType;

    private java.lang.Long prePayment;

    private java.lang.String sts;

    private java.util.Calendar stsDate;

    private java.lang.Long productId;

    private java.lang.String invoiceNo;

    private java.lang.Long currentAmount;

    private java.lang.Long currentInterest;

    private java.lang.Long billedAmount;

    private java.lang.Integer billedCount;

    private java.lang.Long remianInterest;

    private java.lang.Long instalId;

    private java.lang.String contractId;

    private java.lang.Integer paidPeriods;

    private java.lang.Long paidAmount;

    private java.lang.Integer contiPaidPeriods;

    private java.lang.Long contiPaidAmount;

    private java.lang.Boolean unpaidFlag;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Plan[] details;

    private java.lang.Long resourceId;

    private java.lang.String agreementId;

    private java.lang.String telephone;

    private java.lang.String custName;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SInstalOffer[] instalOfferList;

    public InstallmentInfoDtl() {
    }

    public InstallmentInfoDtl(
           java.lang.Long acctId,
           java.lang.Long outerAcctId,
           java.lang.String soNbr,
           java.util.Calendar instalDate,
           java.lang.Short instalType,
           java.lang.String billingNo,
           java.lang.Long downPayment,
           java.lang.Long instalAmount,
           java.lang.Integer cycleCount,
           java.lang.Long cycleAmount,
           java.lang.Long remainAmount,
           java.lang.Integer remainCount,
           java.lang.Short roundingType,
           java.lang.Long billedInterest,
           java.lang.Short interestType,
           java.lang.Long prePayment,
           java.lang.String sts,
           java.util.Calendar stsDate,
           java.lang.Long productId,
           java.lang.String invoiceNo,
           java.lang.Long currentAmount,
           java.lang.Long currentInterest,
           java.lang.Long billedAmount,
           java.lang.Integer billedCount,
           java.lang.Long remianInterest,
           java.lang.Long instalId,
           java.lang.String contractId,
           java.lang.Integer paidPeriods,
           java.lang.Long paidAmount,
           java.lang.Integer contiPaidPeriods,
           java.lang.Long contiPaidAmount,
           java.lang.Boolean unpaidFlag,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Plan[] details,
           java.lang.Long resourceId,
           java.lang.String agreementId,
           java.lang.String telephone,
           java.lang.String custName,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SInstalOffer[] instalOfferList) {
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.soNbr = soNbr;
           this.instalDate = instalDate;
           this.instalType = instalType;
           this.billingNo = billingNo;
           this.downPayment = downPayment;
           this.instalAmount = instalAmount;
           this.cycleCount = cycleCount;
           this.cycleAmount = cycleAmount;
           this.remainAmount = remainAmount;
           this.remainCount = remainCount;
           this.roundingType = roundingType;
           this.billedInterest = billedInterest;
           this.interestType = interestType;
           this.prePayment = prePayment;
           this.sts = sts;
           this.stsDate = stsDate;
           this.productId = productId;
           this.invoiceNo = invoiceNo;
           this.currentAmount = currentAmount;
           this.currentInterest = currentInterest;
           this.billedAmount = billedAmount;
           this.billedCount = billedCount;
           this.remianInterest = remianInterest;
           this.instalId = instalId;
           this.contractId = contractId;
           this.paidPeriods = paidPeriods;
           this.paidAmount = paidAmount;
           this.contiPaidPeriods = contiPaidPeriods;
           this.contiPaidAmount = contiPaidAmount;
           this.unpaidFlag = unpaidFlag;
           this.details = details;
           this.resourceId = resourceId;
           this.agreementId = agreementId;
           this.telephone = telephone;
           this.custName = custName;
           this.instalOfferList = instalOfferList;
    }


    /**
     * Gets the acctId value for this InstallmentInfoDtl.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this InstallmentInfoDtl.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this InstallmentInfoDtl.
     * 
     * @return outerAcctId
     */
    public java.lang.Long getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this InstallmentInfoDtl.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.Long outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the soNbr value for this InstallmentInfoDtl.
     * 
     * @return soNbr
     */
    public java.lang.String getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this InstallmentInfoDtl.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.String soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the instalDate value for this InstallmentInfoDtl.
     * 
     * @return instalDate
     */
    public java.util.Calendar getInstalDate() {
        return instalDate;
    }


    /**
     * Sets the instalDate value for this InstallmentInfoDtl.
     * 
     * @param instalDate
     */
    public void setInstalDate(java.util.Calendar instalDate) {
        this.instalDate = instalDate;
    }


    /**
     * Gets the instalType value for this InstallmentInfoDtl.
     * 
     * @return instalType
     */
    public java.lang.Short getInstalType() {
        return instalType;
    }


    /**
     * Sets the instalType value for this InstallmentInfoDtl.
     * 
     * @param instalType
     */
    public void setInstalType(java.lang.Short instalType) {
        this.instalType = instalType;
    }


    /**
     * Gets the billingNo value for this InstallmentInfoDtl.
     * 
     * @return billingNo
     */
    public java.lang.String getBillingNo() {
        return billingNo;
    }


    /**
     * Sets the billingNo value for this InstallmentInfoDtl.
     * 
     * @param billingNo
     */
    public void setBillingNo(java.lang.String billingNo) {
        this.billingNo = billingNo;
    }


    /**
     * Gets the downPayment value for this InstallmentInfoDtl.
     * 
     * @return downPayment
     */
    public java.lang.Long getDownPayment() {
        return downPayment;
    }


    /**
     * Sets the downPayment value for this InstallmentInfoDtl.
     * 
     * @param downPayment
     */
    public void setDownPayment(java.lang.Long downPayment) {
        this.downPayment = downPayment;
    }


    /**
     * Gets the instalAmount value for this InstallmentInfoDtl.
     * 
     * @return instalAmount
     */
    public java.lang.Long getInstalAmount() {
        return instalAmount;
    }


    /**
     * Sets the instalAmount value for this InstallmentInfoDtl.
     * 
     * @param instalAmount
     */
    public void setInstalAmount(java.lang.Long instalAmount) {
        this.instalAmount = instalAmount;
    }


    /**
     * Gets the cycleCount value for this InstallmentInfoDtl.
     * 
     * @return cycleCount
     */
    public java.lang.Integer getCycleCount() {
        return cycleCount;
    }


    /**
     * Sets the cycleCount value for this InstallmentInfoDtl.
     * 
     * @param cycleCount
     */
    public void setCycleCount(java.lang.Integer cycleCount) {
        this.cycleCount = cycleCount;
    }


    /**
     * Gets the cycleAmount value for this InstallmentInfoDtl.
     * 
     * @return cycleAmount
     */
    public java.lang.Long getCycleAmount() {
        return cycleAmount;
    }


    /**
     * Sets the cycleAmount value for this InstallmentInfoDtl.
     * 
     * @param cycleAmount
     */
    public void setCycleAmount(java.lang.Long cycleAmount) {
        this.cycleAmount = cycleAmount;
    }


    /**
     * Gets the remainAmount value for this InstallmentInfoDtl.
     * 
     * @return remainAmount
     */
    public java.lang.Long getRemainAmount() {
        return remainAmount;
    }


    /**
     * Sets the remainAmount value for this InstallmentInfoDtl.
     * 
     * @param remainAmount
     */
    public void setRemainAmount(java.lang.Long remainAmount) {
        this.remainAmount = remainAmount;
    }


    /**
     * Gets the remainCount value for this InstallmentInfoDtl.
     * 
     * @return remainCount
     */
    public java.lang.Integer getRemainCount() {
        return remainCount;
    }


    /**
     * Sets the remainCount value for this InstallmentInfoDtl.
     * 
     * @param remainCount
     */
    public void setRemainCount(java.lang.Integer remainCount) {
        this.remainCount = remainCount;
    }


    /**
     * Gets the roundingType value for this InstallmentInfoDtl.
     * 
     * @return roundingType
     */
    public java.lang.Short getRoundingType() {
        return roundingType;
    }


    /**
     * Sets the roundingType value for this InstallmentInfoDtl.
     * 
     * @param roundingType
     */
    public void setRoundingType(java.lang.Short roundingType) {
        this.roundingType = roundingType;
    }


    /**
     * Gets the billedInterest value for this InstallmentInfoDtl.
     * 
     * @return billedInterest
     */
    public java.lang.Long getBilledInterest() {
        return billedInterest;
    }


    /**
     * Sets the billedInterest value for this InstallmentInfoDtl.
     * 
     * @param billedInterest
     */
    public void setBilledInterest(java.lang.Long billedInterest) {
        this.billedInterest = billedInterest;
    }


    /**
     * Gets the interestType value for this InstallmentInfoDtl.
     * 
     * @return interestType
     */
    public java.lang.Short getInterestType() {
        return interestType;
    }


    /**
     * Sets the interestType value for this InstallmentInfoDtl.
     * 
     * @param interestType
     */
    public void setInterestType(java.lang.Short interestType) {
        this.interestType = interestType;
    }


    /**
     * Gets the prePayment value for this InstallmentInfoDtl.
     * 
     * @return prePayment
     */
    public java.lang.Long getPrePayment() {
        return prePayment;
    }


    /**
     * Sets the prePayment value for this InstallmentInfoDtl.
     * 
     * @param prePayment
     */
    public void setPrePayment(java.lang.Long prePayment) {
        this.prePayment = prePayment;
    }


    /**
     * Gets the sts value for this InstallmentInfoDtl.
     * 
     * @return sts
     */
    public java.lang.String getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this InstallmentInfoDtl.
     * 
     * @param sts
     */
    public void setSts(java.lang.String sts) {
        this.sts = sts;
    }


    /**
     * Gets the stsDate value for this InstallmentInfoDtl.
     * 
     * @return stsDate
     */
    public java.util.Calendar getStsDate() {
        return stsDate;
    }


    /**
     * Sets the stsDate value for this InstallmentInfoDtl.
     * 
     * @param stsDate
     */
    public void setStsDate(java.util.Calendar stsDate) {
        this.stsDate = stsDate;
    }


    /**
     * Gets the productId value for this InstallmentInfoDtl.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this InstallmentInfoDtl.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the invoiceNo value for this InstallmentInfoDtl.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this InstallmentInfoDtl.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the currentAmount value for this InstallmentInfoDtl.
     * 
     * @return currentAmount
     */
    public java.lang.Long getCurrentAmount() {
        return currentAmount;
    }


    /**
     * Sets the currentAmount value for this InstallmentInfoDtl.
     * 
     * @param currentAmount
     */
    public void setCurrentAmount(java.lang.Long currentAmount) {
        this.currentAmount = currentAmount;
    }


    /**
     * Gets the currentInterest value for this InstallmentInfoDtl.
     * 
     * @return currentInterest
     */
    public java.lang.Long getCurrentInterest() {
        return currentInterest;
    }


    /**
     * Sets the currentInterest value for this InstallmentInfoDtl.
     * 
     * @param currentInterest
     */
    public void setCurrentInterest(java.lang.Long currentInterest) {
        this.currentInterest = currentInterest;
    }


    /**
     * Gets the billedAmount value for this InstallmentInfoDtl.
     * 
     * @return billedAmount
     */
    public java.lang.Long getBilledAmount() {
        return billedAmount;
    }


    /**
     * Sets the billedAmount value for this InstallmentInfoDtl.
     * 
     * @param billedAmount
     */
    public void setBilledAmount(java.lang.Long billedAmount) {
        this.billedAmount = billedAmount;
    }


    /**
     * Gets the billedCount value for this InstallmentInfoDtl.
     * 
     * @return billedCount
     */
    public java.lang.Integer getBilledCount() {
        return billedCount;
    }


    /**
     * Sets the billedCount value for this InstallmentInfoDtl.
     * 
     * @param billedCount
     */
    public void setBilledCount(java.lang.Integer billedCount) {
        this.billedCount = billedCount;
    }


    /**
     * Gets the remianInterest value for this InstallmentInfoDtl.
     * 
     * @return remianInterest
     */
    public java.lang.Long getRemianInterest() {
        return remianInterest;
    }


    /**
     * Sets the remianInterest value for this InstallmentInfoDtl.
     * 
     * @param remianInterest
     */
    public void setRemianInterest(java.lang.Long remianInterest) {
        this.remianInterest = remianInterest;
    }


    /**
     * Gets the instalId value for this InstallmentInfoDtl.
     * 
     * @return instalId
     */
    public java.lang.Long getInstalId() {
        return instalId;
    }


    /**
     * Sets the instalId value for this InstallmentInfoDtl.
     * 
     * @param instalId
     */
    public void setInstalId(java.lang.Long instalId) {
        this.instalId = instalId;
    }


    /**
     * Gets the contractId value for this InstallmentInfoDtl.
     * 
     * @return contractId
     */
    public java.lang.String getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this InstallmentInfoDtl.
     * 
     * @param contractId
     */
    public void setContractId(java.lang.String contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the paidPeriods value for this InstallmentInfoDtl.
     * 
     * @return paidPeriods
     */
    public java.lang.Integer getPaidPeriods() {
        return paidPeriods;
    }


    /**
     * Sets the paidPeriods value for this InstallmentInfoDtl.
     * 
     * @param paidPeriods
     */
    public void setPaidPeriods(java.lang.Integer paidPeriods) {
        this.paidPeriods = paidPeriods;
    }


    /**
     * Gets the paidAmount value for this InstallmentInfoDtl.
     * 
     * @return paidAmount
     */
    public java.lang.Long getPaidAmount() {
        return paidAmount;
    }


    /**
     * Sets the paidAmount value for this InstallmentInfoDtl.
     * 
     * @param paidAmount
     */
    public void setPaidAmount(java.lang.Long paidAmount) {
        this.paidAmount = paidAmount;
    }


    /**
     * Gets the contiPaidPeriods value for this InstallmentInfoDtl.
     * 
     * @return contiPaidPeriods
     */
    public java.lang.Integer getContiPaidPeriods() {
        return contiPaidPeriods;
    }


    /**
     * Sets the contiPaidPeriods value for this InstallmentInfoDtl.
     * 
     * @param contiPaidPeriods
     */
    public void setContiPaidPeriods(java.lang.Integer contiPaidPeriods) {
        this.contiPaidPeriods = contiPaidPeriods;
    }


    /**
     * Gets the contiPaidAmount value for this InstallmentInfoDtl.
     * 
     * @return contiPaidAmount
     */
    public java.lang.Long getContiPaidAmount() {
        return contiPaidAmount;
    }


    /**
     * Sets the contiPaidAmount value for this InstallmentInfoDtl.
     * 
     * @param contiPaidAmount
     */
    public void setContiPaidAmount(java.lang.Long contiPaidAmount) {
        this.contiPaidAmount = contiPaidAmount;
    }


    /**
     * Gets the unpaidFlag value for this InstallmentInfoDtl.
     * 
     * @return unpaidFlag
     */
    public java.lang.Boolean getUnpaidFlag() {
        return unpaidFlag;
    }


    /**
     * Sets the unpaidFlag value for this InstallmentInfoDtl.
     * 
     * @param unpaidFlag
     */
    public void setUnpaidFlag(java.lang.Boolean unpaidFlag) {
        this.unpaidFlag = unpaidFlag;
    }


    /**
     * Gets the details value for this InstallmentInfoDtl.
     * 
     * @return details
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Plan[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this InstallmentInfoDtl.
     * 
     * @param details
     */
    public void setDetails(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Plan[] details) {
        this.details = details;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Plan getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Plan _value) {
        this.details[i] = _value;
    }


    /**
     * Gets the resourceId value for this InstallmentInfoDtl.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this InstallmentInfoDtl.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the agreementId value for this InstallmentInfoDtl.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this InstallmentInfoDtl.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the telephone value for this InstallmentInfoDtl.
     * 
     * @return telephone
     */
    public java.lang.String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this InstallmentInfoDtl.
     * 
     * @param telephone
     */
    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the custName value for this InstallmentInfoDtl.
     * 
     * @return custName
     */
    public java.lang.String getCustName() {
        return custName;
    }


    /**
     * Sets the custName value for this InstallmentInfoDtl.
     * 
     * @param custName
     */
    public void setCustName(java.lang.String custName) {
        this.custName = custName;
    }


    /**
     * Gets the instalOfferList value for this InstallmentInfoDtl.
     * 
     * @return instalOfferList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SInstalOffer[] getInstalOfferList() {
        return instalOfferList;
    }


    /**
     * Sets the instalOfferList value for this InstallmentInfoDtl.
     * 
     * @param instalOfferList
     */
    public void setInstalOfferList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SInstalOffer[] instalOfferList) {
        this.instalOfferList = instalOfferList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SInstalOffer getInstalOfferList(int i) {
        return this.instalOfferList[i];
    }

    public void setInstalOfferList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SInstalOffer _value) {
        this.instalOfferList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstallmentInfoDtl)) return false;
        InstallmentInfoDtl other = (InstallmentInfoDtl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.instalDate==null && other.getInstalDate()==null) || 
             (this.instalDate!=null &&
              this.instalDate.equals(other.getInstalDate()))) &&
            ((this.instalType==null && other.getInstalType()==null) || 
             (this.instalType!=null &&
              this.instalType.equals(other.getInstalType()))) &&
            ((this.billingNo==null && other.getBillingNo()==null) || 
             (this.billingNo!=null &&
              this.billingNo.equals(other.getBillingNo()))) &&
            ((this.downPayment==null && other.getDownPayment()==null) || 
             (this.downPayment!=null &&
              this.downPayment.equals(other.getDownPayment()))) &&
            ((this.instalAmount==null && other.getInstalAmount()==null) || 
             (this.instalAmount!=null &&
              this.instalAmount.equals(other.getInstalAmount()))) &&
            ((this.cycleCount==null && other.getCycleCount()==null) || 
             (this.cycleCount!=null &&
              this.cycleCount.equals(other.getCycleCount()))) &&
            ((this.cycleAmount==null && other.getCycleAmount()==null) || 
             (this.cycleAmount!=null &&
              this.cycleAmount.equals(other.getCycleAmount()))) &&
            ((this.remainAmount==null && other.getRemainAmount()==null) || 
             (this.remainAmount!=null &&
              this.remainAmount.equals(other.getRemainAmount()))) &&
            ((this.remainCount==null && other.getRemainCount()==null) || 
             (this.remainCount!=null &&
              this.remainCount.equals(other.getRemainCount()))) &&
            ((this.roundingType==null && other.getRoundingType()==null) || 
             (this.roundingType!=null &&
              this.roundingType.equals(other.getRoundingType()))) &&
            ((this.billedInterest==null && other.getBilledInterest()==null) || 
             (this.billedInterest!=null &&
              this.billedInterest.equals(other.getBilledInterest()))) &&
            ((this.interestType==null && other.getInterestType()==null) || 
             (this.interestType!=null &&
              this.interestType.equals(other.getInterestType()))) &&
            ((this.prePayment==null && other.getPrePayment()==null) || 
             (this.prePayment!=null &&
              this.prePayment.equals(other.getPrePayment()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.stsDate==null && other.getStsDate()==null) || 
             (this.stsDate!=null &&
              this.stsDate.equals(other.getStsDate()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.currentAmount==null && other.getCurrentAmount()==null) || 
             (this.currentAmount!=null &&
              this.currentAmount.equals(other.getCurrentAmount()))) &&
            ((this.currentInterest==null && other.getCurrentInterest()==null) || 
             (this.currentInterest!=null &&
              this.currentInterest.equals(other.getCurrentInterest()))) &&
            ((this.billedAmount==null && other.getBilledAmount()==null) || 
             (this.billedAmount!=null &&
              this.billedAmount.equals(other.getBilledAmount()))) &&
            ((this.billedCount==null && other.getBilledCount()==null) || 
             (this.billedCount!=null &&
              this.billedCount.equals(other.getBilledCount()))) &&
            ((this.remianInterest==null && other.getRemianInterest()==null) || 
             (this.remianInterest!=null &&
              this.remianInterest.equals(other.getRemianInterest()))) &&
            ((this.instalId==null && other.getInstalId()==null) || 
             (this.instalId!=null &&
              this.instalId.equals(other.getInstalId()))) &&
            ((this.contractId==null && other.getContractId()==null) || 
             (this.contractId!=null &&
              this.contractId.equals(other.getContractId()))) &&
            ((this.paidPeriods==null && other.getPaidPeriods()==null) || 
             (this.paidPeriods!=null &&
              this.paidPeriods.equals(other.getPaidPeriods()))) &&
            ((this.paidAmount==null && other.getPaidAmount()==null) || 
             (this.paidAmount!=null &&
              this.paidAmount.equals(other.getPaidAmount()))) &&
            ((this.contiPaidPeriods==null && other.getContiPaidPeriods()==null) || 
             (this.contiPaidPeriods!=null &&
              this.contiPaidPeriods.equals(other.getContiPaidPeriods()))) &&
            ((this.contiPaidAmount==null && other.getContiPaidAmount()==null) || 
             (this.contiPaidAmount!=null &&
              this.contiPaidAmount.equals(other.getContiPaidAmount()))) &&
            ((this.unpaidFlag==null && other.getUnpaidFlag()==null) || 
             (this.unpaidFlag!=null &&
              this.unpaidFlag.equals(other.getUnpaidFlag()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.agreementId==null && other.getAgreementId()==null) || 
             (this.agreementId!=null &&
              this.agreementId.equals(other.getAgreementId()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone()))) &&
            ((this.custName==null && other.getCustName()==null) || 
             (this.custName!=null &&
              this.custName.equals(other.getCustName()))) &&
            ((this.instalOfferList==null && other.getInstalOfferList()==null) || 
             (this.instalOfferList!=null &&
              java.util.Arrays.equals(this.instalOfferList, other.getInstalOfferList())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getInstalDate() != null) {
            _hashCode += getInstalDate().hashCode();
        }
        if (getInstalType() != null) {
            _hashCode += getInstalType().hashCode();
        }
        if (getBillingNo() != null) {
            _hashCode += getBillingNo().hashCode();
        }
        if (getDownPayment() != null) {
            _hashCode += getDownPayment().hashCode();
        }
        if (getInstalAmount() != null) {
            _hashCode += getInstalAmount().hashCode();
        }
        if (getCycleCount() != null) {
            _hashCode += getCycleCount().hashCode();
        }
        if (getCycleAmount() != null) {
            _hashCode += getCycleAmount().hashCode();
        }
        if (getRemainAmount() != null) {
            _hashCode += getRemainAmount().hashCode();
        }
        if (getRemainCount() != null) {
            _hashCode += getRemainCount().hashCode();
        }
        if (getRoundingType() != null) {
            _hashCode += getRoundingType().hashCode();
        }
        if (getBilledInterest() != null) {
            _hashCode += getBilledInterest().hashCode();
        }
        if (getInterestType() != null) {
            _hashCode += getInterestType().hashCode();
        }
        if (getPrePayment() != null) {
            _hashCode += getPrePayment().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getStsDate() != null) {
            _hashCode += getStsDate().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getCurrentAmount() != null) {
            _hashCode += getCurrentAmount().hashCode();
        }
        if (getCurrentInterest() != null) {
            _hashCode += getCurrentInterest().hashCode();
        }
        if (getBilledAmount() != null) {
            _hashCode += getBilledAmount().hashCode();
        }
        if (getBilledCount() != null) {
            _hashCode += getBilledCount().hashCode();
        }
        if (getRemianInterest() != null) {
            _hashCode += getRemianInterest().hashCode();
        }
        if (getInstalId() != null) {
            _hashCode += getInstalId().hashCode();
        }
        if (getContractId() != null) {
            _hashCode += getContractId().hashCode();
        }
        if (getPaidPeriods() != null) {
            _hashCode += getPaidPeriods().hashCode();
        }
        if (getPaidAmount() != null) {
            _hashCode += getPaidAmount().hashCode();
        }
        if (getContiPaidPeriods() != null) {
            _hashCode += getContiPaidPeriods().hashCode();
        }
        if (getContiPaidAmount() != null) {
            _hashCode += getContiPaidAmount().hashCode();
        }
        if (getUnpaidFlag() != null) {
            _hashCode += getUnpaidFlag().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAgreementId() != null) {
            _hashCode += getAgreementId().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getCustName() != null) {
            _hashCode += getCustName().hashCode();
        }
        if (getInstalOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstalOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstalOfferList(), i);
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
        new org.apache.axis.description.TypeDesc(InstallmentInfoDtl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "installmentInfoDtl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("remainCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roundingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedInterest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billedInterest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prePayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentInterest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentInterest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remianInterest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remianInterest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contiPaidPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contiPaidPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contiPaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contiPaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpaidFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpaidFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "plan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalOfferList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalOfferList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalOffer"));
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
