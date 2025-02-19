/**
 * SignDocumentLTVRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class SignDocumentLTVRequestBody  implements java.io.Serializable {
    private byte[] inputPdf;

    private java.lang.String documentId;

    private java.lang.String countryCode;

    private java.lang.String docType;

    public SignDocumentLTVRequestBody() {
    }

    public SignDocumentLTVRequestBody(
           byte[] inputPdf,
           java.lang.String documentId,
           java.lang.String countryCode,
           java.lang.String docType) {
           this.inputPdf = inputPdf;
           this.documentId = documentId;
           this.countryCode = countryCode;
           this.docType = docType;
    }


    /**
     * Gets the inputPdf value for this SignDocumentLTVRequestBody.
     * 
     * @return inputPdf
     */
    public byte[] getInputPdf() {
        return inputPdf;
    }


    /**
     * Sets the inputPdf value for this SignDocumentLTVRequestBody.
     * 
     * @param inputPdf
     */
    public void setInputPdf(byte[] inputPdf) {
        this.inputPdf = inputPdf;
    }


    /**
     * Gets the documentId value for this SignDocumentLTVRequestBody.
     * 
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this SignDocumentLTVRequestBody.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the countryCode value for this SignDocumentLTVRequestBody.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this SignDocumentLTVRequestBody.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the docType value for this SignDocumentLTVRequestBody.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this SignDocumentLTVRequestBody.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignDocumentLTVRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentLTVRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputPdf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InputPdf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
