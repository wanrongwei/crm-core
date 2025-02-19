/**
 * QueryInfoResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cpr;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class QueryInfoResponseBody implements Serializable {

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(
			QueryInfoResponseBody.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"QueryInfoResponseBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("KUNDENR");
		elemField.setXmlName(new QName("", "KUNDENR"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("ABON_TYPE");
		elemField.setXmlName(new QName("", "ABON_TYPE"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("DATA_TYPE");
		elemField.setXmlName(new QName("", "DATA_TYPE"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("TOKEN");
		elemField.setXmlName(new QName("", "TOKEN"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("USERID");
		elemField.setXmlName(new QName("", "USERID"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("FEJLNR");
		elemField.setXmlName(new QName("", "FEJLNR"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("LENGTH");
		elemField.setXmlName(new QName("", "LENGTH"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("DATA");
		elemField.setXmlName(new QName("", "DATA"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	private String KUNDENR;

	private String ABON_TYPE;

	private String DATA_TYPE;

	private String TOKEN;

	private String USERID;

	private String FEJLNR;

	private String LENGTH;

	private String DATA;

	public QueryInfoResponseBody() {
	}

	public QueryInfoResponseBody(String KUNDENR, String ABON_TYPE,
			String DATA_TYPE, String TOKEN, String USERID, String FEJLNR,
			String LENGTH, String DATA) {
		this.KUNDENR = KUNDENR;
		this.ABON_TYPE = ABON_TYPE;
		this.DATA_TYPE = DATA_TYPE;
		this.TOKEN = TOKEN;
		this.USERID = USERID;
		this.FEJLNR = FEJLNR;
		this.LENGTH = LENGTH;
		this.DATA = DATA;
	}

	/**
	 * Gets the KUNDENR value for this QueryInfoResponseBody.
	 * 
	 * @return KUNDENR
	 */
	public String getKUNDENR() {
		return KUNDENR;
	}

	/**
	 * Sets the KUNDENR value for this QueryInfoResponseBody.
	 * 
	 * @param KUNDENR
	 */
	public void setKUNDENR(String KUNDENR) {
		this.KUNDENR = KUNDENR;
	}

	/**
	 * Gets the ABON_TYPE value for this QueryInfoResponseBody.
	 * 
	 * @return ABON_TYPE
	 */
	public String getABON_TYPE() {
		return ABON_TYPE;
	}

	/**
	 * Sets the ABON_TYPE value for this QueryInfoResponseBody.
	 * 
	 * @param ABON_TYPE
	 */
	public void setABON_TYPE(String ABON_TYPE) {
		this.ABON_TYPE = ABON_TYPE;
	}

	/**
	 * Gets the DATA_TYPE value for this QueryInfoResponseBody.
	 * 
	 * @return DATA_TYPE
	 */
	public String getDATA_TYPE() {
		return DATA_TYPE;
	}

	/**
	 * Sets the DATA_TYPE value for this QueryInfoResponseBody.
	 * 
	 * @param DATA_TYPE
	 */
	public void setDATA_TYPE(String DATA_TYPE) {
		this.DATA_TYPE = DATA_TYPE;
	}

	/**
	 * Gets the TOKEN value for this QueryInfoResponseBody.
	 * 
	 * @return TOKEN
	 */
	public String getTOKEN() {
		return TOKEN;
	}

	/**
	 * Sets the TOKEN value for this QueryInfoResponseBody.
	 * 
	 * @param TOKEN
	 */
	public void setTOKEN(String TOKEN) {
		this.TOKEN = TOKEN;
	}

	/**
	 * Gets the USERID value for this QueryInfoResponseBody.
	 * 
	 * @return USERID
	 */
	public String getUSERID() {
		return USERID;
	}

	/**
	 * Sets the USERID value for this QueryInfoResponseBody.
	 * 
	 * @param USERID
	 */
	public void setUSERID(String USERID) {
		this.USERID = USERID;
	}

	/**
	 * Gets the FEJLNR value for this QueryInfoResponseBody.
	 * 
	 * @return FEJLNR
	 */
	public String getFEJLNR() {
		return FEJLNR;
	}

	/**
	 * Sets the FEJLNR value for this QueryInfoResponseBody.
	 * 
	 * @param FEJLNR
	 */
	public void setFEJLNR(String FEJLNR) {
		this.FEJLNR = FEJLNR;
	}

	/**
	 * Gets the LENGTH value for this QueryInfoResponseBody.
	 * 
	 * @return LENGTH
	 */
	public String getLENGTH() {
		return LENGTH;
	}

	/**
	 * Sets the LENGTH value for this QueryInfoResponseBody.
	 * 
	 * @param LENGTH
	 */
	public void setLENGTH(String LENGTH) {
		this.LENGTH = LENGTH;
	}

	/**
	 * Gets the DATA value for this QueryInfoResponseBody.
	 * 
	 * @return DATA
	 */
	public String getDATA() {
		return DATA;
	}

	/**
	 * Sets the DATA value for this QueryInfoResponseBody.
	 * 
	 * @param DATA
	 */
	public void setDATA(String DATA) {
		this.DATA = DATA;
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
