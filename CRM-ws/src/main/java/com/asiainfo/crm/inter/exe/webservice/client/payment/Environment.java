/**
 * Environment.java
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

public class Environment implements Serializable {
	private String webServicePlatform;

	private String OS;

	private String language;

	public Environment() {
	}

	/**
	 * Gets the webServicePlatform value for this Environment.
	 * 
	 * @return webServicePlatform
	 */
	public String getWebServicePlatform() {
		return webServicePlatform;
	}

	/**
	 * Sets the webServicePlatform value for this Environment.
	 * 
	 * @param webServicePlatform
	 */
	public void setWebServicePlatform(String webServicePlatform) {
		this.webServicePlatform = webServicePlatform;
	}

	/**
	 * Gets the OS value for this Environment.
	 * 
	 * @return OS
	 */
	public String getOS() {
		return OS;
	}

	/**
	 * Sets the OS value for this Environment.
	 * 
	 * @param OS
	 */
	public void setOS(String OS) {
		this.OS = OS;
	}

	/**
	 * Gets the language value for this Environment.
	 * 
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language value for this Environment.
	 * 
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(Environment.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "environment"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("webServicePlatform");
		elemField.setXmlName(new QName("", "WebServicePlatform"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("OS");
		elemField.setXmlName(new QName("", "OS"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("language");
		elemField.setXmlName(new QName("", "Language"));
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
