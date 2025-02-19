/**
 * PostDistriktData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class PostDistriktData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String navn;

    private java.lang.String postNr;

    public PostDistriktData() {
    }

    public PostDistriktData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String navn,
           java.lang.String postNr) {
        super(
            error);
        this.navn = navn;
        this.postNr = postNr;
    }


    /**
     * Gets the navn value for this PostDistriktData.
     * 
     * @return navn
     */
    public java.lang.String getNavn() {
        return navn;
    }


    /**
     * Sets the navn value for this PostDistriktData.
     * 
     * @param navn
     */
    public void setNavn(java.lang.String navn) {
        this.navn = navn;
    }


    /**
     * Gets the postNr value for this PostDistriktData.
     * 
     * @return postNr
     */
    public java.lang.String getPostNr() {
        return postNr;
    }


    /**
     * Sets the postNr value for this PostDistriktData.
     * 
     * @param postNr
     */
    public void setPostNr(java.lang.String postNr) {
        this.postNr = postNr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostDistriktData)) return false;
        PostDistriktData other = (PostDistriktData) obj;
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
            ((this.postNr==null && other.getPostNr()==null) || 
             (this.postNr!=null &&
              this.postNr.equals(other.getPostNr())));
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
        if (getPostNr() != null) {
            _hashCode += getPostNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostDistriktData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "PostDistriktData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("navn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Navn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postNr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "PostNr"));
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
