/**
 * QrySpNpExportOrderInfoResponse.java
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

public class QrySpNpExportOrderInfoResponse implements Serializable {
	private QrySpNpExportOrderInfoResponseBodyPortData[] responseBody;

	public QrySpNpExportOrderInfoResponse() {
	}

	public QrySpNpExportOrderInfoResponse(QrySpNpExportOrderInfoResponseBodyPortData[] responseBody) {
		this.responseBody = responseBody;
	}

	/**
	 * Gets the responseBody value for this QrySpNpExportOrderInfoResponse.
	 * 
	 * @return responseBody
	 */
	public QrySpNpExportOrderInfoResponseBodyPortData[] getResponseBody() {
		return responseBody;
	}

	/**
	 * Sets the responseBody value for this QrySpNpExportOrderInfoResponse.
	 * 
	 * @param responseBody
	 */
	public void setResponseBody(QrySpNpExportOrderInfoResponseBodyPortData[] responseBody) {
		this.responseBody = responseBody;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(QrySpNpExportOrderInfoResponse.class, true);

	static {
		typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "qrySpNpExportOrderInfoResponse"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("responseBody");
		elemField.setXmlName(new QName("", "ResponseBody"));
		elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa",
				">qrySpNpExportOrderInfoResponseBody>PortData"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new QName("", "PortData"));
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
	public static Serializer getSerializer(String mechType, Class javaType, QName xmlType) {
		return new BeanSerializer(javaType, xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType, Class javaType, QName xmlType) {
		return new BeanDeserializer(javaType, xmlType, typeDesc);
	}

}
