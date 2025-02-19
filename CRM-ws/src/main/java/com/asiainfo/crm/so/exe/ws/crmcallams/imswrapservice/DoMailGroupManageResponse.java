/**
 * DoMailGroupManageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoMailGroupManageResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail[] accountMail;

    public DoMailGroupManageResponse() {
    }

    public DoMailGroupManageResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail[] accountMail) {
        super(
            responseHead);
        this.accountMail = accountMail;
    }


    /**
     * Gets the accountMail value for this DoMailGroupManageResponse.
     * 
     * @return accountMail
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail[] getAccountMail() {
        return accountMail;
    }


    /**
     * Sets the accountMail value for this DoMailGroupManageResponse.
     * 
     * @param accountMail
     */
    public void setAccountMail(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail[] accountMail) {
        this.accountMail = accountMail;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail getAccountMail(int i) {
        return this.accountMail[i];
    }

    public void setAccountMail(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail _value) {
        this.accountMail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMailGroupManageResponse)) return false;
        DoMailGroupManageResponse other = (DoMailGroupManageResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountMail==null && other.getAccountMail()==null) || 
             (this.accountMail!=null &&
              java.util.Arrays.equals(this.accountMail, other.getAccountMail())));
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
        if (getAccountMail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountMail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountMail(), i);
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
        new org.apache.axis.description.TypeDesc(DoMailGroupManageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMailGroupManageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accountMail"));
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
