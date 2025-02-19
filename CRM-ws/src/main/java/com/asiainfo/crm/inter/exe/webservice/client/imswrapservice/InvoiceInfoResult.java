/**
 * InvoiceInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class InvoiceInfoResult  implements java.io.Serializable {
    private java.lang.String acct_id;

    private java.lang.String billing_name;

    private java.lang.String invoice_no;

    private java.util.Calendar bill_start_date;

    private java.util.Calendar bill_end_date;

    private java.util.Calendar payment_due_date;

    private java.lang.Long bill_amount;

    public InvoiceInfoResult() {
    }

    public InvoiceInfoResult(
           java.lang.String acct_id,
           java.lang.String billing_name,
           java.lang.String invoice_no,
           java.util.Calendar bill_start_date,
           java.util.Calendar bill_end_date,
           java.util.Calendar payment_due_date,
           java.lang.Long bill_amount) {
           this.acct_id = acct_id;
           this.billing_name = billing_name;
           this.invoice_no = invoice_no;
           this.bill_start_date = bill_start_date;
           this.bill_end_date = bill_end_date;
           this.payment_due_date = payment_due_date;
           this.bill_amount = bill_amount;
    }


    /**
     * Gets the acct_id value for this InvoiceInfoResult.
     * 
     * @return acct_id
     */
    public java.lang.String getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this InvoiceInfoResult.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.String acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the billing_name value for this InvoiceInfoResult.
     * 
     * @return billing_name
     */
    public java.lang.String getBilling_name() {
        return billing_name;
    }


    /**
     * Sets the billing_name value for this InvoiceInfoResult.
     * 
     * @param billing_name
     */
    public void setBilling_name(java.lang.String billing_name) {
        this.billing_name = billing_name;
    }


    /**
     * Gets the invoice_no value for this InvoiceInfoResult.
     * 
     * @return invoice_no
     */
    public java.lang.String getInvoice_no() {
        return invoice_no;
    }


    /**
     * Sets the invoice_no value for this InvoiceInfoResult.
     * 
     * @param invoice_no
     */
    public void setInvoice_no(java.lang.String invoice_no) {
        this.invoice_no = invoice_no;
    }


    /**
     * Gets the bill_start_date value for this InvoiceInfoResult.
     * 
     * @return bill_start_date
     */
    public java.util.Calendar getBill_start_date() {
        return bill_start_date;
    }


    /**
     * Sets the bill_start_date value for this InvoiceInfoResult.
     * 
     * @param bill_start_date
     */
    public void setBill_start_date(java.util.Calendar bill_start_date) {
        this.bill_start_date = bill_start_date;
    }


    /**
     * Gets the bill_end_date value for this InvoiceInfoResult.
     * 
     * @return bill_end_date
     */
    public java.util.Calendar getBill_end_date() {
        return bill_end_date;
    }


    /**
     * Sets the bill_end_date value for this InvoiceInfoResult.
     * 
     * @param bill_end_date
     */
    public void setBill_end_date(java.util.Calendar bill_end_date) {
        this.bill_end_date = bill_end_date;
    }


    /**
     * Gets the payment_due_date value for this InvoiceInfoResult.
     * 
     * @return payment_due_date
     */
    public java.util.Calendar getPayment_due_date() {
        return payment_due_date;
    }


    /**
     * Sets the payment_due_date value for this InvoiceInfoResult.
     * 
     * @param payment_due_date
     */
    public void setPayment_due_date(java.util.Calendar payment_due_date) {
        this.payment_due_date = payment_due_date;
    }


    /**
     * Gets the bill_amount value for this InvoiceInfoResult.
     * 
     * @return bill_amount
     */
    public java.lang.Long getBill_amount() {
        return bill_amount;
    }


    /**
     * Sets the bill_amount value for this InvoiceInfoResult.
     * 
     * @param bill_amount
     */
    public void setBill_amount(java.lang.Long bill_amount) {
        this.bill_amount = bill_amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceInfoResult)) return false;
        InvoiceInfoResult other = (InvoiceInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.billing_name==null && other.getBilling_name()==null) || 
             (this.billing_name!=null &&
              this.billing_name.equals(other.getBilling_name()))) &&
            ((this.invoice_no==null && other.getInvoice_no()==null) || 
             (this.invoice_no!=null &&
              this.invoice_no.equals(other.getInvoice_no()))) &&
            ((this.bill_start_date==null && other.getBill_start_date()==null) || 
             (this.bill_start_date!=null &&
              this.bill_start_date.equals(other.getBill_start_date()))) &&
            ((this.bill_end_date==null && other.getBill_end_date()==null) || 
             (this.bill_end_date!=null &&
              this.bill_end_date.equals(other.getBill_end_date()))) &&
            ((this.payment_due_date==null && other.getPayment_due_date()==null) || 
             (this.payment_due_date!=null &&
              this.payment_due_date.equals(other.getPayment_due_date()))) &&
            ((this.bill_amount==null && other.getBill_amount()==null) || 
             (this.bill_amount!=null &&
              this.bill_amount.equals(other.getBill_amount())));
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
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getBilling_name() != null) {
            _hashCode += getBilling_name().hashCode();
        }
        if (getInvoice_no() != null) {
            _hashCode += getInvoice_no().hashCode();
        }
        if (getBill_start_date() != null) {
            _hashCode += getBill_start_date().hashCode();
        }
        if (getBill_end_date() != null) {
            _hashCode += getBill_end_date().hashCode();
        }
        if (getPayment_due_date() != null) {
            _hashCode += getPayment_due_date().hashCode();
        }
        if (getBill_amount() != null) {
            _hashCode += getBill_amount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bill_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bill_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_due_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_due_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bill_amount"));
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
