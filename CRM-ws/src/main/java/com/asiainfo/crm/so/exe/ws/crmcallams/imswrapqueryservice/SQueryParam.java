/**
 * SQueryParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryParam  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Long productId;

    private java.lang.String invoiceNo;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Integer ownerType;

    private java.lang.Long newMainPromotion;

    private java.lang.Long busiSpecId;

    private java.lang.String channel;

    private java.lang.Long queryLevel;

    private java.lang.Integer cycleFlag;

    private java.lang.Short realType;

    private java.lang.Short retType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryHisBillInfoReq sQueryHisBillInfoReq;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryBudgetReq sQueryBudgetReq;

    private java.lang.Long dtlNo;

    private java.lang.Short queryBillType;

    public SQueryParam() {
    }

    public SQueryParam(
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Long productId,
           java.lang.String invoiceNo,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Integer ownerType,
           java.lang.Long newMainPromotion,
           java.lang.Long busiSpecId,
           java.lang.String channel,
           java.lang.Long queryLevel,
           java.lang.Integer cycleFlag,
           java.lang.Short realType,
           java.lang.Short retType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryHisBillInfoReq sQueryHisBillInfoReq,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryBudgetReq sQueryBudgetReq,
           java.lang.Long dtlNo,
           java.lang.Short queryBillType) {
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.productId = productId;
           this.invoiceNo = invoiceNo;
           this.startDate = startDate;
           this.endDate = endDate;
           this.ownerType = ownerType;
           this.newMainPromotion = newMainPromotion;
           this.busiSpecId = busiSpecId;
           this.channel = channel;
           this.queryLevel = queryLevel;
           this.cycleFlag = cycleFlag;
           this.realType = realType;
           this.retType = retType;
           this.sQueryHisBillInfoReq = sQueryHisBillInfoReq;
           this.sQueryBudgetReq = sQueryBudgetReq;
           this.dtlNo = dtlNo;
           this.queryBillType = queryBillType;
    }


    /**
     * Gets the outerAcctId value for this SQueryParam.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SQueryParam.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SQueryParam.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryParam.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this SQueryParam.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SQueryParam.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SQueryParam.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQueryParam.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the productId value for this SQueryParam.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SQueryParam.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the invoiceNo value for this SQueryParam.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this SQueryParam.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the startDate value for this SQueryParam.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryParam.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryParam.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryParam.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the ownerType value for this SQueryParam.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this SQueryParam.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the newMainPromotion value for this SQueryParam.
     * 
     * @return newMainPromotion
     */
    public java.lang.Long getNewMainPromotion() {
        return newMainPromotion;
    }


    /**
     * Sets the newMainPromotion value for this SQueryParam.
     * 
     * @param newMainPromotion
     */
    public void setNewMainPromotion(java.lang.Long newMainPromotion) {
        this.newMainPromotion = newMainPromotion;
    }


    /**
     * Gets the busiSpecId value for this SQueryParam.
     * 
     * @return busiSpecId
     */
    public java.lang.Long getBusiSpecId() {
        return busiSpecId;
    }


    /**
     * Sets the busiSpecId value for this SQueryParam.
     * 
     * @param busiSpecId
     */
    public void setBusiSpecId(java.lang.Long busiSpecId) {
        this.busiSpecId = busiSpecId;
    }


    /**
     * Gets the channel value for this SQueryParam.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this SQueryParam.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the queryLevel value for this SQueryParam.
     * 
     * @return queryLevel
     */
    public java.lang.Long getQueryLevel() {
        return queryLevel;
    }


    /**
     * Sets the queryLevel value for this SQueryParam.
     * 
     * @param queryLevel
     */
    public void setQueryLevel(java.lang.Long queryLevel) {
        this.queryLevel = queryLevel;
    }


    /**
     * Gets the cycleFlag value for this SQueryParam.
     * 
     * @return cycleFlag
     */
    public java.lang.Integer getCycleFlag() {
        return cycleFlag;
    }


    /**
     * Sets the cycleFlag value for this SQueryParam.
     * 
     * @param cycleFlag
     */
    public void setCycleFlag(java.lang.Integer cycleFlag) {
        this.cycleFlag = cycleFlag;
    }


    /**
     * Gets the realType value for this SQueryParam.
     * 
     * @return realType
     */
    public java.lang.Short getRealType() {
        return realType;
    }


    /**
     * Sets the realType value for this SQueryParam.
     * 
     * @param realType
     */
    public void setRealType(java.lang.Short realType) {
        this.realType = realType;
    }


    /**
     * Gets the retType value for this SQueryParam.
     * 
     * @return retType
     */
    public java.lang.Short getRetType() {
        return retType;
    }


    /**
     * Sets the retType value for this SQueryParam.
     * 
     * @param retType
     */
    public void setRetType(java.lang.Short retType) {
        this.retType = retType;
    }


    /**
     * Gets the sQueryHisBillInfoReq value for this SQueryParam.
     * 
     * @return sQueryHisBillInfoReq
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryHisBillInfoReq getSQueryHisBillInfoReq() {
        return sQueryHisBillInfoReq;
    }


    /**
     * Sets the sQueryHisBillInfoReq value for this SQueryParam.
     * 
     * @param sQueryHisBillInfoReq
     */
    public void setSQueryHisBillInfoReq(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryHisBillInfoReq sQueryHisBillInfoReq) {
        this.sQueryHisBillInfoReq = sQueryHisBillInfoReq;
    }


    /**
     * Gets the sQueryBudgetReq value for this SQueryParam.
     * 
     * @return sQueryBudgetReq
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryBudgetReq getSQueryBudgetReq() {
        return sQueryBudgetReq;
    }


    /**
     * Sets the sQueryBudgetReq value for this SQueryParam.
     * 
     * @param sQueryBudgetReq
     */
    public void setSQueryBudgetReq(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryBudgetReq sQueryBudgetReq) {
        this.sQueryBudgetReq = sQueryBudgetReq;
    }


    /**
     * Gets the dtlNo value for this SQueryParam.
     * 
     * @return dtlNo
     */
    public java.lang.Long getDtlNo() {
        return dtlNo;
    }


    /**
     * Sets the dtlNo value for this SQueryParam.
     * 
     * @param dtlNo
     */
    public void setDtlNo(java.lang.Long dtlNo) {
        this.dtlNo = dtlNo;
    }


    /**
     * Gets the queryBillType value for this SQueryParam.
     * 
     * @return queryBillType
     */
    public java.lang.Short getQueryBillType() {
        return queryBillType;
    }


    /**
     * Sets the queryBillType value for this SQueryParam.
     * 
     * @param queryBillType
     */
    public void setQueryBillType(java.lang.Short queryBillType) {
        this.queryBillType = queryBillType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryParam)) return false;
        SQueryParam other = (SQueryParam) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.newMainPromotion==null && other.getNewMainPromotion()==null) || 
             (this.newMainPromotion!=null &&
              this.newMainPromotion.equals(other.getNewMainPromotion()))) &&
            ((this.busiSpecId==null && other.getBusiSpecId()==null) || 
             (this.busiSpecId!=null &&
              this.busiSpecId.equals(other.getBusiSpecId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.queryLevel==null && other.getQueryLevel()==null) || 
             (this.queryLevel!=null &&
              this.queryLevel.equals(other.getQueryLevel()))) &&
            ((this.cycleFlag==null && other.getCycleFlag()==null) || 
             (this.cycleFlag!=null &&
              this.cycleFlag.equals(other.getCycleFlag()))) &&
            ((this.realType==null && other.getRealType()==null) || 
             (this.realType!=null &&
              this.realType.equals(other.getRealType()))) &&
            ((this.retType==null && other.getRetType()==null) || 
             (this.retType!=null &&
              this.retType.equals(other.getRetType()))) &&
            ((this.sQueryHisBillInfoReq==null && other.getSQueryHisBillInfoReq()==null) || 
             (this.sQueryHisBillInfoReq!=null &&
              this.sQueryHisBillInfoReq.equals(other.getSQueryHisBillInfoReq()))) &&
            ((this.sQueryBudgetReq==null && other.getSQueryBudgetReq()==null) || 
             (this.sQueryBudgetReq!=null &&
              this.sQueryBudgetReq.equals(other.getSQueryBudgetReq()))) &&
            ((this.dtlNo==null && other.getDtlNo()==null) || 
             (this.dtlNo!=null &&
              this.dtlNo.equals(other.getDtlNo()))) &&
            ((this.queryBillType==null && other.getQueryBillType()==null) || 
             (this.queryBillType!=null &&
              this.queryBillType.equals(other.getQueryBillType())));
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
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getNewMainPromotion() != null) {
            _hashCode += getNewMainPromotion().hashCode();
        }
        if (getBusiSpecId() != null) {
            _hashCode += getBusiSpecId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getQueryLevel() != null) {
            _hashCode += getQueryLevel().hashCode();
        }
        if (getCycleFlag() != null) {
            _hashCode += getCycleFlag().hashCode();
        }
        if (getRealType() != null) {
            _hashCode += getRealType().hashCode();
        }
        if (getRetType() != null) {
            _hashCode += getRetType().hashCode();
        }
        if (getSQueryHisBillInfoReq() != null) {
            _hashCode += getSQueryHisBillInfoReq().hashCode();
        }
        if (getSQueryBudgetReq() != null) {
            _hashCode += getSQueryBudgetReq().hashCode();
        }
        if (getDtlNo() != null) {
            _hashCode += getDtlNo().hashCode();
        }
        if (getQueryBillType() != null) {
            _hashCode += getQueryBillType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMainPromotion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newMainPromotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSpecId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQueryHisBillInfoReq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sQueryHisBillInfoReq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryHisBillInfoReq"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQueryBudgetReq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sQueryBudgetReq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryBudgetReq"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtlNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryBillType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryBillType"));
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
