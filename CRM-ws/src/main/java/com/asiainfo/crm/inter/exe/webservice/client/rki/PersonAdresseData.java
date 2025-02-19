/**
 * PersonAdresseData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class PersonAdresseData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData person;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresser;

    public PersonAdresseData() {
    }

    public PersonAdresseData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData person,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresser) {
        super(
            error);
        this.person = person;
        this.adresser = adresser;
    }


    /**
     * Gets the person value for this PersonAdresseData.
     * 
     * @return person
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData getPerson() {
        return person;
    }


    /**
     * Sets the person value for this PersonAdresseData.
     * 
     * @param person
     */
    public void setPerson(com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData person) {
        this.person = person;
    }


    /**
     * Gets the adresser value for this PersonAdresseData.
     * 
     * @return adresser
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe getAdresser() {
        return adresser;
    }


    /**
     * Sets the adresser value for this PersonAdresseData.
     * 
     * @param adresser
     */
    public void setAdresser(com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe adresser) {
        this.adresser = adresser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonAdresseData)) return false;
        PersonAdresseData other = (PersonAdresseData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.adresser==null && other.getAdresser()==null) || 
             (this.adresser!=null &&
              this.adresser.equals(other.getAdresser())));
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
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getAdresser() != null) {
            _hashCode += getAdresser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonAdresseData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonAdresseData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Person"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Adresser"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseListe"));
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
