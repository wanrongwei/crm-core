/**
 * QueryResponse.java
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

public class QueryResponse implements java.io.Serializable {
	private String merchantId;

	private java.util.Calendar queryFinished;

	private String transactionId;

	public QueryResponse() {
	}

	/**
	 * Gets the merchantId value for this QueryResponse.
	 * 
	 * @return merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * Sets the merchantId value for this QueryResponse.
	 * 
	 * @param merchantId
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * Gets the queryFinished value for this QueryResponse.
	 * 
	 * @return queryFinished
	 */
	public java.util.Calendar getQueryFinished() {
		return queryFinished;
	}

	/**
	 * Sets the queryFinished value for this QueryResponse.
	 * 
	 * @param queryFinished
	 */
	public void setQueryFinished(java.util.Calendar queryFinished) {
		this.queryFinished = queryFinished;
	}

	/**
	 * Gets the transactionId value for this QueryResponse.
	 * 
	 * @return transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets the transactionId value for this QueryResponse.
	 * 
	 * @param transactionId
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QueryResponse.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "queryResponse"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("merchantId");
		elemField.setXmlName(new QName("", "MerchantId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("queryFinished");
		elemField.setXmlName(new QName("", "QueryFinished"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"dateTime"));
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
