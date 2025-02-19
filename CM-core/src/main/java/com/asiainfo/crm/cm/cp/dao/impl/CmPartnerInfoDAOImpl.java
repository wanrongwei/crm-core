package com.asiainfo.crm.cm.cp.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.cp.bo.BOCmAgentPartnerInfoEngine;
import com.asiainfo.crm.cm.cp.bo.BOCmPartnerInfoEngine;
import com.asiainfo.crm.cm.cp.dao.interfaces.ICmPartnerInfoDAO;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue;


public class CmPartnerInfoDAOImpl implements ICmPartnerInfoDAO {

	public int queryPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String siIntroNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(" 1=1 ");
		if (null != partnerType && !StringUtils.isBlank(partnerType)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_PartnerType
					+ "  = :partnerType ");
			paraMap.put("partnerType", Integer.parseInt(partnerType));
		}
		if (null != partnerTypeDtl && !StringUtils.isBlank(partnerTypeDtl)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_PartnerTypeDtl
					+ "  = :partnerTypeDtl ");
			paraMap.put("partnerTypeDtl", Integer.parseInt(partnerTypeDtl));
		}
		if (null != statusType && !StringUtils.isBlank(statusType)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_StatusType
					+ "  = :statusType ");
			paraMap.put("statusType", Integer.parseInt(statusType));
		}
		if (null != siIntroNum && !StringUtils.isBlank(siIntroNum)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_SiIntroNum
					+ "  = :siIntroNum ");
			paraMap.put("siIntroNum", siIntroNum);
		}
		return BOCmPartnerInfoEngine.getBeansCount(condition.toString(),
				paraMap);
	}

	public IBOCmPartnerInfoValue[] queryPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String siIntroNum,
			int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(" 1=1 ");
		if (null != partnerType && !StringUtils.isBlank(partnerType)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_PartnerType
					+ "  = :partnerType ");
			paraMap.put("partnerType", Integer.parseInt(partnerType));
		}
		if (null != partnerTypeDtl && !StringUtils.isBlank(partnerTypeDtl)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_PartnerTypeDtl
					+ "  = :partnerTypeDtl ");
			paraMap.put("partnerTypeDtl", Integer.parseInt(partnerTypeDtl));
		}
		if (null != statusType && !StringUtils.isBlank(statusType)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_StatusType
					+ "  = :statusType ");
			paraMap.put("statusType", Integer.parseInt(statusType));
		}
		if (null != siIntroNum && !StringUtils.isBlank(siIntroNum)) {
			condition.append("and " + IBOCmPartnerInfoValue.S_SiIntroNum
					+ "  = :siIntroNum ");
			paraMap.put("siIntroNum", siIntroNum);
		}
		return BOCmPartnerInfoEngine.getBeans(condition.toString(), paraMap);
	}

	public IBOCmAgentPartnerInfoValue[] findPartnerAndAgent(String partner,
			String channel, String city) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(" 1=1 ");
		if (null != partner && !StringUtils.isBlank(partner)) {
			condition.append("and " + IBOCmAgentPartnerInfoValue.S_PartnerOrgId
					+ "  = :partner ");
			paraMap.put("partner", Integer.parseInt(partner));
		}
		if (null != channel && !StringUtils.isBlank(channel)) {
			condition.append("and " + IBOCmAgentPartnerInfoValue.S_ChannelId
					+ "  = :channel ");
			paraMap.put("channel", Integer.parseInt(channel));
		}
		if (null != city && !StringUtils.isBlank(city)) {
			condition.append("and " + IBOCmAgentPartnerInfoValue.S_ChannelCity
					+ "  = :city ");
			paraMap.put("city", Integer.parseInt(city));
		}
		return BOCmAgentPartnerInfoEngine.getBeans(condition.toString(), paraMap);
	}

}
