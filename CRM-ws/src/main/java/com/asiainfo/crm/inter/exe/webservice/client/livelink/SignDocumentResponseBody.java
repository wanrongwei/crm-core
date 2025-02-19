/**
 * SignDocumentResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SignDocumentResponseBody implements Serializable {
	private byte[][] signDocumentResult;

	public SignDocumentResponseBody() {
	}

	/**
	 * Gets the signDocumentResult value for this SignDocumentResponseBody.
	 * 
	 * @return signDocumentResult
	 */
	public byte[][] getSignDocumentResult() {
		return signDocumentResult;
	}

	/**
	 * Sets the signDocumentResult value for this SignDocumentResponseBody.
	 * 
	 * @param signDocumentResult
	 */
	public void setSignDocumentResult(byte[][] signDocumentResult) {
		this.signDocumentResult = signDocumentResult;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			SignDocumentResponseBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/EdocumentStorage",
				"SignDocumentResponseBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("signDocumentResult");
		elemField.setXmlName(new QName("", "SignDocumentResult"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"base64Binary"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		elemField.setItemQName(new QName("", "base64Binary"));
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
