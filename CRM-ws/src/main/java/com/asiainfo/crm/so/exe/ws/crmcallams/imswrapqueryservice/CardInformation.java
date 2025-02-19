/**
 * CardInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class CardInformation  implements java.io.Serializable {
    private java.lang.String expiryDate;

    private java.lang.String issuer;

    private java.lang.String issuerCountry;

    private java.lang.String maskedPAN;

    private java.lang.String panHash;

    private java.lang.String paymentMethod;

    private java.lang.String issuerId;

    public CardInformation() {
    }

    public CardInformation(
           java.lang.String expiryDate,
           java.lang.String issuer,
           java.lang.String issuerCountry,
           java.lang.String maskedPAN,
           java.lang.String panHash,
           java.lang.String paymentMethod,
           java.lang.String issuerId) {
           this.expiryDate = expiryDate;
           this.issuer = issuer;
           this.issuerCountry = issuerCountry;
           this.maskedPAN = maskedPAN;
           this.panHash = panHash;
           this.paymentMethod = paymentMethod;
           this.issuerId = issuerId;
    }


    /**
     * Gets the expiryDate value for this CardInformation.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this CardInformation.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the issuer value for this CardInformation.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this CardInformation.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the issuerCountry value for this CardInformation.
     * 
     * @return issuerCountry
     */
    public java.lang.String getIssuerCountry() {
        return issuerCountry;
    }


    /**
     * Sets the issuerCountry value for this CardInformation.
     * 
     * @param issuerCountry
     */
    public void setIssuerCountry(java.lang.String issuerCountry) {
        this.issuerCountry = issuerCountry;
    }


    /**
     * Gets the maskedPAN value for this CardInformation.
     * 
     * @return maskedPAN
     */
    public java.lang.String getMaskedPAN() {
        return maskedPAN;
    }


    /**
     * Sets the maskedPAN value for this CardInformation.
     * 
     * @param maskedPAN
     */
    public void setMaskedPAN(java.lang.String maskedPAN) {
        this.maskedPAN = maskedPAN;
    }


    /**
     * Gets the panHash value for this CardInformation.
     * 
     * @return panHash
     */
    public java.lang.String getPanHash() {
        return panHash;
    }


    /**
     * Sets the panHash value for this CardInformation.
     * 
     * @param panHash
     */
    public void setPanHash(java.lang.String panHash) {
        this.panHash = panHash;
    }


    /**
     * Gets the paymentMethod value for this CardInformation.
     * 
     * @return paymentMethod
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CardInformation.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the issuerId value for this CardInformation.
     * 
     * @return issuerId
     */
    public java.lang.String getIssuerId() {
        return issuerId;
    }


    /**
     * Sets the issuerId value for this CardInformation.
     * 
     * @param issuerId
     */
    public void setIssuerId(java.lang.String issuerId) {
        this.issuerId = issuerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardInformation)) return false;
        CardInformation other = (CardInformation) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.issuerCountry==null && other.getIssuerCountry()==null) || 
             (this.issuerCountry!=null &&
              this.issuerCountry.equals(other.getIssuerCountry()))) &&
            ((this.maskedPAN==null && other.getMaskedPAN()==null) || 
             (this.maskedPAN!=null &&
              this.maskedPAN.equals(other.getMaskedPAN()))) &&
            ((this.panHash==null && other.getPanHash()==null) || 
             (this.panHash!=null &&
              this.panHash.equals(other.getPanHash()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.issuerId==null && other.getIssuerId()==null) || 
             (this.issuerId!=null &&
              this.issuerId.equals(other.getIssuerId())));
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
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getIssuerCountry() != null) {
            _hashCode += getIssuerCountry().hashCode();
        }
        if (getMaskedPAN() != null) {
            _hashCode += getMaskedPAN().hashCode();
        }
        if (getPanHash() != null) {
            _hashCode += getPanHash().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getIssuerId() != null) {
            _hashCode += getIssuerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssuerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedPAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaskedPAN"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssuerId"));
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
