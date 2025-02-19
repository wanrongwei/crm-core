/**
 * QueryTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryTemplateResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer succFlag;

    private java.lang.Integer errorCode;

    private java.lang.String errorMsg;

    private byte[] fileContent;

    private java.lang.String[] templateList;

    public QueryTemplateResponse() {
    }

    public QueryTemplateResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Integer succFlag,
           java.lang.Integer errorCode,
           java.lang.String errorMsg,
           byte[] fileContent,
           java.lang.String[] templateList) {
        super(
            responseHead);
        this.succFlag = succFlag;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.fileContent = fileContent;
        this.templateList = templateList;
    }


    /**
     * Gets the succFlag value for this QueryTemplateResponse.
     * 
     * @return succFlag
     */
    public java.lang.Integer getSuccFlag() {
        return succFlag;
    }


    /**
     * Sets the succFlag value for this QueryTemplateResponse.
     * 
     * @param succFlag
     */
    public void setSuccFlag(java.lang.Integer succFlag) {
        this.succFlag = succFlag;
    }


    /**
     * Gets the errorCode value for this QueryTemplateResponse.
     * 
     * @return errorCode
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this QueryTemplateResponse.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMsg value for this QueryTemplateResponse.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this QueryTemplateResponse.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the fileContent value for this QueryTemplateResponse.
     * 
     * @return fileContent
     */
    public byte[] getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this QueryTemplateResponse.
     * 
     * @param fileContent
     */
    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the templateList value for this QueryTemplateResponse.
     * 
     * @return templateList
     */
    public java.lang.String[] getTemplateList() {
        return templateList;
    }


    /**
     * Sets the templateList value for this QueryTemplateResponse.
     * 
     * @param templateList
     */
    public void setTemplateList(java.lang.String[] templateList) {
        this.templateList = templateList;
    }

    public java.lang.String getTemplateList(int i) {
        return this.templateList[i];
    }

    public void setTemplateList(int i, java.lang.String _value) {
        this.templateList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTemplateResponse)) return false;
        QueryTemplateResponse other = (QueryTemplateResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.succFlag==null && other.getSuccFlag()==null) || 
             (this.succFlag!=null &&
              this.succFlag.equals(other.getSuccFlag()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              java.util.Arrays.equals(this.fileContent, other.getFileContent()))) &&
            ((this.templateList==null && other.getTemplateList()==null) || 
             (this.templateList!=null &&
              java.util.Arrays.equals(this.templateList, other.getTemplateList())));
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
        if (getSuccFlag() != null) {
            _hashCode += getSuccFlag().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getFileContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("succFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "succFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
