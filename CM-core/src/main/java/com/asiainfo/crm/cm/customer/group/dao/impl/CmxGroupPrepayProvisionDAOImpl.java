package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupPrepayContactEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupPrepayBlackInfoEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupPrepayProvisionEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxPayCardRecEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupGroupPrepayContactEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmxGroupPrepayProvisionDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupPrepayContactValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupPrepayBlackInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupPrepayProvisionValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxPayCardRecValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupGroupPrepayContactValue;

/** 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * @ClassName: CmxGroupPrepayProvisionDAOImpl.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 10, 2011 11:53:14 AM 
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Mar 10, 2011		huzq2           v1.0.0               修改原因
 */
public class CmxGroupPrepayProvisionDAOImpl implements ICmxGroupPrepayProvisionDAO
{
	public IBOCmxGroupPrepayProvisionValue queryGroupPrepayProvisionByProvisionid(long provisionId) throws Exception
	{
		return BOCmxGroupPrepayProvisionEngine.getBean(provisionId);
	}

	public void saveGroupPrepayProvisionByProvisionid(IBOCmxGroupPrepayProvisionValue groupPrepayProvision) throws Exception
	{
		BOCmxGroupPrepayProvisionEngine.save(groupPrepayProvision);
	}

	public void saveGroupPrepayProvisionByProvisionids(IBOCmxGroupPrepayProvisionValue[] groupPrepayProvisions) throws Exception
	{
		BOCmxGroupPrepayProvisionEngine.saveBatch(groupPrepayProvisions);
	}

	public boolean existSameTypeGroupPrepayProvision(IBOCmxGroupPrepayProvisionValue groupPrepayProvisionValue) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayProvisionValue.S_BusiCode).append("=:busiCode");
		condition.append(" AND ");
		condition.append("BEG_DATE=TO_DATE( :begDate ,'yyyy-MM-dd')");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append("=:groupCustId");
		parameter.put("busiCode", groupPrepayProvisionValue.getBusiCode());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String begDate = sdf.format(groupPrepayProvisionValue.getBegDate());
		parameter.put("begDate", begDate);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("groupCustId", Long.valueOf(groupPrepayProvisionValue.getGroupCustId()));
		int count = BOCmxGroupPrepayProvisionEngine.getBeansCount(condition.toString(), parameter);
		if (count > 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean existSameSelfRepayGroupPrepayProvision(long groupCustId,String busiCode) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayProvisionValue.S_BusiCode).append("=:busiCode");
		condition.append(" AND ");
		condition.append("BEG_DATE <= now() AND END_DATE > now()");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append("=:groupCustId");
		parameter.put("busiCode", busiCode);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		int count = BOCmxGroupPrepayProvisionEngine.getBeansCount(condition.toString(), parameter);
		if (count > 0)
		{
			return true;
		}
		return false;
	}

	public IBOCmxGroupPrepayProvisionValue queryGroupPrepayProvisionByCondition(long groupCustId, String busiCode) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayProvisionValue.S_BusiCode).append("=:busiCode");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_BegDate).append("<:currDate");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_EndDate).append(">:currDate");
		parameter.put("busiCode", busiCode);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("currDate", BOCmxGroupPrepayProvisionEngine.getSysDate());
		IBOCmxGroupPrepayProvisionValue[] groupPrepayProvisions = BOCmxGroupPrepayProvisionEngine.getBeans(condition.toString(), parameter);
		if (groupPrepayProvisions.length == 0)
			return null;
		else
			return groupPrepayProvisions[0];
	}

	public IBOCmxGroupPrepayProvisionValue[] queryGroupPrepayProvisionByGroupCustId(long groupCustId, int start, int end) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append(" =:groupCustId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_State).append(" =:state");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupPrepayProvisionEngine.getBeans(null, condition.toString(), parameter, start, end, false);
	}

	public int queryGroupPrepayProvisionCountByGroupCustId(long groupCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append(" =:groupCustId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayProvisionValue.S_State).append(" =:state");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupPrepayProvisionEngine.getBeansCount(condition.toString(), parameter);
	}

	public long getNewId() throws Exception
	{
		return BOCmxGroupPrepayProvisionEngine.getNewId().longValue();
	}

	/** 
	 * @Function: CmxGroupPrepayProvisionDAOImpl.java
	 * @Description: 查询集团预付费申请信息
	 * @param groupCustId
	 * @param busiCode
	 * @param groupRegionId
	 * @param groupCountyId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 10, 2011 11:53:46 AM 
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmxGroupPrepayProvisionValue[] queryGroupPrepayProvisions(long groupCustId, String busiCode, String groupRegionId, String groupCountyId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayProvisionValue.S_State).append(" = :state ").append(" and ").append(IBOCmxGroupPrepayProvisionValue.S_BusiCode).append(" = :busiCode ");
		parameter.put("state", "U");
		parameter.put("busiCode", busiCode);

		if (groupCustId > 0)
		{
			condition.append(" and ").append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append(" = :groupCustId ");
			parameter.put("groupCustId", Long.valueOf(groupCustId));
		}
		if (StringUtils.isNotBlank(groupRegionId))
		{
			condition.append(" and ").append(IBOCmxGroupPrepayProvisionValue.S_GroupRegionId).append(" = :groupRegionId ");
			parameter.put("groupRegionId", groupRegionId);
		}
		if (StringUtils.isNotBlank(groupCountyId))
		{
			condition.append(" and ").append(IBOCmxGroupPrepayProvisionValue.S_GroupCountyId).append(" = :groupCountyId ");
			parameter.put("groupRegionId", groupRegionId);
		}
		return BOCmxGroupPrepayProvisionEngine.getBeans(null, condition.toString(), parameter, -1, -1, false);
	}

	/** 
	 * @Function: CmxGroupPrepayProvisionDAOImpl.java
	 * @Description: 查询授信卡商
	 * @param groupCustId
	 * @param busiCode
	 * @param groupRegionId
	 * @param groupCountyId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 10, 2011 12:47:47 PM 
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmxGroupPrepayProvisionValue[] querAccreditedPrepayProvisions(long groupCustId, String busiCode, String groupRegionId, String groupCountyId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("SELECT A.PROVISION_ID,A.GROUP_CUST_ID,A.GROUP_NAME,A.GROUP_REGION_ID,A.GROUP_COUNTY_ID,A.UP_FEE,A.CUR_FEE," + 
				"A.CUR_DISCOUNT,A.BUSI_CODE,A.PRO_STATUS,A.STATE,A.CREATE_OP_ID,A.CREATE_ORG_ID,A.OP_ID,A.ORG_ID,A.GROUP_NAME," 
				+ "A.DONE_CODE,A.CREATE_DATE,A.DONE_DATE,A.EFFECTIVE_DATE,A.EXPIRE_DATE,A.REGION_ID,A.NOTES,A.BEG_DATE,A.END_DATE  "+ "FROM CMX_GROUP_PREPAY_PROVISION A WHERE ").append(
				IBOCmxGroupPrepayProvisionValue.S_State).append(" = :state ").append(" and ").append(IBOCmxGroupPrepayProvisionValue.S_BusiCode).append(" = :busiCode ");
		parameter.put("state", "U");
		parameter.put("busiCode", busiCode);

		if (groupCustId > 0)
		{
			condition.append(" AND ").append(IBOCmxGroupPrepayProvisionValue.S_GroupCustId).append(" = :groupCustId ");
			parameter.put("groupCustId", Long.valueOf(groupCustId));
		}
		if (StringUtils.isNotBlank(groupRegionId))
		{
			condition.append(" AND ").append(IBOCmxGroupPrepayProvisionValue.S_GroupRegionId).append(" = :groupRegionId ");
			parameter.put("groupRegionId", groupRegionId);
		}
		if (StringUtils.isNotBlank(groupCountyId))
		{
			condition.append(" AND ").append(IBOCmxGroupPrepayProvisionValue.S_GroupCountyId).append(" = :groupCountyId ");
			parameter.put("groupCountyId", groupCountyId);
		}
		// 排除黑名单中的记录
		condition.append(" AND NOT EXISTS (SELECT 1 FROM CMX_GROUP_PREPAY_BLACK_INFO B WHERE B.STATE = 'U' AND " + "B.GROUP_CUST_ID = A.GROUP_CUST_ID AND B.BUSI_CODE = A.BUSI_CODE)");
		return BOCmxGroupPrepayProvisionEngine.getBeansFromSql(condition.toString(), parameter);
	}
	
	

	public IBOCmxGroupPrepayBlackInfoValue queryGroupPrepayBlackInfoValueByBlackId(long blackId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_BlackId).append("=:blackId");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_State).append("=:state");
		parameter.put("blackId", Long.valueOf(blackId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupPrepayBlackInfoValue[] groupPrepayBlackInfoValues = BOCmxGroupPrepayBlackInfoEngine.getBeans(condition.toString(), parameter);
		if (groupPrepayBlackInfoValues.length == 0)
		{
			return null;
		}
		return groupPrepayBlackInfoValues[0];
	}

	public IBOCmxGroupPrepayBlackInfoValue[] queryGroupPrepayBlackInfoValueByGroupCustId(long groupCustId, int start, int end) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_GroupCustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_State).append("=:state");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupPrepayBlackInfoValue[] groupPrepayBlackInfoValues = BOCmxGroupPrepayBlackInfoEngine.getBeans(null, condition.toString(), parameter, start, end, false);
		return groupPrepayBlackInfoValues;
	}

	public int queryGroupPrepayBlackInfoCountByGroupCustId(long groupCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_GroupCustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_State).append("=:state");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupPrepayBlackInfoEngine.getBeansCount(condition.toString(), parameter);
	}

	public int queryGroupPrepayBlackInfoCountByCondition(long groupCustId, String busiCode) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_GroupCustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_BusiCode).append("=:busiCode");
		parameter.put("busiCode", busiCode);
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupPrepayBlackInfoEngine.getBeansCount(condition.toString(), parameter);
	}

	public void saveGroupPrepayBlackInfo(IBOCmxGroupPrepayBlackInfoValue prepayBlackInfoValue) throws Exception
	{
		BOCmxGroupPrepayBlackInfoEngine.save(prepayBlackInfoValue);
	}

	public void saveGroupPrepayBlackInfos(IBOCmxGroupPrepayBlackInfoValue[] prepayBlackInfoValue) throws Exception
	{
		BOCmxGroupPrepayBlackInfoEngine.saveBatch(prepayBlackInfoValue);
	}

	public long getBlackInfoNewId() throws Exception
	{
		return BOCmxGroupPrepayBlackInfoEngine.getNewId().longValue();
	}

	public int querySameTypeBlackInfoCount(String busiCode, long groupCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_GroupCustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupPrepayBlackInfoValue.S_BusiCode).append("=:busiCode");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("busiCode", busiCode);
		return BOCmxGroupPrepayBlackInfoEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmxPayCardRecValue[] queryPayCardRecordByCondition(String condition, Map parameter, int start, int end) throws Exception
	{
		return BOCmxPayCardRecEngine.getBeans(null, condition.toString(), parameter, start, end, true);
	}

	public int queryPayCardRecordCountByCondition(String condition, Map parameter) throws Exception
	{
		return BOCmxPayCardRecEngine.getBeansCount(condition.toString(), parameter);
	}
	
	public long getPayCardRecordId() throws Exception
	{
		return BOCmxPayCardRecEngine.getNewId().longValue();
	}
	
	public void savePayCardRecord(IBOCmxPayCardRecValue payCardRec) throws Exception
	{                   
		BOCmxPayCardRecEngine.save(payCardRec);
	}
	
	public int queryGroupPrepayContactCountByBillIdAndPassword( String billId , String password ) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupPrepayContactValue.S_BillId).append("=:billId");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_Password).append("=:password");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("billId", billId);
		parameter.put("password", password);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupPrepayContactEngine.getBeansCount(condition.toString(),parameter);
	}
	
	public IBOCmGroupPrepayContactValue queryGroupPrepayContactByBillIdAndPassword( String billId , String password ) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupPrepayContactValue.S_BillId).append("=:billId");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_Password).append("=:password");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("billId", billId);
		parameter.put("password", password);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupPrepayContactValue[] prepayContacts=BOCmGroupPrepayContactEngine.getBeans(condition.toString(),parameter);
		if(prepayContacts!=null && prepayContacts.length>0){
			return prepayContacts[0];
		}
		return null;
	}
	
	public void saveGroupPrepayContact(IBOCmGroupPrepayContactValue groupPrepayContact) throws Exception
	{
		BOCmGroupPrepayContactEngine.save(groupPrepayContact);
	}
	
	public IQBOCmGroupGroupPrepayContactValue[] queryGroupPrepayContactByBillId(String billId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupPrepayContactValue.S_BillId).append("=:billId");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("billId", billId);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return QBOCmGroupGroupPrepayContactEngine.getBeans(condition.toString(), parameter);
	}
	
	public int queryGroupPrepayContactByBillIdAndGroupCustId(String billId,long groupCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_BillId).append("=:billId");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_GroupCustId).append("=:groupCustId");
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("billId", billId);
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupPrepayContactEngine.getBeansCount(condition.toString(), parameter);
	}
	
	public IBOCmGroupPrepayContactValue[]  queryGroupPrepayContactByGroupCustId(long groupCustId,int startNum,int endNum) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupPrepayContactValue.S_GroupCustId).append("=:groupCustId");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupPrepayContactEngine.getBeans(null,condition.toString(),parameter,startNum,endNum,false);
	}
	
	public IBOCmGroupPrepayContactValue  queryGroupPrepayContactByContId(long contId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupPrepayContactValue.S_ContId).append("=:contId");
		parameter.put("contId", Long.valueOf(contId));
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupPrepayContactValue[] result =  BOCmGroupPrepayContactEngine.getBeans(condition.toString(),parameter);
		if(result!=null && result.length>0){
			return result[0];
		}
		return null;
	}
	
	public int  queryGroupPrepayContactCountByGroupCustId(long groupCustId) throws Exception
	{
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupPrepayContactValue.S_GroupCustId).append("=:groupCustId");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupPrepayContactValue.S_State).append("=:state");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupPrepayContactEngine.getBeansCount(condition.toString(),parameter);
	}
	
	public long queryGroupPrepayContactNewId() throws Exception
	{
		return BOCmGroupPrepayContactEngine.getNewId().longValue();
	}
	
	public Date getSysDate() throws Exception
	{
		return BOCmGroupPrepayContactEngine.getSysDate();
	}
}