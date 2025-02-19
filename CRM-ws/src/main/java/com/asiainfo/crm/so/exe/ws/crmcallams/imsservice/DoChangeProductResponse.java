/**
 * DoChangeProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class DoChangeProductResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] prod_result_list;

    public DoChangeProductResponse() {
    }

    public DoChangeProductResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] prod_result_list) {
        super(
            responseHead);
        this.prod_result_list = prod_result_list;
    }


    /**
     * Gets the prod_result_list value for this DoChangeProductResponse.
     * 
     * @return prod_result_list
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] getProd_result_list() {
        return prod_result_list;
    }


    /**
     * Sets the prod_result_list value for this DoChangeProductResponse.
     * 
     * @param prod_result_list
     */
    public void setProd_result_list(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[] prod_result_list) {
        this.prod_result_list = prod_result_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoChangeProductResponse)) return false;
        DoChangeProductResponse other = (DoChangeProductResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prod_result_list==null && other.getProd_result_list()==null) || 
             (this.prod_result_list!=null &&
              java.util.Arrays.equals(this.prod_result_list, other.getProd_result_list())));
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
        if (getProd_result_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProd_result_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProd_result_list(), i);
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
        new org.apache.axis.description.TypeDesc(DoChangeProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prod_result_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prod_result_list"));
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
