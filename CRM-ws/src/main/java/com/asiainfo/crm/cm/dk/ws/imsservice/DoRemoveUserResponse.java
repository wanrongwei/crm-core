/**
 * DoRemoveUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoRemoveUserResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] sBalanceList;

    public DoRemoveUserResponse() {
    }

    public DoRemoveUserResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] sBalanceList) {
        super(
            responseHead);
        this.sBalanceList = sBalanceList;
    }


    /**
     * Gets the sBalanceList value for this DoRemoveUserResponse.
     * 
     * @return sBalanceList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] getSBalanceList() {
        return sBalanceList;
    }


    /**
     * Sets the sBalanceList value for this DoRemoveUserResponse.
     * 
     * @param sBalanceList
     */
    public void setSBalanceList(com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] sBalanceList) {
        this.sBalanceList = sBalanceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRemoveUserResponse)) return false;
        DoRemoveUserResponse other = (DoRemoveUserResponse) obj;
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
              java.util.Arrays.equals(this.sBalanceList, other.getSBalanceList())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRemoveUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRemoveUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBalanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sBalanceListItem"));
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
