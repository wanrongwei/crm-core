/**
 * GetPreOrderLimitRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class GetPreOrderLimitRequestBody  implements java.io.Serializable {
    private java.lang.String[] materials;

    private java.lang.String outletId;

    public GetPreOrderLimitRequestBody() {
    }

    public GetPreOrderLimitRequestBody(
           java.lang.String[] materials,
           java.lang.String outletId) {
           this.materials = materials;
           this.outletId = outletId;
    }


    /**
     * Gets the materials value for this GetPreOrderLimitRequestBody.
     * 
     * @return materials
     */
    public java.lang.String[] getMaterials() {
        return materials;
    }


    /**
     * Sets the materials value for this GetPreOrderLimitRequestBody.
     * 
     * @param materials
     */
    public void setMaterials(java.lang.String[] materials) {
        this.materials = materials;
    }


    /**
     * Gets the outletId value for this GetPreOrderLimitRequestBody.
     * 
     * @return outletId
     */
    public java.lang.String getOutletId() {
        return outletId;
    }


    /**
     * Sets the outletId value for this GetPreOrderLimitRequestBody.
     * 
     * @param outletId
     */
    public void setOutletId(java.lang.String outletId) {
        this.outletId = outletId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPreOrderLimitRequestBody)) return false;
        GetPreOrderLimitRequestBody other = (GetPreOrderLimitRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.materials==null && other.getMaterials()==null) || 
             (this.materials!=null &&
              java.util.Arrays.equals(this.materials, other.getMaterials()))) &&
            ((this.outletId==null && other.getOutletId()==null) || 
             (this.outletId!=null &&
              this.outletId.equals(other.getOutletId())));
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
        if (getMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutletId() != null) {
            _hashCode += getOutletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPreOrderLimitRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetPreOrderLimitRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Materials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char18"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
