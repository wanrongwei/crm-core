/**
 * SChangeOrderParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SChangeOrderParam  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.Long resourceId;

    private java.lang.String phoneId;

    private java.lang.Integer modifyType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo[] iMEIList;

    private java.lang.String shoppingId;
    private java.lang.String sapOrderId;

    private java.util.Calendar shoppingDate;

    public SChangeOrderParam() {
    }

    public SChangeOrderParam(
           java.lang.Long acctId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.Long resourceId,
           java.lang.String phoneId,
           java.lang.Integer modifyType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo[] iMEIList,
           java.lang.String shoppingId,
           java.util.Calendar shoppingDate) {
           this.acctId = acctId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.resourceId = resourceId;
           this.phoneId = phoneId;
           this.modifyType = modifyType;
           this.iMEIList = iMEIList;
           this.shoppingId = shoppingId;
           this.shoppingDate = shoppingDate;
    }


    /**
     * Gets the acctId value for this SChangeOrderParam.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SChangeOrderParam.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the orderId value for this SChangeOrderParam.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }

    

    public java.lang.String getSapOrderId() {
		return sapOrderId;
	}

	public void setSapOrderId(java.lang.String sapOrderId) {
		this.sapOrderId = sapOrderId;
	}

	/**
     * Sets the orderId value for this SChangeOrderParam.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SChangeOrderParam.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SChangeOrderParam.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the resourceId value for this SChangeOrderParam.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SChangeOrderParam.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the phoneId value for this SChangeOrderParam.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SChangeOrderParam.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the modifyType value for this SChangeOrderParam.
     * 
     * @return modifyType
     */
    public java.lang.Integer getModifyType() {
        return modifyType;
    }


    /**
     * Sets the modifyType value for this SChangeOrderParam.
     * 
     * @param modifyType
     */
    public void setModifyType(java.lang.Integer modifyType) {
        this.modifyType = modifyType;
    }


    /**
     * Gets the iMEIList value for this SChangeOrderParam.
     * 
     * @return iMEIList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo[] getIMEIList() {
        return iMEIList;
    }


    /**
     * Sets the iMEIList value for this SChangeOrderParam.
     * 
     * @param iMEIList
     */
    public void setIMEIList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo[] iMEIList) {
        this.iMEIList = iMEIList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo getIMEIList(int i) {
        return this.iMEIList[i];
    }

    public void setIMEIList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OfferInfo _value) {
        this.iMEIList[i] = _value;
    }


    /**
     * Gets the shoppingId value for this SChangeOrderParam.
     * 
     * @return shoppingId
     */
    public java.lang.String getShoppingId() {
        return shoppingId;
    }


    /**
     * Sets the shoppingId value for this SChangeOrderParam.
     * 
     * @param shoppingId
     */
    public void setShoppingId(java.lang.String shoppingId) {
        this.shoppingId = shoppingId;
    }


    /**
     * Gets the shoppingDate value for this SChangeOrderParam.
     * 
     * @return shoppingDate
     */
    public java.util.Calendar getShoppingDate() {
        return shoppingDate;
    }


    /**
     * Sets the shoppingDate value for this SChangeOrderParam.
     * 
     * @param shoppingDate
     */
    public void setShoppingDate(java.util.Calendar shoppingDate) {
        this.shoppingDate = shoppingDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SChangeOrderParam)) return false;
        SChangeOrderParam other = (SChangeOrderParam) obj;
        
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
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.modifyType==null && other.getModifyType()==null) || 
             (this.modifyType!=null &&
              this.modifyType.equals(other.getModifyType()))) &&
            ((this.iMEIList==null && other.getIMEIList()==null) || 
             (this.iMEIList!=null &&
              java.util.Arrays.equals(this.iMEIList, other.getIMEIList()))) &&
            ((this.shoppingId==null && other.getShoppingId()==null) || 
             (this.shoppingId!=null &&
              this.shoppingId.equals(other.getShoppingId()))) &&
            ((this.shoppingDate==null && other.getShoppingDate()==null) || 
             (this.shoppingDate!=null &&
              this.shoppingDate.equals(other.getShoppingDate())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getModifyType() != null) {
            _hashCode += getModifyType().hashCode();
        }
        if (getIMEIList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIMEIList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIMEIList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShoppingId() != null) {
            _hashCode += getShoppingId().hashCode();
        }
        if (getShoppingDate() != null) {
            _hashCode += getShoppingDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SChangeOrderParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeOrderParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEIList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iMEIList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "offerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingDate"));
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
