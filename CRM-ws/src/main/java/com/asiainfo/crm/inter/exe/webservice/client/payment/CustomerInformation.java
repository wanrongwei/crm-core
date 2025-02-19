/**
 * CustomerInformation.java
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

public class CustomerInformation implements java.io.Serializable {
	private String address1;

	private String address2;

	private String companyName;

	private String companyRegistrationNumber;

	private String country;

	private String customerNumber;

	private String email;

	private String firstName;

	private String IP;

	private String lastName;

	private String phoneNumber;

	private String postcode;

	private String socialSecurityNumber;

	private String town;

	public CustomerInformation() {
	}

	/**
	 * Gets the address1 value for this CustomerInformation.
	 * 
	 * @return address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * Sets the address1 value for this CustomerInformation.
	 * 
	 * @param address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * Gets the address2 value for this CustomerInformation.
	 * 
	 * @return address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * Sets the address2 value for this CustomerInformation.
	 * 
	 * @param address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * Gets the companyName value for this CustomerInformation.
	 * 
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the companyName value for this CustomerInformation.
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Gets the companyRegistrationNumber value for this CustomerInformation.
	 * 
	 * @return companyRegistrationNumber
	 */
	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	/**
	 * Sets the companyRegistrationNumber value for this CustomerInformation.
	 * 
	 * @param companyRegistrationNumber
	 */
	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

	/**
	 * Gets the country value for this CustomerInformation.
	 * 
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country value for this CustomerInformation.
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the customerNumber value for this CustomerInformation.
	 * 
	 * @return customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * Sets the customerNumber value for this CustomerInformation.
	 * 
	 * @param customerNumber
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * Gets the email value for this CustomerInformation.
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email value for this CustomerInformation.
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the firstName value for this CustomerInformation.
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName value for this CustomerInformation.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the IP value for this CustomerInformation.
	 * 
	 * @return IP
	 */
	public String getIP() {
		return IP;
	}

	/**
	 * Sets the IP value for this CustomerInformation.
	 * 
	 * @param IP
	 */
	public void setIP(String IP) {
		this.IP = IP;
	}

	/**
	 * Gets the lastName value for this CustomerInformation.
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName value for this CustomerInformation.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the phoneNumber value for this CustomerInformation.
	 * 
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phoneNumber value for this CustomerInformation.
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the postcode value for this CustomerInformation.
	 * 
	 * @return postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * Sets the postcode value for this CustomerInformation.
	 * 
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * Gets the socialSecurityNumber value for this CustomerInformation.
	 * 
	 * @return socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Sets the socialSecurityNumber value for this CustomerInformation.
	 * 
	 * @param socialSecurityNumber
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * Gets the town value for this CustomerInformation.
	 * 
	 * @return town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * Sets the town value for this CustomerInformation.
	 * 
	 * @param town
	 */
	public void setTown(String town) {
		this.town = town;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(CustomerInformation.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"customerInformation"));
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
		elemField.setFieldName("companyRegistrationNumber");
		elemField.setXmlName(new QName("", "CompanyRegistrationNumber"));
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
		elemField.setFieldName("IP");
		elemField.setXmlName(new QName("", "IP"));
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
