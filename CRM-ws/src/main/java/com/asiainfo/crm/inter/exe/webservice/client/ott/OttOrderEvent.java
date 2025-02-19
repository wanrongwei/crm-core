/**
 * OttOrderEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.ott;

public class OttOrderEvent  implements java.io.Serializable {
    private java.lang.String operatorId;

    private java.lang.String orderId;

    private java.lang.String orderLineId;

    private com.asiainfo.crm.inter.exe.webservice.client.ott.OttOrderEventEventType eventType;

    private java.lang.String customerId;

    private java.lang.String oldCustomerId;

    private java.lang.String subscriberId;

    private java.lang.String oldSubscriberId;

    private com.asiainfo.crm.inter.exe.webservice.client.ott.Product product;

    private com.asiainfo.crm.inter.exe.webservice.client.ott.Product oldProduct;

    private com.asiainfo.crm.inter.exe.webservice.client.ott.Attribute[] extensionParameters;

    private boolean callbackExpected;

    public OttOrderEvent() {
    }

    public OttOrderEvent(
           java.lang.String operatorId,
           java.lang.String orderId,
           java.lang.String orderLineId,
           com.asiainfo.crm.inter.exe.webservice.client.ott.OttOrderEventEventType eventType,
           java.lang.String customerId,
           java.lang.String oldCustomerId,
           java.lang.String subscriberId,
           java.lang.String oldSubscriberId,
           com.asiainfo.crm.inter.exe.webservice.client.ott.Product product,
           com.asiainfo.crm.inter.exe.webservice.client.ott.Product oldProduct,
           com.asiainfo.crm.inter.exe.webservice.client.ott.Attribute[] extensionParameters,
           boolean callbackExpected) {
           this.operatorId = operatorId;
           this.orderId = orderId;
           this.orderLineId = orderLineId;
           this.eventType = eventType;
           this.customerId = customerId;
           this.oldCustomerId = oldCustomerId;
           this.subscriberId = subscriberId;
           this.oldSubscriberId = oldSubscriberId;
           this.product = product;
           this.oldProduct = oldProduct;
           this.extensionParameters = extensionParameters;
           this.callbackExpected = callbackExpected;
    }


    /**
     * Gets the operatorId value for this OttOrderEvent.
     * 
     * @return operatorId
     */
    public java.lang.String getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this OttOrderEvent.
     * 
     * @param operatorId
     */
    public void setOperatorId(java.lang.String operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the orderId value for this OttOrderEvent.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OttOrderEvent.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLineId value for this OttOrderEvent.
     * 
     * @return orderLineId
     */
    public java.lang.String getOrderLineId() {
        return orderLineId;
    }


    /**
     * Sets the orderLineId value for this OttOrderEvent.
     * 
     * @param orderLineId
     */
    public void setOrderLineId(java.lang.String orderLineId) {
        this.orderLineId = orderLineId;
    }


    /**
     * Gets the eventType value for this OttOrderEvent.
     * 
     * @return eventType
     */
    public com.asiainfo.crm.inter.exe.webservice.client.ott.OttOrderEventEventType getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this OttOrderEvent.
     * 
     * @param eventType
     */
    public void setEventType(com.asiainfo.crm.inter.exe.webservice.client.ott.OttOrderEventEventType eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the customerId value for this OttOrderEvent.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this OttOrderEvent.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the oldCustomerId value for this OttOrderEvent.
     * 
     * @return oldCustomerId
     */
    public java.lang.String getOldCustomerId() {
        return oldCustomerId;
    }


    /**
     * Sets the oldCustomerId value for this OttOrderEvent.
     * 
     * @param oldCustomerId
     */
    public void setOldCustomerId(java.lang.String oldCustomerId) {
        this.oldCustomerId = oldCustomerId;
    }


    /**
     * Gets the subscriberId value for this OttOrderEvent.
     * 
     * @return subscriberId
     */
    public java.lang.String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this OttOrderEvent.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(java.lang.String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the oldSubscriberId value for this OttOrderEvent.
     * 
     * @return oldSubscriberId
     */
    public java.lang.String getOldSubscriberId() {
        return oldSubscriberId;
    }


    /**
     * Sets the oldSubscriberId value for this OttOrderEvent.
     * 
     * @param oldSubscriberId
     */
    public void setOldSubscriberId(java.lang.String oldSubscriberId) {
        this.oldSubscriberId = oldSubscriberId;
    }


    /**
     * Gets the product value for this OttOrderEvent.
     * 
     * @return product
     */
    public com.asiainfo.crm.inter.exe.webservice.client.ott.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this OttOrderEvent.
     * 
     * @param product
     */
    public void setProduct(com.asiainfo.crm.inter.exe.webservice.client.ott.Product product) {
        this.product = product;
    }


    /**
     * Gets the oldProduct value for this OttOrderEvent.
     * 
     * @return oldProduct
     */
    public com.asiainfo.crm.inter.exe.webservice.client.ott.Product getOldProduct() {
        return oldProduct;
    }


    /**
     * Sets the oldProduct value for this OttOrderEvent.
     * 
     * @param oldProduct
     */
    public void setOldProduct(com.asiainfo.crm.inter.exe.webservice.client.ott.Product oldProduct) {
        this.oldProduct = oldProduct;
    }


    /**
     * Gets the extensionParameters value for this OttOrderEvent.
     * 
     * @return extensionParameters
     */
    public com.asiainfo.crm.inter.exe.webservice.client.ott.Attribute[] getExtensionParameters() {
        return extensionParameters;
    }


    /**
     * Sets the extensionParameters value for this OttOrderEvent.
     * 
     * @param extensionParameters
     */
    public void setExtensionParameters(com.asiainfo.crm.inter.exe.webservice.client.ott.Attribute[] extensionParameters) {
        this.extensionParameters = extensionParameters;
    }


    /**
     * Gets the callbackExpected value for this OttOrderEvent.
     * 
     * @return callbackExpected
     */
    public boolean isCallbackExpected() {
        return callbackExpected;
    }


    /**
     * Sets the callbackExpected value for this OttOrderEvent.
     * 
     * @param callbackExpected
     */
    public void setCallbackExpected(boolean callbackExpected) {
        this.callbackExpected = callbackExpected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OttOrderEvent)) return false;
        OttOrderEvent other = (OttOrderEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderLineId==null && other.getOrderLineId()==null) || 
             (this.orderLineId!=null &&
              this.orderLineId.equals(other.getOrderLineId()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.oldCustomerId==null && other.getOldCustomerId()==null) || 
             (this.oldCustomerId!=null &&
              this.oldCustomerId.equals(other.getOldCustomerId()))) &&
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.oldSubscriberId==null && other.getOldSubscriberId()==null) || 
             (this.oldSubscriberId!=null &&
              this.oldSubscriberId.equals(other.getOldSubscriberId()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.oldProduct==null && other.getOldProduct()==null) || 
             (this.oldProduct!=null &&
              this.oldProduct.equals(other.getOldProduct()))) &&
            ((this.extensionParameters==null && other.getExtensionParameters()==null) || 
             (this.extensionParameters!=null &&
              java.util.Arrays.equals(this.extensionParameters, other.getExtensionParameters()))) &&
            this.callbackExpected == other.isCallbackExpected();
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
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderLineId() != null) {
            _hashCode += getOrderLineId().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getOldCustomerId() != null) {
            _hashCode += getOldCustomerId().hashCode();
        }
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getOldSubscriberId() != null) {
            _hashCode += getOldSubscriberId().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getOldProduct() != null) {
            _hashCode += getOldProduct().hashCode();
        }
        if (getExtensionParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensionParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensionParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isCallbackExpected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OttOrderEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "OttOrderEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", ">OttOrderEvent>eventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "product"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extensionParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "attribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackExpected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callbackExpected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
