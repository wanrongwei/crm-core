/**
 * SQueryMdbDataReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SQueryMdbDataReq  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BaseQueryReq  implements java.io.Serializable {
    private java.lang.String mdb_conn;

    private java.lang.String[] mdbSqls;

    public SQueryMdbDataReq() {
    }

    public SQueryMdbDataReq(
           java.lang.String mdb_conn,
           java.lang.String[] mdbSqls) {
        this.mdb_conn = mdb_conn;
        this.mdbSqls = mdbSqls;
    }


    /**
     * Gets the mdb_conn value for this SQueryMdbDataReq.
     * 
     * @return mdb_conn
     */
    public java.lang.String getMdb_conn() {
        return mdb_conn;
    }


    /**
     * Sets the mdb_conn value for this SQueryMdbDataReq.
     * 
     * @param mdb_conn
     */
    public void setMdb_conn(java.lang.String mdb_conn) {
        this.mdb_conn = mdb_conn;
    }


    /**
     * Gets the mdbSqls value for this SQueryMdbDataReq.
     * 
     * @return mdbSqls
     */
    public java.lang.String[] getMdbSqls() {
        return mdbSqls;
    }


    /**
     * Sets the mdbSqls value for this SQueryMdbDataReq.
     * 
     * @param mdbSqls
     */
    public void setMdbSqls(java.lang.String[] mdbSqls) {
        this.mdbSqls = mdbSqls;
    }

    public java.lang.String getMdbSqls(int i) {
        return this.mdbSqls[i];
    }

    public void setMdbSqls(int i, java.lang.String _value) {
        this.mdbSqls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryMdbDataReq)) return false;
        SQueryMdbDataReq other = (SQueryMdbDataReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mdb_conn==null && other.getMdb_conn()==null) || 
             (this.mdb_conn!=null &&
              this.mdb_conn.equals(other.getMdb_conn()))) &&
            ((this.mdbSqls==null && other.getMdbSqls()==null) || 
             (this.mdbSqls!=null &&
              java.util.Arrays.equals(this.mdbSqls, other.getMdbSqls())));
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
        if (getMdb_conn() != null) {
            _hashCode += getMdb_conn().hashCode();
        }
        if (getMdbSqls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMdbSqls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMdbSqls(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryMdbDataReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMdbDataReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdb_conn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mdb_conn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdbSqls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mdbSqls"));
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
