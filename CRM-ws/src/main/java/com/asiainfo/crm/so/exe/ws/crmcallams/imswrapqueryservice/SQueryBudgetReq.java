/**
 * SQueryBudgetReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryBudgetReq  implements java.io.Serializable {
    private long[] productList;

    private long[] offerList;

    public SQueryBudgetReq() {
    }

    public SQueryBudgetReq(
           long[] productList,
           long[] offerList) {
           this.productList = productList;
           this.offerList = offerList;
    }


    /**
     * Gets the productList value for this SQueryBudgetReq.
     * 
     * @return productList
     */
    public long[] getProductList() {
        return productList;
    }


    /**
     * Sets the productList value for this SQueryBudgetReq.
     * 
     * @param productList
     */
    public void setProductList(long[] productList) {
        this.productList = productList;
    }

    public long getProductList(int i) {
        return this.productList[i];
    }

    public void setProductList(int i, long _value) {
        this.productList[i] = _value;
    }


    /**
     * Gets the offerList value for this SQueryBudgetReq.
     * 
     * @return offerList
     */
    public long[] getOfferList() {
        return offerList;
    }


    /**
     * Sets the offerList value for this SQueryBudgetReq.
     * 
     * @param offerList
     */
    public void setOfferList(long[] offerList) {
        this.offerList = offerList;
    }

    public long getOfferList(int i) {
        return this.offerList[i];
    }

    public void setOfferList(int i, long _value) {
        this.offerList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryBudgetReq)) return false;
        SQueryBudgetReq other = (SQueryBudgetReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productList==null && other.getProductList()==null) || 
             (this.productList!=null &&
              java.util.Arrays.equals(this.productList, other.getProductList()))) &&
            ((this.offerList==null && other.getOfferList()==null) || 
             (this.offerList!=null &&
              java.util.Arrays.equals(this.offerList, other.getOfferList())));
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
        if (getProductList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferList(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryBudgetReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryBudgetReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
