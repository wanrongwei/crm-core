/**
 * MatchInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cpr;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;

public class MatchInfoResponse implements java.io.Serializable {

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(MatchInfoResponse.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"MatchInfoResponse"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("responseBody");
		elemField.setXmlName(new QName("", "ResponseBody"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"MatchInfoResponseBody"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	private MatchInfoResponseBody responseBody;

	/**
	 * Gets the responseBody value for this MatchInfoResponse.
	 * 
	 * @return responseBody
	 */
	public MatchInfoResponseBody getResponseBody() {
		return responseBody;
	}

	/**
	 * Sets the responseBody value for this MatchInfoResponse.
	 * 
	 * @param responseBody
	 */
	public void setResponseBody(MatchInfoResponseBody responseBody) {
		this.responseBody = responseBody;
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
