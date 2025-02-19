/**
 * AvtaleGiroInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class AvtaleGiroInformation  implements java.io.Serializable {
    private java.lang.String avtaleGiroStatus;

    public AvtaleGiroInformation() {
    }

    public AvtaleGiroInformation(
           java.lang.String avtaleGiroStatus) {
           this.avtaleGiroStatus = avtaleGiroStatus;
    }


    /**
     * Gets the avtaleGiroStatus value for this AvtaleGiroInformation.
     * 
     * @return avtaleGiroStatus
     */
    public java.lang.String getAvtaleGiroStatus() {
        return avtaleGiroStatus;
    }


    /**
     * Sets the avtaleGiroStatus value for this AvtaleGiroInformation.
     * 
     * @param avtaleGiroStatus
     */
    public void setAvtaleGiroStatus(java.lang.String avtaleGiroStatus) {
        this.avtaleGiroStatus = avtaleGiroStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvtaleGiroInformation)) return false;
        AvtaleGiroInformation other = (AvtaleGiroInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avtaleGiroStatus==null && other.getAvtaleGiroStatus()==null) || 
             (this.avtaleGiroStatus!=null &&
              this.avtaleGiroStatus.equals(other.getAvtaleGiroStatus())));
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
        if (getAvtaleGiroStatus() != null) {
            _hashCode += getAvtaleGiroStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvtaleGiroInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "avtaleGiroInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avtaleGiroStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AvtaleGiroStatus"));
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
