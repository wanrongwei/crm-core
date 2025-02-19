/**
 * CheckAgreementRequestBody.java
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

public class CheckAgreementRequestBody  implements Serializable {
   
    private String countryCode;

    private String telephoneNumber;

    private String customerType;

    public CheckAgreementRequestBody() {
    }

    /**
     * Gets the countryCode value for this CheckAgreementRequestBody.
     * 
     * @return countryCode   * 
     */
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CheckAgreementRequestBody.
     * 
     * @param countryCode   *
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the telephoneNumber value for this CheckAgreementRequestBody.
     * 
     * @return telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this CheckAgreementRequestBody.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    /**
     * Gets the customerType value for this CheckAgreementRequestBody.
     * 
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this CheckAgreementRequestBody.
     * 
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

   
    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckAgreementRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "checkAgreementRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new QName("", "CountryCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new QName("", "TelephoneNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new QName("", "CustomerType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
