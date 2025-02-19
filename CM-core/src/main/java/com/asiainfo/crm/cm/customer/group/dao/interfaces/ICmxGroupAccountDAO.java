package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.rmi.RemoteException;
import java.util.List;

import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupAccountValue;

public interface ICmxGroupAccountDAO
{
	//public void saveGroupAccount(IBOCmxGroupAccountValue groupAccountValue) throws Exception;

	/**   
	* @Function: queryGroupAccountInfo 
	* @Description: 根据帐户编号，查询集团帐户信息
	*
	* @param acctId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: shitian
	* @date: Apr 18, 2011 2:05:36 PM 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* Apr 18, 2011        shitian            v1.0.0                 修改原因
	*/
	//public IBOCmxGroupAccountValue[] queryGroupAccountInfo(long acctId) throws Exception;

	//public IBOCmxGroupAccountValue[] queryGroupAccountInfo(long acctId, long groupCustId, int start, int end)throws Exception;

	//public IBOCmxGroupAccountValue[] queryGroupAccountInfo(long groupCustId, int acctBusiType) throws Exception;

	//public int queryGroupAccountsCount(long groupCustId) throws Exception;

	//public int queryGroupAccountsCount(long groupCustId, long acctId) throws Exception;

	//public IQBOCmGroupValue[] queryGroupAcctIdByGroupName(String groupCustName, int start, int end) throws Exception;

	//public int queryGroupAcctCountByGroupName(String groupCustName) throws Exception;

	//public IBOCmxGroupAccountValue[] queryEManagerGroupAccounts(int isPrepayTag, int start, int end) throws Exception;

	//public int queryEManagerGroupAccountsCount(int isPrepayTag) throws Exception;

	//public void saveGroupAccountsBatch(IBOCmxGroupAccountValue[] groupAccountValues) throws Exception;

	//public IBOCmxGroupAccountValue[] queryCmxGroupAccountByContBill(String billId) throws Exception;

	public List queryGroupAcctContactCount(String regionId) throws Exception;

	public IQBOCmGroupAccountValue[] queryGroupAcctContacts(String regionId, String regionType, String regionDetail,
			int start, int end) throws Exception;

	public int queryGroupAcctContactsCount(String regionId, String regionType, String regionDetail) throws Exception,
			RemoteException;
	
	public IQBOCmGroupAccountValue[] queryGroupAcctByAcctName(String acctName) throws Exception;
}
