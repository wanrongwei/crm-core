/**
 * AgreementGetRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.poa;

public class AgreementGetRequestBody  implements java.io.Serializable {
    private java.lang.String agreementType;

    private java.lang.String partyId;

    public AgreementGetRequestBody() {
    }

    public AgreementGetRequestBody(
           java.lang.String agreementType,
           java.lang.String partyId) {
           this.agreementType = agreementType;
           this.partyId = partyId;
    }


    /**
     * Gets the agreementType value for this AgreementGetRequestBody.
     * 
     * @return agreementType
     */
    public java.lang.String getAgreementType() {
        return agreementType;
    }


    /**
     * Sets the agreementType value for this AgreementGetRequestBody.
     * 
     * @param agreementType
     */
    public void setAgreementType(java.lang.String agreementType) {
        this.agreementType = agreementType;
    }


    /**
     * Gets the partyId value for this AgreementGetRequestBody.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this AgreementGetRequestBody.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgreementGetRequestBody)) return false;
        AgreementGetRequestBody other = (AgreementGetRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agreementType==null && other.getAgreementType()==null) || 
             (this.agreementType!=null &&
              this.agreementType.equals(other.getAgreementType()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId())));
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
        if (getAgreementType() != null) {
            _hashCode += getAgreementType().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgreementGetRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AgreementGetRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
