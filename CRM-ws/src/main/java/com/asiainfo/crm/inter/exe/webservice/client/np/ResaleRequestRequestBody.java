/**
 * ResaleRequestRequestBody.java
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

public class ResaleRequestRequestBody  implements Serializable {
    private String orderId;

    private String rangeUpdateType;

    private String range;

    private String otherOperator;

    private String currentRangeHolder;

    private String currentServiceOperator;

    private String currentNetworkOperator;

    private String portingCase;

    private String SPC;

    private String municipality;

    private String routingInfo;

    private String newNumberType;

    private String[] comment;

    public ResaleRequestRequestBody() {
    }

    /**
     * Gets the orderId value for this ResaleRequestRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ResaleRequestRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the rangeUpdateType value for this ResaleRequestRequestBody.
     * 
     * @return rangeUpdateType
     */
    public String getRangeUpdateType() {
        return rangeUpdateType;
    }


    /**
     * Sets the rangeUpdateType value for this ResaleRequestRequestBody.
     * 
     * @param rangeUpdateType
     */
    public void setRangeUpdateType(String rangeUpdateType) {
        this.rangeUpdateType = rangeUpdateType;
    }


    /**
     * Gets the range value for this ResaleRequestRequestBody.
     * 
     * @return range
     */
    public String getRange() {
        return range;
    }


    /**
     * Sets the range value for this ResaleRequestRequestBody.
     * 
     * @param range
     */
    public void setRange(String range) {
        this.range = range;
    }


    /**
     * Gets the otherOperator value for this ResaleRequestRequestBody.
     * 
     * @return otherOperator
     */
    public String getOtherOperator() {
        return otherOperator;
    }


    /**
     * Sets the otherOperator value for this ResaleRequestRequestBody.
     * 
     * @param otherOperator
     */
    public void setOtherOperator(String otherOperator) {
        this.otherOperator = otherOperator;
    }


    /**
     * Gets the currentRangeHolder value for this ResaleRequestRequestBody.
     * 
     * @return currentRangeHolder
     */
    public String getCurrentRangeHolder() {
        return currentRangeHolder;
    }


    /**
     * Sets the currentRangeHolder value for this ResaleRequestRequestBody.
     * 
     * @param currentRangeHolder
     */
    public void setCurrentRangeHolder(String currentRangeHolder) {
        this.currentRangeHolder = currentRangeHolder;
    }


    /**
     * Gets the currentServiceOperator value for this ResaleRequestRequestBody.
     * 
     * @return currentServiceOperator
     */
    public String getCurrentServiceOperator() {
        return currentServiceOperator;
    }


    /**
     * Sets the currentServiceOperator value for this ResaleRequestRequestBody.
     * 
     * @param currentServiceOperator
     */
    public void setCurrentServiceOperator(String currentServiceOperator) {
        this.currentServiceOperator = currentServiceOperator;
    }


    /**
     * Gets the currentNetworkOperator value for this ResaleRequestRequestBody.
     * 
     * @return currentNetworkOperator
     */
    public String getCurrentNetworkOperator() {
        return currentNetworkOperator;
    }


    /**
     * Sets the currentNetworkOperator value for this ResaleRequestRequestBody.
     * 
     * @param currentNetworkOperator
     */
    public void setCurrentNetworkOperator(String currentNetworkOperator) {
        this.currentNetworkOperator = currentNetworkOperator;
    }


    /**
     * Gets the portingCase value for this ResaleRequestRequestBody.
     * 
     * @return portingCase
     */
    public String getPortingCase() {
        return portingCase;
    }


    /**
     * Sets the portingCase value for this ResaleRequestRequestBody.
     * 
     * @param portingCase
     */
    public void setPortingCase(String portingCase) {
        this.portingCase = portingCase;
    }


    /**
     * Gets the SPC value for this ResaleRequestRequestBody.
     * 
     * @return SPC
     */
    public String getSPC() {
        return SPC;
    }


    /**
     * Sets the SPC value for this ResaleRequestRequestBody.
     * 
     * @param SPC
     */
    public void setSPC(String SPC) {
        this.SPC = SPC;
    }


    /**
     * Gets the municipality value for this ResaleRequestRequestBody.
     * 
     * @return municipality
     */
    public String getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this ResaleRequestRequestBody.
     * 
     * @param municipality
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }


    /**
     * Gets the routingInfo value for this ResaleRequestRequestBody.
     * 
     * @return routingInfo
     */
    public String getRoutingInfo() {
        return routingInfo;
    }


    /**
     * Sets the routingInfo value for this ResaleRequestRequestBody.
     * 
     * @param routingInfo
     */
    public void setRoutingInfo(String routingInfo) {
        this.routingInfo = routingInfo;
    }


    /**
     * Gets the newNumberType value for this ResaleRequestRequestBody.
     * 
     * @return newNumberType
     */
    public String getNewNumberType() {
        return newNumberType;
    }


    /**
     * Sets the newNumberType value for this ResaleRequestRequestBody.
     * 
     * @param newNumberType
     */
    public void setNewNumberType(String newNumberType) {
        this.newNumberType = newNumberType;
    }


    /**
     * Gets the comment value for this ResaleRequestRequestBody.
     * 
     * @return comment
     */
    public String[] getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ResaleRequestRequestBody.
     * 
     * @param comment
     */
    public void setComment(String[] comment) {
        this.comment = comment;
    }

    public String getComment(int i) {
        return this.comment[i];
    }

    public void setComment(int i, String value) {
        this.comment[i] = value;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(ResaleRequestRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "resaleRequestRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeUpdateType");
        elemField.setXmlName(new QName("", "RangeUpdateType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new QName("", "Range"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherOperator");
        elemField.setXmlName(new QName("", "OtherOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentRangeHolder");
        elemField.setXmlName(new QName("", "CurrentRangeHolder"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentServiceOperator");
        elemField.setXmlName(new QName("", "CurrentServiceOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentNetworkOperator");
        elemField.setXmlName(new QName("", "CurrentNetworkOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("portingCase");
        elemField.setXmlName(new QName("", "PortingCase"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("SPC");
        elemField.setXmlName(new QName("", "SPC"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("municipality");
        elemField.setXmlName(new QName("", "Municipality"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("routingInfo");
        elemField.setXmlName(new QName("", "RoutingInfo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newNumberType");
        elemField.setXmlName(new QName("", "NewNumberType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new QName("", "Comment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
