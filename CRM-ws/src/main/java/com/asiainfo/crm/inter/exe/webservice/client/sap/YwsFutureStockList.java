/**
 * YwsFutureStockList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsFutureStockList  implements java.io.Serializable {
    private java.lang.String material;

    private java.lang.String matDescr;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockOutlet[] outlets;

    public YwsFutureStockList() {
    }

    public YwsFutureStockList(
           java.lang.String material,
           java.lang.String matDescr,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockOutlet[] outlets) {
           this.material = material;
           this.matDescr = matDescr;
           this.outlets = outlets;
    }


    /**
     * Gets the material value for this YwsFutureStockList.
     * 
     * @return material
     */
    public java.lang.String getMaterial() {
        return material;
    }


    /**
     * Sets the material value for this YwsFutureStockList.
     * 
     * @param material
     */
    public void setMaterial(java.lang.String material) {
        this.material = material;
    }


    /**
     * Gets the matDescr value for this YwsFutureStockList.
     * 
     * @return matDescr
     */
    public java.lang.String getMatDescr() {
        return matDescr;
    }


    /**
     * Sets the matDescr value for this YwsFutureStockList.
     * 
     * @param matDescr
     */
    public void setMatDescr(java.lang.String matDescr) {
        this.matDescr = matDescr;
    }


    /**
     * Gets the outlets value for this YwsFutureStockList.
     * 
     * @return outlets
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockOutlet[] getOutlets() {
        return outlets;
    }


    /**
     * Sets the outlets value for this YwsFutureStockList.
     * 
     * @param outlets
     */
    public void setOutlets(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsFutureStockOutlet[] outlets) {
        this.outlets = outlets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsFutureStockList)) return false;
        YwsFutureStockList other = (YwsFutureStockList) obj;
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
            ((this.matDescr==null && other.getMatDescr()==null) || 
             (this.matDescr!=null &&
              this.matDescr.equals(other.getMatDescr()))) &&
            ((this.outlets==null && other.getOutlets()==null) || 
             (this.outlets!=null &&
              java.util.Arrays.equals(this.outlets, other.getOutlets())));
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
        if (getMatDescr() != null) {
            _hashCode += getMatDescr().hashCode();
        }
        if (getOutlets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutlets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutlets(), i);
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
        new org.apache.axis.description.TypeDesc(YwsFutureStockList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("material");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Material"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MatDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outlets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Outlets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStockOutlet"));
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
