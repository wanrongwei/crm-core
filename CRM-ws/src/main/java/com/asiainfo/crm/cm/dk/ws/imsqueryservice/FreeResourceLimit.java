/**
 * FreeResourceLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class FreeResourceLimit  implements java.io.Serializable {
    private java.lang.Long productId;

    private java.lang.Long objectId;

    private java.lang.Long objectType;

    private java.lang.Long limitType;

    private java.util.Calendar validDateTime;

    private java.util.Calendar expireDateTime;

    private java.lang.Long freeResFreeze;

    private java.lang.Long freeResUsed;

    private java.lang.Long amount;

    public FreeResourceLimit() {
    }

    public FreeResourceLimit(
           java.lang.Long productId,
           java.lang.Long objectId,
           java.lang.Long objectType,
           java.lang.Long limitType,
           java.util.Calendar validDateTime,
           java.util.Calendar expireDateTime,
           java.lang.Long freeResFreeze,
           java.lang.Long freeResUsed,
           java.lang.Long amount) {
           this.productId = productId;
           this.objectId = objectId;
           this.objectType = objectType;
           this.limitType = limitType;
           this.validDateTime = validDateTime;
           this.expireDateTime = expireDateTime;
           this.freeResFreeze = freeResFreeze;
           this.freeResUsed = freeResUsed;
           this.amount = amount;
    }


    /**
     * Gets the productId value for this FreeResourceLimit.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this FreeResourceLimit.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the objectId value for this FreeResourceLimit.
     * 
     * @return objectId
     */
    public java.lang.Long getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this FreeResourceLimit.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.Long objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectType value for this FreeResourceLimit.
     * 
     * @return objectType
     */
    public java.lang.Long getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this FreeResourceLimit.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.Long objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the limitType value for this FreeResourceLimit.
     * 
     * @return limitType
     */
    public java.lang.Long getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this FreeResourceLimit.
     * 
     * @param limitType
     */
    public void setLimitType(java.lang.Long limitType) {
        this.limitType = limitType;
    }


    /**
     * Gets the validDateTime value for this FreeResourceLimit.
     * 
     * @return validDateTime
     */
    public java.util.Calendar getValidDateTime() {
        return validDateTime;
    }


    /**
     * Sets the validDateTime value for this FreeResourceLimit.
     * 
     * @param validDateTime
     */
    public void setValidDateTime(java.util.Calendar validDateTime) {
        this.validDateTime = validDateTime;
    }


    /**
     * Gets the expireDateTime value for this FreeResourceLimit.
     * 
     * @return expireDateTime
     */
    public java.util.Calendar getExpireDateTime() {
        return expireDateTime;
    }


    /**
     * Sets the expireDateTime value for this FreeResourceLimit.
     * 
     * @param expireDateTime
     */
    public void setExpireDateTime(java.util.Calendar expireDateTime) {
        this.expireDateTime = expireDateTime;
    }


    /**
     * Gets the freeResFreeze value for this FreeResourceLimit.
     * 
     * @return freeResFreeze
     */
    public java.lang.Long getFreeResFreeze() {
        return freeResFreeze;
    }


    /**
     * Sets the freeResFreeze value for this FreeResourceLimit.
     * 
     * @param freeResFreeze
     */
    public void setFreeResFreeze(java.lang.Long freeResFreeze) {
        this.freeResFreeze = freeResFreeze;
    }


    /**
     * Gets the freeResUsed value for this FreeResourceLimit.
     * 
     * @return freeResUsed
     */
    public java.lang.Long getFreeResUsed() {
        return freeResUsed;
    }


    /**
     * Sets the freeResUsed value for this FreeResourceLimit.
     * 
     * @param freeResUsed
     */
    public void setFreeResUsed(java.lang.Long freeResUsed) {
        this.freeResUsed = freeResUsed;
    }


    /**
     * Gets the amount value for this FreeResourceLimit.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FreeResourceLimit.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeResourceLimit)) return false;
        FreeResourceLimit other = (FreeResourceLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType()))) &&
            ((this.validDateTime==null && other.getValidDateTime()==null) || 
             (this.validDateTime!=null &&
              this.validDateTime.equals(other.getValidDateTime()))) &&
            ((this.expireDateTime==null && other.getExpireDateTime()==null) || 
             (this.expireDateTime!=null &&
              this.expireDateTime.equals(other.getExpireDateTime()))) &&
            ((this.freeResFreeze==null && other.getFreeResFreeze()==null) || 
             (this.freeResFreeze!=null &&
              this.freeResFreeze.equals(other.getFreeResFreeze()))) &&
            ((this.freeResUsed==null && other.getFreeResUsed()==null) || 
             (this.freeResUsed!=null &&
              this.freeResUsed.equals(other.getFreeResUsed()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        if (getValidDateTime() != null) {
            _hashCode += getValidDateTime().hashCode();
        }
        if (getExpireDateTime() != null) {
            _hashCode += getExpireDateTime().hashCode();
        }
        if (getFreeResFreeze() != null) {
            _hashCode += getFreeResFreeze().hashCode();
        }
        if (getFreeResUsed() != null) {
            _hashCode += getFreeResUsed().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeResourceLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResFreeze");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResFreeze"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
