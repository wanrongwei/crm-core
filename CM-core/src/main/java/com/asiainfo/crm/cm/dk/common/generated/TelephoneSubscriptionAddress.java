//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.15 at 10:45:24 ���� CST 
//


package com.asiainfo.crm.cm.dk.common.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AddressComplete"/>
 *         &lt;element ref="{}SecondaryPostalLabel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressComplete",
    "secondaryPostalLabel"
})
@XmlRootElement(name = "TelephoneSubscriptionAddress")
public class TelephoneSubscriptionAddress {

    @XmlElement(name = "AddressComplete", required = true)
    protected AddressComplete addressComplete;
    @XmlElement(name = "SecondaryPostalLabel", required = true)
    protected SecondaryPostalLabel secondaryPostalLabel;

    /**
     * Gets the value of the addressComplete property.
     * 
     * @return
     *     possible object is
     *     {@link AddressComplete }
     *     
     */
    public AddressComplete getAddressComplete() {
        return addressComplete;
    }

    /**
     * Sets the value of the addressComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressComplete }
     *     
     */
    public void setAddressComplete(AddressComplete value) {
        this.addressComplete = value;
    }

    /**
     * Gets the value of the secondaryPostalLabel property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryPostalLabel }
     *     
     */
    public SecondaryPostalLabel getSecondaryPostalLabel() {
        return secondaryPostalLabel;
    }

    /**
     * Sets the value of the secondaryPostalLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryPostalLabel }
     *     
     */
    public void setSecondaryPostalLabel(SecondaryPostalLabel value) {
        this.secondaryPostalLabel = value;
    }

}
