/**
 * DoQueryBillDetailReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryBillDetailReq  implements java.io.Serializable {
    private java.lang.Integer custClass;

    private java.lang.Short billingType;

    private java.lang.Short isDefault;

    private java.lang.Short paymentMethod;

    private java.lang.Short mailCode;

    private java.lang.Short isPrimary;

    private java.lang.Short isDepartment;

    private java.lang.Long acctId;

    public DoQueryBillDetailReq() {
    }

    public DoQueryBillDetailReq(
           java.lang.Integer custClass,
           java.lang.Short billingType,
           java.lang.Short isDefault,
           java.lang.Short paymentMethod,
           java.lang.Short mailCode,
           java.lang.Short isPrimary,
           java.lang.Short isDepartment,
           java.lang.Long acctId) {
           this.custClass = custClass;
           this.billingType = billingType;
           this.isDefault = isDefault;
           this.paymentMethod = paymentMethod;
           this.mailCode = mailCode;
           this.isPrimary = isPrimary;
           this.isDepartment = isDepartment;
           this.acctId = acctId;
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
     * Gets the paymentMethod value for this DoQueryBillDetailReq.
     * 
     * @return paymentMethod
     */
    public java.lang.Short getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this DoQueryBillDetailReq.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.Short paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the mailCode value for this DoQueryBillDetailReq.
     * 
     * @return mailCode
     */
    public java.lang.Short getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this DoQueryBillDetailReq.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Short mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the isPrimary value for this DoQueryBillDetailReq.
     * 
     * @return isPrimary
     */
    public java.lang.Short getIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this DoQueryBillDetailReq.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(java.lang.Short isPrimary) {
        this.isPrimary = isPrimary;
    }


    /**
     * Gets the isDepartment value for this DoQueryBillDetailReq.
     * 
     * @return isDepartment
     */
    public java.lang.Short getIsDepartment() {
        return isDepartment;
    }


    /**
     * Sets the isDepartment value for this DoQueryBillDetailReq.
     * 
     * @param isDepartment
     */
    public void setIsDepartment(java.lang.Short isDepartment) {
        this.isDepartment = isDepartment;
    }


    /**
     * Gets the acctId value for this DoQueryBillDetailReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoQueryBillDetailReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryBillDetailReq)) return false;
        DoQueryBillDetailReq other = (DoQueryBillDetailReq) obj;
        if (obj == null) return false;
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
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.isPrimary==null && other.getIsPrimary()==null) || 
             (this.isPrimary!=null &&
              this.isPrimary.equals(other.getIsPrimary()))) &&
            ((this.isDepartment==null && other.getIsDepartment()==null) || 
             (this.isDepartment!=null &&
              this.isDepartment.equals(other.getIsDepartment()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId())));
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
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getIsPrimary() != null) {
            _hashCode += getIsPrimary().hashCode();
        }
        if (getIsDepartment() != null) {
            _hashCode += getIsDepartment().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
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
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDepartment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDepartment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
