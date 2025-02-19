/**
 * TransferDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class TransferDetail  implements java.io.Serializable {
    private java.lang.String outerTargetAcctId;

    private java.lang.String targetPhoneId;

    private java.lang.Long targetUserId;

    private java.lang.String outerTargetUserId;

    private java.lang.Integer amount;

    private java.lang.Integer measureId;

    private java.lang.Long targetAccountId;

    public TransferDetail() {
    }

    public TransferDetail(
           java.lang.String outerTargetAcctId,
           java.lang.String targetPhoneId,
           java.lang.Long targetUserId,
           java.lang.String outerTargetUserId,
           java.lang.Integer amount,
           java.lang.Integer measureId,
           java.lang.Long targetAccountId) {
           this.outerTargetAcctId = outerTargetAcctId;
           this.targetPhoneId = targetPhoneId;
           this.targetUserId = targetUserId;
           this.outerTargetUserId = outerTargetUserId;
           this.amount = amount;
           this.measureId = measureId;
           this.targetAccountId = targetAccountId;
    }


    /**
     * Gets the outerTargetAcctId value for this TransferDetail.
     * 
     * @return outerTargetAcctId
     */
    public java.lang.String getOuterTargetAcctId() {
        return outerTargetAcctId;
    }


    /**
     * Sets the outerTargetAcctId value for this TransferDetail.
     * 
     * @param outerTargetAcctId
     */
    public void setOuterTargetAcctId(java.lang.String outerTargetAcctId) {
        this.outerTargetAcctId = outerTargetAcctId;
    }


    /**
     * Gets the targetPhoneId value for this TransferDetail.
     * 
     * @return targetPhoneId
     */
    public java.lang.String getTargetPhoneId() {
        return targetPhoneId;
    }


    /**
     * Sets the targetPhoneId value for this TransferDetail.
     * 
     * @param targetPhoneId
     */
    public void setTargetPhoneId(java.lang.String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }


    /**
     * Gets the targetUserId value for this TransferDetail.
     * 
     * @return targetUserId
     */
    public java.lang.Long getTargetUserId() {
        return targetUserId;
    }


    /**
     * Sets the targetUserId value for this TransferDetail.
     * 
     * @param targetUserId
     */
    public void setTargetUserId(java.lang.Long targetUserId) {
        this.targetUserId = targetUserId;
    }


    /**
     * Gets the outerTargetUserId value for this TransferDetail.
     * 
     * @return outerTargetUserId
     */
    public java.lang.String getOuterTargetUserId() {
        return outerTargetUserId;
    }


    /**
     * Sets the outerTargetUserId value for this TransferDetail.
     * 
     * @param outerTargetUserId
     */
    public void setOuterTargetUserId(java.lang.String outerTargetUserId) {
        this.outerTargetUserId = outerTargetUserId;
    }


    /**
     * Gets the amount value for this TransferDetail.
     * 
     * @return amount
     */
    public java.lang.Integer getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferDetail.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Integer amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this TransferDetail.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this TransferDetail.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the targetAccountId value for this TransferDetail.
     * 
     * @return targetAccountId
     */
    public java.lang.Long getTargetAccountId() {
        return targetAccountId;
    }


    /**
     * Sets the targetAccountId value for this TransferDetail.
     * 
     * @param targetAccountId
     */
    public void setTargetAccountId(java.lang.Long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDetail)) return false;
        TransferDetail other = (TransferDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerTargetAcctId==null && other.getOuterTargetAcctId()==null) || 
             (this.outerTargetAcctId!=null &&
              this.outerTargetAcctId.equals(other.getOuterTargetAcctId()))) &&
            ((this.targetPhoneId==null && other.getTargetPhoneId()==null) || 
             (this.targetPhoneId!=null &&
              this.targetPhoneId.equals(other.getTargetPhoneId()))) &&
            ((this.targetUserId==null && other.getTargetUserId()==null) || 
             (this.targetUserId!=null &&
              this.targetUserId.equals(other.getTargetUserId()))) &&
            ((this.outerTargetUserId==null && other.getOuterTargetUserId()==null) || 
             (this.outerTargetUserId!=null &&
              this.outerTargetUserId.equals(other.getOuterTargetUserId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.targetAccountId==null && other.getTargetAccountId()==null) || 
             (this.targetAccountId!=null &&
              this.targetAccountId.equals(other.getTargetAccountId())));
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
        if (getOuterTargetAcctId() != null) {
            _hashCode += getOuterTargetAcctId().hashCode();
        }
        if (getTargetPhoneId() != null) {
            _hashCode += getTargetPhoneId().hashCode();
        }
        if (getTargetUserId() != null) {
            _hashCode += getTargetUserId().hashCode();
        }
        if (getOuterTargetUserId() != null) {
            _hashCode += getOuterTargetUserId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getTargetAccountId() != null) {
            _hashCode += getTargetAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerTargetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerTargetAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerTargetUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerTargetUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAccountId"));
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
