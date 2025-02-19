/**
 * RegisterNetaxeptRequestBody.java
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

public class RegisterNetaxeptRequestBody implements Serializable {
	private String merchantId;

	private String token;

	private RegisterRequest request;

	public RegisterNetaxeptRequestBody() {
	}

	/**
	 * Gets the merchantId value for this RegisterNetaxeptRequestBody.
	 * 
	 * @return merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * Sets the merchantId value for this RegisterNetaxeptRequestBody.
	 * 
	 * @param merchantId
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * Gets the token value for this RegisterNetaxeptRequestBody.
	 * 
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the token value for this RegisterNetaxeptRequestBody.
	 * 
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Gets the request value for this RegisterNetaxeptRequestBody.
	 * 
	 * @return request
	 */
	public RegisterRequest getRequest() {
		return request;
	}

	/**
	 * Sets the request value for this RegisterNetaxeptRequestBody.
	 * 
	 * @param request
	 */
	public void setRequest(RegisterRequest request) {
		this.request = request;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			RegisterNetaxeptRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"RegisterNetaxeptRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("merchantId");
		elemField.setXmlName(new QName("", "merchantId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("token");
		elemField.setXmlName(new QName("", "token"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("request");
		elemField.setXmlName(new QName("", "request"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"registerRequest"));
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
