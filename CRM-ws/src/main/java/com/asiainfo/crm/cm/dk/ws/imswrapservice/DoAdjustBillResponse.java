/**
 * DoAdjustBillResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoAdjustBillResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.Billinfo billInfo;

    public DoAdjustBillResponse() {
    }

    public DoAdjustBillResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.Billinfo billInfo) {
        super(
            responseHead);
        this.billInfo = billInfo;
    }


    /**
     * Gets the billInfo value for this DoAdjustBillResponse.
     * 
     * @return billInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.Billinfo getBillInfo() {
        return billInfo;
    }


    /**
     * Sets the billInfo value for this DoAdjustBillResponse.
     * 
     * @param billInfo
     */
    public void setBillInfo(com.asiainfo.crm.cm.dk.ws.imswrapservice.Billinfo billInfo) {
        this.billInfo = billInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAdjustBillResponse)) return false;
        DoAdjustBillResponse other = (DoAdjustBillResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billInfo==null && other.getBillInfo()==null) || 
             (this.billInfo!=null &&
              this.billInfo.equals(other.getBillInfo())));
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
        if (getBillInfo() != null) {
            _hashCode += getBillInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAdjustBillResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBillResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo"));
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
