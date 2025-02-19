/**
 * DoSMngQueryDepositResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoSMngQueryDepositResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPocket[] pocketList;

    public DoSMngQueryDepositResponse() {
    }

    public DoSMngQueryDepositResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPocket[] pocketList) {
        super(
            responseHead);
        this.pocketList = pocketList;
    }


    /**
     * Gets the pocketList value for this DoSMngQueryDepositResponse.
     * 
     * @return pocketList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPocket[] getPocketList() {
        return pocketList;
    }


    /**
     * Sets the pocketList value for this DoSMngQueryDepositResponse.
     * 
     * @param pocketList
     */
    public void setPocketList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPocket[] pocketList) {
        this.pocketList = pocketList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoSMngQueryDepositResponse)) return false;
        DoSMngQueryDepositResponse other = (DoSMngQueryDepositResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pocketList==null && other.getPocketList()==null) || 
             (this.pocketList!=null &&
              java.util.Arrays.equals(this.pocketList, other.getPocketList())));
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
        if (getPocketList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPocketList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPocketList(), i);
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
        new org.apache.axis.description.TypeDesc(DoSMngQueryDepositResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSMngQueryDepositResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pocketList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pocketList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPocket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sPocketList"));
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
