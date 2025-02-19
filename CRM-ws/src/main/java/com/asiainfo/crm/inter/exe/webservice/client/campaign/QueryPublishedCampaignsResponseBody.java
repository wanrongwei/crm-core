/**
 * QueryPublishedCampaignsResponseBody.java
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

public class QueryPublishedCampaignsResponseBody implements Serializable {
	private VwCurrentMessages vwCurrentMessages;

	public QueryPublishedCampaignsResponseBody() {
	}

	public QueryPublishedCampaignsResponseBody(
			VwCurrentMessages vwCurrentMessages) {
		this.vwCurrentMessages = vwCurrentMessages;
	}

	/**
	 * Gets the vwCurrentMessages value for this
	 * QueryPublishedCampaignsResponseBody.
	 * 
	 * @return vwCurrentMessages
	 */
	public VwCurrentMessages getVwCurrentMessages() {
		return vwCurrentMessages;
	}

	/**
	 * Sets the vwCurrentMessages value for this
	 * QueryPublishedCampaignsResponseBody.
	 * 
	 * @param vwCurrentMessages
	 */
	public void setVwCurrentMessages(VwCurrentMessages vwCurrentMessages) {
		this.vwCurrentMessages = vwCurrentMessages;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			QueryPublishedCampaignsResponseBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsResponseBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("vwCurrentMessages");
		elemField.setXmlName(new QName("", "VwCurrentMessages"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"VwCurrentMessages"));
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
