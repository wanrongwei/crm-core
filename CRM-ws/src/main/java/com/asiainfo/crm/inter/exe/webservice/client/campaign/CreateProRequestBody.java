/**
 * CreateProRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CreateProRequestBody implements Serializable {
	private String org;

	private String cid;

	private String agentId;

	private String channelId;

	private String interactionPoint;

	private String messageId;

	private String custId;

	private String tenantId;

	private String eventId;

	private Calendar time;

	private String topUpChannel;

	private BigDecimal topUpAmount;

	private String freeResourceItem;

	public CreateProRequestBody() {
	}

	public CreateProRequestBody(String org, String cid, String agentId,
			String channelId, String interactionPoint, String messageId,
			String custId, String tenantId, String eventId, Calendar time,
			String topUpChannel, BigDecimal topUpAmount, String freeResourceItem) {
		this.org = org;
		this.cid = cid;
		this.agentId = agentId;
		this.channelId = channelId;
		this.interactionPoint = interactionPoint;
		this.messageId = messageId;
		this.custId = custId;
		this.tenantId = tenantId;
		this.eventId = eventId;
		this.time = time;
		this.topUpChannel = topUpChannel;
		this.topUpAmount = topUpAmount;
		this.freeResourceItem = freeResourceItem;
	}

	/**
	 * Gets the org value for this CreateProRequestBody.
	 * 
	 * @return org
	 */
	public String getOrg() {
		return org;
	}

	/**
	 * Sets the org value for this CreateProRequestBody.
	 * 
	 * @param org
	 */
	public void setOrg(String org) {
		this.org = org;
	}

	/**
	 * Gets the cid value for this CreateProRequestBody.
	 * 
	 * @return cid
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * Sets the cid value for this CreateProRequestBody.
	 * 
	 * @param cid
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * Gets the agentId value for this CreateProRequestBody.
	 * 
	 * @return agentId
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * Sets the agentId value for this CreateProRequestBody.
	 * 
	 * @param agentId
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * Gets the channelId value for this CreateProRequestBody.
	 * 
	 * @return channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * Sets the channelId value for this CreateProRequestBody.
	 * 
	 * @param channelId
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * Gets the interactionPoint value for this CreateProRequestBody.
	 * 
	 * @return interactionPoint
	 */
	public String getInteractionPoint() {
		return interactionPoint;
	}

	/**
	 * Sets the interactionPoint value for this CreateProRequestBody.
	 * 
	 * @param interactionPoint
	 */
	public void setInteractionPoint(String interactionPoint) {
		this.interactionPoint = interactionPoint;
	}

	/**
	 * Gets the messageId value for this CreateProRequestBody.
	 * 
	 * @return messageId
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * Sets the messageId value for this CreateProRequestBody.
	 * 
	 * @param messageId
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * Gets the custId value for this CreateProRequestBody.
	 * 
	 * @return custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * Sets the custId value for this CreateProRequestBody.
	 * 
	 * @param custId
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * Gets the tenantId value for this CreateProRequestBody.
	 * 
	 * @return tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * Sets the tenantId value for this CreateProRequestBody.
	 * 
	 * @param tenantId
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Gets the eventId value for this CreateProRequestBody.
	 * 
	 * @return eventId
	 */
	public String getEventId() {
		return eventId;
	}

	/**
	 * Sets the eventId value for this CreateProRequestBody.
	 * 
	 * @param eventId
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	/**
	 * Gets the time value for this CreateProRequestBody.
	 * 
	 * @return time
	 */
	public Calendar getTime() {
		return time;
	}

	/**
	 * Sets the time value for this CreateProRequestBody.
	 * 
	 * @param time
	 */
	public void setTime(Calendar time) {
		this.time = time;
	}

	/**
	 * Gets the topUpChannel value for this CreateProRequestBody.
	 * 
	 * @return topUpChannel
	 */
	public String getTopUpChannel() {
		return topUpChannel;
	}

	/**
	 * Sets the topUpChannel value for this CreateProRequestBody.
	 * 
	 * @param topUpChannel
	 */
	public void setTopUpChannel(String topUpChannel) {
		this.topUpChannel = topUpChannel;
	}

	/**
	 * Gets the topUpAmount value for this CreateProRequestBody.
	 * 
	 * @return topUpAmount
	 */
	public BigDecimal getTopUpAmount() {
		return topUpAmount;
	}

	/**
	 * Sets the topUpAmount value for this CreateProRequestBody.
	 * 
	 * @param topUpAmount
	 */
	public void setTopUpAmount(BigDecimal topUpAmount) {
		this.topUpAmount = topUpAmount;
	}

	/**
	 * Gets the freeResourceItem value for this CreateProRequestBody.
	 * 
	 * @return freeResourceItem
	 */
	public String getFreeResourceItem() {
		return freeResourceItem;
	}

	/**
	 * Sets the freeResourceItem value for this CreateProRequestBody.
	 * 
	 * @param freeResourceItem
	 */
	public void setFreeResourceItem(String freeResourceItem) {
		this.freeResourceItem = freeResourceItem;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(CreateProRequestBody.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreateProRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("org");
		elemField.setXmlName(new QName("", "org"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("cid");
		elemField.setXmlName(new QName("", "cid"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("agentId");
		elemField.setXmlName(new QName("", "agentId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("channelId");
		elemField.setXmlName(new QName("", "channelId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("interactionPoint");
		elemField.setXmlName(new QName("", "interactionPoint"));
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
		elemField = new ElementDesc();
		elemField.setFieldName("custId");
		elemField.setXmlName(new QName("", "CustId"));
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventId");
		elemField.setXmlName(new QName("", "EventId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("time");
		elemField.setXmlName(new QName("", "Time"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("topUpChannel");
		elemField.setXmlName(new QName("", "TopUpChannel"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("topUpAmount");
		elemField.setXmlName(new QName("", "TopUpAmount"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"decimal"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("freeResourceItem");
		elemField.setXmlName(new QName("", "FreeResourceItem"));
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
