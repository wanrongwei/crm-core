/**
 * QueryAcctInfoForPayReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryAcctInfoForPayReq  implements java.io.Serializable {
    private java.lang.Long custId;

    private java.lang.Integer paymentMethod;

    private java.lang.Long addressId;

    private java.lang.String bankAcctNo;

    private java.lang.Short acctClass;

    public QueryAcctInfoForPayReq() {
    }

    public QueryAcctInfoForPayReq(
           java.lang.Long custId,
           java.lang.Integer paymentMethod,
           java.lang.Long addressId,
           java.lang.String bankAcctNo,
           java.lang.Short acctClass) {
           this.custId = custId;
           this.paymentMethod = paymentMethod;
           this.addressId = addressId;
           this.bankAcctNo = bankAcctNo;
           this.acctClass = acctClass;
    }


    /**
     * Gets the custId value for this QueryAcctInfoForPayReq.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this QueryAcctInfoForPayReq.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the paymentMethod value for this QueryAcctInfoForPayReq.
     * 
     * @return paymentMethod
     */
    public java.lang.Integer getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this QueryAcctInfoForPayReq.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the addressId value for this QueryAcctInfoForPayReq.
     * 
     * @return addressId
     */
    public java.lang.Long getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this QueryAcctInfoForPayReq.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.Long addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the bankAcctNo value for this QueryAcctInfoForPayReq.
     * 
     * @return bankAcctNo
     */
    public java.lang.String getBankAcctNo() {
        return bankAcctNo;
    }


    /**
     * Sets the bankAcctNo value for this QueryAcctInfoForPayReq.
     * 
     * @param bankAcctNo
     */
    public void setBankAcctNo(java.lang.String bankAcctNo) {
        this.bankAcctNo = bankAcctNo;
    }


    /**
     * Gets the acctClass value for this QueryAcctInfoForPayReq.
     * 
     * @return acctClass
     */
    public java.lang.Short getAcctClass() {
        return acctClass;
    }


    /**
     * Sets the acctClass value for this QueryAcctInfoForPayReq.
     * 
     * @param acctClass
     */
    public void setAcctClass(java.lang.Short acctClass) {
        this.acctClass = acctClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAcctInfoForPayReq)) return false;
        QueryAcctInfoForPayReq other = (QueryAcctInfoForPayReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.bankAcctNo==null && other.getBankAcctNo()==null) || 
             (this.bankAcctNo!=null &&
              this.bankAcctNo.equals(other.getBankAcctNo()))) &&
            ((this.acctClass==null && other.getAcctClass()==null) || 
             (this.acctClass!=null &&
              this.acctClass.equals(other.getAcctClass())));
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
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getBankAcctNo() != null) {
            _hashCode += getBankAcctNo().hashCode();
        }
        if (getAcctClass() != null) {
            _hashCode += getAcctClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAcctInfoForPayReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAcctInfoForPayReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAcctNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAcctNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctClass"));
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
