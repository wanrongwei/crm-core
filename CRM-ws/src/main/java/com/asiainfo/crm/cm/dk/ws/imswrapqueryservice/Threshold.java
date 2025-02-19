/**
 * Threshold.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class Threshold  implements java.io.Serializable {
    private java.lang.Double threshold;

    private java.lang.Short thresholdPercentage;

    private java.lang.Short thresholdType;

    private java.lang.Short notifyType;

    private java.lang.String notifyAddr;

    private java.lang.String notifyPhoneId;

    public Threshold() {
    }

    public Threshold(
           java.lang.Double threshold,
           java.lang.Short thresholdPercentage,
           java.lang.Short thresholdType,
           java.lang.Short notifyType,
           java.lang.String notifyAddr,
           java.lang.String notifyPhoneId) {
           this.threshold = threshold;
           this.thresholdPercentage = thresholdPercentage;
           this.thresholdType = thresholdType;
           this.notifyType = notifyType;
           this.notifyAddr = notifyAddr;
           this.notifyPhoneId = notifyPhoneId;
    }


    /**
     * Gets the threshold value for this Threshold.
     * 
     * @return threshold
     */
    public java.lang.Double getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this Threshold.
     * 
     * @param threshold
     */
    public void setThreshold(java.lang.Double threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the thresholdPercentage value for this Threshold.
     * 
     * @return thresholdPercentage
     */
    public java.lang.Short getThresholdPercentage() {
        return thresholdPercentage;
    }


    /**
     * Sets the thresholdPercentage value for this Threshold.
     * 
     * @param thresholdPercentage
     */
    public void setThresholdPercentage(java.lang.Short thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }


    /**
     * Gets the thresholdType value for this Threshold.
     * 
     * @return thresholdType
     */
    public java.lang.Short getThresholdType() {
        return thresholdType;
    }


    /**
     * Sets the thresholdType value for this Threshold.
     * 
     * @param thresholdType
     */
    public void setThresholdType(java.lang.Short thresholdType) {
        this.thresholdType = thresholdType;
    }


    /**
     * Gets the notifyType value for this Threshold.
     * 
     * @return notifyType
     */
    public java.lang.Short getNotifyType() {
        return notifyType;
    }


    /**
     * Sets the notifyType value for this Threshold.
     * 
     * @param notifyType
     */
    public void setNotifyType(java.lang.Short notifyType) {
        this.notifyType = notifyType;
    }


    /**
     * Gets the notifyAddr value for this Threshold.
     * 
     * @return notifyAddr
     */
    public java.lang.String getNotifyAddr() {
        return notifyAddr;
    }


    /**
     * Sets the notifyAddr value for this Threshold.
     * 
     * @param notifyAddr
     */
    public void setNotifyAddr(java.lang.String notifyAddr) {
        this.notifyAddr = notifyAddr;
    }


    /**
     * Gets the notifyPhoneId value for this Threshold.
     * 
     * @return notifyPhoneId
     */
    public java.lang.String getNotifyPhoneId() {
        return notifyPhoneId;
    }


    /**
     * Sets the notifyPhoneId value for this Threshold.
     * 
     * @param notifyPhoneId
     */
    public void setNotifyPhoneId(java.lang.String notifyPhoneId) {
        this.notifyPhoneId = notifyPhoneId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Threshold)) return false;
        Threshold other = (Threshold) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.thresholdPercentage==null && other.getThresholdPercentage()==null) || 
             (this.thresholdPercentage!=null &&
              this.thresholdPercentage.equals(other.getThresholdPercentage()))) &&
            ((this.thresholdType==null && other.getThresholdType()==null) || 
             (this.thresholdType!=null &&
              this.thresholdType.equals(other.getThresholdType()))) &&
            ((this.notifyType==null && other.getNotifyType()==null) || 
             (this.notifyType!=null &&
              this.notifyType.equals(other.getNotifyType()))) &&
            ((this.notifyAddr==null && other.getNotifyAddr()==null) || 
             (this.notifyAddr!=null &&
              this.notifyAddr.equals(other.getNotifyAddr()))) &&
            ((this.notifyPhoneId==null && other.getNotifyPhoneId()==null) || 
             (this.notifyPhoneId!=null &&
              this.notifyPhoneId.equals(other.getNotifyPhoneId())));
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
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getThresholdPercentage() != null) {
            _hashCode += getThresholdPercentage().hashCode();
        }
        if (getThresholdType() != null) {
            _hashCode += getThresholdType().hashCode();
        }
        if (getNotifyType() != null) {
            _hashCode += getNotifyType().hashCode();
        }
        if (getNotifyAddr() != null) {
            _hashCode += getNotifyAddr().hashCode();
        }
        if (getNotifyPhoneId() != null) {
            _hashCode += getNotifyPhoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Threshold.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyPhoneId"));
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
