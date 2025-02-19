/**
 * CommonResponse.java
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

public class CommonResponse  implements Serializable {
    private ResponseBody responseBody;

    public CommonResponse() {
    }

    /**
     * Gets the responseBody value for this CommonResponse.
     * 
     * @return responseBody
     */
    public ResponseBody getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this CommonResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(ResponseBody responseBody) {
        this.responseBody = responseBody;
    }



    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CommonResponse.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "CommonResponse"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new QName("", "ResponseBody"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseBody"));
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
