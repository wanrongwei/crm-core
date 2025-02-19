package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.secframe.common.Constants;
import com.asiainfo.crm.cm.busimodel.rule.CmCommonBusiRule;
import com.asiainfo.crm.cm.busimodel.rule.bo.CmRuleReturnDataBean;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmObjectWrapperFactory;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.vocreator.setter.impl.CmVOAccountDefaultValue;
import com.asiainfo.crm.cm.exe.tf.bo.BOCmPsBusiRecBean;
import com.asiainfo.crm.cm.exe.tf.ivalues.IBOCmPsBusiRecValue;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountAttrBean;
import com.asiainfo.crm.cm.inner.account.bo.QBOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountAttrValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustAttrBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrEngine;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.CmReturnDataBean;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOClubMemberBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberBean;
import com.asiainfo.crm.cm.model.bo.CustManagerBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.IVpmnCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl.AbstractVOAccountCvtBusiModelImpl;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl.AbstractVOCustCvtBusiModelImpl;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICustMgntFSV;
import com.asiainfo.crm.cm.teaminvoke.out.util.CmFSVUtil;
import com.asiainfo.crm.cm.teaminvoke.out.util.CmXmlUtil;
import com.asiainfo.crm.common.mask.BOMaskHelper;
import com.asiainfo.crm.so.exe.remote.third.ConfirmResultDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustInfoMoveRspDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustScoreAndGradeInfoDataBean;
import com.asiainfo.crm.so.exe.remote.third.TransferResultDataBean;

public class CustMgntFSVImpl implements ICustMgntFSV {

	private static transient Log log = LogFactory.getLog(CustMgntFSVImpl.class);

	public Map accNetWork(Map parameter) throws Exception {
		// 跨区入网
		Object billIdObj = parameter.get("OldMsisdn");// 计费号码
		Object cerTypeObj = parameter.get("CertType");// 证件类型
		Object certCodeObj = parameter.get("CertCode");// 证件号码
		String custName = DataType.getAsString(parameter.get("CustName"));// 客户姓名

		if (billIdObj == null || cerTypeObj == null || certCodeObj == null) {
			// 输入参数不能为空
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		/*
		 * 证件鉴权
		 */
		ISoUserValue userValue = (ISoUserValue) CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billIdObj.toString());

		Map resultMap = new HashMap();
		if (!CmCommonUtil.isNotEmptyObject(userValue)) {
			// 用户不存在
			ExceptionUtil.throwBusinessException("CMS0070189");
		}
		ICustomerValue custValue = null;
		try {
			// 避免查询出来的数据被模糊化，因此先设置当前这个查询不需要模糊化！
			BOMaskHelper.setOperateNotMaskFlag();
			custValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userValue.getCustId());
		} finally {
			// 查询完成之后清除禁止模糊化标识，避免对正常业务产生影响！
			BOMaskHelper.clearOperateMaskFlag();
		}
		if (!CmCommonUtil.isNotEmptyObject(custValue)) {
			// 不存在该客户
			ExceptionUtil.throwBusinessException("CMS0089012");
		}

		if (!custValue.getCustName().equals(custName)) {
			// 鉴权失败，客户姓名与数据库中查到的客户姓名不符。
			resultMap.put("ResultCode", 2);
			resultMap.put("ResultMsg", CrmLocaleFactory.getResource("CMS0089089"));
			return resultMap;
		}

		int certType = 0;
		// 转换证件类型
		if ("00".equals(cerTypeObj.toString())) {
			certType = CmConstants.CertificateType.IDENTITY_CARD;// 身份证
		} else if ("01".equals(cerTypeObj.toString())) {
			// VIP卡类型
			DataContainer condition = new DataContainer();
			condition.set(IClubMemberCardValue.S_CardCode, certCodeObj.toString());
			IClubMemberCardValue[] cardValue = CmServiceFactory.getClubMemberSV().queryClubMemberCards(condition, -1, -1);
			if (!CmCommonUtil.isNotEmptyObject(cardValue)) {
				// 鉴权失败，不存在该会员卡
				ExceptionUtil.throwBusinessException("CMS0089053");
				return resultMap;
			}
			resultMap.put("ResultCode", 1);
			resultMap.put("LevelDate", cardValue[0].getExpireDate());// 会员卡截止日期
			resultMap.put("VipCardCode", cardValue[0].getCardCode());// 会员卡号
			return resultMap;
		} else if ("02".equals(cerTypeObj.toString())) {
			certType = CmConstants.CertificateType.PASSPORT_OLD;// 护照
		} else if ("04".equals(cerTypeObj.toString())) {
			certType = CmConstants.CertificateType.OFFICER_CERTIFY;// 军官证
		} else {
			certType = CmConstants.CertificateType.OTHER_CERTIFICATE;// 其他证件
		}

		if (custValue.getCustCertType() != certType) {
			// 鉴权失败，证件类型错误
			resultMap.put("ResultCode", 0);
			resultMap.put("ResultMsg", CrmLocaleFactory.getResource("CMS0089091"));
			return resultMap;
		}
		if (!custValue.getCustCertCode().equals(certCodeObj.toString())) {
			// 鉴权失败，证件号码错误
			resultMap.put("ResultCode", 0);
			resultMap.put("ResultMsg", CrmLocaleFactory.getResource("CMS0089090"));
			return resultMap;
		}

		// 鉴权成功
		resultMap.put("ResultCode", 1);
		/*
		 * 查询用户级别和积分
		 */
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_ClubId, CmConstants.CommonBusinessId.VIP_CLUB_ID);
		condition.set(IClubMemberValue.S_UserId, userValue.getUserId());
		condition.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		IClubMemberValue[] memberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);

		if (!CmCommonUtil.isNotEmptyObject(memberValue)) {
			// 不是VIP用户
			resultMap.put("Level", CmConstants.CmIndivVipLevel.NOT_VIP);
			return resultMap;
		}

		if (memberValue[0].getMemberLevel() == Integer.parseInt(CmConstants.CmIndivVipLevel.NO_LEVEL)) {
			// 0级别用户
			resultMap.put("Level", CmConstants.CmIndivVipLevel.NO_LEVEL);
			return resultMap;
		}

		resultMap.put("Level", String.valueOf(memberValue[0].getMemberLevel()));
		IClubMemberCardValue[] memberCardValue = CmServiceFactory.getClubMemberSV().queryClubMemberCardsByMemberId(memberValue[0].getMemberId());
		if (!CmCommonUtil.isNotEmptyObject(memberCardValue)) {
			// 不存在会员卡
			return resultMap;
		}
		resultMap.put("LevelDate", memberCardValue[0].getExpireDate());// 会员卡截止日期
		resultMap.put("VipCardCode", memberCardValue[0].getCardCode());// 会员卡号

		return resultMap;
	}

	public Map checkEnjoyService(Map parameter) throws Exception {
		// 检查是否能享受服务
		Object userIdObj = parameter.get("UserId");
		Object serviceIdObj = parameter.get("ServiceId");
		Object timesObj = parameter.get("Times");
		Object clubIdObj = parameter.get("ClubId");

		Map returnMap = new HashMap();

		if (userIdObj == null || serviceIdObj == null || timesObj == null) {
			// 参数不能为空
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		long userId = Long.parseLong(userIdObj.toString());
		long serviceId = Long.parseLong(serviceIdObj.toString());
		int times = Integer.parseInt(timesObj.toString());
		long clubId = 0;

		if (userId <= 0 || serviceId <= 0 || times < 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		// 查询用户信息

		// 如果俱乐部编码为空，通过服务编码查询俱乐部编码
		if (clubIdObj == null) {
			IClubServiceValue serviceValue = CmServiceFactory.getClubServiceSV().queryClubServiceById(serviceId);
			if (!CmCommonUtil.isNotEmptyObject(serviceValue)) {
				// 没有查到俱乐部服务
				ExceptionUtil.throwBusinessException("CMS0089088");
			}
			clubId = serviceValue.getClubId();
		} else {
			clubId = Long.parseLong(clubIdObj.toString());
		}
		// 通过用户编码,俱乐部编码查询会员编码
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_ClubId, clubId);
		condition.set(IClubMemberValue.S_UserId, userId);
		IClubMemberValue[] memberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);
		if (!CmCommonUtil.isNotEmptyObject(memberValue)) {
			// 没有查到俱乐部会员
			ExceptionUtil.throwBusinessException("CMS0089085");
		}

		ICmReturnData returnData = new CmReturnDataBean();
		boolean flag = CmServiceFactory.getClubServiceSV().checkEnjoyService(userId, memberValue[0].getMemberId(), serviceId, times, returnData);

		if (flag == true) {
			returnMap.put("ResultCode", "1");
		} else {
			returnMap.put("ResultCode", "0");
			returnMap.put("ResultMsg", returnData.getResultMsg());
		}
		// 返回服务前的积分余额和剩余免费次数
		returnMap.put("TotalScore", returnData.getUserObject("TotalScore"));// 总积分
		returnMap.put("TotalTimes", returnData.getUserObject("TotalTimes"));// 剩余免费次数
		return returnMap;
	}

	public ConfirmResultDataBean confirmAccNetWork(CustInfoMoveRspDataBean inBean) throws Exception {
		/*
		 * 跨区入网确认 如果用户是vip，将vip等级清零，积分清零
		 */
		String billId = inBean.getOldMsisdn();
		ConfirmResultDataBean resultDataBean = new ConfirmResultDataBean();
		if (StringUtils.isBlank(billId)) {
			// 输入参数不能为空
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		ISoUserValue userValue = (ISoUserValue) CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (!CmCommonUtil.isNotEmptyObject(userValue)) {
			// 不存在该用户
			ExceptionUtil.throwBusinessException("CMS0070189");
		}

		// 积分清理
		resultDataBean = CmServiceFactory.getTeamInvokeSV().innetClearScore(inBean);

		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_ClubId, CmConstants.CommonBusinessId.VIP_CLUB_ID);
		condition.set(IClubMemberValue.S_UserId, userValue.getUserId());
		IClubMemberValue[] memberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);

		if (!CmCommonUtil.isNotEmptyObject(memberValue)) {
			// 不是VIP用户
			/*
			 * resultDataBean.setResult("01"); resultDataBean.setResultDesc("不是VIP用户"); Map otherInfo = new HashMap();
			 * otherInfo.put("UserId", userValue.getUserId()); resultDataBean.setOtherInfo(otherInfo);
			 */
			return resultDataBean;
		}

		if (memberValue[0].getMemberLevel() == Integer.parseInt(CmConstants.CmIndivVipLevel.NO_LEVEL)) {
			// 会员级别为0，无级别
			/*
			 * resultDataBean.setResult("02"); resultDataBean.setResultDesc("会员级别为0，无级别"); Map otherInfo = new
			 * HashMap(); otherInfo.put("MemberId", memberValue[0].getMemberId());
			 * resultDataBean.setOtherInfo(otherInfo);
			 */
			return resultDataBean;
		}
		// 设置会员级别为0
		memberValue[0].setMemberLevel(Integer.parseInt(CmConstants.CmIndivVipLevel.NO_LEVEL));

		IClubMemberCardValue[] memberCardValue = CmServiceFactory.getClubMemberSV().queryClubMemberCardsByMemberId(memberValue[0].getMemberId());
		if (!CmCommonUtil.isNotEmptyObject(memberCardValue)) {
			// 不存在会员卡,直接返回
			resultDataBean.setResult("No Card");
			Map otherInfo = new HashMap();
			otherInfo.put("MemberId", memberValue[0].getMemberId());
			resultDataBean.setOtherInfo(otherInfo);
			return resultDataBean;
		}
		// 设置会员卡级别为0
		memberCardValue[0].setCardLevel(Integer.parseInt(CmConstants.CmIndivVipLevel.NO_LEVEL));

		// 保存记录信息
		CmServiceFactory.getClubMemberSV().saveClubMember(memberValue[0]);
		CmServiceFactory.getClubMemberSV().saveClubMemberCard(memberCardValue[0]);

		return resultDataBean;
	}

	public IVOAccountValue convertMap2AccountValue(Map map) throws Exception {
		return (IVOAccountValue) CmFSVUtil.getConvertBusiModel(AbstractVOAccountCvtBusiModelImpl.class).convert(map);
	}

	public IVOCustValue convertMap2CustValue(Map map) throws Exception {
		return (IVOCustValue) CmFSVUtil.getConvertBusiModel(AbstractVOCustCvtBusiModelImpl.class).convert(map);
	}

	public long disableClubMember(Map parameter) throws Exception {
		Object userIdObj = parameter.get("UserId");
		Object clubCodeObj = parameter.get("ClubCode");
		Object clubIdObj = parameter.get("ClubId");
		if (userIdObj == null) {
			// 参数不能为空
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (clubCodeObj == null && clubIdObj == null) {
			// 参数不能为空
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		IClubMemberValue[] memberValue = null;
		DataContainer condition = new DataContainer();

		if (clubIdObj != null) {
			condition.set(IClubMemberValue.S_UserId, Long.parseLong(userIdObj.toString()));
			condition.set(IClubMemberValue.S_ClubId, Long.parseLong(clubIdObj.toString()));
			condition.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
			memberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);
		} else {
			condition.set(IClubValue.S_ClubCode, clubCodeObj.toString());
			memberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);
		}
		if (!CmCommonUtil.isNotEmptyObject(memberValue)) {
			// 没找到相应的俱乐部会员
			ExceptionUtil.throwBusinessException("CMS0089085");
		}

		memberValue[0].setState(CmConstants.RecordState.ERASE);// 设置状态为失效
		memberValue[0].initProperty(IClubMemberValue.S_MemberId, memberValue[0].getMemberId());
		// 设置会员失效，同时同步会员卡
		IClubMemberCardValue[] memberCardValue = CmServiceFactory.getClubMemberSV().queryClubMemberCardsByMemberId(memberValue[0].getMemberId());
		IVOClubMemberValue voclubMember = new VOClubMemberBean();
		voclubMember.setClubMember(memberValue[0]);
		voclubMember.setClubMemberCard(memberCardValue[0]);
		CmServiceFactory.getClubMemberSV().saveClubMember(voclubMember);

		return memberCardValue[0].getDoneCode();
	}

	public boolean enjoyService(long userId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks) throws Exception {
		if (userId <= 0 || serviceId <= 0 || times < 0) {
			// 参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		IClubServiceValue clubService = CmServiceFactory.getClubServiceSV().queryClubServiceById(serviceId);
		if (!CmCommonUtil.isNotEmptyObject(clubService)) {
			// 服务不存在
			ExceptionUtil.throwBusinessException("CMS0089088");
		}
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_ClubId, clubService.getClubId());
		condition.set(IClubMemberValue.S_UserId, userId);
		IClubMemberValue[] clubMemberValue = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);
		if (!CmCommonUtil.isNotEmptyObject(clubMemberValue)) {
			// 没找到相关会员记录
			ExceptionUtil.throwBusinessException("CMS0089085");
		}
		CmServiceFactory.getClubServiceSV().enjoyService(userId, clubMemberValue[0].getMemberId(), serviceId, times, roamFlag, provinceCode, busiCode, remarks, 0,
				clubMemberValue[0].getMemberLevel());
		return true;
	}

	public IVOAccountValue getDefalutVOAccountValue(ICustomerValue value) throws Exception {
		IVOAccountValue voAccountValue = CmVOAccountDefaultValue.getDefaultValue(value);
		return voAccountValue;
	}

	public IBOCmAccountAttrValue queryAccountAttrValue(long acctId, String attrCode) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmAccountAttrValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IBOCmAccountAttrValue.S_AcctId).append(" = :acctId ");
		parameter.put("acctId", acctId);
		condition.append(" AND ").append(IBOCmAccountAttrValue.S_AttrCode).append(" = :attrCode ");
		parameter.put("attrCode", attrCode);
		DataContainerInterface[] attrValues = CmServiceFactory.getEntityAttrSV().getEntityAttrValues(BOCmAccountAttrBean.class, condition.toString(), parameter, -1, -1);
		IBOCmAccountAttrValue value = null;
		if (CmCommonUtil.isNotEmptyObject(attrValues)) {
			value = new BOCmAccountAttrBean();
			value.copy(attrValues[0]);
		}
		return value;
	}

	public IAccountValue queryAccountById(long acctId) throws Exception {
		IAccountValue accountValue = CmServiceFactory.getAccountSV().queryAccountById(acctId);
		CmObjectWrapperFactory.wrap(accountValue);
		return accountValue;
	}

	public int queryAccountCountByCustId(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		return CmServiceFactory.getAccountSV().queryAccountCountByCondition(custId);
	}

	public IAccountProfileValue queryAccountProfileByAcctId(long acctId) throws Exception {
		IAccountProfileValue accountProfileValue = CmServiceFactory.getAccountSV().queryAccountProfileByAcctId(acctId);
		CmObjectWrapperFactory.wrap(accountProfileValue);
		return accountProfileValue;
	}

	public int queryAccountProfileCountByRegionId(String regionId, int payMethod, int queryType) throws Exception {
		return CmServiceFactory.getAccountSV().queryAccountProfileCountByRegionId(regionId, payMethod, queryType);
	}

	public int queryAccountProfileCountByRelCustId(long relCustId, int payMethod) throws Exception {
		return CmServiceFactory.getAccountSV().queryAccountProfileCountByRelCustId(relCustId, payMethod, 1);
	}

	public IAccountProfileValue[] queryAccountProfilesByRegionId(String regionId, int payMethod, int queryType, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getAccountSV().queryAccountProfilesByRegionId(regionId, payMethod, queryType, startNum, endNum);
	}

	public IAccountProfileValue[] queryAccountProfilesByRelCustId(long relCustId, int payMethod, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getAccountSV().queryAccountProfilesByRelCustId(relCustId, payMethod, 1, startNum, endNum);
	}

	public IAccountValue[] queryAccountsByCustId(long custId, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		return CmServiceFactory.getAccountSV().queryAccountByCondition(custId, startNum, endNum);
	}

	public int queryAcctBillCustomizeCountByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryBillCustomizeCountByCondition(acctId);
	}

	public IAcctBillCustomizeValue[] queryAcctBillCustomizesByAcctId(long acctId, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getAccountSV().queryBillCustomizeByCondition(acctId, startNum, endNum);
	}

	public IAcctBillCycleValue[] queryAcctBillCyclesByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryAcctBillCyclesByAcctId(acctId);
	}

	public IAcctBillCycleValue[] queryAcctBillCyclesByDoneDate(Timestamp doneDate, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getAccountSV().queryAcctBillCyclesByDoneDate(doneDate, startNum, endNum);
	}

	public int queryAcctContactCountByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getContactSV().queryAcctContactCountByAcctId(acctId);
	}

	public IContactValue[] queryAcctContactsByAcctId(long acctId, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getContactSV().queryAcctContactsByAcctId(acctId, startNum, endNum);
	}

	public int queryAcctPaymentCountByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryAcctPaymentCountByCondition(acctId);
	}

	public IAcctPaymentValue[] queryAcctPaymentsByAcctId(long acctId, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getAccountSV().queryAcctPaymentByCondition(acctId, startNum, endNum);
	}

	public Map queryclubMember(Map parameter) throws Exception {
		Map resultMap = new HashMap();// 返回Map
		Map infoMap = new HashMap();// 放进resultMap的valueMap

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

		if (userId == 0 && memberId == 0 && custId == 0) {
			// 用户编码，会员编码，客户编码不能同时为空！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		// 设置查询条件
		DataContainer condition = new DataContainer();
		if (clubId != 0) {
			condition.set(IClubMemberValue.S_ClubId, clubId);
		}
		if (memberId != 0) {
			condition.set(IClubMemberValue.S_MemberId, memberId);
		}
		if (userId != 0) {
			condition.set(IClubMemberValue.S_UserId, userId);
		}
		if (custId != 0) {
			condition.set(IClubMemberValue.S_CustId, custId);
		}

		// 查询
		IClubMemberValue[] resultValues = CmServiceFactory.getClubMemberSV().queryClubMembers(condition, -1, -1);

		List resultList = new ArrayList();
		if (resultValues != null) {
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			ICmClubSV clubSV = CmServiceFactory.getClubSV();
			ICmClubMemberSV clubMemberSV = CmServiceFactory.getClubMemberSV();
			for (int i = 0; i < resultValues.length; i++) {
				// 将value转换为Map
				infoMap = CmFSVUtil.value2Map(resultValues[i]);

				// 查询客户信息
				ICustomerValue custValue = customerSV.queryCustomerByCustId(resultValues[i].getCustId());
				Map custMap = CmFSVUtil.value2Map(custValue);
				infoMap.putAll(custMap);

				// 查询俱乐部信息
				IClubValue clubValue = clubSV.queryClubById(resultValues[i].getClubId());
				Map clubMap = CmFSVUtil.value2Map(clubValue);
				infoMap.putAll(clubMap);

				// 查询会员卡信息
				IClubMemberCardValue[] cardValue = clubMemberSV.queryClubMemberCardsByMemberId(resultValues[i].getMemberId());
				Map cardMap = CmFSVUtil.value2Map(cardValue[0]);
				infoMap.putAll(cardMap);

				resultList.add(infoMap);
			}
		}
		// 如果没查询到结果，resultList可能是空值
		resultMap.put("ClubMemberInfo", resultList);

		return resultMap;
	}

	public IAcctBillCustomizeValue queryCurrAcctBillCustomizesByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryCurrAcctBillCustomizesByAcctId(acctId);
	}

	public IAcctBillCycleValue queryCurrAcctBillCycleByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryCurrAcctBillCyclesByAcctId(acctId);
	}

	public IAcctPaymentValue queryCurrAcctPaymentsByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryCurrAcctPaymentsByAcctId(acctId);
	}

	public IContactValue queryCustContactById(long custContId, long custId) throws Exception {
		return CmServiceFactory.getContactSV().queryCustContactById(custContId, custId);
	}

	public int queryCustContactCountByCustId(long custId) throws Exception {
		return CmServiceFactory.getContactSV().queryCustContactCountByCustId(custId);
	}

	public IContactValue[] queryCustContactsByCdn(long custId, int custType, long contId, int contType, String billId, int startNum, int endNum) throws Exception {
		DataContainer dc = new DataContainer();
		if (custId > 0) {
			dc.set(IContactValue.S_CustId, custId);
		}
		if (custType > 0) {
			dc.set(ICustomerValue.S_CustType, custType);
		}
		if (contId > 0) {
			dc.set(IContactValue.S_ContId, contId);
		}
		if (contType > 0) {
			dc.set(IContactValue.S_ContType, contType);
		}
		if (StringUtils.isNotBlank(billId)) {
			dc.set(ISoUserValue.S_BillId, billId);
		}
		return CmServiceFactory.getContactSV().queryCustContacts(dc, startNum, endNum);
	}

	public IContactValue[] queryCustContactsByCustId(long custId, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getContactSV().queryCustContactsByCustId(custId, startNum, endNum);
	}

	public int queryCustManagerCount(long custId, String custServiceId) throws Exception {
		if (custId > 0) {
			return CmServiceFactory.getCustomerSV().queryCustManagerCountByCustId(custId);
		} else if (StringUtils.isNotBlank(custServiceId)) {
			return CmServiceFactory.getCustomerSV().queryCustManagerCountByServiceId(custServiceId, CmConstants.CustomerType.GROUP);
		}
		return 0;
	}

	public ICustManagerValue[] queryCustManagers(long custId, String custServiceId, int startNum, int endNum) throws Exception {
		if (custId > 0) {
			return CmServiceFactory.getCustomerSV().queryCustManagersByCustId(custId, startNum, endNum);
		} else if (StringUtils.isNotBlank(custServiceId)) {
			return CmServiceFactory.getCustomerSV().queryCustManagersByServiceId(custServiceId, CmConstants.CustomerType.GROUP, startNum, endNum);
		}
		return new CustManagerBean[0];
	}

	public ICustomerValue queryCustomerByEcCode(String ecCode, int custType) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByEcCode(ecCode, custType);
		CmObjectWrapperFactory.wrap(customerValue);
		return customerValue;
	}

	public ICustomerValue queryCustomerById(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		CmObjectWrapperFactory.wrap(customerValue);
		return customerValue;
	}

	public ICustomerValue queryCustomerByServiceId(String custServiceId, int custType) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(custServiceId, custType);
		CmObjectWrapperFactory.wrap(customerValue);
		return customerValue;
	}

	public int queryCustomerCountByCdn(long custId, int custType, String custName, int custCertType, String custCertCode) throws Exception {
		DataContainer conditionDC = new DataContainer();
		if (custId > 0) {
			conditionDC.set(ICustomerValue.S_CustId, custId);
		}
		if (custType > 0) {
			conditionDC.set(ICustomerValue.S_CustType, custType);
		}
		if (StringUtils.isNotBlank(custName)) {
			conditionDC.set(ICustomerValue.S_CustName, custName);
		}
		if (custCertType > 0) {
			conditionDC.set(ICustomerValue.S_CustCertType, custCertType);
		}
		if (StringUtils.isNotBlank(custCertCode)) {
			conditionDC.set(ICustomerValue.S_CustCertCode, custCertCode);
		}
		return CmServiceFactory.getCustomerSV().queryCustomerCount(conditionDC);
	}

	public int queryCustomerCountByCert(int custType, int custCertType, String custCertCode) throws Exception {
		// 验证传入的证件类型是否在系统定义中，如果不在则报错！
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_CERT_TYPE, String.valueOf(custCertType)) == null) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (StringUtils.isBlank(custCertCode)) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer conditionDC = new DataContainer();
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custType)) != null) {
			conditionDC.initProperty(ICustomerValue.S_CustType, custType);
		}
		conditionDC.initProperty(ICustomerValue.S_CustCertType, custCertType);
		conditionDC.initProperty(ICustomerValue.S_CustCertCode, custCertCode);
		return CmServiceFactory.getCustomerSV().queryCustomerCount(conditionDC);
	}

	public int queryCustomerCountByCert(int custCertType, String custCertCode) throws Exception {
		return this.queryCustomerCountByCert(CmConstants.CustomerType.INDIVIDUAL, custCertType, custCertCode);
	}

	public ICustomerValue[] queryCustomerHisByCustId(long custId, Timestamp startDate, Timestamp endDate, int startNum, int endNum) throws Exception {
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustId, custId);
		conditionDC.set(ICustomerValue.S_EffectiveDate, startDate);
		conditionDC.set(ICustomerValue.S_ExpireDate, endDate);
		return CmServiceFactory.getCustomerSV().queryCustomerHis(conditionDC, startNum, endNum);
	}

	public int queryCustomerHisCountByCustId(long custId, Timestamp startDate, Timestamp endDate) throws Exception {
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustId, custId);
		conditionDC.set(ICustomerValue.S_EffectiveDate, startDate);
		conditionDC.set(ICustomerValue.S_ExpireDate, endDate);
		return CmServiceFactory.getCustomerSV().queryCustomerHisCount(conditionDC);
	}

	// heyq 20120227 增加入参判断逻辑
	public ICustomerValue[] queryCustomersByCdn(long custId, int custType, String custName, int custCertType, String custCertCode, int startNum, int endNum) throws Exception {
		DataContainer conditionDC = new DataContainer();
		if (custId > 0) {
			conditionDC.set(ICustomerValue.S_CustId, custId);
		}
		if (custType > 0) {
			conditionDC.set(ICustomerValue.S_CustType, custType);
		}
		if (StringUtils.isNotBlank(custName)) {
			conditionDC.set(ICustomerValue.S_CustName, custName);
		}
		if (custCertType > 0) {
			conditionDC.set(ICustomerValue.S_CustCertType, custCertType);
		}
		if (StringUtils.isNotBlank(custCertCode)) {
			conditionDC.set(ICustomerValue.S_CustCertCode, custCertCode);
		}
		return CmServiceFactory.getCustomerSV().queryCustomers(conditionDC, startNum, endNum);
	}

	public ICustomerValue[] queryCustomersByCert(int custType, int custCertType, String custCertCode, int startNum, int endNum) throws Exception {
		Map parameterMap = new HashMap();
		parameterMap.put("CUST_TYPE", custType);
		parameterMap.put("CUST_CERT_TYPE", custCertType);
		parameterMap.put("CUST_CERT_CODE", custCertCode);
		return queryCustomersByCert(null, parameterMap, startNum, endNum);
	}

	public ICustomerValue[] queryCustomersByCert(int custCertType, String custCertCode, int startNum, int endNum) throws Exception {
		Map parameterMap = new HashMap();
		parameterMap.put("CUST_TYPE", CmConstants.CustomerType.INDIVIDUAL);
		parameterMap.put("CUST_CERT_TYPE", custCertType);
		parameterMap.put("CUST_CERT_CODE", custCertCode);
		return queryCustomersByCert(null, parameterMap, startNum, endNum);
	}

	public ICustomerValue[] queryCustomersByCert(String[] cols, Map parameterMap, int startNum, int endNum) throws Exception {
		// 验证传入的证件类型是否在系统定义中，如果不在则报错！
		int custCertType = DataType.getAsInt(parameterMap.get("CUST_CERT_TYPE"));
		int custType = DataType.getAsInt(parameterMap.get("CUST_TYPE"));
		String custCertCode = DataType.getAsString(parameterMap.get("CUST_CERT_CODE"));
		long businessId = DataType.getAsLong(parameterMap.get("BUSINESS_ID"));
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_CERT_TYPE, String.valueOf(custCertType)) == null) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (StringUtils.isBlank(custCertCode)) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (CmCommonUtil.isEmptyObject(cols)) {
			cols = new String[] { ICustomerValue.S_CustId };
		}
		DataContainer conditionDC = new DataContainer();
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custType)) != null) {
			conditionDC.initProperty(ICustomerValue.S_CustType, custType);
		}
		conditionDC.initProperty(ICustomerValue.S_CustCertType, custCertType);
		conditionDC.initProperty(ICustomerValue.S_CustCertCode, custCertCode);
		conditionDC.initProperty(IValueObject.S_BUSINESS_ID, businessId);
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		// 对结果集的数据量进行一次校验，如果数据量大于5000则抛出异常！
		// 如果查询不为1列，则不分页或者分页跨度过大都需要进行限制！5000
		if (cols.length != 1 && ((startNum == -1 && endNum == -1) || (endNum - startNum > 5000))) {
			if (customerSV.queryCustomerCount(conditionDC) > 5000) {
				// 查询结果集数量大于系统设置的上限值{0}，请确保输入有效的更加精准的查询条件进行查询！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000107", "5000"));
				}
				ExceptionUtil.throwBusinessException("CMS0000107", "5000");
			}
		} else if (cols.length == 1 && ((startNum == -1 && endNum == -1) || (endNum - startNum > 100000))) { // 如果查询为1列，则不分页或者分页跨度过大都需要进行限制！100000
			if (customerSV.queryCustomerCount(conditionDC) > 100000) {
				// 查询结果集数量大于系统设置的上限值{0}，请确保输入有效的更加精准的查询条件进行查询！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000107", "100000"));
				}
				ExceptionUtil.throwBusinessException("CMS0000107", "100000");
			}
		}
		return (ICustomerValue[]) customerSV.queryCustomers(cols, conditionDC, startNum, endNum);
	}

	public ICustomerValue[] queryCustomersByCustIds(long[] custIds, int custType) throws Exception {
		return CmServiceFactory.getCustomerSV().queryCustomersByCustIds(custIds, custType, -1, -1);
	}

	public ICustomerValue[] queryCustomersByName(int custType, String custName, int startNum, int endNum) throws Exception {
		return queryCustomersByName(null, custType, custName, startNum, endNum);
	}

	public ICustomerValue[] queryCustomersByName(String[] cols, int custType, String custName, int startNum, int endNum) throws Exception {
		// 验证传入的客户类型是否在系统定义中，如果不在则报错！
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custType)) == null) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (StringUtils.isBlank(custName)) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 接口没有输入具体需要查询的列名，则只返回客户编号！
		if (CmCommonUtil.isEmptyObject(cols)) {
			cols = new String[] { ICustomerValue.S_CustId };
		}
		DataContainer conditionDC = new DataContainer();
		conditionDC.initProperty(ICustomerValue.S_CustType, custType);
		conditionDC.initProperty(ICustomerValue.S_CustName, custName);
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		// 如果查询不为1列，则不分页或者分页跨度过大都需要进行限制！5000
		if (cols.length != 1 && ((startNum == -1 && endNum == -1) || (endNum - startNum > 5000))) {
			if (customerSV.queryCustomerCount(conditionDC) > 5000) {
				// 查询结果集数量大于系统设置的上限值{0}，请确保输入有效的更加精准的查询条件进行查询！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000107", "5000"));
				}
				ExceptionUtil.throwBusinessException("CMS0000107", "5000");
			}
		} else if (cols.length == 1 && ((startNum == -1 && endNum == -1) || (endNum - startNum > 100000))) { // 如果查询为1列，则不分页或者分页跨度过大都需要进行限制！100000
			if (customerSV.queryCustomerCount(conditionDC) > 100000) {
				// 查询结果集数量大于系统设置的上限值{0}，请确保输入有效的更加精准的查询条件进行查询！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000107", "100000"));
				}
				ExceptionUtil.throwBusinessException("CMS0000107", "100000");
			}
		}
		//支持like查询
		conditionDC.initProperty(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE,CmConstants.MatchType.BOTH_MATCH);
		return customerSV.queryCustomers(cols, conditionDC, startNum, endNum);
	}

	public DataContainer queryGroupAccount(long acctId) throws Exception {
		DataContainer[] results = CmServiceFactory.getAccountSV().queryCustAcctRels(acctId, -1, QBOCmCustAcctRelBean.class, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(results)) {
			return results[0];
		}
		return null;
	}

	public IContactValue[] queryGroupContact(long custId, int contType, int starNum, int endNum) throws Exception {
		if (custId < 0 || contType < 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer container = new DataContainer();
		container.set("CUST_ID", custId);
		container.set("CONT_TYPE", contType);
		return CmServiceFactory.getContactSV().queryCustContacts(container, starNum, endNum);
	}

	public int queryGroupContactCount(long custId, int contType) throws Exception {
		if (custId < 0 || contType < 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer container = new DataContainer();
		container.set("CUST_ID", custId);
		container.set("CONT_TYPE", contType);
		return CmServiceFactory.getContactSV().queryCustContactCount(container);
	}

	public IBOCmGroupCustAttrValue queryGroupCustAttrValue(long custId, String attrCode) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupCustAttrValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IBOCmGroupCustAttrValue.S_CustId).append(" = :custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmGroupCustAttrValue.S_AttrCode).append(" = :attrCode ");
		parameter.put("attrCode", attrCode);
		DataContainerInterface[] attrValues = CmServiceFactory.getEntityAttrSV().getEntityAttrValues(BOCmGroupCustAttrBean.class, condition.toString(), parameter, -1, -1);
		IBOCmGroupCustAttrValue value = null;
		if (CmCommonUtil.isNotEmptyObject(attrValues)) {
			value = new BOCmGroupCustAttrBean();
			value.copy(attrValues[0]);
		}
		return value;
	}

	public ICustManagerValue queryMainCustManagerByCustId(long custId) throws Exception {
		return CmServiceFactory.getCustomerSV().queryMainCustManagersByCustId(custId);
	}

	public int queryManagedCustomerCount(long managerId, int custType) throws Exception {
		return CmServiceFactory.getCustomerSV().queryManagedCustomerCount(managerId, custType);
	}

	public ICustomerValue[] queryManagedCustomers(long managerId, int custType, int startNum, int endNum) throws Exception {
		return CmServiceFactory.getCustomerSV().queryManagedCustomers(managerId, custType, startNum, endNum);
	}

	public DataContainer queryManagerById(long managerId) throws Exception {
		return (DataContainer) CmServiceFactory.getManagerSV().queryManagerById(managerId);
	}

	public DataContainer queryManagerByOperId(long operId) throws Exception {
		return (DataContainer) CmServiceFactory.getManagerSV().queryManagerByOperId(operId);
	}

	public Map queryMemberLevelByUserIdOrBillId(long userId, String billId) throws Exception {
		Map resultMap = new HashMap();
		ISoUserValue userValue = null;
		// 通过billId查询用户Id
		if (StringUtils.isNotBlank(billId)) {
			userValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
			if (!CmCommonUtil.isNotEmptyObject(userValue)) {
				// 用户不存在
				ExceptionUtil.throwBusinessException("CMC0094092");
			}
			userId = userValue.getUserId();
		}
		ICmClubMemberSV memberSV = CmServiceFactory.getClubMemberSV();
		// 通过用户id查出vip俱乐部会员
		DataContainer condition = new DataContainer();
		condition.set(ClubMemberBean.S_ClubId, CmConstants.CommonBusinessId.VIP_CLUB_ID);
		condition.set(ClubMemberBean.S_UserId, userId);
		IClubMemberValue[] clubMemberValue = memberSV.queryClubMembers(condition, -1, -1);
		if (!CmCommonUtil.isNotEmptyObject(clubMemberValue)) {
			// 不是vip客户
			resultMap.put("MemberLevel", -1);
			resultMap.put("nFlag", "0");
		} else {
			resultMap.put("MemberLevel", clubMemberValue[0].getMemberLevel());
			// 通过会员编码查询会员卡号
			IClubMemberCardValue[] cardValue = memberSV.queryClubMemberCardsByMemberId(clubMemberValue[0].getMemberId());
			if (!CmCommonUtil.isNotEmptyObject(cardValue)) {
				// 没有vip卡
				resultMap.put("CardCode", -1);
			} else {
				resultMap.put("CardCode", cardValue[0].getCardCode());
				resultMap.put("ExpireDate", cardValue[0].getExpireDate());
			}
		}
		return resultMap;
	}

	public int querySpecialListCount(long custId, long userId, int certType, String certCode, int monType, int subMonType) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(ISpecialListValue.S_CustId, custId);
		dc.set(ISpecialListValue.S_UserId, userId);
		dc.set(ISpecialListValue.S_CertType, certType);
		dc.set(ISpecialListValue.S_CertCode, certCode);
		dc.set(ISpecialListValue.S_MonType, monType);
		dc.set(ISpecialListValue.S_SubMonType, subMonType);
		return CmServiceFactory.getSpecialListSV().querySpecialListCount(dc);
	}

	public ISpecialListValue[] querySpecialLists(long custId, long userId, int certType, String certCode, int monType, int subMonType, int startNum, int endNum) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(ISpecialListValue.S_CustId, custId);
		dc.set(ISpecialListValue.S_UserId, userId);
		dc.set(ISpecialListValue.S_CertType, certType);
		dc.set(ISpecialListValue.S_CertCode, certCode);
		dc.set(ISpecialListValue.S_MonType, monType);
		dc.set(ISpecialListValue.S_SubMonType, subMonType);
		return CmServiceFactory.getSpecialListSV().querySpecialLists(dc, startNum, endNum);
	}

	public IClubMemberValue queryVIPClubMemberByBillId(String billId) throws Exception {
		return CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);
	}

	public IClubMemberValue queryVIPClubMemberByUserId(long userId) throws Exception {
		return CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(userId);
	}

	public long saveAccount(IVOAccountValue accountValue) throws Exception {
		CmServiceFactory.getAccountSV().saveAccount(accountValue);
		IVOCustValue custValue = new VOCustBean();
		custValue.addAccount(accountValue);
		return accountValue.getAcctId();
	}

	// open user
	public long saveAccount(Map acctInfoMap) throws Exception {
		IVOAccountValue value = (IVOAccountValue) CmFSVUtil.getConvertBusiModel(AbstractVOAccountCvtBusiModelImpl.class).convert(acctInfoMap);
		this.saveAccount(value);
		// code by xiezl 增加银行代表号码维护
		dealBankBehalfPhone(value.getPayments());

		if (acctInfoMap.containsKey("cmAcctFrmCustomize")) {
			DataContainer dc = new DataContainer();
			if(acctInfoMap.get("cmAcctFrmCustomize").getClass().isArray()){
				dc = ((DataContainer[]) acctInfoMap.get("cmAcctFrmCustomize"))[0];
			}else{
				dc = (DataContainer) acctInfoMap.get("cmAcctFrmCustomize");
			}
			dc.set("ACCT_ID", value.getAcctId());
			dc.set("CUST_ID", value.getCustId());
		}
		return value.getAcctId();
	}

	private void dealBankBehalfPhone(IAcctPaymentValue[] values) throws Exception {
		for (IAcctPaymentValue value : values) {
			Object phone = value.getExtAttr("BANK_BEHALF_PHONE");
			BOCmCmxAcctPaymentAttrBean acctPaymentAttr = new BOCmCmxAcctPaymentAttrBean();
			if (value.isNew()) {
				if (phone == null || "".equals(phone.toString()))
					continue;
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, phone.toString());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
			} else if (value.isDeleted()) {
				acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
				acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
				acctPaymentAttr.delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
				continue;
			} else if (value.isModified()) {
				if (phone == null || "".equals(phone.toString())) {
					acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
					acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
					acctPaymentAttr.delete();
					CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
					continue;
				}
				acctPaymentAttr = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, value.getPaymentId());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, phone.toString());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
			} else {
				if (phone == null || "".equals(phone.toString()))
					continue;
				acctPaymentAttr = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, value.getPaymentId());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, phone.toString());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
			}
		}
	}

	public long saveClubMember(IClubMemberValue memberValue) throws Exception {
		CmServiceFactory.getClubMemberSV().saveClubMember(memberValue);
		return memberValue.getMemberId();
	}

	public void saveCmBusiLog(ICmBusiLogValue busiLogValue) throws Exception {
		CmServiceFactory.getBusiLogSV().saveBusiLog(busiLogValue);
	}

	public long saveCustomer(ICustomerValue customerValue) throws Exception {
		return CmServiceFactory.getCustomerSV().saveCustomer(customerValue);
	}

	public long saveCustomer(IVOCustValue custValue) throws Exception {
		long custId = custValue.getCustId();
		if (custId > 0) {
			custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
		} else {
			custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
		}
		custId = CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		return custId;
	}

	// open user
	public long saveCustomer(Map custInfoMap) throws Exception {
		return this.saveCustomer((IVOCustValue) CmFSVUtil.getConvertBusiModel(AbstractVOCustCvtBusiModelImpl.class).convert(custInfoMap));
	}

	public void saveGroupCustAttrValues(IBOCmGroupCustAttrValue[] groupCustAttrValues) throws Exception {
		CmServiceFactory.getEntityAttrSV().saveEntityAttrValues((DataContainerInterface[]) groupCustAttrValues, null);

	}

	public Map transferCustScoreAndGrade(CustScoreAndGradeInfoDataBean custData) throws Exception {
		/*
		 * 跨区入网客户积分和等级转入和冲正 oprCode 0—积分转入,1—冲正
		 */
		if (null == custData) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000360", "CustScoreAndGradeInfoDataBean"));
			}
			// 参数custdata不能为空
			ExceptionUtil.throwBusinessException("CMS0000360", "CustScoreAndGradeInfoDataBean");
		}
		String billId = custData.getNewBillId();
		if (StringUtils.isBlank(billId)) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0203012"));
			}
			// 参数billId不能为空
			ExceptionUtil.throwBusinessException("CMS0203012");
		}
		if (custData.getLevel() < 0 || custData.getLevel() > 5) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0707116", (new StringBuilder("level")).append(custData.getLevel()).toString()));
			}
			// 会员级别level不合法
			ExceptionUtil.throwBusinessException("CMS0707116", (new StringBuilder("level")).append(custData.getLevel()).toString());
		}


		// 积分转入和冲正
		TransferResultDataBean scoreBean = CmServiceFactory.getTeamInvokeSV().transferScore(custData);

		Map resultMap = new HashMap();
		resultMap.put("result", "00");
		resultMap.put("scoreResult", scoreBean);
		return resultMap;
	}

	public void unregisterUserNotice(long custId, long userId, long acctId, Map otherInfo) throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean updateAccountUrgeStopFlag(long acctId, int isUrge, HashMap userMap) throws Exception {
		if (acctId <= 0) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		long businessId = 0L;
		if (userMap != null && userMap.containsKey(CmConstants.CommonPageParamName.BUSINESS_ID) && userMap.get(CmConstants.CommonPageParamName.BUSINESS_ID) != null
				&& StringUtils.isNotBlank(userMap.get(CmConstants.CommonPageParamName.BUSINESS_ID).toString())) {
			businessId = Long.parseLong(userMap.get(CmConstants.CommonPageParamName.BUSINESS_ID).toString());
		} else {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 账户类型必须为当前系统定义的账户类型
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CM_ACCOUNT_URGE_STOP_FLAG, String.valueOf(isUrge)) == null) {
			ExceptionUtil.throwBusinessException("CMS0022002", String.valueOf(isUrge));// 参数错误，当前系统不存在类型为{0}的定义！
		}
		IAccountValue accountValue = CmServiceFactory.getAccountSV().queryAccountById(acctId);
		if (accountValue == null) {
			return false;
		}
		accountValue.setUrgeStopFlag(String.valueOf(isUrge));
		IVOAccountValue voAccountValue = new VOAccountBean();
		voAccountValue.setAccount(accountValue);
		CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
		IVOCustValue custValue = new VOCustBean();
		IVOAccountValue acctValue = new VOAccountBean();
		acctValue.setAccount(accountValue);
		custValue.addAccount(acctValue);
		custValue.setUserObject(CmConstants.CommonPageParamName.BUSINESS_ID, Long.valueOf(businessId));
		return true;
	}

	public void userBrandChangeNotice(long userId, long oldBrandId, long newBrandId, Timestamp effectiveDate) throws Exception {
		IBOCmPsBusiRecValue busiRecValue = new BOCmPsBusiRecBean();
		busiRecValue.setRecordId(CmCommonUtil.getNewSequence(BOCmPsBusiRecBean.class));
		busiRecValue.setBusinessId(CmConstants.CommonBusinessId.INTER_USER_BRAND_CHENGE_NOTICE);
		busiRecValue.setRelObjectType(CmConstants.PsRelateObjectType.USER);
		HashMap paramMap = new HashMap();
		paramMap.put("USER_ID", Long.valueOf(userId));
		paramMap.put("OLD_BRAND_ID", Long.valueOf(oldBrandId));
		paramMap.put("NEW_BRAND_ID", Long.valueOf(newBrandId));
		paramMap.put("EFFECTIVE_DATE", effectiveDate);
		busiRecValue.setRelObjectDetail(CmXmlUtil.getXmlString(paramMap));
		busiRecValue.setEffectiveDate(effectiveDate);
		CmServiceFactory.getPsBusiSV().savePsBusiRecs(new IBOCmPsBusiRecValue[] { busiRecValue });
	}

	public void userStateChangeNotice(long userId, long custId, String userState) throws Exception {
		IBOCmPsBusiRecValue busiRecValue = new BOCmPsBusiRecBean();
		busiRecValue.setRecordId(CmCommonUtil.getNewSequence(BOCmPsBusiRecBean.class));
		busiRecValue.setBusinessId(CmConstants.CommonBusinessId.INTER_USER_STATE_CHENGE_NOTICE);// TODO
		busiRecValue.setRelObjectType(CmConstants.PsRelateObjectType.USER);
		HashMap paramMap = new HashMap();
		paramMap.put("USER_ID", Long.valueOf(userId));
		paramMap.put("CUST_ID", Long.valueOf(custId));
		paramMap.put("USER_STATE", userState);
		busiRecValue.setRelObjectDetail(CmXmlUtil.getXmlString(paramMap));
		CmServiceFactory.getPsBusiSV().savePsBusiRecs(new IBOCmPsBusiRecValue[] { busiRecValue });
	}

	public ICmRuleReturnData varifyCertificate(int certType, String certCode) throws Exception {
		ICmRuleReturnData returnData = null;
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_CERT_TYPE, String.valueOf(certType)) == null) {
			returnData = new CmRuleReturnDataBean();
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
			returnData.setMsgByKey("CMS0030041", new String[] { String.valueOf(certType) }); // 参数错误，当前系统不存在类型为{0}的证件类型定义！
		} else if (certType == CmConstants.CertificateType.IDENTITY_CARD) {
			returnData = CmCommonBusiRule.validateIDCardNumber(certCode, true);
		} else {
			returnData = new CmRuleReturnDataBean();
			returnData.setResultCode(CmConstants.BusiRuleResultCode.CODE_WARNNING);
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0020250")); // 当前系统只支持证件类型为身份证的校验！
		}
		return returnData;
	}

	public boolean isRealNameCustomer(long custId) throws Exception {
		return CmServiceFactory.getCustomerSV().isRealNameCustomer(custId);
	}

	public long modifyVPMNCustomer(IBOCmVpmnCustomerValue vpmnCustomerValue) throws Exception, RemoteException {
		if (StringUtils.isEmpty(vpmnCustomerValue.getRegionId())) {
			// 地市或县市不能为空！
			String regionId = (String) ServiceManager.getUser().get(Constants.REGION_ID);
			vpmnCustomerValue.setRegionId(regionId);
		}
		if (vpmnCustomerValue == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0403001", IBOCmVpmnCustomerValue.class.getName()));
			}
			ExceptionUtil.throwBusinessException("CMS0403001", IBOCmVpmnCustomerValue.class.getName());
		}
		getVpmnCustomerSV().saveVpmnCustomer(vpmnCustomerValue);
		return vpmnCustomerValue.getVpmnCustId();
	}

	private IVpmnCustomerSV getVpmnCustomerSV() {
		return (IVpmnCustomerSV) ServiceFactory.getService(IVpmnCustomerSV.class);
	}

	public IBOCmVpmnCustomerValue[] queryVpmnCustomersByCustName(String custName) throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomersByCustName(custName);
	}

	public long genVpmnCustId() throws Exception, RemoteException {
		return getVpmnCustomerSV().getNewId();
	}

	public long createVPMNCustomer(IBOCmVpmnCustomerValue vpmnCustomerValue) throws Exception, RemoteException {
		if (vpmnCustomerValue == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0403001", IBOCmVpmnCustomerValue.class.getName()));
			}
			ExceptionUtil.throwBusinessException("CMS0403001", IBOCmVpmnCustomerValue.class.getName());
		}
		if (StringUtils.isEmpty(vpmnCustomerValue.getRegionId())) {
			// 地市或县市不能为空！
			String regionId = (String) ServiceManager.getUser().get(Constants.REGION_ID);
			vpmnCustomerValue.setRegionId(regionId);
		}
		vpmnCustomerValue.setStsToNew();
		getVpmnCustomerSV().saveVpmnCustomer(vpmnCustomerValue);
		return vpmnCustomerValue.getVpmnCustId();
	}

	public IBOCmVpmnCustomerValue[] queryVPMNCustomer(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomers(dataContainer, startIndex, endIndex);
	}

	public IBOCmVpmnCustomerValue queryVPMNCustomerById(long vpmnCustId) throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomer(vpmnCustId);
	}

	public int queryVPMNCustomerCount(DataContainerInterface dataContainer) throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomer(dataContainer);
	}

	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomerByGroupId(groupId);
	}

	public IBOCmVpmnCustomerValue[] queryVPMNCustomer(String custId, String name, String regionId, String groupType, String countyCode, String groupAttr, String createBegin,
			String createEnd, int startIndex, int endIndex) throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomers(custId, name, regionId, groupType, countyCode, groupAttr, createBegin, createEnd, startIndex, endIndex);
	}

	public int queryVPMNCustomerCount(String custId, String name, String regionId, String groupType, String countyCode, String groupAttr, String createBegin, String createEnd)
			throws Exception, RemoteException {
		return getVpmnCustomerSV().queryVpmnCustomerCount(custId, name, regionId, groupType, countyCode, groupAttr, createBegin, createEnd);
	}

	public void saveDKCustomer(IVOCustValue value) throws Exception {
			ICustomerValue custValue=value.getCustomer();
			if(CmCommonUtil.isNotEmptyObject(custValue)){
				CmServiceFactory.getCustomerSV().saveCustomer(value);
			}
	}
}
