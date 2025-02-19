package com.asiainfo.crm.cm.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecStaffValue;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCprRecStatisticBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgObjectWrapperValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprRecStatisticValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCfgObjectWrapperUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.inner.log.bo.BOCmBusiLogBean;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmBusiLogValue;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmHisRecordValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISo2CmSV;
import com.asiainfo.crm.common.ResUserInfo;

public class CmBusiLogSVImpl implements ICmBusiLogSV {

	private transient static Log log = LogFactory.getLog(CmBusiLogSVImpl.class);

	public IBOCmBusiLogValue[] queryBusiLog(long businessId, long custId, long acctId, String startDate, String endDate, int startNum, int endNum) throws Exception {
		if (businessId <= 0 && custId <= 0 && acctId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		String[] cycle = CmCommonUtil.getCycleYYMM(startDate, endDate);
		if (cycle == null) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (cycle.length > 6) {
			// 查询跨度太长！不能超过6个月
			log.error(CrmLocaleFactory.getResource(""));
			ExceptionUtil.throwBusinessException("");
		}

		StringBuilder allSql = new StringBuilder();

		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		if (businessId > 0) {
			condition.append(" AND ").append(IBOCmBusiLogValue.S_BusinessId).append(" = :businessId ");
			parameter.put("businessId", businessId);
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmBusiLogValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmBusiLogValue.S_AcctId).append(" = :acctId ");
			parameter.put("acctId", acctId);
		}
		condition.append(" AND ").append(IBOCmBusiLogValue.S_DoneDate).append(" >= TO_DATE( :startDate ,'YY-MM-DD HH24:MI:SS') ");
		parameter.put("startDate", startDate + " 00:00:00");
		condition.append(" AND ").append(IBOCmBusiLogValue.S_DoneDate).append(" <= TO_DATE( :endDate ,'YY-MM-DD HH24:MI:SS') ");
		parameter.put("endDate", endDate + " 23:59:59");
		for (int i = 0; i < cycle.length; i++) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM {CM_BUSI_LOG} WHERE 1=1 ").append(condition);
			TableVars tableVar = new TableVars();
			tableVar.add("CM_BUSI_LOG", IBOCmBusiLogValue.S_DoneDate, cycle[i]);
			allSql.append(SplitTableFactory.createQuerySQL(sql.toString(), tableVar));
			if (i < cycle.length - 1) {
				allSql.append(" UNION ALL ");
			}
		}
		return (IBOCmBusiLogValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmBusiLogBean.class, allSql.toString(), parameter);
	}

	public int queryBusiLogCount(long businessId, long custId, long acctId, String startDate, String endDate) throws Exception {
		if (businessId <= 0 && custId <= 0 && acctId <= 0) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		String[] cycle = CmCommonUtil.getCycleYYMM(startDate, endDate);
		if (cycle == null) {
			// 输入参数不合法！
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (cycle.length > 6) {
			// 查询跨度太长！不能超过6个月
			log.error(CrmLocaleFactory.getResource(""));
			ExceptionUtil.throwBusinessException("");
		}

		StringBuilder allSql = new StringBuilder();

		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		if (businessId > 0) {
			condition.append(" AND ").append(IBOCmBusiLogValue.S_BusinessId).append(" = :businessId ");
			parameter.put("businessId", businessId);
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmBusiLogValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmBusiLogValue.S_AcctId).append(" = :acctId ");
			parameter.put("acctId", acctId);
		}
		condition.append(" AND ").append(IBOCmBusiLogValue.S_DoneDate).append(" >= TO_DATE( :startDate ,'YY-MM-DD HH24:MI:SS') ");
		parameter.put("startDate", startDate + " 00:00:00");
		condition.append(" AND ").append(IBOCmBusiLogValue.S_DoneDate).append(" <= TO_DATE( :endDate ,'YY-MM-DD HH24:MI:SS') ");
		parameter.put("endDate", endDate + " 23:59:59");
		for (int i = 0; i < cycle.length; i++) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM {CM_BUSI_LOG} WHERE 1=1 ").append(condition);
			TableVars tableVar = new TableVars();
			tableVar.add("CM_BUSI_LOG", IBOCmBusiLogValue.S_DoneDate, cycle[i]);
			allSql.append(SplitTableFactory.createQuerySQL(sql.toString(), tableVar));
			if (i < cycle.length - 1) {
				allSql.append(" UNION ALL ");
			}
		}
		allSql.insert(0, "SELECT COUNT(1) AS BUSI_LOG_ID FROM ( ").append(" ) ");
		IBOCmBusiLogValue[] busiLogValues = (IBOCmBusiLogValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmBusiLogBean.class, allSql.toString(), parameter);
		if (CmCommonUtil.isNotEmptyObject(busiLogValues)) {
			return (int) busiLogValues[0].getBusiLogId();
		}
		return 0;
	}

	public boolean hasSameBatchData(long businessId, long batchDataId, String billId) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT COUNT(*) AS BUSI_LOG_ID FROM ").append(BOCmBusiLogBean.S_TYPE.getMapingEnty()).append(" T WHERE ").append(BOCmBusiLogBean.S_BusinessId)
				.append(" = :businessId ");
		sql.append(" AND ").append(BOCmBusiLogBean.S_BillId).append(" = :billId ");
		TableVars tableVar = new TableVars();
		tableVar.add(BOCmBusiLogBean.S_TYPE.getMapingEnty().replace("{", "").replace("}", ""), IBOCmBusiLogValue.S_DoneDate, TimeUtil.getYYYYMM(CmCommonUtil.getSysDate()));
		String sqlStr = SplitTableFactory.createQuerySQL(sql.toString(), tableVar);
		Map parameter = new HashMap();
		parameter.put("businessId", businessId);
		parameter.put("batchDataId", batchDataId);
		parameter.put("billId", billId);
		DataContainerInterface[] beans = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmBusiLogBean.class, sqlStr, parameter);
		int count = 0;
		if (CmCommonUtil.isNotEmptyObject(beans)) {
			count = beans[0].getAsInt("BUSI_LOG_ID");
		}
		return count > 0;
	}

	public void saveBusiLog(ICmBusiLogValue busiLogValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
			BOCmBusiLogBean logValue = new BOCmBusiLogBean();
			logValue.copy(busiLogValue);
			if (logValue.isNew()) {
				logValue.setBusiLogId(CmCommonUtil.getNewSequence(BOCmBusiLogBean.class));
				if (ServiceManager.getUser() != null) {
					logValue.setCreateOpId(ServiceManager.getUser().getID());
					logValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
				}
				logValue.setState(CmConstants.RecordState.USE);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(logValue);
		}
	}

	public void saveBusiLogs(ICmBusiLogValue[] busiLogValues) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(busiLogValues)) {
			List<BOCmBusiLogBean> logValues = new ArrayList<BOCmBusiLogBean>();
			for (int i = 0; i < busiLogValues.length; i++) {
				if (busiLogValues[i].isNew()) {
					if (busiLogValues[i].getBusiLogId() <= 0) {
						busiLogValues[i].setBusiLogId(CmCommonUtil.getNewSequence(BOCmBusiLogBean.class));
					}
				}
				BOCmBusiLogBean logValue = new BOCmBusiLogBean();
				logValue.copy(busiLogValues[i]);
				logValues.add(logValue);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(logValues.toArray(new BOCmBusiLogBean[0]));
		}
	}

	public void saveBusiLog(IVOBusiLogValue logValue) throws Exception {
		AbstractBusiLogDealBusiModelImpl busiModel = (AbstractBusiLogDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractBusiLogDealBusiModelImpl.class);
		busiModel.deal(logValue);
	}

	public void saveHisRecord(IBOCmHisRecordValue hisRecordValue) throws Exception {
		ICmCommonInnerSV innerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		BOCmHisRecordBean recordBean = new BOCmHisRecordBean();
		if (hisRecordValue.isNew()) {
			hisRecordValue.setHId(CmServiceFactory.getCommonSV().getNewSequence(BOCmHisRecordBean.class));
			if (ServiceManager.getUser() != null) {
				hisRecordValue.setCreateOpId(ServiceManager.getUser().getID());
				hisRecordValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
				hisRecordValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			}
			hisRecordValue.setState(CmConstants.RecordState.USE);
		}
		recordBean.copy(hisRecordValue);
		if (StringUtils.isNotBlank(recordBean.getSimpleRecord())) {
			innerSV.saveBean(recordBean);
		}
	}

	public IBOCmHisRecordValue[] queryHisRecordByCdn(long id, String name, int type, String startDate, String endDate, int start, int end) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append("1=1");
		if (id > 0) {
			condition.append(" AND ").append(IBOCmHisRecordValue.S_ObjId).append(" = :id");
			parameter.put("id", Long.valueOf(id));
		}
		if (StringUtils.isNotBlank(name)) {
			condition.append(" AND ").append(IBOCmHisRecordValue.S_ObjName).append(" = :name");
			parameter.put("name", name);
		}
		if (type > 0) {
			condition.append(" AND ").append(IBOCmHisRecordValue.S_ObjType).append(" = :type");
			parameter.put("type", type);
		}
		condition.append(" AND ").append(IBOCmHisRecordValue.S_DoneDate).append(" >= date_format( :startDate ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("startDate", startDate + " 00:00:00");
		condition.append(" AND ").append(IBOCmHisRecordValue.S_DoneDate).append(" <= date_format( :endDate ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("endDate", endDate + " 23:59:59");
		parameter.put(IBOCmHisRecordValue.S_DoneDate, (new SimpleDateFormat("yyyy-MM-dd")).parse(startDate));
		IBOCmHisRecordValue[] recordValues = (IBOCmHisRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmHisRecordBean.class, condition.toString(), parameter,
				start, end);
		if (recordValues != null && recordValues.length > 0) {
			for (int i = 0, len = recordValues.length; i < len; i++) {
				recordValues[i].setRemarks("<a href='javascript:showDetail()' class='cellpath' style='color:blue;margin-left:5px;text-decoration:underline'>Detail</a>");
				// 如果存在CPRnum则进行模糊化
				if (recordValues[i].getObjType() == 1) {
					String detailRecord = recordValues[i].getDetailRecord1();
					if (StringUtils.isNotBlank(detailRecord)) {
						String[] details = (String[]) detailRecord.split("\n");
						for (int j = 0; j < details.length; j++) {
							if (details[j].indexOf("ID Number") != -1) {
								String[] cprNumbs = details[j].split(":");
								for (int s = 0; s < cprNumbs.length; s++) {
									if (cprNumbs[s].indexOf("->") != -1) {
										String cprNum = cprNumbs[s].trim();
										String[] cprs = cprNum.split("->");
										if (cprs.length == 1) {
											if (StringUtils.isNotBlank(cprs[0])) {
												detailRecord = detailRecord.replace(cprs[0], maskCPR(cprs[0]));
											}
										} else if (cprs.length > 1) {
											if (StringUtils.isNotBlank(cprs[0])) {
												detailRecord = detailRecord.replace(cprs[0], maskCPR(cprs[0]));
											}
											if (StringUtils.isNotBlank(cprs[1])) {
												detailRecord = detailRecord.replace(cprs[1], maskCPR(cprs[1]));
											}
										}
										recordValues[i].setDetailRecord1(detailRecord);
										recordValues[i].setSimpleRecord(detailRecord);
									}
								}
							}
						}
					}
				}
			}
		}
		return recordValues;
	}

	private String maskCPR(String cpr) {
		if (StringUtils.isNotBlank(cpr)) {
			String realCpr = cpr.trim();
			return realCpr.substring(0, 6) + "****";
		}
		return null;
	}

	public int queryHisRecordCountByCdn(long id, String name, int type, String startDate, String endDate) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append("1=1");
		if (id > 0) {
			condition.append(" AND ").append(IBOCmHisRecordValue.S_ObjId).append(" = :id");
			parameter.put("id", Long.valueOf(id));
		}
		if (StringUtils.isNotBlank(name)) {
			condition.append(" AND ").append(IBOCmHisRecordValue.S_ObjName).append(" = :name");
			parameter.put("name", name);
		}
		if (type > 0) {
			condition.append(" AND ").append(IBOCmHisRecordValue.S_ObjType).append(" = :type");
			parameter.put("type", type);
		}
		condition.append(" AND ").append(IBOCmHisRecordValue.S_DoneDate).append(" >= date_format( :startDate ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("startDate", startDate + " 00:00:00");
		condition.append(" AND ").append(IBOCmHisRecordValue.S_DoneDate).append(" <= date_format( :endDate ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("endDate", endDate + " 23:59:59");
		parameter.put(IBOCmHisRecordValue.S_DoneDate, (new SimpleDateFormat("yyyy-MM-dd")).parse(startDate));
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmHisRecordBean.class, condition.toString(), parameter);
	}

	public BOCmHisRecordBean convertHisRecord(DataStructInterface[] targetValues, int type, String objName, long objId) throws Exception {
		StringBuffer detail = new StringBuffer();
		BOCmHisRecordBean recordBean = new BOCmHisRecordBean();
		recordBean.setObjType(type);
		recordBean.setObjName(objName);
		recordBean.setObjId(objId);
		String nowValue = "";
		String oldValue = "";
		String beanName = "";
		String codeType = "";
		String param = "";
		String name = "";
		// 记录客户信息变更的接触记录
		List<String> list = new ArrayList<>();
		// 记录字段的数目
		long busiId = 0;
		String entityId = "";
		try {
			for (int i = 0, len = targetValues.length; i < len; i++) {
				if (targetValues[i] != null) {
					beanName = targetValues[i].getClass().getName();
					String[] fields = targetValues[i].getPropertyNames();
					for (int j = 0, fieldLen = fields.length; j < fieldLen; j++) {
						nowValue = StringUtils.isBlank(targetValues[i].get(fields[j]) == null ? null : String.valueOf(targetValues[i].get(fields[j]))) ? "  " : String
								.valueOf(targetValues[i].get(fields[j]));
						oldValue = StringUtils.isBlank(targetValues[i].getOldObj(fields[j]) == null ? null : String.valueOf(targetValues[i].getOldObj(fields[j]))) ? "  " : String
								.valueOf(targetValues[i].getOldObj(fields[j]));

						if (type == CmConstants.HisRecordType.CUSTMANAGER && "MANAGER_ID".equalsIgnoreCase(fields[j])) {
							if (targetValues[i].isDeleted()) {
								nowValue = "";
							}
						}

						if (!nowValue.equalsIgnoreCase(oldValue)) {
							IBOCmCfgObjectWrapperValue wrapperValue = CmCfgObjectWrapperUtil.getCfgObjectWrapper(CmConstants.WrapperType.FIELD_NAME, beanName,
									fields[j].toUpperCase());
							if (wrapperValue != null) {
								// swap list source
								codeType = wrapperValue.getDispAttrParam();
								name = wrapperValue.getAttrName();
								// 针对联系媒介做的特殊处理,然后记录接触记录(针对联系媒介的修改)
								if (type == CmConstants.HisRecordType.CONTACT_MEDIUM) {
									if ("EMAIL_ADDRESS".equals(name)) {
										entityId = DataType.getAsString(targetValues[i].get("CUST_ID"));
										if (null == targetValues[i].get("EMAIL_ADDRESS")) {
											if (null != targetValues[i].get("CONT_NUMBER")) {
												nowValue = String.valueOf(targetValues[i].get("CONT_NUMBER"));
											}
											if (null != targetValues[i].get("FAX_NUMBER")) {
												nowValue = String.valueOf(targetValues[i].get("FAX_NUMBER"));
											}
										}
									}
									busiId = CmBusinessOperation.CM_CUST_MEDIUM_MOD;
									list.add("Old contactInfo : " + oldValue);
									list.add("New contactInfo : " + nowValue);
								}
								// 针对法律地址的修改将cont_med_type_id加在remarks中后面要用
								if (type == CmConstants.HisRecordType.ADDRESS) {
									if ("ADDRESS_DETAIL".equals(name)) {
										recordBean.setRemarks(DataType.getAsString(targetValues[i].get("CONT_MED_TYPE_ID")));
									}
								}
								if (StringUtils.isNotBlank(codeType)) {
									// need param
									if (codeType.contains("$")) {
										param = StringUtils.substringBetween(codeType, "$", "$");
										codeType = StringUtils.substringBefore(codeType, "$") + "_" + targetValues[i].get(param);
									}
									nowValue = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue(codeType, nowValue);
									oldValue = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue(codeType, oldValue);
								}
								if ("SEGMENT_ID".equalsIgnoreCase(name)) {
									ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
									nowValue = sv.querySegmentByIdfromCache(Long.parseLong(nowValue)).getSegmentName();
									oldValue = sv.querySegmentByIdfromCache(Long.parseLong(oldValue)).getSegmentName();

									// 变更细分需要调用订单接口送第三方系统
									ISo2CmSV so2CmSV = (ISo2CmSV) ServiceFactory.getService(ISo2CmSV.class);
									ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
									entityId = DataType.getAsString(targetValues[i].get("CUST_ID"));
									ICustomerValue custValue = custSV.queryCustomerByCustId(Long.parseLong(entityId));
									if (custValue != null) {
										so2CmSV.updateCustInfo4CPA(custValue.getCustId(), nowValue, custValue.getCustName());
									}
								}
								// 针对是联系媒介的
								if ("CONT_MED_TYPE_ID".equalsIgnoreCase(name)) {
									ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
									IBOCmCustContMedTypeValue[] oldContValues = commonSV.queryContMedTypeInfo(Long.parseLong(oldValue));
									IBOCmCustContMedTypeValue[] contValues = commonSV.queryContMedTypeInfo(Long.parseLong(nowValue));
									if (CmCommonUtil.isNotEmptyObject(oldContValues) && CmCommonUtil.isNotEmptyObject(contValues)) {
										oldValue = CrmLocaleFactory.getResource(oldContValues[0].getContMedTypeName());
										nowValue = CrmLocaleFactory.getResource(contValues[0].getContMedTypeName());
									}

								}

								// 针对客户经理的特使处理
								if (type == CmConstants.HisRecordType.CUSTMANAGER && "MANAGER_ID".equalsIgnoreCase(name)) {
									IBOSecStaffValue staff = null;
									if (StringUtils.isNotBlank(oldValue)) {
										staff = OrgmodelClient.getStaffByOperatorId(Long.parseLong(oldValue));
										if (staff != null) {
											oldValue = staff.getStaffName();
										} else {
											oldValue = OrgmodelClient.getGroupValueByGroupId(Long.parseLong(oldValue)).getGroupName();
										}
									}
									if (StringUtils.isNotBlank(nowValue)) {
										staff = OrgmodelClient.getStaffByOperatorId(Long.parseLong(nowValue));
										if (staff != null) {
											nowValue = staff.getStaffName();
										} else {
											nowValue = OrgmodelClient.getGroupValueByGroupId(Long.parseLong(nowValue)).getGroupName();
										}
									}
								}
								// 针对下拉数据源-1对应的值为空的情况再做一次判断
								if (!nowValue.equalsIgnoreCase(oldValue)) {
									detail.append(CrmLocaleFactory.getResource(wrapperValue.getDispAttrName()) + " : " + oldValue + "->" + nowValue + "\n");
									if (StringUtils.isBlank(recordBean.getSimpleRecord())) {
										String temp = CrmLocaleFactory.getResource(wrapperValue.getDispAttrName()) + " : " + oldValue + "->" + nowValue;
										recordBean.setSimpleRecord((String) CmCommonUtil.subStringByCharLength(temp, 3950).get(0));
									}
								}
								// 记录客户接触记录(客户信息修改记录接触记录)
								if (type == CmConstants.HisRecordType.INDIVIDUAL || type == CmConstants.HisRecordType.GROUP) {
									String custId = DataType.getAsString(targetValues[i].get("CUST_ID"));
									entityId = custId;
									ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
									ICustomerValue custValue = custSV.queryCustomerByCustId(Long.parseLong(custId));
									String indivCustType = custValue.getIndivCustType();
									if (String.valueOf(CmConstants.EntityType.CUSTOMER).equals(indivCustType) || type == CmConstants.HisRecordType.GROUP) {
										// 修改客户名称要调用订单接口送第三方系统
										if ("CUST_NAME".equalsIgnoreCase(name)) {
											ISo2CmSV so2CmSV = (ISo2CmSV) ServiceFactory.getService(ISo2CmSV.class);
											so2CmSV.updateCustInfo4CPA(Long.parseLong(custId), custValue.getGroupSegmentId(), nowValue);
											// 更新集团层级的名称
											ICustOrganizeValue custorgVal = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(Long.parseLong(custId));
											if (custorgVal != null) {
												custorgVal.setDeptName(nowValue);
												BOCmGroupOrgStructBean custOrganizeValue = new BOCmGroupOrgStructBean();
												custOrganizeValue.copy(custorgVal);
												CmInnerServiceFactory.getCommonInnerSV().saveBean(custOrganizeValue);
											}
										}

										// 针对客户
										if (type == CmConstants.HisRecordType.INDIVIDUAL) {
											// CUST_ZIPCODE表记录存在null字符串值，特殊处理
											if ("CUST_ZIPCODE".equalsIgnoreCase(name)) {
												if ("null".equalsIgnoreCase(oldValue)) {
													oldValue = "  ";
												}
												if ("null".equalsIgnoreCase(nowValue)) {
													nowValue = "  ";
												}
											}
											// 针对个人客户
											busiId = CmBusinessOperation.CM_INDIV_CUST_MOD;
											list.add("Old customer " + name + " : " + oldValue);
											list.add("New customer " + name + " : " + nowValue);
										} else {
											// BMRT-4581新增公司状态变更CI日志记录
											if ("COMPANY_STATUS".equalsIgnoreCase(name)) {
												oldValue = CmCommonUtil.transformCompanyStatus(oldValue);
												nowValue = CmCommonUtil.transformCompanyStatus(nowValue);
											}
											// 针对集团客户
											busiId = CmBusinessOperation.CM_GROUP_CUST_MOD;
											list.add("Old customer " + name + " : " + oldValue);
											list.add("New customer " + name + " : " + nowValue);
										}
									} else if (String.valueOf(CmConstants.EntityType.USER).equals(indivCustType)) {
										if ("CUST_NAME".equals(name)) {
											// 针对user
											busiId = CmBusinessOperation.CM_USER_MOD;
											list.add("Old user name : " + oldValue);
											list.add("New user name : " + nowValue);
										}
									}
								}
							}
						}
					}
				}
			}
			if (!list.isEmpty()) {
				// list不为空的时候记录接触记录
				CmRecordLog.saveRecord(busiId, Long.parseLong(entityId), list.toArray(new String[0]));
			}
			List detailList = CmCommonUtil.subStringByCharLength(detail.toString(), 3950);
			for (int i = 1, len = detailList.size(); i <= len; i++) {
				// 数据库只支持4个字段，多的直接舍弃
				if (i > 4) {
					break;
				}
				recordBean.set("DETAIL_RECORD_" + i, detailList.get(i - 1).toString());
			}
		} catch (Exception e) {
			log.error("Write history records error!", e);

		}
		return recordBean;
	}

	public IBOCmCprRecStatisticValue[] queryCPR(String createDate, String fileName) throws Exception {

		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append("1=1");
		if (StringUtils.isNotBlank(fileName)) {
			condition.append(" AND ").append(IBOCmCprRecStatisticValue.S_FileName).append(" like :fileName");
			parameter.put("fileName", "%" + fileName + "%");
		}
		if (StringUtils.isNotBlank(createDate)) {
			condition.append(" AND ").append(IBOCmCprRecStatisticValue.S_CreateDate).append(" like :createDate ");
			parameter.put("createDate", createDate + "%");
		}
		IBOCmCprRecStatisticValue[] recordValues = (IBOCmCprRecStatisticValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCprRecStatisticBean.class,
				condition.toString(), parameter, -1, -1);
		return recordValues;

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV#saveCustMgrChangeHistory(com.asiainfo.crm.cm.inner.customer
	 * .bo.BOCmGroupManagerBean)
	 */
	public void saveCustMgrChangeHistory(BOCmGroupManagerBean bean) throws Exception {
		ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
		BOCmHisRecordBean recordBean = null;
		recordBean = sv.convertHisRecord(new DataStructInterface[] { bean }, CmConstants.HisRecordType.CUSTMANAGER, "", bean.getCustId());
		sv.saveHisRecord(recordBean);

	}

}
