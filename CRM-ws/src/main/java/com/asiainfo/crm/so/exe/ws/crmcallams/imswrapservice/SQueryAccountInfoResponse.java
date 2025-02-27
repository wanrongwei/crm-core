/**
 * SQueryAccountInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SQueryAccountInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCustomer customer;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAccount account;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillingAddressInfo billingAddressInfo;

    public SQueryAccountInfoResponse() {
    }

    public SQueryAccountInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCustomer customer,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAccount account,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillingAddressInfo billingAddressInfo) {
        super(
            responseHead);
        this.customer = customer;
        this.account = account;
        this.billingAddressInfo = billingAddressInfo;
    }


    /**
     * Gets the customer value for this SQueryAccountInfoResponse.
     * 
     * @return customer
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this SQueryAccountInfoResponse.
     * 
     * @param customer
     */
    public void setCustomer(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the account value for this SQueryAccountInfoResponse.
     * 
     * @return account
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SQueryAccountInfoResponse.
     * 
     * @param account
     */
    public void setAccount(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAccount account) {
        this.account = account;
    }


    /**
     * Gets the billingAddressInfo value for this SQueryAccountInfoResponse.
     * 
     * @return billingAddressInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillingAddressInfo getBillingAddressInfo() {
        return billingAddressInfo;
    }


    /**
     * Sets the billingAddressInfo value for this SQueryAccountInfoResponse.
     * 
     * @param billingAddressInfo
     */
    public void setBillingAddressInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBillingAddressInfo billingAddressInfo) {
        this.billingAddressInfo = billingAddressInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryAccountInfoResponse)) return false;
        SQueryAccountInfoResponse other = (SQueryAccountInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.billingAddressInfo==null && other.getBillingAddressInfo()==null) || 
             (this.billingAddressInfo!=null &&
              this.billingAddressInfo.equals(other.getBillingAddressInfo())));
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getBillingAddressInfo() != null) {
            _hashCode += getBillingAddressInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryAccountInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAccountInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAddressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillingAddressInfo"));
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
