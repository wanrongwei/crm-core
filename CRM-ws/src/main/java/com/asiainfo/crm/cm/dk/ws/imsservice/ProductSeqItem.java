/**
 * ProductSeqItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class ProductSeqItem  implements java.io.Serializable {
    private java.lang.Long productId;

    private java.lang.Integer resourceId;

    private java.lang.Long resourceValue;

    private java.lang.Short operType;

    private java.lang.String resourceUnit;

    private java.lang.Short effectiveType;

    public ProductSeqItem() {
    }

    public ProductSeqItem(
           java.lang.Long productId,
           java.lang.Integer resourceId,
           java.lang.Long resourceValue,
           java.lang.Short operType,
           java.lang.String resourceUnit,
           java.lang.Short effectiveType) {
           this.productId = productId;
           this.resourceId = resourceId;
           this.resourceValue = resourceValue;
           this.operType = operType;
           this.resourceUnit = resourceUnit;
           this.effectiveType = effectiveType;
    }


    /**
     * Gets the productId value for this ProductSeqItem.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductSeqItem.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the resourceId value for this ProductSeqItem.
     * 
     * @return resourceId
     */
    public java.lang.Integer getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ProductSeqItem.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Integer resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the resourceValue value for this ProductSeqItem.
     * 
     * @return resourceValue
     */
    public java.lang.Long getResourceValue() {
        return resourceValue;
    }


    /**
     * Sets the resourceValue value for this ProductSeqItem.
     * 
     * @param resourceValue
     */
    public void setResourceValue(java.lang.Long resourceValue) {
        this.resourceValue = resourceValue;
    }


    /**
     * Gets the operType value for this ProductSeqItem.
     * 
     * @return operType
     */
    public java.lang.Short getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this ProductSeqItem.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Short operType) {
        this.operType = operType;
    }


    /**
     * Gets the resourceUnit value for this ProductSeqItem.
     * 
     * @return resourceUnit
     */
    public java.lang.String getResourceUnit() {
        return resourceUnit;
    }


    /**
     * Sets the resourceUnit value for this ProductSeqItem.
     * 
     * @param resourceUnit
     */
    public void setResourceUnit(java.lang.String resourceUnit) {
        this.resourceUnit = resourceUnit;
    }


    /**
     * Gets the effectiveType value for this ProductSeqItem.
     * 
     * @return effectiveType
     */
    public java.lang.Short getEffectiveType() {
        return effectiveType;
    }


    /**
     * Sets the effectiveType value for this ProductSeqItem.
     * 
     * @param effectiveType
     */
    public void setEffectiveType(java.lang.Short effectiveType) {
        this.effectiveType = effectiveType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSeqItem)) return false;
        ProductSeqItem other = (ProductSeqItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.resourceValue==null && other.getResourceValue()==null) || 
             (this.resourceValue!=null &&
              this.resourceValue.equals(other.getResourceValue()))) &&
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType()))) &&
            ((this.resourceUnit==null && other.getResourceUnit()==null) || 
             (this.resourceUnit!=null &&
              this.resourceUnit.equals(other.getResourceUnit()))) &&
            ((this.effectiveType==null && other.getEffectiveType()==null) || 
             (this.effectiveType!=null &&
              this.effectiveType.equals(other.getEffectiveType())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getResourceValue() != null) {
            _hashCode += getResourceValue().hashCode();
        }
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        if (getResourceUnit() != null) {
            _hashCode += getResourceUnit().hashCode();
        }
        if (getEffectiveType() != null) {
            _hashCode += getEffectiveType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSeqItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productSeqItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
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
