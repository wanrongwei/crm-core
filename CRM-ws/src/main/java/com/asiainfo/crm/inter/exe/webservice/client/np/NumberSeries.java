/**
 * NumberSeries.java
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

public class NumberSeries  implements Serializable {
    private String seriesStart;

    private String seriesEnd;

    public NumberSeries() {
    }

    /**
     * Gets the seriesStart value for this NumberSeries.
     * 
     * @return seriesStart
     */
    public String getSeriesStart() {
        return seriesStart;
    }


    /**
     * Sets the seriesStart value for this NumberSeries.
     * 
     * @param seriesStart
     */
    public void setSeriesStart(String seriesStart) {
        this.seriesStart = seriesStart;
    }


    /**
     * Gets the seriesEnd value for this NumberSeries.
     * 
     * @return seriesEnd
     */
    public String getSeriesEnd() {
        return seriesEnd;
    }


    /**
     * Sets the seriesEnd value for this NumberSeries.
     * 
     * @param seriesEnd
     */
    public void setSeriesEnd(String seriesEnd) {
        this.seriesEnd = seriesEnd;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(NumberSeries.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "NumberSeries"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("seriesStart");
        elemField.setXmlName(new QName("", "SeriesStart"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seriesEnd");
        elemField.setXmlName(new QName("", "SeriesEnd"));
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
