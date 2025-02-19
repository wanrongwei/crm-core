/**
 * FraudAnalysis.java
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

public class FraudAnalysis implements java.io.Serializable {
	private String reasons;

	private String score;

	private String status;

	private Boolean approved;

	public FraudAnalysis() {
	}

	/**
	 * Gets the reasons value for this FraudAnalysis.
	 * 
	 * @return reasons
	 */
	public String getReasons() {
		return reasons;
	}

	/**
	 * Sets the reasons value for this FraudAnalysis.
	 * 
	 * @param reasons
	 */
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	/**
	 * Gets the score value for this FraudAnalysis.
	 * 
	 * @return score
	 */
	public String getScore() {
		return score;
	}

	/**
	 * Sets the score value for this FraudAnalysis.
	 * 
	 * @param score
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * Gets the status value for this FraudAnalysis.
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this FraudAnalysis.
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the approved value for this FraudAnalysis.
	 * 
	 * @return approved
	 */
	public Boolean getApproved() {
		return approved;
	}

	/**
	 * Sets the approved value for this FraudAnalysis.
	 * 
	 * @param approved
	 */
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(FraudAnalysis.class, true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi", "fraudAnalysis"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("reasons");
		elemField.setXmlName(new QName("", "Reasons"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("score");
		elemField.setXmlName(new QName("", "Score"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new QName("", "Status"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("approved");
		elemField.setXmlName(new QName("", "Approved"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"boolean"));
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
