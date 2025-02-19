/**
 * NotifyDocumentRequestBody.java
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

public class NotifyDocumentRequestBody implements Serializable {
	private String countryCode;

	private String documentId;

	private String documentType;

	private String barcode;

	public NotifyDocumentRequestBody() {
	}

	/**
	 * Gets the countryCode value for this NotifyDocumentRequestBody.
	 * 
	 * @return countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the countryCode value for this NotifyDocumentRequestBody.
	 * 
	 * @param countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Gets the documentId value for this NotifyDocumentRequestBody.
	 * 
	 * @return documentId
	 */
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * Sets the documentId value for this NotifyDocumentRequestBody.
	 * 
	 * @param documentId
	 */
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	/**
	 * Gets the documentType value for this NotifyDocumentRequestBody.
	 * 
	 * @return documentType
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the documentType value for this NotifyDocumentRequestBody.
	 * 
	 * @param documentType
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * Gets the barcode value for this NotifyDocumentRequestBody.
	 * 
	 * @return barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * Sets the barcode value for this NotifyDocumentRequestBody.
	 * 
	 * @param barcode
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			NotifyDocumentRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/livelink",
				"NotifyDocumentRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("countryCode");
		elemField.setXmlName(new QName("", "CountryCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("documentId");
		elemField.setXmlName(new QName("", "DocumentId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("documentType");
		elemField.setXmlName(new QName("", "DocumentType"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("barcode");
		elemField.setXmlName(new QName("", "Barcode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
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
