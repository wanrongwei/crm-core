/**
 * TrsXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.transact;

public class TrsXMLResponse  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.transact.TrsXMLResponseBody responseBody;

    public TrsXMLResponse() {
    }

    public TrsXMLResponse(
           com.asiainfo.crm.inter.exe.webservice.client.transact.TrsXMLResponseBody responseBody) {
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseBody value for this TrsXMLResponse.
     * 
     * @return responseBody
     */
    public com.asiainfo.crm.inter.exe.webservice.client.transact.TrsXMLResponseBody getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this TrsXMLResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(com.asiainfo.crm.inter.exe.webservice.client.transact.TrsXMLResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrsXMLResponse)) return false;
        TrsXMLResponse other = (TrsXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseBody==null && other.getResponseBody()==null) || 
             (this.responseBody!=null &&
              this.responseBody.equals(other.getResponseBody())));
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
        if (getResponseBody() != null) {
            _hashCode += getResponseBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrsXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">TrsXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "trsXMLResponseBody"));
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
