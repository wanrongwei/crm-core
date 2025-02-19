/**
 * AuthenticationInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class AuthenticationInformation  implements java.io.Serializable {
    private java.lang.String authenticatedWith;

    private java.lang.String authenticatedStatus;

    private java.lang.String ECI;

    public AuthenticationInformation() {
    }

    public AuthenticationInformation(
           java.lang.String authenticatedWith,
           java.lang.String authenticatedStatus,
           java.lang.String ECI) {
           this.authenticatedWith = authenticatedWith;
           this.authenticatedStatus = authenticatedStatus;
           this.ECI = ECI;
    }


    /**
     * Gets the authenticatedWith value for this AuthenticationInformation.
     * 
     * @return authenticatedWith
     */
    public java.lang.String getAuthenticatedWith() {
        return authenticatedWith;
    }


    /**
     * Sets the authenticatedWith value for this AuthenticationInformation.
     * 
     * @param authenticatedWith
     */
    public void setAuthenticatedWith(java.lang.String authenticatedWith) {
        this.authenticatedWith = authenticatedWith;
    }


    /**
     * Gets the authenticatedStatus value for this AuthenticationInformation.
     * 
     * @return authenticatedStatus
     */
    public java.lang.String getAuthenticatedStatus() {
        return authenticatedStatus;
    }


    /**
     * Sets the authenticatedStatus value for this AuthenticationInformation.
     * 
     * @param authenticatedStatus
     */
    public void setAuthenticatedStatus(java.lang.String authenticatedStatus) {
        this.authenticatedStatus = authenticatedStatus;
    }


    /**
     * Gets the ECI value for this AuthenticationInformation.
     * 
     * @return ECI
     */
    public java.lang.String getECI() {
        return ECI;
    }


    /**
     * Sets the ECI value for this AuthenticationInformation.
     * 
     * @param ECI
     */
    public void setECI(java.lang.String ECI) {
        this.ECI = ECI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationInformation)) return false;
        AuthenticationInformation other = (AuthenticationInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authenticatedWith==null && other.getAuthenticatedWith()==null) || 
             (this.authenticatedWith!=null &&
              this.authenticatedWith.equals(other.getAuthenticatedWith()))) &&
            ((this.authenticatedStatus==null && other.getAuthenticatedStatus()==null) || 
             (this.authenticatedStatus!=null &&
              this.authenticatedStatus.equals(other.getAuthenticatedStatus()))) &&
            ((this.ECI==null && other.getECI()==null) || 
             (this.ECI!=null &&
              this.ECI.equals(other.getECI())));
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
        if (getAuthenticatedWith() != null) {
            _hashCode += getAuthenticatedWith().hashCode();
        }
        if (getAuthenticatedStatus() != null) {
            _hashCode += getAuthenticatedStatus().hashCode();
        }
        if (getECI() != null) {
            _hashCode += getECI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "authenticationInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticatedWith");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticatedWith"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticatedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticatedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ECI"));
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
