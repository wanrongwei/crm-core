/**
 * SFeeItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SFeeItem  implements java.io.Serializable {
    private java.lang.Integer feeItemId;

    private java.lang.Long amount;

    private java.lang.Long taxAmount;

    private java.lang.Integer taxCode;

    private java.lang.Integer measureId;

    public SFeeItem() {
    }

    public SFeeItem(
           java.lang.Integer feeItemId,
           java.lang.Long amount,
           java.lang.Long taxAmount,
           java.lang.Integer taxCode,
           java.lang.Integer measureId) {
           this.feeItemId = feeItemId;
           this.amount = amount;
           this.taxAmount = taxAmount;
           this.taxCode = taxCode;
           this.measureId = measureId;
    }


    /**
     * Gets the feeItemId value for this SFeeItem.
     * 
     * @return feeItemId
     */
    public java.lang.Integer getFeeItemId() {
        return feeItemId;
    }


    /**
     * Sets the feeItemId value for this SFeeItem.
     * 
     * @param feeItemId
     */
    public void setFeeItemId(java.lang.Integer feeItemId) {
        this.feeItemId = feeItemId;
    }


    /**
     * Gets the amount value for this SFeeItem.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SFeeItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the taxAmount value for this SFeeItem.
     * 
     * @return taxAmount
     */
    public java.lang.Long getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this SFeeItem.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Long taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxCode value for this SFeeItem.
     * 
     * @return taxCode
     */
    public java.lang.Integer getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this SFeeItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.Integer taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the measureId value for this SFeeItem.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SFeeItem.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SFeeItem)) return false;
        SFeeItem other = (SFeeItem) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feeItemId==null && other.getFeeItemId()==null) || 
             (this.feeItemId!=null &&
              this.feeItemId.equals(other.getFeeItemId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
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
        if (getFeeItemId() != null) {
            _hashCode += getFeeItemId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SFeeItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFeeItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
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
