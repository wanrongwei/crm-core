/**
 * SecurityInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SecurityInformation  implements java.io.Serializable {
    private java.lang.String customerIPCountry;

    private java.lang.Boolean IPCountryMatchesIssuingCountry;

    public SecurityInformation() {
    }

    public SecurityInformation(
           java.lang.String customerIPCountry,
           java.lang.Boolean IPCountryMatchesIssuingCountry) {
           this.customerIPCountry = customerIPCountry;
           this.IPCountryMatchesIssuingCountry = IPCountryMatchesIssuingCountry;
    }


    /**
     * Gets the customerIPCountry value for this SecurityInformation.
     * 
     * @return customerIPCountry
     */
    public java.lang.String getCustomerIPCountry() {
        return customerIPCountry;
    }


    /**
     * Sets the customerIPCountry value for this SecurityInformation.
     * 
     * @param customerIPCountry
     */
    public void setCustomerIPCountry(java.lang.String customerIPCountry) {
        this.customerIPCountry = customerIPCountry;
    }


    /**
     * Gets the IPCountryMatchesIssuingCountry value for this SecurityInformation.
     * 
     * @return IPCountryMatchesIssuingCountry
     */
    public java.lang.Boolean getIPCountryMatchesIssuingCountry() {
        return IPCountryMatchesIssuingCountry;
    }


    /**
     * Sets the IPCountryMatchesIssuingCountry value for this SecurityInformation.
     * 
     * @param IPCountryMatchesIssuingCountry
     */
    public void setIPCountryMatchesIssuingCountry(java.lang.Boolean IPCountryMatchesIssuingCountry) {
        this.IPCountryMatchesIssuingCountry = IPCountryMatchesIssuingCountry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityInformation)) return false;
        SecurityInformation other = (SecurityInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerIPCountry==null && other.getCustomerIPCountry()==null) || 
             (this.customerIPCountry!=null &&
              this.customerIPCountry.equals(other.getCustomerIPCountry()))) &&
            ((this.IPCountryMatchesIssuingCountry==null && other.getIPCountryMatchesIssuingCountry()==null) || 
             (this.IPCountryMatchesIssuingCountry!=null &&
              this.IPCountryMatchesIssuingCountry.equals(other.getIPCountryMatchesIssuingCountry())));
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
        if (getCustomerIPCountry() != null) {
            _hashCode += getCustomerIPCountry().hashCode();
        }
        if (getIPCountryMatchesIssuingCountry() != null) {
            _hashCode += getIPCountryMatchesIssuingCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "securityInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerIPCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerIPCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPCountryMatchesIssuingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPCountryMatchesIssuingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
