/**
 * CardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.payment;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CardInfo implements Serializable {
	private String pan;

	private String expiryDate;

	private String securityCode;

	public CardInfo() {
	}

	/**
	 * Gets the pan value for this CardInfo.
	 * 
	 * @return pan
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * Sets the pan value for this CardInfo.
	 * 
	 * @param pan
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}

	/**
	 * Gets the expiryDate value for this CardInfo.
	 * 
	 * @return expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Sets the expiryDate value for this CardInfo.
	 * 
	 * @param expiryDate
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * Gets the securityCode value for this CardInfo.
	 * 
	 * @return securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * Sets the securityCode value for this CardInfo.
	 * 
	 * @param securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(CardInfo.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "cardInfo"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("pan");
		elemField.setXmlName(new QName("", "Pan"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("expiryDate");
		elemField.setXmlName(new QName("", "ExpiryDate"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("securityCode");
		elemField.setXmlName(new QName("", "SecurityCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
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
	public static Serializer getSerializer(String mechType, Class javaType,
			QName xmlType) {
		return new BeanSerializer(javaType, xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType, Class javaType,
			QName xmlType) {
		return new BeanDeserializer(javaType, xmlType, typeDesc);
	}

}
