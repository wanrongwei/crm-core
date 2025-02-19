/**
 * SQueryDDFeeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class SQueryDDFeeReq  implements java.io.Serializable {
    private java.lang.Integer paymentType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.BankDebitInfo sBankDebitInfo;

    private java.lang.Short isQueryAll;

    private java.lang.Integer mailCode;

    private java.lang.Integer customerClass;

    public SQueryDDFeeReq() {
    }

    public SQueryDDFeeReq(
           java.lang.Integer paymentType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.BankDebitInfo sBankDebitInfo,
           java.lang.Short isQueryAll,
           java.lang.Integer mailCode,
           java.lang.Integer customerClass) {
           this.paymentType = paymentType;
           this.sBankDebitInfo = sBankDebitInfo;
           this.isQueryAll = isQueryAll;
           this.mailCode = mailCode;
           this.customerClass = customerClass;
    }


    /**
     * Gets the paymentType value for this SQueryDDFeeReq.
     * 
     * @return paymentType
     */
    public java.lang.Integer getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this SQueryDDFeeReq.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.Integer paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the sBankDebitInfo value for this SQueryDDFeeReq.
     * 
     * @return sBankDebitInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.BankDebitInfo getSBankDebitInfo() {
        return sBankDebitInfo;
    }


    /**
     * Sets the sBankDebitInfo value for this SQueryDDFeeReq.
     * 
     * @param sBankDebitInfo
     */
    public void setSBankDebitInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.BankDebitInfo sBankDebitInfo) {
        this.sBankDebitInfo = sBankDebitInfo;
    }


    /**
     * Gets the isQueryAll value for this SQueryDDFeeReq.
     * 
     * @return isQueryAll
     */
    public java.lang.Short getIsQueryAll() {
        return isQueryAll;
    }


    /**
     * Sets the isQueryAll value for this SQueryDDFeeReq.
     * 
     * @param isQueryAll
     */
    public void setIsQueryAll(java.lang.Short isQueryAll) {
        this.isQueryAll = isQueryAll;
    }


    /**
     * Gets the mailCode value for this SQueryDDFeeReq.
     * 
     * @return mailCode
     */
    public java.lang.Integer getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this SQueryDDFeeReq.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Integer mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the customerClass value for this SQueryDDFeeReq.
     * 
     * @return customerClass
     */
    public java.lang.Integer getCustomerClass() {
        return customerClass;
    }


    /**
     * Sets the customerClass value for this SQueryDDFeeReq.
     * 
     * @param customerClass
     */
    public void setCustomerClass(java.lang.Integer customerClass) {
        this.customerClass = customerClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof SQueryDDFeeReq)) return false;
        SQueryDDFeeReq other = (SQueryDDFeeReq) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.sBankDebitInfo==null && other.getSBankDebitInfo()==null) || 
             (this.sBankDebitInfo!=null &&
              this.sBankDebitInfo.equals(other.getSBankDebitInfo()))) &&
            ((this.isQueryAll==null && other.getIsQueryAll()==null) || 
             (this.isQueryAll!=null &&
              this.isQueryAll.equals(other.getIsQueryAll()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.customerClass==null && other.getCustomerClass()==null) || 
             (this.customerClass!=null &&
              this.customerClass.equals(other.getCustomerClass())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getSBankDebitInfo() != null) {
            _hashCode += getSBankDebitInfo().hashCode();
        }
        if (getIsQueryAll() != null) {
            _hashCode += getIsQueryAll().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getCustomerClass() != null) {
            _hashCode += getCustomerClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryDDFeeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDDFeeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBankDebitInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBankDebitInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQueryAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isQueryAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerClass"));
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
