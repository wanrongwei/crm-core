/**
 * StaticIPsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

public class StaticIPsInfo  implements java.io.Serializable {
    private String username;

    private String MAC;

    private String CMTS_ID;

    private String IP;

    public StaticIPsInfo() {
    }

    public StaticIPsInfo(
           String username,
           String MAC,
           String CMTS_ID,
           String IP) {
           this.username = username;
           this.MAC = MAC;
           this.CMTS_ID = CMTS_ID;
           this.IP = IP;
    }


    /**
     * Gets the username value for this StaticIPsInfo.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this StaticIPsInfo.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the MAC value for this StaticIPsInfo.
     * 
     * @return MAC
     */
    public String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this StaticIPsInfo.
     * 
     * @param MAC
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }


    /**
     * Gets the CMTS_ID value for this StaticIPsInfo.
     * 
     * @return CMTS_ID
     */
    public String getCMTS_ID() {
        return CMTS_ID;
    }


    /**
     * Sets the CMTS_ID value for this StaticIPsInfo.
     * 
     * @param CMTS_ID
     */
    public void setCMTS_ID(String CMTS_ID) {
        this.CMTS_ID = CMTS_ID;
    }


    /**
     * Gets the IP value for this StaticIPsInfo.
     * 
     * @return IP
     */
    public String getIP() {
        return IP;
    }


    /**
     * Sets the IP value for this StaticIPsInfo.
     * 
     * @param IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StaticIPsInfo)) return false;
        StaticIPsInfo other = (StaticIPsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC()))) &&
            ((this.CMTS_ID==null && other.getCMTS_ID()==null) || 
             (this.CMTS_ID!=null &&
              this.CMTS_ID.equals(other.getCMTS_ID()))) &&
            ((this.IP==null && other.getIP()==null) || 
             (this.IP!=null &&
              this.IP.equals(other.getIP())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        if (getCMTS_ID() != null) {
            _hashCode += getCMTS_ID().hashCode();
        }
        if (getIP() != null) {
            _hashCode += getIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StaticIPsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "staticIPsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMTS_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMTS_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IP"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
