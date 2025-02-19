package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces.IBean2XmlSV;

public class Bean2XmlSVImpl implements IBean2XmlSV {

	private transient static Log log = LogFactory.getLog(Bean2XmlSVImpl.class);
	private SimpleDateFormat dft = new SimpleDateFormat("yyyyMMdd");
	private SimpleDateFormat dftMiss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private final static String[] CDATA = { "<![CDATA[", "]]>" };

	// private long expireSecond = 259200L;

	public String getXmlHead(boolean isFully, String sequence) throws Exception {
		log.info("get start............");
		StringBuilder xmlHead = new StringBuilder();
		Date LookupDateTime = new Date();

		// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		xmlHead.append("<?xml version='1.0' encoding='ISO-8859-1' standalone='no'?>");
		xmlHead.append("<TelePhoneSubscriptionList xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>");
		xmlHead.append("<OrganizationName>CCDK</OrganizationName><SerialNumberIdentifier>" + sequence + "</SerialNumberIdentifier>");
		xmlHead.append("<LookupDateTime>" + dftMiss.format(LookupDateTime) + "</LookupDateTime>");
		xmlHead.append("<SubscriptionListOfficialOnlyIndicator>" + wrapCdata(String.valueOf(true)) + "</SubscriptionListOfficialOnlyIndicator>");
		xmlHead.append("<SubscriptionListCompleteIndicator>" + wrapCdata(String.valueOf(isFully))
				+ "</SubscriptionListCompleteIndicator><TelephoneSubscriptionCollection>");
		return xmlHead.toString();
	}

	public String getXmlEnd() {
		StringBuilder xmlEnd = new StringBuilder();
		xmlEnd.append("</TelephoneSubscriptionCollection></TelePhoneSubscriptionList>");
		return xmlEnd.toString();
	}

	public Element createXml(QBOResAddressBean qbo) {
		Date nowDate = new Date();
		Date changeDate = qbo.getCreateDate();
		Calendar c = Calendar.getInstance();
		c.setTime(nowDate);
		c.add(Calendar.DATE, -1);
//		boolean bol = "U".endsWith(qbo.getTelephoSubProtectCode());
		Document document = DocumentHelper.createDocument();
		Element telephoneSubscription = document.addElement("TelephoneSubscription");
		Element telephoneSubscriber = telephoneSubscription.addElement("TelephoneSubscriber");

		Element anonymousPrepaidIndicator = telephoneSubscriber.addElement("AnonymousPrepaidIndicator");
		if (qbo.getAnonymousPrepInd() != null && StringUtils.isNotBlank(qbo.getAnonymousPrepInd())) {
			anonymousPrepaidIndicator.addText(qbo.getAnonymousPrepInd());
		}
		//CDATA
		Element organizationName = telephoneSubscriber.addElement("OrganizationName");
		if (qbo.getOrgnizationName() != null && StringUtils.isNotBlank(qbo.getOrgnizationName())) {
			organizationName.addCDATA(qbo.getOrgnizationName());
		}
		Element personNameStructure = telephoneSubscriber.addElement("PersonNameStructure");
		//父节点PersonNameStructure添加子节点PersonGivenName
		Element personGivenName = personNameStructure.addElement("PersonGivenName");
		if (qbo.getGivenName() != null && StringUtils.isNotBlank(qbo.getGivenName())){
			//PersonGivenName节点值中包含CDATA
			personGivenName.addCDATA(qbo.getGivenName());
		}
		Element personMiddleName = personNameStructure.addElement("PersonMiddleName");
		if (qbo.getMiddleName() != null && StringUtils.isNotBlank(qbo.getMiddleName())){
			personMiddleName.addCDATA(qbo.getMiddleName());
		}
			
//		if (bol) {
//			if (qbo.getMiddleName() != null)
//				personMiddleName.addCDATA(qbo.getMiddleName());
//		}
		Element personSurnameName = personNameStructure.addElement("PersonSurnameName");
		if (qbo.getSurnameName() != null && StringUtils.isNotBlank(qbo.getSurnameName())){
			personSurnameName.addCDATA(qbo.getSurnameName());
		}
			
		//employmentPositionName节点当前给空值
		Element employmentPositionName = telephoneSubscriber.addElement("EmploymentPositionName");		
//		if (qbo.getEmployPositionName() != null) {
//			 employmentPositionName.addText(qbo.getEmployPositionName());
//		}
		Element telephoneSubscriptionAddress = telephoneSubscriber.addElement("TelephoneSubscriptionAddress");
		Element addressComplete = telephoneSubscriptionAddress.addElement("AddressComplete");
		Element addressPostal = addressComplete.addElement("AddressPostal");
		Element addressAccess = addressComplete.addElement("AddressAccess");
		//RES_ADDRESS.EXT1
		Element municipalityCode = addressAccess.addElement("MunicipalityCode");
		if (qbo.getExt1() != null && StringUtils.isNotBlank(qbo.getExt1())) {
			municipalityCode.addCDATA(qbo.getExt1());
		}
		//订单有该值  from AWS
		Element streetCode = addressAccess.addElement("StreetCode");
		if (qbo.getExt2() != null && StringUtils.isNotBlank(qbo.getExt2())) {
			streetCode.addCDATA(qbo.getExt2());
		}
		
		Element streetBuildingIdentifier = addressAccess.addElement("StreetBuildingIdentifier");
		if (qbo.getExt3() != null && StringUtils.isNotBlank(qbo.getExt3())) {
			streetBuildingIdentifier.addCDATA(qbo.getExt3());
		}
		
		Element mailDeliverySublocationIdentifier = addressPostal.addElement("MailDeliverySublocationIdentifier");
		if (qbo.getExt4() != null && StringUtils.isNotBlank(qbo.getExt4())) {
			mailDeliverySublocationIdentifier.addCDATA(qbo.getExt4());
		}
		
		Element streetName = addressPostal.addElement("StreetName");
		if (qbo.getExt5() != null && StringUtils.isNotBlank(qbo.getExt5())) {
			streetName.addCDATA(qbo.getExt5());
		}
		//streetNameForAddressingName待确认
		Element streetNameForAddressingName = addressPostal.addElement("StreetNameForAddressingName");
		if(qbo.getExt6() != null && StringUtils.isNotBlank(qbo.getExt6())){
			streetNameForAddressingName.addText(qbo.getExt6());
		}
		Element streetBuildingIdentifier2 = addressPostal.addElement("StreetBuildingIdentifier");
		if (qbo.getExt7() != null && StringUtils.isNotBlank(qbo.getExt7())) {
			streetBuildingIdentifier2.addCDATA(qbo.getExt7());
		}
		Element floorIdentifier = addressPostal.addElement("FloorIdentifier");
		//add by liaopeng
		if(qbo.getExt8() != null && StringUtils.isNotBlank(qbo.getExt8())){
			floorIdentifier.addCDATA(qbo.getExt8());
		}
		Element suiteIdentifier = addressPostal.addElement("SuiteIdentifier");
		if(qbo.getExt9() != null && StringUtils.isNotBlank(qbo.getExt9())){
			suiteIdentifier.addCDATA(qbo.getExt9());
		}
		Element districtSubdivisionIdentifier = addressPostal.addElement("DistrictSubdivisionIdentifier");
		if (qbo.getExt10() != null && StringUtils.isNotBlank(qbo.getExt10())) {
			districtSubdivisionIdentifier.addCDATA(qbo.getExt10());
		}
		Element postOfficeBoxIdentifier = addressPostal.addElement("PostOfficeBoxIdentifier");
		if (qbo.getExt11() != null && StringUtils.isNotBlank(qbo.getExt11())) {
			postOfficeBoxIdentifier.addCDATA(qbo.getExt11());
		}
		Element postCodeIdentifier = addressPostal.addElement("PostCodeIdentifier");
		if (qbo.getExt12() != null && StringUtils.isNotBlank(qbo.getExt12())) {
			postCodeIdentifier.addCDATA(qbo.getExt12());
		}
		Element districtName =addressPostal.addElement("DistrictName");
		if (qbo.getExt13() != null && StringUtils.isNotBlank(qbo.getExt13())) {
			districtName.addCDATA(qbo.getExt13());
		}
		
		Element careOfName = telephoneSubscriptionAddress.addElement("CareOfName");
		if (qbo.getPhoExt1() != null && StringUtils.isNotBlank(qbo.getPhoExt1())) {
			careOfName.addCDATA(qbo.getPhoExt1());
		}
		////modify by liaopeng -20150617,secondaryPostalLabel目前这个暂且注释掉
//		Element secondaryPostalLabel = telephoneSubscriptionAddress.addElement("SecondaryPostalLabel");
//		Element postalAddressFirstLineText = secondaryPostalLabel.addElement("PostalAddressFirstLineText");
//		if(qbo.getExt14() != null){
//			postalAddressFirstLineText.addText(qbo.getExt14());
//		}
//		Element postalAddressSecondLineText = secondaryPostalLabel.addElement("PostalAddressSecondLineText");
//		if(qbo.getExt15() != null){
//			postalAddressSecondLineText.addText(qbo.getExt15());
//		}
//		Element postalAddressThirdLineText = secondaryPostalLabel.addElement("PostalAddressThirdLineText");
//		if(qbo.getExt16() != null){
//			postalAddressThirdLineText.addText(qbo.getExt16());
//		}
//		Element postalAddressFourthLineText = secondaryPostalLabel.addElement("PostalAddressFourthLineText");
//		if(qbo.getExt17() != null){
//			postalAddressFourthLineText.addText(qbo.getExt17());
//		}
//		Element postalAddressFifthLineText = secondaryPostalLabel.addElement("PostalAddressFifthLineText");
//		if(qbo.getExt18() != null){
//			postalAddressFifthLineText.addText(qbo.getExt18());
//		}
//		Element postalAddressSixthLineText = secondaryPostalLabel.addElement("PostalAddressSixthLineText");
//		if(qbo.getExt19() != null){
//			postalAddressSixthLineText.addText(qbo.getExt19());
//		}
		//N = means show data in directory assistance.
		//U = do not show data in directory 
		Element telephoneSubscriberProtectionCode = telephoneSubscriber.addElement("TelephoneSubscriberProtectionCode");
		if (qbo.getTelephoSubProtectCode() != null && StringUtils.isNotBlank(qbo.getTelephoSubProtectCode())) {
			telephoneSubscriberProtectionCode.addText(qbo.getTelephoSubProtectCode());
		}
		Element specification = telephoneSubscription.addElement("Specification");
		Element danishTelephoneNumberIdentifier = specification.addElement("DanishTelephoneNumberIdentifier");
		if (qbo.getDanishTelephoNumId() != null && StringUtils.isNotBlank(qbo.getDanishTelephoNumId())) {
			danishTelephoneNumberIdentifier.addText(qbo.getDanishTelephoNumId());
		}
		
		//modify by liaopeng -20150617,telephoneNumberRange目前子节点不要 
//		Element telephoneNumberRange = specification.addElement("TelephoneNumberRange");
//		Element danishTelephoneNumberIdentifier2 = telephoneNumberRange.addElement("DanishTelephoneNumberIdentifier");
//		Element telephoneNumberRangeEndIdentifier = telephoneNumberRange.addElement("TelephoneNumberRangeEndIdentifier");
		
		Element specialInfo = specification.addElement("SpecialInfo");
		Element telephoneServiceTypeCode = specialInfo.addElement("TelephoneServiceTypeCode");
		if (qbo.getTelephoSerTypeCode() != null && StringUtils.isNotBlank(qbo.getTelephoSerTypeCode())) {
			telephoneServiceTypeCode.addText(qbo.getTelephoSerTypeCode());
		}
		//telephoneSpecificUsageCode传什么值待确认
		Element telephoneSpecificUsageCode = specialInfo.addElement("TelephoneSpecificUsageCode");
		if (qbo.getTelephoSpecUsageCode() != null && StringUtils.isNotBlank(qbo.getTelephoSpecUsageCode())) {
			telephoneSpecificUsageCode.addCDATA(qbo.getTelephoSpecUsageCode());
		}
		Element furtherUsageConsentIndicator = specialInfo.addElement("FurtherUsageConsentIndicator");
		if (qbo.getPhoExt3() != null && StringUtils.isNotBlank(qbo.getPhoExt3())) {
			furtherUsageConsentIndicator.addText(qbo.getPhoExt3());
		}
		Element furtherUsageConsentText = specialInfo.addElement("FurtherUsageConsentText");
		if (qbo.getPhoExt4() != null && StringUtils.isNotBlank(qbo.getPhoExt4())) {
			furtherUsageConsentText.addText(qbo.getPhoExt4());
		}

		Element transactionInfo = specification.addElement("TransactionInfo");
		Element movementChangeIndicator = transactionInfo.addElement("MovementChangeIndicator");
		movementChangeIndicator.addCDATA(String.valueOf(dft.format(changeDate).equals(dft.format(c.getTime()))));
		Element movementTypeCode = transactionInfo.addElement("MovementTypeCode");
		movementTypeCode.addCDATA("STATUS");
		/*
		 * } else { // 1为在用，0为用户已经删除 if (beanPhon.getStatus().equals("0")) {
		 * movementTypeCode.addText("SLET"); } else {
		 * movementTypeCode.addText("OPRET"); } }
		 */
		Element movementDate = transactionInfo.addElement("MovementDate");
//		movementDate.addText(dft.format(nowDate));
		movementDate.addText(dft.format(qbo.getCreateDate()));
		return telephoneSubscription;
	}

	private String wrapCdata(String orgin) {
		if (StringUtils.isNotBlank(orgin)) {
			return (new StringBuilder(CDATA[0])).append(orgin).append(CDATA[1]).toString();
		} else {
			return "";
		}
	}

}
