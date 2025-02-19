package com.asiainfo.crm.cm.hu.customer.service.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.hu.customer.dao.interfaces.ICmPartyHUDAO;
import com.asiainfo.crm.cm.hu.customer.service.interfaces.ICmPartyHUSV;
import com.asiainfo.crm.cm.hu.party.BOCmPartyPermissionBean;
import com.asiainfo.crm.cm.hu.party.IBOCmPartyPermissionValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;

public class CmPartyHUSVImpl implements ICmPartyHUSV {

	private ICmPartyHUDAO getPartyHUDAO() throws Exception {
		return (ICmPartyHUDAO) ServiceFactory.getService(ICmPartyHUDAO.class);
	}

	public DataContainerInterface[] queryUser(long partyId, String partyName, long addressId, String contEmail, String phone, int start, int end) throws Exception {
		if (partyId > 0) {
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(IPartyValue.S_PartyId, partyId);
			IPartyValue[] partyValues = partySV.queryPartys(conditionDC, start, end);
			return (DataContainerInterface[]) partyValues;
		}
		boolean onlyNameQry = false;
		if (addressId <= 0 && StringUtils.isBlank(contEmail) && StringUtils.isBlank(phone)) {
			onlyNameQry = true;
		}
		if (onlyNameQry && StringUtils.isBlank(partyName)) {
			return new DataContainerInterface[0];
		}
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		// party有客户，使用者，员工角色
		sql.append("SELECT T.PARTY_ID,T.CUST_NAME AS PARTY_NAME,T.CUST_CERT_TYPE AS CERT_TYPE,T.CUST_CERT_CODE AS CERT_CODE FROM {CM_INDIV_CUSTOMER} T WHERE 1=1");
		if (StringUtils.isNotBlank(partyName)) {
			sql.append(" AND T.CUST_NAME LIKE :partyName");
			queryParam.put("partyName", partyName + "%");
		}
		if (!onlyNameQry) {
			sql.append(" AND T.CUST_ID IN(SELECT T1.CUST_ID FROM {CM_CUST_CONTACT_MEDIUM} T1 WHERE 1!=1");
			if (addressId > 0) {
				sql.append(" OR T1.ADDRESS_ID = :addressId");
				queryParam.put("addressId", addressId);
			}
			if (StringUtils.isNotBlank(contEmail)) {
				sql.append(" OR T1.EMAIL_ADDRESS = :contEmail");
				queryParam.put("contEmail", contEmail);
			}
			if (StringUtils.isNotBlank(phone)) {
				sql.append(" OR T1.CONT_NUMBER = :phone");
				queryParam.put("phone", phone);
			}
			sql.append(" )");
		}
		sql.append(" UNION ");
		// party只有payer角色，或者联系人角色
		sql.append("SELECT T.PARTY_NAME,T.PARTY_ID,T.CERT_TYPE,T.CERT_CODE FROM {CM_PARTY} T,{CM_PARTY_CONTACT} T1 WHERE T.PARTY_ID = T1.PARTY_ID");
		if (StringUtils.isNotBlank(partyName)) {
			sql.append(" AND T.PARTY_NAME LIKE :partyName");
		}
		if (!onlyNameQry) {
			if (addressId > 0) {
				sql.append(" AND T1.CONT_ADDRESS = :addressId");
			}
			sql.append(" AND T1.CONT_ID IN(SELECT T1.CONT_ID FROM {CM_CONTACT_CONT_MEDIUM} T1 WHERE 1!=1");
			if (StringUtils.isNotBlank(contEmail)) {
				sql.append(" OR T1.EMAIL_ADDRESS = :contEmail");
			}
			if (StringUtils.isNotBlank(phone)) {
				sql.append(" OR T1.CONT_NUMBER = :phone");
			}
			sql.append(" )");
		}
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values == null) {
			values = new DataContainerInterface[0];
		}
		return values;
	}

	public int queryUserCount(long partyId, String partyName, long addressId, String contEmail, String phone) throws Exception {
		int result = 0;
		if (partyId > 0) {
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(IPartyValue.S_PartyId, partyId);
			result = partySV.queryPartyCount(conditionDC);
			return result;
		}
		boolean onlyNameQry = false;
		if (addressId <= 0 && StringUtils.isBlank(contEmail) && StringUtils.isBlank(phone)) {
			onlyNameQry = true;
		}
		if (onlyNameQry && StringUtils.isBlank(partyName)) {
			return result;
		}
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT SUM(TEMP_COUNT) AS RESULT FROM (");
		// party有客户，使用者，员工角色
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_INDIV_CUSTOMER} T WHERE 1=1");
		if (StringUtils.isNotBlank(partyName)) {
			sql.append(" AND T.CUST_NAME LIKE :partyName");
			queryParam.put("partyName", partyName + "%");
		}
		if (!onlyNameQry) {
			sql.append(" AND T.CUST_ID IN(SELECT T1.CUST_ID FROM {CM_CUST_CONTACT_MEDIUM} T1 WHERE 1!=1");
			if (addressId > 0) {
				sql.append(" OR T1.ADDRESS_ID = :addressId");
				queryParam.put("addressId", addressId);
			}
			if (StringUtils.isNotBlank(contEmail)) {
				sql.append(" OR T1.EMAIL_ADDRESS = :contEmail");
				queryParam.put("contEmail", contEmail);
			}
			if (StringUtils.isNotBlank(phone)) {
				sql.append(" OR T1.CONT_NUMBER = :phone");
				queryParam.put("phone", phone);
			}
			sql.append(" )");
		}
		sql.append(" UNION ");
		// party只有payer角色，或者联系人角色
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_PARTY} T,{CM_PARTY_CONTACT} T1 WHERE T.PARTY_ID = T1.PARTY_ID");
		if (StringUtils.isNotBlank(partyName)) {
			sql.append(" AND T.PARTY_NAME LIKE :partyName");
		}
		if (!onlyNameQry) {
			if (addressId > 0) {
				sql.append(" AND T1.CONT_ADDRESS = :addressId");
			}
			sql.append(" AND T1.CONT_ID IN(SELECT T1.CONT_ID FROM {CM_CONTACT_CONT_MEDIUM} T1 WHERE 1!=1");
			if (StringUtils.isNotBlank(contEmail)) {
				sql.append(" OR T1.EMAIL_ADDRESS = :contEmail");
			}
			if (StringUtils.isNotBlank(phone)) {
				sql.append(" OR T1.CONT_NUMBER = :phone");
			}
			sql.append(" )");
		}
		sql.append(" )T2");
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			return values[0].getAsInt("RESULT");
		}
		return result;
	}

	public void savePartyPermission(IBOCmPartyPermissionValue[] partyPermissionValues) throws Exception {
		if (partyPermissionValues != null && partyPermissionValues.length > 0) {
			for (int i = 0; i < partyPermissionValues.length; i++) {
				if (partyPermissionValues[i].isNew()) {
					long relId = partyPermissionValues[i].getRelId();
					if (relId <= 0) {
						relId = CmCommonUtil.getNewSequence(BOCmPartyPermissionBean.class);
						partyPermissionValues[i].setRelId(relId);
						if (StringUtils.isBlank(partyPermissionValues[i].getRegionId())) {
							partyPermissionValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
						}
						partyPermissionValues[i].setState(CmConstants.RecordState.USE);
						partyPermissionValues[i].setStsToNew();
					}
				}
			}
			getPartyHUDAO().savePartyPermission(partyPermissionValues);
		}

	}

	public IBOCmPartyPermissionValue[] queryPartyPermissionByIdAndRole(long partyId, int type, int start, int end) throws Exception {
		if (partyId > 0) {
			StringBuilder condition = new StringBuilder("");
			HashMap parameter = new HashMap();
			condition.append(IBOCmPartyPermissionValue.S_PartyId).append(" =:partyId ");
			parameter.put("partyId", partyId);
			IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData("CM_PERMISSIONG" + "_" + type);
			condition.append(" AND ").append(IBOCmPartyPermissionValue.S_PermissonType).append(" IN(");
			if (staticDataValues != null && staticDataValues.length > 0) {
				for (int i = 0; i < staticDataValues.length; i++) {
					condition.append(":permissionType" + i);
					parameter.put("permissionType" + i, staticDataValues[i].getCodeValue());
					if (i != staticDataValues.length - 1) {
						condition.append(",");
					}
				}
				condition.append(" )");
			}
			IBOCmPartyPermissionValue[] partyPermissionValues = (IBOCmPartyPermissionValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyPermissionBean.class,
					condition.toString(), parameter, start, end);
			if (partyPermissionValues != null && partyPermissionValues.length > 0) {
				String editor = "";
				String delete = "";
				for (int i = 0; i < partyPermissionValues.length; i++) {
					partyPermissionValues[i].setRefreshType(type);
					editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyPermission(" + String.valueOf(partyPermissionValues[i].getRelId()) + "," + i
							+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
					delete = "<a href='javascript:void(0)' class='cellpath' onclick='deletePermission(\"" + String.valueOf(partyPermissionValues[i].getRelId())
							+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
					partyPermissionValues[i].setAction(editor + delete);
				}
				return partyPermissionValues;
			}
		}
		return new IBOCmPartyPermissionValue[0];
	}

	public int queryPartyPermissionCountByIdAndRole(long partyId, int type) throws Exception {
		if (partyId > 0) {
			StringBuilder condition = new StringBuilder("");
			HashMap parameter = new HashMap();
			condition.append(IBOCmPartyPermissionValue.S_PartyId).append(" =:partyId ");
			parameter.put("partyId", partyId);
			IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData("CM_PERMISSIONG" + "_" + type);
			condition.append(" AND ").append(IBOCmPartyPermissionValue.S_PermissonType).append(" IN(");
			if (staticDataValues != null && staticDataValues.length > 0) {
				for (int i = 0; i < staticDataValues.length; i++) {
					condition.append(":permissionType" + i);
					parameter.put("permissionType" + i, staticDataValues[i].getCodeValue());
					if (i != staticDataValues.length - 1) {
						condition.append(",");
					}
				}
				condition.append(" )");
			}
			return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmPartyPermissionBean.class, condition.toString(), parameter);
		}
		return 0;
	}

	public IBOCmPartyPermissionValue queryPartyPermissionById(long relId) throws Exception {
		BOCmPartyPermissionBean bean = new BOCmPartyPermissionBean();
		bean.setRelId(relId);
		return (IBOCmPartyPermissionValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
	}

}
