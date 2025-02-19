/**
 * DoLetterDataReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoLetterDataReq  implements java.io.Serializable {
    private java.lang.Long letterId;

    private java.lang.Long custId;

    private java.lang.Integer formatId;

    private java.lang.String fileName;

    private java.lang.Integer mailCode;

    private java.lang.String xmlData;

    private java.lang.String templateName;

    public DoLetterDataReq() {
    }

    public DoLetterDataReq(
           java.lang.Long letterId,
           java.lang.Long custId,
           java.lang.Integer formatId,
           java.lang.String fileName,
           java.lang.Integer mailCode,
           java.lang.String xmlData,
           java.lang.String templateName) {
           this.letterId = letterId;
           this.custId = custId;
           this.formatId = formatId;
           this.fileName = fileName;
           this.mailCode = mailCode;
           this.xmlData = xmlData;
           this.templateName = templateName;
    }


    /**
     * Gets the letterId value for this DoLetterDataReq.
     * 
     * @return letterId
     */
    public java.lang.Long getLetterId() {
        return letterId;
    }


    /**
     * Sets the letterId value for this DoLetterDataReq.
     * 
     * @param letterId
     */
    public void setLetterId(java.lang.Long letterId) {
        this.letterId = letterId;
    }


    /**
     * Gets the custId value for this DoLetterDataReq.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this DoLetterDataReq.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the formatId value for this DoLetterDataReq.
     * 
     * @return formatId
     */
    public java.lang.Integer getFormatId() {
        return formatId;
    }


    /**
     * Sets the formatId value for this DoLetterDataReq.
     * 
     * @param formatId
     */
    public void setFormatId(java.lang.Integer formatId) {
        this.formatId = formatId;
    }


    /**
     * Gets the fileName value for this DoLetterDataReq.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this DoLetterDataReq.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the mailCode value for this DoLetterDataReq.
     * 
     * @return mailCode
     */
    public java.lang.Integer getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this DoLetterDataReq.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Integer mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the xmlData value for this DoLetterDataReq.
     * 
     * @return xmlData
     */
    public java.lang.String getXmlData() {
        return xmlData;
    }


    /**
     * Sets the xmlData value for this DoLetterDataReq.
     * 
     * @param xmlData
     */
    public void setXmlData(java.lang.String xmlData) {
        this.xmlData = xmlData;
    }


    /**
     * Gets the templateName value for this DoLetterDataReq.
     * 
     * @return templateName
     */
    public java.lang.String getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this DoLetterDataReq.
     * 
     * @param templateName
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoLetterDataReq)) return false;
        DoLetterDataReq other = (DoLetterDataReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.letterId==null && other.getLetterId()==null) || 
             (this.letterId!=null &&
              this.letterId.equals(other.getLetterId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.formatId==null && other.getFormatId()==null) || 
             (this.formatId!=null &&
              this.formatId.equals(other.getFormatId()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.xmlData==null && other.getXmlData()==null) || 
             (this.xmlData!=null &&
              this.xmlData.equals(other.getXmlData()))) &&
            ((this.templateName==null && other.getTemplateName()==null) || 
             (this.templateName!=null &&
              this.templateName.equals(other.getTemplateName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLetterId() != null) {
            _hashCode += getLetterId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getFormatId() != null) {
            _hashCode += getFormatId().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getXmlData() != null) {
            _hashCode += getXmlData().hashCode();
        }
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoLetterDataReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLetterDataReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "letterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
