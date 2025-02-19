/**
 * DoQueryLedgerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryLedgerResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryLedgerOut[] ledgerOutList;

    public DoQueryLedgerResponse() {
    }

    public DoQueryLedgerResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryLedgerOut[] ledgerOutList) {
        super(
            responseHead);
        this.ledgerOutList = ledgerOutList;
    }


    /**
     * Gets the ledgerOutList value for this DoQueryLedgerResponse.
     * 
     * @return ledgerOutList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryLedgerOut[] getLedgerOutList() {
        return ledgerOutList;
    }


    /**
     * Sets the ledgerOutList value for this DoQueryLedgerResponse.
     * 
     * @param ledgerOutList
     */
    public void setLedgerOutList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryLedgerOut[] ledgerOutList) {
        this.ledgerOutList = ledgerOutList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryLedgerOut getLedgerOutList(int i) {
        return this.ledgerOutList[i];
    }

    public void setLedgerOutList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryLedgerOut _value) {
        this.ledgerOutList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryLedgerResponse)) return false;
        DoQueryLedgerResponse other = (DoQueryLedgerResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ledgerOutList==null && other.getLedgerOutList()==null) || 
             (this.ledgerOutList!=null &&
              java.util.Arrays.equals(this.ledgerOutList, other.getLedgerOutList())));
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
        if (getLedgerOutList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLedgerOutList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLedgerOutList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryLedgerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLedgerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ledgerOutList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ledgerOutList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryLedgerOut"));
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
