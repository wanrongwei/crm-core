package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.util.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.util.BceSVUtil;
import com.ai.common.bo.BOBsDistrictBean;
import com.ai.common.bo.BOBsFtpBean;
import com.ai.common.bo.BOBsFtpPathBean;
import com.ai.common.cache.BsFtpCacheImpl;
import com.ai.common.cache.BsFtpPathCacheImpl;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.DistrictUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.ivalues.IQInsProdInsSrvAttrValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.omframe.util.SoServiceFactory;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmInsCmrelBean;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustBadRecordValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCustManagerTeamRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmAttachSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmDistrictUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.service.interfaces.ICmPartnerBusiSV;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemUserBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemberHBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmxGroupCustMemberBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupCustMemberValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainBean;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserCreditLevelValue;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmIndivContactValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillingAcctValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDKAccountSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.hu.customer.service.interfaces.ICmPartyHUSV;
import com.asiainfo.crm.cm.hu.party.IBOCmPartyPermissionValue;
import com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomizeBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElementBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberCardValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumPojoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactMediumRelBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFamilyContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContractBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactQryValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.evaluation.bo.BOCmSpecialListBean;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrBean;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmBillCustomizeSV;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmPaymentAttrSV;
import com.asiainfo.crm.cm.ln.club.bo.BOLnCmUserManagerBean;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue;
import com.asiainfo.crm.cm.ln.common.bo.BOCmCustUnionFieldMappingBean;
import com.asiainfo.crm.cm.ln.common.bo.BOCmGroupCustomerAuditBean;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmCustUnionInfoBean;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmInsCmRelBean;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOCmCustUnionFieldMappingValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOCmGroupCustomerAuditValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmCustUnionInfoValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmGroupInfoBean;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces.ICmLnIndivSV;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnCommonServiceSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOClubMemberBean;
import com.asiainfo.crm.cm.model.bean.VOCustAddressBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOCustContactBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AccountProfileBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubServiceSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubVipMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustManagerTeamSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupContractSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.service.interfaces.ICmxCustomerSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.IRes2CmSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;
import com.asiainfo.crm.cm.teaminvoke.out.util.CmFSVUtil;
import com.asiainfo.crm.common.service.interfaces.IBaseOperatorsSV;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardUsedValue;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.common.service.interfaces.ISoGroupFSV;
import com.asiainfo.crm.so.exe.remote.third.CustInfoCont;
import com.asiainfo.crm.so.exe.remote.third.CustInfoItem;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IStopOpenOsStatusSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.query.service.interfaces.IBusiQrySV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmExtFSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

/**
 * @Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName
 * @Description 统一平台接口
 * 
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-13 上午11:37:44 <br>
 *       Modification History:<br>
 *       Date Author Version Description<br>
 *       ---------------------------------------------------------*<br>
 *       2012-3-13 huzq2 v1.0.0 修改原因<br>
 */
public class Cm2InterFSVImpl implements ICm2InterFSV {

	public long saveDefaultCustomer(IVOCustValue custValue) throws Exception {
		return CmServiceFactory.getCustomerSV().saveDefaultCustomer(custValue);
	}

	private transient Log log = LogFactory.getLog(Cm2InterFSVImpl.class);

	public Map queryCustManager(Map parameter) throws Exception {
		Map resultMap = new HashMap();// 返回Map
		Map infoMap = new HashMap();// 放进resultMap的valueMap
		Object o = parameter.get("CustId");
		Object groupIdObj = parameter.get("GroupId");

		if (o == null && groupIdObj == null) {
			// 输入参数不能全部为空！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		long custId = 0;
		if (o != null) {
			custId = Long.parseLong(o.toString()); // 客户编号
			if (custId <= 0) {
				// 输入参数不合法！
				ExceptionUtil.throwBusinessException("CMS0000073");
			}
		}

		// 通过集团编码查询集团客户
		ICustomerValue custValueOri = null;
		if (groupIdObj != null) {
			custValueOri = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(groupIdObj.toString(), CmConstants.CustomerType.GROUP);
			if (CmCommonUtil.isEmptyObject(custValueOri)) {
				//
				ExceptionUtil.throwBusinessException("CMS95000107");// CMS95000107
				// 不存在该集团客户！
			}
			custId = custValueOri.getCustId();
		}

		// 通过客户编号查询客户经理信息
		ICustManagerValue[] resultValues = CmServiceFactory.getCustomerSV().queryCustManagersByCustId(custId, -1, -1);

		// 封装查询结果
		List resultList = new ArrayList();// 结果封装时用到
		if (resultValues != null) {
			for (int i = 0; i < resultValues.length; i++) {
				// 将value转换为Map
				infoMap = CmFSVUtil.value2Map(resultValues[i]);
				resultList.add(infoMap);
			}
		}
		resultMap.put("ManagerRelInfo", resultList);

		return resultMap;
	}

	// query or modify billCustomize
	public Map actionAcctBillCustomize(Map parameter) throws Exception {
		if (isEmpty(parameter.get("OperType")))
			ExceptionUtil.throwBusinessException("CMS0000210");// "参数错误",
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Billing information query ok");
		if ("query".equalsIgnoreCase(parameter.get("OperType").toString())) {
			if (isEmpty(parameter.get("ServiceNum")))
				ExceptionUtil.throwBusinessException("CMS0000214");// "服务号码不能为空",

			ISoUserValue userBean = null;
			userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(parameter.get("ServiceNum").toString());

			if (userBean != null) {
				Map retMap = new HashMap();// 返回Map
				IBOCmBillCustomizeValue cmBillValue = CmServiceFactory.getAccountSV().queryCmBillCustomizeByUserId(userBean.getUserId(), -1, -1);

				Map cmBill = new HashMap();
				if (cmBillValue != null) {
					cmBill.put("CustId", cmBillValue.getCustId());
					cmBill.put("UserId", cmBillValue.getUserId());
					cmBill.put("BillType", cmBillValue.getBillType());
					cmBill.put("BillFormatId", cmBillValue.getBillPattern());
					cmBill.put("PostCode", cmBillValue.getContZipcode());
					cmBill.put("Address", cmBillValue.getContAddress());
					cmBill.put("Fax", cmBillValue.getContFax());
					cmBill.put("EMail", cmBillValue.getContEmail());
					cmBill.put("Addressee", cmBillValue.getRecipients());

					// 封装mailType
					List listType = new ArrayList();
					String mailType = cmBillValue.getMailType();
					if (StringUtils.isBlank(mailType)) {
						mailType = "0000";
					}
					int len = mailType.length();
					if (len > 4) {
						mailType = mailType.substring(0, 4);
						len = 4;
					}
					char[] type = mailType.toCharArray();
					char[] temp = new char[] { '0', '0', '0', '0' };
					// 如果发现位数不足4位，则自动补齐
					System.arraycopy(type, 0, temp, 0, len);
					for (int i = 0; i < temp.length; i++) {
						listType.add(temp[i]);
					}
					cmBill.put("PostMode", listType);

					retMap.put("returnCmBillCustomize", cmBill);
					returnMap.put("returnObj", retMap);
				} else {
					cmBill.put("CustId", userBean.getCustId());
					cmBill.put("UserId", userBean.getUserId());
					cmBill.put("BillType", "");
					cmBill.put("BillFormatId", "");
					cmBill.put("PostCode", "");
					cmBill.put("Address", "");
					cmBill.put("Fax", "");
					cmBill.put("EMail", "");
					cmBill.put("Addressee", "");
					cmBill.put("PostMode", new ArrayList());
					retMap.put("returnCmBillCustomize", cmBill);
					returnMap.put("returnObj", retMap);
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS0000215");// "未查询到相应的用户信息",
			}

			return returnMap;
		} else if ("new".equalsIgnoreCase(parameter.get("OperType").toString())) {
			BOCmBillCustomizeBean cmBillValue = null;
			String doneCode = String.valueOf(ServiceManager.getDoneCode());
			Map ServiceMap = (Map) (parameter.get("ServiceMap"));
			// 获取参数
			String ServiceNum = isEmpty(ServiceMap.get("ServiceNum")) ? "" : ServiceMap.get("ServiceNum").toString();
			String EMail = isEmpty(ServiceMap.get("Email")) ? "" : ServiceMap.get("Email").toString();
			String Addressee = isEmpty(ServiceMap.get("Addressee")) ? "" : ServiceMap.get("Addressee").toString();
			String Address = isEmpty(ServiceMap.get("Address")) ? "" : ServiceMap.get("Address").toString();
			String PostCode = isEmpty(ServiceMap.get("PostCode")) ? "" : ServiceMap.get("PostCode").toString();
			String Fax = isEmpty(ServiceMap.get("Fax")) ? "" : ServiceMap.get("Fax").toString();
			int billType = isEmpty(ServiceMap.get("BillType")) ? -1 : Integer.parseInt(ServiceMap.get("BillType").toString());
			int billPattern = isEmpty(ServiceMap.get("BillFormatId")) ? -1 : Integer.parseInt(ServiceMap.get("BillFormatId").toString());
			List PostMode = (List) ServiceMap.get("PostMode");

			// 校验
			if (PostMode == null || PostMode.isEmpty()) {
				ExceptionUtil.throwBusinessException("CMS0000218");// "账单投递方式不能为空",
			}

			if (StringUtils.isBlank(ServiceNum)) {
				ExceptionUtil.throwBusinessException("CMS0000214");// "服务号码不能为空",
			}
			if (billType < 0) {
				ExceptionUtil.throwBusinessException("CMS95000108");// CMS95000108
				// 帐单类型不能为空
			}
			if (StaticDataUtil.getStaticData(CmConstants.BillCutomize.BILL_TYPE, String.valueOf(billType)) == null) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0022002", CmConstants.BillCutomize.BILL_TYPE));
				}
				ExceptionUtil.throwBusinessException("CMS0022002", CmConstants.BillCutomize.BILL_TYPE);// 参数错误，当前系统不存在类型为{0}的定义！
			}

			if (billPattern < 0) {
				ExceptionUtil.throwBusinessException("CMS95000109");// CMS95000109
				// 账单格式不能为空
			}
			ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(ServiceNum);
			if (null == userBean) {
				ExceptionUtil.throwBusinessException("CMS0000215");// "未查询到相应的用户信息",
			}

			IBOCmBillCustomizeValue cmBillCustValue = CmServiceFactory.getAccountSV().queryCmBillCustomizeByUserId(userBean.getUserId(), -1, -1);
			if (null == cmBillCustValue) {
				cmBillValue = new BOCmBillCustomizeBean();
				cmBillValue.setCustomizeId(CmCommonUtil.getNewSequence(BOCmBillCustomizeBean.class));
				cmBillValue.setUserId(userBean.getUserId());
				cmBillValue.setCustId(userBean.getCustId());
				cmBillValue.setState(CmConstants.RecordState.USE);
				cmBillValue.setRegionId(CenterUtil.getRegionIdByBillId(ServiceNum));
				cmBillValue.setContFax(Fax);
				cmBillValue.setRecipients(Addressee);
				cmBillValue.setContAddress(Address);
				cmBillValue.setContZipcode(PostCode);
				cmBillValue.setContEmail(EMail);
				String[] mailTypes = (String[]) PostMode.toArray(new String[0]);
				cmBillValue.setMailType(StringUtils.join(mailTypes));
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { cmBillValue });
			} else {
				ExceptionUtil.throwBusinessException("CMS0000439");
			}
			Map doneMap = new HashMap();
			doneMap.put("DoneCode", doneCode);
			returnMap.put("returnObj", doneMap);
			return returnMap;

		} else if ("mod".equalsIgnoreCase(parameter.get("OperType").toString())) {
			BOCmBillCustomizeBean cmBillValue = null;
			String doneCode = String.valueOf(ServiceManager.getDoneCode());
			Map ServiceMap = (Map) (parameter.get("ServiceMap"));

			// 获取参数
			String ServiceNum = isEmpty(ServiceMap.get("ServiceNum")) ? "" : ServiceMap.get("ServiceNum").toString();
			String EMail = isEmpty(ServiceMap.get("EMail")) ? "" : ServiceMap.get("EMail").toString();
			String Addressee = isEmpty(ServiceMap.get("Addressee")) ? "" : ServiceMap.get("Addressee").toString();
			String Address = isEmpty(ServiceMap.get("Address")) ? "" : ServiceMap.get("Address").toString();
			String PostCode = isEmpty(ServiceMap.get("PostCode")) ? "" : ServiceMap.get("PostCode").toString();
			String Fax = isEmpty(ServiceMap.get("Fax")) ? "" : ServiceMap.get("Fax").toString();
			int billType = isEmpty(ServiceMap.get("BillType")) ? -1 : Integer.parseInt(ServiceMap.get("BillType").toString());
			int billPattern = isEmpty(ServiceMap.get("BillFormatId")) ? -1 : Integer.parseInt(ServiceMap.get("BillFormatId").toString());
			List PostMode = (List) ServiceMap.get("PostMode");

			// 校验
			if (PostMode == null || PostMode.isEmpty()) {
				ExceptionUtil.throwBusinessException("CMS0000218");// "账单投递方式不能为空",
			}
			if (StringUtils.isBlank(ServiceNum)) {
				ExceptionUtil.throwBusinessException("CMS0000214");// "服务号码不能为空",
			}
			if (billType < 0) {
				ExceptionUtil.throwBusinessException("CMS95000108");
			}
			if (StaticDataUtil.getStaticData(CmConstants.BillCutomize.BILL_TYPE, String.valueOf(billType)) == null) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0022002", CmConstants.BillCutomize.BILL_TYPE));
				}
				ExceptionUtil.throwBusinessException("CMS0022002", CmConstants.BillCutomize.BILL_TYPE);// 参数错误，当前系统不存在类型为{0}的定义！
			}
			if (billPattern < 0) {
				ExceptionUtil.throwBusinessException("CMS95000109");
			}

			ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(ServiceNum);
			if (null == userBean) {
				ExceptionUtil.throwBusinessException("CMS0000215");// "未查询到相应的用户信息",
			}

			IBOCmBillCustomizeValue cmBillCustValue = CmServiceFactory.getAccountSV().queryCmBillCustomizeByUserId(userBean.getUserId(), -1, -1);
			if (null == cmBillCustValue) {
				ExceptionUtil.throwBusinessException("CMS95000110");// CMS95000110
				// 该用户的个性化账单不存在，不能修改
			} else {
				cmBillValue = new BOCmBillCustomizeBean();
				cmBillValue.copy(cmBillCustValue);
				cmBillValue.setStsToOld();
				cmBillValue.setContFax(Fax);
				cmBillValue.setRecipients(Addressee);
				cmBillValue.setContAddress(Address);
				cmBillValue.setContZipcode(PostCode);
				cmBillValue.setContEmail(EMail);
				cmBillValue.setBillType(billType);
				cmBillValue.setBillPattern(billPattern);
				String regionId = CenterUtil.getRegionIdByBillId(ServiceNum);
				cmBillValue.setRegionId(regionId);
				cmBillValue.initProperty(cmBillValue.S_RegionId, regionId);
				String[] mailTypes = (String[]) PostMode.toArray(new String[0]);
				cmBillValue.setMailType(StringUtils.join(mailTypes));
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { cmBillValue });
			}
			Map doneMap = new HashMap();
			doneMap.put("DoneCode", doneCode);
			returnMap.put("returnObj", doneMap);
			return returnMap;

		} else if ("del".equalsIgnoreCase(parameter.get("OperType").toString())) {
			BOCmBillCustomizeBean cmBillValue = null;
			String doneCode = String.valueOf(ServiceManager.getDoneCode());
			Map ServiceMap = (Map) (parameter.get("ServiceMap"));

			// 获取参数
			String ServiceNum = isEmpty(ServiceMap.get("ServiceNum")) ? "" : ServiceMap.get("ServiceNum").toString();

			ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(ServiceNum);
			if (null == userBean) {
				ExceptionUtil.throwBusinessException("CMS0000215");// "未查询到相应的用户信息",
			}

			IBOCmBillCustomizeValue cmBillCustValue = CmServiceFactory.getAccountSV().queryCmBillCustomizeByUserId(userBean.getUserId(), -1, -1);
			if (null == cmBillCustValue) {
				ExceptionUtil.throwBusinessException("CMS95000111");// 该用户的个性化账单不存在，不能删除
			} else {
				cmBillValue = new BOCmBillCustomizeBean();
				cmBillValue.copy(cmBillCustValue);
				cmBillValue.setDoneCode(Long.valueOf(doneCode));
				cmBillValue.delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { cmBillValue });
			}
			Map doneMap = new HashMap();
			doneMap.put("DoneCode", doneCode);
			returnMap.put("returnObj", doneMap);
			return returnMap;

		} else if ("fromSO".equalsIgnoreCase(parameter.get("OperType").toString())) {
			Map inputParameter = (Map) parameter.get("inputParameter");
			BOCmBillCustomizeBean billCustomizeValue = new BOCmBillCustomizeBean();
			if (inputParameter.get("cmAcctFrmCustomize").getClass().isArray()) {
				DataContainerFactory.transfer(((DataContainer[]) inputParameter.get("cmAcctFrmCustomize"))[0], billCustomizeValue);
			} else {
				DataContainerFactory.transfer((DataContainer) inputParameter.get("cmAcctFrmCustomize"), billCustomizeValue);
			}

			long userId = billCustomizeValue.getUserId();
			// billCustomizeValue.setStsToNew();
			IBOCmBillCustomizeValue queryValue = CmServiceFactory.getAccountSV().queryCmBillCustomizeByUserId(userId, min, max);
			if (queryValue != null) {
				billCustomizeValue.initCustomizeId(queryValue.getCustomizeId());
				billCustomizeValue.initRegionId(queryValue.getRegionId());
			} else {
				billCustomizeValue.setStsToNew();
				billCustomizeValue.setState(CmConstants.RecordState.USE);
				billCustomizeValue.setCreateDate(CmCommonUtil.getSysDate());
				billCustomizeValue.setEffectiveDate(CmCommonUtil.getSysDate());
				billCustomizeValue.setExpireDate(CmLnCommonUtil.getMaxDate());
				billCustomizeValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				billCustomizeValue.set(IBOCmBillCustomizeValue.S_CustomizeId, CmCommonUtil.getNewSequence(BOCmBillCustomizeBean.class));
				billCustomizeValue.set(IBOCmBillCustomizeValue.S_UserId, userId);
				// 2013-12-12
				// 过户从老账户选，BillType与BillPattern为null，存时候报不能将string转为interger
				billCustomizeValue.setBillType(-1);
				billCustomizeValue.setBillPattern(-1);
			}

			CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { billCustomizeValue });

			returnMap.put("returnObj", billCustomizeValue.getDoneCode());

			return returnMap;
		}
		return returnMap;
	}

	// 查询俱乐部信息
	public Map queryClub(Map parameter) throws Exception {
		Map returnMap = new HashMap();

		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Discover Club information ok");

		Map infoMap = new HashMap();

		// 查询条件
		Object clubId = parameter.get("ClubId");// 俱乐部标识
		Object clubName = parameter.get("ClubName");// 俱乐部名称
		Object clubCode = parameter.get("ClubCode");// 俱乐部编码
		Object clubType = parameter.get("ClubType");// 俱乐部类型

		// 设置查询条件
		long id = 0;
		String name = null;
		String code = null;
		int type = 0;

		if (clubId != null && StringUtils.isNotBlank(clubId.toString()))
			id = Long.parseLong(clubId.toString());

		if (clubName != null && StringUtils.isNotBlank(clubName.toString()))
			name = clubName.toString();

		if (clubCode != null && StringUtils.isNotBlank(clubCode.toString()))
			code = clubCode.toString();

		if (clubType != null && StringUtils.isNotBlank(clubType.toString()))
			type = Integer.parseInt(clubType.toString());

		// 查询
		IClubValue[] resultValues = CmServiceFactory.getClubSV().illegeQuery(id, name, type, code, -1, -1);

		List resultList = new ArrayList();
		if (resultValues != null) {
			for (int i = 0; i < resultValues.length; i++) {
				infoMap = CmFSVUtil.value2Map(resultValues[i]);
				resultList.add(infoMap);
			}
		}

		// 如果没查询到结果，resultList可能是空值
		returnMap.put("returnObj", resultList);
		return returnMap;
	}

	public Map queryClubMemberCard(Map parameter) throws Exception {
		Map resultMap = new HashMap();// 返回Map
		Map infoMap = new HashMap();// 放进resultMap的infoMap

		// 查询条件
		Object clubIdObj = parameter.get("ClubId");// 俱乐部标识
		Object userIdObj = parameter.get("UserId");// 用户编码
		Object custIdObj = parameter.get("CustId");// 客户编码
		Object memberIdObj = parameter.get("MemberId");// 会员编码

		// 设置查询条件
		long clubId = 0;
		long userId = 0;
		long custId = 0;
		long memberId = 0;

		if (clubIdObj != null && StringUtils.isNotBlank(clubIdObj.toString())) {
			clubId = Long.parseLong(clubIdObj.toString());
		}
		if (userIdObj != null && StringUtils.isNotBlank(userIdObj.toString())) {
			userId = Long.parseLong(userIdObj.toString());
		}
		if (custIdObj != null && StringUtils.isNotBlank(custIdObj.toString())) {
			custId = Long.parseLong(custIdObj.toString());
		}
		if (memberIdObj != null && StringUtils.isNotBlank(memberIdObj.toString())) {
			memberId = Long.parseLong(memberIdObj.toString());
		}

		// 用户编码，会员编码，客户编码不能同时为空！
		if (userId == 0 && memberId == 0 && custId == 0) {
			ExceptionUtil.throwBusinessException("CMS0000213");// TODO
		}

		List resultList = new ArrayList();// 查询结果list

		DataContainer condition = new DataContainer();
		if (memberId != 0) {
			// 通过会员标识查询 俱乐部会员卡信息
			IClubMemberCardValue[] resultValues = CmServiceFactory.getClubMemberSV().queryClubMemberCardsByMemberId(memberId);

			if (resultValues != null) {
				// 将value转换为Map
				for (int i = 0; i < resultValues.length; i++) {
					infoMap = CmFSVUtil.value2Map(resultValues[i]);
					resultList.add(infoMap);
				}
			}
		} else {
			if (clubId != 0) {
				condition.set(IClubMemberValue.S_ClubId, clubId);
			}
			if (userId != 0) {
				condition.set(IClubMemberValue.S_UserId, userId);
			}
			if (custId != 0) {
				condition.set(IClubMemberValue.S_CustId, custId);
			}
			// 通过条件查询会员标识
			ICmClubMemberSV clubMemberSV = CmServiceFactory.getClubMemberSV();
			IClubMemberValue[] clubMembers = clubMemberSV.queryClubMembers(condition, -1, -1);

			// 通过会员标识查询俱乐部会员卡信息
			for (int i = 0; i < clubMembers.length; i++) {
				IClubMemberCardValue[] resultValues = clubMemberSV.queryClubMemberCardsByMemberId(clubMembers[i].getMemberId());
				if (resultValues != null) {
					// 将value转换为Map
					for (int j = 0; j < resultValues.length; j++) {
						infoMap = CmFSVUtil.value2Map(resultValues[j]);
						resultList.add(infoMap);
					}
				}
			}
		}

		// 如果没查询到结果，resultList可能是空值
		resultMap.put("ClubMemCardInfo", resultList);

		return resultMap;
	}

	public Map queryNextAcctBillCycle(Map parameter) throws Exception {
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Check account of the current account and the account of the success is not in effect");
		IAcctBillCycleValue[] acctBill = CmServiceFactory.getAccountSV().queryNextAcctBillCyclesByAcctId(Long.valueOf(parameter.get("AcctId").toString()));

		returnMap.put("returnObj", acctBill);
		return returnMap;
	}

	public Map queryAcctBillCycle(Map parameter) throws Exception {
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query account information ok");
		IAcctBillCycleValue acctBill = CmServiceFactory.getAccountSV().queryCurrAcctBillCyclesByAcctId(Long.valueOf(parameter.get("AcctId").toString()));

		if (null != acctBill) {
			Map retMap = new HashMap();// 返回Map
			retMap.put("acctBillCycle", acctBill);
			returnMap.put("returnObj", retMap);
			return returnMap;

		} else
			ExceptionUtil.throwBusinessException("CMS0000212");// "出账信息查询,没有查询到相应的出账信息",

		return returnMap;

	}

	public Map enjoyService(Map parameter) throws Exception {
		/*
		 * Map returnMap = new HashMap(); long userId =
		 * Long.parseLong(parameter.get("UserId").toString()); long serviceId =
		 * Long.parseLong(parameter.get("ServiceId").toString()); int times =
		 * Integer.parseInt(parameter.get("Times").toString()); int roamFlag =
		 * Integer.parseInt((parameter.get("RoamFlag").toString())); String
		 * provinceCode = parameter.get("ProvinceCode").toString(); String
		 * busiCode = parameter.get("BusiCode").toString(); String remarks =
		 * parameter.get("Remarks").toString(); if (userId <= 0 || serviceId <=
		 * 0 || times < 0) { // 参数合法
		 * ExceptionUtil.throwBusinessException("CMS0000073");// TODO }
		 * IClubServiceValue clubService =
		 * CmServiceFactory.getClubServiceSV().queryClubServiceById(serviceId);
		 * if (!CmCommonUtil.isNotEmptyObject(clubService)) { // 服务不存在
		 * ExceptionUtil.throwBusinessException("CMS0000073");// TODO }
		 * DataContainer condition = new DataContainer();
		 * condition.set(IClubMemberValue.S_ClubId, clubService.getClubId());
		 * condition.set(IClubMemberValue.S_UserId, userId); IClubMemberValue[]
		 * clubMemberValue =
		 * CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1,
		 * -1); if (!CmCommonUtil.isNotEmptyObject(clubMemberValue)) { //
		 * 没找到相关会员记录 ExceptionUtil.throwBusinessException("CMS0034001"); }
		 * CmServiceFactory.getClubServiceSV().enjoyService(userId,
		 * clubMemberValue[0].getMemberId(), serviceId, times, roamFlag,
		 * provinceCode, busiCode, remarks); return returnMap;
		 */
		return null;
	}

	// FreeServiceType 0：机场VIP贵宾免费服务 1：火车站免费服务

	public Map queryClubServiceFreeTimes(Map parameter) throws Exception {
		if (isEmpty(parameter.get("ServiceNum")) || isEmpty(parameter.get("ClubId")))
			ExceptionUtil.throwBusinessException("CMS95000001");// "参数不能为空",

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "VIP free inquiry service information ok");

		DataContainer dc = new DataContainer();
		dc.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		dc.set(IClubMemberValue.S_BillId, parameter.get("ServiceNum").toString());
		dc.set(IClubMemberValue.S_ClubId, Long.parseLong(parameter.get("ClubId").toString()));
		IClubMemberValue[] clubMemberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(dc, min, max);
		dc.clear();

		Map subReturnMap = new HashMap();
		if (clubMemberValue == null || clubMemberValue.length <= 0) {
			subReturnMap.put("RESULT_CODE", "-1");
			subReturnMap.put("RESULT_INFO", "There is no corresponding club membership information");
			returnMap.put("returnObj", subReturnMap);
			return returnMap;
		}

		long clubMemberId = clubMemberValue[0].getMemberId();
		// 由ClubId查询所有服务
		dc.set(IClubServiceValue.S_ClubId, Long.parseLong(parameter.get("ClubId").toString()));
		dc.set(IClubServiceValue.S_State, CmConstants.RecordState.USE);
		IClubServiceValue[] clubServiceValue = CmServiceFactory.getClubServiceSV().queryClubServices(dc, min, max);
		dc.clear();

		if (clubServiceValue == null || clubServiceValue.length <= 0) {
			subReturnMap.put("RESULT_CODE", "-1");
			subReturnMap.put("RESULT_INFO", "Club service information is not defined");
			returnMap.put("returnObj", subReturnMap);
			return returnMap;
		}

		// 由MemberId,ServiceId 查询有效服务记录
		List<Map> list = new ArrayList();
		if ("0".equals(parameter.get("FreeServiceType")))// 机场服务
		{
			for (int i = 0; i < clubServiceValue.length; i++) {
				if (clubServiceValue[i].getServiceType() != CmConstants.Club.SERVICE_TYPE_PLANE)
					continue;

				Map map = new HashMap();
				map.put("ServiceType", clubServiceValue[i].getServiceType());
				map.put("ServiceName", clubServiceValue[i].getServiceName());
				int availableServiceTimes = CmServiceFactory.getClubServiceSV().queryAvailableServiceTimes(clubMemberId, clubServiceValue[i].getServiceId());
				int totalServiceTimes = CmServiceFactory.getClubServiceSV().queryTotalServiceTimes(clubMemberId, clubServiceValue[i].getServiceId());
				map.put("AvailableTimes", availableServiceTimes);
				map.put("UsedTimes", totalServiceTimes - availableServiceTimes);
				list.add(map);
				break;
			}
		} else if ("1".equals(parameter.get("FreeServiceType")))// 火车站服务
		{
			for (int i = 0; i < clubServiceValue.length; i++) {
				if (clubServiceValue[i].getServiceType() != CmConstants.Club.SERVICE_TYPE_TRAIN)
					continue;

				Map map = new HashMap();
				map.put("ServiceType", clubServiceValue[i].getServiceType());
				map.put("ServiceName", clubServiceValue[i].getServiceName());
				int availableServiceTimes = CmServiceFactory.getClubServiceSV().queryAvailableServiceTimes(clubMemberId, clubServiceValue[i].getServiceId());
				int totalServiceTimes = CmServiceFactory.getClubServiceSV().queryTotalServiceTimes(clubMemberId, clubServiceValue[i].getServiceId());
				map.put("AvailableTimes", availableServiceTimes);
				map.put("UsedTimes", totalServiceTimes - availableServiceTimes);
				list.add(map);
				break;
			}
		} else {
			for (int i = 0; i < clubServiceValue.length; i++) {
				Map map = new HashMap();
				map.put("ServiceType", clubServiceValue[i].getServiceType());
				map.put("ServiceName", clubServiceValue[i].getServiceName());
				int availableServiceTimes = CmServiceFactory.getClubServiceSV().queryAvailableServiceTimes(clubMemberId, clubServiceValue[i].getServiceId());
				int totalServiceTimes = CmServiceFactory.getClubServiceSV().queryTotalServiceTimes(clubMemberId, clubServiceValue[i].getServiceId());
				map.put("AvailableTimes", availableServiceTimes);
				map.put("UsedTimes", totalServiceTimes - availableServiceTimes);
				list.add(map);
			}
		}

		subReturnMap.put("RESULT_CODE", "0");
		subReturnMap.put("RESULT_INFO", "VIP free information inquiry service ");
		subReturnMap.put("RESULT_LIST", list);
		returnMap.put("returnObj", subReturnMap);

		return returnMap;
	}

	/*
	 * QueryType 1 根据bill查询 (non-Javadoc)
	 * @seecom.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV#
	 * queryClubMember(java.util.Map)
	 */

	public Map queryClubMember(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		int queryType;

		if (isEmpty(parameter.get("QueryType")))
			queryType = 1;// 默认通过BillId查询会员
		else
			queryType = Integer.parseInt(parameter.get("QueryType").toString());

		DataContainer condition = new DataContainer();
		switch (queryType) {
			case 1:
				if (isEmpty(parameter.get("BillId")))
					ExceptionUtil.throwBusinessException("CMS0000214");// "服务号码不能为空",
				condition.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
				condition.set(IClubMemberValue.S_BillId, parameter.get("BillId").toString());
				break;
			// case 2:
			// ;
			default:
				// ExceptionUtil.throwBusinessException("会员查询,查询方式错误", "");
				break;
		}

		ICmClubMemberSV clubMemberSV = CmServiceFactory.getClubMemberSV();
		// 查询
		IClubMemberValue[] memberValues = clubMemberSV.queryClubMembers(condition, min, max);

		if (memberValues != null && memberValues.length > 0) {
			List resultList = new ArrayList();
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			ICmClubSV clubSV = CmServiceFactory.getClubSV();
			for (int i = 0; i < memberValues.length; i++) {
				if (memberValues[i].getExpireDate().before(CmCommonUtil.getSysDate()))
					continue;

				// 将value转换为Map
				Map infoMap = CmFSVUtil.value2Map(memberValues[i]);

				IBOBsStaticDataValue memberLevel = StaticDataUtil.getStaticData(CmConstants.Club.MEMBER_LEVEL, String.valueOf(memberValues[i].getMemberLevel()));
				if (memberLevel != null)
					infoMap.put("MEMBER_LEVEL_DISPLAY", memberLevel.getCodeName());

				// 查询客户信息
				ICustomerValue custValue = customerSV.queryCustomerByCustId(memberValues[i].getCustId());
				if (CmCommonUtil.isNotEmptyObject(custValue)) {
					Map custMap = CmFSVUtil.value2Map(custValue);
					infoMap.putAll(custMap);
				}

				// 查询俱乐部信息
				IClubValue clubValue = clubSV.queryClubById(memberValues[i].getClubId());
				if (CmCommonUtil.isNotEmptyObject(clubValue)) {
					Map clubMap = CmFSVUtil.value2Map(clubValue);
					infoMap.putAll(clubMap);
				}

				// 查询会员卡信息
				IClubMemberCardValue[] cardValue = clubMemberSV.queryClubMemberCardsByMemberId(memberValues[i].getMemberId());
				if (CmCommonUtil.isNotEmptyObject(cardValue)) {
					Map cardMap = CmFSVUtil.value2Map(cardValue[0]);
					infoMap.putAll(cardMap);
				}

				resultList.add(infoMap);
			}
			returnMap.put("returnObj", resultList);
		}

		// 如果没查询到结果，resultList可能是空值
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Club membership information query ok");
		return returnMap;
	}

	// 提供给外围接口修改银行卡绑定、解绑
	public Map saveAcctPayment(Map parameter) throws Exception {
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Operation ok");

		DataContainer dc = new DataContainer();

		if (!isEmpty(parameter.get("ServiceNum"))) {
			// 得到用户信息
			IBOUserInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().queryUserInfoByBillId(parameter.get("ServiceNum").toString());
			if (userInfo == null) {
				ExceptionUtil.throwBusinessException("CMS8000043");// "用户信息不存在!",
			}

			// 得到默认付费账户
			ISoAccrelValue[] accrelValue = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, min, max);
			if (accrelValue == null || accrelValue.length <= 0) {
				ExceptionUtil.throwBusinessException("CMS95000002"); // CMS95000002
			}
			// 默认付费账户不存在

			dc.set(IAccountProfileValue.S_AcctId, accrelValue[0].getAcctId());
		} else if (!isEmpty(parameter.get("AcctId"))) {
			dc.set(IAccountProfileValue.S_AcctId, Long.parseLong(parameter.get("AcctId").toString()));
		}

		// 得到账户信息
		IAccountProfileValue[] accountValue = CmServiceFactory.getAccountSV().queryAccountProfiles(dc, min, max);
		if (accountValue == null || accountValue.length <= 0) {
			ExceptionUtil.throwBusinessException("CMS8000050");// "账户信息不存在!",
		}

		ICustomerValue customer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(accountValue[0].getCustId());
		if (customer == null) {
			ExceptionUtil.throwBusinessException("CMS1100082");// "客户信息不存在!",
		}

		VOAccountBean voAccount = new VOAccountBean();
		IAcctPaymentValue acctPayment = new AcctPaymentBean();
		acctPayment.initProperty(IAcctPaymentValue.S_AcctId, accountValue[0].getAcctId());
		acctPayment.initProperty(IAcctPaymentValue.S_PaymentId, accountValue[0].getPaymentId());
		acctPayment.initProperty(IAcctPaymentValue.S_RegionId, accountValue[0].getRegionId());

		// 1 银行卡绑定 2银行卡解绑
		if ("1".equals(parameter.get("OperType"))) {
			// 邮政代扣
			acctPayment.set(IAcctPaymentValue.S_PayMethod, CmConstants.AccountPayMethod.POSTAL_COLLECTION);
			acctPayment.set(IAcctPaymentValue.S_PaymentBankCode, parameter.get("BankId").toString());
		} else if ("2".equals(parameter.get("OperType"))) {
			acctPayment.set(IAcctPaymentValue.S_PayMethod, CmConstants.AccountPayMethod.CASH);
			acctPayment.set(IAcctPaymentValue.S_PaymentBankCode, "");// 将银行编码清空
		}
		voAccount.addPayment(acctPayment);
		CmServiceFactory.getAccountSV().saveAccount(voAccount);

		// 保存属性信息
		BOCmCmxAcctPaymentAttrBean[] acctPaymentAttrs = new BOCmCmxAcctPaymentAttrBean[2];
		if ("1".equals(parameter.get("OperType"))) {
			BOCmCmxAcctPaymentAttrBean acctPaymentAttr = null;

			acctPaymentAttr = (BOCmCmxAcctPaymentAttrBean) ((ICmPaymentAttrSV) ServiceFactory.getService(ICmPaymentAttrSV.class)).queryData(CmLnConstants.PaymentAttr.OnceFee,
					accountValue[0].getPaymentId());
			acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, parameter.get("OnceFee").toString());
			acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
			acctPaymentAttrs[0] = acctPaymentAttr;

			acctPaymentAttr = (BOCmCmxAcctPaymentAttrBean) ((ICmPaymentAttrSV) ServiceFactory.getService(ICmPaymentAttrSV.class)).queryData(CmLnConstants.PaymentAttr.MinFee,
					accountValue[0].getPaymentId());
			acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, parameter.get("MinFee").toString());
			acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
			acctPaymentAttrs[1] = acctPaymentAttr;
		} else if ("2".equals(parameter.get("OperType"))) {
			BOCmCmxAcctPaymentAttrBean acctPaymentAttr = new BOCmCmxAcctPaymentAttrBean();
			acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, accountValue[0].getPaymentId());
			acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.OnceFee);
			acctPaymentAttr.delete();
			acctPaymentAttrs[0] = acctPaymentAttr;

			acctPaymentAttr = new BOCmCmxAcctPaymentAttrBean();
			acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, accountValue[0].getPaymentId());
			acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.MinFee);
			acctPaymentAttr.delete();
			acctPaymentAttrs[1] = acctPaymentAttr;
		}

		((ICmPaymentAttrSV) ServiceFactory.getService(ICmPaymentAttrSV.class)).saveData(acctPaymentAttrs);

		// 操作流水
		long doneCode = acctPayment.getDoneCode();
		Map subReturnMap = new HashMap();

		if (parameter.containsKey("ServiceNum"))
			subReturnMap.put("ServiceNum", parameter.get("ServiceNum"));

		subReturnMap.put("CustName", customer.getCustName());
		subReturnMap.put("BusiSeq", doneCode);

		returnMap.put("returnObj", subReturnMap);
		return returnMap;
	}

	public Map modifyAccount(Map parameter) throws Exception {
		Map resultMap = new HashMap();// 返回Map
		Object infoValueMap = parameter.get("AcctInfo");
		IAccountValue accountValue = null;// 帐户信息

		if (infoValueMap == null) {
			// 参数不能为空
			ExceptionUtil.throwBusinessException("CMS0006035");// TODO
		}

		// 将map转换成value
		Object acctObject = CmFSVUtil.map2Object(AccountBean.class, (Map) infoValueMap);// TODO
		// 暂时做统一处理
		if (acctObject == null) {
			// 参数不能为空
			ExceptionUtil.throwBusinessException("CMS0006035");// TODO
		}
		accountValue = (IAccountValue) acctObject;

		// 查询账户原始信息
		IAccountValue acctOri = CmServiceFactory.getAccountSV().queryAccountById(accountValue.getAcctId());
		if (CmCommonUtil.isEmptyObject(acctOri)) {
			// 数据库中没有这条记录！
			ExceptionUtil.throwBusinessException("CMS0006035");// TODO
		}
		// 设置账户信息
		acctOri = (IAccountValue) CmFSVUtil.modifyUtil((DataContainer) accountValue, (DataContainer) acctOri);

		// 设置accountValue状态为修改
		acctOri.initProperty(IAccountValue.S_AcctId, accountValue.getAcctId());

		VOAccountBean voacctBean = new VOAccountBean();// 定义VOAccountBean大对象
		voacctBean.setAccount(acctOri);
		CmServiceFactory.getAccountSV().saveAccount(voacctBean);

		// 封装结果
		String doneCode = String.valueOf(acctOri.getDoneCode());// 操作流水
		resultMap.put("DoneCode", doneCode);

		return resultMap;
	}

	public Map modifyAccountValue(Map parameter) throws Exception {
		if (isEmpty(parameter.get("OperType")))
			ExceptionUtil.throwBusinessException("CMS95000003");// CMS95000003
		// 操作方式不能为空

		Map returnMap = new HashMap();// 返回Map

		if ("new".equalsIgnoreCase(parameter.get("OperType").toString())) {
			Object acctObject = parameter.get("AccountBean");//

			if (acctObject == null)
				ExceptionUtil.throwBusinessException("CMS95000004");// CMS95000004
			// 账户信息不能为空

			IAccountValue accountValue = null;// 帐户信息
			accountValue = (IAccountValue) acctObject;

			if (!accountValue.isNew())
				ExceptionUtil.throwBusinessException("CMS95000005");// CMS95000005
			// 数据结构不是新增状态

			if (isEmpty(accountValue.getCustId()))
				ExceptionUtil.throwBusinessException("CMS95000006");// CMS95000006
			// 新增账户资料,客户编码不能为空

			if (isEmpty(accountValue.getAcctName()))
				ExceptionUtil.throwBusinessException("CMS95000007");// CMS95000007
			// 新增账户资料,账户名称不能为空

			if (isEmpty(accountValue.getRegionId()))
				ExceptionUtil.throwBusinessException("CMS95000008");// CMS95000008
			// 新增账户资料,地州信息不能为空

			if (isEmpty(StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_TYPE, String.valueOf(accountValue.getAcctType()))))
				ExceptionUtil.throwBusinessException("CMS95000009");// CMS95000009
			// 新增账户资料,账户类型输入有误

			VOAccountBean voacctBean = new VOAccountBean();// 定义VOAccountBean大对象
			voacctBean.setAccount(accountValue);
			long acctId = CmServiceFactory.getAccountSV().saveAccount(voacctBean);// 调用服务保存

			returnMap.put("returnObj", acctId);
		} else if ("modify".equalsIgnoreCase(parameter.get("OperType").toString())) {
		}

		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Modify customer information ok");

		return returnMap;
	}

	public Map actionCmInsCmRel(Map parameter) throws Exception {
		if (isEmpty(parameter.get("OperType")))
			ExceptionUtil.throwBusinessException("CMS95000003");

		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");

		BOLnCmInsCmRelBean bean = new BOLnCmInsCmRelBean();

		if ("query".equalsIgnoreCase(parameter.get("OperType").toString())) {
			if (isEmpty(parameter.get("CustId")))
				ExceptionUtil.throwBusinessException("CMS95000010");// CMS95000010
			// 客户编码不能为空
			long userId = 0L;
			if (null != parameter.get("UserId") && StringUtils.isNotBlank(parameter.get("UserId").toString())) {
				userId = Long.parseLong(parameter.get("UserId").toString());
			}
			IBOLnCmInsCmRelValue[] values = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValues(Long.parseLong(parameter.get("CustId").toString()), userId);
			for (int i = 0; i < values.length; i++) {
				if (values[i].getRelaType() == 0) {
					values[i].setRelaType(2);
				}
			}
			/*
			 * Map map = new HashMap(); for (IBOLnCmInsCmRelValue value :
			 * values) { map.put(value.getUserId(), value.getUserRegionCode()); }
			 */

			returnMap.put("returnObj", values);
			returnMap.put("returnMsg", "Query customer relationship OK");
			return returnMap;
		} else if ("queryDes".equalsIgnoreCase(parameter.get("OperType").toString())) {
			if (isEmpty(parameter.get("CustId")))
				ExceptionUtil.throwBusinessException("CMS95000010");

			long custId = Long.parseLong(parameter.get("CustId").toString());
			ICmLnCommonServiceSV sv = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
			IBOLnCmInsCmRelValue[] values = sv.queryDesUsers(custId);
			for (int i = 0; i < values.length; i++) {
				if (values[i].getRelaType() == 0) {
					values[i].setRelaType(2);
				}
			}
			returnMap.put("returnObj", values);
			returnMap.put("returnMsg", "Cancel the query user data OK");
			return returnMap;
		} else if ("queryHis".equalsIgnoreCase(parameter.get("OperType").toString())) {
			if (isEmpty(parameter.get("CustId")))
				ExceptionUtil.throwBusinessException("CMS95000010");
			ICmLnCommonServiceSV sv = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
			IBOLnCmInsDesRelValue[] values = sv.queryCustDesUsers(Long.parseLong(parameter.get("CustId").toString()));
			returnMap.put("returnObj", values);
			returnMap.put("returnMsg", "Customer query historical data OK");
			return returnMap;
		} else if ("addHis".equalsIgnoreCase(parameter.get("OperType").toString())) {
			IBOLnCmInsDesRelValue[] values = (IBOLnCmInsDesRelValue[]) parameter.get("inputObj");
			ICmLnCommonServiceSV sv = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
			sv.saveDesUsers(values);
			returnMap.put("returnObj", true);
			returnMap.put("returnMsg", "Save the customer historical data OK");
			return returnMap;
		} else if ("add".equalsIgnoreCase(parameter.get("OperType").toString())) {
			bean.set(BOLnCmInsCmRelBean.S_UserId, Long.parseLong(parameter.get("UserId").toString()));
			bean.set(BOLnCmInsCmRelBean.S_CustId, Long.parseLong(parameter.get("CustId").toString()));

			if (parameter.containsKey("State"))
				bean.set(BOLnCmInsCmRelBean.S_State, Integer.parseInt(parameter.get("State").toString()));
			else
				bean.set(BOLnCmInsCmRelBean.S_State, CmLnConstants.UserState.USER_NORMAL);

			if (parameter.containsKey("UserRegionCode"))
				bean.set(BOLnCmInsCmRelBean.S_UserRegionCode, parameter.get("UserRegionCode").toString());
			if (parameter.containsKey("relaType") && parameter.get("relaType") != null) {
				bean.set(BOLnCmInsCmRelBean.S_RelaType, Long.parseLong(parameter.get("relaType").toString()));
			} else {
				bean.set(BOLnCmInsCmRelBean.S_RelaType, 2);
			}
			if (parameter.containsKey("UserType") && parameter.get("UserType") != null) {
				bean.set(BOLnCmInsCmRelBean.S_UserType, Long.parseLong(parameter.get("UserType").toString()));
			}
			if (parameter.containsKey("OfferId") && parameter.get("OfferId") != null) {
				bean.set(BOLnCmInsCmRelBean.S_Remarks, parameter.get("OfferId").toString());
			}
			bean.set(BOLnCmInsCmRelBean.S_CmrelId, CmCommonUtil.getNewSequence(BOLnCmInsCmRelBean.class));
			bean.set(BOLnCmInsCmRelBean.S_DoneDate, CmCommonUtil.getSysDate());
			bean.set(BOLnCmInsCmRelBean.S_CreateDate, CmCommonUtil.getSysDate());
			bean.set(BOLnCmInsCmRelBean.S_EffectiveDate, CmCommonUtil.getSysDate());
			bean.set(BOLnCmInsCmRelBean.S_ExpireDate, CmLnCommonUtil.getMaxDate());
			bean.set(BOLnCmInsCmRelBean.S_EffectiveDateType, 1);
			bean.set(BOLnCmInsCmRelBean.S_ExpireDateType, 1);
			returnMap.put("returnMsg", "New customer user relationship OK");
		} else if ("modify".equalsIgnoreCase(parameter.get("OperType").toString())) {
			IBOLnCmInsCmRelValue inputValue = (IBOLnCmInsCmRelValue) parameter.get("inputObj");
			IBOLnCmInsCmRelValue[] queryValues = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValueByUserId(inputValue.getUserId());
			if (queryValues == null || queryValues.length <= 0)
				ExceptionUtil.throwBusinessException("CMS95000011");// CMS95000011
			// CmInsCmRel修改,给定userId没有数据
			if (inputValue.getRelaType() == 0) {
				inputValue.setRelaType(2);
			}
			bean.copy(queryValues[0]);
			DataContainerFactory.copyNoClearData(inputValue, bean);
			returnMap.put("returnMsg", "Modify customer user relationship OK");
		} else if ("delete".equalsIgnoreCase(parameter.get("OperType").toString())) {
			IBOLnCmInsCmRelValue[] values = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValueByUserId(Long.parseLong(parameter.get("UserId").toString()));
			if (values == null || values.length <= 0)
				ExceptionUtil.throwBusinessException("CMS95000012");// CMS95000012
			// CmInsCmRel删除,给定userId没有数据
			for (int i = 0; i < values.length; i++) {
				if (values[i].getRelaType() == 0) {
					values[i].setRelaType(2);
				}
			}
			bean.copy(values[0]);
			bean.delete();
			returnMap.put("returnMsg", "Delete customer relationship OK");
		} else if ("queryRegion".equalsIgnoreCase(parameter.get("OperType").toString())) {
			if (isEmpty(parameter.get("CustId")))
				ExceptionUtil.throwBusinessException("CMS95000010");
			long userId = 0L;
			if (null != parameter.get("UserId") && StringUtils.isNotBlank(parameter.get("UserId").toString())) {
				userId = Long.parseLong(parameter.get("UserId").toString());
			}
			IBOLnCmInsCmRelValue[] values = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValues(Long.parseLong(parameter.get("CustId").toString()), userId);
			Map retMap = new HashMap();
			if (CmCommonUtil.isNotEmptyObject(values)) {
				boolean left = false;
				String regionId = "";
				if (CmLnCommonUtil.isSameCenter(values)) {// 不需要跨中心
					left = true;
					regionId = values[0].getUserRegionCode();
				}
				retMap.put("retCode", 0);//
				retMap.put("left", left);
				retMap.put("regionId", regionId);
				retMap.put("retMsg", "Query customer information OK!");
			} else {
				retMap.put("retCode", 1);// 对象信息不存在
				retMap.put("retMsg", "There is no customer information!");
			}
			returnMap.put("returnObj", retMap);
			return returnMap;
		}
		List<BOLnCmInsCmRelBean> list = new ArrayList<BOLnCmInsCmRelBean>();
		list.add(bean);
		ICmLnCommonServiceSV service = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		service.saveCmInsCmRelValues(list.toArray(new BOLnCmInsCmRelBean[0]));
		// CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
		// DataContainer[] { bean });

		returnMap.put("returnObj", "The operation is OK");
		return returnMap;
	}

	// 新增修改客户资料 OperType:new or modify ;CustType ;
	public Map modifyCustomerValue(Map parameter) throws Exception {
		if (isEmpty(parameter.get("OperType")) || isEmpty(parameter.get("CustType")))
			ExceptionUtil.throwBusinessException("CMS95000013");// CMS95000013
		// 操作方式及客户类型不能为空

		String operType = parameter.get("OperType").toString();
		int custType = Integer.parseInt(parameter.get("CustType").toString());
		Map returnMap = new HashMap();// 返回Map

		if ("modify".equalsIgnoreCase(operType)) {
			ICustomerValue[] queryValue;
			DataContainer dc = new DataContainer();
			ICustomerValue modifyValue = new CustomerBean();
			ICustomerValue inputValue;
			IVOCustValue bean = new VOCustBean();
			long returnCustId = 0L;
			switch (custType) {
				case CmConstants.CustomerType.INDIVIDUAL:

					if (isEmpty(parameter.get("CustId")))
						ExceptionUtil.throwBusinessException("CMS95000014");// CMS95000014

					dc.set(ICustomerValue.S_CustId, Long.parseLong(parameter.get("CustId").toString()));
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
					queryValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);
					dc.clear();

					if (queryValue == null || queryValue.length <= 0)
						ExceptionUtil.throwBusinessException("CMS95000015");// CMS95000015

					inputValue = (ICustomerValue) CmFSVUtil.map2Object(CustomerBean.class, parameter);
					//AI-750
					if(parameter.containsKey("Remarks")&&String.valueOf(parameter.get("Remarks")).equalsIgnoreCase("null")){
						inputValue.setRemarks("");
					}
					((DataContainer) inputValue).clearProperty(ICustomerValue.S_CustId);
					((DataContainer) inputValue).clearProperty(ICustomerValue.S_CustType);

					modifyValue.copy(queryValue[0]);
					CmFSVUtil.copyNewProperties(modifyValue, inputValue);

					if (log.isDebugEnabled())
						log.debug("\ncustomerModifyProperties" + modifyValue.getNewProperties());

					modifyValue.initProperty(ICustomerValue.S_CustId, queryValue[0].getCustId());
					bean.setCustomer(modifyValue);
					returnCustId = CmServiceFactory.getCustomerSV().saveCustomer(bean);
					returnMap.put("returnObj", returnCustId);
					break;

				case CmConstants.CustomerType.FAMILY:
					break;

				case CmConstants.CustomerType.GROUP:

					if (isEmpty(parameter.get("CustId")) && isEmpty(parameter.get("GroupId")))
						ExceptionUtil.throwBusinessException("CMS95000014");
					if (!isEmpty(parameter.get("CustId")))
						dc.set(ICustomerValue.S_CustId, Long.parseLong(parameter.get("CustId").toString()));
					else if (!isEmpty(parameter.get("GroupId")))
						dc.set(ICustomerValue.S_CustServiceId, parameter.get("GroupId").toString());

					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
					queryValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);
					dc.clear();

					if (queryValue == null || queryValue.length <= 0)
						ExceptionUtil.throwBusinessException("CMS95000015");

					inputValue = (ICustomerValue) CmFSVUtil.map2Object(CustomerBean.class, parameter);
					
					//AI-750
					if(parameter.containsKey("Remarks")&&String.valueOf(parameter.get("Remarks")).equalsIgnoreCase("null")){
						inputValue.setRemarks("");
					}
					((DataContainer) inputValue).clearProperty(ICustomerValue.S_CustId);
					((DataContainer) inputValue).clearProperty(ICustomerValue.S_CustType);

					modifyValue.copy(queryValue[0]);
					CmFSVUtil.copyNewProperties(modifyValue, inputValue);

					if (log.isDebugEnabled())
						log.debug("\ncustomerModifyProperties" + modifyValue.getNewProperties());

					modifyValue.initProperty(ICustomerValue.S_CustId, queryValue[0].getCustId());

					bean.setCustomer(modifyValue);
					returnCustId = CmServiceFactory.getCustomerSV().saveCustomer(bean);
					returnMap.put("returnObj", returnCustId);
					break;

				case CmConstants.CustomerType.VIRTUAL:
					break;

				default:
					break;
			}
		} else if ("new".equalsIgnoreCase(operType)) {
			switch (custType) {
				case CmConstants.CustomerType.INDIVIDUAL:
					break;

				case CmConstants.CustomerType.FAMILY:
					break;

				case CmConstants.CustomerType.GROUP:

					ICustomerValue inputValue = new CustomerBean();// (ICustomerValue)
					// parameter.get("CustBean");
					/*
					 * if (isEmpty(parameter.get("CUST_TYPE")))
					 * ExceptionUtil.throwBusinessException("CMS95000017");
					 */// CMS95000017
					inputValue.setCustType(CmConstants.CustomerType.GROUP);

					if (isEmpty(parameter.get("CUST_NAME")))
						ExceptionUtil.throwBusinessException("CMS95000018");// CMS95000018
					inputValue.setCustName(parameter.get("CUST_NAME").toString());

					if (isEmpty(parameter.get("REGION_ID")))
						ExceptionUtil.throwBusinessException("CMS95000019");// CMS95000019
					inputValue.setRegionId(parameter.get("REGION_ID").toString());

					if (isEmpty(parameter.get("CUST_CERT_TYPE")))
						ExceptionUtil.throwBusinessException("CMS95000020");// CMS95000020
					inputValue.setCustCertType(Integer.parseInt(parameter.get("CUST_CERT_TYPE").toString()));

					if (isEmpty(parameter.get("CUST_CERT_CODE")))
						ExceptionUtil.throwBusinessException("CMS95000021");// CMS95000021
					inputValue.setCustCertCode(parameter.get("CUST_CERT_CODE").toString());

					// 保存客户信息
					IVOCustValue bean = new VOCustBean();
					bean.setCustomer(inputValue);

					// 保存客户扩展信息
					BOLnCmxGroupCustBean grpCustomerExt = new BOLnCmxGroupCustBean();
					if (!isEmpty(parameter.get("IS_VPMN")))
						grpCustomerExt.setIsVpmn(Integer.parseInt(parameter.get("IS_VPMN").toString()));
					else
						grpCustomerExt.setIsVpmn(0);

					bean.setUserObject("cmxGrpCust", grpCustomerExt);
					bean.setUserObject("cmxGrpCust", grpCustomerExt);
					bean.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);

					long flag = CmServiceFactory.getCustomerSV().saveCustomer(bean);// 返回的是custId

					returnMap.put("returnObj", flag);
					break;

				case CmConstants.CustomerType.VIRTUAL:
					break;

				default:
					break;
			}
		}

		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Modify customer information OK");
		return returnMap;
	}

	// TODO 需要排除重复数据
	// 查询acct_payment表 ,QueryType 1 根据acct_id,cust_id来查询,2 根据bank_code region_id
	// pay_method查询
	public Map queryAcctPayment(Map parameter) throws Exception {

		Map returnMap = new HashMap();// 返回Map

		if (isEmpty(parameter.get("QueryType")))
			ExceptionUtil.throwBusinessException("CMS95000022");// CMS95000022
		int queryType = Integer.parseInt(parameter.get("QueryType").toString());
		DataContainer dc = new DataContainer();
		IAcctPaymentValue[] acctPaymentValues = null;

		switch (queryType) {
			case 1:
				Object acctIdObject = parameter.get("AcctId");// 账户编号
				if (isEmpty(acctIdObject))
					ExceptionUtil.throwBusinessException("CMS95000023");// CMS95000023

				dc.set(IAcctPaymentValue.S_AcctId, Long.parseLong(acctIdObject.toString()));
				// dc.set(IAcctPaymentValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				dc.set(IAcctPaymentValue.S_State, CmConstants.RecordState.USE);
				break;
			case 2:
				/*
				 * 三字段distinct
				 * payment_bank_code,payment_account,payment_account_name add by
				 * xiezhenlong
				 */
				Object bankCode = parameter.get("BankCode");
				Object regionId = parameter.get("RegionId");

				if (isEmpty(bankCode) || isEmpty(regionId))
					ExceptionUtil.throwBusinessException("CMS95000024");// CMS95000024

				dc.set(IAcctPaymentValue.S_PaymentBankCode, bankCode);
				dc.set(IAcctPaymentValue.S_RegionId, regionId);
				dc.set(IAcctPaymentValue.S_State, CmConstants.RecordState.USE);
				if (!isEmpty(parameter.get("PayMethod"))) {
					dc.set(IAcctPaymentValue.S_PayMethod, parameter.get("PayMethod"));
				} else {
					dc.set(IAcctPaymentValue.S_PayMethod, CmConstants.AccountPayMethod.BANK_COLLECTION);
				}
				acctPaymentValues = CmServiceFactory.getAccountSV().queryAcctPayments(dc, -1, -1);

				if (acctPaymentValues != null && acctPaymentValues.length > 0) {
					returnMap.put("returnObj", acctPaymentValues);
				}
				return returnMap;
			case 3:
				Object regionIdObj = parameter.get("RegionId");
				Object payTypeObj = parameter.get("PayMethod");
				if (isEmpty(regionIdObj) || isEmpty(payTypeObj)) {
					ExceptionUtil.throwBusinessException("CMS95000025");// CMS95000025
				}

				dc.set(IAcctPaymentValue.S_RegionId, regionIdObj);
				dc.set(IAcctPaymentValue.S_State, CmConstants.RecordState.USE);
				dc.set(IAcctPaymentValue.S_PayMethod, payTypeObj);
				acctPaymentValues = CmServiceFactory.getAccountSV().queryAcctPayments(dc, -1, -1);

				if (acctPaymentValues != null && acctPaymentValues.length > 0) {
					returnMap.put("returnObj", acctPaymentValues);
				}
				return returnMap;
			case 4:
				Object acctId = parameter.get("AcctId");// 账户编号
				if (isEmpty(acctId))
					ExceptionUtil.throwBusinessException("CMS95000023");// CMS95000023

				dc.set(IAcctPaymentValue.S_AcctId, Long.parseLong(acctId.toString()));
				dc.set(IAcctPaymentValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				dc.set(IAcctPaymentValue.S_State, CmConstants.RecordState.USE);
				break;
			default:
				ExceptionUtil.throwBusinessException("CMS95000026");// CMS95000026
				break;
		}
		IAcctPaymentValue[] resultValues = CmServiceFactory.getAccountSV().queryAcctPayments(dc, -1, -1);

		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Check the account payment scheme OK");
		switch (queryType) {
			case 1:
				returnMap.put("returnObj", resultValues);
				break;
			case 2:
				returnMap.put("returnObj", resultValues);
				break;
			case 3:
				returnMap.put("returnObj", resultValues);
				break;
			case 4:
				returnMap.put("returnObj", resultValues[0]);
				break;
			default:
				break;
		}
		return returnMap;
	}

	// 查询账户QueryType 1 根据groupId查询集团客户账户 ; 2根据cust_id,acct_id查询
	public Map queryAccount(Map parameter) throws Exception {
		if (isEmpty(parameter.get("QueryType")))
			ExceptionUtil.throwBusinessException("CMS95000027");// CMS95000027

		// 查询条件
		Object custIdObject = parameter.get("CustId");// 客户编号

		int queryType = Integer.parseInt(parameter.get("QueryType").toString());
		DataContainer dc = new DataContainer();
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query account information OK");
		ISoUserValue userBean = null;
		IAccountProfileValue[] returnObj = null;
		long custId = 0;
		long acctId = 0;

		switch (queryType) {
			case 1:
				if (isEmpty(parameter.get("GroupId"))) {
					ExceptionUtil.throwBusinessException("CMS95000028");// CMS95000028
				}
				ICustomerValue[] customerValue;
				dc.set(ICustomerValue.S_CustServiceId, parameter.get("GroupId").toString());
				dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				customerValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);
				if (customerValue == null || customerValue.length <= 0) {
					ExceptionUtil.throwBusinessException("CMS95000029");// CMS95000029
				}

				dc.clear();
				custIdObject = customerValue[0].getCustId();

				custId = Long.parseLong(custIdObject.toString());
				returnObj = CmServiceFactory.getAccountSV().queryAcctDtsById(-1, custId, -1, -1);
				returnMap.put("returnObj", returnObj);
				return returnMap;
			case 2:
				if (isEmpty(parameter.get("PaymentAccount")))
					ExceptionUtil.throwBusinessException("CMS95000030");// CMS95000030

				if (isEmpty(parameter.get("RegionId")))
					ExceptionUtil.throwBusinessException("CMS95000031");// CMS95000031

				dc.set(IAccountProfileValue.S_RegionId, parameter.get("RegionId").toString());
				if (!isEmpty(parameter.get("PayMethod")))
					dc.set(IAccountProfileValue.S_PayMethod, Integer.parseInt(parameter.get("PayMethod").toString()));
				else
					dc.set(IAcctPaymentValue.S_PayMethod, CmConstants.AccountPayMethod.BANK_COLLECTION);

				dc.set(IAccountProfileValue.S_PaymentAccount, parameter.get("PaymentAccount").toString());

				break;
			case 3:
				if (isEmpty(parameter.get("ServiceNum")) && isEmpty(parameter.get("AcctId")) && isEmpty(parameter.get("CustId"))) {
					ExceptionUtil.throwBusinessException("CMS95000032");// CMS95000032
				}
				if (!isEmpty(parameter.get("ServiceNum"))) {
					userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(parameter.get("ServiceNum").toString());
					custId = userBean.getCustId();
				}
				if (!isEmpty(parameter.get("CustId"))) {
					custId = Long.parseLong(parameter.get("CustId").toString());
				}
				if (!isEmpty(parameter.get("AcctId"))) {
					acctId = Long.parseLong(parameter.get("AcctId").toString());
				}
				returnObj = CmServiceFactory.getAccountSV().queryAcctDtsById(acctId, custId, -1, -1);
				returnMap.put("returnObj", returnObj);
				return returnMap;

			case 4:
				if (isEmpty(parameter.get("AcctId"))) {
					ExceptionUtil.throwBusinessException("CMS95000033");// CMS95000033
				} else {
					dc.set(IAccountProfileValue.S_AcctId, Long.parseLong(parameter.get("AcctId").toString()));
				}
				break;
			case 5:
				if (isEmpty(parameter.get("CustId"))) {
					ExceptionUtil.throwBusinessException("CMS95000034");// CMS95000034
				}
				custId = Long.parseLong(parameter.get("CustId").toString());
				returnObj = CmServiceFactory.getAccountSV().queryAcctDtsById(-1, custId, -1, -1);
				IBOBsStaticDataValue staticValue = null;
				for (IAccountProfileValue value : returnObj) {
					// acct_type翻译
					staticValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_TYPE, String.valueOf(value.getAcctType()));
					if (staticValue != null)
						value.initProperty(IAccountProfileValue.S_AcctTypeDesc, staticValue.getCodeName());

					// pay_method翻译
					staticValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(value.getPayMethod()));
					if (staticValue != null)
						value.initProperty(IAccountProfileValue.S_PayMethodDesc, staticValue.getCodeName());
				}
				returnMap.put("returnObj", returnObj);
				return returnMap;

			case 6:
				if (isEmpty(parameter.get("AcctId"))) {
					ExceptionUtil.throwBusinessException("CMS95000033");
				} else {
					dc.set(IAccountProfileValue.S_AcctId, Long.parseLong(parameter.get("AcctId").toString()));
					dc.set(IAccountProfileValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				}
				break;
			case 8:

				if (isEmpty(parameter.get("ServiceNum")) && isEmpty(parameter.get("AcctId")) && isEmpty(parameter.get("UserId"))) {
					ExceptionUtil.throwBusinessException("CMS95000035");// CMS95000035
				} else {
					if (!isEmpty(parameter.get("ServiceNum"))) {
						IInsUserValue insValues = getCrm2CmFSV().getInsUser(0, parameter.get("ServiceNum").toString());
						if (CmCommonUtil.isEmptyObject(insValues)) {
							ExceptionUtil.throwBusinessException("CMS0000202");
						}
						IInsAccrelValue[] acctVs = getCrm2CmFSV().getInstAccrel(0, parameter.get("ServiceNum").toString());
						if (acctVs != null && acctVs.length > 0) {
							List acctList = new ArrayList();
							for (int i = 0; i < acctVs.length; i++) {
								Map acctMap = new HashMap();
								acctId = acctVs[i].getAcctId();
								IAccountProfileValue acctProfile = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(acctId);

								if (acctProfile == null)
									continue;

								acctMap.put("PayMethod", acctProfile.getPayMethod());
								acctMap.put("AccId", acctProfile.getAcctId());
								acctMap.put("CustId", acctProfile.getCustId());
								acctMap.put("AccType", acctProfile.getAcctType());
								acctMap.put("AccStatus", acctProfile.getAcctStatus());
								acctMap.put("AccName", acctProfile.getAcctName());

								acctMap.put("CreditLevel", acctProfile.getCreditLevel());
								acctMap.put("CreditValue", acctProfile.getCreditValue());
								acctMap.put("UrgeStopFlag", acctProfile.getUrgeStopFlag());
								acctMap.put("AccCycle", acctProfile.getBillDay());

								// 用户数据
								acctMap.put("RegionId", insValues.getRegionId());
								acctMap.put("CountyId", insValues.getCountryCode());
								// 以后添加
								acctMap.put("AccExtendInfo", "");

								acctList.add(acctMap);

							}
							Map aMap = new HashMap();
							aMap.put("AcctInfo", acctList);
							returnMap.put("returnObj", aMap);
							return returnMap;
						} else {
							ExceptionUtil.throwBusinessException("CMS95000036");// CMS95000036
						}
					} else if (!isEmpty(parameter.get("UserId"))) {
						IInsUserValue insValues = getCrm2CmFSV().getInsUser(Long.valueOf(parameter.get("UserId").toString()), null);
						if (CmCommonUtil.isEmptyObject(insValues)) {
							ExceptionUtil.throwBusinessException("CMS0000202");
						}
						IInsAccrelValue[] acctVs = getCrm2CmFSV().getInstAccrel(Long.valueOf(parameter.get("UserId").toString()), "");
						if (CmCommonUtil.isNotEmptyObject(acctVs) && acctVs.length > 0) {
							List acctList = new ArrayList();
							for (int i = 0; i < acctVs.length; i++) {
								Map acctMap = new HashMap();
								acctId = acctVs[i].getAcctId();
								IAccountProfileValue acctProfile = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(acctId);

								if (acctProfile == null)
									continue;

								acctMap.put("PayMethod", acctProfile.getPayMethod());
								acctMap.put("AccId", acctProfile.getAcctId());
								acctMap.put("CustId", acctProfile.getCustId());
								acctMap.put("AccType", acctProfile.getAcctType());
								acctMap.put("AccStatus", acctProfile.getAcctStatus());
								acctMap.put("AccName", acctProfile.getAcctName());

								acctMap.put("CreditLevel", acctProfile.getCreditLevel());
								acctMap.put("CreditValue", acctProfile.getCreditValue());
								acctMap.put("UrgeStopFlag", acctProfile.getUrgeStopFlag());
								acctMap.put("AccCycle", acctProfile.getBillDay());

								// 用户数据
								acctMap.put("RegionId", insValues.getRegionId());
								acctMap.put("CountyId", insValues.getCountryCode());
								// 以后添加
								acctMap.put("AccExtendInfo", "");

								acctList.add(acctMap);
							}
							Map aMap = new HashMap();
							aMap.put("AcctInfo", acctList);
							returnMap.put("returnObj", aMap);
							return returnMap;
						} else {
							ExceptionUtil.throwBusinessException("CMS95000036");

						}
					} else if (!isEmpty(parameter.get("AcctId"))) {
						IAccountProfileValue acctProfile = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(Long.valueOf(parameter.get("AcctId").toString()));

						if (acctProfile == null) {
							ExceptionUtil.throwBusinessException("CMS95000036");
						} else {
							Map acctMap = new HashMap();
							List acctList = new ArrayList();
							acctMap.put("PayMethod", acctProfile.getPayMethod());
							acctMap.put("AccId", acctProfile.getAcctId());
							acctMap.put("CustId", acctProfile.getCustId());
							acctMap.put("AccType", acctProfile.getAcctType());
							acctMap.put("AccStatus", acctProfile.getAcctStatus());
							acctMap.put("AccName", acctProfile.getAcctName());

							acctMap.put("CreditLevel", acctProfile.getCreditLevel());
							acctMap.put("CreditValue", acctProfile.getCreditValue());
							acctMap.put("UrgeStopFlag", acctProfile.getUrgeStopFlag());
							acctMap.put("AccCycle", acctProfile.getBillDay());

							// 用户数据
							// IInsUserValue insValues =
							// getCrm2CmFSV().getInsUser(acctProfile.getUserId(),
							// null);
							ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
							long groupCustId = acctProfile.getCustId();
							com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue cmGroupValue = cnGroupSv.queryGroupCustInfoByCustId(groupCustId);
							if (null != cmGroupValue) {
								acctMap.put("RegionId", cmGroupValue.getRegionId());
								acctMap.put("CountyId", cmGroupValue.getCountyId());
							} else {
								acctMap.put("RegionId", "");
								acctMap.put("CountyId", "");
							}

							// 以后添加
							acctMap.put("AccExtendInfo", "");

							Map aMap = new HashMap();
							acctList.add(acctMap);
							aMap.put("AcctInfo", acctList);
							returnMap.put("returnObj", aMap);

							return returnMap;
						}
					}
				}
				break;
			default:
				ExceptionUtil.throwBusinessException("CMS95000037");// CMS95000037
				break;
		}

		returnObj = CmxServiceFactory.getLnAccountSV().queryAccountProfiles(dc, min, max);
		returnMap.put("returnObj", returnObj);

		return returnMap;
	}

	public Map queryCustAcctRels(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "To determine whether the OK group account");

		if (isEmpty(parameter.get("QueryType")))
			ExceptionUtil.throwBusinessException("CMS95000038");// CMS95000038

		int queryType = Integer.parseInt(parameter.get("QueryType").toString());

		long acctId = -1;
		long custId = -1;

		switch (queryType) {
			case 1:
				if (isEmpty(parameter.get("AcctId")))
					ExceptionUtil.throwBusinessException("CMS95000039");// CMS95000039
				acctId = Long.parseLong(parameter.get("AcctId").toString());
				break;
			default:
				ExceptionUtil.throwBusinessException("CMS95000040");// CMS95000040
				break;
		}

		DataContainer[] values = CmServiceFactory.getAccountSV().queryCustAcctRels(acctId, custId, BOCmCustAcctRelBean.class, min, max);

		switch (queryType) {
			case 1:
				if (values != null && values.length > 0) {
					if (values[0].getAsInt("CUST_TYPE") == 3) // 集团客户
					{
						returnMap.put("returnObj", true);
					} else {
						returnMap.put("returnObj", false);
					}
				} else
					returnMap.put("returnObj", false);
				break;
			default:
				break;
		}

		return returnMap;
	}

	// 查询、校验黑名单信息
	public Map querySpecialList(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		Map infoMap;

		// 查询条件
		Object operType = parameter.get("OperType");// operType 可以为query check
		Object monType = parameter.get("MonType");// 监控类型 0黑名单；1白名单;2红名单
		Object subMonType = parameter.get("SubMonType");// 监控子类型
		Object certType = parameter.get("CertType");// 证件类型
		Object certCode = parameter.get("CertCode");// 证件号码
		Object custId = parameter.get("CustId");// 客户编号
		Object userId = parameter.get("UserId");// 用户编号
		Object specListId = parameter.get("SpecListId");// 特殊名单标识

		if (isEmpty(operType))
			ExceptionUtil.throwBusinessException("CMS95000041");// CMS95000041

		if ((isEmpty(certType) || isEmpty(certCode)) && isEmpty(custId))
			ExceptionUtil.throwBusinessException("CMS95000042");// CMS95000042

		// 设置查询条件
		DataContainer conditionDC = new DataContainer();
		if (!isEmpty(monType) && StringUtils.isNotBlank(monType.toString()))
			conditionDC.set(ISpecialListValue.S_MonType, Integer.parseInt(monType.toString()));
		else
			conditionDC.set(ISpecialListValue.S_MonType, CmConstants.CustSpecialListType.BLACK_LIST);// 默认查询黑名单

		if (!isEmpty(subMonType) && StringUtils.isNotBlank(subMonType.toString()))
			conditionDC.set(ISpecialListValue.S_SubMonType, Integer.parseInt(subMonType.toString()));

		if (!isEmpty(certType) && StringUtils.isNotBlank(certType.toString()))
			conditionDC.set(ISpecialListValue.S_CertType, Integer.parseInt(certType.toString()));

		if (!isEmpty(certCode) && StringUtils.isNotBlank(certCode.toString()))
			conditionDC.set(ISpecialListValue.S_CertCode, certCode.toString());

		if (!isEmpty(custId) && StringUtils.isNotBlank(custId.toString()))
			conditionDC.set(ISpecialListValue.S_CustId, Long.parseLong(custId.toString()));

		if (!isEmpty(userId) && StringUtils.isNotBlank(userId.toString()))
			conditionDC.set(ISpecialListValue.S_UserId, Long.parseLong(userId.toString()));

		if (!isEmpty(specListId) && StringUtils.isNotBlank(specListId.toString()))
			conditionDC.set(ISpecialListValue.S_SpecListId, Long.parseLong(specListId.toString()));

		conditionDC.set(ISpecialListValue.S_State, CmConstants.RecordState.USE);

		// 查询
		ISpecialListValue[] resultValues = CmServiceFactory.getSpecialListSV().querySpecialLists(conditionDC, min, max);
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Blacklist query customer information OK");

		if ("query".equalsIgnoreCase(operType.toString())) {
			List resultList = new ArrayList();
			if (resultValues != null)
				for (int i = 0; i < resultValues.length; i++) {
					// 将value转换为Map
					infoMap = CmFSVUtil.value2Map(resultValues[i]);
					resultList.add(infoMap);
				}

			returnMap.put("returnObj", resultList);
		} else if ("check".equalsIgnoreCase(operType.toString())) {
			if (CmCommonUtil.isNotEmptyObject(resultValues))
				returnMap.put("returnObj", true);
			else
				returnMap.put("returnObj", false);
		}

		return returnMap;
	}

	public Map actionGroupContract(Map parameter) throws Exception {
		if (isEmpty(parameter.get("OperType")))
			ExceptionUtil.throwBusinessException("CMS95000043");// CMS95000043

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query contract information ok");

		if ("query".equalsIgnoreCase(parameter.get("OperType").toString())) {
			if (isEmpty(parameter.get("CustId")))
				ExceptionUtil.throwBusinessException("CMS95000044");// CMS95000044

			IBOCmGroupContractValue condition = new BOCmGroupContractBean();
			condition.set(IBOCmGroupContractValue.S_CustId, Long.parseLong(parameter.get("CustId").toString()));
			condition.set(IBOCmGroupContractValue.S_State, CmConstants.RecordState.USE);
			IBOCmGroupContractValue[] vaules = CmServiceFactory.getGroupContractSV().queryGroupContracts(condition, min, max);
			returnMap.put("returnObj", vaules);
		} else if ("queryForOut".equals(parameter.get("OperType").toString())) {
			Map subReturnMap = new HashMap();
			subReturnMap.put("Count", 0);
			Map inputParam = (Map) parameter.get("inputParameter");

			int startNum = isEmpty(inputParam.get("BgnIndex")) ? -1 : Integer.parseInt(inputParam.get("BgnIndex").toString());
			int endNum = isEmpty(inputParam.get("EndIndex")) ? -1 : Integer.parseInt(inputParam.get("EndIndex").toString());
			long groupId = isEmpty(inputParam.get("GroupId")) ? -1 : Long.parseLong(inputParam.get("GroupId").toString());
			long opId = isEmpty(inputParam.get("OperId")) ? -1 : Long.parseLong(inputParam.get("OperId").toString());
			int queryMode = isEmpty(inputParam.get("QueryMode")) ? 0 : Integer.parseInt(inputParam.get("QueryMode").toString());
			String contractName = isEmpty(inputParam.get("ContractName")) ? "" : inputParam.get("ContractName").toString();
			String begDate = isEmpty(inputParam.get("BgnDate")) ? "" : inputParam.get("BgnDate").toString();
			String endDate = isEmpty(inputParam.get("EndDate")) ? "" : inputParam.get("EndDate").toString();

			if (groupId <= 0 && opId <= 0) {
				ExceptionUtil.throwBusinessException("CMS95000045");// CMS95000045
			}

			StringBuilder sql = new StringBuilder("");
			StringBuilder conditionSql = new StringBuilder("");
			Map queryParameter = new HashMap();
			sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupContractBean.class).getMapingEnty());

			if (groupId > 0) {
				conditionSql.append("and exists(select 1 from cm_group_customer a where a.state = :groupState and a.cust_id = t.cust_id and a.cust_service_id like :GroupId ) ");
				queryParameter.put("groupState", CmConstants.RecordState.USE);
				if (queryMode == 1) {
					queryParameter.put("GroupId", Long.valueOf(groupId) + "%");
				} else {
					queryParameter.put("GroupId", Long.valueOf(groupId));
				}
			}
			if (opId > 0) {
				conditionSql.append("and create_op_id = :OperId ");
				queryParameter.put("OperId", Long.valueOf(opId));
			}
			if (StringUtils.isNotBlank(contractName)) {
				conditionSql.append("and contract_name like :ContractName ");
				if (queryMode == 1) {
					queryParameter.put("ContractName", "%" + contractName + "%");
				} else {
					queryParameter.put("ContractName", contractName);
				}
			}
			if (StringUtils.isNotBlank(begDate)) {
				conditionSql.append("and create_date >= DATE_FORMAT( :BgnDate ,'%Y-%m-%d') ");
				queryParameter.put("BgnDate", begDate);
			}
			if (StringUtils.isNotBlank(endDate)) {
				conditionSql.append("and create_date <= DATE_FORMAT( :EndDate ,'%Y-%m-%d') ");
				queryParameter.put("EndDate", endDate);
			}

			DataContainerInterface[] values = null;
			if (endNum > 0) {
				values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupContractBean.class,
						CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), startNum, endNum, queryParameter), queryParameter);
			} else {
				values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupContractBean.class,
						CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), min, max, queryParameter), queryParameter);
			}

			if (values != null) {
				subReturnMap.put("Count", values.length);
				List list = new ArrayList();
				for (DataContainerInterface value : values) {
					Map info = new HashMap();
					list.add(info);
					ICustomerValue custValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(value.getAsLong("CUST_ID"));
					if (custValue != null) {
						info.put("CustName", custValue.getCustName());
						info.put("ContractId", value.get("CONTRACT_ID"));
						info.put("ContractName", value.get("CONTRACT_NAME"));
						info.put("Status", value.get("CONTRACT_STATUS"));
						info.put("CreateDate", value.get("CREATE_DATE"));
						info.put("FunishDate", value.get("SUBSCRIBE_DATE"));
						String path = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_APP_PATH", "CM_APP_PATH");
						path += "crm/cm/customer/group/CmGroupConstractForm.jsp?contractId=" + value.get("CONTRACT_ID");
						info.put("DetailURL", path);
						info.put("OpId", value.get("CREATE_OP_ID"));
						info.put("Notes", value.get("NOTES"));
					}
				}
				subReturnMap.put("contractInfo", list);
			}
			returnMap.put("returnObj", subReturnMap);
		} else if ("add".equalsIgnoreCase(parameter.get("OperType").toString())) {
			// TODO:预留
		} else if ("modify".equalsIgnoreCase(parameter.get("OperType").toString())) {
			// TODO:预留
		} else if ("qryCmGroupContractURL".equals(parameter.get("OperType").toString())) {// 查询集团合同URL地址
			StringBuffer url = new StringBuffer();
			if (isEmpty(parameter.get("conTractId")))
				ExceptionUtil.throwBusinessException("CMS95000046");// CMS95000046
			IBOCmGroupContractValue condition = new BOCmGroupContractBean();
			long contractId = Long.valueOf(String.valueOf(parameter.get("conTractId")));
			condition.set(IBOCmGroupContractValue.S_ContractId, contractId);
			condition.set(IBOCmGroupContractValue.S_State, CmConstants.RecordState.USE);
			List list = new ArrayList();
			IBOCmGroupContractValue[] vaules = CmServiceFactory.getGroupContractSV().queryGroupContracts(condition, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(vaules) && vaules.length > 0) {
				// 查询附件管理表对象是否存在此对象
				ICmAttachSV iCmAttach = (ICmAttachSV) ServiceFactory.getService(ICmAttachSV.class);
				DataContainer da = new DataContainer();
				da.set(IBOCmAttachValue.S_BusiSheetId, contractId);
				da.set(IBOCmAttachValue.S_State, CmConstants.RecordState.USE);
				IBOCmAttachValue[] iboAttachValues = iCmAttach.queryAttachValues(da);
				if (CmCommonUtil.isNotEmptyObject(iboAttachValues)) {
					// 获得URL
					BOBsFtpPathBean bsFtpPathValue = (BOBsFtpPathBean) CacheFactory.get(BsFtpPathCacheImpl.class, iboAttachValues[0].getBusiTypeCode());
					BOBsFtpBean bsFtpValue = (BOBsFtpBean) CacheFactory.get(BsFtpCacheImpl.class, iboAttachValues[0].getBusiTypeCode());

					url.append("http://");
					url.append(bsFtpValue.getHostIp()).append(bsFtpPathValue.getRemotePath()).append("/");
					Map map = null;
					for (int i = 0; i < iboAttachValues.length; i++) {
						map = new HashMap();
						String ur = url.toString() + iboAttachValues[i].getFileName();
						map.put("url", ur);
						map.put("CONTRACT_NAME", iboAttachValues[i].getAttachName());
						map.put("FILE_SIZE", iboAttachValues[i].getFileSize());
						list.add(map);
					}
				}
			}
			returnMap.put("returnObj", list);
		}

		return returnMap;
	}

	// 查询客户信息
	public Map queryCustomerValue(Map map) throws Exception {
		if (isEmpty(map.get("QueryType")))
			ExceptionUtil.throwBusinessException("CMS95000048");// CMS95000048

		int queryType = Integer.parseInt(map.get("QueryType").toString());

		DataContainer dc = new DataContainer();
		int startNum = -1;
		int endNum = -1;

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query customer information OK");

		ICustomerValue[] customerValue = null;
		IBOCmGroupContactQryValue[] contractValue = null;

		/*
		 * 1:通过custId(根据custId来判断查询对应客户)查询 2:通过serviceId(对应groupId)查询
		 * 3:通过cust_cert_type cust_cert_code查询个人客户 4:通过custId校验是否实名制客户
		 */
		switch (queryType) {
			case 1:
				if (isEmpty(map.get("CustId")))
					ExceptionUtil.throwBusinessException("CMS95000049");// CMS95000049
				dc.set(ICustomerValue.S_CustId, Long.parseLong(map.get("CustId").toString()));
				/*
				 * if(isEmpty(map.get("CustType")))
				 * dc.set(ICustomerValue.S_CustType,
				 * CmConstants.CustomerType.INDIVIDUAL); else
				 * dc.set(ICustomerValue.S_CustType,
				 * Integer.parseInt(map.get("CustType").toString()));
				 */
				break;
			case 2:
				if (isEmpty(map.get("CustServiceId")))
					ExceptionUtil.throwBusinessException("CMS95000050");// CMS95000050
				dc.set(ICustomerValue.S_CustServiceId, map.get("CustServiceId").toString());
				if (isEmpty(map.get("CustType")))
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				else
					dc.set(ICustomerValue.S_CustType, Integer.parseInt(map.get("CustType").toString()));
				break;
			case 3:
				if (isEmpty(map.get("CustCertType")) || isEmpty(map.get("CustCertCode")))
					ExceptionUtil.throwBusinessException("CMS95000051");// CMS95000051

				dc.set(ICustomerValue.S_CustCertType, Integer.parseInt(map.get("CustCertType").toString()));
				dc.set(ICustomerValue.S_CustCertCode, map.get("CustCertCode").toString());
				// modify by caiyu 20121026 应安文轩的要求，根据证件类型和证件号码查询客户信息，必须是正常的客户
				dc.set(ICustomerValue.S_State, CmConstants.RecordState.USE);
				if (isEmpty(map.get("CustType"))) {
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
				} else {
					dc.set(ICustomerValue.S_CustType, Integer.parseInt(map.get("CustType").toString()));
				}
				break;
			case 4:
				if (isEmpty(map.get("CustId")))
					ExceptionUtil.throwBusinessException("CMS95000052");// CMS95000052
				dc.set(ICustomerValue.S_CustId, Long.parseLong(map.get("CustId").toString()));
				if (isEmpty(map.get("CustType")))
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
				else
					dc.set(ICustomerValue.S_CustType, Integer.parseInt(map.get("CustType").toString()));
				break;
			case 5:// 根据手机号码查询客户信息
				Map subReturnMap = new HashMap();
				if (!isEmpty(map.get("ServiceNum"))) {
					ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(map.get("ServiceNum").toString());
					if (userBean != null && Integer.parseInt(userBean.getState()) == OrderConst.STATE_PAUSE_PASSIVE) {
						subReturnMap.put("RESULT_CODE", "1023");
						subReturnMap.put("RESULT_INFO", "The user has to cancel");
						returnMap.put("returnObj", subReturnMap);
						return returnMap;
					}
					if (userBean == null) {
						subReturnMap.put("RESULT_CODE", "1001");
						subReturnMap.put("RESULT_INFO", "Customer information is not present");
						returnMap.put("returnObj", subReturnMap);
						return returnMap;
					}
					if (!isEmpty(map.get("UserId"))) {
						if (userBean.getUserId() != Long.parseLong(map.get("UserId").toString())) {
							subReturnMap.put("RESULT_CODE", "-1");
							subReturnMap.put("RESULT_INFO", "Service and user code corresponding to the error number");
							returnMap.put("returnObj", subReturnMap);
							return returnMap;
						}
					}
					if (!isEmpty(map.get("CustId"))) {
						if (userBean.getCustId() != Long.parseLong(map.get("CustId").toString())) {
							subReturnMap.put("RESULT_CODE", "-1");
							subReturnMap.put("RESULT_INFO", "Service number and customer code corresponding to the error");
							returnMap.put("returnObj", subReturnMap);
							return returnMap;
						}
					}
					if (!isEmpty(map.get("Password")))// 调用个人提供的接口
					{
						// modify by caiyu 20121025 按照唐小禹提供的新接口进行修改
						Map map2 = getCrm2CmFSV().vfyPass4SR(map.get("ServiceNum").toString(), map.get("Password").toString());

						if (map2 != null) {
							if (!(Boolean) map2.get("isSuccess")) {
								subReturnMap.put("RESULT_CODE", "-1");
								subReturnMap.put("RESULT_INFO", "Cryptographic checksum error");
								returnMap.put("returnObj", subReturnMap);
								return returnMap;
							}
						} else {
							subReturnMap.put("RESULT_CODE", "-1");
							subReturnMap.put("RESULT_INFO", "Cryptographic checksum error");
							returnMap.put("returnObj", subReturnMap);
							return returnMap;
						}

						// Map verify =
						// getCrm2CmFSV().verifyUserPassword(map.get("ServiceNum").toString(),
						// map.get("Password").toString());
						// if (!"0".equals(verify.get("_nRetFlag"))) {
						// subReturnMap.put("RESULT_CODE", "-1");
						// subReturnMap.put("RESULT_INFO", "密码校验错误");
						// returnMap.put("returnObj", subReturnMap);
						// return returnMap;
						// }
					}
					dc.set(ICustomerValue.S_CustType, userBean.getCustType());
					dc.set(ICustomerValue.S_CustId, userBean.getCustId());
				} else if (!isEmpty(map.get("UserId"))) {
					ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByUserId(Long.parseLong(map.get("UserId").toString()));
					if (userBean == null) {
						subReturnMap.put("RESULT_CODE", "1001");
						subReturnMap.put("RESULT_INFO", "Customer information is not present");
						returnMap.put("returnObj", subReturnMap);
						return returnMap;
					}
					if (!isEmpty(map.get("CustId"))) {
						if (userBean.getCustId() != Long.parseLong(map.get("CustId").toString())) {
							subReturnMap.put("RESULT_CODE", "-1");
							subReturnMap.put("RESULT_INFO", "Service number and customer code corresponding to the error");
							returnMap.put("returnObj", subReturnMap);
							return returnMap;
						}
					}
					if (!isEmpty(map.get("Password")))// 调用个人提供的接口
					{
						// modify by caiyu 20121025 按照唐小禹提供的新接口进行修改
						Map map2 = getCrm2CmFSV().vfyPass4SR(userBean.getBillId(), map.get("Password").toString());

						if (map2 != null) {
							if (!(Boolean) map2.get("isSuccess")) {
								subReturnMap.put("RESULT_CODE", "-1");
								subReturnMap.put("RESULT_INFO", "Cryptographic checksum error");
								returnMap.put("returnObj", subReturnMap);
								return returnMap;
							}
						} else {
							subReturnMap.put("RESULT_CODE", "-1");
							subReturnMap.put("RESULT_INFO", "Cryptographic checksum error");
							returnMap.put("returnObj", subReturnMap);
							return returnMap;
						}

						// Map verify =
						// getCrm2CmFSV().verifyUserPassword(userBean.getBillId(),
						// map.get("Password").toString());
						// if (!"0".equals(verify.get("_nRetFlag"))) {
						// subReturnMap.put("RESULT_CODE", "-1");
						// subReturnMap.put("RESULT_INFO", "密码校验错误");
						// returnMap.put("returnObj", subReturnMap);
						// return returnMap;
						// }
					}
					dc.set(ICustomerValue.S_CustType, userBean.getCustType());
					dc.set(ICustomerValue.S_CustId, userBean.getCustId());
				} else if (!isEmpty(map.get("CustId"))) {
					dc.set(ICustomerValue.S_CustId, Long.parseLong(map.get("CustId").toString()));
				} else if (!isEmpty(map.get("GroupId"))) {
					dc.set(ICustomerValue.S_CustServiceId, map.get("GroupId").toString());
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				} else {
					subReturnMap.put("RESULT_CODE", "-1");
					subReturnMap.put("RESULT_INFO", "Parameter passing error");
					returnMap.put("returnObj", subReturnMap);
					return returnMap;
				}
				break;
			case 6:
				if (isEmpty(map.get("ServiceNum"))) {
					ExceptionUtil.throwBusinessException("CMS95000053");// CMS95000053
				} else {
					// 根据客户服务号码查询实名制
					ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(map.get("ServiceNum").toString());
					dc.set(ICustomerValue.S_CustId, userBean.getCustId());
				}
				break;
			case 7:
				/**
				 * @Function queryGroupCustByCdn
				 * @Description 查询集团客户信息
				 * 
				 * @param qryType
				 *            1 成员手机号 2 集团名称（只支持右端模糊） 3 集团编号
				 * @param qryValue
				 * @return map key: value GroupCustId 集团编码 CustName 集团名称 CustAddr
				 *         集团地址 CustManagerName 客户经理名称 CustManagerPhone 客户经理电话
				 */
				if (isEmpty(map.get("QryType")) || isEmpty(map.get("QryValue")))
					ExceptionUtil.throwBusinessException("CMS95000054");// CMS95000054
				int qryType = Integer.parseInt(map.get("QryType").toString());
				String qryValue = map.get("QryValue").toString();
				Map returnObj = CmxServiceFactory.getCmxCustomerSV().queryGroupCustByCdn(qryType, qryValue);

				returnMap.put("returnObj", returnObj);
				return returnMap;
			case 8:
				if (isEmpty(map.get("CustName")))
					ExceptionUtil.throwBusinessException("CMS95000055");// CMS95000055
				dc.set(ICustomerValue.S_CustName, map.get("CustName").toString());
				if (isEmpty(map.get("CustType")))
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				else
					dc.set(ICustomerValue.S_CustType, Integer.parseInt(map.get("CustType").toString()));
				dc.set("MATCH_TYPE", "2");
				break;
			case 9:
				if (isEmpty(map.get("CustServiceId")))
					ExceptionUtil.throwBusinessException("CMS95000056");// CMS95000056
				dc.set(ICustomerValue.S_CustServiceId, map.get("CustServiceId").toString());
				if (isEmpty(map.get("CustType")))
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				else
					dc.set(ICustomerValue.S_CustType, Integer.parseInt(map.get("CustType").toString()));
				break;
			case 10:
				if (isEmpty(map.get("EcCode")))
					ExceptionUtil.throwBusinessException("CMS95000057");// CMS95000057
				dc.set(ICustomerValue.S_EcCode, map.get("EcCode").toString());
				if (isEmpty(map.get("CustType")))
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				else
					dc.set(ICustomerValue.S_CustType, Integer.parseInt(map.get("CustType").toString()));
				dc.set(ICustomerValue.S_State, CmConstants.RecordState.USE);
				break;

			case 11:
				Map inputMap = (Map) map.get("inputMap");
				String type = inputMap.get("querytype").toString();
				if (isEmpty(type) || type.length() < 8)
					ExceptionUtil.throwBusinessException("CMS95000058");// CMS95000058

				if (isEmpty(inputMap.get("BgnIndex")) || isEmpty(inputMap.get("EndIndex")))
					ExceptionUtil.throwBusinessException("CMS95000059");// CMS95000059

				startNum = Integer.parseInt(inputMap.get("BgnIndex").toString());
				endNum = Integer.parseInt(inputMap.get("EndIndex").toString());

				StringBuilder querySql = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(QBOCmGroupCustomerBean.class).getMapingEnty());

				if (log.isDebugEnabled()) {
					log.debug("\n\nquerySql:" + querySql.toString() + "\n\n");
				}

				StringBuilder conditionSql = new StringBuilder("");
				Map queryParameter = new HashMap();

				conditionSql.append("and " + ICustomerValue.S_State + " = :state ");
				queryParameter.put("state", CmConstants.RecordState.USE);

				if (type.substring(0, 1).equals("1") && inputMap.containsKey("BillId")) {
					conditionSql
							.append("and exists(select 1 from cm_group_contact a where a.bill_id = :BillId and a.state = :groupContactState and a.expire_date > now() and a.cont_type = :contType and a.cust_id = t.cust_id) ");
					queryParameter.put("BillId", inputMap.get("BillId").toString());
					queryParameter.put("groupContactState", CmConstants.RecordState.USE);
					queryParameter.put("contType", CmLnConstants.GroupContType.GROUP_CONTACT);
				}

				if (type.substring(1, 2).equals("1") && inputMap.containsKey("GroupName")) {
					conditionSql.append("and " + ICustomerValue.S_CustName + " like :GroupName ");

					if (inputMap.containsKey("QueryMode") && "1".equals(inputMap.get("QueryMode").toString()))
						queryParameter.put("GroupName", inputMap.get("GroupName").toString() + "%");
					else
						queryParameter.put("GroupName", inputMap.get("GroupName").toString());
				}

				if (type.substring(2, 3).equals("1") && inputMap.containsKey("GroupId")) {
					conditionSql.append("and " + ICustomerValue.S_CustServiceId + " = :GroupId ");
					queryParameter.put("GroupId", inputMap.get("GroupId").toString());
				}

				if (type.substring(3, 4).equals("1") && inputMap.containsKey("ManagerId")) {
					conditionSql
							.append("and exists(select 1 from cm_group_manager b where b.manager_id = :ManagerId and b.state = :groupManagerState and b.expire_date > now() and b.cust_id = t.cust_id) ");
					queryParameter.put("groupManagerState", CmConstants.RecordState.USE);
					queryParameter.put("ManagerId", Long.parseLong(inputMap.get("ManagerId").toString()));
				}

				if (type.substring(4, 5).equals("1") && inputMap.containsKey("Address")) {
					conditionSql.append("and " + ICustomerValue.S_CustAddress + " = :Address ");
					queryParameter.put("Address", inputMap.get("Address").toString());
				}

				if (type.substring(5, 6).equals("1") && inputMap.containsKey("GroupStatus")) {
					conditionSql.append("and " + ICustomerValue.S_CustStatus + " = :GroupStatus ");
					queryParameter.put("GroupStatus", inputMap.get("GroupStatus").toString());
				}

				if (type.substring(6, 7).equals("1") && inputMap.containsKey("GroupLevel")) {
					conditionSql.append("and " + ICustomerValue.S_CustServiceLevel + " = :GroupLevel ");
					queryParameter.put("GroupLevel", inputMap.get("GroupLevel").toString());
				}

				if (type.substring(7, 8).equals("1") && inputMap.containsKey("GroupType")) {
					conditionSql.append("and " + ICustomerValue.S_GroupType + " = :GroupType ");
					queryParameter.put("GroupType", inputMap.get("GroupType").toString());
				}

				if (inputMap.containsKey("RegionCode") && !"NULL".equalsIgnoreCase(inputMap.get("RegionCode").toString())) {
					conditionSql.append("and " + ICustomerValue.S_RegionId + " = :RegionCode ");
					queryParameter.put("RegionCode", inputMap.get("RegionCode").toString());
				}

				if (inputMap.containsKey("CountyCode") && !"NULL".equalsIgnoreCase(inputMap.get("CountyCode").toString())) {
					conditionSql.append("and " + ICustomerValue.S_CountyId + " = :CountyCode ");
					queryParameter.put("CountyCode", inputMap.get("CountyCode").toString());
				}

				DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupCustomerBean.class,
						CmLnCommonUtil.getQueryResult(querySql.toString(), conditionSql.toString(), startNum, endNum, queryParameter), queryParameter);

				Map subReturnMap11 = new HashMap();
				subReturnMap11.put("RESULT_CODE", "0");
				subReturnMap11.put("RESULT_INFO", "Customer information query success");
				subReturnMap11.put("Count", "0");

				if (startNum == 1)// 为1时,需要返回总数.
				{
					DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
							CmLnCommonUtil.getQueryCount(querySql.toString(), conditionSql.toString(), queryParameter), queryParameter);
					subReturnMap11.put("Count", counts[0].getAsInt("CNT"));
				}

				if (values != null && values.length > 0) {
					ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
					List returnList = new ArrayList();
					ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
					DataContainer queryContactDC = new DataContainer();
					for (DataContainerInterface value : values) {
						Map mgrMap = CmFSVUtil.value2Map(value, false);
						returnList.add(mgrMap);

						// 查询主要联系人信息
						queryContactDC.set(IContactValue.S_CustId, value.getAsLong("CUST_ID"));
						queryContactDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
						queryContactDC.set(IContactValue.S_PrioryLevel, CmLnConstants.GroupContType.GROUP_CONTACT_FIRST);
						IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryContactDC, min, max);
						if (contacts != null && contacts.length > 0) {
							mgrMap.put("MainContactName", contacts[0].getContName());
							mgrMap.put("MainContactPhone", contacts[0].getBillId());
						}
						queryContactDC.clear();

						// 查询客户经理信息
						IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(value.getAsLong("CUST_ID"));
						if (gMgrRel == null)
							continue;
						IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
						if (CmCommonUtil.isNotEmptyObject(secStaff)) {
							mgrMap.put("ManagerId", gMgrRel.getManagerId());
							mgrMap.put("ManagerName", secStaff.getManagername());
							mgrMap.put("ManagerPhone", secStaff.getBillid());
						}
					}
					subReturnMap11.put("GroupBaseInfo", returnList);
				}

				returnMap.put("returnObj", subReturnMap11);

				return returnMap;
			case 12:
				if (isEmpty(map.get("GroupId")) && isEmpty(map.get("CustId")))
					ExceptionUtil.throwBusinessException("CMS95000060");// CMS95000060

				if (!isEmpty(map.get("GroupId"))) {
					dc.set(ICustomerValue.S_CustServiceId, map.get("GroupId").toString());
					dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				} else
					dc.set(ICustomerValue.S_CustId, Long.parseLong(map.get("CustId").toString()));

				break;
			default:
				ExceptionUtil.throwBusinessException("CMS95000061");// CMS95000061
				break;
		}

		if (endNum > 0)
			customerValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, startNum, endNum);
		else
			customerValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);

		switch (queryType) {
			case 1:// custId
				if (customerValue != null && customerValue.length > 0)
					returnMap.put("returnObj", customerValue[0]);
				break;
			case 2:
				if (customerValue != null && customerValue.length > 0)
					returnMap.put("returnObj", customerValue[0]);
				break;
			case 3:// 证件号码及证件类型查询
				returnMap.put("returnObj", customerValue);
				break;
			case 4:// 实名制校验
				if (customerValue != null && customerValue.length > 0) {
					if (CmConstants.realNameFlag.NOT_REAL_NAME != customerValue[0].getRealNameFlag())
						returnMap.put("returnObj", true);
					else
						returnMap.put("returnObj", false);
				} else
					returnMap.put("returnObj", false);
				break;
			case 5:
				Map subReturnMap = new HashMap();
				subReturnMap.put("RESULT_CODE", "0");
				subReturnMap.put("RESULT_INFO", "Customer information query success");
				if (customerValue != null && customerValue.length > 0) {
					Map custMap = new HashMap();
					custMap = CmFSVUtil.value2Map(customerValue[0], false);
					subReturnMap.put("CustomerMap", custMap);

					// // 查询主要联系人
					// DataContainer contDc = new DataContainer();
					// contDc.set(IContactValue.S_CustId,
					// customerValue[0].getCustId());
					// contDc.set(IContactValue.S_PrioryLevel,
					// Integer.valueOf(CmConstants.CONT_LEVEL.CONT_LEVEL_1));
					// IContactValue[] contactValues =
					// CmServiceFactory.getContactSV().queryCustContacts(contDc, -1,
					// -1);
					// if (CmCommonUtil.isNotEmptyObject(contactValues)) {
					// custMap.put("Mail", contactValues[0].getContEmail());
					// custMap.put("Contactor", contactValues[0].getContName());
					// custMap.put("ContactPhone",
					// contactValues[0].getContMobile());
					// custMap.put("CampanyAddr",
					// contactValues[0].getContAddress());
					// custMap.put("CampanyPhone", contactValues[0].getOfficeTel());
					// custMap.put("Fax", contactValues[0].getContFax());
					// }
				}
				returnMap.put("returnObj", subReturnMap);
				break;
			case 6:
				if (customerValue != null && customerValue.length > 0) {
					if (CmConstants.realNameFlag.NOT_REAL_NAME != customerValue[0].getRealNameFlag())
						returnMap.put("returnObj", true);
					else
						returnMap.put("returnObj", false);
				} else
					returnMap.put("returnObj", false);
				break;
			case 8:
				if (customerValue != null && customerValue.length > 0)
					returnMap.put("returnObj", customerValue);
				break;
			case 9:
				if (customerValue != null && customerValue.length > 0)
					contractValue = (IBOCmGroupContactQryValue[]) CmServiceFactory.getLnContactSV().queryGroupContactByCustId(customerValue[0].getCustId());
				returnMap.put("returnObj", contractValue);
				break;
			case 10:
				if (customerValue != null && customerValue.length > 0)
					returnMap.put("returnObj", customerValue[0]);
				break;
			case 12:
				Map subReturnMap12 = new HashMap();
				subReturnMap12.put("RESULT_CODE", "0");
				subReturnMap12.put("RESULT_INFO", "Customer information query success");
				subReturnMap12.put("Count", "0");
				if (customerValue != null && customerValue.length > 0) {
					subReturnMap12.put("Count", String.valueOf(customerValue.length));
					ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
					DataContainer queryContactDC = new DataContainer();
					ICustomerValue value = customerValue[0];

					// 得到扩展信息
					BOLnCmxGroupCustBean bean = new BOLnCmxGroupCustBean();
					bean.setCustId(value.getCustId());
					DataContainerInterface dci = CmInnerServiceFactory.getCommonInnerSV().getBean(bean);

					Map baseInfo = CmFSVUtil.value2Map(value, false);

					if (dci != null)
						baseInfo.putAll(CmFSVUtil.value2Map(dci, false));

					// 查询主要联系人信息
					queryContactDC.set(IContactValue.S_CustId, value.getCustId());
					queryContactDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
					queryContactDC.set(IContactValue.S_PrioryLevel, CmLnConstants.GroupContType.GROUP_CONTACT_FIRST);
					IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryContactDC, min, max);
					if (contacts != null && contacts.length > 0) {
						baseInfo.put("MainContactName", contacts[0].getContName());
						baseInfo.put("MainContactPhone", contacts[0].getBillId());
					}
					queryContactDC.clear();

					// 查询客户经理信息
					IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(value.getCustId());
					if (gMgrRel != null) {
						ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
						// modify by caiyu 2012-11-13 补充orgid和opid
						IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
						if (CmCommonUtil.isNotEmptyObject(secStaff)) {
							baseInfo.put("ManagerId", secStaff.getManagerid());
							baseInfo.put("ManagerName", secStaff.getManagername());
							baseInfo.put("ManagerPhone", secStaff.getBillid());
							Map Linkmaninfo = new HashMap();
							Linkmaninfo.put("ManagerId", secStaff.getManagerid());
							Linkmaninfo.put("ManagerName", secStaff.getManagername());
							Linkmaninfo.put("PhoneNum", secStaff.getBillid());
							Linkmaninfo.put("OrgId", secStaff.getDeptid());
							Linkmaninfo.put("OpId", secStaff.getManagerid());
							Linkmaninfo.put("Email", secStaff.getEmail());
							Linkmaninfo.put("Gender", secStaff.getSex());
							subReturnMap12.put("Linkmaninfo", Linkmaninfo);
						}
					}

					subReturnMap12.put("Baseinfo", baseInfo);
				}
				returnMap.put("returnObj", subReturnMap12);
				break;
			default:
				break;
		}

		return returnMap;
	}

	private ICrmFSV getCrm2CmFSV() {
		return (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
	}

	private ICmAccountSV getAccountSV() {
		return (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
	}

	private ICmGroupContractSV getgroupContractSV() {
		return (ICmGroupContractSV) ServiceFactory.getService(ICmGroupContractSV.class);
	}

	private ICmGroupCustomerSV getgroupInfoSV() {
		return (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
	}

	private ICmContactSV getpartyContactInfoSV() {
		return (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
	}

	private Boolean isEmpty(Object obj) {
		if (obj == null || "".equals(obj.toString()))
			return true;
		return false;
	}

	private final static int min = 1;
	private final static int max = 100;

	// 集团详细信息查询
	public Map queryGroupCustValue(Map parameter) throws Exception {
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);

		if (isEmpty(parameter.get("QueryType")))
			ExceptionUtil.throwBusinessException("CMS0000210");

		int queryType = Integer.parseInt(parameter.get("QueryType").toString());

		long custId = -1L;

		switch (queryType) {
			case 1:
				if (isEmpty(parameter.get("CustId")))
					ExceptionUtil.throwBusinessException("CMS0000209");

				custId = Long.parseLong(parameter.get("CustId").toString());
				break;

			case 2:
				if (isEmpty(parameter.get("CustId")))
					ExceptionUtil.throwBusinessException("CMS0000209");

				custId = Long.parseLong(parameter.get("CustId").toString());
				break;

			case 5:
				if (isEmpty(parameter.get("contractId")))
					ExceptionUtil.throwBusinessException("CMS0000205");
				else {
					IBOCmGroupContractValue contractInfo = getgroupContractSV().queryGroupContractById(Long.valueOf(parameter.get("contractId").toString()));

					if (null == contractInfo)
						ExceptionUtil.throwBusinessException("CMS95000047");
					else
						custId = contractInfo.getCustId();
				}

				break;

			case 6:
				if (isEmpty(parameter.get("GroupCustId")))
					ExceptionUtil.throwBusinessException("CMS0000204");
				else
					custId = Long.parseLong(parameter.get("GroupCustId").toString());

				break;

			case 7:
				if (isEmpty(parameter.get("GroupCustId")))
					ExceptionUtil.throwBusinessException("CMS0000204");
				else
					custId = Long.parseLong(parameter.get("GroupCustId").toString());

				break;

			default:
				ExceptionUtil.throwBusinessException("CMS95000062");// CMS95000062
				break;
		}

		com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue cmGroupValue = cnGroupSv.queryGroupCustInfoByCustId(custId);
		Map returnObj = new HashMap();
		switch (queryType) {
			case 1:
				if (cmGroupValue == null)
					ExceptionUtil.throwBusinessException("CMS0000202");

				else {
					IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(custId);
					ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
					IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					if (null == secStaff)
						ExceptionUtil.throwBusinessException("CMS0000214");

					Map mgrMap = new HashMap();
					mgrMap.put("MANAGER_ID", secStaff.getManagerid());
					mgrMap.put("MANAGER_NAME", secStaff.getManagername());
					mgrMap.put("BILL_ID", secStaff.getBillid());

					returnObj.put("Linkmaninfo", mgrMap);

					Map groupMap = new HashMap();
					groupMap.put("CUST_SERVICE_ID", cmGroupValue.getCustServiceId());
					groupMap.put("CUST_NAME", cmGroupValue.getCustName());//
					groupMap.put("CUST_ADDRESS", cmGroupValue.getCustAddress());
					groupMap.put("CUST_ZIPCODE", cmGroupValue.getCustZipcode());
					groupMap.put("HQ_NUMBER", cmGroupValue.getHqNumber());// 联系电话
					groupMap.put("GROUP_FAX", cmGroupValue.getGroupFax());
					groupMap.put("CREATE_DATE", cmGroupValue.getCreateDate());
					groupMap.put("GROUP_WEB", cmGroupValue.getGroupWeb());
					groupMap.put("CUST_CERT_TYPE", cmGroupValue.getCustCertType());
					groupMap.put("CUST_CERT_CODE", cmGroupValue.getCustCertCode());
					groupMap.put("CUST_STATUS", cmGroupValue.getCustStatus());
					groupMap.put("LEGAL_CUST_NAME", cmGroupValue.getLegalCustName());
					groupMap.put("PROVINCE_ID", cmGroupValue.getProvinceId());
					groupMap.put("CITY_ID", cmGroupValue.getCityId());
					groupMap.put("REGION_ID", cmGroupValue.getRegionId());
					returnObj.put("Baseinfo", groupMap);

					returnMap.put("returnObj", returnObj);
				}

				break;
			case 2:
				if (cmGroupValue == null)
					ExceptionUtil.throwBusinessException("CMS0000202");

				else {
					// 注意：queryGroupCustMgrRel只查询了集团的主客户经理，modify by caiyu
					IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(custId);

					if (gMgrRel == null)
						ExceptionUtil.throwBusinessException("CMS0000203");
					else {
						Map mgrMap = new HashMap();
						ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
						IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
						if (CmCommonUtil.isNotEmptyObject(secStaff)) {
							mgrMap.put("MANAGER_NAME", secStaff.getManagername());
							mgrMap.put("BILL_ID", secStaff.getBillid());
							// mgrMap.put("OP_ID",
							// Long.valueOf(secStaff.getStaffId()));
							// modify by caiyu 2012-11-13
							mgrMap.put("OP_ID", secStaff.getManagerid());
							mgrMap.put("ORG_ID", Long.valueOf(secStaff.getDeptid()));
						}
						returnObj.put("Linkmaninfo", mgrMap);

						returnMap.put("returnObj", returnObj);
					}
				}
				break;

			case 5:
				if (cmGroupValue == null)
					ExceptionUtil.throwBusinessException("CMS0000202");
				else {
					if (cmGroupValue != null) {
						ICustomerValue custBean = new CustomerBean();
						custBean.copy(cmGroupValue);
						returnMap.put("returnObj", custBean);
					}
				}
				break;

			case 6:
				if (cmGroupValue == null)
					ExceptionUtil.throwBusinessException("CMS0000201");
				else {
					DataContainer queryDC = new DataContainer();
					queryDC.set(IContactValue.S_CustId, custId);
					queryDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
					queryDC.set(IContactValue.S_PrioryLevel, CmLnConstants.GroupContType.GROUP_CONTACT_FIRST);
					IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryDC, min, max);
					if (contacts != null && contacts.length > 0)
						returnMap.put("returnObj", contacts[0]);
				}

				break;
			case 7:
				if (cmGroupValue == null)
					ExceptionUtil.throwBusinessException("CMS0000201");
				else {
					DataContainer queryDC = new DataContainer();
					queryDC.set(IContactValue.S_CustId, custId);
					queryDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
					IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryDC, min, max);

					returnMap.put("returnObj", contacts);
				}

				break;
			default:
				break;
		}

		return returnMap;

	}

	public Map queryCreditByServiceNum(Map map) throws Exception {
		Map resultMap = new HashMap();// 定义返回的Map
		Map returnMap = new HashMap();// 定义返回的Map

		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ICrmFSV fsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		if (isEmpty(map.get("OperType")))
			ExceptionUtil.throwBusinessException("CMS0000198");

		int queryType = Integer.parseInt(map.get("OperType").toString());

		int QType = Integer.parseInt(map.get("queryType").toString());
		IInsUserValue insUser = null;
		IBOCmUserSpeuserMainValue[] userSpValue = null;
		switch (queryType) {
			case 1:

				if (!isEmpty(map.get("userId"))) {
					insUser = fsv.getInsUser(Long.valueOf(map.get("userId").toString()), null);
					if (null == insUser) {
						ExceptionUtil.throwBusinessException("CMS0000197");
					} else {
						userSpValue = cnGroupSv.queryCreditByServiceNum(insUser.getBillId(), QType);
					}

				}
				if (!isEmpty(map.get("ServiceNum"))) {
					userSpValue = cnGroupSv.queryCreditByServiceNum(map.get("ServiceNum").toString(), QType);
				}
				if (userSpValue != null) {
					resultMap.put("is_reg", "1");
					resultMap.put("credit_class", userSpValue[0].getCreditLevel());
					IBOBsStaticDataValue DS = com.ai.common.util.StaticDataUtil.getStaticData("CM_CREDIT_LEVEL", userSpValue[0].getCreditLevel() + "");
					String creditName = "";
					if (DS != null) {
						creditName = DS.getCodeName();
					}
					resultMap.put("credit_name", creditName);
				} else {
					resultMap.put("is_reg", "0");
				}
				break;
			default:
				ExceptionUtil.throwBusinessException("CMS95000063");// CMS95000063
				break;

		}
		returnMap.put("returnObj", resultMap);
		return returnMap;
	}

	public Map queryBankAcctPaymentInfo(Map map) throws Exception {
		Map result = new HashMap();
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Operation ok");

		DataContainer dc = new DataContainer();

		if (!isEmpty(map.get("AcctId"))) {
			dc.set(IAccountProfileValue.S_AcctId, Long.parseLong(map.get("AcctId").toString()));
		}

		// 得到账户信息
		IAccountProfileValue[] accountValue = CmServiceFactory.getAccountSV().queryAccountProfiles(dc, min, max);
		if (accountValue == null || accountValue.length <= 0) {
			returnMap.put("returnCode", "-1");
			returnMap.put("OnceFee", 0);
			returnMap.put("returnMsg", "Account information does not exist");
			result.put("returnObj", returnMap);
			return result;
		}

		// 1 查询
		if ("1".equals(map.get("QueryType"))) {
			IAcctPaymentValue paymentValue = CmServiceFactory.getAccountSV().queryCurrAcctPaymentsByAcctId(accountValue[0].getAcctId());

			if (accountValue == null || accountValue.length <= 0) {

				returnMap.put("returnCode", "-1");
				returnMap.put("OnceFee", 0);
				returnMap.put("returnMsg", "Account information is not present payment scheme");
				result.put("returnObj", returnMap);
				return result;
			}
			if (paymentValue.getPayMethod() != 26) {
				returnMap.put("returnCode", "-1");
				returnMap.put("OnceFee", 0);
				returnMap.put("returnMsg", "Withholding payment is not a bank account");
				result.put("returnObj", returnMap);
				return result;
			}

			IBOCmCmxAcctPaymentAttrValue paymentAttr = CmServiceFactory.getAccountSV().queryCmxAcctPaymentAttrById(paymentValue.getPaymentId(), CmLnConstants.PaymentAttr.OnceFee);
			if (CmCommonUtil.isNotEmptyObject(paymentAttr)) {
				returnMap.put("OnceFee", paymentAttr.getAttrValue());
			}

		} else {
			returnMap.put("returnCode", "-1");
			returnMap.put("OnceFee", 0);
			returnMap.put("returnMsg", "This account is not set Debit amount");
		}

		result.put("returnObj", returnMap);
		return result;
	}

	public Map userReceipt(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "The user back to a single success");

		// 客户信息删除标记
		boolean custDelFlag1 = false;
		boolean custDelFlag2 = false;
		// 帐户信息删除标记
		boolean acctDelFlag1 = false;
		boolean acctDelFlag2 = false;

		long custId = Long.parseLong(parameter.get("CustId").toString());
		long userId = Long.parseLong(parameter.get("UserId").toString());
		long acctId = Long.parseLong(parameter.get("AcctId").toString());

		if (custId <= 0 || userId <= 0 || acctId <= 0) {
			// custId,acctId,userId3个参数都需要判断非空，3个必须要都要有值
			ExceptionUtil.throwBusinessException("CMS5000134");
		}

		int custType = CmCommonUtil.getCustType(custId);
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人客户,历史表会自动记录

			// 1.根据custId查询cm_ins_cmrel表，
			// 如果没有记录抛异常；
			// 如果该客户下有多个用户，则客户信息不能删除，把custDelFlag1设置为false。
			// 如果只返回1条记录，
			// 如果返回的userId和传入的userId相同，则证明该客户下只有这个用户，客户资料可以删除，把custDelFlag1设置为true；
			// 如果返回的userId和传入的userId不相同，则证明该用户不是这个客户下的，抛异常“userId和custId不匹配！”；
			IBOLnCmInsCmRelValue[] boLnCmInsCmRelValue = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValues(custId, 0L);

			// 增加为null判断
			if (isEmpty(boLnCmInsCmRelValue))
				ExceptionUtil.throwBusinessException("CMS95000112");//

			int count = boLnCmInsCmRelValue.length;
			if (count > 1) {
				custDelFlag1 = false;
			} else if (count == 1) {
				long returnUserID = boLnCmInsCmRelValue[0].getUserId();
				if (returnUserID == userId) {
					// 删除客户资料
					custDelFlag1 = true;
				} else if (returnUserID != userId) {
					ExceptionUtil.throwBusinessException("CMS95000113");
				}
			} else if (count == 0) {
				ExceptionUtil.throwBusinessException("CMS5000134");
			}

			// 2.根据acctId调用营业接口查询用户账户关系，
			// 如果没有记录抛异常
			// 如果返回多余1条记录，则证明帐户给多个用户付费，账户不能删除，设置acctDelFlag1为false。
			// 如果返回1条记录
			// 如果返回的userId和传入的userId相同，则证明帐户只有这个用户的付费关系，帐户可以删除，设置acctDelFlag1为true;
			// 如果返回的userId和传入的userId不相同，则证明该用户不是这个帐户付费，抛异常“userId和acctId不匹配！”;

			// modify by caiyu 20121224 修改调用接口，原来调用了错误的接口
			// IInsAccrelValue[] acctVs = getCrm2CmFSV().getInstAccrel(userId,
			// null);
			IInsAccrelValue[] acctVs = getCrm2CmFSV().getInsAccrelByAcctId(acctId, -1, -1);
			// 增加为null判断
			if (isEmpty(acctVs))
				ExceptionUtil.throwBusinessException("CMS95000114");

			int accCount = acctVs.length;
			if (accCount > 1) {
				acctDelFlag1 = false;
			} else if (accCount == 1) {
				long returnUserId = acctVs[0].getUserId();
				if (returnUserId == userId) {
					acctDelFlag1 = true;
				} else if (returnUserId != userId) {
					ExceptionUtil.throwBusinessException("CMS95000113");
				}
			} else if (accCount == 0) {
				ExceptionUtil.throwBusinessException("CMS5000134");
			}
			// 3.根据custId查询cm_account表
			// 如果只返回1条记录
			// 如果返回的acctId和传入的acctId相同，则证明传入的帐户属于该客户，帐户信息可以删除acctDelFlag2=true，客户信息可以删除custDelFlag2=true；
			// 如果返回的acctId和传入的acctId不相同，则证明传入的帐户不属于该客户，帐户信息不可以删除acctDelFlag2=false，客户信息不可以删除custDelFlag2=false；
			// 如果返回0条记录，则客户信息可以删除custDelFlag2=true，帐户信息不可以删除acctDelFlag2=false；
			// 如果返回多于1条记录，则客户信息不可以删除custDelFlag2=false
			// 循环判断返回的acctId和传入的acctId是否相同
			// 相同，则证明传入的帐户属于该客户，帐户信息可以删除acctDelFlag2=true；且跳出循环；
			// 不相同，则acctDelFlag2=false；
			DataContainer queryDC = new DataContainer();
			queryDC.set(IAccountProfileValue.S_CustId, custId);
			IAccountProfileValue[] accountProfileValue = CmxServiceFactory.getLnAccountSV().queryAccountProfiles(queryDC, min, max);

			// 增加为null判断
			if (isEmpty(accountProfileValue))
				ExceptionUtil.throwBusinessException("CMS95000115");

			int accountProfileCount = accountProfileValue.length;
			if (accountProfileCount == 0) {
				custDelFlag2 = true;
				acctDelFlag2 = false;
			} else if (accountProfileCount == 1) {
				long returnaccountProfileId = accountProfileValue[0].getAcctId();
				if (returnaccountProfileId == acctId) {
					acctDelFlag2 = true;
					custDelFlag2 = true;
				} else if (returnaccountProfileId != acctId) {
					acctDelFlag2 = false;
					custDelFlag2 = false;
				}
			} else if (accountProfileCount > 1) {
				custDelFlag2 = false;
				for (int i = 0; i < accountProfileValue.length; i++) {
					if (accountProfileValue[i].getAcctId() == acctId) {
						acctDelFlag2 = true;
						break;
					} else if (accountProfileValue[i].getAcctId() != acctId) {
						acctDelFlag2 = false;
					}
				}
			}

			// 4.根据userId删除cm_ins_cmrel表中客户用户记录
			BOLnCmInsCmRelBean cmInsCmRelBean = new BOLnCmInsCmRelBean();
			IBOLnCmInsCmRelValue[] cmInsCmRelvalues = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValueByUserId(userId);

			if (cmInsCmRelvalues != null && cmInsCmRelvalues.length > 0) {
				cmInsCmRelBean.copy(cmInsCmRelvalues[0]);
				cmInsCmRelBean.delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { cmInsCmRelBean });
			}

			// 5.如果用户是大客户，则根据userId删除大客户信息
			// 同时删除大客户的客户经理关系表
			IClubMemberValue clubMemberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(userId);
			if (!isEmpty(clubMemberValue)) {
				IClubMemberValue clubMember = new ClubMemberBean();
				clubMember.copy(clubMemberValue);
				clubMember.delete();
				CmServiceFactory.getClubMemberSV().saveClubMember(clubMember);
			}
			IBOLnCmUserManagerValue[] lnCmUserManager = CmxServiceFactory.getLnClubMemberSV().getLnCmUserManager(userId);
			if (lnCmUserManager != null && lnCmUserManager.length > 0) {
				IBOLnCmUserManagerValue[] cmUserManager = new IBOLnCmUserManagerValue[lnCmUserManager.length];
				for (int i = 0; i < lnCmUserManager.length; i++) {
					cmUserManager[i] = new BOLnCmUserManagerBean();
					cmUserManager[i].copy(lnCmUserManager[i]);
					cmUserManager[i].delete();
				}
				CmxServiceFactory.getLnClubMemberSV().saveData((DataContainer[]) cmUserManager);
			}
			// 6.如果用户是集团成员,则根据userId删除集团成员关系表

			IBOCmGroupCustMemUserValue[] cmGroupCustMemUser = ((ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class)).queryGroupCustMemUsersByCustRelId(custId, -1,
					-1);
			if (cmGroupCustMemUser != null && cmGroupCustMemUser.length > 0) {
				IBOCmGroupCustMemUserValue[] values = new IBOCmGroupCustMemUserValue[cmGroupCustMemUser.length];
				for (int i = 0; i < cmGroupCustMemUser.length; i++) {
					values[i] = new BOCmGroupCustMemUserBean();
					values[i].copy(cmGroupCustMemUser[i]);
					values[i].delete();
				}
				((ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class)).saveGroupCustMemUsers(values);
			}
			// 7.根据userId删除个性化账单
			((ICmBillCustomizeSV) ServiceFactory.getService(ICmBillCustomizeSV.class)).delCmBillCustomizeByUserId(userId);

			if (acctDelFlag1 && acctDelFlag2) {
				/*
				 * 8.如果账户需要删除 删除账户和账户附属信息表 删除账期 删除账户联系人关系表
				 * 删除账户支付方案信息和关联的CMX_ACCT_PAYMENT_ATTR（账户支付方案扩展属性表） cm_account
				 * cm_acct_payment cm_acct_bill_cycle
				 */
				IAccountProfileValue profileValue = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(acctId);

				VOAccountBean voaccount = new VOAccountBean();
				IAccountValue accountValue = new AccountBean();
				accountValue.copy(profileValue);
				accountValue.delete();
				voaccount.setAccount(accountValue);// 设置账户

				IAcctPaymentValue paymentValue = new AcctPaymentBean();
				paymentValue.copy(profileValue);
				paymentValue.delete();
				voaccount.setPayment(paymentValue);// 设置账期

				IAcctBillCycleValue[] billCycleValues = CmServiceFactory.getAccountSV().queryAcctBillCyclesByAcctId(acctId);
				if (billCycleValues != null && billCycleValues.length > 0) {
					billCycleValues[0].delete();
					voaccount.setBillCycle(billCycleValues[0]);
				}

				CmServiceFactory.getAccountSV().saveAccount(voaccount);
			}

			if (custDelFlag1 && custDelFlag2) {
				/*
				 * 9.如果客户需要删除 删除客户和扩展表 删除联系人关系
				 * 目前没有客户群，家庭客户这样的需求，和客户群，家庭客户相关的忽略,在代码中写TODO
				 */
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
				ICustomerValue value = new CustomerBean();
				value.copy(customerValue);
				value.delete();
				CmServiceFactory.getCustomerSV().saveCustomer(value);

			}

			returnMap.put("returnObj", true);
		} else if (custType == CmConstants.CustomerType.GROUP) {
			// 集团客户
			// 需要和集团业务明确是否有这样的需求？

		} else if (custType == CmConstants.CustomerType.FAMILY) {
			// 家庭客户

		} else if (custType == CmConstants.CustomerType.VIRTUAL) {
			// 虚拟客户

		}

		return returnMap;
	}

	public Map dredgeCreditEnter(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Opening credit rating success");

		long serviceNum = Long.parseLong(parameter.get("ServiceNum").toString());
		long userId = Long.parseLong(parameter.get("UserId").toString());
		long actType = Long.parseLong(parameter.get("ActType").toString());

		Map subReturnMap = new HashMap();
		IVOCustValue iCustValue = new VOCustBean();
		String retCode = "0";
		String retMsg = CrmLocaleFactory.getResource("CMS8000047");// 操作成功
		if (-1 == userId && -1 == serviceNum) {
			ExceptionUtil.throwBusinessException("CMS8000042");
			// map.put("retCode", "1004");
			// map.put("retMsg", CrmLocaleFactory.getResource("CMS8000042"));
			// return map;
		}
		IBOUserInfoValue userValueSv = null;
		ICmTeamInvokeSV cmTeamInvok = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		if (serviceNum != -1) {
			userValueSv = cmTeamInvok.queryUserInfoByBillId(String.valueOf(serviceNum));
		} else if (userId != -1) {
			ISoUserValue soUservalue = cmTeamInvok.getSoUserByUserId(userId);
			userValueSv = cmTeamInvok.queryUserInfoByBillId(soUservalue.getBillId());
		}
		if (null == userValueSv) {
			ExceptionUtil.throwBusinessException("CMS8000043");
			// 用户信息不存在
			// map.put("retCode", "1001");
			// map.put("retMsg", CrmLocaleFactory.getResource("CMS8000043"));
			// return map;
		}

		ICmLnIndivSV cmLnIndiv = (ICmLnIndivSV) ServiceFactory.getService(ICmLnIndivSV.class);
		IBOCmUserSpeuserMainValue[] iboCmUserSpeMainValue = cmLnIndiv.queryCmUserSpeuserMainByMobile(-1, Long.valueOf(userValueSv.getBillId()));
		if (actType == CmLnConstants.DredgeCredirEnter.ACT_TYPE_OPEN) {// 开通
			// 1、判断信用表中是否存在此记录 根据手机号码或者用户编号查询客户等级信息
			if (iboCmUserSpeMainValue.length > 0) {
				iboCmUserSpeMainValue[0].delete();
				iCustValue.setUserObject(CmLnConstants.MainMeth.CM_USER_SPEUSERMAIN, iboCmUserSpeMainValue); // 信用度等级设置
				// cmLnIndiv.saveCmUserSpeuserMainValue(iboCmUserSpeMainValue);
			} else {
				ExceptionUtil.throwBusinessException("CMS8000045");
				// retCode="1002";
				// retMsg=CrmLocaleFactory.getResource("CMS8000045"); //已开通,无需办理
			}
		} else if (actType == CmLnConstants.DredgeCredirEnter.ACT_TYPE_CLOSE) {// 取消
			// 1、判断信用表中是否存在此记录 根据手机号码或者用户编号查询客户等级信息
			if (null == iboCmUserSpeMainValue || iboCmUserSpeMainValue.length <= 0) {
				IBOCmUserSpeuserMainValue[] cmUservalue = new IBOCmUserSpeuserMainValue[1];
				IBOCmUserSpeuserMainValue cmUserSpeuserMainValue = new BOCmUserSpeuserMainBean();
				cmUserSpeuserMainValue.setSpeuserId(CmCommonUtil.getNewSequence(BOCmUserSpeuserMainBean.class));
				cmUserSpeuserMainValue.setPhoneId(Long.valueOf(userValueSv.getBillId()));// 手机号码
				cmUserSpeuserMainValue.setAcctId(userValueSv.getAcctId()); // 需要查询账户信息接口
				cmUserSpeuserMainValue.setCreditLevel(0);// 用户等级
				cmUserSpeuserMainValue.setState(CmLnConstants.GroupManagerState.State_U);
				cmUserSpeuserMainValue.setRegionId(userValueSv.getRegionId());
				cmUserSpeuserMainValue.setOpId(ServiceManager.getUser().getID());
				cmUserSpeuserMainValue.setOrgId(ServiceManager.getUser().getOrgId());
				cmUserSpeuserMainValue.setCreateDate(CmLnCommonUtil.getSysDateTime());
				cmUserSpeuserMainValue.setDoneDate(CmLnCommonUtil.getSysDateTime());
				cmUservalue[0] = cmUserSpeuserMainValue;

				// 根据客户编号查询 个人客户信息 更改用户信用度为0
				ICmCustomerSV custLn = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue customerValue = custLn.queryCustomerByCustId(userValueSv.getCustId());
				if (null == customerValue) {
					ExceptionUtil.throwBusinessException("CMS8000043");
					// retCode="1004";
					// retMsg=CrmLocaleFactory.getResource("CMS8000043");//客户信息不存在
				}
				// 根据账户编号查询账户信息
				ICmAccountSV cmAccount = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
				IAccountValue accountValue = cmAccount.queryAccountById(userValueSv.getAcctId());
				if (null == accountValue) {
					ExceptionUtil.throwBusinessException("CMS8000050");
					// retCode="1004";
					// retMsg=CrmLocaleFactory.getResource("CMS8000050");//账户信息不存在
				}
				// 账户信息
				if (CmCommonUtil.isNotEmptyObject(accountValue)) {
					accountValue.setStsToOld();
					accountValue.setCreditValue(0);
					IVOAccountValue ivoAccount = new VOAccountBean();
					ivoAccount.setAccount(accountValue);
					iCustValue.addAccount(ivoAccount);
				}
				ICustomerValue iCustomerValue = new CustomerBean();
				if (CmCommonUtil.isNotEmptyObject(customerValue)) {
					customerValue.setCreditValue(0);
					customerValue.setStsToOld();
					iCustomerValue.copy(customerValue);
					iCustValue.setCustomer(iCustomerValue); // 用户对象
					iCustValue.setUserObject(CmLnConstants.MainMeth.CM_USER_SPEUSERMAIN, cmUservalue); // 信用度等级设置
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS8000046");
				// retCode="1003";
				// retMsg=CrmLocaleFactory.getResource("CMS8000046"); //已经存在无需取消
			}
		} else {
			ExceptionUtil.throwBusinessException("CMS8000041");
			// retCode="1004";
			// retMsg=CrmLocaleFactory.getResource("CMS8000041"); //操作类型不匹配
		}
		try {
			CmServiceFactory.getCustomerSV().saveCustomer(iCustValue);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e);
			}
			ExceptionUtil.throwBusinessException(e.getMessage());
		}
		subReturnMap.put("retCode", retCode);
		subReturnMap.put("retMsg", retMsg);

		returnMap.put("returnObj", subReturnMap);

		return returnMap;
	}

	public Map queryCreditLevelByAcctId(Map parameter) throws Exception {

		Map returnMap = new HashMap();// 返回Map
		Map infoMap;

		// 查询条件
		Object operType = parameter.get("OperType");// operType 可以为query check

		Object acctId = parameter.get("AcctId");// 账户编号

		if (isEmpty(operType))
			ExceptionUtil.throwBusinessException("CMS95000063");// CMS95000063

		if ((isEmpty(acctId)))
			ExceptionUtil.throwBusinessException("CMS95000064");// CMS95000064

		// 设置查询条件
		DataContainer conditionDC = new DataContainer();
		if (!isEmpty(acctId) && StringUtils.isNotBlank(acctId.toString()))
			conditionDC.set(IBOCmUserCreditLevelValue.S_AcctId, Long.parseLong(acctId.toString()));

		conditionDC.set(IBOCmUserCreditLevelValue.S_State, CmConstants.RecordState.USE);

		// 查询
		IBOCmUserCreditLevelValue[] resultValues = CmServiceFactory.getUserSpenUserMainSV().queryCreditLevelByAcctId(conditionDC, min, max);
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query success");

		if ("query".equalsIgnoreCase(operType.toString())) {
			List resultList = new ArrayList();
			if (resultValues != null)
				for (int i = 0; i < resultValues.length; i++) {
					// 将value转换为Map
					infoMap = CmFSVUtil.value2Map(resultValues[i]);
					resultList.add(infoMap);
				}

			returnMap.put("returnObj", resultList);
		} else if ("check".equalsIgnoreCase(operType.toString())) {
			if (CmCommonUtil.isNotEmptyObject(resultValues))
				returnMap.put("returnObj", true);
			else
				returnMap.put("returnObj", false);
		}

		return returnMap;
	}

	private IInsAccrelValue[] getInstAccrel(long userId, String billId) throws Exception, RemoteException {
		IBusiQrySV sv = (IBusiQrySV) ServiceFactory.getService(IBusiQrySV.class);
		IInstanceQrySV instanceQrySV = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		IInsUserValue userValue = sv.getInsUser(userId, billId);
		if (userValue != null) {
			return instanceQrySV.getInstAccrelByUserId(userValue.getUserId(), 1);
		}
		return null;
	}

	public Map modifySpecialCustomer(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty(parameter.get("OperType")))
			ExceptionUtil.throwBusinessException("CMS95000003");

		String operType = parameter.get("OperType").toString();
		BOCmSpecialListBean bean = new BOCmSpecialListBean();
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");

		if ("new".equals(operType)) {
			// 查询
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ISpecialListValue.S_MonType, CmConstants.CustSpecialListType.BLACK_LIST);// 默认查询黑名单
			if (!isEmpty(parameter.get("CERT_TYPE")) && StringUtils.isNotBlank(parameter.get("CERT_TYPE").toString()))
				conditionDC.set(ISpecialListValue.S_CertType, Integer.parseInt(parameter.get("CERT_TYPE").toString()));

			if (!isEmpty(parameter.get("CERT_CODE")) && StringUtils.isNotBlank(parameter.get("CERT_CODE").toString()))
				conditionDC.set(ISpecialListValue.S_CertCode, parameter.get("CERT_CODE").toString());

			conditionDC.set(ISpecialListValue.S_State, CmConstants.RecordState.USE);
			ISpecialListValue[] resultValues = CmServiceFactory.getSpecialListSV().querySpecialLists(conditionDC, min, max);
			if (CmCommonUtil.isEmptyObject(resultValues)) {
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(Long.valueOf(parameter.get("CUST_ID").toString()));
				if (CmCommonUtil.isNotEmptyObject(customerValue)) {
					bean.set(BOCmSpecialListBean.S_CustId, Long.valueOf(parameter.get("CUST_ID").toString()));
					bean.set(BOCmSpecialListBean.S_UserId, Long.valueOf(parameter.get("USER_ID").toString()));
					bean.set(BOCmSpecialListBean.S_PartyId, customerValue.get("PARTY_ID"));
					bean.set(BOCmSpecialListBean.S_BillId, parameter.get("BILL_ID").toString());
					bean.set(BOCmSpecialListBean.S_PartyName, parameter.get("PARTY_NAME").toString());
					bean.set(BOCmSpecialListBean.S_CertType, Integer.valueOf(parameter.get("CERT_TYPE").toString()));
					bean.set(BOCmSpecialListBean.S_CertCode, parameter.get("CERT_CODE").toString());
					bean.set(BOCmSpecialListBean.S_AddReason, parameter.get("ADD_REASON").toString());
					bean.set(BOCmSpecialListBean.S_SpecListId, CmCommonUtil.getNewSequence(BOCmSpecialListBean.class));
					bean.set(BOCmSpecialListBean.S_MonType, CmConstants.CustSpecialListType.BLACK_LIST);
					if (!isEmpty(parameter.get("SubMonType"))) {
						bean.set(BOCmSpecialListBean.S_SubMonType, parameter.get("SubMonType"));
					} else {
						// modify by caiyu 2013-1-7 当接口没有传入监控子类型时,默认插入1 欠费黑名单
						bean.set(BOCmSpecialListBean.S_SubMonType, CmLnConstants.SubMonType.OweSpe);
					}
					bean.set(BOCmSpecialListBean.S_ListSource, 2);
					bean.set(BOCmSpecialListBean.S_State, CmConstants.RecordState.USE);
					if (ServiceManager.getUser() != null) {
						bean.set(BOCmSpecialListBean.S_CreateOpId, ServiceManager.getUser().getID());
						bean.set(BOCmSpecialListBean.S_CreateOrgId, ServiceManager.getUser().getOrgId());
					}
					bean.set(BOCmSpecialListBean.S_CreateDate, CmCommonUtil.getSysDate());
					bean.set(BOCmSpecialListBean.S_DoneDate, CmCommonUtil.getSysDate());
					bean.set(BOCmSpecialListBean.S_EffectiveDate, CmCommonUtil.getSysDate());
					bean.set(BOCmSpecialListBean.S_ExpireDate, CmLnCommonUtil.getMaxDate());
					bean.set(BOCmSpecialListBean.S_RegionId, CenterUtil.getRegionIdByUserId(Long.valueOf(parameter.get("USER_ID").toString())));
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { bean });
				}
			}
			// bean.set(BOCmSpecialListBean.S_RegionId, "240");
			returnMap.put("returnMsg", "New blacklist ok");
		} else if ("delete".equals(operType)) {
			// 设置查询条件
			Object monType = parameter.get("MonType");// 监控类型 0黑名单；1白名单;2红名单
			Object subMonType = parameter.get("SubMonType");// 监控子类型
			Object certType = parameter.get("CustCertType");// 证件类型
			Object certCode = parameter.get("CustCertCode");// 证件号码
			// Object userId = parameter.get("userId");// 用户编号
			DataContainer conditionDC = new DataContainer();
			if (!isEmpty(monType) && StringUtils.isNotBlank(monType.toString()))
				conditionDC.set(ISpecialListValue.S_MonType, Integer.parseInt(monType.toString()));
			else
				conditionDC.set(ISpecialListValue.S_MonType, CmConstants.CustSpecialListType.BLACK_LIST);// 默认查询黑名单

			if (!isEmpty(subMonType) && StringUtils.isNotBlank(subMonType.toString()))
				conditionDC.set(ISpecialListValue.S_SubMonType, Integer.parseInt(subMonType.toString()));

			if (!isEmpty(certType) && StringUtils.isNotBlank(certType.toString()))
				conditionDC.set(ISpecialListValue.S_CertType, Integer.parseInt(certType.toString()));

			if (!isEmpty(certCode) && StringUtils.isNotBlank(certCode.toString()))
				conditionDC.set(ISpecialListValue.S_CertCode, certCode.toString());

			conditionDC.set(ISpecialListValue.S_State, CmConstants.RecordState.USE);

			// 查询
			ISpecialListValue[] resultValues = CmServiceFactory.getSpecialListSV().querySpecialLists(conditionDC, min, max);

			if (resultValues != null && resultValues.length > 0) {
				bean.copy((ISpecialListValue) resultValues[0]);
				bean.delete();
				returnMap.put("returnMsg", "Remove blacklist ok");
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new DataContainer[] { bean });
			}
		}
		returnMap.put("returnObj", "1");
		return returnMap;
	}

	public Map queryAcctPaymentInfos(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query account information ok");
		Map acctUserSnMap = new HashMap();
		// log.debug("map*******="+parameter);
		if (!isEmpty(parameter.get("ServiceNum"))) {
			IInsUserValue insValues = getCrm2CmFSV().getInsUser(0, parameter.get("ServiceNum").toString());
			if (insValues == null) {
				ExceptionUtil.throwBusinessException("CMS0000202");
			}
			IInsAccrelValue[] acctVs = getCrm2CmFSV().getInstAccrel(0, parameter.get("ServiceNum").toString());
			if (acctVs != null && acctVs.length > 0) {
				List acctList = new ArrayList();
				for (int i = 0; i < acctVs.length; i++) {
					Map acctMap = new HashMap();
					long acctId = acctVs[i].getAcctId();
					IAccountProfileValue acctProfile = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(acctId);

					if (acctProfile == null)
						continue;
					acctMap.put("InstallmentFlag", acctProfile.getInstallmentFlag());

					acctMap.put("PayMethod", acctProfile.getPayMethod());
					acctMap.put("AccId", acctProfile.getAcctId());
					acctMap.put("CustId", acctProfile.getCustId());
					acctMap.put("BillDay", acctProfile.getBillDay());
					acctMap.put("BillDueDate", acctProfile.getBillDueDate());
					// modify by caiyu 20121025
					// 应外围接口-电渠要求，增加信用级别的中文翻译CrtLevelName
					long cid = acctProfile.getCustId();
					int custType = CmCommonUtil.getCustType(cid);
					if (custType == CmConstants.CustomerType.INDIVIDUAL) {
						// 个人客户
						// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_CREDIT_LEVEL",
						// String.valueOf(acctProfile.getCreditLevel()));
						// acctMap.put("CrtLevelName", staticDataValue.getCodeName());
					} else if (custType == CmConstants.CustomerType.GROUP) {
						// 集团客户
						// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_GRP_CREDIT_LEVEL",
						// String.valueOf(acctProfile.getCreditLevel()));
						// acctMap.put("CrtLevelName", staticDataValue.getCodeName());
					} else if (custType == CmConstants.CustomerType.FAMILY) {
						// 家庭客户
						// TODO:预留家庭客户翻译
					} else if (custType == CmConstants.CustomerType.VIRTUAL) {
						// 虚拟客户
						// TODO:预留虚拟客户翻译
					}

					acctMap.put("AccType", acctProfile.getAcctType());
					acctMap.put("AccStatus", acctProfile.getAcctStatus());
					acctMap.put("AccName", acctProfile.getAcctName());

					acctMap.put("CreditLevel", acctProfile.getCreditLevel());
					acctMap.put("CreditValue", acctProfile.getCreditValue());
					acctMap.put("UrgeStopFlag", acctProfile.getUrgeStopFlag());

					// 用户数据
					acctMap.put("RegionId", insValues.getRegionId());
					acctMap.put("CountyId", insValues.getCountryCode());
					// 以后添加
					acctMap.put("AccExtendInfo", "");

					IAcctBillCycleValue billCyle = getAccountSV().queryCurrAcctBillCyclesByAcctId(acctId);

					if (billCyle != null)
						acctMap.put("AccCycle", billCyle.getBillDay());
					acctList.add(acctMap);

				}
				Map aMap = new HashMap();
				aMap.put("AcctInfo", acctList);
				returnMap.put("returnObj", aMap);
				return returnMap;
			} else {
				ExceptionUtil.throwBusinessException("CMS95000036");
			}
		} else if (!isEmpty(parameter.get("UserId")) && Long.valueOf(parameter.get("UserId").toString()) > 0) {
			IInsUserValue insValues = getCrm2CmFSV().getInsUser(Long.valueOf(parameter.get("UserId").toString()), null);
			if (insValues == null) {
				ExceptionUtil.throwBusinessException("CMS0000202");
			}
			IInsAccrelValue[] acctVs = getCrm2CmFSV().getInstAccrel(Long.valueOf(parameter.get("UserId").toString()), "");
			if (null != acctVs && acctVs.length > 0) {
				List acctList = new ArrayList();
				for (int i = 0; i < acctVs.length; i++) {
					Map acctMap = new HashMap();
					long acctId = acctVs[i].getAcctId();
					IAccountProfileValue acctProfile = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(acctId);

					if (acctProfile == null)
						continue;

					acctMap.put("PayMethod", acctProfile.getPayMethod());
					acctMap.put("AccId", acctProfile.getAcctId());
					acctMap.put("CustId", acctProfile.getCustId());
					acctMap.put("InstallmentFlag", acctProfile.getInstallmentFlag());
					acctMap.put("BillDueDate", acctProfile.getBillDueDate());
					// modify by caiyu 20121025
					// 应外围接口-电渠要求，增加信用级别的中文翻译CreditLevelName
					long cid = acctProfile.getCustId();
					int custType = CmCommonUtil.getCustType(cid);
					if (custType == CmConstants.CustomerType.INDIVIDUAL) {
						// 个人客户
						// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_CREDIT_LEVEL",
						// String.valueOf(acctProfile.getCreditLevel()));
						// acctMap.put("CrtLevelName", staticDataValue.getCodeName());
					} else if (custType == CmConstants.CustomerType.GROUP) {
						// 集团客户
						// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_GRP_CREDIT_LEVEL",
						// String.valueOf(acctProfile.getCreditLevel()));
						// acctMap.put("CrtLevelName", staticDataValue.getCodeName());
					} else if (custType == CmConstants.CustomerType.FAMILY) {
						// 家庭客户
						// TODO:预留家庭客户翻译
					} else if (custType == CmConstants.CustomerType.VIRTUAL) {
						// 虚拟客户
						// TODO:预留虚拟客户翻译
					}

					acctMap.put("AccType", acctProfile.getAcctType());
					acctMap.put("AccStatus", acctProfile.getAcctStatus());
					acctMap.put("AccName", acctProfile.getAcctName());

					acctMap.put("CreditLevel", acctProfile.getCreditLevel());
					acctMap.put("CreditValue", acctProfile.getCreditValue());
					acctMap.put("UrgeStopFlag", acctProfile.getUrgeStopFlag());

					// 用户数据
					acctMap.put("RegionId", insValues.getRegionId());
					acctMap.put("CountyId", insValues.getCountryCode());
					// 以后添加
					acctMap.put("AccExtendInfo", "");
					// 添加出账日
					acctMap.put("BillDay", acctProfile.getBillDay());

					IAcctBillCycleValue billCyle = getAccountSV().queryCurrAcctBillCyclesByAcctId(acctId);

					if (billCyle != null)
						acctMap.put("AccCycle", billCyle.getBillDay());

					acctList.add(acctMap);
				}
				Map aMap = new HashMap();
				aMap.put("AcctInfo", acctList);
				returnMap.put("returnObj", aMap);
				return returnMap;
			} else {
				ExceptionUtil.throwBusinessException("CMS95000036");

			}
		} else if (!isEmpty(parameter.get("AcctId")) && Long.valueOf(parameter.get("AcctId").toString()) > 0) {
			IAccountProfileValue acctProfile = CmxServiceFactory.getLnAccountSV().queryAccountProfileByAcctId(Long.valueOf(parameter.get("AcctId").toString()));

			if (acctProfile == null) {
				ExceptionUtil.throwBusinessException("CMS5000151", parameter.get("AcctId").toString());
			} else {
				Map acctMap = new HashMap();
				List acctList = new ArrayList();
				acctMap.put("PayMethod", acctProfile.getPayMethod());
				acctMap.put("AccId", acctProfile.getAcctId());
				acctMap.put("CustId", acctProfile.getCustId());
				acctMap.put("InstallmentFlag", acctProfile.getInstallmentFlag());
				acctMap.put("BillDueDate", acctProfile.getBillDueDate());
				// modify by caiyu 20121025
				// 应外围接口-电渠要求，增加信用级别的中文翻译CreditLevelName
				long cid = acctProfile.getCustId();
				int custType = CmCommonUtil.getCustType(cid);
				if (custType == CmConstants.CustomerType.INDIVIDUAL) {
					// 个人客户
					// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_CREDIT_LEVEL",
					// String.valueOf(acctProfile.getCreditLevel()));
					// acctMap.put("CrtLevelName", staticDataValue.getCodeName());
				} else if (custType == CmConstants.CustomerType.GROUP) {
					// 集团客户
					// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_GRP_CREDIT_LEVEL",
					// String.valueOf(acctProfile.getCreditLevel()));
					// acctMap.put("CrtLevelName", staticDataValue.getCodeName());
				} else if (custType == CmConstants.CustomerType.FAMILY) {
					// 家庭客户
					// TODO:预留家庭客户翻译
				} else if (custType == CmConstants.CustomerType.VIRTUAL) {
					// 虚拟客户
					// TODO:预留虚拟客户翻译
				}

				acctMap.put("AccType", acctProfile.getAcctType());
				acctMap.put("AccStatus", acctProfile.getAcctStatus());
				acctMap.put("AccName", acctProfile.getAcctName());

				acctMap.put("CreditLevel", acctProfile.getCreditLevel());
				acctMap.put("CreditValue", acctProfile.getCreditValue());
				acctMap.put("UrgeStopFlag", acctProfile.getUrgeStopFlag());
				// 添加出账日
				acctMap.put("BillDay", acctProfile.getBillDay());
				// 用户数据
				// IInsUserValue insValues =
				// getCrm2CmFSV().getInsUser(acctProfile.getUserId(), null);
				ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
				long groupCustId = acctProfile.getCustId();
				com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue cmGroupValue = cnGroupSv.queryGroupCustInfoByCustId(groupCustId);
				if (null != cmGroupValue) {
					acctMap.put("RegionId", cmGroupValue.getRegionId());
					acctMap.put("CountyId", cmGroupValue.getCountyId());
				} else {
					acctMap.put("RegionId", "");
					acctMap.put("CountyId", "");
				}

				// 以后添加
				acctMap.put("AccExtendInfo", "");

				IAcctBillCycleValue billCyle = getAccountSV().queryCurrAcctBillCyclesByAcctId(acctProfile.getAcctId());

				if (billCyle != null) {
					acctMap.put("AccCycle", billCyle.getBillDay());
				} else {
					// modify by caiyu 默认帐期日为1；
					acctMap.put("AccCycle", 1);
				}

				Map aMap = new HashMap();
				acctList.add(acctMap);
				aMap.put("AcctInfo", acctList);
				returnMap.put("returnObj", aMap);

				return returnMap;
			}
		} else if (!isEmpty(parameter.get("CustId")) && Long.parseLong(parameter.get("CustId").toString()) > 0) {

			// modify by caiyu 20121025 根据custid查询账户，需要先查询cm_cust_acct_rel表
			long custId = Long.parseLong(parameter.get("CustId").toString());
			
			long installmentFlag = -1;
			if (!isEmpty(parameter.get("InstallmentFlag")) && Long.parseLong(parameter.get("InstallmentFlag").toString()) >= 0) {
				installmentFlag = Long.parseLong(parameter.get("InstallmentFlag").toString());
			}	
			IAccountProfileValue[] values = CmServiceFactory.getAccountSV().queryAcctDtsByIdAndInstallmentFlag(-1, custId, installmentFlag, -1, -1);

			// log.debug("^^^^^^^^^^^^^^^^*******");
			// dc.set(IAccountProfileValue.S_CustId,
			// Long.parseLong(parameter.get("CustId").toString()));
			// log.debug("dc="+dc);
			// log.debug("^^^^^^^^^^^^^^^^*******");
			// IAccountProfileValue[] values =
			// CmxServiceFactory.getLnAccountSV().queryAccountProfiles(dc, min,
			// max);
			// log.debug("values="+values);
			// log.debug("^^^^^^^^^^^^^^^^*******");

			if (values != null && values.length > 0) {
				List acctList = new ArrayList();
				// System.out.print("values:" + values.length);//
				for (IAccountProfileValue value : values) {
					Map acctMap = new HashMap();

					acctMap.put("PayMethod", value.getPayMethod());
					acctMap.put("AccId", value.getAcctId());
					acctMap.put("CustId", value.getCustId());
					acctMap.put("InstallmentFlag", value.getInstallmentFlag());
					acctMap.put("BillDueDate", value.getBillDueDate());
					acctMap.put("BillDay", value.getBillDay());
					// modify by caiyu 20121025
					// 应外围接口-电渠要求，增加信用级别的中文翻译CreditLevelName
					long cid = value.getCustId();
					int custType = CmCommonUtil.getCustType(cid);
					if (custType == CmConstants.CustomerType.INDIVIDUAL) {
						// 个人客户
						// IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_CREDIT_LEVEL",
						// String.valueOf(value.getCreditLevel()));
						// String indivCrtName = staticDataValue == null ? "" : staticDataValue.getCodeName();
						// acctMap.put("CrtLevelName", indivCrtName);
					} else if (custType == CmConstants.CustomerType.GROUP) {
						// 集团客户
						// groupCrtname = staticDataValue == null ? "" : staticDataValue.getCodeName();
						// acctMap.put("CrtLevelName", groupCrtname);
					} else if (custType == CmConstants.CustomerType.FAMILY) {
						// 家庭客户
						// TODO:预留家庭客户翻译
					} else if (custType == CmConstants.CustomerType.VIRTUAL) {
						// 虚拟客户
						// TODO:预留虚拟客户翻译
					}

					acctMap.put("AccType", value.getAcctType());
					acctMap.put("AccStatus", value.getAcctStatus());
					acctMap.put("AccName", value.getAcctName());

					acctMap.put("CreditLevel", value.getCreditLevel());
					acctMap.put("CreditValue", value.getCreditValue());
					acctMap.put("UrgeStopFlag", value.getUrgeStopFlag());

					// 用户数据
					acctMap.put("RegionId", value.getRegionId());
					acctMap.put("CountyId", "");
					// 以后添加
					acctMap.put("AccExtendInfo", "");

					IAcctBillCycleValue billCyle = getAccountSV().queryCurrAcctBillCyclesByAcctId(value.getAcctId());

					if (billCyle != null)
						acctMap.put("AccCycle", billCyle.getCycleType());
					else
						acctMap.put("AccCycle", 5);

					acctList.add(acctMap);
				}
				Map aMap = new HashMap();
				aMap.put("AcctInfo", acctList);
				returnMap.put("returnObj", aMap);
				return returnMap;
			}
		}
		return acctUserSnMap;
	}

	// 查询集团帐单寄送信息
	public Map queryGrpCustAcctBill(Map parameter) throws Exception {
		Map mapList = (Map) parameter.get("map");
		String groupIdTemp = (String) mapList.get("GroupId");
		long groupId = -1;
		if (StringUtils.isNotBlank(groupIdTemp)) {
			groupId = Long.parseLong(groupIdTemp);
		} else {
			ExceptionUtil.throwBusinessException("CMS5000086");// 客户编号不能为空
		}
		// 根据集团客户编号查询集团客户信息
		ICmGroupCustomerSV icmGrpCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupCustomerValue iboCmGrp = icmGrpCustomerSV.queryGroupCustomerByGroupId(groupId);
		if (CmCommonUtil.isEmptyObject(iboCmGrp)) {
			ExceptionUtil.throwBusinessException("CMS0089012");// 不存在此客户
		}
		long groupCustId = iboCmGrp.getCustId();
		IAcctBillCustomizeValue[] dcCmBill = CmServiceFactory.getAccountSV().queryBillCustomizesByCustId(groupCustId);
		if (CmCommonUtil.isEmptyObject(dcCmBill)) {
			ExceptionUtil.throwBusinessException("CMS1100054");// 特殊化账单不存在
		}
		List list = new ArrayList();
		Map map = null;
		for (int i = 0; i < dcCmBill.length; i++) {
			map = new HashMap();
			map.put("acctId", dcCmBill[i].getAcctId());
			map.put("postType", dcCmBill[i].getMailType());// 邮递类型
			map.put("postName", dcCmBill[i].getRecipients());// 收件人
			map.put("postAddr", dcCmBill[i].getContAddress());// 邮递地址
			map.put("postNum", dcCmBill[i].getContZipcode());// 邮寄邮编
			map.put("contactor", dcCmBill[i].getRecipients());// 联系人
			map.put("postCycle", "");// 邮寄周期
			map.put("period", "");// 有效期
			list.add(map);
		}
		Map grpMap = new HashMap();
		grpMap.put("list", list);
		Map grpCust = new HashMap();
		grpCust.put("returnObj", grpMap);
		return grpCust;
	}

	// 查询集团信用信息
	public Map queryGrpCustCredirMessage(Map parameter) throws Exception {
		Map mapList = (Map) parameter.get("map");
		String custId = (String) mapList.get("GroupId");
		long groupCustId = -1;
		if (StringUtils.isNotBlank(custId)) {
			groupCustId = Long.parseLong(custId);
		} else {
			ExceptionUtil.throwBusinessException("CMS5000086");// 客户编号不能为空
		}
		// 根据集团客户编号查询集团客户信息
		ICmGroupCustomerSV icmGrpCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupCustomerValue iboCmGrp = icmGrpCustomerSV.queryGroupCustomerByGroupId(groupCustId);
		if (CmCommonUtil.isEmptyObject(iboCmGrp)) {
			ExceptionUtil.throwBusinessException("CMS0089012");// 不存在此客户
		}

		// modify by caiyu ,集团信用度只需要从集团客户资料中取就可以了，不用取每个账户的信用度。
		// 根据客户编号查询客户信用度信息queryAccountByCondition
		// ICmAccountSV icmAccount = (ICmAccountSV)
		// ServiceFactory.getService(ICmAccountSV.class);
		// IAccountValue[] accountValue = icmAccount.queryAcctsById(-1,
		// iboCmGrp.getCustId() , -1, -1);
		// if (CmCommonUtil.isEmptyObject(accountValue)) {
		// ExceptionUtil.throwBusinessException("CMS8000050");// 账户信息不存在
		// }
		// List list = new ArrayList();
		// Map map = null;
		// for (int i = 0; i < accountValue.length; i++) {
		// map = new HashMap();
		// map.put("CustId", accountValue[i].getAcctId());// 账户编号
		// map.put("CreditLevel", accountValue[i].getCreditLevel());// 客户信用度等级
		// map.put("CreditValue", accountValue[i].getCreditValue());// 客户信用度
		// list.add(map);
		// }
		Map map = new HashMap();
		// modify by caiyu 20121227 修改取值错误
		map.put("CustId", iboCmGrp.getCustId());
		map.put("CreditLevel", iboCmGrp.getCreditLevel());
		map.put("CreditValue", iboCmGrp.getCreditValue());
		// Map grpMap = new HashMap();
		// grpMap.put("list", list);

		Map grpCustMap = new HashMap();
		grpCustMap.put("returnObj", map);
		return grpCustMap;
	}

	/**
	 * 下发集团账户新增
	 */
	public Map saveAccount4BBoss(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		long acctId = 0L;
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");

		if ("".equals(parameter.get("OperType"))) {
			ExceptionUtil.throwBusinessException("CMS95000066");// CMS95000066
		}

		if (isEmpty(parameter.get("RegionID"))) {
			ExceptionUtil.throwBusinessException("CMS0700404");// CMS95000066
		}

		String regionId = String.valueOf(parameter.get("RegionID"));
		// 新增账户
		if ("add".equals(parameter.get("OperType"))) {
			IAccountProfileValue profileValue = new AccountProfileBean();
			profileValue.set(IAccountProfileValue.S_CustId, parameter.get("CustId").toString());
			profileValue.set(IAccountProfileValue.S_AcctName, parameter.get("AcctName").toString());
			profileValue.set(IAccountProfileValue.S_AcctType, parameter.get("AcctType").toString());
			profileValue.set(IAccountProfileValue.S_BillCycleFlag, CmLnConstants.BillCycleFlag.BillCycleFlagOff);

			VOAccountBean voaccount = new VOAccountBean();// 账户大对象

			// 账户基本信息
			IAccountValue accountValue = new AccountBean();
			accountValue.copy(profileValue);
			accountValue.set(IAccountValue.S_State, CmConstants.RecordState.USE);
			accountValue.set(IAccountValue.S_CreateOpId, CmLnConstants.BbossOpAndOgr.OPID);
			accountValue.set(IAccountValue.S_CreateOrgId, CmLnConstants.BbossOpAndOgr.ORGID);

			accountValue.set(IAccountValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
			accountValue.set(IAccountValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
			accountValue.set(IAccountValue.S_CreateDate, CmCommonUtil.getSysDate());
			accountValue.set(IAccountValue.S_EffectiveDate, CmCommonUtil.getSysDate());
			accountValue.set(IAccountValue.S_ExpireDate, CmLnCommonUtil.getMaxDate());
			accountValue.set(IAccountValue.S_UrgeStopFlag, CmLnConstants.UrgeStopFlag.UrgeStopFlag_0);
			accountValue.set(IAccountValue.S_RegionId, regionId);
			accountValue.set(IAccountValue.S_Remarks, "Group issued new account"); // 表示提供给集团下发账户新增
			accountValue.setStsToNew();
			voaccount.setAccount(accountValue);// 设置账户
			// 账户付费
			IAcctPaymentValue paymentValue = new AcctPaymentBean();
			paymentValue.copy(profileValue);
			paymentValue.set(IAcctPaymentValue.S_PayMethod, CmConstants.AccountPayMethod.CASH);
			paymentValue.set(IAcctPaymentValue.S_State, CmConstants.RecordState.USE);
			paymentValue.set(IAcctPaymentValue.S_CreateOpId, CmLnConstants.BbossOpAndOgr.OPID);
			paymentValue.set(IAcctPaymentValue.S_CreateOrgId, CmLnConstants.BbossOpAndOgr.ORGID);
			paymentValue.set(IAcctPaymentValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
			paymentValue.set(IAcctPaymentValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
			paymentValue.set(IAcctPaymentValue.S_CreateDate, CmCommonUtil.getSysDate());
			paymentValue.set(IAcctPaymentValue.S_EffectiveDate, CmCommonUtil.getSysDate());
			paymentValue.set(IAcctPaymentValue.S_ExpireDate, CmLnCommonUtil.getMaxDate());
			paymentValue.set(IAcctPaymentValue.S_RegionId, regionId);
			paymentValue.setStsToNew();
			voaccount.setPayment(paymentValue);// 设置账期
			// 账户账期
			IAcctBillCycleValue billCycleValue = new AcctBillCycleBean();
			billCycleValue.copy(profileValue);
			billCycleValue.set(IAcctBillCycleValue.S_CycleType, CmConstants.AcctBillCycleType.MONTH);// 默认账期类型为月
			billCycleValue.set(IAcctBillCycleValue.S_BillDay, CmConstants.AcctBillCycleDay.DEFAULT_DAY);// 默认1号为账期日
			billCycleValue.set(IAcctBillCycleValue.S_State, CmConstants.RecordState.USE);
			billCycleValue.set(IAcctBillCycleValue.S_CreateOpId, CmLnConstants.BbossOpAndOgr.OPID);
			billCycleValue.set(IAcctBillCycleValue.S_CreateOrgId, CmLnConstants.BbossOpAndOgr.ORGID);
			billCycleValue.set(IAcctBillCycleValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
			billCycleValue.set(IAcctBillCycleValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
			billCycleValue.set(IAcctBillCycleValue.S_CreateDate, CmCommonUtil.getSysDate());
			billCycleValue.set(IAcctBillCycleValue.S_EffectiveDate, CmCommonUtil.getSysDate());
			billCycleValue.set(IAcctBillCycleValue.S_ExpireDate, CmLnCommonUtil.getMaxDate());
			billCycleValue.set(IAcctBillCycleValue.S_RegionId, regionId);
			billCycleValue.setStsToNew();
			voaccount.setBillCycle(billCycleValue);

			acctId = CmServiceFactory.getAccountSV().saveAccount(voaccount);

			/*
			 * // 处理客户账户关系 BOCmCustAcctRelBean custAcctRel = new
			 * BOCmCustAcctRelBean(); custAcctRel.set(custAcctRel.S_AcctId,
			 * acctId); custAcctRel.set(custAcctRel.S_RelCustId,
			 * parameter.get("CustId")); custAcctRel.set(custAcctRel.S_RelType,
			 * CmLnConstants.RelType.REL_TYPE_OWNER);
			 * custAcctRel.set(custAcctRel.S_CustType,
			 * CmConstants.CustomerType.GROUP); // 集团客户
			 * custAcctRel.set(custAcctRel.S_State,
			 * CmConstants.RecordState.USE);
			 * custAcctRel.set(custAcctRel.S_CreateDate,
			 * CmCommonUtil.getSysDate());
			 * custAcctRel.set(custAcctRel.S_EffectiveDate,
			 * CmCommonUtil.getSysDate());
			 * custAcctRel.set(custAcctRel.S_ExpireDate,
			 * CmLnCommonUtil.getMaxDate());
			 * custAcctRel.set(custAcctRel.S_RegionId, regionId);
			 * //custAcctRel.set(custAcctRel.S_DoneCode,
			 * ServiceManager.getDoneCode());
			 * custAcctRel.set(custAcctRel.S_DoneDate,
			 * CmCommonUtil.getSysDate());
			 * CmInnerServiceFactory.getCommonInnerSV().saveBean(custAcctRel);
			 */
			returnMap.put("returnMsg", "New group accounts ok");
			returnMap.put("returnObj", acctId);
		}
		return returnMap;
	}

	// 集团成员基本信息查询
	public Map queryCmGrpMember(Map parameter) throws Exception {
		Map mapList = (Map) parameter.get("map");
		String userId = (String) mapList.get("UserId");
		if (StringUtils.isBlank(userId) || "-1".equals(userId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误!
		}
		// 根据用户编号查询用户信息
		ICmTeamInvokeSV icmTram = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		ISoUserValue iSoUserValue = icmTram.getSoUserByUserId(Long.valueOf(userId));
		if (CmCommonUtil.isEmptyObject(iSoUserValue)) {
			ExceptionUtil.throwBusinessException("CMS1100080");// 用户对象不存在
		}
		// 根据客户编号查询个人客户信息是否存在queryCustomers
		BOCmIndivCustomerBean bean = new BOCmIndivCustomerBean();
		bean.setCustId(iSoUserValue.getCustId());
		IBOCmIndivCustomerValue serviceValue = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (CmCommonUtil.isEmptyObject(serviceValue)) {
			ExceptionUtil.throwBusinessException("CMS1100082");// 客户信息不存在
		}
		// 根据客户编号查询集团成员信息 queryGroupMemberValues
		ICmGroupMemberSV icmgrp = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		IBOCmGroupMemberValue[] icmGrpMember = icmgrp.queryGroupMemberValues(iSoUserValue.getCustId(), -1, -1, -1);
		if (CmCommonUtil.isEmptyObject(icmGrpMember)) {
			ExceptionUtil.throwBusinessException("CMS1100081");// 集团成员信息不存在
		}
		// 根据集团编号查询集团经理信息
		ICmCustomerSV iCmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupManagerValue.S_CustId, icmGrpMember[0].getCustId());
		da.set(IBOCmGroupManagerValue.S_ManagerId, -1L);
		IBOCmGroupManagerValue[] ibocMemberValues = iCmCustomerSV.queryManagerValue(da, Long.valueOf(CmLnConstants.CustType.CUST_TYPE_GROUP), -1, -1);
		ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		List list = new ArrayList();
		for (int i = 0; i < icmGrpMember.length; i++) {
			Map memberCust = new HashMap();
			memberCust.put("UserId", iSoUserValue.getUserId());// 用户编号 1
			memberCust.put("CustName", serviceValue.getCustName());// 成员姓名
			memberCust.put("Position", icmGrpMember[i].getMemberPosition());// 职位 1
			memberCust.put("RegionCode", icmGrpMember[i].getRegionId());// 归属区域
			// 1
			memberCust.put("ModuleName", "");// 评估价值 ？
			memberCust.put("Gendor", serviceValue.getGender());// 性别0 不详1 男 2 女
			memberCust.put("ServiceNum", iSoUserValue.getBillId());// 服务号码 1
			if (CmCommonUtil.isNotEmptyObject(ibocMemberValues)) {
				// 只取第一条记录的客户经理ID
				// modify by caiyu 2012-11-19
				memberCust.put("ManagerId", ibocMemberValues[0].getManagerId());// 客户经理
				IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(ibocMemberValues[0].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				if (CmCommonUtil.isNotEmptyObject(secStaff)) {
					memberCust.put("ManagerName", secStaff.getManagername());
					memberCust.put("ManagerPhone", secStaff.getBillid());// 客户经理电话
				}
			} else {
				memberCust.put("ManagerId", "");// 客户经理
				memberCust.put("ManagerPhone", "");// 客户经理电话
				memberCust.put("IsBind", "");// 是否捆绑
				memberCust.put("Birthday", "");// 生日
				memberCust.put("Vocation", "");// 职业
			}
			memberCust.put("Department", "");// 所在部门 ?
			memberCust.put("UserStatus", iSoUserValue.getState());// 用户状态
			memberCust.put("BrandId", iSoUserValue.getBrandId());// 用户品牌
			list.add(memberCust);
		}

		Map map = new HashMap();
		map.put("list", list);
		Map listMap = new HashMap();
		listMap.put("returnObj", map);
		return listMap;
	}

	// 3.4.2.7 查询集团成员信息
	public Map queryCmGrpMemberList(Map parameter) throws Exception {
		Map mapList = (Map) parameter.get("map");
		int count = 0;
		List list = new ArrayList();
		String serviceId = DataType.getAsString(mapList.get("GroupId"));// 集团编号
		String serviceNum = DataType.getAsString(mapList.get("ServiceNum"));// 服务号码
		String custName = DataType.getAsString(mapList.get("CustName"));// 成员姓名
		String firstName = DataType.getAsString(mapList.get("FirstName"));
		String middleName = DataType.getAsString(mapList.get("MiddleName"));
		String lastName = DataType.getAsString(mapList.get("LastName"));
		String bgnIndex = DataType.getAsString(mapList.get("BgnIndex"));// 开始记录数
		String endIndex = DataType.getAsString(mapList.get("EndIndex"));// 结束记录数
		if (StringUtils.isBlank(bgnIndex)) {
			bgnIndex = "-1";
		}
		if (StringUtils.isBlank(endIndex)) {
			endIndex = "-1";
		}

		if (StringUtils.isBlank(serviceId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误!
		}
		// 查询客户信息
		DataContainer ddt = new DataContainer();
		ddt.set(ICustomerValue.S_CustServiceId, serviceId);
		ddt.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICmCustomerSV cm = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue[] icustValues = cm.queryCustomers(ddt, -1, -1);
		if (CmCommonUtil.isEmptyObject(icustValues) || icustValues.length <= 0) {
			ExceptionUtil.throwBusinessException("CMS1100082");// 客户信息不存在
		}
		// 根据客户编号查询集团成员信息 queryGroupMemberValues
		ICmGroupMemberSV icmgrp = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupMemberValue.S_CustId, icustValues[0].getCustId());
		if (StringUtils.isNotBlank(custName)) {
			dc.set("MATCH_TYPE", CmConstants.MatchType.RIGHT_MATCH);
			dc.set(IBOCmGroupMemberValue.S_MemberName, custName);
		}
		if (StringUtils.isNotBlank(firstName)) {
			dc.set("MATCH_TYPE", CmConstants.MatchType.RIGHT_MATCH);
			dc.set(IBOCmGroupMemberValue.S_FirstName, firstName);
		}
		if (StringUtils.isNotBlank(middleName)) {
			dc.set("MATCH_TYPE", CmConstants.MatchType.RIGHT_MATCH);
			dc.set(IBOCmGroupMemberValue.S_MiddleName, middleName);
		}
		if (StringUtils.isNotBlank(lastName)) {
			dc.set("MATCH_TYPE", CmConstants.MatchType.RIGHT_MATCH);
			dc.set(IBOCmGroupMemberValue.S_LastName, lastName);
		}
		if (StringUtils.isNotBlank(serviceNum)) {
			dc.set(IBOCmGroupMemberValue.S_BillId, serviceNum);
		}
		IBOCmGroupMemberValue[] icmGrpMember = icmgrp.queryGroupMemberValues(dc, Integer.valueOf(bgnIndex), Integer.valueOf(endIndex));
		if (CmCommonUtil.isEmptyObject(icmGrpMember)) {
			// modify by caiyu 20121119,集团网厅要求不抛异常，直接返回
			Map mapMember2 = new HashMap();
			mapMember2.put("MemberInfo", list);
			mapMember2.put("Count", 0);
			Map map2 = new HashMap();
			map2.put("returnObj", mapMember2);
			return map2;
			// ExceptionUtil.throwBusinessException("CMS1100081");// 集团成员信息不存在
		}
		// if (Integer.valueOf(bgnIndex) == 1) {
		// // 查询总行数
		// count = icmgrp.getGroupMemberValuesCount(dc);
		// }
		count = icmgrp.getGroupMemberValuesCount(dc);
		// 根据集团编号查询集团经理信息
		ICmCustomerSV iCmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupManagerValue.S_CustId, icmGrpMember[0].getCustId());
		da.set(IBOCmGroupManagerValue.S_RelType, CmConstants.CONT_LEVEL.CONT_LEVEL_1);
		IBOCmGroupManagerValue[] ibocMemberValues = iCmCustomerSV.queryManagerValue(da, Long.valueOf(CmLnConstants.CustType.CUST_TYPE_GROUP), -1, -1);
		// if (CmCommonUtil.isEmptyObject(ibocMemberValues)) {
		// ExceptionUtil.throwBusinessException("CMS1100083");// 客户经理信息不存在
		// }
		ICmCommonInnerSV icciSV = CmInnerServiceFactory.getCommonInnerSV();
		Map param = new HashMap();
		for (int i = 0; i < icmGrpMember.length; i++) {
			StringBuilder condition = new StringBuilder();
			Map custMember = new HashMap();
			custMember.put("GroupId", icmGrpMember[i].getCustId());// GroupId
			// 集团客户编码 1
			custMember.put("CustId", icmGrpMember[i].getMemberCustId());// CustId
			// 成员客户标识
			// 1
			custMember.put("MemberKind", icmGrpMember[i].getMemberType());// MemberKind
			// 成员类型
			// 1
			custMember.put("UserId", icmGrpMember[i].getUserId());// UserId
			// 用户编号 1
			custMember.put("ServiceNum", icmGrpMember[i].getBillId());// ServiceNum
			// 成员服务号码
			// 1
			custMember.put("Job", icmGrpMember[i].getMemberPosition());// Job
			// 职位 1
			if (CmCommonUtil.isNotEmptyObject(ibocMemberValues)) {
				custMember.put("CustManagerId", ibocMemberValues[0].getManagerId());// CustManagerId
			} else {
				custMember.put("CustManagerId", "-1");// CustManagerId
			}
			// 客户经理编号
			// 1
			custMember.put("MembertName", icmGrpMember[i].getMemberName());// MembertName
			custMember.put("FirstName", icmGrpMember[i].getFirstName());
			custMember.put("MiddleName", icmGrpMember[i].getMiddleName());
			custMember.put("LastName", icmGrpMember[i].getLastName());
			// 成员名称
			// 1
			custMember.put("RegionCode", icmGrpMember[i].getRegionId());// RegionCode
			// 地市编号
			// 1
			custMember.put("CountyCode", icustValues[0].getCountyId());// CountyCode
			// 县市编号
			// 1
			custMember.put("GroupMode", icustValues[0].getGroupType());// GroupMode
			// 集团类型
			// 1
			custMember.put("State", icmGrpMember[i].getMemberStatus() <= 0 ? 3 : icmGrpMember[i].getMemberStatus());// State
			// 成员状态
			// 1
			custMember.put("BrandId", icmGrpMember[i].getBrand());// BrandId
			// 品牌标识 ？
			Timestamp timestamp = icmGrpMember[i].getCreateDate();
			String time = TimeUtil.getYYYYMMDDHHMMSS(timestamp);
			custMember.put("CreateDate", time);// CreateDate
			// 成员加入时间
			// 1
			custMember.put("Department", icmGrpMember[i].getDeptId() <= 0 ? "" : icmGrpMember[i].getDeptId());// Department
			// 部门 1

			// modify by caiyu 20121227 修改代码，改用userid查询会员数据
			long userId = icmGrpMember[i].getUserId();
			if (userId > 0) {
				condition.append(BOCmClubMemberBean.S_UserId).append(" = :USER_ID ");
				param.put("USER_ID", userId);
				IBOCmClubMemberValue[] boClubMember = (IBOCmClubMemberValue[]) icciSV.getBeans(BOCmClubMemberBean.class, condition.toString(), param, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(boClubMember)) {
					if (boClubMember[0].getMemberLevel() == 0) {
						custMember.put("ClassId", "");// ClassId VIP级别标识 1
						custMember.put("VipFlag", "0");// VipFlag 是否大客户 1
					} else {
						custMember.put("ClassId", boClubMember[0].getMemberLevel());// ClassId
						custMember.put("VipFlag", "1");// VipFlag 是否大客户 1是 0
						// 不是大客户
					}
				} else {
					custMember.put("ClassId", "");// ClassId VIP级别标识 1
					custMember.put("VipFlag", "0");// VipFlag 是否大客户 1
				}
			} else {
				custMember.put("ClassId", "");// ClassId VIP级别标识 1
				custMember.put("VipFlag", "0");// VipFlag 是否大客户 1
			}
			// long memberCustId = -1;
			// if (CmCommonUtil.isNotEmptyObject(ibocMemberValues)) {
			// memberCustId = ibocMemberValues[0].getManagerId();
			// }
			// // 根据客户编号查询 俱乐部信息
			// if (memberCustId == 0 && memberCustId != -1) {
			// condition.append(BOCmClubMemberBean.S_CustId).append("
			// =:memberCustId");
			// param.put("memberCustId", memberCustId);
			// IBOCmClubMemberValue[] boClubMember = (IBOCmClubMemberValue[])
			// CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubMemberBean.class,
			// condition.toString(),
			// param, -1, -1);
			// if (CmCommonUtil.isNotEmptyObject(boClubMember)) {
			// custMember.put("ClassId", boClubMember[0].getMemberLevel());//
			// ClassId
			// custMember.put("VipFlag", "1");// VipFlag 是否大客户 1是 0 不是大客户
			// } else {
			// custMember.put("ClassId", "");// ClassId VIP级别标识 1
			// custMember.put("VipFlag", "0");// VipFlag 是否大客户 1
			// }
			// } else {
			// custMember.put("ClassId", "");// ClassId VIP级别标识 1
			// custMember.put("VipFlag", "0");// VipFlag 是否大客户 1
			// }
			custMember.put("ShortNum", "");// ShortNum 成员短号
			custMember.put("BrandName", "");// BrandName 品牌名称
			custMember.put("PlanName", "");// PlanName 套餐名称
			custMember.put("PlanId", "");// PlanId 套餐标识
			list.add(custMember);
		}
		Map mapMember = new HashMap();
		mapMember.put("MemberInfo", list);
		mapMember.put("Count", count);
		Map map = new HashMap();
		map.put("returnObj", mapMember);
		return map;
	}

	// 校验方法
	public void qryGrpMemberbyBillIdAndCustId(long billId, long grpCustId) throws Exception {
		// 根据手机号码查询用户信息
		ICmTeamInvokeSV icmTram = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		ISoUserValue iSoUserValue = icmTram.getSoUserByBillId(String.valueOf(billId));
		if (CmCommonUtil.isEmptyObject(iSoUserValue)) {
			ExceptionUtil.throwBusinessException("CMS1100080");// 用户对象不存在
		}
		// 根据客户编号查询个人客户信息是否存在queryCustomers
		BOCmIndivCustomerBean beanIndiv = new BOCmIndivCustomerBean();
		beanIndiv.setCustId(iSoUserValue.getCustId());
		IBOCmIndivCustomerValue indivValue = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(beanIndiv);
		if (CmCommonUtil.isEmptyObject(indivValue)) {
			ExceptionUtil.throwBusinessException("CMS1100082");// 客户信息不存在
		}
		// 根据客户编号查询集团成员信息 queryGroupMemberValues
		ICmGroupMemberSV icmgrp = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		IBOCmGroupMemberValue[] icmGrpMember = icmgrp.queryGroupMemberValues(iSoUserValue.getCustId(), grpCustId, -1, -1);
		if (CmCommonUtil.isEmptyObject(icmGrpMember)) {
			ExceptionUtil.throwBusinessException("CMS1100081");// 集团成员信息不存在
		}
		if (icmGrpMember[0].getCustId() != grpCustId) {
			ExceptionUtil.throwBusinessException("CMS1100081");// 集团成员信息不存在
		}
	}

	/**
	 * 提供外围接口查询联系人信息
	 */
	public Map queryContact4CBoss(Map parameter) throws Exception {
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		if (isEmpty(parameter.get("QueryType")))
			ExceptionUtil.throwBusinessException("CMS0000210");
		ICustomerValue[] customerValue = null;
		int queryType = Integer.parseInt(parameter.get("QueryType").toString());
		DataContainer dc = new DataContainer();
		DataContainer queryDC = new DataContainer();
		switch (queryType) {
			case 1: // 联系人查询
				if (isEmpty(parameter.get("CustServiceId")))
					ExceptionUtil.throwBusinessException("CMS95000050");
				dc.set(ICustomerValue.S_CustServiceId, parameter.get("CustServiceId").toString());
				dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				break;
			case 2: // 关键人查询
				if (isEmpty(parameter.get("CustServiceId")))
					ExceptionUtil.throwBusinessException("CMS95000050");
				dc.set(ICustomerValue.S_CustServiceId, parameter.get("CustServiceId").toString());
				dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				break;
			default:
				ExceptionUtil.throwBusinessException("CMS95000067");// CMS95000067
				break;
		}

		customerValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);
		dc.clear();
		switch (queryType) {
			case 1:// 集团联系人查询
				if (customerValue != null && customerValue.length > 0) {
					queryDC = new DataContainer();
					queryDC.set(IContactValue.S_CustId, customerValue[0].getCustId());
					queryDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
					int bgnIndex = Integer.valueOf(parameter.get("BgnIndex").toString());
					int endIndex = Integer.valueOf(parameter.get("EndIndex").toString());
					if (!isEmpty(parameter.get("ServiceNum"))) {
						queryDC.set(IContactValue.S_BillId, parameter.get("ServiceNum"));
					}
					IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryDC, bgnIndex, endIndex);
					if (contacts != null && contacts.length > 0) {
						List list = new ArrayList();
						for (int i = 0; i < contacts.length; i++) {
							IContactValue contact = contacts[i];
							Map map = new HashMap();
							// modify by caiyu 2012-11-19 直接查询会员表，判断对象，直接返回，不需要查询2次
							// int vipCount =
							// CmServiceFactory.getClubMemberSV().queryVIPClubMemberCountByUserId(contact.getUserId());
							IClubMemberValue clubMemberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(contact.getUserId());
							if (CmCommonUtil.isNotEmptyObject(clubMemberValue)) {
								// 判断是否为0的普通全球通会员
								if (clubMemberValue.getMemberLevel() == 0) {
									map.put("ClassFlag", 0);// 0不是大客户
									map.put("ClassLevel", "");
									map.put("vipLevel", "");
								} else {
									map.put("ClassFlag", 1); // 1 是大客户
									map.put("ClassLevel", clubMemberValue.getMemberLevel());
									map.put("vipLevel", clubMemberValue.getMemberLevel());
								}
							} else {
								map.put("ClassFlag", 0);// 0不是大客户
								map.put("ClassLevel", "");
								map.put("vipLevel", "");
							}
							map.put("Name", contact.getContName());
							map.put("ServiceNum", contact.getBillId());
							map.put("LinkManLevel", contact.getPrioryLevel());
							map.put("IsMain", contact.getPrioryLevel()); // 1是集团主要联系人
							map.put("CreateDate", contact.getCreateDate());

							// modify by caiyu 客户管理考虑接口性能，不提供品牌和套餐数据；
							// IBOBsStaticDataValue DS =
							// com.ai.common.util.StaticDataUtil.getStaticData("CM_TRADEMARK",
							// contact.getBrand());
							// map.put("BrandName", DS.getCodeName());
							map.put("BrandName", contact.getBrand());
							map.put("PlanName", "");
							list.add(map);
						}
						Map m = new HashMap();
						m.put("LinkManInfo", list);
						returnMap.put("returnObj", m);
					} else {
						List list = new ArrayList();
						Map m = new HashMap();
						m.put("LinkManInfo", list);
						returnMap.put("returnObj", m);
					}
				}
				break;
			case 2: // 集团关键人查询
				if (customerValue != null && customerValue.length > 0) {
					queryDC = new DataContainer();
					int bgnIndex = Integer.valueOf(parameter.get("BgnIndex").toString());
					int endIndex = Integer.valueOf(parameter.get("EndIndex").toString());
					queryDC.set(IContactValue.S_CustId, customerValue[0].getCustId());
					queryDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_KEY_PERSON);
					if (!isEmpty(parameter.get("ContName"))) {
						queryDC.set(IContactValue.S_ContName, parameter.get("ContName"));
					}
					IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryDC, bgnIndex, endIndex);
					if (contacts != null && contacts.length > 0) {
						List list = new ArrayList();
						for (int i = 0; i < contacts.length; i++) {
							IContactValue contact = contacts[i];
							Map map = new HashMap();

							// modify by caiyu 20121227 不需要查询2次，进行代码优化
							// int vipCount =
							// CmServiceFactory.getClubMemberSV().queryVIPClubMemberCountByUserId(contact.getUserId());
							// if (vipCount > 0) {
							// IClubMemberValue clubMemberValue =
							// CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(contact.getUserId());
							// map.put("ClassFlag", 1); // 1 是大客户
							// map.put("ClassLevel", "");
							// map.put("VipLevel",
							// clubMemberValue.getMemberLevel());
							// } else {
							// map.put("ClassFlag", 0);// 0不是大客户
							// map.put("ClassLevel", "");
							// map.put("VipLevel", "");
							// }
							IClubMemberValue clubMemberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(contact.getUserId());
							if (CmCommonUtil.isNotEmptyObject(clubMemberValue)) {
								// 判断是否为0的普通全球通会员
								if (clubMemberValue.getMemberLevel() == 0) {
									map.put("ClassFlag", 0);// 0不是大客户
									map.put("ClassLevel", "");
									map.put("VipLevel", "");
								} else {
									map.put("ClassFlag", 1); // 1 是大客户
									map.put("ClassLevel", "");
									map.put("VipLevel", clubMemberValue.getMemberLevel());
								}
							} else {
								map.put("ClassFlag", 0);// 0不是大客户
								map.put("ClassLevel", "");
								map.put("VipLevel", "");
							}

							map.put("Position", contact.getJobPosition());
							map.put("MemberType", contact.getMemberType());
							map.put("Name", contact.getContName());
							map.put("ServiceNum", contact.getBillId());
							map.put("CreateDate", contact.getCreateDate());
							map.put("BrandName", StringUtils.isBlank(contact.getBrand()) ? " " : contact.getBrand());
							map.put("Brand", StringUtils.isBlank(contact.getBrand()) ? " " : contact.getBrand());
							map.put("KeyLevel", contact.getContClass()); // 关键人级别
							map.put("KeyType", ""); // 关键人类型
							map.put("PlanId", "");
							map.put("UserStatus", contact.getState());
							list.add(map);
						}

						Map m = new HashMap();
						m.put("KeyManInfo", list);
						if (bgnIndex == 1) {
							m.put("Count", contacts.length);
						}
						returnMap.put("returnObj", m);
					} else {
						List list = new ArrayList();
						Map m = new HashMap();
						m.put("KeyManInfo", list);
						returnMap.put("returnObj", m);
					}
				}
				break;
			default:
				break;
		}
		return returnMap;
	}

	/**
	 * 
	 * @Function checkAirportAndTrainService
	 * @Description 机场,火车站VIP服务鉴权
	 * 
	 * @param parameter
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012 xiezl v1.0.0 修改原因<br>
	 */
	public Map checkAirportAndTrainService(Map parameter) throws Exception {
		Map inputMap = (Map) parameter.get("inputValue");

		if (isEmpty(parameter.get("ServiceType")) || inputMap == null || isEmpty(inputMap.get("mobileNum"))) {
			ExceptionUtil.throwBusinessException("CMS95000068");// CMS95000068
		}

		int serviceType = Integer.parseInt(parameter.get("ServiceType").toString());

		String billId = String.valueOf(inputMap.get("mobileNum"));

		if (inputMap.containsKey("password") && !isEmpty(inputMap.get("password"))) {
			// modify by caiyu 20121025 按照唐小禹提供的新接口进行修改
			Map map = getCrm2CmFSV().vfyPass4SR(billId, inputMap.get("password").toString());

			if (map != null) {
				if (!(Boolean) map.get("isSuccess")) {
					ExceptionUtil.throwBusinessException("CMS95000069");// CMS95000069
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS95000069");// CMS95000069
			}

		}

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		String result = "00";
		String resultDesc = "";
		String custName = "";
		String userStatus = "";

		// 客户可用免费次数
		long unUsedCount = 0;
		// 客户可用积分余额
		long userScore = 0;
		ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(userBean)) {
			String state = userBean.getState(); // SO_INS_USER_STATE

			if (inputMap.containsKey("idCardType") && inputMap.containsKey("idCardNum")) {
				if (!isEmpty(inputMap.get("idCardType")) && !isEmpty(inputMap.get("idCardNum"))) {
					int cardType = Integer.parseInt(inputMap.get("idCardType").toString());
					String cardCode = inputMap.get("idCardNum").toString();
					ICustomerValue custValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userBean.getCustId());
					if (custValue == null || custValue.getCustCertType() != cardType || !cardCode.equals(custValue.getCustCertCode())) {
						ExceptionUtil.throwBusinessException("CMS95000070");// CMS95000070
					}
				}
			}

			// 用户状态
			if (state.equals("1")) {
				userStatus = "01";
			} else if (state.equals("2") || state.equals("3")) {
				userStatus = "03";
			} else if (state.equals("5") || state.equals("6")) {
				userStatus = "04";
			}
			// 查询会员是否存在
			IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);
			if (memberValue != null) {
				ICustomerValue custValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userBean.getCustId());
				if (CmCommonUtil.isNotEmptyObject(custValue)) {
					custName = custValue.getCustName();
					// 得到服务的serviceId
					IClubServiceValue serviceValue = null;
					IClubServiceValue[] serviceValues = CmServiceFactory.getClubServiceSV().queryClubServicesByClubId(memberValue.getClubId(), min, max);
					for (IClubServiceValue value : serviceValues) {
						if (value.getServiceType() == serviceType) {
							serviceValue = value;
							break;
						}
					}

					// 查询未使用服务次数
					if (serviceValue != null) {
						unUsedCount = CmServiceFactory.getClubServiceSV().queryAvailableServiceTimes(memberValue.getMemberId(), serviceValue.getServiceId());
					}
					// 调用查询积分接口
					ICmTeamInvokeSV teamSv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
					userScore = teamSv.getIndivScoreByUserId(userBean.getUserId());
				} else {
					result = "07";
					resultDesc = "Customer information is not present";
				}

			} else {
				result = "07";
				resultDesc = "Vip number corresponding to the customer does not exist";
			}
		} else {
			result = "07";
			resultDesc = "Number corresponding to the user does not exist";
			userStatus = "99";
		}

		Map subReturnMap = new HashMap();
		subReturnMap.put("mobileNum", billId);
		subReturnMap.put("result", result);
		subReturnMap.put("resultDesc", resultDesc);
		subReturnMap.put("name", custName);
		subReturnMap.put("freeTimes", unUsedCount);
		subReturnMap.put("userScore", userScore);
		subReturnMap.put("userStatus", userStatus);

		returnMap.put("returnObj", subReturnMap);

		return returnMap;
	}

	public Map qryVipCardInfo(Map parameter) throws Exception {
		String billId = parameter.get("BillId").toString();

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");
		Map subReturnMap = new HashMap();

		String homeProvice = "240";
		String cardNum = "";
		String grade = "";
		String valiDate = "";
		String result = "";
		ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (userBean != null) {
			// 查询会员是否存在
			IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);
			if (memberValue != null && memberValue.getMemberLevel() > 0) {
				// 查询卡号信息
				String condition = " state='U' and expire_date>sysdate and member_id= :memberId ";
				Map queryCardPara = new HashMap();
				queryCardPara.put("memberId", memberValue.getMemberId());
				IBOCmClubMemberCardValue[] memberCardValues = (IBOCmClubMemberCardValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubMemberCardBean.class,
						condition, queryCardPara, -1, -1);
				if (memberCardValues != null && memberCardValues.length > 0)
					cardNum = memberCardValues[0].getCardCode();

				if (memberValue.getMemberLevel() == Integer.parseInt(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL)) {
					grade = "1";
					result = "00";
				} else if (memberValue.getMemberLevel() == Integer.parseInt(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL)) {
					grade = "2";
					result = "00";
				} else if (memberValue.getMemberLevel() == Integer.parseInt(CmConstants.CmIndivVipLevel.SILVER_LEVEL)) {
					grade = "3";
					result = "00";
				} else {
					result = "01";
				}
				if (!"01".equals(result)) {
					// modify by caiyu 20121220 修改电子卡的失效期为第2年的3月
					String yy = this.getcardYearByCardNum(cardNum);
					int y = Integer.valueOf(yy).intValue();
					y = y + 1;
					valiDate = new StringBuilder().append(y).append("03").toString();// 失效期=卡的年份+12月
				}
				// else {
				// 更改人：kangzk 应游寅生要求非钻金银的用户 返回当前时间
				// valiDate=CmLnCommonUtil.getSysDateTime().toString().substring(0,4)+"12";
				// }
			} else {
				result = "01";
			}
		}
		// modify by caiyu 按照CBOSS接口文档-CRM-中心业务1021修改大小写
		subReturnMap.put("homeProvice", homeProvice);
		subReturnMap.put("billId", billId);
		subReturnMap.put("misisdn", billId);
		subReturnMap.put("cardNum", cardNum);
		subReturnMap.put("grade", grade);
		subReturnMap.put("valiDate", valiDate);
		subReturnMap.put("result", result);

		// 暂时不传
		// subReturnMap.put("resultDesc","");
		// subReturnMap.put("reserve","");
		// subReturnMap.put("otherInfo", new Map());

		returnMap.put("returnObj", subReturnMap);

		return returnMap;
	}

	/**
	 * 根据卡号获得年份
	 * 
	 * @Function getcardLevelByCardNum
	 * @Description
	 * 
	 * @param cradNum
	 * @return
	 * 
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 12:52:12 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012 xingyh v1.0.0 修改原因<br>
	 */
	private String getcardYearByCardNum(String cradNum) {
		String cardYear = "";

		if (cradNum.length() == 16) {// 卡号长度
			cardYear = cradNum.substring(2, 4); // 返回卡的年份
		} else {
			cardYear = "0";
		}
		return cardYear;
	}

	/**
	 * 
	 * @Function recordAirportAndTrainService
	 * @Description 机场,火车站服务记帐接口
	 * 
	 * @param parameter
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.1
	 * @author kangzk
	 * @date Mar 15, 2012 2:02:11 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public Map recordAirportAndTrainService(Map parameter) throws Exception {
		Map inputMap = (Map) parameter.get("inputValue");

		if (isEmpty(parameter.get("ServiceType")) || inputMap == null || isEmpty(inputMap.get("mobileNum"))) {
			ExceptionUtil.throwBusinessException("CMS95000068");
		}

		int serviceType = Integer.parseInt(parameter.get("ServiceType").toString());

		String mobileNum = inputMap.get("mobileNum").toString();

		if (inputMap.containsKey("password") && !isEmpty(inputMap.get("password"))) {
			// modify by caiyu 20121025 按照唐小禹提供的新接口进行修改
			Map map = getCrm2CmFSV().vfyPass4SR(mobileNum, inputMap.get("password").toString());

			if (map != null) {
				if (!(Boolean) map.get("isSuccess")) {
					ExceptionUtil.throwBusinessException("CMS95000069");
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS95000069");
			}

			// Map verify = getCrm2CmFSV().verifyUserPassword(mobileNum,
			// inputMap.get("password").toString());
			// if (!"0".equals(verify.get("_nRetFlag")))
			// ExceptionUtil.throwBusinessException("CMS95000069");
		}

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		String donecode = ""; // 交易流水号
		String enterTime = ""; // 进入时间
		int totalTimes = 1; // 应扣免费次数
		int svcLevel = 0;// 服务类别
		if (inputMap.containsKey("totalTimes") && !isEmpty(inputMap.get("totalTimes"))) {
			totalTimes = Integer.parseInt(inputMap.get("totalTimes").toString());
		}

		String result = "00";
		String resultDesc = "";
		Map params = new HashMap();
		params.put("donecode", donecode);
		params.put("enterTime", enterTime);
		params.put("svcLevel", String.valueOf(svcLevel));
		int result_code = -1;

		ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(mobileNum);
		if (CmCommonUtil.isEmptyObject(userBean))
			ExceptionUtil.throwBusinessException("CMS95000071");// 根据服务号码查询不到用户信息

		if (inputMap.containsKey("idCardType") && inputMap.containsKey("idCardNum")) {
			if (!isEmpty(inputMap.get("idCardType")) && !isEmpty(inputMap.get("idCardNum"))) {
				int cardType = Integer.parseInt(inputMap.get("idCardType").toString());
				String cardCode = inputMap.get("idCardNum").toString();
				ICustomerValue custValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userBean.getCustId());
				if (custValue == null || custValue.getCustCertType() != cardType || !cardCode.equals(custValue.getCustCertCode())) {
					ExceptionUtil.throwBusinessException("CMS95000072");// 客户信息不存在或证件信息与客户不相符
				}
			}
		}

		IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(mobileNum);

		if (CmCommonUtil.isEmptyObject(memberValue)) {
			ExceptionUtil.throwBusinessException("CMS95000073");// 该服务号码不是大客户
		}

		// 得到机场或或火车站服务的serviceId
		IClubServiceValue serviceValue = null;
		IClubServiceValue[] serviceValues = CmServiceFactory.getClubServiceSV().queryClubServicesByClubId(memberValue.getClubId(), min, max);
		for (IClubServiceValue value : serviceValues) {
			if (value.getServiceType() == serviceType) {
				serviceValue = value;
				break;
			}
		}

		if (CmCommonUtil.isEmptyObject(serviceValue)) {
			ExceptionUtil.throwBusinessException("CMS95000074");// 查询该俱乐部对应的相应服务失败
		}

		result_code = 0;

		// 0:成功 1:客户级别不够 2:扣减积分失败 4：操作员信息为空 5:号码对应的用户不存在 6:机场服务记录异常 7：手机号码不能为空
		// 8：扣减次数和积分都小于等于0
		if (result_code != -1) {
			if (result_code == 1) {
				result = "28";
				resultDesc = CrmLocaleFactory.getResource("CMS0080327");
			} else if (result_code == 2) {
				result = "99";
				resultDesc = CrmLocaleFactory.getResource("CMS0080328");
			} else if (result_code == 3) {
				result = "99";
				resultDesc = CrmLocaleFactory.getResource("CMS0080329");
			} else if (result_code == 4) {
				result = "99";
				resultDesc = CrmLocaleFactory.getResource("CMS0080330");
			} else if (result_code == 5) {
				result = "05";
				resultDesc = CrmLocaleFactory.getResource("CMS0080334");
			} else if (result_code == 6) {
				result = "99";
				resultDesc = CrmLocaleFactory.getResource("CMS0080331");
			} else if (result_code == 7) {
				result = "99";
				resultDesc = CrmLocaleFactory.getResource("CMS0080332");
			} else if (result_code == 8) {
				result = "99";
				resultDesc = CrmLocaleFactory.getResource("CMS0080333");
			}
		}
		Map subReturnMap = new HashMap();
		subReturnMap.put("result", result);
		subReturnMap.put("resultDesc", resultDesc);

		returnMap.put("returnObj", subReturnMap);

		return returnMap;
	}

	public Map transferCustScoreAndGrade(Map parameter) throws Exception {
		// Map mapList = (Map) parameter.get("map");
		// String newBillId = DataType.getAsString(mapList.get("newBillId"));
		// Short oprCode = DataType.getAsShort((mapList.get("oprCode")));
		// String level =
		// String.valueOf(DataType.getAsShort(mapList.get("level")));
		// if (ScoreConstant.COMMON.SCORE_IN == oprCode) {
		// IBOCmIndivCustomerValue indivCust =
		// checkTransferCustScoreAndGrade(mapList);
		// // 根据手机号码查询用户信息
		// ICmTeamInvokeSV icmTram = (ICmTeamInvokeSV)
		// ServiceFactory.getService(ICmTeamInvokeSV.class);
		// ISoUserValue iSoUserValue = icmTram.getSoUserByBillId(newBillId);
		// if (CmCommonUtil.isEmptyObject(iSoUserValue)) {
		// ExceptionUtil.throwBusinessException("CMS1100080");// 用户对象不存在
		// }
		// // vip级别计算saveVipLevel
		// ICmLnClubServiceSV icmGrp = (ICmLnClubServiceSV)
		// ServiceFactory.getService(ICmLnClubServiceSV.class);
		// icmGrp.saveVipLevel(newBillId, Integer.valueOf(level),
		// CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_4);
		// }
		// // 积分转入
		// // IScoreCMSV scoreCmsv = (IScoreCMSV)
		// ServiceFactory.getService(IScoreCMSV.class);
		// CustScoreAndGradeInfoDataBean custScore = new
		// CustScoreAndGradeInfoDataBean();
		// if (mapList.get("oldBillId") != null) {
		// custScore.setOldBillId(DataType.getAsString(mapList.get("oldBillId")));
		// }
		// if (mapList.get("newBillId") != null) {
		// custScore.setNewBillId(DataType.getAsString(mapList.get("newBillId")));
		// }
		// if (mapList.get("allConScore") != null) {
		// custScore.setAllConScore(DataType.getAsString(mapList.get("allConScore")));
		// }
		// if (mapList.get("effectDate") != null) {
		// custScore.setType(DataType.getAsShort(mapList.get("effectDate")));
		// }
		// if (mapList.get("level") != null) {
		// custScore.setLevel(DataType.getAsShort(mapList.get("level")));
		// }
		// if (mapList.get("levelDate") != null) {
		// custScore.setLevelDate(DataType.getAsString(mapList.get("levelDate")));
		// }
		// if (mapList.get("effectDate") != null) {
		// custScore.setOprCode(DataType.getAsShort(mapList.get("effectDate")));
		// }
		// if (mapList.get("procId") != null) {
		// custScore.setProcId(DataType.getAsLong(mapList.get("procId")));
		// }
		// if (mapList.get("effectDate") != null) {
		// custScore.setEffectDate(DataType.getAsString(mapList.get("effectDate")));
		// }
		// if (mapList.get("scores") != null) {
		// custScore.setScores((List) (mapList.get("scores")));
		// }
		// TransferResultDataBean re = scoreCmsv.transferScore(custScore);
		// Map returnMap = new HashMap();
		// returnMap.put("result", re.getResult());
		// returnMap.put("resultDesc", re.getResultDesc());
		// Map retMap = new HashMap();
		// retMap.put("returnObj", returnMap);
		// return retMap;
		return null;
	}

	public IBOCmIndivCustomerValue checkTransferCustScoreAndGrade(Map mapList) throws Exception {
		String newBillId = DataType.getAsString(mapList.get("newBillId"));
		String allConScore = DataType.getAsString(mapList.get("allConScore"));
		Short oprCode = DataType.getAsShort(mapList.get("oprCode"));
		if (StringUtils.isBlank(newBillId)) {
			ExceptionUtil.throwBusinessException("CMS1100096");// 转入手机号码为空！
		}
		if (StringUtils.isBlank(allConScore)) {
			ExceptionUtil.throwBusinessException("CMS1100097");// 转入总消费积分为空！
		}
		if (!(oprCode == 0 || oprCode == 1)) {
			ExceptionUtil.throwBusinessException("CMS1100098");// 操作类型不合法！
		}
		// 根据手机号码查询用户信息
		ICmTeamInvokeSV icmTram = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		ISoUserValue iSoUserValue = icmTram.getSoUserByBillId(newBillId);
		if (CmCommonUtil.isEmptyObject(iSoUserValue)) {
			ExceptionUtil.throwBusinessException("CMS1100080");// 用户对象不存在
		}
		// 根据客户编号查询个人客户信息是否存在queryCustomers
		BOCmIndivCustomerBean beanIndiv = new BOCmIndivCustomerBean();
		beanIndiv.setCustId(iSoUserValue.getCustId());
		IBOCmIndivCustomerValue indivValue = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(beanIndiv);
		if (CmCommonUtil.isEmptyObject(indivValue)) {
			ExceptionUtil.throwBusinessException("CMS1100082");// 客户信息不存在
		}
		return indivValue;
	}

	// 查询下级集团客户信息 只查询一级集团信息
	public Map qrySubordinateGrpCust(Map parameter) throws Exception {
		Map mapList = (Map) parameter.get("map");
		if (CmCommonUtil.isEmptyObject(mapList)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误
		}
		String grpCustId = DataType.getAsString(mapList.get("grpCustId"));
		if (StringUtils.isBlank(grpCustId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误
		}
		// 查询集团客户信息
		ICmCustomerSV icmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dt = new DataContainer();
		dt.set(ICustomerValue.S_ParentCustId, grpCustId);
		dt.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		dt.set(ICustomerValue.S_State, CmConstants.RecordState.USE);
		ICustomerValue[] iCustomerValues = icmCustomerSV.queryCustomers(dt, -1, -1);
		List list = new ArrayList();
		Map retMap = null;
		if (CmCommonUtil.isNotEmptyObject(iCustomerValues)) {
			for (int i = 0; i < iCustomerValues.length && iCustomerValues.length > 0; i++) {
				retMap = new HashMap();
				retMap.put(ICustomerValue.S_CustId, iCustomerValues[i].getCustServiceId());
				retMap.put(ICustomerValue.S_CustName, iCustomerValues[i].getCustName());
				retMap.put(ICustomerValue.S_CustStatus, iCustomerValues[i].getCustStatus());
				retMap.put(ICustomerValue.S_CustLevel, iCustomerValues[i].getCustLevel());
				list.add(retMap);
			}
		}
		Map retListMap = new HashMap();
		retListMap.put("list", list);
		if (CmCommonUtil.isNotEmptyObject(list)) {
			retListMap.put("result", "00");
			retListMap.put("resultDesc", "Business Process complete!");
		} else {
			retListMap.put("result", "-99");
			retListMap.put("resultDesc", "Query object is empty!");
		}

		Map retObjMap = new HashMap();
		retObjMap.put("returnObj", retListMap);
		return retObjMap;
	}

	// 0 全部类型 1 客户经理 2 电话经理
	public Map delManagerRel(Map parameter) throws Exception {
		Map returnMap = new HashMap();
		returnMap.put("returnObj", true);
		long managerId = Long.parseLong(parameter.get("ManagerId").toString());
		String managerType = parameter.get("ManagerType").toString();
		if (managerId <= 0)
			return returnMap;

		Map queryPara = new HashMap();
		queryPara.put("managerId", managerId);

		StringBuilder groupSB = new StringBuilder("");
		StringBuilder userSB = new StringBuilder("");
		BOCmGroupManagerBean[] groupManagerValues = null;
		BOCmUserManagerBean[] userManagerValues = null;
		String type = null;
		String conditonSql = "and manager_id = :managerId ";

		// 集团客户经理
		type = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupManagerBean.class).getMapingEntyType();
		if ("table".equals(type)) {
			groupSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupManagerBean.class).getMapingEnty());
		} else if ("query".equals(type)) {
			groupSB.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupManagerBean.class).getMapingEnty());
		}

		// 个人大客户电话经理
		type = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEntyType();
		if ("table".equals(type)) {
			userSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());
		} else if ("query".equals(type)) {
			userSB.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());
		}

		if ("0".equals(managerType)) {
			groupManagerValues = (BOCmGroupManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupManagerBean.class,
					CmLnCommonUtil.getQueryResult(groupSB.toString(), conditonSql, -1, -1, queryPara), queryPara);
			userManagerValues = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
					CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);
		} else if ("1".equals(managerType)) {
			groupManagerValues = (BOCmGroupManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupManagerBean.class,
					CmLnCommonUtil.getQueryResult(groupSB.toString(), conditonSql, -1, -1, queryPara), queryPara);
		} else if ("2".equals(managerType)) {
			userManagerValues = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
					CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);
		}

		if (groupManagerValues != null && groupManagerValues.length > 0) {
			for (BOCmGroupManagerBean value : groupManagerValues) {
				value.delete();
			}

			CmInnerServiceFactory.getCommonInnerSV().saveBeans(groupManagerValues);
		}
		if (userManagerValues != null && userManagerValues.length > 0) {
			for (BOCmUserManagerBean value : userManagerValues) {
				value.delete();
			}

			CmInnerServiceFactory.getCommonInnerSV().saveBeans(userManagerValues);
		}
		return returnMap;
	}

	public Map queryAcctBankRel(Map parameter) throws Exception {
		Object billIdObject = parameter.get("billId");
		if (billIdObject == null) {
			return null;
		}
		String billId = billIdObject.toString();
		IBOCmxAcctBankRelValue[] acctBankRels = CmxServiceFactory.getLnAccountSV().queryAcctBankRel(billId, -1);
		Map resultMap = new HashMap();
		resultMap.put("returnObj", acctBankRels);
		return resultMap;
	}

	public Map queryCmInsCmRelByCds(Map parameter) throws Exception {
		Object custIdObject = parameter.get("custId");
		Object userIdObject = parameter.get("userId");
		Object stateObject = parameter.get("state");
		long custId = -1;
		long userId = -1;
		int state = -1;
		if (custIdObject != null) {
			custId = Long.parseLong(custIdObject.toString());
		}
		if (userIdObject != null) {
			userId = Long.parseLong(userIdObject.toString());
		}
		if (stateObject != null) {
			state = Integer.parseInt(stateObject.toString());
		}
		IBOLnCmInsCmRelValue[] insCmRelValues = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelByCds(custId, userId, state);
		for (int i = 0; i < insCmRelValues.length; i++) {
			if (insCmRelValues[i].getRelaType() == 0) {
				insCmRelValues[i].setRelaType(2);
			}
		}
		Map resultMap = new HashMap();
		resultMap.put("returnObj", insCmRelValues);
		return resultMap;
	}

	public Map queryGroupCustByBillId(Map parameter) throws Exception {
		Object billIdObject = parameter.get("billId");
		if (billIdObject == null) {
			return null;
		}
		String billId = billIdObject.toString();
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupCustomerValue groupCustomerValue = groupCustomerSV.queryGroupCustByBillId(billId);
		Map resultMap = new HashMap();
		resultMap.put("returnObj", groupCustomerValue);
		return resultMap;
	}

	public Map saveCmInsCmRelValues(Map parameter) throws Exception {
		Object insCmRelValues = parameter.get("lnCmInsCmRelValues");
		if (insCmRelValues != null) {
			IBOLnCmInsCmRelValue[] lnCmInsCmRelValues = (IBOLnCmInsCmRelValue[]) insCmRelValues;
			CmxServiceFactory.getLnCommonServiceSV().saveCmInsCmRelValues(lnCmInsCmRelValues);
		}
		return new HashMap();
	}

	public Map queryRootGrpCustomers(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty(parameter.get("CustId")))
			ExceptionUtil.throwBusinessException("CMS0000210");

		int startNum = -1;
		int endNum = -1;

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query customer information OK");

		com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerBean[] values = (com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerBean[]) CmServiceFactory.getCustomerSV()
				.queryRootGroupInfosByCustId(Long.valueOf(parameter.get("CustId").toString()), startNum, endNum);

		List list = new ArrayList();
		for (int i = 0; i < values.length; i++) {
			Map m = new HashMap();
			m.put("CUST_ID", values[i].getCustServiceId());
			m.put("CUST_NAME", values[i].getCustName());
			// m.put("CUST_LEVEL", values[i].getCustLevel());
			m.put("CUST_STATUS", values[i].getCustStatus());
			list.add(m);
		}
		returnMap.put("returnObj", list);
		return returnMap;
	}

	public Map cancelLationOfUser(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Successful operation");

		long custId = CmCommonUtil.isEmptyObj(parameter.get("CustId")) ? 0 : Long.parseLong(parameter.get("CustId").toString());
		long userId = CmCommonUtil.isEmptyObj(parameter.get("UserId")) ? 0 : Long.parseLong(parameter.get("UserId").toString());
		long acctId = CmCommonUtil.isEmptyObj(parameter.get("AcctId")) ? 0 : Long.parseLong(parameter.get("AcctId").toString());

		if (custId <= 0 || userId <= 0 || acctId <= 0) {
			// custId,acctId,userId3个参数都需要判断非空，3个必须要都要有值
			ExceptionUtil.throwBusinessException("CMS5000134");
		}

		int custType = CmCommonUtil.getCustType(custId);
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人客户,历史表会自动记录

			// 1.根据custId查询cm_ins_cmrel(客户用户关系)表，
			// 如果没有记录抛异常；
			// 如果该客户下有多个用户，则根据传入的USER_ID更改关系表状态为'0',把custModFlag1 设置为true;
			// 如果只返回1条记录，
			// 如果返回的userId和传入的userId相同，则证明该客户下只有这个用户，则根据传入的USER_ID,CUST_ID更改关系表状态为'0'，把custModFlag1设置为true；
			// 如果返回的userId和传入的userId不相同，则证明该用户不是这个客户下的，抛异常“userId和custId不匹配！”；
			IBOLnCmInsCmRelValue[] boLnCmInsCmRelValue = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValues(custId, 0L);
			// 增加为null判断
			if (CmCommonUtil.isNotEmptyObject(boLnCmInsCmRelValue)) {
				// 如返回用户关系记录为1,则改变客户状态为潜在
				if (boLnCmInsCmRelValue.length == 1) {
					ICustomerValue customer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
					if (customer != null) {
						customer.initProperty(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
						customer.set(ICustomerValue.S_CustStatus, CmConstants.CustomerStatus.INDIV_POTENTIAL);
					}
				}

				// 修改客户用户关系表销户
				for (IBOLnCmInsCmRelValue value : boLnCmInsCmRelValue) {
					if (value.getUserId() != userId)
						continue;

					IBOLnCmInsCmRelValue[] boLnCmInsCmRelValueUser = CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValues(custId, userId);
					BOLnCmInsCmRelBean cmInsCmRelBean = new BOLnCmInsCmRelBean();

					cmInsCmRelBean.copy(boLnCmInsCmRelValueUser[0]);
					cmInsCmRelBean.set("STATE", CmLnConstants.UserState.USER_DES);
					cmInsCmRelBean.delete();
					// CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
					// DataContainer[] { cmInsCmRelBean });
					ICmLnCommonServiceSV service = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
					service.saveCmInsCmRelValues(new BOLnCmInsCmRelBean[] { cmInsCmRelBean });
				}
			}
			/*
			 * // 2.根据userId调用营业接口查询默认账户关系， // 如果没有记录抛异常 // 如果返回1条记录 //
			 * 如果返回的acctId和传入的acctId相同，则证明帐户只有这个用户的付费关系，帐户可以修改，设置acctDelFlag1为true; //
			 * 如果返回的acctId和传入的acctId不相同，则证明该用户不是这个帐户付费，抛异常“userId和acctId不匹配！”;
			 * Map getFee = new HashMap(); boolean hasUser = true; long
			 * commonBalance = 0L; ICmTeamInvokeSV cmTeamInvokeSV =
			 * (ICmTeamInvokeSV)
			 * ServiceFactory.getService(ICmTeamInvokeSV.class); //getFee =
			 * cmTeamInvokeSV.getAcctFeeInfoByAcctId(acctId); // 判断是否有普通结余 if
			 * (!isEmpty(getFee)) { commonBalance =
			 * Long.valueOf(getFee.get("commonBalance").toString()); } //
			 * 判断是否有预缴费 // hasUser = cmTeamInvokeSV.hasUserAppBalRec(userId,
			 * acctId); hasUser = false; // 如果不存在预缴费且普通结余==0则删除账户 if (!hasUser &&
			 * commonBalance <= 0) { ISoAccrelValue[] acctVs =
			 * CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userId,
			 * 1, -1, -1); if (CmCommonUtil.isNotEmptyObject(acctVs)) { long
			 * relAcctId = acctVs[0].getAcctId(); String regionId =
			 * acctVs[0].getRegionId(); if (relAcctId != acctId)
			 * ExceptionUtil.throwBusinessException("userId和acctId不匹配！"); //
			 * 3.根据userId修改cm_ins_cmrel表中客户用户记录 //
			 * 4.根据acctId清空cm_account表中信誉度、信用等级 DataContainer queryDC = new
			 * DataContainer(); queryDC.set(IAccountProfileValue.S_AcctId,
			 * acctId); queryDC.set(IAccountProfileValue.S_RegionId, regionId); //
			 * 账户信息 BOCmAccountBean acctProBean = new BOCmAccountBean(); //
			 * 付方案信息 BOCmAcctPaymentBean payMentBean = new
			 * BOCmAcctPaymentBean(); // 支付方案扩展信息 BOCmCmxAcctPaymentAttrBean
			 * payMentAttrBean = new BOCmCmxAcctPaymentAttrBean(); // 账期信息
			 * BOCmAcctBillCycleBean cycleBean = new BOCmAcctBillCycleBean();
			 * IAccountValue accountValue =
			 * CmServiceFactory.getAccountSV().queryAccountById(relAcctId); if
			 * (CmCommonUtil.isNotEmptyObject(accountValue)) { // 删除账户信息
			 * acctProBean.copy(accountValue); acctProBean.delete();
			 * CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
			 * DataContainer[] { acctProBean }); } IAcctPaymentValue
			 * payMentValue =
			 * CmServiceFactory.getAccountSV().queryCurrAcctPaymentsByAcctId(relAcctId);
			 * if (CmCommonUtil.isNotEmptyObject(payMentValue)) { // 删除支付方案信息
			 * payMentBean.copy(payMentValue); payMentBean.delete();
			 * CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
			 * DataContainer[] { payMentBean }); // 删除支付方案扩展信息
			 * IBOCmCmxAcctPaymentAttrValue payMentAttrValue =
			 * CmServiceFactory.getAccountSV().queryCmxAcctPaymentAttrById(payMentValue.getPaymentId(),
			 * CmLnConstants.PaymentAttr.OnceFee); if
			 * (CmCommonUtil.isNotEmptyObject(payMentAttrValue)) {
			 * payMentAttrBean.copy(payMentAttrValue); payMentAttrBean.delete();
			 * CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
			 * DataContainer[] { payMentAttrBean }); } } IAcctBillCycleValue[]
			 * billCycleValue =
			 * CmServiceFactory.getAccountSV().queryAcctBillCyclesByAcctId(relAcctId);
			 * if (CmCommonUtil.isNotEmptyObject(billCycleValue)) { // 删除账期信息
			 * cycleBean.copy(billCycleValue[0]); cycleBean.delete();
			 * CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
			 * DataContainer[] { cycleBean }); } // 删除客户账户关系表 StringBuilder
			 * querySql = new
			 * StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmCustAcctRelBean.class).
			 * getMapingEnty()); if (log.isDebugEnabled())
			 * log.debug("\n\nquerySql:" + querySql.toString() + "\n\n");
			 * StringBuilder conditionSql = new StringBuilder(""); Map
			 * queryParameter = new HashMap(); conditionSql.append(" and acct_id =
			 * :AcctId and state = :State "); queryParameter.put("AcctId",
			 * acctId); queryParameter.put("State",
			 * CmConstants.RecordState.USE); DataContainerInterface[] acctRels =
			 * CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmCustAcctRelBean.class,
			 * CmLnCommonUtil.getQueryResult(querySql.toString(),
			 * conditionSql.toString(), -1, -1), queryParameter); if
			 * (CmCommonUtil.isNotEmptyObject(acctRels)) { BOCmCustAcctRelBean
			 * relBean = new BOCmCustAcctRelBean(); relBean.copy(acctRels[0]);
			 * relBean.delete();
			 * CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
			 * DataContainer[] { relBean }); } // 根据userId删除个性化账单 StringBuilder
			 * querySqlBill = new
			 * StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(
			 * com.asiainfo.crm.cm.ln.account.bo.BOCmBillCustomizeBean.class).getMapingEnty());
			 * if (log.isDebugEnabled()) log.debug("\n\nquerySql:" +
			 * querySqlBill.toString() + "\n\n"); StringBuilder conditionSqlBill =
			 * new StringBuilder(""); Map queryParameterBill = new HashMap();
			 * conditionSqlBill.append(" and acct_id = :AcctId and state =
			 * :State "); queryParameterBill.put("AcctId", acctId);
			 * queryParameterBill.put("State", CmConstants.RecordState.USE);
			 * queryParameterBill.put(com.asiainfo.crm.cm.ln.account.ivalues.IBOCmBillCustomizeValue.S_RegionId,
			 * CenterUtil.getRegionIdByAcctId(acctId)); DataContainerInterface[]
			 * bills =
			 * CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(com.asiainfo.crm.cm.ln.account.bo.
			 * BOCmBillCustomizeBean.class,
			 * CmLnCommonUtil.getQueryResult(querySqlBill.toString(),
			 * conditionSqlBill.toString(), -1, -1), queryParameterBill);
			 * com.asiainfo.crm.cm.ln.account.bo.BOCmBillCustomizeBean billBean =
			 * new com.asiainfo.crm.cm.ln.account.bo.BOCmBillCustomizeBean(); if
			 * (CmCommonUtil.isNotEmptyObject(bills)) { for (int k = 0; k <
			 * bills.length; k++) { billBean.copy(bills[k]); billBean.delete();
			 * CmInnerServiceFactory.getCommonInnerSV().saveBeans(new
			 * DataContainer[] { billBean }); } } } }
			 */
			// 5.如果用户是大客户，则根据userId删除大客户信息
			// 同时删除大客户的客户经理关系表
			IClubMemberValue clubMemberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(userId);
			if (clubMemberValue != null) {
				IClubMemberValue clubMember = new ClubMemberBean();
				clubMember.copy(clubMemberValue);
				clubMember.delete();
				CmServiceFactory.getClubMemberSV().saveClubMember(clubMember);
				Map queryPara = new HashMap();
				queryPara.put("userId", userId);
				BOCmUserManagerBean[] userManagerValues = null;
				String conditonSql = "and user_id = :userId ";
				StringBuilder userSB = new StringBuilder("");
				userSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());

				userManagerValues = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
						CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);

				if (userManagerValues != null && userManagerValues.length > 0) {
					for (BOCmUserManagerBean value1 : userManagerValues)
						value1.delete();
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(userManagerValues);
				}
			}
			// 6.如果用户是集团成员,则根据userId删除集团成员关系表

			DataContainer condition = new DataContainer();
			condition.set(IGroupMemberValue.S_UserId, userId);
			IGroupMemberValue[] cmGroupCustMemUser = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
			if (cmGroupCustMemUser != null && cmGroupCustMemUser.length > 0) {
				IBOCmGroupMemberValue[] values = new BOCmGroupMemberBean[cmGroupCustMemUser.length];
				for (int i = 0; i < cmGroupCustMemUser.length; i++) {
					values[i] = new BOCmGroupMemberBean();
					values[i].copy(cmGroupCustMemUser[i]);
					values[i].delete();
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainer[]) values);
			}

			// 根据userId删除集团联系人关键人记录
			condition.clear();
			condition.set(IGroupMemberValue.S_UserId, userId);
			condition.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(condition, -1, -1);
			if (contactValues != null && contactValues.length > 0) {
				IBOCmGroupContactValue[] values = new BOCmGroupContactBean[contactValues.length];
				for (int k = 0; k < values.length; k++) {
					values[k] = new BOCmGroupContactBean();
					values[k].copy(contactValues[k]);
					values[k].delete();
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainer[]) values);
			}
			returnMap.put("returnObj", true);
		}
		return returnMap;
	}

	/*
	 * public static void main(String[] args) throws Exception { ICm2InterFSV
	 * icm=(ICm2InterFSV)ServiceFactory.getService(ICm2InterFSV.class); Map
	 * map=new HashMap(); map.put("grpCustId", "235000000050553"); Map
	 * lisMap=new HashMap(); lisMap.put("map", map); Map
	 * map2=icm.qrySubordinateGrpCust(lisMap); System.out.println("="); Map
	 * map=new HashMap(); Short type=0; Short level=0; Short oprCode=0; long
	 * prLong=201111111111111L; UserInfoInterface userinfo =
	 * ServiceManager.getNewBlankUserInfo(); userinfo.setID(0);
	 * userinfo.setOrgId(0); userinfo.set(CenterUtil.REGION_ID,"240");
	 * ServiceManager.setServiceUserInfo(userinfo);
	 * CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID,"240");
	 * map.put("newBillId", "18240054387"); map.put("oldBillId", "13478118800");
	 * map.put("allConScore", "100"); map.put("type", type); map.put("level",
	 * level); map.put("levelDate", "20121011"); map.put("oprCode",oprCode);
	 * map.put("procId", prLong); map.put("effectDate", "20121011"); List
	 * list=new ArrayList(); map.put("scores",list); Map lisMap=new HashMap();
	 * lisMap.put("map", map); icm.transferCustScoreAndGrade(map);
	 * System.out.println("====="); }
	 */

	public Map getGroupPayPlan4BBoss(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty(parameter.get("CustServiceId")))
			ExceptionUtil.throwBusinessException("1022", "");

		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Successful operation");

		ICustomerValue value = new CustomerBean();
		value = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(parameter.get("CustServiceId").toString(), CmConstants.CustomerType.GROUP);
		DataContainer d = new DataContainer();
		d.set("CUST_ID", value.getCustId());
		IAccountProfileValue[] values = CmxServiceFactory.getLnAccountSV().queryAccountProfiles(d, -1, -1);
		List list = new ArrayList();
		for (int i = 0; i < values.length; i++) {
			Map m = new HashMap();
			m.put("PAYMENT_ID", values[i].getPaymentId());
			m.put("ACCT_ID", values[i].getAcctId());
			m.put("PAY_METHOD", values[i].getPayMethod());
			m.put("BANK_CONTRACT", values[i].getBankContract());
			m.put("PAYMENT_BANK_CODE", values[i].getPaymentBankCode());
			m.put("PAYMENT_ACCOUNT", values[i].getPaymentAccount());
			m.put("PAYMENT_ACCOUNT_NAME", values[i].getPaymentAccountName());
			m.put("PAYMENT_ACCOUNT_TYPE", values[i].getPaymentAccountType());
			m.put("PAYMENT_ACCOUNT_EXPIRE_DATE", values[i].getPayExpireDate());
			m.put("PRIORITY", values[i].getPriority());
			list.add(m);
		}
		Map returnValue = new HashMap();
		returnValue.put("PayPlanInfo", list);
		returnValue.put("Count", values.length);
		returnMap.put("returnObj", returnValue);
		return returnMap;
	}

	public Map getGrpCountInfoByMgrId(Map parameter) throws Exception {
		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Successful operation");
		String managerId = parameter.get("ManagerId").toString();
		int addGrpCount = 0;
		int delGrpCount = 0;
		int addMemCount = 0;
		int delMemCount = 0;
		StringBuilder querySql = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(QBOCmGroupCustomerBean.class).getMapingEnty());

		if (log.isDebugEnabled())
			log.debug("\n\nquerySql:" + querySql.toString() + "\n\n");

		// 前一天新增客户数
		StringBuilder addGrpSql = new StringBuilder("");
		Map addGrpParameter = new HashMap();
		addGrpSql.append(" and " + ICustomerValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		addGrpSql.append(" and DATE_FORMAT(" + ICustomerValue.S_CreateDate + ",'%Y-%m-%d')" + "= DATE_FORMAT((date_add(now(),interval -1 day)),'%Y-%m-%d')");
		addGrpSql.append(" and " + ICustomerValue.S_OpId + " = " + managerId);

		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySql.toString(), addGrpSql.toString(), addGrpParameter), addGrpParameter);
		addGrpCount = inter[0].getAsInt("CNT");

		// 前一天删除客户数
		StringBuilder delGrpSql = new StringBuilder("");
		Map delGrpParameter = new HashMap();
		delGrpSql.append(" and " + ICustomerValue.S_State + " = '" + CmConstants.RecordState.ERASE + "'");
		delGrpSql.append(" and DATE_FORMAT(" + ICustomerValue.S_DoneDate + ",'%Y-%m-%d')" + "= DATE_FORMAT((date_add(now(),interval -1 day)),'%Y-%m-%d')");
		delGrpSql.append(" and " + ICustomerValue.S_OpId + " = " + managerId);
		DataContainerInterface[] delInter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySql.toString(), delGrpSql.toString(), delGrpParameter), delGrpParameter);
		delGrpCount = delInter[0].getAsInt("CNT");

		// 前一天新增成员数
		StringBuilder querySqlMen = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupMemberBean.class).getMapingEnty());

		if (log.isDebugEnabled())
			log.debug("\n\nquerySql:" + querySqlMen.toString() + "\n\n");
		StringBuilder addMemSql = new StringBuilder("");
		Map addGrpMemParameter = new HashMap();
		addMemSql.append(" and " + IGroupMemberValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		addMemSql.append(" and DATE_FORMAT(" + IGroupMemberValue.S_CreateDate + ",'%Y-%m-%d')" + "= DATE_FORMAT((date_add(now(),interval -1 day)),'%Y-%m-%d')");
		addMemSql.append(" and " + IGroupMemberValue.S_OpId + " = " + managerId);
		DataContainerInterface[] addMem = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySqlMen.toString(), addMemSql.toString(), addGrpParameter), addGrpMemParameter);
		addMemCount = addMem[0].getAsInt("CNT");

		// 前一天删除成员数
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		String year = new SimpleDateFormat("yyyy").format(calendar.getTime());
		TableVars vars = new TableVars();
		vars.add("CM_GROUP_MEMBER_H", "DONE_DATE", year);
		StringBuilder querySqlMenDel = new StringBuilder(SplitTableFactory.createQuerySQL(ServiceManager.getObjectTypeFactory()
				.getObjectTypeByClass(BOCmGroupCustMemberHBean.class).getMapingEnty(), vars));

		if (log.isDebugEnabled())
			log.debug("\n\nquerySql:" + querySqlMenDel.toString() + "\n\n");

		StringBuilder delMemSql = new StringBuilder("");
		Map delGrpMemParameter = new HashMap();
		delMemSql.append(" and DATE_FORMAT(" + IGroupMemberValue.S_DoneDate + ",'%Y-%m-%d')" + "= DATE_FORMAT((date_add(now(),interval -1 day)),'%Y-%m-%d')");
		delMemSql.append(" and " + IGroupMemberValue.S_OpId + " = " + managerId);
		// 修改 by zouty 新增除去历史表中非删除数据
		delMemSql.append(" and not exists (select 1 from CM_GROUP_MEMBER M where t.USER_ID = M.USER_ID and M.STATE='U')");
		DataContainerInterface[] delMem = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(querySqlMenDel.toString(), delMemSql.toString(), delGrpMemParameter), delGrpMemParameter);
		delMemCount = delMem[0].getAsInt("CNT");

		Map m = new HashMap();
		m.put("ADD_COUNT", addGrpCount);
		m.put("DEL_COUNT", delGrpCount);
		m.put("ADD_MEMBER_COUNT", addMemCount);
		m.put("DEL_MEMBER_COUNT", delMemCount);
		returnMap.put("returnObj", m);
		return returnMap;
	}

	// 浦东发展银行的签约解约接口
	public Map signOrfireBank(Map parameter) throws Exception {
		String operType = parameter.get("OperType").toString();

		Map returnMap = new HashMap();// 返回Map
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Successful operation");
		if ("fire".equals(operType)) {
			if (isEmpty(parameter.get("BillId")) || isEmpty(parameter.get("AcctId")))
				ExceptionUtil.throwBusinessException("CMS95000077"); // CMS95000077
			ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);

			String returnStr = sv.fireBank(parameter.get("BillId").toString(), Long.parseLong(parameter.get("AcctId").toString()));
			returnMap.put("returnObj", returnStr);
		} else if ("sign".equals(operType)) {
			if (isEmpty(parameter.get("TradeSeq")) || isEmpty(parameter.get("BillId")) || isEmpty(parameter.get("BankCode")) || isEmpty(parameter.get("ActionDate")))
				ExceptionUtil.throwBusinessException("CMS95000078");// CMS95000078

			ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
			String returnStr = sv.signBank(parameter.get("TradeSeq").toString(), parameter.get("BillId").toString(), parameter.get("BankCode").toString(),
					parameter.get("ActionDate").toString());
			returnMap.put("returnObj", returnStr);
		}

		return returnMap;
	}

	public Map queryDiffAreaCustInfo(Map parameter) throws Exception, RemoteException {
		// Map returnobjMap = new HashMap();// 返回Map

		Map returnMap = new HashMap();// 返回Map
		returnMap.put("result", "00");
		returnMap.put("resultDesc", "Success");

		String billId = parameter.get("idValue").toString();
		String password = parameter.get("password").toString();
		String certType = parameter.get("idCardType").toString();
		String certCode = parameter.get("idCardNum").toString();

		List infoTypes = (List) parameter.get("infoTypes");
		ICrmFSV sv = (ICrmFSV) ServiceFactory.getCrossCenterService(ICrmFSV.class);

		ICustomerValue customerValue = null;
		IInsUserValue insUserValue = sv.getInsUser(0L, billId);

		if (insUserValue == null) {
			returnMap.put("result", "02");
			returnMap.put("resultDesc", "The number is not a mobile number");
			return returnMap;
		}

		Long custId = insUserValue.getCustId();

		if (password != null && !"".equals(password)) {
			// modify by caiyu 20121025 按照唐小禹提供的新接口进行修改
			Map map = sv.vfyPass4SR(billId, password);

			if (map != null) {
				if (!(Boolean) map.get("isSuccess")) {
					returnMap.put("result", "04");
					returnMap.put("resultDesc", "Password verification is not passed");
					return returnMap;
				}
			} else {
				returnMap.put("result", "04");
				returnMap.put("resultDesc", "Password verification is not passed");
				return returnMap;
			}

			// Map map = sv.verifyUserPassword(billId, password);
			// if (map.get("IsWeakPwd") != "1") {
			// returnobjMap.put("returnCode", "04");
			// returnobjMap.put("returnMsg", "密码校验不通过");
			// returnMap.put("result", "04");
			// returnMap.put("resultDesc", "密码校验不通过");
			// returnobjMap.put("returnObj", returnMap);
			// return returnobjMap;
			// }
		} else {
			if (certCode == null || certCode.equals("")) {
				returnMap.put("result", "06");
				returnMap.put("resultDesc", "Customer identification number wrong");
				return returnMap;
			}
			if (certType == null || certType.equals("")) {
				returnMap.put("result", "05");
				returnMap.put("resultDesc", "Customer identification type error");
				return returnMap;
			}

			boolean isPass = false;

			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustId, custId);
			conditionDC.set(ICustomerValue.S_CustCertCode, certCode);
			conditionDC.set(ICustomerValue.S_CustCertType, certType);
			conditionDC.set(ICustomerValue.S_State, "U");

			// 直接使用客户综合查询即可！
			ICustomerValue[] customerValues = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class))
					.queryData(new DataContainer[] { conditionDC }, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(customerValues)) {
				isPass = true;
				customerValue = customerValues[0];
			}

			if (!isPass) {
				returnMap.put("result", "05");
				returnMap.put("resultDesc", "No inquiry into the customer information");
				return returnMap;
			}
		}

		// 查询客户

		if (customerValue == null) {
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustId, custId);
			conditionDC.set(ICustomerValue.S_State, "U");

			// 直接使用客户综合查询即可！
			ICustomerValue[] customerValues = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class))
					.queryData(new DataContainer[] { conditionDC }, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(customerValues)) {
				customerValue = customerValues[0];
			} else {
				returnMap.put("result", "05");
				returnMap.put("resultDesc", "No inquiry into the customer information");
				return returnMap;
			}
		}

		// 可兑换积分
		ICmTeamInvokeSV teamSv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		long points = teamSv.getIndivScoreByUserId(insUserValue.getUserId());

		returnMap.put("pointBalance", points);

		// 信誉额度
		IInsAccrelValue[] accrels = sv.getInstAccrelByUserId(insUserValue.getUserId(), 1, -1);

		if (null != accrels && accrels.length > 0) {
			long acctId = accrels[0].getAcctId();
			// 查询账户信息
			ICmAccountSV cmAccount = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			IAccountValue accountValue = cmAccount.queryAccountById(acctId);
			if (null == accountValue) {
				returnMap.put("credit", "");
			}
			returnMap.put("credit", customerValue.getCreditValue() + "");
		}

		//
		// // 客户余额
		// IAms2CrmBjSV ams2CrmBj =
		// (IAms2CrmBjSV)ServiceFactory.getService(IAms2CrmBjSV.class);
		// Map resultMap =
		// ams2CrmBj.qryAcctInfo(insAccrel.getAcctId(),billId,true,true);
		// long balance = Long.parseLong(resultMap.get("BALANCE").toString());
		// //计算到厘
		// balance = balance * 1000;
		// custInfoRspData.setBalance(balance);

		// 欠费金额
		// long debtBalance =
		// Long.parseLong(resultMap.get("OWE_FEE").toString());
		// debtBalance = debtBalance * 1000;
		// custInfoRspData.setDebtBalance(debtBalance);

		// 客户级别
		int level = 100;
		ICmClubMemberSV memberSv = (ICmClubMemberSV) ServiceFactory.getService(ICmClubMemberSV.class);
		IClubMemberValue memberValue = memberSv.queryVIPClubMemberByBillId(billId);

		String isVip = CrmLocaleFactory.getResource("SOS0030982");// 否
		String vipCode = "";
		// modify by caiyu
		if (null == memberValue) {
			// level = 100;
			level = 0;
		} else {
			if ("1".equals(memberValue.getMemberLevel())) {
				// level = 301;
				level = 3;
			} else if ("2".equals(memberValue.getMemberLevel())) {
				// level = 302;
				level = 2;
			} else if ("3".equals(memberValue.getMemberLevel())) {
				// level = 303;
				level = 1;
			}
			// else if ("4".equals(memberValue.getMemberLevel()))
			// {
			// level = 300;
			// }
			else {
				// level = 200;
				level = 0;
			}
			isVip = CrmLocaleFactory.getResource("SOS3050685");// 是

			IClubMemberCardValue cardValue = memberSv.queryClubMemberCardByMemberId(memberValue.getMemberId());

			if (null != cardValue) {
				vipCode = cardValue.getCardCode();
			}
		}
		returnMap.put("level", level);

		// 客户状态
		String userState = "";
		if ("3".equals(insUserValue.getState())) {
			userState = "03";
		} else {
			IStopOpenOsStatusSV osStatusSV = (IStopOpenOsStatusSV) BceSVUtil.getSVService(IStopOpenOsStatusSV.class);
			String osFlag = osStatusSV.getOsStatusValue(insUserValue.getUserId(), OrderConst.VALID_TYPE_NOW);
			if (osFlag != null && !"".equals(osFlag)) {
				String subOsFlag = StringUtils.substring(osFlag, 0, 34);
				int index = subOsFlag.indexOf("1");
				if (index == -1) {
					userState = "00";
				} else {
					if (subOsFlag.substring(8, 9).equals("1") || subOsFlag.substring(9, 10).equals("1") || subOsFlag.substring(10, 11).equals("1")
							|| subOsFlag.substring(28, 29).equals("1")) {
						userState = "01";
					} else {
						userState = "02";
					}
				}
			}
		}
		returnMap.put("status", userState);

		// 客户姓名
		String custName = customerValue.getCustName();
		returnMap.put("userName", custName);

		ICmContactSV cmcontactService = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		IQBOCmIndivContactValue cmIndivConcat = (IQBOCmIndivContactValue) cmcontactService.queryIndivContactByCustId(insUserValue.getCustId());

		// 联系地址
		// modify by caiyu 默认证件地址
		String concatAddress = customerValue.getCustCertAddress();
		if (null == concatAddress || "".equals(concatAddress)) {
			concatAddress = "Address unknown";
		}

		// 联系电话
		// modify by caiyu 默认手机号码
		String userNum = insUserValue.getBillId();

		if (null != cmIndivConcat) {
			concatAddress = cmIndivConcat.getContAddress();
			userNum = cmIndivConcat.getContMobile();
		}
		// 联系电话
		returnMap.put("userNum", userNum);
		returnMap.put("userAdd", concatAddress);

		// 证件类型
		int custCertType = customerValue.getCustCertType();
		if (custCertType == 1) {
			returnMap.put("idCardType", "00");
		} else if (custCertType == 2) {
			returnMap.put("idCardType", "02");
		} else if (custCertType == 3) {
			returnMap.put("idCardType", "04");
		} else if (custCertType == 4) {
			returnMap.put("idCardType", "05");
		} else {
			returnMap.put("idCardType", "99");
		}

		// 查询资源处信息
		String puckCode = "";
		IRes2CmSV resCm = (IRes2CmSV) ServiceFactory.getService(IRes2CmSV.class);
		IBOResSimCardUsedValue simCard = resCm.getUsedSimCardInfoByImsi(insUserValue.getSubBillId(), insUserValue.getRegionId());
		if (null != simCard) {
			puckCode = simCard.getPuk1();
		}
		returnMap.put("puk", puckCode);

		// 证件号码
		returnMap.put("idCardNum", customerValue.getCustCertCode());

		// 用户品牌
		// IPrjInstanceQrySV prjInstanceQry = (IPrjInstanceQrySV)
		// ServiceFactory.getService(IPrjInstanceQrySV.class);
		// IQUserBaseInfoValue userInfo =
		// prjInstanceQry.getUserBaseInfoByBillId(billId);
		String brandId = "";
		// if (RBossConst.USER_BRAND_ID_GOTONE == userInfo.getBrandId()) {// 全球通
		// brandId = "01";
		// } else if (RBossConst.USER_BRAND_ID_EASYOWN_PUBLIC ==
		// userInfo.getBrandId() ||
		// RBossConst.USER_BRAND_ID_STANDARD_EASYOWN == userInfo.getBrandId())
		// {// 神州行
		// brandId = "02";
		// } else if (RBossConst.USER_BRAND_ID_MZONE == userInfo.getBrandId())
		// {// 动感地带
		// brandId = "03";
		// } else {// 其他
		// brandId = "09";
		// }
		returnMap.put("brand", brandId);

		// 入网时间
		Date oprTime = insUserValue.getCreateDate();
		// modify by caiyu 20121113 修改时间格式
		DateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
		returnMap.put("oprTime", dateformat.format(oprTime));

		// 查询用户所有服务
		IQInsProdInsSrvAttrValue[] insProdList = SoServiceFactory.getInstanceQrySV().getInsProdInsSrvAttrByUserIdAndProdType(insUserValue.getUserId(), -1, null,
				OrderConst.VALID_TYPE_NOW);
		if (null == insProdList || 0 >= insProdList.length) {
			ExceptionUtil.throwBusinessException("SOS3021786");
		}
		StringBuffer sb = new StringBuffer(" ");
		boolean isGprs = false;
		boolean isRoam = false;
		for (int i = 0; i < insProdList.length; i++) {
			if (RBossConst.WORLD_ROAM_SERVICE_ID == insProdList[i].getServiceId()) {
				sb.append(CrmLocaleFactory.getResource("SOS2021128")).append(" ");// SOS2021128 国际漫游
				isRoam = true;
			}
			if (RBossConst.WORLD_CALL_SERVICE_ID == insProdList[i].getServiceId()) {
				sb.append(CrmLocaleFactory.getResource("SOS3041845")).append(" ");// 国际长途
			}
			// if (RBossConst.INNER_ROAM_SERVICE_ID ==
			// insProdList[i].getServiceId()) {
			// sb.append(CrmLocaleFactory.getResource("SOS3041846")).append("
			// ");// 国内漫游
			// }
			// if (RBossConst.INNER_CALL_SERVICE_ID ==
			// insProdList[i].getServiceId()) {
			// sb.append(CrmLocaleFactory.getResource("SOS3041847")).append("
			// ");// 国内长途
			// }
			if (RBossConst.CLOSE_SHORT_MSG_SERVICE_ID == insProdList[i].getServiceId()) {// 关闭短消息，如果订购了，则表示没有短消息。
				// sb.append(CrmLocaleFactory.getResource("SOS3041848")).append("
				// ");
				sb.append("CLOSE_SHORT_MSG_SERVICE_ID ");
			}
			if (RBossConst.GPRS_SERVICE_ID == insProdList[i].getServiceId()) {
				sb.append("GPRS ").append(" ");
				isGprs = true;
			}
		}
		String s = sb.toString();
		if (s.indexOf("CLOSE_SHORT_MSG_SERVICE_ID") > 0) {
			s = s.replaceAll("CLOSE_SHORT_MSG_SERVICE_ID", "");
		} else {
			s = s + " Short Message ";
		}
		// 基本服务开放情况
		returnMap.put("servOpr", s);

		// 基本业务开放情况
		returnMap.put("basicOpr", "");
		// 增值业务开放情况
		returnMap.put("increOpr", "");

		// 归属地
		// modify by caiyu 20121108,需要等待杨大伟提供方法后，修改获取地市名称的方法。
		// IBOBsStaticDataValue staticDataValue =
		// StaticDataUtil.getStaticData("CM_CITY_20000240",
		// insUserValue.getRegionId());
		ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		BOBsDistrictBean regionBean = iseCm.getDistrictByRegionId(insUserValue.getRegionId());
		if (regionBean != null)
			returnMap.put("homeProv", "Liaoning Province" + regionBean.getDistrictName());
		else
			returnMap.put("homeProv", "Liaoning Province");

		int gender = customerValue.getGender();
		String sex = null;
		if (CmConstants.GenderType.MALE == gender) {
			sex = "0";
		} else if (CmConstants.GenderType.FEMALE == gender) {
			sex = "1";
		} else {
			sex = "2";
		}
		String createDateStr = "";
		if (null != insUserValue.getCreateDate()) {
			createDateStr = TimeUtil.getYYYYMMDDHHMMSS(insUserValue.getCreateDate());
		}
		// 二级对象List
		List custInfoContList = new ArrayList();
		// 查询详细类别资料
		if (null != infoTypes && !infoTypes.isEmpty()) {
			for (int i = 0; i < infoTypes.size(); i++) {
				String infoType = (String) infoTypes.get(i);
				if ("0".equals(infoType)) {// 基本信息
					CustInfoCont baseInfoCont = new CustInfoCont();
					baseInfoCont.setInfoTypeId(infoType);

					List baseInfoContItemList = new ArrayList();
					baseInfoContItemList.add(this.setCustInfoItemValue("100", Long.toString(customerValue.getCustId())));
					baseInfoContItemList.add(this.setCustInfoItemValue("101", customerValue.getCustName()));
					baseInfoContItemList.add(this.setCustInfoItemValue("102", sex));
					baseInfoContItemList.add(this.setCustInfoItemValue("103", custCertType + ""));
					baseInfoContItemList.add(this.setCustInfoItemValue("104", customerValue.getCustCertCode()));
					if (cmIndivConcat != null) {
						baseInfoContItemList.add(this.setCustInfoItemValue("105", cmIndivConcat.getContMobile()));
						baseInfoContItemList.add(this.setCustInfoItemValue("106", customerValue.getCustZipcode()));
						baseInfoContItemList.add(this.setCustInfoItemValue("107", cmIndivConcat.getContAddress()));// 通信地址
						baseInfoContItemList.add(this.setCustInfoItemValue("108", cmIndivConcat.getContFax()));
						baseInfoContItemList.add(this.setCustInfoItemValue("109", cmIndivConcat.getContEmail()));
						baseInfoContItemList.add(this.setCustInfoItemValue("110", cmIndivConcat.getContName()));
						baseInfoContItemList.add(this.setCustInfoItemValue("111", cmIndivConcat.getContMobile()));
					}
					baseInfoContItemList.add(this.setCustInfoItemValue("112", customerValue.getCustAddress()));
					baseInfoContItemList.add(this.setCustInfoItemValue("113", customerValue.getCustCertAddress()));
					baseInfoContItemList.add(this.setCustInfoItemValue("114", Long.toString(points)));// 积分
					baseInfoContItemList.add(this.setCustInfoItemValue("115", level + ""));// 客户级别
					baseInfoContItemList.add(this.setCustInfoItemValue("116", isVip));
					baseInfoContItemList.add(this.setCustInfoItemValue("117", vipCode));
					baseInfoContItemList.add(this.setCustInfoItemValue("118", createDateStr));
					baseInfoContItemList.add(this.setCustInfoItemValue("119", userState));// 用户状态
					baseInfoContItemList.add(this.setCustInfoItemValue("120", ""));// 状态变更日期
					baseInfoContItemList.add(this.setCustInfoItemValue("121", insUserValue.getRemarks()));
					baseInfoContItemList.add(this.setCustInfoItemValue("122", puckCode));// puck码
					baseInfoContItemList.add(this.setCustInfoItemValue("123", Long.toString(customerValue.getCreditValue())));// 信用度
					baseInfoContItemList.add(this.setCustInfoItemValue("124", ""));// 增值业务开放情况 默认为空
					baseInfoContItemList.add(this.setCustInfoItemValue("125", ""));// 数据业务开放情况 默认为空
					baseInfoContItemList.add(this.setCustInfoItemValue("126", "Liaoning"));// 归属地名称

					baseInfoCont.setInfoItems(baseInfoContItemList);
					custInfoContList.add(baseInfoCont);

				} else if ("4".equals(infoType)) {// 账单资料

					// java.util.Date dateFrom = custInfoDataBean.getDateFrom();
					// java.util.Date dateTo = custInfoDataBean.getDateTo();
					// if(null!=dateFrom&&null!=dateTo){
					// Long[] yearMonths =
					// this.getQryYearMonthByDateFromTo(dateFrom, dateTo);
					// if(yearMonths.length>0){
					// for(int j=0;j<yearMonths.length;j++){
					// CustInfoCont acctInfoCont = amSV.f418(accrel.getAcctId(),
					// yearMonths[j].longValue());
					// acctInfoCont.setInfoTypeId(infoType);
					// if(null!=acctInfoCont){
					// custInfoContList.add(acctInfoCont);
					// }
					// }
					// }
					// }

				} else if ("5".equals(infoType)) {// 大客户资料

					CustInfoCont vipInfoCont = new CustInfoCont();
					vipInfoCont.setInfoTypeId(infoType);

					List vipInfoContItemList = new ArrayList();
					vipInfoContItemList.add(this.setCustInfoItemValue("601", customerValue.getCustName()));// 姓名
					vipInfoContItemList.add(this.setCustInfoItemValue("602", sex));// 性别
					vipInfoContItemList.add(this.setCustInfoItemValue("603", ""));// 账务周期
					vipInfoContItemList.add(this.setCustInfoItemValue("604", custCertType + ""));// 身份证类型
					vipInfoContItemList.add(this.setCustInfoItemValue("605", customerValue.getCustCertCode()));// 身份证号码
					vipInfoContItemList.add(this.setCustInfoItemValue("606", ""));// 婚姻状况
					vipInfoContItemList.add(this.setCustInfoItemValue("607", ""));// 教育程度
					vipInfoContItemList.add(this.setCustInfoItemValue("608", billId));// 手机号码
					if (cmIndivConcat != null && null != cmIndivConcat.getContMobile()) {
						vipInfoContItemList.add(this.setCustInfoItemValue("609", cmIndivConcat.getContMobile()));// 联系电话
					} else
						vipInfoContItemList.add(this.setCustInfoItemValue("609", ""));// 联系电话
					if (cmIndivConcat != null && null != cmIndivConcat.getContAddress()) {
						vipInfoContItemList.add(this.setCustInfoItemValue("610", cmIndivConcat.getContAddress()));// 通信地址
					} else
						vipInfoContItemList.add(this.setCustInfoItemValue("610", ""));// 通信地址

					// if(null!=manager){
					// vipInfoContItemList.add(this.setCustInfoItemValue("611",
					// Long.toString(manager.getOpId())));//客户经理工号
					// vipInfoContItemList.add(this.setCustInfoItemValue("627",
					// manager.getBillId()));// 大客户经理电话
					// } else {
					// vipInfoContItemList.add(this.setCustInfoItemValue("611",
					// ""));//客户经理工号
					// vipInfoContItemList.add(this.setCustInfoItemValue("627",
					// ""));// 大客户经理电话
					// }
					vipInfoContItemList.add(this.setCustInfoItemValue("612", vipCode));// VIP卡号
					vipInfoContItemList.add(this.setCustInfoItemValue("613", ""));// 历史标识 保留档案库
					vipInfoContItemList.add(this.setCustInfoItemValue("614", level + ""));// 客户级别编码
					vipInfoContItemList.add(this.setCustInfoItemValue("615", Long.toString(points)));// 客户积分余额
					vipInfoContItemList.add(this.setCustInfoItemValue("616", ""));// 账号
					vipInfoContItemList.add(this.setCustInfoItemValue("617", insUserValue.getCreateDate().toString()));// 开户时间

					// 业务信息

					vipInfoContItemList.add(this.setCustInfoItemValue("618", ""));// 开通增值业务种类
					vipInfoContItemList.add(this.setCustInfoItemValue("619", ""));// 开通增值业务种类数量

					vipInfoCont.setInfoItems(vipInfoContItemList);
					custInfoContList.add(vipInfoCont);
				}
			}
		}
		returnMap.put("infoCont", custInfoContList);

		return returnMap;
	}

	/**
	 * 数据转换 queryDiffAreaCustInfo方法用
	 * 
	 * @param itemId
	 * @param itemCont
	 * @return
	 * @throws Exception
	 */
	private CustInfoItem setCustInfoItemValue(String itemId, String itemCont) throws Exception {
		CustInfoItem custInfoItem = new CustInfoItem();
		custInfoItem.setItemId(itemId);
		custInfoItem.setItemCont(itemCont);
		return custInfoItem;
	}

	public Map qryVipInfo(Map parameter) throws Exception {
		if (isEmpty(parameter.get("BillId"))) {
			ExceptionUtil.throwBusinessException("CMS95000079");// CMS95000079
			// 参数手机号码不存在
		}

		String billId = parameter.get("BillId").toString();

		if ("".equals(billId))
			ExceptionUtil.throwBusinessException("CMS95000080");// CMS95000080
		// 参数手机号码为空串

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		// 查询会员是否存在
		IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);

		if (CmCommonUtil.isNotEmptyObject(memberValue)) {
			if (memberValue.getMemberLevel() == 0) {
				memberValue = null;
			}
		}
		returnMap.put("returnObj", memberValue);

		return returnMap;
	}

	public Map addGrpCustomer4BBoss(Map parameter) throws Exception {
		// TODO Auto-generated method stub
		Map resultMap = new HashMap();
		resultMap.put("OprTime", CmCommonUtil.getSysDate());
		resultMap.put("RspCode", "00");
		resultMap.put("RspDesc", "Success");
		Map valueIns = (Map) parameter.get("map");
		Map customerInfo = (Map) valueIns.get("CustomerInfo");
		int action = Integer.valueOf(customerInfo.get("Action").toString());
		switch (action) {
			case 1: // 新增
				Map customerValue = (Map) customerInfo.get("Customer");
				if (CmCommonUtil.isEmptyObject(customerValue)) {
					resultMap.put("OprTime", CmCommonUtil.getSysDate());
					resultMap.put("RspCode", "99");
					resultMap.put("RspDesc", "Fails, the client 's information can not be empty");
					return resultMap;
				}
				ICustomerValue ecCount = CmServiceFactory.getCustomerSV().queryCustomerByEcCode(customerValue.get("CustomerNumber").toString(), CmConstants.CustomerType.GROUP);
				if (CmCommonUtil.isNotEmptyObject(ecCount)) {
					resultMap.put("OprTime", CmCommonUtil.getSysDate());
					resultMap.put("RspCode", "99");
					resultMap.put("RspDesc", "ECCODE already exists for the" + customerValue.get("CustomerNumber").toString() + "Group's customers");
					return resultMap;
				}
				CustomerBean customer = new CustomerBean();
				// 第一步：新增集团客户 往cm_party
				customer.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				/** 上级集团* */
				customer.set(ICustomerValue.S_ParentCustId, customerInfo.get("ParentCustomerNumber").toString());
				/** 客户名称* */
				customer.set(ICustomerValue.S_CustName, customerValue.get("CustomerName").toString());
				/** 区域* */
				customer.set(ICustomerValue.S_RegionId, "240");
				/** ECCODE */
				customer.set(ICustomerValue.S_EcCode, customerValue.get("CustomerNumber").toString());
				/** 证件* */
				customer.set(ICustomerValue.S_CustCertType, 7);
				/** 证件号码* */
				customer.set(ICustomerValue.S_CustCertCode, "Undocumented number");
				// TODO 需要转级别
				String level = customerValue.get("CreditLevelID").toString();
				if ("01".equals(level)) {
					level = "11";
				}
				if ("02".equals(level)) {
					level = "12";
				}
				if ("03".equals(level)) {
					level = "21";
				}
				if ("04".equals(level)) {
					level = "22";
				}
				if ("05".equals(level)) {
					level = "30";
				}
				if ("06".equals(level)) {
					level = "40";
				}
				// 下发集团默认为I级刘威南 70
				/** 集团级别* */
				customer.set(ICustomerValue.S_CustServiceLevel, "70");
				customer.set(ICustomerValue.S_CustStatus, CmConstants.CustomerStatus.GROUP_POTENTIAL);
				/** 邮编* */
				if (!isEmpty(customerValue.get("PostCode"))) {
					customer.set(ICustomerValue.S_CustZipcode, customerValue.get("PostCode").toString());
				}
				/** 地址* */
				if (!isEmpty(customerValue.get("AddressFullName"))) {
					customer.set(ICustomerValue.S_CustAddress, customerValue.get("AddressFullName").toString());
				}
				/** 网址* */
				if (!isEmpty(customerValue.get("Homepage"))) {
					customer.set(ICustomerValue.S_GroupWeb, customerValue.get("Homepage").toString());
				}
				if (!isEmpty(customerValue.get("NationID"))) {
					/** 国家* */
					customer.set(ICustomerValue.S_Nationality, customerValue.get("NationID").toString());
				}
				customer.set(ICustomerValue.S_ProvinceId, CmDistrictUtil.getProvinceCode());
				IBOBsDistrictValue tmpRegionValue = DistrictUtil.getRegion()[0];
				IBOBsDistrictValue tmpCountyValue = DistrictUtil.getCountyByRegionDistrictId(tmpRegionValue.getDistrictId())[0];
				customer.set(ICustomerValue.S_CityId, tmpRegionValue.getRegionId());
				customer.set(ICustomerValue.S_CountyId, tmpCountyValue.getRegionId());
				customer.set(ICustomerValue.S_CreditLevel, 1);
				customer.set(ICustomerValue.S_CreditValue, 60);
				customer.set(ICustomerValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
				customer.set(ICustomerValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
				/** 法人代表* */
				if (!isEmpty(customerValue.get("Corporation"))) {
					customer.set(ICustomerValue.S_LegalCustName, customerValue.get("Corporation").toString());
				}
				/** 行业类型* */
				customer.set(ICustomerValue.S_Vocation, 21);
				customer.set(ICustomerValue.S_SubVocation, 0);
				/** 企业类型* */
				if (!isEmpty(customerValue.get("OrganizationTypeID"))) {
					customer.set(ICustomerValue.S_GroupType, customerValue.get("OrganizationTypeID").toString());
				}
				// customer.set(ICustomerValue.S_CustCertCode, "testCertCode");
				// TODO 信用等级、信誉度、提供数据给经分

				long groupCustId = CmServiceFactory.getCustomerSV().saveCustomer(customer);
				Map manager = (Map) customerInfo.get("CustomerManager");
				customer.set(ICustomerValue.S_Remarks, "BBOSS group customers issued");
				// 如果下发客户经理信息暂时拼成字符串保存在REMARKS字段
				if (CmCommonUtil.isNotEmptyObject(manager)) {

					BOCmGroupManagerBean managerBean = new BOCmGroupManagerBean();
					managerBean.set(IBOCmGroupManagerValue.S_RelId, CmCommonUtil.getNewSequence(BOCmGroupManagerBean.class));
					managerBean.set(IBOCmGroupManagerValue.S_CustId, groupCustId);
					managerBean.set(IBOCmGroupManagerValue.S_ManagerId, CmLnConstants.BbossOpAndOgr.OPID);
					managerBean.set(IBOCmGroupManagerValue.S_OperType, 0);
					managerBean.set(IBOCmGroupManagerValue.S_RelType, 1);
					managerBean.set(IBOCmGroupManagerValue.S_State, CmConstants.RecordState.USE);
					managerBean.set(IBOCmGroupManagerValue.S_CreateOpId, CmLnConstants.BbossOpAndOgr.OPID);
					managerBean.set(IBOCmGroupManagerValue.S_CreateOrgId, CmLnConstants.BbossOpAndOgr.ORGID);
					managerBean.set(IBOCmGroupManagerValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
					managerBean.set(IBOCmGroupManagerValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
					managerBean.set(IBOCmGroupManagerValue.S_CreateDate, CmCommonUtil.getSysDate());
					managerBean.set(IBOCmGroupManagerValue.S_DoneDate, CmCommonUtil.getSysDate());
					managerBean.set(IBOCmGroupManagerValue.S_EffectiveDate, CmCommonUtil.getSysDate());
					managerBean.set(IBOCmGroupManagerValue.S_ExpireDate, CmLnCommonUtil.getMaxDate());
					managerBean.set(IBOCmGroupManagerValue.S_RegionId, 240);
					CmInnerServiceFactory.getCommonInnerSV().saveBean(managerBean);
					/*
					 * StringBuffer mSb = new StringBuffer(); String staffNum = "";
					 * if(!isEmpty(manager.get("StaffNumber"))) { staffNum =
					 * manager.get("StaffNumber").toString(); } String staffName =
					 * manager.get("StaffName").toString(); if
					 * (!isEmpty(manager.get("ContactPhone"))) { String cPhone =
					 * String.valueOf(manager.get("ContactPhone"));
					 * //mSb.append("&联系电话:").append(cPhone); } if
					 * (!isEmpty(manager.get("MobilePhone"))) { String mPhone =
					 * String.valueOf(manager.get("MobilePhone"));
					 * mSb.append("&手机:").append(mPhone); }
					 *//** 客户经理工号* */
					/*
				 *//** 客户经理名称* */
					/*
				 *//** 联系电话* */
					/*
					 * mSb.append("集团下发客户资料{客户经理工号:").append(staffNum).append("&姓名:").append(staffName);
					 *//** 手机* */
					/*
					 * mSb.append("}"); customer.set(ICustomerValue.S_Remarks,
					 * mSb.toString());
					 */
				}

				// TODO 新增集团扩展信息
				List extInfos = (List) customerInfo.get("ExtInfo");
				BOCmxGroupCustMemberBean cmxcustomer = new BOCmxGroupCustMemberBean();
				cmxcustomer.set(IBOCmxGroupCustMemberValue.S_SecVocation, 0);
				cmxcustomer.set(IBOCmxGroupCustMemberValue.S_CustId, groupCustId);
				cmxcustomer.set(IBOCmxGroupCustMemberValue.S_RegionId, "240");
				cmxcustomer.set(IBOCmxGroupCustMemberValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
				cmxcustomer.set(IBOCmxGroupCustMemberValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
				if (CmCommonUtil.isNotEmptyObject(extInfos)) {
					Map extInfo = (Map) extInfos.get(0);
					/** *注册资金* */
					if (!isEmpty(customerValue.get("LoginFinancing"))) {
						cmxcustomer.set(IBOCmxGroupCustMemberValue.S_EntFund, customerValue.get("LoginFinancing").toString());
					}
					/** 服务级别* */
					if (!isEmpty(customerValue.get("CustomerServLevel"))) {
						cmxcustomer.set(IBOCmxGroupCustMemberValue.S_ServiceLevel, customerValue.get("CustomerServLevel").toString());
					}
					/** 员工平均话费* */
					if (!isEmpty(extInfo.get("AvgFee"))) {
						cmxcustomer.set(IBOCmxGroupCustMemberValue.S_EmpAvgFee, extInfo.get("AvgFee").toString());
					}
					/** 报销额度* */
					if (!isEmpty(extInfo.get("Quota"))) {
						cmxcustomer.set(IBOCmxGroupCustMemberValue.S_WriteOffAmount, extInfo.get("Quota").toString());
					}
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBean(cmxcustomer);

				// 第四步 新增加关键人信息，如果是多个关键人信息，需要循环来做
				IVOCustValue custValue = new VOCustBean();
				List keymans = (List) customerInfo.get("KeyPersons");
				if (CmCommonUtil.isNotEmptyObject(keymans)) {
					for (int k = 0; k < keymans.size(); k++) {
						Map keyman = (Map) keymans.get(k);
						if (CmCommonUtil.isNotEmptyObject(keyman)) {
							customer.clear();
							customer.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
							if (!isEmpty(keyman.get("PartyName"))) {
								customer.set(ICustomerValue.S_CustName, keyman.get("PartyName").toString());
							}
							customer.set(ICustomerValue.S_CustCertType, 7);
							customer.set(ICustomerValue.S_CustCertCode, "BBOSS group customers issued");
							customer.set(ICustomerValue.S_RegionId, "240");
							customer.set(ICustomerValue.S_CustStatus, 1);
							customer.set(ICustomerValue.S_RealNameFlag, 0);
							customer.set(ICustomerValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
							customer.set(ICustomerValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);

							long keyCustId = CmServiceFactory.getCustomerSV().saveCustomer(customer);

							IContactValue iContactValue = new ContactBean();
							iContactValue = CmServiceFactory.getContactSV().queryCustContactById(-1, keyCustId);

							if (iContactValue == null) {
								ExceptionUtil.throwBusinessException("CMS95000081");// CMS95000081
								// 根据条件查询联系人信息失败!
							}

							iContactValue.set(iContactValue.S_CustId, groupCustId);
							iContactValue.set(iContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_KEY_PERSON);
							iContactValue.set(iContactValue.S_OpId, CmLnConstants.BbossOpAndOgr.OPID);
							iContactValue.set(iContactValue.S_OrgId, CmLnConstants.BbossOpAndOgr.ORGID);
							// 查询集团联系人关系表，判断这个联系人是否存在
							/*
							 * DataContainer queryDC = new DataContainer();
							 * queryDC.clear(); queryDC.set(iContactValue.S_CustId,
							 * groupCustId); queryDC.set(iContactValue.S_ContId,
							 * iContactValue.getContId());
							 * queryDC.set(iContactValue.S_ContType,
							 * CmLnConstants.GroupContType.GROUP_KEY_PERSON); int
							 * count =
							 * CmServiceFactory.getContactSV().queryCustContactCount(queryDC); //
							 * 该用户[{0}]已经是集团关键人！ if (count > 0) {
							 * ExceptionUtil.throwBusinessException("CMS5000089"); }
							 */
							custValue.addContact(iContactValue);
						}
					}
					CmServiceFactory.getContactSV().saveCustContact(custValue);
				}
				resultMap.put("CUST_ID", groupCustId);
				break;
			case 2:
				Map updateValue = (Map) customerInfo.get("Customer");
				if (CmCommonUtil.isEmptyObject(updateValue)) {
					resultMap.put("OprTime", CmCommonUtil.getSysDate());
					resultMap.put("RspCode", "99");
					resultMap.put("RspDesc", "Fails, the client 's information can not be empty");
					return resultMap;
				}
				if (CmCommonUtil.isEmptyObj(updateValue.get("CustomerNumber"))) {
					resultMap.put("OprTime", CmCommonUtil.getSysDate());
					resultMap.put("RspCode", "99");
					resultMap.put("RspDesc", "ecCode can not be empty");
					return resultMap;
				}
				ICustomerValue ecCustomerValue = CmServiceFactory.getCustomerSV().queryCustomerByEcCode(updateValue.get("CustomerNumber").toString(),
						CmConstants.CustomerType.GROUP);
				if (CmCommonUtil.isEmptyObject(ecCustomerValue)) {
					resultMap.put("OprTime", CmCommonUtil.getSysDate());
					resultMap.put("RspCode", "99");
					resultMap.put("RspDesc", " there is no ECCODE" + updateValue.get("CustomerNumber").toString() + "Group's customers");
					return resultMap;
				}
				CustomerBean customerUpdate = new CustomerBean();
				customerUpdate.copy(ecCustomerValue);
				customerUpdate.setStsToOld();
				// 第一步：新增集团客户 往cm_party
				/** 上级集团* */
				customerUpdate.set(ICustomerValue.S_ParentCustId, customerInfo.get("ParentCustomerNumber").toString());
				/** 客户名称* */
				customerUpdate.set(ICustomerValue.S_CustName, updateValue.get("CustomerName").toString());
				// TODO 需要转级别
				/** 邮编* */
				if (!isEmpty(updateValue.get("PostCode"))) {
					customerUpdate.set(ICustomerValue.S_CustZipcode, updateValue.get("PostCode").toString());
				}
				/** 地址* */
				if (!isEmpty(updateValue.get("AddressFullName"))) {
					customerUpdate.set(ICustomerValue.S_CustAddress, updateValue.get("AddressFullName").toString());
				}
				/** 网址* */
				if (!isEmpty(updateValue.get("Homepage"))) {
					customerUpdate.set(ICustomerValue.S_GroupWeb, updateValue.get("Homepage").toString());
				}
				if (!isEmpty(updateValue.get("NationID"))) {
					/** 国家* */
					customerUpdate.set(ICustomerValue.S_Nationality, updateValue.get("NationID").toString());
				}
				/** 法人代表* */
				if (!isEmpty(updateValue.get("Corporation"))) {
					customerUpdate.set(ICustomerValue.S_LegalCustName, updateValue.get("Corporation").toString());
				}
				/** 企业类型* */
				if (!isEmpty(updateValue.get("OrganizationTypeID"))) {
					customerUpdate.set(ICustomerValue.S_GroupType, updateValue.get("OrganizationTypeID").toString());
				}
				// TODO 信用等级、信誉度、提供数据给经分
				CmServiceFactory.getCustomerSV().saveCustomer(customerUpdate);

				// TODO 新增集团扩展信息
				List extInfosUpdate = (List) customerInfo.get("ExtInfo");
				// 删除集团扩展
				ICmLnGroupSV groupSv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
				IBOLnCmxGroupCustValue cmxGroupCustValue = groupSv.queryGroupCustExtById(customerUpdate.getCustId());
				if (CmCommonUtil.isNotEmptyObject(cmxGroupCustValue)) {
					BOCmxGroupCustMemberBean cmxcustomerUpdate = new BOCmxGroupCustMemberBean();
					cmxcustomerUpdate.copy(cmxGroupCustValue);
					cmxcustomerUpdate.setStsToOld();
					if (CmCommonUtil.isNotEmptyObject(extInfosUpdate)) {
						Map extInfo = (Map) extInfosUpdate.get(0);
						/** *注册资金* */
						if (!isEmpty(updateValue.get("LoginFinancing"))) {
							cmxcustomerUpdate.set(IBOCmxGroupCustMemberValue.S_EntFund, updateValue.get("LoginFinancing").toString());
						}
						/** 服务级别* */
						if (!isEmpty(updateValue.get("CustomerServLevel"))) {
							cmxcustomerUpdate.set(IBOCmxGroupCustMemberValue.S_ServiceLevel, updateValue.get("CustomerServLevel").toString());
						}
						/** 员工平均话费* */
						if (!isEmpty(extInfo.get("AvgFee"))) {
							cmxcustomerUpdate.set(IBOCmxGroupCustMemberValue.S_EmpAvgFee, extInfo.get("AvgFee").toString());
						}
						/** 报销额度* */
						if (!isEmpty(extInfo.get("Quota"))) {
							cmxcustomerUpdate.set(IBOCmxGroupCustMemberValue.S_WriteOffAmount, extInfo.get("Quota").toString());
						}
						CmInnerServiceFactory.getCommonInnerSV().saveBean(cmxcustomerUpdate);
					}
				}
				resultMap.put("CUST_ID", customerUpdate.getCustId());
				break;

			default:
				break;
		}
		resultMap.put("returnObj", resultMap);
		return resultMap;
	}

	public Map vipUseFreeService(Map parameter) throws Exception {
		Map inputMap = (Map) parameter.get("inputValue");
		if (isEmpty(parameter.get("ServiceId")) || inputMap == null || isEmpty(inputMap.get("ServiceNum")))
			ExceptionUtil.throwBusinessException("CMS95000068");// 手机号码及服务类型不能为空
		int serviceType = Integer.parseInt(String.valueOf(parameter.get("ServiceId")));// 1.机场VIP服务 2.火车站VIP服务
		String billId = String.valueOf(inputMap.get("ServiceNum"));// 手机号码
		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		long FreeTimes = 0;// 免费服务次数
		String result = "00";
		String resultDesc = "";

		ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (userBean != null) {
			// 查询会员是否存在
			IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);
			if (CmCommonUtil.isNotEmptyObject(memberValue)) {
				if (memberValue.getMemberLevel() > 0) {
					// 得到服务的serviceId
					IClubServiceValue serviceValue = null;
					// 通过俱乐部编码查询俱乐部服务信息
					IClubServiceValue[] serviceValues = CmServiceFactory.getClubServiceSV().queryClubServicesByClubId(memberValue.getClubId(), min, max);
					for (IClubServiceValue value : serviceValues) {
						if (value.getServiceType() == serviceType) {
							serviceValue = value;
							break;
						}
					}
					// 查询未使用服务次数
					if (serviceValue != null) {
						FreeTimes = CmServiceFactory.getClubServiceSV().queryAvailableServiceTimes(memberValue.getMemberId(), serviceValue.getServiceId());
					} else {
						result = "03";
						resultDesc = "There is no corresponding service !";
					}
				} else {// 普通VIP服务次数

				}
			} else {
				result = "01";
				resultDesc = billId + "Vip number corresponding to the customer does not exist";
			}
		} else {
			result = "02";
			resultDesc = billId + "Number corresponding to the user does not exist";
		}

		Map subReturnMap = new HashMap();
		subReturnMap.put("mobileNum", billId);
		subReturnMap.put("result", result);
		subReturnMap.put("resultDesc", resultDesc);
		subReturnMap.put("FreeTimes", FreeTimes);

		returnMap.put("returnObj", subReturnMap);

		return returnMap;

	}

	// 查询客户信息
	private ICustomerValue getGrpCustomer(long grpCust) throws Exception {
		ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue iCustomerValue = icmCust.queryCustomerByCustId(grpCust);
		if (CmCommonUtil.isEmptyObject(iCustomerValue)) {
			ExceptionUtil.throwBusinessException("CMS1100107");
		}
		return iCustomerValue;
	}

	// 集团网厅修改集团资料
	public Map upGrpCustomerDetailTemp(Map parameter) throws Exception {
		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Modify success!");
		String grpId = String.valueOf(parameter.get("CustId"));
		String grpPostCode = "";
		String GrpAddRess = "";
		String phoneNum = "";
		if (parameter.get("GroupPostCode") != null) {
			grpPostCode = String.valueOf(parameter.get("GroupPostCode"));// 集团邮编
		}
		if (parameter.get("GroupAddress") != null) {
			GrpAddRess = String.valueOf(parameter.get("GroupAddress"));// 集团地址
		}
		if (parameter.get("PhoneNum") != null) {
			phoneNum = String.valueOf(parameter.get("PhoneNum"));// 联系电话
		}
		if (StringUtils.isBlank(grpPostCode) && StringUtils.isBlank(GrpAddRess) && StringUtils.isBlank(phoneNum)) {
			ExceptionUtil.throwBusinessException("CMS1100147");// 没有需要更改的信息
		}
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ICustomerValue iCustomerValue = getGrpCustomer(Long.valueOf(grpId));

		IBOCmGroupCustomerAuditValue cmGrpCustAudit = null;
		List<IBOCmGroupCustomerAuditValue> grpCustAuditList = new ArrayList<IBOCmGroupCustomerAuditValue>();

		cmGrpCustAudit = new BOCmGroupCustomerAuditBean();
		long relId = CmCommonUtil.getNewSequence(BOCmGroupCustomerAuditBean.class);

		// modify by caiyu 增加修改时，默认managerid为集团的主要客户经理
		// 查询客户经理信息
		IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(iCustomerValue.getCustId());
		if (CmCommonUtil.isNotEmptyObject(gMgrRel)) {
			cmGrpCustAudit.setManagerId(gMgrRel.getManagerId());
		} else {
			ExceptionUtil.throwBusinessException("CMS95000119");// CMS95000119
			// 集团没有主要客户经理，无法进行修改。
		}

		cmGrpCustAudit.setAuditId(relId);
		cmGrpCustAudit.setCustId(Long.valueOf(grpId));
		cmGrpCustAudit.setAuditType(CmLnConstants.auditType.AUDIT_TYPE_CUSTOMER);
		cmGrpCustAudit.setCustAddress(GrpAddRess);
		cmGrpCustAudit.setCustZipcode(grpPostCode);
		cmGrpCustAudit.setContMobile(phoneNum);
		cmGrpCustAudit.setCreateDate(CmLnCommonUtil.getSysDateTime());
		// modify by caiyu 20121126,接口需要默认数据
		cmGrpCustAudit.setOperType(2);// 操作类型 1：新增 2：修改 3：删除 4：查询
		cmGrpCustAudit.setAuditStatus(0);// 审核状态 /*0 未审核 1 审核通过 2 审核未通过*/
		cmGrpCustAudit.setState("U");// 记录状态
		cmGrpCustAudit.setCreateOpId(ServiceManager.getUser().getID());// 创建操作员
		cmGrpCustAudit.setCreateOrgId(ServiceManager.getUser().getOrgId());// 创建操作员组织
		cmGrpCustAudit.setOpId(ServiceManager.getUser().getID());// 操作员
		cmGrpCustAudit.setOrgId(ServiceManager.getUser().getOrgId());// 操作员组织

		grpCustAuditList.add(cmGrpCustAudit);
		ICmCustomerSV icmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IVOCustValue custValue = new VOCustBean();
		custValue.setUserObject(CmLnConstants.MainMeth.CM_MAIN_TYPE, CmLnConstants.MainMeth.CM_GROUP_CUSTOMER_AUDIT_TYPE);
		custValue.setUserObject(CmLnConstants.MainMeth.CM_GROUP_CUSTOMER_AUDIT, (IBOCmGroupCustomerAuditValue[]) grpCustAuditList.toArray(new IBOCmGroupCustomerAuditValue[0]));
		icmCustomerSV.saveCustomer(custValue);
		map.put("SequenceNo", relId);
		return map;
	}

	public Map upGrpChangePwd(Map parameter) throws Exception {
		Map map = new HashMap();
		return map;
	}

	public Map acceptProdMemTemp(Map parameter) throws Exception {
		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Successful operation !");
		String grpId = String.valueOf(parameter.get("GroupId"));
		String billId = String.valueOf(parameter.get("ServiceNum"));
		String roleId = String.valueOf(parameter.get("roleId")); // 变更的角色id(暂时只变3,9)
		if (StringUtils.isBlank(grpId) || StringUtils.isBlank(billId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}
		// 根据手机号码查询用户信息
		ICmTeamInvokeSV icmTeamInvoke = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue iqUserBaseValue = icmTeamInvoke.getUserBaseInfoByBillId(billId);
		if (CmCommonUtil.isEmptyObject(iqUserBaseValue)) {
			ExceptionUtil.throwBusinessException("CMS1100080");// 用户对象不存在
		}
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupContactValue.S_CustId, grpId);
		da.set(IBOCmGroupContactValue.S_State, CmConstants.RecordState.USE);
		da.set(IBOCmGroupContactValue.S_ContType, CmConstants.CONT_TYPE.CONT_TYPE_1);
		da.set(IBOCmGroupContactValue.S_PrioryLevel, CmConstants.CONT_LEVEL.CONT_LEVEL_1);
		da.set(IBOCmGroupContactValue.S_BillId, billId);
		IContactValue[] contactValues = iCmContactSV.queryCustContacts(da, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			ExceptionUtil.throwBusinessException("CMS1100193");// 产品管理员不能是主要联系人
		}
		// 查询成员对象 是否存在

		ICmGroupMemberSV groupMemberSV = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupMemberValue.S_MemberType, CmLnConstants.GroupContType.GROUP_MEMBER_INNER);
		dc.set(IBOCmGroupMemberValue.S_CustId, Long.valueOf(grpId).longValue());
		dc.set(IBOCmGroupMemberValue.S_BillId, billId);
		IBOCmGroupMemberValue[] cmGrpMember = groupMemberSV.queryGroupMemberValues(dc, -1, -1);

		// IBOCmGroupMemberValue[] cmGrpMember =
		// icmCust.getBoCmGrpMemberByCustIdOrMemCustId(Long.valueOf(grpId),
		// iqUserBaseValue.getCustId());
		IBOCmGroupMemberValue cmGrpMemberValue = new BOCmGroupMemberBean();
		if (CmCommonUtil.isEmptyObject(cmGrpMember)) {
			ExceptionUtil.throwBusinessException("CMS1100192");// 成员对象不存在!
			/*
			 * // 根据集团编号查询集团客户信息 ICustomerValue iCustomerValue =
			 * getGrpCustomer(iqUserBaseValue.getCustId());
			 * cmGrpMemberValue.setStsToNew();
			 * cmGrpMemberValue.setCustRelId(CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class));
			 * cmGrpMemberValue.setCustId(Long.valueOf(grpId));
			 * cmGrpMemberValue.setMemberCustId(iqUserBaseValue.getCustId());
			 * cmGrpMemberValue.setMemberName(iCustomerValue.getCustName());
			 * cmGrpMemberValue.setMemberType(CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
			 * cmGrpMemberValue.setMemberStatus(Integer.valueOf(roleId));
			 * cmGrpMemberValue.setMemberPosition("1");
			 * cmGrpMemberValue.setCustRegionId(iqUserBaseValue.getRegionId());
			 * cmGrpMemberValue.setRegionId(iCustomerValue.getRegionId());
			 * cmGrpMemberValue.setState(CmConstants.RecordState.USE);
			 * cmGrpMemberValue.setBillId(billId);
			 * cmGrpMemberValue.setUserId(iqUserBaseValue.getUserId());
			 */
		} else {
			if (cmGrpMember[0].getMemberStatus() != 9) {
				// 默认为普通成员
				if (cmGrpMember[0].getMemberStatus() == Integer.valueOf(roleId).intValue()) {
					ExceptionUtil.throwBusinessException("CMS95000117");// 该号码已经是普通成员！
				}
			} else {
				// 已经是产品管理员
				if (cmGrpMember[0].getMemberStatus() == Integer.valueOf(roleId).intValue()) {
					ExceptionUtil.throwBusinessException("CMS95000116");// 该号码已经是产品管理员，无法增加
				}
			}

			cmGrpMemberValue.copy(cmGrpMember[0]);
			cmGrpMemberValue.setStsToOld();
			// 不需要设置成员类型
			// cmGrpMemberValue.setMemberType(CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
			cmGrpMemberValue.setMemberStatus(Integer.valueOf(roleId));
		}
		ICustRelationshipValue icustRelaTion = new CustRelationshipBean();

		icustRelaTion.copy(cmGrpMemberValue);
		icustRelaTion.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
		IVOCustValue ivoCustValue = new VOCustBean();
		ivoCustValue.addCustRel(icustRelaTion);
		ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		icmCust.saveCustomer(ivoCustValue);
		return map;
	}

	public Map qryProdMgntMem(Map parameter) throws Exception {
		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Successful operation !");

		String grpId = isEmpty(parameter.get("GroupId")) ? "" : parameter.get("GroupId").toString();
		String billId = isEmpty(parameter.get("ServiceNum")) ? "" : parameter.get("ServiceNum").toString();
		String CustName = isEmpty(parameter.get("CustName")) ? "" : parameter.get("CustName").toString();
		String roleId = isEmpty(parameter.get("roleId")) ? "" : parameter.get("roleId").toString();
		int start = isEmpty(parameter.get("BgnIndex")) ? -1 : Integer.parseInt(parameter.get("BgnIndex").toString());
		int end = isEmpty(parameter.get("EndIndex")) ? -1 : Integer.parseInt(parameter.get("EndIndex").toString());

		if (StringUtils.isBlank(grpId) || StringUtils.isBlank(roleId) || start < 0 || end < 0) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}
		// 查询成员对象 是否存在

		// modify by caiyu 20121119 集团网厅要求成员名称模糊查询，现在只支持右模糊，不支持全模糊
		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("");
		Map queryParameter = new HashMap();
		sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean.class).getMapingEnty());

		conditionSql.append(" and cust_id = :grpId ");
		queryParameter.put("grpId", grpId);
		conditionSql.append(" and member_status = :roleId ");
		queryParameter.put("roleId", roleId);

		if (!"".equals(billId)) {
			conditionSql.append(" and bill_id = :billId ");
			queryParameter.put("billId", billId);
		}
		if (!"".equals(CustName)) {
			conditionSql.append(" and member_name like :CustName ");
			queryParameter.put("CustName", CustName + "%");
		}

		DataContainerInterface[] values = null;
		if (end > 0) {
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), start, end, queryParameter), queryParameter);
		} else {
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), min, max, queryParameter), queryParameter);
		}

		if (start == 1)// 为1时,需要返回总数
		{
			DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
					CmLnCommonUtil.getQueryCount(sql.toString(), conditionSql.toString(), queryParameter), queryParameter);
			map.put("Count", counts[0].getAsInt("CNT"));
		}
		List returnList = new ArrayList();
		if (values != null && values.length > 0) {

			for (DataContainerInterface value : values) {
				Map mgrMap = CmFSVUtil.value2Map(value, false);
				returnList.add(mgrMap);
			}
		}
		map.put("MemberInfo", returnList);

		return map;

		// ICmCustomerSV icmCust = (ICmCustomerSV)
		// ServiceFactory.getService(ICmCustomerSV.class);
		// DataContainer dt = new DataContainer();
		// dt.set(IBOCmGroupMemberValue.S_CustId, grpId);
		// if (parameter.get("ServiceNum") != null &&
		// StringUtils.isNotBlank(billId)) {
		// dt.set(IBOCmGroupMemberValue.S_BillId, billId);
		// }
		// if (parameter.get("CustName") != null &&
		// StringUtils.isNotBlank(CustName)) {
		// aa
		// dt.set(IBOCmGroupMemberValue.S_MemberName, CustName);
		// }
		// if (parameter.get("roleId") != null && parameter.get("roleId") !=
		// null) {
		// dt.set(IBOCmGroupMemberValue.S_MemberStatus, roleId);
		// }
		//
		// IGroupMemberValue[] cmGrpMember = null;
		// if (Integer.valueOf(start) == 0) {
		// count = icmCust.queryGroupMembersCount(dt);
		// }
		// cmGrpMember = icmCust.queryGroupMembers(dt, Integer.valueOf(start),
		// Integer.valueOf(end));
		// map.put("MemberInfo", cmGrpMember);
		// map.put("Count", count);
		// return map;
	}

	public IContactValue[] qryGroupContact(Map parameter) throws Exception {

		String custId = String.valueOf(parameter.get("CustId"));
		String userId = String.valueOf(parameter.get("UserId"));

		if (StringUtils.isBlank(custId) || StringUtils.isBlank(userId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query group families information is ok");

		DataContainer dt = new DataContainer();
		dt.set(IContactValue.S_CustId, custId);
		dt.set(IContactValue.S_UserId, userId);
		dt.set(IContactValue.S_ContType, CmConstants.CONT_TYPE.CONT_TYPE_3);

		IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(dt, -1, -1);
		// returnMap.put("returnObj", contactValues);
		return contactValues;
	}

	public IGroupMemberValue[] qryGrpMem(Map parameter) throws Exception {
		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Successful operation !");

		String custId = String.valueOf(parameter.get("CustId"));
		String userId = String.valueOf(parameter.get("UserId"));
		if (StringUtils.isBlank(custId) || StringUtils.isBlank(userId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}

		// 查询成员对象 是否存在
		ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupMemberValue.S_CustId, custId);
		dt.set(IBOCmGroupMemberValue.S_UserId, userId);
		dt.set(IBOCmGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
		dt.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);

		IGroupMemberValue[] cmGrpMembers = icmCust.queryGroupMembers(dt, -1, -1);
		return cmGrpMembers;
	}

	public IGroupMemberValue[] qryGrpMemByUserId(long userId) throws Exception {
		if (userId <= 0)
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！

		ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupMemberValue.S_UserId, userId);
		dt.set(IBOCmGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
		dt.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);

		IGroupMemberValue[] cmGrpMembers = icmCust.queryGroupMembers(dt, -1, -1);
		return cmGrpMembers;
	}

	public IBOLnCmGroupInfoValue[] qryGroupInfo(Map parameter) throws Exception {
		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Successful operation !");

		String custId = String.valueOf(parameter.get("CustId"));

		if (StringUtils.isBlank(custId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}

		ICmLnGroupSV icmgrp = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
		// 查询集团客户资料及扩展资料
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupMemberValue.S_CustId, custId);
		dt.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);

		IBOLnCmGroupInfoValue[] cmGrpinfos = icmgrp.queryGroupInfos(dt, -1, -1);

		return cmGrpinfos;
	}

	// 集团网厅集团成员的批量预增加,删除,接口
	public Map acceptGrpMemTemp(Map parameter) throws Exception {
		Map map = new HashMap();
		List groupInfoList = (List) parameter.get("SGroupInfoTemp");
		int operCode = Integer.valueOf(parameter.get("OperCode").toString());// 0：添加
		// 1：删除

		IBOCmGroupCustomerAuditValue cmGrpCustAudit = null;
		List<IBOCmGroupCustomerAuditValue> grpCustAuditList = new ArrayList<IBOCmGroupCustomerAuditValue>();
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		List sequenceNoList = new ArrayList();
		IBOCmGroupManagerValue gMgrRel = null;
		int len = groupInfoList.size();
		long custid = 0L;
		long managerid = 0L;
		for (int i = 0; len > 0 && i < len; i++) {
			Map grpAudtiMap = (Map) groupInfoList.get(i);
			cmGrpCustAudit = new BOCmGroupCustomerAuditBean();
			// modify by caiyu 20121126
			if (i == 0) {
				custid = Long.valueOf(grpAudtiMap.get("GroupId").toString());
				// modify by caiyu 增加修改时，默认managerid为集团的主要客户经理
				// 查询客户经理信息
				gMgrRel = cnGroupSv.queryGroupCustMgrRel(custid);
				if (CmCommonUtil.isNotEmptyObject(gMgrRel)) {
					managerid = gMgrRel.getManagerId();
					cmGrpCustAudit.setManagerId(managerid);
				} else {
					ExceptionUtil.throwBusinessException("CMS95000119");// CMS95000119
					// 集团没有主要客户经理，无法进行修改。
				}
			} else {
				if (custid != Long.valueOf(grpAudtiMap.get("GroupId").toString())) {
					custid = Long.valueOf(grpAudtiMap.get("GroupId").toString());
					// modify by caiyu 增加修改时，默认managerid为集团的主要客户经理
					// 查询客户经理信息
					gMgrRel = cnGroupSv.queryGroupCustMgrRel(custid);
					if (CmCommonUtil.isNotEmptyObject(gMgrRel)) {
						managerid = gMgrRel.getManagerId();
					} else {
						ExceptionUtil.throwBusinessException("CMS95000119");// CMS95000119
						// 集团没有主要客户经理，无法进行修改。
					}
				}
				cmGrpCustAudit.setManagerId(managerid);
			}
			long relId = CmCommonUtil.getNewSequence(BOCmGroupCustomerAuditBean.class);
			cmGrpCustAudit.setAuditId(relId);
			cmGrpCustAudit.setCustId(Long.valueOf(grpAudtiMap.get("GroupId").toString()));
			cmGrpCustAudit.setMemberCustId(Long.valueOf(grpAudtiMap.get("CustId").toString()));
			cmGrpCustAudit.setUserId(Long.valueOf(grpAudtiMap.get("UserId").toString()));
			cmGrpCustAudit.setMemberType(Integer.valueOf(grpAudtiMap.get("MemberKind").toString()));
			cmGrpCustAudit.setBillId(grpAudtiMap.get("ServiceNum").toString());

			cmGrpCustAudit.setAuditType(CmLnConstants.auditType.AUDIT_TYPE_MEMBER);
			cmGrpCustAudit.setCreateDate(CmLnCommonUtil.getSysDateTime());
			// if (grpAudtiMap.get("ShortNum") != null) {
			// cmGrpCustAudit.setShortNum(grpAudtiMap.get("ShortNum").toString());
			// }
			if (grpAudtiMap.get("Department") != null) {
				cmGrpCustAudit.setDeptment(grpAudtiMap.get("Department").toString());
			}
			if (grpAudtiMap.get("Job") != null) {
				cmGrpCustAudit.setJob(grpAudtiMap.get("Job").toString());
			}
			// if (grpAudtiMap.get("VipFlag") != null) {// 是否大客户 1 0：非大客户
			// cmGrpCustAudit.setIsVip(Integer.valueOf(grpAudtiMap.get("VipFlag").toString()));
			// }
			// if (grpAudtiMap.get("CustManagerId") != null) {
			// cmGrpCustAudit.setManagerId(Integer.valueOf(grpAudtiMap.get("CustManagerId").toString()));
			// }
			if (grpAudtiMap.get("MembertName") != null) {
				cmGrpCustAudit.setMemberName(grpAudtiMap.get("MembertName").toString());
			}
			if (grpAudtiMap.get("RegionCode") != null) {
				cmGrpCustAudit.setRegionId(grpAudtiMap.get("RegionCode").toString());
			}
			if (grpAudtiMap.get("CountyCode") != null) {
				cmGrpCustAudit.setCountyId(grpAudtiMap.get("CountyCode").toString());
			}
			// if (grpAudtiMap.get("GroupMode") != null) {
			// cmGrpCustAudit.setGroupType(Integer.valueOf(grpAudtiMap.get("GroupMode").toString()));
			// }
			// if (grpAudtiMap.get("ClassId") != null) {
			// cmGrpCustAudit.setClassId(Integer.valueOf(grpAudtiMap.get("ClassId").toString()));
			// }
			// if (grpAudtiMap.get("State") != null) {
			// cmGrpCustAudit.setMemberState(Integer.valueOf(grpAudtiMap.get("State").toString()));
			// }
			// if (grpAudtiMap.get("CreateDate") != null) {
			// cmGrpCustAudit.setMemberCreateDate(Timestamp.valueOf(grpAudtiMap.get("CreateDate").toString()));
			// }
			// modify by caiyu 20121116 客户管理不保存品牌和套餐数据
			// if (grpAudtiMap.get("BrandName") != null) {
			// cmGrpCustAudit.setBrandName(grpAudtiMap.get("BrandName").toString());
			// }
			// if (grpAudtiMap.get("BrandId") != null) {
			// cmGrpCustAudit.setBrandId(Integer.valueOf(grpAudtiMap.get("BrandId").toString()));
			// }
			// if (grpAudtiMap.get("PlanName") != null) {
			// cmGrpCustAudit.setPlanName(grpAudtiMap.get("PlanName").toString());
			// }
			// if (grpAudtiMap.get("PlanId") != null) {
			// cmGrpCustAudit.setPlanId(Long.valueOf(grpAudtiMap.get("PlanId").toString()));
			// }

			// modify by caiyu 20121126 补充默认值
			cmGrpCustAudit.setAuditStatus(0);// 审核状态 0 未审核 1 审核通过 2 审核未通过
			cmGrpCustAudit.setState("U");// 记录状态
			cmGrpCustAudit.setCreateOpId(ServiceManager.getUser().getID());// 创建操作员
			cmGrpCustAudit.setCreateOrgId(ServiceManager.getUser().getOrgId());// 创建操作员组织
			cmGrpCustAudit.setOpId(ServiceManager.getUser().getID());// 操作员
			cmGrpCustAudit.setOrgId(ServiceManager.getUser().getOrgId());// 操作员组织
			if (operCode == 0) {
				cmGrpCustAudit.setOperType(1); // 1：新增 2：修改 3：删除 4：查询
			} else if (operCode == 1) {
				cmGrpCustAudit.setOperType(3); // 1：新增 2：修改 3：删除 4：查询
			} else {
				// 错误参数
				ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
			}

			grpCustAuditList.add(cmGrpCustAudit);
			Map seqMap = new HashMap();
			seqMap.put("SequenceNo", relId);
			seqMap.put("Result", "1");
			seqMap.put("Msg", "");
			sequenceNoList.add(seqMap);
		}

		ICmCustomerSV icmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IVOCustValue custValue = new VOCustBean();
		custValue.setUserObject(CmLnConstants.MainMeth.CM_MAIN_TYPE, CmLnConstants.MainMeth.CM_GROUP_CUSTOMER_AUDIT_TYPE);
		custValue.setUserObject(CmLnConstants.MainMeth.CM_GROUP_CUSTOMER_AUDIT, (IBOCmGroupCustomerAuditValue[]) grpCustAuditList.toArray(new IBOCmGroupCustomerAuditValue[0]));
		icmCustomerSV.saveCustomer(custValue);
		map.put("SequenceNos", sequenceNoList);
		return map;
	}

	// 查询客户信息
	public Map qryGroupInfos(Map map) throws Exception {

		String billId = (String) map.get("billId");

		if (StringUtils.isBlank(billId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}
		int startNum = -1;
		int endNum = -1;

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Discover customer information ok");

		Map subReturnMap = new HashMap();
		List groupList = new ArrayList();
		List returnList = new ArrayList();

		// modify by caiyu 在服务中不要设置中心，屏蔽下面的代码
		// CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID,billId);

		ISoGroupFSV soGroupFSV = (ISoGroupFSV) ServiceFactory.getService(ISoGroupFSV.class);

		groupList = soGroupFSV.getCustIdByBillId(billId);
		for (int i = 0; i < groupList.size(); i++) {

			Long custId = (Long) groupList.get(i);

			if (custId > 0) {

				StringBuilder querySql = new StringBuilder(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOLnCmGroupInfoBean.class).getMapingEnty());

				if (log.isDebugEnabled())
					log.debug("\n\nquerySql:" + querySql.toString() + "\n\n");
				StringBuilder conditionSql = new StringBuilder("");
				Map queryParameter = new HashMap();

				conditionSql.append("and " + ICustomerValue.S_CustId + " = :CustId ");
				queryParameter.put("CustId", custId);
				DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOLnCmGroupInfoBean.class,
						CmLnCommonUtil.getQueryResult(querySql.toString(), conditionSql.toString(), startNum, endNum, queryParameter), queryParameter);
				if (values != null && values.length > 0) {
					ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
					DataContainer queryContactDC = new DataContainer();
					for (DataContainerInterface value : values) {
						Map mgrMap = CmFSVUtil.value2Map(value, false);
						// 查询主要联系人信息
						queryContactDC.set(IContactValue.S_CustId, value.getAsLong("CUST_ID"));
						queryContactDC.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_CONTACT);
						queryContactDC.set(IContactValue.S_PrioryLevel, CmLnConstants.GroupContType.GROUP_CONTACT_FIRST);
						IContactValue[] contacts = CmServiceFactory.getContactSV().queryCustContacts(queryContactDC, min, max);
						if (contacts != null && contacts.length > 0) {
							mgrMap.put("MainContactName", contacts[0].getContName());
							mgrMap.put("MainContactPhone", contacts[0].getBillId());
						}
						queryContactDC.clear();
						// 查询客户经理信息
						IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(value.getAsLong("CUST_ID"));
						if (gMgrRel != null) {
							ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
							IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
							if (CmCommonUtil.isNotEmptyObject(secStaff)) {
								mgrMap.put("ManagerId", gMgrRel.getManagerId());
								mgrMap.put("ManagerName", secStaff.getManagername());
								mgrMap.put("ManagerPhone", secStaff.getBillid());
							}
						}
						returnList.add(mgrMap);
					}
				}
			}
		}
		subReturnMap.put("GroupBaseInfos", returnList);
		returnMap.put("returnObj", subReturnMap);
		return returnMap;
	}

	public Map qryUserInfo(Map parameter) throws Exception {

		String userId = String.valueOf(parameter.get("userId"));

		if (StringUtils.isBlank(userId)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}

		Map returnMap = new HashMap();
		Map subReturnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query OK");

		// 查询VIP客户信息

		IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(Long.valueOf(userId));

		if (memberValue == null) {
			subReturnMap.put("MEMBER_NAME", ""); // 大客户名称
			subReturnMap.put("MEMBER_LEVEL", ""); // 大客户级别
			subReturnMap.put("CARD_CODE", ""); // 大客户卡号
			subReturnMap.put("ManagerName", ""); // 电话经理名称
			subReturnMap.put("ManagerPhone", ""); // 电话经理联系电话
		} else {
			// 当VIP客户级别为0时，不返回数据， 0 为普通客户不是VIP客户
			if (memberValue.getMemberLevel() == 0) {
				subReturnMap.put("MEMBER_NAME", ""); // 大客户名称
				subReturnMap.put("MEMBER_LEVEL", ""); // 大客户级别
				subReturnMap.put("CARD_CODE", ""); // 大客户卡号
				subReturnMap.put("ManagerName", ""); // 电话经理名称
				subReturnMap.put("ManagerPhone", ""); // 电话经理联系电话
			} else {
				subReturnMap.put("MEMBER_NAME", memberValue.getMemberName()); // 大客户名称
				subReturnMap.put("MEMBER_LEVEL", memberValue.getMemberLevel()); // 大客户级别

				// 查询VIP客户卡号
				if (memberValue.getMemberLevel() == 1 || memberValue.getMemberLevel() == 2 || memberValue.getMemberLevel() == 3) {
					DataContainer dc = new DataContainer();
					dc.set(IClubMemberCardValue.S_MemberId, memberValue.getMemberId());
					dc.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
					ICmClubMemberSV icmClubMember = (ICmClubMemberSV) ServiceFactory.getService(ICmClubMemberSV.class);
					IClubMemberCardValue[] clubMemberCards = icmClubMember.queryClubMemberCards(dc, -1, -1);

					if (CmCommonUtil.isEmptyObject(clubMemberCards)) {
						subReturnMap.put("CARD_CODE", ""); // 大客户卡号
					} else {
						subReturnMap.put("CARD_CODE", clubMemberCards[0].getCardCode()); // 大客户卡号
					}
				} else {
					subReturnMap.put("CARD_CODE", ""); // 大客户卡号
				}

				// 查询VIP客户电话经理信息
				ICmClubVipMemberSV icmClubVipMember = (ICmClubVipMemberSV) ServiceFactory.getService(ICmClubVipMemberSV.class);

				IQBOSecCustManagerValue[] secManagerValues = icmClubVipMember.queryCmUserManager(String.valueOf(memberValue.getUserId()), -1, -1);
				if (CmCommonUtil.isEmptyObject(secManagerValues)) {
					subReturnMap.put("ManagerName", ""); // 电话经理名称
					subReturnMap.put("ManagerPhone", ""); // 电话经理联系电话
				} else {
					subReturnMap.put("ManagerName", secManagerValues[0].getManagername()); // 电话经理名称
					subReturnMap.put("ManagerPhone", secManagerValues[0].getBillid()); // 电话经理联系电话
				}
			}

		}

		// 查询集团成员信息

		ICmGroupMemberSV icmgrp = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);

		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupMemberValue.S_UserId, userId);

		dc.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);

		IBOCmGroupMemberValue[] cmGroupMemberValues = icmgrp.queryGroupMemberValues(dc, -1, 1);

		if (CmCommonUtil.isEmptyObject(cmGroupMemberValues)) {
			subReturnMap.put("HAS_PHOTO", ""); // 是否拍照集团成员
			subReturnMap.put("GrpManagerName", ""); // 集团客户经理名称
			subReturnMap.put("GrpManagerPhone", ""); // 集团经理联系电话
		} else {

			long custId = cmGroupMemberValues[0].getCustId();

			if (custId > 0) {

				ICmLnGroupSV icmgrpsv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
				// 查询集团客户资料及扩展资料
				DataContainer dt = new DataContainer();
				dt.set(IBOCmGroupMemberValue.S_CustId, custId);
				dt.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);

				IBOLnCmGroupInfoValue[] cmGrpinfos = icmgrpsv.queryGroupInfos(dt, -1, -1);

				if (cmGrpinfos != null && cmGrpinfos.length > 0) {
					ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
					subReturnMap.put("HAS_PHOTO", cmGrpinfos[0].getHasPhoto()); // 是否拍照集团成员
					// 查询客户经理信息
					IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(cmGrpinfos[0].getCustId());
					if (gMgrRel != null) {
						ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
						IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
						if (CmCommonUtil.isNotEmptyObject(secStaff)) {
							subReturnMap.put("GrpManagerName", secStaff.getManagername());
							subReturnMap.put("GrpManagerPhone", secStaff.getBillid());
						} else {
							subReturnMap.put("GrpManagerName", ""); // 集团客户经理名称
							subReturnMap.put("GrpManagerPhone", ""); // 集团经理联系电话
						}
					}

				} else {
					subReturnMap.put("HAS_PHOTO", ""); // 是否拍照集团成员
					subReturnMap.put("GrpManagerName", ""); // 集团客户经理名称
					subReturnMap.put("GrpManagerPhone", ""); // 集团经理联系电话
				}
			}
		}

		returnMap.put("returnObj", subReturnMap);
		return returnMap;
	}

	public Map modifyClubMember(Map parameter) throws Exception {
		Map resultMap = new HashMap();
		resultMap.put("returnCode", "00");
		resultMap.put("returnMsg", "Successful operation !");
		boolean dealFlag = true;
		String billId = (String) parameter.get("BillId");
		String doneCode = (String) parameter.get("DoneCode");
		String action = (String) parameter.get("Action");
		// String offId = parameter.get("OffId").toString();

		if ("".equals(action))
			ExceptionUtil.throwBusinessException("CMS95000003");

		if (isEmpty(billId) || isEmpty(doneCode))
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！

		if ("vip".equals(action)) { // 1. 问题1 营业有可能会传一个级别为0的过来 须删除因子重算
			int clubLevel = 0;
			if (!"".equals(parameter.get("MemberLevel"))) {
				clubLevel = Integer.valueOf(parameter.get("MemberLevel").toString());
			}
			if (clubLevel < 0) {
				ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
			}

			// 获取VIP服务
			ICmClubServiceSV clubServiceSV = (ICmClubServiceSV) ServiceFactory.getService(ICmClubServiceSV.class);

			// 获取外围接口服务
			ICmTeamInvokeSV userSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			IQUserBaseInfoValue userInfo = userSV.getUserBaseInfoByBillId(billId);
			if (CmCommonUtil.isEmptyObject(userInfo)) {
				ExceptionUtil.throwBusinessException("CMC0094092");// 用户不存在！
			}
			// 根据UserId查询客户信息
			ICustomerValue customerinfo = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userInfo.getCustId());
			if (CmCommonUtil.isEmptyObject(customerinfo)) {
				ExceptionUtil.throwBusinessException("CMS8000033");// 用户不存在！
			}
			// 查询特殊套餐因子 因子类别: 3 特殊因子
			IBOCmVipElementValue[] elementValues = clubServiceSV.queryCmVipElements(billId, userInfo.getUserId(), CmLnConstants.VipElement.VipElement_3);
			// 因子表操作
			if (clubLevel == 0) {
				// 如果传的级别为0 则删除因子表进行重算
				if (elementValues != null && elementValues.length > 0) {
					for (IBOCmVipElementValue elementValue : elementValues) {
						elementValue.delete();
					}
					clubServiceSV.saveVipElement(elementValues);
				}
			} else if (clubLevel > 0) {
				BOCmVipElementBean vipElementValue = new BOCmVipElementBean();
				if (elementValues == null || elementValues.length <= 0) {
					// 不存在特殊套餐因子则新增因子数据
					vipElementValue.setStsToNew();
					vipElementValue.setRelId(CmCommonUtil.getNewSequence(BOCmVipElementBean.class));
					vipElementValue.setUserId(userInfo.getUserId());
					vipElementValue.setBillId(Long.valueOf(billId));
					vipElementValue.setElementType(CmLnConstants.VipElement.VipElement_3);
					vipElementValue.setMemberLevel(clubLevel);
					vipElementValue.setState(CmConstants.RecordState.USE);
					vipElementValue.setRegionId(userInfo.getRegionId());

					clubServiceSV.saveVipElement(new IBOCmVipElementValue[] { vipElementValue });
				}
				// 存在则修改因子数据
				else {
					vipElementValue.copy(elementValues[0]);
					vipElementValue.setStsToOld();
					vipElementValue.set(IBOCmVipElementValue.S_MemberLevel, clubLevel);
					clubServiceSV.saveVipElement(new IBOCmVipElementValue[] { vipElementValue });
				}
			}

			// 重算级别
			ICmCommonSV sv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			int newLevel = sv.getVipLevle(billId, userInfo);

			IClubMemberValue clubBean = new ClubMemberBean();
			IVOClubMemberValue voClubMember = new VOClubMemberBean();
			IClubMemberValue value = (IClubMemberValue) CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);
			IClubMemberCardValue[] memberCardValues = null;
			if (CmCommonUtil.isNotEmptyObject(value)) {
				DataContainer cond = new DataContainer();
				cond.set(IClubMemberCardValue.S_MemberId, value.getMemberId());
				memberCardValues = CmServiceFactory.getClubMemberSV().queryClubMemberCards(cond, -1, -1);
			}

			// 重算后级别如果大于0则进行VIP记录新增、修改操作
			if (newLevel > 0) {
				// 判断是否存在VIP记录，有则修改记录，否则新增
				if (CmCommonUtil.isEmptyObject(value)) {
					clubBean.setStsToNew();
					clubBean.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
					clubBean.set(IClubMemberValue.S_PartyId, customerinfo.getPartyId());
					clubBean.set(IClubMemberValue.S_CustId, customerinfo.getCustId());
					clubBean.set(IClubMemberValue.S_UserId, userInfo.getUserId());
					clubBean.set(IClubMemberValue.S_BillId, billId);
					clubBean.set(IClubMemberValue.S_MemberName, customerinfo.getCustName());
					clubBean.set(IClubMemberValue.S_CertType, customerinfo.getCustCertType());
					clubBean.set(IClubMemberValue.S_CertCode, customerinfo.getCustCertCode());
					clubBean.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
					clubBean.set(IClubMemberValue.S_MemberLevel, newLevel);// 会员级别
					clubBean.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
					clubBean.set(IClubMemberValue.S_DoneCode, doneCode);// 业务编码
					clubBean.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());//
					clubBean.set(IClubMemberValue.S_CreateDate, CmCommonUtil.getSysDate());//
					clubBean.set(IClubMemberValue.S_RegionId, userInfo.getRegionId());
					clubBean.set(IClubMemberValue.S_CityId, userInfo.getAreaCode());
					clubBean.set(IClubMemberValue.S_CountyId, userInfo.getCountryCode());
					clubBean.set(IClubMemberValue.S_Remarks, "New VIP business changes");
					voClubMember.setClubMember(clubBean);
				} else {
					// 存在修改VIP信息
					clubBean.copy(value);
					clubBean.setStsToOld();
					clubBean.set(IClubMemberValue.S_MemberLevel, newLevel);
					clubBean.set(IClubMemberValue.S_DoneCode, doneCode);// 业务编码
					clubBean.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());//
					clubBean.set(IClubMemberValue.S_Remarks, "VIP business change modifications");
					// clubBean.set(IClubMemberValue.S_CreateDate,
					// CmCommonUtil.getSysDate());//
					voClubMember.setClubMember(clubBean);
				}
				// 修改VIP发卡信息，卡号，年份，级别
				IClubMemberCardValue cardValue = new ClubMemberCardBean();
				if (CmCommonUtil.isEmptyObject(memberCardValues)) {
					if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
							|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
						cardValue.setStsToNew();
						cardValue.set(IClubMemberCardValue.S_CardCode, clubServiceSV.getVipCardCode(userInfo.getRegionId(), newLevel));
						cardValue.set(IClubMemberCardValue.S_CardType, CmLnConstants.vipCardType.CARD1);
						cardValue.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
						cardValue.set(IClubMemberCardValue.S_CardLevel, newLevel);
						cardValue.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
						cardValue.set(IClubMemberCardValue.S_RegionId, userInfo.getRegionId());
						cardValue.set(IClubMemberCardValue.S_CardFlag, CmLnConstants.ClubCardFlag.ClubCardFlag_0);
						voClubMember.setClubMemberCard(cardValue);
					}
				} else {
					if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
							|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
						if (null != memberCardValues) {
							cardValue.copy(memberCardValues[0]);
						}
						cardValue.setStsToOld();
						cardValue.set(IClubMemberCardValue.S_CardCode, clubServiceSV.getVipCardCode(userInfo.getRegionId(), newLevel));
						cardValue.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
						cardValue.set(IClubMemberCardValue.S_CardLevel, newLevel);
						voClubMember.setClubMemberCard(cardValue);
					} else {
						// cardValue.copy(memberCardValues[0]);
						cardValue.delete();
						voClubMember.setClubMemberCard(cardValue);
					}
				}
				voClubMember.setClubMember(clubBean);
			}
			// 重算后级别小于等于0 则进行VIP删除操作
			else if (newLevel == 0) {
				long brandId = userInfo.getBrandId();
				int isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;
				// 如果不是全球通客户则删除VIP
				if (isGlobal == 0) {
					if (CmCommonUtil.isNotEmptyObject(value)) {
						value.delete();
						voClubMember.setClubMember(value);

						if (memberCardValues != null && CmCommonUtil.isNotEmptyObject(memberCardValues)) {
							for (IClubMemberCardValue cardValue : memberCardValues) {
								cardValue.delete();
								voClubMember.setClubMemberCard(cardValue);
							}
						}

						// 7.删除VIP与客户经理关系
						Map queryPara = new HashMap();
						queryPara.put("userId", userInfo.getUserId());
						BOCmUserManagerBean[] userManagerValues = null;
						String conditonSql = "and user_id = :userId ";
						StringBuilder userSB = new StringBuilder("");
						userSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());

						userManagerValues = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
								CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);

						if (userManagerValues != null && userManagerValues.length > 0) {
							for (BOCmUserManagerBean value1 : userManagerValues)
								value1.delete();
							CmInnerServiceFactory.getCommonInnerSV().saveBeans(userManagerValues);
						}

						// TODO 删除VIP活动

						// TODO 删除VIP服务
					}

				}
				// 如果是全球通客户则更新级别
				else if (isGlobal > 0) {
					if (CmCommonUtil.isNotEmptyObject(value)) {
						value.set(IClubMemberValue.S_MemberLevel, newLevel);
						value.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());
						value.set(IClubMemberValue.S_Remarks, "VIP business change modifications");
						voClubMember.setClubMember(value);
					} else {
						clubBean.setStsToNew();
						clubBean.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
						clubBean.set(IClubMemberValue.S_PartyId, customerinfo.getPartyId());
						clubBean.set(IClubMemberValue.S_CustId, customerinfo.getCustId());
						clubBean.set(IClubMemberValue.S_UserId, userInfo.getUserId());
						clubBean.set(IClubMemberValue.S_BillId, billId);
						clubBean.set(IClubMemberValue.S_MemberName, customerinfo.getCustName());
						clubBean.set(IClubMemberValue.S_CertType, customerinfo.getCustCertType());
						clubBean.set(IClubMemberValue.S_CertCode, customerinfo.getCustCertCode());
						clubBean.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
						clubBean.set(IClubMemberValue.S_MemberLevel, newLevel);// 会员级别
						clubBean.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
						clubBean.set(IClubMemberValue.S_DoneCode, doneCode);// 业务编码
						clubBean.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());//
						clubBean.set(IClubMemberValue.S_CreateDate, CmCommonUtil.getSysDate());//
						clubBean.set(IClubMemberValue.S_RegionId, userInfo.getRegionId());
						clubBean.set(IClubMemberValue.S_CityId, userInfo.getAreaCode());
						clubBean.set(IClubMemberValue.S_CountyId, userInfo.getCountryCode());
						clubBean.set(IClubMemberValue.S_Remarks, "New VIP business changes");
						voClubMember.setClubMember(clubBean);
					}
					if (CmCommonUtil.isNotEmptyObject(memberCardValues)) {
						if (null != memberCardValues) {
							for (IClubMemberCardValue cardValue : memberCardValues) {
								cardValue.delete();
								voClubMember.setClubMemberCard(cardValue);
							}
						}
					}
				}
			}
			CmServiceFactory.getClubMemberSV().saveClubMember(voClubMember);
		} else if ("global".equals(action)) {
			// 查询该用户是否全球通用户
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
			if (userBaseInfo == null) {
				// 根据手机号码[{0}]没有查询到用户信息！
				ExceptionUtil.throwBusinessException("CMS5000154", billId);
			}

			long brandId = userBaseInfo.getBrandId();
			int isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;
			// 获取俱乐部大对象
			IVOClubMemberValue voClubMember = new VOClubMemberBean();
			// 根据UserId查询客户信息
			ICustomerValue customerinfo = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userBaseInfo.getCustId());
			// 查询是否在VIP存在记录
			IClubMemberValue value = (IClubMemberValue) CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);

			ICmClubServiceSV clubServiceSV = (ICmClubServiceSV) ServiceFactory.getService(ICmClubServiceSV.class);
			IClubMemberCardValue[] memberCardValues = null;
			if (CmCommonUtil.isNotEmptyObject(value)) {
				DataContainer cond = new DataContainer();
				cond.set(IClubMemberCardValue.S_MemberId, value.getMemberId());
				memberCardValues = CmServiceFactory.getClubMemberSV().queryClubMemberCards(cond, -1, -1);
			}
			IClubMemberValue clubBean = new ClubMemberBean();

			if (isGlobal == 1) {
				/*
				 * //查询是否订购过特殊套餐 if(Long.valueOf(offId) != 0) { ICrmFSV crmFsv =
				 * (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
				 * IUpItemFeatureValue featureValue =
				 * crmFsv.getUpItemFeature(Long.valueOf(offId), 10002023);
				 * if(featureValue != null) {
				 */
				// 删除特殊套餐的因子
				IBOCmVipElementValue[] elementValues = clubServiceSV.queryCmVipElements(billId, userBaseInfo.getUserId(), CmLnConstants.VipElement.VipElement_3);
				// 如果传的级别为0 则删除因子表进行重算
				if (elementValues != null && elementValues.length > 0) {
					for (IBOCmVipElementValue elementValue : elementValues) {
						elementValue.delete();
					}
					clubServiceSV.saveVipElement(elementValues);
				}
				// }
				// }
				// 重算级别
				ICmCommonSV sv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				int newLevel = sv.getVipLevle(billId, userBaseInfo);

				// 是全球通，在VIP表不存在记录，重算因子级别 ，如果级别是1 -3 则查询是否存在发卡信息，有则修改，无则新增
				if (CmCommonUtil.isEmptyObject(value)) {
					clubBean.setStsToNew();
					clubBean.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
					clubBean.set(IClubMemberValue.S_PartyId, customerinfo.getPartyId());
					clubBean.set(IClubMemberValue.S_CustId, customerinfo.getCustId());
					clubBean.set(IClubMemberValue.S_UserId, userBaseInfo.getUserId());
					clubBean.set(IClubMemberValue.S_BillId, billId);
					clubBean.set(IClubMemberValue.S_MemberName, customerinfo.getCustName());
					clubBean.set(IClubMemberValue.S_CertType, customerinfo.getCustCertType());
					clubBean.set(IClubMemberValue.S_CertCode, customerinfo.getCustCertCode());
					clubBean.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
					clubBean.set(IClubMemberValue.S_MemberLevel, newLevel);// 会员级别
					clubBean.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
					clubBean.set(IClubMemberValue.S_DoneCode, doneCode);// 业务编码
					clubBean.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());//
					clubBean.set(IClubMemberValue.S_CreateDate, CmCommonUtil.getSysDate());//
					clubBean.set(IClubMemberValue.S_RegionId, userBaseInfo.getRegionId());
					clubBean.set(IClubMemberValue.S_CityId, userBaseInfo.getAreaCode());
					clubBean.set(IClubMemberValue.S_CountyId, userBaseInfo.getCountryCode());
					clubBean.set(IClubMemberValue.S_Remarks, "Business change calls VIP entrance Interface");
					voClubMember.setClubMember(clubBean);
				} else {
					value.set(IClubMemberValue.S_MemberLevel, newLevel);
					value.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());
					value.set(IClubMemberValue.S_Remarks, "VIP call business changes modify the interface");
					voClubMember.setClubMember(value);
				}
				IClubMemberCardValue cardValue = new ClubMemberCardBean();
				if (CmCommonUtil.isEmptyObject(memberCardValues)) {
					if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
							|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
						// 修改VIP发卡信息，卡号，年份，级别
						cardValue.setStsToNew();
						cardValue.set(IClubMemberCardValue.S_CardCode, clubServiceSV.getVipCardCode(userBaseInfo.getRegionId(), newLevel));
						cardValue.set(IClubMemberCardValue.S_CardType, CmLnConstants.vipCardType.CARD1);
						cardValue.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
						cardValue.set(IClubMemberCardValue.S_CardLevel, newLevel);
						cardValue.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
						cardValue.set(IClubMemberCardValue.S_RegionId, userBaseInfo.getRegionId());
						cardValue.set(IClubMemberCardValue.S_CardFlag, CmLnConstants.ClubCardFlag.ClubCardFlag_0);
						voClubMember.setClubMemberCard(cardValue);
					}
				} else {
					if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
							|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
						if (null != memberCardValues) {
							cardValue.copy(memberCardValues[0]);
						}
						cardValue.setStsToOld();
						cardValue.set(IClubMemberCardValue.S_CardCode, clubServiceSV.getVipCardCode(userBaseInfo.getRegionId(), newLevel));
						cardValue.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
						cardValue.set(IClubMemberCardValue.S_CardLevel, newLevel);
						voClubMember.setClubMemberCard(cardValue);
					} else {
						if (null != memberCardValues) {
							cardValue.copy(memberCardValues[0]);
						}
						cardValue.delete();
						voClubMember.setClubMemberCard(cardValue);
					}
				}
				// TODO 如果级别不为123则删除发卡信息
				CmServiceFactory.getClubMemberSV().saveClubMember(voClubMember);
			} else if (isGlobal == 0) {
				// 查1，2，3因子是否存在
				IBOCmVipElementValue[] elementValues = clubServiceSV.queryOtherVipElements(billId, -1);
				if (CmCommonUtil.isNotEmptyObject(elementValues)) {
					for (IBOCmVipElementValue elementValue : elementValues) {
						/*
						 * if (elementValue.getMemberLevel() ==
						 * CmLnConstants.MemberLevel.MemberLevel_1 ||
						 * elementValue.getElementType() ==
						 * CmLnConstants.MemberLevel.MemberLevel_2 ||
						 * elementValue.getElementType() ==
						 * CmLnConstants.MemberLevel.MemberLevel_3) {
						 */
						if (elementValue.getElementType() != CmLnConstants.VipElement.VipElement_6 && elementValue.getElementType() != CmLnConstants.VipElement.VipElement_8) {
							elementValue.delete();
						}
					}
					clubServiceSV.saveVipElement(elementValues);
				}
				// 删除 1，2，3因子，重算
				// 重算级别
				ICmCommonSV sv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				int newLevel = sv.getVipLevle(billId, userBaseInfo);

				// 如果为0 有删除VIP记录、发卡信息，客户经理
				if (newLevel == 0) {
					if (CmCommonUtil.isNotEmptyObject(value)) {
						value.delete();
						voClubMember.setClubMember(value);

						if (memberCardValues != null && memberCardValues.length > 0 && CmCommonUtil.isNotEmptyObject(memberCardValues)) {
							for (IClubMemberCardValue cardValue : memberCardValues) {
								cardValue.delete();
								voClubMember.setClubMemberCard(cardValue);
							}
						}

						CmServiceFactory.getClubMemberSV().saveClubMember(voClubMember);

						// 7.删除VIP与客户经理关系
						Map queryPara = new HashMap();
						queryPara.put("userId", userBaseInfo.getUserId());
						BOCmUserManagerBean[] userManagerValues = null;
						String conditonSql = "and user_id = :userId ";
						StringBuilder userSB = new StringBuilder("");
						userSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());

						userManagerValues = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
								CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);

						if (userManagerValues != null && userManagerValues.length > 0) {
							for (BOCmUserManagerBean value1 : userManagerValues)
								value1.delete();
							CmInnerServiceFactory.getCommonInnerSV().saveBeans(userManagerValues);
						}
					}
				} else if (newLevel > 0) {
					// 如果不为0 更新级别 删除发卡记录
					if (CmCommonUtil.isNotEmptyObject(value)) {
						value.setStsToOld();
						value.set(IClubMemberValue.S_MemberLevel, newLevel);
						value.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());
						value.set(IClubMemberValue.S_Remarks, "VIP call business changes modify the interface");
						voClubMember.setClubMember(value);
						if (CmCommonUtil.isNotEmptyObject(memberCardValues)) {
							if (null != memberCardValues) {
								for (IClubMemberCardValue cardValue : memberCardValues) {
									cardValue.delete();
									voClubMember.setClubMemberCard(cardValue);
								}
							}
						}
					} else {
						clubBean.setStsToNew();
						clubBean.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
						clubBean.set(IClubMemberValue.S_PartyId, customerinfo.getPartyId());
						clubBean.set(IClubMemberValue.S_CustId, customerinfo.getCustId());
						clubBean.set(IClubMemberValue.S_UserId, userBaseInfo.getUserId());
						clubBean.set(IClubMemberValue.S_BillId, billId);
						clubBean.set(IClubMemberValue.S_MemberName, customerinfo.getCustName());
						clubBean.set(IClubMemberValue.S_CertType, customerinfo.getCustCertType());
						clubBean.set(IClubMemberValue.S_CertCode, customerinfo.getCustCertCode());
						clubBean.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
						clubBean.set(IClubMemberValue.S_MemberLevel, newLevel);// 会员级别
						clubBean.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
						clubBean.set(IClubMemberValue.S_DoneCode, doneCode);// 业务编码
						clubBean.set(IClubMemberValue.S_DoneDate, CmCommonUtil.getSysDate());//
						clubBean.set(IClubMemberValue.S_CreateDate, CmCommonUtil.getSysDate());//
						clubBean.set(IClubMemberValue.S_RegionId, userBaseInfo.getRegionId());
						clubBean.set(IClubMemberValue.S_CityId, userBaseInfo.getAreaCode());
						clubBean.set(IClubMemberValue.S_CountyId, userBaseInfo.getCountryCode());
						clubBean.set(IClubMemberValue.S_Remarks, "Business change calls VIP entrance Interface");
						voClubMember.setClubMember(clubBean);
					}
					CmServiceFactory.getClubMemberSV().saveClubMember(voClubMember);
				}
			}
		}

		resultMap.put("returnObj", dealFlag);
		return resultMap;
	}

	public Map qryVipMangerInfo(Map map) throws Exception {

		String billId = isEmpty(map.get("billId")) ? "" : map.get("billId").toString();
		long userId = isEmpty(map.get("userId")) ? -1 : Long.parseLong(map.get("userId").toString());

		if (StringUtils.isBlank(billId) && userId < 0) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}
		int startNum = -1;
		int endNum = -1;

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");

		Map subReturnMap = new HashMap();
		subReturnMap.put("ManagerId", "");
		subReturnMap.put("ManagerGroupId", "");

		// 查询VIP客户信息
		DataContainer dc = new DataContainer();
		if (StringUtils.isNotBlank(billId)) {
			dc.set(IClubMemberValue.S_BillId, billId);
		}
		if (userId > 0) {
			dc.set(IClubMemberValue.S_UserId, userId);
		}
		dc.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
		dc.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		IClubMemberValue[] memberValues = CmServiceFactory.getClubMemberSV().queryClubMembers(dc, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(memberValues)) {
			IClubMemberValue memberValue = memberValues[0];
			// 查询VIP客户电话经理信息
			ICmClubVipMemberSV icmClubVipMember = (ICmClubVipMemberSV) ServiceFactory.getService(ICmClubVipMemberSV.class);
			IQBOSecCustManagerValue[] secManagerValues = icmClubVipMember.queryCmUserManager(String.valueOf(memberValue.getUserId()), -1, -1);
			if (CmCommonUtil.isNotEmptyObject(secManagerValues)) {
				long managerId = secManagerValues[0].getManagerid();
				subReturnMap.put("ManagerId", managerId);
				if (managerId > 0) {
					ICmCustManagerTeamSV icmCustManagerTeam = (ICmCustManagerTeamSV) ServiceFactory.getService(ICmCustManagerTeamSV.class);
					IBOCustManagerTeamRelValue[] teamValues = icmCustManagerTeam.queryCmCustManagerTeamRelByManagerId(managerId);
					if (CmCommonUtil.isNotEmptyObject(teamValues)) {
						subReturnMap.put("ManagerGroupId", teamValues[0].getTeamId());
					}
				}
			}
		}
		returnMap.put("returnObj", subReturnMap);
		return returnMap;
	}

	// 查询是否手机支付用户 0：已与手机支付签约；1：未签约；2：已经与其他缴费渠道办理了签约；9：手机号码不存在
	public Map isMobilePayUser(Map parameter) throws Exception {
		String billId = (String) parameter.get("idValue");
		if (StringUtils.isBlank(billId))
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！

		Map returnMap = new HashMap();
		returnMap.put("returnCode", "0");
		returnMap.put("returnMsg", "Query information ok");
		Map subRtn = new HashMap();
		subRtn.put("signStatus", "1");
		returnMap.put("returnObj", subRtn);

		/* 查询默认付费账户 */
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (userBaseInfo == null) {
			subRtn.put("signStatus", "9");
			return returnMap;
		}

		ISoAccrelValue[] accrelValues = teamInvokeSV.getSoAccrelsByBillId(billId, 1, -1, -1);

		if (CmCommonUtil.isEmptyObject(accrelValues)) {
			ExceptionUtil.throwBusinessException("CMS5000149", billId);// 根据手机号码[{0}]没有找到对应的默认付费账户！
		} else if (accrelValues.length > 1) {
			ExceptionUtil.throwBusinessException("CMS5000150", billId);// 根据手机号码[{0}]查询到多个默认付费账户！
		}
		long acctId = accrelValues[0].getAcctId();

		IBOCmxAcctBankRelValue[] acctBankRelValues = CmServiceFactory.getLnAccountSV().queryAcctBankRel(billId, acctId);

		for (IBOCmxAcctBankRelValue value : acctBankRelValues) {
			if (value.getBusiCode() == CmConstants.CM_BUSI_TYPE.BUSI_CODE_04) {
				subRtn.put("signStatus", "0");
				break;
			}
		}
		return returnMap;
	}

	public Map queryAuditValuesNew(Map paraMap) throws Exception {
		String type = isEmpty(paraMap.get("QueryType")) ? "" : paraMap.get("QueryType").toString();
		String custserviceId = isEmpty(paraMap.get("GroupId")) ? "" : paraMap.get("GroupId").toString();
		int startNum = isEmpty(paraMap.get("StartIndex")) ? -1 : Integer.parseInt(paraMap.get("StartIndex").toString());
		int endNum = isEmpty(paraMap.get("EndIndex")) ? -1 : Integer.parseInt(paraMap.get("EndIndex").toString());
		String auditType = isEmpty(paraMap.get("AuditType")) ? "" : paraMap.get("AuditType").toString();
		String bgnDate = isEmpty(paraMap.get("BgnDate")) ? "" : paraMap.get("BgnDate").toString();
		String endDate = isEmpty(paraMap.get("EndDate")) ? "" : paraMap.get("EndDate").toString();

		if (StringUtils.isBlank(type) || StringUtils.isBlank(custserviceId) || startNum < 0 || endNum < 0 || StringUtils.isBlank(auditType) || StringUtils.isBlank(bgnDate)
				|| StringUtils.isBlank(endDate)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}
		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Successful operation !");

		ICustomerValue[] customerValue;
		DataContainer dc = new DataContainer();
		dc.set(ICustomerValue.S_CustServiceId, custserviceId);
		dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		customerValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);
		if (customerValue == null || customerValue.length <= 0) {
			ExceptionUtil.throwBusinessException("CMS95000029");// CMS95000029
		}

		dc.clear();
		long custId = customerValue[0].getCustId();

		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("");
		Map queryParameter = new HashMap();
		sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupCustomerAuditBean.class).getMapingEnty());

		conditionSql.append(" and cust_id = :custId ");
		queryParameter.put("custId", custId);
		if ("0".equals(type)) {
			conditionSql.append(" and AUDIT_STATUS = :auditStatus ");
			queryParameter.put("auditStatus", 1);
		}
		conditionSql.append(" and AUDIT_TYPE = :auditType ");
		queryParameter.put("auditType", auditType);
		conditionSql.append(" and CREATE_DATE >= DATE_FORMAT( :bgnDate ,'%Y-%m-%d') ");
		queryParameter.put("bgnDate", bgnDate);
		conditionSql.append(" and CREATE_DATE <= DATE_FORMAT( :endDate ,'%Y-%m-%d') ");
		queryParameter.put("endDate", endDate);

		DataContainerInterface[] values = null;
		if (endNum > 0) {
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupCustomerAuditBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), startNum, endNum, queryParameter), queryParameter);
		} else {
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupCustomerAuditBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), min, max, queryParameter), queryParameter);
		}

		if (startNum == 1)// 为1时,需要返回总数.
		{
			DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
					CmLnCommonUtil.getQueryCount(sql.toString(), conditionSql.toString(), queryParameter), queryParameter);
			map.put("Count", counts[0].getAsInt("CNT"));
		}
		List returnList = new ArrayList();
		if (values != null && values.length > 0) {

			for (DataContainerInterface value : values) {
				Map mgrMap = CmFSVUtil.value2Map(value, false);
				returnList.add(mgrMap);
			}
		}
		map.put("ManagerApplyInfo", returnList);

		return map;
	}

	public Map queryAuditValues(Map paraMap) throws Exception {

		String type = isEmpty(paraMap.get("queryType")) ? "" : paraMap.get("queryType").toString();
		long managerId = isEmpty(paraMap.get("managerId")) ? -1 : Long.parseLong(paraMap.get("managerId").toString());

		String start = isEmpty(paraMap.get("startIndex")) ? "" : paraMap.get("startIndex").toString();
		String end = isEmpty(paraMap.get("endIndex")) ? "" : paraMap.get("endIndex").toString();

		if (StringUtils.isBlank(type) || managerId < 0 || StringUtils.isBlank(start) || StringUtils.isBlank(end)) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}

		Map map = new HashMap();
		map.put("retCode", "00");
		map.put("retMsg", "Successful operation !");
		int count = 0;

		ICmGroupCustomerSV cmGroupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);

		DataContainer dt = new DataContainer();

		dt.set(IBOCmGroupCustomerAuditValue.S_ManagerId, managerId);
		if ("0".equals(type)) {
			dt.set(IBOCmGroupCustomerAuditValue.S_AuditStatus, "1");
		}

		if (Integer.valueOf(start) == 1) {
			count = cmGroupCustomerSV.queryAuditValueCount(dt);
		}

		IBOCmGroupCustomerAuditValue[] cmGrpcustomer = cmGroupCustomerSV.queryAuditValue(dt, Integer.valueOf(start), Integer.valueOf(end));

		map.put("CustManagerAuditRec", cmGrpcustomer);
		map.put("Count", count);
		return map;
	}

	public void updateCustStatus(long custId, int newStatus, int oldStatus) throws Exception {
		if (custId <= 0) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (newStatus < 0 || newStatus > 2) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.GROUP) {
			ICmCustomerSV iCmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			DataContainer dt = new DataContainer();
			dt.set(IGroupMemberValue.S_CustId, custId);
			dt.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
			IGroupMemberValue[] grpMember = iCmCustomerSV.queryGroupMembers(dt, -1, -1);
			if (grpMember == null || grpMember.length <= 0) {
				CmServiceFactory.getCustomerSV().updateCustStatus(custId, newStatus, oldStatus);
			}
		} else {
			CmServiceFactory.getCustomerSV().updateCustStatus(custId, newStatus, oldStatus);
		}
	}

	public Map queryAgentPartnerInfo(Map paraMap) throws Exception {
		// TODO Auto-generated method stub
		Map resultMap = new HashMap();
		resultMap.put("returnCode", "0");
		resultMap.put("returnMsg", "Query information ok");

		String city = paraMap.get("channelCity").toString();
		String partner = paraMap.get("partnerId").toString();
		String channel = "";

		ICmPartnerBusiSV partnerBusiSV = (ICmPartnerBusiSV) ServiceFactory.getService(ICmPartnerBusiSV.class);
		IBOCmAgentPartnerInfoValue[] agentPartnerValues = partnerBusiSV.findPartnerAndAgent(partner, channel, city);
		if (CmCommonUtil.isEmptyObject(agentPartnerValues)) {
			agentPartnerValues = new IBOCmAgentPartnerInfoValue[0];
		}
		resultMap.put("returnObj", agentPartnerValues);
		return resultMap;
	}

	public Map queryGMBorContact(long custId, String billId) throws Exception {
		Map resultMap = new HashMap();
		ICmCustomerSV custLn = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmContactSV contactSV = CmServiceFactory.getContactSV();
		ICmClubMemberSV cmSV = CmServiceFactory.getClubMemberSV();

		// 判断集团客户是否存在
		ICustomerValue customerValue = custLn.queryCustomerByCustId(custId);
		if (null == customerValue) {
			ExceptionUtil.throwBusinessException("CMS8000043");
			// retCode="1004";
			// retMsg=CrmLocaleFactory.getResource("CMS8000043");//客户信息不存在
		}
		resultMap.put("CUST_ID", customerValue.getCustId()); // 集团客户id
		resultMap.put("CUST_NAME", customerValue.getCustName()); // 集团客户名称
		resultMap.put("CUST_SERVICE_ID", customerValue.getCustServiceId()); // 集团编码
		resultMap.put("CUST_SERVICE_LEVEL", customerValue.getCustServiceLevel()); // 集团级别

		// 查询集团成员表
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupMemberValue.S_CustId, custId);
		dt.set(IBOCmGroupMemberValue.S_BillId, billId);
		dt.set(IBOCmGroupMemberValue.S_MemberType, CmLnConstants.GroupContType.GROUP_MEMBER_INNER);
		dt.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);
		IGroupMemberValue[] cmGrpMembers = custLn.queryGroupMembers(dt, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmGrpMembers) && cmGrpMembers.length > 0) {
			IGroupMemberValue gmb = cmGrpMembers[0];
			resultMap.put("IS_INNER_MEMBER", 1); // 是否网内成员：1表示集团网内成员,0表示不是网内成员
			resultMap.put("MEMBER_CUST_NAME", gmb.getMemberName());// 成员姓名
			resultMap.put("MEMBER_USER_ID", gmb.getUserId());// 成员用户编号
			resultMap.put("MEMBER_BILL_ID", gmb.getBillId());// 成员手机号码
			resultMap.put("MEMBER_STATUS", gmb.getMemberStatus());// 成员角色：辽宁特殊处理：用来标识这个成员是普通成员还是产品管理员
			// 产品管理员：9
			// 普通成员：3
		} else {
			resultMap.put("IS_INNER_MEMBER", 0);
		}

		// 查询集团家属
		DataContainer dt2 = new DataContainer();
		dt2.set(IContactValue.S_CustId, custId);
		dt2.set(IContactValue.S_ContType, CmLnConstants.GroupContType.GROUP_FAMILY);
		dt2.set(IContactValue.S_BillId, billId);
		IContactValue[] contactValues = contactSV.queryCustContacts(dt2, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues) && contactValues.length > 0) {
			IContactValue cv = contactValues[0];
			resultMap.put("IS_GROUP_FAMILY_CONTACT", 1);// 是否集团家属：1表示集团家属，0表示不是集团家属
			resultMap.put("CONT_NAME", cv.getContName());// 家属姓名
			resultMap.put("CONT_USER_ID", cv.getUserId());// 家属用户编号
			resultMap.put("CONT_BILL_ID", cv.getBillId());// 家属手机号码
		} else {
			resultMap.put("IS_GROUP_FAMILY_CONTACT", 0);
		}

		// 查询大客户信息
		// 查询会员是否存在
		IClubMemberValue memberValue = cmSV.queryVIPClubMemberByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(memberValue)) {
			if (memberValue.getMemberLevel() > 0) {
				resultMap.put("IS_VIP", 1);// 是否是VIP客户，1表示是VIP，0表示不是VIP
				resultMap.put("CLUB_VIP_LEVEL", memberValue.getMemberLevel());// VIP级别,1钻，2金，3银，4大客户，5个人贵宾卡，6集团贵宾卡
				resultMap.put("CLUB_BILL_ID", memberValue.getBillId());// 手机号码
				resultMap.put("CLUB_MEMBER_NAME", memberValue.getMemberName());// 会员名称
			} else {
				resultMap.put("IS_VIP", 0);
			}
		} else {
			resultMap.put("IS_VIP", 0);
		}

		return resultMap;
	}

	public String getGroupManagerByCustIdOrGroupId(long custId, String groupId) throws Exception {
		if (custId <= 0 && (groupId == null || "".equals(groupId.trim())))
			return "";

		long relCustId = 0L;

		if (custId <= 0) {
			DataContainer dc = new DataContainer();
			dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			dc.set(ICustomerValue.S_CustServiceId, groupId);
			ICustomerValue[] customerValue = CmServiceFactory.getCustomerSV().queryCustomers(dc, min, max);

			if (customerValue == null || customerValue.length <= 0)
				return "";

			relCustId = customerValue[0].getCustId();
		} else {
			relCustId = custId;
		}

		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(BOCmGroupManagerBean.S_CustId).append(" = :custId ");
		condition.append(" and ").append(BOCmGroupManagerBean.S_RelType).append(" = :relType ");
		paraMap.put("custId", String.valueOf(relCustId));
		paraMap.put("relType", "1"); // main custManager
		DataContainerInterface[] managerDc = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupManagerBean.class, condition.toString(), paraMap, min, max);
		String relManagerId = "";
		if (managerDc != null && managerDc.length > 0) {
			relManagerId = managerDc[0].getAsString(BOCmGroupManagerBean.S_ManagerId);
		}
		return relManagerId;
	}

	public Map queryGroupMemberByCustId(Map map) throws Exception {
		// TODO Auto-generated method stub
		Map resultMap = new HashMap();
		resultMap.put("returnCode", "0");
		resultMap.put("returnMsg", "Query information ok");
		int queryType = isEmpty(map.get("Action")) ? 0 : Integer.valueOf(map.get("Action").toString());
		long custId = isEmpty(map.get("CustId")) ? 0 : Long.valueOf(map.get("CustId").toString());
		int count = 0;
		switch (queryType) {
			case 0:
				String sql = "select * from cm_group_member t where cust_id in "
						+ "(select cust_id  from cm_group_customer t start with t.cust_id = :custId  and t.state = :state "
						+ " connect by t.parent_cust_id = prior t.cust_id) and state =:state and member_type = :memberType ";
				HashMap parameter = new HashMap();
				parameter.put("custId", custId);
				parameter.put("state", CmConstants.RecordState.USE);
				parameter.put("memberType", CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);
				DataContainerInterface[] members = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, CmLnCommonUtil.getQueryCount(sql, "", parameter),
						parameter);
				if (CmCommonUtil.isNotEmptyObject(members)) {
					count = members[0].getAsInt("CNT");
				}
				break;
			case 1:
				String sql1 = "select * from cm_group_member t where cust_id = :custId and t.state = :state and member_type = :memberType ";
				HashMap parameter1 = new HashMap();
				parameter1.put("custId", custId);
				parameter1.put("state", CmConstants.RecordState.USE);
				parameter1.put("memberType", CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);

				DataContainerInterface[] members1 = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, CmLnCommonUtil.getQueryCount(sql1, "", null),
						parameter1);
				if (CmCommonUtil.isNotEmptyObject(members1)) {
					count = members1[0].getAsInt("CNT");
				}
				break;

			default:
				break;
		}

		resultMap.put("returnObj", count);
		return resultMap;
	}

	public Map queryCustUnionInfo(Map parameter) throws Exception {

		Map subReturnMap = new HashMap();
		Map resultMap = new HashMap();
		subReturnMap.put("returnCode", "0");
		subReturnMap.put("returnMsg", "Query information ok");

		long custId = isEmpty(parameter.get("custId")) ? 0 : Long.valueOf(parameter.get("custId").toString());
		long userId = isEmpty(parameter.get("userId")) ? 0 : Long.valueOf(parameter.get("userId").toString());
		long acctId = isEmpty(parameter.get("acctId")) ? 0 : Long.valueOf(parameter.get("acctId").toString());

		if (custId < 0 || userId < 0 || acctId < 0) {
			ExceptionUtil.throwBusinessException("CMS0076044");// 传入参数有误！
		}

		resultMap.put("CUST_NAME", ""); // 客户名称
		resultMap.put("BIRTHDAY", ""); // 客户生日
		resultMap.put("PAY_METHOD", ""); // 支付类型
		resultMap.put("CREDIT_LEVEL", ""); // 信誉等级
		resultMap.put("CREDIT_VALUE", ""); // 信誉额度
		resultMap.put("OUTLINE_ALARM", ""); // 离网预警
		resultMap.put("AVG_ARPU", ""); // 平均ARPU
		resultMap.put("CURRENT_TERMINAL", ""); // 当前终端
		resultMap.put("FLUX_USE", ""); // 流量使用
		resultMap.put("AVG_CALL_TIMES_DAY", ""); // 日平均通话时长
		resultMap.put("FIELD_1", ""); // 预留字段1
		resultMap.put("FIELD_2", ""); // 预留字段2
		resultMap.put("FIELD_3", ""); // 预留字段3
		resultMap.put("FIELD_4", ""); // 预留字段4
		resultMap.put("FIELD_5", ""); // 预留字段5
		resultMap.put("FIELD_6", ""); // 预留字段6
		resultMap.put("FIELD_7", ""); // 预留字段7
		resultMap.put("FIELD_8", ""); // 预留字段8
		resultMap.put("FIELD_9", ""); // 预留字段9
		resultMap.put("FIELD_10", ""); // 预留字段10

		// 查询客户信息
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			resultMap.put("CUST_NAME", customerValue.getCustName());
			resultMap.put("BIRTHDAY", customerValue.getBirthday());
		}

		// 查询账户信息
		IAccountProfileValue[] values = CmServiceFactory.getAccountSV().queryAcctDtsById(acctId, -1, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			IAccountProfileValue value = values[0];

			IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_ACCOUNT_PAY_METHOD", String.valueOf(value.getPayMethod()));

			resultMap.put("PAY_METHOD", staticDataValue.getCodeName());

			// long credit = value.getCreditLevel();
			// if (credit > 50 && credit <= 65) {
			// IBOBsStaticDataValue creditDataValue = StaticDataUtil.getStaticData("CM_CREDIT_LEVEL",
			// String.valueOf(value.getCreditLevel()));
			// resultMap.put("CREDIT_LEVEL", creditDataValue.getCodeName());
			// } else {
			// resultMap.put("CREDIT_LEVEL", "未知");
			// }
			//
			// resultMap.put("CREDIT_VALUE", value.getCreditValue());
		}

		// 查询用户扩展信息
		StringBuilder condition = new StringBuilder();
		Map map = new HashMap();
		condition.append(IBOLnCmCustUnionInfoValue.S_UserId).append(" = :USER_ID ");
		map.put("USER_ID", userId);
		IBOLnCmCustUnionInfoValue[] custUnionValues = (IBOLnCmCustUnionInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmCustUnionInfoBean.class,
				condition.toString(), map, -1, -1);

		if (CmCommonUtil.isNotEmptyObject(custUnionValues)) {

			IBOLnCmCustUnionInfoValue custUnionValue = custUnionValues[0];

			String outlineAlarm = custUnionValue.getOutlineAlarm();

			if ("-1".equals(outlineAlarm)) {
				outlineAlarm = "Unknown";
			} else {
				outlineAlarm = outlineAlarm + "Level";
			}

			String currentTerminal = custUnionValue.getCurrentTerminal();
			if (!"".equals(currentTerminal)) {

				StringBuilder condition1 = new StringBuilder();
				Map map1 = new HashMap();
				condition1.append(IBOCmCustUnionFieldMappingValue.S_FieldCode).append(" = :FIELD_CODE ");
				condition1.append(" AND  ");
				condition1.append(IBOCmCustUnionFieldMappingValue.S_FieldType).append(" = :FIELD_TYPE ");
				map1.put("FIELD_CODE", currentTerminal);
				map1.put("FIELD_TYPE", "2");

				IBOCmCustUnionFieldMappingValue[] values1 = (IBOCmCustUnionFieldMappingValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(
						BOCmCustUnionFieldMappingBean.class, condition1.toString(), map1, -1, -1);

				if (CmCommonUtil.isNotEmptyObject(values1)) {

					IBOCmCustUnionFieldMappingValue value = values1[0];
					currentTerminal = value.getFieldValue();

				} else {
					currentTerminal = "";
				}

			}

			String currentTerminal2 = custUnionValue.getField1();
			if (!"".equals(currentTerminal2)) {

				StringBuilder condition2 = new StringBuilder();
				Map map2 = new HashMap();
				condition2.append(IBOCmCustUnionFieldMappingValue.S_FieldCode).append(" = :FIELD_CODE ");
				condition2.append(" AND  ");
				condition2.append(IBOCmCustUnionFieldMappingValue.S_FieldType).append(" = :FIELD_TYPE ");
				map2.put("FIELD_CODE", currentTerminal2);
				map2.put("FIELD_TYPE", "1");

				IBOCmCustUnionFieldMappingValue[] values2 = (IBOCmCustUnionFieldMappingValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(
						BOCmCustUnionFieldMappingBean.class, condition2.toString(), map2, -1, -1);

				if (CmCommonUtil.isNotEmptyObject(values2)) {

					IBOCmCustUnionFieldMappingValue value = values2[0];
					currentTerminal2 = value.getFieldValue();

				} else {
					currentTerminal2 = "";
				}

			}

			resultMap.put("OUTLINE_ALARM", outlineAlarm); // 离网预警
			resultMap.put("AVG_ARPU", custUnionValue.getAvgArpu()); // 平均ARPU
			resultMap.put("CURRENT_TERMINAL", currentTerminal); // 当前终端 终端品牌
			resultMap.put("FLUX_USE", custUnionValue.getFluxUse()); // 流量使用
			resultMap.put("AVG_CALL_TIMES_DAY", custUnionValue.getAvgCallTimesDay()); // 日平均通话时长
			resultMap.put("FIELD_1", currentTerminal2); // 预留字段1 终端型号
			resultMap.put("FIELD_2", custUnionValue.getField2()); // 预留字段2
			// 点对点短信计费量（KB）
			resultMap.put("FIELD_3", custUnionValue.getField3()); // 预留字段3
			// 换机倾向指数
			resultMap.put("FIELD_4", custUnionValue.getField4()); // 预留字段4
			resultMap.put("FIELD_5", custUnionValue.getField5()); // 预留字段5
			resultMap.put("FIELD_6", custUnionValue.getField6()); // 预留字段6
			resultMap.put("FIELD_7", custUnionValue.getField7()); // 预留字段7
			resultMap.put("FIELD_8", custUnionValue.getField8()); // 预留字段8
			resultMap.put("FIELD_9", custUnionValue.getField9()); // 预留字段9
			resultMap.put("FIELD_10", custUnionValue.getField10()); // 预留字段10
		}

		subReturnMap.put("returnObj", resultMap);
		return subReturnMap;
	}

	public boolean hasSecForQry(long userId, String billId, long custId, String regionId, String curRegionId, long operId) throws Exception {
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		return commonSV.hasSecForQry(userId, billId, custId, regionId, curRegionId, operId);
	}

	public IQBOSecCustManagerValue[] qryGroupMangerInfoByBillId(String billId) throws Exception {
		if (isEmpty(billId)) {
			throw new Exception("Phone number is required");
		}
		// step1根据手机号码查询网内成员信息
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_BillId, billId);// 手机号码
		condition.set(IGroupMemberValue.S_State, CmConstants.RecordState.USE);// 是否可用
		condition.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_IN);// 网内成员
		IGroupMemberValue[] groupMembers = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
		if (groupMembers == null || groupMembers.length == 0) {
			return null;
		}
		long custId = groupMembers[0].getCustId();
		// step2 根据集团客户编号查找集团信息
		ICustomerValue customer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if (CmCommonUtil.isEmptyObject(customer)) {
			throw new Exception("Group of customer information does not exist");
		}
		// step3 根据cust_id获取集团的客户经理，获取客户经理ID
		StringBuffer sqlMgr = new StringBuffer("");
		Map param = new HashMap();
		sqlMgr.append(" 1 = 1 AND  STATE = :state ");
		sqlMgr.append(" AND CUST_ID = :custId ");
		param.put("state", CmConstants.RecordState.USE);
		param.put("custId", custId);
		DataContainerInterface[] managerDc = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupManagerBean.class, sqlMgr.toString(), param, -1, -1);
		if (CmCommonUtil.isEmptyObject(managerDc)) {
			return null;
		} else {
			int count = managerDc.length;
			long[] managerId = new long[count];
			for (int i = 0; i < count; i++) {
				managerId[i] = managerDc[i].getAsLong(IBOCmGroupManagerValue.S_ManagerId);
			}
			// step4 调用外部接口查询客户经理信息IQBOSecCustManagerValue[]
			ISec2CmSV sv = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			IQBOSecCustManagerValue[] value = sv.getCustManager("", 3, "", "", "", managerId, -1, -1, "", -1, -1);
			return value;
		}
	}

	// add by guansj
	public void synCustInfo(long phoneNum, long oldCustId, long newCustId) throws Exception {
		if (isEmpty(phoneNum)) {
			throw new Exception("The phone number can not be empty!");
		}
		if (isEmpty(oldCustId)) {
			throw new Exception("CustId before transfer can not be empty !");
		}
		if (isEmpty(newCustId)) {
			throw new Exception("After the transfer CustId not be empty!");
		}
		long newPartyId = 0L;
		String newCustName = "";
		long custId = 0L;
		long contType = 0;
		String contId = "";
		String custServiceId = "";
		// step1 根据新客户编号查询个人客户信息取得需要更新信息的最新值
		BOCmIndivCustomerBean beanIndiv = new BOCmIndivCustomerBean();
		beanIndiv.setCustId(newCustId);
		IBOCmIndivCustomerValue indivValue = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(beanIndiv);
		if (CmCommonUtil.isEmptyObject(indivValue)) {
			ExceptionUtil.throwBusinessException("CMS1100082");// 客户信息不存在
		}
		newCustName = indivValue.getCustName();
		newPartyId = indivValue.getPartyId();
		contId = indivValue.getCustCertCode();
		contType = indivValue.getCustCertType();
		custServiceId = indivValue.getCustServiceId();
		// step2 根据旧客户编号查询CM_GROUP_MEMBER是否存在旧数据若存在则替换member_cust_id
		// member_cust_name
		ICmCustomerSV custLn = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupMemberValue.S_MemberCustId, oldCustId);
		dt.set(IBOCmGroupMemberValue.S_BillId, phoneNum);
		IGroupMemberValue[] cmGrpMembers = custLn.queryGroupMembers(dt, -1, -1);
		if (null != cmGrpMembers && cmGrpMembers.length > 0) {// 判断是否为集团成员，若不是则不进行CM_GROUP_MEMBER和CM_GROUP_CONTACT信息修改
			custId = cmGrpMembers[0].getCustId();// 集团编码
			IVOCustValue custValue = new VOCustBean();
			IBOCmGroupMemberValue cmGroupMemberValue = new BOCmGroupMemberBean();
			ICustRelationshipValue custRelValue = new CustRelationshipBean();
			cmGroupMemberValue.copy(cmGrpMembers[0]);
			cmGroupMemberValue.setStsToOld();
			cmGroupMemberValue.setMemberCustId(newCustId);
			cmGroupMemberValue.setMemberName(newCustName);
			custRelValue.copy(cmGroupMemberValue);
			custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			custValue.addCustRel(custRelValue);
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);

			// step3 根据新客户编号查询CM_GROUP_CONTACT是否存在旧数据若存在则替换party_id cont_id
			// cont_type
			ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			DataContainer da = new DataContainer();
			da.set(IBOCmGroupContactValue.S_CustId, custId);
			da.set(IBOCmGroupContactValue.S_BillId, phoneNum);
			IContactValue[] contactValues = iCmContactSV.queryCustContacts(da, -1, -1);
			if (null != contactValues && contactValues.length > 0) {
				IContactValue iContactValue = new ContactBean();
				iContactValue.copy(contactValues[0]);
				iContactValue.setStsToOld();
				iContactValue.setPartyId(newPartyId);
				iContactValue.setContId(Long.valueOf(contId));
				Long longValue=contType;
				iContactValue.setContType(longValue.intValue());
				CmServiceFactory.getContactSV().saveCustContact(iContactValue);
			}
		}

		// step4 根据手机号码查询CM_CLUB_MEMBER是否存在旧数据若存在则替换party_id cust_id
		ICmClubMemberSV cmSV = CmServiceFactory.getClubMemberSV();
		IClubMemberValue memberValue = cmSV.queryVIPClubMemberByBillId(String.valueOf(phoneNum));
		if (null != memberValue && !"".equals(memberValue)) {
			IClubMemberValue tempClub = new ClubMemberBean();
			tempClub.copy(memberValue);
			tempClub.setStsToOld();
			tempClub.setPartyId(newPartyId);
			tempClub.setCustId(newCustId);
			CmServiceFactory.getClubMemberSV().saveClubMember(tempClub);
		}
	}

	public IContactValue[] queryGroupContacts(long custId, int contType, int prioryLevel) throws Exception {
		ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer dc = new DataContainer();
		if (custId > 0) {
			dc.set(IContactValue.S_CustId, Long.valueOf(custId));
		}
		if (contType > 0) {
			dc.set(IContactValue.S_ContType, Integer.valueOf(contType));
		}
		if (prioryLevel > 0) {
			dc.set(IContactValue.S_PrioryLevel, Integer.valueOf(prioryLevel));
		}
		return contactSV.queryCustContacts(dc, -1, -1);
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByIds(long[] custIds) throws Exception {
		ICmLnCommonServiceSV service = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		return service.queryCmInsCmRelByIds(custIds);
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCdns(long custId, long userId, int relType, int userType) throws Exception {
		ICmLnCommonServiceSV service = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		return service.queryCmInsCmRelByCdns(custId, userId, relType, userType);
	}

	public String[] getCustomerInfoGLConfig() throws Exception {
		String[] cols = null;
		String codeName = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUSTOMER_INFO_GL", "1");
		if (StringUtils.isNotBlank(codeName)) {
			cols = StringUtils.split(codeName, "\\|");
		}
		return cols;
	}

	public long dealAccount(IVOAccountValue voAccountValue) throws Exception {
		if (voAccountValue.getAccount().getAcctStatus() <= 0) {
			voAccountValue.getAccount().setAcctStatus(1);// 默认账户状态为正常
		}
		if (StringUtils.isBlank(voAccountValue.getAccount().getRegionId())) {
			voAccountValue.getAccount().setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		if (StringUtils.isBlank(voAccountValue.getAccount().getState())) {
			voAccountValue.getAccount().setState(CmConstants.RecordState.USE);
		}

		// 个人账户默认为收税
		if (StringUtils.isBlank(voAccountValue.getAccount().getUrgeStopFlag())) {
			voAccountValue.getAccount().setUrgeStopFlag("1");
		}

		// 判断是否有账户支付信息
		if (!voAccountValue.hasPayments()) {
			IAcctPaymentValue acctPaymentValue = new AcctPaymentBean();
			acctPaymentValue.setPayMethod(2);// 默认账户归属为自有
			acctPaymentValue.setRegionId(voAccountValue.getAccount().getRegionId());
			acctPaymentValue.setState(CmConstants.RecordState.USE);
			voAccountValue.addPayment(acctPaymentValue);
			voAccountValue.setPayMethod(2);
		} else {
			if (voAccountValue.getPayments()[0].getPayMethod() <= 0) {
				voAccountValue.getPayments()[0].setPayMethod(2);
				voAccountValue.setPayMethod(2);
			} else {
				voAccountValue.setPayMethod(voAccountValue.getPayments()[0].getPayMethod());
			}
			if (StringUtils.isBlank(voAccountValue.getPayments()[0].getRegionId())) {
				voAccountValue.getPayments()[0].setRegionId(voAccountValue.getAccount().getRegionId());
			}
			if (StringUtils.isBlank(voAccountValue.getPayments()[0].getState())) {
				voAccountValue.getPayments()[0].setState(CmConstants.RecordState.USE);
			}
		}
		// 判断是否有账期信息
		if (!voAccountValue.hasBillCycle()) {
			IAcctBillCycleValue acctBillCycleValue = new AcctBillCycleBean();
			acctBillCycleValue.setCycleType(5);// 默认按月出账
			acctBillCycleValue.setBillDay(16);// 默认1号
			acctBillCycleValue.setRegionId(voAccountValue.getAccount().getRegionId());
			acctBillCycleValue.setState(CmConstants.RecordState.USE);
			voAccountValue.setBillCycle(acctBillCycleValue);
		} else {
			if (voAccountValue.getBillCycles()[0].getCycleType() <= 0) {
				voAccountValue.getBillCycles()[0].setCycleType(5);
			}
			if (voAccountValue.getBillCycles()[0].getBillDay() <= 0) {
				voAccountValue.getBillCycles()[0].setBillDay(16);
			}
			if (StringUtils.isBlank(voAccountValue.getBillCycles()[0].getRegionId())) {
				voAccountValue.getBillCycles()[0].setRegionId(voAccountValue.getAccount().getRegionId());
			}
			if (StringUtils.isBlank(voAccountValue.getBillCycles()[0].getState())) {
				voAccountValue.getBillCycles()[0].setState(CmConstants.RecordState.USE);
			}
		}
		if (voAccountValue.getPayMethod() == 2 && voAccountValue.getAccount().getInstallmentFlag() != CmConstants.InstallmentFlag.New_Installment_Account) {
			// 默认创建payer是客户自己
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue value = partySV.queryPayerbyCustId(voAccountValue.getCustId());
			partySV.createPayerByCds(value);
			voAccountValue.setPayerId(value.getPartyId());
		}
		long acctId = CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
		return acctId;
	}

	public long dealCustomer(IVOCustValue voCustValue) throws Exception {
		int custType = voCustValue.getCustType();

		if (voCustValue.getCustomer().getCustStatus() <= 0) {
			if (custType == CmConstants.CustomerType.INDIVIDUAL) {
				voCustValue.getCustomer().setCustStatus(0);// 默认客户状态为潜在
			} else {
				voCustValue.getCustomer().setCustStatus(0);// 默认客户状态为潜在
			}
		}
		if (StringUtils.isBlank(voCustValue.getCustomer().getRegionId())) {
			voCustValue.getCustomer().setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		if (StringUtils.isBlank(voCustValue.getCustomer().getState())) {
			voCustValue.getCustomer().setState(CmConstants.RecordState.USE);
		}

		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			if (voCustValue.getCustomer().isNew()) {
				// 实时查询CPR接口
				queryCPRInfo(voCustValue);
			}

			// 针对个人潜在客户补录资料
			ICustomerValue customer = voCustValue.getCustomer();
			if (customer.getCustStatus() == CmConstants.CustomerStatus.INDIV_POTENTIAL && customer.getIsVip() == 1) {
				String cpr = customer.getCustCertCode();
				if (StringUtils.isNotBlank(cpr) && StringUtils.isNumeric(cpr)) {
					if (customer.getAnonymousFlag() == 1) {
						customer.setAnonymousFlag(0);
					}
					// cprnumber奇数为male,偶数为female
					if (Long.parseLong(cpr) % 2 == 1) {
						customer.setGender(1);
					} else {
						customer.setGender(2);
					}
				}
			}

			// 客户扩展信息
			String codeValueAddtional = CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer;
			IBOCmxIndivCustomerValue indivCustomerValue = (IBOCmxIndivCustomerValue) voCustValue.getUserObject(codeValueAddtional);
			if (indivCustomerValue == null) {
				indivCustomerValue = new BOCmxIndivCustomerBean();
				indivCustomerValue.setRegionId(voCustValue.getCustomer().getRegionId());
				indivCustomerValue.setState(CmConstants.RecordState.USE);
			} else {
				if (StringUtils.isBlank(indivCustomerValue.getRegionId())) {
					indivCustomerValue.setRegionId(voCustValue.getCustomer().getRegionId());
				}
				if (StringUtils.isBlank(indivCustomerValue.getState())) {
					indivCustomerValue.setState(CmConstants.RecordState.USE);
				}
			}
			if (indivCustomerValue.isNew()) {
				voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
			} else if (indivCustomerValue.isModified()) {
				voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
			} else if (indivCustomerValue.isDeleted()) {
				voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
			}
		}
		// 针对已有的客户新增联系媒介
		try {
			specialHandleContactInfo(voCustValue);
		} catch (Exception e) {
			log.error("dealCustomer specialHandleContactInfo error.", e);
		}
		return CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
	}

	private void specialHandleContactInfo(IVOCustValue voCustValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(voCustValue.getCustContMedium()) && voCustValue.getCustomer().getCustId() > 0) {
			long custId = voCustValue.getCustomer().getCustId();
			List<Integer> list = new ArrayList<>();
			for (Integer i = 1; i < 11; i++) {
				list.add(i);
			}
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IQBOCmCustContMediumAndTypeValue[] contMediumAndTypeValues = custSV.queryCustElectronicMedium(custId, -1, -1);
			for (IQBOCmCustContMediumAndTypeValue value : contMediumAndTypeValues) {
				if (value.getPriority() > 0 && list.contains(value.getPriority())) {
					Integer intValue=value.getPriority();
					list.remove(intValue);
				}
			}

			int flag = 0;
			IBOCmCustContactMediumValue[] values = voCustValue.getCustContMedium();
			for (IBOCmCustContactMediumValue value : values) {
				if (value.isNew() && !String.valueOf(value.getContMedTypeId()).startsWith("1")) {
					flag++;
				}
			}
			// 首先判断新增的联系媒介数量是否超过了可分配的联系媒介数
			if (list.size() < flag) {
				// 联系媒介的条数不能多于10
				ExceptionUtil.throwBusinessException("CMS9988839");
			}

			// 客户电子联系媒介优先级1未占用
			if (CollectionUtils.isNotEmpty(list) && list.contains(1)) {
				boolean existEmail = false;
				String emailAddress = "";
				for (IBOCmCustContactMediumValue value : values) {
					if (value.isNew() && String.valueOf(value.getContMedTypeId()).startsWith("2")) {
						existEmail = true;
						emailAddress = value.getEmailAddress();
						break;
					}
				}
				List<Integer> newList = new ArrayList<>();
				for (Integer i = 2; i < 12; i++) {
					newList.add(i);
				}
				for (IQBOCmCustContMediumAndTypeValue value : contMediumAndTypeValues) {
					if (value.getPriority() > 0 && newList.contains(value.getPriority())) {
						Integer intValue=value.getPriority();
						newList.remove(intValue);
					}
				}
				Integer[] newNums = newList.toArray(new Integer[0]);
				// 1. 当前新增有email，占用优先级1
				if (existEmail) {
					int j = 0;
					for (IBOCmCustContactMediumValue value : values) {
						if (value.isNew() && !String.valueOf(value.getContMedTypeId()).startsWith("1")) {
							if (StringUtils.isBlank(value.getRegionId())) {
								value.setRegionId(CmCommonUtil.getDefaultRegionId());
							}
							if (String.valueOf(value.getContMedTypeId()).startsWith("2")) {
								if (StringUtils.isNotBlank(emailAddress) && emailAddress.equalsIgnoreCase(value.getEmailAddress())) {
									value.setPriority(1);
								} else {
									value.setPriority(newNums[j]);
									j++;
								}
							} else {
								value.setPriority(newNums[j]);
								j++;
							}
						}
					}
				} else {
					// 2. 当前新增无email，占用其他优先级，保留1
					for (int i = 0; i < values.length; i++) {
						if (values[i].isNew() && !String.valueOf(values[i].getContMedTypeId()).startsWith("1")) {
							if (StringUtils.isBlank(values[i].getRegionId())) {
								values[i].setRegionId(CmCommonUtil.getDefaultRegionId());
							}
							values[i].setPriority(newNums[i]);
						}
					}
				}
			} else {
				// 优先级1已被占用维持原有逻辑
				Integer[] nums = list.toArray(new Integer[0]);
				// 客户电子联系媒介优先级1已经被占用,当前新增按剩余优先级一个个占用
				for (int i = 0; i < values.length; i++) {
					if (values[i].isNew() && !String.valueOf(values[i].getContMedTypeId()).startsWith("1")) {
						if (StringUtils.isBlank(values[i].getRegionId())) {
							values[i].setRegionId(CmCommonUtil.getDefaultRegionId());
						}
						values[i].setPriority(nums[i]);
					}
				}
			}
		}
	}

	/**
	 * 处理纯User
	 */
	public long dealPureUser(IVOCustValue voCustValue) throws Exception {
		int custType = voCustValue.getCustType();
		
		if (voCustValue.getCustomer().getCustStatus() <= 0) {
			if (custType == CmConstants.CustomerType.INDIVIDUAL) {
				voCustValue.getCustomer().setCustStatus(0);// 默认客户状态为潜在
			} else {
				voCustValue.getCustomer().setCustStatus(0);// 默认客户状态为潜在
			}
		}
		if (StringUtils.isBlank(voCustValue.getCustomer().getRegionId())) {
			voCustValue.getCustomer().setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		if (StringUtils.isBlank(voCustValue.getCustomer().getState())) {
			voCustValue.getCustomer().setState(CmConstants.RecordState.USE);
		}
		
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			if (voCustValue.getCustomer().isNew()) {
				// 实时查询CPR接口
				queryCPRInfo(voCustValue);
			}
			
			// 针对个人潜在客户补录资料
			ICustomerValue customer = voCustValue.getCustomer();
			if (customer.getCustStatus() == CmConstants.CustomerStatus.INDIV_POTENTIAL) {
				String cpr = customer.getCustCertCode();
				if (StringUtils.isNotBlank(cpr) && StringUtils.isNumeric(cpr)) {
					if (customer.getAnonymousFlag() == 1) {
						customer.setAnonymousFlag(0);
					}
					// cprnumber奇数为male,偶数为female
					if (Long.parseLong(cpr) % 2 == 1) {
						customer.setGender(1);
					} else {
						customer.setGender(2);
					}
				}
			}
			
			// 客户扩展信息
			String codeValueAddtional = CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer;
			IBOCmxIndivCustomerValue indivCustomerValue = (IBOCmxIndivCustomerValue) voCustValue.getUserObject(codeValueAddtional);
			if (indivCustomerValue == null) {
				indivCustomerValue = new BOCmxIndivCustomerBean();
				indivCustomerValue.setRegionId(voCustValue.getCustomer().getRegionId());
				indivCustomerValue.setState(CmConstants.RecordState.USE);
			} else {
				if (StringUtils.isBlank(indivCustomerValue.getRegionId())) {
					indivCustomerValue.setRegionId(voCustValue.getCustomer().getRegionId());
				}
				if (StringUtils.isBlank(indivCustomerValue.getState())) {
					indivCustomerValue.setState(CmConstants.RecordState.USE);
				}
			}
			if (indivCustomerValue.isNew()) {
				voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
			} else if (indivCustomerValue.isModified()) {
				voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
			} else if (indivCustomerValue.isDeleted()) {
				voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
			}
		}
		// 针对已有的客户新增联系媒介
		try {
			specialHandleContactInfo(voCustValue);
		} catch (Exception e) {
			log.error("dealPureUser specialHandleContactInfo error.", e);
		}

		//设置user标示
		voCustValue.setUserObject("CREATE_PUREUSER_FLAG","1");
		
		return CmServiceFactory.getCustomerSV().savePureUser(voCustValue);
	}
	
	private void queryCPRInfo(IVOCustValue voCustValue) throws Exception {
		ICustomerValue customerValue = voCustValue.getCustomer();
		if (customerValue != null) {
			String cprNo = customerValue.getCustCertCode();

			// 获取法律地址
			IVOCustAddressValue[] addressValues = voCustValue.getCustAddress();
			IVOCustAddressValue legalAddress = null;
			if (addressValues != null && addressValues.length > 0) {
				for (int i = 0; i < addressValues.length; i++) {
					if (addressValues[i].getContMedium().getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						legalAddress = addressValues[i];
					}
				}
			}

			// 当接口有传入法律地址，就以接口信息创建客户；接口没有传入法律地址才调用cpr实时接口
			if (StringUtils.isNotBlank(cprNo) && legalAddress == null) {
				Map params = new HashMap();
				params.put("PNR", cprNo);
				// 送CPR进行校验
				ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
				Map cprData = indivService.validateCPR(params);
				String FEJLNR = (String) cprData.get("FEJLNR");
				if (!FEJLNR.equals("00")) {
					// CPR在CPR系统中不存在。
					ExceptionUtil.throwBusinessException("CMS9988772");
				}
				Map data1 = (Map) cprData.get("DATA");
				Map data2 = (Map) data1.get("INFO");
				Map currentData = (Map) data2.get("Current_data");
				// 是否受保护
				String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
				String var = "[0]*";
				if (!isProtected.matches(var)) {
					// 受保护
					ExceptionUtil.throwBusinessException("CMS9988770");
				} else {
					// 从CPR返回的客户名称
					customerValue.setFirstName((CmCommonUtil.capitalizeFirstLetter((String) currentData.get("FORNVN"))).trim());
					customerValue.setLastName((CmCommonUtil.capitalizeFirstLetter((String) currentData.get("EFTERNVN"))).trim());
					// 从CPR返回的生日
					String birthDay = (String) currentData.get("FOEDDTO");
					customerValue.setBirthday(TimeUtil.getTimstampByString(birthDay.trim(), "yyyyMMdd"));
					// cpr返回地址，封装地址对象
					String houseNum = ((String) currentData.get("HUSNR")).trim();
					String floor = (String) currentData.get("ETAGE");
					String sideOrApartNum = (String) currentData.get("SIDEDOER");
					String buildNum = (String) currentData.get("SIDEDOER");
					String streetName = (String) currentData.get("VEJADRNVN");
					String city = (String) currentData.get("POSTDISTTXT");
					String smallCity = (String) currentData.get("BYNVN");
					String postCode = (String) currentData.get("POSTNR");
					String addressDesc = (String) currentData.get("STANDARDADR");
					String munici = (String) currentData.get("KOMKOD");
					address address = new address();
					address.setAddressType(CmConstants.Address.ADDRESSTYPE);
					address.setDistrictId(CmConstants.Address.DISTRICTID);
					if (StringUtils.isNotBlank(houseNum)) {
						if (Character.isLetter(houseNum.charAt(houseNum.length() - 1))) {
							address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0, houseNum.length() - 1).trim())));
							address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length() - 1)));
						} else {
							address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
							address.setHouseLetter("");
						}
					} else {
						address.setHouseLetter("");
						address.setHouseNumber("");
					}
					if (StringUtils.isNotBlank(floor)) {
						if (!StringUtils.isNumeric(floor)) {
							IBOBsStaticDataValue staticValue = StaticDataUtil.getStaticData("CM_ADDRESS_FLOOR_MAPPING", floor);
							address.setFloor(staticValue.getCodeName());
						} else {
							address.setFloor(floor);
						}
					} else {
						address.setFloor("");
					}
					if (StringUtils.isNotBlank(streetName)) {
						address.setStreetName(streetName.trim());
					} else {
						address.setStreetName("");
					}
					if (StringUtils.isNotBlank(city)) {
						address.setCity(city.trim());
					} else {
						address.setCity("");
					}
					if (StringUtils.isNotBlank(smallCity)) {
						address.setCounty(smallCity.trim());
					} else {
						address.setCounty("");
					}
					// 根据特殊规则判断sidedoer的走向
					if (StringUtils.isNotBlank(sideOrApartNum)) {
						if (CmCommonUtil.validateSidedoer(sideOrApartNum)) {
							address.setApartment(sideOrApartNum.trim());
							address.setDoorNumber("");
						} else {
							address.setDoorNumber(sideOrApartNum.trim());
							address.setApartment("");
						}
					} else {
						address.setApartment("");
						address.setDoorNumber("");
					}
					if (StringUtils.isNotBlank(postCode)) {
						address.setZipcode(postCode);
					} else {
						address.setZipcode("");
					}
					if (StringUtils.isNotBlank(munici)) {
						address.setMunicipality(munici);
					} else {
						address.setMunicipality("");
					}
					if (StringUtils.isNotBlank(addressDesc)) {
						address.setAddrDesc(addressDesc);
					} else {
						address.setAddrDesc("");
					}
					address.setMainDoor("");

					// 先删除大对象中的地址对象

					// 封装客户地址大对象
					IVOCustAddressValue addressValue = new VOCustAddressBean();
					IBOCmCustContactMediumValue contMedium = new BOCmCustContactMediumBean();
					addressValue.addAddress(address);
					contMedium.setContMedTypeId(CmConstants.AddressId.legalAddress);
					contMedium.setRegionId((String) CmCommonUtil.getDefaultRegionId());
					addressValue.addContMedium(contMedium);
					voCustValue.addCustAddress(new IVOCustAddressValue[] { addressValue });
				}
			}
		}
	}

	// public static void main(String[] args) throws Exception {
	// UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
	// userInfo.setID(Long.valueOf(123));
	// userInfo.setOrgId(Long.valueOf(213123));
	// userInfo.setTenantId("21");
	// ServiceManager.setServiceUserInfo(userInfo);
	// IVOCustValue voCustValue=new VOCustBean();
	// ICustomerValue custValue=new CustomerBean();
	// custValue.setCustName("hh hh");
	// //custStatus(必填)
	// custValue.setCustStatus(CmConstants.CustomerStatus.GROUP_POTENTIAL);
	// //realNameFlag(必填)
	// custValue.setRealNameFlag(0);
	// //customerType(系统会校验)
	// custValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
	// //firstName,lastName 会校验
	// custValue.setFirstName("hh");
	// custValue.setLastName("hh");
	// IVOCustAddressValue addressValue=new VOCustAddressBean();
	// address addressInfo=new address();
	// addressInfo.setAddrDesc("1");
	// addressInfo.setAddressType("11");
	// addressInfo.setApartment("1");
	// addressInfo.setBlackState("1");
	// addressInfo.setCity("1");
	// addressInfo.setCounty("1");
	// addressInfo.setDeliveryState("1");
	// addressInfo.setDistrictId("012002002");
	// addressInfo.setDoorNumber("1");
	// addressInfo.setFloor("1");
	// addressInfo.setHouseLetter("1");
	// addressInfo.setHouseNumber("1");
	// addressInfo.setMainDoor("1");
	// addressInfo.setMunicipality("1");
	// addressInfo.setStreetName("1");
	// addressInfo.setZipcode("1");
	// addressValue.addAddress(addressInfo);
	//
	// IBOCmCustContactMediumValue medium=new BOCmCustContactMediumBean();
	// medium.setContMedTypeId(11);
	// voCustValue.setCustomer(custValue);
	// addressValue.addContMedium(medium);
	// voCustValue.addCustAddress(new IVOCustAddressValue[]{addressValue});
	//
	// Cm2InterFSVImpl impl=new Cm2InterFSVImpl();
	// impl.dealCustomer(voCustValue);
	//
	// }

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV#getInsAccrelsByAcct(long,
	 * long, int, int)
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int startIdx, int endIdx) throws Exception {
		ICm2SoSV sv = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
		return sv.getInsAccrelsByAcct(acctId, payType, startIdx, endIdx);
	}

	public int getInsAccrelsCountByAcct(long acctId, long payType) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		return sv.getInsAccrelsCountByAcct(acctId, payType);
	}

	public IBOCmCustBadRecordValue[] queryCmCustBadRecord(long custId) throws Exception {
		// 查询客户不良记录
		if (custId > 0) {
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			return commonSV.queryCustBadInfo(custId, -1, -1);
		}
		return null;
	}

	public Map getCustomerDebitStatus(Map map) throws Exception {
		long custId = 0;
		// 客户ID
		Map mapData = new HashMap();
		Map mapInfoA = (Map) map.get("GetCustomerDebitStatus");
		Map mapInfoB = (Map) mapInfoA.get("ScorexCustomerIdDTO");
		// CPR号码
		String cprNum = (String) mapInfoB.get("CprNum");
		// 客户ID
		String cprId = (String) mapInfoB.get("CprId");
		// 客户税号
		String cvr = (String) mapInfoB.get("Cvr");
		// 集团客户KOB number
		String kob = (String) mapInfoB.get("Kob");
		System.out.println("0 cprId:="+cprId);
		
		// 查询客户信息的接口
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 查询账户信息的接口
		ICmAccountSV acctService = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		// 查询扩展信息的接口
		ICmxCustomerSV cmxCustService = (ICmxCustomerSV) ServiceFactory.getService(ICmxCustomerSV.class);
		// 查询客户不良信息的接口
		ICmCommonSV commonService = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		// 查询集团客户信息的接口
		ICmGroupCustomerSV groupService = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ICustomerValue custValue = new CustomerBean();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		SimpleDateFormat sdfB = new SimpleDateFormat("yyyyMMdd");
		// 如果是个人客户
		if (StringUtils.isNotEmpty(cprNum) || StringUtils.isNotEmpty(cprId)) {
			if (StringUtils.isNotEmpty(cprNum)) {
				// 通过CPRnumber查询客户信息
				IBOCmIndivCustomerValue[] value = service.queryCustomerByCPR(cprNum);
				if (CmCommonUtil.isNotEmptyObject(value)) {
					custValue.copy(value[0]);
				}
			} else {
				// 通过custId查询客户信息,如果是7位数就是pnr
				if(cprId.length()<14){
					System.out.println("1 cprId:="+cprId);
//					String condition = "PNR = :S_PNR";
//				    Map map = new HashMap();
//				    map.put("S_PNR",new Long(cprId));
//				    IBOCmIndivCustomerValue[] value = service.queryCustomerByCPR(cprNum);
//				    BOCmxIndivCustomerBean[] beans = getBeans(condition,map);
					ICmIndivCustomerSV cmIndivCustomerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
					Long cprid = cmIndivCustomerSV.queryCustIdByPNR(Long.parseLong(cprId));
					cprId=cprid.toString();
					System.out.println("2 cprId:="+cprId);

				}
				ICustomerValue value = service.queryCustomerByCustId(Long.parseLong(cprId));
				if (CmCommonUtil.isNotEmptyObject(value)) {
					custValue.copy(value);
				}
			}
			
		}
		if(CmCommonUtil.isNotEmptyObject(custValue)){
			
		}else if(cprId.length()>0){
			System.out.println("3 cprId:="+cprId);
			ICmIndivCustomerSV cmIndivCustomerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			Long cprid = cmIndivCustomerSV.queryCustIdByPNR(Long.parseLong(cprId));
			if(cprid>0){
				cprId=cprid.toString();
				System.out.println("4 cprId:="+cprId);
			}			
			System.out.println("5 cprId:="+cprId);
			ICustomerValue value = service.queryCustomerByCustId(Long.parseLong(cprId));
			if (CmCommonUtil.isNotEmptyObject(value)) {
				custValue.copy(value);
			}
		}
		// 如果是集团客户
		if (StringUtils.isNotEmpty(cvr) || StringUtils.isNotEmpty(kob)) {
			if (StringUtils.isNotEmpty(cvr)) {
				ICustomerValue groupValue = groupService.queryGroupCustomerByCVR(cvr);
				if (CmCommonUtil.isNotEmptyObject(groupValue)) {
					custValue.copy(groupValue);
				}
			} else {
				IBOCmGroupCustomerValue groupValue = groupService.queryGroupcustomerByKOB(kob);
				if (CmCommonUtil.isNotEmptyObject(groupValue)) {
					custValue.copy(groupValue);
				}
			}
		}
		if (CmCommonUtil.isNotEmptyObject(custValue)) {
			custId = custValue.getCustId();
			int custStatus = custValue.getCustStatus();
			Timestamp custCreateDate = custValue.getCreateDate();
			// 客户创建时间
			if (null != custCreateDate) {
				mapData.put("LegalCreationDate", sdfB.format(custCreateDate));
			} else {
				mapData.put("LegalCreationDate", "");
			}
			// 客户状态
			mapData.put("BadSuspensionCode", custStatus);
			// 客户可用账户的数量
			ICrmExtFSV extFsv = (ICrmExtFSV) ServiceFactory.getService(ICrmExtFSV.class);
			Map userMap = extFsv.getUserStopOpenStatus(custId);
			if (null != userMap && userMap.size() > 0) {
				mapData.put("NumOpenAccounts", userMap.get("normal"));
				mapData.put("NumSuspendedAccounts", userMap.get("suspend"));
			}
			ICustomerValue cmxCustValue = cmxCustService.queryCmxCustomer(custId);
			Timestamp registerDate = cmxCustValue.getAksRegistrationDate();
			if (null != registerDate) {
				String date = sdf.format(registerDate);
				// 客户注册aks的日期
				mapData.put("AksRegisteredDate", date);
			} else {
				mapData.put("AksRegisteredDate", "");
			}
			// 状态为U的不良记录
			IBOCmCustBadRecordValue[] badRecordValues = commonService.queryCustBadInformation(custId, -1, -1);
			BigDecimal allAmount = new BigDecimal("0");
			if (CmCommonUtil.isNotEmptyObject(badRecordValues)) {
				// 客户不良记录的数量
				mapData.put("NumAksRegistrations", badRecordValues.length);
				long maxTime = 0;
				int maxIndex = 0;
				BigDecimal amountU = new BigDecimal("0");
				for (int i = 0; i < badRecordValues.length; i++) {
					Timestamp recordDate = badRecordValues[i].getCreateDate();
					long time = recordDate.getTime();
					if (time > maxTime) {
						maxTime = time;
						maxIndex = i;
					}
					if (StringUtils.isNotBlank(badRecordValues[i].getAmount())) {
						amountU = amountU.add(new BigDecimal(badRecordValues[i].getAmount().replace(",", ".")));
					}
				}
				allAmount = allAmount.add(amountU);
				// 离现在最近的一个生成时间
				mapData.put("DateLastAksRegistration", sdfB.format(badRecordValues[maxIndex].getCreateDate()));
			} else {
				mapData.put("NumAksRegistrations", "");
				mapData.put("DateLastAksRegistration", "");
			}
			// 状态为E的不良记录
			IBOCmCustBadRecordValue[] deleteBadValues = commonService.queryDeleteCustBadInformation(custId);
			if (CmCommonUtil.isNotEmptyObject(deleteBadValues)) {
				// 客户被消除的记录数
				mapData.put("NumDeletedAksRegistrations", deleteBadValues.length);
				long maxTime = 0;
				int maxIndex = 0;
				BigDecimal amountE = new BigDecimal("0");
				for (int i = 0; i < deleteBadValues.length; i++) {
					Timestamp recordDate = deleteBadValues[i].getCreateDate();
					long time = recordDate.getTime();
					if (time > maxTime) {
						maxTime = time;
						maxIndex = i;
					}
					if (StringUtils.isNotBlank(deleteBadValues[i].getAmount())) {
						amountE = amountE.add(new BigDecimal(deleteBadValues[i].getAmount().replace(",", ".")));
					}
				}
				allAmount = allAmount.add(amountE);
				// 客户最近一个被消除的时间
				mapData.put("DateLastDeletedAksRegistration", sdfB.format(deleteBadValues[maxIndex].getCreateDate()));
			} else {
				mapData.put("NumDeletedAksRegistrations", 0);
				mapData.put("DateLastDeletedAksRegistration", "");
			}
			mapData.put("TotalAmountRegistered", allAmount.toString());
			mapData.put("NumAksWarnings", 0);
			mapData.put("NumAksDeletedWarnings", 0);
			mapData.put("NumberOfInstallmentPlans", 0);
		} else {
			throw new Exception("CMS1100082");
		}
		Map returnMap = new HashMap();
		returnMap.put("DebitStatus", mapData);
		returnMap.put("CustomerId", custId);
		Map returnMapB = new HashMap();
		returnMapB.put("GetCustomerDebitStatusResult", returnMap);
		Map returnMapC = new HashMap();
		returnMapC.put("GetCustomerDebitStatusResponse", returnMapB);
		return returnMapC;
	}

	public IContactValue[] queryCustomerContacts(long custId) throws Exception {
		ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		int[] contTypes = CmConstants.GroupContType.NORMAL_CONTACT;
		List contactList = new ArrayList();
		IContactValue[] contactValues = null;
		for (int m = 0; m < contTypes.length; m++) {// 查询所有联系人信息
			contactValues = dkCustomerSV.queryCustomerContacts(custId, contTypes[m]);
			if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.GROUP && contactValues != null && contactValues.length > 0) {
				for (int i = 0; i < contactValues.length; i++) {
					// 获取主要联系人
					if (contactValues[i].getPrioryLevel() == CmConstants.CONT_LEVEL.CONT_LEVEL_1) {
						contactList.add(contactValues[i]);
					}
				}
			}
		}
		if (!contactList.isEmpty()) {
			return (IContactValue[]) contactList.toArray(new IContactValue[0]);
		}
		return contactValues;
	}

	public IAccountValue[] queryCustAccts(long custId, int acctType) throws Exception {
		ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
		IAccountValue[] acctAccountValues = accountSV.queryAcctsById(-1, custId, -1, -1);
		if (acctAccountValues != null && acctAccountValues.length > 0) {
			if (acctType > 0) {
				List acctList = new ArrayList();
				for (int i = 0; i < acctAccountValues.length; i++) {
					if (acctAccountValues[i].getAcctType() == acctType) {
						acctList.add(acctAccountValues[i]);
					}
				}
				if (!acctList.isEmpty()) {
					return (IAccountValue[]) acctList.toArray(new IAccountValue[0]);
				}
			}
			return acctAccountValues;
		}
		return null;
	}
	
	/**
	 * 为OSE接口 提供
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-9-9
	* Cm2InterFSVImpl
	 */
	public IAccountValue[] queryCustAcctsForOSE(long custId, int acctType) throws Exception {
		ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
		IAccountValue[] acctAccountValues = accountSV.queryAcctsByIdForOSE(-1, custId, -1, -1);
		if (acctAccountValues != null && acctAccountValues.length > 0) {
			if (acctType > 0) {
				List acctList = new ArrayList();
				for (int i = 0; i < acctAccountValues.length; i++) {
					if (acctAccountValues[i].getAcctType() == acctType) {
						acctList.add(acctAccountValues[i]);
					}
				}
				if (!acctList.isEmpty()) {
					return (IAccountValue[]) acctList.toArray(new IAccountValue[0]);
				}
			}
			return acctAccountValues;
		}
		return null;
	}

	public IBOCmPartyRoleValue[] queryCmPartyRole(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_EntityId).append(" =:custId ");
			parameter.put("custId", custId);
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_State).append(" =:state ");
			parameter.put("state", CmConstants.RecordState.USE);
		} else {
			ExceptionUtil.throwBusinessException("CMS0010011");
		}
		return (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyRoleBean.class, condition.toString(), parameter, -1, -1);
	}

	public ICustomerValue queryCustomerByAcctId(long acctId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) accountSV.queryCustAcctRels(acctId, -1, BOCmCustAcctRelBean.class, -1, -1);
		if (acctRelValues != null && acctRelValues.length > 0) {
			long custId = acctRelValues[0].getRelCustId();
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			ICustomerValue customerValue = customerSV.queryCustomerByCustId(custId);
			int custType = CmCommonUtil.getCustType(custId);
			if (customerValue.getCustType() <= 0) {
				customerValue.setCustType(custType);
			}
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(custId, CmDkConstants.CustContMedium.LEGAL_ADDRESS,
					CmDkConstants.CustContMedium.ADDRESS, -1, -1);
			if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
				customerValue.setAddressId(mediumAndTypeValues[0].getAddressId());
			}
			return customerValue;
		}

		return null;
	}

	public ICustomerValue[] queryIndivCustomersByCdns(String custName, String cprNo, long addressId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		if (StringUtils.isNotBlank(custName) || StringUtils.isNotBlank(cprNo)) {
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
			if (StringUtils.isNotBlank(custName)) {
				conditionDC.set(ICustomerValue.S_CustName, custName);
				// conditionDC.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, 1);//右端模糊匹配
			}
			if (StringUtils.isNotBlank(cprNo)) {
				conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.CPR);
				conditionDC.set(ICustomerValue.S_CustCertCode, cprNo);
			}
			ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);

			if (addressId > 0) {
				// 将查询的客户与地址比较，取相同的数据
				if (customerValues != null && customerValues.length > 0) {
					List custList = new ArrayList();
					long custId = 0;
					for (int i = 0; i < customerValues.length; i++) {
						custId = customerValues[i].getCustId();
						IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(custId, CmDkConstants.CustContMedium.LEGAL_ADDRESS,
								CmDkConstants.CustContMedium.ADDRESS, -1, -1);
						if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
							if (mediumAndTypeValues[0].getAddressId() == addressId) {
								custList.add(customerValues[i]);
								customerValues[i].setCustAddress(mediumAndTypeValues[0].getAddressDetail());
							}
						}
					}
					if (!custList.isEmpty()) {
						customerValues = (ICustomerValue[]) custList.toArray(new ICustomerValue[0]);
					}
				} else {
					// 没有查询到客户，则根据地址查询客户
					IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ADDRESS,
							CmDkConstants.CustContMedium.LEGAL_ADDRESS, String.valueOf(addressId));
					if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
						List ids = new ArrayList();
						Map temp = new HashMap();
						for (int i = 0; i < mediumAndTypeValues.length; i++) {
							ids.add(mediumAndTypeValues[i].getCustId());
							temp.put(mediumAndTypeValues[i].getCustId(), mediumAndTypeValues[i].getAddressDetail());
						}
						Long[] tempIds = (Long[]) ids.toArray(new Long[0]);
						long[] longIds = ArrayUtils.toPrimitive(tempIds);
						customerValues = customerSV.queryCustomersByCustIds(longIds, CmConstants.CustomerType.INDIVIDUAL, -1, -1);
						for (int i = 0; i < customerValues.length; i++) {
							customerValues[i].setCustAddress((String) temp.get(customerValues[i].getCustId()));
						}
					}
				}

			} else {
				// 查询客户的法律地址
				for (int i = 0; i < customerValues.length; i++) {
					IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(customerValues[i].getCustId(),
							CmDkConstants.CustContMedium.LEGAL_ADDRESS, CmDkConstants.CustContMedium.ADDRESS, -1, -1);
					if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
						customerValues[i].setCustAddress(mediumAndTypeValues[0].getAddressDetail());
					}
				}
			}
			return customerValues;
		}
		if (StringUtils.isBlank(custName) && StringUtils.isBlank(cprNo) && addressId > 0) {
			// 根据地址查询客户
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ADDRESS,
					CmDkConstants.CustContMedium.LEGAL_ADDRESS, String.valueOf(addressId));
			if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
				List ids = new ArrayList();
				Map temp = new HashMap();
				for (int i = 0; i < mediumAndTypeValues.length; i++) {
					ids.add(mediumAndTypeValues[i].getCustId());
					temp.put(mediumAndTypeValues[i].getCustId(), mediumAndTypeValues[i].getAddressDetail());
				}
				Long[] tempIds = (Long[]) ids.toArray(new Long[0]);
				long[] longIds = ArrayUtils.toPrimitive(tempIds);
				ICustomerValue[] customerValues = customerSV.queryCustomersByCustIds(longIds, CmConstants.CustomerType.INDIVIDUAL, -1, -1);
				for (int i = 0; i < customerValues.length; i++) {
					customerValues[i].setCustAddress((String) temp.get(customerValues[i].getCustId()));
				}
				return customerValues;
			}
		}
		return null;
	}

	public ICustomerValue[] queryGroupCustomersByCdns(String CompanyName, String cvrNo, String kobNo, long addressId, String registrationNo) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		if (StringUtils.isNotBlank(CompanyName) || StringUtils.isNotBlank(cvrNo) || StringUtils.isNotBlank(kobNo) || StringUtils.isNotBlank(registrationNo)) {
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			if (StringUtils.isNotBlank(CompanyName)) {
				conditionDC.set(ICustomerValue.S_CustName, CompanyName);
			}
			if (StringUtils.isNotBlank(kobNo)) {
				conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
				conditionDC.set(ICustomerValue.S_CustCertCode, kobNo);
			}
			if (StringUtils.isNotBlank(cvrNo)) {
				conditionDC.set(ICustomerValue.S_TaxId, cvrNo);
			}
			if (StringUtils.isNotBlank(registrationNo)) {
				conditionDC.set(ICustomerValue.S_RegistrationNumber, Long.parseLong(registrationNo));
			}
			int count = customerSV.queryCustomerCount(conditionDC);
			ICustomerValue[] customerValues = null;
			if (count > 300) {
				// 避免内存溢出，只查询前300条
				customerValues = customerSV.queryCustomers(conditionDC, 0, 300);
			} else {
				customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
			}
			if (addressId > 0) {
				// 将查询的客户与地址比较，取相同的数据
				if (customerValues != null && customerValues.length > 0) {
					List custList = new ArrayList();
					long custId = 0;
					for (int i = 0; i < customerValues.length; i++) {
						custId = customerValues[i].getCustId();
						IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(custId, CmDkConstants.CustContMedium.LEGAL_ADDRESS,
								CmDkConstants.CustContMedium.ADDRESS, -1, -1);
						if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
							if (mediumAndTypeValues[0].getAddressId() == addressId) {
								customerValues[i].setCustAddress(mediumAndTypeValues[0].getAddressDetail());
								custList.add(customerValues[i]);
							}
						}
					}
					if (!custList.isEmpty()) {
						customerValues = (ICustomerValue[]) custList.toArray(new ICustomerValue[0]);
					}
				} else {
					// 没有查询到客户，则根据地址查询客户
					IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ADDRESS,
							CmDkConstants.CustContMedium.LEGAL_ADDRESS, String.valueOf(addressId));
					if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
						List ids = new ArrayList();
						Map temp = new HashMap();
						for (int i = 0; i < mediumAndTypeValues.length; i++) {
							temp.put(mediumAndTypeValues[i].getCustId(), mediumAndTypeValues[i].getAddressDetail());
							ids.add(mediumAndTypeValues[i].getCustId());
						}
						Long[] tempIds = (Long[]) ids.toArray(new Long[0]);
						long[] longIds = ArrayUtils.toPrimitive(tempIds);
						customerValues = customerSV.queryCustomersByCustIds(longIds, CmConstants.CustomerType.GROUP, -1, -1);
						for (int i = 0; i < customerValues.length; i++) {
							customerValues[i].setCustAddress((String) temp.get(customerValues[i].getCustId()));
						}
					}
				}
			} else {
				// 查询客户的法律地址
				if (CmCommonUtil.isNotEmptyObject(customerValues)) {
					for (int i = 0; i < customerValues.length; i++) {
						IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(customerValues[i].getCustId(),
								CmDkConstants.CustContMedium.LEGAL_ADDRESS, CmDkConstants.CustContMedium.ADDRESS, -1, -1);
						if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
							customerValues[i].setCustAddress(mediumAndTypeValues[0].getAddressDetail());
						}
					}
				}
			}
			return customerValues;

		}
		if (addressId > 0 && StringUtils.isBlank(CompanyName) && StringUtils.isBlank(cvrNo) && StringUtils.isBlank(kobNo) && StringUtils.isBlank(registrationNo)) {
			// 根据地址查询客户
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ADDRESS,
					CmDkConstants.CustContMedium.LEGAL_ADDRESS, String.valueOf(addressId));
			if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
				List ids = new ArrayList();
				Map temp = new HashMap();
				for (int i = 0; i < mediumAndTypeValues.length; i++) {
					temp.put(mediumAndTypeValues[i].getCustId(), mediumAndTypeValues[i].getAddressDetail());
					ids.add(mediumAndTypeValues[i].getCustId());
				}
				Long[] tempIds = (Long[]) ids.toArray(new Long[0]);
				long[] longIds = ArrayUtils.toPrimitive(tempIds);
				ICustomerValue[] customerValues = customerSV.queryCustomersByCustIds(longIds, CmConstants.CustomerType.GROUP, -1, -1);
				for (int i = 0; i < customerValues.length; i++) {
					customerValues[i].setCustAddress((String) temp.get(customerValues[i].getCustId()));
				}
				return customerValues;
			}
		}

		return null;
	}

	public ICustomerValue[] queryGroupCustomersByCdnsNew(String CompanyName, String cvrNo, String kobNo, long addressId, String registrationNo) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		if (StringUtils.isNotBlank(CompanyName) || StringUtils.isNotBlank(cvrNo) || StringUtils.isNotBlank(kobNo) || StringUtils.isNotBlank(registrationNo)) {
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			conditionDC.set(ICustomerValue.S_Ext25, CmConstants.YesOrNo.YES);
			if (StringUtils.isNotBlank(CompanyName)) {
				conditionDC.set(ICustomerValue.S_CustName, CompanyName);
			}
			if (StringUtils.isNotBlank(kobNo)) {
				conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
				conditionDC.set(ICustomerValue.S_CustCertCode, kobNo);
			}
			if (StringUtils.isNotBlank(cvrNo)) {
				conditionDC.set(ICustomerValue.S_TaxId, cvrNo);
			}
			if (StringUtils.isNotBlank(registrationNo)) {
				conditionDC.set(ICustomerValue.S_RegistrationNumber, Long.parseLong(registrationNo));
			}
			ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
			if (addressId > 0) {
				// 将查询的客户与地址比较，取相同的数据
				if (customerValues != null && customerValues.length > 0) {
					List custList = new ArrayList();
					long custId = 0;
					for (int i = 0; i < customerValues.length; i++) {
						custId = customerValues[i].getCustId();
						IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(custId, CmDkConstants.CustContMedium.LEGAL_ADDRESS,
								CmDkConstants.CustContMedium.ADDRESS, -1, -1);
						if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
							if (mediumAndTypeValues[0].getAddressId() == addressId) {
								customerValues[i].setCustAddress(mediumAndTypeValues[0].getAddressDetail());
								custList.add(customerValues[i]);
							}
						}
					}
					if (!custList.isEmpty()) {
						customerValues = (ICustomerValue[]) custList.toArray(new ICustomerValue[0]);
					}
				} else {
					// 没有查询到客户，则根据地址查询客户
					IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ADDRESS,
							CmDkConstants.CustContMedium.LEGAL_ADDRESS, String.valueOf(addressId));
					if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
						List ids = new ArrayList();
						Map temp = new HashMap();
						for (int i = 0; i < mediumAndTypeValues.length; i++) {
							temp.put(mediumAndTypeValues[i].getCustId(), mediumAndTypeValues[i].getAddressDetail());
							ids.add(mediumAndTypeValues[i].getCustId());
						}
						Long[] tempIds = (Long[]) ids.toArray(new Long[0]);
						long[] longIds = ArrayUtils.toPrimitive(tempIds);
						customerValues = customerSV.queryCustomersByCustIds(longIds, CmConstants.CustomerType.GROUP, -1, -1);
						for (int i = 0; i < customerValues.length; i++) {
							customerValues[i].setCustAddress((String) temp.get(customerValues[i].getCustId()));
						}
					}
				}
			} else {
				// 查询客户的法律地址
				if (CmCommonUtil.isNotEmptyObject(customerValues)) {
					for (int i = 0; i < customerValues.length; i++) {
						IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustContactMediums(customerValues[i].getCustId(),
								CmDkConstants.CustContMedium.LEGAL_ADDRESS, CmDkConstants.CustContMedium.ADDRESS, -1, -1);
						if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
							customerValues[i].setCustAddress(mediumAndTypeValues[0].getAddressDetail());
						}
					}
				}
			}
			return customerValues;

		}
		if (addressId > 0 && StringUtils.isBlank(CompanyName) && StringUtils.isBlank(cvrNo) && StringUtils.isBlank(kobNo) && StringUtils.isBlank(registrationNo)) {
			// 根据地址查询客户
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ADDRESS,
					CmDkConstants.CustContMedium.LEGAL_ADDRESS, String.valueOf(addressId));
			if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
				List ids = new ArrayList();
				Map temp = new HashMap();
				for (int i = 0; i < mediumAndTypeValues.length; i++) {
					temp.put(mediumAndTypeValues[i].getCustId(), mediumAndTypeValues[i].getAddressDetail());
					ids.add(mediumAndTypeValues[i].getCustId());
				}
				Long[] tempIds = (Long[]) ids.toArray(new Long[0]);
				long[] longIds = ArrayUtils.toPrimitive(tempIds);
				ICustomerValue[] customerValues = customerSV.queryCustomersByCustIds(longIds, CmConstants.CustomerType.GROUP, -1, -1);
				for (int i = 0; i < customerValues.length; i++) {
					customerValues[i].setCustAddress((String) temp.get(customerValues[i].getCustId()));
				}
				return customerValues;
			}
		}

		return null;
	}

	public long dealCustAddress(IVOCustAddressValue voAddressValue) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		IBOCmCustContactMediumValue contactMediumValue = voAddressValue.getContMedium();
		long addressId = addrService.saveAddress(voAddressValue.getAddress());
		if (contactMediumValue.getCustContRelaId() > 0) {
			// 修改
			if (contactMediumValue != null) {
				contactMediumValue.setAddressId(addressId);
			}
		} else {
			contactMediumValue.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
			contactMediumValue.setAddressId(addressId);
			contactMediumValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			contactMediumValue.setState(CmConstants.RecordState.USE);
			// 获取地址详细信息存储到媒介表中
			address realAddress = addrService.getAddress(addressId, CmConstants.Address.DISTRICTID);
			contactMediumValue.setAddressDetail(realAddress.getAddrDesc());
			contactMediumValue.setStsToNew();
		}
		customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contactMediumValue });
		return addressId;
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrelInfo(long custId, long userId, int relaType, int userType) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
			if (userId > 0) {
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
				parameter.put("userId", userId);
			}
			if (relaType > 0) {
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
				parameter.put("relaType", relaType);
			}
			if (userType > 0) {
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" =:userType ");
				parameter.put("userType", userType);

			}
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
			parameter.put("state", 1);
			return (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1, -1);
		} else {
			ExceptionUtil.throwBusinessException("CMS0022004");
		}
		return new IBOCmInsCmrelValue[0];
	}

	public ICustomerValue queryCmCustomerInfo(long custId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		if (custId > 0) {
			ICustomerValue value = service.queryCustomerByCustId(custId);
			return value;
		}
		return null;
	}

	public IBOCmCustContactMediumValue[] queryCmCustContactMediumInfo(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" ORDER BY ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" , ").append(IBOCmCustContactMediumValue.S_Priority);
		return (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmxIndivCustomerValue queryCmxIndivCustomer(long custId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmxIndivCustomerValue value = service.queryCmxIndivCustomerValue(custId);
		if (CmCommonUtil.isNotEmptyObject(value)) {
			return value;
		}
		return null;
	}

	public ICustomerValue[] queryTerminateCustomerInfo(int custType, long custId, String custName, int certType, String certCode) throws Exception {
		if (custType > 0) {
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			DataContainer dc = new DataContainer();
			dc.set("CUST_TYPE", custType);
			if (custId > 0) {
				dc.set("CUST_ID", custId);
			}
			if (StringUtils.isNotBlank(custName)) {
				dc.set("CUST_NAME", custName);
			}
			if (certType > 0) {
				dc.set("CUST_CERT_TYPE", certType);
			}
			if (StringUtils.isNotBlank(certCode)) {
				dc.set("CUST_CERT_CODE", certCode);
			}
			// 查询注销的客户
			dc.set("CUST_STATUS", CmConstants.CustomerStatus.GROUP_TERMINATED);
			dc.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.BOTH_MATCH);
			return service.queryCustomers(dc, -1, -1);
		} else {
			ExceptionUtil.throwBusinessException("CMS9988867");
		}
		return null;
	}

	public IVOCustAddressValue[] queryCustAddress(long custId, long addressType) throws Exception {
		List custAddrList = new ArrayList();
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		IQBOCmCustContMediumAndTypeValue[] custAddress = customerSV.queryCustContactMediums(custId, addressType, CmConstants.ContMedium.ENTITY_ADDR, -1, -1);
		if (custAddress != null) {
			IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			IVOCustAddressValue vocustAddressValue = null;
			IBOCmCustContactMediumValue contMedium = null;
			long addrId = 0;
			address addr = null;
			for (IQBOCmCustContMediumAndTypeValue temp : custAddress) {
				vocustAddressValue = new VOCustAddressBean();
				addrId = temp.getAddressId();
				addr = addrService.getAddress(addrId, CmConstants.AddressDistrictId.DISTRICT_ID);
				vocustAddressValue.addAddress(addr);
				contMedium = new BOCmCustContactMediumBean();
				contMedium.copy(temp);
				vocustAddressValue.addContMedium(contMedium);
				custAddrList.add(vocustAddressValue);
			}
			if (!custAddrList.isEmpty()) {
				return (IVOCustAddressValue[]) custAddrList.toArray(new IVOCustAddressValue[0]);
			}
		}
		return null;
	}

	public long saveGroupMember(IBOCmGroupMemberValue grpMemberVal) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(grpMemberVal) || !(grpMemberVal.getMemberCustId() > 0) || !(grpMemberVal.getCustId() > 0)) {
			throw new Exception("Input parameters are not legitimate");
		}
		// 根据memberCustId查询客户信息，查不到抛出异常
		ICmCustomerSV CustSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmIndivCustomerValue indivCustVal = CustSV.queryIndivCustomerInfo(grpMemberVal.getMemberCustId());
		if (indivCustVal == null) {
			throw new Exception("Can Not Find Customer By MemberCustId");
		}
		if (grpMemberVal.getRegionId() == null) {
			grpMemberVal.setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		if (grpMemberVal.isDeleted()) {
			// 执行删除操作
			CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmGroupMemberBean) grpMemberVal);
		} else if (grpMemberVal.getCustRelId() > 0) {
			CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmGroupMemberBean) grpMemberVal);
		} else {
			// 执行新增操作,潜在客户添加网外成员，否则添加网内
			// 查询是否已经是成员，是直接返回custId
			IBOCmGroupMemberValue temp = getGroupMember(grpMemberVal.getMemberCustId(), grpMemberVal.getCustId());
			if (temp != null) {
				return temp.getCustRelId();
			}
			BOCmGroupMemberBean bean = new BOCmGroupMemberBean();
			bean.copy(grpMemberVal);
			bean.setCustRelId(CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class));
			bean.setMemberType(1);
			bean.setState(CmConstants.RecordState.USE);
			StringBuilder condition = new StringBuilder();
			condition.append("1=1").append(" and ").append(BOCmGroupOrgStructBean.S_RelCustId).append("=:relCustId");
			Map parameter = new HashMap();
			parameter.put("relCustId", grpMemberVal.getCustId());
			BOCmGroupOrgStructBean grpOrgBean[] = (BOCmGroupOrgStructBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupOrgStructBean.class, condition.toString(),
					parameter, -1, -1);
			// 设置DeptId不存在报异常
			if (grpOrgBean != null && grpOrgBean.length > 0) {
				bean.setDeptId(grpOrgBean[0].getDeptId());
			} else {
				throw new Exception("Can Not Find GROUP Orgnization Information By CustId," + "Please Make Sure That The CustId Belongs To An Exsist Group Customer");
			}
			// 潜在客户添加网外成员
			if (indivCustVal.getCustStatus() == CmConstants.CustomerStatus.INDIV_POTENTIAL) {
				bean.setMemberType(2);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
			// 插partyRole创建角色
			ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue customerValue = sv.queryCustomerByCustId(grpMemberVal.getMemberCustId());
			if (customerValue == null) {
				throw new Exception();
			}
			ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean partyRoleBean = new com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean();
			partyRoleBean.setRoleType(CmConstants.PartyRoleType.EMPLOYEE);
			partyRoleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			partyRoleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
			partyRoleBean.setEntityId(grpMemberVal.getMemberCustId());
			partyRoleBean.setState(CmConstants.RecordState.USE);
			partyRoleBean.setPartyId(customerValue.getPartyId());
			partyRoleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
			partyRoleBean.setCreateOpId(ServiceManager.getUser().getID());
			partyRoleBean.setCreateOrgId(ServiceManager.getUser().getOrgId());
			partyRoleSV.savePartyRole(partyRoleBean);
			// 返回主键
			return bean.getCustRelId();
		}
		return grpMemberVal.getCustRelId();

	}

	public IBOCmGroupMemberValue getGroupMember(long memberCustId, long custId) throws Exception {
		if (memberCustId > 0 && custId > 0) {
			StringBuilder condition = new StringBuilder();
			condition.append("1=1").append(" and ").append(IBOCmGroupMemberValue.S_MemberCustId).append("=:memberCustId").append(" and ").append(IBOCmGroupMemberValue.S_CustId)
					.append("=:custId").append(" and ").append(IBOCmGroupMemberValue.S_State).append("='U'");
			Map parameter = new HashMap();
			parameter.put("memberCustId", memberCustId);
			parameter.put("custId", custId);
			IBOCmGroupMemberValue value[] = (IBOCmGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupMemberBean.class, condition.toString(), parameter,
					-1, -1);
			if (value != null && value.length > 0) {
				return value[0];
			} else {
				return null;
			}

		} else {
			throw new Exception("Input parameters are not legitimate");
		}

	}

	public DataContainerInterface[] queryIndivCustomers(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName,
			String contactPhoneNumber, long segment, long categroy, String custServiceId, int start, int end) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryIndivCustomers(custIds, state, custStatus, legalAddressId, firstName, laseName, contactPhoneNumber, segment, categroy, custServiceId, start, end);
	}

	public int queryIndivCustomersCount(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName, String contactPhoneNumber,
			long segment, long categroy, String custServiceId) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryIndivCustomersCount(custIds, state, custStatus, legalAddressId, firstName, laseName, contactPhoneNumber, segment, categroy, custServiceId);
	}

	public DataContainerInterface[] queryGroupCustomers(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId,
			String contPhone, long managerId, long managerGroupId, long segment, long category, String custServiceId, int start, int end) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryGroupCustomers(custIds, state, custStatus, cvrNo, shortName, companyName, legalAddressId, contPhone, managerId, managerGroupId, segment, category,
				custServiceId, start, end);
	}
	
	/**
	 * 新增接口 获取ext15有值的former集团客户
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryHasExt15FormerGroupCustomers(int start, int end) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryHasExt15FormerGroupCustomers(start, end);
	}

	public int queryGroupCustomersCount(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId, String contPhone,
			long managerId, long managerGroupId, long segment, long category, String custServiceId) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryGroupCustomersCount(custIds, state, custStatus, cvrNo, shortName, companyName, legalAddressId, contPhone, managerId, managerGroupId, segment,
				category, custServiceId);
	}

	public IBOCMPartyAcctRelValue[] queryPayerAccts(long custId) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if (customerValue != null) {
			long partyId = customerValue.getPartyId();
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IBOCMPartyAcctRelValue[] acctRelValues = partySV.queryPartyAcctRel(partyId);
			if (acctRelValues != null && acctRelValues.length > 0) {
				return acctRelValues;
			}
		}
		return new IBOCMPartyAcctRelValue[0];
	}

	public IGroupMemberValue[] queryGroupMembers(long memberCustId, long relaId, int qryType, String qryValue, String billId, String firstName, String lastName, String memberDesc,
			int start, int end) throws Exception {
		long custId = -1;
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		// 0:custId,1:KOB
		if (qryType == 1 && StringUtils.isNotBlank(qryValue)) {
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
			conditionDC.set(ICustomerValue.S_CustCertCode, qryValue);
			ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
			if (customerValues != null && customerValues.length > 0) {
				custId = customerValues[0].getCustId();
			}
		} else {
			custId = Long.parseLong(qryValue);
		}
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_CustId, custId);
		if (StringUtils.isNotBlank(billId)) {
			condition.set(IGroupMemberValue.S_BillId, billId);
		}
		if (StringUtils.isNotBlank(firstName)) {
			condition.set(IGroupMemberValue.S_FirstNameQry, firstName.toUpperCase());
		}
		if (StringUtils.isNotBlank(lastName)) {
			condition.set(IGroupMemberValue.S_LastNameQry, lastName.toUpperCase());
		}
		if (StringUtils.isNotBlank(memberDesc)) {
			condition.set(IGroupMemberValue.S_MemberDesc, memberDesc);
		}
		if (memberCustId > 0) {
			condition.set(IGroupMemberValue.S_MemberCustId, memberCustId);
		}
		if (relaId > 0) {
			condition.set(IGroupMemberValue.S_CustRelId, relaId);
		}
		IGroupMemberValue[] groupMemberValues = customerSV.queryGroupMembers(condition, start, end);
		if (groupMemberValues != null && groupMemberValues.length > 0) {
			return groupMemberValues;
		}
		return new IGroupMemberValue[0];
	}

	public int queryGroupMembersCount(long memberCustId, long relaId, int qryType, String qryValue, String billId, String firstName, String lastName, String memberDesc)
			throws Exception {
		long custId = -1;
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		// 0:custId,1:KOB
		if (qryType == 1 && StringUtils.isNotBlank(qryValue)) {
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
			conditionDC.set(ICustomerValue.S_CustCertCode, qryValue);
			ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
			if (customerValues != null && customerValues.length > 0) {
				custId = customerValues[0].getCustId();
			}
		} else {
			custId = Long.parseLong(qryValue);
		}
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_CustId, custId);
		if (StringUtils.isNotBlank(billId)) {
			condition.set(IGroupMemberValue.S_BillId, billId);
		}
		if (StringUtils.isNotBlank(firstName)) {
			condition.set(IGroupMemberValue.S_FirstNameQry, firstName.toUpperCase());
		}
		if (StringUtils.isNotBlank(lastName)) {
			condition.set(IGroupMemberValue.S_LastNameQry, lastName.toUpperCase());
		}
		if (StringUtils.isNotBlank(memberDesc)) {
			condition.set(IGroupMemberValue.S_MemberDesc, memberDesc);
		}

		if (memberCustId > 0) {
			condition.set(IGroupMemberValue.S_MemberCustId, memberCustId);
		}
		if (relaId > 0) {
			condition.set(IGroupMemberValue.S_CustRelId, relaId);
		}

		return customerSV.queryGroupMembersCount(condition);
	}

	public IVOCustContactValue[] queryGroupContacts(long custId, int contType, String partyName, long custContId) throws Exception {
		ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		if (custId > 0) {
			conditionDC.set(IContactValue.S_CustId, custId);
		}
		if (contType > 0) {
			conditionDC.set(IContactValue.S_ContType, contType);
		}
		if (StringUtils.isNotBlank(partyName)) {
			conditionDC.set(IContactValue.S_PartyNameQry, partyName.toUpperCase());
		}
		if (custContId > 0) {
			conditionDC.set(IContactValue.S_CustContId, custContId);
		}
		IContactValue[] contactValues = contactSV.queryCustContacts(conditionDC, -1, -1);
		if (contactValues != null && contactValues.length > 0) {
			List result = new ArrayList();
			IVOCustContactValue voContactValue = null;
			for (int i = 0; i < contactValues.length; i++) {
				voContactValue = new VOCustContactBean();
				voContactValue.setContactValue(contactValues[i]);
				IBOCmContactContMediumValue[] contMediums = customerSV.queryContactContMedium(contactValues[i].getCustContId(), -1, -1);
				voContactValue.setCustContMediums(contMediums);
				result.add(voContactValue);
			}
			if (!result.isEmpty()) {
				return (IVOCustContactValue[]) result.toArray(new IVOCustContactValue[0]);
			}
		}
		return null;
	}

	public void dealGroupContact(IVOCustContactValue voContactValue) throws Exception {
		IContactValue contactValue = voContactValue.getContactValue();
		IBOCmContactContMediumValue[] custContMediums = voContactValue.getCustContMediums();
		// 保存联系人信息
		if (contactValue != null) {
			ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			contactSV.saveCustContact(contactValue);
		}
		// 保存媒介
		if (custContMediums != null && custContMediums.length > 0) {
			List contMediums = new ArrayList();
			List custContMediumRel = new ArrayList();

			BOCmContactContMediumPojoBean contactContMedium = null;
			BOCmContactMediumRelBean contactMediumRelValue = null;
			for (int i = 0; i < custContMediums.length; i++) {
				// 联系人媒介信息
				contactContMedium = new BOCmContactContMediumPojoBean();
				// 联系人与客户关联的媒介信息
				contactMediumRelValue = new BOCmContactMediumRelBean();

				contactContMedium.copy(custContMediums[i]);
				contactMediumRelValue.copy(custContMediums[i]);
				if (custContMediums[i].isNew()) {
					// 封装联系人媒介
					contactContMedium.setContId(contactValue.getContId());
					long contRelId = CmCommonUtil.getNewSequence(BOCmContactContMediumPojoBean.class);
					contactContMedium.setContRelaId(contRelId);
					contactContMedium.setState(CmConstants.RecordState.USE);
					contactContMedium.setRegionId(CmCommonUtil.getDefaultRegionId());
					contMediums.add(contactContMedium);

					// 封装客户联系人媒介关系
					contactMediumRelValue.setContRelaId(contRelId);
					contactMediumRelValue.setCustContId(contactValue.getCustContId());
					contactMediumRelValue.setRelaId(CmCommonUtil.getNewSequence(BOCmContactMediumRelBean.class));
					contactMediumRelValue.setState(CmConstants.RecordState.USE);
					custContMediumRel.add(contactMediumRelValue);
				} else if (custContMediums[i].isModified()) {
					contMediums.add(contactContMedium);
					custContMediumRel.add(contactMediumRelValue);
				} else if (custContMediums[i].isDeleted()) {
					contMediums.add(contactContMedium);
					custContMediumRel.add(contactMediumRelValue);
				}
			}
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			// 保存联系人媒介
			customerSV.saveContactContMedium((BOCmContactContMediumPojoBean[]) contMediums.toArray(new BOCmContactContMediumPojoBean[0]));
			// 保存客户联系人媒介
			customerSV.saveContactMediumRel((BOCmContactMediumRelBean[]) custContMediumRel.toArray(new BOCmContactMediumRelBean[0]));
		}

	}

	public List<Map<Object, Object>> queryGroupAcctInfo(long companyCustId, int status, String acctPayer, String acctOwner, String acctName, long accountId, int startIndex,
			int pageSize) throws Exception {
		List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
		// 根据custId查询custName
		ICmGroupCustomerSV groupSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupCustomerValue value = groupSV.queryGroupCustInfoByCustId(companyCustId);
		if (value == null) {
			return null;
		}
		String AccountOwner = value.getCustName();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM (")
				.append("SELECT m.rel_cust_id,m.`pay_method`,n.cust_name AS payer,m.ext1 AS acct_statue,m.installment_flag,m.acct_id,m.acct_name FROM {CM_CUST_ACCT_REL} m,{CM_GROUP_CUSTOMER} n WHERE m.`REL_CUST_ID` = n.`CUST_ID`  AND m.pay_method = 1 AND m.REL_CUST_ID =:companyCustId")
				.append(" UNION ALL ")
				.append("SELECT m.rel_cust_id,m.`pay_method`,x.party_name AS payer,m.ext1 AS acct_statue,m.installment_flag,m.acct_id,m.acct_name  FROM {CM_CUST_ACCT_REL} m,{CM_PARTY_ACCT_REL} n, {CM_PARTY} X WHERE m.`pay_method` = 2 AND m.`ACCT_ID` = n.acct_id AND n.`PARTY_ID` = x.party_id AND m.`REL_CUST_ID`=")
				.append(" :companyCustId ").append(")W").append(" where 1=1");
		HashMap parameter = new HashMap();
		parameter.put("companyCustId", companyCustId);

		if (StringUtils.isNotBlank(acctPayer)) {
			sql.append(" and ").append("W.payer = :acctPayer").append(" and ").append("W.pay_method=2 ");
			parameter.put("acctPayer", acctPayer);
		}
		if (status >= 0) {
			sql.append(" and ").append("W.acct_statue = :status");
			parameter.put("status", status);
		}
		if (StringUtils.isNotBlank(acctName)) {
			sql.append(" and ").append("W.acct_name = :acctName");
			parameter.put("acctName", acctName);
		}
		if (accountId >= 0) {
			sql.append(" and ").append("W.acct_id = :accountId");
			parameter.put("accountId", accountId);
		}
		if (startIndex > 0 && pageSize > 0) {
			sql.append(" limit ").append(startIndex - 1).append(",").append(pageSize);
		}
		String condition = SplitTableFactory.createQuerySQL(sql.toString(), parameter);
		DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
		if (dc != null && dc.length > 0) {
			for (int i = 0; i < dc.length; i++) {
				Map<Object, Object> map = new HashMap<Object, Object>();
				map.put("ACCT_NAME", dc[i].getAsString("ACCT_NAME"));
				map.put("ACCT_STATUE", dc[i].getAsInt("ACCT_STATUE"));
				map.put("ACCT_OWNER", AccountOwner);
				long acctId = dc[i].getAsLong("ACCT_ID");
				map.put("ACCT_ID", acctId);
				map.put("CompanyCustId", companyCustId);
				map.put("INSTALLMENAT_FLAG", dc[i].getAsInt("INSTALLMENAT_FLAG"));
				if (dc[i].getAsInt("PAY_METHOD") == 2) {
					map.put("PAYER", dc[i].getAsString("PAYER"));
				} else {
					map.put("PAYER", null);
				}
				map.put("AccountSize", null);
				if (dc[i].getAsInt("INSTALLMENAT_FLAG") != 1) {
					StringBuilder str = new StringBuilder();
					str.append("SELECT COUNT(1) count FROM {CM_INS_ACCREL} t WHERE t.`ACCT_ID`=:ACCT_ID");
					Map para = new HashMap();
					para.put("ACCT_ID", acctId);

					DataContainer dc2[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, str.toString(), para);
					if (dc2 != null) {
						map.put("AccountSize", dc2[0].getAsString("COUNT"));
					}
				}
				list.add(map);
			}
		}
		return list;
	}

	public int queryGroupAcctInfoCount(long companyCustId, int status, String acctPayer, String acctOwner, String acctName, long accountId) throws Exception {
		List list = queryGroupAcctInfo(companyCustId, status, acctPayer, acctOwner, acctName, accountId, -1, -1);
		if (list != null) {
			return list.size();
		}
		return 0;
	}

	public IQBOCmPartyValue querPayerByAcctId(long acctId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return accountSV.querPayerByAcctId(acctId);
	}

	public DataContainerInterface[] queryCustomerByAddress(long[] addressIds, int addressType) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryCustomerByAddress(addressIds, addressType);
	}

	public IBOCmIndivCustomerValue[] queryCustomerByCPR(String cpr) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return custSV.queryCustomerByCPR(cpr);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV#queryManagerIdsByCustId(int,
	 * java.lang.String)
	 */
	@Override
	public long[] queryManagerIdsByCustId(int queryType, String queryValue) throws Exception {
		long custId = -1;
		if (queryType == 1) {
			custId = Long.parseLong(queryValue);
		}
		// 将cvrnumber转换为custId
		if (queryType == 2) {
			ICmGroupCustomerSV grpCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			IVOCustValue val = grpCustomerSV.queryCustValueByCVR(queryValue);
			if (val == null) {
				return null;
			} else {
				custId = val.getCustId();
			}

		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer[] dc = customerSV.getCustManagerDataInfo(custId, CmConstants.CustomerType.GROUP, -1, -1);
		if (dc != null) {
			long managerid[] = new long[dc.length];
			for (int i = 0; i < dc.length; i++) {
				managerid[i] = dc[i].getAsLong("MANAGERID");
			}
			return managerid;
		}
		return null;
	}

	public ICustomerValue queryGroupCustomerByCVR(String cvr) throws Exception {
		if (StringUtils.isNotBlank(cvr)) {
			ICmGroupCustomerSV groupSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			return groupSV.queryGroupCustomerByCVR(cvr);
		}
		return null;
	}

	public ICustomerValue queryCustomerByDeptId(long deptId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICustOrganizeValue organizeValue = customerSV.queryCustOrganizeById(deptId);
		if (organizeValue != null) {
			long custId = organizeValue.getRelCustId();
			return customerSV.queryCustomerByCustId(custId);
		}
		return null;
	}

	public ICustOrganizeValue[] queryGroupOrganizesById(long groupCustId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, groupCustId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		return values;
	}

	public void deleteAccount(long acctId) throws Exception {
		// 看该账户下是否有联系人，如果有联系人则置为'E'
		ICmContactSV service = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		IContactValue[] contactValues = service.queryAcctContactsByAcctId(acctId, -1, -1);
		for (int i = 0; i < contactValues.length; i++) {
			contactValues[i].setState(CmConstants.RecordState.ERASE);
			service.saveAcctContact(contactValues[i]);

		}
		ICmAccountSV accountSv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue value = accountSv.queryAccountById(acctId);
		if (!CmConstants.RecordState.ERASE.equals(value.getState())) {
			IVOAccountValue acctValue = new VOAccountBean();
			value.setState(CmConstants.RecordState.ERASE);
			value.setExpireDate(new Timestamp(new Date().getTime()));
			acctValue.setAccount(value);

			IAcctBillCycleValue billCycleValue = accountSv.queryCurrAcctBillCyclesByAcctId(acctId);
			billCycleValue.setState(CmConstants.RecordState.ERASE);
			billCycleValue.setExpireDate(new Timestamp(System.currentTimeMillis()));
			acctValue.setBillCycle(billCycleValue);

			IAcctPaymentValue payMentValue = accountSv.queryCurrAcctPaymentsByAcctId(acctId);
			payMentValue.setState(CmConstants.RecordState.ERASE);
			payMentValue.setExpireDate(new Timestamp(System.currentTimeMillis()));
			acctValue.addPayment(payMentValue);
			accountSv.saveAccount(acctValue);
		}
	}

	public void modifyAcctActive(long acctId) throws Exception {
		ICmAccountSV accountSv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue value = accountSv.queryAccountById(acctId);
		if (value != null && (!CmConstants.RecordState.USE.equals(value.getState()))) {
			IAcctPaymentValue[] acctPaymentValues = accountSv.queryAcctPaymentByCondition(acctId, -1, -1);
			IVOAccountValue acctValue = new VOAccountBean();
			value.setState(CmConstants.RecordState.USE);
			acctValue.setAccount(value);
			if (acctPaymentValues != null && acctPaymentValues.length > 0) {
				acctValue.addPayments(acctPaymentValues);
			}
			accountSv.saveAccount(acctValue);
		}
	}

	public ICustomerValue[] queryCustomersByCols(String[] colValues, String colName) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue[] result = customerSV.queryCustomersByCols(colValues, colName, CmConstants.CustomerType.GROUP, -1, -1);
		return result;
	}

	public ICustomerValue queryCustomersByMemberCustId(long memCustId) throws Exception {
		if (memCustId > 0) {
			ICmGroupCustomerSV groupSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			IBOCmGroupMemberValue[] groupMenberValue = groupSV.queryGroupMemberByCustId(-1, memCustId, null, -1, -1);
			if (groupMenberValue != null && groupMenberValue.length > 0) {
				long custId = groupMenberValue[0].getCustId();
				ICmCustomerSV CustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				return CustomerSV.queryCustomerByCustId(custId);
			} else {
				return new CustomerBean();
			}
		}
		return new CustomerBean();
	}

	public void saveCustomer(ICustomerValue value) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(value)) {
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			custSV.saveCustomer(value);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV#
	 * mergeCustomerData(long, long)
	 */
	public long mergeCustomerData(long newCustId, long oldCustId) throws Exception {
		// 删除新客户，同时将新客户的认证信息 identifyType=4的数据同步给老客户。
		ICmDkCustomerSV dkSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmIndivCustomerValue oldcustomerValue = custSV.queryIndivCustomerInfo(oldCustId);
		IBOCmIndivCustomerValue newcustomerValue = custSV.queryIndivCustomerInfo(newCustId);
		if (oldcustomerValue == null) {
			throw new Exception("Customer[" + oldCustId + "] Does Not Exists!");
		} else if (newcustomerValue == null) {
			throw new Exception("Customer[" + newCustId + "] Does Not Exists!");
		} else {
			IBOIdentificationValue[] newvalue = dkSV.queryCustIdentifications(newcustomerValue.getPartyId(), 4, null);
			IBOIdentificationValue[] oldValue = dkSV.queryCustIdentifications(oldcustomerValue.getPartyId(), 4, null);
			if (newvalue != null && newvalue.length > 0) {
				// 将新客户的认证信息同步到老客户上
				if (oldValue.length > 0) {
					for (int i = 0; i < oldValue.length; i++) {
						oldValue[i].setIdenNr(newvalue[0].getIdenNr());
						oldValue[i].initProperty(IBOIdentificationValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
					}
					dkSV.saveCustIdentification(oldValue);
				} else {
					IBOIdentificationValue val = new BOIdentificationBean();
					val.setPartyId(oldcustomerValue.getPartyId());
					val.setIdenType(4);
					val.setIdenNr(newvalue[0].getIdenNr());
					ICmCommonSV cmSv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
					long idenId = cmSv.getNewSequence(BOIdentificationBean.class);
					val.setIdenId(idenId);
					val.setState("U");
					// 设置regionId
					val.setRegionId(CmCommonUtil.getDefaultRegionId());
					dkSV.saveCustIdentification(new IBOIdentificationValue[] { val });
				}

				// 删除新客户的认证信息
				newvalue[0].delete();
				newvalue[0].initProperty(IBOIdentificationValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				dkSV.saveCustIdentification(newvalue);
			}

			// 删除新客户
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			customerSV.deleteIndivCust(newCustId);
		}
		return oldCustId;

	}

	@Override
	public long queryCustIdByAcctServiceId(String acctServiceId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and ").append(BOCmCustAcctRelBean.S_Ext2).append("=:acctServiceId");
		Map parameter = new HashMap();
		parameter.put("acctServiceId", acctServiceId);
		BOCmCustAcctRelBean[] bean = (BOCmCustAcctRelBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter, -1, -1);
		if (bean != null && bean.length > 0) {
			return bean[0].getRelCustId();
		} else {
			return -1;
		}

	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV#
	 * queryPayerByAcctId4Billing(long)
	 */
	public DataContainer queryPayerByAcctId4Billing(long acctId) throws Exception {
		DataContainer dc = new DataContainer();
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAccRelValue = acctSV.queryPartyAccRel(acctId, -1, null);
		if (partyAccRelValue != null && partyAccRelValue.length > 0) {// 代付账户
			long partyId = partyAccRelValue[0].getPartyId();
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyVal = partySV.queryPartyById(partyId);
			if (partyVal != null) {
				long partyType = partyVal.getPartyType();
				if (partyType == 3) {// 代付账户payer为集团时,由于需要查询CVR,所以调用客户查询接口
					IBOCmCustAcctRelValue[] custAcctrelVal = acctSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null);
					if (custAcctrelVal != null && custAcctrelVal.length > 0) {
						long custId = custAcctrelVal[0].getRelCustId();
						ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
						// 查询地址
						IQBOCmCustContMediumAndTypeValue[] mediaValue = cmCustomerSV.queryCustContactMediums(custId, 11, 1, -1, -1);
						if (mediaValue != null && mediaValue.length > 0) {
							dc.set("CONT_ADDRESS", mediaValue[0].getAddressId());
							dc.set("REMARKS", mediaValue[0].getAddressDetail());

						}
						ICustomerValue customerVal = cmCustomerSV.queryDKCustomer(custId);
						if (customerVal != null) {
							dc = new DataContainer();
							dc.set("CERT_TYPE", customerVal.getCustCertType());
							dc.set("CERT_CODE", customerVal.getCustCertCode());
							dc.set("PAYER_NAME", customerVal.getCustName());
							dc.set("ACCT_TYPE", CmConstants.AccountConstants.REAL_ACCT);
							dc.set("ACCT_ID", acctId);
							ICmLnGroupSV cmLnGroupSV = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
							IBOLnCmxGroupCustValue LnCmxGroupCustVal = cmLnGroupSV.queryGroupCustExtById(custId);
							if (LnCmxGroupCustVal != null) {
								dc.set("CVR_NO", LnCmxGroupCustVal.getTaxId());
							} else {
								dc.set("CVR_NO", "");
							}
						}
					}
				} else {// 查询payer信息
					IQBOCmPartyValue result = partySV.queryPayerByPartyId(partyId);
					if (CmCommonUtil.isNotEmptyObject(result)) {
						dc = new DataContainer();
						dc.set("PAYER_NAME", result.getPartyName());
						dc.set("CERT_TYPE", result.getCertType());
						dc.set("CERT_CODE", result.getCertCode());
						dc.set("ACCT_TYPE", CmConstants.AccountConstants.REAL_ACCT);
						dc.set("ACCT_ID", acctId);
						dc.set("CVR_NO", "");
						// 生日
						dc.set("BIRTHDAY", result.getBirthday());
						// firstName
						dc.set("FIRST_NAME", result.getFirstName());
						// lastName
						dc.set("LAST_NAME", result.getLastName());
						// 地址
						dc.set("CONT_ADDRESS", result.getContAddress());
						dc.set("REMARKS", result.getRemarks());
					}

				}
			}
		} else {// 自有账户
			IBOCmCustAcctRelValue[] custAcctrelVal = acctSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null);
			if (custAcctrelVal != null && custAcctrelVal.length > 0) {
				long custId = custAcctrelVal[0].getRelCustId();
				ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICmCommonSV commonSv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				int custType = commonSv.getCustType(custId);
				ICustomerValue customerVal = cmCustomerSV.queryDKCustomer(custId);
				if (customerVal != null) {
					dc = new DataContainer();
					dc.set("CERT_TYPE", customerVal.getCustCertType());
					dc.set("CERT_CODE", customerVal.getCustCertCode());
					dc.set("PAYER_NAME", customerVal.getCustName());
					dc.set("ACCT_TYPE", CmConstants.AccountConstants.SELF_ACCT);
					dc.set("ACCT_ID", acctId);

					// 查询地址
					IQBOCmCustContMediumAndTypeValue[] mediaValue = cmCustomerSV.queryCustContactMediums(custId, 11, 1, -1, -1);
					if (mediaValue != null && mediaValue.length > 0) {
						dc.set("CONT_ADDRESS", mediaValue[0].getAddressId());
						dc.set("REMARKS", mediaValue[0].getAddressDetail());

					}
					if (custType == CmConstants.CustomerType.GROUP) {
						ICmLnGroupSV cmLnGroupSV = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
						IBOLnCmxGroupCustValue LnCmxGroupCustVal = cmLnGroupSV.queryGroupCustExtById(custId);
						if (LnCmxGroupCustVal != null) {
							dc.set("CVR_NO", LnCmxGroupCustVal.getTaxId());
						} else {
							dc.set("CVR_NO", "");
						}
					} else {
						dc.set("CVR_NO", "");
						// 生日
						dc.set("BIRTHDAY", customerVal.getBirthday());
						// firstName
						dc.set("FIRST_NAME", customerVal.getFirstName());
						// lastName
						dc.set("LAST_NAME", customerVal.getLastName());

					}
				}
			}
		}
		return dc;
	}

	public boolean queryCustIfDunning(long custId) throws Exception {
		if (custId > 0) {
			StringBuilder condition = new StringBuilder(" 1=1 ");
			Map parameter = new HashMap();
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_RelCustId).append(" =:custId ");
			parameter.put("custId", custId);
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_Ext1).append(" =:status ");
			// 查询dunning的
			parameter.put("status", "2");
			int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
			if (count > 0) {
				return true;
			}
		} else {
			ExceptionUtil.throwBusinessException("the custId can not be empty");
		}
		return false;
	}

	public DataContainer[] queryGroupContact(long custId) throws Exception {
		if (custId > 0) {
			StringBuilder condition = new StringBuilder();
			Map parameter = new HashMap();
			condition.append("	SELECT A.PARTY_ID,B.* FROM {CM_GROUP_CONTACT} A,{CM_CONTACT_CONT_MEDIUM} B,{CM_CONTACT_MEDIUM_REL} C ");
			condition.append("  WHERE A.`CUST_CONT_ID`=C.`CUST_CONT_ID` AND B.`CONT_RELA_ID`=C.`CONT_RELA_ID` AND A.`CUST_ID`=:custId AND A.CONT_TYPE=20 AND A.PRIORY_LEVEL=1 ");
			parameter.put("custId", custId);
			DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
			if (CmCommonUtil.isNotEmptyObject(dcs)) {
				return dcs;
			} else {
				DataContainer[] datas = queryCmGroupContact(custId, 20);
				if (CmCommonUtil.isNotEmptyObject(datas)) {
					long partyId = datas[0].getAsLong("PARTY_ID");
					ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
					IQBOCmPartyValue partyValue = partySV.queryPartyInfo(partyId);
					if (CmCommonUtil.isNotEmptyObject(partyValue)) {
						DataContainer dc = new DataContainer();
						dc.set("CUST_NAME", partyValue.getPartyName());
						return new DataContainer[] { dc };
					}
				}
			}
		} else {
			ExceptionUtil.throwBusinessException("The custId can not be empty");
		}
		return new DataContainer[0];
	}

	public void modifyGroupContact(long custId, IBOCmContactContMediumValue[] values) throws Exception {
		if (custId > 0 && CmCommonUtil.isNotEmptyObject(values)) {
			StringBuilder condition = new StringBuilder();
			Map parameter = new HashMap();
			condition.append("	SELECT B.* FROM {CM_GROUP_CONTACT} A,{CM_CONTACT_CONT_MEDIUM} B,{CM_CONTACT_MEDIUM_REL} C ");
			condition
					.append("  WHERE A.`CUST_CONT_ID`=C.`CUST_CONT_ID` AND B.`CONT_RELA_ID`=C.`CONT_RELA_ID` AND A.`CUST_ID`=:custId AND A.CONT_TYPE=20 AND B.CONT_MED_TYPE_ID IN(201,301) ");
			parameter.put("custId", custId);
			DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
			if (CmCommonUtil.isNotEmptyObject(dcs)) {
				for (DataContainer dc : dcs) {
					if (dc.getAsInt("CONT_MED_TYPE_ID") == 201) {
						// 修改主要联系邮箱
						for (IBOCmContactContMediumValue contValue : values) {
							if (contValue.getContMedTypeId() == 201) {
								BOCmContactContMediumPojoBean bean = new BOCmContactContMediumPojoBean();
								bean.copy(contValue);
								bean.initProperty("CONT_RELA_ID", dc.getAsLong("CONT_RELA_ID"));
								bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
								CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
							}
						}
					} else if (dc.getAsInt("CONT_MED_TYPE_ID") == 301) {
						// 修改主要联系电话
						for (IBOCmContactContMediumValue contValue : values) {
							if (contValue.getContMedTypeId() == 301) {
								BOCmContactContMediumPojoBean bean = new BOCmContactContMediumPojoBean();
								bean.copy(contValue);
								bean.initProperty("CONT_RELA_ID", dc.getAsLong("CONT_RELA_ID"));
								bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
								CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
							}
						}
					}
				}
			}
		} else {
			ExceptionUtil.throwBusinessException("the parameter is not correct");
		}
	}

	public String dealGroupContact(long custId, IBOCmContactContMediumValue[] values) throws Exception {
		if (custId > 0 && CmCommonUtil.isNotEmptyObject(values)) {
			DataContainer[] cons = queryCmGroupContact(custId, 20);
			for (int i = 0; i < values.length; i++) {
				if (values[i].getContMedTypeId() == 201) {
					// 针对主要邮箱
					DataContainer[] dcs = queryCmContactContMedium(custId, 201);
					if (CmCommonUtil.isNotEmptyObject(dcs)) {
						// 修改信息
						BOCmContactContMediumPojoBean bean = new BOCmContactContMediumPojoBean();
						bean.copy(values[i]);
						bean.initProperty("CONT_RELA_ID", dcs[0].getAsLong("CONT_RELA_ID"));
						bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
						CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
					} else {
						// 新增信息
						if (CmCommonUtil.isNotEmptyObject(cons)) {
							// 新增联系信息和关系信息
							saveContactAndRel(values[i], cons[0]);
						} else {
							return "N";
						}
					}
				} else if (values[i].getContMedTypeId() == 301) {
					// 针对主要联系电话
					DataContainer[] dcs = queryCmContactContMedium(custId, 301);
					if (CmCommonUtil.isNotEmptyObject(dcs)) {
						// 修改信息
						BOCmContactContMediumPojoBean bean = new BOCmContactContMediumPojoBean();
						bean.copy(values[i]);
						bean.initProperty("CONT_RELA_ID", dcs[0].getAsLong("CONT_RELA_ID"));
						bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
						CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
					} else {
						// 新增信息
						if (CmCommonUtil.isNotEmptyObject(cons)) {
							// 新增联系信息和关系信息
							saveContactAndRel(values[i], cons[0]);
						} else {
							return "N";
						}
					}
				}
			}

		} else {
			ExceptionUtil.throwBusinessException("the parameter is not correct");
		}
		return "Y";
	}

	private DataContainer[] queryCmContactContMedium(long custId, int contMedTypeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("	SELECT B.* FROM {CM_GROUP_CONTACT} A,{CM_CONTACT_CONT_MEDIUM} B,{CM_CONTACT_MEDIUM_REL} C ");
		condition
				.append("  WHERE A.`CUST_CONT_ID`=C.`CUST_CONT_ID` AND B.`CONT_RELA_ID`=C.`CONT_RELA_ID` AND A.`CUST_ID`=:custId AND A.CONT_TYPE=20 AND A.PRIORY_LEVEL=1 AND B.CONT_MED_TYPE_ID=:contType ");
		parameter.put("custId", custId);
		parameter.put("contType", contMedTypeId);
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
	}

	private DataContainer[] queryCmGroupContact(long custId, int contType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("	SELECT A.* FROM {CM_GROUP_CONTACT} A WHERE A.CUST_ID=:custId AND A.CONT_TYPE=:contType AND A.PRIORY_LEVEL=1 ");
		parameter.put("custId", custId);
		parameter.put("contType", contType);
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
	}

	private void saveContactAndRel(IBOCmContactContMediumValue value, DataContainer dc) throws Exception {
		// 新增联系信息
		BOCmContactContMediumPojoBean bean = new BOCmContactContMediumPojoBean();
		bean.copy(value);
		bean.setContId(dc.getAsLong("CONT_ID"));
		bean.setState(CmConstants.RecordState.USE);
		bean.setRegionId(CmCommonUtil.getDefaultRegionId());
		long contRelaId = CmCommonUtil.getNewSequence(BOCmContactContMediumPojoBean.class);
		bean.setContRelaId(contRelaId);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		// 新增关联信息
		BOCmContactMediumRelBean relBean = new BOCmContactMediumRelBean();
		relBean.setCustContId(dc.getAsLong("CUST_CONT_ID"));
		relBean.setContRelaId(contRelaId);
		relBean.setRelaId(CmCommonUtil.getNewSequence(BOCmContactMediumRelBean.class));
		relBean.setState(CmConstants.RecordState.USE);
		relBean.setRegionId(CmCommonUtil.getDefaultRegionId());
		CmInnerServiceFactory.getCommonInnerSV().saveBean(relBean);
	}

	public long createGroupContactPeople(long custId, int contType, int priority, String firstName, String lastName) throws Exception {
		// 判断如果存在主要的联系人则不创建
		DataContainer[] dcs = queryCmGroupContact(custId, contType);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			ExceptionUtil.throwBusinessException("the contact people has been existed");
		}
		// 创建联系人
		IVOPartyValue voPartyValue = new VOPartyBean();
		// 联系人基本信息
		long partyId = CmCommonUtil.getNewSequence(BOCmPartyBean.class);
		IPartyValue partyValue = new PartyBean();
		partyValue.setPartyId(partyId);
		partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
		partyValue.setFirstName(firstName);
		partyValue.setLastName(lastName);
		partyValue.setPartyName(partyValue.getFirstName() + " " + partyValue.getLastName());
		partyValue.setState(CmConstants.RecordState.USE);
		partyValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		voPartyValue.setParty(partyValue);
		// 联系人联系表
		IPartyContactValue partyContact = new PartyContactBean();
		long contId = CmCommonUtil.getNewSequence(BOCmPartyContactBean.class);
		partyContact.setContId(contId);
		partyContact.setPartyId(partyId);
		partyContact.setContName(partyValue.getPartyName());
		partyContact.setFirstName(firstName);
		partyContact.setLastName(lastName);
		partyContact.setState(CmConstants.RecordState.USE);
		partyContact.setRegionId(CmCommonUtil.getDefaultRegionId());
		voPartyValue.setPartyContact(partyContact);
		CmServiceFactory.getPartySV().saveParty(voPartyValue);
		// 联系人属性
		BOCmGroupContactBean contactBean = new BOCmGroupContactBean();
		contactBean.setCustContId(CmCommonUtil.getNewSequence(BOCmGroupContactBean.class));
		contactBean.setPartyId(partyId);
		contactBean.setContId(contId);
		contactBean.setCustId(custId);
		contactBean.setPrioryLevel(1);
		contactBean.setContType(contType);
		contactBean.setState(CmConstants.RecordState.USE);
		contactBean.setRegionId(CmCommonUtil.getDefaultRegionId());
		CmInnerServiceFactory.getCommonInnerSV().saveBean(contactBean);
		// 5.参与人角色
		ICmPartyRoleSV roleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean roleBean = new com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean();
		roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
		roleBean.setRoleType(CmConstants.PartyRoleType.CONTACT);
		roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
		roleBean.setEntityId(DataType.getAsLong(contId));
		roleBean.setPartyId(partyId);
		roleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
		roleBean.setState(CmConstants.RecordState.USE);
		roleBean.setRoleRegionId(CmCommonUtil.getDefaultRegionId());
		roleService.savePartyRole(roleBean);
		return partyId;
	}

	public IBOCmBillingAcctValue[] queryBillingAcct(long acctId, String pbs, String ean) throws Exception {
		ICmDKAccountSV accountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
		return accountSV.queryBillingAcct(acctId, pbs, ean);
	}

	public int queryCmInsCmrelCount(long custId, int relType, long userId, String ext1) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (StringUtils.isNotEmpty(ext1)) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" =:userState ");
			parameter.put("userState", ext1);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsCmrelBean.class, condition.toString(), parameter);
	}

	public long[] queryCustomerByMedium(String mediumValue, int mediumType) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		IQBOCmCustContMediumAndTypeValue[] custContMediumAndTypeValues = null;
		if (mediumType == CmDkConstants.CustContMedium.EMAIL || mediumType == CmDkConstants.CustContMedium.PREFER_AGENT_EMAIL) {
			custContMediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ELECTRONIC_ADDRESS, mediumType, mediumValue);
		} else if (mediumType == CmDkConstants.CustContMedium.CONTACT_NUMBER) {
			custContMediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.PHONE, mediumType, mediumValue);
		}
		long[] custIds = null;
		if (custContMediumAndTypeValues != null && custContMediumAndTypeValues.length > 0) {
			custIds = new long[custContMediumAndTypeValues.length];
			for (int i = 0; i < custContMediumAndTypeValues.length; i++) {
				custIds[i] = custContMediumAndTypeValues[i].getCustId();
			}
		}
		return custIds;
	}

	public IBOCmBillingAcctValue[] queryBillingAcct(String addressId) throws Exception {
		ICmDKAccountSV accountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
		return accountSV.queryBillingAcct(addressId);
	}

	public IQBOCmPayerInfoValue queryPayerInfo(String cpr) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryPayerInfo(cpr);
	}

	public IQBOCmPayerInfoValue[] queryPayerByAddress(long[] addressIds, String custName) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryPayerByAddress(addressIds, custName);
	}

	public long saveDefaultCustomer(long partyId) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return customerSV.saveDefaultCustomer(partyId, null, null);
	}

	public ICustomerValue[] queryGroupCustomers(long custId, String CompanyName, String cvrNo, String kobNo, int start, int end) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICustomerValue[] customerValues = null;
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		if (custId > 0) {
			conditionDC.set(ICustomerValue.S_CustId, custId);
		}
		if (StringUtils.isNotBlank(CompanyName)) {
			conditionDC.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.RIGHT_MATCH);
			conditionDC.set(ICustomerValue.S_CustName, CompanyName);
		}
		if (StringUtils.isNotBlank(kobNo)) {
			conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
			conditionDC.set(ICustomerValue.S_CustCertCode, kobNo);
		}
		if (StringUtils.isNotBlank(cvrNo)) {
			conditionDC.set(ICustomerValue.S_TaxId, cvrNo);
		}
		customerValues = customerSV.queryCustomers(conditionDC, start, end);
		if (customerValues != null && customerValues.length > 0) {
			return customerValues;
		}
		return customerValues;
	}

	public int queryGroupCustomersCount(long custId, String CompanyName, String cvrNo, String kobNo) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		int result = -1;
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		if (custId > 0) {
			conditionDC.set(ICustomerValue.S_CustId, custId);
		}
		if (StringUtils.isNotBlank(CompanyName)) {
			conditionDC.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.RIGHT_MATCH);
			conditionDC.set(ICustomerValue.S_CustName, CompanyName);
		}
		if (StringUtils.isNotBlank(kobNo)) {
			conditionDC.set(ICustomerValue.S_CustCertType, CmConstants.CertificateType.KOB_NUMBER);
			conditionDC.set(ICustomerValue.S_CustCertCode, kobNo);
		}
		if (StringUtils.isNotBlank(cvrNo)) {
			conditionDC.set(ICustomerValue.S_TaxId, cvrNo);
		}
		result = customerSV.queryCustomerCount(conditionDC);
		return result;
	}

	public void SyncBsOperatorsFromBilling(String plmnId, Map OperatorsInfo) throws Exception {
		IBaseOperatorsSV sv = (IBaseOperatorsSV) ServiceFactory.getService(IBaseOperatorsSV.class);
		sv.SyncBsOperatorsFromBilling(plmnId, OperatorsInfo);

	}

	public void modifyLegalPersonId(long custId, String cprNo) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		Map params = new HashMap();
		params.put("PNR", cprNo);
		// 送CPR进行校验
		Map cprData = indivService.validateCPR(params);
		String FEJLNR = (String) cprData.get("FEJLNR");
		if (!FEJLNR.equals("00")) {
			// CPR在CPR系统中不存在。
			ExceptionUtil.throwBusinessException("CMS9988772");
		}
		Map data1 = (Map) cprData.get("DATA");
		Map data2 = (Map) data1.get("INFO");
		Map currentData = (Map) data2.get("Current_data");
		// 从CPR返回的客户名称
		String firstName = (String) currentData.get("FORNVN");
		String lastName = (String) currentData.get("EFTERNVN");
		// 从CPR返回的生日
		String birthDay = (String) currentData.get("FOEDDTO");
		// 查询法人联系人
		DataContainer dc = new DataContainer();
		dc.set(IContactValue.S_ContType, CmConstants.CmGroupContactType.LEGAL_OWNER);// 联系人类型-法人
		dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);// 集团客户
		dc.set(IContactValue.S_CustId, custId);// 客户ID
		// 直接使用客户综合查询即可！
		ICmContactSV cmGroupInformInfoSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		IContactValue[] values = cmGroupInformInfoSV.queryCustContacts(dc, -1, -1);
		IContactValue iContactValue = null;
		// 判断联系人是否存在
		if (values != null && values.length > 0) {// 存在做更新
			iContactValue = values[0];
		} else {// 不存在-新增
			// 创建类型为法人的联系人
			iContactValue = new ContactBean();
		}
		if (iContactValue != null) {
			iContactValue.setCustId(DataType.getAsLong(custId));
			if (StringUtils.isNotBlank(firstName)) {
				iContactValue.setFirstName(CmCommonUtil.capitalizeFirstLetter(firstName));// 联系人名称
			}
			if (StringUtils.isNotBlank(lastName)) {
				iContactValue.setLastName(CmCommonUtil.capitalizeFirstLetter(lastName));
			}
			iContactValue.setPrioryLevel(1);// 优先级默认设为1
			iContactValue.setContType(CmConstants.CmGroupContactType.LEGAL_OWNER);// 法人
			iContactValue.setCertType(CmConstants.CertificateType.CPR);// 8---cpr number
			iContactValue.setCertCode(cprNo);// cpr number
			iContactValue.setBirthday(TimeUtil.getTimstampByString(birthDay, "yyyyMMdd"));// 生日
			iContactValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			CmCommonUtil.convertName(new IContactValue[] { iContactValue });
			// 处理联系人参与信息
			dealParty(iContactValue);
			// 直接调用客户联系人管理的服务处理
			dealCustContacts(iContactValue);
			// 将CPR存入集团扩展表中
			saveLegalPersonId(custId, cprNo);
		}
	}

	// 处理联系人参与信息
	private void dealParty(IContactValue contactValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(contactValue)) {
			ICmPartySV partySV = CmServiceFactory.getPartySV();
			// 跳过删除的情况
			if (contactValue.isDeleted() || CmConstants.RecordState.ERASE.equalsIgnoreCase(contactValue.getState())) {
				return;
			}
			IVOPartyValue ivoPartyValue = new VOPartyBean();
			IPartyValue partyValue = new PartyBean();
			partyValue.copy(contactValue);
			partyValue.setRemarks("CPR");
			if (contactValue.isNew()) {
				partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
			} else {
				partyValue.initProperty(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
			}
			IPartyContactValue partyContactValue = new PartyContactBean();
			partyContactValue.copy(contactValue);

			ivoPartyValue.setParty(partyValue);
			ivoPartyValue.setPartyContact(partyContactValue);
			// 调用参与人处理model处理参与人信息
			partySV.saveParty(ivoPartyValue);
			contactValue.setPartyId(ivoPartyValue.getParty().getPartyId());
			contactValue.setContId(ivoPartyValue.getPartyContacts()[0].getContId());
		}
	}

	// 直接调用客户联系人管理的服务处理
	private void dealCustContacts(IContactValue contactValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(contactValue)) {
			// cpr效验新增法人标识---给联系人界面使用
			contactValue.setRemarks("CPR");
			IContactValue[] contactValues = new IContactValue[] { contactValue };
			List<BOCmIndivContactBean> indivContactList = new ArrayList<>();
			List<BOCmFamilyContactBean> familyContactList = new ArrayList<>();
			List<BOCmGroupContactBean> groupContactList = new ArrayList<>();
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

	private void saveLegalPersonId(long custId, String cprNo) throws Exception {
		// 保存cprNo到集团客户扩展表
		IBOLnCmxGroupCustValue groupValue = new BOLnCmxGroupCustBean();
		groupValue.initProperty("CUST_ID", custId);
		groupValue.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
		groupValue.setCorporateIdentificationNumbe(cprNo);
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) groupValue);
	}

	public IBOCmPartyPermissionValue[] queryPartyPermissions(long partyId, int roleType) throws Exception {
		ICmPartyHUSV partyHUSV = (ICmPartyHUSV) ServiceFactory.getService(ICmPartyHUSV.class);
		IBOCmPartyPermissionValue[] partyPermissionValues = partyHUSV.queryPartyPermissionByIdAndRole(partyId, roleType, -1, -1);
		if (partyPermissionValues == null || partyPermissionValues.length < 1) {
			return new IBOCmPartyPermissionValue[0];
		}
		return partyPermissionValues;
	}

	public void savePartyPermission(IBOCmPartyPermissionValue[] partyPermissionValues) throws Exception {
		if (partyPermissionValues != null && partyPermissionValues.length > 0) {
			ICmPartyHUSV partyHUSV = (ICmPartyHUSV) ServiceFactory.getService(ICmPartyHUSV.class);
			IBOCmPartyPermissionValue tempPermission = null;
			List temp = new ArrayList();
			for (int i = 0; i < partyPermissionValues.length; i++) {
				if (partyPermissionValues[i].getRelId() > 0) {
					tempPermission = partyHUSV.queryPartyPermissionById(partyPermissionValues[i].getRelId());
					if (tempPermission != null) {
						tempPermission.setStsToOld();
						tempPermission.setPermissionValue(partyPermissionValues[i].getPermissionValue());
						tempPermission.setRemarks(partyPermissionValues[i].getRemarks());
						temp.add(tempPermission);
					}
				} else {
					partyPermissionValues[i].setStsToNew();
					temp.add(partyPermissionValues[i]);
				}
			}
			if (!temp.isEmpty()) {
				partyHUSV.savePartyPermission((IBOCmPartyPermissionValue[]) temp.toArray(new IBOCmPartyPermissionValue[0]));
			}
		}

	}

	public void modifyAcctActive(long acctId, Map paraMap) throws Exception {
		ICmAccountSV accountSv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue value = accountSv.queryAccountById(acctId);
		if (value != null && (!CmConstants.RecordState.USE.equals(value.getState()))) {
			IAcctPaymentValue[] acctPaymentValues = accountSv.queryAcctPaymentByCondition(acctId, -1, -1);
			IVOAccountValue acctValue = new VOAccountBean();
			value.setState(CmConstants.RecordState.USE);
			if (paraMap != null) {
				if (paraMap.get("EFFECTIVE_DATE") != null) {
					acctValue.setUserObject("EFFECTIVE_DATE", paraMap.get("EFFECTIVE_DATE"));
				}
			}
			acctValue.setAccount(value);
			if (acctPaymentValues != null && acctPaymentValues.length > 0) {
				acctValue.addPayments(acctPaymentValues);
			}
			accountSv.saveAccount(acctValue);
		}
	}

	public long[] queryCustByContactContMedium(int custType, long contMedTypeId, String contMedValue) throws Exception {
		if (StringUtils.isNotBlank(contMedValue)) {
			StringBuilder sql = new StringBuilder();
			HashMap queryParam = new HashMap();
			if (custType == CmConstants.CustomerType.INDIVIDUAL) {
				sql.append("SELECT T.CUST_ID FROM {CM_INDIV_CONTACT} T,{CM_CONTACT_CONT_MEDIUM} T1 WHERE T.CONT_ID = T1.CONT_ID ");
			} else {
				sql.append("SELECT T.CUST_ID FROM {CM_GROUP_CONTACT} T,{CM_CONTACT_CONT_MEDIUM} T1 WHERE T.CONT_ID = T1.CONT_ID ");
			}
			if (contMedTypeId > 0) {
				sql.append("AND T1.CONT_MED_TYPE_ID = :contMedTypeId ");
				queryParam.put("contMedTypeId", contMedTypeId);
				if (contMedTypeId == CmConstants.AddressId.MAIN_EMAIL || contMedTypeId == CmConstants.AddressId.SECOND_EMAIL) {
					sql.append("AND T1.EMAIL_ADDRESS = :contMedValue ");
				} else if (contMedTypeId == CmConstants.AddressId.MAIN_PHONE || contMedTypeId == CmConstants.AddressId.SECOND_PHONE) {
					sql.append("AND T1.CONT_NUMBER = :contMedValue ");
				} else if (contMedTypeId == CmConstants.AddressId.CONT_LEGAL_ADDRESS) {
					sql.append("AND T1.ADDRESS_ID = :contMedValue ");
				} else {
					return null;
				}
			} else {
				// 如果不传媒介类型，默认查询联系电话
				sql.append("AND T1.CONT_NUMBER = :contMedValue ");
			}
			queryParam.put("contMedValue", contMedValue);
			DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
			if (values != null) {
				int len = values.length;
				if (len > 0) {
					long[] custIds = new long[len];
					for (int i = 0; i < len; i++) {
						custIds[i] = values[i].getAsLong("CUST_ID");
					}
					return custIds;
				}
			}
		}
		return null;
	}

	public void ChangeIndivCustomerRole(long custId, long partyId) throws Exception {
		if (custId > 0) {
			ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			IBOCmIndivCustomerValue IndivCustomerValue = indivService.queryIndivCustomerById(custId);
			if (IndivCustomerValue != null) {
				if (Integer.parseInt(IndivCustomerValue.getIndivCustType()) == CmConstants.CustSubType.INDIV_USER) {
					// 如果个人客户角色类型为使用者，将客户角色修改为客户，增加细分表，增加参与人角色表
					IVOCustValue custValue = new VOCustBean();
					ICustomerValue customerValue = new CustomerBean();
					customerValue.copy(IndivCustomerValue);
					// 修改客户角色
					customerValue.setIndivCustType(Integer.toString(CmConstants.CustSubType.INDIV_CUSTOMER));
					customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
					custValue.setCustomer(customerValue);

					// 增加客户细分,加入客户是否有细分判断
					ICmCustSegmentRelaSV custSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
					IBOCmCustSegmentRelaValue cmCustSegmentRelaValue = custSegmentRelaSV.querySegmentRelaByCustId(custId);
					if(null==cmCustSegmentRelaValue){
						IBOCmCustSegmentRelaValue CmCustSegmentRelavalue = new BOCmCustSegmentRelaBean();
						CmCustSegmentRelavalue.setCustId(custId);
						CmCustSegmentRelavalue.setSegmentId(Long.parseLong(CmConstants.segment.NEW));
						CmCustSegmentRelavalue.setRelaId(CmCommonUtil.getNewSequence(BOCmCustSegmentRelaBean.class));
						custValue.setUserObject("cmSegmentRela", CmCustSegmentRelavalue);
					}
					
					// 保存
					CmServiceFactory.getCustomerSV().saveCustomer(custValue);
					// 增加参与人角色表
					ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean partyRoleBean = new com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean();
					partyRoleBean.setRoleType(CmConstants.PartyRoleType.CUSTOMER);
					partyRoleBean.setEntityId(custId);
					partyRoleBean.setState(CmConstants.RecordState.USE);
					partyRoleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
					partyRoleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
					partyRoleBean.setPartyId(IndivCustomerValue.getPartyId());
					partyRoleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
					partyRoleSV.savePartyRole(partyRoleBean);
				}
			}
		}
	}

	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int state, int startIdx, int endIdx) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		return sv.getInsAccrelsByAcct(acctId, payType, state, startIdx, endIdx);
	}

	public IBOCMPartyAcctRelValue[] queryPartyAcctRel(long partyId, long[] acctIds) throws Exception {
		ICmPartySV partySV = (ICmPartySV)ServiceFactory.getService(ICmPartySV.class);
		return partySV.queryPartyAcctRel(partyId, acctIds);
	}
}
