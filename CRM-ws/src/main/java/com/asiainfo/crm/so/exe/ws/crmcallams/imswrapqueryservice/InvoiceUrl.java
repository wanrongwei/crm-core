/**
 * InvoiceUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class InvoiceUrl  implements java.io.Serializable {
    private java.lang.String ip;

    private java.lang.String port;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String fullpath;

    private java.lang.String filename;

    public InvoiceUrl() {
    }

    public InvoiceUrl(
           java.lang.String ip,
           java.lang.String port,
           java.lang.String username,
           java.lang.String password,
           java.lang.String fullpath,
           java.lang.String filename) {
           this.ip = ip;
           this.port = port;
           this.username = username;
           this.password = password;
           this.fullpath = fullpath;
           this.filename = filename;
    }


    /**
     * Gets the ip value for this InvoiceUrl.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this InvoiceUrl.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the port value for this InvoiceUrl.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this InvoiceUrl.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the username value for this InvoiceUrl.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this InvoiceUrl.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this InvoiceUrl.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this InvoiceUrl.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the fullpath value for this InvoiceUrl.
     * 
     * @return fullpath
     */
    public java.lang.String getFullpath() {
        return fullpath;
    }


    /**
     * Sets the fullpath value for this InvoiceUrl.
     * 
     * @param fullpath
     */
    public void setFullpath(java.lang.String fullpath) {
        this.fullpath = fullpath;
    }


    /**
     * Gets the filename value for this InvoiceUrl.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this InvoiceUrl.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceUrl)) return false;
        InvoiceUrl other = (InvoiceUrl) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.fullpath==null && other.getFullpath()==null) || 
             (this.fullpath!=null &&
              this.fullpath.equals(other.getFullpath()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getFullpath() != null) {
            _hashCode += getFullpath().hashCode();
        }
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
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
