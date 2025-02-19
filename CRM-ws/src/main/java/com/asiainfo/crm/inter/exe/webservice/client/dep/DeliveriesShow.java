/**
 * DeliveriesShow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class DeliveriesShow  implements java.io.Serializable {
    private java.lang.String deliveryNumber;

    private java.lang.String shipDate;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesShow[] devices;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public DeliveriesShow() {
    }

    public DeliveriesShow(
           java.lang.String deliveryNumber,
           java.lang.String shipDate,
           com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesShow[] devices,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.deliveryNumber = deliveryNumber;
           this.shipDate = shipDate;
           this.devices = devices;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the deliveryNumber value for this DeliveriesShow.
     * 
     * @return deliveryNumber
     */
    public java.lang.String getDeliveryNumber() {
        return deliveryNumber;
    }


    /**
     * Sets the deliveryNumber value for this DeliveriesShow.
     * 
     * @param deliveryNumber
     */
    public void setDeliveryNumber(java.lang.String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }


    /**
     * Gets the shipDate value for this DeliveriesShow.
     * 
     * @return shipDate
     */
    public java.lang.String getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this DeliveriesShow.
     * 
     * @param shipDate
     */
    public void setShipDate(java.lang.String shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the devices value for this DeliveriesShow.
     * 
     * @return devices
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesShow[] getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this DeliveriesShow.
     * 
     * @param devices
     */
    public void setDevices(com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesShow[] devices) {
        this.devices = devices;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesShow getDevices(int i) {
        return this.devices[i];
    }

    public void setDevices(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.DevicesShow _value) {
        this.devices[i] = _value;
    }


    /**
     * Gets the attrInfo value for this DeliveriesShow.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this DeliveriesShow.
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
        if (!(obj instanceof DeliveriesShow)) return false;
        DeliveriesShow other = (DeliveriesShow) obj;
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
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
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
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(DeliveriesShow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DeliveriesShow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Devices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "DevicesShow"));
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
