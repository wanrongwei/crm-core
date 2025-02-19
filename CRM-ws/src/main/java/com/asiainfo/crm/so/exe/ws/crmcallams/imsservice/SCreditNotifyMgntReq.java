/**
 * SCreditNotifyMgntReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SCreditNotifyMgntReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String phoneId;

    private java.lang.Long userId;

    private java.lang.Short actionType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotify[] notifyList;

    public SCreditNotifyMgntReq() {
    }

    public SCreditNotifyMgntReq(
           java.lang.Long acctId,
           java.lang.String phoneId,
           java.lang.Long userId,
           java.lang.Short actionType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotify[] notifyList) {
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.userId = userId;
           this.actionType = actionType;
           this.notifyList = notifyList;
    }


    /**
     * Gets the acctId value for this SCreditNotifyMgntReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SCreditNotifyMgntReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this SCreditNotifyMgntReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SCreditNotifyMgntReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the userId value for this SCreditNotifyMgntReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SCreditNotifyMgntReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the actionType value for this SCreditNotifyMgntReq.
     * 
     * @return actionType
     */
    public java.lang.Short getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this SCreditNotifyMgntReq.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.Short actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the notifyList value for this SCreditNotifyMgntReq.
     * 
     * @return notifyList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotify[] getNotifyList() {
        return notifyList;
    }


    /**
     * Sets the notifyList value for this SCreditNotifyMgntReq.
     * 
     * @param notifyList
     */
    public void setNotifyList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotify[] notifyList) {
        this.notifyList = notifyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCreditNotifyMgntReq)) return false;
        SCreditNotifyMgntReq other = (SCreditNotifyMgntReq) obj;
       
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
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.notifyList==null && other.getNotifyList()==null) || 
             (this.notifyList!=null &&
              java.util.Arrays.equals(this.notifyList, other.getNotifyList())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getNotifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyList(), i);
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
        new org.apache.axis.description.TypeDesc(SCreditNotifyMgntReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotifyMgntReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "notifyList_item"));
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
