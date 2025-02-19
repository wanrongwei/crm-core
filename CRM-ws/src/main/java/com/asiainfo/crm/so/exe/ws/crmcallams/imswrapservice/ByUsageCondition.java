/**
 * ByUsageCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class ByUsageCondition  implements java.io.Serializable {
    private java.lang.Short network_type;

    private java.lang.Short distance_type;

    private java.lang.Short vpn_call_type;

    private java.lang.Short seg_type;

    private java.lang.Short roam_network;

    public ByUsageCondition() {
    }

    public ByUsageCondition(
           java.lang.Short network_type,
           java.lang.Short distance_type,
           java.lang.Short vpn_call_type,
           java.lang.Short seg_type,
           java.lang.Short roam_network) {
           this.network_type = network_type;
           this.distance_type = distance_type;
           this.vpn_call_type = vpn_call_type;
           this.seg_type = seg_type;
           this.roam_network = roam_network;
    }


    /**
     * Gets the network_type value for this ByUsageCondition.
     * 
     * @return network_type
     */
    public java.lang.Short getNetwork_type() {
        return network_type;
    }


    /**
     * Sets the network_type value for this ByUsageCondition.
     * 
     * @param network_type
     */
    public void setNetwork_type(java.lang.Short network_type) {
        this.network_type = network_type;
    }


    /**
     * Gets the distance_type value for this ByUsageCondition.
     * 
     * @return distance_type
     */
    public java.lang.Short getDistance_type() {
        return distance_type;
    }


    /**
     * Sets the distance_type value for this ByUsageCondition.
     * 
     * @param distance_type
     */
    public void setDistance_type(java.lang.Short distance_type) {
        this.distance_type = distance_type;
    }


    /**
     * Gets the vpn_call_type value for this ByUsageCondition.
     * 
     * @return vpn_call_type
     */
    public java.lang.Short getVpn_call_type() {
        return vpn_call_type;
    }


    /**
     * Sets the vpn_call_type value for this ByUsageCondition.
     * 
     * @param vpn_call_type
     */
    public void setVpn_call_type(java.lang.Short vpn_call_type) {
        this.vpn_call_type = vpn_call_type;
    }


    /**
     * Gets the seg_type value for this ByUsageCondition.
     * 
     * @return seg_type
     */
    public java.lang.Short getSeg_type() {
        return seg_type;
    }


    /**
     * Sets the seg_type value for this ByUsageCondition.
     * 
     * @param seg_type
     */
    public void setSeg_type(java.lang.Short seg_type) {
        this.seg_type = seg_type;
    }


    /**
     * Gets the roam_network value for this ByUsageCondition.
     * 
     * @return roam_network
     */
    public java.lang.Short getRoam_network() {
        return roam_network;
    }


    /**
     * Sets the roam_network value for this ByUsageCondition.
     * 
     * @param roam_network
     */
    public void setRoam_network(java.lang.Short roam_network) {
        this.roam_network = roam_network;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ByUsageCondition)) return false;
        ByUsageCondition other = (ByUsageCondition) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.network_type==null && other.getNetwork_type()==null) || 
             (this.network_type!=null &&
              this.network_type.equals(other.getNetwork_type()))) &&
            ((this.distance_type==null && other.getDistance_type()==null) || 
             (this.distance_type!=null &&
              this.distance_type.equals(other.getDistance_type()))) &&
            ((this.vpn_call_type==null && other.getVpn_call_type()==null) || 
             (this.vpn_call_type!=null &&
              this.vpn_call_type.equals(other.getVpn_call_type()))) &&
            ((this.seg_type==null && other.getSeg_type()==null) || 
             (this.seg_type!=null &&
              this.seg_type.equals(other.getSeg_type()))) &&
            ((this.roam_network==null && other.getRoam_network()==null) || 
             (this.roam_network!=null &&
              this.roam_network.equals(other.getRoam_network())));
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
        if (getNetwork_type() != null) {
            _hashCode += getNetwork_type().hashCode();
        }
        if (getDistance_type() != null) {
            _hashCode += getDistance_type().hashCode();
        }
        if (getVpn_call_type() != null) {
            _hashCode += getVpn_call_type().hashCode();
        }
        if (getSeg_type() != null) {
            _hashCode += getSeg_type().hashCode();
        }
        if (getRoam_network() != null) {
            _hashCode += getRoam_network().hashCode();
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
        elemField.setFieldName("network_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distance_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpn_call_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vpn_call_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seg_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seg_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roam_network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roam_network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
