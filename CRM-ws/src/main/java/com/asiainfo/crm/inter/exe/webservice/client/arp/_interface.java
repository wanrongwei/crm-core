/**
 * _interface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;


/**
 * The name and provider for a specific interface.
 */
public class _interface  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.arp._if name;  // attribute

    private java.lang.String provider;  // attribute

    public _interface() {
    }

    public _interface(
           com.asiainfo.crm.inter.exe.webservice.client.arp._if name,
           java.lang.String provider) {
           this.name = name;
           this.provider = provider;
    }


    /**
     * Gets the name value for this _interface.
     * 
     * @return name
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp._if getName() {
        return name;
    }


    /**
     * Sets the name value for this _interface.
     * 
     * @param name
     */
    public void setName(com.asiainfo.crm.inter.exe.webservice.client.arp._if name) {
        this.name = name;
    }


    /**
     * Gets the provider value for this _interface.
     * 
     * @return provider
     */
    public java.lang.String getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this _interface.
     * 
     * @param provider
     */
    public void setProvider(java.lang.String provider) {
        this.provider = provider;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _interface)) return false;
        _interface other = (_interface) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_interface.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Interface"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "If"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("provider");
        attrField.setXmlName(new javax.xml.namespace.QName("", "provider"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Tadig"));
        typeDesc.addFieldDesc(attrField);
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
