/**
 * MobileInformation.java
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

public class MobileInformation implements java.io.Serializable {
	private String launchURL;

	public MobileInformation() {
	}

	/**
	 * Gets the launchURL value for this MobileInformation.
	 * 
	 * @return launchURL
	 */
	public String getLaunchURL() {
		return launchURL;
	}

	/**
	 * Sets the launchURL value for this MobileInformation.
	 * 
	 * @param launchURL
	 */
	public void setLaunchURL(String launchURL) {
		this.launchURL = launchURL;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(MobileInformation.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"mobileInformation"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("launchURL");
		elemField.setXmlName(new QName("", "LaunchURL"));
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
