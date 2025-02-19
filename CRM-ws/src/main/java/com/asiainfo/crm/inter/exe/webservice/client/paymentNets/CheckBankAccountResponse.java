/**
 * CheckBankAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CheckBankAccountResponse  implements java.io.Serializable {
    private CheckBankAccountResponseBody responseBody;

    public CheckBankAccountResponse() {
    }

    public CheckBankAccountResponse(
           CheckBankAccountResponseBody responseBody) {
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseBody value for this CheckBankAccountResponse.
     * 
     * @return responseBody
     */
    public CheckBankAccountResponseBody getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this CheckBankAccountResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(CheckBankAccountResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckBankAccountResponse)) return false;
        CheckBankAccountResponse other = (CheckBankAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseBody==null && other.getResponseBody()==null) || 
             (this.responseBody!=null &&
              this.responseBody.equals(other.getResponseBody())));
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
        if (getResponseBody() != null) {
            _hashCode += getResponseBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckBankAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountResponse"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new QName("", "ResponseBody"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountResponseBody"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
