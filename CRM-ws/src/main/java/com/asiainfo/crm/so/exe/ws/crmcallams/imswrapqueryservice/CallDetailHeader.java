/**
 * CallDetailHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class CallDetailHeader  implements java.io.Serializable {
    private java.lang.String callDetailHeader;

    public CallDetailHeader() {
    }

    public CallDetailHeader(
           java.lang.String callDetailHeader) {
           this.callDetailHeader = callDetailHeader;
    }


    /**
     * Gets the callDetailHeader value for this CallDetailHeader.
     * 
     * @return callDetailHeader
     */
    public java.lang.String getCallDetailHeader() {
        return callDetailHeader;
    }


    /**
     * Sets the callDetailHeader value for this CallDetailHeader.
     * 
     * @param callDetailHeader
     */
    public void setCallDetailHeader(java.lang.String callDetailHeader) {
        this.callDetailHeader = callDetailHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailHeader)) return false;
        CallDetailHeader other = (CallDetailHeader) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callDetailHeader==null && other.getCallDetailHeader()==null) || 
             (this.callDetailHeader!=null &&
              this.callDetailHeader.equals(other.getCallDetailHeader())));
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
        if (getCallDetailHeader() != null) {
            _hashCode += getCallDetailHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDetailHeader"));
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
