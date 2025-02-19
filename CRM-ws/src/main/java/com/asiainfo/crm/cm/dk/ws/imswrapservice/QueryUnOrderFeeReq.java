/**
 * QueryUnOrderFeeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class QueryUnOrderFeeReq  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.String orderDate;

    private long[] offerIdList;

    public QueryUnOrderFeeReq() {
    }

    public QueryUnOrderFeeReq(
           java.lang.String phoneId,
           java.lang.String orderDate,
           long[] offerIdList) {
           this.phoneId = phoneId;
           this.orderDate = orderDate;
           this.offerIdList = offerIdList;
    }


    /**
     * Gets the phoneId value for this QueryUnOrderFeeReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this QueryUnOrderFeeReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the orderDate value for this QueryUnOrderFeeReq.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this QueryUnOrderFeeReq.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the offerIdList value for this QueryUnOrderFeeReq.
     * 
     * @return offerIdList
     */
    public long[] getOfferIdList() {
        return offerIdList;
    }


    /**
     * Sets the offerIdList value for this QueryUnOrderFeeReq.
     * 
     * @param offerIdList
     */
    public void setOfferIdList(long[] offerIdList) {
        this.offerIdList = offerIdList;
    }

    public long getOfferIdList(int i) {
        return this.offerIdList[i];
    }

    public void setOfferIdList(int i, long _value) {
        this.offerIdList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnOrderFeeReq)) return false;
        QueryUnOrderFeeReq other = (QueryUnOrderFeeReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.offerIdList==null && other.getOfferIdList()==null) || 
             (this.offerIdList!=null &&
              java.util.Arrays.equals(this.offerIdList, other.getOfferIdList())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOfferIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferIdList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryUnOrderFeeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryUnOrderFeeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerIdList"));
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
