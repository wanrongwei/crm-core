/**
 * SyncOperatorInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

public class SyncOperatorInfoRequest  implements java.io.Serializable {
    private SyncOperatorInfoRequestBody requestBody;

    public SyncOperatorInfoRequest() {
    }

    public SyncOperatorInfoRequest(
           SyncOperatorInfoRequestBody requestBody) {
           this.requestBody = requestBody;
    }


    /**
     * Gets the requestBody value for this SyncOperatorInfoRequest.
     * 
     * @return requestBody
     */
    public SyncOperatorInfoRequestBody getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this SyncOperatorInfoRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(SyncOperatorInfoRequestBody requestBody) {
        this.requestBody = requestBody;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncOperatorInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", ">syncOperatorInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "syncOperatorInfoRequestBody"));
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
