/**
 * LetterDataOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class LetterDataOut  implements java.io.Serializable {
    private java.lang.Integer succFlag;

    private java.lang.Integer errorCode;

    public LetterDataOut() {
    }

    public LetterDataOut(
           java.lang.Integer succFlag,
           java.lang.Integer errorCode) {
           this.succFlag = succFlag;
           this.errorCode = errorCode;
    }


    /**
     * Gets the succFlag value for this LetterDataOut.
     * 
     * @return succFlag
     */
    public java.lang.Integer getSuccFlag() {
        return succFlag;
    }


    /**
     * Sets the succFlag value for this LetterDataOut.
     * 
     * @param succFlag
     */
    public void setSuccFlag(java.lang.Integer succFlag) {
        this.succFlag = succFlag;
    }


    /**
     * Gets the errorCode value for this LetterDataOut.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this LetterDataOut.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LetterDataOut)) return false;
        LetterDataOut other = (LetterDataOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.succFlag==null && other.getSuccFlag()==null) || 
             (this.succFlag!=null &&
              this.succFlag.equals(other.getSuccFlag()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getSuccFlag() != null) {
            _hashCode += getSuccFlag().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LetterDataOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "letterDataOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("succFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "succFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
