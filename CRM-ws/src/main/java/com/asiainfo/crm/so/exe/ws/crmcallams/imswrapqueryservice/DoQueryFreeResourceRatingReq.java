/**
 * DoQueryFreeResourceRatingReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryFreeResourceRatingReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryBalance sqryBalanceIn;

    public DoQueryFreeResourceRatingReq() {
    }

    public DoQueryFreeResourceRatingReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryBalance sqryBalanceIn) {
           this.sqryBalanceIn = sqryBalanceIn;
    }


    /**
     * Gets the sqryBalanceIn value for this DoQueryFreeResourceRatingReq.
     * 
     * @return sqryBalanceIn
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryBalance getSqryBalanceIn() {
        return sqryBalanceIn;
    }


    /**
     * Sets the sqryBalanceIn value for this DoQueryFreeResourceRatingReq.
     * 
     * @param sqryBalanceIn
     */
    public void setSqryBalanceIn(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryBalance sqryBalanceIn) {
        this.sqryBalanceIn = sqryBalanceIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryFreeResourceRatingReq)) return false;
        DoQueryFreeResourceRatingReq other = (DoQueryFreeResourceRatingReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqryBalanceIn==null && other.getSqryBalanceIn()==null) || 
             (this.sqryBalanceIn!=null &&
              this.sqryBalanceIn.equals(other.getSqryBalanceIn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSqryBalanceIn() != null) {
            _hashCode += getSqryBalanceIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryFreeResourceRatingReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryFreeResourceRatingReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqryBalanceIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqryBalanceIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
