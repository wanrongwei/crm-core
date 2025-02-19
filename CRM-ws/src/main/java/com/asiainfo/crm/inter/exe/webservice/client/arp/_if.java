/**
 * _if.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class _if implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected _if(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IF1 = "IF1";
    public static final java.lang.String _IF2 = "IF2";
    public static final java.lang.String _IF3 = "IF3";
    public static final java.lang.String _IF4 = "IF4";
    public static final java.lang.String _IF5 = "IF5";
    public static final java.lang.String _IF6 = "IF6";
    public static final java.lang.String _IF7 = "IF7";
    public static final java.lang.String _IF8 = "IF8";
    public static final java.lang.String _IF9 = "IF9";
    public static final _if IF1 = new _if(_IF1);
    public static final _if IF2 = new _if(_IF2);
    public static final _if IF3 = new _if(_IF3);
    public static final _if IF4 = new _if(_IF4);
    public static final _if IF5 = new _if(_IF5);
    public static final _if IF6 = new _if(_IF6);
    public static final _if IF7 = new _if(_IF7);
    public static final _if IF8 = new _if(_IF8);
    public static final _if IF9 = new _if(_IF9);
    public java.lang.String getValue() { return _value_;}
    public static _if fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        _if enumeration = (_if)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static _if fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(_if.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "If"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
