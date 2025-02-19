/**
 * CreatePromotionTaskResponse.java
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

public class CreatePromotionTaskResponse implements Serializable {
	private CreateProResponseBody createProResponseBody;

	private ResponseHead responseHead;

	public CreatePromotionTaskResponse() {
	}

	public CreatePromotionTaskResponse(
			CreateProResponseBody createProResponseBody,
			ResponseHead responseHead) {
		this.createProResponseBody = createProResponseBody;
		this.responseHead = responseHead;
	}

	/**
	 * Gets the createProResponseBody value for this
	 * CreatePromotionTaskResponse.
	 * 
	 * @return createProResponseBody
	 */
	public CreateProResponseBody getCreateProResponseBody() {
		return createProResponseBody;
	}

	/**
	 * Sets the createProResponseBody value for this
	 * CreatePromotionTaskResponse.
	 * 
	 * @param createProResponseBody
	 */
	public void setCreateProResponseBody(
			CreateProResponseBody createProResponseBody) {
		this.createProResponseBody = createProResponseBody;
	}

	/**
	 * Gets the responseHead value for this CreatePromotionTaskResponse.
	 * 
	 * @return responseHead
	 */
	public ResponseHead getResponseHead() {
		return responseHead;
	}

	/**
	 * Sets the responseHead value for this CreatePromotionTaskResponse.
	 * 
	 * @param responseHead
	 */
	public void setResponseHead(ResponseHead responseHead) {
		this.responseHead = responseHead;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			CreatePromotionTaskResponse.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreatePromotionTaskResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createProResponseBody");
		elemField.setXmlName(new QName("", "CreateProResponseBody"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreateProResponseBody"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("responseHead");
		elemField.setXmlName(new QName("", "ResponseHead"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"ResponseHead"));
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
