/**
 * PostSubEventRequestBody.java
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

public class PostSubEventRequestBody implements Serializable {
	private CurrentSubEvent[] currentSubEvents;

	public PostSubEventRequestBody() {
	}

	public PostSubEventRequestBody(CurrentSubEvent[] currentSubEvents) {
		this.currentSubEvents = currentSubEvents;
	}

	/**
	 * Gets the currentSubEvents value for this PostSubEventRequestBody.
	 * 
	 * @return currentSubEvents
	 */
	public CurrentSubEvent[] getCurrentSubEvents() {
		return currentSubEvents;
	}

	/**
	 * Sets the currentSubEvents value for this PostSubEventRequestBody.
	 * 
	 * @param currentSubEvents
	 */
	public void setCurrentSubEvents(CurrentSubEvent[] currentSubEvents) {
		this.currentSubEvents = currentSubEvents;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			PostSubEventRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"postSubEventRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("currentSubEvents");
		elemField.setXmlName(new QName("", "CurrentSubEvents"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CurrentSubEvent"));
		elemField.setNillable(false);
		elemField.setItemQName(new QName("", "CurrentSubEvent"));
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
	public static Serializer getSerializer(String mechType, Class _javaType,
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
