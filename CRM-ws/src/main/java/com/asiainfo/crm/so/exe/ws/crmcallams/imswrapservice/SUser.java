/**
 * SUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SUser  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.Short countyCode;

    private java.lang.Short regionCode;

    private java.lang.String phoneId;

    private java.lang.String company;

    private java.lang.String password;

    private java.lang.String imsi;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.String outer_billableAcctId;

    private java.lang.Long billableAcctId;

    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private java.lang.Short userType;

    private java.lang.Short userSegment;

    private java.lang.Short payment_mode;

    private java.lang.Short brand;

    private java.lang.Integer mainPromotion;

    private java.lang.Double credit;

    private java.lang.Integer measureId;

    private java.lang.Double budget;

    private java.lang.Short status;

    private java.lang.String osStatus;

    private java.lang.String createDate;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.String deviceType;

    private java.lang.String iMEI;

    private java.lang.String mNPHomeArea;

    private java.lang.Short smsLanguage;

    private java.lang.Short ivrLanguage;

    private java.lang.Short ussdLanguage;

    private java.lang.Short emailLanguage;

    private java.lang.String activeDate;

    private java.lang.Short titleRoleId;

    private java.lang.Short isTestNumber;

    private java.lang.String attrUserEmail;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] listExtParam;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUserLifecycle sUserLifeCycle;

    private java.lang.String serialNo;

    private java.lang.Short flhFlag;

    private java.lang.Short continueFlag;

    private java.util.Calendar suspendStopDate;

    private java.util.Calendar disableStopDate;

    private java.util.Calendar activeStopDate;

    private java.lang.String lastActiveDate;

    private java.lang.Short nextSeg;

    private java.lang.String segValidDate;

    private java.lang.String segExpireDate;

    public SUser() {
    }

    public SUser(
           java.lang.Long userId,
           java.lang.Short countyCode,
           java.lang.Short regionCode,
           java.lang.String phoneId,
           java.lang.String company,
           java.lang.String password,
           java.lang.String imsi,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.String outer_billableAcctId,
           java.lang.Long billableAcctId,
           java.lang.String outerCustId,
           java.lang.Long custId,
           java.lang.Short userType,
           java.lang.Short userSegment,
           java.lang.Short payment_mode,
           java.lang.Short brand,
           java.lang.Integer mainPromotion,
           java.lang.Double credit,
           java.lang.Integer measureId,
           java.lang.Double budget,
           java.lang.Short status,
           java.lang.String osStatus,
           java.lang.String createDate,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.String deviceType,
           java.lang.String iMEI,
           java.lang.String mNPHomeArea,
           java.lang.Short smsLanguage,
           java.lang.Short ivrLanguage,
           java.lang.Short ussdLanguage,
           java.lang.Short emailLanguage,
           java.lang.String activeDate,
           java.lang.Short titleRoleId,
           java.lang.Short isTestNumber,
           java.lang.String attrUserEmail,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] listExtParam,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUserLifecycle sUserLifeCycle,
           java.lang.String serialNo,
           java.lang.Short flhFlag,
           java.lang.Short continueFlag,
           java.util.Calendar suspendStopDate,
           java.util.Calendar disableStopDate,
           java.util.Calendar activeStopDate,
           java.lang.String lastActiveDate,
           java.lang.Short nextSeg,
           java.lang.String segValidDate,
           java.lang.String segExpireDate) {
           this.userId = userId;
           this.countyCode = countyCode;
           this.regionCode = regionCode;
           this.phoneId = phoneId;
           this.company = company;
           this.password = password;
           this.imsi = imsi;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.outer_billableAcctId = outer_billableAcctId;
           this.billableAcctId = billableAcctId;
           this.outerCustId = outerCustId;
           this.custId = custId;
           this.userType = userType;
           this.userSegment = userSegment;
           this.payment_mode = payment_mode;
           this.brand = brand;
           this.mainPromotion = mainPromotion;
           this.credit = credit;
           this.measureId = measureId;
           this.budget = budget;
           this.status = status;
           this.osStatus = osStatus;
           this.createDate = createDate;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.deviceType = deviceType;
           this.iMEI = iMEI;
           this.mNPHomeArea = mNPHomeArea;
           this.smsLanguage = smsLanguage;
           this.ivrLanguage = ivrLanguage;
           this.ussdLanguage = ussdLanguage;
           this.emailLanguage = emailLanguage;
           this.activeDate = activeDate;
           this.titleRoleId = titleRoleId;
           this.isTestNumber = isTestNumber;
           this.attrUserEmail = attrUserEmail;
           this.listExtParam = listExtParam;
           this.sUserLifeCycle = sUserLifeCycle;
           this.serialNo = serialNo;
           this.flhFlag = flhFlag;
           this.continueFlag = continueFlag;
           this.suspendStopDate = suspendStopDate;
           this.disableStopDate = disableStopDate;
           this.activeStopDate = activeStopDate;
           this.lastActiveDate = lastActiveDate;
           this.nextSeg = nextSeg;
           this.segValidDate = segValidDate;
           this.segExpireDate = segExpireDate;
    }


    /**
     * Gets the userId value for this SUser.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SUser.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the countyCode value for this SUser.
     * 
     * @return countyCode
     */
    public java.lang.Short getCountyCode() {
        return countyCode;
    }


    /**
     * Sets the countyCode value for this SUser.
     * 
     * @param countyCode
     */
    public void setCountyCode(java.lang.Short countyCode) {
        this.countyCode = countyCode;
    }


    /**
     * Gets the regionCode value for this SUser.
     * 
     * @return regionCode
     */
    public java.lang.Short getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this SUser.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.Short regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the phoneId value for this SUser.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SUser.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the company value for this SUser.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SUser.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the password value for this SUser.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SUser.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the imsi value for this SUser.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this SUser.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the outerAcctId value for this SUser.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SUser.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SUser.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SUser.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outer_billableAcctId value for this SUser.
     * 
     * @return outer_billableAcctId
     */
    public java.lang.String getOuter_billableAcctId() {
        return outer_billableAcctId;
    }


    /**
     * Sets the outer_billableAcctId value for this SUser.
     * 
     * @param outer_billableAcctId
     */
    public void setOuter_billableAcctId(java.lang.String outer_billableAcctId) {
        this.outer_billableAcctId = outer_billableAcctId;
    }


    /**
     * Gets the billableAcctId value for this SUser.
     * 
     * @return billableAcctId
     */
    public java.lang.Long getBillableAcctId() {
        return billableAcctId;
    }


    /**
     * Sets the billableAcctId value for this SUser.
     * 
     * @param billableAcctId
     */
    public void setBillableAcctId(java.lang.Long billableAcctId) {
        this.billableAcctId = billableAcctId;
    }


    /**
     * Gets the outerCustId value for this SUser.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this SUser.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this SUser.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this SUser.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the userType value for this SUser.
     * 
     * @return userType
     */
    public java.lang.Short getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this SUser.
     * 
     * @param userType
     */
    public void setUserType(java.lang.Short userType) {
        this.userType = userType;
    }


    /**
     * Gets the userSegment value for this SUser.
     * 
     * @return userSegment
     */
    public java.lang.Short getUserSegment() {
        return userSegment;
    }


    /**
     * Sets the userSegment value for this SUser.
     * 
     * @param userSegment
     */
    public void setUserSegment(java.lang.Short userSegment) {
        this.userSegment = userSegment;
    }


    /**
     * Gets the payment_mode value for this SUser.
     * 
     * @return payment_mode
     */
    public java.lang.Short getPayment_mode() {
        return payment_mode;
    }


    /**
     * Sets the payment_mode value for this SUser.
     * 
     * @param payment_mode
     */
    public void setPayment_mode(java.lang.Short payment_mode) {
        this.payment_mode = payment_mode;
    }


    /**
     * Gets the brand value for this SUser.
     * 
     * @return brand
     */
    public java.lang.Short getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this SUser.
     * 
     * @param brand
     */
    public void setBrand(java.lang.Short brand) {
        this.brand = brand;
    }


    /**
     * Gets the mainPromotion value for this SUser.
     * 
     * @return mainPromotion
     */
    public java.lang.Integer getMainPromotion() {
        return mainPromotion;
    }


    /**
     * Sets the mainPromotion value for this SUser.
     * 
     * @param mainPromotion
     */
    public void setMainPromotion(java.lang.Integer mainPromotion) {
        this.mainPromotion = mainPromotion;
    }


    /**
     * Gets the credit value for this SUser.
     * 
     * @return credit
     */
    public java.lang.Double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this SUser.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Double credit) {
        this.credit = credit;
    }


    /**
     * Gets the measureId value for this SUser.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SUser.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the budget value for this SUser.
     * 
     * @return budget
     */
    public java.lang.Double getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this SUser.
     * 
     * @param budget
     */
    public void setBudget(java.lang.Double budget) {
        this.budget = budget;
    }


    /**
     * Gets the status value for this SUser.
     * 
     * @return status
     */
    public java.lang.Short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SUser.
     * 
     * @param status
     */
    public void setStatus(java.lang.Short status) {
        this.status = status;
    }


    /**
     * Gets the osStatus value for this SUser.
     * 
     * @return osStatus
     */
    public java.lang.String getOsStatus() {
        return osStatus;
    }


    /**
     * Sets the osStatus value for this SUser.
     * 
     * @param osStatus
     */
    public void setOsStatus(java.lang.String osStatus) {
        this.osStatus = osStatus;
    }


    /**
     * Gets the createDate value for this SUser.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SUser.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the validDate value for this SUser.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SUser.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SUser.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SUser.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the deviceType value for this SUser.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this SUser.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the iMEI value for this SUser.
     * 
     * @return iMEI
     */
    public java.lang.String getIMEI() {
        return iMEI;
    }


    /**
     * Sets the iMEI value for this SUser.
     * 
     * @param iMEI
     */
    public void setIMEI(java.lang.String iMEI) {
        this.iMEI = iMEI;
    }


    /**
     * Gets the mNPHomeArea value for this SUser.
     * 
     * @return mNPHomeArea
     */
    public java.lang.String getMNPHomeArea() {
        return mNPHomeArea;
    }


    /**
     * Sets the mNPHomeArea value for this SUser.
     * 
     * @param mNPHomeArea
     */
    public void setMNPHomeArea(java.lang.String mNPHomeArea) {
        this.mNPHomeArea = mNPHomeArea;
    }


    /**
     * Gets the smsLanguage value for this SUser.
     * 
     * @return smsLanguage
     */
    public java.lang.Short getSmsLanguage() {
        return smsLanguage;
    }


    /**
     * Sets the smsLanguage value for this SUser.
     * 
     * @param smsLanguage
     */
    public void setSmsLanguage(java.lang.Short smsLanguage) {
        this.smsLanguage = smsLanguage;
    }


    /**
     * Gets the ivrLanguage value for this SUser.
     * 
     * @return ivrLanguage
     */
    public java.lang.Short getIvrLanguage() {
        return ivrLanguage;
    }


    /**
     * Sets the ivrLanguage value for this SUser.
     * 
     * @param ivrLanguage
     */
    public void setIvrLanguage(java.lang.Short ivrLanguage) {
        this.ivrLanguage = ivrLanguage;
    }


    /**
     * Gets the ussdLanguage value for this SUser.
     * 
     * @return ussdLanguage
     */
    public java.lang.Short getUssdLanguage() {
        return ussdLanguage;
    }


    /**
     * Sets the ussdLanguage value for this SUser.
     * 
     * @param ussdLanguage
     */
    public void setUssdLanguage(java.lang.Short ussdLanguage) {
        this.ussdLanguage = ussdLanguage;
    }


    /**
     * Gets the emailLanguage value for this SUser.
     * 
     * @return emailLanguage
     */
    public java.lang.Short getEmailLanguage() {
        return emailLanguage;
    }


    /**
     * Sets the emailLanguage value for this SUser.
     * 
     * @param emailLanguage
     */
    public void setEmailLanguage(java.lang.Short emailLanguage) {
        this.emailLanguage = emailLanguage;
    }


    /**
     * Gets the activeDate value for this SUser.
     * 
     * @return activeDate
     */
    public java.lang.String getActiveDate() {
        return activeDate;
    }


    /**
     * Sets the activeDate value for this SUser.
     * 
     * @param activeDate
     */
    public void setActiveDate(java.lang.String activeDate) {
        this.activeDate = activeDate;
    }


    /**
     * Gets the titleRoleId value for this SUser.
     * 
     * @return titleRoleId
     */
    public java.lang.Short getTitleRoleId() {
        return titleRoleId;
    }


    /**
     * Sets the titleRoleId value for this SUser.
     * 
     * @param titleRoleId
     */
    public void setTitleRoleId(java.lang.Short titleRoleId) {
        this.titleRoleId = titleRoleId;
    }


    /**
     * Gets the isTestNumber value for this SUser.
     * 
     * @return isTestNumber
     */
    public java.lang.Short getIsTestNumber() {
        return isTestNumber;
    }


    /**
     * Sets the isTestNumber value for this SUser.
     * 
     * @param isTestNumber
     */
    public void setIsTestNumber(java.lang.Short isTestNumber) {
        this.isTestNumber = isTestNumber;
    }


    /**
     * Gets the attrUserEmail value for this SUser.
     * 
     * @return attrUserEmail
     */
    public java.lang.String getAttrUserEmail() {
        return attrUserEmail;
    }


    /**
     * Sets the attrUserEmail value for this SUser.
     * 
     * @param attrUserEmail
     */
    public void setAttrUserEmail(java.lang.String attrUserEmail) {
        this.attrUserEmail = attrUserEmail;
    }


    /**
     * Gets the listExtParam value for this SUser.
     * 
     * @return listExtParam
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] getListExtParam() {
        return listExtParam;
    }


    /**
     * Sets the listExtParam value for this SUser.
     * 
     * @param listExtParam
     */
    public void setListExtParam(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] listExtParam) {
        this.listExtParam = listExtParam;
    }


    /**
     * Gets the sUserLifeCycle value for this SUser.
     * 
     * @return sUserLifeCycle
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUserLifecycle getSUserLifeCycle() {
        return sUserLifeCycle;
    }


    /**
     * Sets the sUserLifeCycle value for this SUser.
     * 
     * @param sUserLifeCycle
     */
    public void setSUserLifeCycle(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUserLifecycle sUserLifeCycle) {
        this.sUserLifeCycle = sUserLifeCycle;
    }


    /**
     * Gets the serialNo value for this SUser.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this SUser.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the flhFlag value for this SUser.
     * 
     * @return flhFlag
     */
    public java.lang.Short getFlhFlag() {
        return flhFlag;
    }


    /**
     * Sets the flhFlag value for this SUser.
     * 
     * @param flhFlag
     */
    public void setFlhFlag(java.lang.Short flhFlag) {
        this.flhFlag = flhFlag;
    }


    /**
     * Gets the continueFlag value for this SUser.
     * 
     * @return continueFlag
     */
    public java.lang.Short getContinueFlag() {
        return continueFlag;
    }


    /**
     * Sets the continueFlag value for this SUser.
     * 
     * @param continueFlag
     */
    public void setContinueFlag(java.lang.Short continueFlag) {
        this.continueFlag = continueFlag;
    }


    /**
     * Gets the suspendStopDate value for this SUser.
     * 
     * @return suspendStopDate
     */
    public java.util.Calendar getSuspendStopDate() {
        return suspendStopDate;
    }


    /**
     * Sets the suspendStopDate value for this SUser.
     * 
     * @param suspendStopDate
     */
    public void setSuspendStopDate(java.util.Calendar suspendStopDate) {
        this.suspendStopDate = suspendStopDate;
    }


    /**
     * Gets the disableStopDate value for this SUser.
     * 
     * @return disableStopDate
     */
    public java.util.Calendar getDisableStopDate() {
        return disableStopDate;
    }


    /**
     * Sets the disableStopDate value for this SUser.
     * 
     * @param disableStopDate
     */
    public void setDisableStopDate(java.util.Calendar disableStopDate) {
        this.disableStopDate = disableStopDate;
    }


    /**
     * Gets the activeStopDate value for this SUser.
     * 
     * @return activeStopDate
     */
    public java.util.Calendar getActiveStopDate() {
        return activeStopDate;
    }


    /**
     * Sets the activeStopDate value for this SUser.
     * 
     * @param activeStopDate
     */
    public void setActiveStopDate(java.util.Calendar activeStopDate) {
        this.activeStopDate = activeStopDate;
    }


    /**
     * Gets the lastActiveDate value for this SUser.
     * 
     * @return lastActiveDate
     */
    public java.lang.String getLastActiveDate() {
        return lastActiveDate;
    }


    /**
     * Sets the lastActiveDate value for this SUser.
     * 
     * @param lastActiveDate
     */
    public void setLastActiveDate(java.lang.String lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }


    /**
     * Gets the nextSeg value for this SUser.
     * 
     * @return nextSeg
     */
    public java.lang.Short getNextSeg() {
        return nextSeg;
    }


    /**
     * Sets the nextSeg value for this SUser.
     * 
     * @param nextSeg
     */
    public void setNextSeg(java.lang.Short nextSeg) {
        this.nextSeg = nextSeg;
    }


    /**
     * Gets the segValidDate value for this SUser.
     * 
     * @return segValidDate
     */
    public java.lang.String getSegValidDate() {
        return segValidDate;
    }


    /**
     * Sets the segValidDate value for this SUser.
     * 
     * @param segValidDate
     */
    public void setSegValidDate(java.lang.String segValidDate) {
        this.segValidDate = segValidDate;
    }


    /**
     * Gets the segExpireDate value for this SUser.
     * 
     * @return segExpireDate
     */
    public java.lang.String getSegExpireDate() {
        return segExpireDate;
    }


    /**
     * Sets the segExpireDate value for this SUser.
     * 
     * @param segExpireDate
     */
    public void setSegExpireDate(java.lang.String segExpireDate) {
        this.segExpireDate = segExpireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUser)) return false;
        SUser other = (SUser) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.countyCode==null && other.getCountyCode()==null) || 
             (this.countyCode!=null &&
              this.countyCode.equals(other.getCountyCode()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outer_billableAcctId==null && other.getOuter_billableAcctId()==null) || 
             (this.outer_billableAcctId!=null &&
              this.outer_billableAcctId.equals(other.getOuter_billableAcctId()))) &&
            ((this.billableAcctId==null && other.getBillableAcctId()==null) || 
             (this.billableAcctId!=null &&
              this.billableAcctId.equals(other.getBillableAcctId()))) &&
            ((this.outerCustId==null && other.getOuterCustId()==null) || 
             (this.outerCustId!=null &&
              this.outerCustId.equals(other.getOuterCustId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.userSegment==null && other.getUserSegment()==null) || 
             (this.userSegment!=null &&
              this.userSegment.equals(other.getUserSegment()))) &&
            ((this.payment_mode==null && other.getPayment_mode()==null) || 
             (this.payment_mode!=null &&
              this.payment_mode.equals(other.getPayment_mode()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.mainPromotion==null && other.getMainPromotion()==null) || 
             (this.mainPromotion!=null &&
              this.mainPromotion.equals(other.getMainPromotion()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.osStatus==null && other.getOsStatus()==null) || 
             (this.osStatus!=null &&
              this.osStatus.equals(other.getOsStatus()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.iMEI==null && other.getIMEI()==null) || 
             (this.iMEI!=null &&
              this.iMEI.equals(other.getIMEI()))) &&
            ((this.mNPHomeArea==null && other.getMNPHomeArea()==null) || 
             (this.mNPHomeArea!=null &&
              this.mNPHomeArea.equals(other.getMNPHomeArea()))) &&
            ((this.smsLanguage==null && other.getSmsLanguage()==null) || 
             (this.smsLanguage!=null &&
              this.smsLanguage.equals(other.getSmsLanguage()))) &&
            ((this.ivrLanguage==null && other.getIvrLanguage()==null) || 
             (this.ivrLanguage!=null &&
              this.ivrLanguage.equals(other.getIvrLanguage()))) &&
            ((this.ussdLanguage==null && other.getUssdLanguage()==null) || 
             (this.ussdLanguage!=null &&
              this.ussdLanguage.equals(other.getUssdLanguage()))) &&
            ((this.emailLanguage==null && other.getEmailLanguage()==null) || 
             (this.emailLanguage!=null &&
              this.emailLanguage.equals(other.getEmailLanguage()))) &&
            ((this.activeDate==null && other.getActiveDate()==null) || 
             (this.activeDate!=null &&
              this.activeDate.equals(other.getActiveDate()))) &&
            ((this.titleRoleId==null && other.getTitleRoleId()==null) || 
             (this.titleRoleId!=null &&
              this.titleRoleId.equals(other.getTitleRoleId()))) &&
            ((this.isTestNumber==null && other.getIsTestNumber()==null) || 
             (this.isTestNumber!=null &&
              this.isTestNumber.equals(other.getIsTestNumber()))) &&
            ((this.attrUserEmail==null && other.getAttrUserEmail()==null) || 
             (this.attrUserEmail!=null &&
              this.attrUserEmail.equals(other.getAttrUserEmail()))) &&
            ((this.listExtParam==null && other.getListExtParam()==null) || 
             (this.listExtParam!=null &&
              java.util.Arrays.equals(this.listExtParam, other.getListExtParam()))) &&
            ((this.sUserLifeCycle==null && other.getSUserLifeCycle()==null) || 
             (this.sUserLifeCycle!=null &&
              this.sUserLifeCycle.equals(other.getSUserLifeCycle()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.flhFlag==null && other.getFlhFlag()==null) || 
             (this.flhFlag!=null &&
              this.flhFlag.equals(other.getFlhFlag()))) &&
            ((this.continueFlag==null && other.getContinueFlag()==null) || 
             (this.continueFlag!=null &&
              this.continueFlag.equals(other.getContinueFlag()))) &&
            ((this.suspendStopDate==null && other.getSuspendStopDate()==null) || 
             (this.suspendStopDate!=null &&
              this.suspendStopDate.equals(other.getSuspendStopDate()))) &&
            ((this.disableStopDate==null && other.getDisableStopDate()==null) || 
             (this.disableStopDate!=null &&
              this.disableStopDate.equals(other.getDisableStopDate()))) &&
            ((this.activeStopDate==null && other.getActiveStopDate()==null) || 
             (this.activeStopDate!=null &&
              this.activeStopDate.equals(other.getActiveStopDate()))) &&
            ((this.lastActiveDate==null && other.getLastActiveDate()==null) || 
             (this.lastActiveDate!=null &&
              this.lastActiveDate.equals(other.getLastActiveDate()))) &&
            ((this.nextSeg==null && other.getNextSeg()==null) || 
             (this.nextSeg!=null &&
              this.nextSeg.equals(other.getNextSeg()))) &&
            ((this.segValidDate==null && other.getSegValidDate()==null) || 
             (this.segValidDate!=null &&
              this.segValidDate.equals(other.getSegValidDate()))) &&
            ((this.segExpireDate==null && other.getSegExpireDate()==null) || 
             (this.segExpireDate!=null &&
              this.segExpireDate.equals(other.getSegExpireDate())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuter_billableAcctId() != null) {
            _hashCode += getOuter_billableAcctId().hashCode();
        }
        if (getBillableAcctId() != null) {
            _hashCode += getBillableAcctId().hashCode();
        }
        if (getOuterCustId() != null) {
            _hashCode += getOuterCustId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUserSegment() != null) {
            _hashCode += getUserSegment().hashCode();
        }
        if (getPayment_mode() != null) {
            _hashCode += getPayment_mode().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getMainPromotion() != null) {
            _hashCode += getMainPromotion().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOsStatus() != null) {
            _hashCode += getOsStatus().hashCode();
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
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getMNPHomeArea() != null) {
            _hashCode += getMNPHomeArea().hashCode();
        }
        if (getSmsLanguage() != null) {
            _hashCode += getSmsLanguage().hashCode();
        }
        if (getIvrLanguage() != null) {
            _hashCode += getIvrLanguage().hashCode();
        }
        if (getUssdLanguage() != null) {
            _hashCode += getUssdLanguage().hashCode();
        }
        if (getEmailLanguage() != null) {
            _hashCode += getEmailLanguage().hashCode();
        }
        if (getActiveDate() != null) {
            _hashCode += getActiveDate().hashCode();
        }
        if (getTitleRoleId() != null) {
            _hashCode += getTitleRoleId().hashCode();
        }
        if (getIsTestNumber() != null) {
            _hashCode += getIsTestNumber().hashCode();
        }
        if (getAttrUserEmail() != null) {
            _hashCode += getAttrUserEmail().hashCode();
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
        if (getSUserLifeCycle() != null) {
            _hashCode += getSUserLifeCycle().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getFlhFlag() != null) {
            _hashCode += getFlhFlag().hashCode();
        }
        if (getContinueFlag() != null) {
            _hashCode += getContinueFlag().hashCode();
        }
        if (getSuspendStopDate() != null) {
            _hashCode += getSuspendStopDate().hashCode();
        }
        if (getDisableStopDate() != null) {
            _hashCode += getDisableStopDate().hashCode();
        }
        if (getActiveStopDate() != null) {
            _hashCode += getActiveStopDate().hashCode();
        }
        if (getLastActiveDate() != null) {
            _hashCode += getLastActiveDate().hashCode();
        }
        if (getNextSeg() != null) {
            _hashCode += getNextSeg().hashCode();
        }
        if (getSegValidDate() != null) {
            _hashCode += getSegValidDate().hashCode();
        }
        if (getSegExpireDate() != null) {
            _hashCode += getSegExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyCode"));
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
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imsi"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_billableAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_billableAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billableAcctId"));
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
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainPromotion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainPromotion"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MNPHomeArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mNPHomeArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivrLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivrLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussdLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ussdLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titleRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrUserEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attrUserEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("SUserLifeCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sUserLifeCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserLifecycle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flhFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flhFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continueFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "continueFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspendStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeStopDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeStopDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastActiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextSeg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextSeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segExpireDate"));
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
