/**
 * YwsStockListOutlet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsStockListOutlet  implements java.io.Serializable {
    private java.lang.String outletId;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YttStockListMaterials materials;

    public YwsStockListOutlet() {
    }

    public YwsStockListOutlet(
           java.lang.String outletId,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YttStockListMaterials materials) {
           this.outletId = outletId;
           this.materials = materials;
    }


    /**
     * Gets the outletId value for this YwsStockListOutlet.
     * 
     * @return outletId
     */
    public java.lang.String getOutletId() {
        return outletId;
    }


    /**
     * Sets the outletId value for this YwsStockListOutlet.
     * 
     * @param outletId
     */
    public void setOutletId(java.lang.String outletId) {
        this.outletId = outletId;
    }


    /**
     * Gets the materials value for this YwsStockListOutlet.
     * 
     * @return materials
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YttStockListMaterials getMaterials() {
        return materials;
    }


    /**
     * Sets the materials value for this YwsStockListOutlet.
     * 
     * @param materials
     */
    public void setMaterials(com.asiainfo.crm.inter.exe.webservice.client.sap.YttStockListMaterials materials) {
        this.materials = materials;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsStockListOutlet)) return false;
        YwsStockListOutlet other = (YwsStockListOutlet) obj;
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
            ((this.materials==null && other.getMaterials()==null) || 
             (this.materials!=null &&
              this.materials.equals(other.getMaterials())));
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
        if (getMaterials() != null) {
            _hashCode += getMaterials().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsStockListOutlet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsStockListOutlet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Materials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YttStockListMaterials"));
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
