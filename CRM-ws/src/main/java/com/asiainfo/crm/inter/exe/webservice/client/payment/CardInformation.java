/**
 * CardInformation.java
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

public class CardInformation implements java.io.Serializable {
	private String expiryDate;

	private String issuer;

	private String issuerCountry;

	private String maskedPAN;

	private String panHash;

	private String paymentMethod;

	private String issuerId;

	public CardInformation() {
	}

	/**
	 * Gets the expiryDate value for this CardInformation.
	 * 
	 * @return expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Sets the expiryDate value for this CardInformation.
	 * 
	 * @param expiryDate
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * Gets the issuer value for this CardInformation.
	 * 
	 * @return issuer
	 */
	public String getIssuer() {
		return issuer;
	}

	/**
	 * Sets the issuer value for this CardInformation.
	 * 
	 * @param issuer
	 */
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * Gets the issuerCountry value for this CardInformation.
	 * 
	 * @return issuerCountry
	 */
	public String getIssuerCountry() {
		return issuerCountry;
	}

	/**
	 * Sets the issuerCountry value for this CardInformation.
	 * 
	 * @param issuerCountry
	 */
	public void setIssuerCountry(String issuerCountry) {
		this.issuerCountry = issuerCountry;
	}

	/**
	 * Gets the maskedPAN value for this CardInformation.
	 * 
	 * @return maskedPAN
	 */
	public String getMaskedPAN() {
		return maskedPAN;
	}

	/**
	 * Sets the maskedPAN value for this CardInformation.
	 * 
	 * @param maskedPAN
	 */
	public void setMaskedPAN(String maskedPAN) {
		this.maskedPAN = maskedPAN;
	}

	/**
	 * Gets the panHash value for this CardInformation.
	 * 
	 * @return panHash
	 */
	public String getPanHash() {
		return panHash;
	}

	/**
	 * Sets the panHash value for this CardInformation.
	 * 
	 * @param panHash
	 */
	public void setPanHash(String panHash) {
		this.panHash = panHash;
	}

	/**
	 * Gets the paymentMethod value for this CardInformation.
	 * 
	 * @return paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Sets the paymentMethod value for this CardInformation.
	 * 
	 * @param paymentMethod
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * Gets the issuerId value for this CardInformation.
	 * 
	 * @return issuerId
	 */
	public String getIssuerId() {
		return issuerId;
	}

	/**
	 * Sets the issuerId value for this CardInformation.
	 * 
	 * @param issuerId
	 */
	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(CardInformation.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"cardInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("expiryDate");
		elemField.setXmlName(new QName("", "ExpiryDate"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("issuer");
		elemField.setXmlName(new QName("", "Issuer"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("issuerCountry");
		elemField.setXmlName(new QName("", "IssuerCountry"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("maskedPAN");
		elemField.setXmlName(new QName("", "MaskedPAN"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("panHash");
		elemField.setXmlName(new QName("", "PanHash"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("paymentMethod");
		elemField.setXmlName(new QName("", "PaymentMethod"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("issuerId");
		elemField.setXmlName(new QName("", "IssuerId"));
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
