/**
 * ImsTaxFeeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class ImsTaxFeeDetail  implements java.io.Serializable {
    private java.lang.Integer taxPlanId;

    private java.lang.Integer taxCode;

    private java.lang.Integer measureId;

    private java.lang.Integer deductAmount;

    private java.lang.Integer itemId;

    private java.lang.Integer baseAmount;

    private java.lang.String taxName;

    private java.lang.Integer precisionRound;

    private java.lang.Integer taxLevel;

    private java.lang.Long fixTax;

    private java.lang.Integer denominator;

    private java.lang.Integer numerator;

    public ImsTaxFeeDetail() {
    }

    public ImsTaxFeeDetail(
           java.lang.Integer taxPlanId,
           java.lang.Integer taxCode,
           java.lang.Integer measureId,
           java.lang.Integer deductAmount,
           java.lang.Integer itemId,
           java.lang.Integer baseAmount,
           java.lang.String taxName,
           java.lang.Integer precisionRound,
           java.lang.Integer taxLevel,
           java.lang.Long fixTax,
           java.lang.Integer denominator,
           java.lang.Integer numerator) {
           this.taxPlanId = taxPlanId;
           this.taxCode = taxCode;
           this.measureId = measureId;
           this.deductAmount = deductAmount;
           this.itemId = itemId;
           this.baseAmount = baseAmount;
           this.taxName = taxName;
           this.precisionRound = precisionRound;
           this.taxLevel = taxLevel;
           this.fixTax = fixTax;
           this.denominator = denominator;
           this.numerator = numerator;
    }


    /**
     * Gets the taxPlanId value for this ImsTaxFeeDetail.
     * 
     * @return taxPlanId
     */
    public java.lang.Integer getTaxPlanId() {
        return taxPlanId;
    }


    /**
     * Sets the taxPlanId value for this ImsTaxFeeDetail.
     * 
     * @param taxPlanId
     */
    public void setTaxPlanId(java.lang.Integer taxPlanId) {
        this.taxPlanId = taxPlanId;
    }


    /**
     * Gets the taxCode value for this ImsTaxFeeDetail.
     * 
     * @return taxCode
     */
    public java.lang.Integer getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ImsTaxFeeDetail.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.Integer taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the measureId value for this ImsTaxFeeDetail.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this ImsTaxFeeDetail.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the deductAmount value for this ImsTaxFeeDetail.
     * 
     * @return deductAmount
     */
    public java.lang.Integer getDeductAmount() {
        return deductAmount;
    }


    /**
     * Sets the deductAmount value for this ImsTaxFeeDetail.
     * 
     * @param deductAmount
     */
    public void setDeductAmount(java.lang.Integer deductAmount) {
        this.deductAmount = deductAmount;
    }


    /**
     * Gets the itemId value for this ImsTaxFeeDetail.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ImsTaxFeeDetail.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the baseAmount value for this ImsTaxFeeDetail.
     * 
     * @return baseAmount
     */
    public java.lang.Integer getBaseAmount() {
        return baseAmount;
    }


    /**
     * Sets the baseAmount value for this ImsTaxFeeDetail.
     * 
     * @param baseAmount
     */
    public void setBaseAmount(java.lang.Integer baseAmount) {
        this.baseAmount = baseAmount;
    }


    /**
     * Gets the taxName value for this ImsTaxFeeDetail.
     * 
     * @return taxName
     */
    public java.lang.String getTaxName() {
        return taxName;
    }


    /**
     * Sets the taxName value for this ImsTaxFeeDetail.
     * 
     * @param taxName
     */
    public void setTaxName(java.lang.String taxName) {
        this.taxName = taxName;
    }


    /**
     * Gets the precisionRound value for this ImsTaxFeeDetail.
     * 
     * @return precisionRound
     */
    public java.lang.Integer getPrecisionRound() {
        return precisionRound;
    }


    /**
     * Sets the precisionRound value for this ImsTaxFeeDetail.
     * 
     * @param precisionRound
     */
    public void setPrecisionRound(java.lang.Integer precisionRound) {
        this.precisionRound = precisionRound;
    }


    /**
     * Gets the taxLevel value for this ImsTaxFeeDetail.
     * 
     * @return taxLevel
     */
    public java.lang.Integer getTaxLevel() {
        return taxLevel;
    }


    /**
     * Sets the taxLevel value for this ImsTaxFeeDetail.
     * 
     * @param taxLevel
     */
    public void setTaxLevel(java.lang.Integer taxLevel) {
        this.taxLevel = taxLevel;
    }


    /**
     * Gets the fixTax value for this ImsTaxFeeDetail.
     * 
     * @return fixTax
     */
    public java.lang.Long getFixTax() {
        return fixTax;
    }


    /**
     * Sets the fixTax value for this ImsTaxFeeDetail.
     * 
     * @param fixTax
     */
    public void setFixTax(java.lang.Long fixTax) {
        this.fixTax = fixTax;
    }


    /**
     * Gets the denominator value for this ImsTaxFeeDetail.
     * 
     * @return denominator
     */
    public java.lang.Integer getDenominator() {
        return denominator;
    }


    /**
     * Sets the denominator value for this ImsTaxFeeDetail.
     * 
     * @param denominator
     */
    public void setDenominator(java.lang.Integer denominator) {
        this.denominator = denominator;
    }


    /**
     * Gets the numerator value for this ImsTaxFeeDetail.
     * 
     * @return numerator
     */
    public java.lang.Integer getNumerator() {
        return numerator;
    }


    /**
     * Sets the numerator value for this ImsTaxFeeDetail.
     * 
     * @param numerator
     */
    public void setNumerator(java.lang.Integer numerator) {
        this.numerator = numerator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImsTaxFeeDetail)) return false;
        ImsTaxFeeDetail other = (ImsTaxFeeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxPlanId==null && other.getTaxPlanId()==null) || 
             (this.taxPlanId!=null &&
              this.taxPlanId.equals(other.getTaxPlanId()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.deductAmount==null && other.getDeductAmount()==null) || 
             (this.deductAmount!=null &&
              this.deductAmount.equals(other.getDeductAmount()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.baseAmount==null && other.getBaseAmount()==null) || 
             (this.baseAmount!=null &&
              this.baseAmount.equals(other.getBaseAmount()))) &&
            ((this.taxName==null && other.getTaxName()==null) || 
             (this.taxName!=null &&
              this.taxName.equals(other.getTaxName()))) &&
            ((this.precisionRound==null && other.getPrecisionRound()==null) || 
             (this.precisionRound!=null &&
              this.precisionRound.equals(other.getPrecisionRound()))) &&
            ((this.taxLevel==null && other.getTaxLevel()==null) || 
             (this.taxLevel!=null &&
              this.taxLevel.equals(other.getTaxLevel()))) &&
            ((this.fixTax==null && other.getFixTax()==null) || 
             (this.fixTax!=null &&
              this.fixTax.equals(other.getFixTax()))) &&
            ((this.denominator==null && other.getDenominator()==null) || 
             (this.denominator!=null &&
              this.denominator.equals(other.getDenominator()))) &&
            ((this.numerator==null && other.getNumerator()==null) || 
             (this.numerator!=null &&
              this.numerator.equals(other.getNumerator())));
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
        if (getTaxPlanId() != null) {
            _hashCode += getTaxPlanId().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getDeductAmount() != null) {
            _hashCode += getDeductAmount().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getBaseAmount() != null) {
            _hashCode += getBaseAmount().hashCode();
        }
        if (getTaxName() != null) {
            _hashCode += getTaxName().hashCode();
        }
        if (getPrecisionRound() != null) {
            _hashCode += getPrecisionRound().hashCode();
        }
        if (getTaxLevel() != null) {
            _hashCode += getTaxLevel().hashCode();
        }
        if (getFixTax() != null) {
            _hashCode += getFixTax().hashCode();
        }
        if (getDenominator() != null) {
            _hashCode += getDenominator().hashCode();
        }
        if (getNumerator() != null) {
            _hashCode += getNumerator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImsTaxFeeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsTaxFeeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
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
        elemField.setFieldName("deductAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precisionRound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precisionRound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fixTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denominator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numerator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numerator"));
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
