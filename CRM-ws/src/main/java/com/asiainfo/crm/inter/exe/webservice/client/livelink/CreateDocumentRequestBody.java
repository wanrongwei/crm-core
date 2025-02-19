/**
 * CreateDocumentRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class CreateDocumentRequestBody  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String tenantId;

    private java.lang.String name;

    private java.lang.String size;

    private java.lang.String barcode;

    private java.lang.String remoteUserName;

    private java.lang.String documentType;

    private com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata;

    private java.util.Calendar createDate;

    private java.util.Calendar lastModifyDate;

    private java.lang.String mimeType;

    private java.lang.Boolean signReqd;

    private byte[] content;

    public CreateDocumentRequestBody() {
    }

    public CreateDocumentRequestBody(
           java.lang.String sessionId,
           java.lang.String tenantId,
           java.lang.String name,
           java.lang.String size,
           java.lang.String barcode,
           java.lang.String remoteUserName,
           java.lang.String documentType,
           com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata,
           java.util.Calendar createDate,
           java.util.Calendar lastModifyDate,
           java.lang.String mimeType,
           java.lang.Boolean signReqd,
           byte[] content) {
           this.sessionId = sessionId;
           this.tenantId = tenantId;
           this.name = name;
           this.size = size;
           this.barcode = barcode;
           this.remoteUserName = remoteUserName;
           this.documentType = documentType;
           this.metadata = metadata;
           this.createDate = createDate;
           this.lastModifyDate = lastModifyDate;
           this.mimeType = mimeType;
           this.signReqd = signReqd;
           this.content = content;
    }


    /**
     * Gets the sessionId value for this CreateDocumentRequestBody.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CreateDocumentRequestBody.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the tenantId value for this CreateDocumentRequestBody.
     * 
     * @return tenantId
     */
    public java.lang.String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this CreateDocumentRequestBody.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the name value for this CreateDocumentRequestBody.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreateDocumentRequestBody.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this CreateDocumentRequestBody.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this CreateDocumentRequestBody.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }


    /**
     * Gets the barcode value for this CreateDocumentRequestBody.
     * 
     * @return barcode
     */
    public java.lang.String getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this CreateDocumentRequestBody.
     * 
     * @param barcode
     */
    public void setBarcode(java.lang.String barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the remoteUserName value for this CreateDocumentRequestBody.
     * 
     * @return remoteUserName
     */
    public java.lang.String getRemoteUserName() {
        return remoteUserName;
    }


    /**
     * Sets the remoteUserName value for this CreateDocumentRequestBody.
     * 
     * @param remoteUserName
     */
    public void setRemoteUserName(java.lang.String remoteUserName) {
        this.remoteUserName = remoteUserName;
    }


    /**
     * Gets the documentType value for this CreateDocumentRequestBody.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this CreateDocumentRequestBody.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the metadata value for this CreateDocumentRequestBody.
     * 
     * @return metadata
     */
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this CreateDocumentRequestBody.
     * 
     * @param metadata
     */
    public void setMetadata(com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata) {
        this.metadata = metadata;
    }


    /**
     * Gets the createDate value for this CreateDocumentRequestBody.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CreateDocumentRequestBody.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the lastModifyDate value for this CreateDocumentRequestBody.
     * 
     * @return lastModifyDate
     */
    public java.util.Calendar getLastModifyDate() {
        return lastModifyDate;
    }


    /**
     * Sets the lastModifyDate value for this CreateDocumentRequestBody.
     * 
     * @param lastModifyDate
     */
    public void setLastModifyDate(java.util.Calendar lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }


    /**
     * Gets the mimeType value for this CreateDocumentRequestBody.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this CreateDocumentRequestBody.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the signReqd value for this CreateDocumentRequestBody.
     * 
     * @return signReqd
     */
    public java.lang.Boolean getSignReqd() {
        return signReqd;
    }


    /**
     * Sets the signReqd value for this CreateDocumentRequestBody.
     * 
     * @param signReqd
     */
    public void setSignReqd(java.lang.Boolean signReqd) {
        this.signReqd = signReqd;
    }


    /**
     * Gets the content value for this CreateDocumentRequestBody.
     * 
     * @return content
     */
    public byte[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this CreateDocumentRequestBody.
     * 
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDocumentRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "createDocumentRequestBody"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Barcode"));
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
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Metadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "MetadataStructureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signReqd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SignReqd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
