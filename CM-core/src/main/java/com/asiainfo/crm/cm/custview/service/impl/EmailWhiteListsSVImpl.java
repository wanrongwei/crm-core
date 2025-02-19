package com.asiainfo.crm.cm.custview.service.impl;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.HashMap;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.custview.bo.BOEmailWhiteListsBean;
import com.asiainfo.crm.cm.custview.dao.interfaces.IEmailWhiteListsDAO;
import com.asiainfo.crm.cm.custview.ivalues.IBOEmailWhiteListsValue;
import com.asiainfo.crm.cm.custview.service.interfaces.IEmailWhiteListsSV;

public class EmailWhiteListsSVImpl implements IEmailWhiteListsSV
{
	/**
	 * 根据查询条件查询  Email白名单表  信息（标准格式）
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfos(String condition, HashMap parameter, int start, int end) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		IBOEmailWhiteListsValue[] values = dao.getEmailWhiteListsInfos(condition, parameter, start, end);
		return values;
	}

	/**
	 * 根据查询条件查询  Email白名单表  数量（标准格式）
	 */
	public int getEmailWhiteListsCount(String condition, HashMap parameter) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		int count = dao.getEmailWhiteListsCount(condition, parameter);
		return count;
	}

	/**
	 * 根据查询条件查询  Email白名单表  信息（SQL）
	 */
	public IBOEmailWhiteListsValue[] getEmailWhiteListsInfosBySql(String sql, HashMap parameter) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		IBOEmailWhiteListsValue[] values = dao.getEmailWhiteListsInfosBySql(sql, parameter);
		return values;
	}

	/**
	 * 根据查询条件查询  Email白名单表  数量（SQL）
	 */
	public int getEmailWhiteListsCountBySql(String sql, HashMap parameter) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		int count = dao.getEmailWhiteListsCountBySql(sql, parameter);
		return count;
	}

	/**
	 * 单个保存  Email白名单表  信息
	 */
	public void saveEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		dao.saveEmailWhiteListsValue(emailWhiteListsValue);
	}

	/**
	 * 单个删除  Email白名单表  信息
	 */
	public void deleteEmailWhiteListsValue(IBOEmailWhiteListsValue emailWhiteListsValue) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		dao.deleteEmailWhiteListsValue(emailWhiteListsValue);
	}

	/**
	 * 批量保存  Email白名单表  信息
	 */
	public void saveBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		dao.saveBatchEmailWhiteListsValues(emailWhiteListsValues);

	}

	/**
	 * 批量删除  Email白名单表  信息
	 */
	public void deleteBatchEmailWhiteListsValues(IBOEmailWhiteListsValue[] emailWhiteListsValues) throws RemoteException, Exception
	{
		IEmailWhiteListsDAO dao = (IEmailWhiteListsDAO) ServiceFactory.getService(IEmailWhiteListsDAO.class);
		dao.deleteBatchEmailWhiteListsValues(emailWhiteListsValues);
	}
	
	/**
	 * 根据 mailAddress 查询白名单
	 */
	public IBOEmailWhiteListsValue getEmailWhiteListsByEmail(String mailAddress) throws RemoteException, Exception{
		StringBuffer condition = new StringBuffer(" 1=1 ");
		condition.append(" AND ").append(IBOEmailWhiteListsValue.S_Email).append(" =:email");
		HashMap parameter = new HashMap();
		parameter.put("email", mailAddress);
		IBOEmailWhiteListsValue[] emailWhiteListsValues = getEmailWhiteListsInfos(condition.toString(), parameter, -1, -1);
		if(emailWhiteListsValues != null && emailWhiteListsValues.length > 0){
			return emailWhiteListsValues[0];
		}
		return null;
	}
	
	/**
	 * 保存白名单
	 */
	public void saveEmailWhiteLists(String EmailAddress) throws RemoteException, Exception{
		IBOEmailWhiteListsValue emailWhiteListsValue = new BOEmailWhiteListsBean();
		emailWhiteListsValue.setEmail(EmailAddress);
		Timestamp sysdate = com.ai.omframe.util.TimeUtil.getDefaultSysDate();
		emailWhiteListsValue.setCreateDate(sysdate);
		saveEmailWhiteListsValue(emailWhiteListsValue);
	}
}
