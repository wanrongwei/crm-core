/**
 * PreCheckQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.ott;

public class PreCheckQuery  implements java.io.Serializable {
    private java.lang.String customerId;

    private java.lang.String subscriberId;

    private java.lang.String vendor;

    private java.lang.String productLine;

    private java.lang.String productVariant;

    private java.lang.String extend;

    public PreCheckQuery() {
    }

    public PreCheckQuery(
           java.lang.String customerId,
           java.lang.String subscriberId,
           java.lang.String vendor,
           java.lang.String productLine,
           java.lang.String productVariant,
           java.lang.String extend) {
           this.customerId = customerId;
           this.subscriberId = subscriberId;
           this.vendor = vendor;
           this.productLine = productLine;
           this.productVariant = productVariant;
           this.extend = extend;
    }


    /**
     * Gets the customerId value for this PreCheckQuery.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this PreCheckQuery.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the subscriberId value for this PreCheckQuery.
     * 
     * @return subscriberId
     */
    public java.lang.String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this PreCheckQuery.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(java.lang.String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the vendor value for this PreCheckQuery.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this PreCheckQuery.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the productLine value for this PreCheckQuery.
     * 
     * @return productLine
     */
    public java.lang.String getProductLine() {
        return productLine;
    }


    /**
     * Sets the productLine value for this PreCheckQuery.
     * 
     * @param productLine
     */
    public void setProductLine(java.lang.String productLine) {
        this.productLine = productLine;
    }


    /**
     * Gets the productVariant value for this PreCheckQuery.
     * 
     * @return productVariant
     */
    public java.lang.String getProductVariant() {
        return productVariant;
    }


    /**
     * Sets the productVariant value for this PreCheckQuery.
     * 
     * @param productVariant
     */
    public void setProductVariant(java.lang.String productVariant) {
        this.productVariant = productVariant;
    }


    /**
     * Gets the extend value for this PreCheckQuery.
     * 
     * @return extend
     */
    public java.lang.String getExtend() {
        return extend;
    }


    /**
     * Sets the extend value for this PreCheckQuery.
     * 
     * @param extend
     */
    public void setExtend(java.lang.String extend) {
        this.extend = extend;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreCheckQuery)) return false;
        PreCheckQuery other = (PreCheckQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.productLine==null && other.getProductLine()==null) || 
             (this.productLine!=null &&
              this.productLine.equals(other.getProductLine()))) &&
            ((this.productVariant==null && other.getProductVariant()==null) || 
             (this.productVariant!=null &&
              this.productVariant.equals(other.getProductVariant()))) &&
            ((this.extend==null && other.getExtend()==null) || 
             (this.extend!=null &&
              this.extend.equals(other.getExtend())));
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
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getProductLine() != null) {
            _hashCode += getProductLine().hashCode();
        }
        if (getProductVariant() != null) {
            _hashCode += getProductVariant().hashCode();
        }
        if (getExtend() != null) {
            _hashCode += getExtend().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreCheckQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "preCheckQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
