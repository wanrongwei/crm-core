/**
 * YttStockListMaterials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YttStockListMaterials  implements java.io.Serializable {
    private java.lang.String material;

    private java.math.BigDecimal actualStock;

    private java.lang.String unit;

    public YttStockListMaterials() {
    }

    public YttStockListMaterials(
           java.lang.String material,
           java.math.BigDecimal actualStock,
           java.lang.String unit) {
           this.material = material;
           this.actualStock = actualStock;
           this.unit = unit;
    }


    /**
     * Gets the material value for this YttStockListMaterials.
     * 
     * @return material
     */
    public java.lang.String getMaterial() {
        return material;
    }


    /**
     * Sets the material value for this YttStockListMaterials.
     * 
     * @param material
     */
    public void setMaterial(java.lang.String material) {
        this.material = material;
    }


    /**
     * Gets the actualStock value for this YttStockListMaterials.
     * 
     * @return actualStock
     */
    public java.math.BigDecimal getActualStock() {
        return actualStock;
    }


    /**
     * Sets the actualStock value for this YttStockListMaterials.
     * 
     * @param actualStock
     */
    public void setActualStock(java.math.BigDecimal actualStock) {
        this.actualStock = actualStock;
    }


    /**
     * Gets the unit value for this YttStockListMaterials.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this YttStockListMaterials.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YttStockListMaterials)) return false;
        YttStockListMaterials other = (YttStockListMaterials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.material==null && other.getMaterial()==null) || 
             (this.material!=null &&
              this.material.equals(other.getMaterial()))) &&
            ((this.actualStock==null && other.getActualStock()==null) || 
             (this.actualStock!=null &&
              this.actualStock.equals(other.getActualStock()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        if (getMaterial() != null) {
            _hashCode += getMaterial().hashCode();
        }
        if (getActualStock() != null) {
            _hashCode += getActualStock().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YttStockListMaterials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttStockListMaterials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("material");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualStock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActualStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Unit"));
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
