/**
 * DoQueryBusiSuccessResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class DoQueryBusiSuccessResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Short sts;

    private java.lang.String done_code;

    private java.lang.String so_date;

    public DoQueryBusiSuccessResponse() {
    }

    public DoQueryBusiSuccessResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           java.lang.Short sts,
           java.lang.String done_code,
           java.lang.String so_date) {
        super(
            responseHead);
        this.sts = sts;
        this.done_code = done_code;
        this.so_date = so_date;
    }


    /**
     * Gets the sts value for this DoQueryBusiSuccessResponse.
     * 
     * @return sts
     */
    public java.lang.Short getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this DoQueryBusiSuccessResponse.
     * 
     * @param sts
     */
    public void setSts(java.lang.Short sts) {
        this.sts = sts;
    }


    /**
     * Gets the done_code value for this DoQueryBusiSuccessResponse.
     * 
     * @return done_code
     */
    public java.lang.String getDone_code() {
        return done_code;
    }


    /**
     * Sets the done_code value for this DoQueryBusiSuccessResponse.
     * 
     * @param done_code
     */
    public void setDone_code(java.lang.String done_code) {
        this.done_code = done_code;
    }


    /**
     * Gets the so_date value for this DoQueryBusiSuccessResponse.
     * 
     * @return so_date
     */
    public java.lang.String getSo_date() {
        return so_date;
    }


    /**
     * Sets the so_date value for this DoQueryBusiSuccessResponse.
     * 
     * @param so_date
     */
    public void setSo_date(java.lang.String so_date) {
        this.so_date = so_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoQueryBusiSuccessResponse)) return false;
        DoQueryBusiSuccessResponse other = (DoQueryBusiSuccessResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.done_code==null && other.getDone_code()==null) || 
             (this.done_code!=null &&
              this.done_code.equals(other.getDone_code()))) &&
            ((this.so_date==null && other.getSo_date()==null) || 
             (this.so_date!=null &&
              this.so_date.equals(other.getSo_date())));
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
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getDone_code() != null) {
            _hashCode += getDone_code().hashCode();
        }
        if (getSo_date() != null) {
            _hashCode += getSo_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryBusiSuccessResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBusiSuccessResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("done_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "done_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("so_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "so_date"));
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
