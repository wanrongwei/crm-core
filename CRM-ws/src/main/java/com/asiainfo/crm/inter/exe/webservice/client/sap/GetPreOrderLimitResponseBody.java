/**
 * GetPreOrderLimitResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class GetPreOrderLimitResponseBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoPreOrderLimit[] preOrderLimits;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return;

    public GetPreOrderLimitResponseBody() {
    }

    public GetPreOrderLimitResponseBody(
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoPreOrderLimit[] preOrderLimits,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return) {
           this.preOrderLimits = preOrderLimits;
           this._return = _return;
    }


    /**
     * Gets the preOrderLimits value for this GetPreOrderLimitResponseBody.
     * 
     * @return preOrderLimits
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoPreOrderLimit[] getPreOrderLimits() {
        return preOrderLimits;
    }


    /**
     * Sets the preOrderLimits value for this GetPreOrderLimitResponseBody.
     * 
     * @param preOrderLimits
     */
    public void setPreOrderLimits(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoPreOrderLimit[] preOrderLimits) {
        this.preOrderLimits = preOrderLimits;
    }


    /**
     * Gets the _return value for this GetPreOrderLimitResponseBody.
     * 
     * @return _return
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this GetPreOrderLimitResponseBody.
     * 
     * @param _return
     */
    public void set_return(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPreOrderLimitResponseBody)) return false;
        GetPreOrderLimitResponseBody other = (GetPreOrderLimitResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preOrderLimits==null && other.getPreOrderLimits()==null) || 
             (this.preOrderLimits!=null &&
              java.util.Arrays.equals(this.preOrderLimits, other.getPreOrderLimits()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (getPreOrderLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreOrderLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreOrderLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPreOrderLimitResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetPreOrderLimitResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preOrderLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreOrderLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoPreOrderLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "YwsReturn"));
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
