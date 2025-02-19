/**
 * CreateProResponseBody.java
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

public class CreateProResponseBody implements Serializable {
	private String id;

	private String name;

	private String RETURN_CODE;

	private String RETURN_MSG;

	public CreateProResponseBody() {
	}

	public CreateProResponseBody(String id, String name, String RETURN_CODE,
			String RETURN_MSG) {
		this.id = id;
		this.name = name;
		this.RETURN_CODE = RETURN_CODE;
		this.RETURN_MSG = RETURN_MSG;
	}

	/**
	 * Gets the id value for this CreateProResponseBody.
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id value for this CreateProResponseBody.
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name value for this CreateProResponseBody.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name value for this CreateProResponseBody.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the RETURN_CODE value for this CreateProResponseBody.
	 * 
	 * @return RETURN_CODE
	 */
	public String getRETURN_CODE() {
		return RETURN_CODE;
	}

	/**
	 * Sets the RETURN_CODE value for this CreateProResponseBody.
	 * 
	 * @param RETURN_CODE
	 */
	public void setRETURN_CODE(String RETURN_CODE) {
		this.RETURN_CODE = RETURN_CODE;
	}

	/**
	 * Gets the RETURN_MSG value for this CreateProResponseBody.
	 * 
	 * @return RETURN_MSG
	 */
	public String getRETURN_MSG() {
		return RETURN_MSG;
	}

	/**
	 * Sets the RETURN_MSG value for this CreateProResponseBody.
	 * 
	 * @param RETURN_MSG
	 */
	public void setRETURN_MSG(String RETURN_MSG) {
		this.RETURN_MSG = RETURN_MSG;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			CreateProResponseBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/Campaign/",
				"CreateProResponseBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new QName("", "id"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new QName("", "name"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("RETURN_CODE");
		elemField.setXmlName(new QName("", "RETURN_CODE"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("RETURN_MSG");
		elemField.setXmlName(new QName("", "RETURN_MSG"));
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
