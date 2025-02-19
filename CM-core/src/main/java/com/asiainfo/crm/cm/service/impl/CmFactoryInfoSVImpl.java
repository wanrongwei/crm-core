package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOFactoryInfoEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOFactoryInfoValue;
import com.asiainfo.crm.cm.service.interfaces.ICmFactoryInfoSV;

public class CmFactoryInfoSVImpl implements ICmFactoryInfoSV 
{

	public int queryFactoryCount(String criteria) throws Exception 
	{
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryCount(criteria);
	}

	public DataContainer[] queryFactorys(String criteria, int startNum,int endNum) throws Exception 
	{
		return ((AbstractCmCommonDealModelImpl)CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryData(criteria, startNum, endNum);
	}

	public void saveFactorys(DataContainer[] values) throws Exception 
	{
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	}
	
	
	//add by 关胜杰 根据“厂商编号”查询是否存在该厂商
	public boolean queryFactoryInfo(String factoryId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		boolean rst = false;
		if(!"".equals(factoryId)&&!"null".equals(factoryId)&&factoryId!=null){
			condition.append(" and "+IBOFactoryInfoValue.S_FactoryId + "  = :factoryId ");
			paraMap.put("factoryId", factoryId);
		}
		IBOFactoryInfoValue[] values = BOFactoryInfoEngine.getBeans(condition.toString(),paraMap);
			 
		if(null != values && !"".equals(values) && 0 != values.length){
			rst = true;
		}
		return rst;
	}

}
