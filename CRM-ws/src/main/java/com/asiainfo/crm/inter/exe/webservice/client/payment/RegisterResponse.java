/**
 * RegisterResponse.java
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

public class RegisterResponse implements Serializable {
	private String transactionId;

	public RegisterResponse() {
	}

	/**
	 * Gets the transactionId value for this RegisterResponse.
	 * 
	 * @return transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets the transactionId value for this RegisterResponse.
	 * 
	 * @param transactionId
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(RegisterResponse.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"registerResponse"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("transactionId");
		elemField.setXmlName(new QName("", "TransactionId"));
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
