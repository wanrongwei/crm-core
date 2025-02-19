/**
 * ReguideAcctInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class ReguideAcctInfo  implements java.io.Serializable {
    private java.lang.Long reguideAcctId;

    private java.lang.Long reguideCharge;

    public ReguideAcctInfo() {
    }

    public ReguideAcctInfo(
           java.lang.Long reguideAcctId,
           java.lang.Long reguideCharge) {
           this.reguideAcctId = reguideAcctId;
           this.reguideCharge = reguideCharge;
    }


    /**
     * Gets the reguideAcctId value for this ReguideAcctInfo.
     * 
     * @return reguideAcctId
     */
    public java.lang.Long getReguideAcctId() {
        return reguideAcctId;
    }


    /**
     * Sets the reguideAcctId value for this ReguideAcctInfo.
     * 
     * @param reguideAcctId
     */
    public void setReguideAcctId(java.lang.Long reguideAcctId) {
        this.reguideAcctId = reguideAcctId;
    }


    /**
     * Gets the reguideCharge value for this ReguideAcctInfo.
     * 
     * @return reguideCharge
     */
    public java.lang.Long getReguideCharge() {
        return reguideCharge;
    }


    /**
     * Sets the reguideCharge value for this ReguideAcctInfo.
     * 
     * @param reguideCharge
     */
    public void setReguideCharge(java.lang.Long reguideCharge) {
        this.reguideCharge = reguideCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReguideAcctInfo)) return false;
        ReguideAcctInfo other = (ReguideAcctInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reguideAcctId==null && other.getReguideAcctId()==null) || 
             (this.reguideAcctId!=null &&
              this.reguideAcctId.equals(other.getReguideAcctId()))) &&
            ((this.reguideCharge==null && other.getReguideCharge()==null) || 
             (this.reguideCharge!=null &&
              this.reguideCharge.equals(other.getReguideCharge())));
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
        if (getReguideAcctId() != null) {
            _hashCode += getReguideAcctId().hashCode();
        }
        if (getReguideCharge() != null) {
            _hashCode += getReguideCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReguideAcctInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideAcctInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
