/**
 * Orders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class Orders  implements java.io.Serializable {
    private java.lang.String orderNumber;

    private java.lang.String orderDate;

    private java.lang.String orderType;

    private java.lang.String customerId;

    private java.lang.String poNumber;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.Deliveries[] deliveries;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public Orders() {
    }

    public Orders(
           java.lang.String orderNumber,
           java.lang.String orderDate,
           java.lang.String orderType,
           java.lang.String customerId,
           java.lang.String poNumber,
           com.asiainfo.crm.inter.exe.webservice.client.dep.Deliveries[] deliveries,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.orderNumber = orderNumber;
           this.orderDate = orderDate;
           this.orderType = orderType;
           this.customerId = customerId;
           this.poNumber = poNumber;
           this.deliveries = deliveries;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the orderNumber value for this Orders.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this Orders.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderDate value for this Orders.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this Orders.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderType value for this Orders.
     * 
     * @return orderType
     */
    public java.lang.String getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this Orders.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the customerId value for this Orders.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Orders.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the poNumber value for this Orders.
     * 
     * @return poNumber
     */
    public java.lang.String getPoNumber() {
        return poNumber;
    }


    /**
     * Sets the poNumber value for this Orders.
     * 
     * @param poNumber
     */
    public void setPoNumber(java.lang.String poNumber) {
        this.poNumber = poNumber;
    }


    /**
     * Gets the deliveries value for this Orders.
     * 
     * @return deliveries
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.Deliveries[] getDeliveries() {
        return deliveries;
    }


    /**
     * Sets the deliveries value for this Orders.
     * 
     * @param deliveries
     */
    public void setDeliveries(com.asiainfo.crm.inter.exe.webservice.client.dep.Deliveries[] deliveries) {
        this.deliveries = deliveries;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.Deliveries getDeliveries(int i) {
        return this.deliveries[i];
    }

    public void setDeliveries(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.Deliveries _value) {
        this.deliveries[i] = _value;
    }


    /**
     * Gets the attrInfo value for this Orders.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this Orders.
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
        if (!(obj instanceof Orders)) return false;
        Orders other = (Orders) obj;
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
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.poNumber==null && other.getPoNumber()==null) || 
             (this.poNumber!=null &&
              this.poNumber.equals(other.getPoNumber()))) &&
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
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getPoNumber() != null) {
            _hashCode += getPoNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(Orders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "Orders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deliveries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "Deliveries"));
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
