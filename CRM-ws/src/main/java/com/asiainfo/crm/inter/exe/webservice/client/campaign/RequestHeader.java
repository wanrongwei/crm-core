/**
 * RequestHeader.java
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

public class RequestHeader implements Serializable {
	private String appKey;

	private String transactionID;

	private String reqTime;

	private String format;

	private String sign;

	private String accessToken;

	private String version;

	private String tenantId;

	private String acceptProvCode;

	private String acceptRegionCode;

	private String acceptChannelType;

	private String acceptChannelCode;

	private String acceptOrgId;

	private Integer operatorCode;

	private String acceptStaffId;

	private String acceptOpId;

	private String chargeFlag;

	private String notifyFlag;

	private String dstSysID;

	public RequestHeader() {
	}

	public RequestHeader(String appKey, String transactionID, String reqTime,
			String format, String sign, String accessToken, String version,
			String tenantId, String acceptProvCode, String acceptRegionCode,
			String acceptChannelType, String acceptChannelCode,
			String acceptOrgId, Integer operatorCode, String acceptStaffId,
			String acceptOpId, String chargeFlag, String notifyFlag,
			String dstSysID) {
		this.appKey = appKey;
		this.transactionID = transactionID;
		this.reqTime = reqTime;
		this.format = format;
		this.sign = sign;
		this.accessToken = accessToken;
		this.version = version;
		this.tenantId = tenantId;
		this.acceptProvCode = acceptProvCode;
		this.acceptRegionCode = acceptRegionCode;
		this.acceptChannelType = acceptChannelType;
		this.acceptChannelCode = acceptChannelCode;
		this.acceptOrgId = acceptOrgId;
		this.operatorCode = operatorCode;
		this.acceptStaffId = acceptStaffId;
		this.acceptOpId = acceptOpId;
		this.chargeFlag = chargeFlag;
		this.notifyFlag = notifyFlag;
		this.dstSysID = dstSysID;
	}

	/**
	 * Gets the appKey value for this RequestHeader.
	 * 
	 * @return appKey
	 */
	public String getAppKey() {
		return appKey;
	}

	/**
	 * Sets the appKey value for this RequestHeader.
	 * 
	 * @param appKey
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Gets the transactionID value for this RequestHeader.
	 * 
	 * @return transactionID
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * Sets the transactionID value for this RequestHeader.
	 * 
	 * @param transactionID
	 */
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * Gets the reqTime value for this RequestHeader.
	 * 
	 * @return reqTime
	 */
	public String getReqTime() {
		return reqTime;
	}

	/**
	 * Sets the reqTime value for this RequestHeader.
	 * 
	 * @param reqTime
	 */
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}

	/**
	 * Gets the format value for this RequestHeader.
	 * 
	 * @return format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Sets the format value for this RequestHeader.
	 * 
	 * @param format
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * Gets the sign value for this RequestHeader.
	 * 
	 * @return sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * Sets the sign value for this RequestHeader.
	 * 
	 * @param sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * Gets the accessToken value for this RequestHeader.
	 * 
	 * @return accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * Sets the accessToken value for this RequestHeader.
	 * 
	 * @param accessToken
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * Gets the version value for this RequestHeader.
	 * 
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this RequestHeader.
	 * 
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the tenantId value for this RequestHeader.
	 * 
	 * @return tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * Sets the tenantId value for this RequestHeader.
	 * 
	 * @param tenantId
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Gets the acceptProvCode value for this RequestHeader.
	 * 
	 * @return acceptProvCode
	 */
	public String getAcceptProvCode() {
		return acceptProvCode;
	}

	/**
	 * Sets the acceptProvCode value for this RequestHeader.
	 * 
	 * @param acceptProvCode
	 */
	public void setAcceptProvCode(String acceptProvCode) {
		this.acceptProvCode = acceptProvCode;
	}

	/**
	 * Gets the acceptRegionCode value for this RequestHeader.
	 * 
	 * @return acceptRegionCode
	 */
	public String getAcceptRegionCode() {
		return acceptRegionCode;
	}

	/**
	 * Sets the acceptRegionCode value for this RequestHeader.
	 * 
	 * @param acceptRegionCode
	 */
	public void setAcceptRegionCode(String acceptRegionCode) {
		this.acceptRegionCode = acceptRegionCode;
	}

	/**
	 * Gets the acceptChannelType value for this RequestHeader.
	 * 
	 * @return acceptChannelType
	 */
	public String getAcceptChannelType() {
		return acceptChannelType;
	}

	/**
	 * Sets the acceptChannelType value for this RequestHeader.
	 * 
	 * @param acceptChannelType
	 */
	public void setAcceptChannelType(String acceptChannelType) {
		this.acceptChannelType = acceptChannelType;
	}

	/**
	 * Gets the acceptChannelCode value for this RequestHeader.
	 * 
	 * @return acceptChannelCode
	 */
	public String getAcceptChannelCode() {
		return acceptChannelCode;
	}

	/**
	 * Sets the acceptChannelCode value for this RequestHeader.
	 * 
	 * @param acceptChannelCode
	 */
	public void setAcceptChannelCode(String acceptChannelCode) {
		this.acceptChannelCode = acceptChannelCode;
	}

	/**
	 * Gets the acceptOrgId value for this RequestHeader.
	 * 
	 * @return acceptOrgId
	 */
	public String getAcceptOrgId() {
		return acceptOrgId;
	}

	/**
	 * Sets the acceptOrgId value for this RequestHeader.
	 * 
	 * @param acceptOrgId
	 */
	public void setAcceptOrgId(String acceptOrgId) {
		this.acceptOrgId = acceptOrgId;
	}

	/**
	 * Gets the operatorCode value for this RequestHeader.
	 * 
	 * @return operatorCode
	 */
	public Integer getOperatorCode() {
		return operatorCode;
	}

	/**
	 * Sets the operatorCode value for this RequestHeader.
	 * 
	 * @param operatorCode
	 */
	public void setOperatorCode(Integer operatorCode) {
		this.operatorCode = operatorCode;
	}

	/**
	 * Gets the acceptStaffId value for this RequestHeader.
	 * 
	 * @return acceptStaffId
	 */
	public String getAcceptStaffId() {
		return acceptStaffId;
	}

	/**
	 * Sets the acceptStaffId value for this RequestHeader.
	 * 
	 * @param acceptStaffId
	 */
	public void setAcceptStaffId(String acceptStaffId) {
		this.acceptStaffId = acceptStaffId;
	}

	/**
	 * Gets the acceptOpId value for this RequestHeader.
	 * 
	 * @return acceptOpId
	 */
	public String getAcceptOpId() {
		return acceptOpId;
	}

	/**
	 * Sets the acceptOpId value for this RequestHeader.
	 * 
	 * @param acceptOpId
	 */
	public void setAcceptOpId(String acceptOpId) {
		this.acceptOpId = acceptOpId;
	}

	/**
	 * Gets the chargeFlag value for this RequestHeader.
	 * 
	 * @return chargeFlag
	 */
	public String getChargeFlag() {
		return chargeFlag;
	}

	/**
	 * Sets the chargeFlag value for this RequestHeader.
	 * 
	 * @param chargeFlag
	 */
	public void setChargeFlag(String chargeFlag) {
		this.chargeFlag = chargeFlag;
	}

	/**
	 * Gets the notifyFlag value for this RequestHeader.
	 * 
	 * @return notifyFlag
	 */
	public String getNotifyFlag() {
		return notifyFlag;
	}

	/**
	 * Sets the notifyFlag value for this RequestHeader.
	 * 
	 * @param notifyFlag
	 */
	public void setNotifyFlag(String notifyFlag) {
		this.notifyFlag = notifyFlag;
	}

	/**
	 * Gets the dstSysID value for this RequestHeader.
	 * 
	 * @return dstSysID
	 */
	public String getDstSysID() {
		return dstSysID;
	}

	/**
	 * Sets the dstSysID value for this RequestHeader.
	 * 
	 * @param dstSysID
	 */
	public void setDstSysID(String dstSysID) {
		this.dstSysID = dstSysID;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(RequestHeader.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/common",
				"RequestHeader"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("appKey");
		elemField.setXmlName(new QName("", "AppKey"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("transactionID");
		elemField.setXmlName(new QName("", "TransactionID"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("reqTime");
		elemField.setXmlName(new QName("", "ReqTime"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("format");
		elemField.setXmlName(new QName("", "Format"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("sign");
		elemField.setXmlName(new QName("", "Sign"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("accessToken");
		elemField.setXmlName(new QName("", "AccessToken"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new QName("", "Version"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("tenantId");
		elemField.setXmlName(new QName("", "TenantId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptProvCode");
		elemField.setXmlName(new QName("", "AcceptProvCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptRegionCode");
		elemField.setXmlName(new QName("", "AcceptRegionCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptChannelType");
		elemField.setXmlName(new QName("", "AcceptChannelType"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptChannelCode");
		elemField.setXmlName(new QName("", "AcceptChannelCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptOrgId");
		elemField.setXmlName(new QName("", "AcceptOrgId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("operatorCode");
		elemField.setXmlName(new QName("", "OperatorCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptStaffId");
		elemField.setXmlName(new QName("", "AcceptStaffId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("acceptOpId");
		elemField.setXmlName(new QName("", "AcceptOpId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("chargeFlag");
		elemField.setXmlName(new QName("", "ChargeFlag"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("notifyFlag");
		elemField.setXmlName(new QName("", "NotifyFlag"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("dstSysID");
		elemField.setXmlName(new QName("", "DstSysID"));
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
