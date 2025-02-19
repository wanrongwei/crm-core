/**
 * DoQueryAmountResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryAmountResp  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long custId;

    private java.lang.String custName;

    private java.lang.String payerName;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountBo billAmountBo;

    public DoQueryAmountResp() {
    }

    public DoQueryAmountResp(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Long custId,
           java.lang.String custName,
           java.lang.String payerName,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountBo billAmountBo) {
        super(
            responseHead);
        this.custId = custId;
        this.custName = custName;
        this.payerName = payerName;
        this.billAmountBo = billAmountBo;
    }


    /**
     * Gets the custId value for this DoQueryAmountResp.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this DoQueryAmountResp.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the custName value for this DoQueryAmountResp.
     * 
     * @return custName
     */
    public java.lang.String getCustName() {
        return custName;
    }


    /**
     * Sets the custName value for this DoQueryAmountResp.
     * 
     * @param custName
     */
    public void setCustName(java.lang.String custName) {
        this.custName = custName;
    }


    /**
     * Gets the payerName value for this DoQueryAmountResp.
     * 
     * @return payerName
     */
    public java.lang.String getPayerName() {
        return payerName;
    }


    /**
     * Sets the payerName value for this DoQueryAmountResp.
     * 
     * @param payerName
     */
    public void setPayerName(java.lang.String payerName) {
        this.payerName = payerName;
    }


    /**
     * Gets the billAmountBo value for this DoQueryAmountResp.
     * 
     * @return billAmountBo
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountBo getBillAmountBo() {
        return billAmountBo;
    }


    /**
     * Sets the billAmountBo value for this DoQueryAmountResp.
     * 
     * @param billAmountBo
     */
    public void setBillAmountBo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountBo billAmountBo) {
        this.billAmountBo = billAmountBo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAmountResp)) return false;
        DoQueryAmountResp other = (DoQueryAmountResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.custName==null && other.getCustName()==null) || 
             (this.custName!=null &&
              this.custName.equals(other.getCustName()))) &&
            ((this.payerName==null && other.getPayerName()==null) || 
             (this.payerName!=null &&
              this.payerName.equals(other.getPayerName()))) &&
            ((this.billAmountBo==null && other.getBillAmountBo()==null) || 
             (this.billAmountBo!=null &&
              this.billAmountBo.equals(other.getBillAmountBo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getCustName() != null) {
            _hashCode += getCustName().hashCode();
        }
        if (getPayerName() != null) {
            _hashCode += getPayerName().hashCode();
        }
        if (getBillAmountBo() != null) {
            _hashCode += getBillAmountBo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryAmountResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAmountResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAmountBo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billAmountBo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billAmountBo"));
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
