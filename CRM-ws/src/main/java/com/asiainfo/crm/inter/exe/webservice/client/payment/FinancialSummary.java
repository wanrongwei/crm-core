/**
 * FinancialSummary.java
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

public class FinancialSummary implements java.io.Serializable {
	private String amountCaptured;

	private String amountCredited;

	private Boolean annulled;

	private String authorizationId;

	private Boolean authorized;

	public FinancialSummary() {
	}

	/**
	 * Gets the amountCaptured value for this FinancialSummary.
	 * 
	 * @return amountCaptured
	 */
	public String getAmountCaptured() {
		return amountCaptured;
	}

	/**
	 * Sets the amountCaptured value for this FinancialSummary.
	 * 
	 * @param amountCaptured
	 */
	public void setAmountCaptured(String amountCaptured) {
		this.amountCaptured = amountCaptured;
	}

	/**
	 * Gets the amountCredited value for this FinancialSummary.
	 * 
	 * @return amountCredited
	 */
	public String getAmountCredited() {
		return amountCredited;
	}

	/**
	 * Sets the amountCredited value for this FinancialSummary.
	 * 
	 * @param amountCredited
	 */
	public void setAmountCredited(String amountCredited) {
		this.amountCredited = amountCredited;
	}

	/**
	 * Gets the annulled value for this FinancialSummary.
	 * 
	 * @return annulled
	 */
	public Boolean getAnnulled() {
		return annulled;
	}

	/**
	 * Sets the annulled value for this FinancialSummary.
	 * 
	 * @param annulled
	 */
	public void setAnnulled(Boolean annulled) {
		this.annulled = annulled;
	}

	/**
	 * Gets the authorizationId value for this FinancialSummary.
	 * 
	 * @return authorizationId
	 */
	public String getAuthorizationId() {
		return authorizationId;
	}

	/**
	 * Sets the authorizationId value for this FinancialSummary.
	 * 
	 * @param authorizationId
	 */
	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
	}

	/**
	 * Gets the authorized value for this FinancialSummary.
	 * 
	 * @return authorized
	 */
	public Boolean getAuthorized() {
		return authorized;
	}

	/**
	 * Sets the authorized value for this FinancialSummary.
	 * 
	 * @param authorized
	 */
	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(FinancialSummary.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"financialSummary"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("amountCaptured");
		elemField.setXmlName(new QName("", "AmountCaptured"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("amountCredited");
		elemField.setXmlName(new QName("", "AmountCredited"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("annulled");
		elemField.setXmlName(new QName("", "Annulled"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("authorizationId");
		elemField.setXmlName(new QName("", "AuthorizationId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("authorized");
		elemField.setXmlName(new QName("", "Authorized"));
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
