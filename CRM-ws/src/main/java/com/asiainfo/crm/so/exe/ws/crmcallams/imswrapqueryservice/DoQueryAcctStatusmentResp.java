/**
 * DoQueryAcctStatusmentResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryAcctStatusmentResp  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AccountStatusmentBo[] acctStatusmentList;

    public DoQueryAcctStatusmentResp() {
    }

    public DoQueryAcctStatusmentResp(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AccountStatusmentBo[] acctStatusmentList) {
        super(
            responseHead);
        this.acctStatusmentList = acctStatusmentList;
    }


    /**
     * Gets the acctStatusmentList value for this DoQueryAcctStatusmentResp.
     * 
     * @return acctStatusmentList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AccountStatusmentBo[] getAcctStatusmentList() {
        return acctStatusmentList;
    }


    /**
     * Sets the acctStatusmentList value for this DoQueryAcctStatusmentResp.
     * 
     * @param acctStatusmentList
     */
    public void setAcctStatusmentList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AccountStatusmentBo[] acctStatusmentList) {
        this.acctStatusmentList = acctStatusmentList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AccountStatusmentBo getAcctStatusmentList(int i) {
        return this.acctStatusmentList[i];
    }

    public void setAcctStatusmentList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AccountStatusmentBo _value) {
        this.acctStatusmentList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAcctStatusmentResp)) return false;
        DoQueryAcctStatusmentResp other = (DoQueryAcctStatusmentResp) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctStatusmentList==null && other.getAcctStatusmentList()==null) || 
             (this.acctStatusmentList!=null &&
              java.util.Arrays.equals(this.acctStatusmentList, other.getAcctStatusmentList())));
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
        if (getAcctStatusmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctStatusmentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctStatusmentList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryAcctStatusmentResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctStatusmentResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctStatusmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctStatusmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accountStatusmentBo"));
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
