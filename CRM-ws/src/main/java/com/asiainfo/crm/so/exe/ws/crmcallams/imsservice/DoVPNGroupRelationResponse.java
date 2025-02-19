/**
 * DoVPNGroupRelationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class DoVPNGroupRelationResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] sProdResultList;

    public DoVPNGroupRelationResponse() {
    }

    public DoVPNGroupRelationResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] sProdResultList) {
        super(
            responseHead);
        this.sProdResultList = sProdResultList;
    }


    /**
     * Gets the sProdResultList value for this DoVPNGroupRelationResponse.
     * 
     * @return sProdResultList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] getSProdResultList() {
        return sProdResultList;
    }


    /**
     * Sets the sProdResultList value for this DoVPNGroupRelationResponse.
     * 
     * @param sProdResultList
     */
    public void setSProdResultList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] sProdResultList) {
        this.sProdResultList = sProdResultList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoVPNGroupRelationResponse)) return false;
        DoVPNGroupRelationResponse other = (DoVPNGroupRelationResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sProdResultList==null && other.getSProdResultList()==null) || 
             (this.sProdResultList!=null &&
              java.util.Arrays.equals(this.sProdResultList, other.getSProdResultList())));
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
        if (getSProdResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSProdResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSProdResultList(), i);
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
        new org.apache.axis.description.TypeDesc(DoVPNGroupRelationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doVPNGroupRelationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SProdResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sProdResultList"));
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
