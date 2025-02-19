/**
 * PlaceOrderEventResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.ott;

public class PlaceOrderEventResponseBody  implements java.io.Serializable {
    private java.lang.String uapiEventId;

    private java.lang.String status;

    private java.lang.String description;

    private java.lang.String uapi_response_code;

    public PlaceOrderEventResponseBody() {
    }

    public PlaceOrderEventResponseBody(
           java.lang.String uapiEventId,
           java.lang.String status,
           java.lang.String description,
           java.lang.String uapi_response_code) {
           this.uapiEventId = uapiEventId;
           this.status = status;
           this.description = description;
           this.uapi_response_code = uapi_response_code;
    }


    /**
     * Gets the uapiEventId value for this PlaceOrderEventResponseBody.
     * 
     * @return uapiEventId
     */
    public java.lang.String getUapiEventId() {
        return uapiEventId;
    }


    /**
     * Sets the uapiEventId value for this PlaceOrderEventResponseBody.
     * 
     * @param uapiEventId
     */
    public void setUapiEventId(java.lang.String uapiEventId) {
        this.uapiEventId = uapiEventId;
    }


    /**
     * Gets the status value for this PlaceOrderEventResponseBody.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PlaceOrderEventResponseBody.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the description value for this PlaceOrderEventResponseBody.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlaceOrderEventResponseBody.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the uapi_response_code value for this PlaceOrderEventResponseBody.
     * 
     * @return uapi_response_code
     */
    public java.lang.String getUapi_response_code() {
        return uapi_response_code;
    }


    /**
     * Sets the uapi_response_code value for this PlaceOrderEventResponseBody.
     * 
     * @param uapi_response_code
     */
    public void setUapi_response_code(java.lang.String uapi_response_code) {
        this.uapi_response_code = uapi_response_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceOrderEventResponseBody)) return false;
        PlaceOrderEventResponseBody other = (PlaceOrderEventResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uapiEventId==null && other.getUapiEventId()==null) || 
             (this.uapiEventId!=null &&
              this.uapiEventId.equals(other.getUapiEventId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.uapi_response_code==null && other.getUapi_response_code()==null) || 
             (this.uapi_response_code!=null &&
              this.uapi_response_code.equals(other.getUapi_response_code())));
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
        if (getUapiEventId() != null) {
            _hashCode += getUapiEventId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getUapi_response_code() != null) {
            _hashCode += getUapi_response_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceOrderEventResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "placeOrderEventResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uapiEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uapiEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uapi_response_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uapi_response_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
