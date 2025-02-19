/**
 * QueryTemplateReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryTemplateReq  implements java.io.Serializable {
    private java.lang.Integer busiType;

    private java.lang.Long templateId;

    private java.lang.Integer templateType;

    private java.lang.String mainDirName;

    private java.lang.String templateData;

    private java.lang.String formatType;

    public QueryTemplateReq() {
    }

    public QueryTemplateReq(
           java.lang.Integer busiType,
           java.lang.Long templateId,
           java.lang.Integer templateType,
           java.lang.String mainDirName,
           java.lang.String templateData,
           java.lang.String formatType) {
           this.busiType = busiType;
           this.templateId = templateId;
           this.templateType = templateType;
           this.mainDirName = mainDirName;
           this.templateData = templateData;
           this.formatType = formatType;
    }


    /**
     * Gets the busiType value for this QueryTemplateReq.
     * 
     * @return busiType
     */
    public java.lang.Integer getBusiType() {
        return busiType;
    }


    /**
     * Sets the busiType value for this QueryTemplateReq.
     * 
     * @param busiType
     */
    public void setBusiType(java.lang.Integer busiType) {
        this.busiType = busiType;
    }


    /**
     * Gets the templateId value for this QueryTemplateReq.
     * 
     * @return templateId
     */
    public java.lang.Long getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this QueryTemplateReq.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.Long templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the templateType value for this QueryTemplateReq.
     * 
     * @return templateType
     */
    public java.lang.Integer getTemplateType() {
        return templateType;
    }


    /**
     * Sets the templateType value for this QueryTemplateReq.
     * 
     * @param templateType
     */
    public void setTemplateType(java.lang.Integer templateType) {
        this.templateType = templateType;
    }


    /**
     * Gets the mainDirName value for this QueryTemplateReq.
     * 
     * @return mainDirName
     */
    public java.lang.String getMainDirName() {
        return mainDirName;
    }


    /**
     * Sets the mainDirName value for this QueryTemplateReq.
     * 
     * @param mainDirName
     */
    public void setMainDirName(java.lang.String mainDirName) {
        this.mainDirName = mainDirName;
    }


    /**
     * Gets the templateData value for this QueryTemplateReq.
     * 
     * @return templateData
     */
    public java.lang.String getTemplateData() {
        return templateData;
    }


    /**
     * Sets the templateData value for this QueryTemplateReq.
     * 
     * @param templateData
     */
    public void setTemplateData(java.lang.String templateData) {
        this.templateData = templateData;
    }


    /**
     * Gets the formatType value for this QueryTemplateReq.
     * 
     * @return formatType
     */
    public java.lang.String getFormatType() {
        return formatType;
    }


    /**
     * Sets the formatType value for this QueryTemplateReq.
     * 
     * @param formatType
     */
    public void setFormatType(java.lang.String formatType) {
        this.formatType = formatType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTemplateReq)) return false;
        QueryTemplateReq other = (QueryTemplateReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.busiType==null && other.getBusiType()==null) || 
             (this.busiType!=null &&
              this.busiType.equals(other.getBusiType()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            ((this.templateType==null && other.getTemplateType()==null) || 
             (this.templateType!=null &&
              this.templateType.equals(other.getTemplateType()))) &&
            ((this.mainDirName==null && other.getMainDirName()==null) || 
             (this.mainDirName!=null &&
              this.mainDirName.equals(other.getMainDirName()))) &&
            ((this.templateData==null && other.getTemplateData()==null) || 
             (this.templateData!=null &&
              this.templateData.equals(other.getTemplateData()))) &&
            ((this.formatType==null && other.getFormatType()==null) || 
             (this.formatType!=null &&
              this.formatType.equals(other.getFormatType())));
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
        if (getBusiType() != null) {
            _hashCode += getBusiType().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getTemplateType() != null) {
            _hashCode += getTemplateType().hashCode();
        }
        if (getMainDirName() != null) {
            _hashCode += getMainDirName().hashCode();
        }
        if (getTemplateData() != null) {
            _hashCode += getTemplateData().hashCode();
        }
        if (getFormatType() != null) {
            _hashCode += getFormatType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryTemplateReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryTemplateReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainDirName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainDirName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formatType"));
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
