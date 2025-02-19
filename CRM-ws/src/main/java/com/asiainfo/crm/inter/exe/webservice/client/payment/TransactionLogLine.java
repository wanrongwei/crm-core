/**
 * TransactionLogLine.java
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

public class TransactionLogLine implements java.io.Serializable {
	private String amount;

	private String batchNumber;

	private String creditedAmount;

	private java.util.Calendar dateTime;

	private String description;

	private String operation;

	private String subTransactionId;

	private String transactionReconRef;

	public TransactionLogLine() {
	}

	/**
	 * Gets the amount value for this TransactionLogLine.
	 * 
	 * @return amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * Sets the amount value for this TransactionLogLine.
	 * 
	 * @param amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * Gets the batchNumber value for this TransactionLogLine.
	 * 
	 * @return batchNumber
	 */
	public String getBatchNumber() {
		return batchNumber;
	}

	/**
	 * Sets the batchNumber value for this TransactionLogLine.
	 * 
	 * @param batchNumber
	 */
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	/**
	 * Gets the creditedAmount value for this TransactionLogLine.
	 * 
	 * @return creditedAmount
	 */
	public String getCreditedAmount() {
		return creditedAmount;
	}

	/**
	 * Sets the creditedAmount value for this TransactionLogLine.
	 * 
	 * @param creditedAmount
	 */
	public void setCreditedAmount(String creditedAmount) {
		this.creditedAmount = creditedAmount;
	}

	/**
	 * Gets the dateTime value for this TransactionLogLine.
	 * 
	 * @return dateTime
	 */
	public java.util.Calendar getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the dateTime value for this TransactionLogLine.
	 * 
	 * @param dateTime
	 */
	public void setDateTime(java.util.Calendar dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Gets the description value for this TransactionLogLine.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this TransactionLogLine.
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the operation value for this TransactionLogLine.
	 * 
	 * @return operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this TransactionLogLine.
	 * 
	 * @param operation
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * Gets the subTransactionId value for this TransactionLogLine.
	 * 
	 * @return subTransactionId
	 */
	public String getSubTransactionId() {
		return subTransactionId;
	}

	/**
	 * Sets the subTransactionId value for this TransactionLogLine.
	 * 
	 * @param subTransactionId
	 */
	public void setSubTransactionId(String subTransactionId) {
		this.subTransactionId = subTransactionId;
	}

	/**
	 * Gets the transactionReconRef value for this TransactionLogLine.
	 * 
	 * @return transactionReconRef
	 */
	public String getTransactionReconRef() {
		return transactionReconRef;
	}

	/**
	 * Sets the transactionReconRef value for this TransactionLogLine.
	 * 
	 * @param transactionReconRef
	 */
	public void setTransactionReconRef(String transactionReconRef) {
		this.transactionReconRef = transactionReconRef;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(TransactionLogLine.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"transactionLogLine"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("amount");
		elemField.setXmlName(new QName("", "Amount"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("batchNumber");
		elemField.setXmlName(new QName("", "BatchNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("creditedAmount");
		elemField.setXmlName(new QName("", "CreditedAmount"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("dateTime");
		elemField.setXmlName(new QName("", "DateTime"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"dateTime"));
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
		elemField.setFieldName("operation");
		elemField.setXmlName(new QName("", "Operation"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("subTransactionId");
		elemField.setXmlName(new QName("", "SubTransactionId"));
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
