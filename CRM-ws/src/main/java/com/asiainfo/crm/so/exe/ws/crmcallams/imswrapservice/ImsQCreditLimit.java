/**
 * ImsQCreditLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class ImsQCreditLimit  implements java.io.Serializable {
    private java.lang.Integer creditItemId;

    private java.lang.Long credit;

    private java.lang.Long freezeFee;

    private java.lang.Long deductFee;

    private java.lang.Long hisDeductFee;

    private java.lang.Long realDeductFee;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    private java.lang.Integer measureId;

    private java.lang.Short billingType;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Long assetId;

    private java.lang.Short isCommonItem;

    private java.util.Calendar lastUpdateTime;

    private java.lang.Short creditFlag;

    public ImsQCreditLimit() {
    }

    public ImsQCreditLimit(
           java.lang.Integer creditItemId,
           java.lang.Long credit,
           java.lang.Long freezeFee,
           java.lang.Long deductFee,
           java.lang.Long hisDeductFee,
           java.lang.Long realDeductFee,
           java.util.Calendar validDate,
           java.util.Calendar expireDate,
           java.lang.Integer measureId,
           java.lang.Short billingType,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Long assetId,
           java.lang.Short isCommonItem,
           java.util.Calendar lastUpdateTime,
           java.lang.Short creditFlag) {
           this.creditItemId = creditItemId;
           this.credit = credit;
           this.freezeFee = freezeFee;
           this.deductFee = deductFee;
           this.hisDeductFee = hisDeductFee;
           this.realDeductFee = realDeductFee;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.measureId = measureId;
           this.billingType = billingType;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.assetId = assetId;
           this.isCommonItem = isCommonItem;
           this.lastUpdateTime = lastUpdateTime;
           this.creditFlag = creditFlag;
    }


    /**
     * Gets the creditItemId value for this ImsQCreditLimit.
     * 
     * @return creditItemId
     */
    public java.lang.Integer getCreditItemId() {
        return creditItemId;
    }


    /**
     * Sets the creditItemId value for this ImsQCreditLimit.
     * 
     * @param creditItemId
     */
    public void setCreditItemId(java.lang.Integer creditItemId) {
        this.creditItemId = creditItemId;
    }


    /**
     * Gets the credit value for this ImsQCreditLimit.
     * 
     * @return credit
     */
    public java.lang.Long getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this ImsQCreditLimit.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Long credit) {
        this.credit = credit;
    }


    /**
     * Gets the freezeFee value for this ImsQCreditLimit.
     * 
     * @return freezeFee
     */
    public java.lang.Long getFreezeFee() {
        return freezeFee;
    }


    /**
     * Sets the freezeFee value for this ImsQCreditLimit.
     * 
     * @param freezeFee
     */
    public void setFreezeFee(java.lang.Long freezeFee) {
        this.freezeFee = freezeFee;
    }


    /**
     * Gets the deductFee value for this ImsQCreditLimit.
     * 
     * @return deductFee
     */
    public java.lang.Long getDeductFee() {
        return deductFee;
    }


    /**
     * Sets the deductFee value for this ImsQCreditLimit.
     * 
     * @param deductFee
     */
    public void setDeductFee(java.lang.Long deductFee) {
        this.deductFee = deductFee;
    }


    /**
     * Gets the hisDeductFee value for this ImsQCreditLimit.
     * 
     * @return hisDeductFee
     */
    public java.lang.Long getHisDeductFee() {
        return hisDeductFee;
    }


    /**
     * Sets the hisDeductFee value for this ImsQCreditLimit.
     * 
     * @param hisDeductFee
     */
    public void setHisDeductFee(java.lang.Long hisDeductFee) {
        this.hisDeductFee = hisDeductFee;
    }


    /**
     * Gets the realDeductFee value for this ImsQCreditLimit.
     * 
     * @return realDeductFee
     */
    public java.lang.Long getRealDeductFee() {
        return realDeductFee;
    }


    /**
     * Sets the realDeductFee value for this ImsQCreditLimit.
     * 
     * @param realDeductFee
     */
    public void setRealDeductFee(java.lang.Long realDeductFee) {
        this.realDeductFee = realDeductFee;
    }


    /**
     * Gets the validDate value for this ImsQCreditLimit.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this ImsQCreditLimit.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this ImsQCreditLimit.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this ImsQCreditLimit.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the measureId value for this ImsQCreditLimit.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this ImsQCreditLimit.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the billingType value for this ImsQCreditLimit.
     * 
     * @return billingType
     */
    public java.lang.Short getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this ImsQCreditLimit.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Short billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the acctId value for this ImsQCreditLimit.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this ImsQCreditLimit.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this ImsQCreditLimit.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ImsQCreditLimit.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the assetId value for this ImsQCreditLimit.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this ImsQCreditLimit.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the isCommonItem value for this ImsQCreditLimit.
     * 
     * @return isCommonItem
     */
    public java.lang.Short getIsCommonItem() {
        return isCommonItem;
    }


    /**
     * Sets the isCommonItem value for this ImsQCreditLimit.
     * 
     * @param isCommonItem
     */
    public void setIsCommonItem(java.lang.Short isCommonItem) {
        this.isCommonItem = isCommonItem;
    }


    /**
     * Gets the lastUpdateTime value for this ImsQCreditLimit.
     * 
     * @return lastUpdateTime
     */
    public java.util.Calendar getLastUpdateTime() {
        return lastUpdateTime;
    }


    /**
     * Sets the lastUpdateTime value for this ImsQCreditLimit.
     * 
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(java.util.Calendar lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * Gets the creditFlag value for this ImsQCreditLimit.
     * 
     * @return creditFlag
     */
    public java.lang.Short getCreditFlag() {
        return creditFlag;
    }


    /**
     * Sets the creditFlag value for this ImsQCreditLimit.
     * 
     * @param creditFlag
     */
    public void setCreditFlag(java.lang.Short creditFlag) {
        this.creditFlag = creditFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImsQCreditLimit)) return false;
        ImsQCreditLimit other = (ImsQCreditLimit) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditItemId==null && other.getCreditItemId()==null) || 
             (this.creditItemId!=null &&
              this.creditItemId.equals(other.getCreditItemId()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.freezeFee==null && other.getFreezeFee()==null) || 
             (this.freezeFee!=null &&
              this.freezeFee.equals(other.getFreezeFee()))) &&
            ((this.deductFee==null && other.getDeductFee()==null) || 
             (this.deductFee!=null &&
              this.deductFee.equals(other.getDeductFee()))) &&
            ((this.hisDeductFee==null && other.getHisDeductFee()==null) || 
             (this.hisDeductFee!=null &&
              this.hisDeductFee.equals(other.getHisDeductFee()))) &&
            ((this.realDeductFee==null && other.getRealDeductFee()==null) || 
             (this.realDeductFee!=null &&
              this.realDeductFee.equals(other.getRealDeductFee()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.isCommonItem==null && other.getIsCommonItem()==null) || 
             (this.isCommonItem!=null &&
              this.isCommonItem.equals(other.getIsCommonItem()))) &&
            ((this.lastUpdateTime==null && other.getLastUpdateTime()==null) || 
             (this.lastUpdateTime!=null &&
              this.lastUpdateTime.equals(other.getLastUpdateTime()))) &&
            ((this.creditFlag==null && other.getCreditFlag()==null) || 
             (this.creditFlag!=null &&
              this.creditFlag.equals(other.getCreditFlag())));
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
        if (getCreditItemId() != null) {
            _hashCode += getCreditItemId().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getFreezeFee() != null) {
            _hashCode += getFreezeFee().hashCode();
        }
        if (getDeductFee() != null) {
            _hashCode += getDeductFee().hashCode();
        }
        if (getHisDeductFee() != null) {
            _hashCode += getHisDeductFee().hashCode();
        }
        if (getRealDeductFee() != null) {
            _hashCode += getRealDeductFee().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getIsCommonItem() != null) {
            _hashCode += getIsCommonItem().hashCode();
        }
        if (getLastUpdateTime() != null) {
            _hashCode += getLastUpdateTime().hashCode();
        }
        if (getCreditFlag() != null) {
            _hashCode += getCreditFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImsQCreditLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsQCreditLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freezeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freezeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hisDeductFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hisDeductFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realDeductFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realDeductFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("isCommonItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCommonItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
