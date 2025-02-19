package com.asiainfo.crm.cm.busimodel.impl.common;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupLevelAuditValue;

public class AbstractGroupLevelAudit extends AbstractCmCommonDealModelImpl
{

	private transient static Log log = LogFactory.getLog(AbstractGroupLevelAudit.class);
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		return queryData(ParamUtil.parseXmlCriteria_new(criteria), startNum, endNum);
	}


	public int queryCount(String criteria) throws Exception 
	{
		return queryCount(ParamUtil.parseXmlCriteria_new(criteria));
	}
	
	public Parameter buildQueryCondition(DataContainer[] conditionDCs) throws Exception 
	{
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, conditionDCs[0].getClass());
		
		StringBuilder condition = new StringBuilder();
		
		if(!StringUtils.isBlank(conditionDCs[0].getAsString("START_DATE")))//还可使用hasProperty方法
		{
			condition.append(IBOCmGroupLevelAuditValue.S_CreateDate).append(" >=to_date('"+conditionDCs[0].getAsString("START_DATE")+"' ,'yyyy-mm-dd')");
		}
		if(!StringUtils.isBlank(conditionDCs[0].getAsString("END_DATE")))
		{
			if(condition.length()>0)
				condition.append(" AND ").append(IBOCmGroupLevelAuditValue.S_CreateDate).append(" <=to_date('"+conditionDCs[0].getAsString("END_DATE")+"' ,'yyyy-mm-dd')");
			else
				condition.append(IBOCmGroupLevelAuditValue.S_CreateDate).append(" <=to_date('"+conditionDCs[0].getAsString("START_DATE")+"' ,'yyyy-mm-dd')");
		}
		
		if(condition.length()>0)
			parameter.setCondition(condition.append(" AND ").append(parameter.getCondition()).toString());
			
		if(log.isDebugEnabled())
			log.debug("\ncondition is :"+parameter.getCondition());
		
		return parameter;
	}

}
