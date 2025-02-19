/**
 * AdTransferParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AdTransferParam  implements java.io.Serializable {
    private java.lang.String outerOrgAcctId;

    private java.lang.Long orgAcctId;

    private java.lang.String orgPhoneId;

    private java.lang.Long orgUserId;

    private java.lang.String outerOrgUserId;

    private java.lang.Integer assetItem;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail[] targetTransDetails;

    public AdTransferParam() {
    }

    public AdTransferParam(
           java.lang.String outerOrgAcctId,
           java.lang.Long orgAcctId,
           java.lang.String orgPhoneId,
           java.lang.Long orgUserId,
           java.lang.String outerOrgUserId,
           java.lang.Integer assetItem,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail[] targetTransDetails) {
           this.outerOrgAcctId = outerOrgAcctId;
           this.orgAcctId = orgAcctId;
           this.orgPhoneId = orgPhoneId;
           this.orgUserId = orgUserId;
           this.outerOrgUserId = outerOrgUserId;
           this.assetItem = assetItem;
           this.targetTransDetails = targetTransDetails;
    }


    /**
     * Gets the outerOrgAcctId value for this AdTransferParam.
     * 
     * @return outerOrgAcctId
     */
    public java.lang.String getOuterOrgAcctId() {
        return outerOrgAcctId;
    }


    /**
     * Sets the outerOrgAcctId value for this AdTransferParam.
     * 
     * @param outerOrgAcctId
     */
    public void setOuterOrgAcctId(java.lang.String outerOrgAcctId) {
        this.outerOrgAcctId = outerOrgAcctId;
    }


    /**
     * Gets the orgAcctId value for this AdTransferParam.
     * 
     * @return orgAcctId
     */
    public java.lang.Long getOrgAcctId() {
        return orgAcctId;
    }


    /**
     * Sets the orgAcctId value for this AdTransferParam.
     * 
     * @param orgAcctId
     */
    public void setOrgAcctId(java.lang.Long orgAcctId) {
        this.orgAcctId = orgAcctId;
    }


    /**
     * Gets the orgPhoneId value for this AdTransferParam.
     * 
     * @return orgPhoneId
     */
    public java.lang.String getOrgPhoneId() {
        return orgPhoneId;
    }


    /**
     * Sets the orgPhoneId value for this AdTransferParam.
     * 
     * @param orgPhoneId
     */
    public void setOrgPhoneId(java.lang.String orgPhoneId) {
        this.orgPhoneId = orgPhoneId;
    }


    /**
     * Gets the orgUserId value for this AdTransferParam.
     * 
     * @return orgUserId
     */
    public java.lang.Long getOrgUserId() {
        return orgUserId;
    }


    /**
     * Sets the orgUserId value for this AdTransferParam.
     * 
     * @param orgUserId
     */
    public void setOrgUserId(java.lang.Long orgUserId) {
        this.orgUserId = orgUserId;
    }


    /**
     * Gets the outerOrgUserId value for this AdTransferParam.
     * 
     * @return outerOrgUserId
     */
    public java.lang.String getOuterOrgUserId() {
        return outerOrgUserId;
    }


    /**
     * Sets the outerOrgUserId value for this AdTransferParam.
     * 
     * @param outerOrgUserId
     */
    public void setOuterOrgUserId(java.lang.String outerOrgUserId) {
        this.outerOrgUserId = outerOrgUserId;
    }


    /**
     * Gets the assetItem value for this AdTransferParam.
     * 
     * @return assetItem
     */
    public java.lang.Integer getAssetItem() {
        return assetItem;
    }


    /**
     * Sets the assetItem value for this AdTransferParam.
     * 
     * @param assetItem
     */
    public void setAssetItem(java.lang.Integer assetItem) {
        this.assetItem = assetItem;
    }


    /**
     * Gets the targetTransDetails value for this AdTransferParam.
     * 
     * @return targetTransDetails
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail[] getTargetTransDetails() {
        return targetTransDetails;
    }


    /**
     * Sets the targetTransDetails value for this AdTransferParam.
     * 
     * @param targetTransDetails
     */
    public void setTargetTransDetails(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail[] targetTransDetails) {
        this.targetTransDetails = targetTransDetails;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail getTargetTransDetails(int i) {
        return this.targetTransDetails[i];
    }

    public void setTargetTransDetails(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail _value) {
        this.targetTransDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdTransferParam)) return false;
        AdTransferParam other = (AdTransferParam) obj;
        
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
            ((this.orgUserId==null && other.getOrgUserId()==null) || 
             (this.orgUserId!=null &&
              this.orgUserId.equals(other.getOrgUserId()))) &&
            ((this.outerOrgUserId==null && other.getOuterOrgUserId()==null) || 
             (this.outerOrgUserId!=null &&
              this.outerOrgUserId.equals(other.getOuterOrgUserId()))) &&
            ((this.assetItem==null && other.getAssetItem()==null) || 
             (this.assetItem!=null &&
              this.assetItem.equals(other.getAssetItem()))) &&
            ((this.targetTransDetails==null && other.getTargetTransDetails()==null) || 
             (this.targetTransDetails!=null &&
              java.util.Arrays.equals(this.targetTransDetails, other.getTargetTransDetails())));
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
        if (getOrgUserId() != null) {
            _hashCode += getOrgUserId().hashCode();
        }
        if (getOuterOrgUserId() != null) {
            _hashCode += getOuterOrgUserId().hashCode();
        }
        if (getAssetItem() != null) {
            _hashCode += getAssetItem().hashCode();
        }
        if (getTargetTransDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetTransDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetTransDetails(), i);
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
        new org.apache.axis.description.TypeDesc(AdTransferParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adTransferParam"));
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
        elemField.setFieldName("orgUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerOrgUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerOrgUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTransDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetTransDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
