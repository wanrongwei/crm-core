/**
 * DoQueryProdCycleInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryProdCycleInfoReq  implements java.io.Serializable {
    private java.lang.Long objectId;

    private java.lang.Integer objectType;

    private java.lang.Long productId;

    private java.lang.Short billingType;

    private java.util.Calendar beginDate;

    private java.util.Calendar endDate;

    public DoQueryProdCycleInfoReq() {
    }

    public DoQueryProdCycleInfoReq(
           java.lang.Long objectId,
           java.lang.Integer objectType,
           java.lang.Long productId,
           java.lang.Short billingType,
           java.util.Calendar beginDate,
           java.util.Calendar endDate) {
           this.objectId = objectId;
           this.objectType = objectType;
           this.productId = productId;
           this.billingType = billingType;
           this.beginDate = beginDate;
           this.endDate = endDate;
    }


    /**
     * Gets the objectId value for this DoQueryProdCycleInfoReq.
     * 
     * @return objectId
     */
    public java.lang.Long getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this DoQueryProdCycleInfoReq.
     * 
     * @param objectId
     */
    public void setObjectId(java.lang.Long objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectType value for this DoQueryProdCycleInfoReq.
     * 
     * @return objectType
     */
    public java.lang.Integer getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this DoQueryProdCycleInfoReq.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.Integer objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the productId value for this DoQueryProdCycleInfoReq.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this DoQueryProdCycleInfoReq.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the billingType value for this DoQueryProdCycleInfoReq.
     * 
     * @return billingType
     */
    public java.lang.Short getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this DoQueryProdCycleInfoReq.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Short billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the beginDate value for this DoQueryProdCycleInfoReq.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this DoQueryProdCycleInfoReq.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDate value for this DoQueryProdCycleInfoReq.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DoQueryProdCycleInfoReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryProdCycleInfoReq)) return false;
        DoQueryProdCycleInfoReq other = (DoQueryProdCycleInfoReq) obj;
        
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
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryProdCycleInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoReq"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
