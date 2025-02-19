/**
 * GetNumberInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

public class GetNumberInfoResponse  implements java.io.Serializable {
    private GetNumberInfoResponseBody responseBody;

    public GetNumberInfoResponse() {
    }

    public GetNumberInfoResponse(
           GetNumberInfoResponseBody responseBody) {
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseBody value for this GetNumberInfoResponse.
     * 
     * @return responseBody
     */
    public GetNumberInfoResponseBody getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this GetNumberInfoResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(GetNumberInfoResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNumberInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">getNumberInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getNumberInfoResponseBody"));
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
