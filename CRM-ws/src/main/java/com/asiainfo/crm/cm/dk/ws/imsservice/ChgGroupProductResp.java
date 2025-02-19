/**
 * ChgGroupProductResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class ChgGroupProductResp  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] sProductOrderResultList;

    public ChgGroupProductResp() {
    }

    public ChgGroupProductResp(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] sProductOrderResultList) {
        super(
            responseHead);
        this.sProductOrderResultList = sProductOrderResultList;
    }


    /**
     * Gets the sProductOrderResultList value for this ChgGroupProductResp.
     * 
     * @return sProductOrderResultList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] getSProductOrderResultList() {
        return sProductOrderResultList;
    }


    /**
     * Sets the sProductOrderResultList value for this ChgGroupProductResp.
     * 
     * @param sProductOrderResultList
     */
    public void setSProductOrderResultList(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] sProductOrderResultList) {
        this.sProductOrderResultList = sProductOrderResultList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChgGroupProductResp)) return false;
        ChgGroupProductResp other = (ChgGroupProductResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sProductOrderResultList==null && other.getSProductOrderResultList()==null) || 
             (this.sProductOrderResultList!=null &&
              java.util.Arrays.equals(this.sProductOrderResultList, other.getSProductOrderResultList())));
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
        if (getSProductOrderResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSProductOrderResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSProductOrderResultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChgGroupProductResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "chgGroupProductResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SProductOrderResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sProductOrderResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderResultListItem"));
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
