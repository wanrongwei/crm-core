/**
 * DoDealApproveResponseReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoDealApproveResponseReq  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SApproveResult approveResult;

    public DoDealApproveResponseReq() {
    }

    public DoDealApproveResponseReq(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SApproveResult approveResult) {
           this.approveResult = approveResult;
    }


    /**
     * Gets the approveResult value for this DoDealApproveResponseReq.
     * 
     * @return approveResult
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SApproveResult getApproveResult() {
        return approveResult;
    }


    /**
     * Sets the approveResult value for this DoDealApproveResponseReq.
     * 
     * @param approveResult
     */
    public void setApproveResult(com.asiainfo.crm.cm.dk.ws.imswrapservice.SApproveResult approveResult) {
        this.approveResult = approveResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoDealApproveResponseReq)) return false;
        DoDealApproveResponseReq other = (DoDealApproveResponseReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approveResult==null && other.getApproveResult()==null) || 
             (this.approveResult!=null &&
              this.approveResult.equals(other.getApproveResult())));
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
        if (getApproveResult() != null) {
            _hashCode += getApproveResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoDealApproveResponseReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDealApproveResponseReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approveResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sApproveResult"));
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
