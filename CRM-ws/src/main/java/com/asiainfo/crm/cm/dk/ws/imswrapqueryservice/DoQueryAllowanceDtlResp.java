/**
 * DoQueryAllowanceDtlResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryAllowanceDtlResp  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AllowanceDtlBo[] dtlList;

    public DoQueryAllowanceDtlResp() {
    }

    public DoQueryAllowanceDtlResp(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AllowanceDtlBo[] dtlList) {
        super(
            responseHead);
        this.dtlList = dtlList;
    }


    /**
     * Gets the dtlList value for this DoQueryAllowanceDtlResp.
     * 
     * @return dtlList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AllowanceDtlBo[] getDtlList() {
        return dtlList;
    }


    /**
     * Sets the dtlList value for this DoQueryAllowanceDtlResp.
     * 
     * @param dtlList
     */
    public void setDtlList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AllowanceDtlBo[] dtlList) {
        this.dtlList = dtlList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AllowanceDtlBo getDtlList(int i) {
        return this.dtlList[i];
    }

    public void setDtlList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AllowanceDtlBo _value) {
        this.dtlList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAllowanceDtlResp)) return false;
        DoQueryAllowanceDtlResp other = (DoQueryAllowanceDtlResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dtlList==null && other.getDtlList()==null) || 
             (this.dtlList!=null &&
              java.util.Arrays.equals(this.dtlList, other.getDtlList())));
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
        if (getDtlList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDtlList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDtlList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryAllowanceDtlResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAllowanceDtlResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtlList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "allowanceDtlBo"));
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
