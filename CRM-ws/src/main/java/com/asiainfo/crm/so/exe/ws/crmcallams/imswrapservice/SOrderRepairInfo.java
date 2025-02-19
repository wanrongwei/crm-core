/**
 * SOrderRepairInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SOrderRepairInfo  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long payAcctId;

    private java.lang.Long resourceId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.Integer payType;

    private java.lang.Long totalPrice;

    private java.lang.String transactionId;

    private java.lang.Long hardwareAcctId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderRepairFee[] repairFeeList;

    public SOrderRepairInfo() {
    }

    public SOrderRepairInfo(
           java.lang.Long acctId,
           java.lang.Long payAcctId,
           java.lang.Long resourceId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.Integer payType,
           java.lang.Long totalPrice,
           java.lang.String transactionId,
           java.lang.Long hardwareAcctId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderRepairFee[] repairFeeList) {
           this.acctId = acctId;
           this.payAcctId = payAcctId;
           this.resourceId = resourceId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.payType = payType;
           this.totalPrice = totalPrice;
           this.transactionId = transactionId;
           this.hardwareAcctId = hardwareAcctId;
           this.repairFeeList = repairFeeList;
    }


    /**
     * Gets the acctId value for this SOrderRepairInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SOrderRepairInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the payAcctId value for this SOrderRepairInfo.
     * 
     * @return payAcctId
     */
    public java.lang.Long getPayAcctId() {
        return payAcctId;
    }


    /**
     * Sets the payAcctId value for this SOrderRepairInfo.
     * 
     * @param payAcctId
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }


    /**
     * Gets the resourceId value for this SOrderRepairInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SOrderRepairInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the orderId value for this SOrderRepairInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SOrderRepairInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SOrderRepairInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SOrderRepairInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the payType value for this SOrderRepairInfo.
     * 
     * @return payType
     */
    public java.lang.Integer getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this SOrderRepairInfo.
     * 
     * @param payType
     */
    public void setPayType(java.lang.Integer payType) {
        this.payType = payType;
    }


    /**
     * Gets the totalPrice value for this SOrderRepairInfo.
     * 
     * @return totalPrice
     */
    public java.lang.Long getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this SOrderRepairInfo.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.Long totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the transactionId value for this SOrderRepairInfo.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SOrderRepairInfo.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the hardwareAcctId value for this SOrderRepairInfo.
     * 
     * @return hardwareAcctId
     */
    public java.lang.Long getHardwareAcctId() {
        return hardwareAcctId;
    }


    /**
     * Sets the hardwareAcctId value for this SOrderRepairInfo.
     * 
     * @param hardwareAcctId
     */
    public void setHardwareAcctId(java.lang.Long hardwareAcctId) {
        this.hardwareAcctId = hardwareAcctId;
    }


    /**
     * Gets the repairFeeList value for this SOrderRepairInfo.
     * 
     * @return repairFeeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderRepairFee[] getRepairFeeList() {
        return repairFeeList;
    }


    /**
     * Sets the repairFeeList value for this SOrderRepairInfo.
     * 
     * @param repairFeeList
     */
    public void setRepairFeeList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderRepairFee[] repairFeeList) {
        this.repairFeeList = repairFeeList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderRepairFee getRepairFeeList(int i) {
        return this.repairFeeList[i];
    }

    public void setRepairFeeList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderRepairFee _value) {
        this.repairFeeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOrderRepairInfo)) return false;
        SOrderRepairInfo other = (SOrderRepairInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.payAcctId==null && other.getPayAcctId()==null) || 
             (this.payAcctId!=null &&
              this.payAcctId.equals(other.getPayAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.hardwareAcctId==null && other.getHardwareAcctId()==null) || 
             (this.hardwareAcctId!=null &&
              this.hardwareAcctId.equals(other.getHardwareAcctId()))) &&
            ((this.repairFeeList==null && other.getRepairFeeList()==null) || 
             (this.repairFeeList!=null &&
              java.util.Arrays.equals(this.repairFeeList, other.getRepairFeeList())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getPayAcctId() != null) {
            _hashCode += getPayAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getHardwareAcctId() != null) {
            _hashCode += getHardwareAcctId().hashCode();
        }
        if (getRepairFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepairFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepairFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(SOrderRepairInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderRepairInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardwareAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repairFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderRepairFee"));
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
