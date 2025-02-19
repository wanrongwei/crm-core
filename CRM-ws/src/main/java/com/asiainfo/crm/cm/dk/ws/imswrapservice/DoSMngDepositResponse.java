/**
 * DoSMngDepositResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoSMngDepositResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Integer resourceType;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SDepositResp sDepositResp;

    public DoSMngDepositResponse() {
    }

    public DoSMngDepositResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Integer resourceType,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SDepositResp sDepositResp) {
        super(
            responseHead);
        this.outerAcctId = outerAcctId;
        this.acctId = acctId;
        this.userId = userId;
        this.phoneId = phoneId;
        this.resourceType = resourceType;
        this.sDepositResp = sDepositResp;
    }


    /**
     * Gets the outerAcctId value for this DoSMngDepositResponse.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoSMngDepositResponse.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this DoSMngDepositResponse.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoSMngDepositResponse.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this DoSMngDepositResponse.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoSMngDepositResponse.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this DoSMngDepositResponse.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this DoSMngDepositResponse.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the resourceType value for this DoSMngDepositResponse.
     * 
     * @return resourceType
     */
    public java.lang.Integer getResourceType() {
        return resourceType;
    }


    /**
     * Sets the resourceType value for this DoSMngDepositResponse.
     * 
     * @param resourceType
     */
    public void setResourceType(java.lang.Integer resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * Gets the sDepositResp value for this DoSMngDepositResponse.
     * 
     * @return sDepositResp
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SDepositResp getSDepositResp() {
        return sDepositResp;
    }


    /**
     * Sets the sDepositResp value for this DoSMngDepositResponse.
     * 
     * @param sDepositResp
     */
    public void setSDepositResp(com.asiainfo.crm.cm.dk.ws.imswrapservice.SDepositResp sDepositResp) {
        this.sDepositResp = sDepositResp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSMngDepositResponse)) return false;
        DoSMngDepositResponse other = (DoSMngDepositResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.resourceType==null && other.getResourceType()==null) || 
             (this.resourceType!=null &&
              this.resourceType.equals(other.getResourceType()))) &&
            ((this.sDepositResp==null && other.getSDepositResp()==null) || 
             (this.sDepositResp!=null &&
              this.sDepositResp.equals(other.getSDepositResp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getResourceType() != null) {
            _hashCode += getResourceType().hashCode();
        }
        if (getSDepositResp() != null) {
            _hashCode += getSDepositResp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoSMngDepositResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSMngDepositResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
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
        elemField.setFieldName("resourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDepositResp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sDepositResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDepositResp"));
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
