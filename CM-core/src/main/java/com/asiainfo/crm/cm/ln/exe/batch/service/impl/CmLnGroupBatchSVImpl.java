package com.asiainfo.crm.cm.ln.exe.batch.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmGroupCustContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.contact.bo.BOLnCmxPartyContactBean;
import com.asiainfo.crm.cm.ln.customer.contact.ivalues.IBOLnCmxPartyContactValue;
import com.asiainfo.crm.cm.ln.exe.batch.service.interfaces.ICmLnGroupBatchSV;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.GroupMemberBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

public class CmLnGroupBatchSVImpl implements ICmLnGroupBatchSV {

	private transient static Log log = LogFactory.getLog(CmLnGroupBatchSVImpl.class);

	public void importGroupFamily(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IContactValue iContactValue = new ContactBean();
		String billId = null;
		String custServiceId = null;
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					log.error("Customer service code can not be empty");
					throw new Exception("Customer service code can not be empty");
				} else if ("BILL_ID".equals(colNames[i])) {

					log.error("Mobile phone number can not be empty");
					throw new Exception("Mobile phone number can not be empty");
				}
			} else {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					custServiceId = colValues[i];// 客户服务编号
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];// 手机号码
				}
			}
		}
		// 更改人：康正凯 更改原因：集团成员必须是辽宁省移动号码 更改时间：2012-11-20日
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);

		if (groupValues == null || groupValues.length <= 0)
			throw new Exception("According to the customer number:[" + custServiceId + "]did not find the corresponding customer information!");
		/**
		 * 添加人：kangzk
		 * 添加原因：规则有问题所以重新添加规则
		 */
		// 根据手机号码查询用户信息
		ICmTeamInvokeSV icrmFsv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue iqUserBaseInfoValue = icrmFsv.getUserBaseInfoByBillId(billId);
		if (CmCommonUtil.isEmptyObject(iqUserBaseInfoValue)) {
			throw new Exception("According to the mobile phone number[" + billId + "] is not found the corresponding user information!");
		}

		if (!iqUserBaseInfoValue.getRegionId().equals(groupValues[0].getRegionId())) {
			throw new Exception("The user:" + billId + "and the group:" + custServiceId + "cities are not the same!");
		}

		ICustomerValue indivCustomer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(iqUserBaseInfoValue.getCustId());
		if (CmCommonUtil.isEmptyObject(indivCustomer))
			throw new Exception("According to the mobile phone number[" + billId + "] can not found The corresponding customer information!");

		// 根据手机号码查询网内成员信息
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_BillId, billId);
		condition.set(IGroupMemberValue.S_State, CmConstants.RecordState.USE);
		condition.set(IGroupMemberValue.S_CustId, groupValues[0].getCustId());
		condition.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
		IGroupMemberValue[] groupMembers = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupMembers)) {
			// ExceptionUtil.throwBusinessException("CMS1100205", billId);// 用户｛0｝已经是网内成员,不能再添加为家庭成员!
			throw new Exception("The user{" + billId + "} is already in the network group members, add not for family members!");
		}

		IContactValue[] contactValues = null;
		// 根据客户编号查询客户联系人信息
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupContactValue.S_BillId, billId);
		da.set(IBOCmGroupContactValue.S_State, CmConstants.RecordState.USE);
		da.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		contactValues = iCmContactSV.queryCustContacts(da, -1, -1);
		// 家庭成员
		for (int i = 0; i < contactValues.length; i++) {
			if (groupValues[0].getCustId() == contactValues[i].getCustId()) {
				if (CmConstants.CONT_TYPE.CONT_TYPE_3 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100123", billId);// 此用户已经是该集团的家庭成员!
				}
				if (CmConstants.CONT_TYPE.CONT_TYPE_1 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100112", contactValues[i].getContName());// 此客户已经为集团联系人不能成为集团家属
				}
				if (CmConstants.CONT_TYPE.CONT_TYPE_2 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100113", contactValues[i].getContName());// 此客户已经为集团关键人不能成为集团家属
				}
			}
			if (CmConstants.CONT_TYPE.CONT_TYPE_3 == contactValues[i].getContType()) {
				ExceptionUtil.throwBusinessException("CMS1100119", billId);// 此客户已经为集团关键人不能成为集团家属
			}
		}
		/*
		 * DataContainer dataContainer = new DataContainer();
		 * dataContainer.set(IGroupMemberValue.S_BillId, billId);
		 * dataContainer.set(IGroupMemberValue.S_State, CmConstants.RecordState.USE);
		 * dataContainer.set(IGroupMemberValue.S_CustId,groupValues[0].getcusti);
		 * dataContainer.set(IGroupMemberValue.S_MemberType,CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
		 * IGroupMemberValue[] groupMembers = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
		 * if (CmCommonUtil.isNotEmptyObject(groupMembers)) {
		 * ExceptionUtil.throwBusinessException("CMS1100205", billId);// 用户｛0｝已经是网内成员,不能再添加为家庭成员!
		 * }
		 */
		/**
		 * 以下代码注释原因：
		 * 	没有必要校验这些客户信息所以注销，如有疑问请联系kangzk
		 * 
		 * */
		// ICustomerValue groupValue = groupValues[0];
		// 根据证件类型及证件号码查询是否已经存在客户
		// queryDC.clear();
		// queryDC.set(ICustomerValue.S_CustCertType, custCertType);
		// queryDC.set(ICustomerValue.S_CustCertCode, custCertCode);
		// queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
		// ICustomerValue[] custValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);

		// long contCustId = 0L;

		// if (CmCommonUtil.isNotEmptyObject(custValues)) {
		// contCustId = custValues[0].getCustId();
		// }
		// else
		// {
		/*
		 * String regionId = groupValue.getRegionId();
		 * if(regionId==null)
		 * {
		 * if(ServiceManager.getUser()!=null)
		 * {
		 * regionId = (String)ServiceManager.getUser().get("REGION_ID");
		 * }
		 * }
		 * if(regionId==null)
		 * throw new Exception("无法获取地州信息");
		 * ICustomerValue custBean = new CustomerBean();
		 * custBean.setCustName(custName);
		 * custBean.setCustCertType(custCertType);
		 * custBean.setCustCertCode(custCertCode);
		 * custBean.setCustType(CmConstants.CustomerType.INDIVIDUAL);
		 * custBean.setRegionId(regionId);
		 * custBean.setCustStatus(CmConstants.CustomerStatus.ACTIVE);
		 * custBean.setRealNameFlag(CmConstants.realNameFlag.NOT_REAL_NAME);
		 * contCustId = CmServiceFactory.getCustomerSV().saveCustomer(custBean);
		 */
		// }

		// iContactValue = CmServiceFactory.getContactSV().queryCustContactById(-1, contCustId);

		// if (iContactValue == null) {
		// throwException 资料不完整
		// ExceptionUtil.throwBusinessException("CMS0000073");
		// }

		// 查询集团联系人关系表，判断这个联系人是否存在
		// queryDC.clear();
		// queryDC.set(iContactValue.S_CustId, custId);
		// queryDC.set(iContactValue.S_ContId, iContactValue.getContId());
		// queryDC.set(iContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_FAMILY);
		// int count = CmServiceFactory.getContactSV().queryCustContactCount(queryDC);

		// 该用户[{0}]已经是集团家属！
		// /if (count > 0) {
		// ExceptionUtil.throwBusinessException("CMS5000089");
		// }
		// iContactValue.copy(indivCustomer);
		iContactValue.set(iContactValue.S_State, CmConstants.RecordState.USE);
		iContactValue.set(iContactValue.S_RegionId, indivCustomer.getRegionId());
		iContactValue.set(iContactValue.S_PartyId, indivCustomer.getPartyId());
		iContactValue.set(iContactValue.S_ContId, indivCustomer.getContId());
		iContactValue.set(iContactValue.S_UserId, iqUserBaseInfoValue.getUserId());
		iContactValue.set(iContactValue.S_Brand, iqUserBaseInfoValue.getBrandIdDesc());
		iContactValue.set(iContactValue.S_CustId, groupValues[0].getCustId());
		iContactValue.set(iContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_FAMILY);
		iContactValue.set(iContactValue.S_BillId, billId);
		if (ServiceManager.getUser() != null) {
			iContactValue.set(iContactValue.S_CreateOpId, ServiceManager.getUser().getID());
			iContactValue.set(iContactValue.S_OpId, ServiceManager.getUser().getID());
			iContactValue.set(iContactValue.S_CreateOrgId, ServiceManager.getUser().getOrgId());
			iContactValue.set(iContactValue.S_OrgId, ServiceManager.getUser().getOrgId());
		}
		iContactValue.set(iContactValue.S_ExpireDate, TimeUtil.getMaxExpire());
		iContactValue.set(iContactValue.S_EffectiveDate, ServiceManager.getOpDateTime());
		iContactValue.set(iContactValue.S_CreateDate, ServiceManager.getOpDateTime());
		iContactValue.setStsToOld();

		custValue.addContact(iContactValue);
		CmServiceFactory.getContactSV().saveCustContact(custValue);

	}

	// 联系人
	public void importGroupContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IContactValue iContactValue = new ContactBean();
		String billId = "";
		String custServiceId = "";
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if (iContactValue.S_CustId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000086")); // 客户编号不能为空！
					ExceptionUtil.throwBusinessException("CMS5000086");
				} else if ("BILL_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				}
			} else {
				if (iContactValue.S_CustId.equals(colNames[i])) {
					custServiceId = String.valueOf(colValues[i]);
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];
				}
			}
		}

		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue userValue = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS5000088", billId);
		}
		// 更改人：康正凯 更改原因：规则添加 更改时间：2012-11-20
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);

		if (groupValues == null || groupValues.length <= 0)
			throw new Exception("According to the group number:" + custServiceId + "the group did not find the corresponding customer information!");

		if (!userValue.getRegionId().equals(groupValues[0].getRegionId())) {
			throw new Exception("The user:" + billId + "and the group:" + custServiceId + "cities are not the same!");
		}

		// 查询手机号码对应的联系人信息
		iContactValue = CmServiceFactory.getContactSV().queryCustContactById(-1, userValue.getCustId());
		iContactValue.setCustId(groupValues[0].getCustId());
		iContactValue.setBillId(billId);
		iContactValue.setBrand(userValue.getBrandIdDesc());
		iContactValue.setContType(CmLnConstants.GroupContType.GROUP_CONTACT); // 联系人
		iContactValue.setPrioryLevel(CmLnConstants.GroupContType.GROUP_CONTACT_SECONDE); // 非主要

		IContactValue[] contactValues = null;
		// 根据客户编号查询客户联系人信息 queryCustContacts
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupContactValue.S_BillId, billId);
		da.set(IBOCmGroupContactValue.S_State, CmConstants.RecordState.USE);
		da.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		contactValues = iCmContactSV.queryCustContacts(da, -1, -1);
		// 联系人
		for (int i = 0; i < contactValues.length; i++) {
			if (groupValues[0].getCustId() == contactValues[i].getCustId()) {
				if (CmConstants.CONT_TYPE.CONT_TYPE_3 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100114", contactValues[i].getContName());// 客户{0}是集团家庭成员，不能添加为集团联系人
				}
				if (CmConstants.CONT_TYPE.CONT_TYPE_1 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100122", billId);// 此用户已经是该集团的联系人!
				}
				if (contactValues[i].getBillId() == billId && CmConstants.CONT_TYPE.CONT_TYPE_1 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS5000139");// 该集团中已经存在此联系人！
				}
			}
			/*
			 * if (groupContact.getPrioryLevel() == CmConstants.CONT_LEVEL.CONT_LEVEL_1 &&
			 * CmConstants.CONT_LEVEL.CONT_LEVEL_1 == contactValues[i].getPrioryLevel()
			 * && CmConstants.CONT_TYPE.CONT_TYPE_1 == contactValues[i].getContType()) {
			 * ExceptionUtil.throwBusinessException("CMS1100146", billId);// 用户{0}已是其它集团的联系人,不能在添加为集团主要联系人
			 * }
			 */
		}
		// 查询集团联系人关系表，判断这个联系人是否存在
		/*
		 * DataContainer dc = new DataContainer();
		 * dc.set(iContactValue.S_CustId, custId);
		 * dc.set(iContactValue.S_ContId, iContactValue.getContId());
		 * dc.set(iContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
		 * int count = CmServiceFactory.getContactSV().queryCustContactCount(dc);
		 * if (count > 0) {
		 * // 该用户[{0}]已经是集团的联系人！
		 * ExceptionUtil.throwBusinessException("CMS5000089");
		 * }
		 */

		// 给客户对象赋值
		custValue.addContact(iContactValue);
		CmServiceFactory.getContactSV().saveCustContact(custValue);
	}

	// 关键人
	public void importGroupKeyContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IContactValue iContactValue = new ContactBean();
		String billId = "";
		// long custId = 0;
		String custServiceId = "";
		int memberType = 0;
		String memberJob = "";
		String memberDesc = "";
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if (iContactValue.S_CustId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000086")); // 客户编号不能为空！
					ExceptionUtil.throwBusinessException("CMS5000086");
				} else if ("BILL_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				} else if ("MEMBER_TYPE".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000090")); // 成员类型不能为空！
					ExceptionUtil.throwBusinessException("CMS5000090");
				} else if ("MEMBER_JOB".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000091")); // 职位不能为空！
					ExceptionUtil.throwBusinessException("CMS5000091");
				} else if ("MEMBER_DESC".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000092")); // 成员描述不能为空！
					ExceptionUtil.throwBusinessException("CMS5000092");
				}
			} else {
				if (iContactValue.S_CustId.equals(colNames[i])) {
					custServiceId = String.valueOf(colValues[i]);
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];
				} else if ("MEMBER_TYPE".equals(colNames[i])) {
					memberType = Integer.valueOf(colValues[i]);
				} else if ("MEMBER_JOB".equals(colNames[i])) {
					memberJob = colValues[i];
				} else if ("MEMBER_DESC".equals(colNames[i])) {
					memberDesc = colValues[i];
				}
			}
		}
		if (!CmCommonUtil.isEmptyObj(billId)) {// 手机号码不为空，设置中心
			CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID, billId);
		}
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue userValue = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS5000088", billId);
		}
		// 更改人：康正凯 更改原因：规则添加 更改时间：2012-11-20
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);

		if (groupValues == null || groupValues.length <= 0)
			throw new Exception("According to the group number:" + custServiceId + "did not find the corresponding customer information!");

		if (!userValue.getRegionId().equals(groupValues[0].getRegionId())) {
			throw new Exception("The user:" + billId + "and the group:" + custServiceId + "cities are not the same!");
		}
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userValue.getCustId());

		IContactValue[] contactValues = null;
		// 根据客户编号查询客户联系人信息 queryCustContacts
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupContactValue.S_BillId, billId);
		da.set(IBOCmGroupContactValue.S_State, CmConstants.RecordState.USE);
		da.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		contactValues = iCmContactSV.queryCustContacts(da, -1, -1);

		// 关键人
		for (int i = 0; i < contactValues.length; i++) {
			if (groupValues[0].getCustId() == contactValues[i].getCustId()) {
				if (CmConstants.CONT_TYPE.CONT_TYPE_2 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100121", billId);// 此用户已经是该集团的关键人!
				}
				if (CmConstants.CONT_TYPE.CONT_TYPE_3 == contactValues[i].getContType()) {
					ExceptionUtil.throwBusinessException("CMS1100114", contactValues[i].getContName());// 客户{0}是集团家庭成员，不能添加为集团关键人
				}
			}
		}
		int level = -1;
		int custLevel = groupValues[0].getCustServiceLevel();
		switch (custLevel) {
			case CmLnConstants.GroupLevel.LEVEL_INT_l1:
				level = CmLnConstants.GroupKeyPeop.LEVEL_3;
				break;
			case CmLnConstants.GroupLevel.LEVEL_INT_l2:
				level = CmLnConstants.GroupKeyPeop.LEVEL_3;
				break;
			case CmLnConstants.GroupLevel.LEVEL_INT_21:
				level = CmLnConstants.GroupKeyPeop.LEVEL_4;
				break;
			case CmLnConstants.GroupLevel.LEVEL_INT_22:
				level = CmLnConstants.GroupKeyPeop.LEVEL_4;
				break;
			case CmLnConstants.GroupLevel.LEVEL_INT_30:
				level = CmLnConstants.GroupKeyPeop.LEVEL_5;
				break;
			default:
				level = CmLnConstants.GroupKeyPeop.LEVEL_1;
				break;
		}
		try {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, billId);
			ICmLnClubServiceSV icmGrp = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
			icmGrp.saveVipLevel(billId, level, CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
		} catch (Exception e) {
			log.error("Key level calculation:" + e);
		}

		// 根据手机号码查询网内成员信息
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_State, CmConstants.RecordState.USE);
		condition.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
		condition.set(IGroupMemberValue.S_BillId, billId);
		IGroupMemberValue[] groupMembers = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
		if (CmCommonUtil.isEmptyObject(groupMembers)) {
			// 添加为网内成员// 如果一个人没加入到任何一个集团，当此人加入到一个集团作为关键人时同时会成为集团的网内成员记录
			IBOCmGroupMemberValue groupMember = new BOCmGroupMemberBean();
			// 判断用户是否为网内成员 并且是辽宁省移动号码
			// if (CmCommonUtil.isNotEmptyObject(groupContact) &&
			// StringUtils.isNotBlank(String.valueOf(groupContact.getUserId()))
			// && StringUtils.isNotBlank(groupContact.getRegionId()) &&
			// StringUtils.isNotBlank(String.valueOf(groupContact.getPartyId()))) {
			// 判断成员是否已经存在
			// if (CmCommonUtil.isEmptyObject(groupMembers)) {
			// 1、判断此网内成员是否 订购集团业务 没有订购则删除此集团网内成员 unifiedGroupQuery
			// ICmTeamInvokeSV
			// IcmTeam=(ICmTeamInvokeSV)ServiceFactory.getService(ICmTeamInvokeSV.class);
			// CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,billId);
			// List unList=IcmTeam.unifiedGroupQuery(String.valueOf(billId),
			// String.valueOf(groupContact.getCustId()));
			// if (unList.size()<0) {
			groupMember.setStsToNew();
			groupMember.copy(customerValue);
			groupMember.setMemberName(customerValue.getCustName());// IBOCmIndivCustomerValue indivCust
			groupMember.setMemberCustId(customerValue.getCustId());
			groupMember.setMemberType(CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);// 成员类型
			groupMember.setCustRegionId(groupValues[0].getRegionId());
			groupMember.setCustRelId(CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class));
			// CmCommonUtil.getNewSequence(BOCmGroupManagerBean.class)
			ICustRelationshipValue relationshipValue = new CustRelationshipBean();
			relationshipValue.copy(groupMember);
			relationshipValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			custValue.addCustRel(relationshipValue);
			// }
			// }
			// }
		}

		// 查询手机号码对应的联系人信息
		// iContactValue = CmServiceFactory.getContactSV().queryCustContactById(-1, userValue.getCustId());

		// 查询集团联系人关系表，判断这个联系人是否存在
		// DataContainer dc = new DataContainer();
		// dc.set(iContactValue.S_CustId, custId);
		// dc.set(iContactValue.S_ContId, iContactValue.getContId());
		// dc.set(iContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_KEY_PERSON);
		// int count = CmServiceFactory.getContactSV().queryCustContactCount(dc);
		// if (count > 0) {
		// 已经是集团的关键人物！
		// ExceptionUtil.throwBusinessException("CMS5000093");
		// }
		iContactValue.copy(customerValue);
		iContactValue.setCustId(groupValues[0].getCustId());
		iContactValue.setContType(CmLnConstants.GroupContType.GROUP_KEY_PERSON); // 关键人物
		iContactValue.setBillId(billId);
		iContactValue.setBrand(userValue.getBrandIdDesc());
		iContactValue.setMemberType(memberType);
		iContactValue.setMemberJob(memberJob);
		iContactValue.setMemberDesc(memberDesc);

		// 给客户对象赋值
		custValue.addContact(iContactValue);
		CmServiceFactory.getContactSV().saveCustContact(custValue);
	}

	// 批量导入集团成员
	public void importGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IBOCmGroupMemberValue iboCmGrpMember = new BOCmGroupMemberBean();
		String billId = "";
		// long custId = -1;
		String custServiceId = "";
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if (iboCmGrpMember.S_CustId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000086")); // 客户编号不能为空！
					ExceptionUtil.throwBusinessException("CMS5000086");
				} else if ("BILL_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				}
			} else {
				if (iboCmGrpMember.S_CustId.equals(colNames[i])) {
					custServiceId = String.valueOf(colValues[i]);// 集团编号
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];
				}
			}
		}
		// 查询用户信息
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue userValue = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS8000033", billId);
		}
		// 根据客户编号查询个人客户信息
		ICmCustomerSV iCmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = iCmCustomerSV.queryCustomerByCustId(userValue.getCustId());
		if (custValue == null) {
			// 根据手机号码{0}没有找到对应的客户信息！
			ExceptionUtil.throwBusinessException("CMS8000033", billId);
		}

		// 查询集团客户信息
		// ICustomerValue grpCustValue = iCmCustomerSV.queryCustomerByCustId(custId);
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		if (groupValues == null || groupValues.length < 1) {
			// 根据手机号码{0}没有找到对应的客户信息！
			ExceptionUtil.throwBusinessException("CMS8000033", billId);
		}
		if (groupValues[0].getRegionId().equals(userValue.getRegionId())) {
			// 判断成员是否已经存在
			DataContainer condition = new DataContainer();
			condition.set(IGroupMemberValue.S_State, CmConstants.RecordState.USE);
			condition.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
			condition.set(IGroupMemberValue.S_BillId, billId);
			IGroupMemberValue[] groupMembers = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(groupMembers)) {
				// 该客户已经加入了一个集团！
				// ExceptionUtil.throwBusinessException("CMS5000138");
				ICustomerValue grpCustValue = iCmCustomerSV.queryCustomerByCustId(groupMembers[0].getCustId());
				throw new Exception("The customer[" + billId + "]has joined a group[" + grpCustValue.getCustName() + "]");
			}
			// DataContainer dc = new DataContainer();
			// dc.set(IGroupMemberValue.S_MemberCustId, Long.valueOf(custValue.getCustId()));
			// IGroupMemberValue[] iboCmGrpMemberValues = iCmCustomerSV.queryGroupMembers(dc, -1, -1);
			// if (CmCommonUtil.isNotEmptyObject(iboCmGrpMemberValues)) {
			// // 该客户已经加入了一个集团！
			// ExceptionUtil.throwBusinessException("CMS8000034");
			// }

			// 保存集团成员
			long relId = CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class);
			IGroupMemberValue memberValue = new GroupMemberBean();
			memberValue.setCustRelId(relId);// 主键 成员编号
			memberValue.setMemberCustId(userValue.getCustId());// 客户编号
			memberValue.setMemberName(custValue.getCustName());// 客户名称
			memberValue.setMemberType(CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);// 成员状态 1 网内成员 2 网外成员
			memberValue.setCustRegionId(custValue.getRegionId());// 个人用户地市
			memberValue.setState(CmLnConstants.GroupManagerState.State_U);// 状态
			memberValue.setRegionId(custValue.getRegionId());// 地市
			memberValue.setCustId(groupValues[0].getCustId());
			memberValue.setBillId(billId);
			memberValue.setUserId(userValue.getUserId());
			memberValue.setBrand(userValue.getBrandIdDesc());

			CmServiceFactory.getCustomerSV().saveGroupMember(memberValue);
		} else {
			ExceptionUtil.throwBusinessException("CMS1100203", custServiceId, String.valueOf(userValue.getUserId()));
		}

	}

	public void deleteGroupFamily(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		String billId = null;
		String custServiceId = null;
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					log.error("Customer service code can not be empty");
					throw new Exception("Customer service code can not be empty");
				} else if ("BILL_ID".equals(colNames[i])) {

					log.error("Mobile phone number can not be empty");
					throw new Exception("Mobile phone number can not be empty");
				}
			} else {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					custServiceId = colValues[i];// 客户服务编号
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];// 手机号码
				}
			}
		}
		// 集团成员必须是辽宁省移动号码
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);// 服务编号
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);// 集团
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);

		if (groupValues == null || groupValues.length <= 0)
			throw new Exception("According to customer service[" + custServiceId + "]did not find the corresponding customer information!");
		long custId = groupValues[0].getCustId();
		int countMgr = checkIsManager(custId);
		if (countMgr <= 0) {
			long opId = ServiceManager.getUser().getID();
			throw new Exception("Current operations staff numbers[" + opId + "]is not the group customer manager, not to delete operation!");
		}
		// 查找集团联系人信息
		DataContainer dm = new DataContainer();
		dm.set(IBOCmGroupContactValue.S_CustId, custId);// 客户编码
		dm.set(IBOCmGroupContactValue.S_BillId, billId);// 成员手机号
		dm.set(IBOCmGroupContactValue.S_ContType, CmConstants.CONT_TYPE.CONT_TYPE_3);// 3为集团成员
		IContactValue[] values = iCmContactSV.queryCustContacts(dm, -1, -1);
		if (values == null || values.length == 0) {
			throw new Exception("The member[" + billId + "]is not the group[" + custServiceId + "]The family, does not need to operate!");
		}
		int count = values.length;
		for (int i = 0; i < count; i++) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, values[i].getBillId());
			ICmTeamInvokeSV iCmTeamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getCrossCenterService(ICmTeamInvokeSV.class);
			// 查看该集团家属是否订购了策划
			Map map = iCmTeamInvokeSV.unifiedGroupQuery(values[i].getBillId(), String.valueOf(values[i].getCustId()));
			boolean flag = (Boolean) map.get("FLAG");

			if (!flag) {
				// 如果订购了策划，则不能删除
				// CMS1100240 --- 集团家属办理了{0}集团业务,不能修改或删除!
				ExceptionUtil.throwBusinessException("CMS1100240", new String[] { values[i].getBillId(), (String) map.get("OFFER_NAME") });
			} else {
				// 联系人辽宁扩展信息
				IBOLnCmxPartyContactValue cmxPartyContactValue = new BOLnCmxPartyContactBean();
				// cmxPartyContactValue.copy(custExtValues[0]);
				cmxPartyContactValue.setPartyId(values[i].getPartyId());
				cmxPartyContactValue.setRegionId(values[i].getRegionId());
				IVOCustValue custValue = new VOCustBean();
				values[i].delete();
				custValue.addContact(values[i]);
				custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
				custValue.setUserObject(CmLnConstants.DealCustInfo.DEAL_CONTACT, cmxPartyContactValue);
				CmServiceFactory.getContactSV().saveCustContact(custValue);
			}

		}
	}

	/**
	 * 
	* @Function: CmLnGroupBatchSVImpl.java
	* @Description: 检查是否是该集团的客户经理
	*
	* @custId:客户编号
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	 * @throws Exception 
	* @date: Dec 5, 2012 7:57:43 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 5, 2012     suntao6           v1.0.0              修改原因
	 */
	public int checkIsManager(long custId) throws Exception {
		long opId = ServiceManager.getUser().getID();
		StringBuffer sqlMgr = new StringBuffer("");
		Map param = new HashMap();
		sqlMgr.append(" 1 = 1 AND  STATE = :state ");
		sqlMgr.append(" AND CUST_ID = :custId ");
		sqlMgr.append(" AND MANAGER_ID = :managerId ");
		param.put("state", CmConstants.RecordState.USE);
		param.put("custId", custId);
		param.put("managerId", opId);
		int countMgr = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupManagerBean.class, sqlMgr.toString(), param);
		return countMgr;
	}

	// 批量导入集团成员
	public void deleteGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IBOCmGroupMemberValue iboCmGrpMember = new BOCmGroupMemberBean();
		String billId = "";
		long custServiceId = -1;
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if (iboCmGrpMember.S_CustId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000086")); // 客户编号不能为空！
					ExceptionUtil.throwBusinessException("CMS5000086");
				} else if ("BILL_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				}
			} else {
				if (iboCmGrpMember.S_CustId.equals(colNames[i])) {
					custServiceId = Long.valueOf(colValues[i]);// 集团编号
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];
				}
			}
		}
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(String.valueOf(custServiceId), CmLnConstants.CustType.CUST_TYPE_GROUP);
		if (CmCommonUtil.isEmptyObject(customerValue))
			throw new Exception("Group customer number[" + custServiceId + "]does not exist!");
		long opId = ServiceManager.getUser().getID();
		StringBuffer sqlMgr = new StringBuffer("");
		Map param = new HashMap();
		sqlMgr.append(" 1 = 1 AND  STATE = :state ");
		sqlMgr.append(" AND CUST_ID = :custId ");
		sqlMgr.append(" AND MANAGER_ID = :managerId ");
		param.put("state", CmConstants.RecordState.USE);
		param.put("custId", customerValue.getCustId());
		param.put("managerId", opId);
		int countMgr = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupManagerBean.class, sqlMgr.toString(), param);
		if (countMgr <= 0)
			throw new Exception("Current operations staff numbers[" + opId + "]is not the group's account manager and can not delete !");

		StringBuffer sql = new StringBuffer("");
		Map parameter = new HashMap();
		sql.append(" SELECT * FROM  (").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupMemberBean.class).getMapingEnty()).append(")");
		sql.append(" WHERE 1 = 1 ");
		sql.append(" AND CUST_ID = :custId ");
		sql.append(" AND BILL_ID = :billId ");
		sql.append(" AND MEMBER_TYPE = :memberType ");

		parameter.put("custId", customerValue.getCustId());
		parameter.put("billId", billId);
		parameter.put("memberType", CmLnConstants.GroupContType.GROUP_MEMBER_INNER);
		// 查找集团成员信息
		DataContainerInterface[] custValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupMemberBean.class, sql.toString(), parameter);
		if (CmCommonUtil.isEmptyObject(custValues))
			throw new Exception("The mobile phone number[" + billId + "]is not group[" + custServiceId + "]The network members, cannot delete operation!");
		IVOCustValue custValue = new VOCustBean();
		if (CmCommonUtil.isNotEmptyObject(custValues)) {

			custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
			ICustRelationshipValue custRelValue = new CustRelationshipBean();
			custRelValue.copy(custValues[0]);
			custRelValue.delete();
			// 判断集团成员是否订购产品
			if (CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN == custRelValue.getMemberType()) {
				checkGrpMember(custRelValue.getBillId(), String.valueOf(custRelValue.getCustId()));
			}
			custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			custValue.addCustRel(custRelValue);
			// custValue.setUserObject(CmLnConstants.DealCustInfo.DEAL_GROUP_MEMBER, new
			// IBOLnCmxGroupMemberValue[] { cmxGroupMemberValue });
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			customerSV.saveCustomer(custValue);
		}
	}

	// 是否订购集团产品
	private void checkGrpMember(String billId, String grpCustId) throws Exception {
		// 判断集团成员是否订购产品
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, billId);
		ICmTeamInvokeSV iCmTeamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getCrossCenterService(ICmTeamInvokeSV.class);
		Map map = iCmTeamInvokeSV.unifiedGroupQuery(billId, grpCustId);
		boolean flag = (Boolean) map.get("FLAG");

		if (!flag) {
			// 如果订购了策划，则不能删除
			throw new Exception("Group members[" + billId + "]handled[" + (String) map.get("OFFER_NAME") + "]the group's business, can not be deleted!");
		}
	}

	// 联系人
	public void deleteGroupContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IContactValue iContactValue = new ContactBean();
		String billId = "";
		long custServiceId = 0;
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if (iContactValue.S_CustId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000086")); // 客户编号不能为空！
					ExceptionUtil.throwBusinessException("CMS5000086");
				} else if ("BILL_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				}
			} else {
				if (iContactValue.S_CustId.equals(colNames[i])) {
					custServiceId = Long.valueOf(colValues[i]);
				} else if ("BILL_ID".equals(colNames[i])) {
					billId = colValues[i];
				}
			}
		}

		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue userValue = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS5000088", billId);
		}

		// 更改人：康正凯 更改原因：规则添加 更改时间：2012-11-20
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);

		if (groupValues == null || groupValues.length <= 0)
			throw new Exception("According to the customer number:" + custServiceId + "did not find the corresponding customer information!");

		if (!userValue.getRegionId().equals(groupValues[0].getRegionId())) {
			throw new Exception("The user :" + billId + "and the group:" + custServiceId + "Cities are not the same!");
		}

		long opId = ServiceManager.getUser().getID();
		StringBuffer sqlMgr = new StringBuffer("");
		Map param = new HashMap();
		// sqlMgr.append(" SELECT * FROM ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupManagerBean.class).getMapingEnty());
		sqlMgr.append(" 1 = 1 AND  STATE = :state ");
		sqlMgr.append(" AND CUST_ID = :custId ");
		sqlMgr.append(" AND MANAGER_ID = :managerId ");
		param.put("state", CmConstants.RecordState.USE);
		param.put("custId", groupValues[0].getCustId());
		param.put("managerId", opId);
		int countMgr = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupManagerBean.class, sqlMgr.toString(), param);
		if (countMgr <= 0)
			throw new Exception("The current operator" + opId + "is not the group customer manager, not to delete operation!");

		StringBuffer sql = new StringBuffer("");
		Map parameter = new HashMap();
		sql.append(" SELECT * FROM  (").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(QBOCmGroupCustContactBean.class).getMapingEnty()).append(")");
		sql.append(" WHERE 1 = 1 ");
		sql.append(" AND CUST_ID = :custId ");
		sql.append(" AND BILL_ID = :billId ");
		sql.append(" AND CONT_TYPE = :contType ");

		parameter.put("custId", groupValues[0].getCustId());
		parameter.put("billId", billId);
		parameter.put("contType", CmLnConstants.GroupContType.GROUP_CONTACT);
		DataContainerInterface[] custValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupCustContactBean.class, sql.toString(), parameter);

		DataContainerInterface[] custExtValues = null;

		IBOLnCmxPartyContactValue partyContactValue = new BOLnCmxPartyContactBean();
		partyContactValue.copy(custValues[0]);
		custExtValues = new DataContainerInterface[] { (DataContainerInterface) partyContactValue };

		if (CmCommonUtil.isNotEmptyObject(custValues) || CmCommonUtil.isNotEmptyObject(custExtValues)) {

			// 联系人主表信息
			iContactValue.copy(custValues[0]);
			iContactValue.delete();

			if (iContactValue.getPrioryLevel() == CmConstants.CONT_LEVEL.CONT_LEVEL_1) {
				ICmTeamInvokeSV iCmTeamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
				List list = iCmTeamInvokeSV.groupQueryByBillIdCustId(billId, String.valueOf(groupValues[0].getCustId()));
				if (!list.isEmpty()) {
					IInsOfferValue[] insOffer = (IInsOfferValue[]) list.toArray(new IInsOfferValue[0]);
					throw new Exception("The phone [" + billId + "]as the main contact, ordered[" + insOffer[0].getOrderName() + "]Group products can not be deleted");
				}
			}
			// iContactValue.setContName(custValues[0].getAsString(iContactValue.S_PartyName));
			// 联系人辽宁扩展信息
			IBOLnCmxPartyContactValue cmxPartyContactValue = new BOLnCmxPartyContactBean();
			cmxPartyContactValue.copy(custExtValues[0]);
			cmxPartyContactValue.setPartyId(iContactValue.getPartyId());
			cmxPartyContactValue.setRegionId(iContactValue.getRegionId());

			custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);

			// 给客户对象赋值
			custValue.addContact(iContactValue);
			// 辽宁联系人扩展信息
			custValue.setUserObject(CmLnConstants.DealCustInfo.DEAL_CONTACT, cmxPartyContactValue);

			CmServiceFactory.getContactSV().saveCustContact(custValue);
		}
	}
}
