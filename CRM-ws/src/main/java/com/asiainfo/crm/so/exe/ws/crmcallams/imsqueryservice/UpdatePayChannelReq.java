/**
 * UpdatePayChannelReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class UpdatePayChannelReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CaPayChannel payChannel;

    public UpdatePayChannelReq() {
    }

    public UpdatePayChannelReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CaPayChannel payChannel) {
           this.payChannel = payChannel;
    }


    /**
     * Gets the payChannel value for this UpdatePayChannelReq.
     * 
     * @return payChannel
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CaPayChannel getPayChannel() {
        return payChannel;
    }


    /**
     * Sets the payChannel value for this UpdatePayChannelReq.
     * 
     * @param payChannel
     */
    public void setPayChannel(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CaPayChannel payChannel) {
        this.payChannel = payChannel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof UpdatePayChannelReq)) return false;
        UpdatePayChannelReq other = (UpdatePayChannelReq) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payChannel==null && other.getPayChannel()==null) || 
             (this.payChannel!=null &&
              this.payChannel.equals(other.getPayChannel())));
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
        if (getPayChannel() != null) {
            _hashCode += getPayChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePayChannelReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updatePayChannelReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caPayChannel"));
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
