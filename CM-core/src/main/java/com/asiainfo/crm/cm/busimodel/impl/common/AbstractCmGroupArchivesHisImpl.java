package com.asiainfo.crm.cm.busimodel.impl.common;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesBean;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupArchivesHisValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class AbstractCmGroupArchivesHisImpl implements IQueryCountBusiModel, IQueryDataBusiModel
{

	private transient static Log log = LogFactory.getLog(AbstractCmGroupArchivesHisImpl.class);
	
	public final void saveGroupArchivesHis(DataContainer[] values) throws Exception 
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
		DataContainer[] dcs =ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition =dcs[0];
		StringBuilder sql =new StringBuilder("");
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
        TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_ARCHIVES_H", IBOGroupArchivesHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GROUP_ARCHIVES_H} T)  WHERE 1= 1 ");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" >=DATE_FORMAT('"+condition.getAsString("DONE_START_DATE").substring(1, 10)+"' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" <=DATE_FORMAT('"+condition.getAsString("DONE_END_DATE").substring(1, 10)+"' ,'%Y-%m-%d')");
		
		if(condition.getAsString("GROUP_SEQ")!=null && !"".equals(condition.getAsString("GROUP_SEQ"))){
		 sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupSeq).append("= :groupSeq");
		 parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
		}
		if(condition.getAsString("GROUP_NAME")!=null && !"".equals(condition.getAsString("GROUP_NAME"))){
			 sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupName).append("= :groupName");
			 parameter.put("groupName", condition.getAsString("GROUP_NAME"));
			}
		if(condition.getAsString("OP_ID")!=null && !"".equals(condition.getAsString("OP_ID"))){
			 sql.append(" and ").append(IBOGroupArchivesHisValue.S_OpId).append("= :opId");
			 parameter.put("opId", condition.getAsString("OP_ID"));
			}
		if(startNum >=0 && endNum > 0)
		{
			sql.append(" LIMIT :startNum,:endNum ");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		DataContainerInterface[] returnValues=CmInnerServiceFactory.getCommonInnerSV()
		.getBeansFromSql(BOGroupArchivesBean.class, SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
	
		return (DataContainer[]) returnValues;
		//return queryData(ParamUtil.parseXmlCriteria_new(criteria), startNum, endNum);
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
		DataContainer[] dcs =ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition =dcs[0];
		
		StringBuilder sql =new StringBuilder("");
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
		//String[] cycle = CmCommonUtil.getCycleYYMM(startDate, endDate);
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_ARCHIVES_H", IBOGroupArchivesHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GROUP_ARCHIVES_H} T)  WHERE 1= 1 ");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" >=DATE_FORMAT('"+condition.getAsString("DONE_START_DATE").substring(1, 10)+"' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" <=DATE_FORMAT('"+condition.getAsString("DONE_END_DATE").substring(1, 10)+"' ,'%Y-%m-%d')");
		
		if(condition.getAsString("GROUP_SEQ")!=null && !"".equals(condition.getAsString("GROUP_SEQ"))){
		 sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupSeq).append("= :groupSeq");
		 parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
		}
		if(condition.getAsString("GROUP_NAME")!=null && !"".equals(condition.getAsString("GROUP_NAME"))){
			 sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupName).append("= :groupName");
			 parameter.put("groupName", condition.getAsString("GROUP_NAME"));
			}
		if(condition.getAsString("OP_ID")!=null && !"".equals(condition.getAsString("OP_ID"))){
			 sql.append(" and ").append(IBOGroupArchivesHisValue.S_OpId).append("= :opId");
			 parameter.put("opId", condition.getAsString("OP_ID"));
			}
		DataContainerInterface[] returnValues=CmInnerServiceFactory.getCommonInnerSV()
		.getBeansFromSql(DataContainer.class, SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
	
		
		return returnValues[0].getAsInt("CNT");
	
	//	return queryCount(ParamUtil.parseXmlCriteria_new(criteria));
	}
	

	public Parameter buildQueryCondition(DataContainer[] conditionDCs) throws Exception 
	{
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, conditionDCs[0].getClass());
		
		TableVars tableVar = new TableVars();
		
		tableVar.add("CM_GROUP_ARCHIVES_H", IBOGroupArchivesHisValue.S_DoneDate, conditionDCs[0].getAsString("START_DATE").substring(0, 4));
		
		StringBuilder condition = new StringBuilder();
		
		if(!StringUtils.isBlank(conditionDCs[0].getAsString("DONE_START_DATE")))//还可使用hasProperty方法
		{
			condition.append(IBOGroupArchivesHisValue.S_DoneDate).append(" >=to_date('"+conditionDCs[0].getAsString("DONE_START_DATE").substring(0, 10)+"' ,'yyyy-mm-dd')");
		}
		if(!StringUtils.isBlank(conditionDCs[0].getAsString("DONE_END_DATE")))
		{
			if(condition.length()>0)
				condition.append(" AND ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" <=to_date('"+conditionDCs[0].getAsString("DONE_END_DATE")+"' ,'yyyy-mm-dd')");
			else
				condition.append(IBOGroupArchivesHisValue.S_DoneDate).append(" <=to_date('"+conditionDCs[0].getAsString("DONE_START_DATE").substring(0, 10)+"' ,'yyyy-mm-dd')");
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

	public int queryCount(DataContainer[] criteria) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


}
