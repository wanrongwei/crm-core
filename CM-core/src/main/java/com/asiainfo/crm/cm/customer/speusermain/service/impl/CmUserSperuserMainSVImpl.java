package com.asiainfo.crm.cm.customer.speusermain.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserCreditLevelBean;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainBean;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainEngine;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserCreditLevelValue;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.customer.speusermain.service.interfaces.ICmUserSperuserMainSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.indiv.bo.BOCmUserSpeuserMainHBean;
import com.asiainfo.crm.cm.ln.customer.indiv.bo.BOCmUserSpeuserMainHEngine;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmUserSpeuserMainHValue;

public class CmUserSperuserMainSVImpl implements ICmUserSperuserMainSV {

	public static transient Log log = LogFactory.getLog(CmUserSperuserMainSVImpl.class);

	public IBOCmUserCreditLevelValue[] queryCreditLevelByAcctId(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		StringBuffer condition = new StringBuffer("");
		condition.append(BOCmUserCreditLevelBean.S_AcctId).append(" = :acctId ");
		HashMap parameter = new HashMap();
		long acctId = conditionDC.getAsLong("ACCT_ID");
		parameter.put("acctId", acctId);
		return (IBOCmUserCreditLevelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmUserCreditLevelBean.class, condition.toString(), parameter, startNum, endNum);
	}

	public IBOCmUserSpeuserMainHValue[] queryUserSpeuserHis(String phoneId, String startDate, String endDate, int startNum, int endNum) throws Exception {
		IBOCmUserSpeuserMainHValue[] userSpeuserHValues = CmServiceFactory.getUserSpenUserMainSV().queryUserSpeuserHis(phoneId, "", startDate, endDate, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(userSpeuserHValues)) {
			return userSpeuserHValues;
		}
		return new IBOCmUserSpeuserMainHValue[0];
	}

	public int queryUserSpeuserHisCount(String phoneId, String startDate, String endDate) throws Exception {
		return CmServiceFactory.getUserSpenUserMainSV().queryUserSpeuserHisCount(phoneId, "", startDate, endDate);
	}

	public IBOCmUserSpeuserMainHValue[] queryUserSpeuserHis(String phoneId, String doneDate, String startDate, String endDate, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		if ("".equals(doneDate)) {
			condition.append(IBOCmUserSpeuserMainHValue.S_DoneDate).append(" BETWEEN ").append(" to_date('").append(startDate).append(" ','yyyy-MM-dd hh24:mi:ss'").append(") ")
					.append(" AND ").append(" to_date('").append(endDate).append("','yyyy-MM-dd hh24:mi:ss'").append(")+1 ");
		} else {
			condition.append(IBOCmUserSpeuserMainHValue.S_DoneDate).append(" = to_date( :doneDate , 'yyyy-MM-dd hh24:mi:ss')");
			paraMap.put("doneDate", doneDate);
		}
		if (!"".equals(phoneId)) {
			condition.append(" AND ").append(IBOCmUserSpeuserMainHValue.S_PhoneId).append(" = :phoneId ");
			paraMap.put("phoneId", phoneId);
		}
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		return CmServiceFactory.getUserSpenUserMainSV().queryUserSpeuserHis(condition.toString(), paraMap, billingCycles, startNum, endNum);
	}

	public IBOCmUserSpeuserMainHValue[] queryUserSpeuserHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception {
		if (billingCycles == null || billingCycles.length == 0) {
			// 查询失败，传入的帐期列表为空！
			ExceptionUtil.throwBusinessException("CMS0022003");
		}

		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_USER_SPEUSER_MAIN_H", "DONE_DATE", billingCycles[i]);
		}
		StringBuilder orderBy = new StringBuilder().append(IBOCmUserSpeuserMainHValue.S_DoneDate);
		String querySql = CmCommonUtil.createUnionSql(BOCmUserSpeuserMainHBean.class, new StringBuilder(condition), orderBy, tableVars);
		StringBuilder finalSql = new StringBuilder();
		if (startNum != -1 && endNum != -1) {
			finalSql.append("SELECT * FROM (");
			finalSql.append("SELECT * FROM (");
		}

		finalSql.append("SELECT M.* FROM (");
		finalSql.append("SELECT * FROM (").append(querySql).append(") ");
		finalSql.append(") M ");

		if (startNum != -1 && endNum != -1) {
			finalSql.append(" LIMIT :startNum,:endNum ");
			paraMap.put("startNum", Integer.valueOf(startNum));
			paraMap.put("endNum", Integer.valueOf(endNum));
		}

		return BOCmUserSpeuserMainHEngine.getBeansFromSql(finalSql.toString(), paraMap);
	}

	public int queryUserSpeuserHisCount(String phoneId, String doneDate, String startDate, String endDate) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		condition.append(IBOCmUserSpeuserMainHValue.S_DoneDate).append(" BETWEEN ").append(" to_date('").append(startDate).append(" ','yyyy-MM-dd hh24:mi:ss'").append(") ")
				.append(" AND ").append(" to_date('").append(endDate).append("','yyyy-MM-dd hh24:mi:ss'").append(")+1 ");
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		if (!"".equals(phoneId)) {
			condition.append(" AND ").append(IBOCmUserSpeuserMainHValue.S_PhoneId).append(" = :phoneId ");
			paraMap.put("phoneId", phoneId);
		}
		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_USER_SPEUSER_MAIN_H", "DONE_DATE", billingCycles[i]);
		}
		String querySql = "";// ScoreUtil.createUnionSql(BOCmUserSpeuserMainHBean.class, new StringBuilder(condition),
								// null, tableVars);
		int count = 0;
		IBOCmUserSpeuserMainHValue[] retValues = BOCmUserSpeuserMainHEngine.getBeansFromSql(querySql.toString(), paraMap);
		if (retValues != null && retValues.length > 0) {
			count = retValues.length;
		}
		return count;
	}

	public IBOCmUserSpeuserMainValue queryUserSpeuser(String phoneId, Long acctId) throws Exception {

		StringBuffer condition = new StringBuffer("");
		condition.append(BOCmUserSpeuserMainBean.S_State).append(" = :state ");
		condition.append(" AND ").append(BOCmUserSpeuserMainBean.S_AcctId).append(" = :acctId ");
		condition.append(" AND ").append(BOCmUserSpeuserMainBean.S_PhoneId).append(" = :phoneId ");
		HashMap parameter = new HashMap();
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put("acctId", acctId);
		parameter.put("phoneId", phoneId);
		IBOCmUserSpeuserMainValue[] values = (IBOCmUserSpeuserMainValue[]) BOCmUserSpeuserMainEngine.getBeans(condition.toString(), parameter);

		if (values != null && values.length > 0) {
			return values[0];
		}
		return null;
	}

}
