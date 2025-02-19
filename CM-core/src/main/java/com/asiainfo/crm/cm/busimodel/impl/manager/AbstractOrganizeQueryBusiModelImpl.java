package com.asiainfo.crm.cm.busimodel.impl.manager;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBatchBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBatchBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmOrganizeBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public abstract class AbstractOrganizeQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IQueryCountBatchBusiModel,
		IQueryDataBatchBusiModel, IQueryDataByIdBusiModel {

	/**   
	 * 构造批量查询条件
	 * @Function buildParameterBatch
	 * @Description 
	 *
	 * @param keys
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-26 下午4:57:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-26     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildParameterBatch(long[] keys) throws Exception;

	public final DataContainerInterface queryDataById(long objectId) throws Exception {
		return queryOrganizeById(objectId);
	}

	/**   
	 * 根据ID获取客户经理组织信息
	 * @Function queryOrganizeById
	 * @Description 
	 *
	 * @param organizeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-29 下午5:29:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-29     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract DataContainerInterface queryOrganizeById(long organizeId) throws Exception;

	public final DataContainer[] queryDataBatch(long[] keys, int startNum, int endNum) throws Exception {
		Parameter parameter = buildParameterBatch(keys);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(keys, BOCmOrganizeBean.S_OrganizeId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmOrganizeBean.class);
		}
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum, endNum);
	}

	public final int queryCountBatch(long[] keys) throws Exception {
		Parameter parameter = buildParameterBatch(keys);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(keys, BOCmOrganizeBean.S_OrganizeId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmOrganizeBean.class);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	protected Class getReturnObjectClass() {
		return null;
	}
}
