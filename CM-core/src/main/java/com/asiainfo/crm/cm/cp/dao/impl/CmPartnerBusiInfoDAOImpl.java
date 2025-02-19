package com.asiainfo.crm.cm.cp.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.cp.bo.QBOCmPartnerInfoEngine;
import com.asiainfo.crm.cm.cp.dao.interfaces.ICmPartnerBusiInfoDAO;
import com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue;

public class CmPartnerBusiInfoDAOImpl implements ICmPartnerBusiInfoDAO {

	public int queryPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String typeDesc) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		if (null != partnerType && !StringUtils.isBlank(partnerType)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_PartnerType
					+ "  = :partnerType ");
			paraMap.put("partnerType", Integer.parseInt(partnerType));
		}
		if (null != partnerTypeDtl && !StringUtils.isBlank(partnerTypeDtl)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_PartnerTypeDtl
					+ "  = :partnerTypeDtl ");
			paraMap.put("partnerTypeDtl", Integer.parseInt(partnerTypeDtl));
		}
		if (null != statusType && !StringUtils.isBlank(statusType)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_StatusType
					+ "  = :statusType ");
			paraMap.put("statusType", Integer.parseInt(statusType));
		}
		if (null != typeDesc && !StringUtils.isBlank(typeDesc)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_TypeDesc
					+ "  = :typeDesc ");
			paraMap.put("typeDesc", typeDesc);
		}
		return QBOCmPartnerInfoEngine.getBeansCount(condition.toString(),
				paraMap);
	}

	public IQBOCmPartnerInfoValue[] queryPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String typeDesc, int start,
			int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		if (null != partnerType && !StringUtils.isBlank(partnerType)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_PartnerType
					+ "  = :partnerType ");
			paraMap.put("partnerType", Integer.parseInt(partnerType));
		}
		if (null != partnerTypeDtl && !StringUtils.isBlank(partnerTypeDtl)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_PartnerTypeDtl
					+ "  = :partnerTypeDtl ");
			paraMap.put("partnerTypeDtl", Integer.parseInt(partnerTypeDtl));
		}
		if (null != statusType && !StringUtils.isBlank(statusType)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_StatusType
					+ "  = :statusType ");
			paraMap.put("statusType", Integer.parseInt(statusType));
		}
		if (null != typeDesc && !StringUtils.isBlank(typeDesc)) {
			condition.append("and " + IQBOCmPartnerInfoValue.S_TypeDesc
					+ "  = :typeDesc ");
			paraMap.put("typeDesc", typeDesc);
		}
		return QBOCmPartnerInfoEngine.getBeans(condition.toString(), paraMap);

	}

}
