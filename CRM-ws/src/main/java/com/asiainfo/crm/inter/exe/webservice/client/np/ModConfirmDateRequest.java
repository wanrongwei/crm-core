/**
 * ModConfirmDateRequest.java
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

public class ModConfirmDateRequest  implements Serializable {
    private ModConfirmDateRequestBody requestBody;

    public ModConfirmDateRequest() {
    }

    /**
     * Gets the requestBody value for this ModConfirmDateRequest.
     * 
     * @return requestBody
     */
    public ModConfirmDateRequestBody getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this ModConfirmDateRequest.
     * 
     * @param requestBody
     */
    public void setRequestBody(ModConfirmDateRequestBody requestBody) {
        this.requestBody = requestBody;
    }
    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(ModConfirmDateRequest.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">modConfirmDateRequest"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new QName("", "RequestBody"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "modConfirmDateRequestBody"));
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
