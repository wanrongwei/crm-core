/**
 * ResponseBody.java
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

public class ResponseBody  implements Serializable {
    private String newElement;

    public ResponseBody() {
    }


    /**
     * Gets the newElement value for this ResponseBody.
     * 
     * @return newElement
     */
    public String getNewElement() {
        return newElement;
    }


    /**
     * Sets the newElement value for this ResponseBody.
     * 
     * @param newElement
     */
    public void setNewElement(String newElement) {
        this.newElement = newElement;
    }


    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(ResponseBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "ResponseBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("newElement");
        elemField.setXmlName(new QName("", "NewElement"));
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
