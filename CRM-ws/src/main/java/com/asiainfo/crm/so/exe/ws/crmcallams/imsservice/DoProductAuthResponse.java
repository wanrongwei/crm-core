/**
 * DoProductAuthResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class DoProductAuthResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Short deductResult;

    private java.lang.Long recurringFee;

    private java.lang.Integer measureId;

    public DoProductAuthResponse() {
    }

    public DoProductAuthResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ResponseHead responseHead,
           java.lang.Short deductResult,
           java.lang.Long recurringFee,
           java.lang.Integer measureId) {
        super(
            responseHead);
        this.deductResult = deductResult;
        this.recurringFee = recurringFee;
        this.measureId = measureId;
    }


    /**
     * Gets the deductResult value for this DoProductAuthResponse.
     * 
     * @return deductResult
     */
    public java.lang.Short getDeductResult() {
        return deductResult;
    }


    /**
     * Sets the deductResult value for this DoProductAuthResponse.
     * 
     * @param deductResult
     */
    public void setDeductResult(java.lang.Short deductResult) {
        this.deductResult = deductResult;
    }


    /**
     * Gets the recurringFee value for this DoProductAuthResponse.
     * 
     * @return recurringFee
     */
    public java.lang.Long getRecurringFee() {
        return recurringFee;
    }


    /**
     * Sets the recurringFee value for this DoProductAuthResponse.
     * 
     * @param recurringFee
     */
    public void setRecurringFee(java.lang.Long recurringFee) {
        this.recurringFee = recurringFee;
    }


    /**
     * Gets the measureId value for this DoProductAuthResponse.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoProductAuthResponse.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoProductAuthResponse)) return false;
        DoProductAuthResponse other = (DoProductAuthResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deductResult==null && other.getDeductResult()==null) || 
             (this.deductResult!=null &&
              this.deductResult.equals(other.getDeductResult()))) &&
            ((this.recurringFee==null && other.getRecurringFee()==null) || 
             (this.recurringFee!=null &&
              this.recurringFee.equals(other.getRecurringFee()))) &&
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
        if (getDeductResult() != null) {
            _hashCode += getDeductResult().hashCode();
        }
        if (getRecurringFee() != null) {
            _hashCode += getRecurringFee().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoProductAuthResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doProductAuthResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringFee"));
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
