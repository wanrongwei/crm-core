/**
 * NavnData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class NavnData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String navn;

    private java.lang.String beskyttetFra;  // attribute

    private java.lang.String beskyttet;  // attribute

    public NavnData() {
    }

    public NavnData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String beskyttetFra,
           java.lang.String beskyttet,
           java.lang.String navn) {
        super(
            error);
        this.beskyttetFra = beskyttetFra;
        this.beskyttet = beskyttet;
        this.navn = navn;
    }


    /**
     * Gets the navn value for this NavnData.
     * 
     * @return navn
     */
    public java.lang.String getNavn() {
        return navn;
    }


    /**
     * Sets the navn value for this NavnData.
     * 
     * @param navn
     */
    public void setNavn(java.lang.String navn) {
        this.navn = navn;
    }


    /**
     * Gets the beskyttetFra value for this NavnData.
     * 
     * @return beskyttetFra
     */
    public java.lang.String getBeskyttetFra() {
        return beskyttetFra;
    }


    /**
     * Sets the beskyttetFra value for this NavnData.
     * 
     * @param beskyttetFra
     */
    public void setBeskyttetFra(java.lang.String beskyttetFra) {
        this.beskyttetFra = beskyttetFra;
    }


    /**
     * Gets the beskyttet value for this NavnData.
     * 
     * @return beskyttet
     */
    public java.lang.String getBeskyttet() {
        return beskyttet;
    }


    /**
     * Sets the beskyttet value for this NavnData.
     * 
     * @param beskyttet
     */
    public void setBeskyttet(java.lang.String beskyttet) {
        this.beskyttet = beskyttet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NavnData)) return false;
        NavnData other = (NavnData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.navn==null && other.getNavn()==null) || 
             (this.navn!=null &&
              this.navn.equals(other.getNavn()))) &&
            ((this.beskyttetFra==null && other.getBeskyttetFra()==null) || 
             (this.beskyttetFra!=null &&
              this.beskyttetFra.equals(other.getBeskyttetFra()))) &&
            ((this.beskyttet==null && other.getBeskyttet()==null) || 
             (this.beskyttet!=null &&
              this.beskyttet.equals(other.getBeskyttet())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNavn() != null) {
            _hashCode += getNavn().hashCode();
        }
        if (getBeskyttetFra() != null) {
            _hashCode += getBeskyttetFra().hashCode();
        }
        if (getBeskyttet() != null) {
            _hashCode += getBeskyttet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NavnData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "NavnData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskyttetFra");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskyttetFra"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskyttet");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskyttet"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Navn"));
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
