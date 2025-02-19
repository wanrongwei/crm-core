/**
 * StandardDeactivationNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public class StandardDeactivationNotification implements java.io.Serializable {
    private java.math.BigInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StandardDeactivationNotification(java.math.BigInteger value) {
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
    public static final StandardDeactivationNotification value1 = new StandardDeactivationNotification(_value1);
    public static final StandardDeactivationNotification value2 = new StandardDeactivationNotification(_value2);
    public static final StandardDeactivationNotification value3 = new StandardDeactivationNotification(_value3);
    public static final StandardDeactivationNotification value4 = new StandardDeactivationNotification(_value4);
    public static final StandardDeactivationNotification value5 = new StandardDeactivationNotification(_value5);
    public static final StandardDeactivationNotification value6 = new StandardDeactivationNotification(_value6);
    public static final StandardDeactivationNotification value7 = new StandardDeactivationNotification(_value7);
    public java.math.BigInteger getValue() { return _value_;}
    public static StandardDeactivationNotification fromValue(java.math.BigInteger value)
          throws java.lang.IllegalArgumentException {
        StandardDeactivationNotification enumeration = (StandardDeactivationNotification)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StandardDeactivationNotification fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StandardDeactivationNotification.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "StandardDeactivationNotification"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
