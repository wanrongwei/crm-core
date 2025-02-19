/**
 * PaymentLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class PaymentLog  implements java.io.Serializable {
    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.String phoneId;

    private java.lang.Short flag;

    private java.lang.Integer opId;

    private java.lang.String paymentDate;

    private java.lang.Short payType;

    private java.lang.String invoice_no;

    private java.lang.Long amount;

    private java.lang.Short sequence;

    private java.lang.Short currency;

    private java.lang.String referenceNum;

    private java.lang.String remark;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentServiceItem[] paymentServiceItemList;

    private java.lang.Short soMode;

    private java.lang.String sourceSystem;

    private java.lang.String transactionId;

    private java.lang.String failReason;

    private java.lang.String operationDate;

    private java.lang.Long measureId;

    private java.lang.Short status;

    private java.lang.Short paymentMethodId;

    private java.lang.String[] invoiceNoList;

    public PaymentLog() {
    }

    public PaymentLog(
           java.lang.String outerCustId,
           java.lang.Long custId,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.String phoneId,
           java.lang.Short flag,
           java.lang.Integer opId,
           java.lang.String paymentDate,
           java.lang.Short payType,
           java.lang.String invoice_no,
           java.lang.Long amount,
           java.lang.Short sequence,
           java.lang.Short currency,
           java.lang.String referenceNum,
           java.lang.String remark,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentServiceItem[] paymentServiceItemList,
           java.lang.Short soMode,
           java.lang.String sourceSystem,
           java.lang.String transactionId,
           java.lang.String failReason,
           java.lang.String operationDate,
           java.lang.Long measureId,
           java.lang.Short status,
           java.lang.Short paymentMethodId,
           java.lang.String[] invoiceNoList) {
           this.outerCustId = outerCustId;
           this.custId = custId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.flag = flag;
           this.opId = opId;
           this.paymentDate = paymentDate;
           this.payType = payType;
           this.invoice_no = invoice_no;
           this.amount = amount;
           this.sequence = sequence;
           this.currency = currency;
           this.referenceNum = referenceNum;
           this.remark = remark;
           this.paymentServiceItemList = paymentServiceItemList;
           this.soMode = soMode;
           this.sourceSystem = sourceSystem;
           this.transactionId = transactionId;
           this.failReason = failReason;
           this.operationDate = operationDate;
           this.measureId = measureId;
           this.status = status;
           this.paymentMethodId = paymentMethodId;
           this.invoiceNoList = invoiceNoList;
    }


    /**
     * Gets the outerCustId value for this PaymentLog.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this PaymentLog.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this PaymentLog.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this PaymentLog.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the outerAcctId value for this PaymentLog.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this PaymentLog.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this PaymentLog.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this PaymentLog.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this PaymentLog.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this PaymentLog.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the flag value for this PaymentLog.
     * 
     * @return flag
     */
    public java.lang.Short getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this PaymentLog.
     * 
     * @param flag
     */
    public void setFlag(java.lang.Short flag) {
        this.flag = flag;
    }


    /**
     * Gets the opId value for this PaymentLog.
     * 
     * @return opId
     */
    public java.lang.Integer getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this PaymentLog.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Integer opId) {
        this.opId = opId;
    }


    /**
     * Gets the paymentDate value for this PaymentLog.
     * 
     * @return paymentDate
     */
    public java.lang.String getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this PaymentLog.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.lang.String paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the payType value for this PaymentLog.
     * 
     * @return payType
     */
    public java.lang.Short getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this PaymentLog.
     * 
     * @param payType
     */
    public void setPayType(java.lang.Short payType) {
        this.payType = payType;
    }


    /**
     * Gets the invoice_no value for this PaymentLog.
     * 
     * @return invoice_no
     */
    public java.lang.String getInvoice_no() {
        return invoice_no;
    }


    /**
     * Sets the invoice_no value for this PaymentLog.
     * 
     * @param invoice_no
     */
    public void setInvoice_no(java.lang.String invoice_no) {
        this.invoice_no = invoice_no;
    }


    /**
     * Gets the amount value for this PaymentLog.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentLog.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the sequence value for this PaymentLog.
     * 
     * @return sequence
     */
    public java.lang.Short getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PaymentLog.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.Short sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the currency value for this PaymentLog.
     * 
     * @return currency
     */
    public java.lang.Short getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PaymentLog.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.Short currency) {
        this.currency = currency;
    }


    /**
     * Gets the referenceNum value for this PaymentLog.
     * 
     * @return referenceNum
     */
    public java.lang.String getReferenceNum() {
        return referenceNum;
    }


    /**
     * Sets the referenceNum value for this PaymentLog.
     * 
     * @param referenceNum
     */
    public void setReferenceNum(java.lang.String referenceNum) {
        this.referenceNum = referenceNum;
    }


    /**
     * Gets the remark value for this PaymentLog.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this PaymentLog.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the paymentServiceItemList value for this PaymentLog.
     * 
     * @return paymentServiceItemList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentServiceItem[] getPaymentServiceItemList() {
        return paymentServiceItemList;
    }


    /**
     * Sets the paymentServiceItemList value for this PaymentLog.
     * 
     * @param paymentServiceItemList
     */
    public void setPaymentServiceItemList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentServiceItem[] paymentServiceItemList) {
        this.paymentServiceItemList = paymentServiceItemList;
    }


    /**
     * Gets the soMode value for this PaymentLog.
     * 
     * @return soMode
     */
    public java.lang.Short getSoMode() {
        return soMode;
    }


    /**
     * Sets the soMode value for this PaymentLog.
     * 
     * @param soMode
     */
    public void setSoMode(java.lang.Short soMode) {
        this.soMode = soMode;
    }


    /**
     * Gets the sourceSystem value for this PaymentLog.
     * 
     * @return sourceSystem
     */
    public java.lang.String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this PaymentLog.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(java.lang.String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the transactionId value for this PaymentLog.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentLog.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the failReason value for this PaymentLog.
     * 
     * @return failReason
     */
    public java.lang.String getFailReason() {
        return failReason;
    }


    /**
     * Sets the failReason value for this PaymentLog.
     * 
     * @param failReason
     */
    public void setFailReason(java.lang.String failReason) {
        this.failReason = failReason;
    }


    /**
     * Gets the operationDate value for this PaymentLog.
     * 
     * @return operationDate
     */
    public java.lang.String getOperationDate() {
        return operationDate;
    }


    /**
     * Sets the operationDate value for this PaymentLog.
     * 
     * @param operationDate
     */
    public void setOperationDate(java.lang.String operationDate) {
        this.operationDate = operationDate;
    }


    /**
     * Gets the measureId value for this PaymentLog.
     * 
     * @return measureId
     */
    public java.lang.Long getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this PaymentLog.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Long measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the status value for this PaymentLog.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentLog.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the paymentMethodId value for this PaymentLog.
     * 
     * @return paymentMethodId
     */
    public java.lang.Short getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this PaymentLog.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.Short paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the invoiceNoList value for this PaymentLog.
     * 
     * @return invoiceNoList
     */
    public java.lang.String[] getInvoiceNoList() {
        return invoiceNoList;
    }


    /**
     * Sets the invoiceNoList value for this PaymentLog.
     * 
     * @param invoiceNoList
     */
    public void setInvoiceNoList(java.lang.String[] invoiceNoList) {
        this.invoiceNoList = invoiceNoList;
    }

    public java.lang.String getInvoiceNoList(int i) {
        return this.invoiceNoList[i];
    }

    public void setInvoiceNoList(int i, java.lang.String _value) {
        this.invoiceNoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentLog)) return false;
        PaymentLog other = (PaymentLog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerCustId==null && other.getOuterCustId()==null) || 
             (this.outerCustId!=null &&
              this.outerCustId.equals(other.getOuterCustId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType()))) &&
            ((this.invoice_no==null && other.getInvoice_no()==null) || 
             (this.invoice_no!=null &&
              this.invoice_no.equals(other.getInvoice_no()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.referenceNum==null && other.getReferenceNum()==null) || 
             (this.referenceNum!=null &&
              this.referenceNum.equals(other.getReferenceNum()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.paymentServiceItemList==null && other.getPaymentServiceItemList()==null) || 
             (this.paymentServiceItemList!=null &&
              java.util.Arrays.equals(this.paymentServiceItemList, other.getPaymentServiceItemList()))) &&
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
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.invoiceNoList==null && other.getInvoiceNoList()==null) || 
             (this.invoiceNoList!=null &&
              java.util.Arrays.equals(this.invoiceNoList, other.getInvoiceNoList())));
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
        if (getOuterCustId() != null) {
            _hashCode += getOuterCustId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        if (getInvoice_no() != null) {
            _hashCode += getInvoice_no().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getReferenceNum() != null) {
            _hashCode += getReferenceNum().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getPaymentServiceItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentServiceItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentServiceItemList(), i);
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
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getInvoiceNoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceNoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceNoList(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_no"));
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
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentServiceItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "paymentServiceItem"));
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
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
