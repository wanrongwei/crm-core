/**
 * CurrentSubEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.campaign;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CurrentSubEvent implements Serializable {
	private String subscriberId;

	private String eventCd;

	private String eventDttm;

	private BigDecimal eventValueAmt;

	public CurrentSubEvent() {
	}

	public CurrentSubEvent(String subscriberId, String eventCd, String eventDttm,
			BigDecimal eventValueAmt) {
		this.subscriberId = subscriberId;
		this.eventCd = eventCd;
		this.eventDttm = eventDttm;
		this.eventValueAmt = eventValueAmt;
	}

	/**
	 * Gets the subscriberId value for this CurrentSubEvent.
	 * 
	 * @return subscriberId
	 */
	public String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * Sets the subscriberId value for this CurrentSubEvent.
	 * 
	 * @param subscriberId
	 */
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	/**
	 * Gets the eventCd value for this CurrentSubEvent.
	 * 
	 * @return eventCd
	 */
	public String getEventCd() {
		return eventCd;
	}

	/**
	 * Sets the eventCd value for this CurrentSubEvent.
	 * 
	 * @param eventCd
	 */
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}

	/**
	 * Gets the eventDttm value for this CurrentSubEvent.
	 * 
	 * @return eventDttm
	 */
	public String getEventDttm() {
		return eventDttm;
	}

	/**
	 * Sets the eventDttm value for this CurrentSubEvent.
	 * 
	 * @param eventDttm
	 */
	public void setEventDttm(String eventDttm) {
		this.eventDttm = eventDttm;
	}

	/**
	 * Gets the eventValueAmt value for this CurrentSubEvent.
	 * 
	 * @return eventValueAmt
	 */
	public BigDecimal getEventValueAmt() {
		return eventValueAmt;
	}

	/**
	 * Sets the eventValueAmt value for this CurrentSubEvent.
	 * 
	 * @param eventValueAmt
	 */
	public void setEventValueAmt(BigDecimal eventValueAmt) {
		this.eventValueAmt = eventValueAmt;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(CurrentSubEvent.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CurrentSubEvent"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("subscriberId");
		elemField.setXmlName(new QName("", "SubscriberId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("eventCd");
		elemField.setXmlName(new QName("", "EventCd"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("eventDttm");
		elemField.setXmlName(new QName("", "EventDttm"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("eventValueAmt");
		elemField.setXmlName(new QName("", "EventValueAmt"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"decimal"));
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
