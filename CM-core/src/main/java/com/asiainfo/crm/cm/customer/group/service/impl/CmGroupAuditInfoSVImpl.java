package com.asiainfo.crm.cm.customer.group.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmCustCreditReq2BIBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupAuditInfoBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustCreditReqBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmCustCreditReq2BIValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupAuditInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustCreditReqValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupAuditInfoSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustCreditReqSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;

public class CmGroupAuditInfoSVImpl implements ICmGroupAuditInfoSV {

	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];

		StringBuilder querySqlMen = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupAuditInfoBean.class).getMapingEnty());

		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if (!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CreateDate + " >=to_date( :StartDate ,'YYYY-MM-DD')");
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CreateDate + " <=to_date( :EndDate ,'YYYY-MM-DD')");

			parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
			parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_AuditType + " = :AuditType ");
		if (!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CustId + " = :CustId ");
		}
		if (!"".equals(condition.getAsString("AUDIT_STS")) && null != condition.getAsString("AUDIT_STS") && !"0".equals(condition.getAsString("AUDIT_STS"))) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_AuditSts + " = :AuditSts ");
		}
		if (!"".equals(condition.getAsString("CUST_CONT_ID")) && null != condition.getAsString("CUST_CONT_ID")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CustContId + " = :custContId ");
		}
		if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CityId + " = :cityId ");
		}
		if (!"1".equals(condition.getAsString("AUDIT_TYPE"))) {
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CountyId + " = :countyId ");
			}
		}
		parameter.put("AuditType", condition.getAsString("AUDIT_TYPE"));
		parameter.put("CustId", condition.getAsString("CUST_ID"));
		parameter.put("AuditSts", condition.getAsString("AUDIT_STS"));
		parameter.put("custContId", condition.getAsString("CUST_CONT_ID"));
		parameter.put("cityId", condition.getAsString("CITY_ID"));
		parameter.put("countyId", condition.getAsString("COUNTY_ID"));
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(querySqlMen.toString(), addMemSql.toString(), startNum, endNum, parameter), parameter);

		return (DataContainer[]) returnValues;
		// return (DataContainer[])((AbstractCustGroupInfoAuditModelImpl)
		// CmServiceFactory.getBusiMode(AbstractCustGroupInfoAuditModelImpl.class)).queryData(criteria, startNum,
		// endNum);
	}

	public int queryDataCount(String criteria) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];

		StringBuilder querySqlMen = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupAuditInfoBean.class).getMapingEnty());

		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if (!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CreateDate + " >=to_date( :StartDate ,'YYYY-MM-DD')");
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CreateDate + " <=to_date( :EndDate ,'YYYY-MM-DD')");

			parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
			parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_AuditType + " = :AuditType ");
		if (!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CustId + " = :CustId ");
		}
		if (!"".equals(condition.getAsString("AUDIT_STS")) && null != condition.getAsString("AUDIT_STS")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_AuditSts + " = :AuditSts ");
		}
		if (!"".equals(condition.getAsString("CUST_CONT_ID")) && null != condition.getAsString("CUST_CONT_ID")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CustContId + " = :custContId ");
		}
		if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
			addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CityId + " = :cityId ");
		}
		if (!"1".equals(condition.getAsString("AUDIT_TYPE"))) {
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and " + IBOCmGroupAuditInfoValue.S_CountyId + " = :countyId ");
			}
		}
		parameter.put("AuditType", condition.getAsString("AUDIT_TYPE"));
		parameter.put("CustId", condition.getAsString("CUST_ID"));
		parameter.put("AuditSts", condition.getAsString("AUDIT_STS"));
		parameter.put("custContId", condition.getAsString("CUST_CONT_ID"));
		parameter.put("cityId", condition.getAsString("CITY_ID"));
		parameter.put("countyId", condition.getAsString("COUNTY_ID"));
		DataContainerInterface[] addMem = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySqlMen.toString(), addMemSql.toString(), parameter), parameter);

		return addMem[0].getAsInt("CNT");

		// return ((AbstractCustGroupInfoAuditModelImpl)
		// CmServiceFactory.getBusiMode(AbstractCustGroupInfoAuditModelImpl.class)).queryCount(criteria);
	}

	public void saveData(DataContainer[] values, String auditClass) throws Exception {
		// TODO Auto-generated method stub
		String oldAuditId = "";
		long custId = 0L;
		String auditSts = "";
		for (DataContainer value : values) {
			custId = value.getAsLong("CUST_ID");
			auditSts = String.valueOf(value.getAsLong("AUDIT_STS"));
			String auditType = value.getAsString("AUDIT_TYPE");
			value.set(IBOCmGroupAuditInfoValue.S_AuditOpId, ServiceManager.getUser().getID());
			if (value.isNew())
				((BOCmGroupCustCreditReqBean) value).setRequestId(CmCommonUtil.getNewSequence(BOCmGroupCustCreditReqBean.class));
			else if (value.isModified()) {
				// 加分项审核步骤
				if (CmLnConstants.AuditTypeGrp.AuditTypeCreReq_2.equals(auditType) || CmLnConstants.AuditTypeGrp.AuditTypeCreReq_3.equals(auditType)
						|| CmLnConstants.AuditTypeGrp.AuditTypeCreReq_4.equals(auditType) || CmLnConstants.AuditTypeGrp.AuditTypeCreReq_5.equals(auditType)) {
					// 当审核配置层级为1时,直接处理加分项、关键人变更
					if (CmLnConstants.AuditClass.AuditClass_1.equals(auditClass)) {
						// 审核失败
						if (CmLnConstants.AudisSts.STS_3.equals(auditSts)) {
							dealCreditReqInfo(custId, auditSts, value);
						}
						// 审核成功
						else if (CmLnConstants.AudisSts.STS_2.equals(String.valueOf(value.getAsLong("AUDIT_STS")))) {
							// 处理加分项申请信息,插入接口表
							dealCreditReqInfo(custId, auditSts, value);
						}
					}
					// 2级审核过程
					else if (CmLnConstants.AuditClass.AuditClass_2.equals(auditClass)) {
						// 如果审核失败则审核结束
						if (CmLnConstants.AudisSts.STS_3.equals(String.valueOf(value.getAsLong("AUDIT_STS")))) {
							dealCreditReqInfo(custId, auditSts, value);
						} else if (CmLnConstants.AudisSts.STS_2.equals(String.valueOf(value.getAsLong("AUDIT_STS")))) {
							oldAuditId = value.getAsString("OLD_AUDIT_ID");
							if ("".equals(oldAuditId) || oldAuditId == null) {
								// 保存2级审核信息
								dealAuditInfo2Level(value);

							} else {
								// 处理加分项信息
								dealCreditReqInfo(custId, auditSts, value);
							}
						}
					}
				}
				// 关键人审核步骤
				else if (CmLnConstants.AuditTypeGrp.AuditTypeContact.equals(auditType)) {
					// 当审核配置层级为1时,直接处理关键人变更
					if (CmLnConstants.AuditClass.AuditClass_1.equals(auditClass)) {
						// 审核成功
						if (CmLnConstants.AudisSts.STS_2.equals(String.valueOf(value.getAsLong("AUDIT_STS")))) {
							// TODO 处理关键人变更
							ICmLnClubServiceSV clubService = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
							clubService.updateContactLevel(value.getAsString("CUST_CONT_ID"), value.getAsString("NEW_VALUE"));

						}
					}
					// 2级审核过程
					else if (CmLnConstants.AuditClass.AuditClass_2.equals(auditClass)) {
						if (CmLnConstants.AudisSts.STS_2.equals(String.valueOf(value.getAsLong("AUDIT_STS")))) {
							oldAuditId = value.getAsString("OLD_AUDIT_ID");
							if ("".equals(oldAuditId) || oldAuditId == null) {
								// 保存2级审核信息
								dealAuditInfo2Level(value);

							} else {
								// TODO 处理关键人变更
								ICmLnClubServiceSV clubService = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
								clubService.updateContactLevel(value.getAsString("CUST_CONT_ID"), value.getAsString("NEW_VALUE"));
							}
						}
					}
				}
			}
			/*
			 * //这里需要同步到cm_group_customer表
			 * if(CmLnConstants.GroupAuditSts.success.equals(value.getAsString(BOCmGroupLevelAuditBean.S_AuditSts)))
			 * {
			 * ICustomerValue queryValue=CmServiceFactory.getCustomerSV()
			 * .queryCustomerByServiceId(value.getAsString(BOCmGroupLevelAuditBean.S_GroupId),
			 * CmConstants.CustomerType.GROUP);
			 * if(queryValue !=null)
			 * {
			 * queryValue.initProperty(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			 * queryValue.set(ICustomerValue.S_CustServiceLevel,
			 * Integer.parseInt(value.getAsString(BOCmGroupLevelAuditBean.S_NewValue)));
			 * CmServiceFactory.getCustomerSV().saveCustomer(queryValue);
			 * }
			 * }
			 */
		}
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	}

	public void dealCreditReqInfo(long custId, String auditSts, DataContainer value) throws Exception {
		ICmGroupCustCreditReqSV sv = (ICmGroupCustCreditReqSV) ServiceFactory.getService(ICmGroupCustCreditReqSV.class);
		BOCmGroupCustCreditReqBean reqBean = (BOCmGroupCustCreditReqBean) sv.queryReqInfoByCustId(custId);

		if (CmLnConstants.AudisSts.STS_2.equals(auditSts)) {
			reqBean.set(IBOCmGroupCustCreditReqValue.S_Sts, CmLnConstants.CreditReqSts.CreditReqSts_2);
			reqBean.set(IBOCmGroupCustCreditReqValue.S_StsDate, CmCommonUtil.getSysDate());
		} else if (CmLnConstants.AudisSts.STS_3.equals(auditSts)) {
			reqBean.set(IBOCmGroupCustCreditReqValue.S_Sts, CmLnConstants.CreditReqSts.CreditReqSts_3);
			reqBean.set(IBOCmGroupCustCreditReqValue.S_StsDate, CmCommonUtil.getSysDate());
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(reqBean);
		if (CmLnConstants.AudisSts.STS_2.equals(auditSts)) {
			dealCreditReq2BIInfo(reqBean, value);
		}
	}

	public void dealCreditReq2BIInfo(BOCmGroupCustCreditReqBean reqBean, DataContainer value) throws Exception {

		BOCmCustCreditReq2BIBean biBean = new BOCmCustCreditReq2BIBean();
		biBean.set(IBOCmCustCreditReq2BIValue.S_RequestId, CmCommonUtil.getNewSequence(BOCmCustCreditReq2BIBean.class));
		biBean.set(IBOCmCustCreditReq2BIValue.S_CustId, reqBean.getAsString("CUST_ID"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_RequestType, reqBean.getAsString("REQUEST_TYPE"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_OrgCreditClas, reqBean.getAsString("ORG_CREDIT_CLAS"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_ReqCreditClass, reqBean.getAsString("REQ_CREDIT_CLASS"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_ReqCoin, reqBean.getAsString("REQ_COIN"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_ReqCoinReason, reqBean.getAsString("REQ_COIN_REASON"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_ValidMode, CmLnConstants.ValidMode.ValidMode_2);
		biBean.set(IBOCmCustCreditReq2BIValue.S_DealState, reqBean.getAsString("STS"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_DealResult, value.getAsString("AUDIT_DESC"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_RegionId, value.getAsString("REGION_ID"));
		biBean.set(IBOCmCustCreditReq2BIValue.S_State, CmConstants.RecordState.USE);
		biBean.set(IBOCmCustCreditReq2BIValue.S_DoneDate, CmCommonUtil.getSysDate());
		biBean.set(IBOCmCustCreditReq2BIValue.S_CreateDate, CmCommonUtil.getSysDate());

		CmInnerServiceFactory.getCommonInnerSV().saveBean(biBean);

	}

	public void dealAuditInfo2Level(DataContainer value) throws Exception {
		// 保存2级审核信息
		BOCmGroupAuditInfoBean auditInfoBean = new BOCmGroupAuditInfoBean();
		long seq = Long.valueOf(CmCommonUtil.getNewSequence(BOCmGroupAuditInfoBean.class));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditId, seq);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditType, value.get("AUDIT_TYPE"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyDate, value.get("APPLY_DATE"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OldValue, value.get("OLD_VALUE"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_NewValue, value.get("NEW_VALUE"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyOpId, value.get("APPLY_OP_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_State, CmConstants.RecordState.USE);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateOpId, value.get("APPLY_OP_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateOrgId, value.get("APPLY_ORG_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OpId, ServiceManager.getUser().getID());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OrgId, ServiceManager.getUser().getOrgId());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateDate, value.get("CREATE_DATE"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_DoneDate, CmCommonUtil.getSysDate());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_RegionId, value.get("REGION_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditSts, CmLnConstants.AudisSts.STS_1);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditDesc, value.get("AUDIT_DESC"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CustId, value.get("CUST_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ReqCoin, value.get("REQ_COIN"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CityId, value.get("CITY_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CountyId, value.get("COUNTY_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditOpId, ServiceManager.getUser().getID());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OldAuditId, value.get("AUDIT_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CustContId, value.get("CUST_CONT_ID"));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyDesc, value.get("APPLY_DESC"));

		CmInnerServiceFactory.getCommonInnerSV().saveBean(auditInfoBean);
	}
}
