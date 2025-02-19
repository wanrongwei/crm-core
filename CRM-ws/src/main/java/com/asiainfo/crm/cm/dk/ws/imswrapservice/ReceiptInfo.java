/**
 * ReceiptInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class ReceiptInfo  implements java.io.Serializable {
    private java.lang.Long price;

    private java.lang.String quantity;

    private java.lang.Long discount;

    private java.lang.Integer measureId;

    private java.lang.String taxCode;

    private java.lang.Long taxAmount;

    private java.lang.Long feeItemId;

    private java.lang.Long offerId;

    private java.lang.String offerName;

    private java.lang.String opId;

    private java.lang.String orgId;

    private java.lang.String material;

    private java.lang.String outerRefId;

    private java.lang.String discountName;

    private java.lang.Double vat;

    private java.lang.String vatType;

    public ReceiptInfo() {
    }

    public ReceiptInfo(
           java.lang.Long price,
           java.lang.String quantity,
           java.lang.Long discount,
           java.lang.Integer measureId,
           java.lang.String taxCode,
           java.lang.Long taxAmount,
           java.lang.Long feeItemId,
           java.lang.Long offerId,
           java.lang.String offerName,
           java.lang.String opId,
           java.lang.String orgId,
           java.lang.String material,
           java.lang.String outerRefId,
           java.lang.String discountName,
           java.lang.Double vat,
           java.lang.String vatType) {
           this.price = price;
           this.quantity = quantity;
           this.discount = discount;
           this.measureId = measureId;
           this.taxCode = taxCode;
           this.taxAmount = taxAmount;
           this.feeItemId = feeItemId;
           this.offerId = offerId;
           this.offerName = offerName;
           this.opId = opId;
           this.orgId = orgId;
           this.material = material;
           this.outerRefId = outerRefId;
           this.discountName = discountName;
           this.vat = vat;
           this.vatType = vatType;
    }


    /**
     * Gets the price value for this ReceiptInfo.
     * 
     * @return price
     */
    public java.lang.Long getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ReceiptInfo.
     * 
     * @param price
     */
    public void setPrice(java.lang.Long price) {
        this.price = price;
    }


    /**
     * Gets the quantity value for this ReceiptInfo.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ReceiptInfo.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the discount value for this ReceiptInfo.
     * 
     * @return discount
     */
    public java.lang.Long getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this ReceiptInfo.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.Long discount) {
        this.discount = discount;
    }


    /**
     * Gets the measureId value for this ReceiptInfo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this ReceiptInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the taxCode value for this ReceiptInfo.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ReceiptInfo.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxAmount value for this ReceiptInfo.
     * 
     * @return taxAmount
     */
    public java.lang.Long getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this ReceiptInfo.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Long taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the feeItemId value for this ReceiptInfo.
     * 
     * @return feeItemId
     */
    public java.lang.Long getFeeItemId() {
        return feeItemId;
    }


    /**
     * Sets the feeItemId value for this ReceiptInfo.
     * 
     * @param feeItemId
     */
    public void setFeeItemId(java.lang.Long feeItemId) {
        this.feeItemId = feeItemId;
    }


    /**
     * Gets the offerId value for this ReceiptInfo.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this ReceiptInfo.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the offerName value for this ReceiptInfo.
     * 
     * @return offerName
     */
    public java.lang.String getOfferName() {
        return offerName;
    }


    /**
     * Sets the offerName value for this ReceiptInfo.
     * 
     * @param offerName
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }


    /**
     * Gets the opId value for this ReceiptInfo.
     * 
     * @return opId
     */
    public java.lang.String getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this ReceiptInfo.
     * 
     * @param opId
     */
    public void setOpId(java.lang.String opId) {
        this.opId = opId;
    }


    /**
     * Gets the orgId value for this ReceiptInfo.
     * 
     * @return orgId
     */
    public java.lang.String getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this ReceiptInfo.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.String orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the material value for this ReceiptInfo.
     * 
     * @return material
     */
    public java.lang.String getMaterial() {
        return material;
    }


    /**
     * Sets the material value for this ReceiptInfo.
     * 
     * @param material
     */
    public void setMaterial(java.lang.String material) {
        this.material = material;
    }


    /**
     * Gets the outerRefId value for this ReceiptInfo.
     * 
     * @return outerRefId
     */
    public java.lang.String getOuterRefId() {
        return outerRefId;
    }


    /**
     * Sets the outerRefId value for this ReceiptInfo.
     * 
     * @param outerRefId
     */
    public void setOuterRefId(java.lang.String outerRefId) {
        this.outerRefId = outerRefId;
    }


    /**
     * Gets the discountName value for this ReceiptInfo.
     * 
     * @return discountName
     */
    public java.lang.String getDiscountName() {
        return discountName;
    }


    /**
     * Sets the discountName value for this ReceiptInfo.
     * 
     * @param discountName
     */
    public void setDiscountName(java.lang.String discountName) {
        this.discountName = discountName;
    }


    /**
     * Gets the vat value for this ReceiptInfo.
     * 
     * @return vat
     */
    public java.lang.Double getVat() {
        return vat;
    }


    /**
     * Sets the vat value for this ReceiptInfo.
     * 
     * @param vat
     */
    public void setVat(java.lang.Double vat) {
        this.vat = vat;
    }


    /**
     * Gets the vatType value for this ReceiptInfo.
     * 
     * @return vatType
     */
    public java.lang.String getVatType() {
        return vatType;
    }


    /**
     * Sets the vatType value for this ReceiptInfo.
     * 
     * @param vatType
     */
    public void setVatType(java.lang.String vatType) {
        this.vatType = vatType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiptInfo)) return false;
        ReceiptInfo other = (ReceiptInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.feeItemId==null && other.getFeeItemId()==null) || 
             (this.feeItemId!=null &&
              this.feeItemId.equals(other.getFeeItemId()))) &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.offerName==null && other.getOfferName()==null) || 
             (this.offerName!=null &&
              this.offerName.equals(other.getOfferName()))) &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.material==null && other.getMaterial()==null) || 
             (this.material!=null &&
              this.material.equals(other.getMaterial()))) &&
            ((this.outerRefId==null && other.getOuterRefId()==null) || 
             (this.outerRefId!=null &&
              this.outerRefId.equals(other.getOuterRefId()))) &&
            ((this.discountName==null && other.getDiscountName()==null) || 
             (this.discountName!=null &&
              this.discountName.equals(other.getDiscountName()))) &&
            ((this.vat==null && other.getVat()==null) || 
             (this.vat!=null &&
              this.vat.equals(other.getVat()))) &&
            ((this.vatType==null && other.getVatType()==null) || 
             (this.vatType!=null &&
              this.vatType.equals(other.getVatType())));
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
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getFeeItemId() != null) {
            _hashCode += getFeeItemId().hashCode();
        }
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getOfferName() != null) {
            _hashCode += getOfferName().hashCode();
        }
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getMaterial() != null) {
            _hashCode += getMaterial().hashCode();
        }
        if (getOuterRefId() != null) {
            _hashCode += getOuterRefId().hashCode();
        }
        if (getDiscountName() != null) {
            _hashCode += getDiscountName().hashCode();
        }
        if (getVat() != null) {
            _hashCode += getVat().hashCode();
        }
        if (getVatType() != null) {
            _hashCode += getVatType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiptInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "receiptInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount"));
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
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("feeItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemId"));
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
        elemField.setFieldName("offerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("material");
        elemField.setXmlName(new javax.xml.namespace.QName("", "material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerRefId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerRefId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
