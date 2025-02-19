package com.asiainfo.crm.cm.custgroup.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerQuitGroupValue;

public interface ICmCustomerQuitGroupSV
{
	/**
	 * 根据查询条件查询  退群客户沉淀表  信息（标准格式）
	 * 
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfos(String condition, HashMap parameter, int start, int end) throws RemoteException, Exception;

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（标准格式）
	 * 
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public int getCmCustomerQuitGroupCount(String condition, HashMap parameter) throws RemoteException, Exception;

	/**
	 * 根据查询条件查询  退群客户沉淀表  信息（SQL）
	 * 
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfosBySql(String sql, HashMap parameter) throws RemoteException, Exception;

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（SQL）
	 * 
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public int getCmCustomerQuitGroupCountBySql(String sql, HashMap parameter) throws RemoteException, Exception;

	/**
	 * 单个保存  退群客户沉淀表  信息
	 * 
	 * @param cmCustomerQuitGroupValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws RemoteException, Exception;

	/**
	 * 单个删除  退群客户沉淀表  信息
	 * 
	 * @param cmCustomerQuitGroupValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws RemoteException, Exception;

	/**
	 * 批量保存  退群客户沉淀表  信息
	 * 
	 * @param cmCustomerQuitGroupValues
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws RemoteException, Exception;

	/**
	 * 批量删除  退群客户沉淀表  信息
	 * 
	 * @param cmCustomerQuitGroupValues
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws RemoteException, Exception;
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOCmCustomerQuitGroupValue getCmCustomerQuitGroupById(long id) throws RemoteException, Exception;
}
