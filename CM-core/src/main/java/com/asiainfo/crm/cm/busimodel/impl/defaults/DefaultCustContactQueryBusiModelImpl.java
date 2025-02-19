package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractCustContactQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmFamilyCustContactBean;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmGroupCustContactBean;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmIndivCustContactBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public class DefaultCustContactQueryBusiModelImpl extends AbstractCustContactQueryBusiModelImpl {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		prepareCondition(conditionDCs);
		Parameter parameter = null;
		if (CmCommonUtil.isNotEmptyObject(conditionDCs)) {
			Map prop = new HashMap();
			for (int i = 0; i < conditionDCs.length; i++) {
				prop.putAll(conditionDCs[i].getProperties());
			}
			int custType = -1;
			if (prop.containsKey(ICustomerValue.S_CustType)) {
				custType = DataType.getAsInt(prop.get(ICustomerValue.S_CustType));
			}
			switch (custType) {
				case CmConstants.CustomerType.INDIVIDUAL:
					parameter = ParamUtil.buildParameter(prop, QBOCmIndivCustContactBean.class, new String[] { IContactValue.S_PartyName });
					break;
				case CmConstants.CustomerType.FAMILY:
					parameter = ParamUtil.buildParameter(prop, QBOCmFamilyCustContactBean.class, new String[] { IContactValue.S_PartyName });
					break;
				case CmConstants.CustomerType.GROUP:
					parameter = ParamUtil.buildParameter(prop, QBOCmGroupCustContactBean.class, new String[] { IContactValue.S_PartyName });
					break;
				default:
					ExceptionUtil.throwBusinessException("CMS0030012");
					break;
			}
		}
		return parameter;
	}

	protected void prepareCondition(DataContainer[] conditionDCs) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(conditionDCs)) {
			Map prop = new HashMap();
			for (int i = 0; i < conditionDCs.length; i++) {
				prop.putAll(conditionDCs[i].getProperties());
			}
			if (!CmCommonUtil.isNotEmptyObject(prop)) {
				ExceptionUtil.throwBusinessException("");// TODO 联系人查询条件不能为空！
			}
			int custType = -1;
			if (prop.containsKey(ICustomerValue.S_CustType)) {
				custType = DataType.getAsInt(prop.get(ICustomerValue.S_CustType));
			} else if (prop.containsKey(IContactValue.S_CustId)) {
				custType = CmCommonUtil.getCustType(DataType.getAsLong(prop.get(IContactValue.S_CustId)));
			}
			if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custType)) != null) {
				conditionDCs[0].initProperty(ICustomerValue.S_CustType, custType);
			}
		}
	}
}
