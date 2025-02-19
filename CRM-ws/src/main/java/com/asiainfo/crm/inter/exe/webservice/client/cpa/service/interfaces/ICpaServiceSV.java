package com.asiainfo.crm.inter.exe.webservice.client.cpa.service.interfaces;

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

	public BOCpaUserBean getCpaUser(String subcriberNo,String subcriberId) throws Exception;

	public int getCPAOfferCount(String offerId) throws Exception;

	public String getFileSeq(String tableName) throws Exception;
	
	public BOCpaUserBean[] getSyncCpaIncUsers(Timestamp before,Timestamp end) throws Exception;

	public BOCpaOfferBean[] getCpaOffers() throws Exception;
	
	public BOCpaUserBean[] getSyncCpaAllUsers() throws Exception;
	
	public String getIncFileSeq(String tableName) throws Exception;
	
	public  BOCpaUserBean[] getCpaUsersByCustIdOrAcctId(long custId,String acctId) throws Exception;


}
