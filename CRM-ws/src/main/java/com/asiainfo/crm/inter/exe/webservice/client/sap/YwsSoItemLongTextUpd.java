/**
 * YwsSoItemLongTextUpd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSoItemLongTextUpd  implements java.io.Serializable {
    private java.lang.String textDataType;

    private java.lang.String textDataLine;

    public YwsSoItemLongTextUpd() {
    }

    public YwsSoItemLongTextUpd(
           java.lang.String textDataType,
           java.lang.String textDataLine) {
           this.textDataType = textDataType;
           this.textDataLine = textDataLine;
    }


    /**
     * Gets the textDataType value for this YwsSoItemLongTextUpd.
     * 
     * @return textDataType
     */
    public java.lang.String getTextDataType() {
        return textDataType;
    }


    /**
     * Sets the textDataType value for this YwsSoItemLongTextUpd.
     * 
     * @param textDataType
     */
    public void setTextDataType(java.lang.String textDataType) {
        this.textDataType = textDataType;
    }


    /**
     * Gets the textDataLine value for this YwsSoItemLongTextUpd.
     * 
     * @return textDataLine
     */
    public java.lang.String getTextDataLine() {
        return textDataLine;
    }


    /**
     * Sets the textDataLine value for this YwsSoItemLongTextUpd.
     * 
     * @param textDataLine
     */
    public void setTextDataLine(java.lang.String textDataLine) {
        this.textDataLine = textDataLine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSoItemLongTextUpd)) return false;
        YwsSoItemLongTextUpd other = (YwsSoItemLongTextUpd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.textDataType==null && other.getTextDataType()==null) || 
             (this.textDataType!=null &&
              this.textDataType.equals(other.getTextDataType()))) &&
            ((this.textDataLine==null && other.getTextDataLine()==null) || 
             (this.textDataLine!=null &&
              this.textDataLine.equals(other.getTextDataLine())));
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
        if (getTextDataType() != null) {
            _hashCode += getTextDataType().hashCode();
        }
        if (getTextDataLine() != null) {
            _hashCode += getTextDataLine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSoItemLongTextUpd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongTextUpd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textDataLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextDataLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
