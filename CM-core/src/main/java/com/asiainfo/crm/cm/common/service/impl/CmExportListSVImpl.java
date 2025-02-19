package com.asiainfo.crm.cm.common.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.common.bo.BOCmExportListBean;
import com.asiainfo.crm.cm.common.bo.BOCmGroupLevelAuditBean;
import com.asiainfo.crm.cm.common.service.interfaces.ICmExportListSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.log.bo.BOCmBusiLogEngine;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmBusiLogValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class CmExportListSVImpl implements ICmExportListSV {

	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer conditionDC = dcs[0];

		StringBuilder querySql = new StringBuilder("select * from {CM_EXPORT_LIST}");
		StringBuilder conditionSql = new StringBuilder("");

		Map<Object, Object> parameter = new HashMap<Object, Object>();
		if (conditionDC.getAsString("START_DATE") != null && !"".equals(conditionDC.getAsString("START_DATE"))) {
			conditionSql.append(" and " + BOCmExportListBean.S_CreateDate + " >=DATE_FORMAT( :StartDate ,'%Y-%m-%d %H:%i:%s')");
			conditionSql.append(" and " + BOCmExportListBean.S_CreateDate + " <=DATE_FORMAT( :EndDate ,'%Y-%m-%d %H:%i:%s')");

			parameter.put("StartDate", conditionDC.getAsString("START_DATE").substring(0, 10) + " 00:00:00");
			parameter.put("EndDate", conditionDC.getAsString("END_DATE").substring(0, 10) + " 23:59:59");
		}
		if (conditionDC.getAsString("FILE_NAME") != null && !"".equals(conditionDC.getAsString("FILE_NAME"))) {
			conditionSql.append(" and " + BOCmExportListBean.S_FileName + " = :FileName ");
			parameter.put("FileName", conditionDC.getAsString("FILE_NAME"));
		}
		if (conditionDC.getAsString("STATE") != null && !"".equals(conditionDC.getAsString("STATE"))) {
			conditionSql.append(" and " + BOCmExportListBean.S_State + " = :State ");
			parameter.put("State", conditionDC.getAsString("STATE"));
		}

		conditionSql.append(" and " + BOCmExportListBean.S_CreateOpId + " = :CreateOpId ");
		parameter.put("CreateOpId", ServiceManager.getUser().getID());

		conditionSql.append(" order by create_date desc");

		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmExportListBean.class,
				CmLnCommonUtil.getQueryResult(querySql.toString(), conditionSql.toString(), startNum, endNum, parameter), parameter);

		return (DataContainer[]) returnValues;
	}

	public int queryDataCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer conditionDC = dcs[0];

		StringBuilder querySql = new StringBuilder("select * from {CM_EXPORT_LIST}");
		StringBuilder conditionSql = new StringBuilder("");

		Map<Object, Object> parameter = new HashMap<Object, Object>();
		if (conditionDC.getAsString("START_DATE") != null && !"".equals(conditionDC.getAsString("START_DATE"))) {
			conditionSql.append(" and " + BOCmExportListBean.S_CreateDate + " >=DATE_FORMAT( :StartDate ,'%Y-%m-%d %H:%i:%s')");
			conditionSql.append(" and " + BOCmExportListBean.S_CreateDate + " <=DATE_FORMAT( :EndDate ,'%Y-%m-%d %H:%i:%s')");

			parameter.put("StartDate", conditionDC.getAsString("START_DATE").substring(0, 10) + " 00:00:00");
			parameter.put("EndDate", conditionDC.getAsString("END_DATE").substring(0, 10) + " 23:59:59");
		}
		if (conditionDC.getAsString("FILE_NAME") != null && !"".equals(conditionDC.getAsString("FILE_NAME"))) {
			conditionSql.append(" and " + BOCmExportListBean.S_FileName + " = :FileName ");
			parameter.put("FileName", conditionDC.getAsString("FILE_NAME"));
		}
		if (conditionDC.getAsString("STATE") != null && !"".equals(conditionDC.getAsString("STATE"))) {
			conditionSql.append(" and " + BOCmExportListBean.S_State + " = :State ");
			parameter.put("State", conditionDC.getAsString("STATE"));
		}

		conditionSql.append(" and " + BOCmExportListBean.S_CreateOpId + " = :CreateOpId ");
		parameter.put("CreateOpId", ServiceManager.getUser().getID());

		conditionSql.append(" order by create_date desc");

		DataContainerInterface[] addMem = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySql.toString(), conditionSql.toString(), parameter), parameter);
		return addMem[0].getAsInt("CNT");

	}

	public void saveData(BOCmExportListBean value) throws Exception {
		if (value.isNew()) {
			value.setExportId(CmCommonUtil.getNewSequence(BOCmExportListBean.class));
			value.setFtpFileName("Cm" + String.valueOf(value.getExportId()));
			value.setState("1");
			setCommonValue(value);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(value);
	}

	private void setCommonValue(DataStructInterface dsi) throws Exception {
		ObjectType objectType = dsi.getObjectType();
		// 对于没有具体的BO类型的不处理
		if (objectType instanceof ObjectTypeNull) {
			return;
		}
		// 无任何值改变则跳过
		if (!dsi.isNew() && !dsi.isModified() && dsi.isDeleted()) {
			return;
		}
		Timestamp currDatetime = ServiceManager.getOpDateTime();
		if (dsi.isNew()) {
			// 创建时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_CreateDate) && dsi.get(BOCmGroupLevelAuditBean.S_CreateDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_CreateDate, currDatetime);
			}
			// 创建操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_CreateOpId) && dsi.get(BOCmGroupLevelAuditBean.S_CreateOpId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_CreateOpId, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_CreateOrgId) && dsi.get(BOCmGroupLevelAuditBean.S_CreateOrgId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_CreateOrgId, ServiceManager.getUser().getOrgId());
				}
			}
			// 地市
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_RegionId) && dsi.get(BOCmGroupLevelAuditBean.S_RegionId) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_RegionId, CmCommonUtil.getDefaultRegionId());
			}

			// 失效时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_ExpireDate) && dsi.get(BOCmGroupLevelAuditBean.S_ExpireDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_ExpireDate, TimeUtil.getMaxExpire());
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_OpId) && dsi.get(BOCmGroupLevelAuditBean.S_OpId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_OpId, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_OrgId) && dsi.get(BOCmGroupLevelAuditBean.S_OrgId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_OrgId, ServiceManager.getUser().getOrgId());
				}
			}
			// 业务流水号
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_DoneCode) && dsi.get(BOCmGroupLevelAuditBean.S_DoneCode) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_DoneCode, ServiceManager.getDoneCode());
			}
			// 生效时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_EffectiveDate) && dsi.get(BOCmGroupLevelAuditBean.S_EffectiveDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_EffectiveDate, currDatetime);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmExportListSV#queryLog(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, int, int)
	 */
	public IBOCmFileSyncErrLogValue[] queryLog(String fileType, String fileName, String recordId,String startDate, String endDate, int strIdx, int endIdx) throws Exception {
		StringBuffer cond = new StringBuffer(" 1=1 ");
		Map paramMap = new HashMap();
		if (StringUtils.isNotBlank(fileType)) {
			if (!fileType.equals("-1")) {
				cond.append(" AND FILE_TYPE = :fileType ");
				paramMap.put("fileType", fileType);
			}

		}
		if (StringUtils.isNotBlank(fileName)) {
			cond.append(" AND FILE_NAME like :fileName");
			paramMap.put("fileName", '%' + fileName + '%');
		}
		if(StringUtils.isNotBlank(recordId)){
			cond.append(" AND RECORD_ID = :recordId ");
			paramMap.put("recordId", recordId);
		}
		if (StringUtils.isNotBlank(startDate)) {
			cond.append(" AND CREATE_DATE  >=DATE_FORMAT( :startDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("startDate", startDate + " 00:00:00");
			paramMap.put("DONE_DATE", TimeUtil.getTimstampByString(startDate + " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
		}
		if (StringUtils.isNotBlank(endDate)) {
			cond.append(" AND CREATE_DATE  <=DATE_FORMAT( :endDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("endDate", endDate + " 23:59:59");
		}
		return BOCmFileSyncErrLogEngine.getBeans(null, cond.toString(), paramMap, strIdx, endIdx, false);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmExportListSV#queryLogCount(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	public int queryLogCount(String fileType, String fileName,String recordId, String startDate, String endDate) throws Exception {
		StringBuffer cond = new StringBuffer(" 1=1 ");
		Map paramMap = new HashMap();
		if (StringUtils.isNotBlank(fileType)) {
			if (!fileType.equals("-1")) {
				cond.append(" AND FILE_TYPE = :fileType ");
				paramMap.put("fileType", fileType);
			}

		}
		if (StringUtils.isNotBlank(fileName)) {
			cond.append(" AND FILE_NAME like :fileName");
			paramMap.put("fileName", '%' + fileName + '%');
		}
		if(StringUtils.isNotBlank(recordId)){
			cond.append(" AND RECORD_ID = :recordId ");
			paramMap.put("recordId", recordId);
		}
		if (StringUtils.isNotBlank(startDate)) {
			cond.append(" AND CREATE_DATE  >=DATE_FORMAT( :startDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("startDate", startDate + " 00:00:00");
			paramMap.put("DONE_DATE", TimeUtil.getTimstampByString(startDate + " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
		}
		if (StringUtils.isNotBlank(endDate)) {
			cond.append(" AND CREATE_DATE  <=DATE_FORMAT( :endDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("endDate", endDate + " 23:59:59");
		}
		return BOCmFileSyncErrLogEngine.getBeansCount(cond.toString(), paramMap);
	}

	public IBOCmBusiLogValue[] qryLog(String opId, String busiType, String startDate, String endDate, int startrowindex, int endrowindex) throws Exception {

		StringBuffer cond = new StringBuffer(" 1=1 ");
		Map paramMap = new HashMap();
		if (StringUtils.isNotBlank(opId)) {
			if (!opId.equals("-1")) {
				cond.append(" AND OP_ID like :opId ");
				paramMap.put("opId", '%' + opId + '%');
			}

		}
		if (StringUtils.isNotBlank(busiType)) {
			cond.append(" AND BUSINESS_ID = :busiType");
			paramMap.put("busiType", busiType);
		}
		if (StringUtils.isNotBlank(startDate)) {
			cond.append(" AND CREATE_DATE  >=DATE_FORMAT( :startDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("startDate", startDate + " 00:00:00");
		}
		if (StringUtils.isNotBlank(endDate)) {
			cond.append(" AND CREATE_DATE  <=DATE_FORMAT( :endDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("endDate", endDate + " 23:59:59");
		}
		paramMap.put("DONE_DATE", new Date());
		IBOCmBusiLogValue[] values=BOCmBusiLogEngine.getBeans(null, cond.toString(), paramMap, startrowindex, endrowindex, false);
		if(CmCommonUtil.isNotEmptyObject(values)){
			ISec2CmSV secSV=(ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for(int i=0;i<values.length;i++){
				IQBOSecOrgStaffOperValue operator=secSV.getOperQBOByOperId(values[i].getOpId());
				if(CmCommonUtil.isNotEmptyObject(operator)){
					values[i].setRemarks(operator.getStaffName());
				}
				if(values[i].getCustId()==0 || values[i].getCustId()==-1){
					values[i].setDiaplayAttr("CUST_ID", "REAL_CUST_ID", " ");
				}
				if(values[i].getAcctId()==0 || values[i].getAcctId()==-1){
					values[i].setDiaplayAttr("ACCT_ID", "REAL_ACCT_ID", " ");
				}
				if(values[i].getUserId()==0 || values[i].getUserId()==-1){
					values[i].setDiaplayAttr("USER_ID", "REAL_USER_ID", " ");
				}
			}
			return values;
		}
		return new IBOCmBusiLogValue[0];
	}

	public int qryLogCount(String opId, String busiType, String startDate, String endDate) throws Exception {
		StringBuffer cond = new StringBuffer(" 1=1 ");
		Map paramMap = new HashMap();
		if (StringUtils.isNotBlank(opId)) {
			if (!opId.equals("-1")) {
				cond.append(" AND OP_ID like :opId ");
				paramMap.put("opId", '%' + opId + '%');
			}

		}
		if (StringUtils.isNotBlank(busiType)) {
			cond.append(" AND BUSINESS_ID = :busiType");
			paramMap.put("busiType", busiType);
		}
		if (StringUtils.isNotBlank(startDate)) {
			cond.append(" AND CREATE_DATE  >=DATE_FORMAT( :startDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("startDate", startDate + " 00:00:00");
		}
		if (StringUtils.isNotBlank(endDate)) {
			cond.append(" AND CREATE_DATE  <=DATE_FORMAT( :endDate ,'%Y-%m-%d %H:%i:%s')");
			paramMap.put("endDate", endDate + " 23:59:59");
		}
		paramMap.put("DONE_DATE", new Date());
		return BOCmBusiLogEngine.getBeansCount(cond.toString(), paramMap);
	}
}
