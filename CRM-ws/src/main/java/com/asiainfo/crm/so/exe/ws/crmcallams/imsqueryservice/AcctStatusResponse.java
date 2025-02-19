/**
 * AcctStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class AcctStatusResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.AcctStatus acctStatus;

    public AcctStatusResponse() {
    }

    public AcctStatusResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.AcctStatus acctStatus) {
        super(
            responseHead);
        this.acctStatus = acctStatus;
    }


    /**
     * Gets the acctStatus value for this AcctStatusResponse.
     * 
     * @return acctStatus
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.AcctStatus getAcctStatus() {
        return acctStatus;
    }


    /**
     * Sets the acctStatus value for this AcctStatusResponse.
     * 
     * @param acctStatus
     */
    public void setAcctStatus(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.AcctStatus acctStatus) {
        this.acctStatus = acctStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof AcctStatusResponse)) return false;
        AcctStatusResponse other = (AcctStatusResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctStatus==null && other.getAcctStatus()==null) || 
             (this.acctStatus!=null &&
              this.acctStatus.equals(other.getAcctStatus())));
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
        if (getAcctStatus() != null) {
            _hashCode += getAcctStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatus"));
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
