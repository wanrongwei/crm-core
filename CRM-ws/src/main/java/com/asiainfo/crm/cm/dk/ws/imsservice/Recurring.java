/**
 * Recurring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class Recurring  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String frequency;

    private java.lang.String expiryDate;

    private java.lang.String panHash;

    public Recurring() {
    }

    public Recurring(
           java.lang.String type,
           java.lang.String frequency,
           java.lang.String expiryDate,
           java.lang.String panHash) {
           this.type = type;
           this.frequency = frequency;
           this.expiryDate = expiryDate;
           this.panHash = panHash;
    }


    /**
     * Gets the type value for this Recurring.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Recurring.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the frequency value for this Recurring.
     * 
     * @return frequency
     */
    public java.lang.String getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this Recurring.
     * 
     * @param frequency
     */
    public void setFrequency(java.lang.String frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the expiryDate value for this Recurring.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this Recurring.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the panHash value for this Recurring.
     * 
     * @return panHash
     */
    public java.lang.String getPanHash() {
        return panHash;
    }


    /**
     * Sets the panHash value for this Recurring.
     * 
     * @param panHash
     */
    public void setPanHash(java.lang.String panHash) {
        this.panHash = panHash;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recurring)) return false;
        Recurring other = (Recurring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.panHash==null && other.getPanHash()==null) || 
             (this.panHash!=null &&
              this.panHash.equals(other.getPanHash())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getPanHash() != null) {
            _hashCode += getPanHash().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recurring.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Frequency"));
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
        elemField.setFieldName("panHash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PanHash"));
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
