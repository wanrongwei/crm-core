/**
 * QueryBillDetailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryBillDetailResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean[] billFormList;

    public QueryBillDetailResponse() {
    }

    public QueryBillDetailResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean[] billFormList) {
        super(
            responseHead);
        this.billFormList = billFormList;
    }


    /**
     * Gets the billFormList value for this QueryBillDetailResponse.
     * 
     * @return billFormList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean[] getBillFormList() {
        return billFormList;
    }


    /**
     * Sets the billFormList value for this QueryBillDetailResponse.
     * 
     * @param billFormList
     */
    public void setBillFormList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean[] billFormList) {
        this.billFormList = billFormList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean getBillFormList(int i) {
        return this.billFormList[i];
    }

    public void setBillFormList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean _value) {
        this.billFormList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBillDetailResponse)) return false;
        QueryBillDetailResponse other = (QueryBillDetailResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billFormList==null && other.getBillFormList()==null) || 
             (this.billFormList!=null &&
              java.util.Arrays.equals(this.billFormList, other.getBillFormList())));
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
        if (getBillFormList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillFormList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillFormList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryBillDetailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillDetailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bsBillFormatBean"));
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
