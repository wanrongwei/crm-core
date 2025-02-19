/**
 * DoQueryWorkLogResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class DoQueryWorkLogResponse  extends com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.RechargeLog[] rechargeLogList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.AdjustLog[] adjustLogList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.TransferLog[] transferLogList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.PaymentLog[] paymentLogList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.NegativeBalanceLog[] negativebalLogList;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.MaxFreeResourceLog[] maxFreesourceLogList;

    public DoQueryWorkLogResponse() {
    }

    public DoQueryWorkLogResponse(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.RechargeLog[] rechargeLogList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.AdjustLog[] adjustLogList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.TransferLog[] transferLogList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.PaymentLog[] paymentLogList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.NegativeBalanceLog[] negativebalLogList,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.MaxFreeResourceLog[] maxFreesourceLogList) {
        super(
            responseHead);
        this.rechargeLogList = rechargeLogList;
        this.adjustLogList = adjustLogList;
        this.transferLogList = transferLogList;
        this.paymentLogList = paymentLogList;
        this.negativebalLogList = negativebalLogList;
        this.maxFreesourceLogList = maxFreesourceLogList;
    }


    /**
     * Gets the rechargeLogList value for this DoQueryWorkLogResponse.
     * 
     * @return rechargeLogList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.RechargeLog[] getRechargeLogList() {
        return rechargeLogList;
    }


    /**
     * Sets the rechargeLogList value for this DoQueryWorkLogResponse.
     * 
     * @param rechargeLogList
     */
    public void setRechargeLogList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.RechargeLog[] rechargeLogList) {
        this.rechargeLogList = rechargeLogList;
    }


    /**
     * Gets the adjustLogList value for this DoQueryWorkLogResponse.
     * 
     * @return adjustLogList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.AdjustLog[] getAdjustLogList() {
        return adjustLogList;
    }


    /**
     * Sets the adjustLogList value for this DoQueryWorkLogResponse.
     * 
     * @param adjustLogList
     */
    public void setAdjustLogList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.AdjustLog[] adjustLogList) {
        this.adjustLogList = adjustLogList;
    }


    /**
     * Gets the transferLogList value for this DoQueryWorkLogResponse.
     * 
     * @return transferLogList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.TransferLog[] getTransferLogList() {
        return transferLogList;
    }


    /**
     * Sets the transferLogList value for this DoQueryWorkLogResponse.
     * 
     * @param transferLogList
     */
    public void setTransferLogList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.TransferLog[] transferLogList) {
        this.transferLogList = transferLogList;
    }


    /**
     * Gets the paymentLogList value for this DoQueryWorkLogResponse.
     * 
     * @return paymentLogList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.PaymentLog[] getPaymentLogList() {
        return paymentLogList;
    }


    /**
     * Sets the paymentLogList value for this DoQueryWorkLogResponse.
     * 
     * @param paymentLogList
     */
    public void setPaymentLogList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.PaymentLog[] paymentLogList) {
        this.paymentLogList = paymentLogList;
    }


    /**
     * Gets the negativebalLogList value for this DoQueryWorkLogResponse.
     * 
     * @return negativebalLogList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.NegativeBalanceLog[] getNegativebalLogList() {
        return negativebalLogList;
    }


    /**
     * Sets the negativebalLogList value for this DoQueryWorkLogResponse.
     * 
     * @param negativebalLogList
     */
    public void setNegativebalLogList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.NegativeBalanceLog[] negativebalLogList) {
        this.negativebalLogList = negativebalLogList;
    }


    /**
     * Gets the maxFreesourceLogList value for this DoQueryWorkLogResponse.
     * 
     * @return maxFreesourceLogList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.MaxFreeResourceLog[] getMaxFreesourceLogList() {
        return maxFreesourceLogList;
    }


    /**
     * Sets the maxFreesourceLogList value for this DoQueryWorkLogResponse.
     * 
     * @param maxFreesourceLogList
     */
    public void setMaxFreesourceLogList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.MaxFreeResourceLog[] maxFreesourceLogList) {
        this.maxFreesourceLogList = maxFreesourceLogList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryWorkLogResponse)) return false;
        DoQueryWorkLogResponse other = (DoQueryWorkLogResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rechargeLogList==null && other.getRechargeLogList()==null) || 
             (this.rechargeLogList!=null &&
              java.util.Arrays.equals(this.rechargeLogList, other.getRechargeLogList()))) &&
            ((this.adjustLogList==null && other.getAdjustLogList()==null) || 
             (this.adjustLogList!=null &&
              java.util.Arrays.equals(this.adjustLogList, other.getAdjustLogList()))) &&
            ((this.transferLogList==null && other.getTransferLogList()==null) || 
             (this.transferLogList!=null &&
              java.util.Arrays.equals(this.transferLogList, other.getTransferLogList()))) &&
            ((this.paymentLogList==null && other.getPaymentLogList()==null) || 
             (this.paymentLogList!=null &&
              java.util.Arrays.equals(this.paymentLogList, other.getPaymentLogList()))) &&
            ((this.negativebalLogList==null && other.getNegativebalLogList()==null) || 
             (this.negativebalLogList!=null &&
              java.util.Arrays.equals(this.negativebalLogList, other.getNegativebalLogList()))) &&
            ((this.maxFreesourceLogList==null && other.getMaxFreesourceLogList()==null) || 
             (this.maxFreesourceLogList!=null &&
              java.util.Arrays.equals(this.maxFreesourceLogList, other.getMaxFreesourceLogList())));
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
        if (getRechargeLogList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeLogList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRechargeLogList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdjustLogList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdjustLogList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdjustLogList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferLogList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferLogList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferLogList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentLogList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentLogList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentLogList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegativebalLogList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegativebalLogList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegativebalLogList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxFreesourceLogList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaxFreesourceLogList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaxFreesourceLogList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryWorkLogResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryWorkLogResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "rechargeLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rechargeLogListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "adjustLogListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "transferLogListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "paymentLogListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativebalLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativebalLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "negativeBalanceLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "negativeBalLogItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFreesourceLogList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFreesourceLogList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceLog"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "maxFreeResourceLogItem"));
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
