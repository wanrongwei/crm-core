/**
 * DoQueryInvoiceBillResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryInvoiceBillResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceUrl invoiceUrl;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] billList;

    public DoQueryInvoiceBillResponse() {
    }

    public DoQueryInvoiceBillResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceUrl invoiceUrl,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] billList) {
        super(
            responseHead);
        this.invoiceUrl = invoiceUrl;
        this.billList = billList;
    }


    /**
     * Gets the invoiceUrl value for this DoQueryInvoiceBillResponse.
     * 
     * @return invoiceUrl
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceUrl getInvoiceUrl() {
        return invoiceUrl;
    }


    /**
     * Sets the invoiceUrl value for this DoQueryInvoiceBillResponse.
     * 
     * @param invoiceUrl
     */
    public void setInvoiceUrl(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceUrl invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }


    /**
     * Gets the billList value for this DoQueryInvoiceBillResponse.
     * 
     * @return billList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] getBillList() {
        return billList;
    }


    /**
     * Sets the billList value for this DoQueryInvoiceBillResponse.
     * 
     * @param billList
     */
    public void setBillList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] billList) {
        this.billList = billList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryInvoiceBillResponse)) return false;
        DoQueryInvoiceBillResponse other = (DoQueryInvoiceBillResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceUrl==null && other.getInvoiceUrl()==null) || 
             (this.invoiceUrl!=null &&
              this.invoiceUrl.equals(other.getInvoiceUrl()))) &&
            ((this.billList==null && other.getBillList()==null) || 
             (this.billList!=null &&
              java.util.Arrays.equals(this.billList, other.getBillList())));
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
        if (getInvoiceUrl() != null) {
            _hashCode += getInvoiceUrl().hashCode();
        }
        if (getBillList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryInvoiceBillResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInvoiceBillResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBill"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "billListItem"));
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
