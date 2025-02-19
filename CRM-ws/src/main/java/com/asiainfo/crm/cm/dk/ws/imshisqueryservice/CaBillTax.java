/**
 * CaBillTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class CaBillTax  implements java.io.Serializable {
    private java.lang.Long billNO;

    private java.lang.Integer denominator;

    private java.lang.Integer itemCode;

    private java.lang.Integer numerator;

    private java.lang.Long productId;

    private java.lang.Integer taxCode;

    private java.lang.Long taxFee;

    public CaBillTax() {
    }

    public CaBillTax(
           java.lang.Long billNO,
           java.lang.Integer denominator,
           java.lang.Integer itemCode,
           java.lang.Integer numerator,
           java.lang.Long productId,
           java.lang.Integer taxCode,
           java.lang.Long taxFee) {
           this.billNO = billNO;
           this.denominator = denominator;
           this.itemCode = itemCode;
           this.numerator = numerator;
           this.productId = productId;
           this.taxCode = taxCode;
           this.taxFee = taxFee;
    }


    /**
     * Gets the billNO value for this CaBillTax.
     * 
     * @return billNO
     */
    public java.lang.Long getBillNO() {
        return billNO;
    }


    /**
     * Sets the billNO value for this CaBillTax.
     * 
     * @param billNO
     */
    public void setBillNO(java.lang.Long billNO) {
        this.billNO = billNO;
    }


    /**
     * Gets the denominator value for this CaBillTax.
     * 
     * @return denominator
     */
    public java.lang.Integer getDenominator() {
        return denominator;
    }


    /**
     * Sets the denominator value for this CaBillTax.
     * 
     * @param denominator
     */
    public void setDenominator(java.lang.Integer denominator) {
        this.denominator = denominator;
    }


    /**
     * Gets the itemCode value for this CaBillTax.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this CaBillTax.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the numerator value for this CaBillTax.
     * 
     * @return numerator
     */
    public java.lang.Integer getNumerator() {
        return numerator;
    }


    /**
     * Sets the numerator value for this CaBillTax.
     * 
     * @param numerator
     */
    public void setNumerator(java.lang.Integer numerator) {
        this.numerator = numerator;
    }


    /**
     * Gets the productId value for this CaBillTax.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CaBillTax.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the taxCode value for this CaBillTax.
     * 
     * @return taxCode
     */
    public java.lang.Integer getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this CaBillTax.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.Integer taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxFee value for this CaBillTax.
     * 
     * @return taxFee
     */
    public java.lang.Long getTaxFee() {
        return taxFee;
    }


    /**
     * Sets the taxFee value for this CaBillTax.
     * 
     * @param taxFee
     */
    public void setTaxFee(java.lang.Long taxFee) {
        this.taxFee = taxFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaBillTax)) return false;
        CaBillTax other = (CaBillTax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billNO==null && other.getBillNO()==null) || 
             (this.billNO!=null &&
              this.billNO.equals(other.getBillNO()))) &&
            ((this.denominator==null && other.getDenominator()==null) || 
             (this.denominator!=null &&
              this.denominator.equals(other.getDenominator()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.numerator==null && other.getNumerator()==null) || 
             (this.numerator!=null &&
              this.numerator.equals(other.getNumerator()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxFee==null && other.getTaxFee()==null) || 
             (this.taxFee!=null &&
              this.taxFee.equals(other.getTaxFee())));
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
        if (getBillNO() != null) {
            _hashCode += getBillNO().hashCode();
        }
        if (getDenominator() != null) {
            _hashCode += getDenominator().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getNumerator() != null) {
            _hashCode += getNumerator().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxFee() != null) {
            _hashCode += getTaxFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaBillTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billNO"));
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
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
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
        elemField.setFieldName("taxFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
