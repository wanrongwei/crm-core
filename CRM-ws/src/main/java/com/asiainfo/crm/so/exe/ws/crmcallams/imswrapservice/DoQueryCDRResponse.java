/**
 * DoQueryCDRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryCDRResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SContact sContact;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallDetailRecordList callDetailRecordList;

    public DoQueryCDRResponse() {
    }

    public DoQueryCDRResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SContact sContact,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallDetailRecordList callDetailRecordList) {
        super(
            responseHead);
        this.sContact = sContact;
        this.callDetailRecordList = callDetailRecordList;
    }


    /**
     * Gets the sContact value for this DoQueryCDRResponse.
     * 
     * @return sContact
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SContact getSContact() {
        return sContact;
    }


    /**
     * Sets the sContact value for this DoQueryCDRResponse.
     * 
     * @param sContact
     */
    public void setSContact(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SContact sContact) {
        this.sContact = sContact;
    }


    /**
     * Gets the callDetailRecordList value for this DoQueryCDRResponse.
     * 
     * @return callDetailRecordList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallDetailRecordList getCallDetailRecordList() {
        return callDetailRecordList;
    }


    /**
     * Sets the callDetailRecordList value for this DoQueryCDRResponse.
     * 
     * @param callDetailRecordList
     */
    public void setCallDetailRecordList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CallDetailRecordList callDetailRecordList) {
        this.callDetailRecordList = callDetailRecordList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryCDRResponse)) return false;
        DoQueryCDRResponse other = (DoQueryCDRResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sContact==null && other.getSContact()==null) || 
             (this.sContact!=null &&
              this.sContact.equals(other.getSContact()))) &&
            ((this.callDetailRecordList==null && other.getCallDetailRecordList()==null) || 
             (this.callDetailRecordList!=null &&
              this.callDetailRecordList.equals(other.getCallDetailRecordList())));
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
        if (getSContact() != null) {
            _hashCode += getSContact().hashCode();
        }
        if (getCallDetailRecordList() != null) {
            _hashCode += getCallDetailRecordList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryCDRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailRecordList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDetailRecordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecordList"));
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
