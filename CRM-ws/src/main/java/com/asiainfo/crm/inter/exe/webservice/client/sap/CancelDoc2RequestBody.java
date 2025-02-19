/**
 * CancelDoc2RequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class CancelDoc2RequestBody  implements java.io.Serializable {
    private java.lang.String docNumber;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItem[] itemData;

    public CancelDoc2RequestBody() {
    }

    public CancelDoc2RequestBody(
           java.lang.String docNumber,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItem[] itemData) {
           this.docNumber = docNumber;
           this.itemData = itemData;
    }


    /**
     * Gets the docNumber value for this CancelDoc2RequestBody.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this CancelDoc2RequestBody.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the itemData value for this CancelDoc2RequestBody.
     * 
     * @return itemData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItem[] getItemData() {
        return itemData;
    }


    /**
     * Sets the itemData value for this CancelDoc2RequestBody.
     * 
     * @param itemData
     */
    public void setItemData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItem[] itemData) {
        this.itemData = itemData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelDoc2RequestBody)) return false;
        CancelDoc2RequestBody other = (CancelDoc2RequestBody) obj;
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
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.itemData==null && other.getItemData()==null) || 
             (this.itemData!=null &&
              java.util.Arrays.equals(this.itemData, other.getItemData())));
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
        if (getItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemData(), i);
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
        new org.apache.axis.description.TypeDesc(CancelDoc2RequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CancelDoc2RequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
