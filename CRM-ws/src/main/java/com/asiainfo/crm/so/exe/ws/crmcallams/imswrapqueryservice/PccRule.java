/**
 * PccRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class PccRule  implements java.io.Serializable {
    private java.lang.String slaRuleName;

    private java.lang.Integer ruleType;

    private java.lang.Integer slaValueId;

    private java.lang.Integer qosValueId;

    private java.lang.Integer qosValueType;

    private java.lang.Long qosValue;

    private java.lang.Integer qosMeasureId;

    private java.lang.String ruleName;

    private java.lang.Long maxBandwidthUl;

    private java.lang.Long maxBandwidthDl;

    private java.lang.Long grantedBitrateUl;

    private java.lang.Long grantedBitrateDl;

    private java.lang.Long apnMaxUlRate;

    private java.lang.Long apnMaxDlRate;

    private java.lang.Long arpPriorityLevel;

    private java.lang.Long preEmoptionCapability;

    private java.lang.Long preEmoptionVulnerability;

    public PccRule() {
    }

    public PccRule(
           java.lang.String slaRuleName,
           java.lang.Integer ruleType,
           java.lang.Integer slaValueId,
           java.lang.Integer qosValueId,
           java.lang.Integer qosValueType,
           java.lang.Long qosValue,
           java.lang.Integer qosMeasureId,
           java.lang.String ruleName,
           java.lang.Long maxBandwidthUl,
           java.lang.Long maxBandwidthDl,
           java.lang.Long grantedBitrateUl,
           java.lang.Long grantedBitrateDl,
           java.lang.Long apnMaxUlRate,
           java.lang.Long apnMaxDlRate,
           java.lang.Long arpPriorityLevel,
           java.lang.Long preEmoptionCapability,
           java.lang.Long preEmoptionVulnerability) {
           this.slaRuleName = slaRuleName;
           this.ruleType = ruleType;
           this.slaValueId = slaValueId;
           this.qosValueId = qosValueId;
           this.qosValueType = qosValueType;
           this.qosValue = qosValue;
           this.qosMeasureId = qosMeasureId;
           this.ruleName = ruleName;
           this.maxBandwidthUl = maxBandwidthUl;
           this.maxBandwidthDl = maxBandwidthDl;
           this.grantedBitrateUl = grantedBitrateUl;
           this.grantedBitrateDl = grantedBitrateDl;
           this.apnMaxUlRate = apnMaxUlRate;
           this.apnMaxDlRate = apnMaxDlRate;
           this.arpPriorityLevel = arpPriorityLevel;
           this.preEmoptionCapability = preEmoptionCapability;
           this.preEmoptionVulnerability = preEmoptionVulnerability;
    }


    /**
     * Gets the slaRuleName value for this PccRule.
     * 
     * @return slaRuleName
     */
    public java.lang.String getSlaRuleName() {
        return slaRuleName;
    }


    /**
     * Sets the slaRuleName value for this PccRule.
     * 
     * @param slaRuleName
     */
    public void setSlaRuleName(java.lang.String slaRuleName) {
        this.slaRuleName = slaRuleName;
    }


    /**
     * Gets the ruleType value for this PccRule.
     * 
     * @return ruleType
     */
    public java.lang.Integer getRuleType() {
        return ruleType;
    }


    /**
     * Sets the ruleType value for this PccRule.
     * 
     * @param ruleType
     */
    public void setRuleType(java.lang.Integer ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * Gets the slaValueId value for this PccRule.
     * 
     * @return slaValueId
     */
    public java.lang.Integer getSlaValueId() {
        return slaValueId;
    }


    /**
     * Sets the slaValueId value for this PccRule.
     * 
     * @param slaValueId
     */
    public void setSlaValueId(java.lang.Integer slaValueId) {
        this.slaValueId = slaValueId;
    }


    /**
     * Gets the qosValueId value for this PccRule.
     * 
     * @return qosValueId
     */
    public java.lang.Integer getQosValueId() {
        return qosValueId;
    }


    /**
     * Sets the qosValueId value for this PccRule.
     * 
     * @param qosValueId
     */
    public void setQosValueId(java.lang.Integer qosValueId) {
        this.qosValueId = qosValueId;
    }


    /**
     * Gets the qosValueType value for this PccRule.
     * 
     * @return qosValueType
     */
    public java.lang.Integer getQosValueType() {
        return qosValueType;
    }


    /**
     * Sets the qosValueType value for this PccRule.
     * 
     * @param qosValueType
     */
    public void setQosValueType(java.lang.Integer qosValueType) {
        this.qosValueType = qosValueType;
    }


    /**
     * Gets the qosValue value for this PccRule.
     * 
     * @return qosValue
     */
    public java.lang.Long getQosValue() {
        return qosValue;
    }


    /**
     * Sets the qosValue value for this PccRule.
     * 
     * @param qosValue
     */
    public void setQosValue(java.lang.Long qosValue) {
        this.qosValue = qosValue;
    }


    /**
     * Gets the qosMeasureId value for this PccRule.
     * 
     * @return qosMeasureId
     */
    public java.lang.Integer getQosMeasureId() {
        return qosMeasureId;
    }


    /**
     * Sets the qosMeasureId value for this PccRule.
     * 
     * @param qosMeasureId
     */
    public void setQosMeasureId(java.lang.Integer qosMeasureId) {
        this.qosMeasureId = qosMeasureId;
    }


    /**
     * Gets the ruleName value for this PccRule.
     * 
     * @return ruleName
     */
    public java.lang.String getRuleName() {
        return ruleName;
    }


    /**
     * Sets the ruleName value for this PccRule.
     * 
     * @param ruleName
     */
    public void setRuleName(java.lang.String ruleName) {
        this.ruleName = ruleName;
    }


    /**
     * Gets the maxBandwidthUl value for this PccRule.
     * 
     * @return maxBandwidthUl
     */
    public java.lang.Long getMaxBandwidthUl() {
        return maxBandwidthUl;
    }


    /**
     * Sets the maxBandwidthUl value for this PccRule.
     * 
     * @param maxBandwidthUl
     */
    public void setMaxBandwidthUl(java.lang.Long maxBandwidthUl) {
        this.maxBandwidthUl = maxBandwidthUl;
    }


    /**
     * Gets the maxBandwidthDl value for this PccRule.
     * 
     * @return maxBandwidthDl
     */
    public java.lang.Long getMaxBandwidthDl() {
        return maxBandwidthDl;
    }


    /**
     * Sets the maxBandwidthDl value for this PccRule.
     * 
     * @param maxBandwidthDl
     */
    public void setMaxBandwidthDl(java.lang.Long maxBandwidthDl) {
        this.maxBandwidthDl = maxBandwidthDl;
    }


    /**
     * Gets the grantedBitrateUl value for this PccRule.
     * 
     * @return grantedBitrateUl
     */
    public java.lang.Long getGrantedBitrateUl() {
        return grantedBitrateUl;
    }


    /**
     * Sets the grantedBitrateUl value for this PccRule.
     * 
     * @param grantedBitrateUl
     */
    public void setGrantedBitrateUl(java.lang.Long grantedBitrateUl) {
        this.grantedBitrateUl = grantedBitrateUl;
    }


    /**
     * Gets the grantedBitrateDl value for this PccRule.
     * 
     * @return grantedBitrateDl
     */
    public java.lang.Long getGrantedBitrateDl() {
        return grantedBitrateDl;
    }


    /**
     * Sets the grantedBitrateDl value for this PccRule.
     * 
     * @param grantedBitrateDl
     */
    public void setGrantedBitrateDl(java.lang.Long grantedBitrateDl) {
        this.grantedBitrateDl = grantedBitrateDl;
    }


    /**
     * Gets the apnMaxUlRate value for this PccRule.
     * 
     * @return apnMaxUlRate
     */
    public java.lang.Long getApnMaxUlRate() {
        return apnMaxUlRate;
    }


    /**
     * Sets the apnMaxUlRate value for this PccRule.
     * 
     * @param apnMaxUlRate
     */
    public void setApnMaxUlRate(java.lang.Long apnMaxUlRate) {
        this.apnMaxUlRate = apnMaxUlRate;
    }


    /**
     * Gets the apnMaxDlRate value for this PccRule.
     * 
     * @return apnMaxDlRate
     */
    public java.lang.Long getApnMaxDlRate() {
        return apnMaxDlRate;
    }


    /**
     * Sets the apnMaxDlRate value for this PccRule.
     * 
     * @param apnMaxDlRate
     */
    public void setApnMaxDlRate(java.lang.Long apnMaxDlRate) {
        this.apnMaxDlRate = apnMaxDlRate;
    }


    /**
     * Gets the arpPriorityLevel value for this PccRule.
     * 
     * @return arpPriorityLevel
     */
    public java.lang.Long getArpPriorityLevel() {
        return arpPriorityLevel;
    }


    /**
     * Sets the arpPriorityLevel value for this PccRule.
     * 
     * @param arpPriorityLevel
     */
    public void setArpPriorityLevel(java.lang.Long arpPriorityLevel) {
        this.arpPriorityLevel = arpPriorityLevel;
    }


    /**
     * Gets the preEmoptionCapability value for this PccRule.
     * 
     * @return preEmoptionCapability
     */
    public java.lang.Long getPreEmoptionCapability() {
        return preEmoptionCapability;
    }


    /**
     * Sets the preEmoptionCapability value for this PccRule.
     * 
     * @param preEmoptionCapability
     */
    public void setPreEmoptionCapability(java.lang.Long preEmoptionCapability) {
        this.preEmoptionCapability = preEmoptionCapability;
    }


    /**
     * Gets the preEmoptionVulnerability value for this PccRule.
     * 
     * @return preEmoptionVulnerability
     */
    public java.lang.Long getPreEmoptionVulnerability() {
        return preEmoptionVulnerability;
    }


    /**
     * Sets the preEmoptionVulnerability value for this PccRule.
     * 
     * @param preEmoptionVulnerability
     */
    public void setPreEmoptionVulnerability(java.lang.Long preEmoptionVulnerability) {
        this.preEmoptionVulnerability = preEmoptionVulnerability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PccRule)) return false;
        PccRule other = (PccRule) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.slaRuleName==null && other.getSlaRuleName()==null) || 
             (this.slaRuleName!=null &&
              this.slaRuleName.equals(other.getSlaRuleName()))) &&
            ((this.ruleType==null && other.getRuleType()==null) || 
             (this.ruleType!=null &&
              this.ruleType.equals(other.getRuleType()))) &&
            ((this.slaValueId==null && other.getSlaValueId()==null) || 
             (this.slaValueId!=null &&
              this.slaValueId.equals(other.getSlaValueId()))) &&
            ((this.qosValueId==null && other.getQosValueId()==null) || 
             (this.qosValueId!=null &&
              this.qosValueId.equals(other.getQosValueId()))) &&
            ((this.qosValueType==null && other.getQosValueType()==null) || 
             (this.qosValueType!=null &&
              this.qosValueType.equals(other.getQosValueType()))) &&
            ((this.qosValue==null && other.getQosValue()==null) || 
             (this.qosValue!=null &&
              this.qosValue.equals(other.getQosValue()))) &&
            ((this.qosMeasureId==null && other.getQosMeasureId()==null) || 
             (this.qosMeasureId!=null &&
              this.qosMeasureId.equals(other.getQosMeasureId()))) &&
            ((this.ruleName==null && other.getRuleName()==null) || 
             (this.ruleName!=null &&
              this.ruleName.equals(other.getRuleName()))) &&
            ((this.maxBandwidthUl==null && other.getMaxBandwidthUl()==null) || 
             (this.maxBandwidthUl!=null &&
              this.maxBandwidthUl.equals(other.getMaxBandwidthUl()))) &&
            ((this.maxBandwidthDl==null && other.getMaxBandwidthDl()==null) || 
             (this.maxBandwidthDl!=null &&
              this.maxBandwidthDl.equals(other.getMaxBandwidthDl()))) &&
            ((this.grantedBitrateUl==null && other.getGrantedBitrateUl()==null) || 
             (this.grantedBitrateUl!=null &&
              this.grantedBitrateUl.equals(other.getGrantedBitrateUl()))) &&
            ((this.grantedBitrateDl==null && other.getGrantedBitrateDl()==null) || 
             (this.grantedBitrateDl!=null &&
              this.grantedBitrateDl.equals(other.getGrantedBitrateDl()))) &&
            ((this.apnMaxUlRate==null && other.getApnMaxUlRate()==null) || 
             (this.apnMaxUlRate!=null &&
              this.apnMaxUlRate.equals(other.getApnMaxUlRate()))) &&
            ((this.apnMaxDlRate==null && other.getApnMaxDlRate()==null) || 
             (this.apnMaxDlRate!=null &&
              this.apnMaxDlRate.equals(other.getApnMaxDlRate()))) &&
            ((this.arpPriorityLevel==null && other.getArpPriorityLevel()==null) || 
             (this.arpPriorityLevel!=null &&
              this.arpPriorityLevel.equals(other.getArpPriorityLevel()))) &&
            ((this.preEmoptionCapability==null && other.getPreEmoptionCapability()==null) || 
             (this.preEmoptionCapability!=null &&
              this.preEmoptionCapability.equals(other.getPreEmoptionCapability()))) &&
            ((this.preEmoptionVulnerability==null && other.getPreEmoptionVulnerability()==null) || 
             (this.preEmoptionVulnerability!=null &&
              this.preEmoptionVulnerability.equals(other.getPreEmoptionVulnerability())));
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
        if (getSlaRuleName() != null) {
            _hashCode += getSlaRuleName().hashCode();
        }
        if (getRuleType() != null) {
            _hashCode += getRuleType().hashCode();
        }
        if (getSlaValueId() != null) {
            _hashCode += getSlaValueId().hashCode();
        }
        if (getQosValueId() != null) {
            _hashCode += getQosValueId().hashCode();
        }
        if (getQosValueType() != null) {
            _hashCode += getQosValueType().hashCode();
        }
        if (getQosValue() != null) {
            _hashCode += getQosValue().hashCode();
        }
        if (getQosMeasureId() != null) {
            _hashCode += getQosMeasureId().hashCode();
        }
        if (getRuleName() != null) {
            _hashCode += getRuleName().hashCode();
        }
        if (getMaxBandwidthUl() != null) {
            _hashCode += getMaxBandwidthUl().hashCode();
        }
        if (getMaxBandwidthDl() != null) {
            _hashCode += getMaxBandwidthDl().hashCode();
        }
        if (getGrantedBitrateUl() != null) {
            _hashCode += getGrantedBitrateUl().hashCode();
        }
        if (getGrantedBitrateDl() != null) {
            _hashCode += getGrantedBitrateDl().hashCode();
        }
        if (getApnMaxUlRate() != null) {
            _hashCode += getApnMaxUlRate().hashCode();
        }
        if (getApnMaxDlRate() != null) {
            _hashCode += getApnMaxDlRate().hashCode();
        }
        if (getArpPriorityLevel() != null) {
            _hashCode += getArpPriorityLevel().hashCode();
        }
        if (getPreEmoptionCapability() != null) {
            _hashCode += getPreEmoptionCapability().hashCode();
        }
        if (getPreEmoptionVulnerability() != null) {
            _hashCode += getPreEmoptionVulnerability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PccRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pccRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaRuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slaRuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slaValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosMeasureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosMeasureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBandwidthUl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxBandwidthUl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBandwidthDl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxBandwidthDl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantedBitrateUl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantedBitrateUl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantedBitrateDl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantedBitrateDl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apnMaxUlRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apnMaxUlRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apnMaxDlRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apnMaxDlRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arpPriorityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arpPriorityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preEmoptionCapability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preEmoptionCapability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preEmoptionVulnerability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preEmoptionVulnerability"));
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
