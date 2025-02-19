/**
 * CaBillProd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class CaBillProd  implements java.io.Serializable {
    private java.lang.Long billNo;

    private int feeType;

    private java.lang.Integer itemCode;

    private java.lang.Long primalFee;

    private java.lang.Long productId;

    private java.lang.String productName;

    private long unit;

    private java.lang.Integer taxInclude;

    private java.lang.Integer priceId;

    private java.lang.String beginDate;

    private java.lang.String endDate;

    private java.lang.Integer unitId;

    private java.lang.Integer chargeSts;

    public CaBillProd() {
    }

    public CaBillProd(
           java.lang.Long billNo,
           int feeType,
           java.lang.Integer itemCode,
           java.lang.Long primalFee,
           java.lang.Long productId,
           java.lang.String productName,
           long unit,
           java.lang.Integer taxInclude,
           java.lang.Integer priceId,
           java.lang.String beginDate,
           java.lang.String endDate,
           java.lang.Integer unitId,
           java.lang.Integer chargeSts) {
           this.billNo = billNo;
           this.feeType = feeType;
           this.itemCode = itemCode;
           this.primalFee = primalFee;
           this.productId = productId;
           this.productName = productName;
           this.unit = unit;
           this.taxInclude = taxInclude;
           this.priceId = priceId;
           this.beginDate = beginDate;
           this.endDate = endDate;
           this.unitId = unitId;
           this.chargeSts = chargeSts;
    }


    /**
     * Gets the billNo value for this CaBillProd.
     * 
     * @return billNo
     */
    public java.lang.Long getBillNo() {
        return billNo;
    }


    /**
     * Sets the billNo value for this CaBillProd.
     * 
     * @param billNo
     */
    public void setBillNo(java.lang.Long billNo) {
        this.billNo = billNo;
    }


    /**
     * Gets the feeType value for this CaBillProd.
     * 
     * @return feeType
     */
    public int getFeeType() {
        return feeType;
    }


    /**
     * Sets the feeType value for this CaBillProd.
     * 
     * @param feeType
     */
    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }


    /**
     * Gets the itemCode value for this CaBillProd.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this CaBillProd.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the primalFee value for this CaBillProd.
     * 
     * @return primalFee
     */
    public java.lang.Long getPrimalFee() {
        return primalFee;
    }


    /**
     * Sets the primalFee value for this CaBillProd.
     * 
     * @param primalFee
     */
    public void setPrimalFee(java.lang.Long primalFee) {
        this.primalFee = primalFee;
    }


    /**
     * Gets the productId value for this CaBillProd.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CaBillProd.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the productName value for this CaBillProd.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this CaBillProd.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the unit value for this CaBillProd.
     * 
     * @return unit
     */
    public long getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this CaBillProd.
     * 
     * @param unit
     */
    public void setUnit(long unit) {
        this.unit = unit;
    }


    /**
     * Gets the taxInclude value for this CaBillProd.
     * 
     * @return taxInclude
     */
    public java.lang.Integer getTaxInclude() {
        return taxInclude;
    }


    /**
     * Sets the taxInclude value for this CaBillProd.
     * 
     * @param taxInclude
     */
    public void setTaxInclude(java.lang.Integer taxInclude) {
        this.taxInclude = taxInclude;
    }


    /**
     * Gets the priceId value for this CaBillProd.
     * 
     * @return priceId
     */
    public java.lang.Integer getPriceId() {
        return priceId;
    }


    /**
     * Sets the priceId value for this CaBillProd.
     * 
     * @param priceId
     */
    public void setPriceId(java.lang.Integer priceId) {
        this.priceId = priceId;
    }


    /**
     * Gets the beginDate value for this CaBillProd.
     * 
     * @return beginDate
     */
    public java.lang.String getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this CaBillProd.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.lang.String beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDate value for this CaBillProd.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CaBillProd.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the unitId value for this CaBillProd.
     * 
     * @return unitId
     */
    public java.lang.Integer getUnitId() {
        return unitId;
    }


    /**
     * Sets the unitId value for this CaBillProd.
     * 
     * @param unitId
     */
    public void setUnitId(java.lang.Integer unitId) {
        this.unitId = unitId;
    }


    /**
     * Gets the chargeSts value for this CaBillProd.
     * 
     * @return chargeSts
     */
    public java.lang.Integer getChargeSts() {
        return chargeSts;
    }


    /**
     * Sets the chargeSts value for this CaBillProd.
     * 
     * @param chargeSts
     */
    public void setChargeSts(java.lang.Integer chargeSts) {
        this.chargeSts = chargeSts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaBillProd)) return false;
        CaBillProd other = (CaBillProd) obj;
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
            this.feeType == other.getFeeType() &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.primalFee==null && other.getPrimalFee()==null) || 
             (this.primalFee!=null &&
              this.primalFee.equals(other.getPrimalFee()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            this.unit == other.getUnit() &&
            ((this.taxInclude==null && other.getTaxInclude()==null) || 
             (this.taxInclude!=null &&
              this.taxInclude.equals(other.getTaxInclude()))) &&
            ((this.priceId==null && other.getPriceId()==null) || 
             (this.priceId!=null &&
              this.priceId.equals(other.getPriceId()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.unitId==null && other.getUnitId()==null) || 
             (this.unitId!=null &&
              this.unitId.equals(other.getUnitId()))) &&
            ((this.chargeSts==null && other.getChargeSts()==null) || 
             (this.chargeSts!=null &&
              this.chargeSts.equals(other.getChargeSts())));
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
        _hashCode += getFeeType();
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getPrimalFee() != null) {
            _hashCode += getPrimalFee().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        _hashCode += new Long(getUnit()).hashCode();
        if (getTaxInclude() != null) {
            _hashCode += getTaxInclude().hashCode();
        }
        if (getPriceId() != null) {
            _hashCode += getPriceId().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getUnitId() != null) {
            _hashCode += getUnitId().hashCode();
        }
        if (getChargeSts() != null) {
            _hashCode += getChargeSts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaBillProd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxInclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("unitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeSts"));
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
