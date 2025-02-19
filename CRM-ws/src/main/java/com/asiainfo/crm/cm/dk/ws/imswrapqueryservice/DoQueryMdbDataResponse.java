/**
 * DoQueryMdbDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryMdbDataResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.InnerBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity[] valueMap;

    private java.lang.String[] sqlsDetail;

    public DoQueryMdbDataResponse() {
    }

    public DoQueryMdbDataResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CbsErrorMsg errorMsg,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SPage sPage,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity[] valueMap,
           java.lang.String[] sqlsDetail) {
        super(
            errorMsg,
            sPage);
        this.valueMap = valueMap;
        this.sqlsDetail = sqlsDetail;
    }


    /**
     * Gets the valueMap value for this DoQueryMdbDataResponse.
     * 
     * @return valueMap
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity[] getValueMap() {
        return valueMap;
    }


    /**
     * Sets the valueMap value for this DoQueryMdbDataResponse.
     * 
     * @param valueMap
     */
    public void setValueMap(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity[] valueMap) {
        this.valueMap = valueMap;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity getValueMap(int i) {
        return this.valueMap[i];
    }

    public void setValueMap(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity _value) {
        this.valueMap[i] = _value;
    }


    /**
     * Gets the sqlsDetail value for this DoQueryMdbDataResponse.
     * 
     * @return sqlsDetail
     */
    public java.lang.String[] getSqlsDetail() {
        return sqlsDetail;
    }


    /**
     * Sets the sqlsDetail value for this DoQueryMdbDataResponse.
     * 
     * @param sqlsDetail
     */
    public void setSqlsDetail(java.lang.String[] sqlsDetail) {
        this.sqlsDetail = sqlsDetail;
    }

    public java.lang.String getSqlsDetail(int i) {
        return this.sqlsDetail[i];
    }

    public void setSqlsDetail(int i, java.lang.String _value) {
        this.sqlsDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryMdbDataResponse)) return false;
        DoQueryMdbDataResponse other = (DoQueryMdbDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.valueMap==null && other.getValueMap()==null) || 
             (this.valueMap!=null &&
              java.util.Arrays.equals(this.valueMap, other.getValueMap()))) &&
            ((this.sqlsDetail==null && other.getSqlsDetail()==null) || 
             (this.sqlsDetail!=null &&
              java.util.Arrays.equals(this.sqlsDetail, other.getSqlsDetail())));
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
        if (getValueMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSqlsDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSqlsDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSqlsDetail(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryMdbDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMdbDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mdbEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
