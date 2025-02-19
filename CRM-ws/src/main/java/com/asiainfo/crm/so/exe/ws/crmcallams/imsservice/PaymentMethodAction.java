/**
 * PaymentMethodAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class PaymentMethodAction  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String bin;

    private java.lang.String cardOrigin;

    private java.lang.String cardType;

    private java.lang.String fee;

    private java.lang.String name;

    private java.lang.String paymentMethod;

    public PaymentMethodAction() {
    }

    public PaymentMethodAction(
           java.lang.String action,
           java.lang.String bin,
           java.lang.String cardOrigin,
           java.lang.String cardType,
           java.lang.String fee,
           java.lang.String name,
           java.lang.String paymentMethod) {
           this.action = action;
           this.bin = bin;
           this.cardOrigin = cardOrigin;
           this.cardType = cardType;
           this.fee = fee;
           this.name = name;
           this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the action value for this PaymentMethodAction.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this PaymentMethodAction.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the bin value for this PaymentMethodAction.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this PaymentMethodAction.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the cardOrigin value for this PaymentMethodAction.
     * 
     * @return cardOrigin
     */
    public java.lang.String getCardOrigin() {
        return cardOrigin;
    }


    /**
     * Sets the cardOrigin value for this PaymentMethodAction.
     * 
     * @param cardOrigin
     */
    public void setCardOrigin(java.lang.String cardOrigin) {
        this.cardOrigin = cardOrigin;
    }


    /**
     * Gets the cardType value for this PaymentMethodAction.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this PaymentMethodAction.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the fee value for this PaymentMethodAction.
     * 
     * @return fee
     */
    public java.lang.String getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this PaymentMethodAction.
     * 
     * @param fee
     */
    public void setFee(java.lang.String fee) {
        this.fee = fee;
    }


    /**
     * Gets the name value for this PaymentMethodAction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentMethodAction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the paymentMethod value for this PaymentMethodAction.
     * 
     * @return paymentMethod
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this PaymentMethodAction.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethodAction)) return false;
        PaymentMethodAction other = (PaymentMethodAction) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.cardOrigin==null && other.getCardOrigin()==null) || 
             (this.cardOrigin!=null &&
              this.cardOrigin.equals(other.getCardOrigin()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getCardOrigin() != null) {
            _hashCode += getCardOrigin().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethodAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentMethodAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentMethod"));
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
