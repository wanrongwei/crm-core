/**
 * DeleteDocumentRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class DeleteDocumentRequestBody  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String tenantId;

    private java.lang.String documentType;

    private java.lang.String remoteUserName;

    private java.lang.String[] documentIds;

    public DeleteDocumentRequestBody() {
    }

    public DeleteDocumentRequestBody(
           java.lang.String sessionId,
           java.lang.String tenantId,
           java.lang.String documentType,
           java.lang.String remoteUserName,
           java.lang.String[] documentIds) {
           this.sessionId = sessionId;
           this.tenantId = tenantId;
           this.documentType = documentType;
           this.remoteUserName = remoteUserName;
           this.documentIds = documentIds;
    }


    /**
     * Gets the sessionId value for this DeleteDocumentRequestBody.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DeleteDocumentRequestBody.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the tenantId value for this DeleteDocumentRequestBody.
     * 
     * @return tenantId
     */
    public java.lang.String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this DeleteDocumentRequestBody.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the documentType value for this DeleteDocumentRequestBody.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this DeleteDocumentRequestBody.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the remoteUserName value for this DeleteDocumentRequestBody.
     * 
     * @return remoteUserName
     */
    public java.lang.String getRemoteUserName() {
        return remoteUserName;
    }


    /**
     * Sets the remoteUserName value for this DeleteDocumentRequestBody.
     * 
     * @param remoteUserName
     */
    public void setRemoteUserName(java.lang.String remoteUserName) {
        this.remoteUserName = remoteUserName;
    }


    /**
     * Gets the documentIds value for this DeleteDocumentRequestBody.
     * 
     * @return documentIds
     */
    public java.lang.String[] getDocumentIds() {
        return documentIds;
    }


    /**
     * Sets the documentIds value for this DeleteDocumentRequestBody.
     * 
     * @param documentIds
     */
    public void setDocumentIds(java.lang.String[] documentIds) {
        this.documentIds = documentIds;
    }

    public java.lang.String getDocumentIds(int i) {
        return this.documentIds[i];
    }

    public void setDocumentIds(int i, java.lang.String _value) {
        this.documentIds[i] = _value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteDocumentRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "deleteDocumentRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
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
        elemField.setFieldName("remoteUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoteUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
