/**
 * NetaxeptPaymentInfo.java
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

public class NetaxeptPaymentInfo extends QueryResponse implements
		java.io.Serializable {
	private AuthenticationInformation authenticationInformation;

	private AvtaleGiroInformation avtaleGiroInformation;

	private CardInformation cardInformation;

	private CustomerInformation customerInformation;

	private DnBNorDirectPaymentInformation dnBNorDirectPaymentInformation;

	private PaymentError error;

	private PaymentError[] errorLog;

	private TransactionLogLine[] history;

	private InvoiceInformation invoiceInformation;

	private OrderInformation orderInformation;

	private Recurring recurring;

	private SecurityInformation securityInformation;

	private FinancialSummary summary;

	private TerminalInformation terminalInformation;

	private FraudAnalysis fraudAnalysis;

	private MobileInformation mobile;

	public NetaxeptPaymentInfo() {
	}

	/**
	 * Gets the authenticationInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return authenticationInformation
	 */
	public AuthenticationInformation getAuthenticationInformation() {
		return authenticationInformation;
	}

	/**
	 * Sets the authenticationInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param authenticationInformation
	 */
	public void setAuthenticationInformation(
			AuthenticationInformation authenticationInformation) {
		this.authenticationInformation = authenticationInformation;
	}

	/**
	 * Gets the avtaleGiroInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return avtaleGiroInformation
	 */
	public AvtaleGiroInformation getAvtaleGiroInformation() {
		return avtaleGiroInformation;
	}

	/**
	 * Sets the avtaleGiroInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param avtaleGiroInformation
	 */
	public void setAvtaleGiroInformation(
			AvtaleGiroInformation avtaleGiroInformation) {
		this.avtaleGiroInformation = avtaleGiroInformation;
	}

	/**
	 * Gets the cardInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return cardInformation
	 */
	public CardInformation getCardInformation() {
		return cardInformation;
	}

	/**
	 * Sets the cardInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param cardInformation
	 */
	public void setCardInformation(CardInformation cardInformation) {
		this.cardInformation = cardInformation;
	}

	/**
	 * Gets the customerInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return customerInformation
	 */
	public CustomerInformation getCustomerInformation() {
		return customerInformation;
	}

	/**
	 * Sets the customerInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param customerInformation
	 */
	public void setCustomerInformation(CustomerInformation customerInformation) {
		this.customerInformation = customerInformation;
	}

	/**
	 * Gets the dnBNorDirectPaymentInformation value for this
	 * NetaxeptPaymentInfo.
	 * 
	 * @return dnBNorDirectPaymentInformation
	 */
	public DnBNorDirectPaymentInformation getDnBNorDirectPaymentInformation() {
		return dnBNorDirectPaymentInformation;
	}

	/**
	 * Sets the dnBNorDirectPaymentInformation value for this
	 * NetaxeptPaymentInfo.
	 * 
	 * @param dnBNorDirectPaymentInformation
	 */
	public void setDnBNorDirectPaymentInformation(
			DnBNorDirectPaymentInformation dnBNorDirectPaymentInformation) {
		this.dnBNorDirectPaymentInformation = dnBNorDirectPaymentInformation;
	}

	/**
	 * Gets the error value for this NetaxeptPaymentInfo.
	 * 
	 * @return error
	 */
	public PaymentError getError() {
		return error;
	}

	/**
	 * Sets the error value for this NetaxeptPaymentInfo.
	 * 
	 * @param error
	 */
	public void setError(PaymentError error) {
		this.error = error;
	}

	/**
	 * Gets the errorLog value for this NetaxeptPaymentInfo.
	 * 
	 * @return errorLog
	 */
	public PaymentError[] getErrorLog() {
		return errorLog;
	}

	/**
	 * Sets the errorLog value for this NetaxeptPaymentInfo.
	 * 
	 * @param errorLog
	 */
	public void setErrorLog(PaymentError[] errorLog) {
		this.errorLog = errorLog;
	}

	/**
	 * Gets the history value for this NetaxeptPaymentInfo.
	 * 
	 * @return history
	 */
	public TransactionLogLine[] getHistory() {
		return history;
	}

	/**
	 * Sets the history value for this NetaxeptPaymentInfo.
	 * 
	 * @param history
	 */
	public void setHistory(TransactionLogLine[] history) {
		this.history = history;
	}

	/**
	 * Gets the invoiceInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return invoiceInformation
	 */
	public InvoiceInformation getInvoiceInformation() {
		return invoiceInformation;
	}

	/**
	 * Sets the invoiceInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param invoiceInformation
	 */
	public void setInvoiceInformation(InvoiceInformation invoiceInformation) {
		this.invoiceInformation = invoiceInformation;
	}

	/**
	 * Gets the orderInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return orderInformation
	 */
	public OrderInformation getOrderInformation() {
		return orderInformation;
	}

	/**
	 * Sets the orderInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param orderInformation
	 */
	public void setOrderInformation(OrderInformation orderInformation) {
		this.orderInformation = orderInformation;
	}

	/**
	 * Gets the recurring value for this NetaxeptPaymentInfo.
	 * 
	 * @return recurring
	 */
	public Recurring getRecurring() {
		return recurring;
	}

	/**
	 * Sets the recurring value for this NetaxeptPaymentInfo.
	 * 
	 * @param recurring
	 */
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}

	/**
	 * Gets the securityInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return securityInformation
	 */
	public SecurityInformation getSecurityInformation() {
		return securityInformation;
	}

	/**
	 * Sets the securityInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param securityInformation
	 */
	public void setSecurityInformation(SecurityInformation securityInformation) {
		this.securityInformation = securityInformation;
	}

	/**
	 * Gets the summary value for this NetaxeptPaymentInfo.
	 * 
	 * @return summary
	 */
	public FinancialSummary getSummary() {
		return summary;
	}

	/**
	 * Sets the summary value for this NetaxeptPaymentInfo.
	 * 
	 * @param summary
	 */
	public void setSummary(FinancialSummary summary) {
		this.summary = summary;
	}

	/**
	 * Gets the terminalInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @return terminalInformation
	 */
	public TerminalInformation getTerminalInformation() {
		return terminalInformation;
	}

	/**
	 * Sets the terminalInformation value for this NetaxeptPaymentInfo.
	 * 
	 * @param terminalInformation
	 */
	public void setTerminalInformation(TerminalInformation terminalInformation) {
		this.terminalInformation = terminalInformation;
	}

	/**
	 * Gets the fraudAnalysis value for this NetaxeptPaymentInfo.
	 * 
	 * @return fraudAnalysis
	 */
	public FraudAnalysis getFraudAnalysis() {
		return fraudAnalysis;
	}

	/**
	 * Sets the fraudAnalysis value for this NetaxeptPaymentInfo.
	 * 
	 * @param fraudAnalysis
	 */
	public void setFraudAnalysis(FraudAnalysis fraudAnalysis) {
		this.fraudAnalysis = fraudAnalysis;
	}

	/**
	 * Gets the mobile value for this NetaxeptPaymentInfo.
	 * 
	 * @return mobile
	 */
	public MobileInformation getMobile() {
		return mobile;
	}

	/**
	 * Sets the mobile value for this NetaxeptPaymentInfo.
	 * 
	 * @param mobile
	 */
	public void setMobile(MobileInformation mobile) {
		this.mobile = mobile;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(NetaxeptPaymentInfo.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"netaxeptPaymentInfo"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("authenticationInformation");
		elemField.setXmlName(new QName("", "AuthenticationInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"authenticationInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("avtaleGiroInformation");
		elemField.setXmlName(new QName("", "AvtaleGiroInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"avtaleGiroInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("cardInformation");
		elemField.setXmlName(new QName("", "CardInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"cardInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("customerInformation");
		elemField.setXmlName(new QName("", "CustomerInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"customerInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("dnBNorDirectPaymentInformation");
		elemField.setXmlName(new QName("", "DnBNorDirectPaymentInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"dnBNorDirectPaymentInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("error");
		elemField.setXmlName(new QName("", "Error"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "paymentError"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("errorLog");
		elemField.setXmlName(new QName("", "ErrorLog"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "paymentError"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new QName("", "PaymentError"));
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("history");
		elemField.setXmlName(new QName("", "History"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"transactionLogLine"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new QName("", "TransactionLogLine"));
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("invoiceInformation");
		elemField.setXmlName(new QName("", "InvoiceInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"invoiceInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("orderInformation");
		elemField.setXmlName(new QName("", "OrderInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"orderInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("recurring");
		elemField.setXmlName(new QName("", "Recurring"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "recurring"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("securityInformation");
		elemField.setXmlName(new QName("", "SecurityInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"securityInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("summary");
		elemField.setXmlName(new QName("", "Summary"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"financialSummary"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("terminalInformation");
		elemField.setXmlName(new QName("", "TerminalInformation"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"terminalInformation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("fraudAnalysis");
		elemField.setXmlName(new QName("", "FraudAnalysis"));
		elemField
				.setXmlType(new QName(
						"http://soa.ailk.telenor.com/schema/soa/busi",
						"fraudAnalysis"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("mobile");
		elemField.setXmlName(new QName("", "Mobile"));
		elemField.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"mobileInformation"));
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
