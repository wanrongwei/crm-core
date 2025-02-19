/**
 * ConfirmOrderResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.smdp;

public class ConfirmOrderResponseBody  implements java.io.Serializable {
    private java.lang.String eid;

    private java.lang.String matchingId;

    private java.lang.String smdpAddress;

    public ConfirmOrderResponseBody() {
    }

    public ConfirmOrderResponseBody(
           java.lang.String eid,
           java.lang.String matchingId,
           java.lang.String smdpAddress) {
           this.eid = eid;
           this.matchingId = matchingId;
           this.smdpAddress = smdpAddress;
    }


    /**
     * Gets the eid value for this ConfirmOrderResponseBody.
     * 
     * @return eid
     */
    public java.lang.String getEid() {
        return eid;
    }


    /**
     * Sets the eid value for this ConfirmOrderResponseBody.
     * 
     * @param eid
     */
    public void setEid(java.lang.String eid) {
        this.eid = eid;
    }


    /**
     * Gets the matchingId value for this ConfirmOrderResponseBody.
     * 
     * @return matchingId
     */
    public java.lang.String getMatchingId() {
        return matchingId;
    }


    /**
     * Sets the matchingId value for this ConfirmOrderResponseBody.
     * 
     * @param matchingId
     */
    public void setMatchingId(java.lang.String matchingId) {
        this.matchingId = matchingId;
    }


    /**
     * Gets the smdpAddress value for this ConfirmOrderResponseBody.
     * 
     * @return smdpAddress
     */
    public java.lang.String getSmdpAddress() {
        return smdpAddress;
    }


    /**
     * Sets the smdpAddress value for this ConfirmOrderResponseBody.
     * 
     * @param smdpAddress
     */
    public void setSmdpAddress(java.lang.String smdpAddress) {
        this.smdpAddress = smdpAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmOrderResponseBody)) return false;
        ConfirmOrderResponseBody other = (ConfirmOrderResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eid==null && other.getEid()==null) || 
             (this.eid!=null &&
              this.eid.equals(other.getEid()))) &&
            ((this.matchingId==null && other.getMatchingId()==null) || 
             (this.matchingId!=null &&
              this.matchingId.equals(other.getMatchingId()))) &&
            ((this.smdpAddress==null && other.getSmdpAddress()==null) || 
             (this.smdpAddress!=null &&
              this.smdpAddress.equals(other.getSmdpAddress())));
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
        if (getEid() != null) {
            _hashCode += getEid().hashCode();
        }
        if (getMatchingId() != null) {
            _hashCode += getMatchingId().hashCode();
        }
        if (getSmdpAddress() != null) {
            _hashCode += getSmdpAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmOrderResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smdpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smdpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
