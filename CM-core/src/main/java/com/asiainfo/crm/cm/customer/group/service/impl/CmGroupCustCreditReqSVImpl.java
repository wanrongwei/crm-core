package com.asiainfo.crm.cm.customer.group.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupAuditInfoBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustCreditReqBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupAuditInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustCreditReqValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustCreditReqSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public class CmGroupCustCreditReqSVImpl implements ICmGroupCustCreditReqSV{

	public void saveData(DataContainer[] values) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String orgCreditClas = "";
		String requestType = "";
		for(DataContainer value:values)
		{	
			long seq = Long.valueOf(CmCommonUtil.getNewSequence(BOCmGroupCustCreditReqBean.class));
			if(value.isNew()){
				((BOCmGroupCustCreditReqBean)value).setRequestId(seq);
				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_Sts, CmLnConstants.CreditReqSts.CreditReqSts_1);
				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_State, CmConstants.RecordState.USE);
				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_CreateDate, CmCommonUtil.getSysDate());
				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_OpId, ServiceManager.getUser().getID());
				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_OrgId, ServiceManager.getUser().getOrgId());

				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_CreateOpId, ServiceManager.getUser().getID());
				((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_CreateOpId, ServiceManager.getUser().getOrgId());
				orgCreditClas = value.getAsString("ORG_CREDIT_CLAS");
				requestType = value.getAsString("REQUEST_TYPE");
				// 加分项信用等级申请
				//1.为1和5时，申请级别不变
				if(CmLnConstants.ReqRequestType.ReqRequestType_1.equals(requestType) || CmLnConstants.ReqRequestType.ReqRequestType_5.equals(requestType)){
					((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_ReqCreditClass, orgCreditClas);
				}
				//2.为2时，申请等级为4级
				if(CmLnConstants.ReqRequestType.ReqRequestType_2.equals(requestType))
				{
					((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_ReqCreditClass, CmLnConstants.GrpCreditLevel.GrpCreditLevel_4);
				}
				//3.为3时，等级清空
				if(CmLnConstants.ReqRequestType.ReqRequestType_3.equals(requestType))
				{
					((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_ReqCreditClass, "");
				}
				//4.为4时，申请等级为0
				if(CmLnConstants.ReqRequestType.ReqRequestType_4.equals(requestType))
				{
					((BOCmGroupCustCreditReqBean)value).set(IBOCmGroupCustCreditReqValue.S_ReqCreditClass, CmLnConstants.GrpCreditLevel.GrpCreditLevel_0);
				}				
				saveAuditInfo1Level(value);
			}
		}
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);	
	}

	public DataContainer[] queryData(String criteria, int startNum, int endNum)throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] containers = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition =containers[0];
		
		StringBuilder querySqlMen = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustCreditReqBean.class).getMapingEnty());

		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if(!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CreateDate+" >=to_date( :StartDate ,'YYYY-MM-DD')");
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CreateDate+" <=to_date( :EndDate ,'YYYY-MM-DD')");
			
			parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
			parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		if(!"".equals(condition.getAsString("REQUEST_ID")) && null != condition.getAsString("REQUEST_ID"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_RequestId + " = :RequestId ");
		}
		if(!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CustId + " = :CustId ");
		}
		if(!"".equals(condition.getAsString("STS")) && null != condition.getAsString("STS") && !"0".equals(condition.getAsString("STS")))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_Sts + " = :Sts ");
		}
		if(!"".equals(condition.getAsString("REQUEST_TYPE")) && null != condition.getAsString("REQUEST_TYPE"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_RequestType + " = :RequestType ");
		}
		parameter.put("RequestId", condition.getAsString("REQUEST_ID"));
		parameter.put("CustId", condition.getAsString("CUST_ID"));
		parameter.put("Sts", condition.getAsString("STS"));
		parameter.put("RequestType", condition.getAsString("REQUEST_TYPE"));
		
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(querySqlMen.toString(), addMemSql.toString() ,startNum, endNum, parameter), parameter);
		
		return (DataContainer[])returnValues;
	}

	public int queryDataCount(String criteria) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] containers = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition =containers[0];
		
		StringBuilder querySqlMen = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustCreditReqBean.class).getMapingEnty());

		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if(!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CreateDate+" >=to_date( :StartDate ,'YYYY-MM-DD')");
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CreateDate+" <=to_date( :EndDate ,'YYYY-MM-DD')");
			
			parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
			parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		if(!"".equals(condition.getAsString("REQUEST_ID")) && null != condition.getAsString("REQUEST_ID"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_RequestId + " = :RequestId ");
		}
		if(!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CustId + " = :CustId ");
		}
		if(!"".equals(condition.getAsString("STS")) && null != condition.getAsString("STS") && !"0".equals(condition.getAsString("STS")))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_Sts + " = :Sts ");
		}
		if(!"".equals(condition.getAsString("REQUEST_TYPE")) && null != condition.getAsString("REQUEST_TYPE"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_RequestType + " = :RequestType ");
		}
		parameter.put("RequestId", condition.getAsString("REQUEST_ID"));
		parameter.put("CustId", condition.getAsString("CUST_ID"));
		parameter.put("Sts", condition.getAsString("STS"));
		parameter.put("RequestType", condition.getAsString("REQUEST_TYPE"));
		
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySqlMen.toString(), addMemSql.toString(), parameter), parameter);
		
		return returnValues[0].getAsInt("CNT");
	}

	public IBOCmGroupCustCreditReqValue queryReqInfoByCustId(long custId) throws Exception {
		// TODO Auto-generated method stub
		
		StringBuilder querySql = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustCreditReqBean.class).getMapingEnty());
		StringBuilder conditionSql = new StringBuilder("");
		Map parameter = new HashMap();
		conditionSql.append("and " + IBOCmGroupCustCreditReqValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		conditionSql.append(" and " + IBOCmGroupCustCreditReqValue.S_CustId + " =:custId ");
		parameter.put("custId", custId);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(querySql.toString(), conditionSql.toString(),-1,-1, parameter), parameter);
		if(CmCommonUtil.isNotEmptyObject(inter)){
			IBOCmGroupCustCreditReqValue value = new BOCmGroupCustCreditReqBean();
			value.copy(inter[0]);
			return value;
		}
		return null;
	}

	public int queryReqInfoCountByCustId(long custId) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder querySql = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustCreditReqBean.class).getMapingEnty());
		StringBuilder conditionSql = new StringBuilder("");
		Map parameter = new HashMap();
		conditionSql.append("and " + IBOCmGroupCustCreditReqValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		conditionSql.append(" and " + IBOCmGroupCustCreditReqValue.S_CustId + " =:custId ");
		conditionSql.append(" and " + IBOCmGroupCustCreditReqValue.S_Sts + " = " + CmLnConstants.CreditReqSts.CreditReqSts_1);
		parameter.put("custId", custId);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySql.toString(), conditionSql.toString(), parameter), parameter);
		if(CmCommonUtil.isNotEmptyObject(inter)){
			return inter[0].getAsInt("CNT");
		}
		return 0;
	}

	public IBOCmGroupCustCreditReqValue queryReqInfoCountByCustIdAndDate(long custId) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder querySql = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustCreditReqBean.class).getMapingEnty());
		StringBuilder conditionSql = new StringBuilder("");
		Map parameter = new HashMap();
		conditionSql.append("and " + IBOCmGroupCustCreditReqValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		conditionSql.append(" and " + IBOCmGroupCustCreditReqValue.S_CustId + " =:custId ");
		conditionSql.append(" and " + IBOCmGroupCustCreditReqValue.S_Sts + " in ('" + CmLnConstants.CreditReqSts.CreditReqSts_2 + 
				"',"+"'"+CmLnConstants.CreditReqSts.CreditReqSts_4+"')");
		parameter.put("custId", custId);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(querySql.toString(), conditionSql.toString(),-1,-1, parameter), parameter);
		if(CmCommonUtil.isNotEmptyObject(inter)){
			IBOCmGroupCustCreditReqValue value = new BOCmGroupCustCreditReqBean();
			value.copy(inter[0]);
			return value;
		}
		return null;
	}
	
	public void saveAuditInfo1Level(DataContainer value) throws Exception
	{
		
			String requestType = value.getAsString("REQUEST_TYPE");
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(value.getAsLong("CUST_ID"));
			BOCmGroupAuditInfoBean auditInfoBean = new BOCmGroupAuditInfoBean();
			long seq = Long.valueOf(CmCommonUtil.getNewSequence(BOCmGroupAuditInfoBean.class));
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditId, seq);
			if("1".equals(requestType)){
				auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditType,CmLnConstants.AuditTypeGrp.AuditTypeCreReq_2);
			}else if("2".equals(requestType) || "3".equals(requestType)){
				auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditType,CmLnConstants.AuditTypeGrp.AuditTypeCreReq_3);
			}else if("4".equals(requestType)){
				auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditType,CmLnConstants.AuditTypeGrp.AuditTypeCreReq_4);
			}else if("5".equals(requestType)){
				auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditType,CmLnConstants.AuditTypeGrp.AuditTypeCreReq_5);
			}
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyDate,CmCommonUtil.getSysDate());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OldValue,value.getAsString("ORG_CREDIT_CLAS"));
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_NewValue,value.getAsString("REQ_CREDIT_CLASS"));
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyOpId,ServiceManager.getUser().getID());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_State,CmConstants.RecordState.USE);
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateOpId,ServiceManager.getUser().getID());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateOrgId,ServiceManager.getUser().getOrgId());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OpId,ServiceManager.getUser().getID());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OrgId,ServiceManager.getUser().getOrgId());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateDate,CmCommonUtil.getSysDate());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_DoneDate,CmCommonUtil.getSysDate());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_RegionId,CmCommonUtil.getDefaultRegionId());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyDesc,value.getAsString("REQ_COIN_REASON"));
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditSts,CmLnConstants.AudisSts.STS_1);
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditDesc,"");
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CustId,value.getAsLong("CUST_ID"));
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ReqCoin,value.getAsLong("REQ_COIN"));
//			System.out.println(ServiceManager.getUser().getAttrs() + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CityId,customerValue.getCityId());
			auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CountyId,customerValue.getCountyId());
			
			CmInnerServiceFactory.getCommonInnerSV().saveBean(auditInfoBean);
	}
	public IBOCmGroupCustCreditReqValue[] queryReqInfoValue(DataContainer dt)throws Exception{
		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		if(!"".equals(dt.getAsString("EFFECTIVE_DATE")) && null != dt.getAsString("EFFECTIVE_DATE"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CreateDate+" >=to_date( :StartDate ,'YYYY-MM-DD')");
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CreateDate+" <=to_date( :EndDate ,'YYYY-MM-DD')");
			
			parameter.put("StartDate", dt.getAsString("EFFECTIVE_DATE").substring(0, 10));
			parameter.put("EndDate", dt.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		if(!"".equals(dt.getAsString("REQUEST_ID")) && null != dt.getAsString("REQUEST_ID"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_RequestId + " = :RequestId ");
		}
		if(!"".equals(dt.getAsString("CUST_ID")) && null != dt.getAsString("CUST_ID"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_CustId + " = :CustId ");
		}
		if(!"".equals(dt.getAsString("STS")) && null != dt.getAsString("STS") && !"0".equals(dt.getAsString("STS")))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_Sts + " = :Sts ");
		}
		if(!"".equals(dt.getAsString("REQUEST_TYPE")) && null != dt.getAsString("REQUEST_TYPE"))
		{
			addMemSql.append(" and "+IBOCmGroupCustCreditReqValue.S_RequestType + " = :RequestType ");
		}
		parameter.put("RequestId", dt.getAsString("REQUEST_ID"));
		parameter.put("CustId", dt.getAsString("CUST_ID"));
		parameter.put("Sts", dt.getAsString("STS"));
		parameter.put("RequestType", dt.getAsString("REQUEST_TYPE"));
		StringBuilder querySqlMen = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustCreditReqBean.class).getMapingEnty());
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(querySqlMen.toString(), addMemSql.toString() ,-1, -1, parameter), parameter);
		if (CmCommonUtil.isEmptyObject(returnValues)) {
			return new IBOCmGroupCustCreditReqValue[0];
		}
		List list=new ArrayList();
		int len=returnValues.length;
		IBOCmGroupCustCreditReqValue iboCmGroupCustCreditReqValue=new BOCmGroupCustCreditReqBean();
		for (int i = 0; i < len; i++) {
			iboCmGroupCustCreditReqValue.copy(returnValues[i]);
			list.add(iboCmGroupCustCreditReqValue);
		}
		return (IBOCmGroupCustCreditReqValue[])list.toArray(new IBOCmGroupCustCreditReqValue[0]);
	}
}
