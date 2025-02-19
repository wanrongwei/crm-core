/**
 * SignDocumentLTVResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class SignDocumentLTVResponseBody  implements java.io.Serializable {
    private byte[][] signDocumentLTVResult;

    public SignDocumentLTVResponseBody() {
    }

    public SignDocumentLTVResponseBody(
           byte[][] signDocumentLTVResult) {
           this.signDocumentLTVResult = signDocumentLTVResult;
    }


    /**
     * Gets the signDocumentLTVResult value for this SignDocumentLTVResponseBody.
     * 
     * @return signDocumentLTVResult
     */
    public byte[][] getSignDocumentLTVResult() {
        return signDocumentLTVResult;
    }


    /**
     * Sets the signDocumentLTVResult value for this SignDocumentLTVResponseBody.
     * 
     * @param signDocumentLTVResult
     */
    public void setSignDocumentLTVResult(byte[][] signDocumentLTVResult) {
        this.signDocumentLTVResult = signDocumentLTVResult;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignDocumentLTVResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "SignDocumentLTVResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signDocumentLTVResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SignDocumentLTVResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "base64Binary"));
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
