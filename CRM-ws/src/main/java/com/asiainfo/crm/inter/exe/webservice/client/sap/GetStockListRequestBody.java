/**
 * GetStockListRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class GetStockListRequestBody  implements java.io.Serializable {
    private java.lang.String[] materials;

    private int minStockLevel;

    private java.lang.String[] outletsIn;

    public GetStockListRequestBody() {
    }

    public GetStockListRequestBody(
           java.lang.String[] materials,
           int minStockLevel,
           java.lang.String[] outletsIn) {
           this.materials = materials;
           this.minStockLevel = minStockLevel;
           this.outletsIn = outletsIn;
    }


    /**
     * Gets the materials value for this GetStockListRequestBody.
     * 
     * @return materials
     */
    public java.lang.String[] getMaterials() {
        return materials;
    }


    /**
     * Sets the materials value for this GetStockListRequestBody.
     * 
     * @param materials
     */
    public void setMaterials(java.lang.String[] materials) {
        this.materials = materials;
    }


    /**
     * Gets the minStockLevel value for this GetStockListRequestBody.
     * 
     * @return minStockLevel
     */
    public int getMinStockLevel() {
        return minStockLevel;
    }


    /**
     * Sets the minStockLevel value for this GetStockListRequestBody.
     * 
     * @param minStockLevel
     */
    public void setMinStockLevel(int minStockLevel) {
        this.minStockLevel = minStockLevel;
    }


    /**
     * Gets the outletsIn value for this GetStockListRequestBody.
     * 
     * @return outletsIn
     */
    public java.lang.String[] getOutletsIn() {
        return outletsIn;
    }


    /**
     * Sets the outletsIn value for this GetStockListRequestBody.
     * 
     * @param outletsIn
     */
    public void setOutletsIn(java.lang.String[] outletsIn) {
        this.outletsIn = outletsIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStockListRequestBody)) return false;
        GetStockListRequestBody other = (GetStockListRequestBody) obj;
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
            this.minStockLevel == other.getMinStockLevel() &&
            ((this.outletsIn==null && other.getOutletsIn()==null) || 
             (this.outletsIn!=null &&
              java.util.Arrays.equals(this.outletsIn, other.getOutletsIn())));
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
        _hashCode += getMinStockLevel();
        if (getOutletsIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutletsIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutletsIn(), i);
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
        new org.apache.axis.description.TypeDesc(GetStockListRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "GetStockListRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Materials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char18"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletsIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletsIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "char10"));
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
