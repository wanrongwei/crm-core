package com.asiainfo.crm.cm.customer.group.dao.impl;
import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupExtraInfoEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupExtraInfoDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupExtraInfoValue;
/** 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * @ClassName: ICmGroupExtraInfoDAO.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 12, 2011 2:00:35 PM 
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Jan 12, 2011		huzq2           v1.0.0               修改原因
 */
public class CmGroupExtraInfoDAOImpl implements ICmGroupExtraInfoDAO {

	public void saveGroupExtraInfo(IBOCmGroupExtraInfoValue groupExtraInfoValue) throws Exception{
		BOCmGroupExtraInfoEngine.save(groupExtraInfoValue);
	}

	public void saveGroupExtraInfo(IBOCmGroupExtraInfoValue[] groupExtraInfoValues) throws Exception {
		BOCmGroupExtraInfoEngine.saveBatch(groupExtraInfoValues);
	}
	
	public void createGroupExtraInfo(IBOCmGroupExtraInfoValue groupExtraInfoValue) throws Exception{
		
		BOCmGroupExtraInfoEngine.save(groupExtraInfoValue);
	}

	public IBOCmGroupExtraInfoValue  getGroupExtraInfoById(long groupId) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupExtraInfoValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupExtraInfoValue.S_GroupCustId).append("=:groupCustId");
		parameterMap.put("groupCustId", Long.valueOf(groupId));
		IBOCmGroupExtraInfoValue[]  groupExtraInfos =BOCmGroupExtraInfoEngine.getBeans(condition.toString(), parameterMap);
		if(groupExtraInfos.length==0)
		 return null;
		return groupExtraInfos[0];
	}
	
	public IBOCmGroupExtraInfoValue queryAllStateGroupExtraInfoByGroupCustId(long groupCustId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(IBOCmGroupExtraInfoValue.S_GroupCustId).append("= :groupCustId");
		parameters.put("groupCustId",Long.valueOf(groupCustId));
		IBOCmGroupExtraInfoValue[] results=BOCmGroupExtraInfoEngine.getBeans(condition.toString(),parameters);
		if(results.length==0){
			return null;
		}
		return results[0];
	}
} 
