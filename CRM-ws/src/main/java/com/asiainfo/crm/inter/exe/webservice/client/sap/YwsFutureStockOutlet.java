/**
 * YwsFutureStockOutlet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsFutureStockOutlet  implements java.io.Serializable {
    private java.lang.String outletId;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStock[] outletStockData;

    public YwsFutureStockOutlet() {
    }

    public YwsFutureStockOutlet(
           java.lang.String outletId,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStock[] outletStockData) {
           this.outletId = outletId;
           this.outletStockData = outletStockData;
    }


    /**
     * Gets the outletId value for this YwsFutureStockOutlet.
     * 
     * @return outletId
     */
    public java.lang.String getOutletId() {
        return outletId;
    }


    /**
     * Sets the outletId value for this YwsFutureStockOutlet.
     * 
     * @param outletId
     */
    public void setOutletId(java.lang.String outletId) {
        this.outletId = outletId;
    }


    /**
     * Gets the outletStockData value for this YwsFutureStockOutlet.
     * 
     * @return outletStockData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStock[] getOutletStockData() {
        return outletStockData;
    }


    /**
     * Sets the outletStockData value for this YwsFutureStockOutlet.
     * 
     * @param outletStockData
     */
    public void setOutletStockData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStock[] outletStockData) {
        this.outletStockData = outletStockData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsFutureStockOutlet)) return false;
        YwsFutureStockOutlet other = (YwsFutureStockOutlet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outletId==null && other.getOutletId()==null) || 
             (this.outletId!=null &&
              this.outletId.equals(other.getOutletId()))) &&
            ((this.outletStockData==null && other.getOutletStockData()==null) || 
             (this.outletStockData!=null &&
              java.util.Arrays.equals(this.outletStockData, other.getOutletStockData())));
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
        if (getOutletId() != null) {
            _hashCode += getOutletId().hashCode();
        }
        if (getOutletStockData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutletStockData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutletStockData(), i);
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
        new org.apache.axis.description.TypeDesc(YwsFutureStockOutlet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockOutlet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletStockData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletStockData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStock"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
