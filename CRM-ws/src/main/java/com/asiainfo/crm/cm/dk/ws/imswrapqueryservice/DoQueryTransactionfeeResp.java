/**
 * DoQueryTransactionfeeResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryTransactionfeeResp  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes[] queryFreeTimesList;

    public DoQueryTransactionfeeResp() {
    }

    public DoQueryTransactionfeeResp(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes[] queryFreeTimesList) {
        super(
            responseHead);
        this.queryFreeTimesList = queryFreeTimesList;
    }


    /**
     * Gets the queryFreeTimesList value for this DoQueryTransactionfeeResp.
     * 
     * @return queryFreeTimesList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes[] getQueryFreeTimesList() {
        return queryFreeTimesList;
    }


    /**
     * Sets the queryFreeTimesList value for this DoQueryTransactionfeeResp.
     * 
     * @param queryFreeTimesList
     */
    public void setQueryFreeTimesList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes[] queryFreeTimesList) {
        this.queryFreeTimesList = queryFreeTimesList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes getQueryFreeTimesList(int i) {
        return this.queryFreeTimesList[i];
    }

    public void setQueryFreeTimesList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes _value) {
        this.queryFreeTimesList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryTransactionfeeResp)) return false;
        DoQueryTransactionfeeResp other = (DoQueryTransactionfeeResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.queryFreeTimesList==null && other.getQueryFreeTimesList()==null) || 
             (this.queryFreeTimesList!=null &&
              java.util.Arrays.equals(this.queryFreeTimesList, other.getQueryFreeTimesList())));
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
        if (getQueryFreeTimesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryFreeTimesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryFreeTimesList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryTransactionfeeResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTransactionfeeResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryFreeTimesList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryFreeTimesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryFreeTimes"));
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
