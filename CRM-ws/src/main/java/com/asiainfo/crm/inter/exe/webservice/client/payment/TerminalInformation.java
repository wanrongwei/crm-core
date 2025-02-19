/**
 * TerminalInformation.java
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

public class TerminalInformation implements java.io.Serializable {
	private String browser;

	private String customerEntered;

	private String customerRedirected;

	public TerminalInformation() {
	}

	/**
	 * Gets the browser value for this TerminalInformation.
	 * 
	 * @return browser
	 */
	public String getBrowser() {
		return browser;
	}

	/**
	 * Sets the browser value for this TerminalInformation.
	 * 
	 * @param browser
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
	}

	/**
	 * Gets the customerEntered value for this TerminalInformation.
	 * 
	 * @return customerEntered
	 */
	public String getCustomerEntered() {
		return customerEntered;
	}

	/**
	 * Sets the customerEntered value for this TerminalInformation.
	 * 
	 * @param customerEntered
	 */
	public void setCustomerEntered(String customerEntered) {
		this.customerEntered = customerEntered;
	}

	/**
	 * Gets the customerRedirected value for this TerminalInformation.
	 * 
	 * @return customerRedirected
	 */
	public String getCustomerRedirected() {
		return customerRedirected;
	}

	/**
	 * Sets the customerRedirected value for this TerminalInformation.
	 * 
	 * @param customerRedirected
	 */
	public void setCustomerRedirected(String customerRedirected) {
		this.customerRedirected = customerRedirected;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(TerminalInformation.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"terminalInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("browser");
		elemField.setXmlName(new QName("", "Browser"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("customerEntered");
		elemField.setXmlName(new QName("", "CustomerEntered"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("customerRedirected");
		elemField.setXmlName(new QName("", "CustomerRedirected"));
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
