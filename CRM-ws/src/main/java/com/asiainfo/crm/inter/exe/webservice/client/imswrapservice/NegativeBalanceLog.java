/**
 * NegativeBalanceLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class NegativeBalanceLog  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String phoneId;

    private java.lang.Long negativeBalance;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.Short negativeFlag;

    private java.lang.String operationDate;

    private java.lang.Short soMode;

    private java.lang.String sourceSystem;

    private java.lang.String transactionId;

    private java.lang.Short status;

    private java.lang.String failReason;

    private java.lang.Short negativeBalanceFlag;

    private java.lang.Long oldNegativeBalance;

    private java.lang.Long newNegativeBalance;

    public NegativeBalanceLog() {
    }

    public NegativeBalanceLog(
           java.lang.Long acctId,
           java.lang.String phoneId,
           java.lang.Long negativeBalance,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.Short negativeFlag,
           java.lang.String operationDate,
           java.lang.Short soMode,
           java.lang.String sourceSystem,
           java.lang.String transactionId,
           java.lang.Short status,
           java.lang.String failReason,
           java.lang.Short negativeBalanceFlag,
           java.lang.Long oldNegativeBalance,
           java.lang.Long newNegativeBalance) {
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.negativeBalance = negativeBalance;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.negativeFlag = negativeFlag;
           this.operationDate = operationDate;
           this.soMode = soMode;
           this.sourceSystem = sourceSystem;
           this.transactionId = transactionId;
           this.status = status;
           this.failReason = failReason;
           this.negativeBalanceFlag = negativeBalanceFlag;
           this.oldNegativeBalance = oldNegativeBalance;
           this.newNegativeBalance = newNegativeBalance;
    }


    /**
     * Gets the acctId value for this NegativeBalanceLog.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this NegativeBalanceLog.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this NegativeBalanceLog.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this NegativeBalanceLog.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the negativeBalance value for this NegativeBalanceLog.
     * 
     * @return negativeBalance
     */
    public java.lang.Long getNegativeBalance() {
        return negativeBalance;
    }


    /**
     * Sets the negativeBalance value for this NegativeBalanceLog.
     * 
     * @param negativeBalance
     */
    public void setNegativeBalance(java.lang.Long negativeBalance) {
        this.negativeBalance = negativeBalance;
    }


    /**
     * Gets the validDate value for this NegativeBalanceLog.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this NegativeBalanceLog.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this NegativeBalanceLog.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this NegativeBalanceLog.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the negativeFlag value for this NegativeBalanceLog.
     * 
     * @return negativeFlag
     */
    public java.lang.Short getNegativeFlag() {
        return negativeFlag;
    }


    /**
     * Sets the negativeFlag value for this NegativeBalanceLog.
     * 
     * @param negativeFlag
     */
    public void setNegativeFlag(java.lang.Short negativeFlag) {
        this.negativeFlag = negativeFlag;
    }


    /**
     * Gets the operationDate value for this NegativeBalanceLog.
     * 
     * @return operationDate
     */
    public java.lang.String getOperationDate() {
        return operationDate;
    }


    /**
     * Sets the operationDate value for this NegativeBalanceLog.
     * 
     * @param operationDate
     */
    public void setOperationDate(java.lang.String operationDate) {
        this.operationDate = operationDate;
    }


    /**
     * Gets the soMode value for this NegativeBalanceLog.
     * 
     * @return soMode
     */
    public java.lang.Short getSoMode() {
        return soMode;
    }


    /**
     * Sets the soMode value for this NegativeBalanceLog.
     * 
     * @param soMode
     */
    public void setSoMode(java.lang.Short soMode) {
        this.soMode = soMode;
    }


    /**
     * Gets the sourceSystem value for this NegativeBalanceLog.
     * 
     * @return sourceSystem
     */
    public java.lang.String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this NegativeBalanceLog.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(java.lang.String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the transactionId value for this NegativeBalanceLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this NegativeBalanceLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the status value for this NegativeBalanceLog.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this NegativeBalanceLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the failReason value for this NegativeBalanceLog.
     * 
     * @return failReason
     */
    public java.lang.String getFailReason() {
        return failReason;
    }


    /**
     * Sets the failReason value for this NegativeBalanceLog.
     * 
     * @param failReason
     */
    public void setFailReason(java.lang.String failReason) {
        this.failReason = failReason;
    }


    /**
     * Gets the negativeBalanceFlag value for this NegativeBalanceLog.
     * 
     * @return negativeBalanceFlag
     */
    public java.lang.Short getNegativeBalanceFlag() {
        return negativeBalanceFlag;
    }


    /**
     * Sets the negativeBalanceFlag value for this NegativeBalanceLog.
     * 
     * @param negativeBalanceFlag
     */
    public void setNegativeBalanceFlag(java.lang.Short negativeBalanceFlag) {
        this.negativeBalanceFlag = negativeBalanceFlag;
    }


    /**
     * Gets the oldNegativeBalance value for this NegativeBalanceLog.
     * 
     * @return oldNegativeBalance
     */
    public java.lang.Long getOldNegativeBalance() {
        return oldNegativeBalance;
    }


    /**
     * Sets the oldNegativeBalance value for this NegativeBalanceLog.
     * 
     * @param oldNegativeBalance
     */
    public void setOldNegativeBalance(java.lang.Long oldNegativeBalance) {
        this.oldNegativeBalance = oldNegativeBalance;
    }


    /**
     * Gets the newNegativeBalance value for this NegativeBalanceLog.
     * 
     * @return newNegativeBalance
     */
    public java.lang.Long getNewNegativeBalance() {
        return newNegativeBalance;
    }


    /**
     * Sets the newNegativeBalance value for this NegativeBalanceLog.
     * 
     * @param newNegativeBalance
     */
    public void setNewNegativeBalance(java.lang.Long newNegativeBalance) {
        this.newNegativeBalance = newNegativeBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NegativeBalanceLog)) return false;
        NegativeBalanceLog other = (NegativeBalanceLog) obj;
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
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.negativeBalance==null && other.getNegativeBalance()==null) || 
             (this.negativeBalance!=null &&
              this.negativeBalance.equals(other.getNegativeBalance()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.negativeFlag==null && other.getNegativeFlag()==null) || 
             (this.negativeFlag!=null &&
              this.negativeFlag.equals(other.getNegativeFlag()))) &&
            ((this.operationDate==null && other.getOperationDate()==null) || 
             (this.operationDate!=null &&
              this.operationDate.equals(other.getOperationDate()))) &&
            ((this.soMode==null && other.getSoMode()==null) || 
             (this.soMode!=null &&
              this.soMode.equals(other.getSoMode()))) &&
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.failReason==null && other.getFailReason()==null) || 
             (this.failReason!=null &&
              this.failReason.equals(other.getFailReason()))) &&
            ((this.negativeBalanceFlag==null && other.getNegativeBalanceFlag()==null) || 
             (this.negativeBalanceFlag!=null &&
              this.negativeBalanceFlag.equals(other.getNegativeBalanceFlag()))) &&
            ((this.oldNegativeBalance==null && other.getOldNegativeBalance()==null) || 
             (this.oldNegativeBalance!=null &&
              this.oldNegativeBalance.equals(other.getOldNegativeBalance()))) &&
            ((this.newNegativeBalance==null && other.getNewNegativeBalance()==null) || 
             (this.newNegativeBalance!=null &&
              this.newNegativeBalance.equals(other.getNewNegativeBalance())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getNegativeBalance() != null) {
            _hashCode += getNegativeBalance().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getNegativeFlag() != null) {
            _hashCode += getNegativeFlag().hashCode();
        }
        if (getOperationDate() != null) {
            _hashCode += getOperationDate().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFailReason() != null) {
            _hashCode += getFailReason().hashCode();
        }
        if (getNegativeBalanceFlag() != null) {
            _hashCode += getNegativeBalanceFlag().hashCode();
        }
        if (getOldNegativeBalance() != null) {
            _hashCode += getOldNegativeBalance().hashCode();
        }
        if (getNewNegativeBalance() != null) {
            _hashCode += getNewNegativeBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NegativeBalanceLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "negativeBalanceLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
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
        elemField.setFieldName("negativeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("negativeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("negativeBalanceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeBalanceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldNegativeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldNegativeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNegativeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newNegativeBalance"));
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
