/**
 * SProductFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SProductFee  implements java.io.Serializable {
    private java.lang.Long offer_id;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee[] monthlyFeeList;

    public SProductFee() {
    }

    public SProductFee(
           java.lang.Long offer_id,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee[] monthlyFeeList) {
           this.offer_id = offer_id;
           this.monthlyFeeList = monthlyFeeList;
    }


    /**
     * Gets the offer_id value for this SProductFee.
     * 
     * @return offer_id
     */
    public java.lang.Long getOffer_id() {
        return offer_id;
    }


    /**
     * Sets the offer_id value for this SProductFee.
     * 
     * @param offer_id
     */
    public void setOffer_id(java.lang.Long offer_id) {
        this.offer_id = offer_id;
    }


    /**
     * Gets the monthlyFeeList value for this SProductFee.
     * 
     * @return monthlyFeeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee[] getMonthlyFeeList() {
        return monthlyFeeList;
    }


    /**
     * Sets the monthlyFeeList value for this SProductFee.
     * 
     * @param monthlyFeeList
     */
    public void setMonthlyFeeList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee[] monthlyFeeList) {
        this.monthlyFeeList = monthlyFeeList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee getMonthlyFeeList(int i) {
        return this.monthlyFeeList[i];
    }

    public void setMonthlyFeeList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee _value) {
        this.monthlyFeeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SProductFee)) return false;
        SProductFee other = (SProductFee) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offer_id==null && other.getOffer_id()==null) || 
             (this.offer_id!=null &&
              this.offer_id.equals(other.getOffer_id()))) &&
            ((this.monthlyFeeList==null && other.getMonthlyFeeList()==null) || 
             (this.monthlyFeeList!=null &&
              java.util.Arrays.equals(this.monthlyFeeList, other.getMonthlyFeeList())));
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
        if (getOffer_id() != null) {
            _hashCode += getOffer_id().hashCode();
        }
        if (getMonthlyFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonthlyFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonthlyFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(SProductFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMonthlyFee"));
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
