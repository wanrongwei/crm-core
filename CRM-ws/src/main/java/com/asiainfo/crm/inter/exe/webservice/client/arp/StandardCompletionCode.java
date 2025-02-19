/**
 * StandardCompletionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class StandardCompletionCode implements java.io.Serializable {
    private java.math.BigInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StandardCompletionCode(java.math.BigInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.math.BigInteger _value1 = new java.math.BigInteger("0");
    public static final java.math.BigInteger _value2 = new java.math.BigInteger("1");
    public static final java.math.BigInteger _value3 = new java.math.BigInteger("2");
    public static final java.math.BigInteger _value4 = new java.math.BigInteger("3");
    public static final java.math.BigInteger _value5 = new java.math.BigInteger("4");
    public static final java.math.BigInteger _value6 = new java.math.BigInteger("5");
    public static final java.math.BigInteger _value7 = new java.math.BigInteger("6");
    public static final java.math.BigInteger _value8 = new java.math.BigInteger("7");
    public static final java.math.BigInteger _value9 = new java.math.BigInteger("8");
    public static final java.math.BigInteger _value10 = new java.math.BigInteger("9");
    public static final java.math.BigInteger _value11 = new java.math.BigInteger("10");
    public static final java.math.BigInteger _value12 = new java.math.BigInteger("11");
    public static final java.math.BigInteger _value13 = new java.math.BigInteger("12");
    public static final StandardCompletionCode value1 = new StandardCompletionCode(_value1);
    public static final StandardCompletionCode value2 = new StandardCompletionCode(_value2);
    public static final StandardCompletionCode value3 = new StandardCompletionCode(_value3);
    public static final StandardCompletionCode value4 = new StandardCompletionCode(_value4);
    public static final StandardCompletionCode value5 = new StandardCompletionCode(_value5);
    public static final StandardCompletionCode value6 = new StandardCompletionCode(_value6);
    public static final StandardCompletionCode value7 = new StandardCompletionCode(_value7);
    public static final StandardCompletionCode value8 = new StandardCompletionCode(_value8);
    public static final StandardCompletionCode value9 = new StandardCompletionCode(_value9);
    public static final StandardCompletionCode value10 = new StandardCompletionCode(_value10);
    public static final StandardCompletionCode value11 = new StandardCompletionCode(_value11);
    public static final StandardCompletionCode value12 = new StandardCompletionCode(_value12);
    public static final StandardCompletionCode value13 = new StandardCompletionCode(_value13);
    public java.math.BigInteger getValue() { return _value_;}
    public static StandardCompletionCode fromValue(java.math.BigInteger value)
          throws java.lang.IllegalArgumentException {
        StandardCompletionCode enumeration = (StandardCompletionCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StandardCompletionCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new java.math.BigInteger(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(StandardCompletionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardCompletionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
