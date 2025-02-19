package com.asiainfo.crm.cm.busimodel.impl.party;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;

public abstract class AbstractPartyContactQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IQueryDataByIdBusiModel,
		IMaskBusiModel {

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.PARTY_LOG);
	}

	public final DataContainerInterface queryDataById(long objectId) throws Exception {
		BOCmPartyContactBean conditionDC = new BOCmPartyContactBean();
		conditionDC.setContId(objectId);
		Parameter parameter = buildParameter(new DataContainer[] { conditionDC });
		if (parameter == null) {
			parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDC }, BOCmPartyContactBean.class);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmPartyContactBean.class);
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		DataContainerInterface[] innerPartyContactValues = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(innerPartyContactValues)) {
			PartyContactBean bean = new PartyContactBean();
			bean.copy(innerPartyContactValues[0]);
			// 模糊化处理敏感信息
			mask(bean);
			return bean;
		}
		return null;
	}
	
	protected Class getReturnObjectClass() {
		return PartyContactBean.class;
	}

}
