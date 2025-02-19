/**
 * AllowanceOfferUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AllowanceOfferUsage  implements java.io.Serializable {
    private java.lang.Long maxLimit;

    private java.lang.Long minLimit;

    private java.lang.Integer measureId;

    private java.lang.Long offerId;

    public AllowanceOfferUsage() {
    }

    public AllowanceOfferUsage(
           java.lang.Long maxLimit,
           java.lang.Long minLimit,
           java.lang.Integer measureId,
           java.lang.Long offerId) {
           this.maxLimit = maxLimit;
           this.minLimit = minLimit;
           this.measureId = measureId;
           this.offerId = offerId;
    }


    /**
     * Gets the maxLimit value for this AllowanceOfferUsage.
     * 
     * @return maxLimit
     */
    public java.lang.Long getMaxLimit() {
        return maxLimit;
    }


    /**
     * Sets the maxLimit value for this AllowanceOfferUsage.
     * 
     * @param maxLimit
     */
    public void setMaxLimit(java.lang.Long maxLimit) {
        this.maxLimit = maxLimit;
    }


    /**
     * Gets the minLimit value for this AllowanceOfferUsage.
     * 
     * @return minLimit
     */
    public java.lang.Long getMinLimit() {
        return minLimit;
    }


    /**
     * Sets the minLimit value for this AllowanceOfferUsage.
     * 
     * @param minLimit
     */
    public void setMinLimit(java.lang.Long minLimit) {
        this.minLimit = minLimit;
    }


    /**
     * Gets the measureId value for this AllowanceOfferUsage.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this AllowanceOfferUsage.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the offerId value for this AllowanceOfferUsage.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this AllowanceOfferUsage.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllowanceOfferUsage)) return false;
        AllowanceOfferUsage other = (AllowanceOfferUsage) obj;
        
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
              this.offerId.equals(other.getOfferId())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllowanceOfferUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "allowanceOfferUsage"));
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
