package com.asiainfo.crm.cm.custview.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;

import com.asiainfo.crm.cm.custview.ivalues.IBOEmailWhiteListsValue;

public interface IEmailWhiteListsSV
{
	/**
	 * 根据查询条件查询  Email白名单表  信息（标准格式）
	 * 
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfos(String condition, HashMap parameter, int start, int end) throws RemoteException, Exception;

	/**
	 * 根据查询条件查询  Email白名单表  数量（标准格式）
	 * 
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public int getEmailWhiteListsCount(String condition, HashMap parameter) throws RemoteException, Exception;

	/**
	 * 根据查询条件查询  Email白名单表  信息（SQL）
	 * 
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfosBySql(String sql, HashMap parameter) throws RemoteException, Exception;

	/**
	 * 根据查询条件查询  Email白名单表  数量（SQL）
	 * 
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public int getEmailWhiteListsCountBySql(String sql, HashMap parameter) throws RemoteException, Exception;

	/**
	 * 单个保存  Email白名单表  信息
	 * 
	 * @param emailWhiteListsValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws RemoteException, Exception;

	/**
	 * 单个删除  Email白名单表  信息
	 * 
	 * @param emailWhiteListsValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws RemoteException, Exception;

	/**
	 * 批量保存  Email白名单表  信息
	 * 
	 * @param emailWhiteListsValues
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws RemoteException, Exception;

	/**
	 * 批量删除  Email白名单表  信息
	 * 
	 * @param emailWhiteListsValues
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws RemoteException, Exception;
	
	/**
	 * 根据 mailAddress 查询白名单
	 * @param email
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOEmailWhiteListsValue getEmailWhiteListsByEmail(String mailAddress) throws RemoteException, Exception;
	
	/**
	 * 保存白名单
	 * @param EmailAddress
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveEmailWhiteLists(String EmailAddress) throws RemoteException, Exception;
}
