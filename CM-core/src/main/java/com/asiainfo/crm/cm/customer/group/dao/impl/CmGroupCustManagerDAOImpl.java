package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMgrRelEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustManagerEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustMgrRelEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustManagerDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMgrRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustMgrRelValue;
public class CmGroupCustManagerDAOImpl implements ICmGroupCustManagerDAO
{
	public IBOCmGroupCustMgrRelValue[]  queryGroupCustMgrRelsByGroupCustId(long groupCustId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId",Long.valueOf(groupCustId));
		return BOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
	}
	
	public int queryGroupCustMgrRelsByMgrIds(long[] mgrIds,long groupCustId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		if(mgrIds!=null && mgrIds.length>0){
			condition.append(" AND ").append(IBOCmGroupCustMgrRelValue.S_MgrId).append(" IN ( ");
			for(int i=0;i<mgrIds.length;i++){
				if(i==0){
					condition.append(mgrIds[i]);
				}else{
					condition.append(",").append(mgrIds[i]);
				}
			}
			condition.append(" ) ");
			condition.append(" AND ").append(IBOCmGroupCustMgrRelValue.S_GroupCustId).append(" =:groupCustId ");
			parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		}else{
			return 0;
		}
		return BOCmGroupCustMgrRelEngine.getBeansCount(condition.toString(), parameterMap);
	}
	
	public void saveGroupCustMgrRels(IBOCmGroupCustMgrRelValue[] groupCustMgrRel) throws Exception
	{
		BOCmGroupCustMgrRelEngine.saveBatch(groupCustMgrRel);
	}
	
	public void saveGroupCustMgrRel(IBOCmGroupCustMgrRelValue groupCustMgrRel) throws Exception
	{
		BOCmGroupCustMgrRelEngine.save(groupCustMgrRel);
	}

	public IBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelsByRegiontId(long regionCode) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_RegionCode).append(" = :regionCode ");
		parameterMap.put("regionCode",Long.valueOf(regionCode));
		return BOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
	}
	
	public IQBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelAndMgrInfoByGroupId(long groupId,int start,int end) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IQBOCmGroupCustMgrRelValue.S_GroupCustId).append("=:groupId");
		parameterMap.put("groupId", Long.valueOf(groupId));
		return QBOCmGroupCustMgrRelEngine.getBeans(null,condition.toString(),parameterMap,start,end,false);
	}
	
	public IQBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelAndMgrInfoByGroupIds(long[] groupIds) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		if (groupIds != null && groupIds.length > 0)
		{
			int count =0;
			if(groupIds.length>=1000){
				count=groupIds.length/1000+1;
			}
			for(int m=0;m<count-1;m++){
				condition.append(IQBOCmGroupCustMgrRelValue.S_GroupCustId).append(" IN (");
				for (int i=0 ; i <1000 ; i++)
				{
					if (i == 0)
					{
						condition.append(String.valueOf(groupIds[i]));
						continue;
					}
					condition.append(",").append(String.valueOf(groupIds[i]));
				}
				condition.append(") OR ");
			}
			condition.append(IQBOCmGroupCustMgrRelValue.S_GroupCustId).append(" IN (");
			for (int i=0 ; i <groupIds.length%1000 ; i++)
			{
				if (i == 0)
				{
					condition.append(String.valueOf(groupIds[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupIds[i]));
			}
			condition.append(") ");
			return QBOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
		}
		else
		{
			return new IQBOCmGroupCustMgrRelValue[0];
		}
	}
	
	public int queryGroupCustMgrRelAndMgrInfoCountByGroupId(long groupId) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IQBOCmGroupCustMgrRelValue.S_GroupCustId).append("=:groupId");
		parameterMap.put("groupId", Long.valueOf(groupId));
		return QBOCmGroupCustMgrRelEngine.getBeansCount(condition.toString(),parameterMap);
	}
	
	public IBOCmGroupCustMgrRelValue  queryGroupCustMgrRelsByGroupCustIdAndMgrId(long groupCustId,long mgrId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId",Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_MgrId).append(" = :mgrId ");
		parameterMap.put("mgrId",Long.valueOf(mgrId));
		IBOCmGroupCustMgrRelValue[] results= BOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
		if(results==null || results.length==0){
			return null;
		}
		 return results[0];
	}
	
	public IBOCmGroupCustMgrRelValue queryGroupCustMgrRelsByCdn(long groupCustId,long mgrId, int relType) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		if(groupCustId>0){
			condition.append(" AND ");
			condition.append(IBOCmGroupCustMgrRelValue.S_GroupCustId).append(" = :groupCustId ");
			parameterMap.put("groupCustId",Long.valueOf(groupCustId));
		}
		if(mgrId>0){
			condition.append(" AND ");
			condition.append(IBOCmGroupCustMgrRelValue.S_MgrId).append(" = :mgrId ");
			parameterMap.put("mgrId",Long.valueOf(mgrId));
		}
		if(relType>0){
			condition.append(" AND ");
			condition.append(IBOCmGroupCustMgrRelValue.S_RelType).append(" = :relType ");
			parameterMap.put("relType",Long.valueOf(relType));
		}
		IBOCmGroupCustMgrRelValue[] results= BOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
		if(results==null || results.length==0){
			return null;
		}
		 return results[0];
	}
	
	public int  queryGroupCustMgrRelsCountByGroupCustIdAndMgrId(long groupCustId,long mgrId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_GroupCustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId",Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_MgrId).append(" = :mgrId ");
		parameterMap.put("mgrId",Long.valueOf(mgrId));
		return  BOCmGroupCustMgrRelEngine.getBeansCount(condition.toString(), parameterMap);
	}
	
	public IBOCmGroupCustMgrRelValue[] getGroupCustMgrRelsByMgeId(long mgrId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_MgrId).append(" = :mgrId ");
		parameterMap.put("mgrId",Long.valueOf(mgrId));
		return  BOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
	}
	
	public IQBOCmGroupCustMgrRelValue[] queryGroupCustMgrByMgrId(long mgrId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupCustMgrRelValue.S_State).append(" = :state ");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustMgrRelValue.S_MgrId).append(" = :mgrId ");
		parameterMap.put("mgrId",Long.valueOf(mgrId));
		return QBOCmGroupCustMgrRelEngine.getBeans(condition.toString(), parameterMap);
	}

	public IQBOCmGroupCustManagerValue[] queryGroupMgrInfo(int start,int end) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		IQBOCmGroupCustManagerValue[] results= QBOCmGroupCustManagerEngine.getBeans(null,condition.toString(), parameterMap,start,end,false);
		return results;
	}
	
	public int queryGroupMgrInfoCount() throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		return QBOCmGroupCustManagerEngine.getBeansCount(condition.toString(), parameterMap);
	}

	public IQBOCmGroupCustManagerValue[] queryGroupMgrInfoToSql(int start, int end) throws Exception {
		StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM (SELECT M.* FROM (");
		sqlBuilder.append("SELECT B.BILL_ID,A.GROUP_CUST_ID,A.REL_TYPE,A.STATE,A.DONE_DATE FROM CM_GROUP_CUST_MGR_REL A, CMX_MANAGER B ");
		sqlBuilder.append(" WHERE A.MGR_ID = B.STAFF_ID AND B.STATE = 1 AND A.STATE = 'U'");
		sqlBuilder.append(") M "); 
		if(start == 1 && end == 1){
			sqlBuilder.append(")");
		}else{
			sqlBuilder.append(")");
			sqlBuilder.append(" LIMIT ").append(start).append(",").append(end);
		}	
		return QBOCmGroupCustManagerEngine.getBeansFromSql(sqlBuilder.toString(), new HashMap());
	}
	
	
	public DataContainer[] queryOnlineGroupMgrInfo(String startDate,String endDate,int start, int end) throws Exception {
		//NOTES 带出GROUP_ID
		StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM (SELECT M.* FROM (");
		sqlBuilder.append("SELECT B.BILL_ID,A.GROUP_CUST_ID,A.REL_TYPE,A.STATE,A.DONE_DATE ,C.GROUP_ID AS NOTES,B.STAFF_NAME,B.STAFF_ID AS MGR_ID FROM CM_GROUP_CUST_MGR_REL A, CMX_MANAGER B ,CM_GROUP_CUSTOMER C ");
		sqlBuilder.append(" WHERE A.MGR_ID = B.STAFF_ID AND A.GROUP_CUST_ID = C.GROUP_CUST_ID AND C.STATE = 'U' AND B.STATE = 1 AND C.GROUP_STATUS = 0 ");
		if(startDate!=null && endDate!=null){
			sqlBuilder.append(" AND ").append(" A.DONE_DATE >= DATE_FORMAT('").append(startDate).append("','%Y-%m-%d') ");
			sqlBuilder.append(" AND ").append(" A.DONE_DATE <  DATE_FORMAT('").append(endDate).append("','%Y-%m-%d') ");
		}else{
			sqlBuilder.append(" AND A.DONE_DATE >= DATE_FORMAT( DATE_ADD( NOW() ,INTERVAL-1 DAY) ,'%Y-%m-%d') AND A.DONE_DATE < DATE_FORMAT(NOW(),,'%Y-%m-%d')");
		}
		
		sqlBuilder.append(") M "); 
		if(start == 1 && end == 1){
			sqlBuilder.append(")");
		}else{
			sqlBuilder.append(")");
			sqlBuilder.append(" LIMIT ").append(start).append(",").append(end);
		}	
		IQBOCmGroupCustManagerValue[] custManagers=QBOCmGroupCustManagerEngine.getBeansFromSql(sqlBuilder.toString(), new HashMap());
		DataContainer[] datas = new DataContainer[custManagers.length];
		HashMap paramMap = new HashMap();
		for (int i = 0; i < custManagers.length; i++) {
			paramMap.clear();
			paramMap.put("GROUP_ID", custManagers[i].getNotes());
			DataContainer data = CmCommonUtil.getDataContainers(custManagers[i], paramMap)[0];
			datas[i] = data;
		}
		return datas;
	}	
}
