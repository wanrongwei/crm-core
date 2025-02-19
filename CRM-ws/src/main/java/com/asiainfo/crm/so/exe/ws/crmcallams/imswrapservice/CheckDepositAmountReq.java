/**
 * CheckDepositAmountReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class CheckDepositAmountReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String phoneId;

    private java.lang.Integer measureId;

    private java.lang.Long amount;

    private java.lang.Integer ownerType;

    private java.lang.Long relateResourceId;

    private java.lang.Integer rechargeServiceId;

    private java.lang.Integer rechargeMethod;

    private java.lang.String remark;

    private java.lang.String partnerId;

    public CheckDepositAmountReq() {
    }

    public CheckDepositAmountReq(
           java.lang.Long acctId,
           java.lang.String phoneId,
           java.lang.Integer measureId,
           java.lang.Long amount,
           java.lang.Integer ownerType,
           java.lang.Long relateResourceId,
           java.lang.Integer rechargeServiceId,
           java.lang.Integer rechargeMethod,
           java.lang.String remark,
           java.lang.String partnerId) {
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.measureId = measureId;
           this.amount = amount;
           this.ownerType = ownerType;
           this.relateResourceId = relateResourceId;
           this.rechargeServiceId = rechargeServiceId;
           this.rechargeMethod = rechargeMethod;
           this.remark = remark;
           this.partnerId = partnerId;
    }


    /**
     * Gets the acctId value for this CheckDepositAmountReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this CheckDepositAmountReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this CheckDepositAmountReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this CheckDepositAmountReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the measureId value for this CheckDepositAmountReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this CheckDepositAmountReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the amount value for this CheckDepositAmountReq.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CheckDepositAmountReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the ownerType value for this CheckDepositAmountReq.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this CheckDepositAmountReq.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the relateResourceId value for this CheckDepositAmountReq.
     * 
     * @return relateResourceId
     */
    public java.lang.Long getRelateResourceId() {
        return relateResourceId;
    }


    /**
     * Sets the relateResourceId value for this CheckDepositAmountReq.
     * 
     * @param relateResourceId
     */
    public void setRelateResourceId(java.lang.Long relateResourceId) {
        this.relateResourceId = relateResourceId;
    }


    /**
     * Gets the rechargeServiceId value for this CheckDepositAmountReq.
     * 
     * @return rechargeServiceId
     */
    public java.lang.Integer getRechargeServiceId() {
        return rechargeServiceId;
    }


    /**
     * Sets the rechargeServiceId value for this CheckDepositAmountReq.
     * 
     * @param rechargeServiceId
     */
    public void setRechargeServiceId(java.lang.Integer rechargeServiceId) {
        this.rechargeServiceId = rechargeServiceId;
    }


    /**
     * Gets the rechargeMethod value for this CheckDepositAmountReq.
     * 
     * @return rechargeMethod
     */
    public java.lang.Integer getRechargeMethod() {
        return rechargeMethod;
    }


    /**
     * Sets the rechargeMethod value for this CheckDepositAmountReq.
     * 
     * @param rechargeMethod
     */
    public void setRechargeMethod(java.lang.Integer rechargeMethod) {
        this.rechargeMethod = rechargeMethod;
    }


    /**
     * Gets the remark value for this CheckDepositAmountReq.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this CheckDepositAmountReq.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the partnerId value for this CheckDepositAmountReq.
     * 
     * @return partnerId
     */
    public java.lang.String getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this CheckDepositAmountReq.
     * 
     * @param partnerId
     */
    public void setPartnerId(java.lang.String partnerId) {
        this.partnerId = partnerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckDepositAmountReq)) return false;
        CheckDepositAmountReq other = (CheckDepositAmountReq) obj;
        
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
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.relateResourceId==null && other.getRelateResourceId()==null) || 
             (this.relateResourceId!=null &&
              this.relateResourceId.equals(other.getRelateResourceId()))) &&
            ((this.rechargeServiceId==null && other.getRechargeServiceId()==null) || 
             (this.rechargeServiceId!=null &&
              this.rechargeServiceId.equals(other.getRechargeServiceId()))) &&
            ((this.rechargeMethod==null && other.getRechargeMethod()==null) || 
             (this.rechargeMethod!=null &&
              this.rechargeMethod.equals(other.getRechargeMethod()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.partnerId==null && other.getPartnerId()==null) || 
             (this.partnerId!=null &&
              this.partnerId.equals(other.getPartnerId())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getRelateResourceId() != null) {
            _hashCode += getRelateResourceId().hashCode();
        }
        if (getRechargeServiceId() != null) {
            _hashCode += getRechargeServiceId().hashCode();
        }
        if (getRechargeMethod() != null) {
            _hashCode += getRechargeMethod().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getPartnerId() != null) {
            _hashCode += getPartnerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckDepositAmountReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "checkDepositAmountReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relateResourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relateResourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerId"));
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
