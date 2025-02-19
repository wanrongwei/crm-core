/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class Order  implements java.io.Serializable {
    private java.lang.String orderNumber;

    private java.lang.String currencyCode;

    private java.lang.String amount;

    private java.lang.String force3DSecure;

    private java.lang.String updateStoredPaymentInfo;

    private java.lang.String deliveryDate;

    public Order() {
    }

    public Order(
           java.lang.String orderNumber,
           java.lang.String currencyCode,
           java.lang.String amount,
           java.lang.String force3DSecure,
           java.lang.String updateStoredPaymentInfo,
           java.lang.String deliveryDate) {
           this.orderNumber = orderNumber;
           this.currencyCode = currencyCode;
           this.amount = amount;
           this.force3DSecure = force3DSecure;
           this.updateStoredPaymentInfo = updateStoredPaymentInfo;
           this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the orderNumber value for this Order.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Order.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the currencyCode value for this Order.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Order.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the amount value for this Order.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Order.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the force3DSecure value for this Order.
     * 
     * @return force3DSecure
     */
    public java.lang.String getForce3DSecure() {
        return force3DSecure;
    }


    /**
     * Sets the force3DSecure value for this Order.
     * 
     * @param force3DSecure
     */
    public void setForce3DSecure(java.lang.String force3DSecure) {
        this.force3DSecure = force3DSecure;
    }


    /**
     * Gets the updateStoredPaymentInfo value for this Order.
     * 
     * @return updateStoredPaymentInfo
     */
    public java.lang.String getUpdateStoredPaymentInfo() {
        return updateStoredPaymentInfo;
    }


    /**
     * Sets the updateStoredPaymentInfo value for this Order.
     * 
     * @param updateStoredPaymentInfo
     */
    public void setUpdateStoredPaymentInfo(java.lang.String updateStoredPaymentInfo) {
        this.updateStoredPaymentInfo = updateStoredPaymentInfo;
    }


    /**
     * Gets the deliveryDate value for this Order.
     * 
     * @return deliveryDate
     */
    public java.lang.String getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this Order.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.lang.String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.force3DSecure==null && other.getForce3DSecure()==null) || 
             (this.force3DSecure!=null &&
              this.force3DSecure.equals(other.getForce3DSecure()))) &&
            ((this.updateStoredPaymentInfo==null && other.getUpdateStoredPaymentInfo()==null) || 
             (this.updateStoredPaymentInfo!=null &&
              this.updateStoredPaymentInfo.equals(other.getUpdateStoredPaymentInfo()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate())));
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
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getForce3DSecure() != null) {
            _hashCode += getForce3DSecure().hashCode();
        }
        if (getUpdateStoredPaymentInfo() != null) {
            _hashCode += getUpdateStoredPaymentInfo().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("force3DSecure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Force3DSecure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateStoredPaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateStoredPaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryDate"));
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
