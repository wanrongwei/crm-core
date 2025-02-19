/**
 * DeleteStaticIPToCoasSubscriberResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

public class DeleteStaticIPToCoasSubscriberResponseBody  implements java.io.Serializable {
    private String httpstatus;

    public DeleteStaticIPToCoasSubscriberResponseBody() {
    }

    public DeleteStaticIPToCoasSubscriberResponseBody(
           String httpstatus) {
           this.httpstatus = httpstatus;
    }


    /**
     * Gets the httpstatus value for this DeleteStaticIPToCoasSubscriberResponseBody.
     * 
     * @return httpstatus
     */
    public String getHttpstatus() {
        return httpstatus;
    }


    /**
     * Sets the httpstatus value for this DeleteStaticIPToCoasSubscriberResponseBody.
     * 
     * @param httpstatus
     */
    public void setHttpstatus(String httpstatus) {
        this.httpstatus = httpstatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteStaticIPToCoasSubscriberResponseBody)) return false;
        DeleteStaticIPToCoasSubscriberResponseBody other = (DeleteStaticIPToCoasSubscriberResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpstatus==null && other.getHttpstatus()==null) || 
             (this.httpstatus!=null &&
              this.httpstatus.equals(other.getHttpstatus())));
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
        if (getHttpstatus() != null) {
            _hashCode += getHttpstatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteStaticIPToCoasSubscriberResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeleteStaticIPToCoasSubscriberResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpstatus"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
