/**
 * ResponseHead.java
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

public class ResponseHead implements Serializable {
	private String appKey;

	private String transactionID;

	private String reqTime;

	private String sign;

	private String tenantId;

	private String acceptChannelType;

	private String acceptChannelCode;

	public ResponseHead() {
	}

	public ResponseHead(String appKey, String transactionID, String reqTime,
			String sign, String tenantId, String acceptChannelType,
			String acceptChannelCode) {
		this.appKey = appKey;
		this.transactionID = transactionID;
		this.reqTime = reqTime;
		this.sign = sign;
		this.tenantId = tenantId;
		this.acceptChannelType = acceptChannelType;
		this.acceptChannelCode = acceptChannelCode;
	}

	/**
	 * Gets the appKey value for this ResponseHead.
	 * 
	 * @return appKey
	 */
	public String getAppKey() {
		return appKey;
	}

	/**
	 * Sets the appKey value for this ResponseHead.
	 * 
	 * @param appKey
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Gets the transactionID value for this ResponseHead.
	 * 
	 * @return transactionID
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * Sets the transactionID value for this ResponseHead.
	 * 
	 * @param transactionID
	 */
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * Gets the reqTime value for this ResponseHead.
	 * 
	 * @return reqTime
	 */
	public String getReqTime() {
		return reqTime;
	}

	/**
	 * Sets the reqTime value for this ResponseHead.
	 * 
	 * @param reqTime
	 */
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	/**
	 * Gets the sign value for this ResponseHead.
	 * 
	 * @return sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * Sets the sign value for this ResponseHead.
	 * 
	 * @param sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * Gets the tenantId value for this ResponseHead.
	 * 
	 * @return tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * Sets the tenantId value for this ResponseHead.
	 * 
	 * @param tenantId
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Gets the acceptChannelType value for this ResponseHead.
	 * 
	 * @return acceptChannelType
	 */
	public String getAcceptChannelType() {
		return acceptChannelType;
	}

	/**
	 * Sets the acceptChannelType value for this ResponseHead.
	 * 
	 * @param acceptChannelType
	 */
	public void setAcceptChannelType(String acceptChannelType) {
		this.acceptChannelType = acceptChannelType;
	}

	/**
	 * Gets the acceptChannelCode value for this ResponseHead.
	 * 
	 * @return acceptChannelCode
	 */
	public String getAcceptChannelCode() {
		return acceptChannelCode;
	}

	/**
	 * Sets the acceptChannelCode value for this ResponseHead.
	 * 
	 * @param acceptChannelCode
	 */
	public void setAcceptChannelCode(String acceptChannelCode) {
		this.acceptChannelCode = acceptChannelCode;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(ResponseHead.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"ResponseHead"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("appKey");
		elemField.setXmlName(new QName("", "AppKey"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("transactionID");
		elemField.setXmlName(new QName("", "TransactionID"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("reqTime");
		elemField.setXmlName(new QName("", "ReqTime"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("sign");
		elemField.setXmlName(new QName("", "Sign"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("tenantId");
		elemField.setXmlName(new QName("", "TenantId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptChannelType");
		elemField.setXmlName(new QName("", "AcceptChannelType"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptChannelCode");
		elemField.setXmlName(new QName("", "AcceptChannelCode"));
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
