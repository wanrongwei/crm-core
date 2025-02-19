/**
 * SRecurFeeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SRecurFeeResult  implements java.io.Serializable {
    private java.lang.Long productId;

    private java.lang.Integer offerId;

    private java.lang.Long recurringFee;

    public SRecurFeeResult() {
    }

    public SRecurFeeResult(
           java.lang.Long productId,
           java.lang.Integer offerId,
           java.lang.Long recurringFee) {
           this.productId = productId;
           this.offerId = offerId;
           this.recurringFee = recurringFee;
    }


    /**
     * Gets the productId value for this SRecurFeeResult.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SRecurFeeResult.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the offerId value for this SRecurFeeResult.
     * 
     * @return offerId
     */
    public java.lang.Integer getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SRecurFeeResult.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the recurringFee value for this SRecurFeeResult.
     * 
     * @return recurringFee
     */
    public java.lang.Long getRecurringFee() {
        return recurringFee;
    }


    /**
     * Sets the recurringFee value for this SRecurFeeResult.
     * 
     * @param recurringFee
     */
    public void setRecurringFee(java.lang.Long recurringFee) {
        this.recurringFee = recurringFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRecurFeeResult)) return false;
        SRecurFeeResult other = (SRecurFeeResult) obj;
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
            ((this.recurringFee==null && other.getRecurringFee()==null) || 
             (this.recurringFee!=null &&
              this.recurringFee.equals(other.getRecurringFee())));
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
        if (getRecurringFee() != null) {
            _hashCode += getRecurringFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRecurFeeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRecurFeeResult"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringFee"));
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
