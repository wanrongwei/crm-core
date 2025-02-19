/**
 * CrmOrderFinishedRequest.java
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

public class CrmOrderFinishedRequest implements Serializable {
	private CrmOrderFinishedRequestBody requestBody;

	public CrmOrderFinishedRequest() {
	}

	/**
	 * Gets the requestBody value for this CrmOrderFinishedRequest.
	 * 
	 * @return requestBody
	 */
	public CrmOrderFinishedRequestBody getRequestBody() {
		return requestBody;
	}

	/**
	 * Sets the requestBody value for this CrmOrderFinishedRequest.
	 * 
	 * @param requestBody
	 */
	public void setRequestBody(CrmOrderFinishedRequestBody requestBody) {
		this.requestBody = requestBody;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			CrmOrderFinishedRequest.class, true);

	static {
		typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				">crmOrderFinishedRequest"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("requestBody");
		elemField.setXmlName(new QName("", "RequestBody"));
		elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				"crmOrderFinishedRequestBody"));
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
