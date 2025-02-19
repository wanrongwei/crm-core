/**
 * DoQueryGraphResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryGraphResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup[] highestTransactionGroupList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup[] longestCallingSecondsGroupList;

    public DoQueryGraphResponse() {
    }

    public DoQueryGraphResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup[] highestTransactionGroupList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup[] longestCallingSecondsGroupList) {
        super(
            responseHead);
        this.highestTransactionGroupList = highestTransactionGroupList;
        this.longestCallingSecondsGroupList = longestCallingSecondsGroupList;
    }


    /**
     * Gets the highestTransactionGroupList value for this DoQueryGraphResponse.
     * 
     * @return highestTransactionGroupList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup[] getHighestTransactionGroupList() {
        return highestTransactionGroupList;
    }


    /**
     * Sets the highestTransactionGroupList value for this DoQueryGraphResponse.
     * 
     * @param highestTransactionGroupList
     */
    public void setHighestTransactionGroupList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup[] highestTransactionGroupList) {
        this.highestTransactionGroupList = highestTransactionGroupList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup getHighestTransactionGroupList(int i) {
        return this.highestTransactionGroupList[i];
    }

    public void setHighestTransactionGroupList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup _value) {
        this.highestTransactionGroupList[i] = _value;
    }


    /**
     * Gets the longestCallingSecondsGroupList value for this DoQueryGraphResponse.
     * 
     * @return longestCallingSecondsGroupList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup[] getLongestCallingSecondsGroupList() {
        return longestCallingSecondsGroupList;
    }


    /**
     * Sets the longestCallingSecondsGroupList value for this DoQueryGraphResponse.
     * 
     * @param longestCallingSecondsGroupList
     */
    public void setLongestCallingSecondsGroupList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup[] longestCallingSecondsGroupList) {
        this.longestCallingSecondsGroupList = longestCallingSecondsGroupList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup getLongestCallingSecondsGroupList(int i) {
        return this.longestCallingSecondsGroupList[i];
    }

    public void setLongestCallingSecondsGroupList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup _value) {
        this.longestCallingSecondsGroupList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryGraphResponse)) return false;
        DoQueryGraphResponse other = (DoQueryGraphResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.highestTransactionGroupList==null && other.getHighestTransactionGroupList()==null) || 
             (this.highestTransactionGroupList!=null &&
              java.util.Arrays.equals(this.highestTransactionGroupList, other.getHighestTransactionGroupList()))) &&
            ((this.longestCallingSecondsGroupList==null && other.getLongestCallingSecondsGroupList()==null) || 
             (this.longestCallingSecondsGroupList!=null &&
              java.util.Arrays.equals(this.longestCallingSecondsGroupList, other.getLongestCallingSecondsGroupList())));
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
        if (getHighestTransactionGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHighestTransactionGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHighestTransactionGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLongestCallingSecondsGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLongestCallingSecondsGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLongestCallingSecondsGroupList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryGraphResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGraphResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestTransactionGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highestTransactionGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "highestTransactionGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longestCallingSecondsGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longestCallingSecondsGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "longestCallingSecondsGroup"));
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
