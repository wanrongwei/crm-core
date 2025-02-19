/**
 * SQueryLedgerOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryLedgerOut  implements java.io.Serializable {
    private java.lang.Long billAmount;

    private java.lang.Long assetAmount;

    private java.lang.Long balance;

    private java.lang.Long debtAmount;

    private java.lang.String invoiceNum;

    private java.lang.String createDate;

    private java.lang.Integer busiSpecId;

    private java.lang.String busiSpecName;

    private java.lang.Integer measureId;

    private java.lang.Integer orgId;

    private java.lang.Integer channelId;

    private java.lang.Integer rechargeMethod;

    public SQueryLedgerOut() {
    }

    public SQueryLedgerOut(
           java.lang.Long billAmount,
           java.lang.Long assetAmount,
           java.lang.Long balance,
           java.lang.Long debtAmount,
           java.lang.String invoiceNum,
           java.lang.String createDate,
           java.lang.Integer busiSpecId,
           java.lang.String busiSpecName,
           java.lang.Integer measureId,
           java.lang.Integer orgId,
           java.lang.Integer channelId,
           java.lang.Integer rechargeMethod) {
           this.billAmount = billAmount;
           this.assetAmount = assetAmount;
           this.balance = balance;
           this.debtAmount = debtAmount;
           this.invoiceNum = invoiceNum;
           this.createDate = createDate;
           this.busiSpecId = busiSpecId;
           this.busiSpecName = busiSpecName;
           this.measureId = measureId;
           this.orgId = orgId;
           this.channelId = channelId;
           this.rechargeMethod = rechargeMethod;
    }


    /**
     * Gets the billAmount value for this SQueryLedgerOut.
     * 
     * @return billAmount
     */
    public java.lang.Long getBillAmount() {
        return billAmount;
    }


    /**
     * Sets the billAmount value for this SQueryLedgerOut.
     * 
     * @param billAmount
     */
    public void setBillAmount(java.lang.Long billAmount) {
        this.billAmount = billAmount;
    }


    /**
     * Gets the assetAmount value for this SQueryLedgerOut.
     * 
     * @return assetAmount
     */
    public java.lang.Long getAssetAmount() {
        return assetAmount;
    }


    /**
     * Sets the assetAmount value for this SQueryLedgerOut.
     * 
     * @param assetAmount
     */
    public void setAssetAmount(java.lang.Long assetAmount) {
        this.assetAmount = assetAmount;
    }


    /**
     * Gets the balance value for this SQueryLedgerOut.
     * 
     * @return balance
     */
    public java.lang.Long getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this SQueryLedgerOut.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }


    /**
     * Gets the debtAmount value for this SQueryLedgerOut.
     * 
     * @return debtAmount
     */
    public java.lang.Long getDebtAmount() {
        return debtAmount;
    }


    /**
     * Sets the debtAmount value for this SQueryLedgerOut.
     * 
     * @param debtAmount
     */
    public void setDebtAmount(java.lang.Long debtAmount) {
        this.debtAmount = debtAmount;
    }


    /**
     * Gets the invoiceNum value for this SQueryLedgerOut.
     * 
     * @return invoiceNum
     */
    public java.lang.String getInvoiceNum() {
        return invoiceNum;
    }


    /**
     * Sets the invoiceNum value for this SQueryLedgerOut.
     * 
     * @param invoiceNum
     */
    public void setInvoiceNum(java.lang.String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }


    /**
     * Gets the createDate value for this SQueryLedgerOut.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SQueryLedgerOut.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the busiSpecId value for this SQueryLedgerOut.
     * 
     * @return busiSpecId
     */
    public java.lang.Integer getBusiSpecId() {
        return busiSpecId;
    }


    /**
     * Sets the busiSpecId value for this SQueryLedgerOut.
     * 
     * @param busiSpecId
     */
    public void setBusiSpecId(java.lang.Integer busiSpecId) {
        this.busiSpecId = busiSpecId;
    }


    /**
     * Gets the busiSpecName value for this SQueryLedgerOut.
     * 
     * @return busiSpecName
     */
    public java.lang.String getBusiSpecName() {
        return busiSpecName;
    }


    /**
     * Sets the busiSpecName value for this SQueryLedgerOut.
     * 
     * @param busiSpecName
     */
    public void setBusiSpecName(java.lang.String busiSpecName) {
        this.busiSpecName = busiSpecName;
    }


    /**
     * Gets the measureId value for this SQueryLedgerOut.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SQueryLedgerOut.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the orgId value for this SQueryLedgerOut.
     * 
     * @return orgId
     */
    public java.lang.Integer getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this SQueryLedgerOut.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.Integer orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the channelId value for this SQueryLedgerOut.
     * 
     * @return channelId
     */
    public java.lang.Integer getChannelId() {
        return channelId;
    }


    /**
     * Sets the channelId value for this SQueryLedgerOut.
     * 
     * @param channelId
     */
    public void setChannelId(java.lang.Integer channelId) {
        this.channelId = channelId;
    }


    /**
     * Gets the rechargeMethod value for this SQueryLedgerOut.
     * 
     * @return rechargeMethod
     */
    public java.lang.Integer getRechargeMethod() {
        return rechargeMethod;
    }


    /**
     * Sets the rechargeMethod value for this SQueryLedgerOut.
     * 
     * @param rechargeMethod
     */
    public void setRechargeMethod(java.lang.Integer rechargeMethod) {
        this.rechargeMethod = rechargeMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryLedgerOut)) return false;
        SQueryLedgerOut other = (SQueryLedgerOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billAmount==null && other.getBillAmount()==null) || 
             (this.billAmount!=null &&
              this.billAmount.equals(other.getBillAmount()))) &&
            ((this.assetAmount==null && other.getAssetAmount()==null) || 
             (this.assetAmount!=null &&
              this.assetAmount.equals(other.getAssetAmount()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.debtAmount==null && other.getDebtAmount()==null) || 
             (this.debtAmount!=null &&
              this.debtAmount.equals(other.getDebtAmount()))) &&
            ((this.invoiceNum==null && other.getInvoiceNum()==null) || 
             (this.invoiceNum!=null &&
              this.invoiceNum.equals(other.getInvoiceNum()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.busiSpecId==null && other.getBusiSpecId()==null) || 
             (this.busiSpecId!=null &&
              this.busiSpecId.equals(other.getBusiSpecId()))) &&
            ((this.busiSpecName==null && other.getBusiSpecName()==null) || 
             (this.busiSpecName!=null &&
              this.busiSpecName.equals(other.getBusiSpecName()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.channelId==null && other.getChannelId()==null) || 
             (this.channelId!=null &&
              this.channelId.equals(other.getChannelId()))) &&
            ((this.rechargeMethod==null && other.getRechargeMethod()==null) || 
             (this.rechargeMethod!=null &&
              this.rechargeMethod.equals(other.getRechargeMethod())));
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
        if (getBillAmount() != null) {
            _hashCode += getBillAmount().hashCode();
        }
        if (getAssetAmount() != null) {
            _hashCode += getAssetAmount().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getDebtAmount() != null) {
            _hashCode += getDebtAmount().hashCode();
        }
        if (getInvoiceNum() != null) {
            _hashCode += getInvoiceNum().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getBusiSpecId() != null) {
            _hashCode += getBusiSpecId().hashCode();
        }
        if (getBusiSpecName() != null) {
            _hashCode += getBusiSpecName().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getChannelId() != null) {
            _hashCode += getChannelId().hashCode();
        }
        if (getRechargeMethod() != null) {
            _hashCode += getRechargeMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryLedgerOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryLedgerOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debtAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNum"));
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
        elemField.setFieldName("busiSpecId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSpecName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecName"));
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
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeMethod"));
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
