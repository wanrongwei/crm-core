/**
 * CrmNotifyPoaResultRequestBody.java
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

public class CrmNotifyPoaResultRequestBody implements Serializable {
	private String countryCode;

	private String orderId;

	private String telephoneNumber;

	private String resultCode;

	public CrmNotifyPoaResultRequestBody() {
	}

	/**
	 * Gets the countryCode value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @return countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the countryCode value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @param countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Gets the orderId value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @return orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * Sets the orderId value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @param orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * Gets the telephoneNumber value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @return telephoneNumber
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * Sets the telephoneNumber value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @param telephoneNumber
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * Gets the resultCode value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @return resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}

	/**
	 * Sets the resultCode value for this CrmNotifyPoaResultRequestBody.
	 * 
	 * @param resultCode
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			CrmNotifyPoaResultRequestBody.class, true);

	static {
		typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				"crmNotifyPoaResultRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("countryCode");
		elemField.setXmlName(new QName("", "CountryCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("orderId");
		elemField.setXmlName(new QName("", "orderId"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("telephoneNumber");
		elemField.setXmlName(new QName("", "TelephoneNumber"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("resultCode");
		elemField.setXmlName(new QName("", "ResultCode"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
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
