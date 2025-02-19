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
import com.asiainfo.crm.cm.inner.manager.bo.BOCmManagerBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public abstract class AbstractManagerQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel, IQueryDataByIdBusiModel,
		IQueryDataBatchBusiModel, IQueryCountBatchBusiModel {

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

	public final int queryCountBatch(long[] keys) throws Exception {
		Parameter parameter = buildParameterBatch(keys);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(keys, BOCmManagerBean.S_StaffId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmManagerBean.class);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	public final DataContainer[] queryDataBatch(long[] keys, int startNum, int endNum) throws Exception {
		Parameter parameter = buildParameterBatch(keys);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(keys, BOCmManagerBean.S_StaffId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmManagerBean.class);
		}
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum, endNum);
	}

	public final DataContainerInterface queryDataById(long objectId) throws Exception {
		return queryManagerById(objectId);
	}

	/**   
	 * 根据客户经理编号查询客户经理信息
	 * @Function queryManagerById
	 * @Description 
	 *
	 * @param objectId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-25 下午8:08:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25     huzq2           v1.0.0               修改原因<br>
	 */
	protected DataContainerInterface queryManagerById(long objectId) throws Exception {
		BOCmManagerBean bean = new BOCmManagerBean();
		bean.setStaffId(objectId);
		return CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
	}

	protected Class getReturnObjectClass() {
		return null;
	}
}
