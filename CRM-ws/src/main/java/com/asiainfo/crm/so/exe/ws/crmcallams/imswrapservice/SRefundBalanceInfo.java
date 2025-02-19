/**
 * SRefundBalanceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SRefundBalanceInfo  implements java.io.Serializable {
    private java.lang.Integer itemType;

    private java.lang.Long resourceId;

    private java.lang.Integer returnType;

    private java.lang.String voucherId;

    private java.lang.Long acctId;

    private java.lang.Integer reason_type;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemDetail[] refundItemDetails;

    private java.lang.Integer ownnerType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransparentData transparentData;

    public SRefundBalanceInfo() {
    }

    public SRefundBalanceInfo(
           java.lang.Integer itemType,
           java.lang.Long resourceId,
           java.lang.Integer returnType,
           java.lang.String voucherId,
           java.lang.Long acctId,
           java.lang.Integer reason_type,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemDetail[] refundItemDetails,
           java.lang.Integer ownnerType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransparentData transparentData) {
           this.itemType = itemType;
           this.resourceId = resourceId;
           this.returnType = returnType;
           this.voucherId = voucherId;
           this.acctId = acctId;
           this.reason_type = reason_type;
           this.refundItemDetails = refundItemDetails;
           this.ownnerType = ownnerType;
           this.transparentData = transparentData;
    }


    /**
     * Gets the itemType value for this SRefundBalanceInfo.
     * 
     * @return itemType
     */
    public java.lang.Integer getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SRefundBalanceInfo.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Integer itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the resourceId value for this SRefundBalanceInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SRefundBalanceInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the returnType value for this SRefundBalanceInfo.
     * 
     * @return returnType
     */
    public java.lang.Integer getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this SRefundBalanceInfo.
     * 
     * @param returnType
     */
    public void setReturnType(java.lang.Integer returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the voucherId value for this SRefundBalanceInfo.
     * 
     * @return voucherId
     */
    public java.lang.String getVoucherId() {
        return voucherId;
    }


    /**
     * Sets the voucherId value for this SRefundBalanceInfo.
     * 
     * @param voucherId
     */
    public void setVoucherId(java.lang.String voucherId) {
        this.voucherId = voucherId;
    }


    /**
     * Gets the acctId value for this SRefundBalanceInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SRefundBalanceInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the reason_type value for this SRefundBalanceInfo.
     * 
     * @return reason_type
     */
    public java.lang.Integer getReason_type() {
        return reason_type;
    }


    /**
     * Sets the reason_type value for this SRefundBalanceInfo.
     * 
     * @param reason_type
     */
    public void setReason_type(java.lang.Integer reason_type) {
        this.reason_type = reason_type;
    }


    /**
     * Gets the refundItemDetails value for this SRefundBalanceInfo.
     * 
     * @return refundItemDetails
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemDetail[] getRefundItemDetails() {
        return refundItemDetails;
    }


    /**
     * Sets the refundItemDetails value for this SRefundBalanceInfo.
     * 
     * @param refundItemDetails
     */
    public void setRefundItemDetails(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemDetail[] refundItemDetails) {
        this.refundItemDetails = refundItemDetails;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemDetail getRefundItemDetails(int i) {
        return this.refundItemDetails[i];
    }

    public void setRefundItemDetails(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemDetail _value) {
        this.refundItemDetails[i] = _value;
    }


    /**
     * Gets the ownnerType value for this SRefundBalanceInfo.
     * 
     * @return ownnerType
     */
    public java.lang.Integer getOwnnerType() {
        return ownnerType;
    }


    /**
     * Sets the ownnerType value for this SRefundBalanceInfo.
     * 
     * @param ownnerType
     */
    public void setOwnnerType(java.lang.Integer ownnerType) {
        this.ownnerType = ownnerType;
    }


    /**
     * Gets the transparentData value for this SRefundBalanceInfo.
     * 
     * @return transparentData
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransparentData getTransparentData() {
        return transparentData;
    }


    /**
     * Sets the transparentData value for this SRefundBalanceInfo.
     * 
     * @param transparentData
     */
    public void setTransparentData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransparentData transparentData) {
        this.transparentData = transparentData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRefundBalanceInfo)) return false;
        SRefundBalanceInfo other = (SRefundBalanceInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.returnType==null && other.getReturnType()==null) || 
             (this.returnType!=null &&
              this.returnType.equals(other.getReturnType()))) &&
            ((this.voucherId==null && other.getVoucherId()==null) || 
             (this.voucherId!=null &&
              this.voucherId.equals(other.getVoucherId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.reason_type==null && other.getReason_type()==null) || 
             (this.reason_type!=null &&
              this.reason_type.equals(other.getReason_type()))) &&
            ((this.refundItemDetails==null && other.getRefundItemDetails()==null) || 
             (this.refundItemDetails!=null &&
              java.util.Arrays.equals(this.refundItemDetails, other.getRefundItemDetails()))) &&
            ((this.ownnerType==null && other.getOwnnerType()==null) || 
             (this.ownnerType!=null &&
              this.ownnerType.equals(other.getOwnnerType()))) &&
            ((this.transparentData==null && other.getTransparentData()==null) || 
             (this.transparentData!=null &&
              this.transparentData.equals(other.getTransparentData())));
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
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getReturnType() != null) {
            _hashCode += getReturnType().hashCode();
        }
        if (getVoucherId() != null) {
            _hashCode += getVoucherId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getReason_type() != null) {
            _hashCode += getReason_type().hashCode();
        }
        if (getRefundItemDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundItemDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundItemDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwnnerType() != null) {
            _hashCode += getOwnnerType().hashCode();
        }
        if (getTransparentData() != null) {
            _hashCode += getTransparentData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRefundBalanceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundBalanceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("returnType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voucherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("reason_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundItemDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransparentData"));
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
