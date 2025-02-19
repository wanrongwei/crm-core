/**
 * QrySpNpImportOrderInfoResponseBodyPortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class QrySpNpImportOrderInfoResponseBodyPortData implements Serializable {
	private String mainNumber;

	private NumberSeries[] numberSeries;

	private String confirmDate;

	private String rejectCode;

	private String rejectMessage;

	private String status;

	public QrySpNpImportOrderInfoResponseBodyPortData() {
	}


	/**
	 * Gets the mainNumber value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @return mainNumber
	 */
	public String getMainNumber() {
		return mainNumber;
	}

	/**
	 * Sets the mainNumber value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @param mainNumber
	 */
	public void setMainNumber(String mainNumber) {
		this.mainNumber = mainNumber;
	}

	/**
	 * Gets the numberSeries value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @return numberSeries
	 */
	public NumberSeries[] getNumberSeries() {
		return numberSeries;
	}

	/**
	 * Sets the numberSeries value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @param numberSeries
	 */
	public void setNumberSeries(NumberSeries[] numberSeries) {
		this.numberSeries = numberSeries;
	}

	public NumberSeries getNumberSeries(int i) {
		return this.numberSeries[i];
	}

	public void setNumberSeries(int i, NumberSeries value) {
		this.numberSeries[i] = value;
	}

	/**
	 * Gets the confirmDate value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @return confirmDate
	 */
	public String getConfirmDate() {
		return confirmDate;
	}

	/**
	 * Sets the confirmDate value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @param confirmDate
	 */
	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
	}

	/**
	 * Gets the rejectCode value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @return rejectCode
	 */
	public String getRejectCode() {
		return rejectCode;
	}

	/**
	 * Sets the rejectCode value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @param rejectCode
	 */
	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}

	/**
	 * Gets the rejectMessage value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @return rejectMessage
	 */
	public String getRejectMessage() {
		return rejectMessage;
	}

	/**
	 * Sets the rejectMessage value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @param rejectMessage
	 */
	public void setRejectMessage(String rejectMessage) {
		this.rejectMessage = rejectMessage;
	}

	/**
	 * Gets the status value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this
	 * QrySpNpImportOrderInfoResponseBodyPortData.
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QrySpNpImportOrderInfoResponseBodyPortData.class, true);

	static {
		typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				">qrySpNpImportOrderInfoResponseBody>PortData"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("mainNumber");
		elemField.setXmlName(new QName("", "MainNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("numberSeries");
		elemField.setXmlName(new QName("", "NumberSeries"));
		elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "NumberSeries"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("confirmDate");
		elemField.setXmlName(new QName("", "ConfirmDate"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("rejectCode");
		elemField.setXmlName(new QName("", "RejectCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("rejectMessage");
		elemField.setXmlName(new QName("", "RejectMessage"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new QName("", "Status"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
	public static Serializer getSerializer(String mechType, Class javaType, QName xmlType) {
		return new BeanSerializer(javaType, xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType, Class javaType, QName xmlType) {
		return new BeanDeserializer(javaType, xmlType, typeDesc);
	}

}
