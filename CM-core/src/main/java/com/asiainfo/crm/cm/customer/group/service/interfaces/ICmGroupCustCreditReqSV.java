package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustCreditReqValue;

public interface ICmGroupCustCreditReqSV {
	
	
	public void saveData(DataContainer[] values) throws Exception;
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception;
	
	public int queryDataCount(String criteria) throws Exception;
	
	public IBOCmGroupCustCreditReqValue queryReqInfoByCustId(long custId) throws Exception;
	
	public int queryReqInfoCountByCustId(long custId) throws Exception;
	
	public IBOCmGroupCustCreditReqValue queryReqInfoCountByCustIdAndDate(long custId) throws Exception;
	
	public IBOCmGroupCustCreditReqValue[] queryReqInfoValue(DataContainer dt)throws Exception;
}
