package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.omframe.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmRepOnceIncomeBusiEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmRepOnceIncomeIDCEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupOnceIncomeBillEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupOnceIncomeDetailEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupOnceIncomeEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupIncomeDetailEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupOnceIncomeDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmRepOnceIncomeBusiValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmRepOnceIncomeIDCValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupOnceIncomeBillValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupOnceIncomeDetailValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupOnceIncomeValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupIncomeDetailValue;

public class CmGroupOnceIncomeDAOImpl implements ICmGroupOnceIncomeDAO {
	public IBOCmxGroupOnceIncomeValue queryGroupOnceIncomeByOnceIncomeId(long onceIncomeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupOnceIncomeValue[] groupOnceIncome = BOCmxGroupOnceIncomeEngine.getBeans(condition.toString(), parameter);
		if (groupOnceIncome.length == 0) {
			return null;
		}
		return groupOnceIncome[0];
	}

	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomeByHistoryForRep(String startMonth, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" TO_CHAR( ").append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(",'YYYYMM' ) <= :startMonth ");
		condition.append(" AND ");
		condition.append(" ( ").append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" IN (1,2,4) ");
		condition.append(" OR ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" IN (3,5,6) ").append(")");
		// condition.append(" AND ");
		// condition.append("
		// TO_CHAR(").append(IBOCmxGroupOnceIncomeValue.S_DoneDate).append(",'YYYYMM')
		// >= :startMonth ))");
		parameter.put("startMonth", startMonth);
		IBOCmxGroupOnceIncomeValue[] groupOnceIncome = BOCmxGroupOnceIncomeEngine.getBeans(null, condition.toString(), parameter, start, end, false);
		return groupOnceIncome;
	}

	public int queryGroupOnceIncomeCountByHistoryForRep(String startMonth) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" TO_CHAR( ").append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(",'YYYYMM' ) <= :startMonth ");
		condition.append(" AND ");
		condition.append(" ( ").append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" IN (1,2,4) ");
		condition.append(" OR ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" IN (3,5,6) ").append(")");
		// condition.append(" AND ");
		// condition.append("
		// TO_CHAR(").append(IBOCmxGroupOnceIncomeValue.S_DoneDate).append(",'YYYYMM')
		// >= :startMonth ))");
		parameter.put("startMonth", startMonth);
		return BOCmxGroupOnceIncomeEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomeByGroupCustId(long groupCustId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_GroupCustId).append(" = :groupCustId ");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_State).append(" = :state ");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupOnceIncomeEngine.getBeans(condition.toString(), parameter);
	}

	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomeByCondition(String endMonth, int[] recStatus, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_EndMonth).append(" < :endMonth ");
		parameter.put("endMonth", endMonth);
		if (recStatus != null && recStatus.length > 0) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" IN ( ");
			for (int i = 0; i < recStatus.length; i++) {
				if (i != 0) {
					condition.append(",").append(recStatus[i]);
				} else {
					condition.append(recStatus[i]);
				}
			}
			condition.append(") ");
		}
		return BOCmxGroupOnceIncomeEngine.getBeans(null, condition.toString(), parameter, start, end, false);
	}

	public int queryGroupOnceIncomeCountByCondition(String endMonth, int[] recStatus) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_EndMonth).append(" < :endMonth ");
		parameter.put("endMonth", endMonth);
		if (recStatus != null && recStatus.length > 0) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" IN ( ");
			for (int i = 0; i < recStatus.length; i++) {
				if (i != 0) {
					condition.append(",").append(recStatus[i]);
				} else {
					condition.append(recStatus[i]);
				}
			}
			condition.append(") ");
		}
		return BOCmxGroupOnceIncomeEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomesByCondition(int feeType, int planType, String startDate, String endDate, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ");
		if (feeType > 0) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_FeeType).append(" = :feeType ");
			condition.append(" AND ");
			parameter.put("feeType", Integer.valueOf(feeType));
		}
		if (planType > 0) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_PlanType).append(" = :planType ");
			condition.append(" AND ");
			parameter.put("planType", Integer.valueOf(planType));
		}
		if (StringUtils.isNotBlank(startDate)) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(" >= :startDate ");
			condition.append(" AND ");
			parameter.put("startDate", TimeUtil.convertStringToDate(startDate, "yyyy-MM-dd"));
		}
		if (StringUtils.isNotBlank(endDate)) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(" <= :endDate ");
			condition.append(" AND ");
			parameter.put("startDate", TimeUtil.convertStringToDate(endDate, "yyyy-MM-dd"));
		}
		condition.append(IBOCmxGroupOnceIncomeValue.S_State).append(" =:state");
		return BOCmxGroupOnceIncomeEngine.getBeans(null, condition.toString(), parameter, start, end, false);
	}

	public IQBOCmGroupIncomeDetailValue[] queryGroupOnceIncomeAtrrByCondition(int feeType, int planType, String startDate, String endDate, long groupCustId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (feeType > 0) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_FeeType).append(" = :feeType ");
			parameter.put("feeType", Integer.valueOf(feeType));
		}
		if (planType > 0) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_PlanType).append(" = :planType ");
			parameter.put("planType", Integer.valueOf(planType));
		}
		if (StringUtils.isNotBlank(startDate)) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(" >= :startDate ");
			parameter.put("startDate", TimeUtil.convertStringToDate(startDate, "yyyy-MM-dd"));
		}
		if (StringUtils.isNotBlank(endDate)) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(" <= :endDate ");
			parameter.put("endDate", TimeUtil.convertStringToDate(endDate, "yyyy-MM-dd"));
		}
		if (groupCustId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeValue.S_GroupCustId).append(" =:groupCustId");
			parameter.put("groupCustId", Long.valueOf(groupCustId));
		}
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_State).append(" =:state");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return QBOCmGroupIncomeDetailEngine.getBeans(null, condition.toString(), parameter, start, end, false);
	}

	public IQBOCmGroupIncomeDetailValue[] queryAllGroupOnceIncomeIDC(int planType, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_PlanType).append(" =:planType");
		parameter.put("planType", Long.valueOf(planType));
		condition.append(" AND ");
		// 合同撤销，合同异常终止无欠费，合同终止无欠费不纳入统计
		condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" NOT IN ( 3 ,5 , 6 ) ");
		return QBOCmGroupIncomeDetailEngine.getBeans(null, condition.toString(), parameter, start, end, false);
	}

	public int queryAllGroupOnceIncomeIDCCount(int planType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_PlanType).append(" =:planType");
		parameter.put("planType", Long.valueOf(planType));
		condition.append(" AND ");
		// 合同撤销，合同异常终止无欠费，合同终止无欠费不纳入统计
		condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" NOT IN ( 3 ,5 , 6 ) ");
		return QBOCmGroupIncomeDetailEngine.getBeansCount(condition.toString(), parameter);
	}

	public int queryGroupOnceIncomeAtrrCountByCondition(int feeType, int planType, String startDate, String endDate, long groupCustId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ");
		if (feeType > 0) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_FeeType).append(" = :feeType ");
			condition.append(" AND ");
			parameter.put("feeType", Integer.valueOf(feeType));
		}
		if (planType > 0) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_PlanType).append(" = :planType ");
			condition.append(" AND ");
			parameter.put("planType", Integer.valueOf(planType));
		}
		if (StringUtils.isNotBlank(startDate)) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(" >= :startDate ");
			condition.append(" AND ");
			parameter.put("startDate", TimeUtil.convertStringToDate(startDate, "yyyy-MM-dd"));
		}
		if (StringUtils.isNotBlank(endDate)) {
			condition.append(IBOCmxGroupOnceIncomeValue.S_ContractDate).append(" <= :endDate ");
			condition.append(" AND ");
			parameter.put("endDate", TimeUtil.convertStringToDate(endDate, "yyyy-MM-dd"));
		}
		condition.append(IBOCmxGroupOnceIncomeValue.S_GroupCustId).append(" =:groupCustId");
		condition.append(" AND ");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(IBOCmxGroupOnceIncomeValue.S_State).append(" =:state");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return QBOCmGroupIncomeDetailEngine.getBeansCount(condition.toString(), parameter);
	}

	public void saveGroupOnceIncome(IBOCmxGroupOnceIncomeValue groupOnceIncome) throws Exception {
		BOCmxGroupOnceIncomeEngine.save(groupOnceIncome);
	}

	public void saveGroupOnceIncomes(IBOCmxGroupOnceIncomeValue[] groupOnceIncome) throws Exception {
		BOCmxGroupOnceIncomeEngine.saveBatch(groupOnceIncome);
	}

	public long getGroupOnceIncomeNewId() throws Exception {
		return BOCmxGroupOnceIncomeEngine.getNewId().longValue();
	}

	public Timestamp getDate() throws Exception {
		return BOCmxGroupOnceIncomeEngine.getSysDate();
	}

	public IBOCmxGroupOnceIncomeBillValue[] queryGroupOnceIncomeBillByOnceIncomeId(long onceIncomeId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupOnceIncomeBillValue[] groupOnceIncomeBills = BOCmxGroupOnceIncomeBillEngine.getBeans(null, condition.toString(), parameter, start, end, false);
		return groupOnceIncomeBills;
	}

	public int queryGroupOnceIncomeBillCountByOnceIncomeId(long onceIncomeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupOnceIncomeBillEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmxGroupOnceIncomeBillValue queryGroupOnceIncomeBillByCondition(long onceIncomeId, String billId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_BillId).append(" = :billId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("billId", billId);
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupOnceIncomeBillValue[] groupOnceIncomeBills = BOCmxGroupOnceIncomeBillEngine.getBeans(condition.toString(), parameter);
		if (groupOnceIncomeBills.length == 0) {
			return null;
		}
		return groupOnceIncomeBills[0];
	}

	public void saveGroupOnceIncomeBill(IBOCmxGroupOnceIncomeBillValue groupOnceIncomeBill) throws Exception {
		BOCmxGroupOnceIncomeBillEngine.save(groupOnceIncomeBill);
	}

	public void saveGroupOnceIncomeBills(IBOCmxGroupOnceIncomeBillValue[] groupOnceIncomeBills) throws Exception {
		BOCmxGroupOnceIncomeBillEngine.saveBatch(groupOnceIncomeBills);
	}

	public IBOCmxGroupOnceIncomeDetailValue[] queryGroupOnceIncomeDetailsByOnceIncomeId(long onceIncomeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupOnceIncomeDetailEngine.getBeans(condition.toString(), parameter);
	}

	public IBOCmxGroupOnceIncomeDetailValue queryGroupOnceIncomeDetailByDetailId(long detailId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_DetailId).append(" = :detailId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_State).append(" =:state");
		parameter.put("detailId", Long.valueOf(detailId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmxGroupOnceIncomeDetailValue[] onceIncomeDetails = BOCmxGroupOnceIncomeDetailEngine.getBeans(condition.toString(), parameter);
		if (onceIncomeDetails.length == 0) {
			return null;
		}
		return onceIncomeDetails[0];
	}

	public IBOCmxGroupOnceIncomeDetailValue[] queryGroupOnceIncomeDetailsByOnceIncomeId(long onceIncomeId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupOnceIncomeDetailEngine.getBeans(null, condition.toString(), parameter, start, end, false);
	}

	public int queryGroupOnceIncomeDetailCountByOnceIncomeId(long onceIncomeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeDetailValue.S_State).append(" =:state");
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmxGroupOnceIncomeDetailEngine.getBeansCount(condition.toString(), parameter);
	}

	public long getSumIncomeByMonth(long onceIncomeId, String curMonth) throws Exception {
		String result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			StringBuilder condition = new StringBuilder();
			condition.append(" SELECT SUM(FEE) ");
			condition.append(" FROM CMX_GROUP_ONCE_DTL WHERE ");
			condition.append(IBOCmxGroupOnceIncomeDetailValue.S_OnceIncomeId).append(" = :onceIncomeId ");
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeDetailValue.S_State).append(" =:state");
			condition.append(" AND ");
			condition.append("TO_CHAR(").append(IBOCmxGroupOnceIncomeDetailValue.S_CreateDate).append(" ,'yyyyMM') < :strMonth");
			ps = conn.prepareStatement(condition.toString());
			ps.setObject(1, Long.valueOf(onceIncomeId));
			ps.setObject(2, String.valueOf(CmxConstants.RECORD_STATE_USE));
			ps.setObject(3, curMonth);
			rs = ps.executeQuery();
			while (rs.next()) {
				result = rs.getString(1);
			}
		} finally {
			CmCommonUtil.closeJDBC(conn, ps, rs);
		}
		return result == null ? 0 : Long.valueOf(result).longValue();
	}

	public long getSumIncomeByCurMonth(long onceIncomeId, String curMonth) throws Exception {
		String result = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			StringBuilder condition = new StringBuilder();
			condition.append(" SELECT SUM(FEE) ");
			condition.append(" FROM CMX_GROUP_ONCE_DTL WHERE ");
			condition.append(IBOCmxGroupOnceIncomeDetailValue.S_OnceIncomeId).append(" = :onceIncomeId ");
			condition.append(" AND ");
			condition.append(IBOCmxGroupOnceIncomeDetailValue.S_State).append(" =:state");
			condition.append(" AND ");
			condition.append("TO_CHAR(").append(IBOCmxGroupOnceIncomeDetailValue.S_CreateDate).append(" ,'yyyyMM') = :strMonth");
			ps = conn.prepareStatement(condition.toString());
			ps.setObject(1, Long.valueOf(onceIncomeId));
			ps.setObject(2, String.valueOf(CmxConstants.RECORD_STATE_USE));
			ps.setObject(3, curMonth);
			rs = ps.executeQuery();
			while (rs.next()) {
				result = rs.getString(1);
			}
		} finally {
			CmCommonUtil.closeJDBC(conn, ps, rs);
		}
		return result == null ? 0 : Long.valueOf(result).longValue();
	}

	public void saveGroupOnceIncomeDetail(IBOCmxGroupOnceIncomeDetailValue groupOnceIncomeDetail) throws Exception {
		BOCmxGroupOnceIncomeDetailEngine.save(groupOnceIncomeDetail);
	}

	public void saveGroupOnceIncomeDetails(IBOCmxGroupOnceIncomeDetailValue[] groupOnceIncomeDetails) throws Exception {
		BOCmxGroupOnceIncomeDetailEngine.saveBatch(groupOnceIncomeDetails);
	}

	public long getGroupOnceIncomeDetailNewId() throws Exception {
		return BOCmxGroupOnceIncomeDetailEngine.getNewId().longValue();
	}

	public int queryGroupOnceIncomeBillCountByCondition(long onceIncomeId, String billId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_State).append(" =:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeBillValue.S_BillId).append(" =:billId");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("billId", billId);
		return BOCmxGroupOnceIncomeBillEngine.getBeansCount(condition.toString(), parameter);
	}

	public int queryGroupOnceIncomeCountByConstractId(String constractId, long onceIncomeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmxGroupOnceIncomeValue.S_OnceIncomeId).append(" <> :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_ContractId).append(" = :constractId ");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_State).append(" =:state");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" >0");
		condition.append(" AND ");
		condition.append(IBOCmxGroupOnceIncomeValue.S_IncomeStatus).append(" <6");
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		parameter.put("constractId", constractId);
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		return BOCmxGroupOnceIncomeEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmRepOnceIncomeBusiValue[] queryApportionIncome(long[] onceIncomeIds) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		if (onceIncomeIds != null && onceIncomeIds.length > 0) {
			condition.append(IBOCmRepOnceIncomeBusiValue.S_OnceIncomeId).append(" IN ( ");
			for (int i = 0; i < onceIncomeIds.length; i++) {
				if (i != 0) {
					condition.append(",").append(onceIncomeIds[i]);
				} else {
					condition.append(onceIncomeIds[i]);
				}
			}
			condition.append(" ) ");
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeBusiValue.S_StatMonth).append(" = date_format(date_add(NOW(), interval -1 MONTH),'%Y%m') ");
			return BOCmRepOnceIncomeBusiEngine.getBeans(condition.toString(), parameter);
		}
		return new IBOCmRepOnceIncomeBusiValue[0];
	}

	public int queryApportionIncomeCountByCondition(long groupId, long onceIncomeId, int[] rec_status) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (onceIncomeId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeBusiValue.S_OnceIncomeId).append(" =:onceIncomeId ");
			parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		}
		if (groupId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeBusiValue.S_GroupId).append(" =:groupId ");
			parameter.put("groupId", Long.valueOf(groupId));
		}
		if (rec_status != null && rec_status.length > 0) {
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeBusiValue.S_RecStatus).append(" IN ( ");
			for (int i = 0; i < rec_status.length; i++) {
				if (i != 0) {
					condition.append(",").append(rec_status[i]);
				} else {
					condition.append(rec_status[i]);
				}
			}
			condition.append(" ) ");
		}
		return BOCmRepOnceIncomeBusiEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmRepOnceIncomeBusiValue[] queryApportionIncomeByMonth(long onceIncomeId, String month, long groupId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmRepOnceIncomeBusiValue.S_OnceIncomeId).append(" = :onceIncomeId ");
		condition.append(" AND ");
		condition.append(IBOCmRepOnceIncomeBusiValue.S_StatMonth).append(" = :month ");
		condition.append(" AND ");
		condition.append(IBOCmRepOnceIncomeBusiValue.S_GroupId).append(" = :groupId ");
		parameter.put("groupId", Long.valueOf(groupId));
		parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		parameter.put("month", month);
		return BOCmRepOnceIncomeBusiEngine.getBeans(condition.toString(), parameter);
	}

	public int queryRepOnceIncomeIDCByGroupId(long groupId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmRepOnceIncomeIDCValue.S_GroupId).append(" = :groupId ");
		parameter.put("groupId", Long.valueOf(groupId));
		return BOCmRepOnceIncomeIDCEngine.getBeansCount(condition.toString(), parameter);
	}

	public IBOCmRepOnceIncomeIDCValue[] queryRepOnceIncomeIDCByCondition(long groupId, long onceIncomeId, String startDate) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		if (groupId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeIDCValue.S_GroupId).append(" = :groupId ");
			parameter.put("groupId", Long.valueOf(groupId));
		}
		if (onceIncomeId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeIDCValue.S_OnceIncomeId).append(" = :onceIncomeId ");
			parameter.put("onceIncomeId", Long.valueOf(onceIncomeId));
		}
		if (startDate != null) {
			condition.append(" AND ");
			condition.append(IBOCmRepOnceIncomeIDCValue.S_StatMonth).append(" < :startDate ");
			parameter.put("startDate", startDate);
		}
		condition.append(" ORDER BY ").append(IBOCmRepOnceIncomeIDCValue.S_TotalRecFee).append(" DESC ");
		return BOCmRepOnceIncomeIDCEngine.getBeans(condition.toString(), parameter);
	}

	public void saveRepOnceIncomeBusi(IBOCmRepOnceIncomeBusiValue repOnceIncome) throws Exception {
		BOCmRepOnceIncomeBusiEngine.save(repOnceIncome);
	}

	public void saveRepOnceIncomeBusis(IBOCmRepOnceIncomeBusiValue[] repOnceIncomes) throws Exception {
		BOCmRepOnceIncomeBusiEngine.saveBatch(repOnceIncomes);
	}

	public void saveRepOnceIncomeIDC(IBOCmRepOnceIncomeIDCValue repOnceIncome) throws Exception {
		BOCmRepOnceIncomeIDCEngine.save(repOnceIncome);
	}

	public void saveRepOnceIncomeIDCs(IBOCmRepOnceIncomeIDCValue[] repOnceIncomes) throws Exception {
		BOCmRepOnceIncomeIDCEngine.saveBatch(repOnceIncomes);
	}
}
