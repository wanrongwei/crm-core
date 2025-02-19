/**
 * CheckBankAccountRequest.java
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

public class CheckBankAccountRequest  implements java.io.Serializable {
    private CheckBankAccountRequestBody requestBody;

    public CheckBankAccountRequest() {
    }

    public CheckBankAccountRequest(
           CheckBankAccountRequestBody requestBody) {
           this.requestBody = requestBody;
    }


    /**
     * Gets the requestBody value for this CheckBankAccountRequest.
     * 
     * @return requestBody
     */
    public CheckBankAccountRequestBody getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this CheckBankAccountRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(CheckBankAccountRequestBody requestBody) {
        this.requestBody = requestBody;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckBankAccountRequest)) return false;
        CheckBankAccountRequest other = (CheckBankAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestBody==null && other.getRequestBody()==null) || 
             (this.requestBody!=null &&
              this.requestBody.equals(other.getRequestBody())));
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
        if (getRequestBody() != null) {
            _hashCode += getRequestBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckBankAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountRequest"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new QName("", "RequestBody"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkBankAccountRequestBody"));
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
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
