/**
 * SyncOperatorInfoRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

public class SyncOperatorInfoRequestBody  implements java.io.Serializable {
    private java.lang.String operatorCode;

    public SyncOperatorInfoRequestBody() {
    }

    public SyncOperatorInfoRequestBody(
           java.lang.String operatorCode) {
           this.operatorCode = operatorCode;
    }


    /**
     * Gets the operatorCode value for this SyncOperatorInfoRequestBody.
     * 
     * @return operatorCode
     */
    public java.lang.String getOperatorCode() {
        return operatorCode;
    }


    /**
     * Sets the operatorCode value for this SyncOperatorInfoRequestBody.
     * 
     * @param operatorCode
     */
    public void setOperatorCode(java.lang.String operatorCode) {
        this.operatorCode = operatorCode;
    }

   
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncOperatorInfoRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "syncOperatorInfoRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperatorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
