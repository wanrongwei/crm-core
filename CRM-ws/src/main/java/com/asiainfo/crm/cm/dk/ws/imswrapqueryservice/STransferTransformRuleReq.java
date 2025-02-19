/**
 * STransferTransformRuleReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class STransferTransformRuleReq  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Integer assetType;

    private java.lang.Integer assetItemId;

    private java.lang.Integer orgOwnerType;

    private java.lang.Integer assetMeasureId;

    private java.lang.Long assetItemAmount;

    public STransferTransformRuleReq() {
    }

    public STransferTransformRuleReq(
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Integer assetType,
           java.lang.Integer assetItemId,
           java.lang.Integer orgOwnerType,
           java.lang.Integer assetMeasureId,
           java.lang.Long assetItemAmount) {
           this.userId = userId;
           this.phoneId = phoneId;
           this.assetType = assetType;
           this.assetItemId = assetItemId;
           this.orgOwnerType = orgOwnerType;
           this.assetMeasureId = assetMeasureId;
           this.assetItemAmount = assetItemAmount;
    }


    /**
     * Gets the userId value for this STransferTransformRuleReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this STransferTransformRuleReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this STransferTransformRuleReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this STransferTransformRuleReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the assetType value for this STransferTransformRuleReq.
     * 
     * @return assetType
     */
    public java.lang.Integer getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this STransferTransformRuleReq.
     * 
     * @param assetType
     */
    public void setAssetType(java.lang.Integer assetType) {
        this.assetType = assetType;
    }


    /**
     * Gets the assetItemId value for this STransferTransformRuleReq.
     * 
     * @return assetItemId
     */
    public java.lang.Integer getAssetItemId() {
        return assetItemId;
    }


    /**
     * Sets the assetItemId value for this STransferTransformRuleReq.
     * 
     * @param assetItemId
     */
    public void setAssetItemId(java.lang.Integer assetItemId) {
        this.assetItemId = assetItemId;
    }


    /**
     * Gets the orgOwnerType value for this STransferTransformRuleReq.
     * 
     * @return orgOwnerType
     */
    public java.lang.Integer getOrgOwnerType() {
        return orgOwnerType;
    }


    /**
     * Sets the orgOwnerType value for this STransferTransformRuleReq.
     * 
     * @param orgOwnerType
     */
    public void setOrgOwnerType(java.lang.Integer orgOwnerType) {
        this.orgOwnerType = orgOwnerType;
    }


    /**
     * Gets the assetMeasureId value for this STransferTransformRuleReq.
     * 
     * @return assetMeasureId
     */
    public java.lang.Integer getAssetMeasureId() {
        return assetMeasureId;
    }


    /**
     * Sets the assetMeasureId value for this STransferTransformRuleReq.
     * 
     * @param assetMeasureId
     */
    public void setAssetMeasureId(java.lang.Integer assetMeasureId) {
        this.assetMeasureId = assetMeasureId;
    }


    /**
     * Gets the assetItemAmount value for this STransferTransformRuleReq.
     * 
     * @return assetItemAmount
     */
    public java.lang.Long getAssetItemAmount() {
        return assetItemAmount;
    }


    /**
     * Sets the assetItemAmount value for this STransferTransformRuleReq.
     * 
     * @param assetItemAmount
     */
    public void setAssetItemAmount(java.lang.Long assetItemAmount) {
        this.assetItemAmount = assetItemAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STransferTransformRuleReq)) return false;
        STransferTransformRuleReq other = (STransferTransformRuleReq) obj;
        if (obj == null) return false;
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
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType()))) &&
            ((this.assetItemId==null && other.getAssetItemId()==null) || 
             (this.assetItemId!=null &&
              this.assetItemId.equals(other.getAssetItemId()))) &&
            ((this.orgOwnerType==null && other.getOrgOwnerType()==null) || 
             (this.orgOwnerType!=null &&
              this.orgOwnerType.equals(other.getOrgOwnerType()))) &&
            ((this.assetMeasureId==null && other.getAssetMeasureId()==null) || 
             (this.assetMeasureId!=null &&
              this.assetMeasureId.equals(other.getAssetMeasureId()))) &&
            ((this.assetItemAmount==null && other.getAssetItemAmount()==null) || 
             (this.assetItemAmount!=null &&
              this.assetItemAmount.equals(other.getAssetItemAmount())));
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
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        if (getAssetItemId() != null) {
            _hashCode += getAssetItemId().hashCode();
        }
        if (getOrgOwnerType() != null) {
            _hashCode += getOrgOwnerType().hashCode();
        }
        if (getAssetMeasureId() != null) {
            _hashCode += getAssetMeasureId().hashCode();
        }
        if (getAssetItemAmount() != null) {
            _hashCode += getAssetItemAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(STransferTransformRuleReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransferTransformRuleReq"));
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
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("assetMeasureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetMeasureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetItemAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItemAmount"));
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
