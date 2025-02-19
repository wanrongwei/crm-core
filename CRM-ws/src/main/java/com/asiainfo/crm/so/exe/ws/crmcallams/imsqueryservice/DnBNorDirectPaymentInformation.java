/**
 * DnBNorDirectPaymentInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class DnBNorDirectPaymentInformation  implements java.io.Serializable {
    private java.lang.String bankRef;

    private java.lang.String fromAccount;

    private java.lang.String KID;

    private java.lang.String message;

    private java.lang.String toAccount;

    public DnBNorDirectPaymentInformation() {
    }

    public DnBNorDirectPaymentInformation(
           java.lang.String bankRef,
           java.lang.String fromAccount,
           java.lang.String KID,
           java.lang.String message,
           java.lang.String toAccount) {
           this.bankRef = bankRef;
           this.fromAccount = fromAccount;
           this.KID = KID;
           this.message = message;
           this.toAccount = toAccount;
    }


    /**
     * Gets the bankRef value for this DnBNorDirectPaymentInformation.
     * 
     * @return bankRef
     */
    public java.lang.String getBankRef() {
        return bankRef;
    }


    /**
     * Sets the bankRef value for this DnBNorDirectPaymentInformation.
     * 
     * @param bankRef
     */
    public void setBankRef(java.lang.String bankRef) {
        this.bankRef = bankRef;
    }


    /**
     * Gets the fromAccount value for this DnBNorDirectPaymentInformation.
     * 
     * @return fromAccount
     */
    public java.lang.String getFromAccount() {
        return fromAccount;
    }


    /**
     * Sets the fromAccount value for this DnBNorDirectPaymentInformation.
     * 
     * @param fromAccount
     */
    public void setFromAccount(java.lang.String fromAccount) {
        this.fromAccount = fromAccount;
    }


    /**
     * Gets the KID value for this DnBNorDirectPaymentInformation.
     * 
     * @return KID
     */
    public java.lang.String getKID() {
        return KID;
    }


    /**
     * Sets the KID value for this DnBNorDirectPaymentInformation.
     * 
     * @param KID
     */
    public void setKID(java.lang.String KID) {
        this.KID = KID;
    }


    /**
     * Gets the message value for this DnBNorDirectPaymentInformation.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DnBNorDirectPaymentInformation.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the toAccount value for this DnBNorDirectPaymentInformation.
     * 
     * @return toAccount
     */
    public java.lang.String getToAccount() {
        return toAccount;
    }


    /**
     * Sets the toAccount value for this DnBNorDirectPaymentInformation.
     * 
     * @param toAccount
     */
    public void setToAccount(java.lang.String toAccount) {
        this.toAccount = toAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DnBNorDirectPaymentInformation)) return false;
        DnBNorDirectPaymentInformation other = (DnBNorDirectPaymentInformation) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankRef==null && other.getBankRef()==null) || 
             (this.bankRef!=null &&
              this.bankRef.equals(other.getBankRef()))) &&
            ((this.fromAccount==null && other.getFromAccount()==null) || 
             (this.fromAccount!=null &&
              this.fromAccount.equals(other.getFromAccount()))) &&
            ((this.KID==null && other.getKID()==null) || 
             (this.KID!=null &&
              this.KID.equals(other.getKID()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.toAccount==null && other.getToAccount()==null) || 
             (this.toAccount!=null &&
              this.toAccount.equals(other.getToAccount())));
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
        if (getBankRef() != null) {
            _hashCode += getBankRef().hashCode();
        }
        if (getFromAccount() != null) {
            _hashCode += getFromAccount().hashCode();
        }
        if (getKID() != null) {
            _hashCode += getKID().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getToAccount() != null) {
            _hashCode += getToAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DnBNorDirectPaymentInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPaymentInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FromAccount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToAccount"));
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
