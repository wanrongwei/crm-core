/**
 * SimpleAttributeTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class SimpleAttributeTypeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SimpleAttributeTypeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _String = "String";
    public static final java.lang.String _Date = "Date";
    public static final java.lang.String _Integer = "Integer";
    public static final java.lang.String _Real = "Real";
    public static final java.lang.String _Boolean = "Boolean";
    public static final SimpleAttributeTypeType String = new SimpleAttributeTypeType(_String);
    public static final SimpleAttributeTypeType Date = new SimpleAttributeTypeType(_Date);
    public static final SimpleAttributeTypeType Integer = new SimpleAttributeTypeType(_Integer);
    public static final SimpleAttributeTypeType Real = new SimpleAttributeTypeType(_Real);
    public static final SimpleAttributeTypeType Boolean = new SimpleAttributeTypeType(_Boolean);
    public java.lang.String getValue() { return _value_;}
    public static SimpleAttributeTypeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SimpleAttributeTypeType enumeration = (SimpleAttributeTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SimpleAttributeTypeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleAttributeTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">SimpleAttributeType>Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
