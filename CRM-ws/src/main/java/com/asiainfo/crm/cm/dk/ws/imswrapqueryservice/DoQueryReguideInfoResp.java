/**
 * DoQueryReguideInfoResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryReguideInfoResp  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideInfo[] reguideInfoList;

    public DoQueryReguideInfoResp() {
    }

    public DoQueryReguideInfoResp(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideInfo[] reguideInfoList) {
        super(
            responseHead);
        this.reguideInfoList = reguideInfoList;
    }


    /**
     * Gets the reguideInfoList value for this DoQueryReguideInfoResp.
     * 
     * @return reguideInfoList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideInfo[] getReguideInfoList() {
        return reguideInfoList;
    }


    /**
     * Sets the reguideInfoList value for this DoQueryReguideInfoResp.
     * 
     * @param reguideInfoList
     */
    public void setReguideInfoList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideInfo[] reguideInfoList) {
        this.reguideInfoList = reguideInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryReguideInfoResp)) return false;
        DoQueryReguideInfoResp other = (DoQueryReguideInfoResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reguideInfoList==null && other.getReguideInfoList()==null) || 
             (this.reguideInfoList!=null &&
              java.util.Arrays.equals(this.reguideInfoList, other.getReguideInfoList())));
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
        if (getReguideInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReguideInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReguideInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryReguideInfoResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryReguideInfoResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reguideInfoList_Item"));
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
