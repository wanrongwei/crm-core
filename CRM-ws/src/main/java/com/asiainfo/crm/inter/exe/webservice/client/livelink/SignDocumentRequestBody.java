/**
 * SignDocumentRequestBody.java
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

public class SignDocumentRequestBody implements Serializable {
	private byte[] inputPdf;

	private String documentId;

	private String countryCode;

	private String docType;

	public SignDocumentRequestBody() {
	}

	/**
	 * Gets the inputPdf value for this SignDocumentRequestBody.
	 * 
	 * @return inputPdf
	 */
	public byte[] getInputPdf() {
		return inputPdf;
	}

	/**
	 * Sets the inputPdf value for this SignDocumentRequestBody.
	 * 
	 * @param inputPdf
	 */
	public void setInputPdf(byte[] inputPdf) {
		this.inputPdf = inputPdf;
	}

	/**
	 * Gets the documentId value for this SignDocumentRequestBody.
	 * 
	 * @return documentId
	 */
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * Sets the documentId value for this SignDocumentRequestBody.
	 * 
	 * @param documentId
	 */
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	/**
	 * Gets the countryCode value for this SignDocumentRequestBody.
	 * 
	 * @return countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the countryCode value for this SignDocumentRequestBody.
	 * 
	 * @param countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Gets the docType value for this SignDocumentRequestBody.
	 * 
	 * @return docType
	 */
	public String getDocType() {
		return docType;
	}

	/**
	 * Sets the docType value for this SignDocumentRequestBody.
	 * 
	 * @param docType
	 */
	public void setDocType(String docType) {
		this.docType = docType;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			SignDocumentRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/EdocumentStorage",
				"SignDocumentRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("inputPdf");
		elemField.setXmlName(new QName("", "InputPdf"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"base64Binary"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("documentId");
		elemField.setXmlName(new QName("", "DocumentId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("countryCode");
		elemField.setXmlName(new QName("", "countryCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("docType");
		elemField.setXmlName(new QName("", "docType"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
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
