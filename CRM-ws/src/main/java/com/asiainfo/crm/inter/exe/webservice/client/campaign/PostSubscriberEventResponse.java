/**
 * PostSubscriberEventResponse.java
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

public class PostSubscriberEventResponse implements Serializable {
	private ResponseHead responseHead;

	public PostSubscriberEventResponse() {
	}

	public PostSubscriberEventResponse(ResponseHead responseHead) {
		this.responseHead = responseHead;
	}

	/**
	 * Gets the responseHead value for this PostSubscriberEventResponse.
	 * 
	 * @return responseHead
	 */
	public ResponseHead getResponseHead() {
		return responseHead;
	}

	/**
	 * Sets the responseHead value for this PostSubscriberEventResponse.
	 * 
	 * @param responseHead
	 */
	public void setResponseHead(ResponseHead responseHead) {
		this.responseHead = responseHead;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			PostSubscriberEventResponse.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"postSubscriberEventResponse"));
		ElementDesc elemField = new ElementDesc();
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
