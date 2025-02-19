/**
 * RaiseEventResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.esconsumer;

public class RaiseEventResponse  implements java.io.Serializable {
    private java.lang.String rspCode;

    private java.lang.String rspDesc;

    public RaiseEventResponse() {
    }

    public RaiseEventResponse(
           java.lang.String rspCode,
           java.lang.String rspDesc) {
           this.rspCode = rspCode;
           this.rspDesc = rspDesc;
    }


    /**
     * Gets the rspCode value for this RaiseEventResponse.
     * 
     * @return rspCode
     */
    public java.lang.String getRspCode() {
        return rspCode;
    }


    /**
     * Sets the rspCode value for this RaiseEventResponse.
     * 
     * @param rspCode
     */
    public void setRspCode(java.lang.String rspCode) {
        this.rspCode = rspCode;
    }


    /**
     * Gets the rspDesc value for this RaiseEventResponse.
     * 
     * @return rspDesc
     */
    public java.lang.String getRspDesc() {
        return rspDesc;
    }


    /**
     * Sets the rspDesc value for this RaiseEventResponse.
     * 
     * @param rspDesc
     */
    public void setRspDesc(java.lang.String rspDesc) {
        this.rspDesc = rspDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RaiseEventResponse)) return false;
        RaiseEventResponse other = (RaiseEventResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rspCode==null && other.getRspCode()==null) || 
             (this.rspCode!=null &&
              this.rspCode.equals(other.getRspCode()))) &&
            ((this.rspDesc==null && other.getRspDesc()==null) || 
             (this.rspDesc!=null &&
              this.rspDesc.equals(other.getRspDesc())));
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
        if (getRspCode() != null) {
            _hashCode += getRspCode().hashCode();
        }
        if (getRspDesc() != null) {
            _hashCode += getRspDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RaiseEventResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", ">raiseEventResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspDesc"));
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
