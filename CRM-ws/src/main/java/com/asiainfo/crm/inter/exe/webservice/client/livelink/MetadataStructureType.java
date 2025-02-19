/**
 * MetadataStructureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class MetadataStructureType  implements java.io.Serializable {
    private SimpleAttributeType[] simpleAttribute;

    private SimpleAttributeType[][] complexAttribute;

    public MetadataStructureType() {
    }

    public MetadataStructureType(
           SimpleAttributeType[] simpleAttribute,
           SimpleAttributeType[][] complexAttribute) {
           this.simpleAttribute = simpleAttribute;
           this.complexAttribute = complexAttribute;
    }


    /**
     * Gets the simpleAttribute value for this MetadataStructureType.
     * 
     * @return simpleAttribute
     */
    public SimpleAttributeType[] getSimpleAttribute() {
        return simpleAttribute;
    }


    /**
     * Sets the simpleAttribute value for this MetadataStructureType.
     * 
     * @param simpleAttribute
     */
    public void setSimpleAttribute(SimpleAttributeType[] simpleAttribute) {
        this.simpleAttribute = simpleAttribute;
    }

    public SimpleAttributeType getSimpleAttribute(int i) {
        return this.simpleAttribute[i];
    }

    public void setSimpleAttribute(int i, SimpleAttributeType _value) {
        this.simpleAttribute[i] = _value;
    }


    /**
     * Gets the complexAttribute value for this MetadataStructureType.
     * 
     * @return complexAttribute
     */
    public SimpleAttributeType[][] getComplexAttribute() {
        return complexAttribute;
    }


    /**
     * Sets the complexAttribute value for this MetadataStructureType.
     * 
     * @param complexAttribute
     */
    public void setComplexAttribute(SimpleAttributeType[][] complexAttribute) {
        this.complexAttribute = complexAttribute;
    }

    public SimpleAttributeType[] getComplexAttribute(int i) {
        return this.complexAttribute[i];
    }

    public void setComplexAttribute(int i, SimpleAttributeType[] _value) {
        this.complexAttribute[i] = _value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetadataStructureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "MetadataStructureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SimpleAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SimpleAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ComplexAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "ComplexAttributeType"));
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
