/**
 * RemoveCoaxOneRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

public class RemoveCoaxOneRequestBody  implements java.io.Serializable {
    private String DSL_ID;

    private String MAC;

    public RemoveCoaxOneRequestBody() {
    }

    public RemoveCoaxOneRequestBody(
           String DSL_ID,
           String MAC) {
           this.DSL_ID = DSL_ID;
           this.MAC = MAC;
    }


    /**
     * Gets the DSL_ID value for this RemoveCoaxOneRequestBody.
     * 
     * @return DSL_ID
     */
    public String getDSL_ID() {
        return DSL_ID;
    }


    /**
     * Sets the DSL_ID value for this RemoveCoaxOneRequestBody.
     * 
     * @param DSL_ID
     */
    public void setDSL_ID(String DSL_ID) {
        this.DSL_ID = DSL_ID;
    }


    /**
     * Gets the MAC value for this RemoveCoaxOneRequestBody.
     * 
     * @return MAC
     */
    public String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this RemoveCoaxOneRequestBody.
     * 
     * @param MAC
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RemoveCoaxOneRequestBody)) return false;
        RemoveCoaxOneRequestBody other = (RemoveCoaxOneRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DSL_ID==null && other.getDSL_ID()==null) || 
             (this.DSL_ID!=null &&
              this.DSL_ID.equals(other.getDSL_ID()))) &&
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC())));
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
        if (getDSL_ID() != null) {
            _hashCode += getDSL_ID().hashCode();
        }
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveCoaxOneRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RemoveCoaxOneRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSL_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DSL_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
