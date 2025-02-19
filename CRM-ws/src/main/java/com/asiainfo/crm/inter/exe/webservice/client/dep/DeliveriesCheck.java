/**
 * DeliveriesCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class DeliveriesCheck  implements java.io.Serializable {
    private java.lang.String deliveryNumber;

    private java.lang.String deliveryPostStatus;

    private java.lang.String deliveryPostStatusMessage;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesCheck[] devices;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public DeliveriesCheck() {
    }

    public DeliveriesCheck(
           java.lang.String deliveryNumber,
           java.lang.String deliveryPostStatus,
           java.lang.String deliveryPostStatusMessage,
           com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesCheck[] devices,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.deliveryNumber = deliveryNumber;
           this.deliveryPostStatus = deliveryPostStatus;
           this.deliveryPostStatusMessage = deliveryPostStatusMessage;
           this.devices = devices;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the deliveryNumber value for this DeliveriesCheck.
     * 
     * @return deliveryNumber
     */
    public java.lang.String getDeliveryNumber() {
        return deliveryNumber;
    }


    /**
     * Sets the deliveryNumber value for this DeliveriesCheck.
     * 
     * @param deliveryNumber
     */
    public void setDeliveryNumber(java.lang.String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }


    /**
     * Gets the deliveryPostStatus value for this DeliveriesCheck.
     * 
     * @return deliveryPostStatus
     */
    public java.lang.String getDeliveryPostStatus() {
        return deliveryPostStatus;
    }


    /**
     * Sets the deliveryPostStatus value for this DeliveriesCheck.
     * 
     * @param deliveryPostStatus
     */
    public void setDeliveryPostStatus(java.lang.String deliveryPostStatus) {
        this.deliveryPostStatus = deliveryPostStatus;
    }


    /**
     * Gets the deliveryPostStatusMessage value for this DeliveriesCheck.
     * 
     * @return deliveryPostStatusMessage
     */
    public java.lang.String getDeliveryPostStatusMessage() {
        return deliveryPostStatusMessage;
    }


    /**
     * Sets the deliveryPostStatusMessage value for this DeliveriesCheck.
     * 
     * @param deliveryPostStatusMessage
     */
    public void setDeliveryPostStatusMessage(java.lang.String deliveryPostStatusMessage) {
        this.deliveryPostStatusMessage = deliveryPostStatusMessage;
    }


    /**
     * Gets the devices value for this DeliveriesCheck.
     * 
     * @return devices
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesCheck[] getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this DeliveriesCheck.
     * 
     * @param devices
     */
    public void setDevices(com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesCheck[] devices) {
        this.devices = devices;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesCheck getDevices(int i) {
        return this.devices[i];
    }

    public void setDevices(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesCheck _value) {
        this.devices[i] = _value;
    }


    /**
     * Gets the attrInfo value for this DeliveriesCheck.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this DeliveriesCheck.
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
        if (!(obj instanceof DeliveriesCheck)) return false;
        DeliveriesCheck other = (DeliveriesCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryNumber==null && other.getDeliveryNumber()==null) || 
             (this.deliveryNumber!=null &&
              this.deliveryNumber.equals(other.getDeliveryNumber()))) &&
            ((this.deliveryPostStatus==null && other.getDeliveryPostStatus()==null) || 
             (this.deliveryPostStatus!=null &&
              this.deliveryPostStatus.equals(other.getDeliveryPostStatus()))) &&
            ((this.deliveryPostStatusMessage==null && other.getDeliveryPostStatusMessage()==null) || 
             (this.deliveryPostStatusMessage!=null &&
              this.deliveryPostStatusMessage.equals(other.getDeliveryPostStatusMessage()))) &&
            ((this.devices==null && other.getDevices()==null) || 
             (this.devices!=null &&
              java.util.Arrays.equals(this.devices, other.getDevices()))) &&
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
        if (getDeliveryNumber() != null) {
            _hashCode += getDeliveryNumber().hashCode();
        }
        if (getDeliveryPostStatus() != null) {
            _hashCode += getDeliveryPostStatus().hashCode();
        }
        if (getDeliveryPostStatusMessage() != null) {
            _hashCode += getDeliveryPostStatusMessage().hashCode();
        }
        if (getDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(DeliveriesCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeliveriesCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPostStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryPostStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPostStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryPostStatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Devices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DevicesCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
