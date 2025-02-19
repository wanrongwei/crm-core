/**
 * FreeResInfoResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class FreeResInfoResp  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SimpleMapOfLongListOfFreeResInfo mapFreeResInfo;

    public FreeResInfoResp() {
    }

    public FreeResInfoResp(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SimpleMapOfLongListOfFreeResInfo mapFreeResInfo) {
        super(
            responseHead);
        this.mapFreeResInfo = mapFreeResInfo;
    }


    /**
     * Gets the mapFreeResInfo value for this FreeResInfoResp.
     * 
     * @return mapFreeResInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SimpleMapOfLongListOfFreeResInfo getMapFreeResInfo() {
        return mapFreeResInfo;
    }


    /**
     * Sets the mapFreeResInfo value for this FreeResInfoResp.
     * 
     * @param mapFreeResInfo
     */
    public void setMapFreeResInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SimpleMapOfLongListOfFreeResInfo mapFreeResInfo) {
        this.mapFreeResInfo = mapFreeResInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeResInfoResp)) return false;
        FreeResInfoResp other = (FreeResInfoResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mapFreeResInfo==null && other.getMapFreeResInfo()==null) || 
             (this.mapFreeResInfo!=null &&
              this.mapFreeResInfo.equals(other.getMapFreeResInfo())));
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
        if (getMapFreeResInfo() != null) {
            _hashCode += getMapFreeResInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeResInfoResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResInfoResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapFreeResInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mapFreeResInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "simpleMapOfLongListOfFreeResInfo"));
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
