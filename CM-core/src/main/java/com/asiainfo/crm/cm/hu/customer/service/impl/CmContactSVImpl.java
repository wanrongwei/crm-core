package com.asiainfo.crm.cm.hu.customer.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.hu.customer.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumPojoBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmContactContMediumInfoBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;

public class CmContactSVImpl implements ICmContactSV {

	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfo(long contId, long mediumType, long upMediumType, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (contId > 0) {
			condition.append(" AND ").append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}
		if (mediumType > 0) {
			condition.append(" AND ").append(IQBOCmContactContMediumInfoValue.S_ContMedTypeId).append(" = :mediumType ");
			paraMap.put("mediumType", Long.valueOf(mediumType));
		}
		if (upMediumType > 0) {
			condition.append(" AND ").append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" = :upMediumType ");
			paraMap.put("upMediumType", Long.valueOf(upMediumType));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap, start, end);
		IQBOCmContactContMediumInfoValue[] contMediums = (IQBOCmContactContMediumInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmContactContMediumInfoBean.class, sql, paraMap);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IQBOCmContactContMediumInfoValue[0];
	}

	public int queryContactContMediumCount(long contId, long mediumType, long upMediumType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (contId > 0) {
			condition.append(" AND ").append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}
		if (mediumType > 0) {
			condition.append(" AND ").append(IQBOCmContactContMediumInfoValue.S_ContMedTypeId).append(" = :mediumType ");
			paraMap.put("mediumType", Long.valueOf(mediumType));
		}
		if (upMediumType > 0) {
			condition.append(" AND ").append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" = :upMediumType ");
			paraMap.put("upMediumType", Long.valueOf(upMediumType));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicCountSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}

	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoForPage(long contId, long mediumType, long upMediumType, int start, int end) throws Exception {
		IQBOCmContactContMediumInfoValue[] mediums = queryContactContMediumInfo(contId, mediumType, upMediumType, start, end);
		if (null != mediums && mediums.length > 0) {
			String editor = "";
			String delete = "";
			for (int i = 0; i < mediums.length; i++) {
				editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(mediums[i].getAddressId()) + ","
						+ String.valueOf(mediums[i].getContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
						+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(mediums[i].getContRelaId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				mediums[i].setAction(editor + delete);
				mediums[i].setContMedTypeName(String.valueOf(mediums[i].getContMedTypeId()));
				if (mediums[i].getEmailAddress() == null) {
					mediums[i].setEmailAddress(mediums[i].getContNumber());
				}
			}
			return mediums;
		}

		return new IQBOCmContactContMediumInfoValue[0];
	}

	public IBOCmContactContMediumPojoValue queryContMediumById(long contRelaId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmContactContMediumPojoValue.S_ContRelaId).append(" = :contRelaId ");
		paraMap.put("contRelaId", Long.valueOf(contRelaId));
		IBOCmContactContMediumPojoValue[] results = (IBOCmContactContMediumPojoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmContactContMediumPojoBean.class,
				condition.toString(), paraMap, -1, -1);
		if (results != null && results.length > 0) {
			return results[0];
		}
		return null;
	}

	public DataContainerInterface queryIndivContactById(long partyId, long custContId) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		DataContainer cond = new DataContainer();
		cond.set(IPartyValue.S_PartyId, Long.valueOf(partyId));
		cond.set(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
		DataContainerInterface[] indivContact = busiModelImpl.queryData(new DataContainer[] { cond }, -1, -1);

		// 查询联系人关系表信息
		com.asiainfo.crm.cm.service.interfaces.ICmContactSV contactSV = (com.asiainfo.crm.cm.service.interfaces.ICmContactSV) ServiceFactory
				.getService(com.asiainfo.crm.cm.service.interfaces.ICmContactSV.class);
		IBOCmIndivContactValue indivContactValue = contactSV.queryIndivContactByCustContId(custContId);
		if (indivContactValue != null && indivContact != null && indivContact.length > 0) {
			indivContact[0].set("CONT_TYPE", indivContactValue.getContType());
			indivContact[0].set("PRIORY_LEVEL", indivContactValue.getPrioryLevel());
			indivContact[0].set("CUST_ID", indivContactValue.getCustId());
			indivContact[0].set("CONT_ID", indivContactValue.getContId());
			indivContact[0].set("CUST_CONT_ID", indivContactValue.getCustContId());
		}

		// 查询认证信息表
		ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		IBOIdentificationValue[] identificationValues = dkCustomerSV.queryCustIdentifications(partyId, -1, null);
		if (identificationValues != null && identificationValues.length > 0) {
			for (int i = 0; i < identificationValues.length; i++) {
				if (identificationValues[i].getIdenType() == CmConstants.CustIdenType.PRIMARY_ID_TYPE) {
					indivContact[0].set("PRIMARY_ID_TYPE", identificationValues[i].getIdenSubType());
					indivContact[0].set("PRIMARTY_ID_NUMBER", identificationValues[i].getIdenNr());
				} else if (identificationValues[i].getIdenType() == CmConstants.CustIdenType.SECONDARY_ID_TYPE) {
					indivContact[0].set("SECONDARY_ID_TYPE", identificationValues[i].getIdenSubType());
					indivContact[0].set("SECONDARY_ID_NUMBER", identificationValues[i].getIdenNr());
				}
			}
		}
		DataContainerInterface result = null;
		if (CmCommonUtil.isNotEmptyObject(indivContact)) {
			result = indivContact[0];
		}
		return result;
	}

}
