/**
 * AddressRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class AddressRequestBody  implements java.io.Serializable {
    private java.lang.String vejnavn;

    private java.lang.String husnr;

    private java.lang.String etage;

    private java.lang.String dør;

    private java.lang.String postnr;

    public AddressRequestBody() {
    }

    public AddressRequestBody(
           java.lang.String vejnavn,
           java.lang.String husnr,
           java.lang.String etage,
           java.lang.String dør,
           java.lang.String postnr) {
           this.vejnavn = vejnavn;
           this.husnr = husnr;
           this.etage = etage;
           this.dør = dør;
           this.postnr = postnr;
    }


    /**
     * Gets the vejnavn value for this AddressRequestBody.
     * 
     * @return vejnavn
     */
    public java.lang.String getVejnavn() {
        return vejnavn;
    }


    /**
     * Sets the vejnavn value for this AddressRequestBody.
     * 
     * @param vejnavn
     */
    public void setVejnavn(java.lang.String vejnavn) {
        this.vejnavn = vejnavn;
    }


    /**
     * Gets the husnr value for this AddressRequestBody.
     * 
     * @return husnr
     */
    public java.lang.String getHusnr() {
        return husnr;
    }


    /**
     * Sets the husnr value for this AddressRequestBody.
     * 
     * @param husnr
     */
    public void setHusnr(java.lang.String husnr) {
        this.husnr = husnr;
    }


    /**
     * Gets the etage value for this AddressRequestBody.
     * 
     * @return etage
     */
    public java.lang.String getEtage() {
        return etage;
    }


    /**
     * Sets the etage value for this AddressRequestBody.
     * 
     * @param etage
     */
    public void setEtage(java.lang.String etage) {
        this.etage = etage;
    }


    /**
     * Gets the dør value for this AddressRequestBody.
     * 
     * @return dør
     */
    public java.lang.String getDør() {
        return dør;
    }


    /**
     * Sets the dør value for this AddressRequestBody.
     * 
     * @param dør
     */
    public void setDør(java.lang.String dør) {
        this.dør = dør;
    }


    /**
     * Gets the postnr value for this AddressRequestBody.
     * 
     * @return postnr
     */
    public java.lang.String getPostnr() {
        return postnr;
    }


    /**
     * Sets the postnr value for this AddressRequestBody.
     * 
     * @param postnr
     */
    public void setPostnr(java.lang.String postnr) {
        this.postnr = postnr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressRequestBody)) return false;
        AddressRequestBody other = (AddressRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vejnavn==null && other.getVejnavn()==null) || 
             (this.vejnavn!=null &&
              this.vejnavn.equals(other.getVejnavn()))) &&
            ((this.husnr==null && other.getHusnr()==null) || 
             (this.husnr!=null &&
              this.husnr.equals(other.getHusnr()))) &&
            ((this.etage==null && other.getEtage()==null) || 
             (this.etage!=null &&
              this.etage.equals(other.getEtage()))) &&
            ((this.dør==null && other.getDør()==null) || 
             (this.dør!=null &&
              this.dør.equals(other.getDør()))) &&
            ((this.postnr==null && other.getPostnr()==null) || 
             (this.postnr!=null &&
              this.postnr.equals(other.getPostnr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVejnavn() != null) {
            _hashCode += getVejnavn().hashCode();
        }
        if (getHusnr() != null) {
            _hashCode += getHusnr().hashCode();
        }
        if (getEtage() != null) {
            _hashCode += getEtage().hashCode();
        }
        if (getDør() != null) {
            _hashCode += getDør().hashCode();
        }
        if (getPostnr() != null) {
            _hashCode += getPostnr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "addressRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vejnavn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vejnavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("husnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "husnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dør");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dør"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postnr"));
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
