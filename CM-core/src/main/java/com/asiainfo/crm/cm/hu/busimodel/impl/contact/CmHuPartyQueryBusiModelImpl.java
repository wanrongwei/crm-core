package com.asiainfo.crm.cm.hu.busimodel.impl.contact;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.QBOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.QBOCmOrgPartyBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;

public class CmHuPartyQueryBusiModelImpl extends AbstractPartyQueryBusiModelImpl {

	protected void prepareCondition(DataContainer[] conditionDCs) throws Exception {
		// 准备查询条件
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		// 准备查询条件
		prepareCondition(conditionDCs);
		Map prop = ParamUtil.transferDataContainersToMap(conditionDCs);
		if (!CmCommonUtil.isNotEmptyObject(prop)) {
			// 查询条件{0}不能为空！
			ExceptionUtil.throwBusinessException("CMS0030039", "");
		}
		int partyType = DataType.getAsInt(prop.get(IPartyValue.S_PartyType));
		Class beanClass = null;
		switch (partyType) {
			case CmConstants.PartyType.INDIVIDUAL:
				beanClass = QBOCmIndivPartyBean.class;
				break;
			case CmConstants.PartyType.ORGANIZE:
				beanClass = QBOCmOrgPartyBean.class;
				break;
			default:
				beanClass = BOCmPartyBean.class;
				break;
		}
		return ParamUtil.buildParameter(conditionDCs, beanClass, new String[] {});
	}

	protected DataContainer[] parseCriteria(String criteria) throws Exception {
		return ParamUtil.parseXmlCriteria(criteria);
	}

	public Class getReturnObjectClass() {
		return PartyBean.class;
	}

}
