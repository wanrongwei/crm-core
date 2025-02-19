/**
 * CheckAgreementResponseBodyDataOperatorConract.java
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

public class CheckAgreementResponseBodyDataOperatorConract  implements Serializable {
    private String contactPhone;

    private String emal;

    private String zipCode;

    private String address;

    public CheckAgreementResponseBodyDataOperatorConract() {
    }


    /**
     * Gets the contactPhone value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @return contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the emal value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @return emal
     */
    public String getEmal() {
        return emal;
    }


    /**
     * Sets the emal value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @param emal
     */
    public void setEmal(String emal) {
        this.emal = emal;
    }


    /**
     * Gets the zipCode value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the address value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CheckAgreementResponseBodyDataOperatorConract.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckAgreementResponseBodyDataOperatorConract.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">>checkAgreementResponseBody>Data>OperatorConract"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new QName("", "ContactPhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emal");
        elemField.setXmlName(new QName("", "Emal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new QName("", "ZipCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("", "Address"));
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
