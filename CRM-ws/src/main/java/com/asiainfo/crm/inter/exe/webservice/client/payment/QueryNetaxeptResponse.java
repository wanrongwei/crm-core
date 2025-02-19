/**
 * QueryNetaxeptResponse.java
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

public class QueryNetaxeptResponse implements java.io.Serializable {
	private NetaxeptPaymentInfo responseBody;

	public QueryNetaxeptResponse() {
	}

	/**
	 * Gets the responseBody value for this QueryNetaxeptResponse.
	 * 
	 * @return responseBody
	 */
	public NetaxeptPaymentInfo getResponseBody() {
		return responseBody;
	}

	/**
	 * Sets the responseBody value for this QueryNetaxeptResponse.
	 * 
	 * @param responseBody
	 */
	public void setResponseBody(NetaxeptPaymentInfo responseBody) {
		this.responseBody = responseBody;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			QueryNetaxeptResponse.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"QueryNetaxeptResponse"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("responseBody");
		elemField.setXmlName(new QName("", "ResponseBody"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"netaxeptPaymentInfo"));
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
