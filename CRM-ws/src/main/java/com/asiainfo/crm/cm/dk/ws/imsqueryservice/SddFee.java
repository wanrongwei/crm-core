/**
 * SddFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SddFee  implements java.io.Serializable {
    private java.lang.Integer valueType;

    private java.lang.Double value;

    private java.lang.Integer measureId;

    private java.lang.String measureName;

    private java.lang.Integer cardType;

    private java.lang.String cardName;

    private java.lang.Integer bankId;

    private java.lang.String cardCountry;

    public SddFee() {
    }

    public SddFee(
           java.lang.Integer valueType,
           java.lang.Double value,
           java.lang.Integer measureId,
           java.lang.String measureName,
           java.lang.Integer cardType,
           java.lang.String cardName,
           java.lang.Integer bankId,
           java.lang.String cardCountry) {
           this.valueType = valueType;
           this.value = value;
           this.measureId = measureId;
           this.measureName = measureName;
           this.cardType = cardType;
           this.cardName = cardName;
           this.bankId = bankId;
           this.cardCountry = cardCountry;
    }


    /**
     * Gets the valueType value for this SddFee.
     * 
     * @return valueType
     */
    public java.lang.Integer getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this SddFee.
     * 
     * @param valueType
     */
    public void setValueType(java.lang.Integer valueType) {
        this.valueType = valueType;
    }


    /**
     * Gets the value value for this SddFee.
     * 
     * @return value
     */
    public java.lang.Double getValue() {
        return value;
    }


    /**
     * Sets the value value for this SddFee.
     * 
     * @param value
     */
    public void setValue(java.lang.Double value) {
        this.value = value;
    }


    /**
     * Gets the measureId value for this SddFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SddFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the measureName value for this SddFee.
     * 
     * @return measureName
     */
    public java.lang.String getMeasureName() {
        return measureName;
    }


    /**
     * Sets the measureName value for this SddFee.
     * 
     * @param measureName
     */
    public void setMeasureName(java.lang.String measureName) {
        this.measureName = measureName;
    }


    /**
     * Gets the cardType value for this SddFee.
     * 
     * @return cardType
     */
    public java.lang.Integer getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this SddFee.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.Integer cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardName value for this SddFee.
     * 
     * @return cardName
     */
    public java.lang.String getCardName() {
        return cardName;
    }


    /**
     * Sets the cardName value for this SddFee.
     * 
     * @param cardName
     */
    public void setCardName(java.lang.String cardName) {
        this.cardName = cardName;
    }


    /**
     * Gets the bankId value for this SddFee.
     * 
     * @return bankId
     */
    public java.lang.Integer getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this SddFee.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.Integer bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the cardCountry value for this SddFee.
     * 
     * @return cardCountry
     */
    public java.lang.String getCardCountry() {
        return cardCountry;
    }


    /**
     * Sets the cardCountry value for this SddFee.
     * 
     * @param cardCountry
     */
    public void setCardCountry(java.lang.String cardCountry) {
        this.cardCountry = cardCountry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SddFee)) return false;
        SddFee other = (SddFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valueType==null && other.getValueType()==null) || 
             (this.valueType!=null &&
              this.valueType.equals(other.getValueType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.measureName==null && other.getMeasureName()==null) || 
             (this.measureName!=null &&
              this.measureName.equals(other.getMeasureName()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardName==null && other.getCardName()==null) || 
             (this.cardName!=null &&
              this.cardName.equals(other.getCardName()))) &&
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            ((this.cardCountry==null && other.getCardCountry()==null) || 
             (this.cardCountry!=null &&
              this.cardCountry.equals(other.getCardCountry())));
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
        if (getValueType() != null) {
            _hashCode += getValueType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getMeasureName() != null) {
            _hashCode += getMeasureName().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardName() != null) {
            _hashCode += getCardName().hashCode();
        }
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        if (getCardCountry() != null) {
            _hashCode += getCardCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SddFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sddFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cardName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardCountry"));
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
