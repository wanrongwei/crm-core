/**
 * BsBillFormatBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class BsBillFormatBean  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Integer billFormatId;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] paymentList;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] mailCodeList;

    private java.lang.Integer isDefault;

    private java.lang.Integer billingType;

    public BsBillFormatBean() {
    }

    public BsBillFormatBean(
           java.lang.String name,
           java.lang.Integer billFormatId,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] paymentList,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] mailCodeList,
           java.lang.Integer isDefault,
           java.lang.Integer billingType) {
           this.name = name;
           this.billFormatId = billFormatId;
           this.paymentList = paymentList;
           this.mailCodeList = mailCodeList;
           this.isDefault = isDefault;
           this.billingType = billingType;
    }


    /**
     * Gets the name value for this BsBillFormatBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BsBillFormatBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the billFormatId value for this BsBillFormatBean.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this BsBillFormatBean.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }


    /**
     * Gets the paymentList value for this BsBillFormatBean.
     * 
     * @return paymentList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] getPaymentList() {
        return paymentList;
    }


    /**
     * Sets the paymentList value for this BsBillFormatBean.
     * 
     * @param paymentList
     */
    public void setPaymentList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] paymentList) {
        this.paymentList = paymentList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue getPaymentList(int i) {
        return this.paymentList[i];
    }

    public void setPaymentList(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue _value) {
        this.paymentList[i] = _value;
    }


    /**
     * Gets the mailCodeList value for this BsBillFormatBean.
     * 
     * @return mailCodeList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] getMailCodeList() {
        return mailCodeList;
    }


    /**
     * Sets the mailCodeList value for this BsBillFormatBean.
     * 
     * @param mailCodeList
     */
    public void setMailCodeList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue[] mailCodeList) {
        this.mailCodeList = mailCodeList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue getMailCodeList(int i) {
        return this.mailCodeList[i];
    }

    public void setMailCodeList(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue _value) {
        this.mailCodeList[i] = _value;
    }


    /**
     * Gets the isDefault value for this BsBillFormatBean.
     * 
     * @return isDefault
     */
    public java.lang.Integer getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this BsBillFormatBean.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the billingType value for this BsBillFormatBean.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this BsBillFormatBean.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BsBillFormatBean)) return false;
        BsBillFormatBean other = (BsBillFormatBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId()))) &&
            ((this.paymentList==null && other.getPaymentList()==null) || 
             (this.paymentList!=null &&
              java.util.Arrays.equals(this.paymentList, other.getPaymentList()))) &&
            ((this.mailCodeList==null && other.getMailCodeList()==null) || 
             (this.mailCodeList!=null &&
              java.util.Arrays.equals(this.mailCodeList, other.getMailCodeList()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        if (getPaymentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMailCodeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMailCodeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMailCodeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BsBillFormatBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bsBillFormatBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
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
