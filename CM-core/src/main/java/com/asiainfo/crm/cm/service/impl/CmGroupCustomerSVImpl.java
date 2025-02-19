package com.asiainfo.crm.cm.service.impl;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.asiainfo.crm.cm.teaminvoke.out.util.KOBFileUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.comframe.client.ComframeClient;
import com.ai.comframe.vm.common.Constant;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.oneframe.msg.bo.BORemindBean;
import com.ai.oneframe.msg.ivalues.IBORemindValue;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.client.SecframeClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecGroupValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperGrpValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.cache.CmIndustryCacheImpl;
import com.asiainfo.crm.cm.common.cache.CmSegmentManagerCacheImpl;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CommonTool;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupRelIndustryBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupSegmentAttrRelaBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmSegMgrGroupRelBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmSegmentAttrBean;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupSegmentBean;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustAttrDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupSegmentAttrRelaValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegMgrGroupRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegmentAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.dk.bo.BOCmGroupApprovalBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmGroupApprovalValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmQGroupCustAndExtraInfoDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupCustAndExtraInfoValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.bo.BOCmGroupCustomerAuditBean;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOCmGroupCustomerAuditValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnTransSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.cm.teaminvoke.out.dao.interfaces.ICmGroupCustomerDAO;
import com.asiainfo.crm.common.ResUserInfo;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmGroupCustomerSVImpl implements ICmGroupCustomerSV {

	public static final Log log = LogFactory.getLog(CmGroupCustomerSVImpl.class);

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfo(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception, RemoteException {
		ICmQGroupCustAndExtraInfoDAO groupCustAndExtraInfoDAO = (ICmQGroupCustAndExtraInfoDAO) ServiceFactory.getService(ICmQGroupCustAndExtraInfoDAO.class);
		return groupCustAndExtraInfoDAO.queryGroupCustAndExtraInfo(dataContainer, startIndex, endIndex);
	}

	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoById(long groupCustId) throws Exception, RemoteException {
		DataContainerInterface dataContainer = new DataContainer();
		dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId, Long.valueOf(groupCustId));
		dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_State, CmxConstants.RECORD_STATE_USE);
		IQBOCmGroupCustAndExtraInfoValue[] groupCustAndExtraInfoValues = queryGroupCustAndExtraInfo(dataContainer, -1, -1);
		if (groupCustAndExtraInfoValues == null || groupCustAndExtraInfoValues.length <= 0) {
			return null;
		}
		return groupCustAndExtraInfoValues[0];
	}

	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByGroupId(long groupId) throws Exception, RemoteException {
		DataContainerInterface dataContainer = new DataContainer();
		dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_GroupId, Long.valueOf(groupId));
		dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_State, CmxConstants.RECORD_STATE_USE);
		IQBOCmGroupCustAndExtraInfoValue[] groupCustAndExtraInfoValues = queryGroupCustAndExtraInfo(dataContainer, -1, -1);
		if (groupCustAndExtraInfoValues == null || groupCustAndExtraInfoValues.length <= 0) {
			return null;
		}
		return groupCustAndExtraInfoValues[0];
	}

	public IBOCmGroupCustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustomerByGroupId(groupId);
	}

	public IBOCmGroupManagerValue queryGroupCustMgrRel(long groupCustId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustMgrRel(groupCustId); 
	}

	public com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue queryGroupCustInfoByCustId(long groupCustId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustInfoByCustId(groupCustId);
	}

	public IBOCmUserSpeuserMainValue[] queryCreditByServiceNum(String serviceNum, int type) throws Exception, RemoteException {
		IBOCmUserSpeuserMainValue[] cmUser = null;
		if (0 == type) {
			ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
			cmUser = grouCustomerDAO.queryCreditByServiceNum(serviceNum, type);
		} else if (1 == type) {

		} else if (2 == type) {

		}
		return cmUser;
	}

	public IBOCmGroupCustomerValue[] queryGroupCustInfoByCustName(String custName) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustInfoByCustName(custName);
	}

	public IBOCmGroupMemberValue queryGroupMemInfoBySn(String Sn) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupMemInfoBySn(Sn);
	}

	public IBOCmGroupContactValue[] queryGroupContractByGroupCustId(long custId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupContractByGroupCustId(custId);
	}

	public IBOCmGroupCustomerValue queryGroupCustByBillId(String billId) throws Exception {
		IBOCmGroupCustomerValue groupCustomerValue = null;
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IBOUserInfoValue userValue = teamInvokeSV.queryUserInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到用户信息！
			ExceptionUtil.throwBusinessException("CMS5000154", billId);
		}
		long IndivCustId = userValue.getCustId();
		ICmGroupMemberSV groupMemberSV = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupMemberValue.S_MemberCustId, Long.valueOf(IndivCustId));
		IBOCmGroupMemberValue[] groupMemberValues = groupMemberSV.queryGroupMemberValues(dc, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupMemberValues)) {
			ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
			groupCustomerValue = grouCustomerDAO.queryGroupCustInfoByCustId(groupMemberValues[0].getCustId());
		}
		return groupCustomerValue;
	}

	private ICrmFSV getCrm2CmFSV() {
		return (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
	}

	public Map queryGroupByKeyBillId(String billId, String password, int LoginFlag) throws Exception {
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IBOUserInfoValue userValue = teamInvokeSV.queryUserInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到用户信息！
			ExceptionUtil.throwBusinessException("CMS5000154", billId);
		}
		long IndivCustId = userValue.getCustId();
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(IndivCustId);
		if (customerValue == null) {
			// 根据手机号码{0}没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS8000033", billId);
		}
		long partyId = customerValue.getPartyId();
		DataContainer dc = new DataContainer();
		dc.set(IContactValue.S_PartyId, Long.valueOf(partyId));
		dc.set(IContactValue.S_ContType, Integer.valueOf(CmLnConstants.GroupContType.GROUP_CONTACT));
		dc.set(IContactValue.S_PrioryLevel, Integer.valueOf(CmLnConstants.GroupContType.GROUP_CONTACT_FIRST));
		dc.set(ICustomerValue.S_CustType, Integer.valueOf(CmConstants.CustomerType.GROUP));
		IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(dc, -1, -1);
		if (CmCommonUtil.isEmptyObject(contactValues)) {
			// 根据手机号码[{0}]没有找到对应的集团主要联系人信息！
			ExceptionUtil.throwBusinessException("CMS5000159", billId);
		}
		long groupCustId = contactValues[0].getCustId();
		ICustomerValue groupCustomer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(groupCustId);
		if (groupCustomer == null) {
			// 该手机号码[{0}]归属的集团客户不存在！
			ExceptionUtil.throwBusinessException("CMS5000160", billId);
		}

		// modify by caiyu 20121119 根据传入标记，不校验密码，直接查询资料
		if (LoginFlag != 1) {
			// LoginFlag为1时，不需要校验密码，否则需要校验密码
			// modify by caiyu 20121026 经过明确，集团网厅是用主要联系人的手机号码和服务密码来进行登录的，
			// 因此，修改密码校验方式，直接调用营业的接口，进行密码校验。

			// modify by caiyu 20121201 另起事务，保证营业能记录问题
			Map otherSvParam = new HashMap();
			otherSvParam.put("BILL_ID", billId);
			otherSvParam.put("PASS_WORD", password);
			ICmLnTransSV crmFSV = (ICmLnTransSV) ServiceFactory.getService(ICmLnTransSV.class);
			Map map2 = crmFSV.doSelfTransaction(otherSvParam, CmLnConstants.CM_LN_TRANSACTION.CHECK_PASS);// getCrm2CmFSV().vfyPass4SR(billId,
			// password);
			if (map2.get("LockedFlg") != null) {
				ExceptionUtil.throwBusinessException("SOS4043072"); // 密码被锁定
			}
			if (!(Boolean) map2.get("isSuccess")) {
				if ("0".equals(map2.get("RetryTimes").toString())) {
					// 已经锁定
					ExceptionUtil.throwBusinessException("CMS95000118");// CMS95000118 您已输错5次密码，密码已锁定！
				} else {
					ExceptionUtil.throwBusinessException("CMS5000161", map2.get("RetryTimes").toString());// CMS5000161
					// 输入密码不正确，请检查！
				}

			}
		}

		Map result = new HashMap();
		Map groupMap = new HashMap();
		groupMap.put("group_id", groupCustomer.getCustServiceId());
		groupMap.put("group_name", groupCustomer.getCustName());
		groupMap.put("group_city", groupCustomer.getCityId());
		groupMap.put("group_county", groupCustomer.getCountyId());
		groupMap.put("group_area", groupCustomer.getTownId());
		groupMap.put("group_level", groupCustomer.getCustServiceLevel());
		groupMap.put("group_linker", contactValues[0].getContName());
		groupMap.put("group_linkPhone", contactValues[0].getBillId());
		groupMap.put("group_address", groupCustomer.getCustAddress());
		groupMap.put("group_status", groupCustomer.getCustStatus());
		groupMap.put("group_type", groupCustomer.getGroupType());
		ICmTeamInvokeSV invokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		groupMap.put("vpmn_id", invokeSV.getVpmnIdByCustId(groupCustId, groupCustomer.getRegionId()));
		groupMap.put("group_custId", groupCustomer.getCustId());
		result.put("GroupCustInfo", groupMap);
		return result;
	}

	public ICustomerValue queryGroupCustByKeyBillId(String billId) throws Exception {
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IBOUserInfoValue userValue = teamInvokeSV.queryUserInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到用户信息！
			ExceptionUtil.throwBusinessException("CMS5000154", billId);
		}
		long IndivCustId = userValue.getCustId();
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(IndivCustId);
		if (customerValue == null) {
			// 根据手机号码{0}没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS8000033", billId);
		}
		long partyId = customerValue.getPartyId();
		DataContainer dc = new DataContainer();
		dc.set(IContactValue.S_PartyId, Long.valueOf(partyId));
		dc.set(IContactValue.S_ContType, Integer.valueOf(CmLnConstants.GroupContType.GROUP_CONTACT));
		dc.set(IContactValue.S_PrioryLevel, Integer.valueOf(CmLnConstants.GroupContType.GROUP_CONTACT_FIRST));
		dc.set(ICustomerValue.S_CustType, Integer.valueOf(CmConstants.CustomerType.GROUP));
		IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(dc, -1, -1);
		if (CmCommonUtil.isEmptyObject(contactValues)) {
			// 根据手机号码[{0}]没有找到对应的集团主要联系人信息！
			ExceptionUtil.throwBusinessException("CMS5000159", billId);
		}
		long groupCustId = contactValues[0].getCustId();
		ICustomerValue groupCustomer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(groupCustId);
		return groupCustomer;
	}

	public Map queryManagerById(long managerId) throws Exception {
		if (managerId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		ISec2CmSV sec2CmSV = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		// modify by caiyu 20121207 修改查询调用的方法getEffectAmInfo
		IQBOSecCustManagerValue secCustManagers = sec2CmSV.getEffectAmInfo(managerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
		Map managerMap = new HashMap();
		if (CmCommonUtil.isNotEmptyObject(secCustManagers)) {
			managerMap.put("Manager_id", Long.valueOf(managerId));
			// modify by caiyu 20121207
			managerMap.put("Manager_name", secCustManagers.getManagername());
			managerMap.put("Phone_id", secCustManagers.getBillid());
		}
		Map result = new HashMap();
		List managerlist = new ArrayList();
		managerlist.add(managerMap);
		result.put("managerlist", managerlist);
		return result;
	}

	// 根据审核编号查询审核的集团信息
	public IBOCmGroupCustomerAuditValue[] queryAuditValue(long auditId, long custId, long auditStatus, long managerId, long auditType, long operType, int start, int end)
			throws Exception {
		DataContainer dt = new DataContainer();
		if (ServiceManager.getUser() != null) {
			dt.set(IBOCmGroupCustomerAuditValue.S_ManagerId, ServiceManager.getUser().getID());
		} else {
			return new IBOCmGroupCustomerAuditValue[0];
		}
		dt.set(IBOCmGroupCustomerAuditValue.S_AuditId, auditId);
		dt.set(IBOCmGroupCustomerAuditValue.S_CustId, custId);
		dt.set(IBOCmGroupCustomerAuditValue.S_AuditStatus, auditStatus);
		dt.set(IBOCmGroupCustomerAuditValue.S_AuditType, auditType);
		dt.set(IBOCmGroupCustomerAuditValue.S_OperType, operType);
		if (dt == null) {
			return new IBOCmGroupCustomerAuditValue[0];
		}
		IBOCmGroupCustomerAuditValue[] values = queryAuditValue(dt, start, end);
		return values;
	}

	public int queryAuditValueCount(long auditId, long custId, long auditStatus, long managerId, long auditType, long operType) throws Exception {
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupCustomerAuditValue.S_AuditId, auditId);
		dt.set(IBOCmGroupCustomerAuditValue.S_CustId, custId);
		dt.set(IBOCmGroupCustomerAuditValue.S_AuditStatus, auditStatus);
		dt.set(IBOCmGroupCustomerAuditValue.S_AuditType, auditType);
		dt.set(IBOCmGroupCustomerAuditValue.S_OperType, operType);
		if (ServiceManager.getUser() != null) {
			dt.set(IBOCmGroupCustomerAuditValue.S_ManagerId, ServiceManager.getUser().getID());
		} else {
			return 0;
		}
		return queryAuditValueCount(dt);
	}

	public int queryAuditValueCount(DataContainer dt) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { dt }, BOCmGroupCustomerAuditBean.class);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}

		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	public IBOCmGroupCustomerAuditValue[] queryAuditValue(DataContainer dc, int start, int end) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupCustomerAuditBean.class);
		ParamUtil.validateParameter(parameter);
		DataContainerInterface[] dataConta = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupCustomerAuditBean.class, null, parameter.getCondition(),
				parameter.getParameter(), start, end, true);
		if (CmCommonUtil.isEmptyObject(dataConta)) {
			return new IBOCmGroupCustomerAuditValue[0];
		}
		List auditList = new ArrayList();
		IBOCmGroupCustomerAuditValue iboCmGrpCustomerAudit = new BOCmGroupCustomerAuditBean();
		ISec2CmSV sec2CmSV = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		ICmCustomerSV sv = CmServiceFactory.getCustomerSV();
		ICustomerValue cv = null;
		// 根据客户编号查询客户信息
		for (int i = 0; i < dataConta.length; i++) {
			iboCmGrpCustomerAudit = new BOCmGroupCustomerAuditBean();
			iboCmGrpCustomerAudit.copy(dataConta[i]);
			IQBOSecCustManagerValue boSec = sec2CmSV.getEffectAmInfo(iboCmGrpCustomerAudit.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			if (CmCommonUtil.isNotEmptyObject(boSec)) {
				iboCmGrpCustomerAudit.setRemarks(boSec.getManagername());
				iboCmGrpCustomerAudit.setAuditManagerId(boSec.getManagerid());
			}
			cv = sv.queryCustomerByCustId(iboCmGrpCustomerAudit.getCustId());
			if (CmCommonUtil.isNotEmptyObject(cv)) {
				iboCmGrpCustomerAudit.initProperty("CUST_NAME", cv.getCustName());
			}
			auditList.add(iboCmGrpCustomerAudit);
		}
		return (IBOCmGroupCustomerAuditValue[]) auditList.toArray(new IBOCmGroupCustomerAuditValue[0]);
	}

	public void saveGroupMember(IBOCmGroupMemberValue[] groupMemberValues, int operType) throws Exception {
		int len = 0;
		if (groupMemberValues == null || groupMemberValues.length < 1) {
			return;
		}
		len = groupMemberValues.length;
		IVOCustValue custValue = new VOCustBean();
		ICustRelationshipValue[] custRelValues = new ICustRelationshipValue[len];
		ICustRelationshipValue custRelValue = null;
		for (int i = 0; i < len; i++) {
			custRelValue = new CustRelationshipBean();
			custRelValue.copy(groupMemberValues[i]);
			custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			if (operType == 1) {
				custRelValue.setStsToNew();
			} else if (operType == 2) {
				custRelValue.setStsToOld();
			} else {
				custRelValue.delete();
			}
			custRelValues[i] = custRelValue;
		}
		custValue.addCustRels(custRelValues);
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);

	}

	public long saveGroupOrganize(ICustOrganizeValue groupOrgStructValue, int operType) throws Exception {
		if (groupOrgStructValue == null) {
			return -1;
		}
		IVOCustValue custValue = new VOCustBean();
		if (operType == 1) {
			long parentDetpId = groupOrgStructValue.getParentDeptId();
			if (parentDetpId <= 0) {
				ExceptionUtil.throwBusinessException("CMS0000241");// 父部门编号不能为空！
			}
			if (groupOrgStructValue.getCustId() <= 0) {
				ExceptionUtil.throwBusinessException("CMS0000244");// 部门归属集团客户编号不能为空！
			} else {
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(groupOrgStructValue.getCustId());
				if (customerValue == null) {
					ExceptionUtil.throwBusinessException("CMS0000245");// 部门归属集团客户不存在！
				}
			}
			ICustOrganizeValue tempOrganizeValue = queryGroupOrganizeByDeptId(parentDetpId);
			// 根节点部门的父部门编号为归属集团客户编号
			if (tempOrganizeValue == null && groupOrgStructValue.getCustId() != parentDetpId) {
				ExceptionUtil.throwBusinessException("CMS0000242");// 归属的父部门不存在！
			} else {
				if (tempOrganizeValue != null && tempOrganizeValue.getCustId() != groupOrgStructValue.getCustId()) {
					ExceptionUtil.throwBusinessException("CMS0000243");// 该部门的客户编号与归属父部门的归属客户编号不相同！
				}
			}
			checkDuplicationDeptName(groupOrgStructValue);
			groupOrgStructValue.setStsToNew();
		} else if (operType == 2) {
			ICustOrganizeValue value = queryGroupOrganizeByDeptId(groupOrgStructValue.getParentDeptId());
			if (value == null) {
				ExceptionUtil.throwBusinessException("CMS0000242");// 归属的父部门不存在！
			}
			ICustOrganizeValue tempOrganizeValue = queryGroupOrganizeByDeptId(groupOrgStructValue.getDeptId());
			if (tempOrganizeValue != null && tempOrganizeValue.getCustId() != groupOrgStructValue.getCustId()) {
				ExceptionUtil.throwBusinessException("CMS0000240");// 部门归属的集团客户编号不能修改！
			}
			// 校验客户编号与部门编号是否匹配
			checkGroupAndDeptMatch(groupOrgStructValue);
			// 校验部门名称不能重复
			checkDuplicationDeptName(groupOrgStructValue);
		} else {
			ICustOrganizeValue[] values = queryGroupOrganizesById(groupOrgStructValue.getCustId(), groupOrgStructValue.getDeptId(), -1, -1);
			if (values != null && values.length > 0) {
				ExceptionUtil.throwBusinessException("CMS0090229");// 该部门存在子部门，不能直接删除；
			}
			// 校验客户编号与部门编号是否匹配
			checkGroupAndDeptMatch(groupOrgStructValue);
			groupOrgStructValue.delete();
		}
		custValue.addCustOrganize(groupOrgStructValue);
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		return groupOrgStructValue.getDeptId();
	}

	private boolean checkGroupAndDeptMatch(ICustOrganizeValue groupOrgStructValue) throws Exception {
		if (groupOrgStructValue != null) {
			long custId = groupOrgStructValue.getCustId();
			long deptId = groupOrgStructValue.getDeptId();
			if (custId > 0 && deptId > 0) {
				AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
				DataContainer dContainer = new DataContainer();
				dContainer.set(ICustOrganizeValue.S_CustId, custId);
				dContainer.set(ICustOrganizeValue.S_DeptId, deptId);
				ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
				if (values != null && values.length > 0) {
					return true;
				}
			}
		}
		ExceptionUtil.throwBusinessException("CMS0000149");// 客户编号与部门编号不匹配
		return false;
	}

	private boolean checkDuplicationDeptName(ICustOrganizeValue groupOrgStructValue) throws Exception {
		if (groupOrgStructValue != null) {
			long custId = groupOrgStructValue.getCustId();
			String deptName = groupOrgStructValue.getDeptName();
			if (custId > 0 && StringUtils.isNotBlank(deptName)) {
				AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
				DataContainer dContainer = new DataContainer();
				dContainer.set(ICustOrganizeValue.S_DeptName, deptName);
				dContainer.set(ICustOrganizeValue.S_CustId, custId);
				ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
				if (values != null && values.length > 0) {
					for (int i = 0; i < values.length; i++) {
						if (values[i].getDeptId() != groupOrgStructValue.getDeptId() && values[i].getDeptName().equalsIgnoreCase(groupOrgStructValue.getDeptName())) {
							ExceptionUtil.throwBusinessException("CMS0000246");// 部门名称不能相同！
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public ICustOrganizeValue queryGroupOrganizeByDeptId(long deptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_DeptId, deptId);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values != null && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public ICustOrganizeValue[] queryGroupOrganizesById(long groupCustId, long parentDeptId, int start, int end) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, groupCustId);
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		return values;
	}

	public int queryGroupOrganizesCountById(long groupCustId, long parentDeptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, groupCustId);
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		int count = busi.queryCount(new DataContainer[] { dContainer });
		return count;
	}

	public ICustOrganizeValue[] queryGroupTopOrganize(long groupCustId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, groupCustId);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values == null) {
			return new ICustOrganizeValue[0];
		}
		return values;
	}

	public IBOCmGroupSegmentAttrRelaValue[] queryGroupSegmentAttrRelaValues(long custId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupSegmentAttrRelaValue.S_CustId).append(" = :custId ");
		parameterMap.put("custId", Long.valueOf(custId));
		return (IBOCmGroupSegmentAttrRelaValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupSegmentAttrRelaBean.class, condition.toString(), parameterMap, -1, -1);
	}

	public IBOCmSegmentAttrValue querySegmentAttrById(long segmentAttrId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmSegmentAttrValue.S_SegmentAttrId).append(" = :segmentAttrId ");
		parameterMap.put("custId", Long.valueOf(segmentAttrId));
		DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmSegmentAttrBean.class, condition.toString(), parameterMap, -1, -1);
		if (results != null && results.length > 0) {
			IBOCmSegmentAttrValue segmentAttrValue = new BOCmSegmentAttrBean();
			segmentAttrValue.copy(results[0]);
			return segmentAttrValue;
		}
		return null;
	}

	public IQBOCmGroupSegmentValue[] queryGroupSegments(long custId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IQBOCmGroupSegmentValue.S_CustId).append(" = :custId ");
		parameterMap.put("custId", Long.valueOf(custId));
		return (IQBOCmGroupSegmentValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmGroupSegmentBean.class, condition.toString(), parameterMap, -1, -1);
	}

	public IBOCmSegmentAttrValue[] querySegmentAttrValuesByCustType(int custType) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmSegmentAttrValue.S_CustType).append(" = :custType ");
		parameterMap.put("custType", Integer.valueOf(custType));
		DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmSegmentAttrBean.class, condition.toString(), parameterMap, -1, -1);
		if (results == null || results.length == 0) {
			return new IBOCmSegmentAttrValue[0];
		}
		return (IBOCmSegmentAttrValue[]) results;
	}

	public void saveGroupSegmentAttrRela(IBOCmGroupSegmentAttrRelaValue groupSegmentAttrRelaValue) throws Exception {
		if (groupSegmentAttrRelaValue != null) {
			BOCmGroupSegmentAttrRelaBean result = new BOCmGroupSegmentAttrRelaBean();
			result.copy(groupSegmentAttrRelaValue);
			if (result.getRelaId() <= 0) {
				long newId = CmCommonUtil.getNewSequence(BOCmGroupSegmentAttrRelaBean.class);
				result.setRelaId(newId);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(result);
		}
	}

	public IBOCmGroupCustAttrValue[] queryGroupCustAttrsByGroupId(long groupCustId) throws Exception {
		ICmGroupCustAttrDAO attrDAO = (ICmGroupCustAttrDAO) ServiceFactory.getService(ICmGroupCustAttrDAO.class);
		return attrDAO.queryGroupCustAttrsByGroupId(groupCustId);
	}

	public void saveGroupCustAttr(IBOCmGroupCustAttrValue cmGroupCustAttr) throws Exception {
		ICmGroupCustAttrDAO attrDAO = (ICmGroupCustAttrDAO) ServiceFactory.getService(ICmGroupCustAttrDAO.class);
		attrDAO.saveGroupCustAttr(cmGroupCustAttr);
	}

	public void saveGroupCustAttr(IBOCmGroupCustAttrValue[] cmGroupCustAttrs) throws Exception {
		ICmGroupCustAttrDAO attrDAO = (ICmGroupCustAttrDAO) ServiceFactory.getService(ICmGroupCustAttrDAO.class);
		attrDAO.saveGroupCustAttr(cmGroupCustAttrs);
	}

	public IBOCmGroupCustAttrValue queryGroupCustAttr(long custId, String attrCode) throws Exception {
		ICmGroupCustAttrDAO attrDAO = (ICmGroupCustAttrDAO) ServiceFactory.getService(ICmGroupCustAttrDAO.class);
		return attrDAO.queryGroupCustAttr(custId, attrCode);
	}

	public IBOCmGroupSegmentAttrRelaValue queryGroupSegmentAttrRela(long custId, long segmentAttrId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupSegmentAttrRelaValue.S_CustId).append(" = :custId ");
		parameterMap.put("custId", Long.valueOf(custId));
		condition.append(" AND ");
		condition = condition.append(IBOCmGroupSegmentAttrRelaValue.S_SegmentAttrId).append(" = :segmentAttrId ");
		parameterMap.put("segmentAttrId", Long.valueOf(segmentAttrId));
		DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupSegmentAttrRelaBean.class, condition.toString(), parameterMap, -1, -1);
		if (results != null && results.length > 0) {
			IBOCmGroupSegmentAttrRelaValue relaValue = new BOCmGroupSegmentAttrRelaBean();
			relaValue.copy(results[0]);
			return relaValue;
		}
		return null;
	}

	public Map queryGroupInheritableSegment(long custId, List segments, Map result) throws Exception {
		if (result == null) {
			result = new HashMap();
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 先查询该集团的组织结构信息
		ICustOrganizeValue organizeValue = customerSV.queryCustOrganizesByrelCustId(custId);
		if (organizeValue == null) {
			return result;
		}
		// 获取父级客户（过滤掉父部门）
		ICustOrganizeValue parentOrganize = customerSV.queryCustOrganizeById(organizeValue.getParentDeptId());
		if (parentOrganize == null) {
			return result;
		}
		long parentGroupCustId = parentOrganize.getRelCustId();
		while (parentGroupCustId <= 0) {
			parentOrganize = customerSV.queryCustOrganizeById(organizeValue.getParentDeptId());
		}
		// 根据父客户编号查询细分，判断是否可继承
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IQBOCmGroupSegmentValue[] segmentAttrRelaValues = groupCustomerSV.queryGroupSegments(parentGroupCustId);
		if (segmentAttrRelaValues == null || segmentAttrRelaValues.length == 0) {
			return result;
		}

		for (int i = 0; i < segments.size(); i++) {
			for (int j = 0; j < segmentAttrRelaValues.length; j++) {
				String segmentField = StringUtils.isBlank(segmentAttrRelaValues[j].getAttrituteName()) ? segmentAttrRelaValues[j].getColumnName() : segmentAttrRelaValues[j]
						.getAttrituteName();
				// 可以继承
				if (((String) segments.get(i)).equalsIgnoreCase(segmentField) && segmentAttrRelaValues[j].getIsInheritable() > 0) {
					// 保存细分值，在细分list中删除已经比对过的细分
					result.put(segmentField, null);
					segments.remove(i);
				}
			}
		}
		// 给result的map中的需要继承的细分字段赋值
		if (result != null) {
			IBOCmGroupCustAttrValue groupAttrValue = null;
			Iterator iterator = result.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Entry) iterator.next();
				if (StringUtils.isBlank((String) entry.getValue())) {
					groupAttrValue = groupCustomerSV.queryGroupCustAttr(parentGroupCustId, (String) entry.getKey());
					if (groupAttrValue != null) {
						result.put((String) entry.getKey(), groupAttrValue.getAttrValue());
					}
				}
			}
		}
		// 如果需要查询的sementList不为空，递归调用
		if (!segments.isEmpty()) {
			queryGroupInheritableSegment(parentGroupCustId, segments, result);
		}
		return result;
	}

	/**
	 * 保存集团客户的行业
	 * @param cmGroupRelIndustry
	 * @throws Exception
	 */
	public void saveGroupRelIndustry(IBOCmGroupRelIndustryValue[] cmGroupRelIndustry) throws Exception {
		ICmGroupCustAttrDAO custDAO = (ICmGroupCustAttrDAO) ServiceFactory.getService(ICmGroupCustAttrDAO.class);
		ICmCustomerSV cmCustSv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		custDAO.saveGroupRelIndustry(cmGroupRelIndustry);
		// 记录接触日志
		ICustomerValue customerValue = null;
		String custName = "";
		try {
			// customerValue = (ICustomerValue) ((AbstractCustomerQueryBusiModelImpl)
			// CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryCustomerByCustId(
			// cmGroupRelIndustry[0].getCustId(), CmConstants.RecordState.USE);
			// customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(cmGroupRelIndustry[0].getCustId(),
			// CmConstants.RecordState.USE);
			customerValue = cmCustSv.queryDKCustomer(cmGroupRelIndustry[0].getCustId());
			custName = customerValue.getCustName();
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			if (log.isErrorEnabled()) {
				log.error(e.getMessage());
			}
		} finally {
			ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
			for (int i = 0; i < cmGroupRelIndustry.length; i++) {
				// 接触记录类型
				long busiId = 0;
				if (cmGroupRelIndustry[i].isNew()) {
					busiId = CmBusinessOperation.CM_CUST_INDUSTRY_NEW;
				} else if (cmGroupRelIndustry[i].isModified()) {
					busiId = CmBusinessOperation.CM_CUST_INDUSTRY_MOD;
				} else {
					busiId = CmBusinessOperation.CM_CUST_INDUSTRY_DEL;
				}
				// 历史变更信息记录
				BOCmHisRecordBean recordBean = sv.convertHisRecord(new DataStructInterface[] { cmGroupRelIndustry[i] }, CmConstants.HisRecordType.INDUSTRY, custName,
						DataType.getAsLong(cmGroupRelIndustry[i].getCustId()));
				// 变更信息
				String oldValue = (String) CacheFactory.get(CmIndustryCacheImpl.class, DataType.getAsString(cmGroupRelIndustry[i].getOldObj("INDUSTRY_ID")));
				if (CmCommonUtil.isEmptyObj(oldValue)) {
					oldValue = "";
				}
				String newValue = (String) CacheFactory.get(CmIndustryCacheImpl.class, cmGroupRelIndustry[i].getIndustryId());
				if (CmCommonUtil.isEmptyObj(newValue)) {
					newValue = "";
				}
				if (!oldValue.equalsIgnoreCase(newValue)) {
					recordBean.setSimpleRecord("Industry : " + oldValue + "->" + newValue);
					recordBean.setDetailRecord1("Industry : " + oldValue + "->" + newValue);
					sv.saveHisRecord(recordBean);
					String[] info = new String[] { "Old_Industry:" + oldValue, "New_Industry:" + newValue };
					// 记录交互接触记录
					CmRecordLog.saveRecord(busiId, cmGroupRelIndustry[i].getCustId(), info);
				}
			}
		}
	}

	/**
	 * 查询集团客户的行业
	 */
	public IBOCmGroupRelIndustryValue queryIndustry(long relId) throws Exception {
		if (relId > 0) {
			StringBuilder condition = new StringBuilder();
			HashMap paraMap = new HashMap();
			condition.append(IBOCmGroupRelIndustryValue.S_RelId).append(" = :relId ");
			paraMap.put("relId", relId);
			DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupRelIndustryBean.class, condition.toString(), paraMap, -1, -1);
			return (IBOCmGroupRelIndustryValue) dcs[0];
		}
		return null;
	}

	/**
	 * 根据细分&邮编查询对应的客户经理组ID
	 * @param segmentId
	 * @param zipCode
	 * @return
	 * @throws Exception
	 */
	public IBOCmSegMgrGroupRelValue queryOrgIdBySegmentZipCode(long segmentId, long zipCode) throws Exception {
		IBOCmSegMgrGroupRelValue value = null;
		// 如果细分为MA需要关联zipCode查询
		// if (CmConstants.segment.MA.equals(DataType.getAsString(segmentId))) {
		// //modify by zhuyy @2015-7-21 需求变更 Telenor_REQ_20150717_0045
		// // paraMap.put("zipCode", zipCode);
		// // groupCode = (String) CacheFactory.get(CmSegmentManagerCacheImpl.class, segmentId +
		// CmSegmentManagerCacheImpl.SPLIT_CODE + zipCode);
		// } else {
		// groupCode = (String) CacheFactory.get(CmSegmentManagerCacheImpl.class, segmentId);
		// }
		long groupCode = DataType.getAsLong(CacheFactory.get(CmSegmentManagerCacheImpl.class, segmentId));
		if (groupCode > 0) {
			value = new BOCmSegMgrGroupRelBean();
			// 根据group_code取得orgId
			// IBOSecOrganizeValue orgValue = OrgmodelClient.getSecOrgByOrgCode(groupCode);
			IBOSecGroupValue groupValue = OrgmodelClient.getGroupValueByGroupId(groupCode);
			if (groupValue != null) {
				value.setGroupCode(DataType.getAsString(groupValue.getGroupId()));
				if (CmConstants.segment.SA.equals(DataType.getAsString(segmentId))) {
					// 取得客户经理组的名称
					value.setRemarks(groupValue.getGroupName());// 需要关联zipCOde的做个标记，供后续判断使用！
				}
			} else {
				// 细分与客户经理组映射表配置的GROUP_CODE找不到对应的客户经理组
				ExceptionUtil.throwBusinessException("CMS0030140", "CM_SEG_MGR_GROUP_REL", "GROUP_CODE");
			}
		}
		return value;
	}

	public IBOCmGroupApprovalValue[] queryCmGroupApproval(String xmlCondition, int startIndex, int endIndex) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		String approver = dcs[0].getAsString("APPROVER");
		String approvalStatus = dcs[0].getAsString("APPROVAL_STATUS");
		String startDate = dcs[0].getAsString("START_DATE");
		String endDate = dcs[0].getAsString("END_DATE");
		String custId = dcs[0].getAsString("CUST_ID");
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupApprovalValue.S_Approver).append(" =:approver ");
		parameter.put("approver", approver);
		condition.append(" AND ").append(IBOCmGroupApprovalValue.S_ApprovalStatus).append(" =:status ");
		parameter.put("status", approvalStatus);
		if (StringUtils.isNotBlank(startDate)||StringUtils.isNotBlank(endDate)) {
			if(StringUtils.isNotBlank(startDate)){
				parameter.put("DONE_DATE", Timestamp.valueOf(startDate+" 23:59:59"));
			}else{
				parameter.put("DONE_DATE", Timestamp.valueOf(endDate+" 23:59:59"));
			}
		}else{
			parameter.put("DONE_DATE", ServiceManager.getOpDateTime());
		}
		
		if (StringUtils.isNotBlank(startDate)) {
			condition.append(" AND ").append(IBOCmGroupApprovalValue.S_DoneDate).append(" >= date_format( :startDate ,'%Y-%m-%d %H:%i:%s') ");
			parameter.put("startDate", startDate + " 00:00:00");
		}
		if (StringUtils.isNotBlank(endDate)) {
			condition.append(" AND ").append(IBOCmGroupApprovalValue.S_DoneDate).append(" <= date_format( :endDate ,'%Y-%m-%d %H:%i:%s') ");
			parameter.put("endDate", endDate + " 23:59:59");
		}
		if (StringUtils.isNotBlank(custId)) {
			condition.append(" AND ").append(IBOCmGroupApprovalValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		IBOCmGroupApprovalValue[] values = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, condition.toString(),
				parameter, startIndex, endIndex);
		// 记录业务操作日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.MANAGER_APPROVAL, condition.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			for (int i = 0; i < values.length; i++) {
				String send = "";
				String show = "";
				// 没有审批可以继续审批
				if (values[i].getApprovalResults() == 0) {
					send = "<a href='javascript:void(0)' class='cellpath' onclick='sendToNextApprover(" + values[i].getCustId() + "," + values[i].getApproverId() + ","
							+ values[i].getOpId() + ",\"" + values[i].getTaskId() + "\"," + values[i].getStep() + "," + values[i].getPsType() + ",\"" + values[i].getRegionId()
							+ "\",\"" + values[i].getApprover() + "\"," + values[i].getRootCustId() + "," + values[i].getResource()
							+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS9988835") + "</a>";
					show = "<a href='javascript:void(0)' class='cellpath' onclick='view(\"" + values[i].getWkFlowId()
							+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0012101") + "</a>";
				} else {
					send = "<a href='javascript:void(0)' class='cellpath' onclick='showApproval(" + values[i].getCustId() + "," + values[i].getApproverId() + ","
							+ values[i].getStep() + "," + values[i].getPsType() + ",\"" + values[i].getRegionId()
							+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0012101") + "</a>";
				}
				// 审批完成通过后不在显示审批信息
				values[i].setAction(send + show);
				// 增加客户名称显示信息
				ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue custValue = custSV.queryDKCustomer(values[i].getCustId());
				if (CmCommonUtil.isNotEmptyObject(custValue)) {
					values[i].setCustName(custValue.getCustName());
				}
			}
			return values;
		}
		return new IBOCmGroupApprovalValue[0];
	}

	public void saveGroupApproval(String custId, String currentInfo, String changeInfo, String resource, String psType, int step, String approver, String workFlowId,
			String taskId, String opId, String orgId, String zipCode, String rootCustId, String remarks) throws Exception {
		// 校验是否有重复的审批工单
		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupApprovalValue.S_CustId, custId);
		dc.set(IBOCmGroupApprovalValue.S_ApprovalStatus, "1");
		dc.set(IBOCmGroupApprovalValue.S_DoneDate, ServiceManager.getOpDateTime());
		IBOCmGroupApprovalValue[] groupApprovalValues = queryCmGroupApproval(dc);
		if (groupApprovalValues != null && groupApprovalValues.length > 0) {
			return;
		}
		
		BOCmGroupApprovalBean bean = new BOCmGroupApprovalBean();
		bean.setCustId(Long.parseLong(custId));
		bean.setCurrentInfo(currentInfo);
		bean.setApplyChangeInfo(changeInfo);
		bean.setResource(Long.parseLong(resource));
		bean.setPsType(Long.parseLong(psType));
		// 设置审批状态为待审批
		bean.setApprovalStatus(CmConstants.ApprovalStatus.WaitForApproval);
		bean.setApproverId(CmCommonUtil.getNewSequence(BOCmGroupApprovalBean.class));
		bean.setState(CmConstants.RecordState.USE);
		bean.setStep(step);
		bean.setApprover(approver);
		bean.setWkFlowId(workFlowId);
		bean.setOpId(Long.parseLong(opId));
		bean.setOrgId(Long.parseLong(orgId));
		bean.setTaskId(taskId);
		bean.setRootCustId(Long.parseLong(rootCustId));
		// 由于集团客户经理审批不需要zipCode,流程中会默认塞1，此处用于过滤
		if (!zipCode.equals("1")) {
			bean.setRegionId(zipCode);
		}
		bean.setApprovalDate(ServiceManager.getOpDateTime());
		// 将细分修改界面输入的备注存在workflowname
		if (StringUtils.isNotBlank(remarks)) {
			bean.setWkFlowName(remarks);
		}
		// 记录操作日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonBusiLog(CmConstants.BusiLogId.MANAGER_APPROVAL, new DataStructInterface[] { bean }, CmConstants.BusiLogType.CUSTOMER_LOG, Long.parseLong(custId));
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		// 提醒第一审批人
		if ((bean.getPsType() == CmConstants.PsType.segementChange && bean.getStep() == 1) || bean.getPsType() == CmConstants.PsType.custTSMChange) {
			// 通知提交人
			IBORemindValue remindValue = new BORemindBean();
			remindValue.setRemindTitle(CrmLocaleFactory.getResource("CMS9998746"));
			// 你有需要审批的单子
			remindValue.setRemindContent(("apply for change sgement for customer[") + bean.getCustId() + ("],please Approval"));
			remindValue.setRemindStaffCode(approver);
			remindValue.setRevisorId(CmCommonUtil.getDefaultUser().getID());
			commonSV.cmPushMessage(new IBORemindValue[] { remindValue });
		} else if (bean.getPsType() == CmConstants.PsType.custManagerChange && bean.getStep() == 1) {
			// 通知提交人
			IBORemindValue remindValue = new BORemindBean();
			remindValue.setRemindTitle(CrmLocaleFactory.getResource("CMS9998747"));
			// 你有需要审批的单子
			remindValue.setRemindContent(("apply for change manager for customer[") + bean.getCustId() + ("],please Approval"));
			remindValue.setRemindStaffCode(approver);
			remindValue.setRevisorId(CmCommonUtil.getDefaultUser().getID());
			commonSV.cmPushMessage(new IBORemindValue[] { remindValue });
		}
	}

	public IBOCmGroupApprovalValue queryGroupApprovalById(long approverId) throws Exception {
		if (approverId > 0) {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap parameter = new HashMap();
			condition.append(" AND ").append(IBOCmGroupApprovalValue.S_ApproverId).append(" =:approverId ");
			parameter.put("approverId", approverId);
			parameter.put("DONE_DATE", ServiceManager.getOpDateTime());
			IBOCmGroupApprovalValue[] values = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, condition.toString(),
					parameter, -1, -1);
			if (null != values && values.length > 0) {
				long kobNumberLocal = DataType.getAsLong(values[0].get("APPLY_CHANGE_INFO"));
				values[0].setDiaplayAttr("APPLY_CHANGE_INFO", "APPLY_CHANGE_INFO_NAME", kobNumberLocal);
				return values[0];
			}
		}
		return null;
	}

	public void saveGroupApproval(IBOCmGroupApprovalValue value) throws Exception {
		BOCmGroupApprovalBean bean = new BOCmGroupApprovalBean();
		bean.copy(value);
		bean.setApprovalDate(ServiceManager.getOpDateTime());
		bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public void saveManager(long custId, long managerId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupManagerValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmGroupManagerValue.S_RelType).append(" =:relType ");
		parameter.put("relType", 1);
		condition.append(" AND ").append(IBOCmGroupManagerValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.USE);
		IBOCmGroupManagerValue[] values = (IBOCmGroupManagerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupManagerBean.class, condition.toString(), parameter,
				-1, -1);
		BOCmGroupManagerBean bean = new BOCmGroupManagerBean();
		ICmBusiLogSV cmBusiLogSV = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			// 属于修改
			if (StringUtils.isNotBlank(values[0].getRemarks())) {
				values[0].setRemarks("");
			}
			values[0].setManagerId(managerId);
			bean.copy(values[0]);
			// 记录客户经理变更日志
			cmBusiLogSV.saveCustMgrChangeHistory(bean);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		} else {
			// 新增
			bean.setRelId(CmCommonUtil.getNewSequence(BOCmGroupManagerBean.class));
			bean.setCustId(custId);
			bean.setManagerId(managerId);
			bean.setOperType(0);
			bean.setRelType(1);
			bean.setState(CmConstants.RecordState.USE);
			bean.setRegionId(CmCommonUtil.getDefaultRegionId());
			// 记录客户经理变更日志
			cmBusiLogSV.saveCustMgrChangeHistory(bean);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}
	}

	public void CmStartGroupSegmentWorkFlow(IBOCmGroupApprovalValue value, String firstTSM, String secondTSM, String zipCode, String remarks) throws Exception {
		System.setProperty(Constant.S_COMFRAME_DEV_NAME, "CM_01");
		String templateTag = "com.asiainfo.crm.cm.vm.DealGroupCustSegment";
		HashMap aVars = new HashMap();
		aVars.put("custId", String.valueOf(value.getCustId()));
		aVars.put("currentInfo", value.getCurrentInfo());
		aVars.put("changeInfo", value.getApplyChangeInfo());
		aVars.put("resource", String.valueOf(value.getResource()));
		aVars.put("psType", String.valueOf(value.getPsType()));
		aVars.put("firstTSM", firstTSM);
		aVars.put("secondTSM", secondTSM);
		aVars.put("opId", String.valueOf(value.getOpId()));
		aVars.put("orgId", String.valueOf(value.getOrgId()));
		aVars.put("zipCode", zipCode);
		aVars.put("rootCustId", String.valueOf(value.getRootCustId()));
		aVars.put("remarks", remarks);

		ComframeClient.createWorkflow(templateTag, String.valueOf(value.getOpId()), "", "", aVars, null, "");
	}

	public long queryManagerId(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupManagerValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmGroupManagerValue[] values = (IBOCmGroupManagerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupManagerBean.class, condition.toString(), parameter,
				-1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0].getManagerId();
		}
		return 0;
	}

	public IBOCmGroupApprovalValue queryApprovalById(long approverId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupApprovalValue.S_ApproverId).append(" =:approverId ");
		parameter.put("approverId", approverId);
		parameter.put("DONE_DATE", ServiceManager.getOpDateTime());
		IBOCmGroupApprovalValue[] values = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}

	public void CmStartGroupManagerWorkFlow(IBOCmGroupApprovalValue value) throws Exception {
		System.setProperty(Constant.S_COMFRAME_DEV_NAME, "CM_02");
		String templateTag = "com.asiainfo.crm.cm.vm.DealGroupManager";
		HashMap aVars = new HashMap();
		aVars.put("custId", String.valueOf(value.getCustId()));
		aVars.put("currentInfo", value.getCurrentInfo());
		aVars.put("changeInfo", value.getApplyChangeInfo());
		aVars.put("resource", String.valueOf(value.getResource()));
		aVars.put("psType", String.valueOf(value.getPsType()));
		aVars.put("approver", value.getApprover());
		aVars.put("opId", String.valueOf(value.getOpId()));
		aVars.put("orgId", String.valueOf(value.getOrgId()));
		if (value.getRootCustId() > 0) {
			aVars.put("rootCustId", String.valueOf(value.getRootCustId()));
		} else {
			aVars.put("rootCustId", "");
		}
		aVars.put("remarks", value.getRemarks());
		if (value.getPsType() == 4) {
			aVars.put("zipCode", value.getWkFlowName());
		} else {
			aVars.put("zipCode", "1");
		}

		ComframeClient.createWorkflow(templateTag, String.valueOf(value.getOpId()), "", "", aVars, null, "");
	}

	public void dealGroupCustApproval(IBOCmGroupApprovalValue value) throws Exception {
		// 判断该节点是否还有未提交的审批
		long approverId = value.getApproverId();
		long rootCustId = value.getRootCustId();
		if (value.getPsType() == CmConstants.PsType.segementChange) {
			if (validateApproval(rootCustId, approverId, value.getPsType())) {
				ExceptionUtil.throwBusinessException("CMS9988866");
			}
		} else {
			if (validateApproval(value.getCustId(), approverId, value.getPsType())) {
				ExceptionUtil.throwBusinessException("CMS9988866");
			}
		}
		IBOCmGroupApprovalValue bean = new BOCmGroupApprovalBean();
		bean.initProperty("APPROVER_ID", value.getApproverId());
		bean.setApprovalResults(value.getApprovalResults());
		bean.setApprovalStatus(value.getApprovalStatus());
		bean.setApprovalDetail(value.getApprovalDetail());
		// 调用接口保存集团审批信息
		saveGroupApproval(bean);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		// 只有审批通过才调用comframe的接口走下一个审批
		if (value.getApprovalResults() == 1 && value.getPsType() == CmConstants.PsType.segementChange) {
			List<IBORemindValue> list = new ArrayList<IBORemindValue>();
			// 通知提交人
			IBORemindValue remindValue = new BORemindBean();
			remindValue.setRemindTitle(CrmLocaleFactory.getResource("CMS9998746"));
			// 你提交第一步审批已通过
			remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998754"));
			remindValue.setRemindStaffCode(String.valueOf(value.getOpId()));
			remindValue.setRevisorId(CmCommonUtil.getDefaultUser().getID());
			list.add(remindValue);
			// 通知下一审批人
			IBORemindValue remindValueB = new BORemindBean();
			remindValueB.setRemindTitle(CrmLocaleFactory.getResource("CMS9998746"));
			// 你有需要审批的单子
			remindValueB.setRemindContent(("apply for change sgement for customer[") + value.getCustId() + ("],please Approval"));
			Map vars = ComframeClient.getWorkflowVars(value.getWkFlowId());
			if (null != vars && vars.size() > 0) {
				remindValueB.setRemindStaffCode(DataType.getAsString(vars.get("secondTSM")));
				remindValueB.setRevisorId(CmCommonUtil.getDefaultUser().getID());
				list.add(remindValueB);
				commonSV.cmPushMessage(list.toArray(new IBORemindValue[0]));
			}
			ComframeClient.finishUserTask(value.getTaskId(), String.valueOf(value.getOpId()), "", "", null);
		} else if (value.getApprovalResults() == 2 && value.getPsType() == CmConstants.PsType.segementChange) {
			// 通知提交人
			IBORemindValue remindValue = new BORemindBean();
			remindValue.setRemindTitle(CrmLocaleFactory.getResource("CMS9998746"));
			// 你提交的审批未通过
			remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998748"));
			remindValue.setRemindStaffCode(String.valueOf(value.getOpId()));
			remindValue.setRevisorId(CmCommonUtil.getDefaultUser().getID());
			commonSV.cmPushMessage(new IBORemindValue[] { remindValue });
		}
		if (value.getPsType() == CmConstants.PsType.custManagerChange) {
			// 通知提交人
			IBORemindValue remindValue = new BORemindBean();
			remindValue.setRemindTitle(CrmLocaleFactory.getResource("CMS9998747"));
			remindValue.setRemindStaffCode(String.valueOf(value.getOpId()));
			remindValue.setRevisorId(CmCommonUtil.getDefaultUser().getID());
			if (value.getApprovalResults() == 1) {
				dealGroupManager(value.getCustId(), value.getRootCustId(), Long.parseLong(value.getApplyChangeInfo()));
				// 审批通过
				remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998749"));
			} else {
				// 审批未通过
				remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998748"));
			}
			commonSV.cmPushMessage(new IBORemindValue[] { remindValue });
			ComframeClient.finishUserTask(value.getTaskId(), String.valueOf(value.getOpId()), "", "", null);
		}
		// KOB变更审批
		if (value.getPsType() == CmConstants.PsType.custKobChange) {
			if (value.getApprovalResults() == 1) {

				saveKobCustInfo(value.getApplyChangeInfo(), value.getCustId());

			}
			ComframeClient.finishUserTask(value.getTaskId(), String.valueOf(value.getOpId()), "", "", null);
		}
	}

	public void dealGroupCustApprovalNext(IBOCmGroupApprovalValue value, long custId, long groupCode) throws Exception {
		// 保存审批信息
		IBOCmGroupApprovalValue appValue = new BOCmGroupApprovalBean();
		appValue.initProperty("APPROVER_ID", value.getApproverId());
		appValue.setApprovalResults(value.getApprovalResults());
		appValue.setApprovalStatus(value.getApprovalStatus());
		appValue.setApprovalDetail(value.getApprovalDetail());
		saveGroupApproval(appValue);
		IBORemindValue remindValue = new BORemindBean();
		remindValue.setRemindTitle(CrmLocaleFactory.getResource("CMS9998746"));
		remindValue.setRemindStaffCode(DataType.getAsString(value.getOpId()));
		remindValue.setRevisorId(CmCommonUtil.getDefaultUser().getID());
		// 只是针对两步审批的情况
		// 只有审批通过才调用comframe的接口走下一个审批
		if (value.getApprovalResults() == 1) {
			saveGroupSegmentRelaInfo(value.getRootCustId(), custId, Long.parseLong(value.getApplyChangeInfo()), value.getResource(), groupCode);
			// 通知客户审批通过
			if (value.getPsType() == CmConstants.PsType.segementChange) {
				remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998755"));
			} else if (value.getPsType() == CmConstants.PsType.custTSMChange) {
				remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998749"));
			}
		} else {
			// 通知客户审批未通过
			if (value.getPsType() == CmConstants.PsType.segementChange || value.getPsType() == CmConstants.PsType.custTSMChange) {
				remindValue.setRemindContent(CrmLocaleFactory.getResource("CMS9998748"));
			}
		}
		if (value.getPsType() == CmConstants.PsType.segementChange || value.getPsType() == CmConstants.PsType.custTSMChange) {
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.cmPushMessage(new IBORemindValue[] { remindValue });
		}
		// 调用方法走完流程
		ComframeClient.finishUserTask(value.getTaskId(), String.valueOf(value.getOpId()), "", "", null);
	}

	public IBOCmSegMgrGroupRelValue querySegMgrGroupRelByGroupCode(String groupCode) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap paraMap = new HashMap();
		// 如果细分为MA需要关联zipCode查询
		if (StringUtils.isNotBlank(groupCode)) {
			condition.append(" AND ");
			condition.append(IBOCmSegMgrGroupRelValue.S_GroupCode).append(" = :groupCode ");
			paraMap.put("groupCode", groupCode);
		}
		condition.append(" AND ");
		condition.append(IBOCmSegMgrGroupRelValue.S_State).append(" = :state ");
		paraMap.put("state", CmxConstants.RECORD_STATE_USE);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmSegMgrGroupRelBean.class, condition.toString(), paraMap, -1, -1);
		IBOCmSegMgrGroupRelValue value = null;
		if (dcs != null && dcs.length > 0) {
			value = (IBOCmSegMgrGroupRelValue) dcs[0];
		}
		return value;
	}

	public IBOCmGroupOrgStructValue queryGroupOrgStructByRelCustId(String custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_RelCustId).append(" =:relCustId ");
		parameter.put("relCustId", custId);
		IBOCmGroupOrgStructValue[] values = (IBOCmGroupOrgStructValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupOrgStructBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}

	public ICustomerValue queryGroupCustomerByCVR(String cvr) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_TaxId).append(" =:cvr ");
		parameter.put("cvr", cvr);
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_LegalForm).append(" not like :legalForm");
		parameter.put("legalForm", "FIL%");
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_LegalForm).append(" not like :legalFormB");
		parameter.put("legalFormB", "SEE%");
		IBOLnCmxGroupCustValue[] cmxValues = (IBOLnCmxGroupCustValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmxGroupCustBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmxValues)) {
			long custId = cmxValues[0].getCustId();
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue value = service.queryCustomerByCustId(custId);
			return value;
		}
		return null;
	}

	public IBOCmGroupCustomerValue queryGroupcustomerByKOB(String kob) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupCustomerValue.S_CustCertCode).append(" =:kob ");
		parameter.put("kob", kob);
		condition.append(" AND ").append(IBOCmGroupCustomerValue.S_CustCertType).append(" =:certType ");
		parameter.put("certType", CmConstants.CustIdenType.KOB);
		IBOCmGroupCustomerValue[] values = (IBOCmGroupCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(
				com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerBean.class, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}

	public IBOCmGroupManagerValue[] getSAOrMAManagerInfo(String custId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		HashMap paraMap = new HashMap();
		condition.append(" and ").append(IBOCmGroupManagerValue.S_CustId).append(" =:custId");
		paraMap.put("custId", custId);
		IBOCmGroupManagerValue[] cmGrpManager = BOCmGroupManagerEngine.getBeans(null, condition.toString(), paraMap, start, end, true);
		if (null != cmGrpManager && cmGrpManager.length > 0) {
			return cmGrpManager;
		}
		return new IBOCmGroupManagerValue[0];
	}

	/**
	 * 根据KOBNumber查询CustId
	 * @param kobNumber
	 * @return
	 * @throws Exception
	 */
	public ICustomerValue queryCustomerByKobNumber(String kobNumber) throws Exception {
		ICustomerValue customerData = null;
		DataContainer dc = new DataContainer();
		dc.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
		dc.set(ICustomerValue.S_CustCertCode, kobNumber);
		dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);

		// 直接使用客户综合查询即可！
		ICustomerValue[] customerValues = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class))
				.queryData(new DataContainer[] { dc }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(customerValues)) {
			return customerValues[0];
		}

		return customerData;
	}

	public IVOCustValue queryCustValueByCVR(String cvr) throws Exception {
		IVOCustValue custValue = null;
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_TaxId).append(" =:cvr ");
		parameter.put("cvr", cvr);
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_LegalForm).append(" not like :legalForm");
		parameter.put("legalForm", "FIL%");
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_LegalForm).append(" not like :legalFormB");
		parameter.put("legalFormB", "SEE%");
		IBOLnCmxGroupCustValue[] cmxValues = (IBOLnCmxGroupCustValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmxGroupCustBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmxValues)) {
			custValue = new VOCustBean();
			custValue.setUserObject("cmxGrpCust", cmxValues[0]);// 设置集团扩展信息
			long custId = cmxValues[0].getCustId();
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue value = service.queryCustomerByCustId(custId);
			custValue.setCustomer(value);
		}
		return custValue;
	}

	public int queryCmGroupApprovalCount(String xmlCondition) throws Exception {
		return queryCmGroupApproval(xmlCondition, -1, -1).length;
	}

	@Override
	public boolean queryGroupAccess(long custId) throws Exception {
		// 判断当前操作原是否是集团超级管理员
		long opId = ServiceManager.getUser().getID();
		boolean secFlag = SecframeClient.checkEntityPermission(opId, CmConstants.controlOperateB2B.ent_id, CmConstants.controlOperateB2B.priv_id);
		boolean secFlagB = SecframeClient.checkEntityPermission(opId, CmConstants.controlOnlyCanViewOperator.ent_id, CmConstants.controlOnlyCanViewOperator.priv_id);
		boolean secFlagC = SecframeClient.checkEntityPermission(opId, CmConstants.controlViewAndModifyOperator.ent_id, CmConstants.controlViewAndModifyOperator.priv_id);
		if (secFlag || secFlagB || secFlagC) {
			return true;
		}
		// 判断当前操作原是否是该客户的客户经理
		// 根据custId获取客户细分
		ICmCustomerSV custService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custService.queryCustomerMaskByCustId(custId);
		ICmGroupCustomerSV groupCustomerService = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		String groupSegmentId = custValue.getGroupSegmentId();
		if (groupSegmentId.equals("LA") || groupSegmentId.equals("PA") || groupSegmentId.equals("KA") || groupSegmentId.equals("MA")) {
			// 获取客户经理信息
			IBOCmGroupManagerValue[] gropupManagerValue = groupCustomerService.getSAOrMAManagerInfo(String.valueOf(custId), -1, -1);
			// 如果找到与当前操作员id匹配的客户经理的Id则成功返回结束循环
			if (gropupManagerValue != null && gropupManagerValue.length > 0) {
				for (int i = 0; i < gropupManagerValue.length; i++) {
					if (gropupManagerValue[i].getManagerId() == opId) {
						return true;
					}
				}
			}

		} else {
			// 看是否在这个客户经理组中
			IBOCmSegMgrGroupRelValue segValue = queryOrgIdBySegmentZipCode(Long.parseLong(CmConstants.segment.SA), -1L);
			IQBOSecOrgStaffOperGrpValue[] iSecOrgStaffs = OrgmodelClient.getGrpMembersByOperInfo("", "", Long.parseLong(segValue.getGroupCode()), "", false, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(iSecOrgStaffs)) {
				for (IQBOSecOrgStaffOperGrpValue secValue : iSecOrgStaffs) {
					if (opId == secValue.getOperatorId()) {
						return true;
					}
				}
			}
		}
		return false;

	}

	public boolean validateApproval(long rootCustId, long approverId, long psType) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupApprovalValue.S_RootCustId).append(" =:rootCustId ");
		parameter.put("rootCustId", rootCustId);
		condition.append(" AND ").append(IBOCmGroupApprovalValue.S_ApprovalStatus).append(" =:status ");
		parameter.put("status", CmConstants.ApprovalStatus.WaitForApproval);
		condition.append(" AND ").append(IBOCmGroupApprovalValue.S_PsType).append(" =:psType ");
		parameter.put("psType", psType);
		condition.append(" order by " + IBOCmGroupApprovalValue.S_CreateDate);
		parameter.put("DONE_DATE", CmCommonUtil.getSysDate());
		IBOCmGroupApprovalValue[] values = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			if (values.length > 1) {
				if (values[0].getApproverId() != approverId) {
					return true;
				}
			}
		}
		return false;
	}

	public void sendSegmentToBilling(long custId, long segmentId) throws Exception {
		IVOCustValue voCustValue = new VOCustBean();
		ICmCustomerSV custService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custService.queryCustomerByCustId(custId);
		// 客户细分送billing
		custValue.set("CUST_SEGMENT", segmentId);
		voCustValue.setCustomer(custValue);
		notify(voCustValue);
	}

	/** 
	 * 后台进程，处理相关的业务。包括同步到客户资料，参与人等。默认实现通过TF框架来实现。  
	 * @Function notify
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午8:33:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	protected void notify(IVOCustValue custValue) throws Exception {
		// 处理同步客户资料给Billing
		if (custValue.getAccounts().length > 0) {
			if (custValue.getAccounts()[0].getBillCycles().length == 0) {
				long acctId = custValue.getAccounts()[0].getAcctId();
				ICmAccountSV service = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
				IAcctBillCycleValue[] values = service.queryAcctBillCyclesByAcctId(acctId);
				custValue.getAccounts()[0].setBillCycle(values[0]);
			}
		}
		// 扩展信息中credit_value
		if (CmCommonUtil.isNotEmptyObject(custValue.getCustomer())) {
			IBOBsStaticDataValue[] staticData = StaticDataUtil.getStaticData("CURRENCY_TYPE_TO_COUNT_" + CrmCallAmsWsConstants.getMeasureId());
			if (CmCommonUtil.isNotEmptyObject(staticData)) {
				long para = DataType.getAsLong(staticData[0].getCodeValue());
				ICustomerValue customerValue = custValue.getCustomer();
				if (null != customerValue.get("CREDIT_VALUE")) {
					long oldCreditValue = DataType.getAsLong(customerValue.get("CREDIT_VALUE"));
					long creditValue = -1;
					if (oldCreditValue != -1) {
						creditValue = oldCreditValue * para;
					}
					customerValue.set("CREDIT_VALUE", creditValue);
				}
			}
		}
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			if (customerValue.getCustType() == CmConstants.CustomerType.GROUP) {
				customerValue.setCustLanguage(customerValue.getPerferLanguage());
			}
		}
		CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
	}

	public void saveGroupSegmentRelaInfo(long rootCustId, long custId, long segmentId, long resource, long groupCode) throws Exception {
		ICmCustSegmentRelaSV segmentRela = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue segmentRelaBean = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(custId);
		if (rootCustId == custId) {
			// 针对根节点细分变化
			if ((resource == CmConstants.PsResource.forward && segmentRelaBean.getIsRevisable() == 1)
					|| (resource == CmConstants.PsResource.back && segmentRelaBean.getIsRevisable() == 1) || resource == CmConstants.PsResource.forwardModify) {
				segmentRelaBean.setSegmentId(segmentId);
				if (resource == CmConstants.PsResource.forwardModify) {
					// 如果是前台节点修改细分，变更后设置不允许修改
					segmentRelaBean.setIsRevisable(0);
				}
				segmentRela.saveSegmentRela(segmentRelaBean);
				// 调用方法保存客户经理组
				saveManager(custId, groupCode);
				// 客户细分变更送billing
				sendSegmentToBilling(custId, segmentId);
				// 查询出该集团的下级
				StringBuffer condition = new StringBuffer();
				String structTabName = "CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant();
				condition.append("SELECT CUST_ID,REL_CUST_ID FROM " + structTabName + " WHERE CUST_ID = :parentCustId ");
				Map map = new HashMap();
				map.put("parentCustId", rootCustId);
				DataContainer[] data = CommonTool.queryBeansFromSql(condition.toString(), map, -1, -1);
				if (data != null && data.length > 0) {
					for (int i = 0; i < data.length; i++) {
						IBOCmCustSegmentRelaValue subGroupSegmentRelaBean = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class))
								.querySegmentRelaByCustId(data[i].getAsLong("REL_CUST_ID"));
						if (subGroupSegmentRelaBean != null) {
							// 过滤掉根的节点,因为根已经审批过了
							if (data[i].getAsLong("REL_CUST_ID") == data[i].getAsLong("CUST_ID")) {
								continue;
							}
							if (subGroupSegmentRelaBean.getIsRevisable() == 1) {// 如果允许修改
								// 保存客户细分
								subGroupSegmentRelaBean.setSegmentId(segmentId);
								segmentRela.saveSegmentRela(subGroupSegmentRelaBean);
								// 调用方法保存客户经理组
								saveManager(subGroupSegmentRelaBean.getCustId(), groupCode);
								// 送billing
								sendSegmentToBilling(subGroupSegmentRelaBean.getCustId(), segmentId);
							}
						}
					}
				}
			}
		} else {
			if (resource == CmConstants.PsResource.forwardModify) {
				// 前台只变更当前节点
				segmentRelaBean.setSegmentId(segmentId);
				// 前台节点修改细分则要设置为不可修改
				segmentRelaBean.setIsRevisable(0);
				// 保存细分
				segmentRela.saveSegmentRela(segmentRelaBean);
				// 保存客户经理
				saveManager(custId, groupCode);
				// 细分送billing
				sendSegmentToBilling(custId, segmentId);
			} else if (resource == CmConstants.PsResource.forward || resource == CmConstants.PsResource.back) {
				// 如果是层积拆分导致的细分变更（并且根节点没有变化）
				IBOCmCustSegmentRelaValue segmentInfo = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(rootCustId);
				StringBuffer condition = new StringBuffer();
				String structTabName = "CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant();
				condition.append("SELECT CUST_ID,REL_CUST_ID FROM " + structTabName + " WHERE CUST_ID = :parentCustId ");
				Map map = new HashMap();
				map.put("parentCustId", rootCustId);
				DataContainer[] data = CommonTool.queryBeansFromSql(condition.toString(), map, -1, -1);
				if (data != null && data.length > 0) {
					for (int i = 0; i < data.length; i++) {
						IBOCmCustSegmentRelaValue subGroupSegmentRelaBean = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class))
								.querySegmentRelaByCustId(data[i].getAsLong("REL_CUST_ID"));
						if (null != subGroupSegmentRelaBean) {
							if (subGroupSegmentRelaBean.getIsRevisable() == 1) {// 如果允许修改(针对后台)
								if (subGroupSegmentRelaBean.getSegmentId() != segmentInfo.getSegmentId()) {
									// 如果子节点细分与根节点细分不一样,则要继承根节点细分
									subGroupSegmentRelaBean.setSegmentId(segmentInfo.getSegmentId());
									segmentRela.saveSegmentRela(subGroupSegmentRelaBean);
									// 调用方法保存客户经理组
									saveManager(subGroupSegmentRelaBean.getCustId(), groupCode);
									// 送billing
									sendSegmentToBilling(subGroupSegmentRelaBean.getCustId(), segmentInfo.getSegmentId());
								}
							}
						}
					}
				}
			}
		}
	}

	public IBOCmGroupMemberValue[] queryGroupMemberByCustId(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and ").append(IBOCmGroupMemberValue.S_CustId).append("=:custId").append(" and ").append(IBOCmGroupMemberValue.S_State).append("='U'");
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		IBOCmGroupMemberValue[] value = (IBOCmGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupMemberBean.class, condition.toString(), parameter, -1,
				-1);
		return value;
	}

	public void inheritGroupSegment(long rootCustId, long segmentId, long managerId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICmCustSegmentRelaSV segmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustOrganizeValue.S_CustId, rootCustId);
		conditionDC.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.SUB_COMPANY);
		ICustOrganizeValue[] custOrganizeValues = customerSV.queryCustOrganizes(conditionDC, -1, -1);
		if (custOrganizeValues != null && custOrganizeValues.length > 0) {
			IBOCmCustSegmentRelaValue segmentRelaValue = null;
			long custId = 0;
			for (int i = 0; i < custOrganizeValues.length; i++) {
				custId = custOrganizeValues[i].getRelCustId();
				segmentRelaValue = segmentRelaSV.querySegmentRelaByCustId(custId);
				if (segmentRelaValue == null) {
					segmentRelaValue = new BOCmCustSegmentRelaBean();
					segmentRelaValue.setCustId(custId);
					segmentRelaValue.setIsRevisable(CmConstants.YesOrNo.YES);// 细分可修改
				}
				segmentRelaValue.setSegmentId(segmentId);
				segmentRelaSV.saveSegmentRela(segmentRelaValue);
				// 保存对应的客户经理
				saveManager(custId, managerId);
				// 送billing
				sendSegmentToBilling(custId, segmentId);
			}
		}

	}

	public ICustomerValue[] queryCustValuesByCVR(String cvr) throws Exception {
		List custList = null;
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_TaxId).append(" =:cvr ");
		parameter.put("cvr", cvr);
		IBOLnCmxGroupCustValue[] cmxValues = (IBOLnCmxGroupCustValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmxGroupCustBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmxValues)) {
			custList = new ArrayList();
			for (int i = 0; i < cmxValues.length; i++) {
				long custId = cmxValues[i].getCustId();
				ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue value = service.queryCustomerByCustId(custId);
				custList.add(value);
			}
			return (ICustomerValue[]) custList.toArray(new CustomerBean[0]);
		} else {
			return null;
		}
	}

	public IBOCmGroupMemberValue[] queryGroupMemberByCustId(long custId, long memberCustId, String memberName, int startIndex, int endIndex) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupMemberValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (memberCustId > 0) {
			condition.append(" AND ").append(IBOCmGroupMemberValue.S_MemberCustId).append(" =:memberCustId ");
			parameter.put("memberCustId", memberCustId);
		}
		if (StringUtils.isNotBlank(memberName)) {
			condition.append(" AND ").append(IBOCmGroupMemberValue.S_MemberName).append(" like :memberName");
			parameter.put("memberName", "%" + memberName + "%");
		}
		condition.append(" AND ").append(IBOCmGroupMemberValue.S_MemberType).append(" <> :type");
		parameter.put("type", 3);
		condition.append(" AND ").append(IBOCmGroupMemberValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.USE);
		return (IBOCmGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupMemberBean.class, condition.toString(), parameter, startIndex, endIndex);
	}

	public int queryGroupMemberCountByCustId(long custId, long memberCustId, String memberName) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupMemberValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (memberCustId > 0) {
			condition.append(" AND ").append(IBOCmGroupMemberValue.S_MemberCustId).append(" =:memberCustId ");
			parameter.put("memberCustId", memberCustId);
		}
		if (StringUtils.isNotBlank(memberName)) {
			condition.append(" AND ").append(IBOCmGroupMemberValue.S_MemberName).append(" like :memberName");
			parameter.put("memberName", "%" + memberName + "%");
		}
		condition.append(" AND ").append(IBOCmGroupMemberValue.S_MemberType).append(" <> :type");
		parameter.put("type", 3);
		condition.append(" AND ").append(IBOCmGroupMemberValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.USE);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupMemberBean.class, condition.toString(), parameter);
	}

	public void saveKobCustInfo(String newKobNumber, long custId) throws Exception {
		// 查询集团信息
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerValue = customerSV.queryCustomerMaskByCustId(custId);
		// 查询集团扩展信息
		IBOLnCmxGroupCustValue cmxData = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(custId);
		// 文件中集团信息
		String fileKobInfo = cmxData.getExt18();

		// 外国集团--类型区分 DEVELOP_TYPE = (3) Awaiting KOB/Afventer KOB, 4:R-fix
		int contryType = customerValue.getDevelopType();
		// 是否可被修改 IS_REVISABLE 0：不允许 1：允许
		// 更新KOB信息 外国集团类型==3或者4的进行更新
		// 加一种
		if (StringUtils.isNotBlank(fileKobInfo) && 3 == contryType || 4 == contryType) {
			// 更新KOB Number
			customerValue.setCustCertCode(newKobNumber);
			DataContainer data = KOBFileUtil.dealFileOne(fileKobInfo);
			KOBFileUtil.saveCustomerData(TenantIDFactory.getTenant(), customerValue, cmxData, data);
			// 更新层级信息
			// 层级信息
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			String orgData = cmxData.getExt14();
			String[] orgDataAry = StringUtils.split(orgData, "|");
			if (CmCommonUtil.isNotEmptyObject(orgDataAry)) {
				for (int i = 0; i < orgDataAry.length; i++) {
					String[] str = StringUtils.split(orgDataAry[i], ",");
					String relKobNumber = str[2];
					String upDown = str[1];
					String kobNumber = str[0];
					IBOCmGroupCustomerValue groupCustomer = groupCustomerSV.queryGroupcustomerByKOB(kobNumber);
					ICustomerValue customerData = null;
					if (groupCustomer != null) {
						customerData = new CustomerBean();
						customerData.copy(groupCustomer);
					}
					IBOCmGroupCustomerValue relGroupCustomer = groupCustomerSV.queryGroupcustomerByKOB(relKobNumber);
					ICustomerValue relCustomerData = null;
					if (relGroupCustomer != null) {
						relCustomerData = new CustomerBean();
						relCustomerData.copy(relGroupCustomer);
					}
					if (customerData != null && relCustomerData != null) {
						// 关联集团客户ID
						long relCustId = relCustomerData.getCustId();
						long upCustId = 0L;// up
						long downCustId = 0L;// down
						String custServiceId = "";
						String downCustName = "";
						// Up上级 Related-KOB-numberber是KOB-numberber的Up
						if ("O".equals(upDown)) {
							upCustId = relCustId;
							downCustId = customerData.getCustId();
							custServiceId = relCustomerData.getCustServiceId();
							downCustName = customerData.getCustName();
						} else if ("N".equals(upDown)) {
							// Down下级
							// Related-KOB-numberber是KOB-numberber的Down。
							upCustId = customerData.getCustId();
							downCustId = relCustId;
							custServiceId = customerData.getCustServiceId();
							downCustName = relCustomerData.getCustName();
						}
						KOBFileUtil.saveCustOrg(upCustId, downCustId, custServiceId, downCustName);
					} else {
						throw new Exception("KOB[" + kobNumber + "  OR " + relKobNumber + "] relation customer is not exist.");
					}
				}
			}
		}
	}

	private void dealGroupManager(long custId, long rootCustId, long managerId) throws Exception {
		// 处理客户经理
		StringBuffer condition = new StringBuffer();
		String structTabName = "CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant();
		if (rootCustId == custId) {
			// 针对根节点
			condition.append("SELECT CUST_ID,REL_CUST_ID FROM " + structTabName + " WHERE CUST_ID = :parentCustId ");
			Map map = new HashMap();
			map.put("parentCustId", rootCustId);
			DataContainer[] data = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), map);
			if (CmCommonUtil.isNotEmptyObject(data)) {
				for (int i = 0; i < data.length; i++) {
					long relCustId = data[i].getAsLong("REL_CUST_ID");
					saveManager(relCustId, managerId);
				}
			}
		} else {
			// 针对子节点
			saveManager(custId, managerId);
			condition.append("SELECT DEPT_ID,PARENT_DEPT_ID,CUST_ID,REL_CUST_ID FROM " + structTabName + " WHERE REL_CUST_ID = :custId ");
			Map map = new HashMap();
			map.put("custId", custId);
			DataContainer[] data = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), map);
			if (CmCommonUtil.isNotEmptyObject(data)) {
				long deptId = data[0].getAsLong("DEPT_ID");
				dealCycleDept(deptId, managerId);
			}
		}
	}

	private void dealCycleDept(long deptId, long managerId) throws Exception {
		StringBuffer condition = new StringBuffer();
		String structTabName = "CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant();
		condition.append("SELECT DEPT_ID,PARENT_DEPT_ID,CUST_ID,REL_CUST_ID FROM " + structTabName + " WHERE PARENT_DEPT_ID = :deptId ");
		Map map = new HashMap();
		map.put("deptId", deptId);
		DataContainer[] data = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), map);
		if (CmCommonUtil.isNotEmptyObject(data)) {
			long relCustId = data[0].getAsLong("REL_CUST_ID");
			saveManager(relCustId, managerId);
			dealCycleDept(data[0].getAsLong("DEPT_ID"), managerId);
		}
	}

	public DataContainer[] queryCustForUser(long custId, long memberCustId, String custName, int startIndex, int endIndex) throws Exception {
		StringBuffer condition = new StringBuffer();
		StringBuffer conditionB = new StringBuffer();
		StringBuffer realCondition = null;
		condition
				.append("SELECT t.MEMBER_NAME,t.MEMBER_CUST_ID AS CUST_ID FROM {CM_GROUP_MEMBER} t WHERE t.MEMBER_TYPE<>:type AND t.STATE=:state AND t.CUST_ID=:custId AND t.MEMBER_NAME like :name UNION ALL "
						+ "SELECT s.CUST_NAME AS MEMBER_NAME,s.CUST_ID FROM {CM_GROUP_CUSTOMER} s WHERE s.STATE=:state AND s.CUST_NAME like :name ");
		conditionB.append(" SELECT t.MEMBER_NAME,t.MEMBER_CUST_ID AS CUST_ID FROM {CM_GROUP_MEMBER} t WHERE t.MEMBER_CUST_ID=:memberCustId ");
		Map parameter = new HashMap();
		if (memberCustId > 0) {
			realCondition = conditionB;
			parameter.put("memberCustId", memberCustId);

		} else {
			realCondition = condition;
			parameter.put("type", 3);
			parameter.put("state", CmConstants.RecordState.USE);
			parameter.put("custId", custId);
			parameter.put("name", "%" + custName + "%");
		}
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(realCondition.toString(), "", startIndex, endIndex, parameter), parameter);
		if (CmCommonUtil.isNotEmptyObject(counts)) {
			for (DataContainerInterface count : counts) {
				if (CmConstants.CustomerType.GROUP == CmCommonUtil.getCustType(count.getAsLong("CUST_ID"))) {
					// 集团客户
					count.setDiaplayAttr("CUST_ID", "REAL_CUST_ID", CrmLocaleFactory.getResource("CMS9988950"));
				} else {
					// 部门成员
					count.setDiaplayAttr("CUST_ID", "REAL_CUST_ID", CrmLocaleFactory.getResource("CMS9988951"));
				}
			}
		}
		return (DataContainer[]) counts;
	}

	public int queryCustForUserCount(long custId, long memberCustId, String custName) throws Exception {
		StringBuffer condition = new StringBuffer();
		StringBuffer conditionB = new StringBuffer();
		StringBuffer realCondition = null;
		condition
				.append("SELECT t.MEMBER_NAME,t.MEMBER_CUST_ID AS CUST_ID FROM {CM_GROUP_MEMBER} t WHERE t.MEMBER_TYPE<>:type AND t.STATE=:state AND t.CUST_ID=:custId AND t.MEMBER_NAME like :name UNION ALL "
						+ "SELECT s.CUST_NAME AS MEMBER_NAME,s.CUST_ID FROM {CM_GROUP_CUSTOMER} s WHERE s.STATE=:state AND s.CUST_NAME like :name ");
		conditionB.append(" SELECT t.MEMBER_NAME,t.MEMBER_CUST_ID AS CUST_ID FROM {CM_GROUP_MEMBER} t WHERE t.MEMBER_CUST_ID=:memberCustId ");
		Map parameter = new HashMap();
		if (memberCustId > 0) {
			realCondition = conditionB;
			parameter.put("memberCustId", memberCustId);

		} else {
			realCondition = condition;
			parameter.put("type", 3);
			parameter.put("state", CmConstants.RecordState.USE);
			parameter.put("custId", custId);
			parameter.put("name", "%" + custName + "%");
		}
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(realCondition.toString(), "", parameter), parameter);
		return counts[0].getAsInt("CNT");
	}

	public IBOCmGroupOrgStructValue[] queryCustOrgainzedInfo(long custId, int deptType, int startIndex, int endIndex) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (deptType > 0) {
			condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_DeptType).append(" =:deptType ");
			parameter.put("deptType", deptType);
		}
		condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_ParentDeptId).append(" is not null ");
		return (IBOCmGroupOrgStructValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupOrgStructBean.class, condition.toString(), parameter, -1, -1);

	}

	public int queryCustOrgainzedInfoCount(long custId, int deptType) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (deptType > 0) {
			condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_DeptType).append(" =:deptType ");
			parameter.put("deptType", deptType);
		}
		condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_ParentDeptId).append(" is not null ");
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupOrgStructBean.class, condition.toString(), parameter);
	}

	public boolean queryIfCustomerManager(long custId) throws Exception {
		long operId = ServiceManager.getUser().getID();
		ICmCustomerSV custService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custService.queryCustomerMaskByCustId(custId);
		ICmGroupCustomerSV groupCustomerService = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		String groupSegmentId = custValue.getGroupSegmentId();
		if (groupSegmentId.equals("LA") || groupSegmentId.equals("PA") || groupSegmentId.equals("KA") || groupSegmentId.equals("MA")) {
			// 获取客户经理信息
			IBOCmGroupManagerValue[] gropupManagerValue = groupCustomerService.getSAOrMAManagerInfo(String.valueOf(custId), -1, -1);
			// 如果找到与当前操作员id匹配的客户经理的Id则成功返回结束循环
			if (gropupManagerValue != null && gropupManagerValue.length > 0) {
				for (int i = 0; i < gropupManagerValue.length; i++) {
					if (gropupManagerValue[i].getManagerId() == operId) {
						return true;
					}
				}
			}

		} else {
			// 看是否在这个客户经理组中
			IBOCmSegMgrGroupRelValue segValue = queryOrgIdBySegmentZipCode(Long.parseLong(CmConstants.segment.SA), -1L);
			IQBOSecOrgStaffOperGrpValue[] iSecOrgStaffs = OrgmodelClient.getGrpMembersByOperInfo("", "", Long.parseLong(segValue.getGroupCode()), "", false, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(iSecOrgStaffs)) {
				for (IQBOSecOrgStaffOperGrpValue secValue : iSecOrgStaffs) {
					if (operId == secValue.getOperatorId()) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public IBOCmGroupApprovalValue queryFormerApprovalOpinion(String wkFlowId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (StringUtils.isNotBlank("wkFlowId")) {
			condition.append(" AND ").append(IBOCmGroupApprovalValue.S_WkFlowId).append(" =:wkFlowId ");
			parameter.put("wkFlowId", wkFlowId);
		}
		parameter.put("DONE_DATE", ServiceManager.getOpDateTime());
		condition.append(" ORDER BY ").append(IBOCmGroupApprovalValue.S_CreateDate);
		IBOCmGroupApprovalValue[] values = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}

	public void validateDuplicateApproval(long custId) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupApprovalValue.S_CustId, custId);
		dc.set(IBOCmGroupApprovalValue.S_ApprovalStatus, "1");
		dc.set(IBOCmGroupApprovalValue.S_DoneDate, ServiceManager.getOpDateTime());
		IBOCmGroupApprovalValue[] groupApprovalValues = queryCmGroupApproval(dc);
		if (groupApprovalValues != null && groupApprovalValues.length > 0) {
			// 该集团有待审批工单，等该工单处理完成后再修改。
			ExceptionUtil.throwBusinessException("CMS90000074");
		}
	}

	public IBOCmGroupApprovalValue[] queryCmGroupApproval(DataContainerInterface dataContainer) throws Exception {
		String[] props = dataContainer.getPropertyNames();
		StringBuffer condition = new StringBuffer(" 1=1 ");
		for (int i = 0, len = props.length; i < len; i++) {
			if (!(props[i].equalsIgnoreCase(IBOCmGroupApprovalValue.S_DoneDate))) {
				condition.append(" and ").append(props[i]).append(" = :").append(props[i]);
			}
		}
		IBOCmGroupApprovalValue[] values = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, condition.toString(),
				dataContainer.getProperties(), -1, -1);
		// 记录业务操作日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.MANAGER_APPROVAL, condition.toString(), dataContainer.getProperties(), CmConstants.BusiLogType.CUSTOMER_LOG);
		if (values != null && values.length > 0) {
			return values;
		}
		return new IBOCmGroupApprovalValue[0];
	}

	@Override
	public ICustomerValue queryCmGroupByCvrAndName(String cvr, String name) throws Exception {
		StringBuffer condtion = new StringBuffer(
				"SELECT GC.CUST_ID,GC.CUST_NAME,GC.CUST_ZIPCODE,GC.CUST_CERT_TYPE,GC.CUST_CERT_CODE,T3.SEGMENT_ID FROM {CM_GROUP_CUSTOMER} GC ,{CMX_GROUP_CUSTOMER} XGC,{CM_CUST_SEGMENT_RELA} T3 WHERE GC.CUST_ID = XGC.CUST_ID   AND GC.CUST_ID = T3.CUST_ID ");
		condtion.append(" AND GC.DEVELOP_TYPE IN (3,4) AND GC.CUST_CERT_CODE LIKE 'K%' ");
		Map paramMap = new HashMap();
		if (StringUtils.isNotBlank(cvr)) {
			condtion.append(" AND XGC.TAX_ID = :cvr ");
			paramMap.put("cvr", cvr);
		}
		if (StringUtils.isNotBlank(name)) {
			condtion.append(" AND GC.CUST_NAME = :name ");
			paramMap.put("name", name);
		}
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condtion.toString(), paramMap);
		CustomerBean result = null;
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			result = new CustomerBean();
			result.copy(dcs[0]);
			result.setCustSegment(dcs[0].getAsLong("SEGMENT_ID"));
			String custCertCode = result.getCustCertCode();
			if (StringUtils.isNotBlank(custCertCode) && custCertCode.startsWith("K")) {
				result.setCustCertCode("");
			}
		}
		return result;
	}
}
