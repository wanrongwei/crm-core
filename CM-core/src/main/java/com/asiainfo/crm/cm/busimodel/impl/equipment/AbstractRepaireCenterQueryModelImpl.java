package com.asiainfo.crm.cm.busimodel.impl.equipment;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.bo.BOFactoryInfoBean;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.CmParaMaintainBean;
import com.asiainfo.crm.cm.model.ivalues.ICmParaMaintainValue;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: AbstractRepaireCenterQueryModelImpl.java
* @Description: 设备厂商维修点维护
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 11, 2012 10:20:35 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 11, 2012     suntao6           v1.0.0               修改原因
 */
public abstract class AbstractRepaireCenterQueryModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception {
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}
	//public ICmParaMaintainValue[] queryRepaireCenter(String criteria, int startNum, int endNum) throws Exception;
	public final DataContainer[] queryData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception {
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		DataContainerInterface[] cmParaMaintain =  CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(cmParaMaintain)) {
			return new CmParaMaintainBean[0];
		}
		CmParaMaintainBean[] cmParaMaintains = new CmParaMaintainBean[cmParaMaintain.length];
		// 数据类型转换
		for (int i = 0; i < cmParaMaintain.length; i++) {
			cmParaMaintains[i] = new CmParaMaintainBean();
			cmParaMaintains[i].copy(cmParaMaintain[i]);
		}
		return (DataContainer[]) cmParaMaintains;
	}
	
	//public ICmParaMaintainValue[] queryRepaireCenter(String criteria, int startNum, int endNum) throws Exception;
	public final DataContainer[] queryAllData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception {
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		DataContainerInterface[] cmParaMaintain =  CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), -1, -1);
		if (!CmCommonUtil.isNotEmptyObject(cmParaMaintain)) {
			return new BOFactoryInfoBean[0];
		}
		
		return (DataContainer[])cmParaMaintain;
	}
	
	
	
	
	public Parameter buildQueryCondition(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, conditionDCs[0].getClass());
		return parameter;
	}
	
	public int queryCount(String criteria) throws Exception {
		return queryCount(ParamUtil.parseXmlCriteria(criteria));
	}
	public final int queryCount(DataContainer[] conditionDCs) throws Exception {
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}
	
	public final void saveRepaireCenterQuerys(ICmParaMaintainValue[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			// 设置主键
			if(values[i].isNew()){
				values[i].setMaintainOrgId(CmCommonUtil.getNewSequence(CmParaMaintainBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface)values[i]);
		}
	}

}
