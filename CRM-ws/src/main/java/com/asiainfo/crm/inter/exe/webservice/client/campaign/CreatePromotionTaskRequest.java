/**
 * CreatePromotionTaskRequest.java
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

public class CreatePromotionTaskRequest implements Serializable {
	private CreateProRequestBody createProRequestBody;

	public CreatePromotionTaskRequest() {
	}

	public CreatePromotionTaskRequest(CreateProRequestBody createProRequestBody) {
		this.createProRequestBody = createProRequestBody;
	}

	/**
	 * Gets the createProRequestBody value for this CreatePromotionTaskRequest.
	 * 
	 * @return createProRequestBody
	 */
	public CreateProRequestBody getCreateProRequestBody() {
		return createProRequestBody;
	}

	/**
	 * Sets the createProRequestBody value for this CreatePromotionTaskRequest.
	 * 
	 * @param createProRequestBody
	 */
	public void setCreateProRequestBody(
			CreateProRequestBody createProRequestBody) {
		this.createProRequestBody = createProRequestBody;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			CreatePromotionTaskRequest.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreatePromotionTaskRequest"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("createProRequestBody");
		elemField.setXmlName(new QName("", "CreateProRequestBody"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreateProRequestBody"));
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
