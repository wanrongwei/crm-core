/**
 * RegisterRequest.java
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

public class RegisterRequest implements Serializable {
	private AvtaleGiro avtaleGiro;

	private CardInfo cardInfo;

	private Customer customer;

	private String description;

	private DnBNorDirectPayment dnBNorDirectPayment;

	private Environment environment;

	private Order order;

	private Recurring recurring;

	private String serviceType;

	private Terminal terminal;

	private String transactionId;

	private String transactionReconRef;

	public RegisterRequest() {
	}

	/**
	 * Gets the avtaleGiro value for this RegisterRequest.
	 * 
	 * @return avtaleGiro
	 */
	public AvtaleGiro getAvtaleGiro() {
		return avtaleGiro;
	}

	/**
	 * Sets the avtaleGiro value for this RegisterRequest.
	 * 
	 * @param avtaleGiro
	 */
	public void setAvtaleGiro(AvtaleGiro avtaleGiro) {
		this.avtaleGiro = avtaleGiro;
	}

	/**
	 * Gets the cardInfo value for this RegisterRequest.
	 * 
	 * @return cardInfo
	 */
	public CardInfo getCardInfo() {
		return cardInfo;
	}

	/**
	 * Sets the cardInfo value for this RegisterRequest.
	 * 
	 * @param cardInfo
	 */
	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	/**
	 * Gets the customer value for this RegisterRequest.
	 * 
	 * @return customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer value for this RegisterRequest.
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Gets the description value for this RegisterRequest.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this RegisterRequest.
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the dnBNorDirectPayment value for this RegisterRequest.
	 * 
	 * @return dnBNorDirectPayment
	 */
	public DnBNorDirectPayment getDnBNorDirectPayment() {
		return dnBNorDirectPayment;
	}

	/**
	 * Sets the dnBNorDirectPayment value for this RegisterRequest.
	 * 
	 * @param dnBNorDirectPayment
	 */
	public void setDnBNorDirectPayment(DnBNorDirectPayment dnBNorDirectPayment) {
		this.dnBNorDirectPayment = dnBNorDirectPayment;
	}

	/**
	 * Gets the environment value for this RegisterRequest.
	 * 
	 * @return environment
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * Sets the environment value for this RegisterRequest.
	 * 
	 * @param environment
	 */
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	/**
	 * Gets the order value for this RegisterRequest.
	 * 
	 * @return order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Sets the order value for this RegisterRequest.
	 * 
	 * @param order
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * Gets the recurring value for this RegisterRequest.
	 * 
	 * @return recurring
	 */
	public Recurring getRecurring() {
		return recurring;
	}

	/**
	 * Sets the recurring value for this RegisterRequest.
	 * 
	 * @param recurring
	 */
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}

	/**
	 * Gets the serviceType value for this RegisterRequest.
	 * 
	 * @return serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * Sets the serviceType value for this RegisterRequest.
	 * 
	 * @param serviceType
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * Gets the terminal value for this RegisterRequest.
	 * 
	 * @return terminal
	 */
	public Terminal getTerminal() {
		return terminal;
	}

	/**
	 * Sets the terminal value for this RegisterRequest.
	 * 
	 * @param terminal
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	/**
	 * Gets the transactionId value for this RegisterRequest.
	 * 
	 * @return transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets the transactionId value for this RegisterRequest.
	 * 
	 * @param transactionId
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * Gets the transactionReconRef value for this RegisterRequest.
	 * 
	 * @return transactionReconRef
	 */
	public String getTransactionReconRef() {
		return transactionReconRef;
	}

	/**
	 * Sets the transactionReconRef value for this RegisterRequest.
	 * 
	 * @param transactionReconRef
	 */
	public void setTransactionReconRef(String transactionReconRef) {
		this.transactionReconRef = transactionReconRef;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(RegisterRequest.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"registerRequest"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("avtaleGiro");
		elemField.setXmlName(new QName("", "AvtaleGiro"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "avtaleGiro"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("cardInfo");
		elemField.setXmlName(new QName("", "CardInfo"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "cardInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("customer");
		elemField.setXmlName(new QName("", "Customer"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "customer"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new QName("", "Description"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("dnBNorDirectPayment");
		elemField.setXmlName(new QName("", "DnBNorDirectPayment"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"dnBNorDirectPayment"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("environment");
		elemField.setXmlName(new QName("", "Environment"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "environment"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("order");
		elemField.setXmlName(new QName("", "Order"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "order"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("recurring");
		elemField.setXmlName(new QName("", "Recurring"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "recurring"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("serviceType");
		elemField.setXmlName(new QName("", "ServiceType"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("terminal");
		elemField.setXmlName(new QName("", "Terminal"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "terminal"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("transactionId");
		elemField.setXmlName(new QName("", "TransactionId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("transactionReconRef");
		elemField.setXmlName(new QName("", "TransactionReconRef"));
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
