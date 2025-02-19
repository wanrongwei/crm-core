/**
 * ExemptionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class ExemptionInfo  implements java.io.Serializable {
    private java.lang.Integer exemption_type;

    private java.lang.String expire_date;

    private java.lang.String valid_date;

    public ExemptionInfo() {
    }

    public ExemptionInfo(
           java.lang.Integer exemption_type,
           java.lang.String expire_date,
           java.lang.String valid_date) {
           this.exemption_type = exemption_type;
           this.expire_date = expire_date;
           this.valid_date = valid_date;
    }


    /**
     * Gets the exemption_type value for this ExemptionInfo.
     * 
     * @return exemption_type
     */
    public java.lang.Integer getExemption_type() {
        return exemption_type;
    }


    /**
     * Sets the exemption_type value for this ExemptionInfo.
     * 
     * @param exemption_type
     */
    public void setExemption_type(java.lang.Integer exemption_type) {
        this.exemption_type = exemption_type;
    }


    /**
     * Gets the expire_date value for this ExemptionInfo.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this ExemptionInfo.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the valid_date value for this ExemptionInfo.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this ExemptionInfo.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ExemptionInfo)) return false;
        ExemptionInfo other = (ExemptionInfo) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exemption_type==null && other.getExemption_type()==null) || 
             (this.exemption_type!=null &&
              this.exemption_type.equals(other.getExemption_type()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date())));
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
        if (getExemption_type() != null) {
            _hashCode += getExemption_type().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "exemptionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemption_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemption_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
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
