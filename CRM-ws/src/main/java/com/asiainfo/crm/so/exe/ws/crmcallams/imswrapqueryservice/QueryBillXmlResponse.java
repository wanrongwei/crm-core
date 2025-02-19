/**
 * QueryBillXmlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryBillXmlResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer errorCode;

    private java.lang.String docName;

    private byte[] docContent;

    public QueryBillXmlResponse() {
    }

    public QueryBillXmlResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Integer errorCode,
           java.lang.String docName,
           byte[] docContent) {
        super(
            responseHead);
        this.errorCode = errorCode;
        this.docName = docName;
        this.docContent = docContent;
    }


    /**
     * Gets the errorCode value for this QueryBillXmlResponse.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this QueryBillXmlResponse.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the docName value for this QueryBillXmlResponse.
     * 
     * @return docName
     */
    public java.lang.String getDocName() {
        return docName;
    }


    /**
     * Sets the docName value for this QueryBillXmlResponse.
     * 
     * @param docName
     */
    public void setDocName(java.lang.String docName) {
        this.docName = docName;
    }


    /**
     * Gets the docContent value for this QueryBillXmlResponse.
     * 
     * @return docContent
     */
    public byte[] getDocContent() {
        return docContent;
    }


    /**
     * Sets the docContent value for this QueryBillXmlResponse.
     * 
     * @param docContent
     */
    public void setDocContent(byte[] docContent) {
        this.docContent = docContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBillXmlResponse)) return false;
        QueryBillXmlResponse other = (QueryBillXmlResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.docName==null && other.getDocName()==null) || 
             (this.docName!=null &&
              this.docName.equals(other.getDocName()))) &&
            ((this.docContent==null && other.getDocContent()==null) || 
             (this.docContent!=null &&
              java.util.Arrays.equals(this.docContent, other.getDocContent())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getDocName() != null) {
            _hashCode += getDocName().hashCode();
        }
        if (getDocContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBillXmlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillXmlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
