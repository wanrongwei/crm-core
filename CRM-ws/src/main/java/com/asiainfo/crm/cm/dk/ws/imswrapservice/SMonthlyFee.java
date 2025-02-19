/**
 * SMonthlyFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SMonthlyFee  implements java.io.Serializable {
    private java.lang.Integer priceId;

    private java.lang.Integer itemCode;

    private java.lang.String itemName;

    private java.lang.Long amount;

    private java.lang.Long proratedAmount;

    private java.lang.Integer measureId;

    private java.lang.String measureName;

    public SMonthlyFee() {
    }

    public SMonthlyFee(
           java.lang.Integer priceId,
           java.lang.Integer itemCode,
           java.lang.String itemName,
           java.lang.Long amount,
           java.lang.Long proratedAmount,
           java.lang.Integer measureId,
           java.lang.String measureName) {
           this.priceId = priceId;
           this.itemCode = itemCode;
           this.itemName = itemName;
           this.amount = amount;
           this.proratedAmount = proratedAmount;
           this.measureId = measureId;
           this.measureName = measureName;
    }


    /**
     * Gets the priceId value for this SMonthlyFee.
     * 
     * @return priceId
     */
    public java.lang.Integer getPriceId() {
        return priceId;
    }


    /**
     * Sets the priceId value for this SMonthlyFee.
     * 
     * @param priceId
     */
    public void setPriceId(java.lang.Integer priceId) {
        this.priceId = priceId;
    }


    /**
     * Gets the itemCode value for this SMonthlyFee.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this SMonthlyFee.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the itemName value for this SMonthlyFee.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this SMonthlyFee.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the amount value for this SMonthlyFee.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SMonthlyFee.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the proratedAmount value for this SMonthlyFee.
     * 
     * @return proratedAmount
     */
    public java.lang.Long getProratedAmount() {
        return proratedAmount;
    }


    /**
     * Sets the proratedAmount value for this SMonthlyFee.
     * 
     * @param proratedAmount
     */
    public void setProratedAmount(java.lang.Long proratedAmount) {
        this.proratedAmount = proratedAmount;
    }


    /**
     * Gets the measureId value for this SMonthlyFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SMonthlyFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the measureName value for this SMonthlyFee.
     * 
     * @return measureName
     */
    public java.lang.String getMeasureName() {
        return measureName;
    }


    /**
     * Sets the measureName value for this SMonthlyFee.
     * 
     * @param measureName
     */
    public void setMeasureName(java.lang.String measureName) {
        this.measureName = measureName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMonthlyFee)) return false;
        SMonthlyFee other = (SMonthlyFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.priceId==null && other.getPriceId()==null) || 
             (this.priceId!=null &&
              this.priceId.equals(other.getPriceId()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.proratedAmount==null && other.getProratedAmount()==null) || 
             (this.proratedAmount!=null &&
              this.proratedAmount.equals(other.getProratedAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.measureName==null && other.getMeasureName()==null) || 
             (this.measureName!=null &&
              this.measureName.equals(other.getMeasureName())));
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
        if (getPriceId() != null) {
            _hashCode += getPriceId().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getProratedAmount() != null) {
            _hashCode += getProratedAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getMeasureName() != null) {
            _hashCode += getMeasureName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMonthlyFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMonthlyFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceId"));
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
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proratedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proratedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("measureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
