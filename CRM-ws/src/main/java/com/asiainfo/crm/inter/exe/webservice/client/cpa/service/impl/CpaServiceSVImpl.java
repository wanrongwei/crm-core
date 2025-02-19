package com.asiainfo.crm.inter.exe.webservice.client.cpa.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaOfferBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaOfferEngine;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserEngine;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.service.interfaces.ICpaServiceSV;
import com.asiainfo.crm.constant.RBossConst;

public class CpaServiceSVImpl implements ICpaServiceSV {

	public void saveCpaOffer(BOCpaOfferBean[] cpaOffers) throws Exception {
		BOCpaOfferEngine.saveBatch(cpaOffers);
	}

	public BOCpaOfferBean[] getCpaOffers() throws Exception {
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		condition.append(" AND ").append(BOCpaOfferBean.S_State).append(" = :aState");
		params.put("aState", "U");
		BOCpaOfferBean[] beans = BOCpaOfferEngine.getBeans(condition.toString(), params);
		return beans;
	}
	public void deleteCpaOffer(Timestamp time) throws Exception {
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		if (time != null) {
			condition.append(" AND ").append(BOCpaOfferBean.S_CreateDate).append(" < :aDate");
			condition.append(" AND ").append(BOCpaOfferBean.S_State).append(" = :aState");
			params.put("aDate", time);
			params.put("aState", "U");
		}
		BOCpaOfferBean[] beans = BOCpaOfferEngine.getBeans(condition.toString(), params);
		Timestamp sysDate = BOCpaOfferEngine.getSysDate();
		for (BOCpaOfferBean bean : beans) {
			bean.setState("E");
			bean.setStateDate(sysDate);
		}
		saveCpaOffer(beans);
	}

	public long getCpaOfferNewId() throws Exception {
		return BOCpaOfferEngine.getNewId().longValue();
	}

	public Timestamp getCpaOfferSysDate() throws Exception {
		return BOCpaOfferEngine.getSysDate();
	}

	public long getCpaUserNewId() throws Exception {
		return BOCpaUserEngine.getNewId().longValue();
	}

	public Timestamp getCpaUserSysDate() throws Exception {
		return BOCpaUserEngine.getSysDate();
	}

	public BOCpaUserBean[] getSyncCpaUsers(Timestamp time) throws Exception {
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		if (time != null) {
			condition.append(" AND ").append(BOCpaUserBean.S_CreateDate).append(" < :aDate");
			condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
			params.put("aDate", time);
			params.put("aState", "U");
		}
		BOCpaUserBean[] beans = BOCpaUserEngine.getBeans(condition.toString(), params);
		return beans;
	}
	public BOCpaUserBean[] getSyncCpaAllUsers() throws Exception{
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
		params.put("aState", "U");
		BOCpaUserBean[] beans = BOCpaUserEngine.getBeans(condition.toString(), params);
		return beans;
	}
	public  BOCpaUserBean[] getCpaUsersByCustIdOrAcctId(long custId,String acctId) throws Exception{
		
		// TELENOR_DEFECT_20180904_0001
		if(RBossConst.ANONYMOUS_CUST_ID ==custId) {
			return new BOCpaUserBean[0];
		}
		
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		if(StringUtils.isNotBlank(acctId)){
			condition.append(" AND ").append(BOCpaUserBean.S_Ban).append(" = :acctId");
			params.put("acctId", acctId);
		}else if(custId!=0){
			condition.append(" AND ").append(BOCpaUserBean.S_CustomerId).append(" = :custId");
			params.put("custId", DataType.getAsString(custId));
		}else{
			throw new Exception("CustId and AcctId could not be all empty");
		}
		condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
		params.put("aState", "U");
		BOCpaUserBean[] beans = BOCpaUserEngine.getBeans(condition.toString(), params);
		return beans;
	}
	public BOCpaUserBean[] getSyncCpaIncUsers(Timestamp before,Timestamp end) throws Exception {
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		if (before != null && end != null) {
			condition.append(" AND ").append(BOCpaUserBean.S_StateDate).append(" between ").append(" :beforeTime").append(" and ").append(" :endTime");
//			condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
			params.put("beforeTime", before);
			params.put("endTime", end);
//			params.put("aState", "U");
		}
		BOCpaUserBean[] beans = BOCpaUserEngine.getBeans(condition.toString(), params);
		return beans;
	}

	public void saveCpaUser(BOCpaUserBean[] cpaUsers) throws Exception {
		BOCpaUserEngine.saveBatch(cpaUsers);
	}

	public void changeState4SyncCpaUsers(Timestamp time) throws Exception {
		BOCpaUserBean[] syncCpaUsers = this.getSyncCpaUsers(time);
		for (BOCpaUserBean bean : syncCpaUsers) {
			bean.setState("S");
			bean.setStateDate(getCpaUserSysDate());
		}
		BOCpaUserEngine.saveBatch(syncCpaUsers);
	}

	public void saveCpaUser(BOCpaUserBean bean) throws Exception {
		BOCpaUserEngine.save(bean);
	}

	public BOCpaUserBean getCpaUser(String subcriberNo,String subcriberId) throws Exception {
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		if (StringUtils.isNotEmpty(subcriberNo)) {
			condition.append(" AND ").append(BOCpaUserBean.S_SubcriberNo).append(" = :subNo");
			condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
			params.put("subNo", subcriberNo);
			params.put("aState", "U");
		}else{
			condition.append(" AND ").append(BOCpaUserBean.S_SubscriberId).append(" = :subId");
			condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
			params.put("subId", subcriberId);
			params.put("aState", "U");
		}
		BOCpaUserBean[] beans = BOCpaUserEngine.getBeans(condition.toString(), params);
		if (beans != null && beans.length > 0) {
			return beans[0];
		}
		return null;
	}

	public int getCPAOfferCount(String offerId) throws Exception {
		HashMap<String,Object> params = new HashMap<String,Object>();
		StringBuffer condition = new StringBuffer("1 = 1");
		if (StringUtils.isNotBlank(offerId)) {
			condition.append(" AND ").append(BOCpaOfferBean.S_OfferId).append(" = :offerId");
			condition.append(" AND ").append(BOCpaOfferBean.S_State).append(" = :aState");
			params.put("offerId", offerId);
			params.put("aState", "U");
		}
		return BOCpaOfferEngine.getBeansCount(condition.toString(), params);
	}

	public String getFileSeq(String tableName) throws Exception {
		long longValue = ServiceManager.getIdGenerator().getNewId(tableName).longValue();
		return "UID" + padStart(String.valueOf(longValue), 5, '0');
	}
	
	public String getIncFileSeq(String tableName) throws Exception{
		long longValue = ServiceManager.getIdGenerator().getNewId(tableName).longValue();
		return "UID" + padStart(String.valueOf(longValue), 5, '0');
	}

	public static String padStart(String string, int minLength, char padChar) {
		if (string == null) {
			return null;
		}
		if (string.length() >= minLength) {
			return string.substring(string.length()-minLength, string.length());
		}
		StringBuilder sb = new StringBuilder(minLength);
		for (int i = string.length(); i < minLength; i++) {
			sb.append(padChar);
		}
		sb.append(string);
		return sb.toString();
	}

}
