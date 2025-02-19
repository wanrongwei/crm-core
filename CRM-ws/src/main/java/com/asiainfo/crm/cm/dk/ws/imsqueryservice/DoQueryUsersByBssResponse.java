/**
 * DoQueryUsersByBssResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryUsersByBssResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUser[] userList;

    public DoQueryUsersByBssResponse() {
    }

    public DoQueryUsersByBssResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUser[] userList) {
        super(
            responseHead);
        this.userList = userList;
    }


    /**
     * Gets the userList value for this DoQueryUsersByBssResponse.
     * 
     * @return userList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUser[] getUserList() {
        return userList;
    }


    /**
     * Sets the userList value for this DoQueryUsersByBssResponse.
     * 
     * @param userList
     */
    public void setUserList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUser[] userList) {
        this.userList = userList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryUsersByBssResponse)) return false;
        DoQueryUsersByBssResponse other = (DoQueryUsersByBssResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userList==null && other.getUserList()==null) || 
             (this.userList!=null &&
              java.util.Arrays.equals(this.userList, other.getUserList())));
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
        if (getUserList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryUsersByBssResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUsersByBssResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "user"));
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
