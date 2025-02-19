/**
 * DoQueryPCRFInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryPCRFInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PcrfInfo pcrfInfo;

    public DoQueryPCRFInfoResponse() {
    }

    public DoQueryPCRFInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PcrfInfo pcrfInfo) {
        super(
            responseHead);
        this.pcrfInfo = pcrfInfo;
    }


    /**
     * Gets the pcrfInfo value for this DoQueryPCRFInfoResponse.
     * 
     * @return pcrfInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PcrfInfo getPcrfInfo() {
        return pcrfInfo;
    }


    /**
     * Sets the pcrfInfo value for this DoQueryPCRFInfoResponse.
     * 
     * @param pcrfInfo
     */
    public void setPcrfInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PcrfInfo pcrfInfo) {
        this.pcrfInfo = pcrfInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryPCRFInfoResponse)) return false;
        DoQueryPCRFInfoResponse other = (DoQueryPCRFInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pcrfInfo==null && other.getPcrfInfo()==null) || 
             (this.pcrfInfo!=null &&
              this.pcrfInfo.equals(other.getPcrfInfo())));
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
        if (getPcrfInfo() != null) {
            _hashCode += getPcrfInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryPCRFInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcrfInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcrfInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pcrfInfo"));
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
