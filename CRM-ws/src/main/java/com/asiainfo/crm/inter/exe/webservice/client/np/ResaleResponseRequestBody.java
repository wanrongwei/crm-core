/**
 * ResaleResponseRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ResaleResponseRequestBody  implements Serializable {
    private String orderId;

    private String responseType;

    private String reason;

    public ResaleResponseRequestBody() {
    }

    /**
     * Gets the orderId value for this ResaleResponseRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ResaleResponseRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the responseType value for this ResaleResponseRequestBody.
     * 
     * @return responseType
     */
    public String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this ResaleResponseRequestBody.
     * 
     * @param responseType
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the reason value for this ResaleResponseRequestBody.
     * 
     * @return reason
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ResaleResponseRequestBody.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(ResaleResponseRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "resaleResponseRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseType");
        elemField.setXmlName(new QName("", "ResponseType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new QName("", "Reason"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
