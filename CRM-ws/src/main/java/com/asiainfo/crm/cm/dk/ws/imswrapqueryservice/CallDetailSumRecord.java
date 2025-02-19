/**
 * CallDetailSumRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class CallDetailSumRecord  implements java.io.Serializable {
    private java.lang.Short queryCdrType;

    private java.lang.String dateOfEvent;

    private java.lang.String unit;

    private java.lang.String duration;

    private java.lang.Long totalCharge;

    private java.lang.Long preDiscount;

    public CallDetailSumRecord() {
    }

    public CallDetailSumRecord(
           java.lang.Short queryCdrType,
           java.lang.String dateOfEvent,
           java.lang.String unit,
           java.lang.String duration,
           java.lang.Long totalCharge,
           java.lang.Long preDiscount) {
           this.queryCdrType = queryCdrType;
           this.dateOfEvent = dateOfEvent;
           this.unit = unit;
           this.duration = duration;
           this.totalCharge = totalCharge;
           this.preDiscount = preDiscount;
    }


    /**
     * Gets the queryCdrType value for this CallDetailSumRecord.
     * 
     * @return queryCdrType
     */
    public java.lang.Short getQueryCdrType() {
        return queryCdrType;
    }


    /**
     * Sets the queryCdrType value for this CallDetailSumRecord.
     * 
     * @param queryCdrType
     */
    public void setQueryCdrType(java.lang.Short queryCdrType) {
        this.queryCdrType = queryCdrType;
    }


    /**
     * Gets the dateOfEvent value for this CallDetailSumRecord.
     * 
     * @return dateOfEvent
     */
    public java.lang.String getDateOfEvent() {
        return dateOfEvent;
    }


    /**
     * Sets the dateOfEvent value for this CallDetailSumRecord.
     * 
     * @param dateOfEvent
     */
    public void setDateOfEvent(java.lang.String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }


    /**
     * Gets the unit value for this CallDetailSumRecord.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this CallDetailSumRecord.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the duration value for this CallDetailSumRecord.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this CallDetailSumRecord.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the totalCharge value for this CallDetailSumRecord.
     * 
     * @return totalCharge
     */
    public java.lang.Long getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this CallDetailSumRecord.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.Long totalCharge) {
        this.totalCharge = totalCharge;
    }


    /**
     * Gets the preDiscount value for this CallDetailSumRecord.
     * 
     * @return preDiscount
     */
    public java.lang.Long getPreDiscount() {
        return preDiscount;
    }


    /**
     * Sets the preDiscount value for this CallDetailSumRecord.
     * 
     * @param preDiscount
     */
    public void setPreDiscount(java.lang.Long preDiscount) {
        this.preDiscount = preDiscount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailSumRecord)) return false;
        CallDetailSumRecord other = (CallDetailSumRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryCdrType==null && other.getQueryCdrType()==null) || 
             (this.queryCdrType!=null &&
              this.queryCdrType.equals(other.getQueryCdrType()))) &&
            ((this.dateOfEvent==null && other.getDateOfEvent()==null) || 
             (this.dateOfEvent!=null &&
              this.dateOfEvent.equals(other.getDateOfEvent()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge()))) &&
            ((this.preDiscount==null && other.getPreDiscount()==null) || 
             (this.preDiscount!=null &&
              this.preDiscount.equals(other.getPreDiscount())));
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
        if (getQueryCdrType() != null) {
            _hashCode += getQueryCdrType().hashCode();
        }
        if (getDateOfEvent() != null) {
            _hashCode += getDateOfEvent().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        if (getPreDiscount() != null) {
            _hashCode += getPreDiscount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailSumRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailSumRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryCdrType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryCdrType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preDiscount"));
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
