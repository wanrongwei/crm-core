/**
 * QueryBusiSuccessReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryBusiSuccessReq  implements java.io.Serializable {
    private java.lang.String so_nbr;

    private short so_mode;

    public QueryBusiSuccessReq() {
    }

    public QueryBusiSuccessReq(
           java.lang.String so_nbr,
           short so_mode) {
           this.so_nbr = so_nbr;
           this.so_mode = so_mode;
    }


    /**
     * Gets the so_nbr value for this QueryBusiSuccessReq.
     * 
     * @return so_nbr
     */
    public java.lang.String getSo_nbr() {
        return so_nbr;
    }


    /**
     * Sets the so_nbr value for this QueryBusiSuccessReq.
     * 
     * @param so_nbr
     */
    public void setSo_nbr(java.lang.String so_nbr) {
        this.so_nbr = so_nbr;
    }


    /**
     * Gets the so_mode value for this QueryBusiSuccessReq.
     * 
     * @return so_mode
     */
    public short getSo_mode() {
        return so_mode;
    }


    /**
     * Sets the so_mode value for this QueryBusiSuccessReq.
     * 
     * @param so_mode
     */
    public void setSo_mode(short so_mode) {
        this.so_mode = so_mode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBusiSuccessReq)) return false;
        QueryBusiSuccessReq other = (QueryBusiSuccessReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.so_nbr==null && other.getSo_nbr()==null) || 
             (this.so_nbr!=null &&
              this.so_nbr.equals(other.getSo_nbr()))) &&
            this.so_mode == other.getSo_mode();
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
        if (getSo_nbr() != null) {
            _hashCode += getSo_nbr().hashCode();
        }
        _hashCode += getSo_mode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBusiSuccessReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBusiSuccessReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("so_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "so_nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("so_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "so_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
