/**
 * MatchInfoRequestBody.java
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

public class MatchInfoRequestBody implements Serializable {

	// Type metadata
	private static TypeDesc typeDesc = new TypeDesc(MatchInfoRequestBody.class,
			true);

	static {
		typeDesc.setXmlType(new QName(
				"http://soa.ailk.telenor.com/schema/soa/busi",
				"MatchInfoRequestBody"));
		ElementDesc elemField = new ElementDesc();
		elemField.setFieldName("KOEN");
		elemField.setXmlName(new QName("", "KOEN"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("NAVN");
		elemField.setXmlName(new QName("", "NAVN"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("FOEDDTO");
		elemField.setXmlName(new QName("", "FOEDDTO"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("POSTDISTRIKT");
		elemField.setXmlName(new QName("", "POSTDISTRIKT"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("KOMMUNE");
		elemField.setXmlName(new QName("", "KOMMUNE"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("VEJ");
		elemField.setXmlName(new QName("", "VEJ"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("HUSNR");
		elemField.setXmlName(new QName("", "HUSNR"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("ETAGE");
		elemField.setXmlName(new QName("", "ETAGE"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new ElementDesc();
		elemField.setFieldName("SIDEDOER");
		elemField.setXmlName(new QName("", "SIDEDOER"));
		elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema",
				"string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	private String KOEN;

	private String NAVN;

	private String FOEDDTO;

	private String POSTDISTRIKT;

	private String KOMMUNE;

	private String VEJ;

	private String HUSNR;

	private String ETAGE;

	private String SIDEDOER;

	/**
	 * Gets the KOEN value for this MatchInfoRequestBody.
	 * 
	 * @return KOEN
	 */
	public String getKOEN() {
		return KOEN;
	}

	/**
	 * Sets the KOEN value for this MatchInfoRequestBody.
	 * 
	 * @param KOEN
	 */
	public void setKOEN(String KOEN) {
		this.KOEN = KOEN;
	}

	/**
	 * Gets the NAVN value for this MatchInfoRequestBody.
	 * 
	 * @return NAVN
	 */
	public String getNAVN() {
		return NAVN;
	}

	/**
	 * Sets the NAVN value for this MatchInfoRequestBody.
	 * 
	 * @param NAVN
	 */
	public void setNAVN(String NAVN) {
		this.NAVN = NAVN;
	}

	/**
	 * Gets the FOEDDTO value for this MatchInfoRequestBody.
	 * 
	 * @return FOEDDTO
	 */
	public String getFOEDDTO() {
		return FOEDDTO;
	}

	/**
	 * Sets the FOEDDTO value for this MatchInfoRequestBody.
	 * 
	 * @param FOEDDTO
	 */
	public void setFOEDDTO(String FOEDDTO) {
		this.FOEDDTO = FOEDDTO;
	}

	/**
	 * Gets the POSTDISTRIKT value for this MatchInfoRequestBody.
	 * 
	 * @return POSTDISTRIKT
	 */
	public String getPOSTDISTRIKT() {
		return POSTDISTRIKT;
	}

	/**
	 * Sets the POSTDISTRIKT value for this MatchInfoRequestBody.
	 * 
	 * @param POSTDISTRIKT
	 */
	public void setPOSTDISTRIKT(String POSTDISTRIKT) {
		this.POSTDISTRIKT = POSTDISTRIKT;
	}

	/**
	 * Gets the KOMMUNE value for this MatchInfoRequestBody.
	 * 
	 * @return KOMMUNE
	 */
	public String getKOMMUNE() {
		return KOMMUNE;
	}

	/**
	 * Sets the KOMMUNE value for this MatchInfoRequestBody.
	 * 
	 * @param KOMMUNE
	 */
	public void setKOMMUNE(String KOMMUNE) {
		this.KOMMUNE = KOMMUNE;
	}

	/**
	 * Gets the VEJ value for this MatchInfoRequestBody.
	 * 
	 * @return VEJ
	 */
	public String getVEJ() {
		return VEJ;
	}

	/**
	 * Sets the VEJ value for this MatchInfoRequestBody.
	 * 
	 * @param VEJ
	 */
	public void setVEJ(String VEJ) {
		this.VEJ = VEJ;
	}

	/**
	 * Gets the HUSNR value for this MatchInfoRequestBody.
	 * 
	 * @return HUSNR
	 */
	public String getHUSNR() {
		return HUSNR;
	}

	/**
	 * Sets the HUSNR value for this MatchInfoRequestBody.
	 * 
	 * @param HUSNR
	 */
	public void setHUSNR(String HUSNR) {
		this.HUSNR = HUSNR;
	}

	/**
	 * Gets the ETAGE value for this MatchInfoRequestBody.
	 * 
	 * @return ETAGE
	 */
	public String getETAGE() {
		return ETAGE;
	}

	/**
	 * Sets the ETAGE value for this MatchInfoRequestBody.
	 * 
	 * @param ETAGE
	 */
	public void setETAGE(String ETAGE) {
		this.ETAGE = ETAGE;
	}

	/**
	 * Gets the SIDEDOER value for this MatchInfoRequestBody.
	 * 
	 * @return SIDEDOER
	 */
	public String getSIDEDOER() {
		return SIDEDOER;
	}

	/**
	 * Sets the SIDEDOER value for this MatchInfoRequestBody.
	 * 
	 * @param SIDEDOER
	 */
	public void setSIDEDOER(String SIDEDOER) {
		this.SIDEDOER = SIDEDOER;
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
