/**
 * QueryPublishedCampaignsRequestBody.java
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

public class QueryPublishedCampaignsRequestBody implements Serializable {
	private String tenantId;

	private String channelId;

	public QueryPublishedCampaignsRequestBody() {
	}

	public QueryPublishedCampaignsRequestBody(String tenantId, String channelId) {
		this.tenantId = tenantId;
		this.channelId = channelId;
	}

	/**
	 * Gets the tenantId value for this QueryPublishedCampaignsRequestBody.
	 * 
	 * @return tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * Sets the tenantId value for this QueryPublishedCampaignsRequestBody.
	 * 
	 * @param tenantId
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Gets the channelId value for this QueryPublishedCampaignsRequestBody.
	 * 
	 * @return channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * Sets the channelId value for this QueryPublishedCampaignsRequestBody.
	 * 
	 * @param channelId
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			QueryPublishedCampaignsRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("tenantId");
		elemField.setXmlName(new QName("", "TenantId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("channelId");
		elemField.setXmlName(new QName("", "ChannelId"));
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
