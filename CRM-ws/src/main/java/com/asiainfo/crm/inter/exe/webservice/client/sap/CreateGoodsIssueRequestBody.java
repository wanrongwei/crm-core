/**
 * CreateGoodsIssueRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class CreateGoodsIssueRequestBody  implements java.io.Serializable {
    private java.lang.String docNumber;

    public CreateGoodsIssueRequestBody() {
    }

    public CreateGoodsIssueRequestBody(
           java.lang.String docNumber) {
           this.docNumber = docNumber;
    }


    /**
     * Gets the docNumber value for this CreateGoodsIssueRequestBody.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this CreateGoodsIssueRequestBody.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateGoodsIssueRequestBody)) return false;
        CreateGoodsIssueRequestBody other = (CreateGoodsIssueRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber())));
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
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateGoodsIssueRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateGoodsIssueRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocNumber"));
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
