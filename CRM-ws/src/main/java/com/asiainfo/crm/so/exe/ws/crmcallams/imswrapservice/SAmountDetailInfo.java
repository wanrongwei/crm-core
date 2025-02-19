/**
 * SAmountDetailInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SAmountDetailInfo  implements java.io.Serializable {
    private java.lang.Long amount;

    private java.lang.Long taxAmount;

    private java.lang.Integer taxCode;

    private java.lang.Integer itemCode;

    private java.lang.Integer measureId;

    private java.lang.String adjReason;

    private java.lang.Integer adjCode;

    public SAmountDetailInfo() {
    }

    public SAmountDetailInfo(
           java.lang.Long amount,
           java.lang.Long taxAmount,
           java.lang.Integer taxCode,
           java.lang.Integer itemCode,
           java.lang.Integer measureId,
           java.lang.String adjReason,
           java.lang.Integer adjCode) {
           this.amount = amount;
           this.taxAmount = taxAmount;
           this.taxCode = taxCode;
           this.itemCode = itemCode;
           this.measureId = measureId;
           this.adjReason = adjReason;
           this.adjCode = adjCode;
    }


    /**
     * Gets the amount value for this SAmountDetailInfo.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SAmountDetailInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the taxAmount value for this SAmountDetailInfo.
     * 
     * @return taxAmount
     */
    public java.lang.Long getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this SAmountDetailInfo.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Long taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxCode value for this SAmountDetailInfo.
     * 
     * @return taxCode
     */
    public java.lang.Integer getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this SAmountDetailInfo.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.Integer taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the itemCode value for this SAmountDetailInfo.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this SAmountDetailInfo.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the measureId value for this SAmountDetailInfo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SAmountDetailInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the adjReason value for this SAmountDetailInfo.
     * 
     * @return adjReason
     */
    public java.lang.String getAdjReason() {
        return adjReason;
    }


    /**
     * Sets the adjReason value for this SAmountDetailInfo.
     * 
     * @param adjReason
     */
    public void setAdjReason(java.lang.String adjReason) {
        this.adjReason = adjReason;
    }


    /**
     * Gets the adjCode value for this SAmountDetailInfo.
     * 
     * @return adjCode
     */
    public java.lang.Integer getAdjCode() {
        return adjCode;
    }


    /**
     * Sets the adjCode value for this SAmountDetailInfo.
     * 
     * @param adjCode
     */
    public void setAdjCode(java.lang.Integer adjCode) {
        this.adjCode = adjCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAmountDetailInfo)) return false;
        SAmountDetailInfo other = (SAmountDetailInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.adjReason==null && other.getAdjReason()==null) || 
             (this.adjReason!=null &&
              this.adjReason.equals(other.getAdjReason()))) &&
            ((this.adjCode==null && other.getAdjCode()==null) || 
             (this.adjCode!=null &&
              this.adjCode.equals(other.getAdjCode())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAdjReason() != null) {
            _hashCode += getAdjReason().hashCode();
        }
        if (getAdjCode() != null) {
            _hashCode += getAdjCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAmountDetailInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAmountDetailInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjCode"));
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
