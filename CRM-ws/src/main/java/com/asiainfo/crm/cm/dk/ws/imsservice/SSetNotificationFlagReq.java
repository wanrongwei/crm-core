/**
 * SSetNotificationFlagReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SSetNotificationFlagReq  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.Short action_type;

    private com.asiainfo.crm.cm.dk.ws.imsservice.NotifyOper[][] notifyOperList;

    private java.lang.Long user_id;

    public SSetNotificationFlagReq() {
    }

    public SSetNotificationFlagReq(
           java.lang.String phone_id,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.Short action_type,
           com.asiainfo.crm.cm.dk.ws.imsservice.NotifyOper[][] notifyOperList,
           java.lang.Long user_id) {
           this.phone_id = phone_id;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.action_type = action_type;
           this.notifyOperList = notifyOperList;
           this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SSetNotificationFlagReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SSetNotificationFlagReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the outer_acct_id value for this SSetNotificationFlagReq.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SSetNotificationFlagReq.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SSetNotificationFlagReq.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SSetNotificationFlagReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the action_type value for this SSetNotificationFlagReq.
     * 
     * @return action_type
     */
    public java.lang.Short getAction_type() {
        return action_type;
    }


    /**
     * Sets the action_type value for this SSetNotificationFlagReq.
     * 
     * @param action_type
     */
    public void setAction_type(java.lang.Short action_type) {
        this.action_type = action_type;
    }


    /**
     * Gets the notifyOperList value for this SSetNotificationFlagReq.
     * 
     * @return notifyOperList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.NotifyOper[][] getNotifyOperList() {
        return notifyOperList;
    }


    /**
     * Sets the notifyOperList value for this SSetNotificationFlagReq.
     * 
     * @param notifyOperList
     */
    public void setNotifyOperList(com.asiainfo.crm.cm.dk.ws.imsservice.NotifyOper[][] notifyOperList) {
        this.notifyOperList = notifyOperList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.NotifyOper[] getNotifyOperList(int i) {
        return this.notifyOperList[i];
    }

    public void setNotifyOperList(int i, com.asiainfo.crm.cm.dk.ws.imsservice.NotifyOper[] _value) {
        this.notifyOperList[i] = _value;
    }


    /**
     * Gets the user_id value for this SSetNotificationFlagReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SSetNotificationFlagReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SSetNotificationFlagReq)) return false;
        SSetNotificationFlagReq other = (SSetNotificationFlagReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.action_type==null && other.getAction_type()==null) || 
             (this.action_type!=null &&
              this.action_type.equals(other.getAction_type()))) &&
            ((this.notifyOperList==null && other.getNotifyOperList()==null) || 
             (this.notifyOperList!=null &&
              java.util.Arrays.equals(this.notifyOperList, other.getNotifyOperList()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getAction_type() != null) {
            _hashCode += getAction_type().hashCode();
        }
        if (getNotifyOperList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyOperList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyOperList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SSetNotificationFlagReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetNotificationFlagReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyOperList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyOperList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyOperList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
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
