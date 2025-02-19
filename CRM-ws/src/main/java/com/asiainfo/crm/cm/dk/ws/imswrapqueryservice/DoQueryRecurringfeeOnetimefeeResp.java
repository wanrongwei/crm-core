/**
 * DoQueryRecurringfeeOnetimefeeResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryRecurringfeeOnetimefeeResp  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RecurringOnetimeFee[] recurringOnetimeFeeList;

    public DoQueryRecurringfeeOnetimefeeResp() {
    }

    public DoQueryRecurringfeeOnetimefeeResp(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RecurringOnetimeFee[] recurringOnetimeFeeList) {
        super(
            responseHead);
        this.recurringOnetimeFeeList = recurringOnetimeFeeList;
    }


    /**
     * Gets the recurringOnetimeFeeList value for this DoQueryRecurringfeeOnetimefeeResp.
     * 
     * @return recurringOnetimeFeeList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RecurringOnetimeFee[] getRecurringOnetimeFeeList() {
        return recurringOnetimeFeeList;
    }


    /**
     * Sets the recurringOnetimeFeeList value for this DoQueryRecurringfeeOnetimefeeResp.
     * 
     * @param recurringOnetimeFeeList
     */
    public void setRecurringOnetimeFeeList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RecurringOnetimeFee[] recurringOnetimeFeeList) {
        this.recurringOnetimeFeeList = recurringOnetimeFeeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryRecurringfeeOnetimefeeResp)) return false;
        DoQueryRecurringfeeOnetimefeeResp other = (DoQueryRecurringfeeOnetimefeeResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recurringOnetimeFeeList==null && other.getRecurringOnetimeFeeList()==null) || 
             (this.recurringOnetimeFeeList!=null &&
              java.util.Arrays.equals(this.recurringOnetimeFeeList, other.getRecurringOnetimeFeeList())));
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
        if (getRecurringOnetimeFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurringOnetimeFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurringOnetimeFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryRecurringfeeOnetimefeeResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryRecurringfeeOnetimefeeResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringOnetimeFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringOnetimeFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurringOnetimeFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "recurringOnetimeFeeItem"));
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
