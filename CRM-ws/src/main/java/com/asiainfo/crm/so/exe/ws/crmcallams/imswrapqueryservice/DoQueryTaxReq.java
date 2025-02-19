/**
 * DoQueryTaxReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryTaxReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryTaxFee[] sQueryTaxFeeList;

    public DoQueryTaxReq() {
    }

    public DoQueryTaxReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryTaxFee[] sQueryTaxFeeList) {
           this.sQueryTaxFeeList = sQueryTaxFeeList;
    }


    /**
     * Gets the sQueryTaxFeeList value for this DoQueryTaxReq.
     * 
     * @return sQueryTaxFeeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryTaxFee[] getSQueryTaxFeeList() {
        return sQueryTaxFeeList;
    }


    /**
     * Sets the sQueryTaxFeeList value for this DoQueryTaxReq.
     * 
     * @param sQueryTaxFeeList
     */
    public void setSQueryTaxFeeList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryTaxFee[] sQueryTaxFeeList) {
        this.sQueryTaxFeeList = sQueryTaxFeeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryTaxReq)) return false;
        DoQueryTaxReq other = (DoQueryTaxReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sQueryTaxFeeList==null && other.getSQueryTaxFeeList()==null) || 
             (this.sQueryTaxFeeList!=null &&
              java.util.Arrays.equals(this.sQueryTaxFeeList, other.getSQueryTaxFeeList())));
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
        if (getSQueryTaxFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSQueryTaxFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSQueryTaxFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryTaxReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTaxReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQueryTaxFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sQueryTaxFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTaxFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sQueryTaxFee"));
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
