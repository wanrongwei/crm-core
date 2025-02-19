/**
 * SOrderProductFeeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SOrderProductFeeRequest  implements java.io.Serializable {
    private java.lang.Long objectId;

    private java.lang.Long objectType;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] prodOrderList;

    private java.lang.Long tax_flag;

    public SOrderProductFeeRequest() {
    }

    public SOrderProductFeeRequest(
           java.lang.Long objectId,
           java.lang.Long objectType,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] prodOrderList,
           java.lang.Long tax_flag) {
           this.objectId = objectId;
           this.objectType = objectType;
           this.prodOrderList = prodOrderList;
           this.tax_flag = tax_flag;
    }


    /**
     * Gets the objectId value for this SOrderProductFeeRequest.
     * 
     * @return objectId
     */
    public java.lang.Long getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this SOrderProductFeeRequest.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.Long objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectType value for this SOrderProductFeeRequest.
     * 
     * @return objectType
     */
    public java.lang.Long getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this SOrderProductFeeRequest.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.Long objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the prodOrderList value for this SOrderProductFeeRequest.
     * 
     * @return prodOrderList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] getProdOrderList() {
        return prodOrderList;
    }


    /**
     * Sets the prodOrderList value for this SOrderProductFeeRequest.
     * 
     * @param prodOrderList
     */
    public void setProdOrderList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] prodOrderList) {
        this.prodOrderList = prodOrderList;
    }


    /**
     * Gets the tax_flag value for this SOrderProductFeeRequest.
     * 
     * @return tax_flag
     */
    public java.lang.Long getTax_flag() {
        return tax_flag;
    }


    /**
     * Sets the tax_flag value for this SOrderProductFeeRequest.
     * 
     * @param tax_flag
     */
    public void setTax_flag(java.lang.Long tax_flag) {
        this.tax_flag = tax_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOrderProductFeeRequest)) return false;
        SOrderProductFeeRequest other = (SOrderProductFeeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              this.objectId.equals(other.getObjectId()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.prodOrderList==null && other.getProdOrderList()==null) || 
             (this.prodOrderList!=null &&
              java.util.Arrays.equals(this.prodOrderList, other.getProdOrderList()))) &&
            ((this.tax_flag==null && other.getTax_flag()==null) || 
             (this.tax_flag!=null &&
              this.tax_flag.equals(other.getTax_flag())));
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
        if (getObjectId() != null) {
            _hashCode += getObjectId().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getProdOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdOrderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTax_flag() != null) {
            _hashCode += getTax_flag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOrderProductFeeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderProductFeeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
