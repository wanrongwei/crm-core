/**
 * SQueryBillExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryBillExt  implements java.io.Serializable {
    private java.lang.Long account_id;

    private java.lang.Long user_id;

    private java.lang.String start_date;

    private java.lang.String end_date;

    private java.lang.Integer sel_reguide_bill;

    private java.lang.Integer sel_owe_bill;

    private java.lang.Integer real_type;

    private java.lang.String invoiceNo;

    public SQueryBillExt() {
    }

    public SQueryBillExt(
           java.lang.Long account_id,
           java.lang.Long user_id,
           java.lang.String start_date,
           java.lang.String end_date,
           java.lang.Integer sel_reguide_bill,
           java.lang.Integer sel_owe_bill,
           java.lang.Integer real_type,
           java.lang.String invoiceNo) {
           this.account_id = account_id;
           this.user_id = user_id;
           this.start_date = start_date;
           this.end_date = end_date;
           this.sel_reguide_bill = sel_reguide_bill;
           this.sel_owe_bill = sel_owe_bill;
           this.real_type = real_type;
           this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the account_id value for this SQueryBillExt.
     * 
     * @return account_id
     */
    public java.lang.Long getAccount_id() {
        return account_id;
    }


    /**
     * Sets the account_id value for this SQueryBillExt.
     * 
     * @param account_id
     */
    public void setAccount_id(java.lang.Long account_id) {
        this.account_id = account_id;
    }


    /**
     * Gets the user_id value for this SQueryBillExt.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SQueryBillExt.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the start_date value for this SQueryBillExt.
     * 
     * @return start_date
     */
    public java.lang.String getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this SQueryBillExt.
     * 
     * @param start_date
     */
    public void setStart_date(java.lang.String start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this SQueryBillExt.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this SQueryBillExt.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the sel_reguide_bill value for this SQueryBillExt.
     * 
     * @return sel_reguide_bill
     */
    public java.lang.Integer getSel_reguide_bill() {
        return sel_reguide_bill;
    }


    /**
     * Sets the sel_reguide_bill value for this SQueryBillExt.
     * 
     * @param sel_reguide_bill
     */
    public void setSel_reguide_bill(java.lang.Integer sel_reguide_bill) {
        this.sel_reguide_bill = sel_reguide_bill;
    }


    /**
     * Gets the sel_owe_bill value for this SQueryBillExt.
     * 
     * @return sel_owe_bill
     */
    public java.lang.Integer getSel_owe_bill() {
        return sel_owe_bill;
    }


    /**
     * Sets the sel_owe_bill value for this SQueryBillExt.
     * 
     * @param sel_owe_bill
     */
    public void setSel_owe_bill(java.lang.Integer sel_owe_bill) {
        this.sel_owe_bill = sel_owe_bill;
    }


    /**
     * Gets the real_type value for this SQueryBillExt.
     * 
     * @return real_type
     */
    public java.lang.Integer getReal_type() {
        return real_type;
    }


    /**
     * Sets the real_type value for this SQueryBillExt.
     * 
     * @param real_type
     */
    public void setReal_type(java.lang.Integer real_type) {
        this.real_type = real_type;
    }


    /**
     * Gets the invoiceNo value for this SQueryBillExt.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this SQueryBillExt.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryBillExt)) return false;
        SQueryBillExt other = (SQueryBillExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account_id==null && other.getAccount_id()==null) || 
             (this.account_id!=null &&
              this.account_id.equals(other.getAccount_id()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.sel_reguide_bill==null && other.getSel_reguide_bill()==null) || 
             (this.sel_reguide_bill!=null &&
              this.sel_reguide_bill.equals(other.getSel_reguide_bill()))) &&
            ((this.sel_owe_bill==null && other.getSel_owe_bill()==null) || 
             (this.sel_owe_bill!=null &&
              this.sel_owe_bill.equals(other.getSel_owe_bill()))) &&
            ((this.real_type==null && other.getReal_type()==null) || 
             (this.real_type!=null &&
              this.real_type.equals(other.getReal_type()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo())));
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
        if (getAccount_id() != null) {
            _hashCode += getAccount_id().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getSel_reguide_bill() != null) {
            _hashCode += getSel_reguide_bill().hashCode();
        }
        if (getSel_owe_bill() != null) {
            _hashCode += getSel_owe_bill().hashCode();
        }
        if (getReal_type() != null) {
            _hashCode += getReal_type().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryBillExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryBillExt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sel_reguide_bill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sel_reguide_bill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sel_owe_bill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sel_owe_bill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("real_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "real_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
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
