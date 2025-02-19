package com.asiainfo.crm.cm.busimodel.impl.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesBean;
import com.asiainfo.crm.cm.common.bo.BoGroupArchivesMemberBean;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class AbstractCmGroupArchivesMemberImpl implements IQueryCountBusiModel, IQueryDataBusiModel 
{

	
	public final void saveGroupArchives(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
				// 设置主键
			((BoGroupArchivesMemberBean)values[i]).setGroupSeq(String.valueOf(CmCommonUtil.getNewSequence(BoGroupArchivesMemberBean.class)));
				}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}

	public final DataContainer[] queryData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception 
	{
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(values)) {
			return new DataContainer[0];
		}
		return (DataContainer[]) values;
	}

	public int queryCount(String criteria) throws Exception 
	{
		return queryCount(ParamUtil.parseXmlCriteria(criteria));
	}
	
	public final int queryCount(DataContainer[] conditionDCs) throws Exception 
	{
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}


	public Parameter buildQueryCondition(DataContainer[] conditionDCs) throws Exception 
	{
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, conditionDCs[0].getClass());
		return parameter;
	}

	public DataContainerInterface[] queryData(String[] cols,
			DataContainer[] criteria, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
