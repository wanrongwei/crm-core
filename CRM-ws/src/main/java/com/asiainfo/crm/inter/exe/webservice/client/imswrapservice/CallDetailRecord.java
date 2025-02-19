/**
 * CallDetailRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class CallDetailRecord  implements java.io.Serializable {
    private java.lang.String dateOfEvent;

    private java.lang.String timeOfEvent;

    private java.lang.Short peakOffpeak;

    private java.lang.String calledNumber;

    private java.lang.String chargingNumber;

    private java.lang.String operator;

    private java.lang.String origination;

    private java.lang.String destination;

    private java.lang.String addedService;

    private java.lang.String unit;

    private java.lang.String duration;

    private java.lang.String country;

    private java.lang.String groupingName;

    private java.lang.Long prepaidUsage;

    private java.lang.Long postpaidUsage;

    private java.lang.Short payMode;

    private java.lang.Short roamType;

    private java.lang.Long totalCharge;

    private java.lang.Long preDiscount;

    private java.lang.Integer measureId;

    private java.lang.Short qosIndicator;

    private java.lang.Long atc;

    private java.lang.Long tax;

    private java.lang.Integer callType;

    private java.lang.String duraction;

    private java.lang.Short refundFlag;

    private java.lang.String refundSessionId;

    private java.lang.String accessPoint;

    private java.lang.String volume;

    private java.lang.Long acctID;

    private java.lang.Long payAccID;

    private java.lang.String deductTime;

    private java.lang.String reguideCharge;

    private java.lang.Integer cdrType;

    private java.lang.Short freeResFlag;

    public CallDetailRecord() {
    }

    public CallDetailRecord(
           java.lang.String dateOfEvent,
           java.lang.String timeOfEvent,
           java.lang.Short peakOffpeak,
           java.lang.String calledNumber,
           java.lang.String chargingNumber,
           java.lang.String operator,
           java.lang.String origination,
           java.lang.String destination,
           java.lang.String addedService,
           java.lang.String unit,
           java.lang.String duration,
           java.lang.String country,
           java.lang.String groupingName,
           java.lang.Long prepaidUsage,
           java.lang.Long postpaidUsage,
           java.lang.Short payMode,
           java.lang.Short roamType,
           java.lang.Long totalCharge,
           java.lang.Long preDiscount,
           java.lang.Integer measureId,
           java.lang.Short qosIndicator,
           java.lang.Long atc,
           java.lang.Long tax,
           java.lang.Integer callType,
           java.lang.String duraction,
           java.lang.Short refundFlag,
           java.lang.String refundSessionId,
           java.lang.String accessPoint,
           java.lang.String volume,
           java.lang.Long acctID,
           java.lang.Long payAccID,
           java.lang.String deductTime,
           java.lang.String reguideCharge,
           java.lang.Integer cdrType,
           java.lang.Short freeResFlag) {
           this.dateOfEvent = dateOfEvent;
           this.timeOfEvent = timeOfEvent;
           this.peakOffpeak = peakOffpeak;
           this.calledNumber = calledNumber;
           this.chargingNumber = chargingNumber;
           this.operator = operator;
           this.origination = origination;
           this.destination = destination;
           this.addedService = addedService;
           this.unit = unit;
           this.duration = duration;
           this.country = country;
           this.groupingName = groupingName;
           this.prepaidUsage = prepaidUsage;
           this.postpaidUsage = postpaidUsage;
           this.payMode = payMode;
           this.roamType = roamType;
           this.totalCharge = totalCharge;
           this.preDiscount = preDiscount;
           this.measureId = measureId;
           this.qosIndicator = qosIndicator;
           this.atc = atc;
           this.tax = tax;
           this.callType = callType;
           this.duraction = duraction;
           this.refundFlag = refundFlag;
           this.refundSessionId = refundSessionId;
           this.accessPoint = accessPoint;
           this.volume = volume;
           this.acctID = acctID;
           this.payAccID = payAccID;
           this.deductTime = deductTime;
           this.reguideCharge = reguideCharge;
           this.cdrType = cdrType;
           this.freeResFlag = freeResFlag;
    }


    /**
     * Gets the dateOfEvent value for this CallDetailRecord.
     * 
     * @return dateOfEvent
     */
    public java.lang.String getDateOfEvent() {
        return dateOfEvent;
    }


    /**
     * Sets the dateOfEvent value for this CallDetailRecord.
     * 
     * @param dateOfEvent
     */
    public void setDateOfEvent(java.lang.String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }


    /**
     * Gets the timeOfEvent value for this CallDetailRecord.
     * 
     * @return timeOfEvent
     */
    public java.lang.String getTimeOfEvent() {
        return timeOfEvent;
    }


    /**
     * Sets the timeOfEvent value for this CallDetailRecord.
     * 
     * @param timeOfEvent
     */
    public void setTimeOfEvent(java.lang.String timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }


    /**
     * Gets the peakOffpeak value for this CallDetailRecord.
     * 
     * @return peakOffpeak
     */
    public java.lang.Short getPeakOffpeak() {
        return peakOffpeak;
    }


    /**
     * Sets the peakOffpeak value for this CallDetailRecord.
     * 
     * @param peakOffpeak
     */
    public void setPeakOffpeak(java.lang.Short peakOffpeak) {
        this.peakOffpeak = peakOffpeak;
    }


    /**
     * Gets the calledNumber value for this CallDetailRecord.
     * 
     * @return calledNumber
     */
    public java.lang.String getCalledNumber() {
        return calledNumber;
    }


    /**
     * Sets the calledNumber value for this CallDetailRecord.
     * 
     * @param calledNumber
     */
    public void setCalledNumber(java.lang.String calledNumber) {
        this.calledNumber = calledNumber;
    }


    /**
     * Gets the chargingNumber value for this CallDetailRecord.
     * 
     * @return chargingNumber
     */
    public java.lang.String getChargingNumber() {
        return chargingNumber;
    }


    /**
     * Sets the chargingNumber value for this CallDetailRecord.
     * 
     * @param chargingNumber
     */
    public void setChargingNumber(java.lang.String chargingNumber) {
        this.chargingNumber = chargingNumber;
    }


    /**
     * Gets the operator value for this CallDetailRecord.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this CallDetailRecord.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the origination value for this CallDetailRecord.
     * 
     * @return origination
     */
    public java.lang.String getOrigination() {
        return origination;
    }


    /**
     * Sets the origination value for this CallDetailRecord.
     * 
     * @param origination
     */
    public void setOrigination(java.lang.String origination) {
        this.origination = origination;
    }


    /**
     * Gets the destination value for this CallDetailRecord.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this CallDetailRecord.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the addedService value for this CallDetailRecord.
     * 
     * @return addedService
     */
    public java.lang.String getAddedService() {
        return addedService;
    }


    /**
     * Sets the addedService value for this CallDetailRecord.
     * 
     * @param addedService
     */
    public void setAddedService(java.lang.String addedService) {
        this.addedService = addedService;
    }


    /**
     * Gets the unit value for this CallDetailRecord.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this CallDetailRecord.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the duration value for this CallDetailRecord.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this CallDetailRecord.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the country value for this CallDetailRecord.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CallDetailRecord.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the groupingName value for this CallDetailRecord.
     * 
     * @return groupingName
     */
    public java.lang.String getGroupingName() {
        return groupingName;
    }


    /**
     * Sets the groupingName value for this CallDetailRecord.
     * 
     * @param groupingName
     */
    public void setGroupingName(java.lang.String groupingName) {
        this.groupingName = groupingName;
    }


    /**
     * Gets the prepaidUsage value for this CallDetailRecord.
     * 
     * @return prepaidUsage
     */
    public java.lang.Long getPrepaidUsage() {
        return prepaidUsage;
    }


    /**
     * Sets the prepaidUsage value for this CallDetailRecord.
     * 
     * @param prepaidUsage
     */
    public void setPrepaidUsage(java.lang.Long prepaidUsage) {
        this.prepaidUsage = prepaidUsage;
    }


    /**
     * Gets the postpaidUsage value for this CallDetailRecord.
     * 
     * @return postpaidUsage
     */
    public java.lang.Long getPostpaidUsage() {
        return postpaidUsage;
    }


    /**
     * Sets the postpaidUsage value for this CallDetailRecord.
     * 
     * @param postpaidUsage
     */
    public void setPostpaidUsage(java.lang.Long postpaidUsage) {
        this.postpaidUsage = postpaidUsage;
    }


    /**
     * Gets the payMode value for this CallDetailRecord.
     * 
     * @return payMode
     */
    public java.lang.Short getPayMode() {
        return payMode;
    }


    /**
     * Sets the payMode value for this CallDetailRecord.
     * 
     * @param payMode
     */
    public void setPayMode(java.lang.Short payMode) {
        this.payMode = payMode;
    }


    /**
     * Gets the roamType value for this CallDetailRecord.
     * 
     * @return roamType
     */
    public java.lang.Short getRoamType() {
        return roamType;
    }


    /**
     * Sets the roamType value for this CallDetailRecord.
     * 
     * @param roamType
     */
    public void setRoamType(java.lang.Short roamType) {
        this.roamType = roamType;
    }


    /**
     * Gets the totalCharge value for this CallDetailRecord.
     * 
     * @return totalCharge
     */
    public java.lang.Long getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this CallDetailRecord.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.Long totalCharge) {
        this.totalCharge = totalCharge;
    }


    /**
     * Gets the preDiscount value for this CallDetailRecord.
     * 
     * @return preDiscount
     */
    public java.lang.Long getPreDiscount() {
        return preDiscount;
    }


    /**
     * Sets the preDiscount value for this CallDetailRecord.
     * 
     * @param preDiscount
     */
    public void setPreDiscount(java.lang.Long preDiscount) {
        this.preDiscount = preDiscount;
    }


    /**
     * Gets the measureId value for this CallDetailRecord.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this CallDetailRecord.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the qosIndicator value for this CallDetailRecord.
     * 
     * @return qosIndicator
     */
    public java.lang.Short getQosIndicator() {
        return qosIndicator;
    }


    /**
     * Sets the qosIndicator value for this CallDetailRecord.
     * 
     * @param qosIndicator
     */
    public void setQosIndicator(java.lang.Short qosIndicator) {
        this.qosIndicator = qosIndicator;
    }


    /**
     * Gets the atc value for this CallDetailRecord.
     * 
     * @return atc
     */
    public java.lang.Long getAtc() {
        return atc;
    }


    /**
     * Sets the atc value for this CallDetailRecord.
     * 
     * @param atc
     */
    public void setAtc(java.lang.Long atc) {
        this.atc = atc;
    }


    /**
     * Gets the tax value for this CallDetailRecord.
     * 
     * @return tax
     */
    public java.lang.Long getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this CallDetailRecord.
     * 
     * @param tax
     */
    public void setTax(java.lang.Long tax) {
        this.tax = tax;
    }


    /**
     * Gets the callType value for this CallDetailRecord.
     * 
     * @return callType
     */
    public java.lang.Integer getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this CallDetailRecord.
     * 
     * @param callType
     */
    public void setCallType(java.lang.Integer callType) {
        this.callType = callType;
    }


    /**
     * Gets the duraction value for this CallDetailRecord.
     * 
     * @return duraction
     */
    public java.lang.String getDuraction() {
        return duraction;
    }


    /**
     * Sets the duraction value for this CallDetailRecord.
     * 
     * @param duraction
     */
    public void setDuraction(java.lang.String duraction) {
        this.duraction = duraction;
    }


    /**
     * Gets the refundFlag value for this CallDetailRecord.
     * 
     * @return refundFlag
     */
    public java.lang.Short getRefundFlag() {
        return refundFlag;
    }


    /**
     * Sets the refundFlag value for this CallDetailRecord.
     * 
     * @param refundFlag
     */
    public void setRefundFlag(java.lang.Short refundFlag) {
        this.refundFlag = refundFlag;
    }


    /**
     * Gets the refundSessionId value for this CallDetailRecord.
     * 
     * @return refundSessionId
     */
    public java.lang.String getRefundSessionId() {
        return refundSessionId;
    }


    /**
     * Sets the refundSessionId value for this CallDetailRecord.
     * 
     * @param refundSessionId
     */
    public void setRefundSessionId(java.lang.String refundSessionId) {
        this.refundSessionId = refundSessionId;
    }


    /**
     * Gets the accessPoint value for this CallDetailRecord.
     * 
     * @return accessPoint
     */
    public java.lang.String getAccessPoint() {
        return accessPoint;
    }


    /**
     * Sets the accessPoint value for this CallDetailRecord.
     * 
     * @param accessPoint
     */
    public void setAccessPoint(java.lang.String accessPoint) {
        this.accessPoint = accessPoint;
    }


    /**
     * Gets the volume value for this CallDetailRecord.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this CallDetailRecord.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }


    /**
     * Gets the acctID value for this CallDetailRecord.
     * 
     * @return acctID
     */
    public java.lang.Long getAcctID() {
        return acctID;
    }


    /**
     * Sets the acctID value for this CallDetailRecord.
     * 
     * @param acctID
     */
    public void setAcctID(java.lang.Long acctID) {
        this.acctID = acctID;
    }


    /**
     * Gets the payAccID value for this CallDetailRecord.
     * 
     * @return payAccID
     */
    public java.lang.Long getPayAccID() {
        return payAccID;
    }


    /**
     * Sets the payAccID value for this CallDetailRecord.
     * 
     * @param payAccID
     */
    public void setPayAccID(java.lang.Long payAccID) {
        this.payAccID = payAccID;
    }


    /**
     * Gets the deductTime value for this CallDetailRecord.
     * 
     * @return deductTime
     */
    public java.lang.String getDeductTime() {
        return deductTime;
    }


    /**
     * Sets the deductTime value for this CallDetailRecord.
     * 
     * @param deductTime
     */
    public void setDeductTime(java.lang.String deductTime) {
        this.deductTime = deductTime;
    }


    /**
     * Gets the reguideCharge value for this CallDetailRecord.
     * 
     * @return reguideCharge
     */
    public java.lang.String getReguideCharge() {
        return reguideCharge;
    }


    /**
     * Sets the reguideCharge value for this CallDetailRecord.
     * 
     * @param reguideCharge
     */
    public void setReguideCharge(java.lang.String reguideCharge) {
        this.reguideCharge = reguideCharge;
    }


    /**
     * Gets the cdrType value for this CallDetailRecord.
     * 
     * @return cdrType
     */
    public java.lang.Integer getCdrType() {
        return cdrType;
    }


    /**
     * Sets the cdrType value for this CallDetailRecord.
     * 
     * @param cdrType
     */
    public void setCdrType(java.lang.Integer cdrType) {
        this.cdrType = cdrType;
    }


    /**
     * Gets the freeResFlag value for this CallDetailRecord.
     * 
     * @return freeResFlag
     */
    public java.lang.Short getFreeResFlag() {
        return freeResFlag;
    }


    /**
     * Sets the freeResFlag value for this CallDetailRecord.
     * 
     * @param freeResFlag
     */
    public void setFreeResFlag(java.lang.Short freeResFlag) {
        this.freeResFlag = freeResFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailRecord)) return false;
        CallDetailRecord other = (CallDetailRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateOfEvent==null && other.getDateOfEvent()==null) || 
             (this.dateOfEvent!=null &&
              this.dateOfEvent.equals(other.getDateOfEvent()))) &&
            ((this.timeOfEvent==null && other.getTimeOfEvent()==null) || 
             (this.timeOfEvent!=null &&
              this.timeOfEvent.equals(other.getTimeOfEvent()))) &&
            ((this.peakOffpeak==null && other.getPeakOffpeak()==null) || 
             (this.peakOffpeak!=null &&
              this.peakOffpeak.equals(other.getPeakOffpeak()))) &&
            ((this.calledNumber==null && other.getCalledNumber()==null) || 
             (this.calledNumber!=null &&
              this.calledNumber.equals(other.getCalledNumber()))) &&
            ((this.chargingNumber==null && other.getChargingNumber()==null) || 
             (this.chargingNumber!=null &&
              this.chargingNumber.equals(other.getChargingNumber()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.origination==null && other.getOrigination()==null) || 
             (this.origination!=null &&
              this.origination.equals(other.getOrigination()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.addedService==null && other.getAddedService()==null) || 
             (this.addedService!=null &&
              this.addedService.equals(other.getAddedService()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.groupingName==null && other.getGroupingName()==null) || 
             (this.groupingName!=null &&
              this.groupingName.equals(other.getGroupingName()))) &&
            ((this.prepaidUsage==null && other.getPrepaidUsage()==null) || 
             (this.prepaidUsage!=null &&
              this.prepaidUsage.equals(other.getPrepaidUsage()))) &&
            ((this.postpaidUsage==null && other.getPostpaidUsage()==null) || 
             (this.postpaidUsage!=null &&
              this.postpaidUsage.equals(other.getPostpaidUsage()))) &&
            ((this.payMode==null && other.getPayMode()==null) || 
             (this.payMode!=null &&
              this.payMode.equals(other.getPayMode()))) &&
            ((this.roamType==null && other.getRoamType()==null) || 
             (this.roamType!=null &&
              this.roamType.equals(other.getRoamType()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge()))) &&
            ((this.preDiscount==null && other.getPreDiscount()==null) || 
             (this.preDiscount!=null &&
              this.preDiscount.equals(other.getPreDiscount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.qosIndicator==null && other.getQosIndicator()==null) || 
             (this.qosIndicator!=null &&
              this.qosIndicator.equals(other.getQosIndicator()))) &&
            ((this.atc==null && other.getAtc()==null) || 
             (this.atc!=null &&
              this.atc.equals(other.getAtc()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.duraction==null && other.getDuraction()==null) || 
             (this.duraction!=null &&
              this.duraction.equals(other.getDuraction()))) &&
            ((this.refundFlag==null && other.getRefundFlag()==null) || 
             (this.refundFlag!=null &&
              this.refundFlag.equals(other.getRefundFlag()))) &&
            ((this.refundSessionId==null && other.getRefundSessionId()==null) || 
             (this.refundSessionId!=null &&
              this.refundSessionId.equals(other.getRefundSessionId()))) &&
            ((this.accessPoint==null && other.getAccessPoint()==null) || 
             (this.accessPoint!=null &&
              this.accessPoint.equals(other.getAccessPoint()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.acctID==null && other.getAcctID()==null) || 
             (this.acctID!=null &&
              this.acctID.equals(other.getAcctID()))) &&
            ((this.payAccID==null && other.getPayAccID()==null) || 
             (this.payAccID!=null &&
              this.payAccID.equals(other.getPayAccID()))) &&
            ((this.deductTime==null && other.getDeductTime()==null) || 
             (this.deductTime!=null &&
              this.deductTime.equals(other.getDeductTime()))) &&
            ((this.reguideCharge==null && other.getReguideCharge()==null) || 
             (this.reguideCharge!=null &&
              this.reguideCharge.equals(other.getReguideCharge()))) &&
            ((this.cdrType==null && other.getCdrType()==null) || 
             (this.cdrType!=null &&
              this.cdrType.equals(other.getCdrType()))) &&
            ((this.freeResFlag==null && other.getFreeResFlag()==null) || 
             (this.freeResFlag!=null &&
              this.freeResFlag.equals(other.getFreeResFlag())));
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
        if (getDateOfEvent() != null) {
            _hashCode += getDateOfEvent().hashCode();
        }
        if (getTimeOfEvent() != null) {
            _hashCode += getTimeOfEvent().hashCode();
        }
        if (getPeakOffpeak() != null) {
            _hashCode += getPeakOffpeak().hashCode();
        }
        if (getCalledNumber() != null) {
            _hashCode += getCalledNumber().hashCode();
        }
        if (getChargingNumber() != null) {
            _hashCode += getChargingNumber().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getOrigination() != null) {
            _hashCode += getOrigination().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getAddedService() != null) {
            _hashCode += getAddedService().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getGroupingName() != null) {
            _hashCode += getGroupingName().hashCode();
        }
        if (getPrepaidUsage() != null) {
            _hashCode += getPrepaidUsage().hashCode();
        }
        if (getPostpaidUsage() != null) {
            _hashCode += getPostpaidUsage().hashCode();
        }
        if (getPayMode() != null) {
            _hashCode += getPayMode().hashCode();
        }
        if (getRoamType() != null) {
            _hashCode += getRoamType().hashCode();
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        if (getPreDiscount() != null) {
            _hashCode += getPreDiscount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getQosIndicator() != null) {
            _hashCode += getQosIndicator().hashCode();
        }
        if (getAtc() != null) {
            _hashCode += getAtc().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getDuraction() != null) {
            _hashCode += getDuraction().hashCode();
        }
        if (getRefundFlag() != null) {
            _hashCode += getRefundFlag().hashCode();
        }
        if (getRefundSessionId() != null) {
            _hashCode += getRefundSessionId().hashCode();
        }
        if (getAccessPoint() != null) {
            _hashCode += getAccessPoint().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getAcctID() != null) {
            _hashCode += getAcctID().hashCode();
        }
        if (getPayAccID() != null) {
            _hashCode += getPayAccID().hashCode();
        }
        if (getDeductTime() != null) {
            _hashCode += getDeductTime().hashCode();
        }
        if (getReguideCharge() != null) {
            _hashCode += getReguideCharge().hashCode();
        }
        if (getCdrType() != null) {
            _hashCode += getCdrType().hashCode();
        }
        if (getFreeResFlag() != null) {
            _hashCode += getFreeResFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeOfEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peakOffpeak");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peakOffpeak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calledNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addedService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaidUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postpaidUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roamType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preDiscount"));
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
        elemField.setFieldName("qosIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duraction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAccID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAccID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdrType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResFlag"));
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
