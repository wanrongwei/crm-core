/**
 * BankDebitInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class BankDebitInfo  implements java.io.Serializable {
    private java.lang.Long bankId;

    private java.lang.Integer cardType;

    private java.lang.String cardTypeName;

    private java.lang.String cardId;

    private java.lang.String authId;

    private java.lang.String cvr;

    private java.lang.Long expireTime;

    private java.lang.String expireDate;

    public BankDebitInfo() {
    }

    public BankDebitInfo(
           java.lang.Long bankId,
           java.lang.Integer cardType,
           java.lang.String cardTypeName,
           java.lang.String cardId,
           java.lang.String authId,
           java.lang.String cvr,
           java.lang.Long expireTime,
           java.lang.String expireDate) {
           this.bankId = bankId;
           this.cardType = cardType;
           this.cardTypeName = cardTypeName;
           this.cardId = cardId;
           this.authId = authId;
           this.cvr = cvr;
           this.expireTime = expireTime;
           this.expireDate = expireDate;
    }


    /**
     * Gets the bankId value for this BankDebitInfo.
     * 
     * @return bankId
     */
    public java.lang.Long getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this BankDebitInfo.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.Long bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the cardType value for this BankDebitInfo.
     * 
     * @return cardType
     */
    public java.lang.Integer getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this BankDebitInfo.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.Integer cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardTypeName value for this BankDebitInfo.
     * 
     * @return cardTypeName
     */
    public java.lang.String getCardTypeName() {
        return cardTypeName;
    }


    /**
     * Sets the cardTypeName value for this BankDebitInfo.
     * 
     * @param cardTypeName
     */
    public void setCardTypeName(java.lang.String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }


    /**
     * Gets the cardId value for this BankDebitInfo.
     * 
     * @return cardId
     */
    public java.lang.String getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this BankDebitInfo.
     * 
     * @param cardId
     */
    public void setCardId(java.lang.String cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the authId value for this BankDebitInfo.
     * 
     * @return authId
     */
    public java.lang.String getAuthId() {
        return authId;
    }


    /**
     * Sets the authId value for this BankDebitInfo.
     * 
     * @param authId
     */
    public void setAuthId(java.lang.String authId) {
        this.authId = authId;
    }


    /**
     * Gets the cvr value for this BankDebitInfo.
     * 
     * @return cvr
     */
    public java.lang.String getCvr() {
        return cvr;
    }


    /**
     * Sets the cvr value for this BankDebitInfo.
     * 
     * @param cvr
     */
    public void setCvr(java.lang.String cvr) {
        this.cvr = cvr;
    }


    /**
     * Gets the expireTime value for this BankDebitInfo.
     * 
     * @return expireTime
     */
    public java.lang.Long getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this BankDebitInfo.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.Long expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the expireDate value for this BankDebitInfo.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this BankDebitInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankDebitInfo)) return false;
        BankDebitInfo other = (BankDebitInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardTypeName==null && other.getCardTypeName()==null) || 
             (this.cardTypeName!=null &&
              this.cardTypeName.equals(other.getCardTypeName()))) &&
            ((this.cardId==null && other.getCardId()==null) || 
             (this.cardId!=null &&
              this.cardId.equals(other.getCardId()))) &&
            ((this.authId==null && other.getAuthId()==null) || 
             (this.authId!=null &&
              this.authId.equals(other.getAuthId()))) &&
            ((this.cvr==null && other.getCvr()==null) || 
             (this.cvr!=null &&
              this.cvr.equals(other.getCvr()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardTypeName() != null) {
            _hashCode += getCardTypeName().hashCode();
        }
        if (getCardId() != null) {
            _hashCode += getCardId().hashCode();
        }
        if (getAuthId() != null) {
            _hashCode += getAuthId().hashCode();
        }
        if (getCvr() != null) {
            _hashCode += getCvr().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankDebitInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
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
