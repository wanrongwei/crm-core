/**
 * CallDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class CallDetail  implements java.io.Serializable {
    private int eventType;

    private int realTotalEventType;

    private int totalEventType;

    private int realDuration;

    private java.lang.Long totalChargeDomestic;

    private java.lang.Long totalChargeDomesticVat;

    private java.lang.Long totalChargeInternational;

    public CallDetail() {
    }

    public CallDetail(
           int eventType,
           int realTotalEventType,
           int totalEventType,
           int realDuration,
           java.lang.Long totalChargeDomestic,
           java.lang.Long totalChargeDomesticVat,
           java.lang.Long totalChargeInternational) {
           this.eventType = eventType;
           this.realTotalEventType = realTotalEventType;
           this.totalEventType = totalEventType;
           this.realDuration = realDuration;
           this.totalChargeDomestic = totalChargeDomestic;
           this.totalChargeDomesticVat = totalChargeDomesticVat;
           this.totalChargeInternational = totalChargeInternational;
    }


    /**
     * Gets the eventType value for this CallDetail.
     * 
     * @return eventType
     */
    public int getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this CallDetail.
     * 
     * @param eventType
     */
    public void setEventType(int eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the realTotalEventType value for this CallDetail.
     * 
     * @return realTotalEventType
     */
    public int getRealTotalEventType() {
        return realTotalEventType;
    }


    /**
     * Sets the realTotalEventType value for this CallDetail.
     * 
     * @param realTotalEventType
     */
    public void setRealTotalEventType(int realTotalEventType) {
        this.realTotalEventType = realTotalEventType;
    }


    /**
     * Gets the totalEventType value for this CallDetail.
     * 
     * @return totalEventType
     */
    public int getTotalEventType() {
        return totalEventType;
    }


    /**
     * Sets the totalEventType value for this CallDetail.
     * 
     * @param totalEventType
     */
    public void setTotalEventType(int totalEventType) {
        this.totalEventType = totalEventType;
    }


    /**
     * Gets the realDuration value for this CallDetail.
     * 
     * @return realDuration
     */
    public int getRealDuration() {
        return realDuration;
    }


    /**
     * Sets the realDuration value for this CallDetail.
     * 
     * @param realDuration
     */
    public void setRealDuration(int realDuration) {
        this.realDuration = realDuration;
    }


    /**
     * Gets the totalChargeDomestic value for this CallDetail.
     * 
     * @return totalChargeDomestic
     */
    public java.lang.Long getTotalChargeDomestic() {
        return totalChargeDomestic;
    }


    /**
     * Sets the totalChargeDomestic value for this CallDetail.
     * 
     * @param totalChargeDomestic
     */
    public void setTotalChargeDomestic(java.lang.Long totalChargeDomestic) {
        this.totalChargeDomestic = totalChargeDomestic;
    }


    /**
     * Gets the totalChargeDomesticVat value for this CallDetail.
     * 
     * @return totalChargeDomesticVat
     */
    public java.lang.Long getTotalChargeDomesticVat() {
        return totalChargeDomesticVat;
    }


    /**
     * Sets the totalChargeDomesticVat value for this CallDetail.
     * 
     * @param totalChargeDomesticVat
     */
    public void setTotalChargeDomesticVat(java.lang.Long totalChargeDomesticVat) {
        this.totalChargeDomesticVat = totalChargeDomesticVat;
    }


    /**
     * Gets the totalChargeInternational value for this CallDetail.
     * 
     * @return totalChargeInternational
     */
    public java.lang.Long getTotalChargeInternational() {
        return totalChargeInternational;
    }


    /**
     * Sets the totalChargeInternational value for this CallDetail.
     * 
     * @param totalChargeInternational
     */
    public void setTotalChargeInternational(java.lang.Long totalChargeInternational) {
        this.totalChargeInternational = totalChargeInternational;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetail)) return false;
        CallDetail other = (CallDetail) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventType == other.getEventType() &&
            this.realTotalEventType == other.getRealTotalEventType() &&
            this.totalEventType == other.getTotalEventType() &&
            this.realDuration == other.getRealDuration() &&
            ((this.totalChargeDomestic==null && other.getTotalChargeDomestic()==null) || 
             (this.totalChargeDomestic!=null &&
              this.totalChargeDomestic.equals(other.getTotalChargeDomestic()))) &&
            ((this.totalChargeDomesticVat==null && other.getTotalChargeDomesticVat()==null) || 
             (this.totalChargeDomesticVat!=null &&
              this.totalChargeDomesticVat.equals(other.getTotalChargeDomesticVat()))) &&
            ((this.totalChargeInternational==null && other.getTotalChargeInternational()==null) || 
             (this.totalChargeInternational!=null &&
              this.totalChargeInternational.equals(other.getTotalChargeInternational())));
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
        _hashCode += getEventType();
        _hashCode += getRealTotalEventType();
        _hashCode += getTotalEventType();
        _hashCode += getRealDuration();
        if (getTotalChargeDomestic() != null) {
            _hashCode += getTotalChargeDomestic().hashCode();
        }
        if (getTotalChargeDomesticVat() != null) {
            _hashCode += getTotalChargeDomesticVat().hashCode();
        }
        if (getTotalChargeInternational() != null) {
            _hashCode += getTotalChargeInternational().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realTotalEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realTotalEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalChargeDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalChargeDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalChargeDomesticVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalChargeDomesticVat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalChargeInternational");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalChargeInternational"));
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
