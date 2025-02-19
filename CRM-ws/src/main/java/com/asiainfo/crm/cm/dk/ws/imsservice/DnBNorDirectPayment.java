/**
 * DnBNorDirectPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DnBNorDirectPayment  implements java.io.Serializable {
    private java.lang.String toAccount;

    private java.lang.String KID;

    private java.lang.String message;

    public DnBNorDirectPayment() {
    }

    public DnBNorDirectPayment(
           java.lang.String toAccount,
           java.lang.String KID,
           java.lang.String message) {
           this.toAccount = toAccount;
           this.KID = KID;
           this.message = message;
    }


    /**
     * Gets the toAccount value for this DnBNorDirectPayment.
     * 
     * @return toAccount
     */
    public java.lang.String getToAccount() {
        return toAccount;
    }


    /**
     * Sets the toAccount value for this DnBNorDirectPayment.
     * 
     * @param toAccount
     */
    public void setToAccount(java.lang.String toAccount) {
        this.toAccount = toAccount;
    }


    /**
     * Gets the KID value for this DnBNorDirectPayment.
     * 
     * @return KID
     */
    public java.lang.String getKID() {
        return KID;
    }


    /**
     * Sets the KID value for this DnBNorDirectPayment.
     * 
     * @param KID
     */
    public void setKID(java.lang.String KID) {
        this.KID = KID;
    }


    /**
     * Gets the message value for this DnBNorDirectPayment.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DnBNorDirectPayment.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DnBNorDirectPayment)) return false;
        DnBNorDirectPayment other = (DnBNorDirectPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.toAccount==null && other.getToAccount()==null) || 
             (this.toAccount!=null &&
              this.toAccount.equals(other.getToAccount()))) &&
            ((this.KID==null && other.getKID()==null) || 
             (this.KID!=null &&
              this.KID.equals(other.getKID()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getToAccount() != null) {
            _hashCode += getToAccount().hashCode();
        }
        if (getKID() != null) {
            _hashCode += getKID().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DnBNorDirectPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Message"));
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
