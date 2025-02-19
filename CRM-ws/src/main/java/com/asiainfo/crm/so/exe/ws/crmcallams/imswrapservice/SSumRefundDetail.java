/**
 * SSumRefundDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SSumRefundDetail  implements java.io.Serializable {
    private java.lang.Long assetId;

    private java.lang.Integer itemType;

    private java.lang.Integer itemId;

    private java.lang.Long refundAmount;

    private java.lang.Long reqAmount;

    private java.lang.Long orgBalance;

    private java.lang.Integer measureId;

    private java.lang.Boolean isPartial;

    public SSumRefundDetail() {
    }

    public SSumRefundDetail(
           java.lang.Long assetId,
           java.lang.Integer itemType,
           java.lang.Integer itemId,
           java.lang.Long refundAmount,
           java.lang.Long reqAmount,
           java.lang.Long orgBalance,
           java.lang.Integer measureId,
           java.lang.Boolean isPartial) {
           this.assetId = assetId;
           this.itemType = itemType;
           this.itemId = itemId;
           this.refundAmount = refundAmount;
           this.reqAmount = reqAmount;
           this.orgBalance = orgBalance;
           this.measureId = measureId;
           this.isPartial = isPartial;
    }


    /**
     * Gets the assetId value for this SSumRefundDetail.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this SSumRefundDetail.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the itemType value for this SSumRefundDetail.
     * 
     * @return itemType
     */
    public java.lang.Integer getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SSumRefundDetail.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Integer itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the itemId value for this SSumRefundDetail.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SSumRefundDetail.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the refundAmount value for this SSumRefundDetail.
     * 
     * @return refundAmount
     */
    public java.lang.Long getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this SSumRefundDetail.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.lang.Long refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the reqAmount value for this SSumRefundDetail.
     * 
     * @return reqAmount
     */
    public java.lang.Long getReqAmount() {
        return reqAmount;
    }


    /**
     * Sets the reqAmount value for this SSumRefundDetail.
     * 
     * @param reqAmount
     */
    public void setReqAmount(java.lang.Long reqAmount) {
        this.reqAmount = reqAmount;
    }


    /**
     * Gets the orgBalance value for this SSumRefundDetail.
     * 
     * @return orgBalance
     */
    public java.lang.Long getOrgBalance() {
        return orgBalance;
    }


    /**
     * Sets the orgBalance value for this SSumRefundDetail.
     * 
     * @param orgBalance
     */
    public void setOrgBalance(java.lang.Long orgBalance) {
        this.orgBalance = orgBalance;
    }


    /**
     * Gets the measureId value for this SSumRefundDetail.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SSumRefundDetail.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the isPartial value for this SSumRefundDetail.
     * 
     * @return isPartial
     */
    public java.lang.Boolean getIsPartial() {
        return isPartial;
    }


    /**
     * Sets the isPartial value for this SSumRefundDetail.
     * 
     * @param isPartial
     */
    public void setIsPartial(java.lang.Boolean isPartial) {
        this.isPartial = isPartial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SSumRefundDetail)) return false;
        SSumRefundDetail other = (SSumRefundDetail) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.reqAmount==null && other.getReqAmount()==null) || 
             (this.reqAmount!=null &&
              this.reqAmount.equals(other.getReqAmount()))) &&
            ((this.orgBalance==null && other.getOrgBalance()==null) || 
             (this.orgBalance!=null &&
              this.orgBalance.equals(other.getOrgBalance()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.isPartial==null && other.getIsPartial()==null) || 
             (this.isPartial!=null &&
              this.isPartial.equals(other.getIsPartial())));
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
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getReqAmount() != null) {
            _hashCode += getReqAmount().hashCode();
        }
        if (getOrgBalance() != null) {
            _hashCode += getOrgBalance().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getIsPartial() != null) {
            _hashCode += getIsPartial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SSumRefundDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSumRefundDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemType"));
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
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgBalance"));
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
        elemField.setFieldName("isPartial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPartial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
