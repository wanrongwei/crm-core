/**
 * CheckTransactionStatusResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class CheckTransactionStatusResponseBody  implements java.io.Serializable {
    private java.lang.String deviceEnrollmentTransactionId;

    private java.lang.String statusCode;

    private java.lang.String completedOn;

    private java.lang.String respondedOn;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersCheck[] orders;

    private java.lang.String transactionId;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionErrorResponse[] checkTransactionErrorResponse;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    public CheckTransactionStatusResponseBody() {
    }

    public CheckTransactionStatusResponseBody(
           java.lang.String deviceEnrollmentTransactionId,
           java.lang.String statusCode,
           java.lang.String completedOn,
           java.lang.String respondedOn,
           com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersCheck[] orders,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionErrorResponse[] checkTransactionErrorResponse,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo,
           java.lang.String errorCode,
           java.lang.String errorMessage) {
           this.deviceEnrollmentTransactionId = deviceEnrollmentTransactionId;
           this.statusCode = statusCode;
           this.completedOn = completedOn;
           this.respondedOn = respondedOn;
           this.orders = orders;
           this.transactionId = transactionId;
           this.checkTransactionErrorResponse = checkTransactionErrorResponse;
           this.attrInfo = attrInfo;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the deviceEnrollmentTransactionId value for this CheckTransactionStatusResponseBody.
     * 
     * @return deviceEnrollmentTransactionId
     */
    public java.lang.String getDeviceEnrollmentTransactionId() {
        return deviceEnrollmentTransactionId;
    }


    /**
     * Sets the deviceEnrollmentTransactionId value for this CheckTransactionStatusResponseBody.
     * 
     * @param deviceEnrollmentTransactionId
     */
    public void setDeviceEnrollmentTransactionId(java.lang.String deviceEnrollmentTransactionId) {
        this.deviceEnrollmentTransactionId = deviceEnrollmentTransactionId;
    }


    /**
     * Gets the statusCode value for this CheckTransactionStatusResponseBody.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this CheckTransactionStatusResponseBody.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the completedOn value for this CheckTransactionStatusResponseBody.
     * 
     * @return completedOn
     */
    public java.lang.String getCompletedOn() {
        return completedOn;
    }


    /**
     * Sets the completedOn value for this CheckTransactionStatusResponseBody.
     * 
     * @param completedOn
     */
    public void setCompletedOn(java.lang.String completedOn) {
        this.completedOn = completedOn;
    }


    /**
     * Gets the respondedOn value for this CheckTransactionStatusResponseBody.
     * 
     * @return respondedOn
     */
    public java.lang.String getRespondedOn() {
        return respondedOn;
    }


    /**
     * Sets the respondedOn value for this CheckTransactionStatusResponseBody.
     * 
     * @param respondedOn
     */
    public void setRespondedOn(java.lang.String respondedOn) {
        this.respondedOn = respondedOn;
    }


    /**
     * Gets the orders value for this CheckTransactionStatusResponseBody.
     * 
     * @return orders
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersCheck[] getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this CheckTransactionStatusResponseBody.
     * 
     * @param orders
     */
    public void setOrders(com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersCheck[] orders) {
        this.orders = orders;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersCheck getOrders(int i) {
        return this.orders[i];
    }

    public void setOrders(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersCheck _value) {
        this.orders[i] = _value;
    }


    /**
     * Gets the transactionId value for this CheckTransactionStatusResponseBody.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CheckTransactionStatusResponseBody.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the checkTransactionErrorResponse value for this CheckTransactionStatusResponseBody.
     * 
     * @return checkTransactionErrorResponse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionErrorResponse[] getCheckTransactionErrorResponse() {
        return checkTransactionErrorResponse;
    }


    /**
     * Sets the checkTransactionErrorResponse value for this CheckTransactionStatusResponseBody.
     * 
     * @param checkTransactionErrorResponse
     */
    public void setCheckTransactionErrorResponse(com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionErrorResponse[] checkTransactionErrorResponse) {
        this.checkTransactionErrorResponse = checkTransactionErrorResponse;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionErrorResponse getCheckTransactionErrorResponse(int i) {
        return this.checkTransactionErrorResponse[i];
    }

    public void setCheckTransactionErrorResponse(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.CheckTransactionErrorResponse _value) {
        this.checkTransactionErrorResponse[i] = _value;
    }


    /**
     * Gets the attrInfo value for this CheckTransactionStatusResponseBody.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this CheckTransactionStatusResponseBody.
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


    /**
     * Gets the errorCode value for this CheckTransactionStatusResponseBody.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this CheckTransactionStatusResponseBody.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this CheckTransactionStatusResponseBody.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this CheckTransactionStatusResponseBody.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckTransactionStatusResponseBody)) return false;
        CheckTransactionStatusResponseBody other = (CheckTransactionStatusResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceEnrollmentTransactionId==null && other.getDeviceEnrollmentTransactionId()==null) || 
             (this.deviceEnrollmentTransactionId!=null &&
              this.deviceEnrollmentTransactionId.equals(other.getDeviceEnrollmentTransactionId()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.completedOn==null && other.getCompletedOn()==null) || 
             (this.completedOn!=null &&
              this.completedOn.equals(other.getCompletedOn()))) &&
            ((this.respondedOn==null && other.getRespondedOn()==null) || 
             (this.respondedOn!=null &&
              this.respondedOn.equals(other.getRespondedOn()))) &&
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              java.util.Arrays.equals(this.orders, other.getOrders()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.checkTransactionErrorResponse==null && other.getCheckTransactionErrorResponse()==null) || 
             (this.checkTransactionErrorResponse!=null &&
              java.util.Arrays.equals(this.checkTransactionErrorResponse, other.getCheckTransactionErrorResponse()))) &&
            ((this.attrInfo==null && other.getAttrInfo()==null) || 
             (this.attrInfo!=null &&
              java.util.Arrays.equals(this.attrInfo, other.getAttrInfo()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getDeviceEnrollmentTransactionId() != null) {
            _hashCode += getDeviceEnrollmentTransactionId().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getCompletedOn() != null) {
            _hashCode += getCompletedOn().hashCode();
        }
        if (getRespondedOn() != null) {
            _hashCode += getRespondedOn().hashCode();
        }
        if (getOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getCheckTransactionErrorResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCheckTransactionErrorResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCheckTransactionErrorResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckTransactionStatusResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "checkTransactionStatusResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceEnrollmentTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeviceEnrollmentTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompletedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RespondedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "OrdersCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkTransactionErrorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CheckTransactionErrorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "CheckTransactionErrorResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttrInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AttrInfo"));
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
