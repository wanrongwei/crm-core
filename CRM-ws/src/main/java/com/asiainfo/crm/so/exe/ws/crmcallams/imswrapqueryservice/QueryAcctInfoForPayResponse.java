/**
 * QueryAcctInfoForPayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryAcctInfoForPayResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Boolean isMatch;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount[] acctList;

    public QueryAcctInfoForPayResponse() {
    }

    public QueryAcctInfoForPayResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Boolean isMatch,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount[] acctList) {
        super(
            responseHead);
        this.isMatch = isMatch;
        this.acctList = acctList;
    }


    /**
     * Gets the isMatch value for this QueryAcctInfoForPayResponse.
     * 
     * @return isMatch
     */
    public java.lang.Boolean getIsMatch() {
        return isMatch;
    }


    /**
     * Sets the isMatch value for this QueryAcctInfoForPayResponse.
     * 
     * @param isMatch
     */
    public void setIsMatch(java.lang.Boolean isMatch) {
        this.isMatch = isMatch;
    }


    /**
     * Gets the acctList value for this QueryAcctInfoForPayResponse.
     * 
     * @return acctList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount[] getAcctList() {
        return acctList;
    }


    /**
     * Sets the acctList value for this QueryAcctInfoForPayResponse.
     * 
     * @param acctList
     */
    public void setAcctList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount[] acctList) {
        this.acctList = acctList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount getAcctList(int i) {
        return this.acctList[i];
    }

    public void setAcctList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SAccount _value) {
        this.acctList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAcctInfoForPayResponse)) return false;
        QueryAcctInfoForPayResponse other = (QueryAcctInfoForPayResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isMatch==null && other.getIsMatch()==null) || 
             (this.isMatch!=null &&
              this.isMatch.equals(other.getIsMatch()))) &&
            ((this.acctList==null && other.getAcctList()==null) || 
             (this.acctList!=null &&
              java.util.Arrays.equals(this.acctList, other.getAcctList())));
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
        if (getIsMatch() != null) {
            _hashCode += getIsMatch().hashCode();
        }
        if (getAcctList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryAcctInfoForPayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAcctInfoForPayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
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
