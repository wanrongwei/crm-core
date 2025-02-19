/**
 * SPayDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SPayDetail  implements java.io.Serializable {
    private java.lang.Long upcOfferId;

    private java.lang.Long payAmount;

    private java.lang.Integer payType;

    public SPayDetail() {
    }

    public SPayDetail(
           java.lang.Long upcOfferId,
           java.lang.Long payAmount,
           java.lang.Integer payType) {
           this.upcOfferId = upcOfferId;
           this.payAmount = payAmount;
           this.payType = payType;
    }


    /**
     * Gets the upcOfferId value for this SPayDetail.
     * 
     * @return upcOfferId
     */
    public java.lang.Long getUpcOfferId() {
        return upcOfferId;
    }


    /**
     * Sets the upcOfferId value for this SPayDetail.
     * 
     * @param upcOfferId
     */
    public void setUpcOfferId(java.lang.Long upcOfferId) {
        this.upcOfferId = upcOfferId;
    }


    /**
     * Gets the payAmount value for this SPayDetail.
     * 
     * @return payAmount
     */
    public java.lang.Long getPayAmount() {
        return payAmount;
    }


    /**
     * Sets the payAmount value for this SPayDetail.
     * 
     * @param payAmount
     */
    public void setPayAmount(java.lang.Long payAmount) {
        this.payAmount = payAmount;
    }


    /**
     * Gets the payType value for this SPayDetail.
     * 
     * @return payType
     */
    public java.lang.Integer getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this SPayDetail.
     * 
     * @param payType
     */
    public void setPayType(java.lang.Integer payType) {
        this.payType = payType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPayDetail)) return false;
        SPayDetail other = (SPayDetail) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upcOfferId==null && other.getUpcOfferId()==null) || 
             (this.upcOfferId!=null &&
              this.upcOfferId.equals(other.getUpcOfferId()))) &&
            ((this.payAmount==null && other.getPayAmount()==null) || 
             (this.payAmount!=null &&
              this.payAmount.equals(other.getPayAmount()))) &&
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType())));
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
        if (getUpcOfferId() != null) {
            _hashCode += getUpcOfferId().hashCode();
        }
        if (getPayAmount() != null) {
            _hashCode += getPayAmount().hashCode();
        }
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPayDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upcOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
