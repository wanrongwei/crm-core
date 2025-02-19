/**
 * QueryBillDetailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class QueryBillDetailResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] paymentMethod;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] mailCode;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] billformat;

    public QueryBillDetailResponse() {
    }

    public QueryBillDetailResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] paymentMethod,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] mailCode,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] billformat) {
        super(
            responseHead);
        this.paymentMethod = paymentMethod;
        this.mailCode = mailCode;
        this.billformat = billformat;
    }


    /**
     * Gets the paymentMethod value for this QueryBillDetailResponse.
     * 
     * @return paymentMethod
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this QueryBillDetailResponse.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue _value) {
        this.paymentMethod[i] = _value;
    }


    /**
     * Gets the mailCode value for this QueryBillDetailResponse.
     * 
     * @return mailCode
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this QueryBillDetailResponse.
     * 
     * @param mailCode
     */
    public void setMailCode(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] mailCode) {
        this.mailCode = mailCode;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue getMailCode(int i) {
        return this.mailCode[i];
    }

    public void setMailCode(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue _value) {
        this.mailCode[i] = _value;
    }


    /**
     * Gets the billformat value for this QueryBillDetailResponse.
     * 
     * @return billformat
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] getBillformat() {
        return billformat;
    }


    /**
     * Sets the billformat value for this QueryBillDetailResponse.
     * 
     * @param billformat
     */
    public void setBillformat(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue[] billformat) {
        this.billformat = billformat;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue getBillformat(int i) {
        return this.billformat[i];
    }

    public void setBillformat(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CodeValue _value) {
        this.billformat[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof QueryBillDetailResponse)) return false;
        QueryBillDetailResponse other = (QueryBillDetailResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              java.util.Arrays.equals(this.paymentMethod, other.getPaymentMethod()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              java.util.Arrays.equals(this.mailCode, other.getMailCode()))) &&
            ((this.billformat==null && other.getBillformat()==null) || 
             (this.billformat!=null &&
              java.util.Arrays.equals(this.billformat, other.getBillformat())));
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
        if (getPaymentMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMailCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMailCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMailCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillformat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillformat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillformat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBillDetailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillDetailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
