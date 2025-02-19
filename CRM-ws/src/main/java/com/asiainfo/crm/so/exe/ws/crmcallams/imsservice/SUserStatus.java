/**
 * SUserStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SUserStatus  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Integer regionCode;

    private java.lang.Short newState;

    private java.lang.Short subType;

    private java.lang.Short reasonDays;

    private java.lang.String actionDate;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.Short suspendRequestFlag;

    private java.lang.Short fraudFlag;

    private java.lang.Short unbillingFlag;

    public SUserStatus() {
    }

    public SUserStatus(
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Integer regionCode,
           java.lang.Short newState,
           java.lang.Short subType,
           java.lang.Short reasonDays,
           java.lang.String actionDate,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.Short suspendRequestFlag,
           java.lang.Short fraudFlag,
           java.lang.Short unbillingFlag) {
           this.userId = userId;
           this.phoneId = phoneId;
           this.regionCode = regionCode;
           this.newState = newState;
           this.subType = subType;
           this.reasonDays = reasonDays;
           this.actionDate = actionDate;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.suspendRequestFlag = suspendRequestFlag;
           this.fraudFlag = fraudFlag;
           this.unbillingFlag = unbillingFlag;
    }


    /**
     * Gets the userId value for this SUserStatus.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SUserStatus.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SUserStatus.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SUserStatus.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the regionCode value for this SUserStatus.
     * 
     * @return regionCode
     */
    public java.lang.Integer getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this SUserStatus.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.Integer regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the newState value for this SUserStatus.
     * 
     * @return newState
     */
    public java.lang.Short getNewState() {
        return newState;
    }


    /**
     * Sets the newState value for this SUserStatus.
     * 
     * @param newState
     */
    public void setNewState(java.lang.Short newState) {
        this.newState = newState;
    }


    /**
     * Gets the subType value for this SUserStatus.
     * 
     * @return subType
     */
    public java.lang.Short getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this SUserStatus.
     * 
     * @param subType
     */
    public void setSubType(java.lang.Short subType) {
        this.subType = subType;
    }


    /**
     * Gets the reasonDays value for this SUserStatus.
     * 
     * @return reasonDays
     */
    public java.lang.Short getReasonDays() {
        return reasonDays;
    }


    /**
     * Sets the reasonDays value for this SUserStatus.
     * 
     * @param reasonDays
     */
    public void setReasonDays(java.lang.Short reasonDays) {
        this.reasonDays = reasonDays;
    }


    /**
     * Gets the actionDate value for this SUserStatus.
     * 
     * @return actionDate
     */
    public java.lang.String getActionDate() {
        return actionDate;
    }


    /**
     * Sets the actionDate value for this SUserStatus.
     * 
     * @param actionDate
     */
    public void setActionDate(java.lang.String actionDate) {
        this.actionDate = actionDate;
    }


    /**
     * Gets the validDate value for this SUserStatus.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SUserStatus.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SUserStatus.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SUserStatus.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the suspendRequestFlag value for this SUserStatus.
     * 
     * @return suspendRequestFlag
     */
    public java.lang.Short getSuspendRequestFlag() {
        return suspendRequestFlag;
    }


    /**
     * Sets the suspendRequestFlag value for this SUserStatus.
     * 
     * @param suspendRequestFlag
     */
    public void setSuspendRequestFlag(java.lang.Short suspendRequestFlag) {
        this.suspendRequestFlag = suspendRequestFlag;
    }


    /**
     * Gets the fraudFlag value for this SUserStatus.
     * 
     * @return fraudFlag
     */
    public java.lang.Short getFraudFlag() {
        return fraudFlag;
    }


    /**
     * Sets the fraudFlag value for this SUserStatus.
     * 
     * @param fraudFlag
     */
    public void setFraudFlag(java.lang.Short fraudFlag) {
        this.fraudFlag = fraudFlag;
    }


    /**
     * Gets the unbillingFlag value for this SUserStatus.
     * 
     * @return unbillingFlag
     */
    public java.lang.Short getUnbillingFlag() {
        return unbillingFlag;
    }


    /**
     * Sets the unbillingFlag value for this SUserStatus.
     * 
     * @param unbillingFlag
     */
    public void setUnbillingFlag(java.lang.Short unbillingFlag) {
        this.unbillingFlag = unbillingFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUserStatus)) return false;
        SUserStatus other = (SUserStatus) obj;
       
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
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.newState==null && other.getNewState()==null) || 
             (this.newState!=null &&
              this.newState.equals(other.getNewState()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.reasonDays==null && other.getReasonDays()==null) || 
             (this.reasonDays!=null &&
              this.reasonDays.equals(other.getReasonDays()))) &&
            ((this.actionDate==null && other.getActionDate()==null) || 
             (this.actionDate!=null &&
              this.actionDate.equals(other.getActionDate()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.suspendRequestFlag==null && other.getSuspendRequestFlag()==null) || 
             (this.suspendRequestFlag!=null &&
              this.suspendRequestFlag.equals(other.getSuspendRequestFlag()))) &&
            ((this.fraudFlag==null && other.getFraudFlag()==null) || 
             (this.fraudFlag!=null &&
              this.fraudFlag.equals(other.getFraudFlag()))) &&
            ((this.unbillingFlag==null && other.getUnbillingFlag()==null) || 
             (this.unbillingFlag!=null &&
              this.unbillingFlag.equals(other.getUnbillingFlag())));
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
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getNewState() != null) {
            _hashCode += getNewState().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getReasonDays() != null) {
            _hashCode += getReasonDays().hashCode();
        }
        if (getActionDate() != null) {
            _hashCode += getActionDate().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getSuspendRequestFlag() != null) {
            _hashCode += getSuspendRequestFlag().hashCode();
        }
        if (getFraudFlag() != null) {
            _hashCode += getFraudFlag().hashCode();
        }
        if (getUnbillingFlag() != null) {
            _hashCode += getUnbillingFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUserStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserStatus"));
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
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendRequestFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspendRequestFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbillingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unbillingFlag"));
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
