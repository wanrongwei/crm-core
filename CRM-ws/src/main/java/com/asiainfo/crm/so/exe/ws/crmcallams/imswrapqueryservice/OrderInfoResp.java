/**
 * OrderInfoResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class OrderInfoResp  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String orderId;

    private java.lang.Long acctId;

    private java.lang.Integer paymentMethod;

    private java.lang.Integer measureId;

    private java.lang.Long allowanceAcctId;

    private java.lang.Integer retailType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo sInstalInfo;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCaBusiRecDeduct[] sCaBusiRecDeductList;

    public OrderInfoResp() {
    }

    public OrderInfoResp(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.String orderId,
           java.lang.Long acctId,
           java.lang.Integer paymentMethod,
           java.lang.Integer measureId,
           java.lang.Long allowanceAcctId,
           java.lang.Integer retailType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo sInstalInfo,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCaBusiRecDeduct[] sCaBusiRecDeductList) {
        super(
            responseHead);
        this.orderId = orderId;
        this.acctId = acctId;
        this.paymentMethod = paymentMethod;
        this.measureId = measureId;
        this.allowanceAcctId = allowanceAcctId;
        this.retailType = retailType;
        this.sInstalInfo = sInstalInfo;
        this.sCaBusiRecDeductList = sCaBusiRecDeductList;
    }


    /**
     * Gets the orderId value for this OrderInfoResp.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderInfoResp.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the acctId value for this OrderInfoResp.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this OrderInfoResp.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the paymentMethod value for this OrderInfoResp.
     * 
     * @return paymentMethod
     */
    public java.lang.Integer getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this OrderInfoResp.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the measureId value for this OrderInfoResp.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this OrderInfoResp.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the allowanceAcctId value for this OrderInfoResp.
     * 
     * @return allowanceAcctId
     */
    public java.lang.Long getAllowanceAcctId() {
        return allowanceAcctId;
    }


    /**
     * Sets the allowanceAcctId value for this OrderInfoResp.
     * 
     * @param allowanceAcctId
     */
    public void setAllowanceAcctId(java.lang.Long allowanceAcctId) {
        this.allowanceAcctId = allowanceAcctId;
    }


    /**
     * Gets the retailType value for this OrderInfoResp.
     * 
     * @return retailType
     */
    public java.lang.Integer getRetailType() {
        return retailType;
    }


    /**
     * Sets the retailType value for this OrderInfoResp.
     * 
     * @param retailType
     */
    public void setRetailType(java.lang.Integer retailType) {
        this.retailType = retailType;
    }


    /**
     * Gets the sInstalInfo value for this OrderInfoResp.
     * 
     * @return sInstalInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo getSInstalInfo() {
        return sInstalInfo;
    }


    /**
     * Sets the sInstalInfo value for this OrderInfoResp.
     * 
     * @param sInstalInfo
     */
    public void setSInstalInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo sInstalInfo) {
        this.sInstalInfo = sInstalInfo;
    }


    /**
     * Gets the sCaBusiRecDeductList value for this OrderInfoResp.
     * 
     * @return sCaBusiRecDeductList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCaBusiRecDeduct[] getSCaBusiRecDeductList() {
        return sCaBusiRecDeductList;
    }


    /**
     * Sets the sCaBusiRecDeductList value for this OrderInfoResp.
     * 
     * @param sCaBusiRecDeductList
     */
    public void setSCaBusiRecDeductList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCaBusiRecDeduct[] sCaBusiRecDeductList) {
        this.sCaBusiRecDeductList = sCaBusiRecDeductList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCaBusiRecDeduct getSCaBusiRecDeductList(int i) {
        return this.sCaBusiRecDeductList[i];
    }

    public void setSCaBusiRecDeductList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCaBusiRecDeduct _value) {
        this.sCaBusiRecDeductList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderInfoResp)) return false;
        OrderInfoResp other = (OrderInfoResp) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.allowanceAcctId==null && other.getAllowanceAcctId()==null) || 
             (this.allowanceAcctId!=null &&
              this.allowanceAcctId.equals(other.getAllowanceAcctId()))) &&
            ((this.retailType==null && other.getRetailType()==null) || 
             (this.retailType!=null &&
              this.retailType.equals(other.getRetailType()))) &&
            ((this.sInstalInfo==null && other.getSInstalInfo()==null) || 
             (this.sInstalInfo!=null &&
              this.sInstalInfo.equals(other.getSInstalInfo()))) &&
            ((this.sCaBusiRecDeductList==null && other.getSCaBusiRecDeductList()==null) || 
             (this.sCaBusiRecDeductList!=null &&
              java.util.Arrays.equals(this.sCaBusiRecDeductList, other.getSCaBusiRecDeductList())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAllowanceAcctId() != null) {
            _hashCode += getAllowanceAcctId().hashCode();
        }
        if (getRetailType() != null) {
            _hashCode += getRetailType().hashCode();
        }
        if (getSInstalInfo() != null) {
            _hashCode += getSInstalInfo().hashCode();
        }
        if (getSCaBusiRecDeductList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSCaBusiRecDeductList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSCaBusiRecDeductList(), i);
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
        new org.apache.axis.description.TypeDesc(OrderInfoResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderInfoResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SInstalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sInstalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCaBusiRecDeductList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCaBusiRecDeductList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCaBusiRecDeduct"));
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
