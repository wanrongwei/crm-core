/**
 * OrderInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.payment;

import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.Deserializer;
import javax.xml.rpc.encoding.Serializer;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class OrderInformation implements java.io.Serializable {
	private String acquirerInfo;

	private String amount;

	private String currency;

	private String deliveryDate;

	private String fee;

	private String orderDescription;

	private String orderNumber;

	private Calendar timestamp;

	private String total;

	private String roundingAmount;

	public OrderInformation() {
	}

	/**
	 * Gets the acquirerInfo value for this OrderInformation.
	 * 
	 * @return acquirerInfo
	 */
	public String getAcquirerInfo() {
		return acquirerInfo;
	}

	/**
	 * Sets the acquirerInfo value for this OrderInformation.
	 * 
	 * @param acquirerInfo
	 */
	public void setAcquirerInfo(String acquirerInfo) {
		this.acquirerInfo = acquirerInfo;
	}

	/**
	 * Gets the amount value for this OrderInformation.
	 * 
	 * @return amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * Sets the amount value for this OrderInformation.
	 * 
	 * @param amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * Gets the currency value for this OrderInformation.
	 * 
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency value for this OrderInformation.
	 * 
	 * @param currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Gets the deliveryDate value for this OrderInformation.
	 * 
	 * @return deliveryDate
	 */
	public String getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * Sets the deliveryDate value for this OrderInformation.
	 * 
	 * @param deliveryDate
	 */
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	/**
	 * Gets the fee value for this OrderInformation.
	 * 
	 * @return fee
	 */
	public String getFee() {
		return fee;
	}

	/**
	 * Sets the fee value for this OrderInformation.
	 * 
	 * @param fee
	 */
	public void setFee(String fee) {
		this.fee = fee;
	}

	/**
	 * Gets the orderDescription value for this OrderInformation.
	 * 
	 * @return orderDescription
	 */
	public String getOrderDescription() {
		return orderDescription;
	}

	/**
	 * Sets the orderDescription value for this OrderInformation.
	 * 
	 * @param orderDescription
	 */
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	/**
	 * Gets the orderNumber value for this OrderInformation.
	 * 
	 * @return orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the orderNumber value for this OrderInformation.
	 * 
	 * @param orderNumber
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Gets the timestamp value for this OrderInformation.
	 * 
	 * @return timestamp
	 */
	public Calendar getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp value for this OrderInformation.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the total value for this OrderInformation.
	 * 
	 * @return total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * Sets the total value for this OrderInformation.
	 * 
	 * @param total
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * Gets the roundingAmount value for this OrderInformation.
	 * 
	 * @return roundingAmount
	 */
	public String getRoundingAmount() {
		return roundingAmount;
	}

	/**
	 * Sets the roundingAmount value for this OrderInformation.
	 * 
	 * @param roundingAmount
	 */
	public void setRoundingAmount(String roundingAmount) {
		this.roundingAmount = roundingAmount;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(OrderInformation.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"orderInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("acquirerInfo");
		elemField.setXmlName(new QName("", "AcquirerInfo"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("amount");
		elemField.setXmlName(new QName("", "Amount"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("currency");
		elemField.setXmlName(new QName("", "Currency"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("deliveryDate");
		elemField.setXmlName(new QName("", "DeliveryDate"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("fee");
		elemField.setXmlName(new QName("", "Fee"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("orderDescription");
		elemField.setXmlName(new QName("", "OrderDescription"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("orderNumber");
		elemField.setXmlName(new QName("", "OrderNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("timestamp");
		elemField.setXmlName(new QName("", "Timestamp"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("total");
		elemField.setXmlName(new QName("", "Total"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("roundingAmount");
		elemField.setXmlName(new QName("", "RoundingAmount"));
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
