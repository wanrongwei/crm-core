/**
 * SPrintOutResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SPrintOutResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOut sPrintOut;

    public SPrintOutResponse() {
    }

    public SPrintOutResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOut sPrintOut) {
           this.sPrintOut = sPrintOut;
    }


    /**
     * Gets the sPrintOut value for this SPrintOutResponse.
     * 
     * @return sPrintOut
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOut getSPrintOut() {
        return sPrintOut;
    }


    /**
     * Sets the sPrintOut value for this SPrintOutResponse.
     * 
     * @param sPrintOut
     */
    public void setSPrintOut(com.asiainfo.crm.cm.dk.ws.imswrapservice.SPrintOut sPrintOut) {
        this.sPrintOut = sPrintOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPrintOutResponse)) return false;
        SPrintOutResponse other = (SPrintOutResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sPrintOut==null && other.getSPrintOut()==null) || 
             (this.sPrintOut!=null &&
              this.sPrintOut.equals(other.getSPrintOut())));
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
        if (getSPrintOut() != null) {
            _hashCode += getSPrintOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPrintOutResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintOutResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPrintOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sPrintOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintOut"));
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
