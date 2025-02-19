/**
 * DoUnifiedPayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoUnifiedPayResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SInsertOrderRet insertOrderRet;

    public DoUnifiedPayResponse() {
    }

    public DoUnifiedPayResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SInsertOrderRet insertOrderRet) {
        super(
            responseHead);
        this.insertOrderRet = insertOrderRet;
    }


    /**
     * Gets the insertOrderRet value for this DoUnifiedPayResponse.
     * 
     * @return insertOrderRet
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SInsertOrderRet getInsertOrderRet() {
        return insertOrderRet;
    }


    /**
     * Sets the insertOrderRet value for this DoUnifiedPayResponse.
     * 
     * @param insertOrderRet
     */
    public void setInsertOrderRet(com.asiainfo.crm.cm.dk.ws.imswrapservice.SInsertOrderRet insertOrderRet) {
        this.insertOrderRet = insertOrderRet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoUnifiedPayResponse)) return false;
        DoUnifiedPayResponse other = (DoUnifiedPayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.insertOrderRet==null && other.getInsertOrderRet()==null) || 
             (this.insertOrderRet!=null &&
              this.insertOrderRet.equals(other.getInsertOrderRet())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getInsertOrderRet() != null) {
            _hashCode += getInsertOrderRet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoUnifiedPayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUnifiedPayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertOrderRet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertOrderRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInsertOrderRet"));
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
