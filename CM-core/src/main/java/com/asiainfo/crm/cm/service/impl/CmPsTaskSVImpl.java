package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsTaskDealBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsTaskDealValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmPsTaskSV;

public class CmPsTaskSVImpl implements ICmPsTaskSV{

	
	@Override
	public IBOCmPsTaskDealValue[] queryTask(int taskType, long EntityID, String state,
			String effDate) throws Exception {
		StringBuilder condition =new StringBuilder();
		condition.append("1=1");
		Map parameter =new HashMap();
		if(taskType>0){
			condition.append(" and ").append(BOCmPsTaskDealBean.S_TaskType).append("=:taskType");
			parameter.put("taskType", taskType);
		}
		if(EntityID>0){
			condition.append(" and ").append(BOCmPsTaskDealBean.S_EntityId).append("=:EntityID");
			parameter.put("EntityID", EntityID);
		}
		if(StringUtils.isNotBlank(state)){
			condition.append(" and ").append(BOCmPsTaskDealBean.S_State).append("=:state");
			parameter.put("state", state);
		}
		if(StringUtils.isNotBlank(effDate)){
			condition.append(" and ").append(BOCmPsTaskDealBean.S_EffectiveDate).append("=:effDate");
			parameter.put("effDate", effDate);
		}
		return (IBOCmPsTaskDealValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPsTaskDealBean.class, condition.toString(), parameter, -1, -1);

	}

	public IBOCmPsTaskDealValue[] queryCprRecord(long recordId, int taskType) throws Exception{
		StringBuilder condition =new StringBuilder();
		condition.append("1=1");
		Map parameter =new HashMap();
		if(recordId>0){
			condition.append(" and ").append(BOCmPsTaskDealBean.S_TaskId).append("=:taskId");
			parameter.put("taskId", recordId);
		}
		if(taskType>0){
			condition.append(" and ").append(BOCmPsTaskDealBean.S_TaskType).append("=:taskType");
			parameter.put("taskType", taskType);
		}
		return (IBOCmPsTaskDealValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPsTaskDealBean.class, condition.toString(), parameter, -1, -1);
	}
	
	
	public void savePsTaskDeal(IBOCmPsTaskDealValue psTaskDealValue) throws Exception {
		BOCmPsTaskDealBean bean = new BOCmPsTaskDealBean();
		bean.copy(psTaskDealValue);		
		if (bean.getTaskId() <= 0) {
			bean.setTaskId(CmCommonUtil.getNewSequence(BOCmPsPublicDealBean.class));
		}
		if (StringUtils.isBlank(bean.getRegionId())) {
			bean.setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		if (StringUtils.isBlank(bean.getState())) {
			bean.setState(CmConstants.RecordState.USE);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}
}
