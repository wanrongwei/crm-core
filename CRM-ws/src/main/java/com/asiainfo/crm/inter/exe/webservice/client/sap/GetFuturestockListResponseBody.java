/**
 * GetFuturestockListResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class GetFuturestockListResponseBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockList[] stockData;

    public GetFuturestockListResponseBody() {
    }

    public GetFuturestockListResponseBody(
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockList[] stockData) {
           this._return = _return;
           this.stockData = stockData;
    }


    /**
     * Gets the _return value for this GetFuturestockListResponseBody.
     * 
     * @return _return
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this GetFuturestockListResponseBody.
     * 
     * @param _return
     */
    public void set_return(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return) {
        this._return = _return;
    }


    /**
     * Gets the stockData value for this GetFuturestockListResponseBody.
     * 
     * @return stockData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockList[] getStockData() {
        return stockData;
    }


    /**
     * Sets the stockData value for this GetFuturestockListResponseBody.
     * 
     * @param stockData
     */
    public void setStockData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockList[] stockData) {
        this.stockData = stockData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFuturestockListResponseBody)) return false;
        GetFuturestockListResponseBody other = (GetFuturestockListResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.stockData==null && other.getStockData()==null) || 
             (this.stockData!=null &&
              java.util.Arrays.equals(this.stockData, other.getStockData())));
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
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getStockData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStockData(), i);
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
        new org.apache.axis.description.TypeDesc(GetFuturestockListResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "getFutureStockListResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "YwsReturn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StockData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockList"));
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
