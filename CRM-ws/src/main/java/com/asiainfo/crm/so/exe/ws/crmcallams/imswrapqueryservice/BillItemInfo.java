/**
 * BillItemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class BillItemInfo  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemValue[] billItemValue;

    private java.lang.Integer serviceId;

    public BillItemInfo() {
    }

    public BillItemInfo(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemValue[] billItemValue,
           java.lang.Integer serviceId) {
           this.billItemValue = billItemValue;
           this.serviceId = serviceId;
    }


    /**
     * Gets the billItemValue value for this BillItemInfo.
     * 
     * @return billItemValue
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemValue[] getBillItemValue() {
        return billItemValue;
    }


    /**
     * Sets the billItemValue value for this BillItemInfo.
     * 
     * @param billItemValue
     */
    public void setBillItemValue(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemValue[] billItemValue) {
        this.billItemValue = billItemValue;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemValue getBillItemValue(int i) {
        return this.billItemValue[i];
    }

    public void setBillItemValue(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemValue _value) {
        this.billItemValue[i] = _value;
    }


    /**
     * Gets the serviceId value for this BillItemInfo.
     * 
     * @return serviceId
     */
    public java.lang.Integer getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this BillItemInfo.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Integer serviceId) {
        this.serviceId = serviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillItemInfo)) return false;
        BillItemInfo other = (BillItemInfo) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billItemValue==null && other.getBillItemValue()==null) || 
             (this.billItemValue!=null &&
              java.util.Arrays.equals(this.billItemValue, other.getBillItemValue()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId())));
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
        if (getBillItemValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillItemValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillItemValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillItemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItemValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
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
