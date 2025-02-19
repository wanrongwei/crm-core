/**
 * Order.java
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

public class Order implements Serializable {
	private String orderNumber;

	private String currencyCode;

	private String amount;

	private String force3DSecure;

	private String updateStoredPaymentInfo;

	private String deliveryDate;

	public Order() {
	}

	/**
	 * Gets the orderNumber value for this Order.
	 * 
	 * @return orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the orderNumber value for this Order.
	 * 
	 * @param orderNumber
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Gets the currencyCode value for this Order.
	 * 
	 * @return currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Sets the currencyCode value for this Order.
	 * 
	 * @param currencyCode
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets the amount value for this Order.
	 * 
	 * @return amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * Sets the amount value for this Order.
	 * 
	 * @param amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * Gets the force3DSecure value for this Order.
	 * 
	 * @return force3DSecure
	 */
	public String getForce3DSecure() {
		return force3DSecure;
	}

	/**
	 * Sets the force3DSecure value for this Order.
	 * 
	 * @param force3DSecure
	 */
	public void setForce3DSecure(String force3DSecure) {
		this.force3DSecure = force3DSecure;
	}

	/**
	 * Gets the updateStoredPaymentInfo value for this Order.
	 * 
	 * @return updateStoredPaymentInfo
	 */
	public String getUpdateStoredPaymentInfo() {
		return updateStoredPaymentInfo;
	}

	/**
	 * Sets the updateStoredPaymentInfo value for this Order.
	 * 
	 * @param updateStoredPaymentInfo
	 */
	public void setUpdateStoredPaymentInfo(String updateStoredPaymentInfo) {
		this.updateStoredPaymentInfo = updateStoredPaymentInfo;
	}

	/**
	 * Gets the deliveryDate value for this Order.
	 * 
	 * @return deliveryDate
	 */
	public String getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * Sets the deliveryDate value for this Order.
	 * 
	 * @param deliveryDate
	 */
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(Order.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "order"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("orderNumber");
		elemField.setXmlName(new QName("", "OrderNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("currencyCode");
		elemField.setXmlName(new QName("", "CurrencyCode"));
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
		elemField.setFieldName("force3DSecure");
		elemField.setXmlName(new QName("", "Force3DSecure"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("updateStoredPaymentInfo");
		elemField.setXmlName(new QName("", "UpdateStoredPaymentInfo"));
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
