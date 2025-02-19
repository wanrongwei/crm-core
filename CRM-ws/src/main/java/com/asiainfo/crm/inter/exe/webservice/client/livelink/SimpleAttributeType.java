/**
 * SimpleAttributeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class SimpleAttributeType  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.livelink.SimpleAttributeTypeType type;  // attribute

    private int variantNum;  // attribute

    private java.lang.String name;  // attribute

    private java.lang.String value;  // attribute

    public SimpleAttributeType() {
    }

    public SimpleAttributeType(
           com.asiainfo.crm.inter.exe.webservice.client.livelink.SimpleAttributeTypeType type,
           int variantNum,
           java.lang.String name,
           java.lang.String value) {
           this.type = type;
           this.variantNum = variantNum;
           this.name = name;
           this.value = value;
    }


    /**
     * Gets the type value for this SimpleAttributeType.
     * 
     * @return type
     */
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.SimpleAttributeTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this SimpleAttributeType.
     * 
     * @param type
     */
    public void setType(com.asiainfo.crm.inter.exe.webservice.client.livelink.SimpleAttributeTypeType type) {
        this.type = type;
    }


    /**
     * Gets the variantNum value for this SimpleAttributeType.
     * 
     * @return variantNum
     */
    public int getVariantNum() {
        return variantNum;
    }


    /**
     * Sets the variantNum value for this SimpleAttributeType.
     * 
     * @param variantNum
     */
    public void setVariantNum(int variantNum) {
        this.variantNum = variantNum;
    }


    /**
     * Gets the name value for this SimpleAttributeType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SimpleAttributeType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the value value for this SimpleAttributeType.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SimpleAttributeType.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleAttributeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SimpleAttributeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">SimpleAttributeType>Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("variantNum");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VariantNum"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
