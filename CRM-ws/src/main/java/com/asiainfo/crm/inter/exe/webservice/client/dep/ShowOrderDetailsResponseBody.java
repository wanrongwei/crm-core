/**
 * ShowOrderDetailsResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class ShowOrderDetailsResponseBody  implements java.io.Serializable {
    private java.lang.String respondedOn;

    private java.lang.String statusCode;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersShow[] orders;

    private java.lang.String transactionId;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.ShowOrderErrorResponse showOrderErrorResponse;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public ShowOrderDetailsResponseBody() {
    }

    public ShowOrderDetailsResponseBody(
           java.lang.String respondedOn,
           java.lang.String statusCode,
           com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersShow[] orders,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.dep.ShowOrderErrorResponse showOrderErrorResponse,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.respondedOn = respondedOn;
           this.statusCode = statusCode;
           this.orders = orders;
           this.transactionId = transactionId;
           this.showOrderErrorResponse = showOrderErrorResponse;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the respondedOn value for this ShowOrderDetailsResponseBody.
     * 
     * @return respondedOn
     */
    public java.lang.String getRespondedOn() {
        return respondedOn;
    }


    /**
     * Sets the respondedOn value for this ShowOrderDetailsResponseBody.
     * 
     * @param respondedOn
     */
    public void setRespondedOn(java.lang.String respondedOn) {
        this.respondedOn = respondedOn;
    }


    /**
     * Gets the statusCode value for this ShowOrderDetailsResponseBody.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ShowOrderDetailsResponseBody.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the orders value for this ShowOrderDetailsResponseBody.
     * 
     * @return orders
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersShow[] getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this ShowOrderDetailsResponseBody.
     * 
     * @param orders
     */
    public void setOrders(com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersShow[] orders) {
        this.orders = orders;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersShow getOrders(int i) {
        return this.orders[i];
    }

    public void setOrders(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.OrdersShow _value) {
        this.orders[i] = _value;
    }


    /**
     * Gets the transactionId value for this ShowOrderDetailsResponseBody.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ShowOrderDetailsResponseBody.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the showOrderErrorResponse value for this ShowOrderDetailsResponseBody.
     * 
     * @return showOrderErrorResponse
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.ShowOrderErrorResponse getShowOrderErrorResponse() {
        return showOrderErrorResponse;
    }


    /**
     * Sets the showOrderErrorResponse value for this ShowOrderDetailsResponseBody.
     * 
     * @param showOrderErrorResponse
     */
    public void setShowOrderErrorResponse(com.asiainfo.crm.inter.exe.webservice.client.dep.ShowOrderErrorResponse showOrderErrorResponse) {
        this.showOrderErrorResponse = showOrderErrorResponse;
    }


    /**
     * Gets the attrInfo value for this ShowOrderDetailsResponseBody.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this ShowOrderDetailsResponseBody.
     * 
     * @param attrInfo
     */
    public void setAttrInfo(com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
        this.attrInfo = attrInfo;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo getAttrInfo(int i) {
        return this.attrInfo[i];
    }

    public void setAttrInfo(int i, com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo _value) {
        this.attrInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowOrderDetailsResponseBody)) return false;
        ShowOrderDetailsResponseBody other = (ShowOrderDetailsResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respondedOn==null && other.getRespondedOn()==null) || 
             (this.respondedOn!=null &&
              this.respondedOn.equals(other.getRespondedOn()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              java.util.Arrays.equals(this.orders, other.getOrders()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.showOrderErrorResponse==null && other.getShowOrderErrorResponse()==null) || 
             (this.showOrderErrorResponse!=null &&
              this.showOrderErrorResponse.equals(other.getShowOrderErrorResponse()))) &&
            ((this.attrInfo==null && other.getAttrInfo()==null) || 
             (this.attrInfo!=null &&
              java.util.Arrays.equals(this.attrInfo, other.getAttrInfo())));
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
        if (getRespondedOn() != null) {
            _hashCode += getRespondedOn().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getShowOrderErrorResponse() != null) {
            _hashCode += getShowOrderErrorResponse().hashCode();
        }
        if (getAttrInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttrInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttrInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ShowOrderDetailsResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "showOrderDetailsResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RespondedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "OrdersShow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showOrderErrorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShowOrderErrorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "ShowOrderErrorResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attrInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttrInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "AttrInfo"));
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
