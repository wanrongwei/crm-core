/**
 * SRefundBalnceTrace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SRefundBalnceTrace  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Long assetId;

    private java.lang.Integer itemType;

    private java.lang.Integer itemId;

    private java.lang.Long orgAmount;

    private java.lang.Long refundAmount;

    private java.lang.Integer measureId;

    private java.util.Calendar dealDate;

    private java.util.Calendar validate;

    private java.util.Calendar expireDate;

    private java.lang.Long soNbr;

    private java.lang.Integer negativeFlag;

    public SRefundBalnceTrace() {
    }

    public SRefundBalnceTrace(
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Long assetId,
           java.lang.Integer itemType,
           java.lang.Integer itemId,
           java.lang.Long orgAmount,
           java.lang.Long refundAmount,
           java.lang.Integer measureId,
           java.util.Calendar dealDate,
           java.util.Calendar validate,
           java.util.Calendar expireDate,
           java.lang.Long soNbr,
           java.lang.Integer negativeFlag) {
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.assetId = assetId;
           this.itemType = itemType;
           this.itemId = itemId;
           this.orgAmount = orgAmount;
           this.refundAmount = refundAmount;
           this.measureId = measureId;
           this.dealDate = dealDate;
           this.validate = validate;
           this.expireDate = expireDate;
           this.soNbr = soNbr;
           this.negativeFlag = negativeFlag;
    }


    /**
     * Gets the acctId value for this SRefundBalnceTrace.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SRefundBalnceTrace.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SRefundBalnceTrace.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SRefundBalnceTrace.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the assetId value for this SRefundBalnceTrace.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this SRefundBalnceTrace.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the itemType value for this SRefundBalnceTrace.
     * 
     * @return itemType
     */
    public java.lang.Integer getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SRefundBalnceTrace.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Integer itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the itemId value for this SRefundBalnceTrace.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SRefundBalnceTrace.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the orgAmount value for this SRefundBalnceTrace.
     * 
     * @return orgAmount
     */
    public java.lang.Long getOrgAmount() {
        return orgAmount;
    }


    /**
     * Sets the orgAmount value for this SRefundBalnceTrace.
     * 
     * @param orgAmount
     */
    public void setOrgAmount(java.lang.Long orgAmount) {
        this.orgAmount = orgAmount;
    }


    /**
     * Gets the refundAmount value for this SRefundBalnceTrace.
     * 
     * @return refundAmount
     */
    public java.lang.Long getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this SRefundBalnceTrace.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.lang.Long refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the measureId value for this SRefundBalnceTrace.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SRefundBalnceTrace.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the dealDate value for this SRefundBalnceTrace.
     * 
     * @return dealDate
     */
    public java.util.Calendar getDealDate() {
        return dealDate;
    }


    /**
     * Sets the dealDate value for this SRefundBalnceTrace.
     * 
     * @param dealDate
     */
    public void setDealDate(java.util.Calendar dealDate) {
        this.dealDate = dealDate;
    }


    /**
     * Gets the validate value for this SRefundBalnceTrace.
     * 
     * @return validate
     */
    public java.util.Calendar getValidate() {
        return validate;
    }


    /**
     * Sets the validate value for this SRefundBalnceTrace.
     * 
     * @param validate
     */
    public void setValidate(java.util.Calendar validate) {
        this.validate = validate;
    }


    /**
     * Gets the expireDate value for this SRefundBalnceTrace.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SRefundBalnceTrace.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the soNbr value for this SRefundBalnceTrace.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this SRefundBalnceTrace.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the negativeFlag value for this SRefundBalnceTrace.
     * 
     * @return negativeFlag
     */
    public java.lang.Integer getNegativeFlag() {
        return negativeFlag;
    }


    /**
     * Sets the negativeFlag value for this SRefundBalnceTrace.
     * 
     * @param negativeFlag
     */
    public void setNegativeFlag(java.lang.Integer negativeFlag) {
        this.negativeFlag = negativeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRefundBalnceTrace)) return false;
        SRefundBalnceTrace other = (SRefundBalnceTrace) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.orgAmount==null && other.getOrgAmount()==null) || 
             (this.orgAmount!=null &&
              this.orgAmount.equals(other.getOrgAmount()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.dealDate==null && other.getDealDate()==null) || 
             (this.dealDate!=null &&
              this.dealDate.equals(other.getDealDate()))) &&
            ((this.validate==null && other.getValidate()==null) || 
             (this.validate!=null &&
              this.validate.equals(other.getValidate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.negativeFlag==null && other.getNegativeFlag()==null) || 
             (this.negativeFlag!=null &&
              this.negativeFlag.equals(other.getNegativeFlag())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getOrgAmount() != null) {
            _hashCode += getOrgAmount().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getDealDate() != null) {
            _hashCode += getDealDate().hashCode();
        }
        if (getValidate() != null) {
            _hashCode += getValidate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getNegativeFlag() != null) {
            _hashCode += getNegativeFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRefundBalnceTrace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundBalnceTrace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("orgAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dealDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeFlag"));
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
