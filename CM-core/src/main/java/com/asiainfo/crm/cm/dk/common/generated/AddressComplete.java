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
 *         &lt;element ref="{}AddressAccess"/>
 *         &lt;element ref="{}AddressPostal"/>
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
    "addressAccess",
    "addressPostal"
})
@XmlRootElement(name = "AddressComplete")
public class AddressComplete {

    @XmlElement(name = "AddressAccess", required = true)
    protected AddressAccess addressAccess;
    @XmlElement(name = "AddressPostal", required = true)
    protected AddressPostal addressPostal;

    /**
     * Gets the value of the addressAccess property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAccess }
     *     
     */
    public AddressAccess getAddressAccess() {
        return addressAccess;
    }

    /**
     * Sets the value of the addressAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAccess }
     *     
     */
    public void setAddressAccess(AddressAccess value) {
        this.addressAccess = value;
    }

    /**
     * Gets the value of the addressPostal property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPostal }
     *     
     */
    public AddressPostal getAddressPostal() {
        return addressPostal;
    }

    /**
     * Sets the value of the addressPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPostal }
     *     
     */
    public void setAddressPostal(AddressPostal value) {
        this.addressPostal = value;
    }

}
