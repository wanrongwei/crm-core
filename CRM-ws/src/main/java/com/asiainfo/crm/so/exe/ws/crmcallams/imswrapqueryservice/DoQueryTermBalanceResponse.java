/**
 * DoQueryTermBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryTermBalanceResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAccttId;

    private java.lang.String phoneId;

    private java.lang.Long userId;

    private java.lang.String outerUserId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUserStatus userStatus;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance[] termBalanceList;

    public DoQueryTermBalanceResponse() {
    }

    public DoQueryTermBalanceResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Long acctId,
           java.lang.String outerAccttId,
           java.lang.String phoneId,
           java.lang.Long userId,
           java.lang.String outerUserId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUserStatus userStatus,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance[] termBalanceList) {
        super(
            responseHead);
        this.acctId = acctId;
        this.outerAccttId = outerAccttId;
        this.phoneId = phoneId;
        this.userId = userId;
        this.outerUserId = outerUserId;
        this.userStatus = userStatus;
        this.termBalanceList = termBalanceList;
    }


    /**
     * Gets the acctId value for this DoQueryTermBalanceResponse.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoQueryTermBalanceResponse.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAccttId value for this DoQueryTermBalanceResponse.
     * 
     * @return outerAccttId
     */
    public java.lang.String getOuterAccttId() {
        return outerAccttId;
    }


    /**
     * Sets the outerAccttId value for this DoQueryTermBalanceResponse.
     * 
     * @param outerAccttId
     */
    public void setOuterAccttId(java.lang.String outerAccttId) {
        this.outerAccttId = outerAccttId;
    }


    /**
     * Gets the phoneId value for this DoQueryTermBalanceResponse.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this DoQueryTermBalanceResponse.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the userId value for this DoQueryTermBalanceResponse.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoQueryTermBalanceResponse.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the outerUserId value for this DoQueryTermBalanceResponse.
     * 
     * @return outerUserId
     */
    public java.lang.String getOuterUserId() {
        return outerUserId;
    }


    /**
     * Sets the outerUserId value for this DoQueryTermBalanceResponse.
     * 
     * @param outerUserId
     */
    public void setOuterUserId(java.lang.String outerUserId) {
        this.outerUserId = outerUserId;
    }


    /**
     * Gets the userStatus value for this DoQueryTermBalanceResponse.
     * 
     * @return userStatus
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUserStatus getUserStatus() {
        return userStatus;
    }


    /**
     * Sets the userStatus value for this DoQueryTermBalanceResponse.
     * 
     * @param userStatus
     */
    public void setUserStatus(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUserStatus userStatus) {
        this.userStatus = userStatus;
    }


    /**
     * Gets the termBalanceList value for this DoQueryTermBalanceResponse.
     * 
     * @return termBalanceList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance[] getTermBalanceList() {
        return termBalanceList;
    }


    /**
     * Sets the termBalanceList value for this DoQueryTermBalanceResponse.
     * 
     * @param termBalanceList
     */
    public void setTermBalanceList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBalance[] termBalanceList) {
        this.termBalanceList = termBalanceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryTermBalanceResponse)) return false;
        DoQueryTermBalanceResponse other = (DoQueryTermBalanceResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAccttId==null && other.getOuterAccttId()==null) || 
             (this.outerAccttId!=null &&
              this.outerAccttId.equals(other.getOuterAccttId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.outerUserId==null && other.getOuterUserId()==null) || 
             (this.outerUserId!=null &&
              this.outerUserId.equals(other.getOuterUserId()))) &&
            ((this.userStatus==null && other.getUserStatus()==null) || 
             (this.userStatus!=null &&
              this.userStatus.equals(other.getUserStatus()))) &&
            ((this.termBalanceList==null && other.getTermBalanceList()==null) || 
             (this.termBalanceList!=null &&
              java.util.Arrays.equals(this.termBalanceList, other.getTermBalanceList())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAccttId() != null) {
            _hashCode += getOuterAccttId().hashCode();
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
        if (getUserStatus() != null) {
            _hashCode += getUserStatus().hashCode();
        }
        if (getTermBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTermBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTermBalanceList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryTermBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTermBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAccttId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAccttId"));
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
        elemField.setFieldName("userStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termBalanceList"));
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
