/**
 * OttOrderEventEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.ott;

public class OttOrderEventEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OttOrderEventEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Create = "Create";
    public static final java.lang.String _Change = "Change";
    public static final java.lang.String _Update = "Update";
    public static final java.lang.String _Suspend = "Suspend";
    public static final java.lang.String _Resume = "Resume";
    public static final java.lang.String _Terminate = "Terminate";
    public static final java.lang.String _ChangeOwner = "ChangeOwner";
    public static final OttOrderEventEventType Create = new OttOrderEventEventType(_Create);
    public static final OttOrderEventEventType Change = new OttOrderEventEventType(_Change);
    public static final OttOrderEventEventType Update = new OttOrderEventEventType(_Update);
    public static final OttOrderEventEventType Suspend = new OttOrderEventEventType(_Suspend);
    public static final OttOrderEventEventType Resume = new OttOrderEventEventType(_Resume);
    public static final OttOrderEventEventType Terminate = new OttOrderEventEventType(_Terminate);
    public static final OttOrderEventEventType ChangeOwner = new OttOrderEventEventType(_ChangeOwner);
    public java.lang.String getValue() { return _value_;}
    public static OttOrderEventEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OttOrderEventEventType enumeration = (OttOrderEventEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OttOrderEventEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OttOrderEventEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", ">OttOrderEvent>eventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
