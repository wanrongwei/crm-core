/**
 * SProductOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SProductOrder  implements java.io.Serializable {
    private java.lang.Long productId;

    private java.lang.Long offerId;

    private java.lang.String soId;

    private java.lang.Integer productType;

    private java.lang.Long parentServProduct;

    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.String outerBillableAcctId;

    private java.lang.Long billableAcctId;

    private java.lang.Short billingType;

    private java.lang.Short prodState;

    private java.lang.String createDate;

    private java.lang.Short validType;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.String nextcycleStartDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillCycle billCycle;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] reguidPriceParam;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductParam[] paramList;

    private java.lang.String priceDescription;

    private java.lang.Long prepaidRecurringFee;

    private java.lang.String lastBillDate;

    private java.lang.Short taxFlag;

    public SProductOrder() {
    }

    public SProductOrder(
           java.lang.Long productId,
           java.lang.Long offerId,
           java.lang.String soId,
           java.lang.Integer productType,
           java.lang.Long parentServProduct,
           java.lang.String outerCustId,
           java.lang.Long custId,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.String outerBillableAcctId,
           java.lang.Long billableAcctId,
           java.lang.Short billingType,
           java.lang.Short prodState,
           java.lang.String createDate,
           java.lang.Short validType,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.String nextcycleStartDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillCycle billCycle,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] reguidPriceParam,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductParam[] paramList,
           java.lang.String priceDescription,
           java.lang.Long prepaidRecurringFee,
           java.lang.String lastBillDate,
           java.lang.Short taxFlag) {
           this.productId = productId;
           this.offerId = offerId;
           this.soId = soId;
           this.productType = productType;
           this.parentServProduct = parentServProduct;
           this.outerCustId = outerCustId;
           this.custId = custId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.outerBillableAcctId = outerBillableAcctId;
           this.billableAcctId = billableAcctId;
           this.billingType = billingType;
           this.prodState = prodState;
           this.createDate = createDate;
           this.validType = validType;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.nextcycleStartDate = nextcycleStartDate;
           this.billCycle = billCycle;
           this.reguidPriceParam = reguidPriceParam;
           this.paramList = paramList;
           this.priceDescription = priceDescription;
           this.prepaidRecurringFee = prepaidRecurringFee;
           this.lastBillDate = lastBillDate;
           this.taxFlag = taxFlag;
    }


    /**
     * Gets the productId value for this SProductOrder.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SProductOrder.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the offerId value for this SProductOrder.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SProductOrder.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the soId value for this SProductOrder.
     * 
     * @return soId
     */
    public java.lang.String getSoId() {
        return soId;
    }


    /**
     * Sets the soId value for this SProductOrder.
     * 
     * @param soId
     */
    public void setSoId(java.lang.String soId) {
        this.soId = soId;
    }


    /**
     * Gets the productType value for this SProductOrder.
     * 
     * @return productType
     */
    public java.lang.Integer getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this SProductOrder.
     * 
     * @param productType
     */
    public void setProductType(java.lang.Integer productType) {
        this.productType = productType;
    }


    /**
     * Gets the parentServProduct value for this SProductOrder.
     * 
     * @return parentServProduct
     */
    public java.lang.Long getParentServProduct() {
        return parentServProduct;
    }


    /**
     * Sets the parentServProduct value for this SProductOrder.
     * 
     * @param parentServProduct
     */
    public void setParentServProduct(java.lang.Long parentServProduct) {
        this.parentServProduct = parentServProduct;
    }


    /**
     * Gets the outerCustId value for this SProductOrder.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this SProductOrder.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this SProductOrder.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this SProductOrder.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the outerAcctId value for this SProductOrder.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SProductOrder.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SProductOrder.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SProductOrder.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this SProductOrder.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SProductOrder.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SProductOrder.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SProductOrder.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the outerBillableAcctId value for this SProductOrder.
     * 
     * @return outerBillableAcctId
     */
    public java.lang.String getOuterBillableAcctId() {
        return outerBillableAcctId;
    }


    /**
     * Sets the outerBillableAcctId value for this SProductOrder.
     * 
     * @param outerBillableAcctId
     */
    public void setOuterBillableAcctId(java.lang.String outerBillableAcctId) {
        this.outerBillableAcctId = outerBillableAcctId;
    }


    /**
     * Gets the billableAcctId value for this SProductOrder.
     * 
     * @return billableAcctId
     */
    public java.lang.Long getBillableAcctId() {
        return billableAcctId;
    }


    /**
     * Sets the billableAcctId value for this SProductOrder.
     * 
     * @param billableAcctId
     */
    public void setBillableAcctId(java.lang.Long billableAcctId) {
        this.billableAcctId = billableAcctId;
    }


    /**
     * Gets the billingType value for this SProductOrder.
     * 
     * @return billingType
     */
    public java.lang.Short getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this SProductOrder.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Short billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the prodState value for this SProductOrder.
     * 
     * @return prodState
     */
    public java.lang.Short getProdState() {
        return prodState;
    }


    /**
     * Sets the prodState value for this SProductOrder.
     * 
     * @param prodState
     */
    public void setProdState(java.lang.Short prodState) {
        this.prodState = prodState;
    }


    /**
     * Gets the createDate value for this SProductOrder.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SProductOrder.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the validType value for this SProductOrder.
     * 
     * @return validType
     */
    public java.lang.Short getValidType() {
        return validType;
    }


    /**
     * Sets the validType value for this SProductOrder.
     * 
     * @param validType
     */
    public void setValidType(java.lang.Short validType) {
        this.validType = validType;
    }


    /**
     * Gets the validDate value for this SProductOrder.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SProductOrder.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SProductOrder.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SProductOrder.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the nextcycleStartDate value for this SProductOrder.
     * 
     * @return nextcycleStartDate
     */
    public java.lang.String getNextcycleStartDate() {
        return nextcycleStartDate;
    }


    /**
     * Sets the nextcycleStartDate value for this SProductOrder.
     * 
     * @param nextcycleStartDate
     */
    public void setNextcycleStartDate(java.lang.String nextcycleStartDate) {
        this.nextcycleStartDate = nextcycleStartDate;
    }


    /**
     * Gets the billCycle value for this SProductOrder.
     * 
     * @return billCycle
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillCycle getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this SProductOrder.
     * 
     * @param billCycle
     */
    public void setBillCycle(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillCycle billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the reguidPriceParam value for this SProductOrder.
     * 
     * @return reguidPriceParam
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] getReguidPriceParam() {
        return reguidPriceParam;
    }


    /**
     * Sets the reguidPriceParam value for this SProductOrder.
     * 
     * @param reguidPriceParam
     */
    public void setReguidPriceParam(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[] reguidPriceParam) {
        this.reguidPriceParam = reguidPriceParam;
    }


    /**
     * Gets the paramList value for this SProductOrder.
     * 
     * @return paramList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductParam[] getParamList() {
        return paramList;
    }


    /**
     * Sets the paramList value for this SProductOrder.
     * 
     * @param paramList
     */
    public void setParamList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductParam[] paramList) {
        this.paramList = paramList;
    }


    /**
     * Gets the priceDescription value for this SProductOrder.
     * 
     * @return priceDescription
     */
    public java.lang.String getPriceDescription() {
        return priceDescription;
    }


    /**
     * Sets the priceDescription value for this SProductOrder.
     * 
     * @param priceDescription
     */
    public void setPriceDescription(java.lang.String priceDescription) {
        this.priceDescription = priceDescription;
    }


    /**
     * Gets the prepaidRecurringFee value for this SProductOrder.
     * 
     * @return prepaidRecurringFee
     */
    public java.lang.Long getPrepaidRecurringFee() {
        return prepaidRecurringFee;
    }


    /**
     * Sets the prepaidRecurringFee value for this SProductOrder.
     * 
     * @param prepaidRecurringFee
     */
    public void setPrepaidRecurringFee(java.lang.Long prepaidRecurringFee) {
        this.prepaidRecurringFee = prepaidRecurringFee;
    }


    /**
     * Gets the lastBillDate value for this SProductOrder.
     * 
     * @return lastBillDate
     */
    public java.lang.String getLastBillDate() {
        return lastBillDate;
    }


    /**
     * Sets the lastBillDate value for this SProductOrder.
     * 
     * @param lastBillDate
     */
    public void setLastBillDate(java.lang.String lastBillDate) {
        this.lastBillDate = lastBillDate;
    }


    /**
     * Gets the taxFlag value for this SProductOrder.
     * 
     * @return taxFlag
     */
    public java.lang.Short getTaxFlag() {
        return taxFlag;
    }


    /**
     * Sets the taxFlag value for this SProductOrder.
     * 
     * @param taxFlag
     */
    public void setTaxFlag(java.lang.Short taxFlag) {
        this.taxFlag = taxFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SProductOrder)) return false;
        SProductOrder other = (SProductOrder) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.soId==null && other.getSoId()==null) || 
             (this.soId!=null &&
              this.soId.equals(other.getSoId()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.parentServProduct==null && other.getParentServProduct()==null) || 
             (this.parentServProduct!=null &&
              this.parentServProduct.equals(other.getParentServProduct()))) &&
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
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.outerBillableAcctId==null && other.getOuterBillableAcctId()==null) || 
             (this.outerBillableAcctId!=null &&
              this.outerBillableAcctId.equals(other.getOuterBillableAcctId()))) &&
            ((this.billableAcctId==null && other.getBillableAcctId()==null) || 
             (this.billableAcctId!=null &&
              this.billableAcctId.equals(other.getBillableAcctId()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.prodState==null && other.getProdState()==null) || 
             (this.prodState!=null &&
              this.prodState.equals(other.getProdState()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.validType==null && other.getValidType()==null) || 
             (this.validType!=null &&
              this.validType.equals(other.getValidType()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.nextcycleStartDate==null && other.getNextcycleStartDate()==null) || 
             (this.nextcycleStartDate!=null &&
              this.nextcycleStartDate.equals(other.getNextcycleStartDate()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.reguidPriceParam==null && other.getReguidPriceParam()==null) || 
             (this.reguidPriceParam!=null &&
              java.util.Arrays.equals(this.reguidPriceParam, other.getReguidPriceParam()))) &&
            ((this.paramList==null && other.getParamList()==null) || 
             (this.paramList!=null &&
              java.util.Arrays.equals(this.paramList, other.getParamList()))) &&
            ((this.priceDescription==null && other.getPriceDescription()==null) || 
             (this.priceDescription!=null &&
              this.priceDescription.equals(other.getPriceDescription()))) &&
            ((this.prepaidRecurringFee==null && other.getPrepaidRecurringFee()==null) || 
             (this.prepaidRecurringFee!=null &&
              this.prepaidRecurringFee.equals(other.getPrepaidRecurringFee()))) &&
            ((this.lastBillDate==null && other.getLastBillDate()==null) || 
             (this.lastBillDate!=null &&
              this.lastBillDate.equals(other.getLastBillDate()))) &&
            ((this.taxFlag==null && other.getTaxFlag()==null) || 
             (this.taxFlag!=null &&
              this.taxFlag.equals(other.getTaxFlag())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getSoId() != null) {
            _hashCode += getSoId().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getParentServProduct() != null) {
            _hashCode += getParentServProduct().hashCode();
        }
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOuterBillableAcctId() != null) {
            _hashCode += getOuterBillableAcctId().hashCode();
        }
        if (getBillableAcctId() != null) {
            _hashCode += getBillableAcctId().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getProdState() != null) {
            _hashCode += getProdState().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getValidType() != null) {
            _hashCode += getValidType().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getNextcycleStartDate() != null) {
            _hashCode += getNextcycleStartDate().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getReguidPriceParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReguidPriceParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReguidPriceParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParamList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParamList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceDescription() != null) {
            _hashCode += getPriceDescription().hashCode();
        }
        if (getPrepaidRecurringFee() != null) {
            _hashCode += getPrepaidRecurringFee().hashCode();
        }
        if (getLastBillDate() != null) {
            _hashCode += getLastBillDate().hashCode();
        }
        if (getTaxFlag() != null) {
            _hashCode += getTaxFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SProductOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentServProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentServProduct"));
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
        elemField.setFieldName("outerBillableAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerBillableAcctId"));
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
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("validType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("nextcycleStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextcycleStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguidPriceParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguidPriceParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "extendParamListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductParamListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidRecurringFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaidRecurringFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("taxFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxFlag"));
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
