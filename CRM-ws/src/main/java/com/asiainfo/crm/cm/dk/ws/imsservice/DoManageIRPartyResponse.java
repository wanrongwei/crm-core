/**
 * DoManageIRPartyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoManageIRPartyResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsservice.IrResponse[] iRResponseList;

    public DoManageIRPartyResponse() {
    }

    public DoManageIRPartyResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsservice.IrResponse[] iRResponseList) {
        super(
            responseHead);
        this.iRResponseList = iRResponseList;
    }


    /**
     * Gets the iRResponseList value for this DoManageIRPartyResponse.
     * 
     * @return iRResponseList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.IrResponse[] getIRResponseList() {
        return iRResponseList;
    }


    /**
     * Sets the iRResponseList value for this DoManageIRPartyResponse.
     * 
     * @param iRResponseList
     */
    public void setIRResponseList(com.asiainfo.crm.cm.dk.ws.imsservice.IrResponse[] iRResponseList) {
        this.iRResponseList = iRResponseList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoManageIRPartyResponse)) return false;
        DoManageIRPartyResponse other = (DoManageIRPartyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.iRResponseList==null && other.getIRResponseList()==null) || 
             (this.iRResponseList!=null &&
              java.util.Arrays.equals(this.iRResponseList, other.getIRResponseList())));
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
        if (getIRResponseList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIRResponseList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIRResponseList(), i);
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
        new org.apache.axis.description.TypeDesc(DoManageIRPartyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManageIRPartyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRResponseList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iRResponseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "irResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "iRResponse_Item"));
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
