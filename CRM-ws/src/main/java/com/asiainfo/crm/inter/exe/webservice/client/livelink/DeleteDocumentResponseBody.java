/**
 * DeleteDocumentResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class DeleteDocumentResponseBody  implements java.io.Serializable {
    private java.lang.String status;

    private com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType[] deleteDocumentResponse;

    public DeleteDocumentResponseBody() {
    }

    public DeleteDocumentResponseBody(
           java.lang.String status,
           com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType[] deleteDocumentResponse) {
           this.status = status;
           this.deleteDocumentResponse = deleteDocumentResponse;
    }


    /**
     * Gets the status value for this DeleteDocumentResponseBody.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DeleteDocumentResponseBody.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the deleteDocumentResponse value for this DeleteDocumentResponseBody.
     * 
     * @return deleteDocumentResponse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType[] getDeleteDocumentResponse() {
        return deleteDocumentResponse;
    }


    /**
     * Sets the deleteDocumentResponse value for this DeleteDocumentResponseBody.
     * 
     * @param deleteDocumentResponse
     */
    public void setDeleteDocumentResponse(com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType[] deleteDocumentResponse) {
        this.deleteDocumentResponse = deleteDocumentResponse;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType getDeleteDocumentResponse(int i) {
        return this.deleteDocumentResponse[i];
    }

    public void setDeleteDocumentResponse(int i, com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType _value) {
        this.deleteDocumentResponse[i] = _value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteDocumentResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "deleteDocumentResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteDocumentResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteDocumentResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "DeleteResponseType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
