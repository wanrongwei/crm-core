/**
 * GroupandMemberList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class GroupandMemberList  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SMember[] sMemberList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SGroup sGroup;

    public GroupandMemberList() {
    }

    public GroupandMemberList(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SMember[] sMemberList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SGroup sGroup) {
           this.sMemberList = sMemberList;
           this.sGroup = sGroup;
    }


    /**
     * Gets the sMemberList value for this GroupandMemberList.
     * 
     * @return sMemberList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SMember[] getSMemberList() {
        return sMemberList;
    }


    /**
     * Sets the sMemberList value for this GroupandMemberList.
     * 
     * @param sMemberList
     */
    public void setSMemberList(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SMember[] sMemberList) {
        this.sMemberList = sMemberList;
    }


    /**
     * Gets the sGroup value for this GroupandMemberList.
     * 
     * @return sGroup
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SGroup getSGroup() {
        return sGroup;
    }


    /**
     * Sets the sGroup value for this GroupandMemberList.
     * 
     * @param sGroup
     */
    public void setSGroup(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SGroup sGroup) {
        this.sGroup = sGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof GroupandMemberList)) return false;
        GroupandMemberList other = (GroupandMemberList) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sMemberList==null && other.getSMemberList()==null) || 
             (this.sMemberList!=null &&
              java.util.Arrays.equals(this.sMemberList, other.getSMemberList()))) &&
            ((this.sGroup==null && other.getSGroup()==null) || 
             (this.sGroup!=null &&
              this.sGroup.equals(other.getSGroup())));
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
        if (getSMemberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMemberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMemberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSGroup() != null) {
            _hashCode += getSGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupandMemberList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupandMemberList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMemberList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sMemberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sMemberList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup"));
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
