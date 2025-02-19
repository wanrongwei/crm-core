/**
 * SQueryVpnNumberReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class SQueryVpnNumberReq  implements java.io.Serializable {
    private java.lang.Long group_id;

    private java.lang.String short_number;

    private java.lang.String long_number;

    public SQueryVpnNumberReq() {
    }

    public SQueryVpnNumberReq(
           java.lang.Long group_id,
           java.lang.String short_number,
           java.lang.String long_number) {
           this.group_id = group_id;
           this.short_number = short_number;
           this.long_number = long_number;
    }


    /**
     * Gets the group_id value for this SQueryVpnNumberReq.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this SQueryVpnNumberReq.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the short_number value for this SQueryVpnNumberReq.
     * 
     * @return short_number
     */
    public java.lang.String getShort_number() {
        return short_number;
    }


    /**
     * Sets the short_number value for this SQueryVpnNumberReq.
     * 
     * @param short_number
     */
    public void setShort_number(java.lang.String short_number) {
        this.short_number = short_number;
    }


    /**
     * Gets the long_number value for this SQueryVpnNumberReq.
     * 
     * @return long_number
     */
    public java.lang.String getLong_number() {
        return long_number;
    }


    /**
     * Sets the long_number value for this SQueryVpnNumberReq.
     * 
     * @param long_number
     */
    public void setLong_number(java.lang.String long_number) {
        this.long_number = long_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof SQueryVpnNumberReq)) return false;
        SQueryVpnNumberReq other = (SQueryVpnNumberReq) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id()))) &&
            ((this.short_number==null && other.getShort_number()==null) || 
             (this.short_number!=null &&
              this.short_number.equals(other.getShort_number()))) &&
            ((this.long_number==null && other.getLong_number()==null) || 
             (this.long_number!=null &&
              this.long_number.equals(other.getLong_number())));
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
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getShort_number() != null) {
            _hashCode += getShort_number().hashCode();
        }
        if (getLong_number() != null) {
            _hashCode += getLong_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryVpnNumberReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryVpnNumberReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "short_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("long_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "long_number"));
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
