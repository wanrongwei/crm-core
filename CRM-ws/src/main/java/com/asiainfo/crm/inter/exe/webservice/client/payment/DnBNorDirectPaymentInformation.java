/**
 * DnBNorDirectPaymentInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.payment;

import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.Deserializer;
import javax.xml.rpc.encoding.Serializer;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DnBNorDirectPaymentInformation implements java.io.Serializable {
	private String bankRef;

	private String fromAccount;

	private String KID;

	private String message;

	private String toAccount;

	public DnBNorDirectPaymentInformation() {
	}

	/**
	 * Gets the bankRef value for this DnBNorDirectPaymentInformation.
	 * 
	 * @return bankRef
	 */
	public String getBankRef() {
		return bankRef;
	}

	/**
	 * Sets the bankRef value for this DnBNorDirectPaymentInformation.
	 * 
	 * @param bankRef
	 */
	public void setBankRef(String bankRef) {
		this.bankRef = bankRef;
	}

	/**
	 * Gets the fromAccount value for this DnBNorDirectPaymentInformation.
	 * 
	 * @return fromAccount
	 */
	public String getFromAccount() {
		return fromAccount;
	}

	/**
	 * Sets the fromAccount value for this DnBNorDirectPaymentInformation.
	 * 
	 * @param fromAccount
	 */
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	/**
	 * Gets the KID value for this DnBNorDirectPaymentInformation.
	 * 
	 * @return KID
	 */
	public String getKID() {
		return KID;
	}

	/**
	 * Sets the KID value for this DnBNorDirectPaymentInformation.
	 * 
	 * @param KID
	 */
	public void setKID(String KID) {
		this.KID = KID;
	}

	/**
	 * Gets the message value for this DnBNorDirectPaymentInformation.
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this DnBNorDirectPaymentInformation.
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the toAccount value for this DnBNorDirectPaymentInformation.
	 * 
	 * @return toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}

	/**
	 * Sets the toAccount value for this DnBNorDirectPaymentInformation.
	 * 
	 * @param toAccount
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			DnBNorDirectPaymentInformation.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"dnBNorDirectPaymentInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("bankRef");
		elemField.setXmlName(new QName("", "BankRef"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("fromAccount");
		elemField.setXmlName(new QName("", "FromAccount"));
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
		elemField = new ElementDesc();
		elemField.setFieldName("toAccount");
		elemField.setXmlName(new QName("", "ToAccount"));
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
