/**
 * YwsSoItemAttDocuUpd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSoItemAttDocuUpd  implements java.io.Serializable {
    private java.lang.String tenantId;

    private java.lang.String documentType;

    private java.lang.String archiveDocId;

    public YwsSoItemAttDocuUpd() {
    }

    public YwsSoItemAttDocuUpd(
           java.lang.String tenantId,
           java.lang.String documentType,
           java.lang.String archiveDocId) {
           this.tenantId = tenantId;
           this.documentType = documentType;
           this.archiveDocId = archiveDocId;
    }


    /**
     * Gets the tenantId value for this YwsSoItemAttDocuUpd.
     * 
     * @return tenantId
     */
    public java.lang.String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this YwsSoItemAttDocuUpd.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the documentType value for this YwsSoItemAttDocuUpd.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this YwsSoItemAttDocuUpd.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the archiveDocId value for this YwsSoItemAttDocuUpd.
     * 
     * @return archiveDocId
     */
    public java.lang.String getArchiveDocId() {
        return archiveDocId;
    }


    /**
     * Sets the archiveDocId value for this YwsSoItemAttDocuUpd.
     * 
     * @param archiveDocId
     */
    public void setArchiveDocId(java.lang.String archiveDocId) {
        this.archiveDocId = archiveDocId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSoItemAttDocuUpd)) return false;
        YwsSoItemAttDocuUpd other = (YwsSoItemAttDocuUpd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.archiveDocId==null && other.getArchiveDocId()==null) || 
             (this.archiveDocId!=null &&
              this.archiveDocId.equals(other.getArchiveDocId())));
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
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getArchiveDocId() != null) {
            _hashCode += getArchiveDocId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSoItemAttDocuUpd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocuUpd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveDocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
