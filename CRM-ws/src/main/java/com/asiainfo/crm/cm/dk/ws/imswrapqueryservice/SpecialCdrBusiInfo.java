/**
 * SpecialCdrBusiInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SpecialCdrBusiInfo  implements java.io.Serializable {
    private int busiId;

    private java.lang.String busiValue;

    public SpecialCdrBusiInfo() {
    }

    public SpecialCdrBusiInfo(
           int busiId,
           java.lang.String busiValue) {
           this.busiId = busiId;
           this.busiValue = busiValue;
    }


    /**
     * Gets the busiId value for this SpecialCdrBusiInfo.
     * 
     * @return busiId
     */
    public int getBusiId() {
        return busiId;
    }


    /**
     * Sets the busiId value for this SpecialCdrBusiInfo.
     * 
     * @param busiId
     */
    public void setBusiId(int busiId) {
        this.busiId = busiId;
    }


    /**
     * Gets the busiValue value for this SpecialCdrBusiInfo.
     * 
     * @return busiValue
     */
    public java.lang.String getBusiValue() {
        return busiValue;
    }


    /**
     * Sets the busiValue value for this SpecialCdrBusiInfo.
     * 
     * @param busiValue
     */
    public void setBusiValue(java.lang.String busiValue) {
        this.busiValue = busiValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialCdrBusiInfo)) return false;
        SpecialCdrBusiInfo other = (SpecialCdrBusiInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.busiId == other.getBusiId() &&
            ((this.busiValue==null && other.getBusiValue()==null) || 
             (this.busiValue!=null &&
              this.busiValue.equals(other.getBusiValue())));
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
        _hashCode += getBusiId();
        if (getBusiValue() != null) {
            _hashCode += getBusiValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialCdrBusiInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialCdrBusiInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiValue"));
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
