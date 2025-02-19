/**
 * IrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class IrResponse  implements java.io.Serializable {
    private java.lang.Integer operator_id;

    private java.lang.String operator_code;

    private java.lang.String busi_service_code;

    private java.lang.Integer service_sequence_id;

    public IrResponse() {
    }

    public IrResponse(
           java.lang.Integer operator_id,
           java.lang.String operator_code,
           java.lang.String busi_service_code,
           java.lang.Integer service_sequence_id) {
           this.operator_id = operator_id;
           this.operator_code = operator_code;
           this.busi_service_code = busi_service_code;
           this.service_sequence_id = service_sequence_id;
    }


    /**
     * Gets the operator_id value for this IrResponse.
     * 
     * @return operator_id
     */
    public java.lang.Integer getOperator_id() {
        return operator_id;
    }


    /**
     * Sets the operator_id value for this IrResponse.
     * 
     * @param operator_id
     */
    public void setOperator_id(java.lang.Integer operator_id) {
        this.operator_id = operator_id;
    }


    /**
     * Gets the operator_code value for this IrResponse.
     * 
     * @return operator_code
     */
    public java.lang.String getOperator_code() {
        return operator_code;
    }


    /**
     * Sets the operator_code value for this IrResponse.
     * 
     * @param operator_code
     */
    public void setOperator_code(java.lang.String operator_code) {
        this.operator_code = operator_code;
    }


    /**
     * Gets the busi_service_code value for this IrResponse.
     * 
     * @return busi_service_code
     */
    public java.lang.String getBusi_service_code() {
        return busi_service_code;
    }


    /**
     * Sets the busi_service_code value for this IrResponse.
     * 
     * @param busi_service_code
     */
    public void setBusi_service_code(java.lang.String busi_service_code) {
        this.busi_service_code = busi_service_code;
    }


    /**
     * Gets the service_sequence_id value for this IrResponse.
     * 
     * @return service_sequence_id
     */
    public java.lang.Integer getService_sequence_id() {
        return service_sequence_id;
    }


    /**
     * Sets the service_sequence_id value for this IrResponse.
     * 
     * @param service_sequence_id
     */
    public void setService_sequence_id(java.lang.Integer service_sequence_id) {
        this.service_sequence_id = service_sequence_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof IrResponse)) return false;
        IrResponse other = (IrResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operator_id==null && other.getOperator_id()==null) || 
             (this.operator_id!=null &&
              this.operator_id.equals(other.getOperator_id()))) &&
            ((this.operator_code==null && other.getOperator_code()==null) || 
             (this.operator_code!=null &&
              this.operator_code.equals(other.getOperator_code()))) &&
            ((this.busi_service_code==null && other.getBusi_service_code()==null) || 
             (this.busi_service_code!=null &&
              this.busi_service_code.equals(other.getBusi_service_code()))) &&
            ((this.service_sequence_id==null && other.getService_sequence_id()==null) || 
             (this.service_sequence_id!=null &&
              this.service_sequence_id.equals(other.getService_sequence_id())));
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
        if (getOperator_id() != null) {
            _hashCode += getOperator_id().hashCode();
        }
        if (getOperator_code() != null) {
            _hashCode += getOperator_code().hashCode();
        }
        if (getBusi_service_code() != null) {
            _hashCode += getBusi_service_code().hashCode();
        }
        if (getService_sequence_id() != null) {
            _hashCode += getService_sequence_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "irResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busi_service_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busi_service_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_sequence_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_sequence_id"));
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
