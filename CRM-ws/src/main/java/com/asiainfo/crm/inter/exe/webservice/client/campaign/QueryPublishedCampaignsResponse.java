/**
 * QueryPublishedCampaignsResponse.java
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

public class QueryPublishedCampaignsResponse implements Serializable {
	private ResponseHead responseHead;

	private QueryPublishedCampaignsResponseBody queryPublishedCampaignsResponseBody;

	public QueryPublishedCampaignsResponse() {
	}

	public QueryPublishedCampaignsResponse(
			ResponseHead responseHead,
			QueryPublishedCampaignsResponseBody queryPublishedCampaignsResponseBody) {
		this.responseHead = responseHead;
		this.queryPublishedCampaignsResponseBody = queryPublishedCampaignsResponseBody;
	}

	/**
	 * Gets the responseHead value for this QueryPublishedCampaignsResponse.
	 * 
	 * @return responseHead
	 */
	public ResponseHead getResponseHead() {
		return responseHead;
	}

	/**
	 * Sets the responseHead value for this QueryPublishedCampaignsResponse.
	 * 
	 * @param responseHead
	 */
	public void setResponseHead(ResponseHead responseHead) {
		this.responseHead = responseHead;
	}

	/**
	 * Gets the queryPublishedCampaignsResponseBody value for this
	 * QueryPublishedCampaignsResponse.
	 * 
	 * @return queryPublishedCampaignsResponseBody
	 */
	public QueryPublishedCampaignsResponseBody getQueryPublishedCampaignsResponseBody() {
		return queryPublishedCampaignsResponseBody;
	}

	/**
	 * Sets the queryPublishedCampaignsResponseBody value for this
	 * QueryPublishedCampaignsResponse.
	 * 
	 * @param queryPublishedCampaignsResponseBody
	 */
	public void setQueryPublishedCampaignsResponseBody(
			QueryPublishedCampaignsResponseBody queryPublishedCampaignsResponseBody) {
		this.queryPublishedCampaignsResponseBody = queryPublishedCampaignsResponseBody;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			QueryPublishedCampaignsResponse.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsResponse"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("responseHead");
		elemField.setXmlName(new QName("", "ResponseHead"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"ResponseHead"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("queryPublishedCampaignsResponseBody");
		elemField.setXmlName(new QName("",
				"QueryPublishedCampaignsResponseBody"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"QueryPublishedCampaignsResponseBody"));
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
