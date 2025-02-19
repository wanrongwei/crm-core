/**
 * Recurring.java
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

public class Recurring implements Serializable {
	private String type;

	private String frequency;

	private String expiryDate;

	private String panHash;

	public Recurring() {
	}

	/**
	 * Gets the type value for this Recurring.
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type value for this Recurring.
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the frequency value for this Recurring.
	 * 
	 * @return frequency
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * Sets the frequency value for this Recurring.
	 * 
	 * @param frequency
	 */
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	/**
	 * Gets the expiryDate value for this Recurring.
	 * 
	 * @return expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Sets the expiryDate value for this Recurring.
	 * 
	 * @param expiryDate
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * Gets the panHash value for this Recurring.
	 * 
	 * @return panHash
	 */
	public String getPanHash() {
		return panHash;
	}

	/**
	 * Sets the panHash value for this Recurring.
	 * 
	 * @param panHash
	 */
	public void setPanHash(String panHash) {
		this.panHash = panHash;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(Recurring.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "recurring"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new QName("", "Type"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("frequency");
		elemField.setXmlName(new QName("", "Frequency"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("expiryDate");
		elemField.setXmlName(new QName("", "ExpiryDate"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("panHash");
		elemField.setXmlName(new QName("", "PanHash"));
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
