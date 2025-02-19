/**
 * ByUsageCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class ByUsageCondition  implements java.io.Serializable {
    private java.lang.Short networkType;

    private java.lang.Short distanceType;

    private java.lang.Short vpnCallType;

    private java.lang.Short segType;

    private java.lang.Short roamNetwork;

    private java.lang.String volumeUp;

    private java.lang.String volumeDown;

    public ByUsageCondition() {
    }

    public ByUsageCondition(
           java.lang.Short networkType,
           java.lang.Short distanceType,
           java.lang.Short vpnCallType,
           java.lang.Short segType,
           java.lang.Short roamNetwork,
           java.lang.String volumeUp,
           java.lang.String volumeDown) {
           this.networkType = networkType;
           this.distanceType = distanceType;
           this.vpnCallType = vpnCallType;
           this.segType = segType;
           this.roamNetwork = roamNetwork;
           this.volumeUp = volumeUp;
           this.volumeDown = volumeDown;
    }


    /**
     * Gets the networkType value for this ByUsageCondition.
     * 
     * @return networkType
     */
    public java.lang.Short getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this ByUsageCondition.
     * 
     * @param networkType
     */
    public void setNetworkType(java.lang.Short networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the distanceType value for this ByUsageCondition.
     * 
     * @return distanceType
     */
    public java.lang.Short getDistanceType() {
        return distanceType;
    }


    /**
     * Sets the distanceType value for this ByUsageCondition.
     * 
     * @param distanceType
     */
    public void setDistanceType(java.lang.Short distanceType) {
        this.distanceType = distanceType;
    }


    /**
     * Gets the vpnCallType value for this ByUsageCondition.
     * 
     * @return vpnCallType
     */
    public java.lang.Short getVpnCallType() {
        return vpnCallType;
    }


    /**
     * Sets the vpnCallType value for this ByUsageCondition.
     * 
     * @param vpnCallType
     */
    public void setVpnCallType(java.lang.Short vpnCallType) {
        this.vpnCallType = vpnCallType;
    }


    /**
     * Gets the segType value for this ByUsageCondition.
     * 
     * @return segType
     */
    public java.lang.Short getSegType() {
        return segType;
    }


    /**
     * Sets the segType value for this ByUsageCondition.
     * 
     * @param segType
     */
    public void setSegType(java.lang.Short segType) {
        this.segType = segType;
    }


    /**
     * Gets the roamNetwork value for this ByUsageCondition.
     * 
     * @return roamNetwork
     */
    public java.lang.Short getRoamNetwork() {
        return roamNetwork;
    }


    /**
     * Sets the roamNetwork value for this ByUsageCondition.
     * 
     * @param roamNetwork
     */
    public void setRoamNetwork(java.lang.Short roamNetwork) {
        this.roamNetwork = roamNetwork;
    }


    /**
     * Gets the volumeUp value for this ByUsageCondition.
     * 
     * @return volumeUp
     */
    public java.lang.String getVolumeUp() {
        return volumeUp;
    }


    /**
     * Sets the volumeUp value for this ByUsageCondition.
     * 
     * @param volumeUp
     */
    public void setVolumeUp(java.lang.String volumeUp) {
        this.volumeUp = volumeUp;
    }


    /**
     * Gets the volumeDown value for this ByUsageCondition.
     * 
     * @return volumeDown
     */
    public java.lang.String getVolumeDown() {
        return volumeDown;
    }


    /**
     * Sets the volumeDown value for this ByUsageCondition.
     * 
     * @param volumeDown
     */
    public void setVolumeDown(java.lang.String volumeDown) {
        this.volumeDown = volumeDown;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ByUsageCondition)) return false;
        ByUsageCondition other = (ByUsageCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
            ((this.distanceType==null && other.getDistanceType()==null) || 
             (this.distanceType!=null &&
              this.distanceType.equals(other.getDistanceType()))) &&
            ((this.vpnCallType==null && other.getVpnCallType()==null) || 
             (this.vpnCallType!=null &&
              this.vpnCallType.equals(other.getVpnCallType()))) &&
            ((this.segType==null && other.getSegType()==null) || 
             (this.segType!=null &&
              this.segType.equals(other.getSegType()))) &&
            ((this.roamNetwork==null && other.getRoamNetwork()==null) || 
             (this.roamNetwork!=null &&
              this.roamNetwork.equals(other.getRoamNetwork()))) &&
            ((this.volumeUp==null && other.getVolumeUp()==null) || 
             (this.volumeUp!=null &&
              this.volumeUp.equals(other.getVolumeUp()))) &&
            ((this.volumeDown==null && other.getVolumeDown()==null) || 
             (this.volumeDown!=null &&
              this.volumeDown.equals(other.getVolumeDown())));
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
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getDistanceType() != null) {
            _hashCode += getDistanceType().hashCode();
        }
        if (getVpnCallType() != null) {
            _hashCode += getVpnCallType().hashCode();
        }
        if (getSegType() != null) {
            _hashCode += getSegType().hashCode();
        }
        if (getRoamNetwork() != null) {
            _hashCode += getRoamNetwork().hashCode();
        }
        if (getVolumeUp() != null) {
            _hashCode += getVolumeUp().hashCode();
        }
        if (getVolumeDown() != null) {
            _hashCode += getVolumeDown().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ByUsageCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "byUsageCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpnCallType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vpnCallType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roamNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeUp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volumeUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeDown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volumeDown"));
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
