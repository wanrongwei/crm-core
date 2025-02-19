/**
 * ModConfirmDateRequestBody.java
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

public class ModConfirmDateRequestBody  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String orderId;

    private java.lang.String telephoneNumber;

    private java.lang.String newConfrimDate;

    private java.lang.String confirmationStatus;

    public ModConfirmDateRequestBody() {
    }


    /**
     * Gets the countryCode value for this ModConfirmDateRequestBody.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ModConfirmDateRequestBody.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the orderId value for this ModConfirmDateRequestBody.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ModConfirmDateRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the telephoneNumber value for this ModConfirmDateRequestBody.
     * 
     * @return telephoneNumber
     */
    public java.lang.String getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this ModConfirmDateRequestBody.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(java.lang.String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    /**
     * Gets the newConfrimDate value for this ModConfirmDateRequestBody.
     * 
     * @return newConfrimDate
     */
    public java.lang.String getNewConfrimDate() {
        return newConfrimDate;
    }


    /**
     * Sets the newConfrimDate value for this ModConfirmDateRequestBody.
     * 
     * @param newConfrimDate
     */
    public void setNewConfrimDate(java.lang.String newConfrimDate) {
        this.newConfrimDate = newConfrimDate;
    }


    /**
     * Gets the confirmationStatus value for this ModConfirmDateRequestBody.
     * 
     * @return confirmationStatus
     */
    public java.lang.String getConfirmationStatus() {
        return confirmationStatus;
    }


    /**
     * Sets the confirmationStatus value for this ModConfirmDateRequestBody.
     * 
     * @param confirmationStatus
     */
    public void setConfirmationStatus(java.lang.String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    private static TypeDesc typeDesc =
        new TypeDesc(ModConfirmDateRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "modConfirmDateRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new QName("", "CountryCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
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
        elemField.setFieldName("newConfrimDate");
        elemField.setXmlName(new QName("", "NewConfrimDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("confirmationStatus");
        elemField.setXmlName(new QName("", "ConfirmationStatus"));
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
           java.lang.String mechType, 
           java.lang.Class javaType,  
           QName xmlType) {
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
           QName xmlType) {
        return 
          new  BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
