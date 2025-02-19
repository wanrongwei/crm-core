/**
 * SProductParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SProductParam  implements java.io.Serializable {
    private java.lang.Integer paramId;

    private java.lang.String paramName;

    private java.lang.String paramValue;

    private java.lang.Long groupId;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    public SProductParam() {
    }

    public SProductParam(
           java.lang.Integer paramId,
           java.lang.String paramName,
           java.lang.String paramValue,
           java.lang.Long groupId,
           java.lang.String validDate,
           java.lang.String expireDate) {
           this.paramId = paramId;
           this.paramName = paramName;
           this.paramValue = paramValue;
           this.groupId = groupId;
           this.validDate = validDate;
           this.expireDate = expireDate;
    }


    /**
     * Gets the paramId value for this SProductParam.
     * 
     * @return paramId
     */
    public java.lang.Integer getParamId() {
        return paramId;
    }


    /**
     * Sets the paramId value for this SProductParam.
     * 
     * @param paramId
     */
    public void setParamId(java.lang.Integer paramId) {
        this.paramId = paramId;
    }


    /**
     * Gets the paramName value for this SProductParam.
     * 
     * @return paramName
     */
    public java.lang.String getParamName() {
        return paramName;
    }


    /**
     * Sets the paramName value for this SProductParam.
     * 
     * @param paramName
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }


    /**
     * Gets the paramValue value for this SProductParam.
     * 
     * @return paramValue
     */
    public java.lang.String getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this SProductParam.
     * 
     * @param paramValue
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }


    /**
     * Gets the groupId value for this SProductParam.
     * 
     * @return groupId
     */
    public java.lang.Long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this SProductParam.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the validDate value for this SProductParam.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SProductParam.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SProductParam.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SProductParam.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SProductParam)) return false;
        SProductParam other = (SProductParam) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paramId==null && other.getParamId()==null) || 
             (this.paramId!=null &&
              this.paramId.equals(other.getParamId()))) &&
            ((this.paramName==null && other.getParamName()==null) || 
             (this.paramName!=null &&
              this.paramName.equals(other.getParamName()))) &&
            ((this.paramValue==null && other.getParamValue()==null) || 
             (this.paramValue!=null &&
              this.paramValue.equals(other.getParamValue()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        if (getParamId() != null) {
            _hashCode += getParamId().hashCode();
        }
        if (getParamName() != null) {
            _hashCode += getParamName().hashCode();
        }
        if (getParamValue() != null) {
            _hashCode += getParamValue().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SProductParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
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
