/**
 * SyncOperatorInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

public class SyncOperatorInfoResponse  implements java.io.Serializable {
    private SyncOperatorInfoResponseBody responseBody;

    public SyncOperatorInfoResponse() {
    }

    public SyncOperatorInfoResponse(
           SyncOperatorInfoResponseBody responseBody) {
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseBody value for this SyncOperatorInfoResponse.
     * 
     * @return responseBody
     */
    public SyncOperatorInfoResponseBody getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this SyncOperatorInfoResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(SyncOperatorInfoResponseBody responseBody) {
        this.responseBody = responseBody;
    }

   

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncOperatorInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">syncOperatorInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "syncOperatorInfoResponseBody"));
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
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
