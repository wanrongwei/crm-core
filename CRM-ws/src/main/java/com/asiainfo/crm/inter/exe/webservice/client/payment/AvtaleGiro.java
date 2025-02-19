/**
 * AvtaleGiro.java
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

public class AvtaleGiro implements Serializable {
	private String kid;

	private String accountNumber;

	private String companyName;

	private String amountLimit;

	public AvtaleGiro() {
	}

	/**
	 * Gets the kid value for this AvtaleGiro.
	 * 
	 * @return kid
	 */
	public String getKid() {
		return kid;
	}

	/**
	 * Sets the kid value for this AvtaleGiro.
	 * 
	 * @param kid
	 */
	public void setKid(String kid) {
		this.kid = kid;
	}

	/**
	 * Gets the accountNumber value for this AvtaleGiro.
	 * 
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the accountNumber value for this AvtaleGiro.
	 * 
	 * @param accountNumber
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Gets the companyName value for this AvtaleGiro.
	 * 
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the companyName value for this AvtaleGiro.
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Gets the amountLimit value for this AvtaleGiro.
	 * 
	 * @return amountLimit
	 */
	public String getAmountLimit() {
		return amountLimit;
	}

	/**
	 * Sets the amountLimit value for this AvtaleGiro.
	 * 
	 * @param amountLimit
	 */
	public void setAmountLimit(String amountLimit) {
		this.amountLimit = amountLimit;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(AvtaleGiro.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "avtaleGiro"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("kid");
		elemField.setXmlName(new QName("", "Kid"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("accountNumber");
		elemField.setXmlName(new QName("", "AccountNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("companyName");
		elemField.setXmlName(new QName("", "CompanyName"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("amountLimit");
		elemField.setXmlName(new QName("", "AmountLimit"));
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
