/**
 * ImsDepositResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class ImsDepositResult  implements java.io.Serializable {
    private java.lang.Long soNbr;

    private java.lang.Integer validityPeriod;

    private java.lang.Integer extraValidity;

    private java.util.Calendar soDate;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] unchangedAssetes;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] changedAssetes;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsCaRewardInfo[] rewardInfos;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsQCreditLimit[] creditLimitRemain;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDeductFeeOut deductFee;

    public ImsDepositResult() {
    }

    public ImsDepositResult(
           java.lang.Long soNbr,
           java.lang.Integer validityPeriod,
           java.lang.Integer extraValidity,
           java.util.Calendar soDate,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] unchangedAssetes,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] changedAssetes,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsCaRewardInfo[] rewardInfos,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsQCreditLimit[] creditLimitRemain,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDeductFeeOut deductFee) {
           this.soNbr = soNbr;
           this.validityPeriod = validityPeriod;
           this.extraValidity = extraValidity;
           this.soDate = soDate;
           this.unchangedAssetes = unchangedAssetes;
           this.changedAssetes = changedAssetes;
           this.rewardInfos = rewardInfos;
           this.creditLimitRemain = creditLimitRemain;
           this.deductFee = deductFee;
    }


    /**
     * Gets the soNbr value for this ImsDepositResult.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this ImsDepositResult.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the validityPeriod value for this ImsDepositResult.
     * 
     * @return validityPeriod
     */
    public java.lang.Integer getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this ImsDepositResult.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the extraValidity value for this ImsDepositResult.
     * 
     * @return extraValidity
     */
    public java.lang.Integer getExtraValidity() {
        return extraValidity;
    }


    /**
     * Sets the extraValidity value for this ImsDepositResult.
     * 
     * @param extraValidity
     */
    public void setExtraValidity(java.lang.Integer extraValidity) {
        this.extraValidity = extraValidity;
    }


    /**
     * Gets the soDate value for this ImsDepositResult.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this ImsDepositResult.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the unchangedAssetes value for this ImsDepositResult.
     * 
     * @return unchangedAssetes
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] getUnchangedAssetes() {
        return unchangedAssetes;
    }


    /**
     * Sets the unchangedAssetes value for this ImsDepositResult.
     * 
     * @param unchangedAssetes
     */
    public void setUnchangedAssetes(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] unchangedAssetes) {
        this.unchangedAssetes = unchangedAssetes;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo getUnchangedAssetes(int i) {
        return this.unchangedAssetes[i];
    }

    public void setUnchangedAssetes(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo _value) {
        this.unchangedAssetes[i] = _value;
    }


    /**
     * Gets the changedAssetes value for this ImsDepositResult.
     * 
     * @return changedAssetes
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] getChangedAssetes() {
        return changedAssetes;
    }


    /**
     * Sets the changedAssetes value for this ImsDepositResult.
     * 
     * @param changedAssetes
     */
    public void setChangedAssetes(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo[] changedAssetes) {
        this.changedAssetes = changedAssetes;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo getChangedAssetes(int i) {
        return this.changedAssetes[i];
    }

    public void setChangedAssetes(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsSAssetInfo _value) {
        this.changedAssetes[i] = _value;
    }


    /**
     * Gets the rewardInfos value for this ImsDepositResult.
     * 
     * @return rewardInfos
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsCaRewardInfo[] getRewardInfos() {
        return rewardInfos;
    }


    /**
     * Sets the rewardInfos value for this ImsDepositResult.
     * 
     * @param rewardInfos
     */
    public void setRewardInfos(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsCaRewardInfo[] rewardInfos) {
        this.rewardInfos = rewardInfos;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsCaRewardInfo getRewardInfos(int i) {
        return this.rewardInfos[i];
    }

    public void setRewardInfos(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsCaRewardInfo _value) {
        this.rewardInfos[i] = _value;
    }


    /**
     * Gets the creditLimitRemain value for this ImsDepositResult.
     * 
     * @return creditLimitRemain
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsQCreditLimit[] getCreditLimitRemain() {
        return creditLimitRemain;
    }


    /**
     * Sets the creditLimitRemain value for this ImsDepositResult.
     * 
     * @param creditLimitRemain
     */
    public void setCreditLimitRemain(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsQCreditLimit[] creditLimitRemain) {
        this.creditLimitRemain = creditLimitRemain;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsQCreditLimit getCreditLimitRemain(int i) {
        return this.creditLimitRemain[i];
    }

    public void setCreditLimitRemain(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsQCreditLimit _value) {
        this.creditLimitRemain[i] = _value;
    }


    /**
     * Gets the deductFee value for this ImsDepositResult.
     * 
     * @return deductFee
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDeductFeeOut getDeductFee() {
        return deductFee;
    }


    /**
     * Sets the deductFee value for this ImsDepositResult.
     * 
     * @param deductFee
     */
    public void setDeductFee(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDeductFeeOut deductFee) {
        this.deductFee = deductFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImsDepositResult)) return false;
        ImsDepositResult other = (ImsDepositResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.extraValidity==null && other.getExtraValidity()==null) || 
             (this.extraValidity!=null &&
              this.extraValidity.equals(other.getExtraValidity()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.unchangedAssetes==null && other.getUnchangedAssetes()==null) || 
             (this.unchangedAssetes!=null &&
              java.util.Arrays.equals(this.unchangedAssetes, other.getUnchangedAssetes()))) &&
            ((this.changedAssetes==null && other.getChangedAssetes()==null) || 
             (this.changedAssetes!=null &&
              java.util.Arrays.equals(this.changedAssetes, other.getChangedAssetes()))) &&
            ((this.rewardInfos==null && other.getRewardInfos()==null) || 
             (this.rewardInfos!=null &&
              java.util.Arrays.equals(this.rewardInfos, other.getRewardInfos()))) &&
            ((this.creditLimitRemain==null && other.getCreditLimitRemain()==null) || 
             (this.creditLimitRemain!=null &&
              java.util.Arrays.equals(this.creditLimitRemain, other.getCreditLimitRemain()))) &&
            ((this.deductFee==null && other.getDeductFee()==null) || 
             (this.deductFee!=null &&
              this.deductFee.equals(other.getDeductFee())));
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
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getExtraValidity() != null) {
            _hashCode += getExtraValidity().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getUnchangedAssetes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnchangedAssetes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnchangedAssetes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangedAssetes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedAssetes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedAssetes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRewardInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditLimitRemain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimitRemain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimitRemain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeductFee() != null) {
            _hashCode += getDeductFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImsDepositResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsDepositResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unchangedAssetes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unchangedAssetes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsSAssetInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAssetes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedAssetes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsSAssetInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rewardInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsCaRewardInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimitRemain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditLimitRemain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsQCreditLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsDeductFeeOut"));
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
