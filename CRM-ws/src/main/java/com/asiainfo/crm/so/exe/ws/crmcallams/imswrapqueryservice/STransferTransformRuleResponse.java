/**
 * STransferTransformRuleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class STransferTransformRuleResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRule[] sTransferTransformRules;

    public STransferTransformRuleResponse() {
    }

    public STransferTransformRuleResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead _responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRule[] sTransferTransformRules) {
        super(
            _responseHead);
        this.responseHead = responseHead;
        this.sTransferTransformRules = sTransferTransformRules;
    }


    /**
     * Gets the responseHead value for this STransferTransformRuleResponse.
     * 
     * @return responseHead
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead getResponseHead() {
        return responseHead;
    }


    /**
     * Sets the responseHead value for this STransferTransformRuleResponse.
     * 
     * @param responseHead
     */
    public void setResponseHead(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead) {
        this.responseHead = responseHead;
    }


    /**
     * Gets the sTransferTransformRules value for this STransferTransformRuleResponse.
     * 
     * @return sTransferTransformRules
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRule[] getSTransferTransformRules() {
        return sTransferTransformRules;
    }


    /**
     * Sets the sTransferTransformRules value for this STransferTransformRuleResponse.
     * 
     * @param sTransferTransformRules
     */
    public void setSTransferTransformRules(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRule[] sTransferTransformRules) {
        this.sTransferTransformRules = sTransferTransformRules;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRule getSTransferTransformRules(int i) {
        return this.sTransferTransformRules[i];
    }

    public void setSTransferTransformRules(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRule _value) {
        this.sTransferTransformRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STransferTransformRuleResponse)) return false;
        STransferTransformRuleResponse other = (STransferTransformRuleResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.responseHead==null && other.getResponseHead()==null) || 
             (this.responseHead!=null &&
              this.responseHead.equals(other.getResponseHead()))) &&
            ((this.sTransferTransformRules==null && other.getSTransferTransformRules()==null) || 
             (this.sTransferTransformRules!=null &&
              java.util.Arrays.equals(this.sTransferTransformRules, other.getSTransferTransformRules())));
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
        if (getResponseHead() != null) {
            _hashCode += getResponseHead().hashCode();
        }
        if (getSTransferTransformRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTransferTransformRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTransferTransformRules(), i);
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
        new org.apache.axis.description.TypeDesc(STransferTransformRuleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransferTransformRuleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHead");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STransferTransformRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sTransferTransformRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransferTransformRule"));
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
