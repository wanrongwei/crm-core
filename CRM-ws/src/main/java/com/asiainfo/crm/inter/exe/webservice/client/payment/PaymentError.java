/**
 * PaymentError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.payment;

import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.Deserializer;
import javax.xml.rpc.encoding.Serializer;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaymentError implements java.io.Serializable {
	private Calendar dateTime;

	private String operation;

	private String responseCode;

	private String responseSource;

	private String responseText;

	public PaymentError() {
	}

	/**
	 * Gets the dateTime value for this PaymentError.
	 * 
	 * @return dateTime
	 */
	public Calendar getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the dateTime value for this PaymentError.
	 * 
	 * @param dateTime
	 */
	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Gets the operation value for this PaymentError.
	 * 
	 * @return operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this PaymentError.
	 * 
	 * @param operation
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * Gets the responseCode value for this PaymentError.
	 * 
	 * @return responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * Sets the responseCode value for this PaymentError.
	 * 
	 * @param responseCode
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * Gets the responseSource value for this PaymentError.
	 * 
	 * @return responseSource
	 */
	public String getResponseSource() {
		return responseSource;
	}

	/**
	 * Sets the responseSource value for this PaymentError.
	 * 
	 * @param responseSource
	 */
	public void setResponseSource(String responseSource) {
		this.responseSource = responseSource;
	}

	/**
	 * Gets the responseText value for this PaymentError.
	 * 
	 * @return responseText
	 */
	public String getResponseText() {
		return responseText;
	}

	/**
	 * Sets the responseText value for this PaymentError.
	 * 
	 * @param responseText
	 */
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(PaymentError.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "paymentError"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("dateTime");
		elemField.setXmlName(new QName("", "DateTime"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("operation");
		elemField.setXmlName(new QName("", "Operation"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("responseCode");
		elemField.setXmlName(new QName("", "ResponseCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("responseSource");
		elemField.setXmlName(new QName("", "ResponseSource"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("responseText");
		elemField.setXmlName(new QName("", "ResponseText"));
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
