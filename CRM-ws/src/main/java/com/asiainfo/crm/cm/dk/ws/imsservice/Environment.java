/**
 * Environment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class Environment  implements java.io.Serializable {
    private java.lang.String webServicePlatform;

    private java.lang.String OS;

    private java.lang.String language;

    public Environment() {
    }

    public Environment(
           java.lang.String webServicePlatform,
           java.lang.String OS,
           java.lang.String language) {
           this.webServicePlatform = webServicePlatform;
           this.OS = OS;
           this.language = language;
    }


    /**
     * Gets the webServicePlatform value for this Environment.
     * 
     * @return webServicePlatform
     */
    public java.lang.String getWebServicePlatform() {
        return webServicePlatform;
    }


    /**
     * Sets the webServicePlatform value for this Environment.
     * 
     * @param webServicePlatform
     */
    public void setWebServicePlatform(java.lang.String webServicePlatform) {
        this.webServicePlatform = webServicePlatform;
    }


    /**
     * Gets the OS value for this Environment.
     * 
     * @return OS
     */
    public java.lang.String getOS() {
        return OS;
    }


    /**
     * Sets the OS value for this Environment.
     * 
     * @param OS
     */
    public void setOS(java.lang.String OS) {
        this.OS = OS;
    }


    /**
     * Gets the language value for this Environment.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Environment.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Environment)) return false;
        Environment other = (Environment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webServicePlatform==null && other.getWebServicePlatform()==null) || 
             (this.webServicePlatform!=null &&
              this.webServicePlatform.equals(other.getWebServicePlatform()))) &&
            ((this.OS==null && other.getOS()==null) || 
             (this.OS!=null &&
              this.OS.equals(other.getOS()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getWebServicePlatform() != null) {
            _hashCode += getWebServicePlatform().hashCode();
        }
        if (getOS() != null) {
            _hashCode += getOS().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Environment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "environment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webServicePlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WebServicePlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
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
