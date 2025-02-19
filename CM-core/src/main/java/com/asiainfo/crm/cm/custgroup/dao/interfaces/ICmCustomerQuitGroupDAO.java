package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerQuitGroupValue;
import java.util.*;

public interface ICmCustomerQuitGroupDAO 
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
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfos(String condition, HashMap parameter, int start, int end) throws Exception;
	
	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（标准格式）
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public int getCmCustomerQuitGroupCount(String condition, HashMap parameter) throws Exception;
	
	/**
	 * 根据查询条件查询  退群客户沉淀表  信息（ByMap）
	 *
	 * @param paramMap
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfosByMap(HashMap paramMap, int start, int end) throws Exception;
	
	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（ByMap）
	 *
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public int getCmCustomerQuitGroupCountByMap(HashMap paramMap) throws Exception;

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（BySql）
	 * 
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfosBySql(String sql, HashMap parameter) throws Exception;

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（BySql）
	 *
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public int getCmCustomerQuitGroupCountBySql(String sql, HashMap parameter) throws Exception;

	/**
	 * 单个保存  退群客户沉淀表  信息
	 *
	 * @param cmCustomerQuitGroupValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws Exception;
	
	/**
	 * 单个删除  退群客户沉淀表  信息
	 *
	 * @param cmCustomerQuitGroupValue
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws Exception;
	
	/**
	 * 批量保存  退群客户沉淀表  信息
	 *
	 * @param cmCustomerQuitGroupValues
	 * @throws RemoteException
	 * @throws Exception
	 */	
	public void saveBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws Exception;
	
	/**
	 * 批量删除  退群客户沉淀表  信息
	 *
	 * @param cmCustomerQuitGroupValues
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void deleteBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws Exception;

}
