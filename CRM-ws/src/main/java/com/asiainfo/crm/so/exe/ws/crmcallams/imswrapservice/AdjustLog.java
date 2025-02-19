/**
 * AdjustLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AdjustLog  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.String outerAcctId;

    private long acctId;

    private java.lang.Short flag;

    private java.lang.Long opId;

    private java.lang.Short adjustType;

    private java.lang.String adjustTime;

    private java.lang.Long amount;

    private java.lang.Long days;

    private java.lang.String remark;

    private java.lang.Short startFlag;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceLog freeResourceLogList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance oldBalance;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance newBalance;

    private java.lang.Short soMode;

    private java.lang.String sourceSystem;

    private java.lang.String transactionId;

    private java.lang.Short maximumFlag;

    private java.lang.Short rtner;

    private java.lang.String failedReason;

    private java.util.Calendar operationDate;

    private java.lang.Short status;

    private java.lang.String transparentData1;

    private java.lang.String transparentData2;

    private java.lang.String transparentData3;

    public AdjustLog() {
    }

    public AdjustLog(
           java.lang.String phoneId,
           java.lang.String outerAcctId,
           long acctId,
           java.lang.Short flag,
           java.lang.Long opId,
           java.lang.Short adjustType,
           java.lang.String adjustTime,
           java.lang.Long amount,
           java.lang.Long days,
           java.lang.String remark,
           java.lang.Short startFlag,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceLog freeResourceLogList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance oldBalance,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance newBalance,
           java.lang.Short soMode,
           java.lang.String sourceSystem,
           java.lang.String transactionId,
           java.lang.Short maximumFlag,
           java.lang.Short rtner,
           java.lang.String failedReason,
           java.util.Calendar operationDate,
           java.lang.Short status,
           java.lang.String transparentData1,
           java.lang.String transparentData2,
           java.lang.String transparentData3) {
           this.phoneId = phoneId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.flag = flag;
           this.opId = opId;
           this.adjustType = adjustType;
           this.adjustTime = adjustTime;
           this.amount = amount;
           this.days = days;
           this.remark = remark;
           this.startFlag = startFlag;
           this.freeResourceLogList = freeResourceLogList;
           this.oldBalance = oldBalance;
           this.newBalance = newBalance;
           this.soMode = soMode;
           this.sourceSystem = sourceSystem;
           this.transactionId = transactionId;
           this.maximumFlag = maximumFlag;
           this.rtner = rtner;
           this.failedReason = failedReason;
           this.operationDate = operationDate;
           this.status = status;
           this.transparentData1 = transparentData1;
           this.transparentData2 = transparentData2;
           this.transparentData3 = transparentData3;
    }


    /**
     * Gets the phoneId value for this AdjustLog.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this AdjustLog.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the outerAcctId value for this AdjustLog.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this AdjustLog.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this AdjustLog.
     * 
     * @return acctId
     */
    public long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AdjustLog.
     * 
     * @param acctId
     */
    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the flag value for this AdjustLog.
     * 
     * @return flag
     */
    public java.lang.Short getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this AdjustLog.
     * 
     * @param flag
     */
    public void setFlag(java.lang.Short flag) {
        this.flag = flag;
    }


    /**
     * Gets the opId value for this AdjustLog.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this AdjustLog.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the adjustType value for this AdjustLog.
     * 
     * @return adjustType
     */
    public java.lang.Short getAdjustType() {
        return adjustType;
    }


    /**
     * Sets the adjustType value for this AdjustLog.
     * 
     * @param adjustType
     */
    public void setAdjustType(java.lang.Short adjustType) {
        this.adjustType = adjustType;
    }


    /**
     * Gets the adjustTime value for this AdjustLog.
     * 
     * @return adjustTime
     */
    public java.lang.String getAdjustTime() {
        return adjustTime;
    }


    /**
     * Sets the adjustTime value for this AdjustLog.
     * 
     * @param adjustTime
     */
    public void setAdjustTime(java.lang.String adjustTime) {
        this.adjustTime = adjustTime;
    }


    /**
     * Gets the amount value for this AdjustLog.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AdjustLog.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the days value for this AdjustLog.
     * 
     * @return days
     */
    public java.lang.Long getDays() {
        return days;
    }


    /**
     * Sets the days value for this AdjustLog.
     * 
     * @param days
     */
    public void setDays(java.lang.Long days) {
        this.days = days;
    }


    /**
     * Gets the remark value for this AdjustLog.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this AdjustLog.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the startFlag value for this AdjustLog.
     * 
     * @return startFlag
     */
    public java.lang.Short getStartFlag() {
        return startFlag;
    }


    /**
     * Sets the startFlag value for this AdjustLog.
     * 
     * @param startFlag
     */
    public void setStartFlag(java.lang.Short startFlag) {
        this.startFlag = startFlag;
    }


    /**
     * Gets the freeResourceLogList value for this AdjustLog.
     * 
     * @return freeResourceLogList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceLog getFreeResourceLogList() {
        return freeResourceLogList;
    }


    /**
     * Sets the freeResourceLogList value for this AdjustLog.
     * 
     * @param freeResourceLogList
     */
    public void setFreeResourceLogList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceLog freeResourceLogList) {
        this.freeResourceLogList = freeResourceLogList;
    }


    /**
     * Gets the oldBalance value for this AdjustLog.
     * 
     * @return oldBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance getOldBalance() {
        return oldBalance;
    }


    /**
     * Sets the oldBalance value for this AdjustLog.
     * 
     * @param oldBalance
     */
    public void setOldBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance oldBalance) {
        this.oldBalance = oldBalance;
    }


    /**
     * Gets the newBalance value for this AdjustLog.
     * 
     * @return newBalance
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this AdjustLog.
     * 
     * @param newBalance
     */
    public void setNewBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the soMode value for this AdjustLog.
     * 
     * @return soMode
     */
    public java.lang.Short getSoMode() {
        return soMode;
    }


    /**
     * Sets the soMode value for this AdjustLog.
     * 
     * @param soMode
     */
    public void setSoMode(java.lang.Short soMode) {
        this.soMode = soMode;
    }


    /**
     * Gets the sourceSystem value for this AdjustLog.
     * 
     * @return sourceSystem
     */
    public java.lang.String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this AdjustLog.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(java.lang.String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the transactionId value for this AdjustLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AdjustLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the maximumFlag value for this AdjustLog.
     * 
     * @return maximumFlag
     */
    public java.lang.Short getMaximumFlag() {
        return maximumFlag;
    }


    /**
     * Sets the maximumFlag value for this AdjustLog.
     * 
     * @param maximumFlag
     */
    public void setMaximumFlag(java.lang.Short maximumFlag) {
        this.maximumFlag = maximumFlag;
    }


    /**
     * Gets the rtner value for this AdjustLog.
     * 
     * @return rtner
     */
    public java.lang.Short getRtner() {
        return rtner;
    }


    /**
     * Sets the rtner value for this AdjustLog.
     * 
     * @param rtner
     */
    public void setRtner(java.lang.Short rtner) {
        this.rtner = rtner;
    }


    /**
     * Gets the failedReason value for this AdjustLog.
     * 
     * @return failedReason
     */
    public java.lang.String getFailedReason() {
        return failedReason;
    }


    /**
     * Sets the failedReason value for this AdjustLog.
     * 
     * @param failedReason
     */
    public void setFailedReason(java.lang.String failedReason) {
        this.failedReason = failedReason;
    }


    /**
     * Gets the operationDate value for this AdjustLog.
     * 
     * @return operationDate
     */
    public java.util.Calendar getOperationDate() {
        return operationDate;
    }


    /**
     * Sets the operationDate value for this AdjustLog.
     * 
     * @param operationDate
     */
    public void setOperationDate(java.util.Calendar operationDate) {
        this.operationDate = operationDate;
    }


    /**
     * Gets the status value for this AdjustLog.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdjustLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the transparentData1 value for this AdjustLog.
     * 
     * @return transparentData1
     */
    public java.lang.String getTransparentData1() {
        return transparentData1;
    }


    /**
     * Sets the transparentData1 value for this AdjustLog.
     * 
     * @param transparentData1
     */
    public void setTransparentData1(java.lang.String transparentData1) {
        this.transparentData1 = transparentData1;
    }


    /**
     * Gets the transparentData2 value for this AdjustLog.
     * 
     * @return transparentData2
     */
    public java.lang.String getTransparentData2() {
        return transparentData2;
    }


    /**
     * Sets the transparentData2 value for this AdjustLog.
     * 
     * @param transparentData2
     */
    public void setTransparentData2(java.lang.String transparentData2) {
        this.transparentData2 = transparentData2;
    }


    /**
     * Gets the transparentData3 value for this AdjustLog.
     * 
     * @return transparentData3
     */
    public java.lang.String getTransparentData3() {
        return transparentData3;
    }


    /**
     * Sets the transparentData3 value for this AdjustLog.
     * 
     * @param transparentData3
     */
    public void setTransparentData3(java.lang.String transparentData3) {
        this.transparentData3 = transparentData3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustLog)) return false;
        AdjustLog other = (AdjustLog) obj;
        
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
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.adjustType==null && other.getAdjustType()==null) || 
             (this.adjustType!=null &&
              this.adjustType.equals(other.getAdjustType()))) &&
            ((this.adjustTime==null && other.getAdjustTime()==null) || 
             (this.adjustTime!=null &&
              this.adjustTime.equals(other.getAdjustTime()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.startFlag==null && other.getStartFlag()==null) || 
             (this.startFlag!=null &&
              this.startFlag.equals(other.getStartFlag()))) &&
            ((this.freeResourceLogList==null && other.getFreeResourceLogList()==null) || 
             (this.freeResourceLogList!=null &&
              this.freeResourceLogList.equals(other.getFreeResourceLogList()))) &&
            ((this.oldBalance==null && other.getOldBalance()==null) || 
             (this.oldBalance!=null &&
              this.oldBalance.equals(other.getOldBalance()))) &&
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.soMode==null && other.getSoMode()==null) || 
             (this.soMode!=null &&
              this.soMode.equals(other.getSoMode()))) &&
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.maximumFlag==null && other.getMaximumFlag()==null) || 
             (this.maximumFlag!=null &&
              this.maximumFlag.equals(other.getMaximumFlag()))) &&
            ((this.rtner==null && other.getRtner()==null) || 
             (this.rtner!=null &&
              this.rtner.equals(other.getRtner()))) &&
            ((this.failedReason==null && other.getFailedReason()==null) || 
             (this.failedReason!=null &&
              this.failedReason.equals(other.getFailedReason()))) &&
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        _hashCode += new Long(getAcctId()).hashCode();
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getAdjustType() != null) {
            _hashCode += getAdjustType().hashCode();
        }
        if (getAdjustTime() != null) {
            _hashCode += getAdjustTime().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getStartFlag() != null) {
            _hashCode += getStartFlag().hashCode();
        }
        if (getFreeResourceLogList() != null) {
            _hashCode += getFreeResourceLogList().hashCode();
        }
        if (getOldBalance() != null) {
            _hashCode += getOldBalance().hashCode();
        }
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
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
        if (getMaximumFlag() != null) {
            _hashCode += getMaximumFlag().hashCode();
        }
        if (getRtner() != null) {
            _hashCode += getRtner().hashCode();
        }
        if (getFailedReason() != null) {
            _hashCode += getFailedReason().hashCode();
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
        new org.apache.axis.description.TypeDesc(AdjustLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustLog"));
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
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("adjustType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustTime"));
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
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "days"));
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
        elemField.setFieldName("startFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceLog"));
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
        elemField.setFieldName("newBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("maximumFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedReason"));
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
