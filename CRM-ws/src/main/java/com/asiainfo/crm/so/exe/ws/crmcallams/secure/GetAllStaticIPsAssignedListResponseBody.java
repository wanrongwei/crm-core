/**
 * GetAllStaticIPsAssignedListResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

public class GetAllStaticIPsAssignedListResponseBody  implements java.io.Serializable {
    private String httpstatus;

    private StaticIPsInfo[] staticIPsList;

    public GetAllStaticIPsAssignedListResponseBody() {
    }

    public GetAllStaticIPsAssignedListResponseBody(
           String httpstatus,
           StaticIPsInfo[] staticIPsList) {
           this.httpstatus = httpstatus;
           this.staticIPsList = staticIPsList;
    }


    /**
     * Gets the httpstatus value for this GetAllStaticIPsAssignedListResponseBody.
     * 
     * @return httpstatus
     */
    public String getHttpstatus() {
        return httpstatus;
    }


    /**
     * Sets the httpstatus value for this GetAllStaticIPsAssignedListResponseBody.
     * 
     * @param httpstatus
     */
    public void setHttpstatus(String httpstatus) {
        this.httpstatus = httpstatus;
    }


    /**
     * Gets the staticIPsList value for this GetAllStaticIPsAssignedListResponseBody.
     * 
     * @return staticIPsList
     */
    public StaticIPsInfo[] getStaticIPsList() {
        return staticIPsList;
    }


    /**
     * Sets the staticIPsList value for this GetAllStaticIPsAssignedListResponseBody.
     * 
     * @param staticIPsList
     */
    public void setStaticIPsList(StaticIPsInfo[] staticIPsList) {
        this.staticIPsList = staticIPsList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAllStaticIPsAssignedListResponseBody)) return false;
        GetAllStaticIPsAssignedListResponseBody other = (GetAllStaticIPsAssignedListResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpstatus==null && other.getHttpstatus()==null) || 
             (this.httpstatus!=null &&
              this.httpstatus.equals(other.getHttpstatus()))) &&
            ((this.staticIPsList==null && other.getStaticIPsList()==null) || 
             (this.staticIPsList!=null &&
              java.util.Arrays.equals(this.staticIPsList, other.getStaticIPsList())));
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
        if (getHttpstatus() != null) {
            _hashCode += getHttpstatus().hashCode();
        }
        if (getStaticIPsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaticIPsList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStaticIPsList(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllStaticIPsAssignedListResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetAllStaticIPsAssignedListResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticIPsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staticIPsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "staticIPsInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "staticIPsInfos"));
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
