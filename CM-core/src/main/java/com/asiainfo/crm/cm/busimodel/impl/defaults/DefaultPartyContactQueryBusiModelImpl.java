package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyContactQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;

public class DefaultPartyContactQueryBusiModelImpl extends AbstractPartyContactQueryBusiModelImpl {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Map prop = ParamUtil.transferDataContainersToMap(conditionDCs);
		if (!CmCommonUtil.isNotEmptyObject(prop)) {
			// 查询条件{0}不能为空！
			ExceptionUtil.throwBusinessException("CMS0030039", "");
		}
		return ParamUtil.buildParameter(prop, BOCmPartyContactBean.class);
	}

}
