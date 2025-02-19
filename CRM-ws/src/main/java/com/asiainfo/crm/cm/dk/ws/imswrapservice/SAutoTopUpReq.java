/**
 * SAutoTopUpReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SAutoTopUpReq  implements java.io.Serializable {
    private java.lang.Short operType;

    private java.lang.String outerPayAcctId;

    private java.lang.Long payAcctId;

    private java.lang.Long payUserId;

    private java.lang.String payPhoneId;

    private java.lang.Short notificationFlag;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.AutoTopUpRelation[] autoTopUpRelList;

    public SAutoTopUpReq() {
    }

    public SAutoTopUpReq(
           java.lang.Short operType,
           java.lang.String outerPayAcctId,
           java.lang.Long payAcctId,
           java.lang.Long payUserId,
           java.lang.String payPhoneId,
           java.lang.Short notificationFlag,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.AutoTopUpRelation[] autoTopUpRelList) {
           this.operType = operType;
           this.outerPayAcctId = outerPayAcctId;
           this.payAcctId = payAcctId;
           this.payUserId = payUserId;
           this.payPhoneId = payPhoneId;
           this.notificationFlag = notificationFlag;
           this.autoTopUpRelList = autoTopUpRelList;
    }


    /**
     * Gets the operType value for this SAutoTopUpReq.
     * 
     * @return operType
     */
    public java.lang.Short getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this SAutoTopUpReq.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Short operType) {
        this.operType = operType;
    }


    /**
     * Gets the outerPayAcctId value for this SAutoTopUpReq.
     * 
     * @return outerPayAcctId
     */
    public java.lang.String getOuterPayAcctId() {
        return outerPayAcctId;
    }


    /**
     * Sets the outerPayAcctId value for this SAutoTopUpReq.
     * 
     * @param outerPayAcctId
     */
    public void setOuterPayAcctId(java.lang.String outerPayAcctId) {
        this.outerPayAcctId = outerPayAcctId;
    }


    /**
     * Gets the payAcctId value for this SAutoTopUpReq.
     * 
     * @return payAcctId
     */
    public java.lang.Long getPayAcctId() {
        return payAcctId;
    }


    /**
     * Sets the payAcctId value for this SAutoTopUpReq.
     * 
     * @param payAcctId
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }


    /**
     * Gets the payUserId value for this SAutoTopUpReq.
     * 
     * @return payUserId
     */
    public java.lang.Long getPayUserId() {
        return payUserId;
    }


    /**
     * Sets the payUserId value for this SAutoTopUpReq.
     * 
     * @param payUserId
     */
    public void setPayUserId(java.lang.Long payUserId) {
        this.payUserId = payUserId;
    }


    /**
     * Gets the payPhoneId value for this SAutoTopUpReq.
     * 
     * @return payPhoneId
     */
    public java.lang.String getPayPhoneId() {
        return payPhoneId;
    }


    /**
     * Sets the payPhoneId value for this SAutoTopUpReq.
     * 
     * @param payPhoneId
     */
    public void setPayPhoneId(java.lang.String payPhoneId) {
        this.payPhoneId = payPhoneId;
    }


    /**
     * Gets the notificationFlag value for this SAutoTopUpReq.
     * 
     * @return notificationFlag
     */
    public java.lang.Short getNotificationFlag() {
        return notificationFlag;
    }


    /**
     * Sets the notificationFlag value for this SAutoTopUpReq.
     * 
     * @param notificationFlag
     */
    public void setNotificationFlag(java.lang.Short notificationFlag) {
        this.notificationFlag = notificationFlag;
    }


    /**
     * Gets the autoTopUpRelList value for this SAutoTopUpReq.
     * 
     * @return autoTopUpRelList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.AutoTopUpRelation[] getAutoTopUpRelList() {
        return autoTopUpRelList;
    }


    /**
     * Sets the autoTopUpRelList value for this SAutoTopUpReq.
     * 
     * @param autoTopUpRelList
     */
    public void setAutoTopUpRelList(com.asiainfo.crm.cm.dk.ws.imswrapservice.AutoTopUpRelation[] autoTopUpRelList) {
        this.autoTopUpRelList = autoTopUpRelList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAutoTopUpReq)) return false;
        SAutoTopUpReq other = (SAutoTopUpReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType()))) &&
            ((this.outerPayAcctId==null && other.getOuterPayAcctId()==null) || 
             (this.outerPayAcctId!=null &&
              this.outerPayAcctId.equals(other.getOuterPayAcctId()))) &&
            ((this.payAcctId==null && other.getPayAcctId()==null) || 
             (this.payAcctId!=null &&
              this.payAcctId.equals(other.getPayAcctId()))) &&
            ((this.payUserId==null && other.getPayUserId()==null) || 
             (this.payUserId!=null &&
              this.payUserId.equals(other.getPayUserId()))) &&
            ((this.payPhoneId==null && other.getPayPhoneId()==null) || 
             (this.payPhoneId!=null &&
              this.payPhoneId.equals(other.getPayPhoneId()))) &&
            ((this.notificationFlag==null && other.getNotificationFlag()==null) || 
             (this.notificationFlag!=null &&
              this.notificationFlag.equals(other.getNotificationFlag()))) &&
            ((this.autoTopUpRelList==null && other.getAutoTopUpRelList()==null) || 
             (this.autoTopUpRelList!=null &&
              java.util.Arrays.equals(this.autoTopUpRelList, other.getAutoTopUpRelList())));
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
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        if (getOuterPayAcctId() != null) {
            _hashCode += getOuterPayAcctId().hashCode();
        }
        if (getPayAcctId() != null) {
            _hashCode += getPayAcctId().hashCode();
        }
        if (getPayUserId() != null) {
            _hashCode += getPayUserId().hashCode();
        }
        if (getPayPhoneId() != null) {
            _hashCode += getPayPhoneId().hashCode();
        }
        if (getNotificationFlag() != null) {
            _hashCode += getNotificationFlag().hashCode();
        }
        if (getAutoTopUpRelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoTopUpRelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoTopUpRelList(), i);
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
        new org.apache.axis.description.TypeDesc(SAutoTopUpReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAutoTopUpReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerPayAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerPayAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTopUpRelList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTopUpRelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "autoTopUpRelationListItem"));
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
