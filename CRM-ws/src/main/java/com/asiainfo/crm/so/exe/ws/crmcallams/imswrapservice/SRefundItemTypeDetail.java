/**
 * SRefundItemTypeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SRefundItemTypeDetail  implements java.io.Serializable {
    private java.lang.Integer itemType;

    private java.lang.Long refundAmount;

    private java.lang.Long minValue;

    private java.lang.Long maxValue;

    private java.lang.Integer measureId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalnceTrace[] pocketTraceDetails;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSumRefundDetail[] sumPocketTraces;

    public SRefundItemTypeDetail() {
    }

    public SRefundItemTypeDetail(
           java.lang.Integer itemType,
           java.lang.Long refundAmount,
           java.lang.Long minValue,
           java.lang.Long maxValue,
           java.lang.Integer measureId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalnceTrace[] pocketTraceDetails,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSumRefundDetail[] sumPocketTraces) {
           this.itemType = itemType;
           this.refundAmount = refundAmount;
           this.minValue = minValue;
           this.maxValue = maxValue;
           this.measureId = measureId;
           this.pocketTraceDetails = pocketTraceDetails;
           this.sumPocketTraces = sumPocketTraces;
    }


    /**
     * Gets the itemType value for this SRefundItemTypeDetail.
     * 
     * @return itemType
     */
    public java.lang.Integer getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SRefundItemTypeDetail.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Integer itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the refundAmount value for this SRefundItemTypeDetail.
     * 
     * @return refundAmount
     */
    public java.lang.Long getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this SRefundItemTypeDetail.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.lang.Long refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the minValue value for this SRefundItemTypeDetail.
     * 
     * @return minValue
     */
    public java.lang.Long getMinValue() {
        return minValue;
    }


    /**
     * Sets the minValue value for this SRefundItemTypeDetail.
     * 
     * @param minValue
     */
    public void setMinValue(java.lang.Long minValue) {
        this.minValue = minValue;
    }


    /**
     * Gets the maxValue value for this SRefundItemTypeDetail.
     * 
     * @return maxValue
     */
    public java.lang.Long getMaxValue() {
        return maxValue;
    }


    /**
     * Sets the maxValue value for this SRefundItemTypeDetail.
     * 
     * @param maxValue
     */
    public void setMaxValue(java.lang.Long maxValue) {
        this.maxValue = maxValue;
    }


    /**
     * Gets the measureId value for this SRefundItemTypeDetail.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SRefundItemTypeDetail.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the pocketTraceDetails value for this SRefundItemTypeDetail.
     * 
     * @return pocketTraceDetails
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalnceTrace[] getPocketTraceDetails() {
        return pocketTraceDetails;
    }


    /**
     * Sets the pocketTraceDetails value for this SRefundItemTypeDetail.
     * 
     * @param pocketTraceDetails
     */
    public void setPocketTraceDetails(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalnceTrace[] pocketTraceDetails) {
        this.pocketTraceDetails = pocketTraceDetails;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalnceTrace getPocketTraceDetails(int i) {
        return this.pocketTraceDetails[i];
    }

    public void setPocketTraceDetails(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundBalnceTrace _value) {
        this.pocketTraceDetails[i] = _value;
    }


    /**
     * Gets the sumPocketTraces value for this SRefundItemTypeDetail.
     * 
     * @return sumPocketTraces
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSumRefundDetail[] getSumPocketTraces() {
        return sumPocketTraces;
    }


    /**
     * Sets the sumPocketTraces value for this SRefundItemTypeDetail.
     * 
     * @param sumPocketTraces
     */
    public void setSumPocketTraces(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSumRefundDetail[] sumPocketTraces) {
        this.sumPocketTraces = sumPocketTraces;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSumRefundDetail getSumPocketTraces(int i) {
        return this.sumPocketTraces[i];
    }

    public void setSumPocketTraces(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSumRefundDetail _value) {
        this.sumPocketTraces[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRefundItemTypeDetail)) return false;
        SRefundItemTypeDetail other = (SRefundItemTypeDetail) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.minValue==null && other.getMinValue()==null) || 
             (this.minValue!=null &&
              this.minValue.equals(other.getMinValue()))) &&
            ((this.maxValue==null && other.getMaxValue()==null) || 
             (this.maxValue!=null &&
              this.maxValue.equals(other.getMaxValue()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.pocketTraceDetails==null && other.getPocketTraceDetails()==null) || 
             (this.pocketTraceDetails!=null &&
              java.util.Arrays.equals(this.pocketTraceDetails, other.getPocketTraceDetails()))) &&
            ((this.sumPocketTraces==null && other.getSumPocketTraces()==null) || 
             (this.sumPocketTraces!=null &&
              java.util.Arrays.equals(this.sumPocketTraces, other.getSumPocketTraces())));
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
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getMinValue() != null) {
            _hashCode += getMinValue().hashCode();
        }
        if (getMaxValue() != null) {
            _hashCode += getMaxValue().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getPocketTraceDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPocketTraceDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPocketTraceDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSumPocketTraces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSumPocketTraces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSumPocketTraces(), i);
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
        new org.apache.axis.description.TypeDesc(SRefundItemTypeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundItemTypeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxValue"));
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
        elemField.setFieldName("pocketTraceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pocketTraceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundBalnceTrace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumPocketTraces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sumPocketTraces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSumRefundDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
