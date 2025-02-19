/**
 * QueryInfoRequest.java
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
import java.io.Serializable;

public class QueryInfoRequest implements Serializable {

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QueryInfoRequest.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"QueryInfoRequest"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("requestBody");
		elemField.setXmlName(new QName("", "RequestBody"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"QueryInfoRequestBody"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	private QueryInfoRequestBody requestBody;

	public QueryInfoRequest() {
	}

	public QueryInfoRequest(QueryInfoRequestBody requestBody) {
		this.requestBody = requestBody;
	}

	/**
	 * Gets the requestBody value for this QueryInfoRequest.
	 * 
	 * @return requestBody
	 */
	public QueryInfoRequestBody getRequestBody() {
		return requestBody;
	}

	/**
	 * Sets the requestBody value for this QueryInfoRequest.
	 * 
	 * @param requestBody
	 */
	public void setRequestBody(QueryInfoRequestBody requestBody) {
		this.requestBody = requestBody;
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
