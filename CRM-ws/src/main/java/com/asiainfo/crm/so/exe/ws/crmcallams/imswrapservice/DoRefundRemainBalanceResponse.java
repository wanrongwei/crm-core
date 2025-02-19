/**
 * DoRefundRemainBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoRefundRemainBalanceResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String outer_acctountId;

    private java.lang.String phoneId;

    private java.lang.Long userId;

    private java.lang.String outerUserId;

    private java.lang.Long busiSpecId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] refundBalanceList;

    public DoRefundRemainBalanceResponse() {
    }

    public DoRefundRemainBalanceResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Long accountId,
           java.lang.String outer_acctountId,
           java.lang.String phoneId,
           java.lang.Long userId,
           java.lang.String outerUserId,
           java.lang.Long busiSpecId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] refundBalanceList) {
        super(
            responseHead);
        this.accountId = accountId;
        this.outer_acctountId = outer_acctountId;
        this.phoneId = phoneId;
        this.userId = userId;
        this.outerUserId = outerUserId;
        this.busiSpecId = busiSpecId;
        this.refundBalanceList = refundBalanceList;
    }


    /**
     * Gets the accountId value for this DoRefundRemainBalanceResponse.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this DoRefundRemainBalanceResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the outer_acctountId value for this DoRefundRemainBalanceResponse.
     * 
     * @return outer_acctountId
     */
    public java.lang.String getOuter_acctountId() {
        return outer_acctountId;
    }


    /**
     * Sets the outer_acctountId value for this DoRefundRemainBalanceResponse.
     * 
     * @param outer_acctountId
     */
    public void setOuter_acctountId(java.lang.String outer_acctountId) {
        this.outer_acctountId = outer_acctountId;
    }


    /**
     * Gets the phoneId value for this DoRefundRemainBalanceResponse.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this DoRefundRemainBalanceResponse.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the userId value for this DoRefundRemainBalanceResponse.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoRefundRemainBalanceResponse.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the outerUserId value for this DoRefundRemainBalanceResponse.
     * 
     * @return outerUserId
     */
    public java.lang.String getOuterUserId() {
        return outerUserId;
    }


    /**
     * Sets the outerUserId value for this DoRefundRemainBalanceResponse.
     * 
     * @param outerUserId
     */
    public void setOuterUserId(java.lang.String outerUserId) {
        this.outerUserId = outerUserId;
    }


    /**
     * Gets the busiSpecId value for this DoRefundRemainBalanceResponse.
     * 
     * @return busiSpecId
     */
    public java.lang.Long getBusiSpecId() {
        return busiSpecId;
    }


    /**
     * Sets the busiSpecId value for this DoRefundRemainBalanceResponse.
     * 
     * @param busiSpecId
     */
    public void setBusiSpecId(java.lang.Long busiSpecId) {
        this.busiSpecId = busiSpecId;
    }


    /**
     * Gets the refundBalanceList value for this DoRefundRemainBalanceResponse.
     * 
     * @return refundBalanceList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] getRefundBalanceList() {
        return refundBalanceList;
    }


    /**
     * Sets the refundBalanceList value for this DoRefundRemainBalanceResponse.
     * 
     * @param refundBalanceList
     */
    public void setRefundBalanceList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[] refundBalanceList) {
        this.refundBalanceList = refundBalanceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRefundRemainBalanceResponse)) return false;
        DoRefundRemainBalanceResponse other = (DoRefundRemainBalanceResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.outer_acctountId==null && other.getOuter_acctountId()==null) || 
             (this.outer_acctountId!=null &&
              this.outer_acctountId.equals(other.getOuter_acctountId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.outerUserId==null && other.getOuterUserId()==null) || 
             (this.outerUserId!=null &&
              this.outerUserId.equals(other.getOuterUserId()))) &&
            ((this.busiSpecId==null && other.getBusiSpecId()==null) || 
             (this.busiSpecId!=null &&
              this.busiSpecId.equals(other.getBusiSpecId()))) &&
            ((this.refundBalanceList==null && other.getRefundBalanceList()==null) || 
             (this.refundBalanceList!=null &&
              java.util.Arrays.equals(this.refundBalanceList, other.getRefundBalanceList())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getOuter_acctountId() != null) {
            _hashCode += getOuter_acctountId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getOuterUserId() != null) {
            _hashCode += getOuterUserId().hashCode();
        }
        if (getBusiSpecId() != null) {
            _hashCode += getBusiSpecId().hashCode();
        }
        if (getRefundBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundBalanceList(), i);
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
        new org.apache.axis.description.TypeDesc(DoRefundRemainBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRefundRemainBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acctountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acctountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSpecId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundBalanceList"));
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
