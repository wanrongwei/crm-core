package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.StringUtils;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupAccountEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmxGroupAccountDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupAccountValue;

public class CmxGroupAccountDAOImpl implements ICmxGroupAccountDAO
{

	/*public void saveGroupAccount(IBOCmxGroupAccountValue groupAccountValue) throws Exception
	{
		BOCmxGroupAccountEngine.save(groupAccountValue);
	}

	public IBOCmxGroupAccountValue[] queryGroupAccountInfo(long acctId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_AcctId).append("  = :acctId ");
		condition.append(" and ");
		condition.append(IBOCmxGroupAccountValue.S_State).append("  = :state ");
		paraMap.put("acctId", Long.valueOf(acctId));
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupAccountValue[] groupAccountValues = BOCmxGroupAccountEngine.getBeans(condition.toString(), paraMap);
		return groupAccountValues;
	}

	public IBOCmxGroupAccountValue[] queryGroupAccountInfo(long acctId, long groupCustId, int start, int end)
			throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_State).append("  = :state ");
		if (acctId > 0)
		{
			condition.append(" and ").append(IBOCmxGroupAccountValue.S_AcctId).append("  = :acctId ");
			paraMap.put("acctId", Long.valueOf(acctId));
		}
		if (groupCustId > 0)
		{
			condition.append(" and ").append(IBOCmxGroupAccountValue.S_GroupCustId).append("  = :groupCustId ");
			paraMap.put("groupCustId", Long.valueOf(groupCustId));
		}
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupAccountValue[] groupAccountValues = BOCmxGroupAccountEngine.getBeans(null, condition.toString(),
				paraMap, start, end, false);
		return groupAccountValues;
	}

	public IBOCmxGroupAccountValue[] queryGroupAccountInfo(long groupCustId, int acctBusiType) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_GroupCustId).append("  = :groupCustId ");
		condition.append(" and ");
		if (acctBusiType >= 0)
		{
			condition.append(IBOCmxGroupAccountValue.S_AcctBusiType).append("  = :acctBusiType ");
			condition.append(" and ");
			paraMap.put("acctBusiType", Integer.valueOf(acctBusiType));
		}
		condition.append(IBOCmxGroupAccountValue.S_State).append("  = :state ");
		condition.append(" and sysdate between ").append(IBOCmxGroupAccountValue.S_EffectiveDate);
		condition.append(" and ").append(IBOCmxGroupAccountValue.S_ExpireDate);
		paraMap.put("groupCustId", Long.valueOf(groupCustId));
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupAccountValue[] groupAccountValues = BOCmxGroupAccountEngine.getBeans(condition.toString(), paraMap);
		return groupAccountValues;
	}

	public int queryGroupAccountsCount(long groupCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_GroupCustId).append("  = :groupCustId ");
		condition.append(" and ");
		condition.append(IBOCmxGroupAccountValue.S_State).append("  = :state ");
		paraMap.put("groupCustId", Long.valueOf(groupCustId));
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupAccountEngine.getBeansCount(condition.toString(), paraMap);
	}

	public int queryGroupAccountsCount(long groupCustId, long acctId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		if (groupCustId > 0)
		{
			condition.append(IBOCmxGroupAccountValue.S_GroupCustId).append("  = :groupCustId ");
			condition.append(" and ");
			paraMap.put("groupCustId", Long.valueOf(groupCustId));
		}
		if (acctId > 0)
		{
			condition.append(IBOCmxGroupAccountValue.S_AcctId).append("  = :acctId ");
			condition.append(" and ");
			paraMap.put("acctId", Long.valueOf(acctId));
		}
		condition.append(IBOCmxGroupAccountValue.S_State).append("  = :state ");
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupAccountEngine.getBeansCount(condition.toString(), paraMap);
	}

	public IQBOCmGroupValue[] queryGroupAcctIdByGroupName(String groupCustName, int start, int end) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IQBOCmGroupValue.S_CustName).append("  like :groupCustName ");
		paraMap.put("groupCustName", "%" + groupCustName + "%");
		return QBOCmGroupEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
	}

	public int queryGroupAcctCountByGroupName(String groupCustName) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IQBOCmGroupValue.S_CustName).append("  like :groupCustName ");
		paraMap.put("groupCustName", "%" + groupCustName + "%");
		return QBOCmGroupEngine.getBeansCount(condition.toString(), paraMap);
	}

	public IBOCmxGroupAccountValue[] queryEManagerGroupAccounts(int isPrepayTag, int start, int end) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_IsPrepaytag).append("  = :isPrepayTag ");
		condition.append(" and ").append(IBOCmxGroupAccountValue.S_State).append(" = :state ");
		paraMap.put("isPrepayTag", Integer.valueOf(CmxConstants.AccountConstants.E_MANAGER));
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupAccountEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
	}

	public void saveGroupAccountsBatch(IBOCmxGroupAccountValue[] groupAccountValues) throws Exception
	{
		BOCmxGroupAccountEngine.saveBatch(groupAccountValues);
	}

	public int queryEManagerGroupAccountsCount(int isPrepayTag) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_IsPrepaytag).append("  = :isPrepayTag ");
		condition.append(" and ").append(IBOCmxGroupAccountValue.S_State).append(" = :state ");
		paraMap.put("isPrepayTag", Integer.valueOf(CmxConstants.AccountConstants.E_MANAGER));
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupAccountEngine.getBeansCount(condition.toString(), paraMap);
	}

	public IBOCmxGroupAccountValue[] queryCmxGroupAccountByContBill(String billId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmxGroupAccountValue.S_ContMobile).append("  = :billId ");
		condition.append(" and ");
		condition.append(IBOCmxGroupAccountValue.S_State).append("  = :state ");
		paraMap.put("billId", billId);
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupAccountValue[] groupAccountValues = BOCmxGroupAccountEngine.getBeans(condition.toString(), paraMap);
		return groupAccountValues;
	}*/

	public List queryGroupAcctContactCount(String regionId) throws Exception
	{
		List result = new ArrayList();
		String[] oneCounty = null;

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try
		{
			conn = ServiceManager.getSession().getConnection();
			StringBuilder countSql = new StringBuilder();
			countSql
					.append(
							"SELECT COUNT(*), T.COUNTY_ID FROM (SELECT DECODE(T1.COUNTY_ID, NULL, T2.CHNL_REGION_TYPE, T1.COUNTY_ID) AS COUNTY_ID ")
					.append(
							"FROM CMX_GROUP_ACCOUNT T1, CM_GROUP_CUSTOMER T2 WHERE T1.GROUP_CUST_ID = T2.GROUP_CUST_ID ")
					.append("AND T1.REGION_ID = '").append(regionId).append("' AND T2.CHNL_CITY_ID = '").append(
							regionId).append("') T ").append("GROUP BY T.COUNTY_ID ORDER BY T.COUNTY_ID");

			ps = conn.prepareStatement(countSql.toString());
			rs = ps.executeQuery();
			while (rs.next())
			{
				if (!StringUtils.isEmptyString(rs.getString(2)))
				{
					oneCounty = new String[2];
					oneCounty[0] = rs.getString(2);
					oneCounty[1] = Integer.toString(rs.getInt(1));
					result.add(oneCounty);
				}
			}
		}
		finally
		{
			CmCommonUtil.closeJDBC(conn, ps, rs);
		}

		return result;
	}

	public IQBOCmGroupAccountValue[] queryGroupAcctContacts(String regionId, String regionType, String regionDetail,
			int start, int end) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!StringUtils.isEmptyString(regionId) && !"-1".equals(regionId) && !"-2".equals(regionId))
		{
			condition.append(" and ").append(IQBOCmGroupAccountValue.S_ChnlCityId).append("  = :regionId ");
			paraMap.put("regionId", regionId);
		}
		if (!StringUtils.isEmptyString(regionType) && !"-1".equals(regionType) && !"-2".equals(regionType))
		{
			condition.append(" and ").append(IQBOCmGroupAccountValue.S_ChnlRegionType).append(" = :regionType ");
			paraMap.put("regionType", regionType);
		}
		if (!StringUtils.isEmptyString(regionDetail) && !"-1".equals(regionDetail) && !"-2".equals(regionDetail))
		{
			condition.append(" and ").append(IQBOCmGroupAccountValue.S_ChnlRegionDetail).append(" = :regionDetail ");
			paraMap.put("regionDetail", regionDetail);
		}
		return QBOCmGroupAccountEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
	}

	public int queryGroupAcctContactsCount(String regionId, String regionType, String regionDetail) throws Exception,
			RemoteException
	{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!StringUtils.isEmptyString(regionId) && !"-1".equals(regionId) && !"-2".equals(regionId))
		{
			condition.append(" and ").append(IQBOCmGroupAccountValue.S_ChnlCityId).append("  = :regionId ");
			paraMap.put("regionId", regionId);
		}
		if (!StringUtils.isEmptyString(regionType) && !"-1".equals(regionType) && !"-2".equals(regionType))
		{
			condition.append(" and ").append(IQBOCmGroupAccountValue.S_ChnlRegionType).append(" = :regionType ");
			paraMap.put("regionType", regionType);
		}
		if (!StringUtils.isEmptyString(regionDetail) && !"-1".equals(regionDetail) && !"-2".equals(regionDetail))
		{
			condition.append(" and ").append(IQBOCmGroupAccountValue.S_ChnlRegionDetail).append(" = :regionDetail ");
			paraMap.put("regionDetail", regionDetail);
		}
		return QBOCmGroupAccountEngine.getBeansCount(condition.toString(), paraMap);
	}
	
	public IQBOCmGroupAccountValue[] queryGroupAcctByAcctName(String acctName) throws Exception{
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IQBOCmGroupAccountValue.S_AccAliasName).append(" like :acctName");
		paraMap.put("acctName", "%"+acctName+"%");
		return QBOCmGroupAccountEngine.getBeans(condition.toString(), paraMap);
	}
}
