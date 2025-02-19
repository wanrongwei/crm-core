/**
 * RealTimeCallCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class RealTimeCallCharge  implements java.io.Serializable {
    private java.lang.Integer mainPromotion;

    private java.lang.String startDateTime;

    private java.lang.String endDateTime;

    private java.lang.Long totalCharge;

    private java.lang.Integer duration;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetail[] callDetailList;

    public RealTimeCallCharge() {
    }

    public RealTimeCallCharge(
           java.lang.Integer mainPromotion,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           java.lang.Long totalCharge,
           java.lang.Integer duration,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetail[] callDetailList) {
           this.mainPromotion = mainPromotion;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.totalCharge = totalCharge;
           this.duration = duration;
           this.callDetailList = callDetailList;
    }


    /**
     * Gets the mainPromotion value for this RealTimeCallCharge.
     * 
     * @return mainPromotion
     */
    public java.lang.Integer getMainPromotion() {
        return mainPromotion;
    }


    /**
     * Sets the mainPromotion value for this RealTimeCallCharge.
     * 
     * @param mainPromotion
     */
    public void setMainPromotion(java.lang.Integer mainPromotion) {
        this.mainPromotion = mainPromotion;
    }


    /**
     * Gets the startDateTime value for this RealTimeCallCharge.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this RealTimeCallCharge.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this RealTimeCallCharge.
     * 
     * @return endDateTime
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this RealTimeCallCharge.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the totalCharge value for this RealTimeCallCharge.
     * 
     * @return totalCharge
     */
    public java.lang.Long getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this RealTimeCallCharge.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.Long totalCharge) {
        this.totalCharge = totalCharge;
    }


    /**
     * Gets the duration value for this RealTimeCallCharge.
     * 
     * @return duration
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this RealTimeCallCharge.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the callDetailList value for this RealTimeCallCharge.
     * 
     * @return callDetailList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetail[] getCallDetailList() {
        return callDetailList;
    }


    /**
     * Sets the callDetailList value for this RealTimeCallCharge.
     * 
     * @param callDetailList
     */
    public void setCallDetailList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetail[] callDetailList) {
        this.callDetailList = callDetailList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RealTimeCallCharge)) return false;
        RealTimeCallCharge other = (RealTimeCallCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainPromotion==null && other.getMainPromotion()==null) || 
             (this.mainPromotion!=null &&
              this.mainPromotion.equals(other.getMainPromotion()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.callDetailList==null && other.getCallDetailList()==null) || 
             (this.callDetailList!=null &&
              java.util.Arrays.equals(this.callDetailList, other.getCallDetailList())));
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
        if (getMainPromotion() != null) {
            _hashCode += getMainPromotion().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getCallDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RealTimeCallCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "realTimeCallCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainPromotion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainPromotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDateTime"));
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
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "callDetailItem"));
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
