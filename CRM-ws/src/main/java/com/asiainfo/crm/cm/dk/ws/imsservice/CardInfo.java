/**
 * CardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class CardInfo  implements java.io.Serializable {
    private java.lang.String pan;

    private java.lang.String expiryDate;

    private java.lang.String securityCode;

    public CardInfo() {
    }

    public CardInfo(
           java.lang.String pan,
           java.lang.String expiryDate,
           java.lang.String securityCode) {
           this.pan = pan;
           this.expiryDate = expiryDate;
           this.securityCode = securityCode;
    }


    /**
     * Gets the pan value for this CardInfo.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardInfo.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the expiryDate value for this CardInfo.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this CardInfo.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the securityCode value for this CardInfo.
     * 
     * @return securityCode
     */
    public java.lang.String getSecurityCode() {
        return securityCode;
    }


    /**
     * Sets the securityCode value for this CardInfo.
     * 
     * @param securityCode
     */
    public void setSecurityCode(java.lang.String securityCode) {
        this.securityCode = securityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardInfo)) return false;
        CardInfo other = (CardInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.securityCode==null && other.getSecurityCode()==null) || 
             (this.securityCode!=null &&
              this.securityCode.equals(other.getSecurityCode())));
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
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getSecurityCode() != null) {
            _hashCode += getSecurityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityCode"));
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
