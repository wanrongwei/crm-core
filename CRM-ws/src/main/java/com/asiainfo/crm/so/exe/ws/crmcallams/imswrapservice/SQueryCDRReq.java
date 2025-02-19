/**
 * SQueryCDRReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SQueryCDRReq  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long userId;

    private java.lang.Short paymentMode;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Short domesticInternational;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryCDRType[] queryCDRTypeList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallUsageCondition callUsageCondition;

    private java.lang.Short sortBy;

    private java.lang.Integer headingStyle;

    private java.lang.String additionalInfo;

    private java.lang.String invoiceNo;

    private java.lang.Short offLineFlag;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ByUsageCondition byUsageCondition;

    private java.lang.Short languageId;

    private java.lang.Integer reqPage;

    private java.lang.Integer pageLimit;

    public SQueryCDRReq() {
    }

    public SQueryCDRReq(
           java.lang.String phoneId,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long userId,
           java.lang.Short paymentMode,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Short domesticInternational,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryCDRType[] queryCDRTypeList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallUsageCondition callUsageCondition,
           java.lang.Short sortBy,
           java.lang.Integer headingStyle,
           java.lang.String additionalInfo,
           java.lang.String invoiceNo,
           java.lang.Short offLineFlag,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ByUsageCondition byUsageCondition,
           java.lang.Short languageId,
           java.lang.Integer reqPage,
           java.lang.Integer pageLimit) {
           this.phoneId = phoneId;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.userId = userId;
           this.paymentMode = paymentMode;
           this.startDate = startDate;
           this.endDate = endDate;
           this.domesticInternational = domesticInternational;
           this.queryCDRTypeList = queryCDRTypeList;
           this.callUsageCondition = callUsageCondition;
           this.sortBy = sortBy;
           this.headingStyle = headingStyle;
           this.additionalInfo = additionalInfo;
           this.invoiceNo = invoiceNo;
           this.offLineFlag = offLineFlag;
           this.byUsageCondition = byUsageCondition;
           this.languageId = languageId;
           this.reqPage = reqPage;
           this.pageLimit = pageLimit;
    }


    /**
     * Gets the phoneId value for this SQueryCDRReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQueryCDRReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the acctId value for this SQueryCDRReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryCDRReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this SQueryCDRReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SQueryCDRReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the userId value for this SQueryCDRReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SQueryCDRReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the paymentMode value for this SQueryCDRReq.
     * 
     * @return paymentMode
     */
    public java.lang.Short getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this SQueryCDRReq.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.Short paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the startDate value for this SQueryCDRReq.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryCDRReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryCDRReq.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryCDRReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the domesticInternational value for this SQueryCDRReq.
     * 
     * @return domesticInternational
     */
    public java.lang.Short getDomesticInternational() {
        return domesticInternational;
    }


    /**
     * Sets the domesticInternational value for this SQueryCDRReq.
     * 
     * @param domesticInternational
     */
    public void setDomesticInternational(java.lang.Short domesticInternational) {
        this.domesticInternational = domesticInternational;
    }


    /**
     * Gets the queryCDRTypeList value for this SQueryCDRReq.
     * 
     * @return queryCDRTypeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryCDRType[] getQueryCDRTypeList() {
        return queryCDRTypeList;
    }


    /**
     * Sets the queryCDRTypeList value for this SQueryCDRReq.
     * 
     * @param queryCDRTypeList
     */
    public void setQueryCDRTypeList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryCDRType[] queryCDRTypeList) {
        this.queryCDRTypeList = queryCDRTypeList;
    }


    /**
     * Gets the callUsageCondition value for this SQueryCDRReq.
     * 
     * @return callUsageCondition
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallUsageCondition getCallUsageCondition() {
        return callUsageCondition;
    }


    /**
     * Sets the callUsageCondition value for this SQueryCDRReq.
     * 
     * @param callUsageCondition
     */
    public void setCallUsageCondition(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallUsageCondition callUsageCondition) {
        this.callUsageCondition = callUsageCondition;
    }


    /**
     * Gets the sortBy value for this SQueryCDRReq.
     * 
     * @return sortBy
     */
    public java.lang.Short getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this SQueryCDRReq.
     * 
     * @param sortBy
     */
    public void setSortBy(java.lang.Short sortBy) {
        this.sortBy = sortBy;
    }


    /**
     * Gets the headingStyle value for this SQueryCDRReq.
     * 
     * @return headingStyle
     */
    public java.lang.Integer getHeadingStyle() {
        return headingStyle;
    }


    /**
     * Sets the headingStyle value for this SQueryCDRReq.
     * 
     * @param headingStyle
     */
    public void setHeadingStyle(java.lang.Integer headingStyle) {
        this.headingStyle = headingStyle;
    }


    /**
     * Gets the additionalInfo value for this SQueryCDRReq.
     * 
     * @return additionalInfo
     */
    public java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this SQueryCDRReq.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the invoiceNo value for this SQueryCDRReq.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this SQueryCDRReq.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the offLineFlag value for this SQueryCDRReq.
     * 
     * @return offLineFlag
     */
    public java.lang.Short getOffLineFlag() {
        return offLineFlag;
    }


    /**
     * Sets the offLineFlag value for this SQueryCDRReq.
     * 
     * @param offLineFlag
     */
    public void setOffLineFlag(java.lang.Short offLineFlag) {
        this.offLineFlag = offLineFlag;
    }


    /**
     * Gets the byUsageCondition value for this SQueryCDRReq.
     * 
     * @return byUsageCondition
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ByUsageCondition getByUsageCondition() {
        return byUsageCondition;
    }


    /**
     * Sets the byUsageCondition value for this SQueryCDRReq.
     * 
     * @param byUsageCondition
     */
    public void setByUsageCondition(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ByUsageCondition byUsageCondition) {
        this.byUsageCondition = byUsageCondition;
    }


    /**
     * Gets the languageId value for this SQueryCDRReq.
     * 
     * @return languageId
     */
    public java.lang.Short getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this SQueryCDRReq.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.Short languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the reqPage value for this SQueryCDRReq.
     * 
     * @return reqPage
     */
    public java.lang.Integer getReqPage() {
        return reqPage;
    }


    /**
     * Sets the reqPage value for this SQueryCDRReq.
     * 
     * @param reqPage
     */
    public void setReqPage(java.lang.Integer reqPage) {
        this.reqPage = reqPage;
    }


    /**
     * Gets the pageLimit value for this SQueryCDRReq.
     * 
     * @return pageLimit
     */
    public java.lang.Integer getPageLimit() {
        return pageLimit;
    }


    /**
     * Sets the pageLimit value for this SQueryCDRReq.
     * 
     * @param pageLimit
     */
    public void setPageLimit(java.lang.Integer pageLimit) {
        this.pageLimit = pageLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryCDRReq)) return false;
        SQueryCDRReq other = (SQueryCDRReq) obj;
        
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
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.domesticInternational==null && other.getDomesticInternational()==null) || 
             (this.domesticInternational!=null &&
              this.domesticInternational.equals(other.getDomesticInternational()))) &&
            ((this.queryCDRTypeList==null && other.getQueryCDRTypeList()==null) || 
             (this.queryCDRTypeList!=null &&
              java.util.Arrays.equals(this.queryCDRTypeList, other.getQueryCDRTypeList()))) &&
            ((this.callUsageCondition==null && other.getCallUsageCondition()==null) || 
             (this.callUsageCondition!=null &&
              this.callUsageCondition.equals(other.getCallUsageCondition()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy()))) &&
            ((this.headingStyle==null && other.getHeadingStyle()==null) || 
             (this.headingStyle!=null &&
              this.headingStyle.equals(other.getHeadingStyle()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              this.additionalInfo.equals(other.getAdditionalInfo()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.offLineFlag==null && other.getOffLineFlag()==null) || 
             (this.offLineFlag!=null &&
              this.offLineFlag.equals(other.getOffLineFlag()))) &&
            ((this.byUsageCondition==null && other.getByUsageCondition()==null) || 
             (this.byUsageCondition!=null &&
              this.byUsageCondition.equals(other.getByUsageCondition()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.reqPage==null && other.getReqPage()==null) || 
             (this.reqPage!=null &&
              this.reqPage.equals(other.getReqPage()))) &&
            ((this.pageLimit==null && other.getPageLimit()==null) || 
             (this.pageLimit!=null &&
              this.pageLimit.equals(other.getPageLimit())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDomesticInternational() != null) {
            _hashCode += getDomesticInternational().hashCode();
        }
        if (getQueryCDRTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryCDRTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryCDRTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCallUsageCondition() != null) {
            _hashCode += getCallUsageCondition().hashCode();
        }
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
        }
        if (getHeadingStyle() != null) {
            _hashCode += getHeadingStyle().hashCode();
        }
        if (getAdditionalInfo() != null) {
            _hashCode += getAdditionalInfo().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getOffLineFlag() != null) {
            _hashCode += getOffLineFlag().hashCode();
        }
        if (getByUsageCondition() != null) {
            _hashCode += getByUsageCondition().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getReqPage() != null) {
            _hashCode += getReqPage().hashCode();
        }
        if (getPageLimit() != null) {
            _hashCode += getPageLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryCDRReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
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
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticInternational");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domesticInternational"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryCDRTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryCDRTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCDRType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "queryCDRTypeItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callUsageCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callUsageCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callUsageCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headingStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headingStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("offLineFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offLineFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byUsageCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byUsageCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "byUsageCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageLimit"));
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
