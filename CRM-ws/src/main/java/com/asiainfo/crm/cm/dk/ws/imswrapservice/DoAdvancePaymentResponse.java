/**
 * DoAdvancePaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoAdvancePaymentResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long so_nbr;

    private java.lang.Long payment_so_nbr;

    private java.lang.Long advancepay_so_nbr;

    public DoAdvancePaymentResponse() {
    }

    public DoAdvancePaymentResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           java.lang.Long so_nbr,
           java.lang.Long payment_so_nbr,
           java.lang.Long advancepay_so_nbr) {
        super(
            responseHead);
        this.so_nbr = so_nbr;
        this.payment_so_nbr = payment_so_nbr;
        this.advancepay_so_nbr = advancepay_so_nbr;
    }


    /**
     * Gets the so_nbr value for this DoAdvancePaymentResponse.
     * 
     * @return so_nbr
     */
    public java.lang.Long getSo_nbr() {
        return so_nbr;
    }


    /**
     * Sets the so_nbr value for this DoAdvancePaymentResponse.
     * 
     * @param so_nbr
     */
    public void setSo_nbr(java.lang.Long so_nbr) {
        this.so_nbr = so_nbr;
    }


    /**
     * Gets the payment_so_nbr value for this DoAdvancePaymentResponse.
     * 
     * @return payment_so_nbr
     */
    public java.lang.Long getPayment_so_nbr() {
        return payment_so_nbr;
    }


    /**
     * Sets the payment_so_nbr value for this DoAdvancePaymentResponse.
     * 
     * @param payment_so_nbr
     */
    public void setPayment_so_nbr(java.lang.Long payment_so_nbr) {
        this.payment_so_nbr = payment_so_nbr;
    }


    /**
     * Gets the advancepay_so_nbr value for this DoAdvancePaymentResponse.
     * 
     * @return advancepay_so_nbr
     */
    public java.lang.Long getAdvancepay_so_nbr() {
        return advancepay_so_nbr;
    }


    /**
     * Sets the advancepay_so_nbr value for this DoAdvancePaymentResponse.
     * 
     * @param advancepay_so_nbr
     */
    public void setAdvancepay_so_nbr(java.lang.Long advancepay_so_nbr) {
        this.advancepay_so_nbr = advancepay_so_nbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAdvancePaymentResponse)) return false;
        DoAdvancePaymentResponse other = (DoAdvancePaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.so_nbr==null && other.getSo_nbr()==null) || 
             (this.so_nbr!=null &&
              this.so_nbr.equals(other.getSo_nbr()))) &&
            ((this.payment_so_nbr==null && other.getPayment_so_nbr()==null) || 
             (this.payment_so_nbr!=null &&
              this.payment_so_nbr.equals(other.getPayment_so_nbr()))) &&
            ((this.advancepay_so_nbr==null && other.getAdvancepay_so_nbr()==null) || 
             (this.advancepay_so_nbr!=null &&
              this.advancepay_so_nbr.equals(other.getAdvancepay_so_nbr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSo_nbr() != null) {
            _hashCode += getSo_nbr().hashCode();
        }
        if (getPayment_so_nbr() != null) {
            _hashCode += getPayment_so_nbr().hashCode();
        }
        if (getAdvancepay_so_nbr() != null) {
            _hashCode += getAdvancepay_so_nbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAdvancePaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdvancePaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("so_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "so_nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_so_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_so_nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancepay_so_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advancepay_so_nbr"));
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
