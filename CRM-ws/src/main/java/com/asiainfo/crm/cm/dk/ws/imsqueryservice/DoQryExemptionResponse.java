/**
 * DoQryExemptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQryExemptionResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExemptionInfo exemptionInfo;

    public DoQryExemptionResponse() {
    }

    public DoQryExemptionResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExemptionInfo exemptionInfo) {
        super(
            responseHead);
        this.exemptionInfo = exemptionInfo;
    }


    /**
     * Gets the exemptionInfo value for this DoQryExemptionResponse.
     * 
     * @return exemptionInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExemptionInfo getExemptionInfo() {
        return exemptionInfo;
    }


    /**
     * Sets the exemptionInfo value for this DoQryExemptionResponse.
     * 
     * @param exemptionInfo
     */
    public void setExemptionInfo(com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExemptionInfo exemptionInfo) {
        this.exemptionInfo = exemptionInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQryExemptionResponse)) return false;
        DoQryExemptionResponse other = (DoQryExemptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exemptionInfo==null && other.getExemptionInfo()==null) || 
             (this.exemptionInfo!=null &&
              this.exemptionInfo.equals(other.getExemptionInfo())));
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
        if (getExemptionInfo() != null) {
            _hashCode += getExemptionInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQryExemptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQryExemptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "exemptionInfo"));
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
