/**
 * ShowOrderDetailsRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dep;

public class ShowOrderDetailsRequestBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.dep.RequestContext requestContext;

    private java.lang.String depResellerId;

    private java.lang.String[] orderNumbers;

    private com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo;

    public ShowOrderDetailsRequestBody() {
    }

    public ShowOrderDetailsRequestBody(
           com.asiainfo.crm.inter.exe.webservice.client.dep.RequestContext requestContext,
           java.lang.String depResellerId,
           java.lang.String[] orderNumbers,
           com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] attrInfo) {
           this.requestContext = requestContext;
           this.depResellerId = depResellerId;
           this.orderNumbers = orderNumbers;
           this.attrInfo = attrInfo;
    }


    /**
     * Gets the requestContext value for this ShowOrderDetailsRequestBody.
     * 
     * @return requestContext
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.RequestContext getRequestContext() {
        return requestContext;
    }


    /**
     * Sets the requestContext value for this ShowOrderDetailsRequestBody.
     * 
     * @param requestContext
     */
    public void setRequestContext(com.asiainfo.crm.inter.exe.webservice.client.dep.RequestContext requestContext) {
        this.requestContext = requestContext;
    }


    /**
     * Gets the depResellerId value for this ShowOrderDetailsRequestBody.
     * 
     * @return depResellerId
     */
    public java.lang.String getDepResellerId() {
        return depResellerId;
    }


    /**
     * Sets the depResellerId value for this ShowOrderDetailsRequestBody.
     * 
     * @param depResellerId
     */
    public void setDepResellerId(java.lang.String depResellerId) {
        this.depResellerId = depResellerId;
    }


    /**
     * Gets the orderNumbers value for this ShowOrderDetailsRequestBody.
     * 
     * @return orderNumbers
     */
    public java.lang.String[] getOrderNumbers() {
        return orderNumbers;
    }


    /**
     * Sets the orderNumbers value for this ShowOrderDetailsRequestBody.
     * 
     * @param orderNumbers
     */
    public void setOrderNumbers(java.lang.String[] orderNumbers) {
        this.orderNumbers = orderNumbers;
    }

    public java.lang.String getOrderNumbers(int i) {
        return this.orderNumbers[i];
    }

    public void setOrderNumbers(int i, java.lang.String _value) {
        this.orderNumbers[i] = _value;
    }


    /**
     * Gets the attrInfo value for this ShowOrderDetailsRequestBody.
     * 
     * @return attrInfo
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dep.AttrInfo[] getAttrInfo() {
        return attrInfo;
    }


    /**
     * Sets the attrInfo value for this ShowOrderDetailsRequestBody.
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
        if (!(obj instanceof ShowOrderDetailsRequestBody)) return false;
        ShowOrderDetailsRequestBody other = (ShowOrderDetailsRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestContext==null && other.getRequestContext()==null) || 
             (this.requestContext!=null &&
              this.requestContext.equals(other.getRequestContext()))) &&
            ((this.depResellerId==null && other.getDepResellerId()==null) || 
             (this.depResellerId!=null &&
              this.depResellerId.equals(other.getDepResellerId()))) &&
            ((this.orderNumbers==null && other.getOrderNumbers()==null) || 
             (this.orderNumbers!=null &&
              java.util.Arrays.equals(this.orderNumbers, other.getOrderNumbers()))) &&
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
        if (getRequestContext() != null) {
            _hashCode += getRequestContext().hashCode();
        }
        if (getDepResellerId() != null) {
            _hashCode += getDepResellerId().hashCode();
        }
        if (getOrderNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(ShowOrderDetailsRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "showOrderDetailsRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "RequestContext"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depResellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepResellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
