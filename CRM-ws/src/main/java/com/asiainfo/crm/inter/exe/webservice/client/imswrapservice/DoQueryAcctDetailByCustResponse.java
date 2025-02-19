/**
 * DoQueryAcctDetailByCustResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class DoQueryAcctDetailByCustResponse  extends com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SacctDetailByCustBean[] acctDetailList;

    public DoQueryAcctDetailByCustResponse() {
    }

    public DoQueryAcctDetailByCustResponse(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SacctDetailByCustBean[] acctDetailList) {
        super(
            responseHead);
        this.acctDetailList = acctDetailList;
    }


    /**
     * Gets the acctDetailList value for this DoQueryAcctDetailByCustResponse.
     * 
     * @return acctDetailList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SacctDetailByCustBean[] getAcctDetailList() {
        return acctDetailList;
    }


    /**
     * Sets the acctDetailList value for this DoQueryAcctDetailByCustResponse.
     * 
     * @param acctDetailList
     */
    public void setAcctDetailList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SacctDetailByCustBean[] acctDetailList) {
        this.acctDetailList = acctDetailList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SacctDetailByCustBean getAcctDetailList(int i) {
        return this.acctDetailList[i];
    }

    public void setAcctDetailList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SacctDetailByCustBean _value) {
        this.acctDetailList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAcctDetailByCustResponse)) return false;
        DoQueryAcctDetailByCustResponse other = (DoQueryAcctDetailByCustResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctDetailList==null && other.getAcctDetailList()==null) || 
             (this.acctDetailList!=null &&
              java.util.Arrays.equals(this.acctDetailList, other.getAcctDetailList())));
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
        if (getAcctDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctDetailList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryAcctDetailByCustResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctDetailByCustResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sacctDetailByCustBean"));
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
