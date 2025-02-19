/**
 * NbiDeviceTriplet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.esconsumer;

public class NbiDeviceTriplet  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.String networkID;

    private java.lang.String subscriberID;

    public NbiDeviceTriplet() {
    }

    public NbiDeviceTriplet(
           java.lang.String deviceID,
           java.lang.String networkID,
           java.lang.String subscriberID) {
           this.deviceID = deviceID;
           this.networkID = networkID;
           this.subscriberID = subscriberID;
    }


    /**
     * Gets the deviceID value for this NbiDeviceTriplet.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this NbiDeviceTriplet.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the networkID value for this NbiDeviceTriplet.
     * 
     * @return networkID
     */
    public java.lang.String getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this NbiDeviceTriplet.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.String networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the subscriberID value for this NbiDeviceTriplet.
     * 
     * @return subscriberID
     */
    public java.lang.String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this NbiDeviceTriplet.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(java.lang.String subscriberID) {
        this.subscriberID = subscriberID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbiDeviceTriplet)) return false;
        NbiDeviceTriplet other = (NbiDeviceTriplet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID())));
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NbiDeviceTriplet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://nbi.mdm.alu.com/", "nbiDeviceTriplet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
