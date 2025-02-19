/**
 * QueryNetaxeptRequestBody.java
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

public class QueryNetaxeptRequestBody implements java.io.Serializable {
	private String merchantId;

	private String token;

	private NetaxeptQueryRequest request;

	public QueryNetaxeptRequestBody() {
	}

	/**
	 * Gets the merchantId value for this QueryNetaxeptRequestBody.
	 * 
	 * @return merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * Sets the merchantId value for this QueryNetaxeptRequestBody.
	 * 
	 * @param merchantId
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * Gets the token value for this QueryNetaxeptRequestBody.
	 * 
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the token value for this QueryNetaxeptRequestBody.
	 * 
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Gets the request value for this QueryNetaxeptRequestBody.
	 * 
	 * @return request
	 */
	public NetaxeptQueryRequest getRequest() {
		return request;
	}

	/**
	 * Sets the request value for this QueryNetaxeptRequestBody.
	 * 
	 * @param request
	 */
	public void setRequest(NetaxeptQueryRequest request) {
		this.request = request;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			QueryNetaxeptRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"QueryNetaxeptRequestBody"));
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
				"netaxeptQueryRequest"));
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
