/**
 * DoQueryInvoiceInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryInvoiceInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInfoResult[] invoiceInfoList;

    public DoQueryInvoiceInfoResponse() {
    }

    public DoQueryInvoiceInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInfoResult[] invoiceInfoList) {
        super(
            responseHead);
        this.invoiceInfoList = invoiceInfoList;
    }


    /**
     * Gets the invoiceInfoList value for this DoQueryInvoiceInfoResponse.
     * 
     * @return invoiceInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInfoResult[] getInvoiceInfoList() {
        return invoiceInfoList;
    }


    /**
     * Sets the invoiceInfoList value for this DoQueryInvoiceInfoResponse.
     * 
     * @param invoiceInfoList
     */
    public void setInvoiceInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInfoResult[] invoiceInfoList) {
        this.invoiceInfoList = invoiceInfoList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInfoResult getInvoiceInfoList(int i) {
        return this.invoiceInfoList[i];
    }

    public void setInvoiceInfoList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInfoResult _value) {
        this.invoiceInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryInvoiceInfoResponse)) return false;
        DoQueryInvoiceInfoResponse other = (DoQueryInvoiceInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceInfoList==null && other.getInvoiceInfoList()==null) || 
             (this.invoiceInfoList!=null &&
              java.util.Arrays.equals(this.invoiceInfoList, other.getInvoiceInfoList())));
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
        if (getInvoiceInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryInvoiceInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInvoiceInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceInfoResult"));
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
