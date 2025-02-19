/**
 * ConfirmOrderRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.smdp;

public class ConfirmOrderRequestBody  implements java.io.Serializable {
    private java.lang.String iccid;

    private java.lang.String eid;

    private java.lang.String matchingId = "";

    private java.lang.String smds = "";

    private boolean releaseFlag;

    public ConfirmOrderRequestBody() {
    }

    public ConfirmOrderRequestBody(
           java.lang.String iccid,
           java.lang.String eid,
           boolean releaseFlag) {
           this.iccid = iccid;
           this.eid = eid;
           this.releaseFlag = releaseFlag;
    }


    /**
     * Gets the iccid value for this ConfirmOrderRequestBody.
     * 
     * @return iccid
     */
    public java.lang.String getIccid() {
        return iccid;
    }


    /**
     * Sets the iccid value for this ConfirmOrderRequestBody.
     * 
     * @param iccid
     */
    public void setIccid(java.lang.String iccid) {
        this.iccid = iccid;
    }


    /**
     * Gets the eid value for this ConfirmOrderRequestBody.
     * 
     * @return eid
     */
    public java.lang.String getEid() {
        return eid;
    }


    /**
     * Sets the eid value for this ConfirmOrderRequestBody.
     * 
     * @param eid
     */
    public void setEid(java.lang.String eid) {
        this.eid = eid;
    }


    /**
     * Gets the matchingId value for this ConfirmOrderRequestBody.
     * 
     * @return matchingId
     */
    public java.lang.String getMatchingId() {
        return matchingId;
    }


    /**
     * Sets the matchingId value for this ConfirmOrderRequestBody.
     * 
     * @param matchingId
     */
    public void setMatchingId(java.lang.String matchingId) {
        this.matchingId = matchingId;
    }


    /**
     * Gets the releaseFlag value for this ConfirmOrderRequestBody.
     * 
     * @return releaseFlag
     */
    public boolean isReleaseFlag() {
        return releaseFlag;
    }


    /**
     * Sets the releaseFlag value for this ConfirmOrderRequestBody.
     * 
     * @param releaseFlag
     */
    public void setReleaseFlag(boolean releaseFlag) {
        this.releaseFlag = releaseFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmOrderRequestBody)) return false;
        ConfirmOrderRequestBody other = (ConfirmOrderRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iccid==null && other.getIccid()==null) || 
             (this.iccid!=null &&
              this.iccid.equals(other.getIccid()))) &&
            ((this.eid==null && other.getEid()==null) || 
             (this.eid!=null &&
              this.eid.equals(other.getEid()))) &&
            ((this.matchingId==null && other.getMatchingId()==null) || 
             (this.matchingId!=null &&
              this.matchingId.equals(other.getMatchingId()))) &&
            this.releaseFlag == other.isReleaseFlag();
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
        if (getIccid() != null) {
            _hashCode += getIccid().hashCode();
        }
        if (getEid() != null) {
            _hashCode += getEid().hashCode();
        }
        if (getMatchingId() != null) {
            _hashCode += getMatchingId().hashCode();
        }
        _hashCode += (isReleaseFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmOrderRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "confirmOrderRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iccid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

    public String getSmds() {
        return smds;
    }

    public void setSmds(String smds) {
        this.smds = smds;
    }
}
