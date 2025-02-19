/**
 * RegisterNetaxeptResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.payment;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class RegisterNetaxeptResponseBody implements Serializable {
	private RegisterResponse registerResponse;

	public RegisterNetaxeptResponseBody() {
	}

	/**
	 * Gets the registerResponse value for this RegisterNetaxeptResponseBody.
	 * 
	 * @return registerResponse
	 */
	public RegisterResponse getRegisterResponse() {
		return registerResponse;
	}

	/**
	 * Sets the registerResponse value for this RegisterNetaxeptResponseBody.
	 * 
	 * @param registerResponse
	 */
	public void setRegisterResponse(RegisterResponse registerResponse) {
		this.registerResponse = registerResponse;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			RegisterNetaxeptResponseBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"RegisterNetaxeptResponseBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("registerResponse");
		elemField.setXmlName(new QName("", "registerResponse"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"registerResponse"));
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
