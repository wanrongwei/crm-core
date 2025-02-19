/**
 * YwsSoItemDataOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSoItemDataOut  implements java.io.Serializable {
    private java.lang.String itmNumber;

    private java.lang.String expDelDate;

    public YwsSoItemDataOut() {
    }

    public YwsSoItemDataOut(
           java.lang.String itmNumber,
           java.lang.String expDelDate) {
           this.itmNumber = itmNumber;
           this.expDelDate = expDelDate;
    }


    /**
     * Gets the itmNumber value for this YwsSoItemDataOut.
     * 
     * @return itmNumber
     */
    public java.lang.String getItmNumber() {
        return itmNumber;
    }


    /**
     * Sets the itmNumber value for this YwsSoItemDataOut.
     * 
     * @param itmNumber
     */
    public void setItmNumber(java.lang.String itmNumber) {
        this.itmNumber = itmNumber;
    }


    /**
     * Gets the expDelDate value for this YwsSoItemDataOut.
     * 
     * @return expDelDate
     */
    public java.lang.String getExpDelDate() {
        return expDelDate;
    }


    /**
     * Sets the expDelDate value for this YwsSoItemDataOut.
     * 
     * @param expDelDate
     */
    public void setExpDelDate(java.lang.String expDelDate) {
        this.expDelDate = expDelDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSoItemDataOut)) return false;
        YwsSoItemDataOut other = (YwsSoItemDataOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itmNumber==null && other.getItmNumber()==null) || 
             (this.itmNumber!=null &&
              this.itmNumber.equals(other.getItmNumber()))) &&
            ((this.expDelDate==null && other.getExpDelDate()==null) || 
             (this.expDelDate!=null &&
              this.expDelDate.equals(other.getExpDelDate())));
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
        if (getItmNumber() != null) {
            _hashCode += getItmNumber().hashCode();
        }
        if (getExpDelDate() != null) {
            _hashCode += getExpDelDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSoItemDataOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itmNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItmNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpDelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
