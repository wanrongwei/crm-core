/**
 * OrdersCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class OrdersCheck  implements java.io.Serializable {
    private java.lang.String orderNumber;

    private java.lang.String orderPostStatus;

    private java.lang.String orderPostStatusMessage;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.DeliveriesCheck[] deliveries;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public OrdersCheck() {
    }

    public OrdersCheck(
           java.lang.String orderNumber,
           java.lang.String orderPostStatus,
           java.lang.String orderPostStatusMessage,
           com.asiainfo.crm.inter.exe.webservice.client.dep.DeliveriesCheck[] deliveries,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.orderNumber = orderNumber;
           this.orderPostStatus = orderPostStatus;
           this.orderPostStatusMessage = orderPostStatusMessage;
           this.deliveries = deliveries;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the orderNumber value for this OrdersCheck.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this OrdersCheck.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderPostStatus value for this OrdersCheck.
     * 
     * @return orderPostStatus
     */
    public java.lang.String getOrderPostStatus() {
        return orderPostStatus;
    }


    /**
     * Sets the orderPostStatus value for this OrdersCheck.
     * 
     * @param orderPostStatus
     */
    public void setOrderPostStatus(java.lang.String orderPostStatus) {
        this.orderPostStatus = orderPostStatus;
    }


    /**
     * Gets the orderPostStatusMessage value for this OrdersCheck.
     * 
     * @return orderPostStatusMessage
     */
    public java.lang.String getOrderPostStatusMessage() {
        return orderPostStatusMessage;
    }


    /**
     * Sets the orderPostStatusMessage value for this OrdersCheck.
     * 
     * @param orderPostStatusMessage
     */
    public void setOrderPostStatusMessage(java.lang.String orderPostStatusMessage) {
        this.orderPostStatusMessage = orderPostStatusMessage;
    }


    /**
     * Gets the deliveries value for this OrdersCheck.
     * 
     * @return deliveries
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.DeliveriesCheck[] getDeliveries() {
        return deliveries;
    }


    /**
     * Sets the deliveries value for this OrdersCheck.
     * 
     * @param deliveries
     */
    public void setDeliveries(com.asiainfo.crm.inter.exe.webservice.client.dep.DeliveriesCheck[] deliveries) {
        this.deliveries = deliveries;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.DeliveriesCheck getDeliveries(int i) {
        return this.deliveries[i];
    }

    public void setDeliveries(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.DeliveriesCheck _value) {
        this.deliveries[i] = _value;
    }


    /**
     * Gets the attrInfo value for this OrdersCheck.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this OrdersCheck.
     * 
     * @param attrInfo
     */
    public void setAttrInfo(com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
        this.attrInfo = attrInfo;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo getAttrInfo(int i) {
        return this.attrInfo[i];
    }

    public void setAttrInfo(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo _value) {
        this.attrInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrdersCheck)) return false;
        OrdersCheck other = (OrdersCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderPostStatus==null && other.getOrderPostStatus()==null) || 
             (this.orderPostStatus!=null &&
              this.orderPostStatus.equals(other.getOrderPostStatus()))) &&
            ((this.orderPostStatusMessage==null && other.getOrderPostStatusMessage()==null) || 
             (this.orderPostStatusMessage!=null &&
              this.orderPostStatusMessage.equals(other.getOrderPostStatusMessage()))) &&
            ((this.deliveries==null && other.getDeliveries()==null) || 
             (this.deliveries!=null &&
              java.util.Arrays.equals(this.deliveries, other.getDeliveries()))) &&
            ((this.attrInfo==null && other.getAttrInfo()==null) || 
             (this.attrInfo!=null &&
              java.util.Arrays.equals(this.attrInfo, other.getAttrInfo())));
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
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderPostStatus() != null) {
            _hashCode += getOrderPostStatus().hashCode();
        }
        if (getOrderPostStatusMessage() != null) {
            _hashCode += getOrderPostStatusMessage().hashCode();
        }
        if (getDeliveries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttrInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttrInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttrInfo(), i);
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
        new org.apache.axis.description.TypeDesc(OrdersCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "OrdersCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPostStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderPostStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPostStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderPostStatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deliveries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeliveriesCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttrInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AttrInfo"));
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
