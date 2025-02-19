/**
 * ProcessResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class ProcessResponse  implements java.io.Serializable {
    private java.lang.String operation;

    private java.lang.String transactionId;

    private java.lang.String merchantId;

    private java.lang.String responseCode;

    private java.lang.String responseSource;

    private java.lang.String responseText;

    private java.lang.String authorizationId;

    private java.util.Calendar executionTime;

    public ProcessResponse() {
    }

    public ProcessResponse(
           java.lang.String operation,
           java.lang.String transactionId,
           java.lang.String merchantId,
           java.lang.String responseCode,
           java.lang.String responseSource,
           java.lang.String responseText,
           java.lang.String authorizationId,
           java.util.Calendar executionTime) {
           this.operation = operation;
           this.transactionId = transactionId;
           this.merchantId = merchantId;
           this.responseCode = responseCode;
           this.responseSource = responseSource;
           this.responseText = responseText;
           this.authorizationId = authorizationId;
           this.executionTime = executionTime;
    }


    /**
     * Gets the operation value for this ProcessResponse.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this ProcessResponse.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the transactionId value for this ProcessResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ProcessResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the merchantId value for this ProcessResponse.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ProcessResponse.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the responseCode value for this ProcessResponse.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this ProcessResponse.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseSource value for this ProcessResponse.
     * 
     * @return responseSource
     */
    public java.lang.String getResponseSource() {
        return responseSource;
    }


    /**
     * Sets the responseSource value for this ProcessResponse.
     * 
     * @param responseSource
     */
    public void setResponseSource(java.lang.String responseSource) {
        this.responseSource = responseSource;
    }


    /**
     * Gets the responseText value for this ProcessResponse.
     * 
     * @return responseText
     */
    public java.lang.String getResponseText() {
        return responseText;
    }


    /**
     * Sets the responseText value for this ProcessResponse.
     * 
     * @param responseText
     */
    public void setResponseText(java.lang.String responseText) {
        this.responseText = responseText;
    }


    /**
     * Gets the authorizationId value for this ProcessResponse.
     * 
     * @return authorizationId
     */
    public java.lang.String getAuthorizationId() {
        return authorizationId;
    }


    /**
     * Sets the authorizationId value for this ProcessResponse.
     * 
     * @param authorizationId
     */
    public void setAuthorizationId(java.lang.String authorizationId) {
        this.authorizationId = authorizationId;
    }


    /**
     * Gets the executionTime value for this ProcessResponse.
     * 
     * @return executionTime
     */
    public java.util.Calendar getExecutionTime() {
        return executionTime;
    }


    /**
     * Sets the executionTime value for this ProcessResponse.
     * 
     * @param executionTime
     */
    public void setExecutionTime(java.util.Calendar executionTime) {
        this.executionTime = executionTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessResponse)) return false;
        ProcessResponse other = (ProcessResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseSource==null && other.getResponseSource()==null) || 
             (this.responseSource!=null &&
              this.responseSource.equals(other.getResponseSource()))) &&
            ((this.responseText==null && other.getResponseText()==null) || 
             (this.responseText!=null &&
              this.responseText.equals(other.getResponseText()))) &&
            ((this.authorizationId==null && other.getAuthorizationId()==null) || 
             (this.authorizationId!=null &&
              this.authorizationId.equals(other.getAuthorizationId()))) &&
            ((this.executionTime==null && other.getExecutionTime()==null) || 
             (this.executionTime!=null &&
              this.executionTime.equals(other.getExecutionTime())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseSource() != null) {
            _hashCode += getResponseSource().hashCode();
        }
        if (getResponseText() != null) {
            _hashCode += getResponseText().hashCode();
        }
        if (getAuthorizationId() != null) {
            _hashCode += getAuthorizationId().hashCode();
        }
        if (getExecutionTime() != null) {
            _hashCode += getExecutionTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "processResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
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
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthorizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExecutionTime"));
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
