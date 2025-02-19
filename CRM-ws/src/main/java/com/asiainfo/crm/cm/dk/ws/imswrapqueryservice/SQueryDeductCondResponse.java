/**
 * SQueryDeductCondResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryDeductCondResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryDeductOut[] deductOutList;

    public SQueryDeductCondResponse() {
    }

    public SQueryDeductCondResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryDeductOut[] deductOutList) {
        super(
            responseHead);
        this.deductOutList = deductOutList;
    }


    /**
     * Gets the deductOutList value for this SQueryDeductCondResponse.
     * 
     * @return deductOutList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryDeductOut[] getDeductOutList() {
        return deductOutList;
    }


    /**
     * Sets the deductOutList value for this SQueryDeductCondResponse.
     * 
     * @param deductOutList
     */
    public void setDeductOutList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryDeductOut[] deductOutList) {
        this.deductOutList = deductOutList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryDeductOut getDeductOutList(int i) {
        return this.deductOutList[i];
    }

    public void setDeductOutList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryDeductOut _value) {
        this.deductOutList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryDeductCondResponse)) return false;
        SQueryDeductCondResponse other = (SQueryDeductCondResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deductOutList==null && other.getDeductOutList()==null) || 
             (this.deductOutList!=null &&
              java.util.Arrays.equals(this.deductOutList, other.getDeductOutList())));
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
        if (getDeductOutList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeductOutList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeductOutList(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryDeductCondResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDeductCondResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductOutList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductOutList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDeductOut"));
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
