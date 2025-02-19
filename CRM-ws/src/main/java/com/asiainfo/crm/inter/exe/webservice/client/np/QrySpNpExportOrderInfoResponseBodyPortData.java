/**
 * QrySpNpExportOrderInfoResponseBodyPortData.java
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

public class QrySpNpExportOrderInfoResponseBodyPortData implements Serializable {
	private String mainNumber;

	private NumberSeries[] numberSeries;

	private String type;

	public QrySpNpExportOrderInfoResponseBodyPortData() {
	}

	/**
	 * Gets the mainNumber value for this
	 * QrySpNpExportOrderInfoResponseBodyPortData.
	 * 
	 * @return mainNumber
	 */
	public String getMainNumber() {
		return mainNumber;
	}

	/**
	 * Sets the mainNumber value for this
	 * QrySpNpExportOrderInfoResponseBodyPortData.
	 * 
	 * @param mainNumber
	 */
	public void setMainNumber(String mainNumber) {
		this.mainNumber = mainNumber;
	}

	/**
	 * Gets the numberSeries value for this
	 * QrySpNpExportOrderInfoResponseBodyPortData.
	 * 
	 * @return numberSeries
	 */
	public NumberSeries[] getNumberSeries() {
		return numberSeries;
	}

	/**
	 * Sets the numberSeries value for this
	 * QrySpNpExportOrderInfoResponseBodyPortData.
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
	 * Gets the type value for this QrySpNpExportOrderInfoResponseBodyPortData.
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type value for this QrySpNpExportOrderInfoResponseBodyPortData.
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QrySpNpExportOrderInfoResponseBodyPortData.class, true);

	static {
		typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				">qrySpNpExportOrderInfoResponseBody>PortData"));
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
		elemField.setFieldName("type");
		elemField.setXmlName(new QName("", "Type"));
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
