/**
 * SQueryInvoiceBillReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryInvoiceBillReq  implements java.io.Serializable {
    private java.lang.String invoiceNo;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Integer billMonth;

    private java.lang.Boolean selBill;

    private java.lang.Boolean selItem;

    private java.lang.Boolean selProd;

    private java.lang.Boolean selBillInvoice;

    public SQueryInvoiceBillReq() {
    }

    public SQueryInvoiceBillReq(
           java.lang.String invoiceNo,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Integer billMonth,
           java.lang.Boolean selBill,
           java.lang.Boolean selItem,
           java.lang.Boolean selProd,
           java.lang.Boolean selBillInvoice) {
           this.invoiceNo = invoiceNo;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.billMonth = billMonth;
           this.selBill = selBill;
           this.selItem = selItem;
           this.selProd = selProd;
           this.selBillInvoice = selBillInvoice;
    }


    /**
     * Gets the invoiceNo value for this SQueryInvoiceBillReq.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this SQueryInvoiceBillReq.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the acctId value for this SQueryInvoiceBillReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryInvoiceBillReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this SQueryInvoiceBillReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SQueryInvoiceBillReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the billMonth value for this SQueryInvoiceBillReq.
     * 
     * @return billMonth
     */
    public java.lang.Integer getBillMonth() {
        return billMonth;
    }


    /**
     * Sets the billMonth value for this SQueryInvoiceBillReq.
     * 
     * @param billMonth
     */
    public void setBillMonth(java.lang.Integer billMonth) {
        this.billMonth = billMonth;
    }


    /**
     * Gets the selBill value for this SQueryInvoiceBillReq.
     * 
     * @return selBill
     */
    public java.lang.Boolean getSelBill() {
        return selBill;
    }


    /**
     * Sets the selBill value for this SQueryInvoiceBillReq.
     * 
     * @param selBill
     */
    public void setSelBill(java.lang.Boolean selBill) {
        this.selBill = selBill;
    }


    /**
     * Gets the selItem value for this SQueryInvoiceBillReq.
     * 
     * @return selItem
     */
    public java.lang.Boolean getSelItem() {
        return selItem;
    }


    /**
     * Sets the selItem value for this SQueryInvoiceBillReq.
     * 
     * @param selItem
     */
    public void setSelItem(java.lang.Boolean selItem) {
        this.selItem = selItem;
    }


    /**
     * Gets the selProd value for this SQueryInvoiceBillReq.
     * 
     * @return selProd
     */
    public java.lang.Boolean getSelProd() {
        return selProd;
    }


    /**
     * Sets the selProd value for this SQueryInvoiceBillReq.
     * 
     * @param selProd
     */
    public void setSelProd(java.lang.Boolean selProd) {
        this.selProd = selProd;
    }


    /**
     * Gets the selBillInvoice value for this SQueryInvoiceBillReq.
     * 
     * @return selBillInvoice
     */
    public java.lang.Boolean getSelBillInvoice() {
        return selBillInvoice;
    }


    /**
     * Sets the selBillInvoice value for this SQueryInvoiceBillReq.
     * 
     * @param selBillInvoice
     */
    public void setSelBillInvoice(java.lang.Boolean selBillInvoice) {
        this.selBillInvoice = selBillInvoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryInvoiceBillReq)) return false;
        SQueryInvoiceBillReq other = (SQueryInvoiceBillReq) obj;
        
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
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.billMonth==null && other.getBillMonth()==null) || 
             (this.billMonth!=null &&
              this.billMonth.equals(other.getBillMonth()))) &&
            ((this.selBill==null && other.getSelBill()==null) || 
             (this.selBill!=null &&
              this.selBill.equals(other.getSelBill()))) &&
            ((this.selItem==null && other.getSelItem()==null) || 
             (this.selItem!=null &&
              this.selItem.equals(other.getSelItem()))) &&
            ((this.selProd==null && other.getSelProd()==null) || 
             (this.selProd!=null &&
              this.selProd.equals(other.getSelProd()))) &&
            ((this.selBillInvoice==null && other.getSelBillInvoice()==null) || 
             (this.selBillInvoice!=null &&
              this.selBillInvoice.equals(other.getSelBillInvoice())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getBillMonth() != null) {
            _hashCode += getBillMonth().hashCode();
        }
        if (getSelBill() != null) {
            _hashCode += getSelBill().hashCode();
        }
        if (getSelItem() != null) {
            _hashCode += getSelItem().hashCode();
        }
        if (getSelProd() != null) {
            _hashCode += getSelProd().hashCode();
        }
        if (getSelBillInvoice() != null) {
            _hashCode += getSelBillInvoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryInvoiceBillReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryInvoiceBillReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selBill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selProd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selBillInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selBillInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
