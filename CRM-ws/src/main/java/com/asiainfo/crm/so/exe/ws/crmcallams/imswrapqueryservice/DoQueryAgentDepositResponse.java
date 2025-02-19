/**
 * DoQueryAgentDepositResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryAgentDepositResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ImsAgentDepositQueryResult[] agentDepositQueryResultList;

    public DoQueryAgentDepositResponse() {
    }

    public DoQueryAgentDepositResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ImsAgentDepositQueryResult[] agentDepositQueryResultList) {
        super(
            responseHead);
        this.agentDepositQueryResultList = agentDepositQueryResultList;
    }


    /**
     * Gets the agentDepositQueryResultList value for this DoQueryAgentDepositResponse.
     * 
     * @return agentDepositQueryResultList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ImsAgentDepositQueryResult[] getAgentDepositQueryResultList() {
        return agentDepositQueryResultList;
    }


    /**
     * Sets the agentDepositQueryResultList value for this DoQueryAgentDepositResponse.
     * 
     * @param agentDepositQueryResultList
     */
    public void setAgentDepositQueryResultList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ImsAgentDepositQueryResult[] agentDepositQueryResultList) {
        this.agentDepositQueryResultList = agentDepositQueryResultList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ImsAgentDepositQueryResult getAgentDepositQueryResultList(int i) {
        return this.agentDepositQueryResultList[i];
    }

    public void setAgentDepositQueryResultList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ImsAgentDepositQueryResult _value) {
        this.agentDepositQueryResultList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAgentDepositResponse)) return false;
        DoQueryAgentDepositResponse other = (DoQueryAgentDepositResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agentDepositQueryResultList==null && other.getAgentDepositQueryResultList()==null) || 
             (this.agentDepositQueryResultList!=null &&
              java.util.Arrays.equals(this.agentDepositQueryResultList, other.getAgentDepositQueryResultList())));
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
        if (getAgentDepositQueryResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgentDepositQueryResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgentDepositQueryResultList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryAgentDepositResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentDepositResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentDepositQueryResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentDepositQueryResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsAgentDepositQueryResult"));
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
