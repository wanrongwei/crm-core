/**
 * SPayInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SPayInfo  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo[] orderPayList;

    private java.lang.String shoppingId;

    private java.util.Calendar shoppingDate;

    private java.lang.Short paymentStatus;

    private java.lang.Integer retailInvoiceType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBankPayInfo bankPayInfo;

    public SPayInfo() {
    }

    public SPayInfo(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo[] orderPayList,
           java.lang.String shoppingId,
           java.util.Calendar shoppingDate,
           java.lang.Short paymentStatus,
           java.lang.Integer retailInvoiceType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBankPayInfo bankPayInfo) {
           this.orderPayList = orderPayList;
           this.shoppingId = shoppingId;
           this.shoppingDate = shoppingDate;
           this.paymentStatus = paymentStatus;
           this.retailInvoiceType = retailInvoiceType;
           this.bankPayInfo = bankPayInfo;
    }


    /**
     * Gets the orderPayList value for this SPayInfo.
     * 
     * @return orderPayList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo[] getOrderPayList() {
        return orderPayList;
    }


    /**
     * Sets the orderPayList value for this SPayInfo.
     * 
     * @param orderPayList
     */
    public void setOrderPayList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo[] orderPayList) {
        this.orderPayList = orderPayList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo getOrderPayList(int i) {
        return this.orderPayList[i];
    }

    public void setOrderPayList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo _value) {
        this.orderPayList[i] = _value;
    }


    /**
     * Gets the shoppingId value for this SPayInfo.
     * 
     * @return shoppingId
     */
    public java.lang.String getShoppingId() {
        return shoppingId;
    }


    /**
     * Sets the shoppingId value for this SPayInfo.
     * 
     * @param shoppingId
     */
    public void setShoppingId(java.lang.String shoppingId) {
        this.shoppingId = shoppingId;
    }


    /**
     * Gets the shoppingDate value for this SPayInfo.
     * 
     * @return shoppingDate
     */
    public java.util.Calendar getShoppingDate() {
        return shoppingDate;
    }


    /**
     * Sets the shoppingDate value for this SPayInfo.
     * 
     * @param shoppingDate
     */
    public void setShoppingDate(java.util.Calendar shoppingDate) {
        this.shoppingDate = shoppingDate;
    }


    /**
     * Gets the paymentStatus value for this SPayInfo.
     * 
     * @return paymentStatus
     */
    public java.lang.Short getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this SPayInfo.
     * 
     * @param paymentStatus
     */
    public void setPaymentStatus(java.lang.Short paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the retailInvoiceType value for this SPayInfo.
     * 
     * @return retailInvoiceType
     */
    public java.lang.Integer getRetailInvoiceType() {
        return retailInvoiceType;
    }


    /**
     * Sets the retailInvoiceType value for this SPayInfo.
     * 
     * @param retailInvoiceType
     */
    public void setRetailInvoiceType(java.lang.Integer retailInvoiceType) {
        this.retailInvoiceType = retailInvoiceType;
    }


    /**
     * Gets the bankPayInfo value for this SPayInfo.
     * 
     * @return bankPayInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBankPayInfo getBankPayInfo() {
        return bankPayInfo;
    }


    /**
     * Sets the bankPayInfo value for this SPayInfo.
     * 
     * @param bankPayInfo
     */
    public void setBankPayInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBankPayInfo bankPayInfo) {
        this.bankPayInfo = bankPayInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPayInfo)) return false;
        SPayInfo other = (SPayInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderPayList==null && other.getOrderPayList()==null) || 
             (this.orderPayList!=null &&
              java.util.Arrays.equals(this.orderPayList, other.getOrderPayList()))) &&
            ((this.shoppingId==null && other.getShoppingId()==null) || 
             (this.shoppingId!=null &&
              this.shoppingId.equals(other.getShoppingId()))) &&
            ((this.shoppingDate==null && other.getShoppingDate()==null) || 
             (this.shoppingDate!=null &&
              this.shoppingDate.equals(other.getShoppingDate()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.retailInvoiceType==null && other.getRetailInvoiceType()==null) || 
             (this.retailInvoiceType!=null &&
              this.retailInvoiceType.equals(other.getRetailInvoiceType()))) &&
            ((this.bankPayInfo==null && other.getBankPayInfo()==null) || 
             (this.bankPayInfo!=null &&
              this.bankPayInfo.equals(other.getBankPayInfo())));
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
        if (getOrderPayList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderPayList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderPayList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShoppingId() != null) {
            _hashCode += getShoppingId().hashCode();
        }
        if (getShoppingDate() != null) {
            _hashCode += getShoppingDate().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getRetailInvoiceType() != null) {
            _hashCode += getRetailInvoiceType().hashCode();
        }
        if (getBankPayInfo() != null) {
            _hashCode += getBankPayInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPayInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPayList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderPayList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUnifiedPayInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailInvoiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailInvoiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankPayInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankPayInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBankPayInfo"));
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
