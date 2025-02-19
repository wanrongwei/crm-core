/**
 * SAllowanceOfferUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SAllowanceOfferUsage  implements java.io.Serializable {
    private java.lang.Long maxLimit;

    private java.lang.Long minLimit;

    private java.lang.Integer measureId;

    private java.lang.Long offerId;

    private java.lang.String offerName;

    public SAllowanceOfferUsage() {
    }

    public SAllowanceOfferUsage(
           java.lang.Long maxLimit,
           java.lang.Long minLimit,
           java.lang.Integer measureId,
           java.lang.Long offerId,
           java.lang.String offerName) {
           this.maxLimit = maxLimit;
           this.minLimit = minLimit;
           this.measureId = measureId;
           this.offerId = offerId;
           this.offerName = offerName;
    }


    /**
     * Gets the maxLimit value for this SAllowanceOfferUsage.
     * 
     * @return maxLimit
     */
    public java.lang.Long getMaxLimit() {
        return maxLimit;
    }


    /**
     * Sets the maxLimit value for this SAllowanceOfferUsage.
     * 
     * @param maxLimit
     */
    public void setMaxLimit(java.lang.Long maxLimit) {
        this.maxLimit = maxLimit;
    }


    /**
     * Gets the minLimit value for this SAllowanceOfferUsage.
     * 
     * @return minLimit
     */
    public java.lang.Long getMinLimit() {
        return minLimit;
    }


    /**
     * Sets the minLimit value for this SAllowanceOfferUsage.
     * 
     * @param minLimit
     */
    public void setMinLimit(java.lang.Long minLimit) {
        this.minLimit = minLimit;
    }


    /**
     * Gets the measureId value for this SAllowanceOfferUsage.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SAllowanceOfferUsage.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the offerId value for this SAllowanceOfferUsage.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SAllowanceOfferUsage.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the offerName value for this SAllowanceOfferUsage.
     * 
     * @return offerName
     */
    public java.lang.String getOfferName() {
        return offerName;
    }


    /**
     * Sets the offerName value for this SAllowanceOfferUsage.
     * 
     * @param offerName
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAllowanceOfferUsage)) return false;
        SAllowanceOfferUsage other = (SAllowanceOfferUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxLimit==null && other.getMaxLimit()==null) || 
             (this.maxLimit!=null &&
              this.maxLimit.equals(other.getMaxLimit()))) &&
            ((this.minLimit==null && other.getMinLimit()==null) || 
             (this.minLimit!=null &&
              this.minLimit.equals(other.getMinLimit()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.offerName==null && other.getOfferName()==null) || 
             (this.offerName!=null &&
              this.offerName.equals(other.getOfferName())));
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
        if (getMaxLimit() != null) {
            _hashCode += getMaxLimit().hashCode();
        }
        if (getMinLimit() != null) {
            _hashCode += getMinLimit().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getOfferName() != null) {
            _hashCode += getOfferName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAllowanceOfferUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceOfferUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerName"));
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
