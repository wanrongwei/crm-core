/**
 * AvtaleGiroInformation.java
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

public class AvtaleGiroInformation implements java.io.Serializable {
	private String avtaleGiroStatus;

	public AvtaleGiroInformation() {
	}

	/**
	 * Gets the avtaleGiroStatus value for this AvtaleGiroInformation.
	 * 
	 * @return avtaleGiroStatus
	 */
	public String getAvtaleGiroStatus() {
		return avtaleGiroStatus;
	}

	/**
	 * Sets the avtaleGiroStatus value for this AvtaleGiroInformation.
	 * 
	 * @param avtaleGiroStatus
	 */
	public void setAvtaleGiroStatus(String avtaleGiroStatus) {
		this.avtaleGiroStatus = avtaleGiroStatus;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			AvtaleGiroInformation.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"avtaleGiroInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("avtaleGiroStatus");
		elemField.setXmlName(new QName("", "AvtaleGiroStatus"));
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
