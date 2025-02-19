/**
 * SacctDetailByCustBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SacctDetailByCustBean  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SContact[] sContactList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount account;

    public SacctDetailByCustBean() {
    }

    public SacctDetailByCustBean(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SContact[] sContactList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount account) {
           this.sContactList = sContactList;
           this.account = account;
    }


    /**
     * Gets the sContactList value for this SacctDetailByCustBean.
     * 
     * @return sContactList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SContact[] getSContactList() {
        return sContactList;
    }


    /**
     * Sets the sContactList value for this SacctDetailByCustBean.
     * 
     * @param sContactList
     */
    public void setSContactList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SContact[] sContactList) {
        this.sContactList = sContactList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SContact getSContactList(int i) {
        return this.sContactList[i];
    }

    public void setSContactList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SContact _value) {
        this.sContactList[i] = _value;
    }


    /**
     * Gets the account value for this SacctDetailByCustBean.
     * 
     * @return account
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SacctDetailByCustBean.
     * 
     * @param account
     */
    public void setAccount(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount account) {
        this.account = account;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SacctDetailByCustBean)) return false;
        SacctDetailByCustBean other = (SacctDetailByCustBean) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sContactList==null && other.getSContactList()==null) || 
             (this.sContactList!=null &&
              java.util.Arrays.equals(this.sContactList, other.getSContactList()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSContactList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSContactList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SacctDetailByCustBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sacctDetailByCustBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sContactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
