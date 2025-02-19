/**
 * PortInRequestDKRequestBody.java
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

public class PortInRequestDKRequestBody  implements Serializable {
    private String orderId;

    private String customerId;

    private String customerType;

    private String ICC;

    private String currentNumberType;

    private String currentServiceOperator;

    private String currentNetworkOperator;

    private String recipientServiceOperator;

    private String recipientNetworkOperator;

    private String telephoneNumber;

    private String pointOfConnection;

    private NumberSeries[] numberSeries;

    private String requestedExecutionDate;

    private String[] comment;

    public PortInRequestDKRequestBody() {
    }

    /**
     * Gets the orderId value for this PortInRequestDKRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PortInRequestDKRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the customerId value for this PortInRequestDKRequestBody.
     * 
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this PortInRequestDKRequestBody.
     * 
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerType value for this PortInRequestDKRequestBody.
     * 
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this PortInRequestDKRequestBody.
     * 
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the ICC value for this PortInRequestDKRequestBody.
     * 
     * @return ICC
     */
    public String getICC() {
        return ICC;
    }


    /**
     * Sets the ICC value for this PortInRequestDKRequestBody.
     * 
     * @param ICC
     */
    public void setICC(String ICC) {
        this.ICC = ICC;
    }


    /**
     * Gets the currentNumberType value for this PortInRequestDKRequestBody.
     * 
     * @return currentNumberType
     */
    public String getCurrentNumberType() {
        return currentNumberType;
    }


    /**
     * Sets the currentNumberType value for this PortInRequestDKRequestBody.
     * 
     * @param currentNumberType
     */
    public void setCurrentNumberType(String currentNumberType) {
        this.currentNumberType = currentNumberType;
    }


    /**
     * Gets the currentServiceOperator value for this PortInRequestDKRequestBody.
     * 
     * @return currentServiceOperator
     */
    public String getCurrentServiceOperator() {
        return currentServiceOperator;
    }


    /**
     * Sets the currentServiceOperator value for this PortInRequestDKRequestBody.
     * 
     * @param currentServiceOperator
     */
    public void setCurrentServiceOperator(String currentServiceOperator) {
        this.currentServiceOperator = currentServiceOperator;
    }


    /**
     * Gets the currentNetworkOperator value for this PortInRequestDKRequestBody.
     * 
     * @return currentNetworkOperator
     */
    public String getCurrentNetworkOperator() {
        return currentNetworkOperator;
    }


    /**
     * Sets the currentNetworkOperator value for this PortInRequestDKRequestBody.
     * 
     * @param currentNetworkOperator
     */
    public void setCurrentNetworkOperator(String currentNetworkOperator) {
        this.currentNetworkOperator = currentNetworkOperator;
    }


    /**
     * Gets the recipientServiceOperator value for this PortInRequestDKRequestBody.
     * 
     * @return recipientServiceOperator
     */
    public String getRecipientServiceOperator() {
        return recipientServiceOperator;
    }


    /**
     * Sets the recipientServiceOperator value for this PortInRequestDKRequestBody.
     * 
     * @param recipientServiceOperator
     */
    public void setRecipientServiceOperator(String recipientServiceOperator) {
        this.recipientServiceOperator = recipientServiceOperator;
    }


    /**
     * Gets the recipientNetworkOperator value for this PortInRequestDKRequestBody.
     * 
     * @return recipientNetworkOperator
     */
    public String getRecipientNetworkOperator() {
        return recipientNetworkOperator;
    }


    /**
     * Sets the recipientNetworkOperator value for this PortInRequestDKRequestBody.
     * 
     * @param recipientNetworkOperator
     */
    public void setRecipientNetworkOperator(String recipientNetworkOperator) {
        this.recipientNetworkOperator = recipientNetworkOperator;
    }


    /**
     * Gets the telephoneNumber value for this PortInRequestDKRequestBody.
     * 
     * @return telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this PortInRequestDKRequestBody.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    /**
     * Gets the pointOfConnection value for this PortInRequestDKRequestBody.
     * 
     * @return pointOfConnection
     */
    public String getPointOfConnection() {
        return pointOfConnection;
    }


    /**
     * Sets the pointOfConnection value for this PortInRequestDKRequestBody.
     * 
     * @param pointOfConnection
     */
    public void setPointOfConnection(String pointOfConnection) {
        this.pointOfConnection = pointOfConnection;
    }


    /**
     * Gets the numberSeries value for this PortInRequestDKRequestBody.
     * 
     * @return numberSeries
     */
    public NumberSeries[] getNumberSeries() {
        return numberSeries;
    }


    /**
     * Sets the numberSeries value for this PortInRequestDKRequestBody.
     * 
     * @param numberSeries
     */
    public void setNumberSeries(NumberSeries[] numberSeries) {
        this.numberSeries = numberSeries;
    }

    public NumberSeries getNumberSeries(int i) {
        return this.numberSeries[i];
    }

    public void setNumberSeries(int i, NumberSeries value) {
        this.numberSeries[i] = value;
    }


    /**
     * Gets the requestedExecutionDate value for this PortInRequestDKRequestBody.
     * 
     * @return requestedExecutionDate
     */
    public String getRequestedExecutionDate() {
        return requestedExecutionDate;
    }


    /**
     * Sets the requestedExecutionDate value for this PortInRequestDKRequestBody.
     * 
     * @param requestedExecutionDate
     */
    public void setRequestedExecutionDate(String requestedExecutionDate) {
        this.requestedExecutionDate = requestedExecutionDate;
    }


    /**
     * Gets the comment value for this PortInRequestDKRequestBody.
     * 
     * @return comment
     */
    public String[] getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this PortInRequestDKRequestBody.
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
        new TypeDesc(PortInRequestDKRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "portInRequestDKRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new QName("", "CustomerId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new QName("", "CustomerType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ICC");
        elemField.setXmlName(new QName("", "ICC"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentNumberType");
        elemField.setXmlName(new QName("", "CurrentNumberType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("recipientServiceOperator");
        elemField.setXmlName(new QName("", "RecipientServiceOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipientNetworkOperator");
        elemField.setXmlName(new QName("", "RecipientNetworkOperator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new QName("", "TelephoneNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pointOfConnection");
        elemField.setXmlName(new QName("", "pointOfConnection"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberSeries");
        elemField.setXmlName(new QName("", "NumberSeries"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "NumberSeries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedExecutionDate");
        elemField.setXmlName(new QName("", "RequestedExecutionDate"));
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
