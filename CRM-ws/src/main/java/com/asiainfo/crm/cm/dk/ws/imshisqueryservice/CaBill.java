/**
 * CaBill.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class CaBill  implements java.io.Serializable {
    private java.lang.Long billNo;

    private java.lang.Long resourceId;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.String outerDefaultAcctId;

    private java.lang.Long defaultAcctId;

    private java.lang.Long billFee;

    private java.lang.Long unpayFee;

    private java.lang.Long ppyFee;

    private java.lang.String billMonth;

    private java.lang.String createDate;

    private java.lang.String beginDate;

    private java.lang.String endDate;

    private java.lang.Integer sts;

    private java.lang.String stsDate;

    private java.lang.Integer billingType;

    private java.lang.Integer measureId;

    private java.lang.Short isReal;

    private java.lang.Integer regionCode;

    private java.lang.String dueDate;

    private java.lang.String invoiceNo;

    private com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillItem[] caBillItemList;

    public CaBill() {
    }

    public CaBill(
           java.lang.Long billNo,
           java.lang.Long resourceId,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.String outerDefaultAcctId,
           java.lang.Long defaultAcctId,
           java.lang.Long billFee,
           java.lang.Long unpayFee,
           java.lang.Long ppyFee,
           java.lang.String billMonth,
           java.lang.String createDate,
           java.lang.String beginDate,
           java.lang.String endDate,
           java.lang.Integer sts,
           java.lang.String stsDate,
           java.lang.Integer billingType,
           java.lang.Integer measureId,
           java.lang.Short isReal,
           java.lang.Integer regionCode,
           java.lang.String dueDate,
           java.lang.String invoiceNo,
           com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillItem[] caBillItemList) {
           this.billNo = billNo;
           this.resourceId = resourceId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.outerDefaultAcctId = outerDefaultAcctId;
           this.defaultAcctId = defaultAcctId;
           this.billFee = billFee;
           this.unpayFee = unpayFee;
           this.ppyFee = ppyFee;
           this.billMonth = billMonth;
           this.createDate = createDate;
           this.beginDate = beginDate;
           this.endDate = endDate;
           this.sts = sts;
           this.stsDate = stsDate;
           this.billingType = billingType;
           this.measureId = measureId;
           this.isReal = isReal;
           this.regionCode = regionCode;
           this.dueDate = dueDate;
           this.invoiceNo = invoiceNo;
           this.caBillItemList = caBillItemList;
    }


    /**
     * Gets the billNo value for this CaBill.
     * 
     * @return billNo
     */
    public java.lang.Long getBillNo() {
        return billNo;
    }


    /**
     * Sets the billNo value for this CaBill.
     * 
     * @param billNo
     */
    public void setBillNo(java.lang.Long billNo) {
        this.billNo = billNo;
    }


    /**
     * Gets the resourceId value for this CaBill.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this CaBill.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the outerAcctId value for this CaBill.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this CaBill.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this CaBill.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this CaBill.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerDefaultAcctId value for this CaBill.
     * 
     * @return outerDefaultAcctId
     */
    public java.lang.String getOuterDefaultAcctId() {
        return outerDefaultAcctId;
    }


    /**
     * Sets the outerDefaultAcctId value for this CaBill.
     * 
     * @param outerDefaultAcctId
     */
    public void setOuterDefaultAcctId(java.lang.String outerDefaultAcctId) {
        this.outerDefaultAcctId = outerDefaultAcctId;
    }


    /**
     * Gets the defaultAcctId value for this CaBill.
     * 
     * @return defaultAcctId
     */
    public java.lang.Long getDefaultAcctId() {
        return defaultAcctId;
    }


    /**
     * Sets the defaultAcctId value for this CaBill.
     * 
     * @param defaultAcctId
     */
    public void setDefaultAcctId(java.lang.Long defaultAcctId) {
        this.defaultAcctId = defaultAcctId;
    }


    /**
     * Gets the billFee value for this CaBill.
     * 
     * @return billFee
     */
    public java.lang.Long getBillFee() {
        return billFee;
    }


    /**
     * Sets the billFee value for this CaBill.
     * 
     * @param billFee
     */
    public void setBillFee(java.lang.Long billFee) {
        this.billFee = billFee;
    }


    /**
     * Gets the unpayFee value for this CaBill.
     * 
     * @return unpayFee
     */
    public java.lang.Long getUnpayFee() {
        return unpayFee;
    }


    /**
     * Sets the unpayFee value for this CaBill.
     * 
     * @param unpayFee
     */
    public void setUnpayFee(java.lang.Long unpayFee) {
        this.unpayFee = unpayFee;
    }


    /**
     * Gets the ppyFee value for this CaBill.
     * 
     * @return ppyFee
     */
    public java.lang.Long getPpyFee() {
        return ppyFee;
    }


    /**
     * Sets the ppyFee value for this CaBill.
     * 
     * @param ppyFee
     */
    public void setPpyFee(java.lang.Long ppyFee) {
        this.ppyFee = ppyFee;
    }


    /**
     * Gets the billMonth value for this CaBill.
     * 
     * @return billMonth
     */
    public java.lang.String getBillMonth() {
        return billMonth;
    }


    /**
     * Sets the billMonth value for this CaBill.
     * 
     * @param billMonth
     */
    public void setBillMonth(java.lang.String billMonth) {
        this.billMonth = billMonth;
    }


    /**
     * Gets the createDate value for this CaBill.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CaBill.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the beginDate value for this CaBill.
     * 
     * @return beginDate
     */
    public java.lang.String getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this CaBill.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.lang.String beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDate value for this CaBill.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CaBill.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the sts value for this CaBill.
     * 
     * @return sts
     */
    public java.lang.Integer getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this CaBill.
     * 
     * @param sts
     */
    public void setSts(java.lang.Integer sts) {
        this.sts = sts;
    }


    /**
     * Gets the stsDate value for this CaBill.
     * 
     * @return stsDate
     */
    public java.lang.String getStsDate() {
        return stsDate;
    }


    /**
     * Sets the stsDate value for this CaBill.
     * 
     * @param stsDate
     */
    public void setStsDate(java.lang.String stsDate) {
        this.stsDate = stsDate;
    }


    /**
     * Gets the billingType value for this CaBill.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this CaBill.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the measureId value for this CaBill.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this CaBill.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the isReal value for this CaBill.
     * 
     * @return isReal
     */
    public java.lang.Short getIsReal() {
        return isReal;
    }


    /**
     * Sets the isReal value for this CaBill.
     * 
     * @param isReal
     */
    public void setIsReal(java.lang.Short isReal) {
        this.isReal = isReal;
    }


    /**
     * Gets the regionCode value for this CaBill.
     * 
     * @return regionCode
     */
    public java.lang.Integer getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this CaBill.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.Integer regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the dueDate value for this CaBill.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CaBill.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the invoiceNo value for this CaBill.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this CaBill.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the caBillItemList value for this CaBill.
     * 
     * @return caBillItemList
     */
    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillItem[] getCaBillItemList() {
        return caBillItemList;
    }


    /**
     * Sets the caBillItemList value for this CaBill.
     * 
     * @param caBillItemList
     */
    public void setCaBillItemList(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillItem[] caBillItemList) {
        this.caBillItemList = caBillItemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaBill)) return false;
        CaBill other = (CaBill) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billNo==null && other.getBillNo()==null) || 
             (this.billNo!=null &&
              this.billNo.equals(other.getBillNo()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerDefaultAcctId==null && other.getOuterDefaultAcctId()==null) || 
             (this.outerDefaultAcctId!=null &&
              this.outerDefaultAcctId.equals(other.getOuterDefaultAcctId()))) &&
            ((this.defaultAcctId==null && other.getDefaultAcctId()==null) || 
             (this.defaultAcctId!=null &&
              this.defaultAcctId.equals(other.getDefaultAcctId()))) &&
            ((this.billFee==null && other.getBillFee()==null) || 
             (this.billFee!=null &&
              this.billFee.equals(other.getBillFee()))) &&
            ((this.unpayFee==null && other.getUnpayFee()==null) || 
             (this.unpayFee!=null &&
              this.unpayFee.equals(other.getUnpayFee()))) &&
            ((this.ppyFee==null && other.getPpyFee()==null) || 
             (this.ppyFee!=null &&
              this.ppyFee.equals(other.getPpyFee()))) &&
            ((this.billMonth==null && other.getBillMonth()==null) || 
             (this.billMonth!=null &&
              this.billMonth.equals(other.getBillMonth()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.stsDate==null && other.getStsDate()==null) || 
             (this.stsDate!=null &&
              this.stsDate.equals(other.getStsDate()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.isReal==null && other.getIsReal()==null) || 
             (this.isReal!=null &&
              this.isReal.equals(other.getIsReal()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.caBillItemList==null && other.getCaBillItemList()==null) || 
             (this.caBillItemList!=null &&
              java.util.Arrays.equals(this.caBillItemList, other.getCaBillItemList())));
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
        if (getBillNo() != null) {
            _hashCode += getBillNo().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterDefaultAcctId() != null) {
            _hashCode += getOuterDefaultAcctId().hashCode();
        }
        if (getDefaultAcctId() != null) {
            _hashCode += getDefaultAcctId().hashCode();
        }
        if (getBillFee() != null) {
            _hashCode += getBillFee().hashCode();
        }
        if (getUnpayFee() != null) {
            _hashCode += getUnpayFee().hashCode();
        }
        if (getPpyFee() != null) {
            _hashCode += getPpyFee().hashCode();
        }
        if (getBillMonth() != null) {
            _hashCode += getBillMonth().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getStsDate() != null) {
            _hashCode += getStsDate().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getIsReal() != null) {
            _hashCode += getIsReal().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getCaBillItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaBillItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaBillItemList(), i);
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
        new org.apache.axis.description.TypeDesc(CaBill.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBill"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
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
        elemField.setFieldName("outerDefaultAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerDefaultAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppyFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppyFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMonth"));
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
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginDate"));
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
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("isReal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isReal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
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
        elemField.setFieldName("caBillItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caBillItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "caBillItemListItem"));
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
