/**
 * OrderInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class OrderInformation  implements java.io.Serializable {
    private java.lang.String acquirerInfo;

    private java.lang.String amount;

    private java.lang.String currency;

    private java.lang.String deliveryDate;

    private java.lang.String fee;

    private java.lang.String orderDescription;

    private java.lang.String orderNumber;

    private java.util.Calendar timestamp;

    private java.lang.String total;

    private java.lang.String roundingAmount;

    public OrderInformation() {
    }

    public OrderInformation(
           java.lang.String acquirerInfo,
           java.lang.String amount,
           java.lang.String currency,
           java.lang.String deliveryDate,
           java.lang.String fee,
           java.lang.String orderDescription,
           java.lang.String orderNumber,
           java.util.Calendar timestamp,
           java.lang.String total,
           java.lang.String roundingAmount) {
           this.acquirerInfo = acquirerInfo;
           this.amount = amount;
           this.currency = currency;
           this.deliveryDate = deliveryDate;
           this.fee = fee;
           this.orderDescription = orderDescription;
           this.orderNumber = orderNumber;
           this.timestamp = timestamp;
           this.total = total;
           this.roundingAmount = roundingAmount;
    }


    /**
     * Gets the acquirerInfo value for this OrderInformation.
     * 
     * @return acquirerInfo
     */
    public java.lang.String getAcquirerInfo() {
        return acquirerInfo;
    }


    /**
     * Sets the acquirerInfo value for this OrderInformation.
     * 
     * @param acquirerInfo
     */
    public void setAcquirerInfo(java.lang.String acquirerInfo) {
        this.acquirerInfo = acquirerInfo;
    }


    /**
     * Gets the amount value for this OrderInformation.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OrderInformation.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this OrderInformation.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OrderInformation.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the deliveryDate value for this OrderInformation.
     * 
     * @return deliveryDate
     */
    public java.lang.String getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this OrderInformation.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.lang.String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the fee value for this OrderInformation.
     * 
     * @return fee
     */
    public java.lang.String getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this OrderInformation.
     * 
     * @param fee
     */
    public void setFee(java.lang.String fee) {
        this.fee = fee;
    }


    /**
     * Gets the orderDescription value for this OrderInformation.
     * 
     * @return orderDescription
     */
    public java.lang.String getOrderDescription() {
        return orderDescription;
    }


    /**
     * Sets the orderDescription value for this OrderInformation.
     * 
     * @param orderDescription
     */
    public void setOrderDescription(java.lang.String orderDescription) {
        this.orderDescription = orderDescription;
    }


    /**
     * Gets the orderNumber value for this OrderInformation.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this OrderInformation.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the timestamp value for this OrderInformation.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this OrderInformation.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the total value for this OrderInformation.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OrderInformation.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the roundingAmount value for this OrderInformation.
     * 
     * @return roundingAmount
     */
    public java.lang.String getRoundingAmount() {
        return roundingAmount;
    }


    /**
     * Sets the roundingAmount value for this OrderInformation.
     * 
     * @param roundingAmount
     */
    public void setRoundingAmount(java.lang.String roundingAmount) {
        this.roundingAmount = roundingAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderInformation)) return false;
        OrderInformation other = (OrderInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acquirerInfo==null && other.getAcquirerInfo()==null) || 
             (this.acquirerInfo!=null &&
              this.acquirerInfo.equals(other.getAcquirerInfo()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.orderDescription==null && other.getOrderDescription()==null) || 
             (this.orderDescription!=null &&
              this.orderDescription.equals(other.getOrderDescription()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.roundingAmount==null && other.getRoundingAmount()==null) || 
             (this.roundingAmount!=null &&
              this.roundingAmount.equals(other.getRoundingAmount())));
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
        if (getAcquirerInfo() != null) {
            _hashCode += getAcquirerInfo().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getOrderDescription() != null) {
            _hashCode += getOrderDescription().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getRoundingAmount() != null) {
            _hashCode += getRoundingAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcquirerInfo"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoundingAmount"));
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
