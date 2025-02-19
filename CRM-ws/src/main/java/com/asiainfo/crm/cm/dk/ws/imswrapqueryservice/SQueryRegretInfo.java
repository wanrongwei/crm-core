/**
 * SQueryRegretInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryRegretInfo  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Integer queryType;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOffer[] offerList;

    public SQueryRegretInfo() {
    }

    public SQueryRegretInfo(
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Integer queryType,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOffer[] offerList) {
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.queryType = queryType;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.offerList = offerList;
    }


    /**
     * Gets the acctId value for this SQueryRegretInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryRegretInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SQueryRegretInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SQueryRegretInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the queryType value for this SQueryRegretInfo.
     * 
     * @return queryType
     */
    public java.lang.Integer getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this SQueryRegretInfo.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.Integer queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the orderId value for this SQueryRegretInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SQueryRegretInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SQueryRegretInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SQueryRegretInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the offerList value for this SQueryRegretInfo.
     * 
     * @return offerList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOffer[] getOfferList() {
        return offerList;
    }


    /**
     * Sets the offerList value for this SQueryRegretInfo.
     * 
     * @param offerList
     */
    public void setOfferList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOffer[] offerList) {
        this.offerList = offerList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOffer getOfferList(int i) {
        return this.offerList[i];
    }

    public void setOfferList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOffer _value) {
        this.offerList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryRegretInfo)) return false;
        SQueryRegretInfo other = (SQueryRegretInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(SQueryRegretInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryRegretInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretOffer"));
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
