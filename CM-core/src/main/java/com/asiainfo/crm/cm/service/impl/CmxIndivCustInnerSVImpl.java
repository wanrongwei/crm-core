package com.asiainfo.crm.cm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerHBean;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmxIndivCustDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustLanguageValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustRealNameInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustSecondCardInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustHisValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxCustomerRelValue;
import com.asiainfo.crm.cm.service.interfaces.ICmxIndivCustInnerSV;

public class CmxIndivCustInnerSVImpl implements ICmxIndivCustInnerSV {

	private transient static Log log = LogFactory.getLog(CmxIndivCustInnerSVImpl.class);

	private ICmxIndivCustDAO getCmxIndivCustDAO() {
		return (ICmxIndivCustDAO) ServiceFactory.getService(ICmxIndivCustDAO.class);
	}

	public void saveIndivCustExt(IBOCmxIndivCustExtValue extValue) throws Exception {
		getCmxIndivCustDAO().saveIndivCustExt(extValue);
	}

	public IBOCmxIndivCustExtValue queryIndivCustExt(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxIndivCustExtValue.S_CustId).append(" =:custId ");
		paraMap.put("custId", Long.valueOf(custId));
		IBOCmxIndivCustExtValue[] iBOCmxIndivCustExtValue = getCmxIndivCustDAO().queryIndivCustExt(null, condition.toString(), paraMap, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(iBOCmxIndivCustExtValue)) {
			return iBOCmxIndivCustExtValue[0];
		}
		return null;
	}

	public IQBOCmxCustomerRelValue[] queryIndivCustomerByCondition(long indivCustId, long indivAcctId, int certType, String certCode, int start, int end) throws Exception {
		if (indivAcctId <= 0 && indivCustId <= 0 && StringUtils.isBlank(certCode) && certType <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (indivCustId > 0) {
			condition.append(" AND ").append(IQBOCmxCustomerRelValue.S_CustId).append(" = :groupCustId ");
			paraMap.put("groupCustId", indivCustId);
		}
		if (indivAcctId > 0) {
			condition.append(" AND ").append(IQBOCmxCustomerRelValue.S_AcctId).append(" = ：indivAcctId");
			paraMap.put("indivAcctId", indivAcctId);
		}
		if (!StringUtils.isBlank(certCode) && certType > 0) {
			condition.append(" AND ").append(IQBOCmxCustomerRelValue.S_CustCertType).append(" = :certType ");
			paraMap.put("certType", certType);
			condition.append(" AND ").append(IQBOCmxCustomerRelValue.S_CustCertCode).append(" = :certCode ");
			paraMap.put("certCode", certCode);
		}

		IQBOCmxCustomerRelValue[] indivCustomerValues = getCmxIndivCustDAO().queryIndivCustomer(null, condition.toString(), paraMap, start, end);
		return indivCustomerValues;
	}

	public IQBOCmxCustomerRelValue[] queryIndivCustomer(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return getCmxIndivCustDAO().queryIndivCustomer(null, condition, parameter, startNum, endNum);

	}

	public int queryIndivCustomerCount(String condition, Map parameter) throws Exception {
		return getCmxIndivCustDAO().queryIndivCustomerCount(condition, parameter);
	}

	public IBOCmIndivCustomerValue[] queryCmIndivCust(long[] custIds, int custStatus) throws Exception {
		if (custIds == null) {
			return new IBOCmIndivCustomerValue[0];
		}
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1 = 1 ");
		if (custStatus > 0) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustStatus).append(" = :custStatus ");
			paraMap.put("custStatus", custStatus);
		}
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustId).append(" in ( ");
		int length = custIds.length / 1000; // 用in查询信息,但oracle10g的in最大为1000 个，所以每1000个请求一次数据库
		List custIdList = new ArrayList(); // 用来保存需返回的用户信息
		IBOCmIndivCustomerValue[] indivCustomerValues = null;
		StringBuilder sqlParamer = null;

		if (custIds.length >= 1000) {
			for (int i = 0; i < length; i++) {
				sqlParamer = new StringBuilder();// 参数
				for (int j = 0; j < 1000; j++) {
					if (j == 0) {
						sqlParamer.append(custIds[j]);
						continue;
					}
					sqlParamer.append(",").append(custIds[(i * 1000) + j]);
				}
				indivCustomerValues = getCmxIndivCustDAO().queryCmIndivCust((new StringBuilder(condition.toString())).append(sqlParamer.toString()).append(" ) ").toString(),
						paraMap);

				if (CmCommonUtil.isNotEmptyObject(indivCustomerValues)) {
					for (int j = 0, legth = indivCustomerValues.length; j < legth; j++) {
						custIdList.add(indivCustomerValues[j]);
					}
				}
			}
		}
		sqlParamer = new StringBuilder();
		// 对1000取模后剩下的再查一次,例如2800就是查2次in 1000的，再查一次 in 800的
		if (custIds.length % 1000 != 0) {
			for (int i = 0; i < custIds.length % 1000; i++) {
				if (custIds.length < 1000) {
					if (i == 0) {
						sqlParamer.append(custIds[i]);
						continue;
					}
					sqlParamer.append(" , ").append(custIds[i]);
				} else {
					if (i == 0) {
						sqlParamer.append(custIds[length * 1000]);
						continue;
					}
					sqlParamer.append(",").append(custIds[length * 1000 + i]);
				}
			}
			indivCustomerValues = getCmxIndivCustDAO().queryCmIndivCust((new StringBuilder(condition.toString())).append(sqlParamer.toString()).append(" ) ").toString(), paraMap);

			if (CmCommonUtil.isNotEmptyObject(indivCustomerValues)) {
				for (int j = 0, legth = indivCustomerValues.length; j < legth; j++) {
					custIdList.add(indivCustomerValues[j]);
				}
			}
		}
		return (IBOCmIndivCustomerValue[]) custIdList.toArray(new IBOCmIndivCustomerValue[custIdList.size()]);
	}

	public void saveIndivCustHis(IBOCmxIndivCustHisValue indivCustHisValue) throws Exception {
		getCmxIndivCustDAO().saveIndivCustHis(indivCustHisValue);
	}

	public IBOCmIndivCustomerHValue[] queryIndivCustHis(long opId, long custId, String custName, String doneDate, String startDate, String endDate, int startNum, int endNum)
			throws Exception {
		// if (opId < 0) {
		// // 输入参数不合法！
		// log.error(CrmLocaleFactory.getResource("CMS0000073"));
		// ExceptionUtil.throwBusinessException("CMS0000073");
		// }
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if ("".equals(doneDate)) {
			condition.append(" AND ").append(IBOCmxIndivCustHisValue.S_DoneDate).append(" BETWEEN ").append(" to_date('").append(startDate).append(" ','yyyy-MM-dd hh24:mi:ss'").append(") ")
					.append(" AND ").append(" to_date('").append(endDate).append("','yyyy-MM-dd hh24:mi:ss'").append(")+1 ");
		} else {
			condition.append(" AND ").append(IBOCmxIndivCustHisValue.S_DoneDate).append(" = to_date( :doneDate , 'yyyy-MM-dd hh24:mi:ss') ");
			paraMap.put("doneDate", doneDate);
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmxIndivCustHisValue.S_CustId).append(" = :custId");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (opId > 0) {
			condition.append(" AND ").append(IBOCmxIndivCustHisValue.S_OpId).append(" = :opId ");
			paraMap.put("opId", Long.valueOf(opId));
		}
		if (StringUtils.isNotBlank(custName)) {
			condition.append(" AND ").append(IBOCmxIndivCustHisValue.S_CustName).append(" = :custName ");
			paraMap.put("custName", custName);
		}

		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		return CmxServiceFactory.getCmxIndivCustInnerSV().getQueryIndivCustHis(condition.toString(), paraMap, billingCycles, startNum, endNum);
	}

	public int queryIndivCustHisCount(long opId, long custId, String custName, String doneDate, String startDate, String endDate) throws Exception {
		return CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHis(opId, custId, custName, doneDate, startDate, endDate, -1, -1).length;
	}

	public IBOCmIndivCustomerHValue[] getQueryIndivCustHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception {
		if (billingCycles == null || billingCycles.length == 0) {
			// 查询失败，传入的帐期列表为空！
			ExceptionUtil.throwBusinessException("CMS0022003");
		}

		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_INDIV_CUSTOMER_H", "DONE_DATE", billingCycles[i]);
		}
		StringBuilder orderBy = new StringBuilder().append(IBOCmxIndivCustHisValue.S_DoneDate);
		String querySql = CmCommonUtil.createUnionSql(BOCmIndivCustomerHBean.class, new StringBuilder(condition), orderBy, tableVars);
		StringBuilder finalSql = new StringBuilder();
		if (startNum != -1 && endNum != -1) {
			finalSql.append("SELECT * FROM (");
			finalSql.append("SELECT * FROM (");
		}

		finalSql.append("SELECT M.* FROM (");
		finalSql.append("SELECT * FROM (").append(querySql).append(") ");
		finalSql.append(") M ");

		if (startNum != -1 && endNum != -1) {
			finalSql.append(") limit :startNum,:endNum ) ");
			paraMap.put("startNum", Integer.valueOf(startNum));
			paraMap.put("endNum", Integer.valueOf(endNum));
		}

		IBOCmIndivCustomerHValue[] indivCustHisValues = getCmxIndivCustDAO().queryIndivCustHis(finalSql.toString(), paraMap);
		if (indivCustHisValues == null || indivCustHisValues.length < 1) {
			return new IBOCmIndivCustomerHValue[0];
		}
		return indivCustHisValues;
	}

	public void saveCustRealNameInfo(IBOCmxCustRealNameInfoValue cmxCustRealNameInfoValue) throws Exception {
		getCmxIndivCustDAO().saveCustRealNameInfo(cmxCustRealNameInfoValue);
	}

	public IBOCmxCustLanguageValue[] queryCustLanguage(long relObjectId, int relObjectType) throws Exception {
		if (relObjectId <= 0 || relObjectType <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxCustLanguageValue.S_RelObjectId).append(" =:relObjectId ");
		condition.append(" AND ").append(IBOCmxCustLanguageValue.S_RelObjectType).append(" =:relObjectType ");
		parameter.put("relObjectId", Long.valueOf(relObjectId));
		parameter.put("relObjectType", Long.valueOf(relObjectType));

		return getCmxIndivCustDAO().queryCustLanguage(condition.toString(), parameter);
	}

	public void saveCustLanguage(IBOCmxCustLanguageValue custLanguageValue) throws Exception {
		getCmxIndivCustDAO().saveCustLanguage(custLanguageValue);
	}

	public IBOCmxCustRealNameInfoValue[] queryCustRealNameInfo(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxCustRealNameInfoValue.S_CustId).append(" =:custId ");
		condition.append(" AND ").append(IBOCmxCustRealNameInfoValue.S_State).append(" =:state ");
		parameter.put("custId", Long.valueOf(custId));
		parameter.put("state", CmConstants.RecordState.USE);
		return getCmxIndivCustDAO().queryCustRealNameInfo(condition.toString(), parameter);
	}

	public IBOCmxCustSecondCardInfoValue queryCustSecondCardInfo(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxCustSecondCardInfoValue.S_CustId).append(" =:custId ");
		parameter.put("custId", Long.valueOf(custId));
		IBOCmxCustSecondCardInfoValue[] custSecondCardInfoValues = getCmxIndivCustDAO().queryCustSecondCardInfo(condition.toString(), parameter);
		if (CmCommonUtil.isNotEmptyObject(custSecondCardInfoValues)) {
			return custSecondCardInfoValues[0];
		}
		return null;
	}

	public void saveCustSecondCardInfo(IBOCmxCustSecondCardInfoValue custSecondCardInfoValue) throws Exception {
		getCmxIndivCustDAO().saveCustSecondCardInfo(custSecondCardInfoValue);
	}

	public IBOCmIndivCustomerHValue[] queryIndivCustHis(long opId, long custId, String custName, String startDate, String endDate, int startNum, int endNum) throws Exception {
		return CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHis(opId, custId, custName, "", startDate, endDate, startNum, endNum);
	}

	public int queryIndivCustHisCount(long opId, long custId, String custName, String startDate, String endDate) throws Exception {
		return CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHisCount(opId, custId, custName, "", startDate, endDate);
	}
}
