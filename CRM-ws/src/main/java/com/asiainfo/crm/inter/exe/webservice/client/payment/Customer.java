/**
 * Customer.java
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

public class Customer implements Serializable {
	private String address1;

	private String address2;

	private String companyName;

	private String country;

	private String customerNumber;

	private String email;

	private String firstName;

	private String lastName;

	private String notificationMode;

	private String phoneNumber;

	private String postcode;

	private String socialSecurityNumber;

	private String town;

	public Customer() {
	}

	/**
	 * Gets the address1 value for this Customer.
	 * 
	 * @return address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * Sets the address1 value for this Customer.
	 * 
	 * @param address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * Gets the address2 value for this Customer.
	 * 
	 * @return address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * Sets the address2 value for this Customer.
	 * 
	 * @param address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * Gets the companyName value for this Customer.
	 * 
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the companyName value for this Customer.
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Gets the country value for this Customer.
	 * 
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country value for this Customer.
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the customerNumber value for this Customer.
	 * 
	 * @return customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * Sets the customerNumber value for this Customer.
	 * 
	 * @param customerNumber
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * Gets the email value for this Customer.
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email value for this Customer.
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the firstName value for this Customer.
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName value for this Customer.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the lastName value for this Customer.
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName value for this Customer.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the notificationMode value for this Customer.
	 * 
	 * @return notificationMode
	 */
	public String getNotificationMode() {
		return notificationMode;
	}

	/**
	 * Sets the notificationMode value for this Customer.
	 * 
	 * @param notificationMode
	 */
	public void setNotificationMode(String notificationMode) {
		this.notificationMode = notificationMode;
	}

	/**
	 * Gets the phoneNumber value for this Customer.
	 * 
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phoneNumber value for this Customer.
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the postcode value for this Customer.
	 * 
	 * @return postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * Sets the postcode value for this Customer.
	 * 
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * Gets the socialSecurityNumber value for this Customer.
	 * 
	 * @return socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Sets the socialSecurityNumber value for this Customer.
	 * 
	 * @param socialSecurityNumber
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * Gets the town value for this Customer.
	 * 
	 * @return town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * Sets the town value for this Customer.
	 * 
	 * @param town
	 */
	public void setTown(String town) {
		this.town = town;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(Customer.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "customer"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("address1");
		elemField.setXmlName(new QName("", "Address1"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("address2");
		elemField.setXmlName(new QName("", "Address2"));
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
		elemField.setFieldName("country");
		elemField.setXmlName(new QName("", "Country"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("customerNumber");
		elemField.setXmlName(new QName("", "CustomerNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("email");
		elemField.setXmlName(new QName("", "Email"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("firstName");
		elemField.setXmlName(new QName("", "FirstName"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("lastName");
		elemField.setXmlName(new QName("", "LastName"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("notificationMode");
		elemField.setXmlName(new QName("", "NotificationMode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("phoneNumber");
		elemField.setXmlName(new QName("", "PhoneNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("postcode");
		elemField.setXmlName(new QName("", "Postcode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("socialSecurityNumber");
		elemField.setXmlName(new QName("", "SocialSecurityNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("town");
		elemField.setXmlName(new QName("", "Town"));
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
