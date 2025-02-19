/**
 * GetDebitDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class GetDebitDataResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer badAgencyStatusCode;

    private java.lang.Integer anyPaymentArrangement;

    private java.lang.String colNextStepNo;

    private java.lang.String colPathCode;

    public GetDebitDataResponse() {
    }

    public GetDebitDataResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Integer badAgencyStatusCode,
           java.lang.Integer anyPaymentArrangement,
           java.lang.String colNextStepNo,
           java.lang.String colPathCode) {
        super(
            responseHead);
        this.badAgencyStatusCode = badAgencyStatusCode;
        this.anyPaymentArrangement = anyPaymentArrangement;
        this.colNextStepNo = colNextStepNo;
        this.colPathCode = colPathCode;
    }


    /**
     * Gets the badAgencyStatusCode value for this GetDebitDataResponse.
     * 
     * @return badAgencyStatusCode
     */
    public java.lang.Integer getBadAgencyStatusCode() {
        return badAgencyStatusCode;
    }


    /**
     * Sets the badAgencyStatusCode value for this GetDebitDataResponse.
     * 
     * @param badAgencyStatusCode
     */
    public void setBadAgencyStatusCode(java.lang.Integer badAgencyStatusCode) {
        this.badAgencyStatusCode = badAgencyStatusCode;
    }


    /**
     * Gets the anyPaymentArrangement value for this GetDebitDataResponse.
     * 
     * @return anyPaymentArrangement
     */
    public java.lang.Integer getAnyPaymentArrangement() {
        return anyPaymentArrangement;
    }


    /**
     * Sets the anyPaymentArrangement value for this GetDebitDataResponse.
     * 
     * @param anyPaymentArrangement
     */
    public void setAnyPaymentArrangement(java.lang.Integer anyPaymentArrangement) {
        this.anyPaymentArrangement = anyPaymentArrangement;
    }


    /**
     * Gets the colNextStepNo value for this GetDebitDataResponse.
     * 
     * @return colNextStepNo
     */
    public java.lang.String getColNextStepNo() {
        return colNextStepNo;
    }


    /**
     * Sets the colNextStepNo value for this GetDebitDataResponse.
     * 
     * @param colNextStepNo
     */
    public void setColNextStepNo(java.lang.String colNextStepNo) {
        this.colNextStepNo = colNextStepNo;
    }


    /**
     * Gets the colPathCode value for this GetDebitDataResponse.
     * 
     * @return colPathCode
     */
    public java.lang.String getColPathCode() {
        return colPathCode;
    }


    /**
     * Sets the colPathCode value for this GetDebitDataResponse.
     * 
     * @param colPathCode
     */
    public void setColPathCode(java.lang.String colPathCode) {
        this.colPathCode = colPathCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDebitDataResponse)) return false;
        GetDebitDataResponse other = (GetDebitDataResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.badAgencyStatusCode==null && other.getBadAgencyStatusCode()==null) || 
             (this.badAgencyStatusCode!=null &&
              this.badAgencyStatusCode.equals(other.getBadAgencyStatusCode()))) &&
            ((this.anyPaymentArrangement==null && other.getAnyPaymentArrangement()==null) || 
             (this.anyPaymentArrangement!=null &&
              this.anyPaymentArrangement.equals(other.getAnyPaymentArrangement()))) &&
            ((this.colNextStepNo==null && other.getColNextStepNo()==null) || 
             (this.colNextStepNo!=null &&
              this.colNextStepNo.equals(other.getColNextStepNo()))) &&
            ((this.colPathCode==null && other.getColPathCode()==null) || 
             (this.colPathCode!=null &&
              this.colPathCode.equals(other.getColPathCode())));
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
        if (getBadAgencyStatusCode() != null) {
            _hashCode += getBadAgencyStatusCode().hashCode();
        }
        if (getAnyPaymentArrangement() != null) {
            _hashCode += getAnyPaymentArrangement().hashCode();
        }
        if (getColNextStepNo() != null) {
            _hashCode += getColNextStepNo().hashCode();
        }
        if (getColPathCode() != null) {
            _hashCode += getColPathCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDebitDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "getDebitDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badAgencyStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "badAgencyStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyPaymentArrangement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyPaymentArrangement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colNextStepNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colNextStepNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colPathCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colPathCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
