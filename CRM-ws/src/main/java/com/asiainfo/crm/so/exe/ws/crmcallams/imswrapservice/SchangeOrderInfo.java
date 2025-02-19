/**
 * SchangeOrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SchangeOrderInfo  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Integer changeType;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo[] offerInfo;

    public SchangeOrderInfo() {
    }

    public SchangeOrderInfo(
           java.lang.Long acctId,
           java.lang.Integer changeType,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo[] offerInfo) {
           this.acctId = acctId;
           this.changeType = changeType;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.offerInfo = offerInfo;
    }


    /**
     * Gets the acctId value for this SchangeOrderInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SchangeOrderInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the changeType value for this SchangeOrderInfo.
     * 
     * @return changeType
     */
    public java.lang.Integer getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this SchangeOrderInfo.
     * 
     * @param changeType
     */
    public void setChangeType(java.lang.Integer changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the orderId value for this SchangeOrderInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SchangeOrderInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SchangeOrderInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SchangeOrderInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the offerInfo value for this SchangeOrderInfo.
     * 
     * @return offerInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo[] getOfferInfo() {
        return offerInfo;
    }


    /**
     * Sets the offerInfo value for this SchangeOrderInfo.
     * 
     * @param offerInfo
     */
    public void setOfferInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo[] offerInfo) {
        this.offerInfo = offerInfo;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo getOfferInfo(int i) {
        return this.offerInfo[i];
    }

    public void setOfferInfo(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOfferInfo _value) {
        this.offerInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchangeOrderInfo)) return false;
        SchangeOrderInfo other = (SchangeOrderInfo) obj;
        
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
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.offerInfo==null && other.getOfferInfo()==null) || 
             (this.offerInfo!=null &&
              java.util.Arrays.equals(this.offerInfo, other.getOfferInfo())));
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
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOfferInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SchangeOrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "schangeOrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("offerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "schangeOfferInfo"));
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
