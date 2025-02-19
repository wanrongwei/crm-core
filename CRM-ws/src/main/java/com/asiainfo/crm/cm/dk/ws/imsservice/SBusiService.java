/**
 * SBusiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SBusiService  implements java.io.Serializable {
    private java.lang.Integer serviceId;

    private java.lang.Short timeSegment;

    private java.lang.Short paymentMode;

    private java.lang.Short serviceStatus;

    private java.lang.Double threshold;

    private java.lang.String validDate;

    private java.lang.String createDate;

    private java.lang.String expireDate;

    private java.lang.Double remainingAmount;

    public SBusiService() {
    }

    public SBusiService(
           java.lang.Integer serviceId,
           java.lang.Short timeSegment,
           java.lang.Short paymentMode,
           java.lang.Short serviceStatus,
           java.lang.Double threshold,
           java.lang.String validDate,
           java.lang.String createDate,
           java.lang.String expireDate,
           java.lang.Double remainingAmount) {
           this.serviceId = serviceId;
           this.timeSegment = timeSegment;
           this.paymentMode = paymentMode;
           this.serviceStatus = serviceStatus;
           this.threshold = threshold;
           this.validDate = validDate;
           this.createDate = createDate;
           this.expireDate = expireDate;
           this.remainingAmount = remainingAmount;
    }


    /**
     * Gets the serviceId value for this SBusiService.
     * 
     * @return serviceId
     */
    public java.lang.Integer getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this SBusiService.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Integer serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the timeSegment value for this SBusiService.
     * 
     * @return timeSegment
     */
    public java.lang.Short getTimeSegment() {
        return timeSegment;
    }


    /**
     * Sets the timeSegment value for this SBusiService.
     * 
     * @param timeSegment
     */
    public void setTimeSegment(java.lang.Short timeSegment) {
        this.timeSegment = timeSegment;
    }


    /**
     * Gets the paymentMode value for this SBusiService.
     * 
     * @return paymentMode
     */
    public java.lang.Short getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this SBusiService.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.Short paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the serviceStatus value for this SBusiService.
     * 
     * @return serviceStatus
     */
    public java.lang.Short getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this SBusiService.
     * 
     * @param serviceStatus
     */
    public void setServiceStatus(java.lang.Short serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the threshold value for this SBusiService.
     * 
     * @return threshold
     */
    public java.lang.Double getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this SBusiService.
     * 
     * @param threshold
     */
    public void setThreshold(java.lang.Double threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the validDate value for this SBusiService.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SBusiService.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the createDate value for this SBusiService.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SBusiService.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the expireDate value for this SBusiService.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SBusiService.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the remainingAmount value for this SBusiService.
     * 
     * @return remainingAmount
     */
    public java.lang.Double getRemainingAmount() {
        return remainingAmount;
    }


    /**
     * Sets the remainingAmount value for this SBusiService.
     * 
     * @param remainingAmount
     */
    public void setRemainingAmount(java.lang.Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SBusiService)) return false;
        SBusiService other = (SBusiService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.timeSegment==null && other.getTimeSegment()==null) || 
             (this.timeSegment!=null &&
              this.timeSegment.equals(other.getTimeSegment()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.serviceStatus==null && other.getServiceStatus()==null) || 
             (this.serviceStatus!=null &&
              this.serviceStatus.equals(other.getServiceStatus()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.remainingAmount==null && other.getRemainingAmount()==null) || 
             (this.remainingAmount!=null &&
              this.remainingAmount.equals(other.getRemainingAmount())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getTimeSegment() != null) {
            _hashCode += getTimeSegment().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getServiceStatus() != null) {
            _hashCode += getServiceStatus().hashCode();
        }
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getRemainingAmount() != null) {
            _hashCode += getRemainingAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SBusiService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
