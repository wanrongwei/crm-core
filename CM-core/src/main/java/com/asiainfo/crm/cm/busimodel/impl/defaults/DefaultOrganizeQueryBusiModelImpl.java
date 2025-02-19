package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.manager.AbstractOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmMgrOrgRelBean;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmOrganizeBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class DefaultOrganizeQueryBusiModelImpl extends AbstractOrganizeQueryBusiModelImpl {

	protected Parameter buildParameter(DataContainer[] parsedCriteria) throws Exception {
		Map paraMap = ParamUtil.transferDataContainersToMap(parsedCriteria);
		Parameter parameter = ParamUtil.buildParameter(paraMap, BOCmOrganizeBean.class, new String[] { BOCmOrganizeBean.S_OrganizeName });
		if (paraMap.containsKey(BOCmMgrOrgRelBean.S_StaffId)) {
			StringBuilder cond = new StringBuilder();
			cond.append(" AND ").append(BOCmOrganizeBean.S_OrganizeId).append(" IN (");
			cond.append(" SELECT ").append(BOCmMgrOrgRelBean.S_OrganizeId).append(" FROM ")
					.append(DataContainerFactory.getObjectTypeByClass(BOCmMgrOrgRelBean.class).getMapingEnty()).append(" WHERE ").append(BOCmMgrOrgRelBean.S_StaffId)
					.append(" = :staffId ");
			cond.append(")");
			cond.insert(0, parameter.getCondition());
			parameter.setCondition(cond.toString());
			parameter.getParameter().put("staffId", DataType.getAsLong(paraMap.get(BOCmMgrOrgRelBean.S_StaffId)));
		}
		parameter.setBeanClass(BOCmOrganizeBean.class);
		return parameter;
	}

	protected Parameter buildParameterBatch(long[] keys) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(keys, BOCmOrganizeBean.S_OrganizeId);
		parameter.setBeanClass(BOCmOrganizeBean.class);
		return parameter;
	}

	protected DataContainerInterface queryOrganizeById(long organizeId) throws Exception {
		BOCmOrganizeBean bean = new BOCmOrganizeBean();
		bean.setOrganizeId(organizeId);
		return CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
	}
}
