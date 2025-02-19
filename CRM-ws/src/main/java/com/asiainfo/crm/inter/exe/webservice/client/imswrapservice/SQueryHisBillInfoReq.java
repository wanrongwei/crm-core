/**
 * SQueryHisBillInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SQueryHisBillInfoReq  implements java.io.Serializable {
    private java.lang.Short invoiceNoType;

    private java.lang.Long billlingPlanId;

    private java.lang.Integer formatType;

    private java.lang.Short taxType;

    private java.lang.Short prodType;

    private java.lang.Short carryOverType;

    public SQueryHisBillInfoReq() {
    }

    public SQueryHisBillInfoReq(
           java.lang.Short invoiceNoType,
           java.lang.Long billlingPlanId,
           java.lang.Integer formatType,
           java.lang.Short taxType,
           java.lang.Short prodType,
           java.lang.Short carryOverType) {
           this.invoiceNoType = invoiceNoType;
           this.billlingPlanId = billlingPlanId;
           this.formatType = formatType;
           this.taxType = taxType;
           this.prodType = prodType;
           this.carryOverType = carryOverType;
    }


    /**
     * Gets the invoiceNoType value for this SQueryHisBillInfoReq.
     * 
     * @return invoiceNoType
     */
    public java.lang.Short getInvoiceNoType() {
        return invoiceNoType;
    }


    /**
     * Sets the invoiceNoType value for this SQueryHisBillInfoReq.
     * 
     * @param invoiceNoType
     */
    public void setInvoiceNoType(java.lang.Short invoiceNoType) {
        this.invoiceNoType = invoiceNoType;
    }


    /**
     * Gets the billlingPlanId value for this SQueryHisBillInfoReq.
     * 
     * @return billlingPlanId
     */
    public java.lang.Long getBilllingPlanId() {
        return billlingPlanId;
    }


    /**
     * Sets the billlingPlanId value for this SQueryHisBillInfoReq.
     * 
     * @param billlingPlanId
     */
    public void setBilllingPlanId(java.lang.Long billlingPlanId) {
        this.billlingPlanId = billlingPlanId;
    }


    /**
     * Gets the formatType value for this SQueryHisBillInfoReq.
     * 
     * @return formatType
     */
    public java.lang.Integer getFormatType() {
        return formatType;
    }


    /**
     * Sets the formatType value for this SQueryHisBillInfoReq.
     * 
     * @param formatType
     */
    public void setFormatType(java.lang.Integer formatType) {
        this.formatType = formatType;
    }


    /**
     * Gets the taxType value for this SQueryHisBillInfoReq.
     * 
     * @return taxType
     */
    public java.lang.Short getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this SQueryHisBillInfoReq.
     * 
     * @param taxType
     */
    public void setTaxType(java.lang.Short taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the prodType value for this SQueryHisBillInfoReq.
     * 
     * @return prodType
     */
    public java.lang.Short getProdType() {
        return prodType;
    }


    /**
     * Sets the prodType value for this SQueryHisBillInfoReq.
     * 
     * @param prodType
     */
    public void setProdType(java.lang.Short prodType) {
        this.prodType = prodType;
    }


    /**
     * Gets the carryOverType value for this SQueryHisBillInfoReq.
     * 
     * @return carryOverType
     */
    public java.lang.Short getCarryOverType() {
        return carryOverType;
    }


    /**
     * Sets the carryOverType value for this SQueryHisBillInfoReq.
     * 
     * @param carryOverType
     */
    public void setCarryOverType(java.lang.Short carryOverType) {
        this.carryOverType = carryOverType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryHisBillInfoReq)) return false;
        SQueryHisBillInfoReq other = (SQueryHisBillInfoReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceNoType==null && other.getInvoiceNoType()==null) || 
             (this.invoiceNoType!=null &&
              this.invoiceNoType.equals(other.getInvoiceNoType()))) &&
            ((this.billlingPlanId==null && other.getBilllingPlanId()==null) || 
             (this.billlingPlanId!=null &&
              this.billlingPlanId.equals(other.getBilllingPlanId()))) &&
            ((this.formatType==null && other.getFormatType()==null) || 
             (this.formatType!=null &&
              this.formatType.equals(other.getFormatType()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.prodType==null && other.getProdType()==null) || 
             (this.prodType!=null &&
              this.prodType.equals(other.getProdType()))) &&
            ((this.carryOverType==null && other.getCarryOverType()==null) || 
             (this.carryOverType!=null &&
              this.carryOverType.equals(other.getCarryOverType())));
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
        if (getInvoiceNoType() != null) {
            _hashCode += getInvoiceNoType().hashCode();
        }
        if (getBilllingPlanId() != null) {
            _hashCode += getBilllingPlanId().hashCode();
        }
        if (getFormatType() != null) {
            _hashCode += getFormatType().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getProdType() != null) {
            _hashCode += getProdType().hashCode();
        }
        if (getCarryOverType() != null) {
            _hashCode += getCarryOverType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryHisBillInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryHisBillInfoReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNoType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billlingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billlingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carryOverType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carryOverType"));
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
