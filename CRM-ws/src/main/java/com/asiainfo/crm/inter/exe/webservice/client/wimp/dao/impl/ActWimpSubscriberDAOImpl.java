package com.asiainfo.crm.inter.exe.webservice.client.wimp.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.BOActivateWimpSubscriberEngine;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.bo.IBOActivateWimpSubscriberValue;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.dao.interfaces.IActWimpSubscriberDAO;

public class ActWimpSubscriberDAOImpl implements IActWimpSubscriberDAO {

	@Override
	public void save(IBOActivateWimpSubscriberValue activateWimpSubscriberValue)
			throws Exception {
		// TODO Auto-generated method stub
		BOActivateWimpSubscriberEngine.save(activateWimpSubscriberValue);

	}

	@Override
	public void save(
			IBOActivateWimpSubscriberValue[] activateWimpSubscriberValues)
			throws Exception {
		// TODO Auto-generated method stub
		BOActivateWimpSubscriberEngine.save(activateWimpSubscriberValues);

	}

	
	public IBOActivateWimpSubscriberValue[] queryByBatchId(String batchId)
			throws Exception {
		// TODO Auto-generated method stub
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		condition.append(" and ")
				.append(IBOActivateWimpSubscriberValue.S_Filedate)
				.append(" =:batchId");
		Map paraMap = new HashMap();
		paraMap.put("batchId", batchId);
		return BOActivateWimpSubscriberEngine.getBeans(condition.toString(),
				paraMap);

	}

}
