/**
 * DoAgentSelfDepositReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoAgentSelfDepositReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long resourceId;

    private java.lang.String phoneId;

    private java.lang.Integer ownerType;

    private java.lang.Long amount;

    private java.lang.Integer measureId;

    private java.lang.Integer rechargeMethod;

    public DoAgentSelfDepositReq() {
    }

    public DoAgentSelfDepositReq(
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long resourceId,
           java.lang.String phoneId,
           java.lang.Integer ownerType,
           java.lang.Long amount,
           java.lang.Integer measureId,
           java.lang.Integer rechargeMethod) {
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.resourceId = resourceId;
           this.phoneId = phoneId;
           this.ownerType = ownerType;
           this.amount = amount;
           this.measureId = measureId;
           this.rechargeMethod = rechargeMethod;
    }


    /**
     * Gets the acctId value for this DoAgentSelfDepositReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoAgentSelfDepositReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this DoAgentSelfDepositReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoAgentSelfDepositReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the resourceId value for this DoAgentSelfDepositReq.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this DoAgentSelfDepositReq.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the phoneId value for this DoAgentSelfDepositReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this DoAgentSelfDepositReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the ownerType value for this DoAgentSelfDepositReq.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this DoAgentSelfDepositReq.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the amount value for this DoAgentSelfDepositReq.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoAgentSelfDepositReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this DoAgentSelfDepositReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoAgentSelfDepositReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the rechargeMethod value for this DoAgentSelfDepositReq.
     * 
     * @return rechargeMethod
     */
    public java.lang.Integer getRechargeMethod() {
        return rechargeMethod;
    }


    /**
     * Sets the rechargeMethod value for this DoAgentSelfDepositReq.
     * 
     * @param rechargeMethod
     */
    public void setRechargeMethod(java.lang.Integer rechargeMethod) {
        this.rechargeMethod = rechargeMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAgentSelfDepositReq)) return false;
        DoAgentSelfDepositReq other = (DoAgentSelfDepositReq) obj;
        if (obj == null) return false;
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
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.rechargeMethod==null && other.getRechargeMethod()==null) || 
             (this.rechargeMethod!=null &&
              this.rechargeMethod.equals(other.getRechargeMethod())));
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
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getRechargeMethod() != null) {
            _hashCode += getRechargeMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAgentSelfDepositReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentSelfDepositReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField.setFieldName("rechargeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeMethod"));
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
