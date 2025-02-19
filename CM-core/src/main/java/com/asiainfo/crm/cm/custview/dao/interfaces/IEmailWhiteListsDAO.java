package com.asiainfo.crm.cm.custview.dao.interfaces;

import com.asiainfo.crm.cm.custview.ivalues.IBOEmailWhiteListsValue;
import java.util.*;

public interface IEmailWhiteListsDAO 
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
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfos(String condition, HashMap parameter, int start, int end) throws Exception;
	
	/**
	 * 根据查询条件查询  Email白名单表  数量（标准格式）
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public int getEmailWhiteListsCount(String condition, HashMap parameter) throws Exception;
	
	/**
	 * 根据查询条件查询  Email白名单表  信息（ByMap）
	 *
	 * @param paramMap
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfosByMap(HashMap paramMap, int start, int end) throws Exception;
	
	/**
	 * 根据查询条件查询  Email白名单表  数量（ByMap）
	 *
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public int getEmailWhiteListsCountByMap(HashMap paramMap) throws Exception;

	/**
	 * 根据查询条件查询  Email白名单表  数量（BySql）
	 * 
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfosBySql(String sql, HashMap parameter) throws Exception;

	/**
	 * 根据查询条件查询  Email白名单表  数量（BySql）
	 *
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public int getEmailWhiteListsCountBySql(String sql, HashMap parameter) throws Exception;

	/**
	 * 单个保存  Email白名单表  信息
	 *
	 * @param emailWhiteListsValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws Exception;
	
	/**
	 * 单个删除  Email白名单表  信息
	 *
	 * @param emailWhiteListsValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws Exception;
	
	/**
	 * 批量保存  Email白名单表  信息
	 *
	 * @param emailWhiteListsValues
	 * @throws RemoteException
	 * @throws Exception
	 */	
	public void saveBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws Exception;
	
	/**
	 * 批量删除  Email白名单表  信息
	 *
	 * @param emailWhiteListsValues
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws Exception;

}
