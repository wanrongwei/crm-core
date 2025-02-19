/**
 * SProductOrderResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SProductOrderResult  implements java.io.Serializable {
    private java.lang.Long productId;

    private java.lang.Long offerId;

    private java.lang.Long billingPlanId;

    private java.lang.String soId;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductParam[] productParamList;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ExtendParam[] extendParamList;

    public SProductOrderResult() {
    }

    public SProductOrderResult(
           java.lang.Long productId,
           java.lang.Long offerId,
           java.lang.Long billingPlanId,
           java.lang.String soId,
           java.lang.String validDate,
           java.lang.String expireDate,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductParam[] productParamList,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ExtendParam[] extendParamList) {
           this.productId = productId;
           this.offerId = offerId;
           this.billingPlanId = billingPlanId;
           this.soId = soId;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.productParamList = productParamList;
           this.extendParamList = extendParamList;
    }


    /**
     * Gets the productId value for this SProductOrderResult.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SProductOrderResult.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the offerId value for this SProductOrderResult.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SProductOrderResult.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the billingPlanId value for this SProductOrderResult.
     * 
     * @return billingPlanId
     */
    public java.lang.Long getBillingPlanId() {
        return billingPlanId;
    }


    /**
     * Sets the billingPlanId value for this SProductOrderResult.
     * 
     * @param billingPlanId
     */
    public void setBillingPlanId(java.lang.Long billingPlanId) {
        this.billingPlanId = billingPlanId;
    }


    /**
     * Gets the soId value for this SProductOrderResult.
     * 
     * @return soId
     */
    public java.lang.String getSoId() {
        return soId;
    }


    /**
     * Sets the soId value for this SProductOrderResult.
     * 
     * @param soId
     */
    public void setSoId(java.lang.String soId) {
        this.soId = soId;
    }


    /**
     * Gets the validDate value for this SProductOrderResult.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SProductOrderResult.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SProductOrderResult.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SProductOrderResult.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the productParamList value for this SProductOrderResult.
     * 
     * @return productParamList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductParam[] getProductParamList() {
        return productParamList;
    }


    /**
     * Sets the productParamList value for this SProductOrderResult.
     * 
     * @param productParamList
     */
    public void setProductParamList(com.asiainfo.crm.cm.dk.ws.imswrapservice.SProductParam[] productParamList) {
        this.productParamList = productParamList;
    }


    /**
     * Gets the extendParamList value for this SProductOrderResult.
     * 
     * @return extendParamList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ExtendParam[] getExtendParamList() {
        return extendParamList;
    }


    /**
     * Sets the extendParamList value for this SProductOrderResult.
     * 
     * @param extendParamList
     */
    public void setExtendParamList(com.asiainfo.crm.cm.dk.ws.imswrapservice.ExtendParam[] extendParamList) {
        this.extendParamList = extendParamList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SProductOrderResult)) return false;
        SProductOrderResult other = (SProductOrderResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.billingPlanId==null && other.getBillingPlanId()==null) || 
             (this.billingPlanId!=null &&
              this.billingPlanId.equals(other.getBillingPlanId()))) &&
            ((this.soId==null && other.getSoId()==null) || 
             (this.soId!=null &&
              this.soId.equals(other.getSoId()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.productParamList==null && other.getProductParamList()==null) || 
             (this.productParamList!=null &&
              java.util.Arrays.equals(this.productParamList, other.getProductParamList()))) &&
            ((this.extendParamList==null && other.getExtendParamList()==null) || 
             (this.extendParamList!=null &&
              java.util.Arrays.equals(this.extendParamList, other.getExtendParamList())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getBillingPlanId() != null) {
            _hashCode += getBillingPlanId().hashCode();
        }
        if (getSoId() != null) {
            _hashCode += getSoId().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getProductParamList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductParamList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductParamList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendParamList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendParamList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendParamList(), i);
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
        new org.apache.axis.description.TypeDesc(SProductOrderResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productParamList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productParamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductParamListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendParamList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extendParamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "extendParamListItem"));
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
