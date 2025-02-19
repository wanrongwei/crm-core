/**
 * Terminal.java
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

public class Terminal implements Serializable {
	private String autoAuth;

	private String autoSale;

	private String design;

	private String feeList;

	private String language;

	private String layout;

	private String orderDescription;

	private PaymentMethodAction[] paymentMethodActionList;

	private String paymentMethodList;

	private String redirectUrl;

	private String singlePage;

	private String templateData;

	private String vat;

	public Terminal() {
	}

	/**
	 * Gets the autoAuth value for this Terminal.
	 * 
	 * @return autoAuth
	 */
	public String getAutoAuth() {
		return autoAuth;
	}

	/**
	 * Sets the autoAuth value for this Terminal.
	 * 
	 * @param autoAuth
	 */
	public void setAutoAuth(String autoAuth) {
		this.autoAuth = autoAuth;
	}

	/**
	 * Gets the autoSale value for this Terminal.
	 * 
	 * @return autoSale
	 */
	public String getAutoSale() {
		return autoSale;
	}

	/**
	 * Sets the autoSale value for this Terminal.
	 * 
	 * @param autoSale
	 */
	public void setAutoSale(String autoSale) {
		this.autoSale = autoSale;
	}

	/**
	 * Gets the design value for this Terminal.
	 * 
	 * @return design
	 */
	public String getDesign() {
		return design;
	}

	/**
	 * Sets the design value for this Terminal.
	 * 
	 * @param design
	 */
	public void setDesign(String design) {
		this.design = design;
	}

	/**
	 * Gets the feeList value for this Terminal.
	 * 
	 * @return feeList
	 */
	public String getFeeList() {
		return feeList;
	}

	/**
	 * Sets the feeList value for this Terminal.
	 * 
	 * @param feeList
	 */
	public void setFeeList(String feeList) {
		this.feeList = feeList;
	}

	/**
	 * Gets the language value for this Terminal.
	 * 
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language value for this Terminal.
	 * 
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the layout value for this Terminal.
	 * 
	 * @return layout
	 */
	public String getLayout() {
		return layout;
	}

	/**
	 * Sets the layout value for this Terminal.
	 * 
	 * @param layout
	 */
	public void setLayout(String layout) {
		this.layout = layout;
	}

	/**
	 * Gets the orderDescription value for this Terminal.
	 * 
	 * @return orderDescription
	 */
	public String getOrderDescription() {
		return orderDescription;
	}

	/**
	 * Sets the orderDescription value for this Terminal.
	 * 
	 * @param orderDescription
	 */
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	/**
	 * Gets the paymentMethodActionList value for this Terminal.
	 * 
	 * @return paymentMethodActionList
	 */
	public PaymentMethodAction[] getPaymentMethodActionList() {
		return paymentMethodActionList;
	}

	/**
	 * Sets the paymentMethodActionList value for this Terminal.
	 * 
	 * @param paymentMethodActionList
	 */
	public void setPaymentMethodActionList(
			PaymentMethodAction[] paymentMethodActionList) {
		this.paymentMethodActionList = paymentMethodActionList;
	}

	public PaymentMethodAction getPaymentMethodActionList(int i) {
		return this.paymentMethodActionList[i];
	}

	public void setPaymentMethodActionList(int i, PaymentMethodAction value) {
		this.paymentMethodActionList[i] = value;
	}

	/**
	 * Gets the paymentMethodList value for this Terminal.
	 * 
	 * @return paymentMethodList
	 */
	public String getPaymentMethodList() {
		return paymentMethodList;
	}

	/**
	 * Sets the paymentMethodList value for this Terminal.
	 * 
	 * @param paymentMethodList
	 */
	public void setPaymentMethodList(String paymentMethodList) {
		this.paymentMethodList = paymentMethodList;
	}

	/**
	 * Gets the redirectUrl value for this Terminal.
	 * 
	 * @return redirectUrl
	 */
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * Sets the redirectUrl value for this Terminal.
	 * 
	 * @param redirectUrl
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	/**
	 * Gets the singlePage value for this Terminal.
	 * 
	 * @return singlePage
	 */
	public String getSinglePage() {
		return singlePage;
	}

	/**
	 * Sets the singlePage value for this Terminal.
	 * 
	 * @param singlePage
	 */
	public void setSinglePage(String singlePage) {
		this.singlePage = singlePage;
	}

	/**
	 * Gets the templateData value for this Terminal.
	 * 
	 * @return templateData
	 */
	public String getTemplateData() {
		return templateData;
	}

	/**
	 * Sets the templateData value for this Terminal.
	 * 
	 * @param templateData
	 */
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	/**
	 * Gets the vat value for this Terminal.
	 * 
	 * @return vat
	 */
	public String getVat() {
		return vat;
	}

	/**
	 * Sets the vat value for this Terminal.
	 * 
	 * @param vat
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(Terminal.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "terminal"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("autoAuth");
		elemField.setXmlName(new QName("", "AutoAuth"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("autoSale");
		elemField.setXmlName(new QName("", "AutoSale"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("design");
		elemField.setXmlName(new QName("", "Design"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("feeList");
		elemField.setXmlName(new QName("", "FeeList"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("language");
		elemField.setXmlName(new QName("", "Language"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("layout");
		elemField.setXmlName(new QName("", "Layout"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("orderDescription");
		elemField.setXmlName(new QName("", "OrderDescription"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("paymentMethodActionList");
		elemField.setXmlName(new QName("", "PaymentMethodActionList"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"paymentMethodAction"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("paymentMethodList");
		elemField.setXmlName(new QName("", "PaymentMethodList"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("redirectUrl");
		elemField.setXmlName(new QName("", "RedirectUrl"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("singlePage");
		elemField.setXmlName(new QName("", "SinglePage"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("templateData");
		elemField.setXmlName(new QName("", "TemplateData"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("vat");
		elemField.setXmlName(new QName("", "Vat"));
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
