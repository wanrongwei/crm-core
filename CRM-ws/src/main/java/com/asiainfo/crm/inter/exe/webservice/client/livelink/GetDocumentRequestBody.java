/**
 * GetDocumentRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class GetDocumentRequestBody  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String remoteUserName;

    private java.lang.String tenantId;

    private java.lang.String documentType;

    private java.lang.String documentId;

    public GetDocumentRequestBody() {
    }

    public GetDocumentRequestBody(
           java.lang.String sessionId,
           java.lang.String remoteUserName,
           java.lang.String tenantId,
           java.lang.String documentType,
           java.lang.String documentId) {
           this.sessionId = sessionId;
           this.remoteUserName = remoteUserName;
           this.tenantId = tenantId;
           this.documentType = documentType;
           this.documentId = documentId;
    }


    /**
     * Gets the sessionId value for this GetDocumentRequestBody.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this GetDocumentRequestBody.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the remoteUserName value for this GetDocumentRequestBody.
     * 
     * @return remoteUserName
     */
    public java.lang.String getRemoteUserName() {
        return remoteUserName;
    }


    /**
     * Sets the remoteUserName value for this GetDocumentRequestBody.
     * 
     * @param remoteUserName
     */
    public void setRemoteUserName(java.lang.String remoteUserName) {
        this.remoteUserName = remoteUserName;
    }


    /**
     * Gets the tenantId value for this GetDocumentRequestBody.
     * 
     * @return tenantId
     */
    public java.lang.String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this GetDocumentRequestBody.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the documentType value for this GetDocumentRequestBody.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this GetDocumentRequestBody.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the documentId value for this GetDocumentRequestBody.
     * 
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this GetDocumentRequestBody.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getDocumentRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoteUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentId"));
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
