/**
 * DoQueryInstallmenInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryInstallmenInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InstallmentInfoDtl[] installmentInfoList;

    public DoQueryInstallmenInfoResponse() {
    }

    public DoQueryInstallmenInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InstallmentInfoDtl[] installmentInfoList) {
        super(
            responseHead);
        this.installmentInfoList = installmentInfoList;
    }


    /**
     * Gets the installmentInfoList value for this DoQueryInstallmenInfoResponse.
     * 
     * @return installmentInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InstallmentInfoDtl[] getInstallmentInfoList() {
        return installmentInfoList;
    }


    /**
     * Sets the installmentInfoList value for this DoQueryInstallmenInfoResponse.
     * 
     * @param installmentInfoList
     */
    public void setInstallmentInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InstallmentInfoDtl[] installmentInfoList) {
        this.installmentInfoList = installmentInfoList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InstallmentInfoDtl getInstallmentInfoList(int i) {
        return this.installmentInfoList[i];
    }

    public void setInstallmentInfoList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InstallmentInfoDtl _value) {
        this.installmentInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryInstallmenInfoResponse)) return false;
        DoQueryInstallmenInfoResponse other = (DoQueryInstallmenInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.installmentInfoList==null && other.getInstallmentInfoList()==null) || 
             (this.installmentInfoList!=null &&
              java.util.Arrays.equals(this.installmentInfoList, other.getInstallmentInfoList())));
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
        if (getInstallmentInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstallmentInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstallmentInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryInstallmenInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInstallmenInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installmentInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "installmentInfoDtl"));
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
