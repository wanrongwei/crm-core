/**
 * QueryInfoRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cpr;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class QueryInfoRequestBody implements Serializable {

	private String PNR;
	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QueryInfoRequestBody.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"QueryInfoRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("PNR");
		elemField.setXmlName(new QName("", "PNR"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	public QueryInfoRequestBody() {
	}

	public QueryInfoRequestBody(String PNR) {
		this.PNR = PNR;
	}

	/**
	 * Gets the PNR value for this QueryInfoRequestBody.
	 * 
	 * @return PNR
	 */
	public String getPNR() {
		return PNR;
	}

	/**
	 * Sets the PNR value for this QueryInfoRequestBody.
	 * 
	 * @param PNR
	 */
	public void setPNR(String PNR) {
		this.PNR = PNR;
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
