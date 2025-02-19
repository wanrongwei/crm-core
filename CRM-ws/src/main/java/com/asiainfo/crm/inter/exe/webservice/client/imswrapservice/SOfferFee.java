/**
 * SOfferFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SOfferFee  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SDiscountInfo[] discountList;

    private java.lang.Long billingOfferId;

    private java.lang.String billingOfferName;

    private java.lang.Integer feeItemId;

    private java.lang.String busiCode;

    private java.lang.String feeName;

    private java.lang.Long orgCharge;

    private java.lang.Long charge;

    private java.lang.Long taxAmount;

    private java.lang.Long taxCode;

    private java.lang.String vat;

    private java.lang.String vatType;

    private java.lang.String invoiceNbr;

    private java.lang.Integer measureId;

    private java.lang.Integer taxInclude;

    public SOfferFee() {
    }

    public SOfferFee(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SDiscountInfo[] discountList,
           java.lang.Long billingOfferId,
           java.lang.String billingOfferName,
           java.lang.Integer feeItemId,
           java.lang.String busiCode,
           java.lang.String feeName,
           java.lang.Long orgCharge,
           java.lang.Long charge,
           java.lang.Long taxAmount,
           java.lang.Long taxCode,
           java.lang.String vat,
           java.lang.String vatType,
           java.lang.String invoiceNbr,
           java.lang.Integer measureId,
           java.lang.Integer taxInclude) {
           this.discountList = discountList;
           this.billingOfferId = billingOfferId;
           this.billingOfferName = billingOfferName;
           this.feeItemId = feeItemId;
           this.busiCode = busiCode;
           this.feeName = feeName;
           this.orgCharge = orgCharge;
           this.charge = charge;
           this.taxAmount = taxAmount;
           this.taxCode = taxCode;
           this.vat = vat;
           this.vatType = vatType;
           this.invoiceNbr = invoiceNbr;
           this.measureId = measureId;
           this.taxInclude = taxInclude;
    }


    /**
     * Gets the discountList value for this SOfferFee.
     * 
     * @return discountList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SDiscountInfo[] getDiscountList() {
        return discountList;
    }


    /**
     * Sets the discountList value for this SOfferFee.
     * 
     * @param discountList
     */
    public void setDiscountList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SDiscountInfo[] discountList) {
        this.discountList = discountList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SDiscountInfo getDiscountList(int i) {
        return this.discountList[i];
    }

    public void setDiscountList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SDiscountInfo _value) {
        this.discountList[i] = _value;
    }


    /**
     * Gets the billingOfferId value for this SOfferFee.
     * 
     * @return billingOfferId
     */
    public java.lang.Long getBillingOfferId() {
        return billingOfferId;
    }


    /**
     * Sets the billingOfferId value for this SOfferFee.
     * 
     * @param billingOfferId
     */
    public void setBillingOfferId(java.lang.Long billingOfferId) {
        this.billingOfferId = billingOfferId;
    }


    /**
     * Gets the billingOfferName value for this SOfferFee.
     * 
     * @return billingOfferName
     */
    public java.lang.String getBillingOfferName() {
        return billingOfferName;
    }


    /**
     * Sets the billingOfferName value for this SOfferFee.
     * 
     * @param billingOfferName
     */
    public void setBillingOfferName(java.lang.String billingOfferName) {
        this.billingOfferName = billingOfferName;
    }


    /**
     * Gets the feeItemId value for this SOfferFee.
     * 
     * @return feeItemId
     */
    public java.lang.Integer getFeeItemId() {
        return feeItemId;
    }


    /**
     * Sets the feeItemId value for this SOfferFee.
     * 
     * @param feeItemId
     */
    public void setFeeItemId(java.lang.Integer feeItemId) {
        this.feeItemId = feeItemId;
    }


    /**
     * Gets the busiCode value for this SOfferFee.
     * 
     * @return busiCode
     */
    public java.lang.String getBusiCode() {
        return busiCode;
    }


    /**
     * Sets the busiCode value for this SOfferFee.
     * 
     * @param busiCode
     */
    public void setBusiCode(java.lang.String busiCode) {
        this.busiCode = busiCode;
    }


    /**
     * Gets the feeName value for this SOfferFee.
     * 
     * @return feeName
     */
    public java.lang.String getFeeName() {
        return feeName;
    }


    /**
     * Sets the feeName value for this SOfferFee.
     * 
     * @param feeName
     */
    public void setFeeName(java.lang.String feeName) {
        this.feeName = feeName;
    }


    /**
     * Gets the orgCharge value for this SOfferFee.
     * 
     * @return orgCharge
     */
    public java.lang.Long getOrgCharge() {
        return orgCharge;
    }


    /**
     * Sets the orgCharge value for this SOfferFee.
     * 
     * @param orgCharge
     */
    public void setOrgCharge(java.lang.Long orgCharge) {
        this.orgCharge = orgCharge;
    }


    /**
     * Gets the charge value for this SOfferFee.
     * 
     * @return charge
     */
    public java.lang.Long getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this SOfferFee.
     * 
     * @param charge
     */
    public void setCharge(java.lang.Long charge) {
        this.charge = charge;
    }


    /**
     * Gets the taxAmount value for this SOfferFee.
     * 
     * @return taxAmount
     */
    public java.lang.Long getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this SOfferFee.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Long taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxCode value for this SOfferFee.
     * 
     * @return taxCode
     */
    public java.lang.Long getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this SOfferFee.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.Long taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the vat value for this SOfferFee.
     * 
     * @return vat
     */
    public java.lang.String getVat() {
        return vat;
    }


    /**
     * Sets the vat value for this SOfferFee.
     * 
     * @param vat
     */
    public void setVat(java.lang.String vat) {
        this.vat = vat;
    }


    /**
     * Gets the vatType value for this SOfferFee.
     * 
     * @return vatType
     */
    public java.lang.String getVatType() {
        return vatType;
    }


    /**
     * Sets the vatType value for this SOfferFee.
     * 
     * @param vatType
     */
    public void setVatType(java.lang.String vatType) {
        this.vatType = vatType;
    }


    /**
     * Gets the invoiceNbr value for this SOfferFee.
     * 
     * @return invoiceNbr
     */
    public java.lang.String getInvoiceNbr() {
        return invoiceNbr;
    }


    /**
     * Sets the invoiceNbr value for this SOfferFee.
     * 
     * @param invoiceNbr
     */
    public void setInvoiceNbr(java.lang.String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }


    /**
     * Gets the measureId value for this SOfferFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SOfferFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the taxInclude value for this SOfferFee.
     * 
     * @return taxInclude
     */
    public java.lang.Integer getTaxInclude() {
        return taxInclude;
    }


    /**
     * Sets the taxInclude value for this SOfferFee.
     * 
     * @param taxInclude
     */
    public void setTaxInclude(java.lang.Integer taxInclude) {
        this.taxInclude = taxInclude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOfferFee)) return false;
        SOfferFee other = (SOfferFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.discountList==null && other.getDiscountList()==null) || 
             (this.discountList!=null &&
              java.util.Arrays.equals(this.discountList, other.getDiscountList()))) &&
            ((this.billingOfferId==null && other.getBillingOfferId()==null) || 
             (this.billingOfferId!=null &&
              this.billingOfferId.equals(other.getBillingOfferId()))) &&
            ((this.billingOfferName==null && other.getBillingOfferName()==null) || 
             (this.billingOfferName!=null &&
              this.billingOfferName.equals(other.getBillingOfferName()))) &&
            ((this.feeItemId==null && other.getFeeItemId()==null) || 
             (this.feeItemId!=null &&
              this.feeItemId.equals(other.getFeeItemId()))) &&
            ((this.busiCode==null && other.getBusiCode()==null) || 
             (this.busiCode!=null &&
              this.busiCode.equals(other.getBusiCode()))) &&
            ((this.feeName==null && other.getFeeName()==null) || 
             (this.feeName!=null &&
              this.feeName.equals(other.getFeeName()))) &&
            ((this.orgCharge==null && other.getOrgCharge()==null) || 
             (this.orgCharge!=null &&
              this.orgCharge.equals(other.getOrgCharge()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.vat==null && other.getVat()==null) || 
             (this.vat!=null &&
              this.vat.equals(other.getVat()))) &&
            ((this.vatType==null && other.getVatType()==null) || 
             (this.vatType!=null &&
              this.vatType.equals(other.getVatType()))) &&
            ((this.invoiceNbr==null && other.getInvoiceNbr()==null) || 
             (this.invoiceNbr!=null &&
              this.invoiceNbr.equals(other.getInvoiceNbr()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.taxInclude==null && other.getTaxInclude()==null) || 
             (this.taxInclude!=null &&
              this.taxInclude.equals(other.getTaxInclude())));
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
        if (getDiscountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingOfferId() != null) {
            _hashCode += getBillingOfferId().hashCode();
        }
        if (getBillingOfferName() != null) {
            _hashCode += getBillingOfferName().hashCode();
        }
        if (getFeeItemId() != null) {
            _hashCode += getFeeItemId().hashCode();
        }
        if (getBusiCode() != null) {
            _hashCode += getBusiCode().hashCode();
        }
        if (getFeeName() != null) {
            _hashCode += getFeeName().hashCode();
        }
        if (getOrgCharge() != null) {
            _hashCode += getOrgCharge().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getVat() != null) {
            _hashCode += getVat().hashCode();
        }
        if (getVatType() != null) {
            _hashCode += getVatType().hashCode();
        }
        if (getInvoiceNbr() != null) {
            _hashCode += getInvoiceNbr().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getTaxInclude() != null) {
            _hashCode += getTaxInclude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOfferFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDiscountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingOfferName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingOfferName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNbr"));
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
        elemField.setFieldName("taxInclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxInclude"));
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
