/**
 * AdjustMultiBillDtl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AdjustMultiBillDtl  implements java.io.Serializable {
    private java.lang.Short adjustType;

    private java.lang.Integer itemCode;

    private java.lang.Long productId;

    private java.lang.Long adjustFee;

    private java.lang.Short itemType;

    private java.lang.Short recurringFlag;

    private java.util.Calendar orderDate;

    public AdjustMultiBillDtl() {
    }

    public AdjustMultiBillDtl(
           java.lang.Short adjustType,
           java.lang.Integer itemCode,
           java.lang.Long productId,
           java.lang.Long adjustFee,
           java.lang.Short itemType,
           java.lang.Short recurringFlag,
           java.util.Calendar orderDate) {
           this.adjustType = adjustType;
           this.itemCode = itemCode;
           this.productId = productId;
           this.adjustFee = adjustFee;
           this.itemType = itemType;
           this.recurringFlag = recurringFlag;
           this.orderDate = orderDate;
    }


    /**
     * Gets the adjustType value for this AdjustMultiBillDtl.
     * 
     * @return adjustType
     */
    public java.lang.Short getAdjustType() {
        return adjustType;
    }


    /**
     * Sets the adjustType value for this AdjustMultiBillDtl.
     * 
     * @param adjustType
     */
    public void setAdjustType(java.lang.Short adjustType) {
        this.adjustType = adjustType;
    }


    /**
     * Gets the itemCode value for this AdjustMultiBillDtl.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this AdjustMultiBillDtl.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the productId value for this AdjustMultiBillDtl.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this AdjustMultiBillDtl.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the adjustFee value for this AdjustMultiBillDtl.
     * 
     * @return adjustFee
     */
    public java.lang.Long getAdjustFee() {
        return adjustFee;
    }


    /**
     * Sets the adjustFee value for this AdjustMultiBillDtl.
     * 
     * @param adjustFee
     */
    public void setAdjustFee(java.lang.Long adjustFee) {
        this.adjustFee = adjustFee;
    }


    /**
     * Gets the itemType value for this AdjustMultiBillDtl.
     * 
     * @return itemType
     */
    public java.lang.Short getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this AdjustMultiBillDtl.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Short itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the recurringFlag value for this AdjustMultiBillDtl.
     * 
     * @return recurringFlag
     */
    public java.lang.Short getRecurringFlag() {
        return recurringFlag;
    }


    /**
     * Sets the recurringFlag value for this AdjustMultiBillDtl.
     * 
     * @param recurringFlag
     */
    public void setRecurringFlag(java.lang.Short recurringFlag) {
        this.recurringFlag = recurringFlag;
    }


    /**
     * Gets the orderDate value for this AdjustMultiBillDtl.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this AdjustMultiBillDtl.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustMultiBillDtl)) return false;
        AdjustMultiBillDtl other = (AdjustMultiBillDtl) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjustType==null && other.getAdjustType()==null) || 
             (this.adjustType!=null &&
              this.adjustType.equals(other.getAdjustType()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.adjustFee==null && other.getAdjustFee()==null) || 
             (this.adjustFee!=null &&
              this.adjustFee.equals(other.getAdjustFee()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.recurringFlag==null && other.getRecurringFlag()==null) || 
             (this.recurringFlag!=null &&
              this.recurringFlag.equals(other.getRecurringFlag()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate())));
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
        if (getAdjustType() != null) {
            _hashCode += getAdjustType().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getAdjustFee() != null) {
            _hashCode += getAdjustFee().hashCode();
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getRecurringFlag() != null) {
            _hashCode += getRecurringFlag().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustMultiBillDtl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillDtl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
