/**
 * DoTransferResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoTransferResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance[] sBalanceList;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceList;

    public DoTransferResponse() {
    }

    public DoTransferResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance[] sBalanceList,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceList) {
        super(
            responseHead);
        this.sBalanceList = sBalanceList;
        this.freeResourceList = freeResourceList;
    }


    /**
     * Gets the sBalanceList value for this DoTransferResponse.
     * 
     * @return sBalanceList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance[] getSBalanceList() {
        return sBalanceList;
    }


    /**
     * Sets the sBalanceList value for this DoTransferResponse.
     * 
     * @param sBalanceList
     */
    public void setSBalanceList(com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance[] sBalanceList) {
        this.sBalanceList = sBalanceList;
    }


    /**
     * Gets the freeResourceList value for this DoTransferResponse.
     * 
     * @return freeResourceList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] getFreeResourceList() {
        return freeResourceList;
    }


    /**
     * Sets the freeResourceList value for this DoTransferResponse.
     * 
     * @param freeResourceList
     */
    public void setFreeResourceList(com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceList) {
        this.freeResourceList = freeResourceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoTransferResponse)) return false;
        DoTransferResponse other = (DoTransferResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sBalanceList==null && other.getSBalanceList()==null) || 
             (this.sBalanceList!=null &&
              java.util.Arrays.equals(this.sBalanceList, other.getSBalanceList()))) &&
            ((this.freeResourceList==null && other.getFreeResourceList()==null) || 
             (this.freeResourceList!=null &&
              java.util.Arrays.equals(this.freeResourceList, other.getFreeResourceList())));
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
        if (getSBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSBalanceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeResourceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceList(), i);
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
        new org.apache.axis.description.TypeDesc(DoTransferResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doTransferResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBalanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sBalanceListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceListItem"));
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
