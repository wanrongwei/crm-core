/**
 * SecurityInformation.java
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

public class SecurityInformation implements java.io.Serializable {
	private String customerIPCountry;

	private Boolean IPCountryMatchesIssuingCountry;

	public SecurityInformation() {
	}

	/**
	 * Gets the customerIPCountry value for this SecurityInformation.
	 * 
	 * @return customerIPCountry
	 */
	public String getCustomerIPCountry() {
		return customerIPCountry;
	}

	/**
	 * Sets the customerIPCountry value for this SecurityInformation.
	 * 
	 * @param customerIPCountry
	 */
	public void setCustomerIPCountry(String customerIPCountry) {
		this.customerIPCountry = customerIPCountry;
	}

	/**
	 * Gets the IPCountryMatchesIssuingCountry value for this
	 * SecurityInformation.
	 * 
	 * @return IPCountryMatchesIssuingCountry
	 */
	public Boolean getIPCountryMatchesIssuingCountry() {
		return IPCountryMatchesIssuingCountry;
	}

	/**
	 * Sets the IPCountryMatchesIssuingCountry value for this
	 * SecurityInformation.
	 * 
	 * @param IPCountryMatchesIssuingCountry
	 */
	public void setIPCountryMatchesIssuingCountry(
			Boolean IPCountryMatchesIssuingCountry) {
		this.IPCountryMatchesIssuingCountry = IPCountryMatchesIssuingCountry;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(SecurityInformation.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"securityInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("customerIPCountry");
		elemField.setXmlName(new QName("", "CustomerIPCountry"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("IPCountryMatchesIssuingCountry");
		elemField.setXmlName(new QName("", "IPCountryMatchesIssuingCountry"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"boolean"));
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
