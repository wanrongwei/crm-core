package com.asiainfo.crm.inter.exe.webservice.client.cpa.service;

import java.sql.Timestamp;
import java.util.HashMap;

import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaOfferBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaOfferEngine;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserEngine;

public class CpaServiceSVImpl implements ICpaServiceSV {

	@Override
	public void saveCpaOffer(BOCpaOfferBean[] cpaOffers) throws Exception {
		BOCpaOfferEngine.saveBatch(cpaOffers);
	}

	@Override
	public void deleteCpaOffer(Timestamp time) throws Exception {
		HashMap params = new HashMap();
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

	@Override
	public long getCpaOfferNewId() throws Exception {
		return BOCpaOfferEngine.getNewId().longValue();
	}

	@Override
	public Timestamp getCpaOfferSysDate() throws Exception {
		return BOCpaOfferEngine.getSysDate();
	}

	@Override
	public long getCpaUserNewId() throws Exception {
		return BOCpaUserEngine.getNewId().longValue();
	}

	@Override
	public Timestamp getCpaUserSysDate() throws Exception {
		return BOCpaUserEngine.getSysDate();
	}

	@Override
	public BOCpaUserBean[] getSyncCpaUsers(Timestamp time) throws Exception {
		HashMap params = new HashMap();
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

	@Override
	public void saveCpaUser(BOCpaUserBean[] cpaUsers) throws Exception {
		BOCpaUserEngine.saveBatch(cpaUsers);
	}

	@Override
	public void changeState4SyncCpaUsers(Timestamp time) throws Exception {
		BOCpaUserBean[] syncCpaUsers = this.getSyncCpaUsers(time);
		for (BOCpaUserBean bean : syncCpaUsers) {
			bean.setState("S");
			bean.setStateDate(getCpaUserSysDate());
		}
		BOCpaUserEngine.saveBatch(syncCpaUsers);
	}

	@Override
	public void saveCpaUser(BOCpaUserBean bean) throws Exception {
		BOCpaUserEngine.save(bean);
	}

	@Override
	public BOCpaUserBean getCpaUser(String subcriberNo) throws Exception {
		HashMap params = new HashMap();
		StringBuffer condition = new StringBuffer("1 = 1");
		if (subcriberNo != null && subcriberNo.trim().length() > 0) {
			condition.append(" AND ").append(BOCpaUserBean.S_SubcriberNo).append(" = :subNo");
			condition.append(" AND ").append(BOCpaUserBean.S_State).append(" = :aState");
			params.put("subNo", subcriberNo);
			params.put("aState", "U");
		}
		BOCpaUserBean[] beans = BOCpaUserEngine.getBeans(condition.toString(), params);
		if (beans != null && beans.length > 0) {
			return beans[0];
		}
		return null;
	}

}
