package com.asiainfo.crm.cm.busimodel.impl.common;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.ivalues.IQBOGroupInfoRelationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class AbstractGroupInfoRelationSVImpl implements IQueryCountBusiModel, IQueryDataBusiModel 
{

	private transient static Log log = LogFactory.getLog(AbstractGroupInfoRelationSVImpl.class);
	
	public final void saveGroupArchives(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			// 设置主键
			//values[i].setServiceId(CmCommonUtil.getNewSequence(BOCmClubServiceBean.class));
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		return queryData(ParamUtil.parseXmlCriteria_new(criteria), startNum, endNum);
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
		return queryCount(ParamUtil.parseXmlCriteria_new(criteria));
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
		
		StringBuilder condition = new StringBuilder();
		
		if(!StringUtils.isBlank(conditionDCs[0].getAsString("CREATE_START_DATE")))//还可使用hasProperty方法
		{
			condition.append(IQBOGroupInfoRelationValue.S_CreateDate).append(" >=to_date('"+conditionDCs[0].getAsString("CREATE_START_DATE").substring(0, 10)+"' ,'yyyy-mm-dd')");
		}
		if(!StringUtils.isBlank(conditionDCs[0].getAsString("CREATE_END_DATE")))
		{
			if(condition.length()>0)
				condition.append(" AND ").append(IQBOGroupInfoRelationValue.S_CreateDate).append(" <=to_date('"+conditionDCs[0].getAsString("CREATE_END_DATE")+"' ,'yyyy-mm-dd')");
			else
				condition.append(IQBOGroupInfoRelationValue.S_CreateDate).append(" <=to_date('"+conditionDCs[0].getAsString("CREATE_START_DATE").substring(0, 10)+"' ,'yyyy-mm-dd')");
		}
		
		if(condition.length()>0)
			parameter.setCondition(condition.append(" AND ").append(parameter.getCondition()).toString());
			
		if(log.isDebugEnabled())
			log.debug("\ncondition is :"+parameter.getCondition());
		
		return parameter;
	}

	public DataContainerInterface[] queryData(String[] cols,
			DataContainer[] criteria, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
