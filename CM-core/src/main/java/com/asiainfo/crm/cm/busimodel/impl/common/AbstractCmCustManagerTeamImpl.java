package com.asiainfo.crm.cm.busimodel.impl.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.bo.BOCustManagerTeamBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCustManagerTeamRelValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmCustManagerTeamBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmCustManagerTeamValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmCustManagerTeamSV;

public class AbstractCmCustManagerTeamImpl implements IQueryCountBusiModel, IQueryDataBusiModel 
{

	
	public final void saveCmCustManagerTeam(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCustManagerTeamBean)values[i]).setTeamId(CmCommonUtil.getNewSequence(BOCustManagerTeamBean.class));
			}else if (values[i].isDeleted()) {
				ICmCustManagerTeamSV cmInter=(ICmCustManagerTeamSV)ServiceFactory.getService(ICmCustManagerTeamSV.class);	
				String teamId = values[i].getAsString("TEAM_ID");
				//电话经理组编号查找该电话经理组下是否存在电话经理人关系，如果存在电话经理人则该记录不能删除
				IBOCustManagerTeamRelValue[] vals = cmInter.queryCmCustManagerTeamRelByTeamId(Long.parseLong(teamId));
				int count = vals.length;
				if(count > 0){
					throw new AIException("Under the existence of the Phone Manager Phone Manager group member , delete group members then delete the Phone Manager !");
				}
				//查找该电话经理组编号是否是其他电话经理组的父组
				IBOCmCustManagerTeamValue[] pVals = cmInter.queryCmCustManagerTeamByParentId(Long.parseLong(teamId));
				int pCount = pVals.length;
				if(pCount > 0){
					//throw new AIException("该电话经理组存在的子组也会删除");
					for (int j = 0; j < pVals.length; j++) {
						pVals[j].setParentTeamId(0L);
						CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) pVals[j]);
					}
				}
					
			}
			
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
	
	public final void saveCmCustManagerTeamRel(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}
	public IBOCmCustManagerTeamValue queryData(long teamId, int startNum, int endNum) throws Exception 
	{
		ICmCommonInnerSV cmInter=(ICmCommonInnerSV)ServiceFactory.getService(ICmCommonInnerSV.class);
		BOCmCustManagerTeamBean cmBean=new BOCmCustManagerTeamBean();
		cmBean.setTeamId(teamId);
		return (IBOCmCustManagerTeamValue)cmInter.getBean(cmBean);
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
