/**
 * DnBNorDirectPayment.java
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

public class DnBNorDirectPayment implements Serializable {
	private String toAccount;

	private String KID;

	private String message;

	public DnBNorDirectPayment() {
	}

	/**
	 * Gets the toAccount value for this DnBNorDirectPayment.
	 * 
	 * @return toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}

	/**
	 * Sets the toAccount value for this DnBNorDirectPayment.
	 * 
	 * @param toAccount
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	/**
	 * Gets the KID value for this DnBNorDirectPayment.
	 * 
	 * @return KID
	 */
	public String getKID() {
		return KID;
	}

	/**
	 * Sets the KID value for this DnBNorDirectPayment.
	 * 
	 * @param KID
	 */
	public void setKID(String KID) {
		this.KID = KID;
	}

	/**
	 * Gets the message value for this DnBNorDirectPayment.
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this DnBNorDirectPayment.
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(DnBNorDirectPayment.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"dnBNorDirectPayment"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("toAccount");
		elemField.setXmlName(new QName("", "ToAccount"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("KID");
		elemField.setXmlName(new QName("", "KID"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("message");
		elemField.setXmlName(new QName("", "Message"));
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
