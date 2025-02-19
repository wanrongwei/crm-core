/**
 * DoQueryUnOrderFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoQueryUnOrderFeeResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.InnerBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductFee[] productFeeList;

    public DoQueryUnOrderFeeResponse() {
    }

    public DoQueryUnOrderFeeResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.CbsErrorMsg errorMsg,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SPage sPage,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductFee[] productFeeList) {
        super(
            errorMsg,
            sPage);
        this.productFeeList = productFeeList;
    }


    /**
     * Gets the productFeeList value for this DoQueryUnOrderFeeResponse.
     * 
     * @return productFeeList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductFee[] getProductFeeList() {
        return productFeeList;
    }


    /**
     * Sets the productFeeList value for this DoQueryUnOrderFeeResponse.
     * 
     * @param productFeeList
     */
    public void setProductFeeList(com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductFee[] productFeeList) {
        this.productFeeList = productFeeList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductFee getProductFeeList(int i) {
        return this.productFeeList[i];
    }

    public void setProductFeeList(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductFee _value) {
        this.productFeeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryUnOrderFeeResponse)) return false;
        DoQueryUnOrderFeeResponse other = (DoQueryUnOrderFeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productFeeList==null && other.getProductFeeList()==null) || 
             (this.productFeeList!=null &&
              java.util.Arrays.equals(this.productFeeList, other.getProductFeeList())));
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
        if (getProductFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryUnOrderFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUnOrderFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductFee"));
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
