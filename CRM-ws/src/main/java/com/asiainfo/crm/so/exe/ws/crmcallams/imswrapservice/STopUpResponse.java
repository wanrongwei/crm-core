/**
 * STopUpResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class STopUpResponse  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Long accountBalance;

    private java.lang.String newActiveStop;

    private java.lang.Integer validityPeriod;

    private java.lang.Integer extra_validity;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductOrderResult[] prodOrderResultList;

    private java.util.Calendar rechargeTime;

    private java.util.Calendar dateTime;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceGroup[] freeResourceGroupList;

    private java.lang.Long topupAmount;

    private java.lang.Long rewardBalance;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] rewardBalanceList;

    public STopUpResponse() {
    }

    public STopUpResponse(
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Long accountBalance,
           java.lang.String newActiveStop,
           java.lang.Integer validityPeriod,
           java.lang.Integer extra_validity,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductOrderResult[] prodOrderResultList,
           java.util.Calendar rechargeTime,
           java.util.Calendar dateTime,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceGroup[] freeResourceGroupList,
           java.lang.Long topupAmount,
           java.lang.Long rewardBalance,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] rewardBalanceList) {
           this.userId = userId;
           this.phoneId = phoneId;
           this.accountBalance = accountBalance;
           this.newActiveStop = newActiveStop;
           this.validityPeriod = validityPeriod;
           this.extra_validity = extra_validity;
           this.prodOrderResultList = prodOrderResultList;
           this.rechargeTime = rechargeTime;
           this.dateTime = dateTime;
           this.freeResourceGroupList = freeResourceGroupList;
           this.topupAmount = topupAmount;
           this.rewardBalance = rewardBalance;
           this.rewardBalanceList = rewardBalanceList;
    }


    /**
     * Gets the userId value for this STopUpResponse.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this STopUpResponse.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this STopUpResponse.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this STopUpResponse.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the accountBalance value for this STopUpResponse.
     * 
     * @return accountBalance
     */
    public java.lang.Long getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this STopUpResponse.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.lang.Long accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the newActiveStop value for this STopUpResponse.
     * 
     * @return newActiveStop
     */
    public java.lang.String getNewActiveStop() {
        return newActiveStop;
    }


    /**
     * Sets the newActiveStop value for this STopUpResponse.
     * 
     * @param newActiveStop
     */
    public void setNewActiveStop(java.lang.String newActiveStop) {
        this.newActiveStop = newActiveStop;
    }


    /**
     * Gets the validityPeriod value for this STopUpResponse.
     * 
     * @return validityPeriod
     */
    public java.lang.Integer getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this STopUpResponse.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the extra_validity value for this STopUpResponse.
     * 
     * @return extra_validity
     */
    public java.lang.Integer getExtra_validity() {
        return extra_validity;
    }


    /**
     * Sets the extra_validity value for this STopUpResponse.
     * 
     * @param extra_validity
     */
    public void setExtra_validity(java.lang.Integer extra_validity) {
        this.extra_validity = extra_validity;
    }


    /**
     * Gets the prodOrderResultList value for this STopUpResponse.
     * 
     * @return prodOrderResultList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductOrderResult[] getProdOrderResultList() {
        return prodOrderResultList;
    }


    /**
     * Sets the prodOrderResultList value for this STopUpResponse.
     * 
     * @param prodOrderResultList
     */
    public void setProdOrderResultList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductOrderResult[] prodOrderResultList) {
        this.prodOrderResultList = prodOrderResultList;
    }


    /**
     * Gets the rechargeTime value for this STopUpResponse.
     * 
     * @return rechargeTime
     */
    public java.util.Calendar getRechargeTime() {
        return rechargeTime;
    }


    /**
     * Sets the rechargeTime value for this STopUpResponse.
     * 
     * @param rechargeTime
     */
    public void setRechargeTime(java.util.Calendar rechargeTime) {
        this.rechargeTime = rechargeTime;
    }


    /**
     * Gets the dateTime value for this STopUpResponse.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this STopUpResponse.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the freeResourceGroupList value for this STopUpResponse.
     * 
     * @return freeResourceGroupList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceGroup[] getFreeResourceGroupList() {
        return freeResourceGroupList;
    }


    /**
     * Sets the freeResourceGroupList value for this STopUpResponse.
     * 
     * @param freeResourceGroupList
     */
    public void setFreeResourceGroupList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceGroup[] freeResourceGroupList) {
        this.freeResourceGroupList = freeResourceGroupList;
    }


    /**
     * Gets the topupAmount value for this STopUpResponse.
     * 
     * @return topupAmount
     */
    public java.lang.Long getTopupAmount() {
        return topupAmount;
    }


    /**
     * Sets the topupAmount value for this STopUpResponse.
     * 
     * @param topupAmount
     */
    public void setTopupAmount(java.lang.Long topupAmount) {
        this.topupAmount = topupAmount;
    }


    /**
     * Gets the rewardBalance value for this STopUpResponse.
     * 
     * @return rewardBalance
     */
    public java.lang.Long getRewardBalance() {
        return rewardBalance;
    }


    /**
     * Sets the rewardBalance value for this STopUpResponse.
     * 
     * @param rewardBalance
     */
    public void setRewardBalance(java.lang.Long rewardBalance) {
        this.rewardBalance = rewardBalance;
    }


    /**
     * Gets the rewardBalanceList value for this STopUpResponse.
     * 
     * @return rewardBalanceList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] getRewardBalanceList() {
        return rewardBalanceList;
    }


    /**
     * Sets the rewardBalanceList value for this STopUpResponse.
     * 
     * @param rewardBalanceList
     */
    public void setRewardBalanceList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] rewardBalanceList) {
        this.rewardBalanceList = rewardBalanceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STopUpResponse)) return false;
        STopUpResponse other = (STopUpResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
            ((this.newActiveStop==null && other.getNewActiveStop()==null) || 
             (this.newActiveStop!=null &&
              this.newActiveStop.equals(other.getNewActiveStop()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.extra_validity==null && other.getExtra_validity()==null) || 
             (this.extra_validity!=null &&
              this.extra_validity.equals(other.getExtra_validity()))) &&
            ((this.prodOrderResultList==null && other.getProdOrderResultList()==null) || 
             (this.prodOrderResultList!=null &&
              java.util.Arrays.equals(this.prodOrderResultList, other.getProdOrderResultList()))) &&
            ((this.rechargeTime==null && other.getRechargeTime()==null) || 
             (this.rechargeTime!=null &&
              this.rechargeTime.equals(other.getRechargeTime()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.freeResourceGroupList==null && other.getFreeResourceGroupList()==null) || 
             (this.freeResourceGroupList!=null &&
              java.util.Arrays.equals(this.freeResourceGroupList, other.getFreeResourceGroupList()))) &&
            ((this.topupAmount==null && other.getTopupAmount()==null) || 
             (this.topupAmount!=null &&
              this.topupAmount.equals(other.getTopupAmount()))) &&
            ((this.rewardBalance==null && other.getRewardBalance()==null) || 
             (this.rewardBalance!=null &&
              this.rewardBalance.equals(other.getRewardBalance()))) &&
            ((this.rewardBalanceList==null && other.getRewardBalanceList()==null) || 
             (this.rewardBalanceList!=null &&
              java.util.Arrays.equals(this.rewardBalanceList, other.getRewardBalanceList())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getAccountBalance() != null) {
            _hashCode += getAccountBalance().hashCode();
        }
        if (getNewActiveStop() != null) {
            _hashCode += getNewActiveStop().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getExtra_validity() != null) {
            _hashCode += getExtra_validity().hashCode();
        }
        if (getProdOrderResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdOrderResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdOrderResultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRechargeTime() != null) {
            _hashCode += getRechargeTime().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getFreeResourceGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTopupAmount() != null) {
            _hashCode += getTopupAmount().hashCode();
        }
        if (getRewardBalance() != null) {
            _hashCode += getRewardBalance().hashCode();
        }
        if (getRewardBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRewardBalanceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(STopUpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTopUpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
        elemField.setFieldName("accountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newActiveStop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newActiveStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("extra_validity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extra_validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodOrderResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodOrderResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderResultListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceGroupItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topupAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rewardBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rewardBalanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sBalanceListItem"));
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
