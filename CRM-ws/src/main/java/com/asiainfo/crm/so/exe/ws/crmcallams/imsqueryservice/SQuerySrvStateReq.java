/**
 * SQuerySrvStateReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class SQuerySrvStateReq  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.Integer busi_service_id;

    public SQuerySrvStateReq() {
    }

    public SQuerySrvStateReq(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.Integer busi_service_id) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.busi_service_id = busi_service_id;
    }


    /**
     * Gets the user_id value for this SQuerySrvStateReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SQuerySrvStateReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SQuerySrvStateReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SQuerySrvStateReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the busi_service_id value for this SQuerySrvStateReq.
     * 
     * @return busi_service_id
     */
    public java.lang.Integer getBusi_service_id() {
        return busi_service_id;
    }


    /**
     * Sets the busi_service_id value for this SQuerySrvStateReq.
     * 
     * @param busi_service_id
     */
    public void setBusi_service_id(java.lang.Integer busi_service_id) {
        this.busi_service_id = busi_service_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof SQuerySrvStateReq)) return false;
        SQuerySrvStateReq other = (SQuerySrvStateReq) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.busi_service_id==null && other.getBusi_service_id()==null) || 
             (this.busi_service_id!=null &&
              this.busi_service_id.equals(other.getBusi_service_id())));
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getBusi_service_id() != null) {
            _hashCode += getBusi_service_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQuerySrvStateReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySrvStateReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busi_service_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busi_service_id"));
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
