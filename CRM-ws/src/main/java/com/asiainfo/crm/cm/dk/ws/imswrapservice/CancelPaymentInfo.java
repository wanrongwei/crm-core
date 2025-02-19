/**
 * CancelPaymentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class CancelPaymentInfo  implements java.io.Serializable {
    private java.lang.String orignSoNbr;

    private java.lang.String cancelDate;

    private java.lang.String remark;

    private java.lang.Short notification;

    public CancelPaymentInfo() {
    }

    public CancelPaymentInfo(
           java.lang.String orignSoNbr,
           java.lang.String cancelDate,
           java.lang.String remark,
           java.lang.Short notification) {
           this.orignSoNbr = orignSoNbr;
           this.cancelDate = cancelDate;
           this.remark = remark;
           this.notification = notification;
    }


    /**
     * Gets the orignSoNbr value for this CancelPaymentInfo.
     * 
     * @return orignSoNbr
     */
    public java.lang.String getOrignSoNbr() {
        return orignSoNbr;
    }


    /**
     * Sets the orignSoNbr value for this CancelPaymentInfo.
     * 
     * @param orignSoNbr
     */
    public void setOrignSoNbr(java.lang.String orignSoNbr) {
        this.orignSoNbr = orignSoNbr;
    }


    /**
     * Gets the cancelDate value for this CancelPaymentInfo.
     * 
     * @return cancelDate
     */
    public java.lang.String getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this CancelPaymentInfo.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.lang.String cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the remark value for this CancelPaymentInfo.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this CancelPaymentInfo.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the notification value for this CancelPaymentInfo.
     * 
     * @return notification
     */
    public java.lang.Short getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this CancelPaymentInfo.
     * 
     * @param notification
     */
    public void setNotification(java.lang.Short notification) {
        this.notification = notification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelPaymentInfo)) return false;
        CancelPaymentInfo other = (CancelPaymentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orignSoNbr==null && other.getOrignSoNbr()==null) || 
             (this.orignSoNbr!=null &&
              this.orignSoNbr.equals(other.getOrignSoNbr()))) &&
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification())));
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
        if (getOrignSoNbr() != null) {
            _hashCode += getOrignSoNbr().hashCode();
        }
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelPaymentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cancelPaymentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orignSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orignSoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
