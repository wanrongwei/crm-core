/**
 * SUnifiedPayInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SUnifiedPayInfo  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] instalInfo;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail[] allowancePayDetails;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.Long acctId;

    private java.lang.Long soAcctId;

    private java.lang.Long coinPay;

    private java.lang.Long balancePay;

    private java.lang.Long cashPay;

    private java.lang.Long measureId;

    private java.lang.Long netsPay;

    private java.lang.Long posPay;

    private java.lang.Long retailInvoicePay;

    private java.lang.Integer retailType;

    private java.lang.String paymentId;

    private java.lang.Long instalPay;

    public SUnifiedPayInfo() {
    }

    public SUnifiedPayInfo(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] instalInfo,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail[] allowancePayDetails,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.Long acctId,
           java.lang.Long soAcctId,
           java.lang.Long coinPay,
           java.lang.Long balancePay,
           java.lang.Long cashPay,
           java.lang.Long measureId,
           java.lang.Long netsPay,
           java.lang.Long posPay,
           java.lang.Long retailInvoicePay,
           java.lang.Integer retailType,
           java.lang.String paymentId,
           java.lang.Long instalPay) {
           this.instalInfo = instalInfo;
           this.allowancePayDetails = allowancePayDetails;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.acctId = acctId;
           this.soAcctId = soAcctId;
           this.coinPay = coinPay;
           this.balancePay = balancePay;
           this.cashPay = cashPay;
           this.measureId = measureId;
           this.netsPay = netsPay;
           this.posPay = posPay;
           this.retailInvoicePay = retailInvoicePay;
           this.retailType = retailType;
           this.paymentId = paymentId;
           this.instalPay = instalPay;
    }


    /**
     * Gets the instalInfo value for this SUnifiedPayInfo.
     * 
     * @return instalInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] getInstalInfo() {
        return instalInfo;
    }


    /**
     * Sets the instalInfo value for this SUnifiedPayInfo.
     * 
     * @param instalInfo
     */
    public void setInstalInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo[] instalInfo) {
        this.instalInfo = instalInfo;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo getInstalInfo(int i) {
        return this.instalInfo[i];
    }

    public void setInstalInfo(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo _value) {
        this.instalInfo[i] = _value;
    }


    /**
     * Gets the allowancePayDetails value for this SUnifiedPayInfo.
     * 
     * @return allowancePayDetails
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail[] getAllowancePayDetails() {
        return allowancePayDetails;
    }


    /**
     * Sets the allowancePayDetails value for this SUnifiedPayInfo.
     * 
     * @param allowancePayDetails
     */
    public void setAllowancePayDetails(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail[] allowancePayDetails) {
        this.allowancePayDetails = allowancePayDetails;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail getAllowancePayDetails(int i) {
        return this.allowancePayDetails[i];
    }

    public void setAllowancePayDetails(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail _value) {
        this.allowancePayDetails[i] = _value;
    }


    /**
     * Gets the orderId value for this SUnifiedPayInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SUnifiedPayInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SUnifiedPayInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SUnifiedPayInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the acctId value for this SUnifiedPayInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SUnifiedPayInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the soAcctId value for this SUnifiedPayInfo.
     * 
     * @return soAcctId
     */
    public java.lang.Long getSoAcctId() {
        return soAcctId;
    }


    /**
     * Sets the soAcctId value for this SUnifiedPayInfo.
     * 
     * @param soAcctId
     */
    public void setSoAcctId(java.lang.Long soAcctId) {
        this.soAcctId = soAcctId;
    }


    /**
     * Gets the coinPay value for this SUnifiedPayInfo.
     * 
     * @return coinPay
     */
    public java.lang.Long getCoinPay() {
        return coinPay;
    }


    /**
     * Sets the coinPay value for this SUnifiedPayInfo.
     * 
     * @param coinPay
     */
    public void setCoinPay(java.lang.Long coinPay) {
        this.coinPay = coinPay;
    }


    /**
     * Gets the balancePay value for this SUnifiedPayInfo.
     * 
     * @return balancePay
     */
    public java.lang.Long getBalancePay() {
        return balancePay;
    }


    /**
     * Sets the balancePay value for this SUnifiedPayInfo.
     * 
     * @param balancePay
     */
    public void setBalancePay(java.lang.Long balancePay) {
        this.balancePay = balancePay;
    }


    /**
     * Gets the cashPay value for this SUnifiedPayInfo.
     * 
     * @return cashPay
     */
    public java.lang.Long getCashPay() {
        return cashPay;
    }


    /**
     * Sets the cashPay value for this SUnifiedPayInfo.
     * 
     * @param cashPay
     */
    public void setCashPay(java.lang.Long cashPay) {
        this.cashPay = cashPay;
    }


    /**
     * Gets the measureId value for this SUnifiedPayInfo.
     * 
     * @return measureId
     */
    public java.lang.Long getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SUnifiedPayInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Long measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the netsPay value for this SUnifiedPayInfo.
     * 
     * @return netsPay
     */
    public java.lang.Long getNetsPay() {
        return netsPay;
    }


    /**
     * Sets the netsPay value for this SUnifiedPayInfo.
     * 
     * @param netsPay
     */
    public void setNetsPay(java.lang.Long netsPay) {
        this.netsPay = netsPay;
    }


    /**
     * Gets the posPay value for this SUnifiedPayInfo.
     * 
     * @return posPay
     */
    public java.lang.Long getPosPay() {
        return posPay;
    }


    /**
     * Sets the posPay value for this SUnifiedPayInfo.
     * 
     * @param posPay
     */
    public void setPosPay(java.lang.Long posPay) {
        this.posPay = posPay;
    }


    /**
     * Gets the retailInvoicePay value for this SUnifiedPayInfo.
     * 
     * @return retailInvoicePay
     */
    public java.lang.Long getRetailInvoicePay() {
        return retailInvoicePay;
    }


    /**
     * Sets the retailInvoicePay value for this SUnifiedPayInfo.
     * 
     * @param retailInvoicePay
     */
    public void setRetailInvoicePay(java.lang.Long retailInvoicePay) {
        this.retailInvoicePay = retailInvoicePay;
    }


    /**
     * Gets the retailType value for this SUnifiedPayInfo.
     * 
     * @return retailType
     */
    public java.lang.Integer getRetailType() {
        return retailType;
    }


    /**
     * Sets the retailType value for this SUnifiedPayInfo.
     * 
     * @param retailType
     */
    public void setRetailType(java.lang.Integer retailType) {
        this.retailType = retailType;
    }


    /**
     * Gets the paymentId value for this SUnifiedPayInfo.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this SUnifiedPayInfo.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the instalPay value for this SUnifiedPayInfo.
     * 
     * @return instalPay
     */
    public java.lang.Long getInstalPay() {
        return instalPay;
    }


    /**
     * Sets the instalPay value for this SUnifiedPayInfo.
     * 
     * @param instalPay
     */
    public void setInstalPay(java.lang.Long instalPay) {
        this.instalPay = instalPay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUnifiedPayInfo)) return false;
        SUnifiedPayInfo other = (SUnifiedPayInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instalInfo==null && other.getInstalInfo()==null) || 
             (this.instalInfo!=null &&
              java.util.Arrays.equals(this.instalInfo, other.getInstalInfo()))) &&
            ((this.allowancePayDetails==null && other.getAllowancePayDetails()==null) || 
             (this.allowancePayDetails!=null &&
              java.util.Arrays.equals(this.allowancePayDetails, other.getAllowancePayDetails()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.soAcctId==null && other.getSoAcctId()==null) || 
             (this.soAcctId!=null &&
              this.soAcctId.equals(other.getSoAcctId()))) &&
            ((this.coinPay==null && other.getCoinPay()==null) || 
             (this.coinPay!=null &&
              this.coinPay.equals(other.getCoinPay()))) &&
            ((this.balancePay==null && other.getBalancePay()==null) || 
             (this.balancePay!=null &&
              this.balancePay.equals(other.getBalancePay()))) &&
            ((this.cashPay==null && other.getCashPay()==null) || 
             (this.cashPay!=null &&
              this.cashPay.equals(other.getCashPay()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.netsPay==null && other.getNetsPay()==null) || 
             (this.netsPay!=null &&
              this.netsPay.equals(other.getNetsPay()))) &&
            ((this.posPay==null && other.getPosPay()==null) || 
             (this.posPay!=null &&
              this.posPay.equals(other.getPosPay()))) &&
            ((this.retailInvoicePay==null && other.getRetailInvoicePay()==null) || 
             (this.retailInvoicePay!=null &&
              this.retailInvoicePay.equals(other.getRetailInvoicePay()))) &&
            ((this.retailType==null && other.getRetailType()==null) || 
             (this.retailType!=null &&
              this.retailType.equals(other.getRetailType()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.instalPay==null && other.getInstalPay()==null) || 
             (this.instalPay!=null &&
              this.instalPay.equals(other.getInstalPay())));
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
        if (getInstalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstalInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowancePayDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowancePayDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowancePayDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getSoAcctId() != null) {
            _hashCode += getSoAcctId().hashCode();
        }
        if (getCoinPay() != null) {
            _hashCode += getCoinPay().hashCode();
        }
        if (getBalancePay() != null) {
            _hashCode += getBalancePay().hashCode();
        }
        if (getCashPay() != null) {
            _hashCode += getCashPay().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getNetsPay() != null) {
            _hashCode += getNetsPay().hashCode();
        }
        if (getPosPay() != null) {
            _hashCode += getPosPay().hashCode();
        }
        if (getRetailInvoicePay() != null) {
            _hashCode += getRetailInvoicePay().hashCode();
        }
        if (getRetailType() != null) {
            _hashCode += getRetailType().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getInstalPay() != null) {
            _hashCode += getInstalPay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUnifiedPayInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUnifiedPayInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowancePayDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowancePayDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("soAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coinPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coinPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancePay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balancePay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cashPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netsPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netsPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailInvoicePay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailInvoicePay"));
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
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalPay"));
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
