package com.asiainfo.crm.cm.custgroup.service.impl;

import java.rmi.RemoteException;
import java.util.HashMap;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICmCustomerQuitGroupDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerQuitGroupValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICmCustomerQuitGroupSV;
import com.asiainfo.crm.constant.RBossConst;

public class CmCustomerQuitGroupSVImpl implements ICmCustomerQuitGroupSV
{
	/**
	 * 根据查询条件查询  退群客户沉淀表  信息（标准格式）
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfos(String condition, HashMap parameter, int start, int end) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		IBOCmCustomerQuitGroupValue[] values = dao.getCmCustomerQuitGroupInfos(condition, parameter, start, end);
		return values;
	}

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（标准格式）
	 */
	public int getCmCustomerQuitGroupCount(String condition, HashMap parameter) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		int count = dao.getCmCustomerQuitGroupCount(condition, parameter);
		return count;
	}

	/**
	 * 根据查询条件查询  退群客户沉淀表  信息（SQL）
	 */
	public IBOCmCustomerQuitGroupValue[] getCmCustomerQuitGroupInfosBySql(String sql, HashMap parameter) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		IBOCmCustomerQuitGroupValue[] values = dao.getCmCustomerQuitGroupInfosBySql(sql, parameter);
		return values;
	}

	/**
	 * 根据查询条件查询  退群客户沉淀表  数量（SQL）
	 */
	public int getCmCustomerQuitGroupCountBySql(String sql, HashMap parameter) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		int count = dao.getCmCustomerQuitGroupCountBySql(sql, parameter);
		return count;
	}

	/**
	 * 单个保存  退群客户沉淀表  信息
	 */
	public void saveCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		dao.saveCmCustomerQuitGroupValue(cmCustomerQuitGroupValue);
	}

	/**
	 * 单个删除  退群客户沉淀表  信息
	 */
	public void deleteCmCustomerQuitGroupValue(IBOCmCustomerQuitGroupValue cmCustomerQuitGroupValue) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		dao.deleteCmCustomerQuitGroupValue(cmCustomerQuitGroupValue);
	}

	/**
	 * 批量保存  退群客户沉淀表  信息
	 */
	public void saveBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		dao.saveBatchCmCustomerQuitGroupValues(cmCustomerQuitGroupValues);

	}

	/**
	 * 批量删除  退群客户沉淀表  信息
	 */
	public void deleteBatchCmCustomerQuitGroupValues(IBOCmCustomerQuitGroupValue[] cmCustomerQuitGroupValues) throws RemoteException, Exception
	{
		ICmCustomerQuitGroupDAO dao = (ICmCustomerQuitGroupDAO) ServiceFactory.getService(ICmCustomerQuitGroupDAO.class);
		dao.deleteBatchCmCustomerQuitGroupValues(cmCustomerQuitGroupValues);
	}
	
	public IBOCmCustomerQuitGroupValue getCmCustomerQuitGroupById(long id) throws RemoteException, Exception{
		StringBuilder condition = new StringBuilder();
		condition.append(IBOCmCustomerQuitGroupValue.S_Id).append(" = '").append(id).append("' ");
		IBOCmCustomerQuitGroupValue[] values = getCmCustomerQuitGroupInfos(condition.toString(), new HashMap(), -1, -1);
		if(values != null && values.length > 0){
			return values[0];
		}
		return null;
	}
}
