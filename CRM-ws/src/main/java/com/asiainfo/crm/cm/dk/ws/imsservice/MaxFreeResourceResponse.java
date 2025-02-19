/**
 * MaxFreeResourceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class MaxFreeResourceResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.InnerBaseResponse  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.Long productSequenceId;

    private java.lang.Integer resourceId;

    private java.lang.Long resourceValue;

    private java.util.Calendar effectiveDate;

    public MaxFreeResourceResponse() {
    }

    public MaxFreeResourceResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.CbsErrorMsg errorMsg,
           com.asiainfo.crm.cm.dk.ws.imsservice.SPage sPage,
           java.lang.String phoneId,
           java.lang.Long productSequenceId,
           java.lang.Integer resourceId,
           java.lang.Long resourceValue,
           java.util.Calendar effectiveDate) {
        super(
            errorMsg,
            sPage);
        this.phoneId = phoneId;
        this.productSequenceId = productSequenceId;
        this.resourceId = resourceId;
        this.resourceValue = resourceValue;
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the phoneId value for this MaxFreeResourceResponse.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this MaxFreeResourceResponse.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the productSequenceId value for this MaxFreeResourceResponse.
     * 
     * @return productSequenceId
     */
    public java.lang.Long getProductSequenceId() {
        return productSequenceId;
    }


    /**
     * Sets the productSequenceId value for this MaxFreeResourceResponse.
     * 
     * @param productSequenceId
     */
    public void setProductSequenceId(java.lang.Long productSequenceId) {
        this.productSequenceId = productSequenceId;
    }


    /**
     * Gets the resourceId value for this MaxFreeResourceResponse.
     * 
     * @return resourceId
     */
    public java.lang.Integer getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this MaxFreeResourceResponse.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Integer resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the resourceValue value for this MaxFreeResourceResponse.
     * 
     * @return resourceValue
     */
    public java.lang.Long getResourceValue() {
        return resourceValue;
    }


    /**
     * Sets the resourceValue value for this MaxFreeResourceResponse.
     * 
     * @param resourceValue
     */
    public void setResourceValue(java.lang.Long resourceValue) {
        this.resourceValue = resourceValue;
    }


    /**
     * Gets the effectiveDate value for this MaxFreeResourceResponse.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this MaxFreeResourceResponse.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaxFreeResourceResponse)) return false;
        MaxFreeResourceResponse other = (MaxFreeResourceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.productSequenceId==null && other.getProductSequenceId()==null) || 
             (this.productSequenceId!=null &&
              this.productSequenceId.equals(other.getProductSequenceId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.resourceValue==null && other.getResourceValue()==null) || 
             (this.resourceValue!=null &&
              this.resourceValue.equals(other.getResourceValue()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getProductSequenceId() != null) {
            _hashCode += getProductSequenceId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getResourceValue() != null) {
            _hashCode += getResourceValue().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaxFreeResourceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSequenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSequenceId"));
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
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
