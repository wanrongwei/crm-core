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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}TelephoneServiceTypeCode"/>
 *         &lt;element ref="{}TelephoneSpecificUsageCode" minOccurs="0"/>
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
    "telephoneServiceTypeCode",
    "telephoneSpecificUsageCode"
})
@XmlRootElement(name = "SpecialInfo")
public class SpecialInfo {

    @XmlElement(name = "TelephoneServiceTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String telephoneServiceTypeCode;
    @XmlElement(name = "TelephoneSpecificUsageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String telephoneSpecificUsageCode;

    /**
     * Gets the value of the telephoneServiceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneServiceTypeCode() {
        return telephoneServiceTypeCode;
    }

    /**
     * Sets the value of the telephoneServiceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneServiceTypeCode(String value) {
        this.telephoneServiceTypeCode = value;
    }

    /**
     * Gets the value of the telephoneSpecificUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneSpecificUsageCode() {
        return telephoneSpecificUsageCode;
    }

    /**
     * Sets the value of the telephoneSpecificUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneSpecificUsageCode(String value) {
        this.telephoneSpecificUsageCode = value;
    }

}
