/**
 * QrySpNpExportOrderInfoRequestBody.java
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

public class QrySpNpExportOrderInfoRequestBody implements Serializable {
	private String dataFrom;

	private String dataTo;

	private String CPSCode;

	public QrySpNpExportOrderInfoRequestBody() {
	}

	/**
	 * Gets the dataFrom value for this QrySpNpExportOrderInfoRequestBody.
	 * 
	 * @return dataFrom
	 */
	public String getDataFrom() {
		return dataFrom;
	}

	/**
	 * Sets the dataFrom value for this QrySpNpExportOrderInfoRequestBody.
	 * 
	 * @param dataFrom
	 */
	public void setDataFrom(String dataFrom) {
		this.dataFrom = dataFrom;
	}

	/**
	 * Gets the dataTo value for this QrySpNpExportOrderInfoRequestBody.
	 * 
	 * @return dataTo
	 */
	public String getDataTo() {
		return dataTo;
	}

	/**
	 * Sets the dataTo value for this QrySpNpExportOrderInfoRequestBody.
	 * 
	 * @param dataTo
	 */
	public void setDataTo(String dataTo) {
		this.dataTo = dataTo;
	}

	/**
	 * Gets the CPSCode value for this QrySpNpExportOrderInfoRequestBody.
	 * 
	 * @return CPSCode
	 */
	public String getCPSCode() {
		return CPSCode;
	}

	/**
	 * Sets the CPSCode value for this QrySpNpExportOrderInfoRequestBody.
	 * 
	 * @param CPSCode
	 */
	public void setCPSCode(String CPSCode) {
		this.CPSCode = CPSCode;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QrySpNpExportOrderInfoRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				"qrySpNpExportOrderInfoRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("dataFrom");
		elemField.setXmlName(new QName("", "DataFrom"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("dataTo");
		elemField.setXmlName(new QName("", "DataTo"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("CPSCode");
		elemField.setXmlName(new QName("", "CPSCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
