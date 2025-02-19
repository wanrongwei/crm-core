/**
 * ManageUserFriendsNum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class ManageUserFriendsNum  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private com.asiainfo.crm.cm.dk.ws.imsservice.FnOper[] sFNOperList;

    public ManageUserFriendsNum() {
    }

    public ManageUserFriendsNum(
           java.lang.Long user_id,
           java.lang.String phone_id,
           com.asiainfo.crm.cm.dk.ws.imsservice.FnOper[] sFNOperList) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.sFNOperList = sFNOperList;
    }


    /**
     * Gets the user_id value for this ManageUserFriendsNum.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this ManageUserFriendsNum.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this ManageUserFriendsNum.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ManageUserFriendsNum.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the sFNOperList value for this ManageUserFriendsNum.
     * 
     * @return sFNOperList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.FnOper[] getSFNOperList() {
        return sFNOperList;
    }


    /**
     * Sets the sFNOperList value for this ManageUserFriendsNum.
     * 
     * @param sFNOperList
     */
    public void setSFNOperList(com.asiainfo.crm.cm.dk.ws.imsservice.FnOper[] sFNOperList) {
        this.sFNOperList = sFNOperList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageUserFriendsNum)) return false;
        ManageUserFriendsNum other = (ManageUserFriendsNum) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.sFNOperList==null && other.getSFNOperList()==null) || 
             (this.sFNOperList!=null &&
              java.util.Arrays.equals(this.sFNOperList, other.getSFNOperList())));
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getSFNOperList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSFNOperList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSFNOperList(), i);
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
        new org.apache.axis.description.TypeDesc(ManageUserFriendsNum.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "manageUserFriendsNum"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFNOperList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFNOperList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnOper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fNOperList_Item"));
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
