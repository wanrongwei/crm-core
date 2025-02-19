/**
 * DoQueryDDFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryDDFeeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer valueType;

    private java.lang.Long value;

    private java.lang.Long min;

    private java.lang.Long max;

    private java.lang.Integer measureId;

    private java.lang.String measureName;

    public DoQueryDDFeeResponse() {
    }

    public DoQueryDDFeeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Integer valueType,
           java.lang.Long value,
           java.lang.Long min,
           java.lang.Long max,
           java.lang.Integer measureId,
           java.lang.String measureName) {
        super(
            responseHead);
        this.valueType = valueType;
        this.value = value;
        this.min = min;
        this.max = max;
        this.measureId = measureId;
        this.measureName = measureName;
    }


    /**
     * Gets the valueType value for this DoQueryDDFeeResponse.
     * 
     * @return valueType
     */
    public java.lang.Integer getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this DoQueryDDFeeResponse.
     * 
     * @param valueType
     */
    public void setValueType(java.lang.Integer valueType) {
        this.valueType = valueType;
    }


    /**
     * Gets the value value for this DoQueryDDFeeResponse.
     * 
     * @return value
     */
    public java.lang.Long getValue() {
        return value;
    }


    /**
     * Sets the value value for this DoQueryDDFeeResponse.
     * 
     * @param value
     */
    public void setValue(java.lang.Long value) {
        this.value = value;
    }


    /**
     * Gets the min value for this DoQueryDDFeeResponse.
     * 
     * @return min
     */
    public java.lang.Long getMin() {
        return min;
    }


    /**
     * Sets the min value for this DoQueryDDFeeResponse.
     * 
     * @param min
     */
    public void setMin(java.lang.Long min) {
        this.min = min;
    }


    /**
     * Gets the max value for this DoQueryDDFeeResponse.
     * 
     * @return max
     */
    public java.lang.Long getMax() {
        return max;
    }


    /**
     * Sets the max value for this DoQueryDDFeeResponse.
     * 
     * @param max
     */
    public void setMax(java.lang.Long max) {
        this.max = max;
    }


    /**
     * Gets the measureId value for this DoQueryDDFeeResponse.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoQueryDDFeeResponse.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the measureName value for this DoQueryDDFeeResponse.
     * 
     * @return measureName
     */
    public java.lang.String getMeasureName() {
        return measureName;
    }


    /**
     * Sets the measureName value for this DoQueryDDFeeResponse.
     * 
     * @param measureName
     */
    public void setMeasureName(java.lang.String measureName) {
        this.measureName = measureName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryDDFeeResponse)) return false;
        DoQueryDDFeeResponse other = (DoQueryDDFeeResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.valueType==null && other.getValueType()==null) || 
             (this.valueType!=null &&
              this.valueType.equals(other.getValueType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.measureName==null && other.getMeasureName()==null) || 
             (this.measureName!=null &&
              this.measureName.equals(other.getMeasureName())));
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
        if (getValueType() != null) {
            _hashCode += getValueType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getMeasureName() != null) {
            _hashCode += getMeasureName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryDDFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryDDFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureName"));
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
