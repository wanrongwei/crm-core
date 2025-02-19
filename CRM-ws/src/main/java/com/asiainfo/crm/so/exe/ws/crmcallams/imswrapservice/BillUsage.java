/**
 * BillUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class BillUsage  implements java.io.Serializable {
    private java.lang.String invoiceNo;

    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.String outerPayAcctId;

    private java.lang.Long payAcctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.String billCycleNo;

    private java.lang.String cycleBeginDate;

    private java.lang.String cycleEndDate;

    private java.lang.Double unpayFee;

    private java.lang.Double discountFee;

    private java.lang.Double adjustFee;

    private java.lang.Double primFee;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillUsageItem[] billUsageItemList;

    public BillUsage() {
    }

    public BillUsage(
           java.lang.String invoiceNo,
           java.lang.String outerCustId,
           java.lang.Long custId,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.String outerPayAcctId,
           java.lang.Long payAcctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.String billCycleNo,
           java.lang.String cycleBeginDate,
           java.lang.String cycleEndDate,
           java.lang.Double unpayFee,
           java.lang.Double discountFee,
           java.lang.Double adjustFee,
           java.lang.Double primFee,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillUsageItem[] billUsageItemList) {
           this.invoiceNo = invoiceNo;
           this.outerCustId = outerCustId;
           this.custId = custId;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.outerPayAcctId = outerPayAcctId;
           this.payAcctId = payAcctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.billCycleNo = billCycleNo;
           this.cycleBeginDate = cycleBeginDate;
           this.cycleEndDate = cycleEndDate;
           this.unpayFee = unpayFee;
           this.discountFee = discountFee;
           this.adjustFee = adjustFee;
           this.primFee = primFee;
           this.billUsageItemList = billUsageItemList;
    }


    /**
     * Gets the invoiceNo value for this BillUsage.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this BillUsage.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the outerCustId value for this BillUsage.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this BillUsage.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this BillUsage.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this BillUsage.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the outerAcctId value for this BillUsage.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this BillUsage.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this BillUsage.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this BillUsage.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerPayAcctId value for this BillUsage.
     * 
     * @return outerPayAcctId
     */
    public java.lang.String getOuterPayAcctId() {
        return outerPayAcctId;
    }


    /**
     * Sets the outerPayAcctId value for this BillUsage.
     * 
     * @param outerPayAcctId
     */
    public void setOuterPayAcctId(java.lang.String outerPayAcctId) {
        this.outerPayAcctId = outerPayAcctId;
    }


    /**
     * Gets the payAcctId value for this BillUsage.
     * 
     * @return payAcctId
     */
    public java.lang.Long getPayAcctId() {
        return payAcctId;
    }


    /**
     * Sets the payAcctId value for this BillUsage.
     * 
     * @param payAcctId
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }


    /**
     * Gets the userId value for this BillUsage.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this BillUsage.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this BillUsage.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this BillUsage.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the billCycleNo value for this BillUsage.
     * 
     * @return billCycleNo
     */
    public java.lang.String getBillCycleNo() {
        return billCycleNo;
    }


    /**
     * Sets the billCycleNo value for this BillUsage.
     * 
     * @param billCycleNo
     */
    public void setBillCycleNo(java.lang.String billCycleNo) {
        this.billCycleNo = billCycleNo;
    }


    /**
     * Gets the cycleBeginDate value for this BillUsage.
     * 
     * @return cycleBeginDate
     */
    public java.lang.String getCycleBeginDate() {
        return cycleBeginDate;
    }


    /**
     * Sets the cycleBeginDate value for this BillUsage.
     * 
     * @param cycleBeginDate
     */
    public void setCycleBeginDate(java.lang.String cycleBeginDate) {
        this.cycleBeginDate = cycleBeginDate;
    }


    /**
     * Gets the cycleEndDate value for this BillUsage.
     * 
     * @return cycleEndDate
     */
    public java.lang.String getCycleEndDate() {
        return cycleEndDate;
    }


    /**
     * Sets the cycleEndDate value for this BillUsage.
     * 
     * @param cycleEndDate
     */
    public void setCycleEndDate(java.lang.String cycleEndDate) {
        this.cycleEndDate = cycleEndDate;
    }


    /**
     * Gets the unpayFee value for this BillUsage.
     * 
     * @return unpayFee
     */
    public java.lang.Double getUnpayFee() {
        return unpayFee;
    }


    /**
     * Sets the unpayFee value for this BillUsage.
     * 
     * @param unpayFee
     */
    public void setUnpayFee(java.lang.Double unpayFee) {
        this.unpayFee = unpayFee;
    }


    /**
     * Gets the discountFee value for this BillUsage.
     * 
     * @return discountFee
     */
    public java.lang.Double getDiscountFee() {
        return discountFee;
    }


    /**
     * Sets the discountFee value for this BillUsage.
     * 
     * @param discountFee
     */
    public void setDiscountFee(java.lang.Double discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * Gets the adjustFee value for this BillUsage.
     * 
     * @return adjustFee
     */
    public java.lang.Double getAdjustFee() {
        return adjustFee;
    }


    /**
     * Sets the adjustFee value for this BillUsage.
     * 
     * @param adjustFee
     */
    public void setAdjustFee(java.lang.Double adjustFee) {
        this.adjustFee = adjustFee;
    }


    /**
     * Gets the primFee value for this BillUsage.
     * 
     * @return primFee
     */
    public java.lang.Double getPrimFee() {
        return primFee;
    }


    /**
     * Sets the primFee value for this BillUsage.
     * 
     * @param primFee
     */
    public void setPrimFee(java.lang.Double primFee) {
        this.primFee = primFee;
    }


    /**
     * Gets the billUsageItemList value for this BillUsage.
     * 
     * @return billUsageItemList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillUsageItem[] getBillUsageItemList() {
        return billUsageItemList;
    }


    /**
     * Sets the billUsageItemList value for this BillUsage.
     * 
     * @param billUsageItemList
     */
    public void setBillUsageItemList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillUsageItem[] billUsageItemList) {
        this.billUsageItemList = billUsageItemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillUsage)) return false;
        BillUsage other = (BillUsage) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
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
            ((this.outerPayAcctId==null && other.getOuterPayAcctId()==null) || 
             (this.outerPayAcctId!=null &&
              this.outerPayAcctId.equals(other.getOuterPayAcctId()))) &&
            ((this.payAcctId==null && other.getPayAcctId()==null) || 
             (this.payAcctId!=null &&
              this.payAcctId.equals(other.getPayAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.billCycleNo==null && other.getBillCycleNo()==null) || 
             (this.billCycleNo!=null &&
              this.billCycleNo.equals(other.getBillCycleNo()))) &&
            ((this.cycleBeginDate==null && other.getCycleBeginDate()==null) || 
             (this.cycleBeginDate!=null &&
              this.cycleBeginDate.equals(other.getCycleBeginDate()))) &&
            ((this.cycleEndDate==null && other.getCycleEndDate()==null) || 
             (this.cycleEndDate!=null &&
              this.cycleEndDate.equals(other.getCycleEndDate()))) &&
            ((this.unpayFee==null && other.getUnpayFee()==null) || 
             (this.unpayFee!=null &&
              this.unpayFee.equals(other.getUnpayFee()))) &&
            ((this.discountFee==null && other.getDiscountFee()==null) || 
             (this.discountFee!=null &&
              this.discountFee.equals(other.getDiscountFee()))) &&
            ((this.adjustFee==null && other.getAdjustFee()==null) || 
             (this.adjustFee!=null &&
              this.adjustFee.equals(other.getAdjustFee()))) &&
            ((this.primFee==null && other.getPrimFee()==null) || 
             (this.primFee!=null &&
              this.primFee.equals(other.getPrimFee()))) &&
            ((this.billUsageItemList==null && other.getBillUsageItemList()==null) || 
             (this.billUsageItemList!=null &&
              java.util.Arrays.equals(this.billUsageItemList, other.getBillUsageItemList())));
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
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
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
        if (getOuterPayAcctId() != null) {
            _hashCode += getOuterPayAcctId().hashCode();
        }
        if (getPayAcctId() != null) {
            _hashCode += getPayAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getBillCycleNo() != null) {
            _hashCode += getBillCycleNo().hashCode();
        }
        if (getCycleBeginDate() != null) {
            _hashCode += getCycleBeginDate().hashCode();
        }
        if (getCycleEndDate() != null) {
            _hashCode += getCycleEndDate().hashCode();
        }
        if (getUnpayFee() != null) {
            _hashCode += getUnpayFee().hashCode();
        }
        if (getDiscountFee() != null) {
            _hashCode += getDiscountFee().hashCode();
        }
        if (getAdjustFee() != null) {
            _hashCode += getAdjustFee().hashCode();
        }
        if (getPrimFee() != null) {
            _hashCode += getPrimFee().hashCode();
        }
        if (getBillUsageItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillUsageItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillUsageItemList(), i);
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
        new org.apache.axis.description.TypeDesc(BillUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("outerPayAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerPayAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAcctId"));
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
        elemField.setFieldName("billCycleNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billCycleNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleBeginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleBeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billUsageItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billUsageItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsageItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "billUsageItemListItem"));
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
