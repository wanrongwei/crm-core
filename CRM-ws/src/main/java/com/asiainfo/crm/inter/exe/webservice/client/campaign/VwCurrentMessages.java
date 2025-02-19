/**
 * VwCurrentMessages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class VwCurrentMessages implements Serializable {
	private VwCurrentMessage vwCurrentMessage;

	public VwCurrentMessages() {
	}

	public VwCurrentMessages(VwCurrentMessage vwCurrentMessage) {
		this.vwCurrentMessage = vwCurrentMessage;
	}

	/**
	 * Gets the vwCurrentMessage value for this VwCurrentMessages.
	 * 
	 * @return vwCurrentMessage
	 */
	public VwCurrentMessage getVwCurrentMessage() {
		return vwCurrentMessage;
	}

	/**
	 * Sets the vwCurrentMessage value for this VwCurrentMessages.
	 * 
	 * @param vwCurrentMessage
	 */
	public void setVwCurrentMessage(VwCurrentMessage vwCurrentMessage) {
		this.vwCurrentMessage = vwCurrentMessage;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(VwCurrentMessages.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"VwCurrentMessages"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("vwCurrentMessage");
		elemField.setXmlName(new QName("", "VwCurrentMessage"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"VwCurrentMessage"));
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
	public Serializer getSerializer(String mechType, Class _javaType,
			QName _xmlType) {
		return new BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType,
			Class _javaType, QName _xmlType) {
		return new BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
