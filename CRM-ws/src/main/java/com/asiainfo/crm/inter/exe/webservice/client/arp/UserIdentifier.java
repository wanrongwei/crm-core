/**
 * UserIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;


/**
 * Array of parameters to communicate UserId.
 */
public class UserIdentifier  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String imsi;

    private java.lang.String iccid;

    public UserIdentifier() {
    }

    public UserIdentifier(
           java.lang.String msisdn,
           java.lang.String imsi,
           java.lang.String iccid) {
           this.msisdn = msisdn;
           this.imsi = imsi;
           this.iccid = iccid;
    }


    /**
     * Gets the msisdn value for this UserIdentifier.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UserIdentifier.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the imsi value for this UserIdentifier.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this UserIdentifier.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the iccid value for this UserIdentifier.
     * 
     * @return iccid
     */
    public java.lang.String getIccid() {
        return iccid;
    }


    /**
     * Sets the iccid value for this UserIdentifier.
     * 
     * @param iccid
     */
    public void setIccid(java.lang.String iccid) {
        this.iccid = iccid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserIdentifier)) return false;
        UserIdentifier other = (UserIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.iccid==null && other.getIccid()==null) || 
             (this.iccid!=null &&
              this.iccid.equals(other.getIccid())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getIccid() != null) {
            _hashCode += getIccid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "UserIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "iccid"));
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
