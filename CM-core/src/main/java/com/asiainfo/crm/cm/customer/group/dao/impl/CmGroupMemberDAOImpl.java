package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemUserEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemberEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupKeyMemBillEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupKeyMemHobbyEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupKeyMemberEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustMemberUserBean;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupCustMemberUserEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupKeyMemberUserEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupMemberDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemBillValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemHobbyValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustMemberUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupKeyMemberUserValue;

public class CmGroupMemberDAOImpl implements ICmGroupMemberDAO
{
	public long getNewGroupCustMemberId() throws Exception
	{
		return BOCmGroupCustMemberEngine.getNewId().longValue();
	}

	public long getNewGroupCustMemberUserId() throws Exception
	{
		return BOCmGroupCustMemUserEngine.getNewId().longValue();
	}

	public long getNewGroupKeyMemberId() throws Exception
	{
		return BOCmGroupKeyMemberEngine.getNewId().longValue();
	}

	public long getNewGroupKeyMemberUserId() throws Exception
	{
		return BOCmGroupKeyMemBillEngine.getNewId().longValue();
	}

	public int queryGroupCustMemUserCount(String condition, Map parameter) throws Exception
	{
		return BOCmGroupCustMemUserEngine.getBeansCount(condition, parameter);
	}

	public IBOCmGroupCustMemUserValue[] queryGroupCustMemUsers(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{
		return BOCmGroupCustMemUserEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupCustMemberCount(String condition, Map parameter) throws Exception
	{
		return BOCmGroupCustMemberEngine.getBeansCount(condition, parameter);
	}

	public IBOCmGroupCustMemberValue[] queryGroupCustMembers(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{
		return BOCmGroupCustMemberEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryQGroupCustMemberUserCount(String condition, Map parameter) throws Exception
	{
		return QBOCmGroupCustMemberUserEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmGroupCustMemberUserValue[] queryQGroupCustMemberUsers(String condition, Map parameter, int startNum,
			int endNum) throws Exception
	{
		//return QBOCmGroupCustMemberUserEngine.getBeans(null, condition, parameter, startNum, endNum, false);
		String sql = null;//CmCommonUtil.getOraclePageSQL(QBOCmGroupCustMemberUserBean.class, condition, startNum, endNum);
		return QBOCmGroupCustMemberUserEngine.getBeansFromSql(sql, parameter);
	}

	public void saveGroupCustMemUser(IBOCmGroupCustMemUserValue groupCustMemUserValue) throws Exception
	{
		BOCmGroupCustMemUserEngine.save(groupCustMemUserValue);
	}

	public void saveGroupCustMemUsers(IBOCmGroupCustMemUserValue[] groupCustMemUserValues) throws Exception
	{
		BOCmGroupCustMemUserEngine.saveBatch(groupCustMemUserValues);
	}

	public void saveGroupCustMember(IBOCmGroupCustMemberValue groupCustMemberValue) throws Exception
	{
		BOCmGroupCustMemberEngine.save(groupCustMemberValue);
	}

	public void saveGroupCustMembers(IBOCmGroupCustMemberValue[] groupCustMemberValues) throws Exception
	{
		BOCmGroupCustMemberEngine.saveBatch(groupCustMemberValues);
	}

	public int queryGroupKeyMemBillCount(String condition, Map parameter) throws Exception
	{
		return BOCmGroupKeyMemBillEngine.getBeansCount(condition, parameter);
	}

	public IBOCmGroupKeyMemBillValue[] queryGroupKeyMemBills(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{
		return BOCmGroupKeyMemBillEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupKeyMemberCount(String condition, Map parameter) throws Exception
	{
		return BOCmGroupKeyMemberEngine.getBeansCount(condition, parameter);
	}

	public IBOCmGroupKeyMemberValue[] queryGroupKeyMembers(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{
		return BOCmGroupKeyMemberEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryQGroupKeyMemberUserCount(String condition, Map parameter) throws Exception
	{
		return QBOCmGroupKeyMemberUserEngine.getBeansCount(condition, parameter);
	}

	public IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsers(String condition, Map parameter, int startNum,
			int endNum) throws Exception
	{
		return QBOCmGroupKeyMemberUserEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public void saveGroupKeyMemBill(IBOCmGroupKeyMemBillValue groupKeyMemBillValue) throws Exception
	{
		BOCmGroupKeyMemBillEngine.save(groupKeyMemBillValue);
	}

	public void saveGroupKeyMemBills(IBOCmGroupKeyMemBillValue[] groupKeyMemBillValues) throws Exception
	{
		BOCmGroupKeyMemBillEngine.saveBatch(groupKeyMemBillValues);
	}

	public void saveGroupKeyMember(IBOCmGroupKeyMemberValue groupKeyMemberValue) throws Exception
	{
		BOCmGroupKeyMemberEngine.save(groupKeyMemberValue);
	}

	public void saveGroupKeyMembers(IBOCmGroupKeyMemberValue[] groupKeyMemberValues) throws Exception
	{
		BOCmGroupKeyMemberEngine.saveBatch(groupKeyMemberValues);
	}

	public IBOCmGroupKeyMemHobbyValue[] queryGroupKeyMemHobby(String condition, Map parameter, int startNum, int endNum)
			throws Exception
	{
		return BOCmGroupKeyMemHobbyEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public int queryGroupKeyMemHobbyCount(String condition, Map parameter) throws Exception
	{
		return BOCmGroupKeyMemHobbyEngine.getBeansCount(condition, parameter);
	}

	public void saveGroupKeyMemHobbys(IBOCmGroupKeyMemHobbyValue[] keyMemHobbyValues) throws Exception
	{
		BOCmGroupKeyMemHobbyEngine.saveBatch(keyMemHobbyValues);
	}
}
