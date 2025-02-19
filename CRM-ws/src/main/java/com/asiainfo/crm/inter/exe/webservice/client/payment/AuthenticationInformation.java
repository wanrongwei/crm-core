/**
 * AuthenticationInformation.java
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

public class AuthenticationInformation implements java.io.Serializable {
	private String authenticatedWith;

	private String authenticatedStatus;

	private String ECI;

	public AuthenticationInformation() {
	}

	/**
	 * Gets the authenticatedWith value for this AuthenticationInformation.
	 * 
	 * @return authenticatedWith
	 */
	public String getAuthenticatedWith() {
		return authenticatedWith;
	}

	/**
	 * Sets the authenticatedWith value for this AuthenticationInformation.
	 * 
	 * @param authenticatedWith
	 */
	public void setAuthenticatedWith(String authenticatedWith) {
		this.authenticatedWith = authenticatedWith;
	}

	/**
	 * Gets the authenticatedStatus value for this AuthenticationInformation.
	 * 
	 * @return authenticatedStatus
	 */
	public String getAuthenticatedStatus() {
		return authenticatedStatus;
	}

	/**
	 * Sets the authenticatedStatus value for this AuthenticationInformation.
	 * 
	 * @param authenticatedStatus
	 */
	public void setAuthenticatedStatus(String authenticatedStatus) {
		this.authenticatedStatus = authenticatedStatus;
	}

	/**
	 * Gets the ECI value for this AuthenticationInformation.
	 * 
	 * @return ECI
	 */
	public String getECI() {
		return ECI;
	}

	/**
	 * Sets the ECI value for this AuthenticationInformation.
	 * 
	 * @param ECI
	 */
	public void setECI(String ECI) {
		this.ECI = ECI;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			AuthenticationInformation.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"authenticationInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("authenticatedWith");
		elemField.setXmlName(new QName("", "AuthenticatedWith"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("authenticatedStatus");
		elemField.setXmlName(new QName("", "AuthenticatedStatus"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("ECI");
		elemField.setXmlName(new QName("", "ECI"));
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
