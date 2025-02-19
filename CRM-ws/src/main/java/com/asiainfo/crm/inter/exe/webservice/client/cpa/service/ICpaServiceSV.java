package com.asiainfo.crm.inter.exe.webservice.client.cpa.service;

import java.sql.Timestamp;

import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaOfferBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserBean;

public interface ICpaServiceSV {

	public void saveCpaOffer(BOCpaOfferBean[] cpaOffers) throws Exception;

	public void deleteCpaOffer(Timestamp time) throws Exception;

	public long getCpaOfferNewId() throws Exception;

	public Timestamp getCpaOfferSysDate() throws Exception;

	public long getCpaUserNewId() throws Exception;

	public Timestamp getCpaUserSysDate() throws Exception;

	public BOCpaUserBean[] getSyncCpaUsers(Timestamp time) throws Exception;

	public void saveCpaUser(BOCpaUserBean[] cpaUsers) throws Exception;

	public void changeState4SyncCpaUsers(Timestamp time) throws Exception;

	public void saveCpaUser(BOCpaUserBean bean) throws Exception;

	public BOCpaUserBean getCpaUser(String subcriberNo) throws Exception;

}
