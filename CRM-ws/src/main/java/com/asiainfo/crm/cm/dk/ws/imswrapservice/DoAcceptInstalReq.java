/**
 * DoAcceptInstalReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoAcceptInstalReq  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SInstalInfoAccept instalInfoAccept;

    public DoAcceptInstalReq() {
    }

    public DoAcceptInstalReq(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SInstalInfoAccept instalInfoAccept) {
           this.instalInfoAccept = instalInfoAccept;
    }


    /**
     * Gets the instalInfoAccept value for this DoAcceptInstalReq.
     * 
     * @return instalInfoAccept
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SInstalInfoAccept getInstalInfoAccept() {
        return instalInfoAccept;
    }


    /**
     * Sets the instalInfoAccept value for this DoAcceptInstalReq.
     * 
     * @param instalInfoAccept
     */
    public void setInstalInfoAccept(com.asiainfo.crm.cm.dk.ws.imswrapservice.SInstalInfoAccept instalInfoAccept) {
        this.instalInfoAccept = instalInfoAccept;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAcceptInstalReq)) return false;
        DoAcceptInstalReq other = (DoAcceptInstalReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instalInfoAccept==null && other.getInstalInfoAccept()==null) || 
             (this.instalInfoAccept!=null &&
              this.instalInfoAccept.equals(other.getInstalInfoAccept())));
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
        if (getInstalInfoAccept() != null) {
            _hashCode += getInstalInfoAccept().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAcceptInstalReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAcceptInstalReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalInfoAccept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalInfoAccept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfoAccept"));
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
