package com.asiainfo.crm.cm.ln.busimodel.customer;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.order.service.interfaces.IOrderQrySV;
import com.ai.omframe.util.InsServiceFactory;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCfgTableAttrUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.common.util.JexlCalculate;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustAttrBean;
import com.asiainfo.crm.cm.customer.group.bo.BoCmGroupAccountingEngine;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainBean;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.dk.bo.BOCmPsOptinSyncC3Bean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsOptinSyncC3Value;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.dk.ws.ImsHisQueryServiceClient;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBill;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.common.util.CmLnEnter;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupMemberBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupMemberValue;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.common.notes.tl.util.DateTimeUtil;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumOriginValue;
import com.asiainfo.crm.res.teaminvoke.out.service.interfaces.IRes2InterFSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IOrdOTTSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IPhoneBookSV;

public class CmLnCustDealBusiModelImpl extends AbstractCustomerDealBusiModelImpl {

	private static transient Log log = LogFactory.getLog(CmLnCustDealBusiModelImpl.class);
	public static final String TABLE_NAME_GROUP_ATTR = "CM_GROUP_CUST_ATTR";

	protected void dealOtherThings(IVOCustValue custValue) throws Exception {
		// 集团扩展信息处理
		dealCmCustomerKz(custValue);
		// 个人客户集团客户转离网或者在网记录扩展表
		dealCustomerStatus(custValue);
		// add by zhuyy at 2014-4-21,增加集团客户细分关系
		dealCmSegmentRale(custValue);

		dealCmAccounting(custValue);

		// 新增集团，默认给建一个组织
		saveGroupOrg(custValue);

		// 新增、客户注销、离网转潜在插入客户送CPR任务请求工单表
		if (custValue.getCustomer() != null) {
			dealNotiFyThirdParty(custValue.getCustomer());
		}

		// 同步客户地址
		dealNotifyAddress(custValue);

		// 如果客户修改了DPI字段，则需要送C3工单
		dealNotifyC3(custValue);

		// 创建一个使用者需要送cpr
		// dealSendUser(custValue);

		// 如果客户修改了生理状态信息(正常-->聋哑)，需要订购聋哑人offer啊啊
		dealOrderOffer(custValue);

		// 针对号码的预占信息
		dealForPreOccupyNum(custValue);

		// 针对客户的营销免打扰的逻辑
		dealForCommercialProtect(custValue);

		// 客户信息(缴费期、是否免受托收费) 同步账户
		dealSynCustInfoToAcct(custValue);

	}

	private void dealNotifyAddress(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null && customerValue.isNew()) {
			long custId = customerValue.getCustId();
			IQBOCmCustContMediumAndTypeValue[] contMediumAndTypeValues = CmServiceFactory.getCustomerSV().queryCustContactMediums(custId,
					CmDkConstants.CustContMedium.LEGAL_ADDRESS, CmDkConstants.CustContMedium.ADDRESS, -1, -1);
			if (contMediumAndTypeValues != null && contMediumAndTypeValues.length > 0) {
				List mediums = new ArrayList();
				Map temp = new HashMap();
				temp.put("CONTACT_ID", contMediumAndTypeValues[0].getCustContRelaId());
				temp.put("CONTACT_TYPE", 1);
				temp.put("CUST_ID", custId);
				temp.put("DONE_CODE", ServiceManager.getDoneCode());
				temp.put("COUNTRY_ID", customerValue.getCityId());
				temp.put("PROV_CODE", customerValue.getProvinceId());
				temp.put("REGION_ID", StringUtils.isBlank(customerValue.getRegionId()) ? CmCommonUtil.getDefaultRegionId() : customerValue.getRegionId());
				temp.put("ADDRESS", contMediumAndTypeValues[0].getAddressDetail());
				temp.put("OPER_TYPE", 1);
				temp.put("ADDRESS_ID", contMediumAndTypeValues[0].getAddressId());
				temp.put("VALID_DATE", ServiceManager.getOpDateTime());
				temp.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
				temp.put("COMMIT_DATE", ServiceManager.getOpDateTime());
				
				//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
				IBOCmCustContactMediumValue[]  emailCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 21);
				if(null!=emailCmCustContactMediumValues&&emailCmCustContactMediumValues.length>0){
					temp.put("CUST_EMAIL", emailCmCustContactMediumValues[0].getEmailAddress());
				}
				
				//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
				IBOCmCustContactMediumValue[]  phoneNumCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 31);
				if(null!=phoneNumCmCustContactMediumValues&&phoneNumCmCustContactMediumValues.length>0){
					temp.put("PHONE_NUMBER", phoneNumCmCustContactMediumValues[0].getContNumber());
				}
				mediums.add(temp);
				// Map result = new HashMap();
				// result.put("I_CONTACT", mediums);
				// map接口修改为同步接口，将地址塞入大对象中，uip获取后跟客户一起送billing
				custValue.setUserObject("I_CONTACT", mediums);
				// IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV)
				// ServiceFactory.getService(IInterfaceBillCrmSV.class);
				// interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
			}
		}
	}

	private void dealGroupAttr(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null && customerValue.getCustType() == CmConstants.CustomerType.GROUP) {
			IBOCmCfgTableAttrValue[] tableAttrValues = CmCfgTableAttrUtil.getCfgTableAttrValues(TABLE_NAME_GROUP_ATTR);
			IBOCmGroupCustAttrValue temp = null;
			List result = new ArrayList();
			if (tableAttrValues != null && tableAttrValues.length > 0) {
				for (int i = 0; i < tableAttrValues.length; i++) {
					String value = (String) customerValue.get(tableAttrValues[i].getAttrCode());
					if (StringUtils.isNotBlank(value)) {
						temp = new BOCmGroupCustAttrBean();
						temp.copy(customerValue);
						temp.setAttrCode(tableAttrValues[i].getAttrCode());
						temp.setAttrValue(value);
						temp.setState(CmConstants.RecordState.USE);
						if (customerValue.isNew()) {
							temp.setStsToNew();
						} else if (customerValue.isModified()) {
							temp.initProperty(IBOCmGroupCustAttrValue.S_CustId, customerValue.getCustId());
							temp.initProperty(IBOCmGroupCustAttrValue.S_AttrCode, tableAttrValues[i].getAttrCode());
						}
						result.add(temp);
					}
				}
			}
			if (!result.isEmpty()) {
				ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
				groupCustomerSV.saveGroupCustAttr((IBOCmGroupCustAttrValue[]) result.toArray(new IBOCmGroupCustAttrValue[0]));
			}
		}
	}

	private void saveGroupOrg(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null && customerValue.isNew()) {
			if (customerValue.getCustType() == CmConstants.CustomerType.GROUP) {
				BOCmGroupOrgStructBean custOrganizeValue = new BOCmGroupOrgStructBean();
				custOrganizeValue.copy(customerValue);
				custOrganizeValue.setParentDeptId(customerValue.getCustId());
				custOrganizeValue.setRelCustId(customerValue.getCustId());
				custOrganizeValue.setCustId(customerValue.getCustId());
				custOrganizeValue.setDeptName(customerValue.getCustName());
				custOrganizeValue.setState(CmConstants.RecordState.USE);
				custOrganizeValue.setDeptType(0);
				custOrganizeValue.setIsRevisable(CmConstants.YesOrNo.YES);
				custOrganizeValue.setDeptId(BOCmGroupOrgStructEngine.getNewId().longValue());
				if (StringUtils.isNotBlank(custOrganizeValue.getRemarks())) {
					custOrganizeValue.clearProperty("REMARKS");
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new BOCmGroupOrgStructBean[] { custOrganizeValue });

				// 同步给billing
				Map custMap = new HashMap();
				Map map = new HashMap();
				map.put("CUST_ID", custOrganizeValue.getCustId());
				map.put("TOP_CUST_ID", custOrganizeValue.getCustId());
				map.put("PARENT_CUST_ID", custOrganizeValue.getCustId());
				map.put("OPER_TYPE", "1");
				map.put("VALID_DATE", custOrganizeValue.getEffectiveDate());
				map.put("EXPIRE_DATE", custOrganizeValue.getExpireDate());
				map.put("DONE_CODE", custOrganizeValue.getDoneCode());
				// map.put("DONE_DATE", orgStructValue.getDoneDate());
				List mspList = new ArrayList();
				mspList.add(map);
				custMap.put("I_CUST_REL", mspList);
				CmServiceFactory.getTeamInvokeSV().sendMapOrderInfoToBilling(custMap);
			}
		}
	}

	private void sendMsg(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustManagers()) {
			ICustManagerValue[] custManagerValues = custValue.getCustManagers();
			int count = custManagerValues.length;
			long custId = custManagerValues[0].getCustId();
			String cust_service_id = "";
			DataContainer queryDC = new DataContainer();
			queryDC.set(ICustomerValue.S_CustId, custId);
			queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(groupValues)) {
				cust_service_id = groupValues[0].getCustServiceId();// 设置集团服务编码
			}

			String custName = "";
			if (custValue.getCustomer() == null) {
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
				if (customerValue != null) {
					custName = customerValue.getCustName();
				}
			} else {
				custName = custValue.getCustomer().getCustName();
			}
			String groupCustName = custName + "[" + cust_service_id + "]";// 主要服务客户经理名称
			String name = ServiceManager.getUser().getName();
			long operId = ServiceManager.getUser().getID();
			String opName = name + "[" + operId + "]";// 操作员名称
			String date = DateTimeUtil.getCurrDateTime();
			for (int j = 0; j < count; j++) {
				/**
				 * 10086撰写：尊敬的客户经理：您好！系统已经设置您成为集团：
				 * 阜新新澳房地产开发有限公司[2501089008]的主要服务客户经理，
				 * 谢谢！操作员：吕刚[18010924],操作时间:2012-12-05 14:49:58
				 */
				if (custManagerValues[j].getRelType() == 1) {// 如果客户经理的操作类型为主要服务客户经理，则下发短信
					Map msgMap = new HashMap();
					msgMap.put("GROUP_CUST_NAME", groupCustName);// 主要服务客户经理
					msgMap.put("OPNAME", opName);// 操作员
					msgMap.put("CODE_TIME", date);// 操作时间
					ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
					IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(custManagerValues[j].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					String billId = secStaff.getBillid();
					if (StringUtils.isNotBlank(billId)) {// 如果手机号码不为空则调用发短信的方法，add
						// by suntao 页面已经增加了支持跨中心参数，这边直接设置中心
						// CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID,
						// billId);
						// CmLnSmsSend.sendSmsPendIng(billId, "18000016",
						// msgMap);
					}
				}

			}
		}

	}

	/**
	 * 当新增集团网内成员对象的时候更改集团状态
	 * CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER
	 * 
	 * @param custValue
	 * @throws Exception
	 */
	private void updateGrpCustStatus(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustRel()) {
			ICustRelationshipValue[] custRelValues = custValue.getCustRels();
			for (int i = 0; i < custRelValues.length; i++) {
				switch (custRelValues[i].getRelationType()) {
				// 处理集团成员信息
					case CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER:
						if (custRelValues[i].getMemberType() == CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN) {// 网内成员
							// 根据集团编号查询集团客户信息
							ICmCustomerSV iCmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
							ICustomerValue icust = iCmCustomerSV.queryCustomerByCustId(custRelValues[i].getCustId());
							if (icust.getCustStatus() == CmLnConstants.CM_STATUS.GRP_STATUS_1 && custRelValues[i].isNew()) {
								iCmCustomerSV.updateCustStatus(custRelValues[i].getCustId(), CmLnConstants.CM_STATUS.GRP_STATUS_0, icust.getCustStatus());
							}
							// 将集团状态更改为潜在状态
							if (icust.getCustStatus() == CmLnConstants.CM_STATUS.GRP_STATUS_0 && custRelValues[i].isDeleted()) {
								// 根据集团编号查询集团是否存在集团成员或者订购集团业务
								DataContainer dt = new DataContainer();
								dt.set(IGroupMemberValue.S_CustId, custRelValues[i].getCustId());
								dt.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
								IGroupMemberValue[] grpMember = iCmCustomerSV.queryGroupMembers(dt, -1, -1);
								if (CmCommonUtil.isEmptyObject(grpMember)) {
									// 判断集团是否订购业务isUserByCustIdState
									ICmTeamInvokeSV cmTeam = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
									if (cmTeam.isUserByCustIdState(custRelValues[i].getCustId())) {
										// 没有订购集团业务
										iCmCustomerSV.updateCustStatus(custRelValues[i].getCustId(), CmLnConstants.CM_STATUS.GRP_STATUS_1, icust.getCustStatus());
									}
								}
							}
						}
						break;
					default:
						break;
				}
			}
		}
	}

	// 集团级别变更后计算关键人级别
	private void updateGrpCustContact(IVOCustValue custValue) throws Exception {
		ICustomerValue icustValue = custValue.getCustomer();
		if (CmCommonUtil.isNotEmptyObject(icustValue) && (icustValue.isModified() || icustValue.isDeleted())) {
			if (icustValue.getCustType() == CmConstants.CustomerType.GROUP) {
				// 根据集团编号查询集团客户对象
				ICmCustomerSV icmCustSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue customerValues = icmCustSV.queryCustomerByCustId(icustValue.getCustId());
				if (CmCommonUtil.isNotEmptyObject(customerValues) && customerValues.getCustServiceLevel() != icustValue.getCustServiceLevel()) {
					ICmLnClubServiceSV icmLnClub = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
					icmLnClub.updateGrpCustomerContactLevel(icustValue.getCustId(), icustValue.getCustServiceLevel());
				}
			}
		}
	}

	// 客户信用等级添加
	private void custUserSpeuserMain(IVOCustValue custValue) throws Exception {
		// 客户信用等级添加
		IBOCmUserSpeuserMainValue[] cmUserSperMain = (IBOCmUserSpeuserMainValue[]) custValue.getUserObject(CmLnConstants.MainMeth.CM_USER_SPEUSERMAIN);
		List list = new ArrayList();
		BOCmUserSpeuserMainBean boCmuserBeans = new BOCmUserSpeuserMainBean();
		if (!CmCommonUtil.isEmptyObject(cmUserSperMain)) {
			for (int i = 0; i < cmUserSperMain.length; i++) {
				boCmuserBeans.copy(cmUserSperMain[i]);
				list.add(boCmuserBeans);
				checkUserSpeuserMain(boCmuserBeans);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmUserSpeuserMainBean[]) list.toArray(new BOCmUserSpeuserMainBean[0]));
		}
	}

	// 校验
	private void checkUserSpeuserMain(BOCmUserSpeuserMainBean boCmuserBeans) throws Exception {
		if (boCmuserBeans.isNew() || boCmuserBeans.isModified()) {
			if (boCmuserBeans.getCreditLevel() == CmConstants.CM_CREDIT_LEVEL.CM_CREDIT_LEVEL_65) {
				ICmTeamInvokeSV iser = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
				if (ServiceManager.getUser() != null) {
					boolean iboSec = iser
							.checkSecEntityPermission(ServiceManager.getUser().getID(), CmLnEnter.enterUserSpeuser.ACCOUNT_UP_ENTID, CmLnEnter.enterUserSpeuser.PRIVID);
					if (!iboSec) {
						ExceptionUtil.throwBusinessException("CMS1100168");
					}
				}
			}
		}
	}

	// 集团客户细分关系处理
	private void dealCmSegmentRale(IVOCustValue custValue) throws Exception {
		IBOCmCustSegmentRelaValue segmentRela = (IBOCmCustSegmentRelaValue) custValue.getUserObject("cmSegmentRela");
		ICustomerValue customerValue = custValue.getCustomer();
		ICmCustSegmentRelaSV segmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		if (segmentRela != null) {
			segmentRelaSV.saveSegmentRela(segmentRela);
			if (null != customerValue) {
				custValue.getCustomer().setSegmentId(String.valueOf(segmentRela.getSegmentId()));
			}
		} else {
			if (null != customerValue) {
				segmentRela = segmentRelaSV.querySegmentRelaByCustId(customerValue.getCustId());
				if (segmentRela != null) {
					custValue.getCustomer().setSegmentId(String.valueOf(segmentRela.getSegmentId()));
				}
			}
		}

	}

	// 集团客户会计信息处理
	private void dealCmAccounting(IVOCustValue custValue) throws Exception {
		IBoCmGroupAccountingValue[] custAccountingValue = custValue.getCustAccounting();
		if (custAccountingValue != null && custAccountingValue.length > 0) {
			// 设置regionId和操作员组织信息
			custAccountingValue[0].setCreateDate(custValue.getCustomer().getCreateDate());
			custAccountingValue[0].setDoneCode(custValue.getCustomer().getDoneCode());
			custAccountingValue[0].setDoneDate(custValue.getCustomer().getDoneDate());
			custAccountingValue[0].setOpId(custValue.getCustomer().getOpId());
			custAccountingValue[0].setOrgId(custValue.getCustomer().getOrgId());
			custAccountingValue[0].setEffectiveDate(custValue.getCustomer().getEffectiveDate());
			custAccountingValue[0].setExpireDate(custValue.getCustomer().getExpireDate());
			custAccountingValue[0].setRegionId(custValue.getCustomer().getRegionId());
			custAccountingValue[0].setCreateOpId(custValue.getCustomer().getCreateOpId());
			custAccountingValue[0].setCreateOrgId(custValue.getCustomer().getCreateOrgId());
			custAccountingValue[0].setStsToNew();
			custAccountingValue[0].setState(CmConstants.RecordState.USE);
			BoCmGroupAccountingEngine.save(custAccountingValue);
		}
	}

	// 集团扩展信息处理
	private void dealCmCustomerKz(IVOCustValue custValue) throws Exception {
		if ((CmCommonUtil.isNotEmptyObject(custValue.getCustomer()) && custValue.getCustomer().getCustType() == CmConstants.CustomerType.INDIVIDUAL)
				|| custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer) != null) {
			// 获取个人扩展信息
			DataContainer temp = (DataContainer) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
			IBOCmxIndivCustomerValue indivCustomerExt = new BOCmxIndivCustomerBean();
			if (temp == null) {
				indivCustomerExt.copy(custValue.getCustomer());
			} else {
				indivCustomerExt.copy(temp);
			}
			if (indivCustomerExt.isNew()) {
				// 设置PNR为custId
				if (indivCustomerExt.getPnr() <= 0) {
					indivCustomerExt.setPnr(CmCommonUtil.getNewSequence(BOCmClubBean.class));
				}
				// 设置营销免打扰为-1默认值
				// 默认设置营销人工免打扰为否
				indivCustomerExt.set("MANUAL_COMMERCIAL_PROTECTION", "-1");
				indivCustomerExt.set("DIRECT_MARKETING_PROTECTION", "-1");
				indivCustomerExt.set("STATE", CmConstants.RecordState.USE);

				// 新增客户同步pnr到party的cprid上面，解决创建payer时候发现cprId为空的时候会重新取序列塞值
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IPartyValue partyValue = partySV.queryPartyById(custValue.getCustomer().getPartyId());
				if (partyValue != null) {
					if (StringUtils.isBlank(partyValue.getCprId())) {
						partyValue.setCprId(String.valueOf(indivCustomerExt.getPnr()));
						partySV.saveParty(partyValue);
					} else {
						indivCustomerExt.setPnr(Long.parseLong(partyValue.getCprId()));
					}
				}

			}
			if (indivCustomerExt.getManualCommercialProtection() >= 0) {
				if (indivCustomerExt.getManualProtectEffectiveDate() == null) {
					indivCustomerExt.setManualProtectEffectiveDate(ServiceManager.getOpDateTime());
				}
				if (indivCustomerExt.getManualProtectExpireDate() == null) {
					indivCustomerExt.setManualProtectExpireDate(TimeUtil.getMaxExpire());
				}
			}
			String opState = (String) custValue.getUserObject(CmLnConstants.DealCustInfo.OP_STATE);
			if (CmLnConstants.DealCustInfo.OP_MODIFY.equalsIgnoreCase(opState)) {
				IBOCmxIndivCustomerValue indivCustomerExtQry = null;
				if (custValue.getCustId() > 0) {
					indivCustomerExtQry = CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(custValue.getCustId());
				} else {
					indivCustomerExtQry = CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(custValue.getCustId());
					if (null == indivCustomerExtQry && custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer) != null) {
						indivCustomerExtQry = CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(temp.getAsLong("CUST_ID"));
					}
				}

				if (indivCustomerExtQry != null) {
					indivCustomerExtQry.copy(indivCustomerExt);
					CmLnCommonUtil.initDcProperties(indivCustomerExtQry);
				} else {
					indivCustomerExt.setStsToNew();
				}
			} else if (CmLnConstants.DealCustInfo.OP_NEW.equalsIgnoreCase(opState)) {
				IBOCmxIndivCustomerValue indivCustomerExtQry = CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(custValue.getCustId());
				if (indivCustomerExtQry == null) {
					indivCustomerExt.setCustId(custValue.getCustId());
					// 设置regionId和操作员组织信息
					indivCustomerExt.setCreateDate(custValue.getCustomer().getCreateDate());
					indivCustomerExt.setDoneCode(custValue.getCustomer().getDoneCode());
					indivCustomerExt.setDoneDate(custValue.getCustomer().getDoneDate());
					indivCustomerExt.setOpId(custValue.getCustomer().getOpId());
					indivCustomerExt.setOrgId(custValue.getCustomer().getOrgId());
					indivCustomerExt.setEffectiveDate(custValue.getCustomer().getEffectiveDate());
					indivCustomerExt.setExpireDate(custValue.getCustomer().getExpireDate());
					indivCustomerExt.setRegionId(custValue.getCustomer().getRegionId());
					indivCustomerExt.setCreateOpId(custValue.getCustomer().getCreateOpId());
					indivCustomerExt.setCreateOrgId(custValue.getCustomer().getCreateOrgId());
					indivCustomerExt.setStsToNew();
				} else {
					indivCustomerExtQry.copy(indivCustomerExt);
					CmLnCommonUtil.initDcProperties(indivCustomerExtQry);
				}
			} else if (CmLnConstants.DealCustInfo.OP_DEL.equals(opState)) {
				indivCustomerExt.delete();
			}
			if (!indivCustomerExt.isDeleted()
					&& (indivCustomerExt.getAksStatus() == CmConstants.AksStatus.SUBSCRIPTION_PEND || indivCustomerExt.getAksStatus() == CmConstants.AksStatus.UNSUBSCRIPTION_PEND)) {
				// 订购/退订AKS插入工单表
				long AKSFlag = indivCustomerExt.getUpdateFlag();
				if (AKSFlag != 0) {
					dealAKSInfo(custValue.getCustomer(), AKSFlag);
				}
			}
			// 保存个人扩展
			CmServiceFactory.getCustomerSV().saveCmxIndivCustomer(indivCustomerExt);
		} else {
			// 获取集团扩展信息
			BOLnCmxGroupCustBean grpCustomerExt = (BOLnCmxGroupCustBean) custValue.getUserObject(CmLnConstants.DealCustInfo.DEAL_GRP_CUST);
			if (grpCustomerExt == null) {
				grpCustomerExt = new BOLnCmxGroupCustBean();
				if (null != custValue.getUserObject("cmxGrpCust")) {
					grpCustomerExt.copy((IBOLnCmxGroupCustValue) custValue.getUserObject("cmxGrpCust"));
					int serviceLevel = updateGrpCustLevel(custValue);
					String opState = (String) custValue.getUserObject(CmLnConstants.DealCustInfo.OP_STATE);
					if (CmLnConstants.DealCustInfo.OP_MODIFY.equalsIgnoreCase(opState)) {// 修改状态
						// 根据客户编号查询集团客户扩展表
						IBOLnCmxGroupCustValue iboLnCmxGrpCust = null;
						if (custValue.getCustId() > 0) {
							iboLnCmxGrpCust = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(custValue.getCustId());
						} else {
							iboLnCmxGrpCust = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(grpCustomerExt.getCustId());
						}
						if (null != iboLnCmxGrpCust) {
							iboLnCmxGrpCust.copy(grpCustomerExt);
							iboLnCmxGrpCust.setOpId(grpCustomerExt.getOpId());
							iboLnCmxGrpCust.setOrgId(grpCustomerExt.getOrgId());
							iboLnCmxGrpCust.setDoneDate(grpCustomerExt.getDoneDate());
							CmLnCommonUtil.initDcProperties(iboLnCmxGrpCust);
						} else {
							grpCustomerExt.setStsToNew();
						}
					} else if (CmLnConstants.DealCustInfo.OP_NEW.equalsIgnoreCase(opState)) {// 新建
						grpCustomerExt.setCustId(custValue.getCustomer().getCustId());
						grpCustomerExt.setCreateDate(custValue.getCustomer().getCreateDate());
						grpCustomerExt.setDoneCode(custValue.getCustomer().getDoneCode());
						grpCustomerExt.setDoneDate(custValue.getCustomer().getDoneDate());
						grpCustomerExt.setRegionId(custValue.getCustomer().getRegionId());
						grpCustomerExt.setCreateOpId(custValue.getCustomer().getCreateOpId());
						grpCustomerExt.setCreateOrgId(custValue.getCustomer().getCreateOrgId());
						grpCustomerExt.setState(CmConstants.RecordState.USE);
						if (serviceLevel != -1) {
							// grpCustomerExt.setServiceLevel(serviceLevel);
						}
						grpCustomerExt.setStsToNew();
					} else if (CmLnConstants.DealCustInfo.OP_DEL.equalsIgnoreCase(opState)) {// 删除
						grpCustomerExt.delete();
					}
					if (!grpCustomerExt.isDeleted()
							&& (grpCustomerExt.getAksStatus() == CmConstants.AksStatus.SUBSCRIPTION_PEND || grpCustomerExt.getAksStatus() == CmConstants.AksStatus.UNSUBSCRIPTION_PEND)) {
						// 订购/退订AKS插入工单表
						long AKSFlag = grpCustomerExt.getUpdateFlag();
						if (AKSFlag != 0) {
							dealAKSInfo(custValue.getCustomer(), AKSFlag);
						}
					}
					// 保存集团扩展
					// 判断是否修改税号
					if (grpCustomerExt.isModified()) {
						long taxFlag = grpCustomerExt.getTaxFlag();
						int oldTaxFlag = DataType.getAsInt(grpCustomerExt.getOldObj(IBOLnCmxGroupCustValue.S_TaxFlag));
						if (taxFlag != oldTaxFlag) {
							ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
							/**
							 * Telenor_REQ_20150706_0012  update by chenzg
							 * 集团客户免收表示修改只需要同步到payer是自己的账户：需要修改自有账户和代付人是自己的账户
							 * */
							// 修改自有账户标识
							IBOCmCustAcctRelValue[] accountRelValue = accountSV.queryCustAcctRel(grpCustomerExt.getCustId(), -1, null, -1, 1, -1, null, -1, -1, null);
							if (accountRelValue != null && accountRelValue.length > 0) {
								for (int m = 0; m < accountRelValue.length; m++) {
									IAccountValue accountValue = accountSV.queryAccountById(accountRelValue[m].getAcctId());
									accountValue.setUrgeStopFlag(String.valueOf(taxFlag));
									IVOAccountValue voAccountValue = new VOAccountBean();
									voAccountValue.setAccount(accountValue);
									accountSV.saveAccount(voAccountValue);
								}

							}

							ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
							// 修改代付人是自己的账户标识
							IBOCMPartyAcctRelValue[] partyAccountRelValue = partySV.queryPartyAcctRel(custValue.getParty().getPartyId());
							if (partyAccountRelValue != null && partyAccountRelValue.length > 0) {
								for (int m = 0; m < partyAccountRelValue.length; m++) {
									IAccountValue accountValue = accountSV.queryAccountById(partyAccountRelValue[m].getAcctId());
									accountValue.setUrgeStopFlag(String.valueOf(taxFlag));
									IVOAccountValue voAccountValue = new VOAccountBean();
									voAccountValue.setAccount(accountValue);
									accountSV.saveAccount(voAccountValue);
								}
							}
						}
					}
					CmInnerServiceFactory.getCommonInnerSV().saveBean(grpCustomerExt);
				}
			}
		}
	}

	/**
	 * 根据客户等级 服务等级 A1、A2类集团客户的服务等级定为银牌； B1、B2类集团客户的服务等级定为铜牌； 其他类集团客户的服务等级统一定为标准
	 */
	private int updateGrpCustLevel(IVOCustValue custValue) {
		ICustomerValue customerValue = custValue.getCustomer();// 客户对象
		int custLevel = -1;
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			int custServiceLevel = customerValue.getCustServiceLevel();

			if (custServiceLevel == CmLnConstants.GroupLevel.LEVEL_INT_l1 || custServiceLevel == CmLnConstants.GroupLevel.LEVEL_INT_22) {
				custLevel = CmLnConstants.CM_SERVICE_LEVEL.SILVER_LEVEL;
			} else if (custServiceLevel == CmLnConstants.GroupLevel.LEVEL_INT_21 || custServiceLevel == CmLnConstants.GroupLevel.LEVEL_INT_22) {
				custLevel = CmLnConstants.CM_SERVICE_LEVEL.COPPER_LEVEL;
			} else {
				custLevel = CmLnConstants.CM_SERVICE_LEVEL.NORM_LEVEL;
			}
		}
		return custLevel;
	}

	private void dealLnCustRel(IVOCustValue custValue) throws Exception {
		ICustRelationshipValue[] custRelValues = custValue.getCustRels();
		IBOLnCmxGroupMemberValue[] cmxGroupMemberValues = (IBOLnCmxGroupMemberValue[]) custValue.getUserObject(CmLnConstants.DealCustInfo.DEAL_GROUP_MEMBER);
		List groupMemberExtList = new ArrayList();
		for (int i = 0; i < custRelValues.length; i++) {
			switch (custRelValues[i].getRelationType()) {
			// 处理集团成员信息
				case CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER:
					IBOLnCmxGroupMemberValue groupMemberExt = new BOLnCmxGroupMemberBean();
					groupMemberExt.copy(cmxGroupMemberValues[i]);
					groupMemberExt.setCustRelId(custRelValues[i].getCustRelId());
					groupMemberExt.setCreateDate(custRelValues[i].getCreateDate());
					groupMemberExt.setDoneCode(custRelValues[i].getDoneCode());
					groupMemberExt.setDoneDate(custRelValues[i].getDoneDate());
					groupMemberExt.setOpId(custRelValues[i].getOpId());
					groupMemberExt.setOrgId(custRelValues[i].getOrgId());
					groupMemberExt.setEffectiveDate(custRelValues[i].getEffectiveDate());
					groupMemberExt.setExpireDate(custRelValues[i].getExpireDate());
					groupMemberExtList.add(groupMemberExt);
					break;
				default:
					break;
			}
		}
		if (!groupMemberExtList.isEmpty()) {
			CmxServiceFactory.getLnGroupSV().saveGroupMemberExt((IBOLnCmxGroupMemberValue[]) groupMemberExtList.toArray(new IBOLnCmxGroupMemberValue[0]));
		}
	}

	public String getCustServiceId(ICustomerValue customerValue) throws Exception {
		String sequenceName = null;
		// 根据客户类型取对应的序列名称
		switch (customerValue.getCustType()) {
			case CmConstants.CustomerType.INDIVIDUAL:
				sequenceName = CmConstants.CustServiceIdSequence.CM_INDIV_CUST_SERVICE_ID;
				break;
			case CmConstants.CustomerType.FAMILY:
				sequenceName = CmConstants.CustServiceIdSequence.CM_FAMILY_CUST_SERVICE_ID;
				break;
			case CmConstants.CustomerType.GROUP:
				sequenceName = CmConstants.CustServiceIdSequence.CM_GROUP_CUST_SERVICE_ID;
				break;
			case CmConstants.CustomerType.VIRTUAL:
				sequenceName = CmConstants.CustServiceIdSequence.CM_VIRTUAL_CUST_SERVICE_ID;
				break;
			default:
				break;
		}
		long custServiceId = 0;
		// long provinceId = DataType.getAsLong(customerValue.getProvinceId());
		// IBOBsCommonDistrictValue districtValue =
		// BsCommonDistrictUtil.getCommonDistrictById(provinceId);
		/*
		 * if (districtValue != null) { custServiceId =
		 * DataType.getAsLong(districtValue.getDistrictCode()) * 10000000L; }
		 */
		if (StringUtils.isNotBlank(sequenceName)) {
			// 因为客户服务编号是客户的可选属性，不能因为取不到序列而影响正常的业务受理，因此屏蔽因为序列号取不到而影响正常业务的受理。
			try {
				custServiceId += ServiceManager.getIdGenerator().getNewId(sequenceName).longValue();
			} catch (Exception e) {
				log.info(e.getMessage(), e);
				if (log.isErrorEnabled()) {
					log.error(e.getMessage());
				}
			}
		}
		return String.valueOf(custServiceId);
	}

	protected void processAfterDeal(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null && !customerValue.isNew()) {
			ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
			BOCmHisRecordBean recordBean = sv.convertHisRecord(new DataStructInterface[] { customerValue, (DataStructInterface) custValue.getUserObject("cmxGrpCust"),
					(DataStructInterface) custValue.getUserObject("frmAddtionalInfo") },
					custValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL ? CmConstants.HisRecordType.INDIVIDUAL : CmConstants.HisRecordType.GROUP,
					customerValue.getCustName(), customerValue.getCustId());
			sv.saveHisRecord(recordBean);
		}

		// 处理客户参与人会出现多个的bug
		dealCustomerParty(custValue);
		
		//如果改了名字，送phonebook
		if (TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_21)) {
			// 针对使用者资料的修改需要同步订单
			if (CmCommonUtil.isNotEmptyObject(customerValue) && customerValue.isModified()) {
				String oldName = DataType.getAsString(customerValue.getOldObj("CUST_NAME"));
				String newName = customerValue.getCustName();
				if (StringUtils.isNotBlank(oldName) && StringUtils.isNotBlank(newName) && !(oldName.equals(newName))) {
					ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					int count = partyRoleSV.queryPartyRoleCount(customerValue.getPartyId(), CmConstants.roleType.user);
					if (count > 0) {
						// 调用订单的接口
						IPhoneBookSV phoneSV = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
						phoneSV.modifyCustInfo(customerValue.getCustId());
					}
				}
			}
		}
	}

	private void dealCustomerParty(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(customerValue.getPartyId(), CmConstants.PartyRoleType.CUSTOMER, -1, -1);
			if (partyRoles != null && partyRoles.length > 1) {
				BOCmPartyRoleBean partyRoleBean = null;
				for (int i = 1; i < partyRoles.length; i++) {
					partyRoleBean = new BOCmPartyRoleBean();
					partyRoleBean.copy(partyRoles[i]);
					partyRoleBean.delete();
					partyRoleSV.savePartyRole(partyRoleBean);
				}

			}
		}
	}

	protected void processBeforeDeal(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		IBOBsStaticDataValue[] values3 = StaticDataUtil.getStaticData("CM_VALIDATE_ADDRESS");
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// add by huangqun 增加底层的客户数据校验

		// 客户必须要有法律地址,使用地址开关
		if (customerValue != null && null != values3 && values3.length > 0) {
			if ("1".equals(values3[0].getCodeValue())) {
				if (customerValue.getAnonymousFlag() == 0) {
					long custId = customerValue.getCustId();
					IBOCmCustContactMediumValue[] values2 = service.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
					if (null == values2 || values2.length == 0) {
						ExceptionUtil.throwBusinessException("CMS9988776");
					}

				}
			}
		}
		if (customerValue != null && customerValue.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
			if (customerValue.getAnonymousFlag() == 0) {
				Timestamp birth = customerValue.getBirthday();
				if (String.valueOf(CmConstants.EntityType.CUSTOMER).equals(customerValue.getIndivCustType()) && birth != null) {
					// 客户年龄不得小于18周岁
					Timestamp nowTime = ServiceManager.getOpDateTime();
					long day = (nowTime.getTime() - birth.getTime()) / (1000 * 60 * 60 * 24);
					long age = day / 365;
					if (age < 18) {
						ExceptionUtil.throwBusinessException("CMS9988774");
					}
				}
				// 增加开关校验
				// if (null != values3 && values3.length > 0) {
				// 如果传入的是客户，才做这个校验
				// if (values3[0].getCodeValue().equals("1") &&
				// customerValue.getIndivCustType().equals(String.valueOf(CmConstants.roleType.customer))) {
				// 根据客户地址，生日，名字去验重(只有新增或者客户地址，生日，名字发生变化时才去校验)
				// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				// String oldName = customerValue.getOldObj("CUST_NAME") == null ? "" : (String)
				// customerValue.getOldObj("CUST_NAME");
				// String oldBirth2 = "";
				// Object oldBirth = customerValue.getOldObj("BIRTHDAY");
				// if (oldBirth != null) {
				// oldBirth2 = df.format(oldBirth);
				// }
				// long custId = customerValue.getCustId();
				// String name = customerValue.getCustName();
				// String birthDay = df.format(birth);
				// if (customerValue.isNew() || !name.equals(oldName) || !birthDay.equals(oldBirth2)) {
				// IBOCmCustContactMediumValue[] values = service.queryContactMediumByCondition(custId,
				// CmConstants.AddressId.legalAddress);
				// long addressId = values[0].getAddressId();
				// IBOCmIndivCustomerValue[] indivValues = service.queryCmCustByCustInfoAndAddress(name, birthDay,
				// addressId);
				// if (null != indivValues && indivValues.length > 0 && indivValues[0].getCustId() !=
				// customerValue.getCustId()) {
				// ExceptionUtil.throwBusinessException("CMS9988775");
				// }
				// }
				// }
				// }
			}
		}
		// 对于预占号码的处理,如果有预占号码或者未完成订单则不允许改变状态
		dealForPreOccupyNumPreSaveCust(custValue);

		// 针对集团的dummy客户需要根据名称和法律地址检验唯一性
		// if(null!=custValue && null!=custValue.getCustomer()){
		// if(CmConstants.CustomerType.GROUP==custValue.getCustomer().getCustType() && custValue.getCustomer().isNew()){
		// //针对dummy客户
		// if(9==custValue.getCustomer().getGroupType()){
		// //检验唯一性
		// validateDummyCust(custValue.getCustomer().getCustName(), custValue.getCustomer().getCustId());
		// }
		// }
		// }
		if (TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_21)) {
			// 针对使用者资料的修改需要同步订单
			if (CmCommonUtil.isNotEmptyObject(customerValue) && customerValue.isModified()) {
				String oldName = DataType.getAsString(customerValue.getOldObj("CUST_NAME"));
				String newName = customerValue.getCustName();
				if (StringUtils.isNotBlank(oldName) && StringUtils.isNotBlank(newName) && !(oldName.equals(newName))) {
					ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					int count = partyRoleSV.queryPartyRoleCount(customerValue.getPartyId(), CmConstants.roleType.user);
					if (count > 0) {
						// 调用订单的接口
						IPhoneBookSV phoneSV = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
						phoneSV.modifyCustInfo(customerValue.getCustId());
					}
				}
			}
		}
	}

	protected void setOtherDefaultValue(IVOCustValue custValue) throws Exception {
		IBOLnCmxGroupCustValue cmxGroupCustValue = (IBOLnCmxGroupCustValue) custValue.getUserObject("cmxGrpCust");
		if (cmxGroupCustValue != null) {
			if (cmxGroupCustValue.isModified()) {
				setCommonValue(cmxGroupCustValue);
			}
		}
	}

	protected void validateAttrValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void validateOtherThings(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 处理客户变更通知第三方系统
	 * 
	 * @Function dealNotiFyThirdParty
	 * @Description
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-4-30 yangjh v1.0.0 修改原因<br>
	 */
	private void dealNotiFyThirdParty(ICustomerValue customerVal) throws Exception {
		Map map = new HashMap();
		map.put("customer", customerVal);
		map.put("CUST_TYPE", customerVal.getCustType());
		map.put("ANONYMOUS_FLAG", customerVal.getAnonymousFlag());
		map.put("TENANT_ID", TenantIDFactory.getTenant());
		map.put("INDIV_CUST_TYPE", customerVal.getIndivCustType());
		ICmCustRequestTaskSV sv = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		map.put("CmCustRequestTaskSV", sv);
		String expression = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_DEAL_NOTIFY_THIRD_PARTY_EXP", "1");
		JexlCalculate jexl = new JexlCalculate();
		jexl.evaluateExpression(expression, map);
	}

	/**
	 * 客户状态转在网存ext27
	 * 客户状态转离网存ext28
	 * @Function dealCustomerStatus
	 * @Description
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-28 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28 黄群 v1.0.0 修改原因<br>
	 */
	private void dealCustomerStatus(IVOCustValue custValue) throws Exception {
		// EXT27记录转在网时的时间，EXT28记录转离网时的时间
		if (null != custValue.getCustomer()) {
			long custId = custValue.getCustomer().getCustId();
			if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
				if (custValue.getCustomer().getOldObj("CUST_STATUS") != null) {
					IBOCmxIndivCustomerValue value = new BOCmxIndivCustomerBean();
					value.initProperty("CUST_ID", custId);
					value.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
					int custStatus = DataType.getAsInt(custValue.getCustomer().getOldObj("CUST_STATUS"));
					if (custValue.getCustomer().getCustStatus() == CmConstants.CustomerStatus.INDIV_ACTIVE && custStatus != CmConstants.CustomerStatus.INDIV_ACTIVE) {
						value.setExt27(ServiceManager.getOpDateTime());
						// 转在网时候需要调用订单接口（B2C）
						IOrdOTTSV ordOTTSV = (IOrdOTTSV) ServiceFactory.getService(IOrdOTTSV.class);
						// ordOTTSV.promoteViaplayToCust(custId);
					}
					if (custValue.getCustomer().getCustStatus() == CmConstants.CustomerStatus.INDIV_INACTIVE && custStatus != CmConstants.CustomerStatus.INDIV_INACTIVE) {
						value.setExt28(ServiceManager.getOpDateTime());
					}
					CmServiceFactory.getCustomerSV().saveCmxIndivCustomer(value);
				}
			} else {
				// EXT27记录转在网时的时间，EXT28记录转离网时的时间
				if (custValue.getCustomer().getOldObj("CUST_STATUS") != null) {
					int custStatus = DataType.getAsInt(custValue.getCustomer().getOldObj("CUST_STATUS"));
					BOLnCmxGroupCustBean value = new BOLnCmxGroupCustBean();
					value.initProperty("CUST_ID", custId);
					value.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
					if (custValue.getCustomer().getCustStatus() == CmConstants.CustomerStatus.GROUP_ACTIVE && custStatus != CmConstants.CustomerStatus.GROUP_ACTIVE) {
						value.setExt27(ServiceManager.getOpDateTime());
					}
					if (custValue.getCustomer().getCustStatus() == CmConstants.CustomerStatus.GROUP_INACTIVE && custStatus != CmConstants.CustomerStatus.GROUP_INACTIVE) {
						value.setExt28(ServiceManager.getOpDateTime());
					}
					CmInnerServiceFactory.getCommonInnerSV().saveBean(value);
				}
			}
		}
	}

	/**
	 * 
	 * 
	 * @Function dealAKSInfo
	 * @Description
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @date 2014-9-29 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-29 黄群 v1.0.0 修改原因<br>
	 */
	public void dealAKSInfo(ICustomerValue value, long AKSFlag) throws Exception {
		ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		if (AKSFlag == CmConstants.UpdateFlag.SUBSCRIBE) {
			// 订购
			taskSV.saveCustAKSInfo(value, CmConstants.AksAction.SUBSCRIBE);
		}
		if (AKSFlag == CmConstants.UpdateFlag.UNSUBSCRIBE) {
			// 退订
			taskSV.saveCustAKSInfo(value, CmConstants.AksAction.UNSUBSCRIBE);
		}
	}

	/**
	 * @Function dealNotifyC3
	 * @Description
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @date 2014-11-20 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-20 黄群 v1.0.0 修改原因<br>
	 */
	private void dealNotifyC3(IVOCustValue custValue) throws Exception {
		if (null != custValue && null != custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer)) {
			DataContainer cmxDC = (DataContainer) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
			if (cmxDC.isModified()) {
				// 只有修改状态时才有该逻辑
				String custId = cmxDC.getAsString("CUST_ID");
				String newDPI = cmxDC.getAsString("EXT8");
				String oldDPI = (String) cmxDC.getOldObj("EXT8");
				if (null != newDPI && null != oldDPI && !newDPI.equals(oldDPI)) {
					ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					// 查询出客户信息(防止custValue没有客户信息)
					// 把客户归属的号码都查出来
					IBOCmInsCmrelValue[] values = service.queryCmInsCmrel(Long.parseLong(custId), -1, -1);
					if (CmCommonUtil.isNotEmptyObject(values)) {
						ArrayList<IBOCmPsOptinSyncC3Value> list = new ArrayList<IBOCmPsOptinSyncC3Value>();
						for (int i = 0; i < values.length; i++) {
							// 根据订单接口查询出归属者信息
							CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(values[i].getUserId()));
							IInsUserValue insValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(values[i].getUserId());
							IBOCmPsOptinSyncC3Value value = new BOCmPsOptinSyncC3Bean();
							value.setRecordId(CmCommonUtil.getNewSequence(BOCmPsOptinSyncC3Bean.class));
							value.setOptinFlag("Y");
							value.setBillId(insValue.getBillId());
							value.setState(CmConstants.RecordState.USE);
							if (newDPI.equals("1")) {
								// 属于新增
								value.setAction(CmConstants.sendToC3Action.ADD);
							} else {
								// 属于删除
								value.setAction(CmConstants.sendToC3Action.DELETE);
							}
							list.add(value);
						}
						ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
						// 保存插入工单表
						commonSV.savePsOptinC3Info(list.toArray(new IBOCmPsOptinSyncC3Value[0]));
					}
				}
			}
		}
	}

	/**
	 * @Function dealSendUser
	 * @Description
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @date 2014-11-24 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-24 黄群 v1.0.0 修改原因<br>
	 */
	private void dealSendUser(IVOCustValue custValue) throws Exception {
		if (null != custValue && CmCommonUtil.isNotEmptyObject(custValue.getCustomer())) {
			ICustomerValue value = custValue.getCustomer();
			if (value.isNew() && value.getIndivCustType().equals(String.valueOf(CmConstants.EntityType.USER))) {
				// 只有是新增并且是使用者的时候才送CPR订购
				long custId = value.getCustId();
				ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
				IBOCmCustRequestTaskValue[] vals = taskSV.queryByCustId(custId);
				// 如果先有其他角色已经插了工单，创建使用者就不能再插入工单了
				if (vals == null || vals.length < 1) {
					taskSV.saveCustRequestTaskInfo(custId, CmConstants.RequestType.ADD, CmConstants.RequestStatus.pending);
				}
			}
		}
	}

	/**
	 * @Function dealOrderOffer
	 * @Description
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @date 2014-11-24 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-24 黄群 v1.0.0 修改原因<br>
	 */
	private void dealOrderOffer(IVOCustValue custValue) throws Exception {
		if (null != custValue && null != custValue.getCustomer()) {
			ICustomerValue custInfo = custValue.getCustomer();
			if (custInfo.isModified()) {
				// 判断只有做修改时才有该逻辑
				if (custInfo.isPropertyModified("PHYSIOLOGICAL_STATE")) {
					int state = custInfo.getPhysiologicalState();
					if (state > 0) {
						// 订购聋哑人offer
						ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
						IBOCmInsCmrelValue[] values = custSV.queryCmInsCmrel(custInfo.getCustId(), -1, -1);
						if (CmCommonUtil.isNotEmptyObject(values)) {
							for (IBOCmInsCmrelValue value : values) {
								custSV.orderForUnormalPerson(value.getUserId());
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @Function dealForPreOccupyNum
	 * @Description 客户离网转销户，预占号码自动释放,如果客户有未竣工订单不允许转注销
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @date 2014-11-24 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-24 黄群 v1.0.0 修改原因<br>
	 */
	private void dealForPreOccupyNum(IVOCustValue custValue) throws Exception {
		if (null != custValue && null != custValue.getCustomer()) {
			ICustomerValue custInfo = custValue.getCustomer();
			if (custInfo.isModified()) {
				// 判断只有做修改时才有该逻辑
				if (custInfo.isPropertyModified("CUST_STATUS")) {
					String newCustStatus = DataType.getAsString(custInfo.getCustStatus());
					String oldCustStatus = DataType.getAsString(custInfo.getOldObj("CUST_STATUS"));
					// 离网转注销或者潜在转注销
					if ((String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE).equals(oldCustStatus) || String.valueOf(CmConstants.CustomerStatus.INDIV_POTENTIAL).equals(
							oldCustStatus))
							&& String.valueOf(CmConstants.CustomerStatus.INDIV_TERMINATED).equals(newCustStatus)) {
						String custId = DataType.getAsString(custValue.getCustomer().getCustId());
						IRes2InterFSV resSV = (IRes2InterFSV) ServiceFactory.getService(IRes2InterFSV.class);
						IBOResPhoneNumOriginValue[] values = resSV.queryPreOccupyNums(null, custId, "1000");
						if (CmCommonUtil.isNotEmptyObject(values)) {
							for (int i = 0; i < values.length; i++) {
								resSV.cancelPreOccupyNum(null, values[i].getResId(), 0L, 1000, custId, null, 0L, 0L, null);
							}
						}
						// 离网转注销的逻辑
						if (String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE).equals(oldCustStatus)) {
							// 判断有没有未竣工订单
							IOrderQrySV orderSV = (IOrderQrySV) ServiceFactory.getService(IOrderQrySV.class);
							IOrdCustValue[] orderValues = orderSV.getOrdCustByCustId(DataType.getAsLong(custId));
							if (CmCommonUtil.isNotEmptyObject(orderValues)) {
								for (IOrdCustValue value : orderValues) {
									if (validateBusinessId(value.getBusinessId())) {
										ExceptionUtil.throwBusinessException("CMS9988944");
									}
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @Function dealForPreOccupyNumPreSaveCust
	 * @Description 客户如果有未完成订单则不允许客户状态变为离网或者暂停(保存客户资料之前),
	 * 如果是集团客户转离网还需判断下面有没有正常的用户，如果有则不能转离网
	 *  另外客户由未缴费账户不允许由离网转注销(这个写在保存客户之前，否则客户转注销，在这个事务中state=E，查询不出客户报错)
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @throws Exception 
	 * @date 2014-11-24 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-24 黄群 v1.0.0 修改原因<br>
	 */
	private void dealForPreOccupyNumPreSaveCust(IVOCustValue custValue) throws Exception {
		if (null != custValue && null != custValue.getCustomer()) {
			ICustomerValue custInfo = custValue.getCustomer();
			if (custInfo.isModified()) {
				// 判断只有做修改时才有该逻辑
				if (custInfo.isPropertyModified("CUST_STATUS")) {
					String newCustStatus = DataType.getAsString(custInfo.getCustStatus());
					String oldCustStatus = DataType.getAsString(custInfo.getOldObj("CUST_STATUS"));
					String custId = DataType.getAsString(custValue.getCustomer().getCustId());
					// 如果新的状态是离网或者暂停
					if (String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE).equals(newCustStatus)
							|| String.valueOf(CmConstants.CustomerStatus.INDIV_PAUSE).equals(newCustStatus)) {
						IOrderQrySV orderSV = (IOrderQrySV) ServiceFactory.getService(IOrderQrySV.class);
						// 如果客户下面有正常的用户，则不允许转离网（针对集团客户）
						if (CmConstants.CustomerType.GROUP == custInfo.getCustType() && String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE).equals(newCustStatus)) {
							if (validateNormalUserForGroupCust(Long.parseLong(custId))) {
								ExceptionUtil.throwBusinessException("CMS9988963");
							}
						}
						if (String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE).equals(newCustStatus)) {
							IOrdCustValue[] orderValues = orderSV.getOrdCustByCustId(Long.parseLong(custId));
							if (CmCommonUtil.isNotEmptyObject(orderValues)) {
								// 插生命周期的时候 orderId 放在qq这个字段上
								String orderId = custInfo.getQqNo();
								if (StringUtils.isNotBlank(orderId) && !("-1".equals(orderId))) {
									for (int i = 0; i < orderValues.length; i++) {
										// 过滤掉本次订单流程
										if (Long.parseLong(orderId) != orderValues[i].getCustomerOrderId()) {
											// 过滤掉配置的businessID
											if (validateBusinessId(orderValues[i].getBusinessId())) {
												custValue.getCustomer().setCustStatus(DataType.getAsInt(oldCustStatus));
												break;
											}
										}
									}
								} else {
									int count = 0;
									for (int i = 0, len = orderValues.length; i < len; i++) {
										if (validateBusinessId(orderValues[i].getBusinessId())) {
											count++;
										}
									}
									if (count > 1) {
										// 大于1，说明还有别的单子不能注销
										custValue.getCustomer().setCustStatus(DataType.getAsInt(oldCustStatus));
									}
								}
							}
						}
					}
					// 对于离网转注销的逻辑
					if (String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE).equals(oldCustStatus)
							&& String.valueOf(CmConstants.CustomerStatus.INDIV_TERMINATED).equals(newCustStatus)) {
						// 查询账户信息
						ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
						IAccountValue[] acctValues = acctSV.queryAcctsById(-1, DataType.getAsLong(custId), -1, -1);
						// 判断客户下的账户有没有欠费
						for (int i = 0; i < acctValues.length; i++) {
							ImsHisQueryServiceClient client = ImsHisQueryServiceClient.getInstance();
							DoQueryUnPayFeeResponse unPayFeeResponse = client.queryUnPayFee(acctValues[i].getAcctId());
							CaBill[] cbills = unPayFeeResponse.getBillList();
							if (null != cbills && cbills.length > 0) {
								ExceptionUtil.throwBusinessException("CMS9988945");
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @Function dealForCommercialProtect
	 * @Description  对于营销免打扰标记的修改
	 * 
	 * @param custValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huangqun
	 * @throws Exception 
	 * @throws Exception 
	 * @date 2014-11-24 上午9:46:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-03-16 黄群 v1.0.0 修改原因<br>
	 */
	private void dealForCommercialProtect(IVOCustValue custValue) throws Exception {
		if (null != custValue
				&& (null != custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer) || null != custValue.getUserObject("cmxGrpCust"))) {
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			long custId = 0L;
			if (null != custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer)) {
				custId = ((DataContainer) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer)).getAsLong("CUST_ID");
			} else {
				custId = ((DataContainer) custValue.getUserObject("cmxGrpCust")).getAsLong("CUST_ID");
			}
			DataContainer cmxDC = null;
			if (custId > 0) {
				if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId)) {
					// 针对个人客户
					cmxDC = (DataContainer) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
					if (CmCommonUtil.isNotEmptyObject(cmxDC) && cmxDC.isModified()) {
						if (validateComPro(cmxDC)) {
							commonSV.savePsPublicInfo(custValue.getCustomer(), CmConstants.PsPublicAction.COMMERCIAL_PROTECTION, -1);
						}
					}
				} else if (CmConstants.CustomerType.GROUP == CmCommonUtil.getCustType(custId)) {
					// 针对集团客户
					cmxDC = (DataContainer) custValue.getUserObject("cmxGrpCust");
					if (CmCommonUtil.isNotEmptyObject(cmxDC) && cmxDC.isModified()) {
						if (cmxDC.isPropertyModified("DIRECT_MARKETING_PROTECTION")) {
							// 集团只有一个标识
							commonSV.savePsPublicInfo(custValue.getCustomer(), CmConstants.PsPublicAction.COMMERCIAL_PROTECTION, -1);
						}
					}
				}
			}
		}
	}

	private boolean validateComPro(DataContainer dc) throws Exception {
		int newManualCom = DataType.getAsInt(dc.get("MANUAL_COMMERCIAL_PROTECTION"));
		int newCprCom = DataType.getAsInt(dc.get("DIRECT_MARKETING_PROTECTION"));
		int oldManualCom = DataType.getAsInt(dc.getOldObj("MANUAL_COMMERCIAL_PROTECTION"));
		int oldCprNum = DataType.getAsInt(dc.getOldObj("DIRECT_MARKETING_PROTECTION"));
		int oldCom = validateComProDemo(oldManualCom, oldCprNum);
		int newCom = validateComProDemo(newManualCom, newCprCom);
		if (oldCom != newCom) {
			return true;
		}
		return false;
	}

	private int validateComProDemo(int manualCom, int cprCom) {
		// 返回（0:是,1:否,-1:空值）
		if (-1 != manualCom) {
			// 只要人工的不为空就以人工的为准
			return manualCom;
		} else {
			// 针对人工的标识是空的，如果CPR的也是空则返回-1，否则返回CPR的标识
			if (-1 == cprCom) {
				return -1;
			} else {
				// 由于两个标识定义的枚举值不一样所以要判断
				if (1 == cprCom) {
					return 0;
				} else {
					return 1;
				}
			}
		}
	}

	/*
	 * 根据dummy集团客户的名称和法律地址检验唯一性
	 */
	private void validateDummyCust(String custName, long custId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue value = custSV.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
		if (CmCommonUtil.isNotEmptyObject(value)) {
			StringBuilder condition = new StringBuilder();
			condition
					.append(" SELECT t1.* FROM {CM_GROUP_CUSTOMER} t1,{CM_CUST_CONTACT_MEDIUM} t2 WHERE t1.CUST_ID=t2.CUST_ID AND t1.CUST_NAME=:custName AND t2.ADDRESS_ID=:addressId AND t2.CONT_MED_TYPE_ID=:type AND t1.STATE=:state ");
			Map parameter = new HashMap();
			parameter.put("custName", custName);
			parameter.put("addressId", value.getAddressId());
			parameter.put("type", CmConstants.AddressId.legalAddress);
			parameter.put("state", CmConstants.RecordState.USE);
			DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
					CmLnCommonUtil.getQueryResult(condition.toString(), "", -1, -1, parameter), parameter);
			if (CmCommonUtil.isNotEmptyObject(counts)) {
				ExceptionUtil.throwBusinessException("CMS9988958");
			}
		}
	}

	/*
	 * 判断一个客户下面有没有有效地用户
	 */
	private boolean validateNormalUserForGroupCust(long custId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmInsCmrelValue[] values = custSV.queryCmInsCmrel(custId, -1, CmConstants.RelaType.OWNER, -1, -1, -1, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			for (IBOCmInsCmrelValue value : values) {
				if ("1".equals(value.getExt1())) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * 判断是否有指定的businessId
	 */
	private boolean validateBusinessId(long businessId) throws Exception {
		IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CM_FILTER_BUSINESSID");
		for (IBOBsStaticDataValue value : values) {
			log.error("==================== ongoing businessid:"+businessId);
			log.error("==================== cfg businessid:"+value.getCodeValue());
			if (businessId == Long.parseLong(value.getCodeValue())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 同步客户信息到账户
	 * @Function dealSynCustInfoToAcct
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-7-15 下午4:03:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-7-15     yangjh           v1.0.0               修改原因<br>
	 */
	private void dealSynCustInfoToAcct(IVOCustValue custValue) throws Exception {
		ICustomerValue custVal = custValue.getCustomer();
		if (custVal != null && custVal.isModified()) {
			if (custVal.getCustType() == CmConstants.CustomerType.INDIVIDUAL) {
				IBOCmxIndivCustomerValue customerKZValue = null;
				DataContainer temp = (DataContainer) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
				if (temp != null) {
					customerKZValue = new BOCmxIndivCustomerBean();
					customerKZValue.copy(temp);
				}
				if (customerKZValue != null && customerKZValue.isModified()) {
					long custId = customerKZValue.getCustId();
					// 老纪录
					long oldPaymentTerms = DataType.getAsLong(customerKZValue.getOldObj("EXT21"));
					long oldstopPaymentFee = DataType.getAsLong(customerKZValue.getOldObj("EXT22"));
					// 缴费期
					long paymentTerms = customerKZValue.getExt21();
					// 免托收标识
					long stopPaymentFee = customerKZValue.getExt22();
					Map<String, Long> map = null;
					ICmAccountSV sv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
					if (stopPaymentFee != oldstopPaymentFee && (paymentTerms > 0 && paymentTerms != oldPaymentTerms)) {
						map = new HashMap<String, Long>();
						map.put("ACCT_BEHALF_PHONE", stopPaymentFee);
						map.put("BILL_DUE_DATE", paymentTerms);
						sv.synchronizeAcctInfo(custId, map);

					} else if (stopPaymentFee != oldstopPaymentFee) {
						map = new HashMap<String, Long>();
						map.put("ACCT_BEHALF_PHONE", stopPaymentFee);
						sv.synchronizeAcctInfo(custId, map);
					} else if (paymentTerms > 0 && paymentTerms != oldPaymentTerms) {
						// map = new HashMap<String, Long>();
						// map.put("BILL_DUE_DATE", paymentTerms);
						// sv.synchronizeAcctInfo(custId, map);
					} else {
						// do nothing
					}
				}
				// 是否修改了缴费期或者是否免税托收费
			} else if (custVal.getCustType() == CmConstants.CustomerType.GROUP) {// 集团插同步工单
				IBOLnCmxGroupCustValue customerKZValue = null;
				DataContainer temp = (DataContainer) custValue.getUserObject("cmxGrpCust");
				if (temp != null) {
					customerKZValue = new BOLnCmxGroupCustBean();
					customerKZValue.copy(temp);
				}
				if (customerKZValue != null && customerKZValue.isModified()) {
					// 老纪录
					long oldPaymentTerms = DataType.getAsLong(customerKZValue.getOldObj("EXT21"));
					long oldstopPaymentFee = DataType.getAsLong(customerKZValue.getOldObj("EXT22"));
					// 缴费期
					long paymentTerms = customerKZValue.getExt21();
					// 免托收标识
					long stopPaymentFee = customerKZValue.getExt22();
					ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					if (stopPaymentFee != oldstopPaymentFee) {
						// 插入免托收费同步处理工单
						IBOCmPsPublicDealValue psPublicDealValue = new BOCmPsPublicDealBean();
						psPublicDealValue.setEntityId(customerKZValue.getCustId());
						psPublicDealValue.setPartyId(custVal.getPartyId());
						psPublicDealValue.setEntityType(CmConstants.EntityType.CUSTOMER);
						psPublicDealValue.setExecAction(CmConstants.PsPublicAction.UPDATE_ACCT_STOP_PAYMENT_FEE);// 免托收费标识
						psPublicDealValue.setPsParam(DataType.getAsString(stopPaymentFee));
						requestTaskSV.savePublicWordOrder(psPublicDealValue);
					}
					// 插入缴费期同步处理工单
					if (paymentTerms > 0 && paymentTerms != oldPaymentTerms) {
						IBOCmPsPublicDealValue psPublicDealValue1 = new BOCmPsPublicDealBean();
						psPublicDealValue1.setEntityId(customerKZValue.getCustId());
						psPublicDealValue1.setPartyId(custVal.getPartyId());
						psPublicDealValue1.setEntityType(CmConstants.EntityType.CUSTOMER);
						psPublicDealValue1.setExecAction(CmConstants.PsPublicAction.UPDATE_ACCT_PAYMENT);// 缴费期
						psPublicDealValue1.setPsParam(DataType.getAsString(paymentTerms));
						requestTaskSV.savePublicWordOrder(psPublicDealValue1);
					}
				}
			}
		}
	}
}
