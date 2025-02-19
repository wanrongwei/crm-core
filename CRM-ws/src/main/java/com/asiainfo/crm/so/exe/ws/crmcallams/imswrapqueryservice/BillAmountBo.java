/**
 * BillAmountBo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class BillAmountBo  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Integer measureId;

    private java.lang.Long pastDueAmount;

    private java.lang.Long notDueAmount;

    private java.lang.Long billedAmount;

    private java.lang.Long creditLimit;

    private java.lang.Long aRBalance;

    private java.lang.Long totalAmount;

    private java.lang.Long moreYear;

    private java.lang.Long moreHalfYear;

    private java.lang.Long moreQuarter;

    private java.lang.Long moreTwoMonth;

    private java.lang.Long moreMonth;

    private java.lang.Long lessMonth;

    private java.lang.Long advancePayment;

    private java.lang.Long creditNote;

    private java.lang.Long paymentPlan;

    private java.lang.Long pastDueDisputed;

    private java.lang.Long notDueDisputed;

    private java.lang.Long realDeductFee;

    private java.lang.Long curUnpayFee;

    private java.lang.Long curCreditNote;

    private java.lang.Long disputed;

    private java.lang.Long carryOver;

    private java.lang.Long retailLimt;

    public BillAmountBo() {
    }

    public BillAmountBo(
           java.lang.Long acctId,
           java.lang.Integer measureId,
           java.lang.Long pastDueAmount,
           java.lang.Long notDueAmount,
           java.lang.Long billedAmount,
           java.lang.Long creditLimit,
           java.lang.Long aRBalance,
           java.lang.Long totalAmount,
           java.lang.Long moreYear,
           java.lang.Long moreHalfYear,
           java.lang.Long moreQuarter,
           java.lang.Long moreTwoMonth,
           java.lang.Long moreMonth,
           java.lang.Long lessMonth,
           java.lang.Long advancePayment,
           java.lang.Long creditNote,
           java.lang.Long paymentPlan,
           java.lang.Long pastDueDisputed,
           java.lang.Long notDueDisputed,
           java.lang.Long realDeductFee,
           java.lang.Long curUnpayFee,
           java.lang.Long curCreditNote,
           java.lang.Long disputed,
           java.lang.Long carryOver,
           java.lang.Long retailLimt) {
           this.acctId = acctId;
           this.measureId = measureId;
           this.pastDueAmount = pastDueAmount;
           this.notDueAmount = notDueAmount;
           this.billedAmount = billedAmount;
           this.creditLimit = creditLimit;
           this.aRBalance = aRBalance;
           this.totalAmount = totalAmount;
           this.moreYear = moreYear;
           this.moreHalfYear = moreHalfYear;
           this.moreQuarter = moreQuarter;
           this.moreTwoMonth = moreTwoMonth;
           this.moreMonth = moreMonth;
           this.lessMonth = lessMonth;
           this.advancePayment = advancePayment;
           this.creditNote = creditNote;
           this.paymentPlan = paymentPlan;
           this.pastDueDisputed = pastDueDisputed;
           this.notDueDisputed = notDueDisputed;
           this.realDeductFee = realDeductFee;
           this.curUnpayFee = curUnpayFee;
           this.curCreditNote = curCreditNote;
           this.disputed = disputed;
           this.carryOver = carryOver;
           this.retailLimt = retailLimt;
    }


    /**
     * Gets the acctId value for this BillAmountBo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this BillAmountBo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the measureId value for this BillAmountBo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this BillAmountBo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the pastDueAmount value for this BillAmountBo.
     * 
     * @return pastDueAmount
     */
    public java.lang.Long getPastDueAmount() {
        return pastDueAmount;
    }


    /**
     * Sets the pastDueAmount value for this BillAmountBo.
     * 
     * @param pastDueAmount
     */
    public void setPastDueAmount(java.lang.Long pastDueAmount) {
        this.pastDueAmount = pastDueAmount;
    }


    /**
     * Gets the notDueAmount value for this BillAmountBo.
     * 
     * @return notDueAmount
     */
    public java.lang.Long getNotDueAmount() {
        return notDueAmount;
    }


    /**
     * Sets the notDueAmount value for this BillAmountBo.
     * 
     * @param notDueAmount
     */
    public void setNotDueAmount(java.lang.Long notDueAmount) {
        this.notDueAmount = notDueAmount;
    }


    /**
     * Gets the billedAmount value for this BillAmountBo.
     * 
     * @return billedAmount
     */
    public java.lang.Long getBilledAmount() {
        return billedAmount;
    }


    /**
     * Sets the billedAmount value for this BillAmountBo.
     * 
     * @param billedAmount
     */
    public void setBilledAmount(java.lang.Long billedAmount) {
        this.billedAmount = billedAmount;
    }


    /**
     * Gets the creditLimit value for this BillAmountBo.
     * 
     * @return creditLimit
     */
    public java.lang.Long getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this BillAmountBo.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Long creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the aRBalance value for this BillAmountBo.
     * 
     * @return aRBalance
     */
    public java.lang.Long getARBalance() {
        return aRBalance;
    }


    /**
     * Sets the aRBalance value for this BillAmountBo.
     * 
     * @param aRBalance
     */
    public void setARBalance(java.lang.Long aRBalance) {
        this.aRBalance = aRBalance;
    }


    /**
     * Gets the totalAmount value for this BillAmountBo.
     * 
     * @return totalAmount
     */
    public java.lang.Long getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this BillAmountBo.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.Long totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the moreYear value for this BillAmountBo.
     * 
     * @return moreYear
     */
    public java.lang.Long getMoreYear() {
        return moreYear;
    }


    /**
     * Sets the moreYear value for this BillAmountBo.
     * 
     * @param moreYear
     */
    public void setMoreYear(java.lang.Long moreYear) {
        this.moreYear = moreYear;
    }


    /**
     * Gets the moreHalfYear value for this BillAmountBo.
     * 
     * @return moreHalfYear
     */
    public java.lang.Long getMoreHalfYear() {
        return moreHalfYear;
    }


    /**
     * Sets the moreHalfYear value for this BillAmountBo.
     * 
     * @param moreHalfYear
     */
    public void setMoreHalfYear(java.lang.Long moreHalfYear) {
        this.moreHalfYear = moreHalfYear;
    }


    /**
     * Gets the moreQuarter value for this BillAmountBo.
     * 
     * @return moreQuarter
     */
    public java.lang.Long getMoreQuarter() {
        return moreQuarter;
    }


    /**
     * Sets the moreQuarter value for this BillAmountBo.
     * 
     * @param moreQuarter
     */
    public void setMoreQuarter(java.lang.Long moreQuarter) {
        this.moreQuarter = moreQuarter;
    }


    /**
     * Gets the moreTwoMonth value for this BillAmountBo.
     * 
     * @return moreTwoMonth
     */
    public java.lang.Long getMoreTwoMonth() {
        return moreTwoMonth;
    }


    /**
     * Sets the moreTwoMonth value for this BillAmountBo.
     * 
     * @param moreTwoMonth
     */
    public void setMoreTwoMonth(java.lang.Long moreTwoMonth) {
        this.moreTwoMonth = moreTwoMonth;
    }


    /**
     * Gets the moreMonth value for this BillAmountBo.
     * 
     * @return moreMonth
     */
    public java.lang.Long getMoreMonth() {
        return moreMonth;
    }


    /**
     * Sets the moreMonth value for this BillAmountBo.
     * 
     * @param moreMonth
     */
    public void setMoreMonth(java.lang.Long moreMonth) {
        this.moreMonth = moreMonth;
    }


    /**
     * Gets the lessMonth value for this BillAmountBo.
     * 
     * @return lessMonth
     */
    public java.lang.Long getLessMonth() {
        return lessMonth;
    }


    /**
     * Sets the lessMonth value for this BillAmountBo.
     * 
     * @param lessMonth
     */
    public void setLessMonth(java.lang.Long lessMonth) {
        this.lessMonth = lessMonth;
    }


    /**
     * Gets the advancePayment value for this BillAmountBo.
     * 
     * @return advancePayment
     */
    public java.lang.Long getAdvancePayment() {
        return advancePayment;
    }


    /**
     * Sets the advancePayment value for this BillAmountBo.
     * 
     * @param advancePayment
     */
    public void setAdvancePayment(java.lang.Long advancePayment) {
        this.advancePayment = advancePayment;
    }


    /**
     * Gets the creditNote value for this BillAmountBo.
     * 
     * @return creditNote
     */
    public java.lang.Long getCreditNote() {
        return creditNote;
    }


    /**
     * Sets the creditNote value for this BillAmountBo.
     * 
     * @param creditNote
     */
    public void setCreditNote(java.lang.Long creditNote) {
        this.creditNote = creditNote;
    }


    /**
     * Gets the paymentPlan value for this BillAmountBo.
     * 
     * @return paymentPlan
     */
    public java.lang.Long getPaymentPlan() {
        return paymentPlan;
    }


    /**
     * Sets the paymentPlan value for this BillAmountBo.
     * 
     * @param paymentPlan
     */
    public void setPaymentPlan(java.lang.Long paymentPlan) {
        this.paymentPlan = paymentPlan;
    }


    /**
     * Gets the pastDueDisputed value for this BillAmountBo.
     * 
     * @return pastDueDisputed
     */
    public java.lang.Long getPastDueDisputed() {
        return pastDueDisputed;
    }


    /**
     * Sets the pastDueDisputed value for this BillAmountBo.
     * 
     * @param pastDueDisputed
     */
    public void setPastDueDisputed(java.lang.Long pastDueDisputed) {
        this.pastDueDisputed = pastDueDisputed;
    }


    /**
     * Gets the notDueDisputed value for this BillAmountBo.
     * 
     * @return notDueDisputed
     */
    public java.lang.Long getNotDueDisputed() {
        return notDueDisputed;
    }


    /**
     * Sets the notDueDisputed value for this BillAmountBo.
     * 
     * @param notDueDisputed
     */
    public void setNotDueDisputed(java.lang.Long notDueDisputed) {
        this.notDueDisputed = notDueDisputed;
    }


    /**
     * Gets the realDeductFee value for this BillAmountBo.
     * 
     * @return realDeductFee
     */
    public java.lang.Long getRealDeductFee() {
        return realDeductFee;
    }


    /**
     * Sets the realDeductFee value for this BillAmountBo.
     * 
     * @param realDeductFee
     */
    public void setRealDeductFee(java.lang.Long realDeductFee) {
        this.realDeductFee = realDeductFee;
    }


    /**
     * Gets the curUnpayFee value for this BillAmountBo.
     * 
     * @return curUnpayFee
     */
    public java.lang.Long getCurUnpayFee() {
        return curUnpayFee;
    }


    /**
     * Sets the curUnpayFee value for this BillAmountBo.
     * 
     * @param curUnpayFee
     */
    public void setCurUnpayFee(java.lang.Long curUnpayFee) {
        this.curUnpayFee = curUnpayFee;
    }


    /**
     * Gets the curCreditNote value for this BillAmountBo.
     * 
     * @return curCreditNote
     */
    public java.lang.Long getCurCreditNote() {
        return curCreditNote;
    }


    /**
     * Sets the curCreditNote value for this BillAmountBo.
     * 
     * @param curCreditNote
     */
    public void setCurCreditNote(java.lang.Long curCreditNote) {
        this.curCreditNote = curCreditNote;
    }


    /**
     * Gets the disputed value for this BillAmountBo.
     * 
     * @return disputed
     */
    public java.lang.Long getDisputed() {
        return disputed;
    }


    /**
     * Sets the disputed value for this BillAmountBo.
     * 
     * @param disputed
     */
    public void setDisputed(java.lang.Long disputed) {
        this.disputed = disputed;
    }


    /**
     * Gets the carryOver value for this BillAmountBo.
     * 
     * @return carryOver
     */
    public java.lang.Long getCarryOver() {
        return carryOver;
    }


    /**
     * Sets the carryOver value for this BillAmountBo.
     * 
     * @param carryOver
     */
    public void setCarryOver(java.lang.Long carryOver) {
        this.carryOver = carryOver;
    }


    /**
     * Gets the retailLimt value for this BillAmountBo.
     * 
     * @return retailLimt
     */
    public java.lang.Long getRetailLimt() {
        return retailLimt;
    }


    /**
     * Sets the retailLimt value for this BillAmountBo.
     * 
     * @param retailLimt
     */
    public void setRetailLimt(java.lang.Long retailLimt) {
        this.retailLimt = retailLimt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillAmountBo)) return false;
        BillAmountBo other = (BillAmountBo) obj;
       
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
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.pastDueAmount==null && other.getPastDueAmount()==null) || 
             (this.pastDueAmount!=null &&
              this.pastDueAmount.equals(other.getPastDueAmount()))) &&
            ((this.notDueAmount==null && other.getNotDueAmount()==null) || 
             (this.notDueAmount!=null &&
              this.notDueAmount.equals(other.getNotDueAmount()))) &&
            ((this.billedAmount==null && other.getBilledAmount()==null) || 
             (this.billedAmount!=null &&
              this.billedAmount.equals(other.getBilledAmount()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.aRBalance==null && other.getARBalance()==null) || 
             (this.aRBalance!=null &&
              this.aRBalance.equals(other.getARBalance()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.moreYear==null && other.getMoreYear()==null) || 
             (this.moreYear!=null &&
              this.moreYear.equals(other.getMoreYear()))) &&
            ((this.moreHalfYear==null && other.getMoreHalfYear()==null) || 
             (this.moreHalfYear!=null &&
              this.moreHalfYear.equals(other.getMoreHalfYear()))) &&
            ((this.moreQuarter==null && other.getMoreQuarter()==null) || 
             (this.moreQuarter!=null &&
              this.moreQuarter.equals(other.getMoreQuarter()))) &&
            ((this.moreTwoMonth==null && other.getMoreTwoMonth()==null) || 
             (this.moreTwoMonth!=null &&
              this.moreTwoMonth.equals(other.getMoreTwoMonth()))) &&
            ((this.moreMonth==null && other.getMoreMonth()==null) || 
             (this.moreMonth!=null &&
              this.moreMonth.equals(other.getMoreMonth()))) &&
            ((this.lessMonth==null && other.getLessMonth()==null) || 
             (this.lessMonth!=null &&
              this.lessMonth.equals(other.getLessMonth()))) &&
            ((this.advancePayment==null && other.getAdvancePayment()==null) || 
             (this.advancePayment!=null &&
              this.advancePayment.equals(other.getAdvancePayment()))) &&
            ((this.creditNote==null && other.getCreditNote()==null) || 
             (this.creditNote!=null &&
              this.creditNote.equals(other.getCreditNote()))) &&
            ((this.paymentPlan==null && other.getPaymentPlan()==null) || 
             (this.paymentPlan!=null &&
              this.paymentPlan.equals(other.getPaymentPlan()))) &&
            ((this.pastDueDisputed==null && other.getPastDueDisputed()==null) || 
             (this.pastDueDisputed!=null &&
              this.pastDueDisputed.equals(other.getPastDueDisputed()))) &&
            ((this.notDueDisputed==null && other.getNotDueDisputed()==null) || 
             (this.notDueDisputed!=null &&
              this.notDueDisputed.equals(other.getNotDueDisputed()))) &&
            ((this.realDeductFee==null && other.getRealDeductFee()==null) || 
             (this.realDeductFee!=null &&
              this.realDeductFee.equals(other.getRealDeductFee()))) &&
            ((this.curUnpayFee==null && other.getCurUnpayFee()==null) || 
             (this.curUnpayFee!=null &&
              this.curUnpayFee.equals(other.getCurUnpayFee()))) &&
            ((this.curCreditNote==null && other.getCurCreditNote()==null) || 
             (this.curCreditNote!=null &&
              this.curCreditNote.equals(other.getCurCreditNote()))) &&
            ((this.disputed==null && other.getDisputed()==null) || 
             (this.disputed!=null &&
              this.disputed.equals(other.getDisputed()))) &&
            ((this.carryOver==null && other.getCarryOver()==null) || 
             (this.carryOver!=null &&
              this.carryOver.equals(other.getCarryOver()))) &&
            ((this.retailLimt==null && other.getRetailLimt()==null) || 
             (this.retailLimt!=null &&
              this.retailLimt.equals(other.getRetailLimt())));
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
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getPastDueAmount() != null) {
            _hashCode += getPastDueAmount().hashCode();
        }
        if (getNotDueAmount() != null) {
            _hashCode += getNotDueAmount().hashCode();
        }
        if (getBilledAmount() != null) {
            _hashCode += getBilledAmount().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getARBalance() != null) {
            _hashCode += getARBalance().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getMoreYear() != null) {
            _hashCode += getMoreYear().hashCode();
        }
        if (getMoreHalfYear() != null) {
            _hashCode += getMoreHalfYear().hashCode();
        }
        if (getMoreQuarter() != null) {
            _hashCode += getMoreQuarter().hashCode();
        }
        if (getMoreTwoMonth() != null) {
            _hashCode += getMoreTwoMonth().hashCode();
        }
        if (getMoreMonth() != null) {
            _hashCode += getMoreMonth().hashCode();
        }
        if (getLessMonth() != null) {
            _hashCode += getLessMonth().hashCode();
        }
        if (getAdvancePayment() != null) {
            _hashCode += getAdvancePayment().hashCode();
        }
        if (getCreditNote() != null) {
            _hashCode += getCreditNote().hashCode();
        }
        if (getPaymentPlan() != null) {
            _hashCode += getPaymentPlan().hashCode();
        }
        if (getPastDueDisputed() != null) {
            _hashCode += getPastDueDisputed().hashCode();
        }
        if (getNotDueDisputed() != null) {
            _hashCode += getNotDueDisputed().hashCode();
        }
        if (getRealDeductFee() != null) {
            _hashCode += getRealDeductFee().hashCode();
        }
        if (getCurUnpayFee() != null) {
            _hashCode += getCurUnpayFee().hashCode();
        }
        if (getCurCreditNote() != null) {
            _hashCode += getCurCreditNote().hashCode();
        }
        if (getDisputed() != null) {
            _hashCode += getDisputed().hashCode();
        }
        if (getCarryOver() != null) {
            _hashCode += getCarryOver().hashCode();
        }
        if (getRetailLimt() != null) {
            _hashCode += getRetailLimt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillAmountBo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billAmountBo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
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
        elemField.setFieldName("pastDueAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pastDueAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notDueAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notDueAmount"));
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
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aRBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moreYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreHalfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moreHalfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moreQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreTwoMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moreTwoMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moreMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lessMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lessMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advancePayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pastDueDisputed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pastDueDisputed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notDueDisputed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notDueDisputed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realDeductFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realDeductFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curUnpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curUnpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curCreditNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curCreditNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disputed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carryOver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carryOver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailLimt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailLimt"));
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
