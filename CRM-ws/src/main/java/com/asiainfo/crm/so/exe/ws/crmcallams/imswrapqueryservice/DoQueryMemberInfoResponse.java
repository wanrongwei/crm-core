/**
 * DoQueryMemberInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryMemberInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList[] groupandMemberList;

    public DoQueryMemberInfoResponse() {
    }

    public DoQueryMemberInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList[] groupandMemberList) {
        super(
            responseHead);
        this.groupandMemberList = groupandMemberList;
    }


    /**
     * Gets the groupandMemberList value for this DoQueryMemberInfoResponse.
     * 
     * @return groupandMemberList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList[] getGroupandMemberList() {
        return groupandMemberList;
    }


    /**
     * Sets the groupandMemberList value for this DoQueryMemberInfoResponse.
     * 
     * @param groupandMemberList
     */
    public void setGroupandMemberList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList[] groupandMemberList) {
        this.groupandMemberList = groupandMemberList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList getGroupandMemberList(int i) {
        return this.groupandMemberList[i];
    }

    public void setGroupandMemberList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList _value) {
        this.groupandMemberList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryMemberInfoResponse)) return false;
        DoQueryMemberInfoResponse other = (DoQueryMemberInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.groupandMemberList==null && other.getGroupandMemberList()==null) || 
             (this.groupandMemberList!=null &&
              java.util.Arrays.equals(this.groupandMemberList, other.getGroupandMemberList())));
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
        if (getGroupandMemberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupandMemberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupandMemberList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryMemberInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMemberInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupandMemberList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupandMemberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupandMemberList"));
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
