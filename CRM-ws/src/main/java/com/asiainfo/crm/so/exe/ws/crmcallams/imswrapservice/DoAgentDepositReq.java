/**
 * DoAgentDepositReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoAgentDepositReq  implements java.io.Serializable {
    private java.lang.Long orgAcctId;

    private java.lang.String outerOrgAcctId;

    private java.lang.Long orgResourceId;

    private java.lang.String orgPhoneId;

    private java.lang.Integer orgOwnerType;

    private java.lang.Long targetAcctId;

    private java.lang.String outer_targetAcctId;

    private java.lang.Long targetResourceI;

    private java.lang.String targetPhoneId;

    private java.lang.Integer targetOwnerType;

    private java.lang.Long amount;

    private java.lang.Integer measureId;

    private java.lang.Integer rechargeMethod;

    public DoAgentDepositReq() {
    }

    public DoAgentDepositReq(
           java.lang.Long orgAcctId,
           java.lang.String outerOrgAcctId,
           java.lang.Long orgResourceId,
           java.lang.String orgPhoneId,
           java.lang.Integer orgOwnerType,
           java.lang.Long targetAcctId,
           java.lang.String outer_targetAcctId,
           java.lang.Long targetResourceI,
           java.lang.String targetPhoneId,
           java.lang.Integer targetOwnerType,
           java.lang.Long amount,
           java.lang.Integer measureId,
           java.lang.Integer rechargeMethod) {
           this.orgAcctId = orgAcctId;
           this.outerOrgAcctId = outerOrgAcctId;
           this.orgResourceId = orgResourceId;
           this.orgPhoneId = orgPhoneId;
           this.orgOwnerType = orgOwnerType;
           this.targetAcctId = targetAcctId;
           this.outer_targetAcctId = outer_targetAcctId;
           this.targetResourceI = targetResourceI;
           this.targetPhoneId = targetPhoneId;
           this.targetOwnerType = targetOwnerType;
           this.amount = amount;
           this.measureId = measureId;
           this.rechargeMethod = rechargeMethod;
    }


    /**
     * Gets the orgAcctId value for this DoAgentDepositReq.
     * 
     * @return orgAcctId
     */
    public java.lang.Long getOrgAcctId() {
        return orgAcctId;
    }


    /**
     * Sets the orgAcctId value for this DoAgentDepositReq.
     * 
     * @param orgAcctId
     */
    public void setOrgAcctId(java.lang.Long orgAcctId) {
        this.orgAcctId = orgAcctId;
    }


    /**
     * Gets the outerOrgAcctId value for this DoAgentDepositReq.
     * 
     * @return outerOrgAcctId
     */
    public java.lang.String getOuterOrgAcctId() {
        return outerOrgAcctId;
    }


    /**
     * Sets the outerOrgAcctId value for this DoAgentDepositReq.
     * 
     * @param outerOrgAcctId
     */
    public void setOuterOrgAcctId(java.lang.String outerOrgAcctId) {
        this.outerOrgAcctId = outerOrgAcctId;
    }


    /**
     * Gets the orgResourceId value for this DoAgentDepositReq.
     * 
     * @return orgResourceId
     */
    public java.lang.Long getOrgResourceId() {
        return orgResourceId;
    }


    /**
     * Sets the orgResourceId value for this DoAgentDepositReq.
     * 
     * @param orgResourceId
     */
    public void setOrgResourceId(java.lang.Long orgResourceId) {
        this.orgResourceId = orgResourceId;
    }


    /**
     * Gets the orgPhoneId value for this DoAgentDepositReq.
     * 
     * @return orgPhoneId
     */
    public java.lang.String getOrgPhoneId() {
        return orgPhoneId;
    }


    /**
     * Sets the orgPhoneId value for this DoAgentDepositReq.
     * 
     * @param orgPhoneId
     */
    public void setOrgPhoneId(java.lang.String orgPhoneId) {
        this.orgPhoneId = orgPhoneId;
    }


    /**
     * Gets the orgOwnerType value for this DoAgentDepositReq.
     * 
     * @return orgOwnerType
     */
    public java.lang.Integer getOrgOwnerType() {
        return orgOwnerType;
    }


    /**
     * Sets the orgOwnerType value for this DoAgentDepositReq.
     * 
     * @param orgOwnerType
     */
    public void setOrgOwnerType(java.lang.Integer orgOwnerType) {
        this.orgOwnerType = orgOwnerType;
    }


    /**
     * Gets the targetAcctId value for this DoAgentDepositReq.
     * 
     * @return targetAcctId
     */
    public java.lang.Long getTargetAcctId() {
        return targetAcctId;
    }


    /**
     * Sets the targetAcctId value for this DoAgentDepositReq.
     * 
     * @param targetAcctId
     */
    public void setTargetAcctId(java.lang.Long targetAcctId) {
        this.targetAcctId = targetAcctId;
    }


    /**
     * Gets the outer_targetAcctId value for this DoAgentDepositReq.
     * 
     * @return outer_targetAcctId
     */
    public java.lang.String getOuter_targetAcctId() {
        return outer_targetAcctId;
    }


    /**
     * Sets the outer_targetAcctId value for this DoAgentDepositReq.
     * 
     * @param outer_targetAcctId
     */
    public void setOuter_targetAcctId(java.lang.String outer_targetAcctId) {
        this.outer_targetAcctId = outer_targetAcctId;
    }


    /**
     * Gets the targetResourceI value for this DoAgentDepositReq.
     * 
     * @return targetResourceI
     */
    public java.lang.Long getTargetResourceI() {
        return targetResourceI;
    }


    /**
     * Sets the targetResourceI value for this DoAgentDepositReq.
     * 
     * @param targetResourceI
     */
    public void setTargetResourceI(java.lang.Long targetResourceI) {
        this.targetResourceI = targetResourceI;
    }


    /**
     * Gets the targetPhoneId value for this DoAgentDepositReq.
     * 
     * @return targetPhoneId
     */
    public java.lang.String getTargetPhoneId() {
        return targetPhoneId;
    }


    /**
     * Sets the targetPhoneId value for this DoAgentDepositReq.
     * 
     * @param targetPhoneId
     */
    public void setTargetPhoneId(java.lang.String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }


    /**
     * Gets the targetOwnerType value for this DoAgentDepositReq.
     * 
     * @return targetOwnerType
     */
    public java.lang.Integer getTargetOwnerType() {
        return targetOwnerType;
    }


    /**
     * Sets the targetOwnerType value for this DoAgentDepositReq.
     * 
     * @param targetOwnerType
     */
    public void setTargetOwnerType(java.lang.Integer targetOwnerType) {
        this.targetOwnerType = targetOwnerType;
    }


    /**
     * Gets the amount value for this DoAgentDepositReq.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoAgentDepositReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this DoAgentDepositReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoAgentDepositReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the rechargeMethod value for this DoAgentDepositReq.
     * 
     * @return rechargeMethod
     */
    public java.lang.Integer getRechargeMethod() {
        return rechargeMethod;
    }


    /**
     * Sets the rechargeMethod value for this DoAgentDepositReq.
     * 
     * @param rechargeMethod
     */
    public void setRechargeMethod(java.lang.Integer rechargeMethod) {
        this.rechargeMethod = rechargeMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAgentDepositReq)) return false;
        DoAgentDepositReq other = (DoAgentDepositReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgAcctId==null && other.getOrgAcctId()==null) || 
             (this.orgAcctId!=null &&
              this.orgAcctId.equals(other.getOrgAcctId()))) &&
            ((this.outerOrgAcctId==null && other.getOuterOrgAcctId()==null) || 
             (this.outerOrgAcctId!=null &&
              this.outerOrgAcctId.equals(other.getOuterOrgAcctId()))) &&
            ((this.orgResourceId==null && other.getOrgResourceId()==null) || 
             (this.orgResourceId!=null &&
              this.orgResourceId.equals(other.getOrgResourceId()))) &&
            ((this.orgPhoneId==null && other.getOrgPhoneId()==null) || 
             (this.orgPhoneId!=null &&
              this.orgPhoneId.equals(other.getOrgPhoneId()))) &&
            ((this.orgOwnerType==null && other.getOrgOwnerType()==null) || 
             (this.orgOwnerType!=null &&
              this.orgOwnerType.equals(other.getOrgOwnerType()))) &&
            ((this.targetAcctId==null && other.getTargetAcctId()==null) || 
             (this.targetAcctId!=null &&
              this.targetAcctId.equals(other.getTargetAcctId()))) &&
            ((this.outer_targetAcctId==null && other.getOuter_targetAcctId()==null) || 
             (this.outer_targetAcctId!=null &&
              this.outer_targetAcctId.equals(other.getOuter_targetAcctId()))) &&
            ((this.targetResourceI==null && other.getTargetResourceI()==null) || 
             (this.targetResourceI!=null &&
              this.targetResourceI.equals(other.getTargetResourceI()))) &&
            ((this.targetPhoneId==null && other.getTargetPhoneId()==null) || 
             (this.targetPhoneId!=null &&
              this.targetPhoneId.equals(other.getTargetPhoneId()))) &&
            ((this.targetOwnerType==null && other.getTargetOwnerType()==null) || 
             (this.targetOwnerType!=null &&
              this.targetOwnerType.equals(other.getTargetOwnerType()))) &&
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
        if (getOrgAcctId() != null) {
            _hashCode += getOrgAcctId().hashCode();
        }
        if (getOuterOrgAcctId() != null) {
            _hashCode += getOuterOrgAcctId().hashCode();
        }
        if (getOrgResourceId() != null) {
            _hashCode += getOrgResourceId().hashCode();
        }
        if (getOrgPhoneId() != null) {
            _hashCode += getOrgPhoneId().hashCode();
        }
        if (getOrgOwnerType() != null) {
            _hashCode += getOrgOwnerType().hashCode();
        }
        if (getTargetAcctId() != null) {
            _hashCode += getTargetAcctId().hashCode();
        }
        if (getOuter_targetAcctId() != null) {
            _hashCode += getOuter_targetAcctId().hashCode();
        }
        if (getTargetResourceI() != null) {
            _hashCode += getTargetResourceI().hashCode();
        }
        if (getTargetPhoneId() != null) {
            _hashCode += getTargetPhoneId().hashCode();
        }
        if (getTargetOwnerType() != null) {
            _hashCode += getTargetOwnerType().hashCode();
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
        new org.apache.axis.description.TypeDesc(DoAgentDepositReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentDepositReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerOrgAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerOrgAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgResourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgResourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgOwnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgOwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_targetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_targetAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetResourceI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetResourceI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("targetOwnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOwnerType"));
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
