/**
 * DoQueryGroupMembersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryGroupMembersResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SMember[] member_list;

    public DoQueryGroupMembersResponse() {
    }

    public DoQueryGroupMembersResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SMember[] member_list) {
        super(
            responseHead);
        this.member_list = member_list;
    }


    /**
     * Gets the member_list value for this DoQueryGroupMembersResponse.
     * 
     * @return member_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SMember[] getMember_list() {
        return member_list;
    }


    /**
     * Sets the member_list value for this DoQueryGroupMembersResponse.
     * 
     * @param member_list
     */
    public void setMember_list(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SMember[] member_list) {
        this.member_list = member_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryGroupMembersResponse)) return false;
        DoQueryGroupMembersResponse other = (DoQueryGroupMembersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.member_list==null && other.getMember_list()==null) || 
             (this.member_list!=null &&
              java.util.Arrays.equals(this.member_list, other.getMember_list())));
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
        if (getMember_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMember_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMember_list(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryGroupMembersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupMembersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sMemberList_Item"));
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
