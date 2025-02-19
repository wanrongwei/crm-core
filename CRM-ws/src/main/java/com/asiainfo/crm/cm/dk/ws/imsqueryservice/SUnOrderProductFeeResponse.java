/**
 * SUnOrderProductFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SUnOrderProductFeeResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SRecurFeeResult[] recurFeeItems;

    public SUnOrderProductFeeResponse() {
    }

    public SUnOrderProductFeeResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SRecurFeeResult[] recurFeeItems) {
        super(
            responseHead);
        this.recurFeeItems = recurFeeItems;
    }


    /**
     * Gets the recurFeeItems value for this SUnOrderProductFeeResponse.
     * 
     * @return recurFeeItems
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SRecurFeeResult[] getRecurFeeItems() {
        return recurFeeItems;
    }


    /**
     * Sets the recurFeeItems value for this SUnOrderProductFeeResponse.
     * 
     * @param recurFeeItems
     */
    public void setRecurFeeItems(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SRecurFeeResult[] recurFeeItems) {
        this.recurFeeItems = recurFeeItems;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SRecurFeeResult getRecurFeeItems(int i) {
        return this.recurFeeItems[i];
    }

    public void setRecurFeeItems(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SRecurFeeResult _value) {
        this.recurFeeItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUnOrderProductFeeResponse)) return false;
        SUnOrderProductFeeResponse other = (SUnOrderProductFeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recurFeeItems==null && other.getRecurFeeItems()==null) || 
             (this.recurFeeItems!=null &&
              java.util.Arrays.equals(this.recurFeeItems, other.getRecurFeeItems())));
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
        if (getRecurFeeItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurFeeItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurFeeItems(), i);
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
        new org.apache.axis.description.TypeDesc(SUnOrderProductFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUnOrderProductFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurFeeItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurFeeItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRecurFeeResult"));
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
