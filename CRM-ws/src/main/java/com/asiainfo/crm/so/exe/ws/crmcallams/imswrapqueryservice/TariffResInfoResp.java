/**
 * TariffResInfoResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class TariffResInfoResp  extends CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo[] listTariffResInfo;

    public TariffResInfoResp() {
    }

    public TariffResInfoResp(
           ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo[] listTariffResInfo) {
        super(
            responseHead);
        this.listTariffResInfo = listTariffResInfo;
    }


    /**
     * Gets the listTariffResInfo value for this TariffResInfoResp.
     * 
     * @return listTariffResInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo[] getListTariffResInfo() {
        return listTariffResInfo;
    }


    /**
     * Sets the listTariffResInfo value for this TariffResInfoResp.
     * 
     * @param listTariffResInfo
     */
    public void setListTariffResInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo[] listTariffResInfo) {
        this.listTariffResInfo = listTariffResInfo;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo getListTariffResInfo(int i) {
        return this.listTariffResInfo[i];
    }

    public void setListTariffResInfo(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TariffResInfo _value) {
        this.listTariffResInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TariffResInfoResp)) return false;
        TariffResInfoResp other = (TariffResInfoResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.listTariffResInfo==null && other.getListTariffResInfo()==null) || 
             (this.listTariffResInfo!=null &&
              java.util.Arrays.equals(this.listTariffResInfo, other.getListTariffResInfo())));
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
        if (getListTariffResInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListTariffResInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListTariffResInfo(), i);
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
        new org.apache.axis.description.TypeDesc(TariffResInfoResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "tariffResInfoResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listTariffResInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listTariffResInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "tariffResInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
