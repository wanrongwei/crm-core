/**
 * PaymentMethodAction.java
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

public class PaymentMethodAction implements Serializable {
	private String action;

	private String bin;

	private String cardOrigin;

	private String cardType;

	private String fee;

	private String name;

	private String paymentMethod;

	public PaymentMethodAction() {
	}

	/**
	 * Gets the action value for this PaymentMethodAction.
	 * 
	 * @return action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Sets the action value for this PaymentMethodAction.
	 * 
	 * @param action
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Gets the bin value for this PaymentMethodAction.
	 * 
	 * @return bin
	 */
	public String getBin() {
		return bin;
	}

	/**
	 * Sets the bin value for this PaymentMethodAction.
	 * 
	 * @param bin
	 */
	public void setBin(String bin) {
		this.bin = bin;
	}

	/**
	 * Gets the cardOrigin value for this PaymentMethodAction.
	 * 
	 * @return cardOrigin
	 */
	public String getCardOrigin() {
		return cardOrigin;
	}

	/**
	 * Sets the cardOrigin value for this PaymentMethodAction.
	 * 
	 * @param cardOrigin
	 */
	public void setCardOrigin(String cardOrigin) {
		this.cardOrigin = cardOrigin;
	}

	/**
	 * Gets the cardType value for this PaymentMethodAction.
	 * 
	 * @return cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * Sets the cardType value for this PaymentMethodAction.
	 * 
	 * @param cardType
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * Gets the fee value for this PaymentMethodAction.
	 * 
	 * @return fee
	 */
	public String getFee() {
		return fee;
	}

	/**
	 * Sets the fee value for this PaymentMethodAction.
	 * 
	 * @param fee
	 */
	public void setFee(String fee) {
		this.fee = fee;
	}

	/**
	 * Gets the name value for this PaymentMethodAction.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name value for this PaymentMethodAction.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the paymentMethod value for this PaymentMethodAction.
	 * 
	 * @return paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Sets the paymentMethod value for this PaymentMethodAction.
	 * 
	 * @param paymentMethod
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(PaymentMethodAction.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"paymentMethodAction"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("action");
		elemField.setXmlName(new QName("", "Action"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("bin");
		elemField.setXmlName(new QName("", "Bin"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("cardOrigin");
		elemField.setXmlName(new QName("", "CardOrigin"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("cardType");
		elemField.setXmlName(new QName("", "CardType"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("fee");
		elemField.setXmlName(new QName("", "Fee"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new QName("", "Name"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("paymentMethod");
		elemField.setXmlName(new QName("", "PaymentMethod"));
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
