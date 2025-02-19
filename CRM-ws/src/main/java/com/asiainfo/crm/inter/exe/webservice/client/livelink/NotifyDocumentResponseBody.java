/**
 * NotifyDocumentResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class NotifyDocumentResponseBody implements Serializable {
	private String status;

	private String message;

	public NotifyDocumentResponseBody() {
	}

	/**
	 * Gets the status value for this NotifyDocumentResponseBody.
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this NotifyDocumentResponseBody.
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the message value for this NotifyDocumentResponseBody.
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this NotifyDocumentResponseBody.
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			NotifyDocumentResponseBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/livelink",
				"NotifyDocumentResponseBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new QName("", "Status"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
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
