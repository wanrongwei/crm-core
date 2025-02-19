package com.asiainfo.crm.cm.bi2oneframe.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmCallMarketingEngine;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmCustLevelEngine;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmSceneMarketingEngine;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserChnnHobbyEngine;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserEngine;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserHobbyEngine;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserSatisfactionEngine;
import com.asiainfo.crm.cm.bi2oneframe.dao.interfaces.ICmBi2OneframeDAO;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCallMarketingValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCustLevelValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmSceneMarketingValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserChnnHobbyValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserHobbyValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserSatisfactionValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserValue;


public class CmBi2OneframeDAOImpl implements ICmBi2OneframeDAO {

	public IBOCmUserChnnHobbyValue[] queryChnnHobby(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmUserChnnHobbyValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmUserChnnHobbyEngine.getBeans(sb.toString(), map);
	}

	public IBOCmCustLevelValue[] queryCmCustLevel(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmCustLevelValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmCustLevelEngine.getBeans(sb.toString(), map);
	}

	public IBOCmUserValue[] queryCmUser(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmUserValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmUserEngine.getBeans(sb.toString(), map);
	}

	public IBOCmUserHobbyValue[] queryCmUserHobby(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmUserHobbyValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmUserHobbyEngine.getBeans(sb.toString(), map);
	}

	public IBOCmCallMarketingValue[] queryCallMarketing(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmCallMarketingValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmCallMarketingEngine.getBeans(sb.toString(), map);
	}

	public IBOCmSceneMarketingValue[] querySceneMarketing(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmSceneMarketingValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmSceneMarketingEngine.getBeans(sb.toString(), map);
	}

	public IBOCmUserSatisfactionValue[] queryUserSatisfaction(String billId) throws Exception {
		StringBuilder sb = new StringBuilder();
		Map map = new HashMap();
		sb.append(IBOCmUserSatisfactionValue.S_BillId).append(" = :billId");
		map.put("billId", billId);
		return BOCmUserSatisfactionEngine.getBeans(sb.toString(), map);
	}

	public void saveCallMarketing(IBOCmCallMarketingValue[] callMarketingValues) throws Exception {
		BOCmCallMarketingEngine.saveBatch(callMarketingValues);
	}

	public void saveCustValueLevel(IBOCmCustLevelValue[] custLevelValues) throws Exception {
		BOCmCustLevelEngine.saveBatch(custLevelValues);
	}

	public void saveSceneMarketing(IBOCmSceneMarketingValue[] sceneMarketingValues) throws Exception {
		BOCmSceneMarketingEngine.saveBatch(sceneMarketingValues);
	}

	public void saveUser(IBOCmUserValue[] userValues) throws Exception {
		BOCmUserEngine.saveBatch(userValues);
	}

	public void saveUserChnnalHobby(IBOCmUserChnnHobbyValue[] chnnHobbyValues) throws Exception {
		BOCmUserChnnHobbyEngine.saveBatch(chnnHobbyValues);
	}

	public void saveUserHobby(IBOCmUserHobbyValue[] userHobbyValues) throws Exception {
		BOCmUserHobbyEngine.saveBatch(userHobbyValues);
	}

	public void saveUserSatisfaction(IBOCmUserSatisfactionValue[] userSatisfactionValues) throws Exception {
		BOCmUserSatisfactionEngine.saveBatch(userSatisfactionValues);
	}

}
