/**
 * SPageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SPageInfo  implements java.io.Serializable {
    private java.lang.Boolean pageFlag;

    private java.lang.Integer pageSize;

    private java.lang.Integer pageNum;

    public SPageInfo() {
    }

    public SPageInfo(
           java.lang.Boolean pageFlag,
           java.lang.Integer pageSize,
           java.lang.Integer pageNum) {
           this.pageFlag = pageFlag;
           this.pageSize = pageSize;
           this.pageNum = pageNum;
    }


    /**
     * Gets the pageFlag value for this SPageInfo.
     * 
     * @return pageFlag
     */
    public java.lang.Boolean getPageFlag() {
        return pageFlag;
    }


    /**
     * Sets the pageFlag value for this SPageInfo.
     * 
     * @param pageFlag
     */
    public void setPageFlag(java.lang.Boolean pageFlag) {
        this.pageFlag = pageFlag;
    }


    /**
     * Gets the pageSize value for this SPageInfo.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this SPageInfo.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageNum value for this SPageInfo.
     * 
     * @return pageNum
     */
    public java.lang.Integer getPageNum() {
        return pageNum;
    }


    /**
     * Sets the pageNum value for this SPageInfo.
     * 
     * @param pageNum
     */
    public void setPageNum(java.lang.Integer pageNum) {
        this.pageNum = pageNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPageInfo)) return false;
        SPageInfo other = (SPageInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageFlag==null && other.getPageFlag()==null) || 
             (this.pageFlag!=null &&
              this.pageFlag.equals(other.getPageFlag()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.pageNum==null && other.getPageNum()==null) || 
             (this.pageNum!=null &&
              this.pageNum.equals(other.getPageNum())));
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
        if (getPageFlag() != null) {
            _hashCode += getPageFlag().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPageNum() != null) {
            _hashCode += getPageNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
