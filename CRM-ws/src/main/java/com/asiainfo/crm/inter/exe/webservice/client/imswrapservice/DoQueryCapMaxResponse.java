/**
 * DoQueryCapMaxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class DoQueryCapMaxResponse  extends com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CapMaxAccumulate[] capMaxAccumulateList;

    public DoQueryCapMaxResponse() {
    }

    public DoQueryCapMaxResponse(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.ResponseHead responseHead,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CapMaxAccumulate[] capMaxAccumulateList) {
        super(
            responseHead);
        this.capMaxAccumulateList = capMaxAccumulateList;
    }


    /**
     * Gets the capMaxAccumulateList value for this DoQueryCapMaxResponse.
     * 
     * @return capMaxAccumulateList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CapMaxAccumulate[] getCapMaxAccumulateList() {
        return capMaxAccumulateList;
    }


    /**
     * Sets the capMaxAccumulateList value for this DoQueryCapMaxResponse.
     * 
     * @param capMaxAccumulateList
     */
    public void setCapMaxAccumulateList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.CapMaxAccumulate[] capMaxAccumulateList) {
        this.capMaxAccumulateList = capMaxAccumulateList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryCapMaxResponse)) return false;
        DoQueryCapMaxResponse other = (DoQueryCapMaxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.capMaxAccumulateList==null && other.getCapMaxAccumulateList()==null) || 
             (this.capMaxAccumulateList!=null &&
              java.util.Arrays.equals(this.capMaxAccumulateList, other.getCapMaxAccumulateList())));
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
        if (getCapMaxAccumulateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCapMaxAccumulateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCapMaxAccumulateList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryCapMaxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCapMaxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMaxAccumulateList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capMaxAccumulateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxAccumulate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "capMaxAccumulateList"));
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
