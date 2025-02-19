package com.asiainfo.crm.cm.busimodel.impl.evaluation;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.model.bo.SpecialListBean;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;

/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractSpecialListQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-12 上午9:22:21
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-12 LSC v1.0.0 修改原因
 */
public abstract class AbstractSpecialListQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel, IQueryDataByIdBusiModel,
		IMaskBusiModel {

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_EVALUATION_LOG);
	}

	public final DataContainerInterface queryDataById(long objectId) throws Exception {
		return (DataContainerInterface) querySpecialListById(objectId);
	}

	/**   
	 * 根据特殊名单编号查询特殊名单信息
	 * @Function querySpecialListById
	 * @Description 
	 *
	 * @param specialId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午4:35:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract ISpecialListValue querySpecialListById(long specialId) throws Exception;

	protected Class getReturnObjectClass() {
		return SpecialListBean.class;
	}
}
