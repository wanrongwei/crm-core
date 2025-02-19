/**
 * GroupingCDRList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class GroupingCDRList  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupingCDR[] groupingCDRList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailHeader[] callDetailHeaderList;

    public GroupingCDRList() {
    }

    public GroupingCDRList(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupingCDR[] groupingCDRList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailHeader[] callDetailHeaderList) {
           this.groupingCDRList = groupingCDRList;
           this.callDetailHeaderList = callDetailHeaderList;
    }


    /**
     * Gets the groupingCDRList value for this GroupingCDRList.
     * 
     * @return groupingCDRList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupingCDR[] getGroupingCDRList() {
        return groupingCDRList;
    }


    /**
     * Sets the groupingCDRList value for this GroupingCDRList.
     * 
     * @param groupingCDRList
     */
    public void setGroupingCDRList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupingCDR[] groupingCDRList) {
        this.groupingCDRList = groupingCDRList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupingCDR getGroupingCDRList(int i) {
        return this.groupingCDRList[i];
    }

    public void setGroupingCDRList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupingCDR _value) {
        this.groupingCDRList[i] = _value;
    }


    /**
     * Gets the callDetailHeaderList value for this GroupingCDRList.
     * 
     * @return callDetailHeaderList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailHeader[] getCallDetailHeaderList() {
        return callDetailHeaderList;
    }


    /**
     * Sets the callDetailHeaderList value for this GroupingCDRList.
     * 
     * @param callDetailHeaderList
     */
    public void setCallDetailHeaderList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailHeader[] callDetailHeaderList) {
        this.callDetailHeaderList = callDetailHeaderList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailHeader getCallDetailHeaderList(int i) {
        return this.callDetailHeaderList[i];
    }

    public void setCallDetailHeaderList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailHeader _value) {
        this.callDetailHeaderList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupingCDRList)) return false;
        GroupingCDRList other = (GroupingCDRList) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupingCDRList==null && other.getGroupingCDRList()==null) || 
             (this.groupingCDRList!=null &&
              java.util.Arrays.equals(this.groupingCDRList, other.getGroupingCDRList()))) &&
            ((this.callDetailHeaderList==null && other.getCallDetailHeaderList()==null) || 
             (this.callDetailHeaderList!=null &&
              java.util.Arrays.equals(this.callDetailHeaderList, other.getCallDetailHeaderList())));
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
        if (getGroupingCDRList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupingCDRList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupingCDRList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCallDetailHeaderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetailHeaderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetailHeaderList(), i);
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
        new org.apache.axis.description.TypeDesc(GroupingCDRList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupingCDRList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupingCDRList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupingCDRList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupingCDR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailHeaderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDetailHeaderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
