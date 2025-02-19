/**
 * SRegretInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SRegretInfo  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Integer regretType;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo[] offerInfo;

    public SRegretInfo() {
    }

    public SRegretInfo(
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Integer regretType,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo[] offerInfo) {
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.regretType = regretType;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.offerInfo = offerInfo;
    }


    /**
     * Gets the acctId value for this SRegretInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SRegretInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SRegretInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SRegretInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the regretType value for this SRegretInfo.
     * 
     * @return regretType
     */
    public java.lang.Integer getRegretType() {
        return regretType;
    }


    /**
     * Sets the regretType value for this SRegretInfo.
     * 
     * @param regretType
     */
    public void setRegretType(java.lang.Integer regretType) {
        this.regretType = regretType;
    }


    /**
     * Gets the orderId value for this SRegretInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SRegretInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SRegretInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SRegretInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the offerInfo value for this SRegretInfo.
     * 
     * @return offerInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo[] getOfferInfo() {
        return offerInfo;
    }


    /**
     * Sets the offerInfo value for this SRegretInfo.
     * 
     * @param offerInfo
     */
    public void setOfferInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo[] offerInfo) {
        this.offerInfo = offerInfo;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo getOfferInfo(int i) {
        return this.offerInfo[i];
    }

    public void setOfferInfo(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SsOfferInfo _value) {
        this.offerInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRegretInfo)) return false;
        SRegretInfo other = (SRegretInfo) obj;
        
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
            ((this.regretType==null && other.getRegretType()==null) || 
             (this.regretType!=null &&
              this.regretType.equals(other.getRegretType()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.offerInfo==null && other.getOfferInfo()==null) || 
             (this.offerInfo!=null &&
              java.util.Arrays.equals(this.offerInfo, other.getOfferInfo())));
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
        if (getRegretType() != null) {
            _hashCode += getRegretType().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOfferInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SRegretInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretInfo"));
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
        elemField.setFieldName("regretType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regretType"));
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
        elemField.setFieldName("offerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "ssOfferInfo"));
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
