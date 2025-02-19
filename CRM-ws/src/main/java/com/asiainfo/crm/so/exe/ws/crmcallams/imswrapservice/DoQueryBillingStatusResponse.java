/**
 * DoQueryBillingStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryBillingStatusResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Short billing_status;

    private java.lang.String status_start_date;

    public DoQueryBillingStatusResponse() {
    }

    public DoQueryBillingStatusResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Short billing_status,
           java.lang.String status_start_date) {
        super(
            responseHead);
        this.billing_status = billing_status;
        this.status_start_date = status_start_date;
    }


    /**
     * Gets the billing_status value for this DoQueryBillingStatusResponse.
     * 
     * @return billing_status
     */
    public java.lang.Short getBilling_status() {
        return billing_status;
    }


    /**
     * Sets the billing_status value for this DoQueryBillingStatusResponse.
     * 
     * @param billing_status
     */
    public void setBilling_status(java.lang.Short billing_status) {
        this.billing_status = billing_status;
    }


    /**
     * Gets the status_start_date value for this DoQueryBillingStatusResponse.
     * 
     * @return status_start_date
     */
    public java.lang.String getStatus_start_date() {
        return status_start_date;
    }


    /**
     * Sets the status_start_date value for this DoQueryBillingStatusResponse.
     * 
     * @param status_start_date
     */
    public void setStatus_start_date(java.lang.String status_start_date) {
        this.status_start_date = status_start_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryBillingStatusResponse)) return false;
        DoQueryBillingStatusResponse other = (DoQueryBillingStatusResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billing_status==null && other.getBilling_status()==null) || 
             (this.billing_status!=null &&
              this.billing_status.equals(other.getBilling_status()))) &&
            ((this.status_start_date==null && other.getStatus_start_date()==null) || 
             (this.status_start_date!=null &&
              this.status_start_date.equals(other.getStatus_start_date())));
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
        if (getBilling_status() != null) {
            _hashCode += getBilling_status().hashCode();
        }
        if (getStatus_start_date() != null) {
            _hashCode += getStatus_start_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryBillingStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillingStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_start_date"));
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
