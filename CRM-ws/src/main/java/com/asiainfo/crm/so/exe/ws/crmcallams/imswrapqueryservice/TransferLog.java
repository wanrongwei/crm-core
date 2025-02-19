/**
 * TransferLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class TransferLog  implements java.io.Serializable {
    private java.lang.String orgPhoneId;

    private java.lang.String outerOrgAcctId;

    private java.lang.Long orgAcctId;

    private java.lang.String targetPhoneId;

    private java.lang.String outerTargetAcctId;

    private java.lang.Long targetAcctId;

    private short flag;

    private java.lang.Integer opId;

    private java.lang.String transferDate;

    private short transferRuleId;

    private java.lang.Long transferTimes;

    private java.lang.String remark;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance orgOldBalance;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance orgNewBalance;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance targetOldBalance;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance targetNewBalance;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource orgOldFreeResource;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource orgNewFreeResource;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource targetOldFreeResource;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource targetNewFreeResource;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FeeItem[] oneTimeFee;

    private java.lang.Short soMode;

    private java.lang.String sourceSystem;

    private java.lang.String transactionId;

    private java.lang.String failReason;

    private java.util.Calendar operationDate;

    private java.lang.Short status;

    private java.lang.String transparentData1;

    private java.lang.String transparentData2;

    private java.lang.String transparentData3;

    public TransferLog() {
    }

    public TransferLog(
           java.lang.String orgPhoneId,
           java.lang.String outerOrgAcctId,
           java.lang.Long orgAcctId,
           java.lang.String targetPhoneId,
           java.lang.String outerTargetAcctId,
           java.lang.Long targetAcctId,
           short flag,
           java.lang.Integer opId,
           java.lang.String transferDate,
           short transferRuleId,
           java.lang.Long transferTimes,
           java.lang.String remark,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance orgOldBalance,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance orgNewBalance,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance targetOldBalance,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance targetNewBalance,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource orgOldFreeResource,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource orgNewFreeResource,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource targetOldFreeResource,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource targetNewFreeResource,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FeeItem[] oneTimeFee,
           java.lang.Short soMode,
           java.lang.String sourceSystem,
           java.lang.String transactionId,
           java.lang.String failReason,
           java.util.Calendar operationDate,
           java.lang.Short status,
           java.lang.String transparentData1,
           java.lang.String transparentData2,
           java.lang.String transparentData3) {
           this.orgPhoneId = orgPhoneId;
           this.outerOrgAcctId = outerOrgAcctId;
           this.orgAcctId = orgAcctId;
           this.targetPhoneId = targetPhoneId;
           this.outerTargetAcctId = outerTargetAcctId;
           this.targetAcctId = targetAcctId;
           this.flag = flag;
           this.opId = opId;
           this.transferDate = transferDate;
           this.transferRuleId = transferRuleId;
           this.transferTimes = transferTimes;
           this.remark = remark;
           this.orgOldBalance = orgOldBalance;
           this.orgNewBalance = orgNewBalance;
           this.targetOldBalance = targetOldBalance;
           this.targetNewBalance = targetNewBalance;
           this.orgOldFreeResource = orgOldFreeResource;
           this.orgNewFreeResource = orgNewFreeResource;
           this.targetOldFreeResource = targetOldFreeResource;
           this.targetNewFreeResource = targetNewFreeResource;
           this.oneTimeFee = oneTimeFee;
           this.soMode = soMode;
           this.sourceSystem = sourceSystem;
           this.transactionId = transactionId;
           this.failReason = failReason;
           this.operationDate = operationDate;
           this.status = status;
           this.transparentData1 = transparentData1;
           this.transparentData2 = transparentData2;
           this.transparentData3 = transparentData3;
    }


    /**
     * Gets the orgPhoneId value for this TransferLog.
     * 
     * @return orgPhoneId
     */
    public java.lang.String getOrgPhoneId() {
        return orgPhoneId;
    }


    /**
     * Sets the orgPhoneId value for this TransferLog.
     * 
     * @param orgPhoneId
     */
    public void setOrgPhoneId(java.lang.String orgPhoneId) {
        this.orgPhoneId = orgPhoneId;
    }


    /**
     * Gets the outerOrgAcctId value for this TransferLog.
     * 
     * @return outerOrgAcctId
     */
    public java.lang.String getOuterOrgAcctId() {
        return outerOrgAcctId;
    }


    /**
     * Sets the outerOrgAcctId value for this TransferLog.
     * 
     * @param outerOrgAcctId
     */
    public void setOuterOrgAcctId(java.lang.String outerOrgAcctId) {
        this.outerOrgAcctId = outerOrgAcctId;
    }


    /**
     * Gets the orgAcctId value for this TransferLog.
     * 
     * @return orgAcctId
     */
    public java.lang.Long getOrgAcctId() {
        return orgAcctId;
    }


    /**
     * Sets the orgAcctId value for this TransferLog.
     * 
     * @param orgAcctId
     */
    public void setOrgAcctId(java.lang.Long orgAcctId) {
        this.orgAcctId = orgAcctId;
    }


    /**
     * Gets the targetPhoneId value for this TransferLog.
     * 
     * @return targetPhoneId
     */
    public java.lang.String getTargetPhoneId() {
        return targetPhoneId;
    }


    /**
     * Sets the targetPhoneId value for this TransferLog.
     * 
     * @param targetPhoneId
     */
    public void setTargetPhoneId(java.lang.String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }


    /**
     * Gets the outerTargetAcctId value for this TransferLog.
     * 
     * @return outerTargetAcctId
     */
    public java.lang.String getOuterTargetAcctId() {
        return outerTargetAcctId;
    }


    /**
     * Sets the outerTargetAcctId value for this TransferLog.
     * 
     * @param outerTargetAcctId
     */
    public void setOuterTargetAcctId(java.lang.String outerTargetAcctId) {
        this.outerTargetAcctId = outerTargetAcctId;
    }


    /**
     * Gets the targetAcctId value for this TransferLog.
     * 
     * @return targetAcctId
     */
    public java.lang.Long getTargetAcctId() {
        return targetAcctId;
    }


    /**
     * Sets the targetAcctId value for this TransferLog.
     * 
     * @param targetAcctId
     */
    public void setTargetAcctId(java.lang.Long targetAcctId) {
        this.targetAcctId = targetAcctId;
    }


    /**
     * Gets the flag value for this TransferLog.
     * 
     * @return flag
     */
    public short getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this TransferLog.
     * 
     * @param flag
     */
    public void setFlag(short flag) {
        this.flag = flag;
    }


    /**
     * Gets the opId value for this TransferLog.
     * 
     * @return opId
     */
    public java.lang.Integer getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this TransferLog.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Integer opId) {
        this.opId = opId;
    }


    /**
     * Gets the transferDate value for this TransferLog.
     * 
     * @return transferDate
     */
    public java.lang.String getTransferDate() {
        return transferDate;
    }


    /**
     * Sets the transferDate value for this TransferLog.
     * 
     * @param transferDate
     */
    public void setTransferDate(java.lang.String transferDate) {
        this.transferDate = transferDate;
    }


    /**
     * Gets the transferRuleId value for this TransferLog.
     * 
     * @return transferRuleId
     */
    public short getTransferRuleId() {
        return transferRuleId;
    }


    /**
     * Sets the transferRuleId value for this TransferLog.
     * 
     * @param transferRuleId
     */
    public void setTransferRuleId(short transferRuleId) {
        this.transferRuleId = transferRuleId;
    }


    /**
     * Gets the transferTimes value for this TransferLog.
     * 
     * @return transferTimes
     */
    public java.lang.Long getTransferTimes() {
        return transferTimes;
    }


    /**
     * Sets the transferTimes value for this TransferLog.
     * 
     * @param transferTimes
     */
    public void setTransferTimes(java.lang.Long transferTimes) {
        this.transferTimes = transferTimes;
    }


    /**
     * Gets the remark value for this TransferLog.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this TransferLog.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the orgOldBalance value for this TransferLog.
     * 
     * @return orgOldBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance getOrgOldBalance() {
        return orgOldBalance;
    }


    /**
     * Sets the orgOldBalance value for this TransferLog.
     * 
     * @param orgOldBalance
     */
    public void setOrgOldBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance orgOldBalance) {
        this.orgOldBalance = orgOldBalance;
    }


    /**
     * Gets the orgNewBalance value for this TransferLog.
     * 
     * @return orgNewBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance getOrgNewBalance() {
        return orgNewBalance;
    }


    /**
     * Sets the orgNewBalance value for this TransferLog.
     * 
     * @param orgNewBalance
     */
    public void setOrgNewBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance orgNewBalance) {
        this.orgNewBalance = orgNewBalance;
    }


    /**
     * Gets the targetOldBalance value for this TransferLog.
     * 
     * @return targetOldBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance getTargetOldBalance() {
        return targetOldBalance;
    }


    /**
     * Sets the targetOldBalance value for this TransferLog.
     * 
     * @param targetOldBalance
     */
    public void setTargetOldBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance targetOldBalance) {
        this.targetOldBalance = targetOldBalance;
    }


    /**
     * Gets the targetNewBalance value for this TransferLog.
     * 
     * @return targetNewBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance getTargetNewBalance() {
        return targetNewBalance;
    }


    /**
     * Sets the targetNewBalance value for this TransferLog.
     * 
     * @param targetNewBalance
     */
    public void setTargetNewBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance targetNewBalance) {
        this.targetNewBalance = targetNewBalance;
    }


    /**
     * Gets the orgOldFreeResource value for this TransferLog.
     * 
     * @return orgOldFreeResource
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource getOrgOldFreeResource() {
        return orgOldFreeResource;
    }


    /**
     * Sets the orgOldFreeResource value for this TransferLog.
     * 
     * @param orgOldFreeResource
     */
    public void setOrgOldFreeResource(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource orgOldFreeResource) {
        this.orgOldFreeResource = orgOldFreeResource;
    }


    /**
     * Gets the orgNewFreeResource value for this TransferLog.
     * 
     * @return orgNewFreeResource
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource getOrgNewFreeResource() {
        return orgNewFreeResource;
    }


    /**
     * Sets the orgNewFreeResource value for this TransferLog.
     * 
     * @param orgNewFreeResource
     */
    public void setOrgNewFreeResource(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource orgNewFreeResource) {
        this.orgNewFreeResource = orgNewFreeResource;
    }


    /**
     * Gets the targetOldFreeResource value for this TransferLog.
     * 
     * @return targetOldFreeResource
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource getTargetOldFreeResource() {
        return targetOldFreeResource;
    }


    /**
     * Sets the targetOldFreeResource value for this TransferLog.
     * 
     * @param targetOldFreeResource
     */
    public void setTargetOldFreeResource(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource targetOldFreeResource) {
        this.targetOldFreeResource = targetOldFreeResource;
    }


    /**
     * Gets the targetNewFreeResource value for this TransferLog.
     * 
     * @return targetNewFreeResource
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource getTargetNewFreeResource() {
        return targetNewFreeResource;
    }


    /**
     * Sets the targetNewFreeResource value for this TransferLog.
     * 
     * @param targetNewFreeResource
     */
    public void setTargetNewFreeResource(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource targetNewFreeResource) {
        this.targetNewFreeResource = targetNewFreeResource;
    }


    /**
     * Gets the oneTimeFee value for this TransferLog.
     * 
     * @return oneTimeFee
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FeeItem[] getOneTimeFee() {
        return oneTimeFee;
    }


    /**
     * Sets the oneTimeFee value for this TransferLog.
     * 
     * @param oneTimeFee
     */
    public void setOneTimeFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FeeItem[] oneTimeFee) {
        this.oneTimeFee = oneTimeFee;
    }


    /**
     * Gets the soMode value for this TransferLog.
     * 
     * @return soMode
     */
    public java.lang.Short getSoMode() {
        return soMode;
    }


    /**
     * Sets the soMode value for this TransferLog.
     * 
     * @param soMode
     */
    public void setSoMode(java.lang.Short soMode) {
        this.soMode = soMode;
    }


    /**
     * Gets the sourceSystem value for this TransferLog.
     * 
     * @return sourceSystem
     */
    public java.lang.String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this TransferLog.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(java.lang.String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the transactionId value for this TransferLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TransferLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the failReason value for this TransferLog.
     * 
     * @return failReason
     */
    public java.lang.String getFailReason() {
        return failReason;
    }


    /**
     * Sets the failReason value for this TransferLog.
     * 
     * @param failReason
     */
    public void setFailReason(java.lang.String failReason) {
        this.failReason = failReason;
    }


    /**
     * Gets the operationDate value for this TransferLog.
     * 
     * @return operationDate
     */
    public java.util.Calendar getOperationDate() {
        return operationDate;
    }


    /**
     * Sets the operationDate value for this TransferLog.
     * 
     * @param operationDate
     */
    public void setOperationDate(java.util.Calendar operationDate) {
        this.operationDate = operationDate;
    }


    /**
     * Gets the status value for this TransferLog.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransferLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the transparentData1 value for this TransferLog.
     * 
     * @return transparentData1
     */
    public java.lang.String getTransparentData1() {
        return transparentData1;
    }


    /**
     * Sets the transparentData1 value for this TransferLog.
     * 
     * @param transparentData1
     */
    public void setTransparentData1(java.lang.String transparentData1) {
        this.transparentData1 = transparentData1;
    }


    /**
     * Gets the transparentData2 value for this TransferLog.
     * 
     * @return transparentData2
     */
    public java.lang.String getTransparentData2() {
        return transparentData2;
    }


    /**
     * Sets the transparentData2 value for this TransferLog.
     * 
     * @param transparentData2
     */
    public void setTransparentData2(java.lang.String transparentData2) {
        this.transparentData2 = transparentData2;
    }


    /**
     * Gets the transparentData3 value for this TransferLog.
     * 
     * @return transparentData3
     */
    public java.lang.String getTransparentData3() {
        return transparentData3;
    }


    /**
     * Sets the transparentData3 value for this TransferLog.
     * 
     * @param transparentData3
     */
    public void setTransparentData3(java.lang.String transparentData3) {
        this.transparentData3 = transparentData3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferLog)) return false;
        TransferLog other = (TransferLog) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgPhoneId==null && other.getOrgPhoneId()==null) || 
             (this.orgPhoneId!=null &&
              this.orgPhoneId.equals(other.getOrgPhoneId()))) &&
            ((this.outerOrgAcctId==null && other.getOuterOrgAcctId()==null) || 
             (this.outerOrgAcctId!=null &&
              this.outerOrgAcctId.equals(other.getOuterOrgAcctId()))) &&
            ((this.orgAcctId==null && other.getOrgAcctId()==null) || 
             (this.orgAcctId!=null &&
              this.orgAcctId.equals(other.getOrgAcctId()))) &&
            ((this.targetPhoneId==null && other.getTargetPhoneId()==null) || 
             (this.targetPhoneId!=null &&
              this.targetPhoneId.equals(other.getTargetPhoneId()))) &&
            ((this.outerTargetAcctId==null && other.getOuterTargetAcctId()==null) || 
             (this.outerTargetAcctId!=null &&
              this.outerTargetAcctId.equals(other.getOuterTargetAcctId()))) &&
            ((this.targetAcctId==null && other.getTargetAcctId()==null) || 
             (this.targetAcctId!=null &&
              this.targetAcctId.equals(other.getTargetAcctId()))) &&
            this.flag == other.getFlag() &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.transferDate==null && other.getTransferDate()==null) || 
             (this.transferDate!=null &&
              this.transferDate.equals(other.getTransferDate()))) &&
            this.transferRuleId == other.getTransferRuleId() &&
            ((this.transferTimes==null && other.getTransferTimes()==null) || 
             (this.transferTimes!=null &&
              this.transferTimes.equals(other.getTransferTimes()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.orgOldBalance==null && other.getOrgOldBalance()==null) || 
             (this.orgOldBalance!=null &&
              this.orgOldBalance.equals(other.getOrgOldBalance()))) &&
            ((this.orgNewBalance==null && other.getOrgNewBalance()==null) || 
             (this.orgNewBalance!=null &&
              this.orgNewBalance.equals(other.getOrgNewBalance()))) &&
            ((this.targetOldBalance==null && other.getTargetOldBalance()==null) || 
             (this.targetOldBalance!=null &&
              this.targetOldBalance.equals(other.getTargetOldBalance()))) &&
            ((this.targetNewBalance==null && other.getTargetNewBalance()==null) || 
             (this.targetNewBalance!=null &&
              this.targetNewBalance.equals(other.getTargetNewBalance()))) &&
            ((this.orgOldFreeResource==null && other.getOrgOldFreeResource()==null) || 
             (this.orgOldFreeResource!=null &&
              this.orgOldFreeResource.equals(other.getOrgOldFreeResource()))) &&
            ((this.orgNewFreeResource==null && other.getOrgNewFreeResource()==null) || 
             (this.orgNewFreeResource!=null &&
              this.orgNewFreeResource.equals(other.getOrgNewFreeResource()))) &&
            ((this.targetOldFreeResource==null && other.getTargetOldFreeResource()==null) || 
             (this.targetOldFreeResource!=null &&
              this.targetOldFreeResource.equals(other.getTargetOldFreeResource()))) &&
            ((this.targetNewFreeResource==null && other.getTargetNewFreeResource()==null) || 
             (this.targetNewFreeResource!=null &&
              this.targetNewFreeResource.equals(other.getTargetNewFreeResource()))) &&
            ((this.oneTimeFee==null && other.getOneTimeFee()==null) || 
             (this.oneTimeFee!=null &&
              java.util.Arrays.equals(this.oneTimeFee, other.getOneTimeFee()))) &&
            ((this.soMode==null && other.getSoMode()==null) || 
             (this.soMode!=null &&
              this.soMode.equals(other.getSoMode()))) &&
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.failReason==null && other.getFailReason()==null) || 
             (this.failReason!=null &&
              this.failReason.equals(other.getFailReason()))) &&
            ((this.operationDate==null && other.getOperationDate()==null) || 
             (this.operationDate!=null &&
              this.operationDate.equals(other.getOperationDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transparentData1==null && other.getTransparentData1()==null) || 
             (this.transparentData1!=null &&
              this.transparentData1.equals(other.getTransparentData1()))) &&
            ((this.transparentData2==null && other.getTransparentData2()==null) || 
             (this.transparentData2!=null &&
              this.transparentData2.equals(other.getTransparentData2()))) &&
            ((this.transparentData3==null && other.getTransparentData3()==null) || 
             (this.transparentData3!=null &&
              this.transparentData3.equals(other.getTransparentData3())));
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
        if (getOrgPhoneId() != null) {
            _hashCode += getOrgPhoneId().hashCode();
        }
        if (getOuterOrgAcctId() != null) {
            _hashCode += getOuterOrgAcctId().hashCode();
        }
        if (getOrgAcctId() != null) {
            _hashCode += getOrgAcctId().hashCode();
        }
        if (getTargetPhoneId() != null) {
            _hashCode += getTargetPhoneId().hashCode();
        }
        if (getOuterTargetAcctId() != null) {
            _hashCode += getOuterTargetAcctId().hashCode();
        }
        if (getTargetAcctId() != null) {
            _hashCode += getTargetAcctId().hashCode();
        }
        _hashCode += getFlag();
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getTransferDate() != null) {
            _hashCode += getTransferDate().hashCode();
        }
        _hashCode += getTransferRuleId();
        if (getTransferTimes() != null) {
            _hashCode += getTransferTimes().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getOrgOldBalance() != null) {
            _hashCode += getOrgOldBalance().hashCode();
        }
        if (getOrgNewBalance() != null) {
            _hashCode += getOrgNewBalance().hashCode();
        }
        if (getTargetOldBalance() != null) {
            _hashCode += getTargetOldBalance().hashCode();
        }
        if (getTargetNewBalance() != null) {
            _hashCode += getTargetNewBalance().hashCode();
        }
        if (getOrgOldFreeResource() != null) {
            _hashCode += getOrgOldFreeResource().hashCode();
        }
        if (getOrgNewFreeResource() != null) {
            _hashCode += getOrgNewFreeResource().hashCode();
        }
        if (getTargetOldFreeResource() != null) {
            _hashCode += getTargetOldFreeResource().hashCode();
        }
        if (getTargetNewFreeResource() != null) {
            _hashCode += getTargetNewFreeResource().hashCode();
        }
        if (getOneTimeFee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOneTimeFee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOneTimeFee(), i);
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
        if (getFailReason() != null) {
            _hashCode += getFailReason().hashCode();
        }
        if (getOperationDate() != null) {
            _hashCode += getOperationDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransparentData1() != null) {
            _hashCode += getTransparentData1().hashCode();
        }
        if (getTransparentData2() != null) {
            _hashCode += getTransparentData2().hashCode();
        }
        if (getTransparentData3() != null) {
            _hashCode += getTransparentData3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerOrgAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerOrgAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerTargetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerTargetAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferRuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("orgOldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgOldBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgNewBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgNewBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOldBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetNewBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetNewBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgOldFreeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgOldFreeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgNewFreeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgNewFreeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOldFreeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOldFreeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetNewFreeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetNewFreeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        elemField.setFieldName("failReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failReason"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData3"));
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
