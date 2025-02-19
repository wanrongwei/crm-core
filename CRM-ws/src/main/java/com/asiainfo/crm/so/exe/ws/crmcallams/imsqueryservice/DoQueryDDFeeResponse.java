/**
 * DoQueryDDFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class DoQueryDDFeeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SddFee[] sDDFeeList;

    private java.lang.Long min;

    private java.lang.Long max;

    private java.lang.Integer measureId;

    public DoQueryDDFeeResponse() {
    }

    public DoQueryDDFeeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SddFee[] sDDFeeList,
           java.lang.Long min,
           java.lang.Long max,
           java.lang.Integer measureId) {
        super(
            responseHead);
        this.sDDFeeList = sDDFeeList;
        this.min = min;
        this.max = max;
        this.measureId = measureId;
    }


    /**
     * Gets the sDDFeeList value for this DoQueryDDFeeResponse.
     * 
     * @return sDDFeeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SddFee[] getSDDFeeList() {
        return sDDFeeList;
    }


    /**
     * Sets the sDDFeeList value for this DoQueryDDFeeResponse.
     * 
     * @param sDDFeeList
     */
    public void setSDDFeeList(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SddFee[] sDDFeeList) {
        this.sDDFeeList = sDDFeeList;
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DoQueryDDFeeResponse)) return false;
        DoQueryDDFeeResponse other = (DoQueryDDFeeResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sDDFeeList==null && other.getSDDFeeList()==null) || 
             (this.sDDFeeList!=null &&
              java.util.Arrays.equals(this.sDDFeeList, other.getSDDFeeList()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
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
        if (getSDDFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSDDFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSDDFeeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryDDFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryDDFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDDFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sDDFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sddFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sDDFee"));
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
