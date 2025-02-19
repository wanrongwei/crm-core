package com.asiainfo.crm.cm.busimodel.impl.customer;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.GroupMemberBean;

public abstract class AbstractCustMemberQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IQueryDataByIdBusiModel {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(conditionDCs, BOCmGroupMemberBean.class,new String[]{BOCmGroupMemberBean.S_MemberName});
		return parameter;
	}

	protected Class getReturnObjectClass() {
		return GroupMemberBean.class;
	}

	public DataContainerInterface queryDataById(long custRelId) throws Exception {
		BOCmGroupMemberBean bean = new BOCmGroupMemberBean();
		bean.setCustRelId(custRelId);
		IBOCmGroupMemberValue boCmGroupMemberValue = (IBOCmGroupMemberValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(boCmGroupMemberValue)) {
			return null;
		}
		GroupMemberBean groupMemberBean = new GroupMemberBean();
		groupMemberBean.copy(boCmGroupMemberValue);
		return groupMemberBean;
	}

}
