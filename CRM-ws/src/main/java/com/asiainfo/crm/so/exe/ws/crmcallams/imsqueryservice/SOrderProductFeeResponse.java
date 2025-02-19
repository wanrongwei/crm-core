/**
 * SOrderProductFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class SOrderProductFeeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SRecurFeeResult[] recurFeeItems;

    public SOrderProductFeeResponse() {
    }

    public SOrderProductFeeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SRecurFeeResult[] recurFeeItems) {
        super(
            responseHead);
        this.recurFeeItems = recurFeeItems;
    }


    /**
     * Gets the recurFeeItems value for this SOrderProductFeeResponse.
     * 
     * @return recurFeeItems
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SRecurFeeResult[] getRecurFeeItems() {
        return recurFeeItems;
    }


    /**
     * Sets the recurFeeItems value for this SOrderProductFeeResponse.
     * 
     * @param recurFeeItems
     */
    public void setRecurFeeItems(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SRecurFeeResult[] recurFeeItems) {
        this.recurFeeItems = recurFeeItems;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SRecurFeeResult getRecurFeeItems(int i) {
        return this.recurFeeItems[i];
    }

    public void setRecurFeeItems(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SRecurFeeResult _value) {
        this.recurFeeItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof SOrderProductFeeResponse)) return false;
        SOrderProductFeeResponse other = (SOrderProductFeeResponse) obj;
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
        new org.apache.axis.description.TypeDesc(SOrderProductFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderProductFeeResponse"));
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
