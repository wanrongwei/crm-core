/**
 * PersonNavnData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class PersonNavnData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData  implements java.io.Serializable {
    private java.lang.String fornavne;

    private java.lang.String efternavn;

    public PersonNavnData() {
    }

    public PersonNavnData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String beskyttetFra,
           java.lang.String beskyttet,
           java.lang.String navn,
           java.lang.String fornavne,
           java.lang.String efternavn) {
        super(
            error,
            beskyttetFra,
            beskyttet,
            navn);
        this.fornavne = fornavne;
        this.efternavn = efternavn;
    }


    /**
     * Gets the fornavne value for this PersonNavnData.
     * 
     * @return fornavne
     */
    public java.lang.String getFornavne() {
        return fornavne;
    }


    /**
     * Sets the fornavne value for this PersonNavnData.
     * 
     * @param fornavne
     */
    public void setFornavne(java.lang.String fornavne) {
        this.fornavne = fornavne;
    }


    /**
     * Gets the efternavn value for this PersonNavnData.
     * 
     * @return efternavn
     */
    public java.lang.String getEfternavn() {
        return efternavn;
    }


    /**
     * Sets the efternavn value for this PersonNavnData.
     * 
     * @param efternavn
     */
    public void setEfternavn(java.lang.String efternavn) {
        this.efternavn = efternavn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonNavnData)) return false;
        PersonNavnData other = (PersonNavnData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fornavne==null && other.getFornavne()==null) || 
             (this.fornavne!=null &&
              this.fornavne.equals(other.getFornavne()))) &&
            ((this.efternavn==null && other.getEfternavn()==null) || 
             (this.efternavn!=null &&
              this.efternavn.equals(other.getEfternavn())));
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
        if (getFornavne() != null) {
            _hashCode += getFornavne().hashCode();
        }
        if (getEfternavn() != null) {
            _hashCode += getEfternavn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonNavnData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonNavnData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornavne");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Fornavne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efternavn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Efternavn"));
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
