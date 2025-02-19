/**
 * STransferReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class STransferReq  implements java.io.Serializable {
    private java.lang.String outerOrgAcctId;

    private java.lang.Long orgAcctId;

    private java.lang.String orgPhoneId;

    private java.lang.String outerTargetAcctId;

    private java.lang.Long targetAcctId;

    private java.lang.String targetPhoneId;

    private java.lang.Long ruleId;

    private java.lang.Long times;

    private java.lang.Integer orgOwnerType;

    private java.lang.Integer rechargeMethod;

    private java.lang.Integer targetOwnerType;

    private java.lang.String transparentData1;

    private java.lang.String transparentData2;

    private java.lang.String transparentData3;

    public STransferReq() {
    }

    public STransferReq(
           java.lang.String outerOrgAcctId,
           java.lang.Long orgAcctId,
           java.lang.String orgPhoneId,
           java.lang.String outerTargetAcctId,
           java.lang.Long targetAcctId,
           java.lang.String targetPhoneId,
           java.lang.Long ruleId,
           java.lang.Long times,
           java.lang.Integer orgOwnerType,
           java.lang.Integer rechargeMethod,
           java.lang.Integer targetOwnerType,
           java.lang.String transparentData1,
           java.lang.String transparentData2,
           java.lang.String transparentData3) {
           this.outerOrgAcctId = outerOrgAcctId;
           this.orgAcctId = orgAcctId;
           this.orgPhoneId = orgPhoneId;
           this.outerTargetAcctId = outerTargetAcctId;
           this.targetAcctId = targetAcctId;
           this.targetPhoneId = targetPhoneId;
           this.ruleId = ruleId;
           this.times = times;
           this.orgOwnerType = orgOwnerType;
           this.rechargeMethod = rechargeMethod;
           this.targetOwnerType = targetOwnerType;
           this.transparentData1 = transparentData1;
           this.transparentData2 = transparentData2;
           this.transparentData3 = transparentData3;
    }


    /**
     * Gets the outerOrgAcctId value for this STransferReq.
     * 
     * @return outerOrgAcctId
     */
    public java.lang.String getOuterOrgAcctId() {
        return outerOrgAcctId;
    }


    /**
     * Sets the outerOrgAcctId value for this STransferReq.
     * 
     * @param outerOrgAcctId
     */
    public void setOuterOrgAcctId(java.lang.String outerOrgAcctId) {
        this.outerOrgAcctId = outerOrgAcctId;
    }


    /**
     * Gets the orgAcctId value for this STransferReq.
     * 
     * @return orgAcctId
     */
    public java.lang.Long getOrgAcctId() {
        return orgAcctId;
    }


    /**
     * Sets the orgAcctId value for this STransferReq.
     * 
     * @param orgAcctId
     */
    public void setOrgAcctId(java.lang.Long orgAcctId) {
        this.orgAcctId = orgAcctId;
    }


    /**
     * Gets the orgPhoneId value for this STransferReq.
     * 
     * @return orgPhoneId
     */
    public java.lang.String getOrgPhoneId() {
        return orgPhoneId;
    }


    /**
     * Sets the orgPhoneId value for this STransferReq.
     * 
     * @param orgPhoneId
     */
    public void setOrgPhoneId(java.lang.String orgPhoneId) {
        this.orgPhoneId = orgPhoneId;
    }


    /**
     * Gets the outerTargetAcctId value for this STransferReq.
     * 
     * @return outerTargetAcctId
     */
    public java.lang.String getOuterTargetAcctId() {
        return outerTargetAcctId;
    }


    /**
     * Sets the outerTargetAcctId value for this STransferReq.
     * 
     * @param outerTargetAcctId
     */
    public void setOuterTargetAcctId(java.lang.String outerTargetAcctId) {
        this.outerTargetAcctId = outerTargetAcctId;
    }


    /**
     * Gets the targetAcctId value for this STransferReq.
     * 
     * @return targetAcctId
     */
    public java.lang.Long getTargetAcctId() {
        return targetAcctId;
    }


    /**
     * Sets the targetAcctId value for this STransferReq.
     * 
     * @param targetAcctId
     */
    public void setTargetAcctId(java.lang.Long targetAcctId) {
        this.targetAcctId = targetAcctId;
    }


    /**
     * Gets the targetPhoneId value for this STransferReq.
     * 
     * @return targetPhoneId
     */
    public java.lang.String getTargetPhoneId() {
        return targetPhoneId;
    }


    /**
     * Sets the targetPhoneId value for this STransferReq.
     * 
     * @param targetPhoneId
     */
    public void setTargetPhoneId(java.lang.String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }


    /**
     * Gets the ruleId value for this STransferReq.
     * 
     * @return ruleId
     */
    public java.lang.Long getRuleId() {
        return ruleId;
    }


    /**
     * Sets the ruleId value for this STransferReq.
     * 
     * @param ruleId
     */
    public void setRuleId(java.lang.Long ruleId) {
        this.ruleId = ruleId;
    }


    /**
     * Gets the times value for this STransferReq.
     * 
     * @return times
     */
    public java.lang.Long getTimes() {
        return times;
    }


    /**
     * Sets the times value for this STransferReq.
     * 
     * @param times
     */
    public void setTimes(java.lang.Long times) {
        this.times = times;
    }


    /**
     * Gets the orgOwnerType value for this STransferReq.
     * 
     * @return orgOwnerType
     */
    public java.lang.Integer getOrgOwnerType() {
        return orgOwnerType;
    }


    /**
     * Sets the orgOwnerType value for this STransferReq.
     * 
     * @param orgOwnerType
     */
    public void setOrgOwnerType(java.lang.Integer orgOwnerType) {
        this.orgOwnerType = orgOwnerType;
    }


    /**
     * Gets the rechargeMethod value for this STransferReq.
     * 
     * @return rechargeMethod
     */
    public java.lang.Integer getRechargeMethod() {
        return rechargeMethod;
    }


    /**
     * Sets the rechargeMethod value for this STransferReq.
     * 
     * @param rechargeMethod
     */
    public void setRechargeMethod(java.lang.Integer rechargeMethod) {
        this.rechargeMethod = rechargeMethod;
    }


    /**
     * Gets the targetOwnerType value for this STransferReq.
     * 
     * @return targetOwnerType
     */
    public java.lang.Integer getTargetOwnerType() {
        return targetOwnerType;
    }


    /**
     * Sets the targetOwnerType value for this STransferReq.
     * 
     * @param targetOwnerType
     */
    public void setTargetOwnerType(java.lang.Integer targetOwnerType) {
        this.targetOwnerType = targetOwnerType;
    }


    /**
     * Gets the transparentData1 value for this STransferReq.
     * 
     * @return transparentData1
     */
    public java.lang.String getTransparentData1() {
        return transparentData1;
    }


    /**
     * Sets the transparentData1 value for this STransferReq.
     * 
     * @param transparentData1
     */
    public void setTransparentData1(java.lang.String transparentData1) {
        this.transparentData1 = transparentData1;
    }


    /**
     * Gets the transparentData2 value for this STransferReq.
     * 
     * @return transparentData2
     */
    public java.lang.String getTransparentData2() {
        return transparentData2;
    }


    /**
     * Sets the transparentData2 value for this STransferReq.
     * 
     * @param transparentData2
     */
    public void setTransparentData2(java.lang.String transparentData2) {
        this.transparentData2 = transparentData2;
    }


    /**
     * Gets the transparentData3 value for this STransferReq.
     * 
     * @return transparentData3
     */
    public java.lang.String getTransparentData3() {
        return transparentData3;
    }


    /**
     * Sets the transparentData3 value for this STransferReq.
     * 
     * @param transparentData3
     */
    public void setTransparentData3(java.lang.String transparentData3) {
        this.transparentData3 = transparentData3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STransferReq)) return false;
        STransferReq other = (STransferReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerOrgAcctId==null && other.getOuterOrgAcctId()==null) || 
             (this.outerOrgAcctId!=null &&
              this.outerOrgAcctId.equals(other.getOuterOrgAcctId()))) &&
            ((this.orgAcctId==null && other.getOrgAcctId()==null) || 
             (this.orgAcctId!=null &&
              this.orgAcctId.equals(other.getOrgAcctId()))) &&
            ((this.orgPhoneId==null && other.getOrgPhoneId()==null) || 
             (this.orgPhoneId!=null &&
              this.orgPhoneId.equals(other.getOrgPhoneId()))) &&
            ((this.outerTargetAcctId==null && other.getOuterTargetAcctId()==null) || 
             (this.outerTargetAcctId!=null &&
              this.outerTargetAcctId.equals(other.getOuterTargetAcctId()))) &&
            ((this.targetAcctId==null && other.getTargetAcctId()==null) || 
             (this.targetAcctId!=null &&
              this.targetAcctId.equals(other.getTargetAcctId()))) &&
            ((this.targetPhoneId==null && other.getTargetPhoneId()==null) || 
             (this.targetPhoneId!=null &&
              this.targetPhoneId.equals(other.getTargetPhoneId()))) &&
            ((this.ruleId==null && other.getRuleId()==null) || 
             (this.ruleId!=null &&
              this.ruleId.equals(other.getRuleId()))) &&
            ((this.times==null && other.getTimes()==null) || 
             (this.times!=null &&
              this.times.equals(other.getTimes()))) &&
            ((this.orgOwnerType==null && other.getOrgOwnerType()==null) || 
             (this.orgOwnerType!=null &&
              this.orgOwnerType.equals(other.getOrgOwnerType()))) &&
            ((this.rechargeMethod==null && other.getRechargeMethod()==null) || 
             (this.rechargeMethod!=null &&
              this.rechargeMethod.equals(other.getRechargeMethod()))) &&
            ((this.targetOwnerType==null && other.getTargetOwnerType()==null) || 
             (this.targetOwnerType!=null &&
              this.targetOwnerType.equals(other.getTargetOwnerType()))) &&
            ((this.transparentData1==null && other.getTransparentData1()==null) || 
             (this.transparentData1!=null &&
              this.transparentData1.equals(other.getTransparentData1()))) &&
            ((this.transparentData2==null && other.getTransparentData2()==null) || 
             (this.transparentData2!=null &&
              this.transparentData2.equals(other.getTransparentData2()))) &&
            ((this.transparentData3==null && other.getTransparentData3()==null) || 
             (this.transparentData3!=null &&
              this.transparentData3.equals(other.getTransparentData3())));
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
        if (getOuterOrgAcctId() != null) {
            _hashCode += getOuterOrgAcctId().hashCode();
        }
        if (getOrgAcctId() != null) {
            _hashCode += getOrgAcctId().hashCode();
        }
        if (getOrgPhoneId() != null) {
            _hashCode += getOrgPhoneId().hashCode();
        }
        if (getOuterTargetAcctId() != null) {
            _hashCode += getOuterTargetAcctId().hashCode();
        }
        if (getTargetAcctId() != null) {
            _hashCode += getTargetAcctId().hashCode();
        }
        if (getTargetPhoneId() != null) {
            _hashCode += getTargetPhoneId().hashCode();
        }
        if (getRuleId() != null) {
            _hashCode += getRuleId().hashCode();
        }
        if (getTimes() != null) {
            _hashCode += getTimes().hashCode();
        }
        if (getOrgOwnerType() != null) {
            _hashCode += getOrgOwnerType().hashCode();
        }
        if (getRechargeMethod() != null) {
            _hashCode += getRechargeMethod().hashCode();
        }
        if (getTargetOwnerType() != null) {
            _hashCode += getTargetOwnerType().hashCode();
        }
        if (getTransparentData1() != null) {
            _hashCode += getTransparentData1().hashCode();
        }
        if (getTransparentData2() != null) {
            _hashCode += getTransparentData2().hashCode();
        }
        if (getTransparentData3() != null) {
            _hashCode += getTransparentData3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(STransferReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransferReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerOrgAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerOrgAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgAcctId"));
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
        elemField.setFieldName("outerTargetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerTargetAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("targetPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("times");
        elemField.setXmlName(new javax.xml.namespace.QName("", "times"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("rechargeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("transparentData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData3"));
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
