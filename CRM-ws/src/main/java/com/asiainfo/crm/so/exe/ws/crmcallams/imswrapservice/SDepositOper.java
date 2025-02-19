/**
 * SDepositOper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SDepositOper  implements java.io.Serializable {
    private java.lang.Short operType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeposit sDeposit;

    public SDepositOper() {
    }

    public SDepositOper(
           java.lang.Short operType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeposit sDeposit) {
           this.operType = operType;
           this.sDeposit = sDeposit;
    }


    /**
     * Gets the operType value for this SDepositOper.
     * 
     * @return operType
     */
    public java.lang.Short getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this SDepositOper.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Short operType) {
        this.operType = operType;
    }


    /**
     * Gets the sDeposit value for this SDepositOper.
     * 
     * @return sDeposit
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeposit getSDeposit() {
        return sDeposit;
    }


    /**
     * Sets the sDeposit value for this SDepositOper.
     * 
     * @param sDeposit
     */
    public void setSDeposit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeposit sDeposit) {
        this.sDeposit = sDeposit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDepositOper)) return false;
        SDepositOper other = (SDepositOper) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType()))) &&
            ((this.sDeposit==null && other.getSDeposit()==null) || 
             (this.sDeposit!=null &&
              this.sDeposit.equals(other.getSDeposit())));
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
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        if (getSDeposit() != null) {
            _hashCode += getSDeposit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDepositOper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDepositOper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeposit"));
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
