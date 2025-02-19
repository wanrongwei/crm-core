/**
 * CreditLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class CreditLimit  implements java.io.Serializable {
    private java.lang.Integer creditItemId;

    private java.lang.Double credit;

    private java.lang.Double remainCredit;

    private java.lang.Double tempCredit;

    private java.lang.Double advancePayment;

    private java.lang.Double usage;

    private java.lang.Double unpaidPayment;

    private java.lang.Short creditType;

    private java.lang.String expireDate;

    private java.lang.Integer measureId;

    private java.lang.Short tempFlag;

    private java.lang.Short unlimitedFlag;

    private java.lang.String lastBillDate;

    private java.lang.String nextBillDate;

    private java.lang.Double recurringFee;

    private java.lang.Double onetimeFee;

    private java.lang.Double unbilledAmount;

    private java.lang.Short exemptCreditflag;

    private java.lang.String exemptValidDate;

    private java.lang.String exemptExpireDate;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SubscriberExempt[] subscriberExemptList;

    private java.lang.Short itemType;

    public CreditLimit() {
    }

    public CreditLimit(
           java.lang.Integer creditItemId,
           java.lang.Double credit,
           java.lang.Double remainCredit,
           java.lang.Double tempCredit,
           java.lang.Double advancePayment,
           java.lang.Double usage,
           java.lang.Double unpaidPayment,
           java.lang.Short creditType,
           java.lang.String expireDate,
           java.lang.Integer measureId,
           java.lang.Short tempFlag,
           java.lang.Short unlimitedFlag,
           java.lang.String lastBillDate,
           java.lang.String nextBillDate,
           java.lang.Double recurringFee,
           java.lang.Double onetimeFee,
           java.lang.Double unbilledAmount,
           java.lang.Short exemptCreditflag,
           java.lang.String exemptValidDate,
           java.lang.String exemptExpireDate,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SubscriberExempt[] subscriberExemptList,
           java.lang.Short itemType) {
           this.creditItemId = creditItemId;
           this.credit = credit;
           this.remainCredit = remainCredit;
           this.tempCredit = tempCredit;
           this.advancePayment = advancePayment;
           this.usage = usage;
           this.unpaidPayment = unpaidPayment;
           this.creditType = creditType;
           this.expireDate = expireDate;
           this.measureId = measureId;
           this.tempFlag = tempFlag;
           this.unlimitedFlag = unlimitedFlag;
           this.lastBillDate = lastBillDate;
           this.nextBillDate = nextBillDate;
           this.recurringFee = recurringFee;
           this.onetimeFee = onetimeFee;
           this.unbilledAmount = unbilledAmount;
           this.exemptCreditflag = exemptCreditflag;
           this.exemptValidDate = exemptValidDate;
           this.exemptExpireDate = exemptExpireDate;
           this.subscriberExemptList = subscriberExemptList;
           this.itemType = itemType;
    }


    /**
     * Gets the creditItemId value for this CreditLimit.
     * 
     * @return creditItemId
     */
    public java.lang.Integer getCreditItemId() {
        return creditItemId;
    }


    /**
     * Sets the creditItemId value for this CreditLimit.
     * 
     * @param creditItemId
     */
    public void setCreditItemId(java.lang.Integer creditItemId) {
        this.creditItemId = creditItemId;
    }


    /**
     * Gets the credit value for this CreditLimit.
     * 
     * @return credit
     */
    public java.lang.Double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this CreditLimit.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Double credit) {
        this.credit = credit;
    }


    /**
     * Gets the remainCredit value for this CreditLimit.
     * 
     * @return remainCredit
     */
    public java.lang.Double getRemainCredit() {
        return remainCredit;
    }


    /**
     * Sets the remainCredit value for this CreditLimit.
     * 
     * @param remainCredit
     */
    public void setRemainCredit(java.lang.Double remainCredit) {
        this.remainCredit = remainCredit;
    }


    /**
     * Gets the tempCredit value for this CreditLimit.
     * 
     * @return tempCredit
     */
    public java.lang.Double getTempCredit() {
        return tempCredit;
    }


    /**
     * Sets the tempCredit value for this CreditLimit.
     * 
     * @param tempCredit
     */
    public void setTempCredit(java.lang.Double tempCredit) {
        this.tempCredit = tempCredit;
    }


    /**
     * Gets the advancePayment value for this CreditLimit.
     * 
     * @return advancePayment
     */
    public java.lang.Double getAdvancePayment() {
        return advancePayment;
    }


    /**
     * Sets the advancePayment value for this CreditLimit.
     * 
     * @param advancePayment
     */
    public void setAdvancePayment(java.lang.Double advancePayment) {
        this.advancePayment = advancePayment;
    }


    /**
     * Gets the usage value for this CreditLimit.
     * 
     * @return usage
     */
    public java.lang.Double getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this CreditLimit.
     * 
     * @param usage
     */
    public void setUsage(java.lang.Double usage) {
        this.usage = usage;
    }


    /**
     * Gets the unpaidPayment value for this CreditLimit.
     * 
     * @return unpaidPayment
     */
    public java.lang.Double getUnpaidPayment() {
        return unpaidPayment;
    }


    /**
     * Sets the unpaidPayment value for this CreditLimit.
     * 
     * @param unpaidPayment
     */
    public void setUnpaidPayment(java.lang.Double unpaidPayment) {
        this.unpaidPayment = unpaidPayment;
    }


    /**
     * Gets the creditType value for this CreditLimit.
     * 
     * @return creditType
     */
    public java.lang.Short getCreditType() {
        return creditType;
    }


    /**
     * Sets the creditType value for this CreditLimit.
     * 
     * @param creditType
     */
    public void setCreditType(java.lang.Short creditType) {
        this.creditType = creditType;
    }


    /**
     * Gets the expireDate value for this CreditLimit.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CreditLimit.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the measureId value for this CreditLimit.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this CreditLimit.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the tempFlag value for this CreditLimit.
     * 
     * @return tempFlag
     */
    public java.lang.Short getTempFlag() {
        return tempFlag;
    }


    /**
     * Sets the tempFlag value for this CreditLimit.
     * 
     * @param tempFlag
     */
    public void setTempFlag(java.lang.Short tempFlag) {
        this.tempFlag = tempFlag;
    }


    /**
     * Gets the unlimitedFlag value for this CreditLimit.
     * 
     * @return unlimitedFlag
     */
    public java.lang.Short getUnlimitedFlag() {
        return unlimitedFlag;
    }


    /**
     * Sets the unlimitedFlag value for this CreditLimit.
     * 
     * @param unlimitedFlag
     */
    public void setUnlimitedFlag(java.lang.Short unlimitedFlag) {
        this.unlimitedFlag = unlimitedFlag;
    }


    /**
     * Gets the lastBillDate value for this CreditLimit.
     * 
     * @return lastBillDate
     */
    public java.lang.String getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this CreditLimit.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(java.lang.String lastBillDate) {
        this.lastBillDate = lastBillDate;
    }


    /**
     * Gets the nextBillDate value for this CreditLimit.
     * 
     * @return nextBillDate
     */
    public java.lang.String getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this CreditLimit.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(java.lang.String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the recurringFee value for this CreditLimit.
     * 
     * @return recurringFee
     */
    public java.lang.Double getRecurringFee() {
        return recurringFee;
    }


    /**
     * Sets the recurringFee value for this CreditLimit.
     * 
     * @param recurringFee
     */
    public void setRecurringFee(java.lang.Double recurringFee) {
        this.recurringFee = recurringFee;
    }


    /**
     * Gets the onetimeFee value for this CreditLimit.
     * 
     * @return onetimeFee
     */
    public java.lang.Double getOnetimeFee() {
        return onetimeFee;
    }


    /**
     * Sets the onetimeFee value for this CreditLimit.
     * 
     * @param onetimeFee
     */
    public void setOnetimeFee(java.lang.Double onetimeFee) {
        this.onetimeFee = onetimeFee;
    }


    /**
     * Gets the unbilledAmount value for this CreditLimit.
     * 
     * @return unbilledAmount
     */
    public java.lang.Double getUnbilledAmount() {
        return unbilledAmount;
    }


    /**
     * Sets the unbilledAmount value for this CreditLimit.
     * 
     * @param unbilledAmount
     */
    public void setUnbilledAmount(java.lang.Double unbilledAmount) {
        this.unbilledAmount = unbilledAmount;
    }


    /**
     * Gets the exemptCreditflag value for this CreditLimit.
     * 
     * @return exemptCreditflag
     */
    public java.lang.Short getExemptCreditflag() {
        return exemptCreditflag;
    }


    /**
     * Sets the exemptCreditflag value for this CreditLimit.
     * 
     * @param exemptCreditflag
     */
    public void setExemptCreditflag(java.lang.Short exemptCreditflag) {
        this.exemptCreditflag = exemptCreditflag;
    }


    /**
     * Gets the exemptValidDate value for this CreditLimit.
     * 
     * @return exemptValidDate
     */
    public java.lang.String getExemptValidDate() {
        return exemptValidDate;
    }


    /**
     * Sets the exemptValidDate value for this CreditLimit.
     * 
     * @param exemptValidDate
     */
    public void setExemptValidDate(java.lang.String exemptValidDate) {
        this.exemptValidDate = exemptValidDate;
    }


    /**
     * Gets the exemptExpireDate value for this CreditLimit.
     * 
     * @return exemptExpireDate
     */
    public java.lang.String getExemptExpireDate() {
        return exemptExpireDate;
    }


    /**
     * Sets the exemptExpireDate value for this CreditLimit.
     * 
     * @param exemptExpireDate
     */
    public void setExemptExpireDate(java.lang.String exemptExpireDate) {
        this.exemptExpireDate = exemptExpireDate;
    }


    /**
     * Gets the subscriberExemptList value for this CreditLimit.
     * 
     * @return subscriberExemptList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SubscriberExempt[] getSubscriberExemptList() {
        return subscriberExemptList;
    }


    /**
     * Sets the subscriberExemptList value for this CreditLimit.
     * 
     * @param subscriberExemptList
     */
    public void setSubscriberExemptList(com.asiainfo.crm.cm.dk.ws.imswrapservice.SubscriberExempt[] subscriberExemptList) {
        this.subscriberExemptList = subscriberExemptList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SubscriberExempt getSubscriberExemptList(int i) {
        return this.subscriberExemptList[i];
    }

    public void setSubscriberExemptList(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.SubscriberExempt _value) {
        this.subscriberExemptList[i] = _value;
    }


    /**
     * Gets the itemType value for this CreditLimit.
     * 
     * @return itemType
     */
    public java.lang.Short getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this CreditLimit.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Short itemType) {
        this.itemType = itemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditLimit)) return false;
        CreditLimit other = (CreditLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditItemId==null && other.getCreditItemId()==null) || 
             (this.creditItemId!=null &&
              this.creditItemId.equals(other.getCreditItemId()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.remainCredit==null && other.getRemainCredit()==null) || 
             (this.remainCredit!=null &&
              this.remainCredit.equals(other.getRemainCredit()))) &&
            ((this.tempCredit==null && other.getTempCredit()==null) || 
             (this.tempCredit!=null &&
              this.tempCredit.equals(other.getTempCredit()))) &&
            ((this.advancePayment==null && other.getAdvancePayment()==null) || 
             (this.advancePayment!=null &&
              this.advancePayment.equals(other.getAdvancePayment()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.unpaidPayment==null && other.getUnpaidPayment()==null) || 
             (this.unpaidPayment!=null &&
              this.unpaidPayment.equals(other.getUnpaidPayment()))) &&
            ((this.creditType==null && other.getCreditType()==null) || 
             (this.creditType!=null &&
              this.creditType.equals(other.getCreditType()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.tempFlag==null && other.getTempFlag()==null) || 
             (this.tempFlag!=null &&
              this.tempFlag.equals(other.getTempFlag()))) &&
            ((this.unlimitedFlag==null && other.getUnlimitedFlag()==null) || 
             (this.unlimitedFlag!=null &&
              this.unlimitedFlag.equals(other.getUnlimitedFlag()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              this.lastBillDate.equals(other.getLastBillDate()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate()))) &&
            ((this.recurringFee==null && other.getRecurringFee()==null) || 
             (this.recurringFee!=null &&
              this.recurringFee.equals(other.getRecurringFee()))) &&
            ((this.onetimeFee==null && other.getOnetimeFee()==null) || 
             (this.onetimeFee!=null &&
              this.onetimeFee.equals(other.getOnetimeFee()))) &&
            ((this.unbilledAmount==null && other.getUnbilledAmount()==null) || 
             (this.unbilledAmount!=null &&
              this.unbilledAmount.equals(other.getUnbilledAmount()))) &&
            ((this.exemptCreditflag==null && other.getExemptCreditflag()==null) || 
             (this.exemptCreditflag!=null &&
              this.exemptCreditflag.equals(other.getExemptCreditflag()))) &&
            ((this.exemptValidDate==null && other.getExemptValidDate()==null) || 
             (this.exemptValidDate!=null &&
              this.exemptValidDate.equals(other.getExemptValidDate()))) &&
            ((this.exemptExpireDate==null && other.getExemptExpireDate()==null) || 
             (this.exemptExpireDate!=null &&
              this.exemptExpireDate.equals(other.getExemptExpireDate()))) &&
            ((this.subscriberExemptList==null && other.getSubscriberExemptList()==null) || 
             (this.subscriberExemptList!=null &&
              java.util.Arrays.equals(this.subscriberExemptList, other.getSubscriberExemptList()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType())));
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
        if (getCreditItemId() != null) {
            _hashCode += getCreditItemId().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getRemainCredit() != null) {
            _hashCode += getRemainCredit().hashCode();
        }
        if (getTempCredit() != null) {
            _hashCode += getTempCredit().hashCode();
        }
        if (getAdvancePayment() != null) {
            _hashCode += getAdvancePayment().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getUnpaidPayment() != null) {
            _hashCode += getUnpaidPayment().hashCode();
        }
        if (getCreditType() != null) {
            _hashCode += getCreditType().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getTempFlag() != null) {
            _hashCode += getTempFlag().hashCode();
        }
        if (getUnlimitedFlag() != null) {
            _hashCode += getUnlimitedFlag().hashCode();
        }
        if (getLastBillDate() != null) {
            _hashCode += getLastBillDate().hashCode();
        }
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        if (getRecurringFee() != null) {
            _hashCode += getRecurringFee().hashCode();
        }
        if (getOnetimeFee() != null) {
            _hashCode += getOnetimeFee().hashCode();
        }
        if (getUnbilledAmount() != null) {
            _hashCode += getUnbilledAmount().hashCode();
        }
        if (getExemptCreditflag() != null) {
            _hashCode += getExemptCreditflag().hashCode();
        }
        if (getExemptValidDate() != null) {
            _hashCode += getExemptValidDate().hashCode();
        }
        if (getExemptExpireDate() != null) {
            _hashCode += getExemptExpireDate().hashCode();
        }
        if (getSubscriberExemptList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberExemptList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberExemptList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("remainCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advancePayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpaidPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpaidPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unlimitedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onetimeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onetimeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbilledAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unbilledAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptCreditflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptCreditflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberExemptList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberExemptList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subscriberExempt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
