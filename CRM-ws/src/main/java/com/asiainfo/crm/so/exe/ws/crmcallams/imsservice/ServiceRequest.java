/**
 * ServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class ServiceRequest  implements java.io.Serializable {
    private java.lang.String busi_service_code;

    private java.lang.Integer service_sequence_id;

    private java.lang.Short camel_support;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.Short service_status;

    private java.lang.String description;

    private java.lang.Integer call_type_id;

    public ServiceRequest() {
    }

    public ServiceRequest(
           java.lang.String busi_service_code,
           java.lang.Integer service_sequence_id,
           java.lang.Short camel_support,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.Short service_status,
           java.lang.String description,
           java.lang.Integer call_type_id) {
           this.busi_service_code = busi_service_code;
           this.service_sequence_id = service_sequence_id;
           this.camel_support = camel_support;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.service_status = service_status;
           this.description = description;
           this.call_type_id = call_type_id;
    }


    /**
     * Gets the busi_service_code value for this ServiceRequest.
     * 
     * @return busi_service_code
     */
    public java.lang.String getBusi_service_code() {
        return busi_service_code;
    }


    /**
     * Sets the busi_service_code value for this ServiceRequest.
     * 
     * @param busi_service_code
     */
    public void setBusi_service_code(java.lang.String busi_service_code) {
        this.busi_service_code = busi_service_code;
    }


    /**
     * Gets the service_sequence_id value for this ServiceRequest.
     * 
     * @return service_sequence_id
     */
    public java.lang.Integer getService_sequence_id() {
        return service_sequence_id;
    }


    /**
     * Sets the service_sequence_id value for this ServiceRequest.
     * 
     * @param service_sequence_id
     */
    public void setService_sequence_id(java.lang.Integer service_sequence_id) {
        this.service_sequence_id = service_sequence_id;
    }


    /**
     * Gets the camel_support value for this ServiceRequest.
     * 
     * @return camel_support
     */
    public java.lang.Short getCamel_support() {
        return camel_support;
    }


    /**
     * Sets the camel_support value for this ServiceRequest.
     * 
     * @param camel_support
     */
    public void setCamel_support(java.lang.Short camel_support) {
        this.camel_support = camel_support;
    }


    /**
     * Gets the valid_date value for this ServiceRequest.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this ServiceRequest.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this ServiceRequest.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this ServiceRequest.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the service_status value for this ServiceRequest.
     * 
     * @return service_status
     */
    public java.lang.Short getService_status() {
        return service_status;
    }


    /**
     * Sets the service_status value for this ServiceRequest.
     * 
     * @param service_status
     */
    public void setService_status(java.lang.Short service_status) {
        this.service_status = service_status;
    }


    /**
     * Gets the description value for this ServiceRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ServiceRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the call_type_id value for this ServiceRequest.
     * 
     * @return call_type_id
     */
    public java.lang.Integer getCall_type_id() {
        return call_type_id;
    }


    /**
     * Sets the call_type_id value for this ServiceRequest.
     * 
     * @param call_type_id
     */
    public void setCall_type_id(java.lang.Integer call_type_id) {
        this.call_type_id = call_type_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRequest)) return false;
        ServiceRequest other = (ServiceRequest) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.busi_service_code==null && other.getBusi_service_code()==null) || 
             (this.busi_service_code!=null &&
              this.busi_service_code.equals(other.getBusi_service_code()))) &&
            ((this.service_sequence_id==null && other.getService_sequence_id()==null) || 
             (this.service_sequence_id!=null &&
              this.service_sequence_id.equals(other.getService_sequence_id()))) &&
            ((this.camel_support==null && other.getCamel_support()==null) || 
             (this.camel_support!=null &&
              this.camel_support.equals(other.getCamel_support()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.service_status==null && other.getService_status()==null) || 
             (this.service_status!=null &&
              this.service_status.equals(other.getService_status()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.call_type_id==null && other.getCall_type_id()==null) || 
             (this.call_type_id!=null &&
              this.call_type_id.equals(other.getCall_type_id())));
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
        if (getBusi_service_code() != null) {
            _hashCode += getBusi_service_code().hashCode();
        }
        if (getService_sequence_id() != null) {
            _hashCode += getService_sequence_id().hashCode();
        }
        if (getCamel_support() != null) {
            _hashCode += getCamel_support().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getService_status() != null) {
            _hashCode += getService_status().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCall_type_id() != null) {
            _hashCode += getCall_type_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camel_support");
        elemField.setXmlName(new javax.xml.namespace.QName("", "camel_support"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("call_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "call_type_id"));
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
