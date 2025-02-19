/**
 * DoQueryBillDetailReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryBillDetailReq  implements java.io.Serializable {
    private java.lang.Integer custClass;

    private java.lang.Short billingType;

    private java.lang.Short isDefault;

    private java.lang.Integer billFormatId;

    public DoQueryBillDetailReq() {
    }

    public DoQueryBillDetailReq(
           java.lang.Integer custClass,
           java.lang.Short billingType,
           java.lang.Short isDefault,
           java.lang.Integer billFormatId) {
           this.custClass = custClass;
           this.billingType = billingType;
           this.isDefault = isDefault;
           this.billFormatId = billFormatId;
    }


    /**
     * Gets the custClass value for this DoQueryBillDetailReq.
     * 
     * @return custClass
     */
    public java.lang.Integer getCustClass() {
        return custClass;
    }


    /**
     * Sets the custClass value for this DoQueryBillDetailReq.
     * 
     * @param custClass
     */
    public void setCustClass(java.lang.Integer custClass) {
        this.custClass = custClass;
    }


    /**
     * Gets the billingType value for this DoQueryBillDetailReq.
     * 
     * @return billingType
     */
    public java.lang.Short getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this DoQueryBillDetailReq.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Short billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the isDefault value for this DoQueryBillDetailReq.
     * 
     * @return isDefault
     */
    public java.lang.Short getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this DoQueryBillDetailReq.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Short isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the billFormatId value for this DoQueryBillDetailReq.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this DoQueryBillDetailReq.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryBillDetailReq)) return false;
        DoQueryBillDetailReq other = (DoQueryBillDetailReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custClass==null && other.getCustClass()==null) || 
             (this.custClass!=null &&
              this.custClass.equals(other.getCustClass()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId())));
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
        if (getCustClass() != null) {
            _hashCode += getCustClass().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryBillDetailReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillDetailReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
