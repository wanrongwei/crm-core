/**
 * SInstalOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SInstalOffer  implements java.io.Serializable {
    private java.lang.Long offerId;

    private java.lang.String imeis;

    private java.lang.String offerName;

    public SInstalOffer() {
    }

    public SInstalOffer(
           java.lang.Long offerId,
           java.lang.String imeis,
           java.lang.String offerName) {
           this.offerId = offerId;
           this.imeis = imeis;
           this.offerName = offerName;
    }


    /**
     * Gets the offerId value for this SInstalOffer.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SInstalOffer.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the imeis value for this SInstalOffer.
     * 
     * @return imeis
     */
    public java.lang.String getImeis() {
        return imeis;
    }


    /**
     * Sets the imeis value for this SInstalOffer.
     * 
     * @param imeis
     */
    public void setImeis(java.lang.String imeis) {
        this.imeis = imeis;
    }


    /**
     * Gets the offerName value for this SInstalOffer.
     * 
     * @return offerName
     */
    public java.lang.String getOfferName() {
        return offerName;
    }


    /**
     * Sets the offerName value for this SInstalOffer.
     * 
     * @param offerName
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SInstalOffer)) return false;
        SInstalOffer other = (SInstalOffer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.imeis==null && other.getImeis()==null) || 
             (this.imeis!=null &&
              this.imeis.equals(other.getImeis()))) &&
            ((this.offerName==null && other.getOfferName()==null) || 
             (this.offerName!=null &&
              this.offerName.equals(other.getOfferName())));
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
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getImeis() != null) {
            _hashCode += getImeis().hashCode();
        }
        if (getOfferName() != null) {
            _hashCode += getOfferName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SInstalOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalOffer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imeis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imeis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerName"));
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
