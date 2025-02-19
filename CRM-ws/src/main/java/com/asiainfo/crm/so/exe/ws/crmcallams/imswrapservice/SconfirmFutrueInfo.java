/**
 * SconfirmFutrueInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SconfirmFutrueInfo  implements java.io.Serializable {
    private java.lang.String shoppingId;

    private java.util.Calendar shoppingDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder[] orderList;

    public SconfirmFutrueInfo() {
    }

    public SconfirmFutrueInfo(
           java.lang.String shoppingId,
           java.util.Calendar shoppingDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder[] orderList) {
           this.shoppingId = shoppingId;
           this.shoppingDate = shoppingDate;
           this.orderList = orderList;
    }


    /**
     * Gets the shoppingId value for this SconfirmFutrueInfo.
     * 
     * @return shoppingId
     */
    public java.lang.String getShoppingId() {
        return shoppingId;
    }


    /**
     * Sets the shoppingId value for this SconfirmFutrueInfo.
     * 
     * @param shoppingId
     */
    public void setShoppingId(java.lang.String shoppingId) {
        this.shoppingId = shoppingId;
    }


    /**
     * Gets the shoppingDate value for this SconfirmFutrueInfo.
     * 
     * @return shoppingDate
     */
    public java.util.Calendar getShoppingDate() {
        return shoppingDate;
    }


    /**
     * Sets the shoppingDate value for this SconfirmFutrueInfo.
     * 
     * @param shoppingDate
     */
    public void setShoppingDate(java.util.Calendar shoppingDate) {
        this.shoppingDate = shoppingDate;
    }


    /**
     * Gets the orderList value for this SconfirmFutrueInfo.
     * 
     * @return orderList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder[] getOrderList() {
        return orderList;
    }


    /**
     * Sets the orderList value for this SconfirmFutrueInfo.
     * 
     * @param orderList
     */
    public void setOrderList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder[] orderList) {
        this.orderList = orderList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder getOrderList(int i) {
        return this.orderList[i];
    }

    public void setOrderList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrder _value) {
        this.orderList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SconfirmFutrueInfo)) return false;
        SconfirmFutrueInfo other = (SconfirmFutrueInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shoppingId==null && other.getShoppingId()==null) || 
             (this.shoppingId!=null &&
              this.shoppingId.equals(other.getShoppingId()))) &&
            ((this.shoppingDate==null && other.getShoppingDate()==null) || 
             (this.shoppingDate!=null &&
              this.shoppingDate.equals(other.getShoppingDate()))) &&
            ((this.orderList==null && other.getOrderList()==null) || 
             (this.orderList!=null &&
              java.util.Arrays.equals(this.orderList, other.getOrderList())));
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
        if (getShoppingId() != null) {
            _hashCode += getShoppingId().hashCode();
        }
        if (getShoppingDate() != null) {
            _hashCode += getShoppingDate().hashCode();
        }
        if (getOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderList(), i);
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
        new org.apache.axis.description.TypeDesc(SconfirmFutrueInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sconfirmFutrueInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sconfirmOrder"));
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
