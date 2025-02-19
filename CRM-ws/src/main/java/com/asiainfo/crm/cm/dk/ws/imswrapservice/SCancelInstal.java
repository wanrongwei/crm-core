/**
 * SCancelInstal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SCancelInstal  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long phoneId;

    private java.lang.Long instalId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.Integer cancleCode;

    private java.util.Calendar createDate;

    public SCancelInstal() {
    }

    public SCancelInstal(
           java.lang.Long acctId,
           java.lang.Long phoneId,
           java.lang.Long instalId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.Integer cancleCode,
           java.util.Calendar createDate) {
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.instalId = instalId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.cancleCode = cancleCode;
           this.createDate = createDate;
    }


    /**
     * Gets the acctId value for this SCancelInstal.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SCancelInstal.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this SCancelInstal.
     * 
     * @return phoneId
     */
    public java.lang.Long getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SCancelInstal.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.Long phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the instalId value for this SCancelInstal.
     * 
     * @return instalId
     */
    public java.lang.Long getInstalId() {
        return instalId;
    }


    /**
     * Sets the instalId value for this SCancelInstal.
     * 
     * @param instalId
     */
    public void setInstalId(java.lang.Long instalId) {
        this.instalId = instalId;
    }


    /**
     * Gets the orderId value for this SCancelInstal.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SCancelInstal.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SCancelInstal.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SCancelInstal.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the cancleCode value for this SCancelInstal.
     * 
     * @return cancleCode
     */
    public java.lang.Integer getCancleCode() {
        return cancleCode;
    }


    /**
     * Sets the cancleCode value for this SCancelInstal.
     * 
     * @param cancleCode
     */
    public void setCancleCode(java.lang.Integer cancleCode) {
        this.cancleCode = cancleCode;
    }


    /**
     * Gets the createDate value for this SCancelInstal.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SCancelInstal.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCancelInstal)) return false;
        SCancelInstal other = (SCancelInstal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.instalId==null && other.getInstalId()==null) || 
             (this.instalId!=null &&
              this.instalId.equals(other.getInstalId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.cancleCode==null && other.getCancleCode()==null) || 
             (this.cancleCode!=null &&
              this.cancleCode.equals(other.getCancleCode()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getInstalId() != null) {
            _hashCode += getInstalId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getCancleCode() != null) {
            _hashCode += getCancleCode().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCancelInstal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelInstal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
