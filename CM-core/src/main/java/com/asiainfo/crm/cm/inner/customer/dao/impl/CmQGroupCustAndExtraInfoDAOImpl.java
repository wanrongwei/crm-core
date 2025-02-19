package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupCustAndExtraInfoEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmQGroupCustAndExtraInfoDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupCustAndExtraInfoValue;

/** 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * @ClassName: ICmQGroupCustAndExtraInfoDAO.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 12, 2011 2:01:07 PM 
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Jan 12, 2011		huzq2           v1.0.0               修改原因
 */
public class CmQGroupCustAndExtraInfoDAOImpl implements ICmQGroupCustAndExtraInfoDAO
{

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~综合查询管理~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfo(DataContainerInterface dataContainer,
			int startIndex, int endIndex) throws Exception
	{
		String[] props = dataContainer.getPropertyNames();
		StringBuffer condition = new StringBuffer(" 1=1 ");
		for (int i=0,len=props.length; i<len; i++)
		{
			condition.append(" and ").append(props[i]).append(" = :").append(props[i]);
		}
		return QBOCmGroupCustAndExtraInfoEngine.getBeans(null, condition.toString(), dataContainer.getProperties(), startIndex, endIndex,
				false);
	}

	public int queryGroupCustAndExtraInfoCount(String condition, Map parameters) throws Exception
	{
		return QBOCmGroupCustAndExtraInfoEngine.getBeansCount(condition, parameters);
	}

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfos(String condition, Map parameters,
			int startIndex, int endIndex) throws Exception
	{
		return QBOCmGroupCustAndExtraInfoEngine.getBeans(null, condition, parameters, startIndex, endIndex, false);
	}

}
