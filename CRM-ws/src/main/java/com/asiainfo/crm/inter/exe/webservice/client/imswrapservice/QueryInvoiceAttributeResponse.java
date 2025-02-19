/**
 * QueryInvoiceAttributeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class QueryInvoiceAttributeResponse  extends com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CaFileStorage[] invoiceUrlList;

    public QueryInvoiceAttributeResponse() {
    }

    public QueryInvoiceAttributeResponse(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CaFileStorage[] invoiceUrlList) {
        super(
            responseHead);
        this.invoiceUrlList = invoiceUrlList;
    }


    /**
     * Gets the invoiceUrlList value for this QueryInvoiceAttributeResponse.
     * 
     * @return invoiceUrlList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CaFileStorage[] getInvoiceUrlList() {
        return invoiceUrlList;
    }


    /**
     * Sets the invoiceUrlList value for this QueryInvoiceAttributeResponse.
     * 
     * @param invoiceUrlList
     */
    public void setInvoiceUrlList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CaFileStorage[] invoiceUrlList) {
        this.invoiceUrlList = invoiceUrlList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CaFileStorage getInvoiceUrlList(int i) {
        return this.invoiceUrlList[i];
    }

    public void setInvoiceUrlList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CaFileStorage _value) {
        this.invoiceUrlList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceAttributeResponse)) return false;
        QueryInvoiceAttributeResponse other = (QueryInvoiceAttributeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceUrlList==null && other.getInvoiceUrlList()==null) || 
             (this.invoiceUrlList!=null &&
              java.util.Arrays.equals(this.invoiceUrlList, other.getInvoiceUrlList())));
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
        if (getInvoiceUrlList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceUrlList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceUrlList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryInvoiceAttributeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryInvoiceAttributeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceUrlList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceUrlList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caFileStorage"));
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
