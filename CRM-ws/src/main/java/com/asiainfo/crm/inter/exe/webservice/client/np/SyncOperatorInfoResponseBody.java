/**
 * SyncOperatorInfoResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

public class SyncOperatorInfoResponseBody  implements java.io.Serializable {
    private Operators[] operators;

    public SyncOperatorInfoResponseBody() {
    }

    public SyncOperatorInfoResponseBody(
           Operators[] operators
           ) {
           this.operators = operators;

    }


    /**
     * Gets the operators value for this SyncOperatorInfoResponseBody.
     * 
     * @return operators
     */
    public Operators[] getOperators() {
        return operators;
    }


    /**
     * Sets the operators value for this SyncOperatorInfoResponseBody.
     * 
     * @param operators
     */
    public void setOperators(Operators[] operators) {
        this.operators = operators;
    }

    public Operators getOperators(int i) {
        return this.operators[i];
    }

    public void setOperators(int i, Operators value) {
        this.operators[i] = value;
    }


  

  

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncOperatorInfoResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "syncOperatorInfoResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operators");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "Operators"));
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
