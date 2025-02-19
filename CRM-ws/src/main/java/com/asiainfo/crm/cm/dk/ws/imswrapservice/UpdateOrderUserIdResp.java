/**
 * UpdateOrderUserIdResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class UpdateOrderUserIdResp  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer updateUserIdFlag;

    public UpdateOrderUserIdResp() {
    }

    public UpdateOrderUserIdResp(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           java.lang.Integer updateUserIdFlag) {
        super(
            responseHead);
        this.updateUserIdFlag = updateUserIdFlag;
    }


    /**
     * Gets the updateUserIdFlag value for this UpdateOrderUserIdResp.
     * 
     * @return updateUserIdFlag
     */
    public java.lang.Integer getUpdateUserIdFlag() {
        return updateUserIdFlag;
    }


    /**
     * Sets the updateUserIdFlag value for this UpdateOrderUserIdResp.
     * 
     * @param updateUserIdFlag
     */
    public void setUpdateUserIdFlag(java.lang.Integer updateUserIdFlag) {
        this.updateUserIdFlag = updateUserIdFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateOrderUserIdResp)) return false;
        UpdateOrderUserIdResp other = (UpdateOrderUserIdResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.updateUserIdFlag==null && other.getUpdateUserIdFlag()==null) || 
             (this.updateUserIdFlag!=null &&
              this.updateUserIdFlag.equals(other.getUpdateUserIdFlag())));
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
        if (getUpdateUserIdFlag() != null) {
            _hashCode += getUpdateUserIdFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateOrderUserIdResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updateOrderUserIdResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateUserIdFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateUserIdFlag"));
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
