/**
 * RetractCprPermissionUsingPUTRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rcp;

public class RetractCprPermissionUsingPUTRequestBody  implements java.io.Serializable {
    private java.lang.String customerId;

    private java.lang.String customerIdType;

    private java.lang.String userConsentSource;

    private java.lang.String userConsentSourceType;

    public RetractCprPermissionUsingPUTRequestBody() {
    }

    public RetractCprPermissionUsingPUTRequestBody(
           java.lang.String customerId,
           java.lang.String customerIdType,
           java.lang.String userConsentSource,
           java.lang.String userConsentSourceType) {
           this.customerId = customerId;
           this.customerIdType = customerIdType;
           this.userConsentSource = userConsentSource;
           this.userConsentSourceType = userConsentSourceType;
    }


    /**
     * Gets the customerId value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerIdType value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @return customerIdType
     */
    public java.lang.String getCustomerIdType() {
        return customerIdType;
    }


    /**
     * Sets the customerIdType value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @param customerIdType
     */
    public void setCustomerIdType(java.lang.String customerIdType) {
        this.customerIdType = customerIdType;
    }


    /**
     * Gets the userConsentSource value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @return userConsentSource
     */
    public java.lang.String getUserConsentSource() {
        return userConsentSource;
    }


    /**
     * Sets the userConsentSource value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @param userConsentSource
     */
    public void setUserConsentSource(java.lang.String userConsentSource) {
        this.userConsentSource = userConsentSource;
    }


    /**
     * Gets the userConsentSourceType value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @return userConsentSourceType
     */
    public java.lang.String getUserConsentSourceType() {
        return userConsentSourceType;
    }


    /**
     * Sets the userConsentSourceType value for this RetractCprPermissionUsingPUTRequestBody.
     * 
     * @param userConsentSourceType
     */
    public void setUserConsentSourceType(java.lang.String userConsentSourceType) {
        this.userConsentSourceType = userConsentSourceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetractCprPermissionUsingPUTRequestBody)) return false;
        RetractCprPermissionUsingPUTRequestBody other = (RetractCprPermissionUsingPUTRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.customerIdType==null && other.getCustomerIdType()==null) || 
             (this.customerIdType!=null &&
              this.customerIdType.equals(other.getCustomerIdType()))) &&
            ((this.userConsentSource==null && other.getUserConsentSource()==null) || 
             (this.userConsentSource!=null &&
              this.userConsentSource.equals(other.getUserConsentSource()))) &&
            ((this.userConsentSourceType==null && other.getUserConsentSourceType()==null) || 
             (this.userConsentSourceType!=null &&
              this.userConsentSourceType.equals(other.getUserConsentSourceType())));
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
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getCustomerIdType() != null) {
            _hashCode += getCustomerIdType().hashCode();
        }
        if (getUserConsentSource() != null) {
            _hashCode += getUserConsentSource().hashCode();
        }
        if (getUserConsentSourceType() != null) {
            _hashCode += getUserConsentSourceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetractCprPermissionUsingPUTRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "retractCprPermissionUsingPUTRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userConsentSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userConsentSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userConsentSourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userConsentSourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
