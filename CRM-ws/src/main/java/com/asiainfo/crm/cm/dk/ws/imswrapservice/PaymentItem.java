/**
 * PaymentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class PaymentItem  implements java.io.Serializable {
    private java.lang.String invoiceNo;

    private java.lang.Long amount;

    private java.lang.Short sequence;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentServiceItem[] paymentServiceItemList;

    public PaymentItem() {
    }

    public PaymentItem(
           java.lang.String invoiceNo,
           java.lang.Long amount,
           java.lang.Short sequence,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentServiceItem[] paymentServiceItemList) {
           this.invoiceNo = invoiceNo;
           this.amount = amount;
           this.sequence = sequence;
           this.paymentServiceItemList = paymentServiceItemList;
    }


    /**
     * Gets the invoiceNo value for this PaymentItem.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this PaymentItem.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the amount value for this PaymentItem.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the sequence value for this PaymentItem.
     * 
     * @return sequence
     */
    public java.lang.Short getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PaymentItem.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.Short sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the paymentServiceItemList value for this PaymentItem.
     * 
     * @return paymentServiceItemList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentServiceItem[] getPaymentServiceItemList() {
        return paymentServiceItemList;
    }


    /**
     * Sets the paymentServiceItemList value for this PaymentItem.
     * 
     * @param paymentServiceItemList
     */
    public void setPaymentServiceItemList(com.asiainfo.crm.cm.dk.ws.imswrapservice.PaymentServiceItem[] paymentServiceItemList) {
        this.paymentServiceItemList = paymentServiceItemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentItem)) return false;
        PaymentItem other = (PaymentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.paymentServiceItemList==null && other.getPaymentServiceItemList()==null) || 
             (this.paymentServiceItemList!=null &&
              java.util.Arrays.equals(this.paymentServiceItemList, other.getPaymentServiceItemList())));
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
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getPaymentServiceItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentServiceItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentServiceItemList(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "paymentServiceItem"));
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
