/**
 * SCustomInv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SCustomInv  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Integer printBill;

    private java.lang.Integer languageId;

    private java.lang.Integer dueDay;

    private java.lang.Integer printSide;

    private java.lang.Integer billingType;

    private java.lang.String ean;

    private java.lang.Integer operType;

    private java.lang.Integer eanQualificator;

    private java.lang.String oioContactName;

    private java.lang.String oioAccountCode;

    private java.lang.String oioUblProfile;

    private java.lang.String oioUtsProfile;

    private java.lang.String oioOrderCode;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductRecurringFee[] feeList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SCustomInvDtl[] cacustomInvDtl;

    private java.lang.String billFormatName;

    private java.lang.Integer billFormatId;

    private java.lang.Long mailCode;

    private java.lang.Integer isCharge;

    private java.lang.Integer validType;

    public SCustomInv() {
    }

    public SCustomInv(
           java.lang.Long acctId,
           java.lang.Integer printBill,
           java.lang.Integer languageId,
           java.lang.Integer dueDay,
           java.lang.Integer printSide,
           java.lang.Integer billingType,
           java.lang.String ean,
           java.lang.Integer operType,
           java.lang.Integer eanQualificator,
           java.lang.String oioContactName,
           java.lang.String oioAccountCode,
           java.lang.String oioUblProfile,
           java.lang.String oioUtsProfile,
           java.lang.String oioOrderCode,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductRecurringFee[] feeList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SCustomInvDtl[] cacustomInvDtl,
           java.lang.String billFormatName,
           java.lang.Integer billFormatId,
           java.lang.Long mailCode,
           java.lang.Integer isCharge,
           java.lang.Integer validType) {
           this.acctId = acctId;
           this.printBill = printBill;
           this.languageId = languageId;
           this.dueDay = dueDay;
           this.printSide = printSide;
           this.billingType = billingType;
           this.ean = ean;
           this.operType = operType;
           this.eanQualificator = eanQualificator;
           this.oioContactName = oioContactName;
           this.oioAccountCode = oioAccountCode;
           this.oioUblProfile = oioUblProfile;
           this.oioUtsProfile = oioUtsProfile;
           this.oioOrderCode = oioOrderCode;
           this.feeList = feeList;
           this.cacustomInvDtl = cacustomInvDtl;
           this.billFormatName = billFormatName;
           this.billFormatId = billFormatId;
           this.mailCode = mailCode;
           this.isCharge = isCharge;
           this.validType = validType;
    }


    /**
     * Gets the acctId value for this SCustomInv.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SCustomInv.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the printBill value for this SCustomInv.
     * 
     * @return printBill
     */
    public java.lang.Integer getPrintBill() {
        return printBill;
    }


    /**
     * Sets the printBill value for this SCustomInv.
     * 
     * @param printBill
     */
    public void setPrintBill(java.lang.Integer printBill) {
        this.printBill = printBill;
    }


    /**
     * Gets the languageId value for this SCustomInv.
     * 
     * @return languageId
     */
    public java.lang.Integer getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this SCustomInv.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the dueDay value for this SCustomInv.
     * 
     * @return dueDay
     */
    public java.lang.Integer getDueDay() {
        return dueDay;
    }


    /**
     * Sets the dueDay value for this SCustomInv.
     * 
     * @param dueDay
     */
    public void setDueDay(java.lang.Integer dueDay) {
        this.dueDay = dueDay;
    }


    /**
     * Gets the printSide value for this SCustomInv.
     * 
     * @return printSide
     */
    public java.lang.Integer getPrintSide() {
        return printSide;
    }


    /**
     * Sets the printSide value for this SCustomInv.
     * 
     * @param printSide
     */
    public void setPrintSide(java.lang.Integer printSide) {
        this.printSide = printSide;
    }


    /**
     * Gets the billingType value for this SCustomInv.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this SCustomInv.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the ean value for this SCustomInv.
     * 
     * @return ean
     */
    public java.lang.String getEan() {
        return ean;
    }


    /**
     * Sets the ean value for this SCustomInv.
     * 
     * @param ean
     */
    public void setEan(java.lang.String ean) {
        this.ean = ean;
    }


    /**
     * Gets the operType value for this SCustomInv.
     * 
     * @return operType
     */
    public java.lang.Integer getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this SCustomInv.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Integer operType) {
        this.operType = operType;
    }


    /**
     * Gets the eanQualificator value for this SCustomInv.
     * 
     * @return eanQualificator
     */
    public java.lang.Integer getEanQualificator() {
        return eanQualificator;
    }


    /**
     * Sets the eanQualificator value for this SCustomInv.
     * 
     * @param eanQualificator
     */
    public void setEanQualificator(java.lang.Integer eanQualificator) {
        this.eanQualificator = eanQualificator;
    }


    /**
     * Gets the oioContactName value for this SCustomInv.
     * 
     * @return oioContactName
     */
    public java.lang.String getOioContactName() {
        return oioContactName;
    }


    /**
     * Sets the oioContactName value for this SCustomInv.
     * 
     * @param oioContactName
     */
    public void setOioContactName(java.lang.String oioContactName) {
        this.oioContactName = oioContactName;
    }


    /**
     * Gets the oioAccountCode value for this SCustomInv.
     * 
     * @return oioAccountCode
     */
    public java.lang.String getOioAccountCode() {
        return oioAccountCode;
    }


    /**
     * Sets the oioAccountCode value for this SCustomInv.
     * 
     * @param oioAccountCode
     */
    public void setOioAccountCode(java.lang.String oioAccountCode) {
        this.oioAccountCode = oioAccountCode;
    }


    /**
     * Gets the oioUblProfile value for this SCustomInv.
     * 
     * @return oioUblProfile
     */
    public java.lang.String getOioUblProfile() {
        return oioUblProfile;
    }


    /**
     * Sets the oioUblProfile value for this SCustomInv.
     * 
     * @param oioUblProfile
     */
    public void setOioUblProfile(java.lang.String oioUblProfile) {
        this.oioUblProfile = oioUblProfile;
    }


    /**
     * Gets the oioUtsProfile value for this SCustomInv.
     * 
     * @return oioUtsProfile
     */
    public java.lang.String getOioUtsProfile() {
        return oioUtsProfile;
    }


    /**
     * Sets the oioUtsProfile value for this SCustomInv.
     * 
     * @param oioUtsProfile
     */
    public void setOioUtsProfile(java.lang.String oioUtsProfile) {
        this.oioUtsProfile = oioUtsProfile;
    }


    /**
     * Gets the oioOrderCode value for this SCustomInv.
     * 
     * @return oioOrderCode
     */
    public java.lang.String getOioOrderCode() {
        return oioOrderCode;
    }


    /**
     * Sets the oioOrderCode value for this SCustomInv.
     * 
     * @param oioOrderCode
     */
    public void setOioOrderCode(java.lang.String oioOrderCode) {
        this.oioOrderCode = oioOrderCode;
    }


    /**
     * Gets the feeList value for this SCustomInv.
     * 
     * @return feeList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductRecurringFee[] getFeeList() {
        return feeList;
    }


    /**
     * Sets the feeList value for this SCustomInv.
     * 
     * @param feeList
     */
    public void setFeeList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductRecurringFee[] feeList) {
        this.feeList = feeList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductRecurringFee getFeeList(int i) {
        return this.feeList[i];
    }

    public void setFeeList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SProductRecurringFee _value) {
        this.feeList[i] = _value;
    }


    /**
     * Gets the cacustomInvDtl value for this SCustomInv.
     * 
     * @return cacustomInvDtl
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SCustomInvDtl[] getCacustomInvDtl() {
        return cacustomInvDtl;
    }


    /**
     * Sets the cacustomInvDtl value for this SCustomInv.
     * 
     * @param cacustomInvDtl
     */
    public void setCacustomInvDtl(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SCustomInvDtl[] cacustomInvDtl) {
        this.cacustomInvDtl = cacustomInvDtl;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SCustomInvDtl getCacustomInvDtl(int i) {
        return this.cacustomInvDtl[i];
    }

    public void setCacustomInvDtl(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SCustomInvDtl _value) {
        this.cacustomInvDtl[i] = _value;
    }


    /**
     * Gets the billFormatName value for this SCustomInv.
     * 
     * @return billFormatName
     */
    public java.lang.String getBillFormatName() {
        return billFormatName;
    }


    /**
     * Sets the billFormatName value for this SCustomInv.
     * 
     * @param billFormatName
     */
    public void setBillFormatName(java.lang.String billFormatName) {
        this.billFormatName = billFormatName;
    }


    /**
     * Gets the billFormatId value for this SCustomInv.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this SCustomInv.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }


    /**
     * Gets the mailCode value for this SCustomInv.
     * 
     * @return mailCode
     */
    public java.lang.Long getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this SCustomInv.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Long mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the isCharge value for this SCustomInv.
     * 
     * @return isCharge
     */
    public java.lang.Integer getIsCharge() {
        return isCharge;
    }


    /**
     * Sets the isCharge value for this SCustomInv.
     * 
     * @param isCharge
     */
    public void setIsCharge(java.lang.Integer isCharge) {
        this.isCharge = isCharge;
    }


    /**
     * Gets the validType value for this SCustomInv.
     * 
     * @return validType
     */
    public java.lang.Integer getValidType() {
        return validType;
    }


    /**
     * Sets the validType value for this SCustomInv.
     * 
     * @param validType
     */
    public void setValidType(java.lang.Integer validType) {
        this.validType = validType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCustomInv)) return false;
        SCustomInv other = (SCustomInv) obj;
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
            ((this.printBill==null && other.getPrintBill()==null) || 
             (this.printBill!=null &&
              this.printBill.equals(other.getPrintBill()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.dueDay==null && other.getDueDay()==null) || 
             (this.dueDay!=null &&
              this.dueDay.equals(other.getDueDay()))) &&
            ((this.printSide==null && other.getPrintSide()==null) || 
             (this.printSide!=null &&
              this.printSide.equals(other.getPrintSide()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.ean==null && other.getEan()==null) || 
             (this.ean!=null &&
              this.ean.equals(other.getEan()))) &&
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType()))) &&
            ((this.eanQualificator==null && other.getEanQualificator()==null) || 
             (this.eanQualificator!=null &&
              this.eanQualificator.equals(other.getEanQualificator()))) &&
            ((this.oioContactName==null && other.getOioContactName()==null) || 
             (this.oioContactName!=null &&
              this.oioContactName.equals(other.getOioContactName()))) &&
            ((this.oioAccountCode==null && other.getOioAccountCode()==null) || 
             (this.oioAccountCode!=null &&
              this.oioAccountCode.equals(other.getOioAccountCode()))) &&
            ((this.oioUblProfile==null && other.getOioUblProfile()==null) || 
             (this.oioUblProfile!=null &&
              this.oioUblProfile.equals(other.getOioUblProfile()))) &&
            ((this.oioUtsProfile==null && other.getOioUtsProfile()==null) || 
             (this.oioUtsProfile!=null &&
              this.oioUtsProfile.equals(other.getOioUtsProfile()))) &&
            ((this.oioOrderCode==null && other.getOioOrderCode()==null) || 
             (this.oioOrderCode!=null &&
              this.oioOrderCode.equals(other.getOioOrderCode()))) &&
            ((this.feeList==null && other.getFeeList()==null) || 
             (this.feeList!=null &&
              java.util.Arrays.equals(this.feeList, other.getFeeList()))) &&
            ((this.cacustomInvDtl==null && other.getCacustomInvDtl()==null) || 
             (this.cacustomInvDtl!=null &&
              java.util.Arrays.equals(this.cacustomInvDtl, other.getCacustomInvDtl()))) &&
            ((this.billFormatName==null && other.getBillFormatName()==null) || 
             (this.billFormatName!=null &&
              this.billFormatName.equals(other.getBillFormatName()))) &&
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.isCharge==null && other.getIsCharge()==null) || 
             (this.isCharge!=null &&
              this.isCharge.equals(other.getIsCharge()))) &&
            ((this.validType==null && other.getValidType()==null) || 
             (this.validType!=null &&
              this.validType.equals(other.getValidType())));
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
        if (getPrintBill() != null) {
            _hashCode += getPrintBill().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getDueDay() != null) {
            _hashCode += getDueDay().hashCode();
        }
        if (getPrintSide() != null) {
            _hashCode += getPrintSide().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getEan() != null) {
            _hashCode += getEan().hashCode();
        }
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        if (getEanQualificator() != null) {
            _hashCode += getEanQualificator().hashCode();
        }
        if (getOioContactName() != null) {
            _hashCode += getOioContactName().hashCode();
        }
        if (getOioAccountCode() != null) {
            _hashCode += getOioAccountCode().hashCode();
        }
        if (getOioUblProfile() != null) {
            _hashCode += getOioUblProfile().hashCode();
        }
        if (getOioUtsProfile() != null) {
            _hashCode += getOioUtsProfile().hashCode();
        }
        if (getOioOrderCode() != null) {
            _hashCode += getOioOrderCode().hashCode();
        }
        if (getFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCacustomInvDtl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCacustomInvDtl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCacustomInvDtl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillFormatName() != null) {
            _hashCode += getBillFormatName().hashCode();
        }
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getIsCharge() != null) {
            _hashCode += getIsCharge().hashCode();
        }
        if (getValidType() != null) {
            _hashCode += getValidType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCustomInv.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomInv"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printBill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printSide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printSide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("ean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eanQualificator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eanQualificator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oioContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oioContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oioAccountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oioAccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oioUblProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oioUblProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oioUtsProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oioUtsProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oioOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oioOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductRecurringFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacustomInvDtl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacustomInvDtl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomInvDtl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validType"));
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
