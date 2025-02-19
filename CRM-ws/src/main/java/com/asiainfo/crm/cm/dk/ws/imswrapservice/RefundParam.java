/**
 * RefundParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class RefundParam  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String outerAcctountId;

    private java.lang.String phoneId;

    private java.lang.Long userId;

    private java.lang.String outerUserId;

    private java.lang.Integer ownerType;

    private java.lang.Integer itemId;

    private java.lang.Double amount;

    private java.lang.Integer measureId;

    public RefundParam() {
    }

    public RefundParam(
           java.lang.Long accountId,
           java.lang.String outerAcctountId,
           java.lang.String phoneId,
           java.lang.Long userId,
           java.lang.String outerUserId,
           java.lang.Integer ownerType,
           java.lang.Integer itemId,
           java.lang.Double amount,
           java.lang.Integer measureId) {
           this.accountId = accountId;
           this.outerAcctountId = outerAcctountId;
           this.phoneId = phoneId;
           this.userId = userId;
           this.outerUserId = outerUserId;
           this.ownerType = ownerType;
           this.itemId = itemId;
           this.amount = amount;
           this.measureId = measureId;
    }


    /**
     * Gets the accountId value for this RefundParam.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this RefundParam.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the outerAcctountId value for this RefundParam.
     * 
     * @return outerAcctountId
     */
    public java.lang.String getOuterAcctountId() {
        return outerAcctountId;
    }


    /**
     * Sets the outerAcctountId value for this RefundParam.
     * 
     * @param outerAcctountId
     */
    public void setOuterAcctountId(java.lang.String outerAcctountId) {
        this.outerAcctountId = outerAcctountId;
    }


    /**
     * Gets the phoneId value for this RefundParam.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this RefundParam.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the userId value for this RefundParam.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this RefundParam.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the outerUserId value for this RefundParam.
     * 
     * @return outerUserId
     */
    public java.lang.String getOuterUserId() {
        return outerUserId;
    }


    /**
     * Sets the outerUserId value for this RefundParam.
     * 
     * @param outerUserId
     */
    public void setOuterUserId(java.lang.String outerUserId) {
        this.outerUserId = outerUserId;
    }


    /**
     * Gets the ownerType value for this RefundParam.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this RefundParam.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the itemId value for this RefundParam.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this RefundParam.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the amount value for this RefundParam.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RefundParam.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this RefundParam.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this RefundParam.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundParam)) return false;
        RefundParam other = (RefundParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.outerAcctountId==null && other.getOuterAcctountId()==null) || 
             (this.outerAcctountId!=null &&
              this.outerAcctountId.equals(other.getOuterAcctountId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.outerUserId==null && other.getOuterUserId()==null) || 
             (this.outerUserId!=null &&
              this.outerUserId.equals(other.getOuterUserId()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getOuterAcctountId() != null) {
            _hashCode += getOuterAcctountId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getOuterUserId() != null) {
            _hashCode += getOuterUserId().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "refundParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
