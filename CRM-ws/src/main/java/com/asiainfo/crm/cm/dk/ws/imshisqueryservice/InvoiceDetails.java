/**
 * InvoiceDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class InvoiceDetails  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String inoviceNo;

    private java.lang.String pastDue;

    private java.lang.String dueDate;

    public InvoiceDetails() {
    }

    public InvoiceDetails(
           java.lang.String status,
           java.lang.String inoviceNo,
           java.lang.String pastDue,
           java.lang.String dueDate) {
           this.status = status;
           this.inoviceNo = inoviceNo;
           this.pastDue = pastDue;
           this.dueDate = dueDate;
    }


    /**
     * Gets the status value for this InvoiceDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InvoiceDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the inoviceNo value for this InvoiceDetails.
     * 
     * @return inoviceNo
     */
    public java.lang.String getInoviceNo() {
        return inoviceNo;
    }


    /**
     * Sets the inoviceNo value for this InvoiceDetails.
     * 
     * @param inoviceNo
     */
    public void setInoviceNo(java.lang.String inoviceNo) {
        this.inoviceNo = inoviceNo;
    }


    /**
     * Gets the pastDue value for this InvoiceDetails.
     * 
     * @return pastDue
     */
    public java.lang.String getPastDue() {
        return pastDue;
    }


    /**
     * Sets the pastDue value for this InvoiceDetails.
     * 
     * @param pastDue
     */
    public void setPastDue(java.lang.String pastDue) {
        this.pastDue = pastDue;
    }


    /**
     * Gets the dueDate value for this InvoiceDetails.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InvoiceDetails.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceDetails)) return false;
        InvoiceDetails other = (InvoiceDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.inoviceNo==null && other.getInoviceNo()==null) || 
             (this.inoviceNo!=null &&
              this.inoviceNo.equals(other.getInoviceNo()))) &&
            ((this.pastDue==null && other.getPastDue()==null) || 
             (this.pastDue!=null &&
              this.pastDue.equals(other.getPastDue()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getInoviceNo() != null) {
            _hashCode += getInoviceNo().hashCode();
        }
        if (getPastDue() != null) {
            _hashCode += getPastDue().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inoviceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inoviceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pastDue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pastDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
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
