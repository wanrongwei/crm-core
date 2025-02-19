/**
 * StandardActivationNotificationCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class StandardActivationNotificationCode implements java.io.Serializable {
    private java.math.BigInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StandardActivationNotificationCode(java.math.BigInteger value) {
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
    public static final java.math.BigInteger _value14 = new java.math.BigInteger("13");
    public static final java.math.BigInteger _value15 = new java.math.BigInteger("14");
    public static final java.math.BigInteger _value16 = new java.math.BigInteger("15");
    public static final java.math.BigInteger _value17 = new java.math.BigInteger("16");
    public static final java.math.BigInteger _value18 = new java.math.BigInteger("17");
    public static final java.math.BigInteger _value19 = new java.math.BigInteger("18");
    public static final java.math.BigInteger _value20 = new java.math.BigInteger("19");
    public static final java.math.BigInteger _value21 = new java.math.BigInteger("20");
    public static final java.math.BigInteger _value22 = new java.math.BigInteger("21");
    public static final java.math.BigInteger _value23 = new java.math.BigInteger("22");
    public static final StandardActivationNotificationCode value1 = new StandardActivationNotificationCode(_value1);
    public static final StandardActivationNotificationCode value2 = new StandardActivationNotificationCode(_value2);
    public static final StandardActivationNotificationCode value3 = new StandardActivationNotificationCode(_value3);
    public static final StandardActivationNotificationCode value4 = new StandardActivationNotificationCode(_value4);
    public static final StandardActivationNotificationCode value5 = new StandardActivationNotificationCode(_value5);
    public static final StandardActivationNotificationCode value6 = new StandardActivationNotificationCode(_value6);
    public static final StandardActivationNotificationCode value7 = new StandardActivationNotificationCode(_value7);
    public static final StandardActivationNotificationCode value8 = new StandardActivationNotificationCode(_value8);
    public static final StandardActivationNotificationCode value9 = new StandardActivationNotificationCode(_value9);
    public static final StandardActivationNotificationCode value10 = new StandardActivationNotificationCode(_value10);
    public static final StandardActivationNotificationCode value11 = new StandardActivationNotificationCode(_value11);
    public static final StandardActivationNotificationCode value12 = new StandardActivationNotificationCode(_value12);
    public static final StandardActivationNotificationCode value13 = new StandardActivationNotificationCode(_value13);
    public static final StandardActivationNotificationCode value14 = new StandardActivationNotificationCode(_value14);
    public static final StandardActivationNotificationCode value15 = new StandardActivationNotificationCode(_value15);
    public static final StandardActivationNotificationCode value16 = new StandardActivationNotificationCode(_value16);
    public static final StandardActivationNotificationCode value17 = new StandardActivationNotificationCode(_value17);
    public static final StandardActivationNotificationCode value18 = new StandardActivationNotificationCode(_value18);
    public static final StandardActivationNotificationCode value19 = new StandardActivationNotificationCode(_value19);
    public static final StandardActivationNotificationCode value20 = new StandardActivationNotificationCode(_value20);
    public static final StandardActivationNotificationCode value21 = new StandardActivationNotificationCode(_value21);
    public static final StandardActivationNotificationCode value22 = new StandardActivationNotificationCode(_value22);
    public static final StandardActivationNotificationCode value23 = new StandardActivationNotificationCode(_value23);
    public java.math.BigInteger getValue() { return _value_;}
    public static StandardActivationNotificationCode fromValue(java.math.BigInteger value)
          throws java.lang.IllegalArgumentException {
        StandardActivationNotificationCode enumeration = (StandardActivationNotificationCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StandardActivationNotificationCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StandardActivationNotificationCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardActivationNotificationCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
