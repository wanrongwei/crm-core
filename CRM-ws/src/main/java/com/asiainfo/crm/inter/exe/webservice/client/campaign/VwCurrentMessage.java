/**
 * VwCurrentMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class VwCurrentMessage implements Serializable {
	private String collateralId;

	private String collateralName;

	private String messageId;

	public VwCurrentMessage() {
	}

	public VwCurrentMessage(String collateralId, String collateralName,
			String messageId) {
		this.collateralId = collateralId;
		this.collateralName = collateralName;
		this.messageId = messageId;
	}

	/**
	 * Gets the collateralId value for this VwCurrentMessage.
	 * 
	 * @return collateralId
	 */
	public String getCollateralId() {
		return collateralId;
	}

	/**
	 * Sets the collateralId value for this VwCurrentMessage.
	 * 
	 * @param collateralId
	 */
	public void setCollateralId(String collateralId) {
		this.collateralId = collateralId;
	}

	/**
	 * Gets the collateralName value for this VwCurrentMessage.
	 * 
	 * @return collateralName
	 */
	public String getCollateralName() {
		return collateralName;
	}

	/**
	 * Sets the collateralName value for this VwCurrentMessage.
	 * 
	 * @param collateralName
	 */
	public void setCollateralName(String collateralName) {
		this.collateralName = collateralName;
	}

	/**
	 * Gets the messageId value for this VwCurrentMessage.
	 * 
	 * @return messageId
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * Sets the messageId value for this VwCurrentMessage.
	 * 
	 * @param messageId
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(VwCurrentMessage.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"VwCurrentMessage"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("collateralId");
		elemField.setXmlName(new QName("", "CollateralId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("collateralName");
		elemField.setXmlName(new QName("", "CollateralName"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("messageId");
		elemField.setXmlName(new QName("", "MessageId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
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
	public static Serializer getSerializer(String mechType, Class _javaType,
			QName _xmlType) {
		return new BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType,
			Class _javaType, QName _xmlType) {
		return new BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
