/**
 * SQueryAbmDataReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryAbmDataReq  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BaseQueryReq  implements java.io.Serializable {
    private java.lang.String[] abmSqls;

    public SQueryAbmDataReq() {
    }

    public SQueryAbmDataReq(
           java.lang.String[] abmSqls) {
        this.abmSqls = abmSqls;
    }


    /**
     * Gets the abmSqls value for this SQueryAbmDataReq.
     * 
     * @return abmSqls
     */
    public java.lang.String[] getAbmSqls() {
        return abmSqls;
    }


    /**
     * Sets the abmSqls value for this SQueryAbmDataReq.
     * 
     * @param abmSqls
     */
    public void setAbmSqls(java.lang.String[] abmSqls) {
        this.abmSqls = abmSqls;
    }

    public java.lang.String getAbmSqls(int i) {
        return this.abmSqls[i];
    }

    public void setAbmSqls(int i, java.lang.String _value) {
        this.abmSqls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryAbmDataReq)) return false;
        SQueryAbmDataReq other = (SQueryAbmDataReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.abmSqls==null && other.getAbmSqls()==null) || 
             (this.abmSqls!=null &&
              java.util.Arrays.equals(this.abmSqls, other.getAbmSqls())));
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
        if (getAbmSqls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbmSqls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbmSqls(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryAbmDataReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAbmDataReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abmSqls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abmSqls"));
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
