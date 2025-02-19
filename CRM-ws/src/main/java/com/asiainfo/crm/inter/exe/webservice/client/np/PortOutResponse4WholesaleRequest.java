/**
 * PortOutResponse4WholesaleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PortOutResponse4WholesaleRequest  implements java.io.Serializable {
    private PortOutResponse4WholesaleRequestBody requestBody;

    public PortOutResponse4WholesaleRequest() {
    }

    public PortOutResponse4WholesaleRequest(
           PortOutResponse4WholesaleRequestBody requestBody) {
           this.requestBody = requestBody;
    }


    /**
     * Gets the requestBody value for this PortOutResponse4WholesaleRequest.
     * 
     * @return requestBody
     */
    public PortOutResponse4WholesaleRequestBody getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this PortOutResponse4WholesaleRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(PortOutResponse4WholesaleRequestBody requestBody) {
        this.requestBody = requestBody;
    }

    
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortOutResponse4WholesaleRequest.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">portOutResponse4WholesaleRequest"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new QName("", "RequestBody"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "portOutResponse4WholesaleRequestBody"));
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
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new  BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new  BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
