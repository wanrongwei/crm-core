/**
 * FeeItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class FeeItem  implements java.io.Serializable {
    private java.lang.Short orderType;

    private java.lang.Long itemCode;

    private java.lang.Integer costCode;

    private java.lang.Short chargeType;

    private java.lang.Double amount;

    private java.lang.Integer billType;

    private java.lang.Long soOnetimeId;

    private java.lang.Long onetimeSeq;

    private java.lang.String remark;

    private java.lang.Integer measureId;

    private java.lang.String chargeDate;

    public FeeItem() {
    }

    public FeeItem(
           java.lang.Short orderType,
           java.lang.Long itemCode,
           java.lang.Integer costCode,
           java.lang.Short chargeType,
           java.lang.Double amount,
           java.lang.Integer billType,
           java.lang.Long soOnetimeId,
           java.lang.Long onetimeSeq,
           java.lang.String remark,
           java.lang.Integer measureId,
           java.lang.String chargeDate) {
           this.orderType = orderType;
           this.itemCode = itemCode;
           this.costCode = costCode;
           this.chargeType = chargeType;
           this.amount = amount;
           this.billType = billType;
           this.soOnetimeId = soOnetimeId;
           this.onetimeSeq = onetimeSeq;
           this.remark = remark;
           this.measureId = measureId;
           this.chargeDate = chargeDate;
    }


    /**
     * Gets the orderType value for this FeeItem.
     * 
     * @return orderType
     */
    public java.lang.Short getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this FeeItem.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.Short orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the itemCode value for this FeeItem.
     * 
     * @return itemCode
     */
    public java.lang.Long getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this FeeItem.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Long itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the costCode value for this FeeItem.
     * 
     * @return costCode
     */
    public java.lang.Integer getCostCode() {
        return costCode;
    }


    /**
     * Sets the costCode value for this FeeItem.
     * 
     * @param costCode
     */
    public void setCostCode(java.lang.Integer costCode) {
        this.costCode = costCode;
    }


    /**
     * Gets the chargeType value for this FeeItem.
     * 
     * @return chargeType
     */
    public java.lang.Short getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this FeeItem.
     * 
     * @param chargeType
     */
    public void setChargeType(java.lang.Short chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the amount value for this FeeItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FeeItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the billType value for this FeeItem.
     * 
     * @return billType
     */
    public java.lang.Integer getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this FeeItem.
     * 
     * @param billType
     */
    public void setBillType(java.lang.Integer billType) {
        this.billType = billType;
    }


    /**
     * Gets the soOnetimeId value for this FeeItem.
     * 
     * @return soOnetimeId
     */
    public java.lang.Long getSoOnetimeId() {
        return soOnetimeId;
    }


    /**
     * Sets the soOnetimeId value for this FeeItem.
     * 
     * @param soOnetimeId
     */
    public void setSoOnetimeId(java.lang.Long soOnetimeId) {
        this.soOnetimeId = soOnetimeId;
    }


    /**
     * Gets the onetimeSeq value for this FeeItem.
     * 
     * @return onetimeSeq
     */
    public java.lang.Long getOnetimeSeq() {
        return onetimeSeq;
    }


    /**
     * Sets the onetimeSeq value for this FeeItem.
     * 
     * @param onetimeSeq
     */
    public void setOnetimeSeq(java.lang.Long onetimeSeq) {
        this.onetimeSeq = onetimeSeq;
    }


    /**
     * Gets the remark value for this FeeItem.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this FeeItem.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the measureId value for this FeeItem.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this FeeItem.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the chargeDate value for this FeeItem.
     * 
     * @return chargeDate
     */
    public java.lang.String getChargeDate() {
        return chargeDate;
    }


    /**
     * Sets the chargeDate value for this FeeItem.
     * 
     * @param chargeDate
     */
    public void setChargeDate(java.lang.String chargeDate) {
        this.chargeDate = chargeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeeItem)) return false;
        FeeItem other = (FeeItem) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.costCode==null && other.getCostCode()==null) || 
             (this.costCode!=null &&
              this.costCode.equals(other.getCostCode()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.soOnetimeId==null && other.getSoOnetimeId()==null) || 
             (this.soOnetimeId!=null &&
              this.soOnetimeId.equals(other.getSoOnetimeId()))) &&
            ((this.onetimeSeq==null && other.getOnetimeSeq()==null) || 
             (this.onetimeSeq!=null &&
              this.onetimeSeq.equals(other.getOnetimeSeq()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.chargeDate==null && other.getChargeDate()==null) || 
             (this.chargeDate!=null &&
              this.chargeDate.equals(other.getChargeDate())));
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
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getCostCode() != null) {
            _hashCode += getCostCode().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getSoOnetimeId() != null) {
            _hashCode += getSoOnetimeId().hashCode();
        }
        if (getOnetimeSeq() != null) {
            _hashCode += getOnetimeSeq().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getChargeDate() != null) {
            _hashCode += getChargeDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeeItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soOnetimeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soOnetimeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onetimeSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onetimeSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
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
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeDate"));
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
