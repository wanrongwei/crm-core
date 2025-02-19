package com.asiainfo.crm.cm.busimodel.impl.customer;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.BusinessException;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmCustContMedTypeUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.dk.bo.BOCmPsSegmentCalBean;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFamilyContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFamilyMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustAttrBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgDifferValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.bo.BOCmGroupCustomerAuditBean;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOCmGroupCustomerAuditValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.CustOrganizeBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.bo.PartyRoleBean;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyRoleValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.IUip2CmSV;
import com.asiainfo.crm.common.ResUserInfo;
import com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants;
import com.asiainfo.isub.base.common.DataTypeUtils;

/**   
 * 客户业务处理类<br>
 * 该类主要负责客户资料的维护功能，包括新建客户、修改客户、删除客户相关信息等。
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName AbstractCustomerDealBusiModelImpl
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-14 下午3:22:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractCustomerDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	private static transient Log log = LogFactory.getLog(AbstractCustomerDealBusiModelImpl.class);

	/**
	 * <strong>流程：</strong><br>
	 * 1、{@link #validate(IVOCustValue) 验证客户对象信息};<br>
	 * 2、{@link #setDefaultValue(IVOCustValue) 设置默认属性值};<br>
	 * 3、{@link #processBeforeDeal(IVOCustValue) 在调用业务处理之前的处理的工作}；<br>
	 * 4、{@link #dealParty(IVOCustValue) 处理参与人信息}；<br>
	 * 5、{@link #dealCustomer(IVOCustValue) 处理客户基本信息}；<br>
	 * 6、{@link #dealContacts(IVOCustValue) 处理联系人 信息}；<br>
	 * 7、{@link #dealCustManagers(IVOCustValue) 处理客户经理信息}；<br>
	 * 8、{@link #dealAccounts(IVOCustValue) 处理账户信息}；<br>
	 * 9、{@link #dealAttrValues(IVOCustValue) 处理属性信息};<br>
	 * 10、{@link #saveBusiLog(IVOCustValue) 记录业务日志};<br>
	 * 11、{@link #processAfterDeal(IVOCustValue) 业务处理之后的操作}。<br>
	 */
	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOCustValue custValue = (IVOCustValue) valueObject;
		// set firstNameQry,middleNameQry,lastNameQry......
		CmCommonUtil.convertName(new DataStructInterface[] { custValue.getCustomer() });
		/*
		 * 验证客户对象信息
		 */
		validate(custValue);
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(custValue);
		/*
		 * 处理客户地址信息(校验客户法律地址之前调用保存客户的地址)
		 */
		dealCustAddress(custValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(custValue);
		/*
		 * 处理客户多认证
		 */
		dealCustIdentification(custValue);

		/*
		 * 处理参与人信息
		 */
		dealParty(custValue);
		/*
		 * 如果包含客户基本信息，则处理客户基本信息
		 */
		dealCustomer(custValue);

		/*
		 * 处理客户联系媒介信息
		 */
		dealCustContMedium(custValue);

		/*
		 * 如果有联系人信息，则处理联系人 信息
		 */
		dealContacts(custValue);
		/*
		 * 如果有客户经理信息则处理客户经理信息
		 */
		dealCustManagers(custValue);
		/*
		 * 处理客户组合字结构信息
		 */
		dealCustOrganize(custValue);
		/*
		 * 处理客户关系
		 */
		dealCustRel(custValue);
		/*
		 * 如果有账户信息则处理账户信息
		 */
		dealAccounts(custValue);
		/*
		 * 处理属性信息
		 */
		dealAttrValues(custValue);
		/*
		 * 处理其他业务
		 */
		dealOtherThings(custValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(custValue);
		notify(custValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(custValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	public void dealDefaultcustomer(IVOCustValue custValue) throws Exception {
		CmCommonUtil.convertName(new DataStructInterface[] { custValue.getCustomer() });
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(custValue);
		/*
		 * 处理客户地址信息(校验客户法律地址之前调用保存客户的地址)
		 */
		dealCustAddress(custValue);
		/*
		 * 处理参与人信息
		 */
		dealDefaultParty(custValue);
		/*
		 * 处理客户多认证
		 */
		dealCustIdentification(custValue);

		/*
		 * 如果包含客户基本信息，则处理客户基本信息
		 */
		dealCustomer(custValue);

		/*
		 * 处理客户联系媒介信息
		 */
		dealCustContMedium(custValue);
		dealOtherThings(custValue);
		notify(custValue);
	}

	/**   
	 * 处理客户属性信息
	 * @Function dealAttrValues
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:50:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealAttrValues(IVOCustValue custValue) throws Exception {
		if (custValue.hasAttrValues()) {
			// 已经被保存了就不要在保存了。
			if (custValue.hasUserObject("CUST_ATTR_SAVER")) {
				return;
			}
			CmServiceFactory.getEntityAttrSV().saveEntityAttrValues(custValue.getAttrValues(), custValue.getUserMap());
			custValue.setUserObject("CUST_ATTR_SAVER", this.getClass().getName());
		}
	}

	/**
	 * 如果有客户关系信息，处理客户关系信息。
	 * @param custValue
	 * @return: void
	 * @version: v1.0.0
	 * @author: LSC
	 * @throws Exception 
	 * @date: 2012-4-1 上午11:16:49 
	 */
	private void dealCustRel(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustRel()) {
			ICustRelationshipValue[] custRelValues = custValue.getCustRels();
			CmCommonUtil.convertName(custRelValues);
			List<BOCmGroupCustomerBean> subGroupCustValueList = new ArrayList<BOCmGroupCustomerBean>();
			List<BOCmGroupMemberBean> groupMemberValueList = new ArrayList<BOCmGroupMemberBean>();
			List<BOCmFamilyMemberBean> familyMemberValueList = new ArrayList<BOCmFamilyMemberBean>();
			for (int i = 0; i < custRelValues.length; i++) {
				switch (custRelValues[i].getRelationType()) {
				// 处理集团父子关系
					case CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_FATHER:
						if (custValue.getUserObject("groupCustValue") == null) {
							// 参数错误，参数{0}不能为空！
							ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0020197"));
						}
						if (custValue.getUserObject("parentCustId") == null) {
							// 参数错误，参数{0}不能为空！
							ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0020197"));
						}
						Object parentCustId = custValue.getUserObject("parentCustId");
						Object groupCustListObj = custValue.getUserObject("groupCustValue");

						if (groupCustListObj == null) {
							// 参数错误，参数{0}不能为空！
							ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0020197"));
						}
						List groupCustList = (List) groupCustListObj;

						for (Iterator iterator = groupCustList.iterator(); iterator.hasNext();) {
							Object childCustInfoObj = (Object) iterator.next();
							ICustomerValue childCustInfo = (ICustomerValue) childCustInfoObj;
							// 如果是新增
							if (childCustInfo.isNew()) {
								// 设置集团客户编号
								childCustInfo.setCustId(CmCommonUtil.getNewSequence(BOCmGroupCustomerBean.class));
								childCustInfo.setState(CmConstants.RecordState.USE);
							}
							BOCmGroupCustomerBean groupCustValue = new BOCmGroupCustomerBean();
							groupCustValue.copy(childCustInfo);
							if (parentCustId != null) {
								groupCustValue.setParentCustId(Long.parseLong(parentCustId.toString()));
							}

							subGroupCustValueList.add(groupCustValue);
						}
						break;
					// 处理集团成员信息
					case CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER:
						BOCmGroupMemberBean boCmGroupMemValue = new BOCmGroupMemberBean();
						boCmGroupMemValue.copy(custRelValues[i]);
						boCmGroupMemValue.setEffectiveDate(ServiceManager.getOpDateTime());
						if (boCmGroupMemValue.getMemberCustId() <= 0) {
							boCmGroupMemValue.setMemberCustId(custValue.getCustId());
						}

						groupMemberValueList.add(boCmGroupMemValue);
						break;
					// 处理家庭成员信息
					case CmConstants.CustRelationShip.CUST_REL_TYPE_FAMILY:
						BOCmFamilyMemberBean boCmFamilyMemValue = new BOCmFamilyMemberBean();
						boCmFamilyMemValue.copy(boCmFamilyMemValue);
						familyMemberValueList.add(boCmFamilyMemValue);
						break;
					default:
						break;
				}
			}
			// 处理集团成员信息
			if (CmCommonUtil.isNotEmptyObject(groupMemberValueList)) {
				ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);

				for (int i = 0; i < groupMemberValueList.size(); i++) {

					// 删除网外成员送cpr,并删除网外成员客户信息
					if (groupMemberValueList.get(i).getMemberType() == CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_OUT && groupMemberValueList.get(i).isDeleted()) {
						ICustomerValue value = service.queryCustomerByCustId(groupMemberValueList.get(i).getMemberCustId());
						// 删除参与人角色
						IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(value.getPartyId(), CmConstants.PartyRoleType.EMPLOYEE, -1, -1);
						BOCmPartyRoleBean partyRoleBean = new BOCmPartyRoleBean();
						partyRoleBean.copy(partyRoles[0]);
						partyRoleBean.setState(CmConstants.RecordState.ERASE);
						partyRoleBean.setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
						partyRoleBean.initProperty(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
						partyRoleSV.savePartyRole(partyRoleBean);
						// 判断该成员是否只有一个成员角色
						IBOCmIndivCustomerValue indivCustValue = service.queryIndivCustomerInfo(groupMemberValueList.get(i).getMemberCustId());
						if (partyRoleSV.IsPartyRoleUnique(indivCustValue.getPartyId(), CmConstants.PartyRoleType.EMPLOYEE)) {
							// 删除网外成员客户信息
							value.setCustStatus(CmConstants.CustomerStatus.INDIV_TERMINATED);
							value.setState(CmConstants.RecordState.ERASE);
							value.setExpireDate(CmCommonUtil.getSysDate());
							// 删除CPR号码
							value.setCustCertCode(null);
							service.saveCustomer(value);
							
							// 送cpr
							ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
							requestTaskSV.saveCustRequestTaskInfo(groupMemberValueList.get(i).getMemberCustId(), 1, "C");

						}
					}
					// 网内成员删除成员角色
					if (groupMemberValueList.get(i).getMemberType() == CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN && groupMemberValueList.get(i).isDeleted()) {
						ICustomerValue value = service.queryCustomerByCustId(groupMemberValueList.get(i).getMemberCustId());
						// 删除参与人角色
						IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(value.getPartyId(), CmConstants.PartyRoleType.EMPLOYEE, -1, -1);
						BOCmPartyRoleBean partyRoleBean = new BOCmPartyRoleBean();
						partyRoleBean.copy(partyRoles[0]);
						partyRoleBean.initProperty(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
						partyRoleBean.setState(CmConstants.RecordState.ERASE);
						partyRoleBean.setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
						partyRoleSV.savePartyRole(partyRoleBean);
					}
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(groupMemberValueList.toArray(new BOCmGroupMemberBean[0]));
				// 将修改过的值进行回设
				for (int i = 0; i < groupMemberValueList.size(); i++) {
					// 回设主键、日志信息等
					custRelValues[i].setCustRelId(groupMemberValueList.get(i).getCustRelId());
					custRelValues[i].setCreateDate(groupMemberValueList.get(i).getCreateDate());
					custRelValues[i].setDoneCode(groupMemberValueList.get(i).getDoneCode());
					custRelValues[i].setDoneDate(groupMemberValueList.get(i).getDoneDate());
					custRelValues[i].setOpId(groupMemberValueList.get(i).getOpId());
					custRelValues[i].setOrgId(groupMemberValueList.get(i).getOrgId());
					custRelValues[i].setEffectiveDate(groupMemberValueList.get(i).getEffectiveDate());
					custRelValues[i].setExpireDate(groupMemberValueList.get(i).getExpireDate());
				}

				// 上发部门用户成员信息
				sendNumberMember(custRelValues);
				// 记录客户接触
				savedeptLog(custValue);
			}
			// 处理集团父子关系信息
			if (CmCommonUtil.isNotEmptyObject(subGroupCustValueList)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(subGroupCustValueList.toArray(new BOCmGroupCustomerBean[0]));
				// 回设到参数中
				for (int i = 0; i < groupMemberValueList.size(); i++) {
					// 回设主键、日志信息等
					custRelValues[i].setCreateDate(subGroupCustValueList.get(i).getCreateDate());
					custRelValues[i].setDoneCode(subGroupCustValueList.get(i).getDoneCode());
					custRelValues[i].setDoneDate(subGroupCustValueList.get(i).getDoneDate());
					custRelValues[i].setOpId(subGroupCustValueList.get(i).getOpId());
					custRelValues[i].setOrgId(subGroupCustValueList.get(i).getOrgId());
					custRelValues[i].setEffectiveDate(subGroupCustValueList.get(i).getEffectiveDate());
					custRelValues[i].setExpireDate(subGroupCustValueList.get(i).getExpireDate());
				}
			}
		}
	}

	/**   
	 * 部门和号码关系维护记录客户接触。
	 * @Function savedeptLog
	 * @Description 
	 *
	 * @param custValue 客户对象
	 * @throws Exception
	 *
	 */
	private void savedeptLog(IVOCustValue custValue) throws Exception {
		String deptoldName = "";
		String deptName = "";
		long olddeptId = 0;
		long deptId = 0;
		long busiId = 0L;
		if (custValue.hasCustRel()) {
			ICustRelationshipValue[] custRelValues = custValue.getCustRels();
			ICustOrganizeValue oldcustOrgValue = new CustOrganizeBean();
			ICustOrganizeValue custOrgValue = new CustOrganizeBean();
			ICmGroupCustomerSV grpcustSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			if (custRelValues[0].isNew()) {
				for (int i = 0; i < custRelValues.length; i++) {
					deptId = custRelValues[i].getDeptId();
					custOrgValue = grpcustSV.queryGroupOrganizeByDeptId(deptId);
					if (custOrgValue != null) {
						deptName = custOrgValue.getDeptName();
						busiId = CmBusinessOperation.ASSIGN_BILL_DEPT;
						String[] info = new String[] { "Assign Bill: " + custRelValues[i].getBillId() + " To Department " + deptName };
						CmRecordLog.saveRecord(busiId, custRelValues[i].getCustId(), info);
					}
				}
			}
			if (custRelValues[0].isModified()) {
				for (int i = 0; i < custRelValues.length; i++) {
					olddeptId = Long.parseLong(custRelValues[i].getOldObj(ICustRelationshipValue.S_DeptId).toString());
					deptId = custRelValues[i].getDeptId();
					oldcustOrgValue = grpcustSV.queryGroupOrganizeByDeptId(olddeptId);
					custOrgValue = grpcustSV.queryGroupOrganizeByDeptId(deptId);
					if (oldcustOrgValue != null && custOrgValue != null) {
						deptoldName = oldcustOrgValue.getDeptName();
						deptName = custOrgValue.getDeptName();
						busiId = CmBusinessOperation.TRANSFER_BILL_DEPT;
						if (!deptName.equals(deptoldName)) {
							String[] info = new String[] { "Transfer Bill: " + custRelValues[i].getBillId() + " From Department " + deptoldName + " To Department " + deptName };
							CmRecordLog.saveRecord(busiId, custRelValues[i].getCustId(), info);
						}
					}
				}
			}
			if (custRelValues[0].isDeleted()) {
				for (int i = 0; i < custRelValues.length; i++) {
					deptId = custRelValues[i].getDeptId();
					custOrgValue = grpcustSV.queryGroupOrganizeByDeptId(deptId);
					if (custOrgValue != null) {
						deptName = custOrgValue.getDeptName();
						busiId = CmBusinessOperation.DELETE_BILL_DEPT;
						String[] info = new String[] { "Delete Bill: " + custRelValues[i].getBillId() + " From Department " + deptName };
						CmRecordLog.saveRecord(busiId, custRelValues[i].getCustId(), info);
					}
				}
			}
		}
	}

	/**   
	 * @Function sendNumberMember
	 * @Description 
	 *
	 * @param custRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-22 下午3:12:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-22     shitian             v1.0.0               修改原因<br>
	 */
	private void sendNumberMember(ICustRelationshipValue[] custRelValues) throws Exception {
		List memberRelList = new ArrayList();
		Map memberMap = null;
		for (int i = 0; i < custRelValues.length; i++) {
			if (custRelValues[i].getMemberType() == CmLnConstants.MemberStatus.NUMBER_MEMBER) {
				memberMap = new HashMap();
				memberMap.put("DEPART_ID", custRelValues[i].getDeptId());// 部门ID
				memberMap.put("USER_ID", custRelValues[i].getUserId());// 成员ID
				memberMap.put("VALID_DATE", custRelValues[i].getEffectiveDate());// 生效时间
				// memberMap.put("EXPIRE_DATE", custRelValues[i].getExpireDate());// 失效时间
				memberMap.put("DONE_CODE", custRelValues[i].getDoneCode());// 受理编码
				memberMap.put("CUST_ID", custRelValues[i].getCustId());// 客户ID
				if (custRelValues[i].isNew()) {
					memberMap.put("EXPIRE_DATE", custRelValues[i].getExpireDate());// 失效时间
					memberMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_ADD);// 操作类型（1：新增，3：删除）
				} else if (custRelValues[i].isModified()) {
					memberMap.put("EXPIRE_DATE", custRelValues[i].getExpireDate());// 失效时间
					// 先给list加入删除对象
					memberMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_DELETE);// 操作类型（1：新增，3：删除）
					// 删除老的关系
					memberMap.put("DEPART_ID", custRelValues[i].getOldObj(ICustRelationshipValue.S_DeptId));// 部门ID
					memberRelList.add(memberMap);

					// 在重新封装新增对象
					memberMap = new HashMap();
					memberMap.put("DEPART_ID", custRelValues[i].getDeptId());// 部门ID
					memberMap.put("USER_ID", custRelValues[i].getUserId());// 成员ID
					memberMap.put("VALID_DATE", custRelValues[i].getEffectiveDate());// 生效时间
					memberMap.put("EXPIRE_DATE", custRelValues[i].getExpireDate());// 失效时间
					memberMap.put("DONE_CODE", custRelValues[i].getDoneCode());// 受理编码
					memberMap.put("CUST_ID", custRelValues[i].getCustId());// 客户ID
					memberMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_ADD);// 操作类型（1：新增，3：删除）
				} else if (custRelValues[i].isDeleted()) {
					memberMap.put("EXPIRE_DATE", ServiceManager.getOpDateTime());// 失效时间
					memberMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_DELETE);// 操作类型（1：新增，3：删除）
				}
				memberRelList.add(memberMap);
			}
		}
		Map result = new HashMap();
		result.put("I_DEPART_RES", memberRelList);
		// 上发计费
		if (!result.isEmpty()) {
			CmServiceFactory.getTeamInvokeSV().sendMapOrderInfoToBilling(result);
		}
	}

	/**   
	 * 处理账户信息。主要是账户信息的维护。默认实现为调用账户业务处理Model。
	 * @Function dealAccounts
	 * @Description 
	 *
	 * @param custValue 客户对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:46:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealAccounts(IVOCustValue custValue) throws Exception {
		if (custValue.hasAccounts()) {
			IVOAccountValue[] accountValues = custValue.getAccounts();
			ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
			for (int i = 0; i < accountValues.length; i++) {
				// 暂时使用循环调用的方式处理，如有性能问题再优化
				accountSV.saveAccount(accountValues[i]);
			}
		}
	}

	/**   
	 * 处理联系人信息，负责联系人的增删改信息
	 * @Function dealContacts
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:31:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealContacts(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			long custId = custValue.getContacts()[0].getCustId();
			if (custId <= 0) {
				custValue.getContacts()[0].setCustId(custValue.getCustId());
			}
			CmCommonUtil.convertName(custValue.getContacts());
			/*
			 * 处理联系人的参与人信息
			 */
			dealParties(custValue);
			// 直接调用客户联系人管理的服务处理
			dealCustContacts(custValue);
			// CmServiceFactory.getContactSV().saveCustContact(custValue);
		}
	}

	/**   
	 * 处理联系人的参与人信息
	 * @Function dealParties
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-19 下午2:40:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealParties(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			ICmPartySV partySV = CmServiceFactory.getPartySV();
			for (int i = 0; i < contactValues.length; i++) {
				// 跳过删除的情况
				if (contactValues[i].isDeleted() || CmConstants.RecordState.ERASE.equalsIgnoreCase(contactValues[i].getState())) {
					continue;
				}
				IVOPartyValue ivoPartyValue = new VOPartyBean();
				IPartyValue partyValue = new PartyBean();
				partyValue.copy(contactValues[i]);
				if (contactValues[i].isNew()) {
					partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
				} else {
					partyValue.initProperty(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
				}
				IPartyContactValue partyContactValue = new PartyContactBean();
				partyContactValue.copy(contactValues[i]);

				ivoPartyValue.setParty(partyValue);
				ivoPartyValue.setPartyContact(partyContactValue);
				// 调用参与人处理model处理参与人信息
				partySV.saveParty(ivoPartyValue);
				contactValues[i].setPartyId(ivoPartyValue.getParty().getPartyId());
				contactValues[i].setContId(ivoPartyValue.getPartyContacts()[0].getContId());
			}
		}
	}

	/**   
	 * 处理客户与联系人关系
	 * @Function dealCustContacts
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:40:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void dealCustContacts(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			List<BOCmIndivContactBean> indivContactList = new ArrayList<BOCmIndivContactBean>();
			List<BOCmFamilyContactBean> familyContactList = new ArrayList<BOCmFamilyContactBean>();
			List<BOCmGroupContactBean> groupContactList = new ArrayList<BOCmGroupContactBean>();

			for (int i = 0; i < contactValues.length; i++) {
				if (contactValues[i].getCustId() <= 0) {
					continue;
				}
				switch (CmCommonUtil.getCustType(contactValues[i].getCustId())) {
					case CmConstants.CustomerType.INDIVIDUAL:
						BOCmIndivContactBean indivContactValue = new BOCmIndivContactBean();
						indivContactValue.copy(contactValues[i]);
						// add by shitian 解决联系人关系表新增，但是联系人信息不需要
						if (indivContactValue.getCustContId() <= 0) {
							indivContactValue.setCustContId(CmCommonUtil.getNewSequence(BOCmIndivContactBean.class));
							indivContactValue.setStsToNew();
						}
						indivContactList.add(indivContactValue);
						break;
					case CmConstants.CustomerType.FAMILY:
						BOCmFamilyContactBean familyContactValue = new BOCmFamilyContactBean();
						familyContactValue.copy(contactValues[i]);
						if (familyContactValue.getCustContId() <= 0) {
							familyContactValue.setCustContId(CmCommonUtil.getNewSequence(BOCmFamilyContactBean.class));
							familyContactValue.setStsToNew();
						}
						familyContactList.add(familyContactValue);
						break;
					case CmConstants.CustomerType.GROUP:
						BOCmGroupContactBean groupContactValue = new BOCmGroupContactBean();
						groupContactValue.copy(contactValues[i]);
						if (groupContactValue.getCustContId() <= 0) {
							groupContactValue.setCustContId(CmCommonUtil.getNewSequence(BOCmGroupContactBean.class));
							groupContactValue.setStsToNew();
						}
						groupContactList.add(groupContactValue);
						break;
					default:
						break;
				}
			}
			if (CmCommonUtil.isNotEmptyObject(indivContactList)) {
				BOCmIndivContactBean[] contactBeans = indivContactList.toArray(new BOCmIndivContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
				// 回设主键、日志信息等
				for (int i = 0; i < contactBeans.length; i++) {
					contactValues[i].setCreateDate(contactBeans[i].getCreateDate());
					contactValues[i].setDoneCode(contactBeans[i].getDoneCode());
					contactValues[i].setDoneDate(contactBeans[i].getDoneDate());
					contactValues[i].setOpId(contactBeans[i].getOpId());
					contactValues[i].setOrgId(contactBeans[i].getOrgId());
					contactValues[i].setEffectiveDate(contactBeans[i].getEffectiveDate());
					contactValues[i].setExpireDate(contactBeans[i].getExpireDate());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(familyContactList)) {
				BOCmFamilyContactBean[] contactBeans = familyContactList.toArray(new BOCmFamilyContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
				for (int i = 0; i < familyContactList.size(); i++) {
					// 回设主键、日志信息等
					contactValues[i].setCreateDate(contactBeans[i].getCreateDate());
					contactValues[i].setDoneCode(contactBeans[i].getDoneCode());
					contactValues[i].setDoneDate(contactBeans[i].getDoneDate());
					contactValues[i].setOpId(contactBeans[i].getOpId());
					contactValues[i].setOrgId(contactBeans[i].getOrgId());
					contactValues[i].setEffectiveDate(contactBeans[i].getEffectiveDate());
					contactValues[i].setExpireDate(contactBeans[i].getExpireDate());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(groupContactList)) {
				BOCmGroupContactBean[] contactBeans = groupContactList.toArray(new BOCmGroupContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
				for (int i = 0; i < groupContactList.size(); i++) {
					// 回设主键、日志信息等
					contactValues[i].setCreateDate(contactBeans[i].getCreateDate());
					contactValues[i].setDoneCode(contactBeans[i].getDoneCode());
					contactValues[i].setDoneDate(contactBeans[i].getDoneDate());
					contactValues[i].setOpId(contactBeans[i].getOpId());
					contactValues[i].setOrgId(contactBeans[i].getOrgId());
					contactValues[i].setEffectiveDate(contactBeans[i].getEffectiveDate());
					contactValues[i].setExpireDate(contactBeans[i].getExpireDate());
					// delete AO联系人需要记录交互记录
					if (CmConstants.GroupContType.AO_CONTACT == contactBeans[i].getContType()) {
						long busiId = 0L;
						if (contactBeans[i].isDeleted()) {
							busiId = CmBusinessOperation.CM_AO_CONTACT_DEL;
						}
						String[] objName = new String[] { "Administrator email:", "Administrator name:" + contactBeans[i].getCustContId() };
						CmRecordLog.saveRecord(busiId, contactBeans[i].getCustId(), objName);
					}
				}
			}
		}
	}

	/**   
	 * 处理客户经理信息，主要负责客户经理的增加删改操作.<br>
	 * 
	 * @Function dealCustManagers
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:47:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealCustManagers(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustManagers()) {
			ICustManagerValue[] custManagerValues = custValue.getCustManagers();
			List<BOCmIndivManagerBean> indivManagerValues = new ArrayList<BOCmIndivManagerBean>();
			List<BOCmGroupManagerBean> groupManagerValues = new ArrayList<BOCmGroupManagerBean>();
			for (int i = 0; i < custManagerValues.length; i++) {
				switch (CmCommonUtil.getCustType(custManagerValues[i].getCustId())) {
					case CmConstants.CustomerType.INDIVIDUAL:
						BOCmIndivManagerBean indivManagerValue = new BOCmIndivManagerBean();
						indivManagerValue.copy(custManagerValues[i]);
						indivManagerValues.add(indivManagerValue);
						break;
					case CmConstants.CustomerType.GROUP:
						BOCmGroupManagerBean groupManagerValue = new BOCmGroupManagerBean();
						groupManagerValue.copy(custManagerValues[i]);
						groupManagerValues.add(groupManagerValue);
						break;
					default:

						break;
				}
			}
			if (CmCommonUtil.isNotEmptyObject(indivManagerValues)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(indivManagerValues.toArray(new BOCmIndivManagerBean[0]));
				for (int i = 0; i < indivManagerValues.size(); i++) {
					// 回设主键、日志信息等
					BOCmIndivManagerBean managerBean = indivManagerValues.get(i);
					custManagerValues[i].setCreateDate(managerBean.getCreateDate());
					custManagerValues[i].setDoneCode(managerBean.getDoneCode());
					custManagerValues[i].setDoneDate(managerBean.getDoneDate());
					custManagerValues[i].setOpId(managerBean.getOpId());
					custManagerValues[i].setOrgId(managerBean.getOrgId());
					custManagerValues[i].setEffectiveDate(managerBean.getEffectiveDate());
					custManagerValues[i].setExpireDate(managerBean.getExpireDate());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(groupManagerValues)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(groupManagerValues.toArray(new BOCmGroupManagerBean[0]));
				for (int i = 0; i < groupManagerValues.size(); i++) {
					// 回设主键、日志信息等
					BOCmGroupManagerBean managerBean = groupManagerValues.get(i);
					custManagerValues[i].setCreateDate(managerBean.getCreateDate());
					custManagerValues[i].setDoneCode(managerBean.getDoneCode());
					custManagerValues[i].setDoneDate(managerBean.getDoneDate());
					custManagerValues[i].setOpId(managerBean.getOpId());
					custManagerValues[i].setOrgId(managerBean.getOrgId());
					custManagerValues[i].setEffectiveDate(managerBean.getEffectiveDate());
					custManagerValues[i].setExpireDate(managerBean.getExpireDate());
				}
			}
		}
	}

	/**   
	 * 处理客户信息。包含客户信息的增删改操作。
	 * @Function dealCustomer
	 * @Description 
	 *
	 * @param custValue 客户对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:26:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public void dealCustomer(IVOCustValue custValue) throws Exception {
		if (custValue.getCustomer() != null) {
			// 取当前系统中具体类型客户BOBean配置信息
			IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custValue.getCustType()));
			if (staticDataValue == null) {
				/*
				 * 不存在类型为{0}的客户。
				 */
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030044", String.valueOf(custValue.getCustType())));
				}
				ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custValue.getCustType()));
			}
			// 检查具体类型客户的BOBean是否正确配置
			if (StringUtils.isBlank(staticDataValue.getExternCodeType()) || !staticDataValue.getExternCodeType().endsWith("Bean")) {
				// 系统参数错误：没有获取到编码为[{0}]的静态数据配置！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030043", CmConstants.CmStaticDataCodeType.CUST_TYPE));
				}
				ExceptionUtil.throwBusinessException("CMS0030043", CmConstants.CmStaticDataCodeType.CUST_TYPE);
			}

			/*
			 * 处理客户信息
			 */
			ICustomerValue customerValue = custValue.getCustomer();
			if (customerValue.isNew()) {
				// 新增时候才校验，修改时候不能修改为已经存在的客户
				long oldCustId = validateUniqueCustomer(custValue);
				if (oldCustId > 0) {
					customerValue.setCustId(oldCustId);
				}
			}
			DataContainerInterface customerDC = DataContainerFactory.createDataContainerInstance(Class.forName(staticDataValue.getExternCodeType().trim()), null);
			customerDC.copy(customerValue);

			// 保存客户信息
			if (customerDC.isDeleted() || customerDC.isModified() || customerDC.isNew()) {
				
				//AI-10847判断客户状态的在修改时，是不是从active 变成  prospect，如果是，在抛出异常。客户状态，不能从active 变成 former
				if(customerDC.isModified()) {
					String oldCustStatus = DataType.getAsString(customerDC.getOldObj("CUST_STATUS"));
					if(CmConstants.CustomerStatus.INDIV_POTENTIAL == customerDC.getAsInt(ICustomerValue.S_CustStatus)&&"1".equals(oldCustStatus)) {
						ExceptionUtil.throwBusinessException("CMS8900116", CmConstants.CmStaticDataCodeType.CUST_TYPE);
					}
				}

				// 如果是修改，需要插入工单表，同步客户信息
				if (customerDC.isModified()) {
					ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					IBOCmPsPublicDealValue psPublicDealValue = new BOCmPsPublicDealBean();
					psPublicDealValue.setEntityId(customerValue.getCustId());
					psPublicDealValue.setPartyId(customerValue.getPartyId());
					psPublicDealValue.setEntityType(CmConstants.EntityType.CUSTOMER);
					psPublicDealValue.setExecAction(CmConstants.PsPublicAction.PUBLIC_INFO_SYS);
					requestTaskSV.savePublicWordOrder(psPublicDealValue);
				}
				// modify at 2015-7-6 新增时去除cust_service_id
				if (customerDC.isNew()) {
					customerDC.set(ICustomerValue.S_CustServiceId, "");
				}
				// 针对并发校验客户唯一性
				if (TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_21)) {
					long custId = customerDC.getAsLong("CUST_ID");
					if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId)) {
						String birth = customerDC.getAsString("BIRTHDAY");
						String custName = customerDC.getAsString("CUST_NAME");
						if (custId > 0 && StringUtils.isNotBlank(birth) && StringUtils.isNotBlank(custName)) {
							if (customerDC.isNew()) {
								validateUniqueCustomer(custId, custName, birth);
							} else if (customerDC.isModified()) {
								// 修改的时候只有客户名称和生日变化了去校验客户的唯一性
								String oldCustName = DataType.getAsString(customerDC.getOldObj("CUST_NAME"));
								String oldBirth = DataType.getAsString(customerDC.getOldObj("BIRTHDAY"));
								if ((!birth.equalsIgnoreCase(oldBirth)) || (!custName.equalsIgnoreCase(oldCustName))) {
									validateUniqueCustomer(custId, custName, birth);
								}
							}
						}
					}
				}
				// 如果是修改名称或者生日,重新送CPR
				if (customerDC.isModified() && customerValue.getCustStatus() != CmConstants.CustomerStatus.INDIV_INACTIVE && customerValue.getCustStatus() != CmConstants.CustomerStatus.INDIV_POTENTIAL) {
					long custId = customerDC.getAsLong("CUST_ID");
					ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					IBOCmCustRequestTaskValue[] taskValues = requestTaskSV.queryByCustId(custId);
					if (taskValues != null && taskValues.length > 0 && custId != CmConstants.ANONYMOUS_CUST_ID) {
						String birth = customerDC.getAsString("BIRTHDAY");
						String custName = customerDC.getAsString("CUST_NAME");
						String oldCustName = DataType.getAsString(customerDC.getOldObj("CUST_NAME"));
						String oldBirth = DataType.getAsString(customerDC.getOldObj("BIRTHDAY"));
						if ((StringUtils.isNotBlank(birth) && !birth.equalsIgnoreCase(oldBirth))
								|| (StringUtils.isNotBlank(custName) && !custName.equalsIgnoreCase(oldCustName))) {
							taskValues[0].setRequestStatus("C");
							taskValues[0].setStatusDate(DataTypeUtils.getCurrentDate());
							taskValues[0].setResults("");
							requestTaskSV.saveCmCustRequestTask(taskValues[0]);
						}
					}
				}
				//creditLevel处理逻辑
				//CR370  AI-9136
				changeCreditLevel(customerDC,customerValue);
				
				//CR372 增加调用UAPI接口，CPR consent retraction
				IUip2CmSV uip2CmSv = (IUip2CmSV)ServiceFactory.getService(IUip2CmSV.class);
				uip2CmSv.retractCprPermission(customerValue);
				 				
				CmInnerServiceFactory.getCommonInnerSV().saveBean(customerDC);
				
				//如果客户状态变成former或者teminate ，就失效监护人关系表 
				dealCustIndivContact(customerDC);
				
				// 回设到参数中
				customerValue.setCreateDate(customerDC.getAsDateTime(ICustomerValue.S_CreateDate));
				customerValue.setDoneCode(customerDC.getAsLong(ICustomerValue.S_DoneCode));
				customerValue.setDoneDate(customerDC.getAsDateTime(ICustomerValue.S_DoneDate));
				customerValue.setOpId(customerDC.getAsLong(ICustomerValue.S_OpId));
				customerValue.setOrgId(customerDC.getAsLong(ICustomerValue.S_OrgId));
				customerValue.setEffectiveDate(customerDC.getAsDateTime(ICustomerValue.S_EffectiveDate));
				customerValue.setExpireDate(customerDC.getAsDateTime(ICustomerValue.S_ExpireDate));
			}
		}
	}

	/**
	 * creditLevel处理逻辑
	 * @param customerDC
	 */
	public void changeCreditLevel(DataContainerInterface customerDC,ICustomerValue customerValue) throws Exception{
		if(log.isInfoEnabled()) {
			log.info("=======into ===changeCreditLevel=="+String.valueOf(customerDC.getOldObj(ICustomerValue.S_CustStatus)));
		}
		//判断客户状态，如果客户状态为2 Former，则将credit level设置为空。
		//GVS-276 AI-9570
		if(null!=customerDC.getOldObj(ICustomerValue.S_CustStatus)&&!(String.valueOf(customerDC.getOldObj(ICustomerValue.S_CustStatus)).equals(customerDC.getAsString(ICustomerValue.S_CustStatus)))&&CmConstants.CustomerStatus.INDIV_INACTIVE ==customerDC.getAsInt(ICustomerValue.S_CustStatus)){
			if(log.isInfoEnabled()) {
				log.info("=======into ===changeCreditLevel= custStatus="+customerDC.getAsInt(ICustomerValue.S_CustStatus)+"====send credit level is null");
			}
			customerDC.set(ICustomerValue.S_CreditLevel, null);
			customerValue.setCreditLevel(null);
		}
	}
	
	public void dealCustIndivContact(DataContainerInterface customerDC) throws Exception{
		long custId = customerDC.getAsLong(ICustomerValue.S_CustId);
		long custStatus = customerDC.getAsInt(ICustomerValue.S_CustStatus);
		
		if (CmConstants.CustomerStatus.INDIV_INACTIVE == custStatus||CmConstants.CustomerStatus.INDIV_TERMINATED == custStatus) {
			ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			contactSV.expireCustomerAndContactRela(custId);
		}
	}
	
	/*
	 * 检验客户的唯一性
	 */
	private void validateUniqueCustomer(long custId, String custName, String birth) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 查询地址信息
		IBOCmCustContactMediumValue mediumValue = custSV.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
		if (CmCommonUtil.isNotEmptyObject(mediumValue)) {
			CmCommonUtil.judgeDuplicateCustomer(custId, birth, mediumValue.getAddressId(), mediumValue.getAddressDetail(), custName);
		}
	}

	/**   
	 * @Function validateUniqueCustomer
	 * @Description 校验客户是否有重复，如果有直接使用数据库中的客户，并用前台录入的信息更新原始客户
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-4 上午11:23:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-4     shitian             v1.0.0               修改原因<br>
	 */
	private long validateUniqueCustomer(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null && customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
			long custId = customerValue.getCustId();
			long partyId = customerValue.getPartyId();
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmCustContactMediumValue[] addressValues = service.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
			if (addressValues != null && addressValues.length > 0 && StringUtils.isNotBlank(customerValue.getCustName()) && null != customerValue.getBirthday()) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				dateFormat.format(customerValue.getBirthday());
				IBOCmIndivCustomerValue[] tempCust = service.queryCmCustByCustInfoAndAddress(customerValue.getCustName(), dateFormat.format(customerValue.getBirthday()),
						addressValues[0].getAddressId(), -1);
				if (tempCust != null && tempCust.length > 0) {
					// 已经存在同名，同生日，同法律地址的客户，不用再创建客户
					IBOCmIndivCustomerValue tempIndiv = null;
					// 避免一开始party合并时候获取到的老的partyId和客户合并时候取的数组第一个客户的partyId不一致
					for (int i = 0; i < tempCust.length; i++) {
						if (partyId == tempCust[i].getPartyId()) {
							tempIndiv = tempCust[i];
						}
					}
					if (tempIndiv == null) {
						// party没有合并到，或者party是一个纯payer
						tempIndiv = tempCust[0];
					}
					long tempCustId = tempIndiv.getCustId();
					ICustomerValue originalCustomer = service.queryCustomerByCustId(tempCustId);
					String indivCustType = customerValue.getIndivCustType();
					String origianlIndivCustType = originalCustomer.getIndivCustType();
					boolean overrideCertCode = false;
					if (StringUtils.isBlank(originalCustomer.getCustCertCode())) {
						overrideCertCode = true;
					}
					DataContainerFactory.copyNoClearData(customerValue, originalCustomer);
					customerValue.copy(originalCustomer);
					customerValue.setCustId(tempCustId);
					if (origianlIndivCustType.equals(String.valueOf(CmConstants.PartyRoleType.CUSTOMER))) {
						customerValue.setIndivCustType(origianlIndivCustType);
					}
					// 当前创建的是客户的时候才覆盖这个个人子类型
					if (indivCustType.equals(String.valueOf(CmConstants.PartyRoleType.CUSTOMER))) {
						customerValue.setIndivCustType(indivCustType);
						// 如果存在的同名，同生日，同法律地址的客户是员工或者使用者，需要默认创建细分
						if (!tempIndiv.getIndivCustType().equals(String.valueOf(CmConstants.PartyRoleType.CUSTOMER))) {
							ICmCustSegmentRelaSV segmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
							IBOCmCustSegmentRelaValue segmentRelaValue = segmentRelaSV.querySegmentRelaByCustId(tempCustId);
							if (segmentRelaValue == null) {
								segmentRelaValue = new BOCmCustSegmentRelaBean();
								segmentRelaValue.setCustId(tempCustId);
								segmentRelaValue.setSegmentId(Long.valueOf(CmConstants.segment.NEW));
								segmentRelaSV.saveSegmentRela(segmentRelaValue);
							}
						}
					}
					DataContainer dc = new DataContainer();
					dc.copy(customerValue);
					CmCommonUtil.initDcProperties(dc);
					customerValue.copy(dc);
					// 新增的时候cpr不能入库
					if (overrideCertCode) {
						customerValue.setCustCertCode(null);
					} else {
						customerValue.setCustCertType(CmConstants.CertificateType.CPR);
					}
					// 处理客户扩展信息
					IBOCmxIndivCustomerValue BoCmxIndivCustomerBean = new BOCmxIndivCustomerBean();
					DataContainerInterface indivEXInfoDC = (DataContainerInterface) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
					if (indivEXInfoDC != null) {
						BoCmxIndivCustomerBean.copy(indivEXInfoDC);
					}
					DataContainerFactory.copyNoClearData(customerValue, BoCmxIndivCustomerBean);
					if (originalCustomer.getPnr() > 0) {
						BoCmxIndivCustomerBean.setPnr(originalCustomer.getPnr());
					}
					custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, BoCmxIndivCustomerBean);
					custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);

					// 删除以前的法律地址
					addressValues[0].delete();
					service.saveCustContMedium(new IBOCmCustContactMediumValue[] { addressValues[0] });

					// 删除以前的细分关系
					IBOCmCustSegmentRelaValue segmentRela = (IBOCmCustSegmentRelaValue) custValue.getUserObject("cmSegmentRela");
					if (segmentRela != null) {
						segmentRela.delete();
					}

					// 更新以前的联系媒介为当前已经存在的客户ID
					if (custValue.hasCustContMedium()) {
						IBOCmCustContactMediumValue[] contactMediumValues = custValue.getCustContMedium();
						for (int i = 0; i < contactMediumValues.length; i++) {
							contactMediumValues[i].setCustId(tempCustId);
						}
					} else {
						IQBOCmCustContMediumAndTypeValue[] custContMediumAndTypeValues = service.queryCustContactMediums(custId, -1, -1, -1, -1);
						List resultList = new ArrayList();
						if (custContMediumAndTypeValues != null && custContMediumAndTypeValues.length > 0) {
							IBOCmCustContactMediumValue custContactMediumValue = null;
							for (int i = 0; i < custContMediumAndTypeValues.length; i++) {
								custContMediumAndTypeValues[i].setCustId(tempCustId);
								custContactMediumValue = new BOCmCustContactMediumBean();
								custContactMediumValue.copy(custContMediumAndTypeValues[i]);
								resultList.add(custContactMediumValue);
							}
							service.saveCustContMedium((IBOCmCustContactMediumValue[]) resultList.toArray(new IBOCmCustContactMediumValue[0]));
						}
					}

					// 更新客户关系，如集团成员关系表中的memberCustId
					if (custValue.hasCustRel()) {
						ICustRelationshipValue[] custRelValues = custValue.getCustRels();
						for (int i = 0; i < custRelValues.length; i++) {
							if (custRelValues[i].getRelationType() == CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER) {
								custRelValues[i].setMemberCustId(tempCustId);
							}
						}

					}

					// 更新partyRole中的entityId
					IVOPartyValue partyValue = custValue.getParty();
					if (partyValue != null) {
						if (custValue.getParty().hasPartyRoles()) {
							List<BOCmPartyRoleBean> list = new ArrayList<BOCmPartyRoleBean>();
							IPartyRoleValue[] partyRoleValues = partyValue.getPartyRoles();
							for (int i = 0; i < partyRoleValues.length; i++) {
								BOCmPartyRoleBean cmPartyRoleValue = new BOCmPartyRoleBean();
								cmPartyRoleValue.copy(partyRoleValues[i]);
								cmPartyRoleValue.setStsToOld();
								cmPartyRoleValue.setEntityId(tempCustId);
								list.add(cmPartyRoleValue);
							}
							CmInnerServiceFactory.getCommonInnerSV().saveBeans(list.toArray(new BOCmPartyRoleBean[0]));
						}
					}
					return tempCustId;
				}
			}

		}
		return 0;
	}

	/**   
	 * @Function dealCustAddress
	 * @Description 处理客户地址联系媒介信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:29:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	private void dealCustAddress(IVOCustValue custValue) throws Exception {
		/*
		 * // modify at 2015-06-25 集团类型为1和8时，默认塞一个法律地址
		 * if (custValue.getCustomer() != null && CmCommonUtil.getCustType(custValue.getCustomer().getCustId()) ==
		 * CmConstants.CustomerType.GROUP) {
		 * if (custValue.getCustomer().isNew() && (custValue.getCustomer().getGroupType() == 1 ||
		 * custValue.getCustomer().getGroupType() == 8)) {
		 * ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		 * IBOCmCustContactMediumValue contactMediumValue = new BOCmCustContactMediumBean();
		 * contactMediumValue.setAddressId(100000L);
		 * contactMediumValue.setContMedTypeId(11L);
		 * contactMediumValue.setCustId(custValue.getCustomer().getCustId());
		 * contactMediumValue.setRegionId(custValue.getCustomer().getRegionId());
		 * contactMediumValue.setAddressDetail("addressDefault");
		 * customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contactMediumValue });
		 * }
		 * }
		 */

		if (custValue.hasCustAddress()) {
			IVOCustAddressValue[] voCustAddressValues = custValue.getCustAddress();
			address addr = null;
			IBOCmCustContactMediumValue contMedium = null;
			List contMediumList = new ArrayList();
			IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			// 保存地址，获取地址ID
			for (int i = 0; i < voCustAddressValues.length; i++) {
				addr = voCustAddressValues[i].getAddress();
				contMedium = voCustAddressValues[i].getContMedium();
				// 默认塞一些地址的值
				if (null != addr) {
					if(StringUtils.isBlank(String.valueOf(custValue.getUserObject("CREATE_PUREUSER_FLAG")))||"null".equalsIgnoreCase(String.valueOf(custValue.getUserObject("CREATE_PUREUSER_FLAG")))){
						addr.setAddressType(CmConstants.Address.ADDRESSTYPE);
						addr.setDistrictId(CmConstants.Address.DISTRICTID);
					}
				}
				if (contMedium.isDeleted()) {
					contMediumList.add(contMedium);
					continue;
				}
				if (contMedium.getCustContRelaId() <= 0) {
					// 属于新建
					long contRelaId = CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class);
					contMedium.setCustContRelaId(contRelaId);
					contMedium.setCustId(custValue.getCustId());
					contMedium.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
				long addressId = addrService.saveAddress(addr);
				contMedium.setAddressId(addressId);
				// 获取地址详细信息存储到媒介表中
				address realAddress = addrService.getAddress(addressId, CmConstants.Address.DISTRICTID);
				contMedium.setAddressDetail(realAddress.getAddrDesc());
				// 校验地址联系媒介
				validateAddrContMedium(contMedium);
				contMediumList.add(contMedium);
			}
			// 保存联系媒介
			if (!contMediumList.isEmpty()) {
				customerSV.saveCustContMedium((IBOCmCustContactMediumValue[]) contMediumList.toArray(new IBOCmCustContactMediumValue[0]));
			}
		}
	}

	/**   
	 * @Function dealCustContMedium
	 * @Description 处理客户联系媒介信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 下午3:58:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public void dealCustContMedium(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustContMedium()) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmCustContactMediumValue[] custContMedius = custValue.getCustContMedium();
			for (int i = 0; i < custContMedius.length; i++) {
				if (custContMedius[i].isNew()) {
					custContMedius[i].setCustId(custValue.getCustId());
					if (StringUtils.isBlank(custContMedius[i].getRegionId())) {
						custContMedius[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
				}
			}
			customerSV.saveCustContMedium(custContMedius);
		}
	}

	/**   
	 * 处理客户组织结构
	 * @Function dealCustOrganize
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:53:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	/**
	 * @param custValue
	 * @throws Exception
	 */
	private void dealCustOrganize(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustOrganize()) {
			ICustOrganizeValue[] organizeValues = custValue.getCustOrganizes();
			List orgStructLists = new LinkedList();
			for (int i = 0; i < organizeValues.length; i++) {
				BOCmGroupOrgStructBean orgStructValue = new BOCmGroupOrgStructBean();
				orgStructValue.copy(organizeValues[i]);
				orgStructLists.add(orgStructValue);

				long parentDeptId = orgStructValue.getParentDeptId();
				BOCmGroupOrgStructBean parentStructBean = new BOCmGroupOrgStructBean();
				parentStructBean.setDeptId(parentDeptId);
				parentStructBean.setRegionId(orgStructValue.getRegionId());
				parentStructBean.setDeptType(orgStructValue.getDeptType());
				parentStructBean.initDeptId(parentDeptId);
				parentStructBean.initRegionId(orgStructValue.getRegionId());
				parentStructBean.initDeptType(orgStructValue.getDeptType());
				if (orgStructValue.isNew()) {
					if (parentDeptId > 0) {
						// 新增子节点时，需要修改父组织的HAS_LEAF属性为"是"
						parentStructBean.setHasLeaf(1);
						parentStructBean.initHasLeaf(1);
						orgStructLists.add(parentStructBean);
					}
				} else if (orgStructValue.isDeleted()) {
					// 删除时，如果父组织下已经没有其他子节点，则修改父组织的HAS_LEAF属性为"否"
					ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
					ICustOrganizeValue[] values = dkCustomerSV.queryCustOrganizesByParentId(parentDeptId, (int) orgStructValue.getDeptType(), -1, -1);
					if (!CmCommonUtil.isNotEmptyObject(values) || (values.length == 1 && values[0].getDeptId() == orgStructValue.getDeptId())) { // 不包含子节点信息或者有一个子节点就是当前要删除的这个
						parentStructBean.setHasLeaf(0);
						parentStructBean.initHasLeaf(0);
						orgStructLists.add(parentStructBean);
					}
				}

				// add by shitian 处理子公司的逻辑操作
				validateGroupSubCompany(organizeValues[i]);
				orgStructValue.copy(organizeValues[i]);
			}
			BOCmGroupOrgStructBean[] orgStructValues = (BOCmGroupOrgStructBean[]) orgStructLists.toArray(new BOCmGroupOrgStructBean[0]);
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(orgStructValues);

			// 回设到参数中
			for (int i = 0; i < organizeValues.length; i++) {
				// 回设主键、日志信息等
				organizeValues[i].setCreateDate(orgStructValues[i].getCreateDate());
				organizeValues[i].setDoneCode(ServiceManager.getDoneCode());
				organizeValues[i].setDoneDate(orgStructValues[i].getDoneDate());
				organizeValues[i].setOpId(orgStructValues[i].getOpId());
				organizeValues[i].setOrgId(orgStructValues[i].getOrgId());
				if (organizeValues[i].getEffectiveDate() == null) {
					if (orgStructValues[i].isNew()) {
						organizeValues[i].setEffectiveDate(orgStructValues[i].getCreateDate());
					} else {
						organizeValues[i].setEffectiveDate(orgStructValues[i].getEffectiveDate());
					}
				}

				organizeValues[i].setExpireDate(orgStructValues[i].getExpireDate());
				if (orgStructValues[i].isDeleted()) {
					organizeValues[i].setExpireDate(ServiceManager.getOpDateTime());
				}

				// add by shitian 集团组织结构差异结果
				dealGroupOrgDiffer(custValue, orgStructValues[i]);
			}
			// 上发集团部门信息
			sendGroupDeptInfo(orgStructValues);
		}
	}

	private void sendGroupDeptInfo(BOCmGroupOrgStructBean[] orgStructValues) throws Exception {
		List deptRelList = new ArrayList();
		Map deptMap = null;
		ICustOrganizeValue organizeValue = null;
		if (orgStructValues != null && orgStructValues.length > 0) {
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			organizeValue = dkCustomerSV.queryCustRootOrganize(orgStructValues[0].getCustId());
			for (int i = 0; i < orgStructValues.length; i++) {
				if (orgStructValues[i].getDeptType() == CmConstants.CustomerOrg.DEPARTMENT) {
					deptMap = new HashMap();
					deptMap.put("DEPART_ID", orgStructValues[i].getDeptId());// 部门ID
					deptMap.put("PARENT_DEPART_ID", orgStructValues[i].getParentDeptId());// 父部门ID
					if (organizeValue != null) {
						deptMap.put("TOP_DEPART_ID", organizeValue.getDeptId());// 顶层部门ID
					}
					// deptMap.put("EXPIRE_DATE", orgStructValues[i].getExpireDate());// 失效时间
					deptMap.put("DONE_CODE", ServiceManager.getDoneCode());// 受理编码
					deptMap.put("CUST_ID", orgStructValues[i].getCustId());// 客户ID
					deptMap.put("DONE_DATE", ServiceManager.getOpDateTime());// 客户ID
					if (orgStructValues[i].isNew()) {
						deptMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_ADD);// 操作类型（1：新增，3：删除）
						deptMap.put("EXPIRE_DATE", orgStructValues[i].getExpireDate());// 失效时间
						deptMap.put("VALID_DATE", orgStructValues[i].getEffectiveDate());// 生效时间
					} else if (orgStructValues[i].isModified()) {
						// 只有修改了父部门才上发
						if (orgStructValues[i].getOldObj(ICustOrganizeValue.S_ParentDeptId) != null
								&& Long.parseLong(String.valueOf(orgStructValues[i].getOldObj(ICustOrganizeValue.S_ParentDeptId))) != orgStructValues[i].getParentDeptId()) {
							// 先给list加入新增对象
							deptMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_ADD);// 操作类型（1：新增，3：删除）
							deptMap.put("EXPIRE_DATE", orgStructValues[i].getExpireDate());// 失效时间
							deptMap.put("VALID_DATE", orgStructValues[i].getDoneDate());// 生效时间
							deptRelList.add(deptMap);

							// 在重新封装删除对象
							deptMap = new HashMap();
							deptMap.put("DEPART_ID", orgStructValues[i].getDeptId());// 部门ID
							deptMap.put("PARENT_DEPART_ID", Long.parseLong(String.valueOf(orgStructValues[i].getOldObj(ICustOrganizeValue.S_ParentDeptId))));// 父部门ID
							if (organizeValue != null) {
								deptMap.put("TOP_DEPART_ID", organizeValue.getDeptId());// 顶层部门ID
							}
							deptMap.put("VALID_DATE", orgStructValues[i].getEffectiveDate());// 生效时间
							deptMap.put("EXPIRE_DATE", orgStructValues[i].getDoneDate());// 失效时间
							deptMap.put("DONE_CODE", ServiceManager.getDoneCode());// 受理编码
							deptMap.put("CUST_ID", orgStructValues[i].getCustId());// 客户ID
							deptMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_DELETE);// 操作类型（1：新增，3：删除）
						} else {
							continue;
						}
					} else if (orgStructValues[i].isDeleted()) {
						deptMap.put("OPER_TYPE", CmConstants.RequestType.BILLING_DELETE);// 操作类型（1：新增，3：删除）
						deptMap.put("VALID_DATE", orgStructValues[i].getCreateDate());// 生效时间
						deptMap.put("EXPIRE_DATE", ServiceManager.getOpDateTime());// 失效时间
					}
					deptRelList.add(deptMap);
				}
			}

			Map result = new HashMap();
			result.put("I_DEPART_REL", deptRelList);
			// 上发计费
			if (!result.isEmpty()) {
				CmServiceFactory.getTeamInvokeSV().sendMapOrderInfoToBilling(result);
			}
		}
	}

	private void dealGroupOrgDiffer(IVOCustValue custValue, BOCmGroupOrgStructBean orgStructValue) throws Exception {
		// add by zhuyy 集团组织结构差异结果
		if (orgStructValue.getDeptType() == CmConstants.CustomerOrg.SUB_COMPANY) {
			if (custValue.getUserObject("oldData") != null) {
				IBOCmGroupOrgDifferValue oldData = (BOCmGroupOrgDifferBean) custValue.getUserObject("oldData");
				BOCmGroupOrgDifferBean groupOrgDiffer = new BOCmGroupOrgDifferBean();
				groupOrgDiffer.setDifferId(BOCmGroupOrgDifferEngine.getNewId().longValue());
				groupOrgDiffer.setDeptId(orgStructValue.getDeptId());
				groupOrgDiffer.setImportParentDeptId(orgStructValue.getParentDeptId());// 修改后的上级部门编号
				if (oldData.getParentDeptId() > 0) {
					groupOrgDiffer.setParentDeptId(oldData.getParentDeptId());// 修改前上级部门编号
				} else {
					groupOrgDiffer.setParentDeptId(orgStructValue.getDeptId());
				}
				groupOrgDiffer.setCustId(orgStructValue.getRelCustId());
				ICustOrganizeValue importParentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeByParentDeptId(orgStructValue.getParentDeptId());
				String importCustServiceId = "";
				if (importParentOrg != null) {
					groupOrgDiffer.setImportParentCustId(importParentOrg.getCustId());// 修改后的上级集团客户编号
					ICustomerValue importParentCustomer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(importParentOrg.getCustId());
					importCustServiceId = importParentCustomer.getCustServiceId();
				}
				if (oldData.getParentCustId() > 0) {
					groupOrgDiffer.setParentCustId(oldData.getParentCustId());// 修改前的上级集团客户编号
				} else {
					groupOrgDiffer.setParentCustId(orgStructValue.getRelCustId());
				}
				groupOrgDiffer.setCustServiceId(oldData.getCustServiceId());
				groupOrgDiffer.setParentCustservId(oldData.getParentCustservId());
				groupOrgDiffer.setImportParentCustservId(importCustServiceId);
				groupOrgDiffer.setImportSource("KOB");
				groupOrgDiffer.setImportDate(new Timestamp(System.currentTimeMillis()));
				groupOrgDiffer.setIsAlert(0);
				groupOrgDiffer.setProcessStatus(2);// 2:已变更
				groupOrgDiffer.setState(CmConstants.RecordState.USE);
				groupOrgDiffer.setCreateOpId(orgStructValue.getCreateOpId());
				groupOrgDiffer.setCreateOrgId(orgStructValue.getCreateOrgId());
				groupOrgDiffer.setOpId(ResUserInfo.getOpId());
				groupOrgDiffer.setOrgId(ResUserInfo.getOrgId());
				groupOrgDiffer.setDoneCode(orgStructValue.getDoneCode());
				groupOrgDiffer.setCreateDate(new Timestamp(System.currentTimeMillis()));
				groupOrgDiffer.setDoneDate(new Timestamp(System.currentTimeMillis()));
				groupOrgDiffer.setEffectiveDate(orgStructValue.getEffectiveDate());
				groupOrgDiffer.setExpireDate(orgStructValue.getExpireDate());
				BOCmGroupOrgDifferEngine.save(groupOrgDiffer);
				// 组织层级变更时同步层级给权限
				/*
				 * if (!groupOrgDiffer.isModified()) {
				 * IBOSecOrganizeValue val = OrgmodelClient.getOrganizeByOrgId(orgStructValue.getDeptId());
				 * if (val != null) {
				 * val.setParentOrganizeId(orgStructValue.getParentDeptId());
				 * val.setDoneDate(ServiceManager.getOpDateTime());
				 * OrgmodelClient.updateSecOrganize(val);
				 * }
				 * }
				 */
			}

			// 同步组织层级给billing
			Map custMap = new HashMap();
			if (orgStructValue.isModified()) {
				if (orgStructValue.getRelCustId() != DataType.getAsLong(orgStructValue.getOldObj("REL_CUST_ID"))) {// 修改子公司
					Map newCustMap = new HashMap();
					Map oldCustMap = new HashMap();
					newCustMap.put("CUST_ID", orgStructValue.getRelCustId());
					newCustMap.put("TOP_CUST_ID", orgStructValue.getCustId());
					ICustOrganizeValue importParentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(orgStructValue.getParentDeptId());
					if (importParentOrg != null) {
						newCustMap.put("PARENT_CUST_ID", importParentOrg.getRelCustId());
					}
					newCustMap.put("OPER_TYPE", "1");
					newCustMap.put("VALID_DATE", orgStructValue.getDoneDate());
					newCustMap.put("EXPIRE_DATE", orgStructValue.getExpireDate());
					newCustMap.put("DONE_CODE", ServiceManager.getDoneCode());
					newCustMap.put("DONE_DATE", orgStructValue.getDoneDate());
					oldCustMap.put("CUST_ID", DataType.getAsLong(orgStructValue.getOldObj("REL_CUST_ID")));
					oldCustMap.put("TOP_CUST_ID", DataType.getAsLong(orgStructValue.getOldObj("CUST_ID")));
					ICustOrganizeValue oldParentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(DataType.getAsLong(orgStructValue.getOldObj("PARENT_DEPT_ID")));
					if (oldParentOrg != null) {
						oldCustMap.put("PARENT_CUST_ID", oldParentOrg.getRelCustId());
						oldCustMap.put("VALID_DATE", oldParentOrg.getEffectiveDate());
					}
					oldCustMap.put("OPER_TYPE", "3");
					oldCustMap.put("EXPIRE_DATE", orgStructValue.getDoneDate());
					oldCustMap.put("DONE_CODE", ServiceManager.getDoneCode());
					oldCustMap.put("DONE_DATE", orgStructValue.getDoneDate());
					List mspList = new ArrayList();
					mspList.add(newCustMap);
					mspList.add(oldCustMap);
					custMap.put("I_CUST_REL", mspList);
				} else if ((orgStructValue.getCustId() != DataType.getAsLong(orgStructValue.getOldObj("CUST_ID")))
						&& (DataType.getAsLong(orgStructValue.getOldObj("CUST_ID")) == orgStructValue.getRelCustId())) {// 新增加子公司
					Map map = new HashMap();
					map.put("CUST_ID", orgStructValue.getRelCustId());
					map.put("TOP_CUST_ID", orgStructValue.getCustId());
					ICustOrganizeValue parentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(orgStructValue.getParentDeptId());
					if (parentOrg != null) {
						map.put("PARENT_CUST_ID", parentOrg.getRelCustId());
					}
					map.put("OPER_TYPE", "1");
					map.put("VALID_DATE", orgStructValue.getDoneDate());
					map.put("EXPIRE_DATE", orgStructValue.getExpireDate());
					map.put("DONE_CODE", ServiceManager.getDoneCode());
					map.put("DONE_DATE", orgStructValue.getDoneDate());
					List mspList = new ArrayList();
					mspList.add(map);
					custMap.put("I_CUST_REL", mspList);
				} else if ((orgStructValue.getCustId() != DataType.getAsLong(orgStructValue.getOldObj("CUST_ID"))) && (orgStructValue.getCustId() == orgStructValue.getRelCustId())) {// 拆分处理
					Map map = new HashMap();
					map.put("CUST_ID", orgStructValue.getRelCustId());
					map.put("TOP_CUST_ID", DataType.getAsLong(orgStructValue.getOldObj("CUST_ID")));
					ICustOrganizeValue parentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(DataType.getAsLong(orgStructValue.getOldObj("PARENT_DEPT_ID")));
					if (parentOrg != null) {
						map.put("PARENT_CUST_ID", parentOrg.getRelCustId());
					}
					map.put("OPER_TYPE", "3");
					map.put("VALID_DATE", orgStructValue.getEffectiveDate());
					map.put("EXPIRE_DATE", ServiceManager.getOpDateTime());
					map.put("DONE_CODE", ServiceManager.getDoneCode());
					map.put("DONE_DATE", orgStructValue.getDoneDate());
					List mspList = new ArrayList();
					mspList.add(map);
					custMap.put("I_CUST_REL", mspList);
				}
			} else if (orgStructValue.isNew()) {
				Map map = new HashMap();
				map.put("CUST_ID", orgStructValue.getRelCustId());
				map.put("TOP_CUST_ID", orgStructValue.getCustId());
				ICustOrganizeValue parentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(orgStructValue.getParentDeptId());
				if (parentOrg != null) {
					map.put("PARENT_CUST_ID", parentOrg.getRelCustId());
				}
				map.put("OPER_TYPE", "1");
				map.put("VALID_DATE", orgStructValue.getDoneDate());
				map.put("EXPIRE_DATE", orgStructValue.getExpireDate());
				map.put("DONE_CODE", ServiceManager.getDoneCode());
				map.put("DONE_DATE", orgStructValue.getDoneDate());
				List mspList = new ArrayList();
				mspList.add(map);
				custMap.put("I_CUST_REL", mspList);
			} else {
				Map map = new HashMap();
				map.put("CUST_ID", orgStructValue.getRelCustId());
				map.put("TOP_CUST_ID", orgStructValue.getCustId());
				ICustOrganizeValue parentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(orgStructValue.getParentDeptId());
				if (parentOrg != null) {
					map.put("PARENT_CUST_ID", parentOrg.getRelCustId());
				}
				map.put("OPER_TYPE", "3");
				map.put("VALID_DATE", orgStructValue.getEffectiveDate());
				map.put("EXPIRE_DATE", ServiceManager.getOpDateTime());
				map.put("DONE_CODE", ServiceManager.getDoneCode());
				map.put("DONE_DATE", orgStructValue.getDoneDate());
				List mspList = new ArrayList();
				mspList.add(map);
				custMap.put("I_CUST_REL", mspList);
			}
			if (!custMap.isEmpty()) {
				CmServiceFactory.getTeamInvokeSV().sendMapOrderInfoToBilling(custMap);
			}
		}
	}

	private void validateGroupSubCompany(ICustOrganizeValue orgStructValue) throws Exception {
		if (orgStructValue.getDeptType() == CmConstants.CustomerOrg.SUB_COMPANY) {
			if (orgStructValue.isNew()) {
				// 判断整个组织结构中是否已经有联系点 modify by zhuyy @2016-7-14 移网新需求
				// if (1 == orgStructValue.getIsContactPoint()) {
				// ICustOrganizeValue[] custOrganizeValues =
				// CmServiceFactory.getCustomerSV().queryCustOrganizesByCustId(orgStructValue.getCustId(), -1, -1);
				// for (int j = 0; j < custOrganizeValues.length; j++) {
				// if (1 == custOrganizeValues[j].getIsContactPoint()) {
				// ExceptionUtil.throwBusinessException("CMS0070092", custOrganizeValues[j].getDeptName());
				// }
				// }
				// }
				// 新增子公司时不新增记录而是在原有记录上做修改
				ICustOrganizeValue oldCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(orgStructValue.getRelCustId());
				if (oldCustOrganizeValue != null) {
					oldCustOrganizeValue.setParentDeptId(orgStructValue.getParentDeptId());
					oldCustOrganizeValue.setCustId(orgStructValue.getCustId());
					oldCustOrganizeValue.setDeptType(DataType.getAsInt(orgStructValue.getDeptType()));
					oldCustOrganizeValue.setDeptName(orgStructValue.getDeptName());
					oldCustOrganizeValue.setPrincipal(orgStructValue.getPrincipal());
					oldCustOrganizeValue.setPrincipalTel(orgStructValue.getPrincipalTel());
					oldCustOrganizeValue.setDeptFunc(orgStructValue.getDeptFunc());
					oldCustOrganizeValue.setIsContactPoint(orgStructValue.getIsContactPoint());
					oldCustOrganizeValue.setIsRevisable(orgStructValue.getIsRevisable());
					oldCustOrganizeValue.setOpId(ResUserInfo.getOpId());
					oldCustOrganizeValue.setOrgId(ResUserInfo.getOrgId());
					oldCustOrganizeValue.setDoneDate(new Timestamp(System.currentTimeMillis()));
					orgStructValue.copy(oldCustOrganizeValue);
				}
				// 判断新增子公司是否存在子级,将子公司的所有子节点cust_id全部修改为根节点的cust_id
				ICustOrganizeValue[] subCustOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByCustId(orgStructValue.getRelCustId(), -1, -1);
				if (subCustOrganizeValues != null && subCustOrganizeValues.length > 1) {
					boolean upDateFlag = false;
					for (int j = 0; j < subCustOrganizeValues.length; j++) {
						if (subCustOrganizeValues[j].getParentDeptId() != subCustOrganizeValues[j].getCustId()) {
							/*if (1 == subCustOrganizeValues[j].getIsContactPoint()) {
								//ExceptionUtil.throwBusinessException("CMS0070093", subCustOrganizeValues[j].getDeptName());
								upDateFlag = true;
							} else {*/
								subCustOrganizeValues[j].setCustId(orgStructValue.getCustId());
								upDateFlag = true;
							//}
						}
					}
					if (upDateFlag) {
						BOCmGroupOrgStructBean[] subOrgStructValues = new BOCmGroupOrgStructBean[subCustOrganizeValues.length];
						for (int j = 0; j < subCustOrganizeValues.length; j++) {
							subOrgStructValues[j] = new BOCmGroupOrgStructBean();
							subOrgStructValues[j].copy(subCustOrganizeValues[j]);
						}
						CmInnerServiceFactory.getCommonInnerSV().saveBeans(subOrgStructValues);
					}
					// 如果新增子公司存在子级也需要把可修改标识设为不可修改,0为不可修改; 1为可修改
					orgStructValue.setIsRevisable(0);
				}
				// 新增层级时插入细分计算工单（新增层级原来下面没有子层级，需要插入一条计算工单）
				// modify at 2015-06-15,需求要求层级变更时，不需要计算细分，加入集团与当前层级的细分比较， 比较规则：KA > LA > PA > MA > SA
				saveSegmentCal(orgStructValue.getRelCustId(), orgStructValue.getCustId(), -1, CmConstants.TaskStaticParam.ROOT_LEAF_APPROVE, null);
				// 同步层级给权限
				/*
				 * IBOSecOrganizeValue oldVal = OrgmodelClient.getOrganizeByOrgId(orgStructValue.getDeptId());
				 * IBOSecOrganizeValue val = new BOSecOrganizeBean();
				 * if (oldVal != null) {
				 * val.copy(oldVal);
				 * } else {
				 * val.setOrganizeId(orgStructValue.getDeptId());
				 * val.setOrgRoleTypeId(2);
				 * val.setOrganizeName(orgStructValue.getDeptName());
				 * }
				 * val.setParentOrganizeId(orgStructValue.getParentDeptId());
				 * UserInfoInterface operator = ServiceManager.getUser();
				 * if (operator != null) {
				 * val.setDistrictId(String.valueOf(operator.get("DISTRICT_ID")));
				 * val.setCountyId(DataType.getAsLong(operator.get("COUNTY_ID")));
				 * } else {
				 * val.setDistrictId("100");
				 * val.setCountyId(100);
				 * }
				 * if (oldVal != null) {
				 * OrgmodelClient.updateSecOrganize(val);
				 * } else {
				 * val.setState(1);
				 * OrgmodelClient.saveExternalOrganizes(new IBOSecOrganizeValue[] { val });
				 * }
				 */
			} else if (orgStructValue.isDeleted()) {
				// 查出原有记录
				ICustOrganizeValue custOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(orgStructValue.getRelCustId());
				// 更新原有记录，不做物理删除处理
				if (custOrganizeValue != null) {
					// 插入原根节点与新根节点的计算工单 modify at 2015-06-15 新需求--此种情况不重新计算，无需插计算工单
					// saveSegmentCal(orgStructValue.getRelCustId(), orgStructValue.getCustId(),
					// orgStructValue.getRelCustId(), CmConstants.TaskStaticParam.ROOT_APPROVE, null);
					// 更新原有组织记录
					custOrganizeValue.setCustId(orgStructValue.getRelCustId());
					custOrganizeValue.setParentDeptId(orgStructValue.getRelCustId());
					custOrganizeValue.setIsContactPoint(0);// 联系点设为0
					custOrganizeValue.setIsRevisable(0);// 拆分后设为不可修改，0为不可修改; 1为可修改
					orgStructValue.copy(custOrganizeValue);
					// 判断拆分子公司是否存在子级,将子公司的所有子节点cust_id全部修改为根节点的cust_id
					// ICustOrganizeValue[] subCustOrganizeValues =
					// CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(orgStructValue.getDeptId(), -1,
					// -1);
					ICustOrganizeValue[] subCustOrganizeValues = CmServiceFactory.getCustomerSV().queryAllSubCustOrganizesByParentId(orgStructValue.getDeptId(), -1, -1);
					if (subCustOrganizeValues != null && subCustOrganizeValues.length > 0) {
						boolean upDateFlag = false;
						for (int j = 0; j < subCustOrganizeValues.length; j++) {
							if (subCustOrganizeValues[j].getParentDeptId() != subCustOrganizeValues[j].getCustId()) {
								subCustOrganizeValues[j].setCustId(orgStructValue.getCustId());
								upDateFlag = true;
							}
						}
						if (upDateFlag) {
							BOCmGroupOrgStructBean[] subOrgStructValues = new BOCmGroupOrgStructBean[subCustOrganizeValues.length];
							for (int j = 0; j < subCustOrganizeValues.length; j++) {
								subOrgStructValues[j] = new BOCmGroupOrgStructBean();
								subOrgStructValues[j].copy(subCustOrganizeValues[j]);
							}
							CmInnerServiceFactory.getCommonInnerSV().saveBeans(subOrgStructValues);
						}
					}
				}
				// 删除权限组织
				/*
				 * long deptId = orgStructValue.getDeptId();
				 * int count = OrgmodelClient.getStaffsByOrgIdCount(deptId);
				 * if (count > 0) {
				 * ExceptionUtil.throwBusinessException("CMS6000078", String.valueOf(deptId));
				 * } else {
				 * BOSecOrganizeBean val = new BOSecOrganizeBean();
				 * val.initOrganizeId(deptId);
				 * val.setParentOrganizeId(-1);// 删除时上级恢复成-1
				 * OrgmodelClient.updateSecOrganize(val);
				 * }
				 */
			} else if (orgStructValue.isModified()) {// 修改
				// 判断整个组织结构中是否已经有联系点 modify by zhuyy @2016-7-14 移网新需求
				// if (1 == orgStructValue.getIsContactPoint()) {// 联系点,判断整个组织结构中是否已经有联系点
				// ICustOrganizeValue[] custOrganizeValues =
				// CmServiceFactory.getCustomerSV().queryCustOrganizesByCustId(orgStructValue.getCustId(), -1, -1);
				// for (int j = 0; j < custOrganizeValues.length; j++) {
				// if (1 == custOrganizeValues[j].getIsContactPoint() && orgStructValue.getRelCustId() !=
				// custOrganizeValues[j].getRelCustId()) {
				// ExceptionUtil.throwBusinessException("CMS0070092", custOrganizeValues[j].getDeptName());
				// }
				// }
				// }
			}
		}
		// add end
	}

	/**
	 * 继承层级中的细分
	 * @param segmentID
	 * @param custId
	 * @throws Exception
	 */
	private void saveSegmentBysegmentId(long segmentID, long custId, long strMgrCustId) throws Exception {
		ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue subGroupSegmentRelaBean = new BOCmCustSegmentRelaBean();
		IBOCmCustSegmentRelaValue segmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(custId);
		if (segmentRela != null) {
			if (subGroupSegmentRelaBean.getIsRevisable() == 1) {// 允许修改
				segmentRela.setSegmentId(segmentID);
				subGroupSegmentRelaBean.copy(segmentRela);
			}
		} else {
			subGroupSegmentRelaBean.setCustId(custId);// 取得集团客户ID
			subGroupSegmentRelaBean.setSegmentId(DataType.getAsLong(segmentID));
			subGroupSegmentRelaBean.setIsInheritable(1);
			subGroupSegmentRelaBean.setIsRevisable(1);
			subGroupSegmentRelaBean.setIsCreditCalculated(1);
			subGroupSegmentRelaBean.setIsApprovable(0);
		}
		// 继承客户经理
		ICmGroupCustomerSV service = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		long managerId = service.queryManagerId(strMgrCustId);
		service.saveManager(custId, managerId);
		cmCustSegmentRelaSV.saveSegmentRela(subGroupSegmentRelaBean);
	}

	/**
	 * 保存细分计算工单
	 * @param custId
	 * @throws Exception
	 */
	public void saveSegmentCal(long custId, long oldRootCustId, long newRootCustId, long action, String kobFlag) throws Exception {
		// 校验重复的审批工单
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		groupCustomerSV.validateDuplicateApproval(custId);

		List beanList = new ArrayList();
		if (oldRootCustId > 0) {// 自己的
			BOCmPsSegmentCalBean segmentCalBean = new BOCmPsSegmentCalBean();
			segmentCalBean.setCustId(custId);// 变更集团ID
			segmentCalBean.setRootCustId(oldRootCustId);// 原集团根节点
			segmentCalBean.setAction(action);// 细分计算操作
			segmentCalBean.setRecordId(CmCommonUtil.getNewSequence(BOCmPsSegmentCalBean.class));
			segmentCalBean.setState(CmConstants.RecordState.USE);
			segmentCalBean.setCreateOpId(ResUserInfo.getOpId());
			segmentCalBean.setCreateOrgId(ResUserInfo.getOrgId());
			segmentCalBean.setCreateDate(ResUserInfo.getDoneDate());
			segmentCalBean.setOpId(ResUserInfo.getOpId());
			segmentCalBean.setOrgId(ResUserInfo.getOrgId());
			segmentCalBean.setDoneCode(ResUserInfo.getDoneCode());
			segmentCalBean.setDoneDate(ResUserInfo.getDoneDate());
			segmentCalBean.setEffectiveDate(DataTypeUtils.getCurrentDate());
			segmentCalBean.setExpireDate(TimeUtil.getMaxExpire());
			segmentCalBean.setRegionId(ResUserInfo.getRegionId());
			if (StringUtils.isNotBlank(kobFlag)) {
				segmentCalBean.setRemarks(kobFlag);
			}
			beanList.add(segmentCalBean);
		}
		if (newRootCustId > 0) {// 根节点
			BOCmPsSegmentCalBean segmentCalBean = new BOCmPsSegmentCalBean();
			segmentCalBean.setCustId(custId);
			segmentCalBean.setRootCustId(newRootCustId);// 新的集团根节点
			segmentCalBean.setAction(action);// 细分计算操作
			segmentCalBean.setRecordId(CmCommonUtil.getNewSequence(BOCmPsSegmentCalBean.class));
			segmentCalBean.setState(CmConstants.RecordState.USE);
			segmentCalBean.setCreateOpId(ResUserInfo.getOpId());
			segmentCalBean.setCreateOrgId(ResUserInfo.getOrgId());
			segmentCalBean.setCreateDate(ResUserInfo.getDoneDate());
			segmentCalBean.setOpId(ResUserInfo.getOpId());
			segmentCalBean.setOrgId(ResUserInfo.getOrgId());
			segmentCalBean.setDoneCode(ResUserInfo.getDoneCode());
			segmentCalBean.setDoneDate(ResUserInfo.getDoneDate());
			segmentCalBean.setEffectiveDate(DataTypeUtils.getCurrentDate());
			segmentCalBean.setExpireDate(TimeUtil.getMaxExpire());
			segmentCalBean.setRegionId(ResUserInfo.getRegionId());
			if (StringUtils.isNotBlank(kobFlag)) {
				segmentCalBean.setRemarks(kobFlag);
			}
			beanList.add(segmentCalBean);
		}
		if (!beanList.isEmpty()) {
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmPsSegmentCalBean[]) beanList.toArray(new BOCmPsSegmentCalBean[0]));
		}
	}

	/**
	 * 处理其他数据<br>
	 * 该方法提供给本地化实现的扩展。<br>
	 * <strong>e.g.:<br></strong>
	 * 本地化有增加了客户扩展表，需要对扩展表进行操作等，则实现该方法，在该方法中实现对扩展表的操作。
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午3:41:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(IVOCustValue custValue) throws Exception;

	/**   
	 * 处理参与人信息
	 * @Function dealParty
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:49:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealParty(IVOCustValue custValue) throws Exception {
		IVOPartyValue partyValue = custValue.getParty();
		if (partyValue != null) {
			// 设置参与人角色
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue oldPartyValue = partySV.queryPartyById(partyValue.getParty().getPartyId());
			boolean isNew = partyValue.getParty().isNew();
			if (!(CmCommonUtil.isNotEmptyObject(oldPartyValue) && isNew)) {
				// 校验参与人唯一
				validateUniqueParty(custValue);

				IPartyRoleValue partyRoleValue = new PartyRoleBean();
				partyRoleValue.copy(partyValue.getParty());
				// 根据客户子类型设置参与人角色
				String custSubType = custValue.getCustomer().getIndivCustType();

				// 设置party的偏好网站语言
				if (partyValue != null && partyValue.getParty() != null) {
					partyValue.getParty().setPerferLanguage(custValue.getCustomer().getPerferLanguage());
				}

				if (StringUtils.isNotBlank(custSubType) && custSubType.equals(String.valueOf(CmConstants.CustSubType.INDIV_EMPLOYEE))) {
					partyRoleValue.setRoleType(CmConstants.PartyRoleType.EMPLOYEE);
				} else if (StringUtils.isNotBlank(custSubType) && custSubType.equals(String.valueOf(CmConstants.CustSubType.INDIV_USER))) {
					partyRoleValue.setRoleType(CmConstants.PartyRoleType.USER);
				} else {
					partyRoleValue.setRoleType(CmConstants.PartyRoleType.CUSTOMER);
				}
				// add by huangqun 增加role_status字段
				partyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
				partyRoleValue.setEntityId(custValue.getCustId());
				// 只有新增才插partyrole
				if (isNew) {
					partyRoleValue.setStsToNew();
					if (validateUniqueRoleType(custValue)) {
						partyValue.setPartyRole(partyRoleValue);
					}
					// 这样处理会使原先party的cprId被新的覆盖，导致合并后出现问题
					// 后面处理扩展信息会另外处理pnr与cprId
					// if (String.valueOf(CmConstants.PartyRoleType.USER).equals(custSubType)) {
					// if (null != custValue && null !=
					// custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer)) {
					// DataContainer dc = (DataContainer)
					// custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
					// // 如果创建的是user,默认将CPR_ID插入CM_PARTY表中
					// partyValue.getParty().setCprId(dc.getAsString("PNR"));
					// }
					// }
				}
				CmServiceFactory.getPartySV().saveParty(partyValue);
				if (custValue.getCustomer() != null && custValue.getCustomer().getPartyId() < 1) {
					custValue.getCustomer().setPartyId(partyValue.getPartyId());
				}
			}
		}
	}

	private boolean validateUniqueRoleType(IVOCustValue custValue) throws Exception {
		IVOPartyValue partyValue = custValue.getParty();
		long partyId = partyValue.getPartyId();
		String roleType = custValue.getCustomer().getIndivCustType();
		if (partyId > 0) {
			ICmPartyRoleSV partySV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			IBOCmPartyRoleValue[] roleValues = partySV.queryPartyRole(partyId, Integer.parseInt(roleType), -1, -1);
			return roleValues == null || roleValues.length <= 0;
		}
		return true;
	}

	private void validateUniqueParty(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null && customerValue.isNew() && customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
			long custId = customerValue.getCustId();
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmCustContactMediumValue[] addressValues = service.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
			if (addressValues != null && addressValues.length > 0 && StringUtils.isNotBlank(customerValue.getCustName()) && null != customerValue.getBirthday()) {
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				dateFormat.format(customerValue.getBirthday());
				// 首先查询是否有相同的客户
				IBOCmIndivCustomerValue[] tempCust = service.queryCmCustByCustInfoAndAddress(customerValue.getCustName(), dateFormat.format(customerValue.getBirthday()),
						addressValues[0].getAddressId(), -1);

				// 名称，生日，地址查询party
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				DataContainer conditionDC = new DataContainer();
				if (tempCust != null && tempCust.length > 0) {
					// 有重复的客户，直接使用已经存在的客户的partyId
					conditionDC.set(IPartyValue.S_PartyId, tempCust[0].getPartyId());
				} else {
					// 没有重复的客户，查询是否有相同的纯payer
					conditionDC.set(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
					conditionDC.set(IPartyValue.S_PartyName, customerValue.getCustName());
					conditionDC.set(IPartyValue.S_Birthday, dateFormat.format(customerValue.getBirthday()));
					conditionDC.set(IPartyValue.S_ContAddress, addressValues[0].getAddressId());
					conditionDC.set(IPartyValue.S_State, CmConstants.RecordState.USE);
				}
				IPartyValue[] partyValues = partySV.queryPartys(conditionDC, -1, -1);

				if (partyValues != null && partyValues.length > 0) {
					long oldPartyId = partyValues[0].getPartyId();
					IPartyValue partyValue = custValue.getParty().getParty();
					DataContainerFactory.copyNoClearData(partyValue, partyValues[0]);
					partyValue.copy(partyValues[0]);
					// 解决将老的查询出来的partyId更新为界面最新生成的partyId的问题
					partyValue.setPartyId(oldPartyId);
					customerValue.setPartyId(oldPartyId);
				}

			}
		}
	}

	private void dealDefaultParty(IVOCustValue custValue) throws Exception {
		IVOPartyValue partyValue = custValue.getParty();
		if (partyValue != null) {
			// 设置参与人角色
			IPartyRoleValue partyRoleValue = new PartyRoleBean();
			partyRoleValue.copy(partyValue.getParty());
			// 根据客户子类型设置参与人角色
			String custSubType = custValue.getCustomer().getIndivCustType();
			if (StringUtils.isNotBlank(custSubType) && custSubType.equals(String.valueOf(CmConstants.CustSubType.INDIV_EMPLOYEE))) {
				partyRoleValue.setRoleType(CmConstants.PartyRoleType.EMPLOYEE);
			} else if (StringUtils.isNotBlank(custSubType) && custSubType.equals(String.valueOf(CmConstants.CustSubType.INDIV_USER))) {
				partyRoleValue.setRoleType(CmConstants.PartyRoleType.USER);
			} else {
				partyRoleValue.setRoleType(CmConstants.PartyRoleType.CUSTOMER);
			}
			partyRoleValue.setEntityId(custValue.getCustId());
			if (validateUniqueRoleType(custValue)) {
				partyValue.setPartyRole(partyRoleValue);
			}
			AbstractPartyDealBusiModelImpl partyDealBusiModelImpl = (AbstractPartyDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyDealBusiModelImpl.class);
			partyDealBusiModelImpl.dealDefaultParty(partyValue);
			if (custValue.getCustomer() != null && custValue.getCustomer().getPartyId() < 1) {
				custValue.getCustomer().setPartyId(partyValue.getPartyId());
			}
		}
	}

	/**   
	 * 获取客户服务编号。需要根据具体的业务需求来设置。
	 * @Function getCustServiceId
	 * @Description 
	 *
	 * @param customerValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午9:29:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public abstract String getCustServiceId(ICustomerValue customerValue) throws Exception;

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
		//CR370 AI-9136
		if (CmCommonUtil.isNotEmptyObject(custValue.getCustomer())) {
			if(log.isInfoEnabled()) {
				log.info("=======into ===notify=isNotEmptyObject=");
			}
			ICustomerValue customerValue = custValue.getCustomer();
			if (CmConstants.CustomerStatus.INDIV_INACTIVE == customerValue.getCustStatus()&&StringUtils.isBlank(customerValue.getCreditLevel())) {
				if(log.isInfoEnabled()) {
					log.info("=======into ===notify= custStatus="+customerValue.getCustStatus()+"====sendcreditLevel is null");
				}
				customerValue.set(ICustomerValue.S_CreditLevel, null);
			}
		}
		
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			if (customerValue.getCustType() == CmConstants.CustomerType.GROUP) {
				customerValue.setCustLanguage(customerValue.getPerferLanguage());
			}
		}
		CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
		saveLog(custValue);
	}

	private void saveLog(IVOCustValue custValue) throws Exception {
		// 客户接触
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			long busiId = 0L;
			int custType = customerValue.getCustType();
			if (customerValue.isNew()) {
				if (custType == CmConstants.CustomerType.INDIVIDUAL) {
					busiId = CmBusinessOperation.CM_INDIV_CUST_NEW;
				} else if (custType == CmConstants.CustomerType.GROUP) {
					// KOB导入的新增情况下不处理
					String custCertCode = customerValue.getCustCertCode();
					if (customerValue.getGroupType() == 2 && (StringUtils.isNotBlank(custCertCode) && StringUtils.isNumeric(custCertCode))) {
						return;
					}
					busiId = CmBusinessOperation.CM_GROUP_CUST_NEW;
				}
				CmRecordLog.saveRecord(busiId, customerValue.getCustId(), null);
			} else if (customerValue.isModified()) {
				// 不作处理,在后面记录客户历史变更时处理
			} else if (customerValue.isDeleted()) {
				if (custType == CmConstants.CustomerType.INDIVIDUAL) {
					busiId = CmBusinessOperation.CM_INDIV_CUST_DEL;
				} else if (custType == CmConstants.CustomerType.GROUP) {
					busiId = CmBusinessOperation.CM_GROUP_CUST_DEL;
				}
				CmRecordLog.saveRecord(busiId, customerValue.getCustId(), null);
			}
		}
	}

	private void saveCmGrpCustomerAudit(IVOCustValue custValue) throws Exception {
		IBOCmGroupCustomerAuditValue[] cmGrpCustomAudit = (IBOCmGroupCustomerAuditValue[]) custValue.getUserObject(CmLnConstants.MainMeth.CM_GROUP_CUSTOMER_AUDIT);
		int len = cmGrpCustomAudit.length;
		BOCmGroupCustomerAuditBean[] boCmuserBeans = new BOCmGroupCustomerAuditBean[len];
		BOCmGroupCustomerAuditBean boCmuserBean = null;
		if (!CmCommonUtil.isEmptyObject(cmGrpCustomAudit)) {
			for (int i = 0; i < len; i++) {
				boCmuserBean = new BOCmGroupCustomerAuditBean();
				boCmuserBean.copy(cmGrpCustomAudit[i]);
				boCmuserBeans[i] = boCmuserBean;
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(boCmuserBeans);
		}
	}

	/**   
	 * 业务处理完成后的处理
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午4:00:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processAfterDeal(IVOCustValue custValue) throws Exception;

	/**   
	 * 在处理业务之前的业务
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:55:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(IVOCustValue custValue) throws Exception;

	/**   
	 * 保存业务记录
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午4:00:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void saveBusiLog(IVOCustValue custValue) throws Exception {
		CmBusiLogFactory.log(custValue);
	}

	/**   
	 * 设置联系人信息的默认属性
	 * 
	 * @Function setDefaultContactValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午10:37:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultContactValue(IVOCustValue custValue) throws Exception {

	}

	/**   
	 * 设置客户经理默认属性
	 * @Function setDefaultCustManagerValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午10:42:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultCustManagerValue(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustManagers()) {
			ICustManagerValue[] managerValues = custValue.getCustManagers();
			for (int i = 0; i < managerValues.length; i++) {
				if (managerValues[i].isNew()) {
					if (managerValues[i].getCustId() <= 0) {
						managerValues[i].setCustId(custValue.getCustId());
					}
					if (managerValues[i].getCustId() <= 0) {
						// 参数错误，参数客户编号不能为空！
						ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000002"));
					}
					// 设置关系编号
					if (managerValues[i].getRelId() <= 0) {
						switch (CmCommonUtil.getCustType(managerValues[i].getCustId())) {
							case CmConstants.CustomerType.INDIVIDUAL:
								managerValues[i].setRelId(CmCommonUtil.getNewSequence(BOCmIndivManagerBean.class));
								break;
							case CmConstants.CustomerType.GROUP:
								managerValues[i].setRelId(CmCommonUtil.getNewSequence(BOCmGroupManagerBean.class));
								break;
							default:
								ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custValue.getCustType()));
								break;
						}
					}
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						managerValues[i].setCreateOpId(ServiceManager.getUser().getID());
						managerValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(managerValues[i].getRegionId())) {
						managerValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					managerValues[i].setState(CmConstants.RecordState.USE);
				} else if (managerValues[i].isDeleted()) {
					// 先设置为Old状态，然后再删除，确保所有的属性都会被记录为历史。
					managerValues[i].setStsToOld();
					managerValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 设置客户的默认属性。<br>
	 * 默认实现了以下功能：<br>
	 * 1、当新建客户时，设置客户编号、创建操作员编号、创建操作员组织编号、地市编码、记录状态、客户服务编号客户状态；<br>
	 * 2、当删除客户时，将客户实体的状态置为Old状态然后在delete，确保所有的属性都会被记录到历史表中。
	 * @Function setDefaultCustomerValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午10:04:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultCustomerValue(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			// 调用公共的方法进行一些初始值的设置
			setCommonValue(customerValue);
			/*
			 * 如果是新建客户，则需要设置客户编号、创建操作员编号、组织等信息
			 */
			if (customerValue.isNew()) {
				// 如果没有设置客户编号，则设置客户编号
				if (customerValue.getCustId() <= 0) {
					// 取当前系统中具体类型客户BOBean配置信息
					IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(customerValue.getCustType()));
					if (staticDataValue == null) {
						/*
						 * 不存在类型为{0}的客户。
						 */
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0030044", String.valueOf(customerValue.getCustType())));
						}
						ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(customerValue.getCustType()));
					}
					// 检查具体类型客户的BOBean是否正确配置
					if (StringUtils.isBlank(staticDataValue.getExternCodeType()) || !staticDataValue.getExternCodeType().endsWith("Bean")) {
						// 系统参数错误：没有获取到编码为[{0}]的静态数据配置！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0030043", CmConstants.CmStaticDataCodeType.CUST_TYPE));
						}
						ExceptionUtil.throwBusinessException("CMS0030043", CmConstants.CmStaticDataCodeType.CUST_TYPE);
					}
					// 为了更加通用，这里需要将具体的数据容器实例化，并将前台输入的客户资料拷贝到该数据容器中，调用通用的序列获取服务获取序列。
					DataContainerInterface dc = DataContainerFactory.createDataContainerInstance(Class.forName(staticDataValue.getExternCodeType().trim()), null);
					dc.copy(customerValue);
					// 模拟regionId
					dc.set("REGION_ID", CmCommonUtil.generateRegionId());
					customerValue.setCustId(CmCommonUtil.getNewSequence(dc));
				}
				// 设置客户服务编号
				if (StringUtils.isBlank(customerValue.getCustServiceId())) {
					// customerValue.setCustServiceId(getCustServiceId(customerValue));
				}
				// 设置客户状态.
				if (customerValue.getCustStatus() < 0) {
					if (customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
						customerValue.setCustStatus(CmConstants.CustomerStatus.INDIV_ACTIVE);
					} else {
						customerValue.setCustStatus(CmConstants.CustomerStatus.GROUP_ACTIVE);
					}

				}
				// 设置客户子类型
				if (StringUtils.isBlank(customerValue.getIndivCustType())) {
					// 如果为空，默认设置为客户
					customerValue.setIndivCustType(String.valueOf(CmConstants.CustSubType.INDIV_CUSTOMER));
				}
				// 设置是否允许修改客户信用度
				if (customerValue.getIsRevisable() <= 0) {
					customerValue.setIsRevisable(CmConstants.YesOrNo.NO);
				}
				// 针对91租户，集团新增就是active，91租户的集团只有active和inactive
				if (customerValue.getCustType() == CmConstants.CustomerType.GROUP && TenantIDFactory.getTenantId().equalsIgnoreCase(CmConstants.TenantId.TENANT_91)) {
					customerValue.setCustStatus(CmConstants.CustomerStatus.GROUP_ACTIVE);
				}
				//AI-7507
				if(customerValue.getPhysiologicalState()<=0) {
					customerValue.setPhysiologicalState(0);
				}
				if(StringUtils.isEmpty(customerValue.getProvinceId())) {
					customerValue.setProvinceId("9999");
				}
			} else if (customerValue.isDeleted()) {
				// 先设置为Old状态，然后再将记录状态置为E，使用逻辑删除。
				// customerValue.setStsToOld();
				// customerValue.setState(CmConstants.RecordState.ERASE);
				// 设置地市
				if (StringUtils.isBlank(customerValue.getRegionId())) {
					customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
			} else if (customerValue.isModified()) {
				// 设置地市
				if (StringUtils.isBlank(customerValue.getRegionId())) {
					customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
			}
		}
	}

	/**   
	 * @Function setDefaultCustOrganizeValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午5:17:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultCustOrganizeValue(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustOrganize()) {
			ICustOrganizeValue[] custOrganizeValues = custValue.getCustOrganizes();
			for (int i = 0; i < custOrganizeValues.length; i++) {
				if (custOrganizeValues[i].isNew()) {
					if (custOrganizeValues[i].getDeptId() <= 0) {
						custOrganizeValues[i].setDeptId(CmCommonUtil.getNewSequence(BOCmGroupOrgStructBean.class));
					}
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						custOrganizeValues[i].setCreateOpId(ServiceManager.getUser().getID());
						custOrganizeValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(custOrganizeValues[i].getRegionId())) {
						custOrganizeValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					custOrganizeValues[i].setState(CmConstants.RecordState.USE);
				} else if (custOrganizeValues[i].isDeleted()) {
					custOrganizeValues[i].setState(CmConstants.RecordState.ERASE);
					custOrganizeValues[i].setStsToOld();
					custOrganizeValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 设置参与人的默认属性<br>
	 * 默认实现了以下功能：<br>
	 * 1、当新建客户时，设置参与人编号、创建操作员编号、创建操作员组织编号、地市编码、记录状态；<br>
	 * 2、当删除客户时，将客户实体的状态置为Old状态然后在delete，确保所有的属性都会被记录到历史表中。
	 * @Function setDefaultPartyValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午10:17:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultPartyValue(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		int isSetDefaultParty = custValue.getUserObject("SET_DEFAULT_PARTY") != null ? Integer.parseInt(custValue.getUserObject("SET_DEFAULT_PARTY").toString()) : -1;
		if (isSetDefaultParty != 0 && custValue.getParty() == null && customerValue != null && !customerValue.isDeleted()) {
			// 设置参与人信息
			PartyBean iPartyValue = new PartyBean();
			iPartyValue.copy(customerValue);
			// 去除ext9不一样报错
			iPartyValue.clearProperty("EXT9");
			// remarks字段默认塞为空
			if (StringUtils.isNotEmpty(iPartyValue.getRemarks())) {
				iPartyValue.clearProperty("REMARKS");
			}
			IVOPartyValue voPartyValue = new VOPartyBean();
			voPartyValue.setParty(iPartyValue);
			// 集团的税号变化同步payer
			if (null != custValue.getUserObject("cmxGrpCust")) {
				DataContainerInterface dc = (DataContainerInterface) custValue.getUserObject("cmxGrpCust");
				if (dc.isModified()) {
					if (null != dc.getAsString("TAX_ID") && dc.isPropertyModified("TAX_ID")) {
						voPartyValue.setUserObject("TAX_FLAG", "1");
						voPartyValue.setUserObject("TAX_ID", dc.getAsString("TAX_ID"));
					}
				}

			}
			custValue.setParty(voPartyValue);
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustCertAddress)) {
				iPartyValue.initProperty(IPartyValue.S_CertAddress, customerValue.getOldObj(ICustomerValue.S_CustCertAddress));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustCertAddress)) {
				iPartyValue.setCertAddress(customerValue.getCustCertAddress());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustCertCode)) {
				iPartyValue.initProperty(IPartyValue.S_CertCode, customerValue.getOldObj(ICustomerValue.S_CustCertCode));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustCertCode)) {
				iPartyValue.setCertCode(customerValue.getCustCertCode());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustCertExpire)) {
				iPartyValue.initProperty(IPartyValue.S_CertExpireDate, customerValue.getOldObj(ICustomerValue.S_CustCertExpire));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustCertExpire)) {
				iPartyValue.setCertExpireDate(customerValue.getCustCertExpire());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustCertType)) {
				iPartyValue.initProperty(IPartyValue.S_CertType, customerValue.getOldObj(ICustomerValue.S_CustCertType));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustCertType)) {
				iPartyValue.setCertType(customerValue.getCustCertType());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustName)) {
				iPartyValue.initProperty(IPartyValue.S_PartyName, customerValue.getOldObj(ICustomerValue.S_CustName));
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustName)) {
				iPartyValue.initProperty(IPartyValue.S_PartyNameQry, customerValue.getOldObj(ICustomerValue.S_CustNameQry));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustName)) {
				iPartyValue.setPartyName(customerValue.getCustName());
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustName)) {
				iPartyValue.setPartyNameQry(customerValue.getCustNameQry());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustType)) {
				iPartyValue.initProperty(IPartyValue.S_PartyType, (customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) ? CmConstants.PartyType.INDIVIDUAL
						: CmConstants.PartyType.ORGANIZE);
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustType)) {
				iPartyValue.setPartyType((custValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) ? CmConstants.PartyType.INDIVIDUAL : CmConstants.PartyType.ORGANIZE);
			}
		}
		// add by huangqun 如果大对象里面有contact信息则这里应该塞contact信息
		if (custValue.getParty() != null && !CmCommonUtil.isNotEmptyObject(custValue.getParty().getPartyContacts()) && customerValue != null && !customerValue.isDeleted()) {
			// 设置参与人联系信息
			PartyContactBean iPartyContactValue = new PartyContactBean();
			custValue.getParty().setPartyContact(iPartyContactValue);
			iPartyContactValue.copy(customerValue);
			// 去除对remarks的操作
			iPartyContactValue.clearProperty("REMARKS");

			// 去除ext9和ext10客户扩展表和party_contact表类型不一致保存报错的问题
			iPartyContactValue.clearProperty(PartyContactBean.S_Ext9);
			iPartyContactValue.clearProperty(PartyContactBean.S_Ext10);

			if (custValue.getContacts() != null && custValue.getContacts().length > 0) {
				iPartyContactValue.copy(custValue.getContacts()[0]);
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustName)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContName, customerValue.getOldObj(ICustomerValue.S_CustName));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustName)) {
				iPartyContactValue.setContName(customerValue.getCustName());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustName)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContNameQry, customerValue.getOldObj(ICustomerValue.S_CustNameQry));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustName)) {
				iPartyContactValue.setContNameQry(customerValue.getCustNameQry());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_FamilyPhone)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_HomeTel, customerValue.getOldObj(ICustomerValue.S_FamilyPhone));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_FamilyPhone)) {
				iPartyContactValue.setHomeTel(customerValue.getFamilyPhone());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_OfficeTel)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_OfficeTel, customerValue.getOldObj(ICustomerValue.S_OfficeTel));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_OfficeTel)) {
				iPartyContactValue.setOfficeTel(customerValue.getOfficeTel());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_ContMobile)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContMobile, customerValue.getOldObj(ICustomerValue.S_ContMobile));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_ContMobile)) {
				iPartyContactValue.setContMobile(customerValue.getContMobile());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_ContEmail)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContEmail, customerValue.getOldObj(ICustomerValue.S_ContEmail));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_ContEmail)) {
				iPartyContactValue.setContEmail(customerValue.getContEmail());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_ContFax)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContFax, customerValue.getOldObj(ICustomerValue.S_ContFax));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_ContFax)) {
				iPartyContactValue.setContFax(customerValue.getContFax());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_GroupFax)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContFax, customerValue.getOldObj(ICustomerValue.S_GroupFax));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_GroupFax)) {
				iPartyContactValue.setContFax(customerValue.getGroupFax());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_CustZipcode)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_PostCode, customerValue.getOldObj(ICustomerValue.S_CustZipcode));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_CustZipcode)) {
				iPartyContactValue.setPostCode(customerValue.getCustZipcode());
			}
			if (customerValue.isPropertyInitial(ICustomerValue.S_ContDesc)) {
				iPartyContactValue.initProperty(IPartyContactValue.S_ContDesc, customerValue.getOldObj(ICustomerValue.S_ContDesc));
			}
			if (customerValue.isPropertyModified(ICustomerValue.S_ContDesc)) {
				iPartyContactValue.setContDesc(customerValue.getContDesc());
			}
		}

	}

	/**   
	 * 设置一些默认属性，如：创建操作员编号、创建操作员等。
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午9:31:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultValue(IVOCustValue custValue) throws Exception {
		// 对于新建客户的时候需要设置一些默认属性，如：创建操作员编号、创建操作员等。
		/*
		 * 创建业务日志根节点
		 */
		// createDefaultBusiLog(custValue);
		/*
		 * 设置参与人和联系信息
		 */
		setDefaultPartyValue(custValue);
		/*
		 * 设置客户的默认属性
		 */
		setDefaultCustomerValue(custValue);
		/*
		 * 设置联系人默认值
		 */
		setDefaultContactValue(custValue);
		/*
		 * 设置客户关系默认值
		 */
		setDefaultCustRelValue(custValue);
		/*
		 * 设置客户经理默认属性
		 */
		setDefaultCustManagerValue(custValue);
		/*
		 * 设置客户组织结构信息
		 */
		setDefaultCustOrganizeValue(custValue);
		/*
		 * 设置客户属性
		 */
		setDefaultAttrValue(custValue);

		/*
		 * 设置其他的属性
		 */
		setOtherDefaultValue(custValue);
	}

	/**   
	 * 设置客户属性
	 * @Function setDefaultAttrValue
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:47:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultAttrValue(IVOCustValue custValue) throws Exception {
		if (custValue.hasAttrValues()) {
			DataContainerInterface[] attrValues = custValue.getAttrValues();
			for (int i = 0; i < attrValues.length; i++) {
				if (attrValues[i].isNew()) {
					attrValues[i].set(BOCmGroupCustAttrBean.S_CustId, custValue.getCustId());
				}
			}
		}
	}

	/**
	 * @param custValue
	 * @Function: setDefaultCustRelValue
	 * @author: LSC
	 * @throws Exception 
	 * @throws BusinessException 
	 * @date: 2012-4-11 下午2:26:42 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-11       LSC         v1.0.0               修改原因
	 */
	private void setDefaultCustRelValue(IVOCustValue custValue) throws BusinessException, Exception {
		if (custValue.hasCustRel()) {
			ICustRelationshipValue[] custRelValues = custValue.getCustRels();
			for (int i = 0; i < custRelValues.length; i++) {
				if (custRelValues[i].isNew()) {
					// 设置关系编号
					if (custRelValues[i].isNew()) {
						switch (custRelValues[i].getRelationType()) {
							case CmConstants.CustRelationShip.CUST_REL_TYPE_FAMILY:
								// 家庭成员关系
								custRelValues[i].setCustRelId(CmCommonUtil.getNewSequence(BOCmFamilyMemberBean.class));
								break;
							case CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_FATHER:
								// 集团父子关系
								break;
							case CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER:
								// 集团成员关系
								custRelValues[i].setCustRelId(CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class));
								break;
							default:
								ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custValue.getCustType()));
								break;
						}
					}
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						custRelValues[i].setCreateOpId(ServiceManager.getUser().getID());
						custRelValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(custRelValues[i].getRegionId())) {
						custRelValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					custRelValues[i].setState(CmConstants.RecordState.USE);
				} else if (custRelValues[i].isDeleted()) {
					// 先设置为Old状态，然后再删除，确保所有的属性都会被记录为历史。
					custRelValues[i].setStsToOld();
					custRelValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 设置其他属性<br>
	 * e.g.<br>
	 * 人如果有本地化扩展的客户表，则需要实现该方法用于设置该表的默认值。主要是设置create_op_id等属性
	 * @Function setOtherDefaultValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:15:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void setOtherDefaultValue(IVOCustValue custValue) throws Exception;

	/**   
	 * 验证客户对象 
	 * @Function validate
	 * @Description 
	 *
	 * @param custValue 客户对象信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:24:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void validate(IVOCustValue custValue) throws Exception {
		if (custValue == null) {
			ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0020197"));// 参数错误，参数{0}不能为空！
		}
		/*
		 * 验证客户信息
		 */
		validateCustomer(custValue);
		/*
		 * 验证参与人信息
		 */
		validateParty(custValue);

		/*
		 * 验证客户经理信息
		 */
		validateCustManager(custValue);

		/*
		 * 验证客户组织结构信息
		 */
		validateCustOrganize(custValue);
		/*
		 * 验证客户属性
		 */
		validateAttrValue(custValue);
		/*
		 * 验证其他信息
		 */
		validateOtherThings(custValue);
	}

	/**   
	 * 验证属性信息
	 * @Function validateAttrValue
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-4-20 下午4:42:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateAttrValue(IVOCustValue custValue) throws Exception;

	/**   
	 * @Function validateOtherThings
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:50:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateOtherThings(IVOCustValue custValue) throws Exception;

	/**   
	 * 验证客户组织结构信息
	 * @Function validateCustOrganize
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:24:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateCustOrganize(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustOrganize()) {
			ICustOrganizeValue[] organizeValues = custValue.getCustOrganizes();
			for (int i = 0; i < organizeValues.length; i++) {
				if (organizeValues[i].isModified()) {
					// 如果是修改情况，则客户编号不能为空
					if (organizeValues[i].getCustId() <= 0) {
						// 参数错误，参数客户编号不能为空！
						ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000002"));
					}
					if (organizeValues[i].get(ICustOrganizeValue.S_DeptId) == null) {
						// 参数错误，参数部门编号不能为空！
						ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0076041"));
					}
				}
			}
		}
	}

	/**   
	 * 验证客户经理信息
	 * @Function validateCustManager
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:23:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateCustManager(IVOCustValue custValue) throws Exception {
		/*
		 * if (custValue.hasCustManagers()) { ICustManagerValue[] custManagerValues = custValue.getCustManagers(); for
		 * (int i = 0; i < custManagerValues.length; i++) { if (custManagerValues[i].getCustId() <= 0) { //
		 * 参数错误，参数客户编号不能为空！ ExceptionUtil.throwBusinessException("CMS0022001",
		 * CrmLocaleFactory.getResource("CMS0000002")); } } }
		 */
	}

	/**   
	 * 验证参与人信息
	 * @Function validateParty
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:22:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateParty(IVOCustValue custValue) throws Exception {
		/*
		 * 验证参与人信息
		 */
		IVOPartyValue voPartyValue = custValue.getParty();
		if (voPartyValue != null && voPartyValue.getParty() != null) {
			IPartyValue partyValue = voPartyValue.getParty();
			// 客户名称不能为空
			if (StringUtils.isBlank(partyValue.getPartyName())) {
				ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000006"));// 参数错误，参数{0}不能为空！
			}
			// 客户类型必须为当前系统定义的客户类型
			if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.PARTY_TYPE, String.valueOf(partyValue.getPartyType())) == null) {
				// 参数错误，当前系统不存在类型为{0}的参与人类型定义！
				ExceptionUtil.throwBusinessException("CMS0030040", String.valueOf(partyValue.getPartyType()));
			}
			// 客户证件类型必须为当前系统定义的证件类型
			if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_CERT_TYPE + "_" + String.valueOf(partyValue.getPartyType()),
					String.valueOf(partyValue.getCertType())) == null) {
				// 参数错误，当前系统不存在类型为{0}的证件类型定义！
				// /ExceptionUtil.throwBusinessException("CMS0030041", String.valueOf(partyValue.getCertType()));
			}
			if (partyValue.getPartyType() == CmConstants.PartyType.INDIVIDUAL) {
				// 性别
				if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.GENDER, String.valueOf(partyValue.getGender())) == null) {
					// 参数错误，当前系统不存在类型为{0}的性别定义！
					ExceptionUtil.throwBusinessException("CMS0030042", String.valueOf(partyValue.getGender()));
				}
			}
		}
	}

	/**   
	 * 验证客户信息
	 * @Function validateCustomer
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:21:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateCustomer(IVOCustValue custValue) throws Exception {
		/*
		 * 检验客户信息是否合法
		 */
		ICustomerValue customerValue = custValue.getCustomer();
		// 如果没有客户信息就不验证客户信息
		if (customerValue != null) {
			// 客户名称不能为空
			if (StringUtils.isBlank(customerValue.getCustName())) {
				// 参数错误，参数{0}不能为空！
				ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000006"));
			}
			if (customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL
					&& (StringUtils.isBlank(customerValue.getFirstName()) || StringUtils.isBlank(customerValue.getLastName()))) {
				// 客户名称不能为空！
				ExceptionUtil.throwBusinessException("CMS0000141");
			}
			// 客户类型必须为当前系统定义的客户类型
			if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(customerValue.getCustType())) == null) {
				// 参数错误，当前系统不存在类型为{0}的客户类型定义！
				ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(customerValue.getCustType()));
			}
			if (customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
				// 性别
				if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.GENDER, String.valueOf(customerValue.getGender())) == null) {
					// 参数错误，当前系统不存在类型为{0}的性别定义！
					ExceptionUtil.throwBusinessException("CMS0030042", String.valueOf(customerValue.getGender()));
				}
			}
			// 只针对集团客户，对个人客户会有影响
			if (customerValue.isNew() || customerValue.isModified() && customerValue.getCustType() == CmConstants.CustomerType.GROUP) {
				IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CM_VALIDATE_CERT);
				for (int i = 0; i < values.length; i++) {
					StringBuffer condition = new StringBuffer(" 1=1 ");
					HashMap parameter = new HashMap();
					if (customerValue.getCustCertType() == Integer.valueOf(values[i].getCodeValue())) {
						condition.append(" AND ").append(ICustomerValue.S_CustCertType).append(" =:certType ");
						parameter.put("certType", customerValue.getCustCertType());
						condition.append(" AND ").append(ICustomerValue.S_CustCertCode).append(" =:certCode ");
						parameter.put("certCode", customerValue.getCustCertCode());
						condition.append(" AND ").append(ICustomerValue.S_CustId).append(" !=:custId ");
						parameter.put("custId", customerValue.getCustId());
						condition.append(" AND ").append(ICustomerValue.S_State).append(" =:state ");
						parameter.put("state", CmConstants.RecordState.USE);
						if (customerValue.getCustType() == 1) {
							// 个人客户不需要再次验重，处理客户的逻辑那边已经已经对个人有合并操作了
							// IBOCmIndivCustomerValue[] value = (IBOCmIndivCustomerValue[])
							// CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class,
							// condition.toString(), parameter, -1, -1);
							// if (null != value && value.length > 0) {
							// ExceptionUtil.throwBusinessException("CMS9988733");
							// }
						} else {
							IBOCmGroupCustomerValue[] value = (IBOCmGroupCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupCustomerBean.class,
									condition.toString(), parameter, -1, -1);
							if (null != value && value.length > 0) {
								ExceptionUtil.throwBusinessException("CMS9988733");
							}
						}
					}
				}
			}
			// 如果证件号码为空，证件类型不为空，则把证件类型置空，统一处理
			if (StringUtils.isBlank(customerValue.getCustCertCode())) {
				if (customerValue.getCustCertType() > 0) {
					customerValue.setCustCertType(0);
				}
			} else {
				if (customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
					customerValue.setCustCertType(CmConstants.CertificateType.CPR);
				}
			}
		}
	}

	private void validateAddrContMedium(IBOCmCustContactMediumValue contMedium) throws Exception {
		long addrType = contMedium.getContMedTypeId();
		// IBOCmCustContMedTypeValue[] allAddrType = customerSV.queryContElecMediumType();
		// 查询出所有的实体地址的类型
		IBOCmCustContMedTypeValue[] allAddrType = CmCustContMedTypeUtil.getCmCustContMedType(CmConstants.ContMedium.ENTITY_ADDR, CmConstants.ContMedium.CUSTOMER_MED_TYPE);
		boolean hasAddrType = false;
		for (int i = 0; i < allAddrType.length; i++) {
			if (addrType == allAddrType[i].getContMedTypeId()) {
				hasAddrType = true;
				break;
			}
		}
		if (!hasAddrType) {
			// 参数错误，当前系统不存在类型为{0}的定义！
			ExceptionUtil.throwBusinessException("CMS0022002");
		}
	}

	public void dealCustIdentification(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			if (custValue.hasCustIdentification()) {
				// 新增
				IBOIdentificationValue[] identificationValues = custValue.getCustIdentification();
				for (int i = 0; i < identificationValues.length; i++) {
					if (identificationValues[i].getIdenId() <= 0) {
						identificationValues[i].setIdenId(CmCommonUtil.getNewSequence(BOIdentificationBean.class));
						identificationValues[i].setPartyId(customerValue.getPartyId());
						identificationValues[i].setRegionId(customerValue.getRegionId());
						identificationValues[i].setState(CmConstants.RecordState.USE);
					}
					if (!identificationValues[i].isDeleted()) {
						// 删除时不需要校验
						validateDumpIden((int) identificationValues[i].getIdenType(), identificationValues[i].getIdenNr());
					}
				}
				dkCustomerSV.saveCustIdentification(identificationValues);
			} else {
				if (customerValue.isNew()) {
					if (customerValue.getCustCertType() > 0) {
						// IBOIdentificationValue identificationValue = new BOIdentificationBean();
						// identificationValue.setIdenId(CmCommonUtil.getNewSequence(BOIdentificationBean.class));
						// identificationValue.setIdenType(customerValue.getCustCertType());
						// identificationValue.setIdenNr(customerValue.getCustCertCode());
						// identificationValue.setPartyId(customerValue.getPartyId());
						// identificationValue.setRegionId(customerValue.getRegionId());
						// identificationValue.setState(CmConstants.RecordState.USE);
						// dkCustomerSV.saveCustIdentification(new IBOIdentificationValue[] { identificationValue });
						if (String.valueOf(CmConstants.PartyRoleType.CUSTOMER).equals(customerValue.getIndivCustType())
								&& customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
							//AI-7925 此custcerttype标识，不需要设置为0，此标识在其他地方，需要进行获取处理
							//customerValue.setCustCertType(0);
							customerValue.setCustCertCode(null);
							if (null != custValue.getParty() && null != custValue.getParty().getParty() && custValue.getParty().getParty().isNew()) {
								//AI-7925 此certtype标识，不需要设置为0，此标识在其他地方，需要进行获取处理
								//custValue.getParty().getParty().setCertType(0);
								custValue.getParty().getParty().setCertCode(null);
							}
						}
					}
				} else if (customerValue.isModified()) {
					// 修改或者新增时要将证件信息插入识别信息表
					IBOIdentificationValue[] values = dkCustomerSV.queryCustIdentifications(customerValue.getPartyId(), -1, null);
					if (values != null && values.length > 0) {
						for (int i = 0; i < values.length; i++) {
							if (values[i].getIdenType() == CmConstants.CustIdenType.CPR) {
								values[i].setIdenType(customerValue.getCustCertType());
								values[i].setIdenNr(customerValue.getCustCertCode());
								BOIdentificationBean bean = new BOIdentificationBean();
								bean.copy(values[i]);
								CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
							}
						}
					} else {
						// 补入cpr需要插入
						IBOIdentificationValue identificationValue = new BOIdentificationBean();
						identificationValue.setIdenId(CmCommonUtil.getNewSequence(BOIdentificationBean.class));
						identificationValue.setIdenType(customerValue.getCustCertType());
						identificationValue.setIdenNr(customerValue.getCustCertCode());
						identificationValue.setPartyId(customerValue.getPartyId());
						identificationValue.setRegionId(customerValue.getRegionId());
						identificationValue.setState(CmConstants.RecordState.USE);
						dkCustomerSV.saveCustIdentification(new IBOIdentificationValue[] { identificationValue });
					}
				}
			}
		}
	}

	private void validateDumpIden(int idenType, String idenCode) throws Exception {
		if (idenType <= 0 || StringUtils.isBlank(idenCode)) {
			// 没有获取到认证信息！
			ExceptionUtil.throwBusinessException("CMS0000165");
		}
		//appleId不用唯一校验，需求允许重复
		if (idenType != CmConstants.CustIdenType.APPLE_DEPT_ID) {
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			IBOIdentificationValue[] identificationValues = dkCustomerSV.queryCustIdentifications(-1, idenType, idenCode);
			if (identificationValues != null && identificationValues.length > 0) {
				// 当前的认证方式已经存在，请重新输入！
				ExceptionUtil.throwBusinessException("CMS0000166");
			}
		}
	}

}
