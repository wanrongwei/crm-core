/**
 * AssetChgIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AssetChgIn  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Long assetId;

    private java.lang.Long assetItemId;

    private java.lang.Long amount;

    private java.lang.Integer measureId;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    private java.lang.Integer validProlongDays;

    private java.lang.Integer expireProlongDays;

    private java.lang.Integer prolongType;

    private java.lang.Integer ownerType;

    private java.lang.Short modifyType;

    private java.lang.Short deductType;

    private java.lang.Boolean isCheckMaxBalance;

    private java.lang.Short calculFeeFlag;

    private java.lang.Boolean isReward;

    public AssetChgIn() {
    }

    public AssetChgIn(
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Long assetId,
           java.lang.Long assetItemId,
           java.lang.Long amount,
           java.lang.Integer measureId,
           java.util.Calendar validDate,
           java.util.Calendar expireDate,
           java.lang.Integer validProlongDays,
           java.lang.Integer expireProlongDays,
           java.lang.Integer prolongType,
           java.lang.Integer ownerType,
           java.lang.Short modifyType,
           java.lang.Short deductType,
           java.lang.Boolean isCheckMaxBalance,
           java.lang.Short calculFeeFlag,
           java.lang.Boolean isReward) {
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.assetId = assetId;
           this.assetItemId = assetItemId;
           this.amount = amount;
           this.measureId = measureId;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.validProlongDays = validProlongDays;
           this.expireProlongDays = expireProlongDays;
           this.prolongType = prolongType;
           this.ownerType = ownerType;
           this.modifyType = modifyType;
           this.deductType = deductType;
           this.isCheckMaxBalance = isCheckMaxBalance;
           this.calculFeeFlag = calculFeeFlag;
           this.isReward = isReward;
    }


    /**
     * Gets the acctId value for this AssetChgIn.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AssetChgIn.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this AssetChgIn.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this AssetChgIn.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the assetId value for this AssetChgIn.
     * 
     * @return assetId
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this AssetChgIn.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the assetItemId value for this AssetChgIn.
     * 
     * @return assetItemId
     */
    public java.lang.Long getAssetItemId() {
        return assetItemId;
    }


    /**
     * Sets the assetItemId value for this AssetChgIn.
     * 
     * @param assetItemId
     */
    public void setAssetItemId(java.lang.Long assetItemId) {
        this.assetItemId = assetItemId;
    }


    /**
     * Gets the amount value for this AssetChgIn.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AssetChgIn.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this AssetChgIn.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this AssetChgIn.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the validDate value for this AssetChgIn.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this AssetChgIn.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this AssetChgIn.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this AssetChgIn.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the validProlongDays value for this AssetChgIn.
     * 
     * @return validProlongDays
     */
    public java.lang.Integer getValidProlongDays() {
        return validProlongDays;
    }


    /**
     * Sets the validProlongDays value for this AssetChgIn.
     * 
     * @param validProlongDays
     */
    public void setValidProlongDays(java.lang.Integer validProlongDays) {
        this.validProlongDays = validProlongDays;
    }


    /**
     * Gets the expireProlongDays value for this AssetChgIn.
     * 
     * @return expireProlongDays
     */
    public java.lang.Integer getExpireProlongDays() {
        return expireProlongDays;
    }


    /**
     * Sets the expireProlongDays value for this AssetChgIn.
     * 
     * @param expireProlongDays
     */
    public void setExpireProlongDays(java.lang.Integer expireProlongDays) {
        this.expireProlongDays = expireProlongDays;
    }


    /**
     * Gets the prolongType value for this AssetChgIn.
     * 
     * @return prolongType
     */
    public java.lang.Integer getProlongType() {
        return prolongType;
    }


    /**
     * Sets the prolongType value for this AssetChgIn.
     * 
     * @param prolongType
     */
    public void setProlongType(java.lang.Integer prolongType) {
        this.prolongType = prolongType;
    }


    /**
     * Gets the ownerType value for this AssetChgIn.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this AssetChgIn.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the modifyType value for this AssetChgIn.
     * 
     * @return modifyType
     */
    public java.lang.Short getModifyType() {
        return modifyType;
    }


    /**
     * Sets the modifyType value for this AssetChgIn.
     * 
     * @param modifyType
     */
    public void setModifyType(java.lang.Short modifyType) {
        this.modifyType = modifyType;
    }


    /**
     * Gets the deductType value for this AssetChgIn.
     * 
     * @return deductType
     */
    public java.lang.Short getDeductType() {
        return deductType;
    }


    /**
     * Sets the deductType value for this AssetChgIn.
     * 
     * @param deductType
     */
    public void setDeductType(java.lang.Short deductType) {
        this.deductType = deductType;
    }


    /**
     * Gets the isCheckMaxBalance value for this AssetChgIn.
     * 
     * @return isCheckMaxBalance
     */
    public java.lang.Boolean getIsCheckMaxBalance() {
        return isCheckMaxBalance;
    }


    /**
     * Sets the isCheckMaxBalance value for this AssetChgIn.
     * 
     * @param isCheckMaxBalance
     */
    public void setIsCheckMaxBalance(java.lang.Boolean isCheckMaxBalance) {
        this.isCheckMaxBalance = isCheckMaxBalance;
    }


    /**
     * Gets the calculFeeFlag value for this AssetChgIn.
     * 
     * @return calculFeeFlag
     */
    public java.lang.Short getCalculFeeFlag() {
        return calculFeeFlag;
    }


    /**
     * Sets the calculFeeFlag value for this AssetChgIn.
     * 
     * @param calculFeeFlag
     */
    public void setCalculFeeFlag(java.lang.Short calculFeeFlag) {
        this.calculFeeFlag = calculFeeFlag;
    }


    /**
     * Gets the isReward value for this AssetChgIn.
     * 
     * @return isReward
     */
    public java.lang.Boolean getIsReward() {
        return isReward;
    }


    /**
     * Sets the isReward value for this AssetChgIn.
     * 
     * @param isReward
     */
    public void setIsReward(java.lang.Boolean isReward) {
        this.isReward = isReward;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetChgIn)) return false;
        AssetChgIn other = (AssetChgIn) obj;
        
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
            ((this.assetItemId==null && other.getAssetItemId()==null) || 
             (this.assetItemId!=null &&
              this.assetItemId.equals(other.getAssetItemId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.validProlongDays==null && other.getValidProlongDays()==null) || 
             (this.validProlongDays!=null &&
              this.validProlongDays.equals(other.getValidProlongDays()))) &&
            ((this.expireProlongDays==null && other.getExpireProlongDays()==null) || 
             (this.expireProlongDays!=null &&
              this.expireProlongDays.equals(other.getExpireProlongDays()))) &&
            ((this.prolongType==null && other.getProlongType()==null) || 
             (this.prolongType!=null &&
              this.prolongType.equals(other.getProlongType()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.modifyType==null && other.getModifyType()==null) || 
             (this.modifyType!=null &&
              this.modifyType.equals(other.getModifyType()))) &&
            ((this.deductType==null && other.getDeductType()==null) || 
             (this.deductType!=null &&
              this.deductType.equals(other.getDeductType()))) &&
            ((this.isCheckMaxBalance==null && other.getIsCheckMaxBalance()==null) || 
             (this.isCheckMaxBalance!=null &&
              this.isCheckMaxBalance.equals(other.getIsCheckMaxBalance()))) &&
            ((this.calculFeeFlag==null && other.getCalculFeeFlag()==null) || 
             (this.calculFeeFlag!=null &&
              this.calculFeeFlag.equals(other.getCalculFeeFlag()))) &&
            ((this.isReward==null && other.getIsReward()==null) || 
             (this.isReward!=null &&
              this.isReward.equals(other.getIsReward())));
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
        if (getAssetItemId() != null) {
            _hashCode += getAssetItemId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getValidProlongDays() != null) {
            _hashCode += getValidProlongDays().hashCode();
        }
        if (getExpireProlongDays() != null) {
            _hashCode += getExpireProlongDays().hashCode();
        }
        if (getProlongType() != null) {
            _hashCode += getProlongType().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getModifyType() != null) {
            _hashCode += getModifyType().hashCode();
        }
        if (getDeductType() != null) {
            _hashCode += getDeductType().hashCode();
        }
        if (getIsCheckMaxBalance() != null) {
            _hashCode += getIsCheckMaxBalance().hashCode();
        }
        if (getCalculFeeFlag() != null) {
            _hashCode += getCalculFeeFlag().hashCode();
        }
        if (getIsReward() != null) {
            _hashCode += getIsReward().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssetChgIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "assetChgIn"));
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
        elemField.setFieldName("assetItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("validProlongDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validProlongDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireProlongDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireProlongDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prolongType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prolongType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("modifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCheckMaxBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCheckMaxBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculFeeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calculFeeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReward");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isReward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
