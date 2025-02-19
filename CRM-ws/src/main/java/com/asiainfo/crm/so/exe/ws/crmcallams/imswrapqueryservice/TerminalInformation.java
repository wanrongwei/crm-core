/**
 * TerminalInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class TerminalInformation  implements java.io.Serializable {
    private java.lang.String browser;

    private java.lang.String customerEntered;

    private java.lang.String customerRedirected;

    public TerminalInformation() {
    }

    public TerminalInformation(
           java.lang.String browser,
           java.lang.String customerEntered,
           java.lang.String customerRedirected) {
           this.browser = browser;
           this.customerEntered = customerEntered;
           this.customerRedirected = customerRedirected;
    }


    /**
     * Gets the browser value for this TerminalInformation.
     * 
     * @return browser
     */
    public java.lang.String getBrowser() {
        return browser;
    }


    /**
     * Sets the browser value for this TerminalInformation.
     * 
     * @param browser
     */
    public void setBrowser(java.lang.String browser) {
        this.browser = browser;
    }


    /**
     * Gets the customerEntered value for this TerminalInformation.
     * 
     * @return customerEntered
     */
    public java.lang.String getCustomerEntered() {
        return customerEntered;
    }


    /**
     * Sets the customerEntered value for this TerminalInformation.
     * 
     * @param customerEntered
     */
    public void setCustomerEntered(java.lang.String customerEntered) {
        this.customerEntered = customerEntered;
    }


    /**
     * Gets the customerRedirected value for this TerminalInformation.
     * 
     * @return customerRedirected
     */
    public java.lang.String getCustomerRedirected() {
        return customerRedirected;
    }


    /**
     * Sets the customerRedirected value for this TerminalInformation.
     * 
     * @param customerRedirected
     */
    public void setCustomerRedirected(java.lang.String customerRedirected) {
        this.customerRedirected = customerRedirected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TerminalInformation)) return false;
        TerminalInformation other = (TerminalInformation) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.browser==null && other.getBrowser()==null) || 
             (this.browser!=null &&
              this.browser.equals(other.getBrowser()))) &&
            ((this.customerEntered==null && other.getCustomerEntered()==null) || 
             (this.customerEntered!=null &&
              this.customerEntered.equals(other.getCustomerEntered()))) &&
            ((this.customerRedirected==null && other.getCustomerRedirected()==null) || 
             (this.customerRedirected!=null &&
              this.customerRedirected.equals(other.getCustomerRedirected())));
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
        if (getBrowser() != null) {
            _hashCode += getBrowser().hashCode();
        }
        if (getCustomerEntered() != null) {
            _hashCode += getCustomerEntered().hashCode();
        }
        if (getCustomerRedirected() != null) {
            _hashCode += getCustomerRedirected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TerminalInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminalInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Browser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEntered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerEntered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRedirected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerRedirected"));
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
