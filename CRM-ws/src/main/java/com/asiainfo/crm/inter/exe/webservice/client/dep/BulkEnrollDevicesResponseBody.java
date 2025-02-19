/**
 * BulkEnrollDevicesResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class BulkEnrollDevicesResponseBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDevicesResponse enrollDevicesResponse;

    private java.lang.String deviceEnrollmentTransactionId;

    private java.lang.String transactionId;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDeviceErrorResponse[] enrollDeviceErrorResponse;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public BulkEnrollDevicesResponseBody() {
    }

    public BulkEnrollDevicesResponseBody(
           com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDevicesResponse enrollDevicesResponse,
           java.lang.String deviceEnrollmentTransactionId,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDeviceErrorResponse[] enrollDeviceErrorResponse,
           java.lang.String errorCode,
           java.lang.String errorMessage,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.enrollDevicesResponse = enrollDevicesResponse;
           this.deviceEnrollmentTransactionId = deviceEnrollmentTransactionId;
           this.transactionId = transactionId;
           this.enrollDeviceErrorResponse = enrollDeviceErrorResponse;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the enrollDevicesResponse value for this BulkEnrollDevicesResponseBody.
     * 
     * @return enrollDevicesResponse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDevicesResponse getEnrollDevicesResponse() {
        return enrollDevicesResponse;
    }


    /**
     * Sets the enrollDevicesResponse value for this BulkEnrollDevicesResponseBody.
     * 
     * @param enrollDevicesResponse
     */
    public void setEnrollDevicesResponse(com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDevicesResponse enrollDevicesResponse) {
        this.enrollDevicesResponse = enrollDevicesResponse;
    }


    /**
     * Gets the deviceEnrollmentTransactionId value for this BulkEnrollDevicesResponseBody.
     * 
     * @return deviceEnrollmentTransactionId
     */
    public java.lang.String getDeviceEnrollmentTransactionId() {
        return deviceEnrollmentTransactionId;
    }


    /**
     * Sets the deviceEnrollmentTransactionId value for this BulkEnrollDevicesResponseBody.
     * 
     * @param deviceEnrollmentTransactionId
     */
    public void setDeviceEnrollmentTransactionId(java.lang.String deviceEnrollmentTransactionId) {
        this.deviceEnrollmentTransactionId = deviceEnrollmentTransactionId;
    }


    /**
     * Gets the transactionId value for this BulkEnrollDevicesResponseBody.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BulkEnrollDevicesResponseBody.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the enrollDeviceErrorResponse value for this BulkEnrollDevicesResponseBody.
     * 
     * @return enrollDeviceErrorResponse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDeviceErrorResponse[] getEnrollDeviceErrorResponse() {
        return enrollDeviceErrorResponse;
    }


    /**
     * Sets the enrollDeviceErrorResponse value for this BulkEnrollDevicesResponseBody.
     * 
     * @param enrollDeviceErrorResponse
     */
    public void setEnrollDeviceErrorResponse(com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDeviceErrorResponse[] enrollDeviceErrorResponse) {
        this.enrollDeviceErrorResponse = enrollDeviceErrorResponse;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDeviceErrorResponse getEnrollDeviceErrorResponse(int i) {
        return this.enrollDeviceErrorResponse[i];
    }

    public void setEnrollDeviceErrorResponse(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.EnrollDeviceErrorResponse _value) {
        this.enrollDeviceErrorResponse[i] = _value;
    }


    /**
     * Gets the errorCode value for this BulkEnrollDevicesResponseBody.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this BulkEnrollDevicesResponseBody.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this BulkEnrollDevicesResponseBody.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this BulkEnrollDevicesResponseBody.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the attrInfo value for this BulkEnrollDevicesResponseBody.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this BulkEnrollDevicesResponseBody.
     * 
     * @param attrInfo
     */
    public void setAttrInfo(com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
        this.attrInfo = attrInfo;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo getAttrInfo(int i) {
        return this.attrInfo[i];
    }

    public void setAttrInfo(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo _value) {
        this.attrInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkEnrollDevicesResponseBody)) return false;
        BulkEnrollDevicesResponseBody other = (BulkEnrollDevicesResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enrollDevicesResponse==null && other.getEnrollDevicesResponse()==null) || 
             (this.enrollDevicesResponse!=null &&
              this.enrollDevicesResponse.equals(other.getEnrollDevicesResponse()))) &&
            ((this.deviceEnrollmentTransactionId==null && other.getDeviceEnrollmentTransactionId()==null) || 
             (this.deviceEnrollmentTransactionId!=null &&
              this.deviceEnrollmentTransactionId.equals(other.getDeviceEnrollmentTransactionId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.enrollDeviceErrorResponse==null && other.getEnrollDeviceErrorResponse()==null) || 
             (this.enrollDeviceErrorResponse!=null &&
              java.util.Arrays.equals(this.enrollDeviceErrorResponse, other.getEnrollDeviceErrorResponse()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.attrInfo==null && other.getAttrInfo()==null) || 
             (this.attrInfo!=null &&
              java.util.Arrays.equals(this.attrInfo, other.getAttrInfo())));
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
        if (getEnrollDevicesResponse() != null) {
            _hashCode += getEnrollDevicesResponse().hashCode();
        }
        if (getDeviceEnrollmentTransactionId() != null) {
            _hashCode += getDeviceEnrollmentTransactionId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getEnrollDeviceErrorResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnrollDeviceErrorResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnrollDeviceErrorResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getAttrInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttrInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttrInfo(), i);
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
        new org.apache.axis.description.TypeDesc(BulkEnrollDevicesResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "bulkEnrollDevicesResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollDevicesResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnrollDevicesResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "EnrollDevicesResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceEnrollmentTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeviceEnrollmentTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollDeviceErrorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnrollDeviceErrorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "EnrollDeviceErrorResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttrInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AttrInfo"));
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
