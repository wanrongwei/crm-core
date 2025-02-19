/**
 * DevicesCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class DevicesCheck  implements java.io.Serializable {
    private java.lang.String deviceId;

    private java.lang.String devicePostStatus;

    private java.lang.String devicePostStatusMessage;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public DevicesCheck() {
    }

    public DevicesCheck(
           java.lang.String deviceId,
           java.lang.String devicePostStatus,
           java.lang.String devicePostStatusMessage,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.deviceId = deviceId;
           this.devicePostStatus = devicePostStatus;
           this.devicePostStatusMessage = devicePostStatusMessage;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the deviceId value for this DevicesCheck.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this DevicesCheck.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the devicePostStatus value for this DevicesCheck.
     * 
     * @return devicePostStatus
     */
    public java.lang.String getDevicePostStatus() {
        return devicePostStatus;
    }


    /**
     * Sets the devicePostStatus value for this DevicesCheck.
     * 
     * @param devicePostStatus
     */
    public void setDevicePostStatus(java.lang.String devicePostStatus) {
        this.devicePostStatus = devicePostStatus;
    }


    /**
     * Gets the devicePostStatusMessage value for this DevicesCheck.
     * 
     * @return devicePostStatusMessage
     */
    public java.lang.String getDevicePostStatusMessage() {
        return devicePostStatusMessage;
    }


    /**
     * Sets the devicePostStatusMessage value for this DevicesCheck.
     * 
     * @param devicePostStatusMessage
     */
    public void setDevicePostStatusMessage(java.lang.String devicePostStatusMessage) {
        this.devicePostStatusMessage = devicePostStatusMessage;
    }


    /**
     * Gets the attrInfo value for this DevicesCheck.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this DevicesCheck.
     * 
     * @param attrInfo
     */
    public void setAttrInfo(com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
        this.attrInfo = attrInfo;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo getAttrInfo(int i) {
        return this.attrInfo[i];
    }

    public void setAttrInfo(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo _value) {
        this.attrInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DevicesCheck)) return false;
        DevicesCheck other = (DevicesCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.devicePostStatus==null && other.getDevicePostStatus()==null) || 
             (this.devicePostStatus!=null &&
              this.devicePostStatus.equals(other.getDevicePostStatus()))) &&
            ((this.devicePostStatusMessage==null && other.getDevicePostStatusMessage()==null) || 
             (this.devicePostStatusMessage!=null &&
              this.devicePostStatusMessage.equals(other.getDevicePostStatusMessage()))) &&
            ((this.attrInfo==null && other.getAttrInfo()==null) || 
             (this.attrInfo!=null &&
              java.util.Arrays.equals(this.attrInfo, other.getAttrInfo())));
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
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDevicePostStatus() != null) {
            _hashCode += getDevicePostStatus().hashCode();
        }
        if (getDevicePostStatusMessage() != null) {
            _hashCode += getDevicePostStatusMessage().hashCode();
        }
        if (getAttrInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttrInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttrInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DevicesCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DevicesCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePostStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DevicePostStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePostStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DevicePostStatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttrInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AttrInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
