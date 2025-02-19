//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.18 时间 10:37:40 AM CST 
//


package com.asiainfo.crm.cm.common.util.ws.hu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISTRICT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STREET_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STREET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOUSE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDITIONAL_HOUSE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_VALIDATED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IS_BLACKLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUGGESTIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOUNDEXVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="START_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAGE_SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "country",
    "districtid",
    "zipcode",
    "city",
    "streetname",
    "streettype",
    "housenumber",
    "additionalhousenumber",
    "isvalidated",
    "source",
    "isblacklist",
    "suggestiontype",
    "soundexval",
    "startindex",
    "pagesize"
})
@XmlRootElement(name = "root")
public class AddressInfo {

    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "DISTRICT_ID")
    protected String districtid;
    @XmlElement(name = "ZIPCODE")
    protected String zipcode;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STREET_NAME")
    protected String streetname;
    @XmlElement(name = "STREET_TYPE")
    protected String streettype;
    @XmlElement(name = "HOUSE_NUMBER")
    protected String housenumber;
    @XmlElement(name = "ADDITIONAL_HOUSE_NUMBER")
    protected String additionalhousenumber;
    @XmlElement(name = "IS_VALIDATED")
    protected String isvalidated;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "IS_BLACKLIST")
    protected String isblacklist;
    @XmlElement(name = "SUGGESTIONTYPE")
    protected String suggestiontype;
    @XmlElement(name = "SOUNDEXVAL")
    protected String soundexval;
    @XmlElement(name = "START_INDEX")
    protected String startindex;
    @XmlElement(name = "PAGE_SIZE")
    protected String pagesize;

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * 获取districtid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRICTID() {
        return districtid;
    }

    /**
     * 设置districtid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRICTID(String value) {
        this.districtid = value;
    }

    /**
     * 获取zipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPCODE() {
        return zipcode;
    }

    /**
     * 设置zipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPCODE(String value) {
        this.zipcode = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * 获取streetname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREETNAME() {
        return streetname;
    }

    /**
     * 设置streetname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREETNAME(String value) {
        this.streetname = value;
    }

    /**
     * 获取streettype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREETTYPE() {
        return streettype;
    }

    /**
     * 设置streettype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREETTYPE(String value) {
        this.streettype = value;
    }

    /**
     * 获取housenumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSENUMBER() {
        return housenumber;
    }

    /**
     * 设置housenumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOUSENUMBER(String value) {
        this.housenumber = value;
    }

    /**
     * 获取additionalhousenumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDITIONALHOUSENUMBER() {
        return additionalhousenumber;
    }

    /**
     * 设置additionalhousenumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDITIONALHOUSENUMBER(String value) {
        this.additionalhousenumber = value;
    }

    /**
     * 获取isvalidated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISVALIDATED() {
        return isvalidated;
    }

    /**
     * 设置isvalidated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISVALIDATED(String value) {
        this.isvalidated = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * 获取isblacklist属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBLACKLIST() {
        return isblacklist;
    }

    /**
     * 设置isblacklist属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBLACKLIST(String value) {
        this.isblacklist = value;
    }

    /**
     * 获取suggestiontype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUGGESTIONTYPE() {
        return suggestiontype;
    }

    /**
     * 设置suggestiontype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUGGESTIONTYPE(String value) {
        this.suggestiontype = value;
    }

    /**
     * 获取soundexval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOUNDEXVAL() {
        return soundexval;
    }

    /**
     * 设置soundexval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOUNDEXVAL(String value) {
        this.soundexval = value;
    }

    /**
     * 获取startindex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTINDEX() {
        return startindex;
    }

    /**
     * 设置startindex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTINDEX(String value) {
        this.startindex = value;
    }

    /**
     * 获取pagesize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGESIZE() {
        return pagesize;
    }

    /**
     * 设置pagesize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGESIZE(String value) {
        this.pagesize = value;
    }

}
