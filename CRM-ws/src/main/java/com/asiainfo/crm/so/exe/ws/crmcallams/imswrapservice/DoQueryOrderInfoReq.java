/**
 * DoQueryOrderInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryOrderInfoReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderIn qryOrderIn;

    public DoQueryOrderInfoReq() {
    }

    public DoQueryOrderInfoReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderIn qryOrderIn) {
           this.qryOrderIn = qryOrderIn;
    }


    /**
     * Gets the qryOrderIn value for this DoQueryOrderInfoReq.
     * 
     * @return qryOrderIn
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderIn getQryOrderIn() {
        return qryOrderIn;
    }


    /**
     * Sets the qryOrderIn value for this DoQueryOrderInfoReq.
     * 
     * @param qryOrderIn
     */
    public void setQryOrderIn(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQryOrderIn qryOrderIn) {
        this.qryOrderIn = qryOrderIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryOrderInfoReq)) return false;
        DoQueryOrderInfoReq other = (DoQueryOrderInfoReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qryOrderIn==null && other.getQryOrderIn()==null) || 
             (this.qryOrderIn!=null &&
              this.qryOrderIn.equals(other.getQryOrderIn())));
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
        if (getQryOrderIn() != null) {
            _hashCode += getQryOrderIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryOrderInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryOrderInfoReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qryOrderIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qryOrderIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryOrderIn"));
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
