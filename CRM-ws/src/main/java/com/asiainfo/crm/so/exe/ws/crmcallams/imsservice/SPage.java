/**
 * SPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SPage  implements java.io.Serializable {
    private java.lang.Integer num;

    private java.lang.Integer size;

    private java.lang.Long count;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField[] orderFieldList;

    public SPage() {
    }

    public SPage(
           java.lang.Integer num,
           java.lang.Integer size,
           java.lang.Long count,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField[] orderFieldList) {
           this.num = num;
           this.size = size;
           this.count = count;
           this.orderFieldList = orderFieldList;
    }


    /**
     * Gets the num value for this SPage.
     * 
     * @return num
     */
    public java.lang.Integer getNum() {
        return num;
    }


    /**
     * Sets the num value for this SPage.
     * 
     * @param num
     */
    public void setNum(java.lang.Integer num) {
        this.num = num;
    }


    /**
     * Gets the size value for this SPage.
     * 
     * @return size
     */
    public java.lang.Integer getSize() {
        return size;
    }


    /**
     * Sets the size value for this SPage.
     * 
     * @param size
     */
    public void setSize(java.lang.Integer size) {
        this.size = size;
    }


    /**
     * Gets the count value for this SPage.
     * 
     * @return count
     */
    public java.lang.Long getCount() {
        return count;
    }


    /**
     * Sets the count value for this SPage.
     * 
     * @param count
     */
    public void setCount(java.lang.Long count) {
        this.count = count;
    }


    /**
     * Gets the orderFieldList value for this SPage.
     * 
     * @return orderFieldList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField[] getOrderFieldList() {
        return orderFieldList;
    }


    /**
     * Sets the orderFieldList value for this SPage.
     * 
     * @param orderFieldList
     */
    public void setOrderFieldList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField[] orderFieldList) {
        this.orderFieldList = orderFieldList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField getOrderFieldList(int i) {
        return this.orderFieldList[i];
    }

    public void setOrderFieldList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField _value) {
        this.orderFieldList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPage)) return false;
        SPage other = (SPage) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.num==null && other.getNum()==null) || 
             (this.num!=null &&
              this.num.equals(other.getNum()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.orderFieldList==null && other.getOrderFieldList()==null) || 
             (this.orderFieldList!=null &&
              java.util.Arrays.equals(this.orderFieldList, other.getOrderFieldList())));
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
        if (getNum() != null) {
            _hashCode += getNum().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getOrderFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderFieldList(), i);
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
        new org.apache.axis.description.TypeDesc(SPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderField"));
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
